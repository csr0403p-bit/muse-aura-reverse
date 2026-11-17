package com.facebook.tigon.tigonhuc;

import X.AbstractC3609CXj;
import X.AbstractC3612CXn;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C3610CXl;
import X.C3611CXm;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonErrorCode;
import com.facebook.tigon.iface.TigonRequest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class TigonHucCallbackForwarder {
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native void onBodyNative(byte[] bArr, int i);

    private final native void onEOMNative();

    private final native void onErrorNative(byte[] bArr, int i);

    private final native void onResponseNative(int i, byte[] bArr, int i2);

    private final native void onStartedNative(byte[] bArr, int i);

    private final native void onUploadProgressNative(long j, long j2);

    public final synchronized void onBody(byte[] bArr, int i) {
        C7384Etj.A0Y(bArr, 0);
        onBodyNative(bArr, i);
    }

    public final synchronized void onEOM() {
        onEOMNative();
    }

    public final synchronized void onError(int i, String str, int i2, String str2) {
        AnonymousClass002.A1B(str, 1, str2);
        TigonError tigonError = new TigonError(TigonErrorCode.A00.fromValue(i), str, str2, i2);
        C3610CXl c3610CXl = new C3610CXl();
        c3610CXl.A01 = new byte[1024];
        C3611CXm c3611CXm = AbstractC3609CXj.A00;
        TigonErrorCode tigonErrorCode = tigonError.category;
        C7384Etj.A0Y(tigonErrorCode, 1);
        C3611CXm.A02(c3610CXl, tigonErrorCode.value);
        c3611CXm.A05(c3610CXl, tigonError.A02);
        C3611CXm.A02(c3610CXl, tigonError.A00);
        c3611CXm.A05(c3610CXl, tigonError.A01);
        onErrorNative(c3610CXl.A01, c3610CXl.A00);
    }

    public final synchronized void onResponse(int i, Map<String, ? extends List<String>> map) {
        C7384Etj.A0Y(map, 1);
        C3610CXl c3610CXl = new C3610CXl();
        c3610CXl.A01 = new byte[1024];
        C3611CXm c3611CXm = AbstractC3609CXj.A00;
        C3611CXm.A02(c3610CXl, map.size());
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            List list = (List) entryA0l.getValue();
            c3611CXm.A05(c3610CXl, strA0t);
            C7384Etj.A0Y(list, 1);
            C3611CXm.A02(c3610CXl, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c3611CXm.A05(c3610CXl, AnonymousClass005.A0j(it));
            }
        }
        onResponseNative(i, c3610CXl.A01, c3610CXl.A00);
    }

    public final synchronized void onStarted(TigonRequest tigonRequest) {
        C7384Etj.A0Y(tigonRequest, 0);
        C3610CXl c3610CXl = new C3610CXl();
        c3610CXl.A01 = new byte[1024];
        AbstractC3612CXn.A00(c3610CXl, tigonRequest);
        onStartedNative(c3610CXl.A01, c3610CXl.A00);
    }

    public final synchronized void onUploadProgress(long j, long j2) {
        onUploadProgressNative(j, j2);
    }

    static {
        ETi.loadLibrary("tigonhuc");
    }

    public TigonHucCallbackForwarder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
