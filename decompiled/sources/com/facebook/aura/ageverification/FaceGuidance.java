package com.facebook.aura.ageverification;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FaceGuidance {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FaceGuidance[] $VALUES;
    public static final FaceGuidance ALIGNED;
    public static final FaceGuidance LOW_LIGHT;
    public static final FaceGuidance MOVE_AWAY;
    public static final FaceGuidance MOVE_CLOSER;
    public static final FaceGuidance ONLY_YOU;
    public static final FaceGuidance POSITION;
    public final Integer hintRes;

    static {
        FaceGuidance faceGuidance = new FaceGuidance("POSITION", 0, null);
        POSITION = faceGuidance;
        FaceGuidance faceGuidance2 = new FaceGuidance("ONLY_YOU", 1, Integer.valueOf(R.string._name_removed__res_0x7f120064));
        ONLY_YOU = faceGuidance2;
        FaceGuidance faceGuidance3 = new FaceGuidance("MOVE_CLOSER", 2, Integer.valueOf(R.string._name_removed__res_0x7f120062));
        MOVE_CLOSER = faceGuidance3;
        FaceGuidance faceGuidance4 = new FaceGuidance("MOVE_AWAY", 3, Integer.valueOf(R.string._name_removed__res_0x7f120061));
        MOVE_AWAY = faceGuidance4;
        FaceGuidance faceGuidance5 = new FaceGuidance("LOW_LIGHT", 4, Integer.valueOf(R.string._name_removed__res_0x7f120060));
        LOW_LIGHT = faceGuidance5;
        FaceGuidance faceGuidance6 = new FaceGuidance("ALIGNED", 5, null);
        ALIGNED = faceGuidance6;
        FaceGuidance[] faceGuidanceArr = {faceGuidance, faceGuidance2, faceGuidance3, faceGuidance4, faceGuidance5, faceGuidance6};
        $VALUES = faceGuidanceArr;
        $ENTRIES = C3cG.A0w(faceGuidanceArr);
    }

    public static Ey9<FaceGuidance> getEntries() {
        return $ENTRIES;
    }

    public static FaceGuidance valueOf(String str) {
        return (FaceGuidance) Enum.valueOf(FaceGuidance.class, str);
    }

    public static FaceGuidance[] values() {
        return (FaceGuidance[]) $VALUES.clone();
    }

    public final Integer getHintRes() {
        return this.hintRes;
    }

    public FaceGuidance(String str, int i, Integer num) {
        this.hintRes = num;
    }
}
