package com.facebook.aura.vmdisabled;

import X.C06H;
import X.Ey9;
import X.F3w;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class RecoveryFlow {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RecoveryFlow[] $VALUES;
    public static final Companion Companion;
    public static final RecoveryFlow LEGACY;
    public static final RecoveryFlow SERVER_CONTENT;
    public static final RecoveryFlow SERVER_CONTENT_HIGH_RISK;
    public static final RecoveryFlow SERVER_CONTENT_MEDIUM_RISK;
    public static final RecoveryFlow SERVER_CONTENT_PENDING;
    public final VmRecoveryFlowType flowType;

    public final class Companion {
        public final RecoveryFlow fromWire(String str) {
            RecoveryFlow next;
            Iterator<RecoveryFlow> it = RecoveryFlow.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.name().equalsIgnoreCase(str)) {
                    break;
                }
            }
            RecoveryFlow recoveryFlow = next;
            return recoveryFlow == null ? RecoveryFlow.LEGACY : recoveryFlow;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        RecoveryFlow recoveryFlow = new RecoveryFlow("LEGACY", 0, null);
        LEGACY = recoveryFlow;
        RecoveryFlow recoveryFlow2 = new RecoveryFlow("SERVER_CONTENT", 1, VmRecoveryFlowType.HEDGED_WARNING_MEDIUM_FRICTION);
        SERVER_CONTENT = recoveryFlow2;
        VmRecoveryFlowType vmRecoveryFlowType = VmRecoveryFlowType.NEUTRAL_MESSAGE;
        RecoveryFlow recoveryFlow3 = new RecoveryFlow("SERVER_CONTENT_MEDIUM_RISK", 2, vmRecoveryFlowType);
        SERVER_CONTENT_MEDIUM_RISK = recoveryFlow3;
        RecoveryFlow recoveryFlow4 = new RecoveryFlow("SERVER_CONTENT_PENDING", 3, vmRecoveryFlowType);
        SERVER_CONTENT_PENDING = recoveryFlow4;
        RecoveryFlow recoveryFlow5 = new RecoveryFlow("SERVER_CONTENT_HIGH_RISK", 4, VmRecoveryFlowType.RESET_RECOMMENDED);
        SERVER_CONTENT_HIGH_RISK = recoveryFlow5;
        RecoveryFlow[] recoveryFlowArr = {recoveryFlow, recoveryFlow2, recoveryFlow3, recoveryFlow4, recoveryFlow5};
        $VALUES = recoveryFlowArr;
        $ENTRIES = new F3w(recoveryFlowArr);
        Companion = new Companion();
    }

    public static Ey9<RecoveryFlow> getEntries() {
        return $ENTRIES;
    }

    public static RecoveryFlow valueOf(String str) {
        return (RecoveryFlow) Enum.valueOf(RecoveryFlow.class, str);
    }

    public static RecoveryFlow[] values() {
        return (RecoveryFlow[]) $VALUES.clone();
    }

    public final VmRecoveryFlowType getFlowType() {
        return this.flowType;
    }

    public RecoveryFlow(String str, int i, VmRecoveryFlowType vmRecoveryFlowType) {
        this.flowType = vmRecoveryFlowType;
    }
}
