package com.facebook.aura.spaces.repo;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SpacesUserError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SpacesUserError[] $VALUES;
    public static final SpacesUserError CAMERA_PERMISSION_DENIED;
    public static final SpacesUserError PICKER_FAILED;

    static {
        SpacesUserError spacesUserError = new SpacesUserError("PICKER_FAILED", 0);
        PICKER_FAILED = spacesUserError;
        SpacesUserError spacesUserError2 = new SpacesUserError("CAMERA_PERMISSION_DENIED", 1);
        CAMERA_PERMISSION_DENIED = spacesUserError2;
        SpacesUserError[] spacesUserErrorArr = {spacesUserError, spacesUserError2};
        $VALUES = spacesUserErrorArr;
        $ENTRIES = C3cG.A0w(spacesUserErrorArr);
    }

    public static Ey9<SpacesUserError> getEntries() {
        return $ENTRIES;
    }

    public static SpacesUserError valueOf(String str) {
        return (SpacesUserError) Enum.valueOf(SpacesUserError.class, str);
    }

    public static SpacesUserError[] values() {
        return (SpacesUserError[]) $VALUES.clone();
    }

    public SpacesUserError(String str, int i) {
    }
}
