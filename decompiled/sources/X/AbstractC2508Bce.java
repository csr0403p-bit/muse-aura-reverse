package X;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Bce, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2508Bce {
    public static final Map<Integer, Set<Integer>> A00;
    public static final Map<Integer, Set<Integer>> A01;
    public static final Map<String, Map<C2507Bcd, Integer>> A02;
    public static final Map<Integer, Integer> A03;
    public static final Map<Integer, Integer> A04;

    public static boolean A01(C2507Bcd c2507Bcd, AbstractC2509Bcf abstractC2509Bcf) {
        C2520Bcr c2520Bcr = (C2520Bcr) abstractC2509Bcf;
        int i = c2520Bcr.A00;
        Set set = (Set) BV5.A0f(A00, c2507Bcd.A00);
        if (set != null && C60Q.A1W(set, i)) {
            int i2 = c2520Bcr.A05;
            Set set2 = (Set) BV5.A0f(A01, c2507Bcd.A01);
            if (set2 != null && C60Q.A1W(set2, i2)) {
                return true;
            }
        }
        return false;
    }

    static {
        HashMap mapA0u = BV4.A0u();
        A00 = mapA0u;
        HashMap mapA0u2 = BV4.A0u();
        A01 = mapA0u2;
        HashMap mapA0u3 = BV4.A0u();
        A03 = mapA0u3;
        HashMap mapA0u4 = BV4.A0u();
        A04 = mapA0u4;
        HashMap mapA0u5 = BV4.A0u();
        A02 = mapA0u5;
        mapA0u.put(8, BV4.A0x(Collections.singletonList(8)));
        mapA0u.put(10, BV4.A0x(Collections.singletonList(10)));
        Integer numA0V = BV4.A0V();
        Integer numA0X = BV4.A0X();
        Integer numA0W = BV4.A0W();
        mapA0u.put(numA0V, BV5.A0v(new Integer[]{8, 10}));
        Integer numA0Y = BV4.A0Y();
        Integer numA0Z = BV4.A0Z();
        mapA0u2.put(numA0V, BV5.A0v(new Integer[]{numA0V, numA0W, numA0X, numA0Y, numA0Z}));
        A00(numA0V, numA0W, mapA0u2);
        mapA0u2.put(numA0X, BV5.A0v(new Integer[]{numA0W, numA0X, numA0Y, numA0Z}));
        A00(numA0W, numA0Y, mapA0u2);
        A00(numA0X, numA0Z, mapA0u2);
        A00(numA0Y, 5, mapA0u2);
        A00(numA0Z, 6, mapA0u2);
        mapA0u3.put(8, 8);
        mapA0u3.put(10, 10);
        mapA0u4.put(numA0V, numA0W);
        mapA0u4.put(numA0W, numA0Y);
        mapA0u4.put(numA0X, numA0Z);
        mapA0u4.put(numA0Y, 5);
        mapA0u4.put(numA0Z, 6);
        HashMap mapA0u6 = BV4.A0u();
        C2507Bcd c2507Bcd = C2507Bcd.A07;
        mapA0u6.put(c2507Bcd, numA0W);
        C2507Bcd c2507Bcd2 = C2507Bcd.A06;
        mapA0u6.put(c2507Bcd2, numA0X);
        C2507Bcd c2507Bcd3 = C2507Bcd.A04;
        mapA0u6.put(c2507Bcd3, 4096);
        C2507Bcd c2507Bcd4 = C2507Bcd.A05;
        mapA0u6.put(c2507Bcd4, 8192);
        HashMap mapA0u7 = BV4.A0u();
        mapA0u7.put(c2507Bcd, numA0W);
        mapA0u7.put(c2507Bcd2, numA0X);
        mapA0u7.put(c2507Bcd3, 4096);
        mapA0u7.put(c2507Bcd4, 8192);
        HashMap mapA0u8 = BV4.A0u();
        mapA0u8.put(c2507Bcd, numA0W);
        mapA0u8.put(c2507Bcd2, numA0Z);
        mapA0u8.put(c2507Bcd3, 4096);
        C8j4.A1O(c2507Bcd4, mapA0u8, 16384);
        HashMap mapA0u9 = BV4.A0u();
        C8j4.A1O(C2507Bcd.A02, mapA0u9, 256);
        C8j4.A1O(C2507Bcd.A03, mapA0u9, 512);
        mapA0u5.put("video/hevc", mapA0u6);
        mapA0u5.put("video/av01", mapA0u7);
        mapA0u5.put("video/x-vnd.on2.vp9", mapA0u8);
        mapA0u5.put("video/dolby-vision", mapA0u9);
    }

    public static void A00(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj2, new HashSet(Collections.singletonList(obj)));
    }
}
