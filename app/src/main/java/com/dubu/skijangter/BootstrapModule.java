package com.dubu.skijangter;

import android.accounts.AccountManager;
import android.content.Context;

import com.dubu.skijangter.authenticator.BootstrapAuthenticatorActivity;
import com.dubu.skijangter.authenticator.LogoutService;
import com.dubu.skijangter.core.TimerService;
import com.dubu.skijangter.ui.BootstrapTimerActivity;
import com.dubu.skijangter.ui.CarouselActivity;
import com.dubu.skijangter.ui.CheckInsListFragment;
import com.dubu.skijangter.ui.NewsActivity;
import com.dubu.skijangter.ui.NewsListFragment;
import com.dubu.skijangter.ui.UserActivity;
import com.dubu.skijangter.ui.UserListFragment;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module for setting up provides statements.
 * Register all of your entry points below.
 */
@Module
(
        complete = false,

        injects = {
                BootstrapApplication.class,
                BootstrapAuthenticatorActivity.class,
                CarouselActivity.class,
                BootstrapTimerActivity.class,
                CheckInsListFragment.class,
                NewsActivity.class,
                NewsListFragment.class,
                UserActivity.class,
                UserListFragment.class,
                TimerService.class
        }

)
public class BootstrapModule  {

    @Singleton
    @Provides
    Bus provideOttoBus() {
        return new Bus();
    }

    @Provides
    @Singleton
    LogoutService provideLogoutService(final Context context, final AccountManager accountManager) {
        return new LogoutService(context, accountManager);
    }

}
