package io.brainmachine.gs.mvp;

import android.app.Application;

import io.brainmachine.gs.mvp.dagger.DaggerMainComponent;
import io.brainmachine.gs.mvp.dagger.MainComponent;
import io.brainmachine.gs.mvp.dagger.module.ApplicationModule;

/**
 * My custom {@link Application}.
 *
 * Created by falvojr on 1/12/17.
 */
public class MyApplication extends Application {

    private MainComponent mDiComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mDiComponent = DaggerMainComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public MainComponent getDagger() {
        return mDiComponent;
    }
}