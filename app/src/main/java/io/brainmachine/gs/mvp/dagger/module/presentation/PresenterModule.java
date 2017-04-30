package io.brainmachine.gs.mvp.dagger.module.presentation;

import dagger.Module;
import dagger.Provides;
import io.brainmachine.gs.mvp.dagger.scope.PerActivity;
import io.brainmachine.gs.mvp.domain.repository.GitHubRepository;
import io.brainmachine.gs.mvp.presentation.ui.repo.ReposContract;
import io.brainmachine.gs.mvp.presentation.ui.repo.ReposPresenter;

/**
 * Module for presenters.
 *
 * Created by falvojr on 1/13/17.
 */
@Module
public class PresenterModule {
    @PerActivity
    @Provides
    ReposContract.Presenter providesResposPresenter(GitHubRepository gitHubRepository) {
        return new ReposPresenter(gitHubRepository);
    }
}
