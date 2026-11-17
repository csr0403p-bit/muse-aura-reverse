package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.InterfaceC7549F2g;

/* loaded from: classes4.dex */
public final class HatchVmDisabledStore implements InterfaceC7549F2g {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _isVmDisabled;
    public final C1BN<Boolean> isVmDisabled;

    public final void clearDisabled() {
        AnonymousClass004.A1D(false, this._isVmDisabled);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        AnonymousClass004.A1D(false, this._isVmDisabled);
    }

    public final C1BN<Boolean> isVmDisabled() {
        return this.isVmDisabled;
    }

    public final void setDisabled() {
        AnonymousClass004.A1D(true, this._isVmDisabled);
    }

    /* loaded from: classes2.dex */
    public final class Companion {
        public final HatchVmDisabledStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchVmDisabledStore) abstractC3358CGz.A03(HatchVmDisabledStore.class, HatchVmDisabledStore$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchVmDisabledStore(C06H c06h) {
        this();
    }

    public HatchVmDisabledStore() {
        C9286GCn c9286GCnA14 = C3cG.A14(AnonymousClass001.A0h());
        this._isVmDisabled = c9286GCnA14;
        this.isVmDisabled = C3Pi.A00(c9286GCnA14);
    }
}
