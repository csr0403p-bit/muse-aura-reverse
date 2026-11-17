package com.facebook.aura.ageverification;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FaceDetectionModuleState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FaceDetectionModuleState[] $VALUES;
    public static final FaceDetectionModuleState LOADING;
    public static final FaceDetectionModuleState NOT_LOADED;
    public static final FaceDetectionModuleState READY;
    public static final FaceDetectionModuleState UNAVAILABLE;

    static {
        FaceDetectionModuleState faceDetectionModuleState = new FaceDetectionModuleState("NOT_LOADED", 0);
        NOT_LOADED = faceDetectionModuleState;
        FaceDetectionModuleState faceDetectionModuleState2 = new FaceDetectionModuleState("LOADING", 1);
        LOADING = faceDetectionModuleState2;
        FaceDetectionModuleState faceDetectionModuleState3 = new FaceDetectionModuleState("READY", 2);
        READY = faceDetectionModuleState3;
        FaceDetectionModuleState faceDetectionModuleState4 = new FaceDetectionModuleState("UNAVAILABLE", 3);
        UNAVAILABLE = faceDetectionModuleState4;
        FaceDetectionModuleState[] faceDetectionModuleStateArr = {faceDetectionModuleState, faceDetectionModuleState2, faceDetectionModuleState3, faceDetectionModuleState4};
        $VALUES = faceDetectionModuleStateArr;
        $ENTRIES = C3cG.A0w(faceDetectionModuleStateArr);
    }

    public static Ey9<FaceDetectionModuleState> getEntries() {
        return $ENTRIES;
    }

    public static FaceDetectionModuleState valueOf(String str) {
        return (FaceDetectionModuleState) Enum.valueOf(FaceDetectionModuleState.class, str);
    }

    public static FaceDetectionModuleState[] values() {
        return (FaceDetectionModuleState[]) $VALUES.clone();
    }

    public FaceDetectionModuleState(String str, int i) {
    }
}
