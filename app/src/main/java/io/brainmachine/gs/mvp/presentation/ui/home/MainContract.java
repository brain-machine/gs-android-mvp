package io.brainmachine.gs.mvp.presentation.ui.home;

/**
 * MainActivity contract.
 *
 * Created by falvojr on 1/14/17.
 */
public interface MainContract {
    interface View {
        void sayHello();
    }

    interface Presenter {
        void setView(MainContract.View view);

        void callSayHello();
    }
}
