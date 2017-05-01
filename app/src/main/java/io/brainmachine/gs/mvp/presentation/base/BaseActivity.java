package io.brainmachine.gs.mvp.presentation.base;

import android.support.v7.app.AppCompatActivity;

import io.brainmachine.gs.mvp.MyApplication;
import io.brainmachine.gs.mvp.dagger.component.ActivityComponent;
import io.brainmachine.gs.mvp.dagger.component.FragmentComponent;

/**
 * Base {@link AppCompatActivity}.
 * <p>
 * Created by falvojr on 1/12/17.
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected MyApplication getMyApplication() {
        return (MyApplication) getApplication();
    }

    protected ActivityComponent getDaggerActivityComponent() {
        return this.getMyApplication().getDagger().activityComponent();
    }

    public FragmentComponent getDaggerFragmentComponent() {
        return this.getMyApplication().getDagger().fragmentComponent();
    }

}
