package io.brainmachine.gs.mvp.domain.repository;

import java.util.List;

import io.brainmachine.gs.mvp.domain.entity.Repo;
import io.reactivex.Observable;

/**
 * Repository interface da API GitHub Status.
 * <p>
 * Created by falvojr on 1/13/17.
 */
public interface GitHubRepository {
    Observable<List<Repo>> getReposByOrgName(String orgName);
}
