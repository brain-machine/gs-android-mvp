package io.brainmachine.gs.mvp.dagger.component;

import dagger.Subcomponent;
import io.brainmachine.gs.mvp.dagger.module.presentation.PresenterModule;
import io.brainmachine.gs.mvp.dagger.scope.PerActivity;
import io.brainmachine.gs.mvp.presentation.ui.home.MainActivity;

/**
 * Dagger UI {@link Subcomponent} (per activity scope).
 * <p>
 * Created by falvojr on 1/13/17.
 */
@PerActivity
@Subcomponent(modules = {PresenterModule.class})
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}


