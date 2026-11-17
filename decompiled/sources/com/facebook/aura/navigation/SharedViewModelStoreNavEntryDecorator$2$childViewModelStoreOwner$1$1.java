package com.facebook.aura.navigation;

import X.A6H;
import X.A6I;
import X.A6J;
import X.A6K;
import X.A6X;
import X.BJt;
import X.BOD;
import X.BRk;
import X.C0856A6d;
import X.C60O;
import X.C8j3;
import X.EnumC10573Huf;
import X.F2N;
import X.InterfaceC08439ui;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes4.dex */
public final class SharedViewModelStoreNavEntryDecorator$2$childViewModelStoreOwner$1$1 implements BRk, BOD, A6I {
    public final /* synthetic */ A6I $$delegate_0;
    public final /* synthetic */ BJt $entryViewModelStore;

    public SharedViewModelStoreNavEntryDecorator$2$childViewModelStoreOwner$1$1(A6I a6i, BJt bJt) {
        this.$entryViewModelStore = bJt;
        this.$$delegate_0 = a6i;
        if (C8j3.A0m(a6i) != EnumC10573Huf.A04) {
            throw C60O.A0i("The Lifecycle state is already beyond INITIALIZED. The SharedViewModelStoreNavEntryDecorator requires adding the SavedStateNavEntryDecorator to ensure support for SavedStateHandles.");
        }
        A6H.A02(this);
    }

    @Override // X.BRk
    public A6J getDefaultViewModelCreationExtras() {
        C0856A6d c0856A6d = new C0856A6d(A6K.A00);
        c0856A6d.A01(A6H.A01, this);
        c0856A6d.A01(A6H.A02, this);
        return c0856A6d;
    }

    @Override // X.BRk
    public InterfaceC08439ui getDefaultViewModelProviderFactory() {
        return new A6X();
    }

    @Override // X.C1HY
    public F2N getLifecycle() {
        return this.$$delegate_0.getLifecycle();
    }

    @Override // X.A6I
    public SavedStateRegistry getSavedStateRegistry() {
        return this.$$delegate_0.getSavedStateRegistry();
    }

    @Override // X.BOD
    public BJt getViewModelStore() {
        return this.$entryViewModelStore;
    }
}
