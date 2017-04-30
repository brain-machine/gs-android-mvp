package io.brainmachine.gs.mvp.presentation.base;

import android.support.v4.app.Fragment;

/**
 * Base {@link Fragment}.
 * <p>
 * Created by falvojr on 4/28/17.
 */
public class BaseFragment<T extends BaseActivity> extends Fragment {

    protected T getBaseActivity() {
        return (T) getActivity();
    }
}
