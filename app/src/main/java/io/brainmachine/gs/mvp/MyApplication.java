package io.brainmachine.gs.mvp;

import android.app.Application;

import io.brainmachine.gs.mvp.dagger.DaggerDiComponent;
import io.brainmachine.gs.mvp.dagger.DiComponent;
import io.brainmachine.gs.mvp.dagger.UiComponent;
import io.brainmachine.gs.mvp.dagger.module.ApplicationModule;

/**
 * My custom {@link Application}.
 *
 * Created by falvojr on 1/12/17.
 */
public class MyApplication extends Application {

    private DiComponent mDiComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mDiComponent = DaggerDiComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public UiComponent getDaggerUiComponent() {
        return mDiComponent.uiComponent();
    }
}