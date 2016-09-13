package com.jkxy.strategy.MVP;

/**
 * Created by kerrui on 16/9/13.
 */
public class MainPresenter {

    //p层的代码
    private MainView mMainView;
    private TaskManager mTaskManager;

    public MainPresenter() {
        this.mTaskManager = new TaskManager(new TaskDataSourceImpl());
    }

    public MainPresenter test(){
        this.mTaskManager = new TaskManager(new TaskDataSourceTestImpl());
        return this;
    }

    public MainPresenter addTaskListener(MainView mainView) {
        this.mMainView = mainView;
        return this;
    }

    public void getString() {
        String string = mTaskManager.getShowContent();
        mMainView.onShowString(string);
    }
}
