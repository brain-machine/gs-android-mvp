package io.brainmachine.gs.mvp.infra.storage.manager;

import java.util.List;

import javax.inject.Inject;

import io.brainmachine.gs.mvp.domain.entity.Repo;
import io.brainmachine.gs.mvp.domain.repository.GitHubRepository;
import io.brainmachine.gs.mvp.infra.storage.service.GitHubService;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Manager for {@link GitHubRepository}.
 * <p>
 * Created by falvojr on 1/13/17.
 */
public class GitHubManager implements GitHubRepository {

    private final GitHubService mGitHubService;

    @Inject
    public GitHubManager(GitHubService gitHubService) {
        mGitHubService = gitHubService;
    }

    @Override
    public Observable<List<Repo>> getReposByOrgName(String orgName) {
        return mGitHubService.getReposByOrgName(orgName)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
