package io.brainmachine.gs.mvp.presentation.ui.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.brainmachine.gs.mvp.R;
import io.brainmachine.gs.mvp.presentation.base.BaseActivity;
import io.brainmachine.gs.mvp.presentation.ui.repo.ReposFragment;

public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawer;
    @BindView(R.id.nav_view)
    NavigationView mNavigationView;
    @BindView(R.id.fab)
    FloatingActionButton mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);

        final ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawer, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.addDrawerListener(toggle);
        toggle.syncState();

        mNavigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Create a new fragment and specify the fragment to show based on nav item clicked
        Fragment fragment;
        Class<?> fragmentClass;
        // Handle navigation view item clicks here
        switch (item.getItemId()) {
            case R.id.nav_repos:
                fragmentClass = ReposFragment.class;
                break;
            case R.id.nav_share:
                // TODO: Create specific fragment to share.
                return true;
            default:
                fragmentClass = ReposFragment.class;
                break;
        }

        try {
            // Create fragment by refection
            fragment = (Fragment) fragmentClass.newInstance();

            // Insert the fragment by replacing any existing fragment (if different)
            final FragmentManager fragmentManager = getSupportFragmentManager();
            final Fragment currentFragment = fragmentManager.findFragmentByTag(TAG);
            if (currentFragment == null || !fragmentClass.equals(currentFragment.getClass())) {
                fragmentManager.beginTransaction().replace(R.id.flContent, fragment, TAG).commit();
                // Set action bar title
                setTitle(item.getTitle());
            }
        } catch (Exception e) {
            Log.e(TAG, e.getMessage(), e);
        }

        // Close the navigation drawer
        mDrawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public FloatingActionButton getFab() {
        return mFab;
    }
}