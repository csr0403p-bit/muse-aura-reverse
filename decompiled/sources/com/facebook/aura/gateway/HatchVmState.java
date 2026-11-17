package com.facebook.aura.gateway;

import X.C06H;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchVmState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchVmState[] $VALUES;
    public static final HatchVmState CREATING;
    public static final HatchVmState CVM_AWAITING_DST_VM_CHIP_SELECTION;
    public static final HatchVmState CVM_DST_VM_FAILED_TO_START;
    public static final HatchVmState CVM_DST_VM_STARTING;
    public static final HatchVmState CVM_LOCKED;
    public static final Companion Companion;
    public static final HatchVmState DELETING;
    public static final HatchVmState DISABLED;
    public static final HatchVmState ERROR;
    public static final HatchVmState RUNNING;
    public static final HatchVmState STOPPED;
    public static final HatchVmState SUSPENDED;
    public static final HatchVmState UNKNOWN;
    public static final HatchVmState UPDATING;

    public final class Companion {
        public final HatchVmState fromWire(String str) {
            HatchVmState next;
            Iterator<HatchVmState> it = HatchVmState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.name().equals(str)) {
                    break;
                }
            }
            HatchVmState hatchVmState = next;
            return hatchVmState == null ? HatchVmState.UNKNOWN : hatchVmState;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchVmState hatchVmState = new HatchVmState("UNKNOWN", 0);
        UNKNOWN = hatchVmState;
        HatchVmState hatchVmState2 = new HatchVmState("CREATING", 1);
        CREATING = hatchVmState2;
        HatchVmState hatchVmState3 = new HatchVmState("RUNNING", 2);
        RUNNING = hatchVmState3;
        HatchVmState hatchVmState4 = new HatchVmState("STOPPED", 3);
        STOPPED = hatchVmState4;
        HatchVmState hatchVmState5 = new HatchVmState("DELETING", 4);
        DELETING = hatchVmState5;
        HatchVmState hatchVmState6 = new HatchVmState("ERROR", 5);
        ERROR = hatchVmState6;
        HatchVmState hatchVmState7 = new HatchVmState("SUSPENDED", 6);
        SUSPENDED = hatchVmState7;
        HatchVmState hatchVmState8 = new HatchVmState("UPDATING", 7);
        UPDATING = hatchVmState8;
        HatchVmState hatchVmState9 = new HatchVmState("DISABLED", 8);
        DISABLED = hatchVmState9;
        HatchVmState hatchVmState10 = new HatchVmState("CVM_AWAITING_DST_VM_CHIP_SELECTION", 9);
        CVM_AWAITING_DST_VM_CHIP_SELECTION = hatchVmState10;
        HatchVmState hatchVmState11 = new HatchVmState("CVM_DST_VM_STARTING", 10);
        CVM_DST_VM_STARTING = hatchVmState11;
        HatchVmState hatchVmState12 = new HatchVmState("CVM_DST_VM_FAILED_TO_START", 11);
        CVM_DST_VM_FAILED_TO_START = hatchVmState12;
        HatchVmState hatchVmState13 = new HatchVmState(CvmMigrationStatusJson.VAULT_CVM_LOCKED, 12);
        CVM_LOCKED = hatchVmState13;
        HatchVmState[] hatchVmStateArr = {hatchVmState, hatchVmState2, hatchVmState3, hatchVmState4, hatchVmState5, hatchVmState6, hatchVmState7, hatchVmState8, hatchVmState9, hatchVmState10, hatchVmState11, hatchVmState12, hatchVmState13};
        $VALUES = hatchVmStateArr;
        $ENTRIES = C3cG.A0w(hatchVmStateArr);
        Companion = new Companion();
    }

    public static Ey9<HatchVmState> getEntries() {
        return $ENTRIES;
    }

    public static HatchVmState valueOf(String str) {
        return (HatchVmState) Enum.valueOf(HatchVmState.class, str);
    }

    public static HatchVmState[] values() {
        return (HatchVmState[]) $VALUES.clone();
    }

    public HatchVmState(String str, int i) {
    }
}
