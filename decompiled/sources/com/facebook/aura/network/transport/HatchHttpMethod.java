package com.facebook.aura.network.transport;

import X.C3cG;
import X.Ey9;
import com.facebook.tigon.iface.TigonRequest;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchHttpMethod {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchHttpMethod[] $VALUES;
    public static final HatchHttpMethod DELETE;
    public static final HatchHttpMethod GET;
    public static final HatchHttpMethod PATCH;
    public static final HatchHttpMethod POST;
    public static final HatchHttpMethod PUT;

    static {
        HatchHttpMethod hatchHttpMethod = new HatchHttpMethod(TigonRequest.GET, 0);
        GET = hatchHttpMethod;
        HatchHttpMethod hatchHttpMethod2 = new HatchHttpMethod("POST", 1);
        POST = hatchHttpMethod2;
        HatchHttpMethod hatchHttpMethod3 = new HatchHttpMethod("PUT", 2);
        PUT = hatchHttpMethod3;
        HatchHttpMethod hatchHttpMethod4 = new HatchHttpMethod("DELETE", 3);
        DELETE = hatchHttpMethod4;
        HatchHttpMethod hatchHttpMethod5 = new HatchHttpMethod("PATCH", 4);
        PATCH = hatchHttpMethod5;
        HatchHttpMethod[] hatchHttpMethodArr = {hatchHttpMethod, hatchHttpMethod2, hatchHttpMethod3, hatchHttpMethod4, hatchHttpMethod5};
        $VALUES = hatchHttpMethodArr;
        $ENTRIES = C3cG.A0w(hatchHttpMethodArr);
    }

    public static Ey9<HatchHttpMethod> getEntries() {
        return $ENTRIES;
    }

    public static HatchHttpMethod valueOf(String str) {
        return (HatchHttpMethod) Enum.valueOf(HatchHttpMethod.class, str);
    }

    public static HatchHttpMethod[] values() {
        return (HatchHttpMethod[]) $VALUES.clone();
    }

    public HatchHttpMethod(String str, int i) {
    }
}
