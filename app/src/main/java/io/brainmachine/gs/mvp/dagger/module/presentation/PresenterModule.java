package io.brainmachine.gs.mvp.dagger.module.presentation;

import dagger.Module;
import dagger.Provides;
import io.brainmachine.gs.mvp.dagger.scope.PerActivity;
import io.brainmachine.gs.mvp.dagger.scope.PerFragment;
import io.brainmachine.gs.mvp.domain.repository.GitHubRepository;
import io.brainmachine.gs.mvp.presentation.ui.home.MainContract;
import io.brainmachine.gs.mvp.presentation.ui.home.MainPresenter;
import io.brainmachine.gs.mvp.presentation.ui.repo.ReposContract;
import io.brainmachine.gs.mvp.presentation.ui.repo.ReposPresenter;

/**
 * Module for presenters.
 *
 * Created by falvojr on 1/13/17.
 */
@Module
public class PresenterModule {
    @PerFragment
    @Provides
    ReposContract.Presenter providesReposPresenter(GitHubRepository gitHubRepository) {
        return new ReposPresenter(gitHubRepository);
    }

    @PerActivity
    @Provides
    MainContract.Presenter providesMainPresenter() {
        return new MainPresenter();
    }
}
