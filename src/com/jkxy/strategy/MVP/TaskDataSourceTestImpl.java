package com.jkxy.strategy.MVP;

/**
 * Created by kerrui on 16/9/13.
 */
public class TaskDataSourceTestImpl implements TaskDataSource {
    @Override
    public String getStringFromRemote() {
        return "hello   ";
    }

    @Override
    public String getStringFromCache() {
        return "IDEA";
    }
}
