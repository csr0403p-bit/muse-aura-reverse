package com.facebook.aura.devices.pairing;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C3cI;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchDevicePairingTransition extends C06G {
    public static final int $stable = HatchDevicePairingViewState.$stable;
    public final List<HatchDevicePairingEffect> effects;
    public final HatchDevicePairingMachineState state;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchDevicePairingTransition) {
                HatchDevicePairingTransition hatchDevicePairingTransition = (HatchDevicePairingTransition) obj;
                if (!C7384Etj.areEqual(this.state, hatchDevicePairingTransition.state) || !C7384Etj.areEqual(this.effects, hatchDevicePairingTransition.effects)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchDevicePairingTransition copy$default(HatchDevicePairingTransition hatchDevicePairingTransition, HatchDevicePairingMachineState hatchDevicePairingMachineState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchDevicePairingMachineState = hatchDevicePairingTransition.state;
        }
        if ((i & 2) != 0) {
            list = hatchDevicePairingTransition.effects;
        }
        AnonymousClass003.A0u(hatchDevicePairingMachineState, list);
        return new HatchDevicePairingTransition(hatchDevicePairingMachineState, list);
    }

    public final HatchDevicePairingMachineState component1() {
        return this.state;
    }

    public final List<HatchDevicePairingEffect> component2() {
        return this.effects;
    }

    public final List<HatchDevicePairingEffect> getEffects() {
        return this.effects;
    }

    public final HatchDevicePairingMachineState getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.effects, AnonymousClass005.A0E(this.state));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchDevicePairingTransition(HatchDevicePairingMachineState hatchDevicePairingMachineState, List<? extends HatchDevicePairingEffect> list) {
        AnonymousClass003.A0u(hatchDevicePairingMachineState, list);
        this.state = hatchDevicePairingMachineState;
        this.effects = list;
    }

    public final HatchDevicePairingTransition copy(HatchDevicePairingMachineState hatchDevicePairingMachineState, List<? extends HatchDevicePairingEffect> list) {
        AnonymousClass003.A0u(hatchDevicePairingMachineState, list);
        return new HatchDevicePairingTransition(hatchDevicePairingMachineState, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchDevicePairingTransition(HatchDevicePairingMachineState hatchDevicePairingMachineState, List list, int i, C06H c06h) {
        this(hatchDevicePairingMachineState, C3cI.A11(list, i));
    }
}
