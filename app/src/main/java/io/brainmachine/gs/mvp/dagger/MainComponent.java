package io.brainmachine.gs.mvp.dagger;

import javax.inject.Singleton;

import dagger.Component;
import io.brainmachine.gs.mvp.dagger.component.ActivityComponent;
import io.brainmachine.gs.mvp.dagger.component.FragmentComponent;
import io.brainmachine.gs.mvp.dagger.module.ApplicationModule;
import io.brainmachine.gs.mvp.dagger.module.PreferenceModule;
import io.brainmachine.gs.mvp.dagger.module.infra.ManagerModule;
import io.brainmachine.gs.mvp.dagger.module.infra.NetworkModule;
import io.brainmachine.gs.mvp.dagger.module.infra.ServiceModule;
import io.brainmachine.gs.mvp.dagger.module.presentation.HelperModule;

/**
 * Main Dagger {@link Component}.
 * <p>
 * Created by falvojr on 1/12/17.
 */
@Singleton
@Component(modules = {
        ApplicationModule.class,
        HelperModule.class,
        PreferenceModule.class,
        NetworkModule.class,
        ServiceModule.class,
        ManagerModule.class
})
public interface MainComponent {
    ActivityComponent activityComponent();

    FragmentComponent fragmentComponent();
}
