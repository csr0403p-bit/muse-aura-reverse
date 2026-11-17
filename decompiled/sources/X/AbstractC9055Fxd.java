package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Fxd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9055Fxd {
    public static final Map<Integer, Integer> A00;
    public static final Map<Integer, Integer> A01;
    public static final Map<Integer, Integer> A02;
    public static final Map<Integer, Integer> A03;
    public static final Map<Integer, Integer> A04;
    public static final Map<Integer, Integer> A05;
    public static final Map<Integer, Integer> A06;
    public static final Map<Integer, Integer> A07;
    public static final Map<Integer, Integer> A08;
    public static final Map<Integer, Integer> A09;
    public static final Map<Integer, Integer> A0A;
    public static final Map<Integer, Integer> A0B;
    public static final Map<Integer, Integer> A0C;
    public static final Map<Integer, Integer> A0D;
    public static final Map<Integer, Integer> A0E;
    public static final Map<Integer, Integer> A0F;
    public static final Map<Integer, Integer> A0G;
    public static final Map<Integer, Integer> A0H;
    public static final Map<Integer, Integer> A0I;
    public static final Map<Integer, Integer> A0J;
    public static final Map<Integer, Integer> A0K;
    public static final Map<Integer, Integer> A0L;
    public static final Map<Integer, Integer> A0M;
    public static final Map<Integer, Integer> A0N;
    public static final Map<Integer, Integer> A0O;
    public static final Map<Integer, Integer> A0P;
    public static final Map<Integer, Integer> A0Q;
    public static final Map<Integer, Integer> A0R;
    public static final Map<Integer, Integer> A0S;
    public static final Map<Integer, Integer> A0T;
    public static final Map<Integer, Integer> A0U;
    public static final Map<Integer, Integer> A0V;
    public static final Map<Integer, Integer> A0W;
    public static final Map<Integer, Integer> A0X;
    public static final Map<Integer, Integer> A0Y;
    public static final Map<Integer, Integer> A0Z;
    public static final Map<Integer, Integer> A0a;
    public static final Map<Integer, Integer> A0b;
    public static final Map<Integer, Integer> A0c;
    public static final Map<Integer, Integer> A0d;
    public static final Map<Integer, Integer> A0e;
    public static final Map<Integer, Integer> A0f;
    public static final Map<Integer, Integer> A0g;
    public static final Map<Integer, Integer> A0h;
    public static final Map<Integer, Integer> A0i;
    public static final Map<Integer, Integer> A0j;

    static {
        HxE hxEA00 = HxE.A00(5);
        Integer numA0V = BV4.A0V();
        Integer numA0W = BV4.A0W();
        HxE hxEA002 = HxE.A00(numA0W);
        Integer numA0X = BV4.A0X();
        HxE hxEA003 = HxE.A00(numA0X);
        Integer numA0Y = BV4.A0Y();
        HxE hxEA004 = HxE.A00(numA0Y);
        Integer numA0Z = BV4.A0Z();
        Map<Integer, Integer> mapA0D = AGH.A0D(hxEA00, hxEA002, hxEA003, hxEA004, HxE.A00(numA0Z), HxE.A00(6));
        A0Q = mapA0D;
        A04 = A00(mapA0D);
        Map<Integer, Integer> mapA02 = A02(numA0W, numA0X, numA0Y, numA0Z);
        A0N = mapA02;
        A01 = A00(mapA02);
        HxE[] hxEArr = new HxE[61];
        System.arraycopy(new HxE[]{C3cG.A0r(numA0V, 58), C3cG.A0r(numA0X, numA0W), C3cG.A0r(numA0Z, numA0X), C3cG.A0r(5, numA0Y), C3cG.A0r(8, numA0Z), C3cG.A0r(9, 5), C3cG.A0r(10, 6), C3cG.A0r(11, 7), C3cG.A0r(13, 8), C3cG.A0r(14, 9), C3cG.A0r(16, 10), C3cG.A0r(25, 60), C3cG.A0r(26, 11), C3cG.A0r(27, 12), C3cG.A0r(28, 13), C3cG.A0r(29, 14), C3cG.A0r(31, 15), C3cG.A0r(32, 16), C3cG.A0r(33, 17), C3cG.A0r(34, 18), C3cG.A0r(35, 19), C3cG.A0r(36, 20), C3cG.A0r(37, 21), C3cG.A0r(38, 22), C3cG.A0r(39, 23), C3cG.A0r(44, 24), C3cG.A0r(46, 25)}, 0, hxEArr, 0, 27);
        System.arraycopy(new HxE[]{C3cG.A0r(47, 26), C3cG.A0r(48, 27), C3cG.A0r(50, 28), C3cG.A0r(51, 29), C3cG.A0r(52, 30), C3cG.A0r(53, 31), C3cG.A0r(54, 61), C3cG.A0r(55, 32), C3cG.A0r(56, 33), C3cG.A0r(57, 34), C3cG.A0r(58, 35), C3cG.A0r(59, 36), C3cG.A0r(60, 37), C3cG.A0r(61, 38), C3cG.A0r(62, 39), C3cG.A0r(63, 40), C3cG.A0r(64, 41), C3cG.A0r(65, 42), C3cG.A0r(66, 43), C60Q.A0y(44, 68), C60Q.A0y(59, 69), C3cG.A0r(70, 45), C60Q.A0y(46, 71), C60Q.A0y(47, 72), C60Q.A0y(48, 73), C3cG.A0r(74, 49), C60Q.A0y(50, 75)}, 0, hxEArr, 27, 27);
        System.arraycopy(new HxE[]{C60Q.A0y(51, 76), C60Q.A0y(52, 78), C60Q.A0y(53, 79), C60Q.A0y(54, 80), C60Q.A0y(55, 81), C60Q.A0y(56, 82), C60Q.A0y(57, 83)}, 0, hxEArr, 54, 7);
        Map<Integer, Integer> mapA0D2 = AGH.A0D(hxEArr);
        A0U = mapA0D2;
        A09 = A00(mapA0D2);
        Map<Integer, Integer> mapA022 = A02(numA0W, numA0X, numA0Y, numA0Z);
        A0V = mapA022;
        A0B = A00(mapA022);
        Map<Integer, Integer> mapA16 = AbstractC7608F5v.A16(HxE.A00(numA0W), HxE.A00(numA0X), HxE.A00(numA0Y), HxE.A00(numA0Z), HxE.A00(5));
        A0d = mapA16;
        A0J = A00(mapA16);
        Map<Integer, Integer> mapA01 = A01(numA0W, numA0X, numA0Y);
        A0W = mapA01;
        A0C = A00(mapA01);
        Map<Integer, Integer> mapA0D3 = AGH.A0D(HxE.A00(numA0W), HxE.A00(numA0X), HxE.A00(numA0Y), HxE.A00(numA0Z), HxE.A00(5), HxE.A00(6), HxE.A00(7), HxE.A00(8), HxE.A00(9), HxE.A00(10));
        A0P = mapA0D3;
        A03 = A00(mapA0D3);
        Map<Integer, Integer> mapA023 = A02(numA0W, numA0X, numA0Y, numA0Z);
        A0O = mapA023;
        A02 = A00(mapA023);
        Map<Integer, Integer> mapA024 = A02(numA0W, numA0X, numA0Y, numA0V);
        A0Y = mapA024;
        A0E = A00(mapA024);
        Map<Integer, Integer> mapA012 = A01(numA0W, numA0X, numA0Y);
        A0R = mapA012;
        A05 = A00(mapA012);
        Map<Integer, Integer> mapA0D4 = AGH.A0D(HxE.A00(numA0W), HxE.A00(numA0X));
        A0a = mapA0D4;
        A0G = A00(mapA0D4);
        Map<Integer, Integer> mapA013 = A01(numA0W, numA0X, numA0Y);
        A0b = mapA013;
        A0H = A00(mapA013);
        Map<Integer, Integer> mapA0D5 = AGH.A0D(HxE.A00(numA0W), HxE.A00(numA0X), HxE.A00(numA0Y), HxE.A00(numA0Z), HxE.A00(5), HxE.A00(6));
        A0M = mapA0D5;
        A0A = A00(mapA0D5);
        Map<Integer, Integer> mapA025 = A02(numA0W, numA0X, numA0Y, numA0Z);
        A0L = mapA025;
        A00 = A00(mapA025);
        Map<Integer, Integer> mapA0D6 = AGH.A0D(HxE.A00(numA0V), HxE.A00(numA0W), HxE.A00(numA0X), HxE.A00(numA0Y), HxE.A00(numA0Z), HxE.A00(5));
        A0h = mapA0D6;
        A07 = A00(mapA0D6);
        Map<Integer, Integer> mapA0D7 = AGH.A0D(HxE.A00(numA0W), HxE.A00(numA0X), HxE.A00(numA0Y), HxE.A00(numA0Z), HxE.A00(5), HxE.A00(6), HxE.A00(7));
        A0c = mapA0D7;
        A0I = A00(mapA0D7);
        HxE[] hxEArr2 = new HxE[67];
        System.arraycopy(new HxE[]{C3cG.A0r(numA0W, 26), C3cG.A0r(numA0X, 27), C3cG.A0r(numA0Y, 28), C3cG.A0r(numA0Z, numA0W), C3cG.A0r(5, 29), C3cG.A0r(6, numA0X), C3cG.A0r(7, numA0Y), C3cG.A0r(8, numA0Z), C3cG.A0r(9, 30), C3cG.A0r(10, 31), C3cG.A0r(11, 32), C3cG.A0r(12, 33), C3cG.A0r(13, 5), C3cG.A0r(14, 6), C3cG.A0r(15, 7), C3cG.A0r(16, 8), C3cG.A0r(17, 34), C3cG.A0r(18, 9), C3cG.A0r(19, 10), C3cG.A0r(20, 11), C3cG.A0r(21, 12), C3cG.A0r(22, 13), C3cG.A0r(23, 35), C3cG.A0r(24, 62), C3cG.A0r(25, 36), C3cG.A0r(26, 37), C3cG.A0r(27, 38)}, 0, hxEArr2, 0, 27);
        System.arraycopy(new HxE[]{C3cG.A0r(28, 39), C3cG.A0r(29, 40), C3cG.A0r(30, 41), C3cG.A0r(31, 42), C3cG.A0r(32, 43), C3cG.A0r(33, 44), C3cG.A0r(34, 45), C3cG.A0r(35, 46), C3cG.A0r(36, 47), C3cG.A0r(37, 48), C3cG.A0r(38, 64), C3cG.A0r(39, 67), C3cG.A0r(40, 14), C3cG.A0r(41, 49), C3cG.A0r(42, 50), C3cG.A0r(43, 51), C3cG.A0r(44, 66), C3cG.A0r(45, 15), C3cG.A0r(46, 16), C3cG.A0r(47, 17), C3cG.A0r(48, 52), C3cG.A0r(49, 53), C3cG.A0r(50, 54), C3cG.A0r(51, 55), C3cG.A0r(52, 18), C3cG.A0r(53, 19), C3cG.A0r(54, 20)}, 0, hxEArr2, 27, 27);
        System.arraycopy(new HxE[]{C3cG.A0r(55, 57), C3cG.A0r(56, 58), C3cG.A0r(57, 59), C3cG.A0r(58, 56), C3cG.A0r(59, 60), C3cG.A0r(60, 21), HxE.A00(61), C3cG.A0r(62, 22), C3cG.A0r(63, 23), C3cG.A0r(64, 24), C3cG.A0r(65, 63), C3cG.A0r(66, 25), C3cG.A0r(67, 65)}, 0, hxEArr2, 54, 13);
        Map<Integer, Integer> mapA0D8 = AGH.A0D(hxEArr2);
        A0T = mapA0D8;
        A08 = A00(mapA0D8);
        Map<Integer, Integer> mapA0D9 = AGH.A0D(HxE.A00(numA0V), HxE.A00(numA0W));
        A0K = mapA0D9;
        A0e = A00(mapA0D9);
        Map<Integer, Integer> mapA162 = AbstractC7608F5v.A16(C3cG.A0r(numA0X, numA0Y), HxE.A00(numA0W), C3cG.A0r(numA0Z, 5), C3cG.A0r(numA0Y, numA0Z), C3cG.A0r(5, 6));
        A0X = mapA162;
        A0D = A00(mapA162);
        Map<Integer, Integer> mapA014 = A01(numA0W, numA0X, numA0Y);
        A0Z = mapA014;
        Map<Integer, Integer> mapA0D10 = AGH.A0D(HxE.A00(numA0W), HxE.A00(numA0X), HxE.A00(numA0Y), HxE.A00(numA0Z), HxE.A00(5), HxE.A00(6), HxE.A00(7), HxE.A00(8), HxE.A00(9), HxE.A00(10), HxE.A00(11), HxE.A00(12), HxE.A00(13), HxE.A00(14));
        A0i = mapA0D10;
        A0f = A00(mapA0D10);
        Map<Integer, Integer> mapA0D11 = AGH.A0D(HxE.A00(numA0X), HxE.A00(7), HxE.A00(6), HxE.A00(9), HxE.A00(10), HxE.A00(11), HxE.A00(numA0Y), HxE.A00(8), HxE.A00(numA0Z), HxE.A00(numA0W), HxE.A00(12), HxE.A00(5));
        A0j = mapA0D11;
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put(numA0V, numA0V);
        c0924AIa.put(numA0W, numA0W);
        c0924AIa.put(numA0X, numA0X);
        c0924AIa.put(numA0Y, numA0Y);
        c0924AIa.put(numA0Z, numA0Z);
        c0924AIa.put(5, 5);
        c0924AIa.put(6, 6);
        c0924AIa.put(7, 7);
        c0924AIa.put(8, 8);
        if (HuT.A00(HxW.A00, 8) == 2) {
            c0924AIa.put(9, 9);
            c0924AIa.put(10, 10);
            c0924AIa.put(11, 11);
            c0924AIa.put(12, 12);
            c0924AIa.put(13, 13);
            c0924AIa.put(14, 14);
            c0924AIa.put(15, 15);
        }
        C0924AIa c0924AIaA0K = AIW.A0K(c0924AIa);
        A0S = c0924AIaA0K;
        A06 = A00(c0924AIaA0K);
        A0g = A00(mapA0D11);
        A0F = A00(mapA014);
    }

    public static Map A01(Object obj, Object obj2, Object obj3) {
        return AGH.A0D(new HxE(obj, obj), new HxE(obj2, obj2), new HxE(obj3, obj3));
    }

    public static Map A02(Object obj, Object obj2, Object obj3, Object obj4) {
        return AGH.A0D(new HxE(obj, obj), new HxE(obj2, obj2), new HxE(obj3, obj3), new HxE(obj4, obj4));
    }

    public static final Map<Integer, Integer> A00(Map<Integer, Integer> map) {
        Set<Map.Entry<Integer, Integer>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(setEntrySet));
        Iterator<Map.Entry<Integer, Integer>> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            C8j4.A1O(Integer.valueOf(AnonymousClass001.A0F(entryA0l.getValue())), linkedHashMapA15, AnonymousClass001.A0F(entryA0l.getKey()));
        }
        return linkedHashMapA15;
    }
}
