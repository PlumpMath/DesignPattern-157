package com.jkxy.strategy.MVP;

/**
 * Created by kerrui on 16/9/13.
 */
public class TaskManager {

    TaskDataSource mTaskDataSource;

    public TaskManager(TaskDataSource taskDataSource) {
        mTaskDataSource = taskDataSource;
    }

    public String getShowContent() {
        return mTaskDataSource.getStringFromRemote()
                + mTaskDataSource.getStringFromCache();
    }
}
