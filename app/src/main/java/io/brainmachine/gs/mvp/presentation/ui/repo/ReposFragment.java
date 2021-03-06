package io.brainmachine.gs.mvp.presentation.ui.repo;


import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.brainmachine.gs.mvp.R;
import io.brainmachine.gs.mvp.domain.entity.Repo;
import io.brainmachine.gs.mvp.presentation.base.BaseFragment;
import io.brainmachine.gs.mvp.presentation.ui.home.MainActivity;

/**
 * A {@link Repo} list fragment.
 */
public class ReposFragment extends BaseFragment<MainActivity> implements ReposContract.View {

    @Inject
    ReposContract.Presenter mPresenter;

    @BindView(R.id.rvRepos)
    RecyclerView mRecyclerView;

    private Unbinder unbinder;

    public ReposFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_repo, container, false);

        unbinder = ButterKnife.bind(this, view);
        super.getBaseActivity().getDaggerFragmentComponent().inject(this);

        super.getBaseActivity().getFab().setOnClickListener(v -> startNewRepoActivity());

        mPresenter.setView(this);
        mPresenter.loadReposByOrgName("brain-machine");

        return view;
    }

    @Override
    public void setupRepos(List<Repo> repos) {
        // use a linear layout manager
        final RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(super.getBaseActivity());
        mRecyclerView.setLayoutManager(layoutManager);
        // specify an adapter (see also next example)
        final RecyclerView.Adapter<ReposAdapter.ViewHolder> adapter = new ReposAdapter(repos);
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void startNewRepoActivity() {
        Snackbar.make(super.getBaseActivity().getFab(), "TODO: create an action!", Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void showError(String message) {
        Snackbar.make(super.getBaseActivity().getFab(), message, Snackbar.LENGTH_LONG).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
