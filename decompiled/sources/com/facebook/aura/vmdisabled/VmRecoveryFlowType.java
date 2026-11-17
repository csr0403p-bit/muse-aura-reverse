package com.facebook.aura.vmdisabled;

import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class VmRecoveryFlowType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VmRecoveryFlowType[] $VALUES;
    public static final Companion Companion;
    public static final VmRecoveryFlowType HEDGED_WARNING_MEDIUM_FRICTION;
    public static final VmRecoveryFlowType NEUTRAL_MESSAGE;
    public static final VmRecoveryFlowType RESET_RECOMMENDED;
    public final String wireValue;

    static {
        VmRecoveryFlowType vmRecoveryFlowType = new VmRecoveryFlowType("HEDGED_WARNING_MEDIUM_FRICTION", 0, "hedged_warning_medium_friction");
        HEDGED_WARNING_MEDIUM_FRICTION = vmRecoveryFlowType;
        VmRecoveryFlowType vmRecoveryFlowType2 = new VmRecoveryFlowType("NEUTRAL_MESSAGE", 1, "neutral_message");
        NEUTRAL_MESSAGE = vmRecoveryFlowType2;
        VmRecoveryFlowType vmRecoveryFlowType3 = new VmRecoveryFlowType("RESET_RECOMMENDED", 2, "reset_recommended");
        RESET_RECOMMENDED = vmRecoveryFlowType3;
        VmRecoveryFlowType[] vmRecoveryFlowTypeArr = {vmRecoveryFlowType, vmRecoveryFlowType2, vmRecoveryFlowType3};
        $VALUES = vmRecoveryFlowTypeArr;
        $ENTRIES = new F3w(vmRecoveryFlowTypeArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final VmRecoveryFlowType fromWire(String str) {
            VmRecoveryFlowType next;
            Iterator<VmRecoveryFlowType> it = VmRecoveryFlowType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<VmRecoveryFlowType> getEntries() {
        return $ENTRIES;
    }

    public static VmRecoveryFlowType valueOf(String str) {
        return (VmRecoveryFlowType) Enum.valueOf(VmRecoveryFlowType.class, str);
    }

    public static VmRecoveryFlowType[] values() {
        return (VmRecoveryFlowType[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public VmRecoveryFlowType(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
