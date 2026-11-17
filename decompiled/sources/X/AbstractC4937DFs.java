package X;

/* renamed from: X.DFs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4937DFs {
    public C4931DFd mPigeonIdentity;
    public boolean mPigeonIdentityKnown;
    public final C4938DFu mSessionManagerCallbackObservable = new C4938DFu();

    public synchronized C4931DFd getOrBootstrapPigeonIdentity() {
        if (!this.mPigeonIdentityKnown) {
            this.mPigeonIdentity = provideBootstrappedPigeonIdentity();
            this.mPigeonIdentityKnown = true;
        }
        return this.mPigeonIdentity;
    }

    public final synchronized void notifyClientModeStateChanged() {
        for (DFz dFz : C4938DFu.A00(this.mSessionManagerCallbackObservable)) {
            dFz.clientModeStateChanged();
        }
    }

    public final synchronized void notifyOnBackground() {
        for (DFz dFz : C4938DFu.A00(this.mSessionManagerCallbackObservable)) {
            dFz.onBackground();
        }
    }

    public final synchronized void notifyOnForeground() {
        for (DFz dFz : C4938DFu.A00(this.mSessionManagerCallbackObservable)) {
            dFz.onForeground();
        }
    }

    public synchronized void notifyOnUserLoggedIn(C4931DFd c4931DFd) {
        this.mPigeonIdentityKnown = true;
        this.mPigeonIdentity = c4931DFd;
        for (DFz dFz : C4938DFu.A00(this.mSessionManagerCallbackObservable)) {
            dFz.userLogin(c4931DFd);
        }
    }

    public final synchronized void notifyOnUserLogout() {
        for (DFz dFz : C4938DFu.A00(this.mSessionManagerCallbackObservable)) {
            dFz.userLogout();
        }
    }

    public final synchronized void notifyUserConsentChanged() {
        for (DFz dFz : C4938DFu.A00(this.mSessionManagerCallbackObservable)) {
            dFz.userConsentChanged();
        }
    }

    public abstract C4931DFd provideBootstrappedPigeonIdentity();

    @Deprecated
    public abstract String provideBootstrappedUserID();

    public void registerCallback(DFz dFz) {
        this.mSessionManagerCallbackObservable.registerObserver(dFz);
    }

    @Deprecated
    public final synchronized void notifyOnUserLoggedIn(String str, String str2) {
        C4931DFd c4931DFd;
        if (str == null) {
            c4931DFd = null;
        } else {
            c4931DFd = new C4931DFd(str, str, str2);
        }
        notifyOnUserLoggedIn(c4931DFd);
    }

    @Deprecated
    public final synchronized void notifyOnUserLoggedIn(String str) {
        C4931DFd c4931DFd = null;
        if (str != null) {
            c4931DFd = new C4931DFd(str, str, null);
            notifyOnUserLoggedIn(c4931DFd);
        } else {
            notifyOnUserLoggedIn(c4931DFd);
        }
    }
}
