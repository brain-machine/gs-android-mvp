package io.brainmachine.gs.mvp.dagger.component;

import dagger.Subcomponent;
import io.brainmachine.gs.mvp.dagger.module.presentation.PresenterModule;
import io.brainmachine.gs.mvp.dagger.scope.PerFragment;
import io.brainmachine.gs.mvp.presentation.ui.repo.ReposFragment;

/**
 * Dagger UI {@link Subcomponent} (per fragment scope).
 * <p>
 * Created by falvojr on 1/13/17.
 */
@PerFragment
@Subcomponent(modules = {PresenterModule.class})
public interface FragmentComponent {
    void inject(ReposFragment fragment);
}


