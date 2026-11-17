package com.meta.maps.display.camera;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CameraFraming {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CameraFraming[] $VALUES;
    public static final CameraFraming VISIBLE_VIEWPORT;
    public static final CameraFraming WHOLE_MAP;
    public final int value;

    static {
        CameraFraming cameraFraming = new CameraFraming("WHOLE_MAP", 0, 0);
        WHOLE_MAP = cameraFraming;
        CameraFraming cameraFraming2 = new CameraFraming("VISIBLE_VIEWPORT", 1, 1);
        VISIBLE_VIEWPORT = cameraFraming2;
        CameraFraming[] cameraFramingArr = {cameraFraming, cameraFraming2};
        $VALUES = cameraFramingArr;
        $ENTRIES = C3cG.A0w(cameraFramingArr);
    }

    public static Ey9<CameraFraming> getEntries() {
        return $ENTRIES;
    }

    public static CameraFraming valueOf(String str) {
        return (CameraFraming) Enum.valueOf(CameraFraming.class, str);
    }

    public static CameraFraming[] values() {
        return (CameraFraming[]) $VALUES.clone();
    }

    public CameraFraming(String str, int i, int i2) {
        this.value = i2;
    }
}
