package X;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.CoW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4170CoW {
    public final Map A00 = Collections.synchronizedMap(BV4.A11());
    public final Map A01 = Collections.synchronizedMap(BV4.A11());

    public static final void A00(Status status, C4170CoW c4170CoW, boolean z) {
        HashMap mapA0w;
        HashMap mapA0w2;
        Map map = c4170CoW.A00;
        synchronized (map) {
            mapA0w = BV4.A0w(map);
        }
        Map map2 = c4170CoW.A01;
        synchronized (map2) {
            mapA0w2 = BV4.A0w(map2);
        }
        Iterator itA0i = C3cG.A0i(mapA0w);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            if (z || AnonymousClass001.A1X(entryA0l.getValue())) {
                ((BasePendingResult) entryA0l.getKey()).A03(status);
            }
        }
        Iterator itA0i2 = C3cG.A0i(mapA0w2);
        while (itA0i2.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(itA0i2);
            if (z || AnonymousClass001.A1X(entryA0l2.getValue())) {
                ((CSE) entryA0l2.getKey()).A01(new ApiException(status));
            }
        }
    }
}
