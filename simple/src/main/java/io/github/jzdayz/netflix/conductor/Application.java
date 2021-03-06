package io.github.jzdayz.netflix.conductor;

import com.netflix.conductor.client.automator.TaskRunnerConfigurer;
import com.netflix.conductor.client.http.TaskClient;
import com.netflix.conductor.client.worker.Worker;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        TaskClient taskClient = new TaskClient();
        taskClient.setRootURI("http://localhost:8080/api/");        //Point this to the server API

        int threadCount = 2;            //number of threads used to execute workers.  To avoid starvation, should be same or more than number of workers

        Worker worker1 = new SampleWorker("task1");
        Worker worker2 = new SampleWorker("task2");

        // Create TaskRunnerConfigurer
        TaskRunnerConfigurer configurer = new TaskRunnerConfigurer.Builder(taskClient,
                Arrays.asList(
                        worker1,
                        worker2
                ))
                .withThreadCount(threadCount)
                .build();

        // Start the polling and execution of tasks
        configurer.init();
    }

}