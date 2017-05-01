package io.brainmachine.gs.mvp.presentation.ui.home;

import javax.inject.Inject;

/**
 * MainActivity presenter.
 * <p>
 * Created by falvojr on 1/14/17.
 */
public class MainPresenter implements MainContract.Presenter {

    private MainContract.View mView;

    @Inject
    public MainPresenter() {
        super();
    }

    @Override
    public void setView(MainContract.View view) {
        mView = view;
    }

    @Override
    public void callSayHello() {
        mView.sayHello();
    }

}
