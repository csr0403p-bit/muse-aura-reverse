package com.facebook.nativeutil;

import X.AnonymousClass001;
import X.BV5;
import X.BV6;
import X.C01;
import X.C3463COl;
import X.C3cG;
import com.facebook.jni.HybridData;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class NativeList {
    public static final NativeList $redex_init_class = null;
    public HybridData mHybridData;

    private final native void addBoolean(boolean z);

    private final native void addDouble(double d);

    private final native void addInt(long j);

    private final native void addNativeList(NativeList nativeList);

    private final native void addNativeMap(NativeMap nativeMap);

    private final native void addNull();

    private final native void addString(String str);

    public static final native HybridData initHybridData();

    public final native List<Object> consumeList();

    static {
        C3463COl.loadLibrary("nativeutil-jni");
    }

    public NativeList(List<? extends Object> list) {
        this.mHybridData = initHybridData();
        if (list != null) {
            Iterator<? extends Object> it = list.iterator();
            while (it.hasNext()) {
                Object objA00 = C01.A00(it.next());
                if (objA00 == null) {
                    addNull();
                } else if (objA00 instanceof Boolean) {
                    addBoolean(AnonymousClass001.A1X(objA00));
                } else if ((objA00 instanceof Integer) || (objA00 instanceof Long) || (objA00 instanceof Short)) {
                    addInt(C3cG.A05(objA00));
                } else if (objA00 instanceof Number) {
                    addDouble(BV6.A00(objA00));
                } else if (objA00 instanceof String) {
                    addString((String) objA00);
                } else if (objA00 instanceof NativeMap) {
                    addNativeMap((NativeMap) objA00);
                } else {
                    if (!(objA00 instanceof NativeList)) {
                        throw BV5.A0O(objA00.getClass(), "Could not convert ");
                    }
                    addNativeList((NativeList) objA00);
                }
            }
        }
    }

    public NativeList(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
