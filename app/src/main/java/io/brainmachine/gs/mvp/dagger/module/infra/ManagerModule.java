package io.brainmachine.gs.mvp.dagger.module.infra;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.brainmachine.gs.mvp.domain.repository.GitHubRepository;
import io.brainmachine.gs.mvp.infra.storage.manager.GitHubManager;
import io.brainmachine.gs.mvp.infra.storage.service.GitHubService;


/**
 * Module for managers (Repository pattern implementations).
 * <p>
 * Created by falvojr on 1/13/17.
 */
@Module
public class ManagerModule {

    @Singleton
    @Provides
    GitHubRepository providesGitHubRepository(
            GitHubService gitHubService) {
        return new GitHubManager(gitHubService);
    }

}
