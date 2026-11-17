package X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: X.Hhp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10442Hhp implements BRk, BOD, A6I {
    public C5303Dfm A00 = null;
    public A6O A01 = null;
    public InterfaceC08439ui A02;
    public final Fragment A03;
    public final BJt A04;
    public final Runnable A05;

    public final void A00() {
        if (this.A00 == null) {
            this.A00 = new C5303Dfm(this, true);
            A6O a6oA00 = A6O.A00(this);
            this.A01 = a6oA00;
            a6oA00.A01.A00();
            this.A05.run();
        }
    }

    @Override // X.BRk
    public final A6J getDefaultViewModelCreationExtras() {
        Fragment fragment = this.A03;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                applicationContext = null;
                break;
            }
            if (applicationContext instanceof Application) {
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0856A6d c0856A6d = new C0856A6d();
        if (applicationContext != null) {
            c0856A6d.A01(A6Y.A02, applicationContext);
        }
        c0856A6d.A01(A6H.A01, fragment);
        c0856A6d.A01(A6H.A02, this);
        Bundle bundle = fragment.mArguments;
        if (bundle != null) {
            c0856A6d.A01(A6H.A00, bundle);
        }
        return c0856A6d;
    }

    @Override // X.BRk
    public final InterfaceC08439ui getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.A03;
        InterfaceC08439ui defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            defaultViewModelProviderFactory = this.A02;
            if (defaultViewModelProviderFactory == null) {
                Context applicationContext = fragment.requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    }
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
                defaultViewModelProviderFactory = new A6X(application, fragment.mArguments, fragment);
                this.A02 = defaultViewModelProviderFactory;
            }
        } else {
            this.A02 = defaultViewModelProviderFactory;
        }
        return defaultViewModelProviderFactory;
    }

    public C10442Hhp(Fragment fragment, BJt bJt, Runnable runnable) {
        this.A03 = fragment;
        this.A04 = bJt;
        this.A05 = runnable;
    }

    @Override // X.C1HY
    public final F2N getLifecycle() {
        A00();
        return this.A00;
    }

    @Override // X.A6I
    public final SavedStateRegistry getSavedStateRegistry() {
        A00();
        return this.A01.A00;
    }

    @Override // X.BOD
    public final BJt getViewModelStore() {
        A00();
        return this.A04;
    }
}
