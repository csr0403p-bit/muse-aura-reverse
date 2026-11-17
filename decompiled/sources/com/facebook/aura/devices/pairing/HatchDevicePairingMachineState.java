package com.facebook.aura.devices.pairing;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cI;
import X.C7384Etj;
import com.facebook.aura.devices.pairing.HatchLinkOtaRepairState;

/* loaded from: classes4.dex */
public final class HatchDevicePairingMachineState extends C06G {
    public final boolean autoSelectsSetUpAgain;
    public final HatchLinkOtaRepairState linkOtaRepairState;
    public final HatchDevicePairingLinkAction pendingLinkAction;
    public final String setUpAgainAddress;
    public final HatchDevicePairingViewState ui;
    public static final Companion Companion = new Companion();
    public static final int $stable = HatchDevicePairingViewState.$stable;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchDevicePairingMachineState) {
                HatchDevicePairingMachineState hatchDevicePairingMachineState = (HatchDevicePairingMachineState) obj;
                if (!C7384Etj.areEqual(this.ui, hatchDevicePairingMachineState.ui) || this.pendingLinkAction != hatchDevicePairingMachineState.pendingLinkAction || !C7384Etj.areEqual(this.linkOtaRepairState, hatchDevicePairingMachineState.linkOtaRepairState) || !C7384Etj.areEqual(this.setUpAgainAddress, hatchDevicePairingMachineState.setUpAgainAddress) || this.autoSelectsSetUpAgain != hatchDevicePairingMachineState.autoSelectsSetUpAgain) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        public final HatchDevicePairingMachineState initial() {
            boolean z = false;
            return new HatchDevicePairingMachineState(new HatchDevicePairingViewState(z, z, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 134217727, 0 == true ? 1 : 0), null, HatchLinkOtaRepairState.Idle.INSTANCE, null, false);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchDevicePairingMachineState(HatchDevicePairingViewState hatchDevicePairingViewState, HatchDevicePairingLinkAction hatchDevicePairingLinkAction, HatchLinkOtaRepairState hatchLinkOtaRepairState, String str, boolean z, int i, C06H c06h) {
        this(hatchDevicePairingViewState, (i & 2) != 0 ? null : hatchDevicePairingLinkAction, (i & 4) != 0 ? HatchLinkOtaRepairState.Idle.INSTANCE : hatchLinkOtaRepairState, (i & 8) != 0 ? null : str, C3cI.A1S(i, z));
    }

    public static /* synthetic */ HatchDevicePairingMachineState copy$default(HatchDevicePairingMachineState hatchDevicePairingMachineState, HatchDevicePairingViewState hatchDevicePairingViewState, HatchDevicePairingLinkAction hatchDevicePairingLinkAction, HatchLinkOtaRepairState hatchLinkOtaRepairState, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchDevicePairingViewState = hatchDevicePairingMachineState.ui;
        }
        if ((i & 2) != 0) {
            hatchDevicePairingLinkAction = hatchDevicePairingMachineState.pendingLinkAction;
        }
        if ((i & 4) != 0) {
            hatchLinkOtaRepairState = hatchDevicePairingMachineState.linkOtaRepairState;
        }
        if ((i & 8) != 0) {
            str = hatchDevicePairingMachineState.setUpAgainAddress;
        }
        if ((i & 16) != 0) {
            z = hatchDevicePairingMachineState.autoSelectsSetUpAgain;
        }
        return hatchDevicePairingMachineState.copy(hatchDevicePairingViewState, hatchDevicePairingLinkAction, hatchLinkOtaRepairState, str, z);
    }

    public final HatchDevicePairingViewState component1() {
        return this.ui;
    }

    public final HatchDevicePairingLinkAction component2() {
        return this.pendingLinkAction;
    }

    public final HatchLinkOtaRepairState component3() {
        return this.linkOtaRepairState;
    }

    public final String component4() {
        return this.setUpAgainAddress;
    }

    public final boolean component5() {
        return this.autoSelectsSetUpAgain;
    }

    public final boolean getAutoSelectsSetUpAgain() {
        return this.autoSelectsSetUpAgain;
    }

    public final HatchLinkOtaRepairState getLinkOtaRepairState() {
        return this.linkOtaRepairState;
    }

    public final HatchDevicePairingLinkAction getPendingLinkAction() {
        return this.pendingLinkAction;
    }

    public final String getSetUpAgainAddress() {
        return this.setUpAgainAddress;
    }

    public final HatchDevicePairingViewState getUi() {
        return this.ui;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0F(this.linkOtaRepairState, (AnonymousClass005.A0E(this.ui) + AnonymousClass006.A0D(this.pendingLinkAction)) * 31) + AnonymousClass005.A0H(this.setUpAgainAddress)) * 31, this.autoSelectsSetUpAgain);
    }

    public final HatchDevicePairingMachineState copy(HatchDevicePairingViewState hatchDevicePairingViewState, HatchDevicePairingLinkAction hatchDevicePairingLinkAction, HatchLinkOtaRepairState hatchLinkOtaRepairState, String str, boolean z) {
        AnonymousClass003.A0v(hatchDevicePairingViewState, hatchLinkOtaRepairState);
        return new HatchDevicePairingMachineState(hatchDevicePairingViewState, hatchDevicePairingLinkAction, hatchLinkOtaRepairState, str, z);
    }

    public String toString() {
        return super.toString();
    }

    public HatchDevicePairingMachineState(HatchDevicePairingViewState hatchDevicePairingViewState, HatchDevicePairingLinkAction hatchDevicePairingLinkAction, HatchLinkOtaRepairState hatchLinkOtaRepairState, String str, boolean z) {
        AnonymousClass003.A0v(hatchDevicePairingViewState, hatchLinkOtaRepairState);
        this.ui = hatchDevicePairingViewState;
        this.pendingLinkAction = hatchDevicePairingLinkAction;
        this.linkOtaRepairState = hatchLinkOtaRepairState;
        this.setUpAgainAddress = str;
        this.autoSelectsSetUpAgain = z;
    }
}
