package io.brainmachine.gs.mvp.presentation.base;

import android.support.v7.app.AppCompatActivity;

import io.brainmachine.gs.mvp.MyApplication;
import io.brainmachine.gs.mvp.dagger.UiComponent;

/**
 * Base {@link AppCompatActivity}.
 * <p>
 * Created by falvojr on 1/12/17.
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected MyApplication getMyApplication() {
        return (MyApplication) getApplication();
    }

    public UiComponent getDagger() {
        return this.getMyApplication().getDaggerUiComponent();
    }

}
