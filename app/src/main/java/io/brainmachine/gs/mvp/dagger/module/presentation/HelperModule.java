package io.brainmachine.gs.mvp.dagger.module.presentation;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import io.brainmachine.gs.mvp.presentation.helper.AppHelper;

/**
 * Module for app helpers.
 * <p>
 * Created by falvojr on 1/13/17.
 */
@Module
public class HelperModule {
    @Provides
    @Reusable
    AppHelper provideAppHelper(Context context) {
        return new AppHelper(context);
    }
}
