package X;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Bcb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2505Bcb {
    public static final Map<Long, C2507Bcd> A00;
    public static final Map<C2507Bcd, List<Long>> A01;

    public static Long A00(DynamicRangeProfiles dynamicRangeProfiles, C2507Bcd c2507Bcd) {
        List<Long> listA0z = BV4.A0z(c2507Bcd, A01);
        if (listA0z == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : listA0z) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }

    static {
        HashMap mapA0u = BV4.A0u();
        A00 = mapA0u;
        HashMap mapA0u2 = BV4.A0u();
        A01 = mapA0u2;
        C2507Bcd c2507Bcd = C2507Bcd.A07;
        mapA0u.put(1L, c2507Bcd);
        mapA0u2.put(c2507Bcd, Collections.singletonList(1L));
        mapA0u.put(2L, C2507Bcd.A06);
        mapA0u2.put(mapA0u.get(2L), Collections.singletonList(2L));
        C2507Bcd c2507Bcd2 = C2507Bcd.A04;
        mapA0u.put(4L, c2507Bcd2);
        mapA0u2.put(c2507Bcd2, Collections.singletonList(4L));
        C2507Bcd c2507Bcd3 = C2507Bcd.A05;
        mapA0u.put(8L, c2507Bcd3);
        mapA0u2.put(c2507Bcd3, Collections.singletonList(8L));
        List<Long> listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator<Long> it = listAsList.iterator();
        while (it.hasNext()) {
            A00.put(it.next(), C2507Bcd.A02);
        }
        A01.put(C2507Bcd.A02, listAsList);
        List<Long> listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator<Long> it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            A00.put(it2.next(), C2507Bcd.A03);
        }
        A01.put(C2507Bcd.A03, listAsList2);
    }
}
