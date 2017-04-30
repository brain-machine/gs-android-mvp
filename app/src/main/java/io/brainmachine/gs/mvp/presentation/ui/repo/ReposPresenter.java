package io.brainmachine.gs.mvp.presentation.ui.repo;

import io.brainmachine.gs.mvp.domain.entity.Repo;
import io.brainmachine.gs.mvp.domain.repository.GitHubRepository;

/**
 * GitHub List {@link Repo}'s presenter.
 * <p>
 * Created by falvojr on 1/14/17.
 */
public class ReposPresenter implements ReposContract.Presenter {

    private final GitHubRepository mGitHubRepository;
    private ReposContract.View mView;

    public ReposPresenter(GitHubRepository gitHubRepository) {
        mGitHubRepository = gitHubRepository;
    }

    @Override
    public void setView(ReposContract.View view) {
        mView = view;
    }

    @Override
    public void loadReposByOrgName(String orgName) {
        mGitHubRepository.getReposByOrgName(orgName)
                .subscribe(repos -> {
                    mView.setupRepos(repos);
                }, error -> {
                    mView.showError(error.getMessage());
                });
    }

}
