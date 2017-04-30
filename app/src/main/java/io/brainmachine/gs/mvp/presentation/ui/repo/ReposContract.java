package io.brainmachine.gs.mvp.presentation.ui.repo;

import java.util.List;

import io.brainmachine.gs.mvp.domain.entity.Repo;

/**
 * GitHub list {@link Repo} MVP contract.
 *
 * Created by falvojr on 1/14/17.
 */
public interface ReposContract {
    interface View {
        void setupRepos(List<Repo> repos);

        void startNewRepoActivity(View view);

        void showError(String message);
    }

    interface Presenter {
        void setView(ReposContract.View view);

        void loadReposByOrgName(String orgName);
    }
}
