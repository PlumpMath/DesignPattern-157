package com.jkxy.strategy.MVP;

/**
 * Created by kerrui on 16/9/13.
 */
public interface TaskDataSource {

    String getStringFromRemote();

    String getStringFromCache();
}
