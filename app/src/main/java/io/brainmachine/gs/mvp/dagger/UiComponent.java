package io.brainmachine.gs.mvp.dagger;

import dagger.Subcomponent;
import io.brainmachine.gs.mvp.dagger.module.presentation.PresenterModule;
import io.brainmachine.gs.mvp.dagger.scope.PerActivity;
import io.brainmachine.gs.mvp.presentation.ui.home.MainActivity;
import io.brainmachine.gs.mvp.presentation.ui.repo.ReposFragment;

/**
 * Dagger UI {@link Subcomponent} (per activity scope).
 * <p>
 * Created by falvojr on 1/13/17.
 */
@PerActivity
@Subcomponent(modules = {PresenterModule.class})
public interface UiComponent {
    void inject(MainActivity activity);
    void inject(ReposFragment fragment);
}
