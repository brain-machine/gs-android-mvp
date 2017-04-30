package io.brainmachine.gs.mvp.dagger.module.infra;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.brainmachine.gs.mvp.infra.storage.service.GitHubService;
import retrofit2.Retrofit;

/**
 * Module for services (Retrofit interfaces).
 * <p>
 * Created by falvojr on 1/12/17.
 */
@Module
public class ServiceModule {

    @Singleton
    @Provides
    GitHubService providesGitHubService(Retrofit retrofit) {
        return retrofit.create(GitHubService.class);
    }

}