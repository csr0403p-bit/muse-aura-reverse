package com.facebook.aura.ageverification.intf;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SelfieCapturePhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SelfieCapturePhase[] $VALUES;
    public static final SelfieCapturePhase CAMERA_READY;
    public static final SelfieCapturePhase COMPLETED;
    public static final SelfieCapturePhase FAILED;
    public static final SelfieCapturePhase MOVE_UP;
    public static final SelfieCapturePhase RESET;
    public static final SelfieCapturePhase TURN_RIGHT;

    static {
        SelfieCapturePhase selfieCapturePhase = new SelfieCapturePhase("CAMERA_READY", 0);
        CAMERA_READY = selfieCapturePhase;
        SelfieCapturePhase selfieCapturePhase2 = new SelfieCapturePhase("TURN_RIGHT", 1);
        TURN_RIGHT = selfieCapturePhase2;
        SelfieCapturePhase selfieCapturePhase3 = new SelfieCapturePhase("MOVE_UP", 2);
        MOVE_UP = selfieCapturePhase3;
        SelfieCapturePhase selfieCapturePhase4 = new SelfieCapturePhase("COMPLETED", 3);
        COMPLETED = selfieCapturePhase4;
        SelfieCapturePhase selfieCapturePhase5 = new SelfieCapturePhase("RESET", 4);
        RESET = selfieCapturePhase5;
        SelfieCapturePhase selfieCapturePhase6 = new SelfieCapturePhase(CvmMigrationStatusJson.STAGE_FAILED, 5);
        FAILED = selfieCapturePhase6;
        SelfieCapturePhase[] selfieCapturePhaseArr = {selfieCapturePhase, selfieCapturePhase2, selfieCapturePhase3, selfieCapturePhase4, selfieCapturePhase5, selfieCapturePhase6};
        $VALUES = selfieCapturePhaseArr;
        $ENTRIES = C3cG.A0w(selfieCapturePhaseArr);
    }

    public static Ey9<SelfieCapturePhase> getEntries() {
        return $ENTRIES;
    }

    public static SelfieCapturePhase valueOf(String str) {
        return (SelfieCapturePhase) Enum.valueOf(SelfieCapturePhase.class, str);
    }

    public static SelfieCapturePhase[] values() {
        return (SelfieCapturePhase[]) $VALUES.clone();
    }

    public SelfieCapturePhase(String str, int i) {
    }
}
