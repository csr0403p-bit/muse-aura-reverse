package com.facebook.aura.storagerecovery.data;

import X.AbstractC3358CGz;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HnJ;
import X.InterfaceC7549F2g;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryState;

/* loaded from: classes3.dex */
public final class HatchStorageRecoveryStore implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<HatchStorageRecoveryState> _state;
    public final C1BN<HatchStorageRecoveryState> state;

    public final void setActive(HatchStorageRecoveryStatus hatchStorageRecoveryStatus) {
        C7384Etj.A0Y(hatchStorageRecoveryStatus, 0);
        BLG<HatchStorageRecoveryState> blg = this._state;
        while (!blg.A6e(blg.getValue(), new HatchStorageRecoveryState.Active(hatchStorageRecoveryStatus))) {
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        BLG<HatchStorageRecoveryState> blg = this._state;
        while (!blg.A6e(blg.getValue(), HatchStorageRecoveryState.Inactive.INSTANCE)) {
        }
    }

    public final C1BN<HatchStorageRecoveryState> getState() {
        return this.state;
    }

    public final void markTransportLost() {
        HatchStorageRecoveryState value;
        HatchStorageRecoveryState hatchStorageRecoveryState;
        BLG<HatchStorageRecoveryState> blg = this._state;
        do {
            value = blg.getValue();
            hatchStorageRecoveryState = value;
            if ((value instanceof HatchStorageRecoveryState.Required) || (value instanceof HatchStorageRecoveryState.Active) || C7384Etj.areEqual(value, HatchStorageRecoveryState.Available.INSTANCE)) {
                hatchStorageRecoveryState = HatchStorageRecoveryState.Reconnecting.INSTANCE;
            }
        } while (!blg.A6e(value, hatchStorageRecoveryState));
    }

    public final void setAvailable() {
        HatchStorageRecoveryState value;
        HatchStorageRecoveryState hatchStorageRecoveryState;
        BLG<HatchStorageRecoveryState> blg = this._state;
        do {
            value = blg.getValue();
            hatchStorageRecoveryState = value;
            if (!C7384Etj.areEqual(value, HatchStorageRecoveryState.Inactive.INSTANCE)) {
                hatchStorageRecoveryState = HatchStorageRecoveryState.Available.INSTANCE;
            }
        } while (!blg.A6e(value, hatchStorageRecoveryState));
    }

    public final void setInactive() {
        BLG<HatchStorageRecoveryState> blg = this._state;
        while (!blg.A6e(blg.getValue(), HatchStorageRecoveryState.Inactive.INSTANCE)) {
        }
    }

    public final void setReconnecting() {
        BLG<HatchStorageRecoveryState> blg = this._state;
        while (!blg.A6e(blg.getValue(), HatchStorageRecoveryState.Reconnecting.INSTANCE)) {
        }
    }

    public final void setRequired() {
        HatchStorageRecoveryState value;
        HatchStorageRecoveryState hatchStorageRecoveryState;
        BLG<HatchStorageRecoveryState> blg = this._state;
        do {
            value = blg.getValue();
            hatchStorageRecoveryState = value;
            if (!(value instanceof HatchStorageRecoveryState.Active)) {
                hatchStorageRecoveryState = HatchStorageRecoveryState.Required.INSTANCE;
            }
        } while (!blg.A6e(value, hatchStorageRecoveryState));
    }

    /* loaded from: classes2.dex */
    public final class Companion {
        public final HatchStorageRecoveryStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchStorageRecoveryStore) abstractC3358CGz.A03(HatchStorageRecoveryStore.class, HatchStorageRecoveryStore$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchStorageRecoveryStore(C06H c06h) {
        this();
    }

    public HatchStorageRecoveryStore() {
        C9286GCn c9286GCnA01 = HnJ.A01(HatchStorageRecoveryState.Inactive.INSTANCE);
        this._state = c9286GCnA01;
        this.state = C3Pi.A00(c9286GCnA01);
    }
}
