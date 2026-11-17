package com.facebook.aura.ageverification;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HeadMovement {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HeadMovement[] $VALUES;
    public static final HeadMovement LEFT;
    public static final HeadMovement RIGHT;
    public static final HeadMovement UP;

    static {
        HeadMovement headMovement = new HeadMovement("RIGHT", 0);
        RIGHT = headMovement;
        HeadMovement headMovement2 = new HeadMovement("UP", 1);
        UP = headMovement2;
        HeadMovement headMovement3 = new HeadMovement("LEFT", 2);
        LEFT = headMovement3;
        HeadMovement[] headMovementArr = {headMovement, headMovement2, headMovement3};
        $VALUES = headMovementArr;
        $ENTRIES = C3cG.A0w(headMovementArr);
    }

    public static Ey9<HeadMovement> getEntries() {
        return $ENTRIES;
    }

    public static HeadMovement valueOf(String str) {
        return (HeadMovement) Enum.valueOf(HeadMovement.class, str);
    }

    public static HeadMovement[] values() {
        return (HeadMovement[]) $VALUES.clone();
    }

    public HeadMovement(String str, int i) {
    }
}
