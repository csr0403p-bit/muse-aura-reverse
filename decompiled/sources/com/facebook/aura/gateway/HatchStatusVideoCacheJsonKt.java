package com.facebook.aura.gateway;

import X.C7384Etj;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.SerializationException;

/* loaded from: classes2.dex */
public abstract class HatchStatusVideoCacheJsonKt {
    public static final HatchStatusVideoPathsJson decodeStatusVideoPaths(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            return (HatchStatusVideoPathsJson) HatchJsonKt.HatchJson.A00(str, HatchStatusVideoPathsJson$$serializer.INSTANCE);
        } catch (SerializationException unused) {
            return null;
        }
    }

    public static final String encodeStatusVideoPaths(HatchStatusVideoPathsJson hatchStatusVideoPathsJson) {
        C7384Etj.A0Y(hatchStatusVideoPathsJson, 0);
        return HatchJsonKt.HatchJson.A02(hatchStatusVideoPathsJson, HatchStatusVideoPathsJson$$serializer.INSTANCE);
    }
}
