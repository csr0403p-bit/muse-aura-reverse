package X;

import java.util.TreeMap;

/* renamed from: X.GnR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9997GnR {
    public static final EnumC9834GiY[] A04;
    public long A00;
    public C9997GnR A01;
    public TreeMap<Integer, Object> A02;
    public final Object[] A03 = new Object[16];

    static {
        EnumC9834GiY[] enumC9834GiYArr = new EnumC9834GiY[16];
        A04 = enumC9834GiYArr;
        EnumC9834GiY[] enumC9834GiYArrValues = EnumC9834GiY.values();
        System.arraycopy(enumC9834GiYArrValues, 1, enumC9834GiYArr, 1, Math.min(15, enumC9834GiYArrValues.length - 1));
    }

    private final void A00(int i, Object obj, Object obj2) {
        TreeMap<Integer, Object> treeMap = this.A02;
        if (treeMap == null) {
            treeMap = new TreeMap<>();
            this.A02 = treeMap;
        }
        if (obj != null) {
            BV6.A1E(obj, treeMap, i + i + 1);
        }
        if (obj2 != null) {
            BV6.A1E(obj2, this.A02, i + i);
        }
    }

    public final C9997GnR A01(EnumC9834GiY enumC9834GiY, int i) {
        if (i < 16) {
            long jOrdinal = enumC9834GiY.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.A00 |= jOrdinal;
            return null;
        }
        C9997GnR c9997GnR = new C9997GnR();
        this.A01 = c9997GnR;
        c9997GnR.A00 |= enumC9834GiY.ordinal();
        return c9997GnR;
    }

    public final C9997GnR A02(EnumC9834GiY enumC9834GiY, Object obj, int i) {
        if (i >= 16) {
            C9997GnR c9997GnR = new C9997GnR();
            this.A01 = c9997GnR;
            c9997GnR.A03[0] = obj;
            c9997GnR.A00 = enumC9834GiY.ordinal() | c9997GnR.A00;
            return c9997GnR;
        }
        this.A03[i] = obj;
        long jOrdinal = enumC9834GiY.ordinal();
        if (i > 0) {
            jOrdinal <<= i << 2;
        }
        this.A00 = jOrdinal | this.A00;
        return null;
    }

    public final C9997GnR A03(EnumC9834GiY enumC9834GiY, Object obj, Object obj2, int i) {
        if (i >= 16) {
            C9997GnR c9997GnR = new C9997GnR();
            this.A01 = c9997GnR;
            c9997GnR.A00 = enumC9834GiY.ordinal() | c9997GnR.A00;
            c9997GnR.A00(0, obj, obj2);
            return this.A01;
        }
        long jOrdinal = enumC9834GiY.ordinal();
        if (i > 0) {
            jOrdinal <<= i << 2;
        }
        this.A00 = jOrdinal | this.A00;
        A00(i, obj, obj2);
        return null;
    }

    public final C9997GnR A04(EnumC9834GiY enumC9834GiY, Object obj, Object obj2, Object obj3, int i) {
        if (i >= 16) {
            C9997GnR c9997GnR = new C9997GnR();
            this.A01 = c9997GnR;
            c9997GnR.A03[0] = obj;
            c9997GnR.A00 = enumC9834GiY.ordinal() | c9997GnR.A00;
            c9997GnR.A00(0, obj2, obj3);
            return this.A01;
        }
        this.A03[i] = obj;
        long jOrdinal = enumC9834GiY.ordinal();
        if (i > 0) {
            jOrdinal <<= i << 2;
        }
        this.A00 = jOrdinal | this.A00;
        A00(i, obj2, obj3);
        return null;
    }
}
