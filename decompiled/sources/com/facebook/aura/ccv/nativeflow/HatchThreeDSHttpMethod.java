package com.facebook.aura.ccv.nativeflow;

import X.C3cG;
import X.Ey9;
import com.facebook.tigon.iface.TigonRequest;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchThreeDSHttpMethod {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchThreeDSHttpMethod[] $VALUES;
    public static final HatchThreeDSHttpMethod GET;
    public static final HatchThreeDSHttpMethod POST;

    static {
        HatchThreeDSHttpMethod hatchThreeDSHttpMethod = new HatchThreeDSHttpMethod(TigonRequest.GET, 0);
        GET = hatchThreeDSHttpMethod;
        HatchThreeDSHttpMethod hatchThreeDSHttpMethod2 = new HatchThreeDSHttpMethod("POST", 1);
        POST = hatchThreeDSHttpMethod2;
        HatchThreeDSHttpMethod[] hatchThreeDSHttpMethodArr = {hatchThreeDSHttpMethod, hatchThreeDSHttpMethod2};
        $VALUES = hatchThreeDSHttpMethodArr;
        $ENTRIES = C3cG.A0w(hatchThreeDSHttpMethodArr);
    }

    public static Ey9<HatchThreeDSHttpMethod> getEntries() {
        return $ENTRIES;
    }

    public static HatchThreeDSHttpMethod valueOf(String str) {
        return (HatchThreeDSHttpMethod) Enum.valueOf(HatchThreeDSHttpMethod.class, str);
    }

    public static HatchThreeDSHttpMethod[] values() {
        return (HatchThreeDSHttpMethod[]) $VALUES.clone();
    }

    public HatchThreeDSHttpMethod(String str, int i) {
    }
}
