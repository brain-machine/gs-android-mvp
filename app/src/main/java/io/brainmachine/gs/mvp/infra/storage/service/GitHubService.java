package io.brainmachine.gs.mvp.infra.storage.service;


import java.util.List;

import io.brainmachine.gs.mvp.domain.entity.Repo;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Interface Retrofit da API GitHub Status.
 * <p>
 * Created by falvojr on 1/9/17.
 */
public interface GitHubService {

    String BASE_URL = "https://api.github.com/";

    @GET("orgs/{orgName}/repos")
    Observable<List<Repo>> getReposByOrgName(@Path("orgName") String orgName);
}
