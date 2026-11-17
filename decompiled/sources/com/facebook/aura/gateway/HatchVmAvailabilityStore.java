package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.InterfaceC7549F2g;

/* loaded from: classes2.dex */
public final class HatchVmAvailabilityStore implements InterfaceC7549F2g {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final BLG<VmFetchError> _vmFetchError;
    public final C1BN<VmFetchError> vmFetchError;

    public final void setError(VmFetchError vmFetchError) {
        C7384Etj.A0Y(vmFetchError, 0);
        AnonymousClass002.A1I(this._vmFetchError, vmFetchError);
    }

    public final void clearError() {
        this._vmFetchError.Af8(null);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this._vmFetchError.Af8(null);
    }

    public final C1BN<VmFetchError> getVmFetchError() {
        return this.vmFetchError;
    }

    public final class Companion {
        public final HatchVmAvailabilityStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchVmAvailabilityStore) abstractC3358CGz.A03(HatchVmAvailabilityStore.class, HatchVmAvailabilityStore$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchVmAvailabilityStore(C06H c06h) {
        this();
    }

    public HatchVmAvailabilityStore() {
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._vmFetchError = c9286GCnA13;
        this.vmFetchError = C3cG.A11(c9286GCnA13);
    }
}
