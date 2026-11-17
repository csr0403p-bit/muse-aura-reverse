package X;

import android.os.Bundle;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* renamed from: X.9jF, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9jF implements C9j4, InterfaceC07829iw {
    public static String A01(A5Y a5y, Object obj) {
        C7384Etj.A0Y(obj, 0);
        String str = a5y.A00;
        C7384Etj.A0Y(str, 1);
        return str;
    }

    @Override // X.C9j4
    public final InterfaceC07829iw A8S(C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9iZ, 0);
        return A8R(c9iZ.AF3(i));
    }

    @Override // X.C9j4
    public final Object A8Z(C9jG c9jG, C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9jG, 2);
        if (c9jG.getDescriptor().AOo() || A8Y()) {
            return A8b(c9jG);
        }
        return null;
    }

    @Override // X.C9j4
    public Object A8a(C9jG c9jG, C9iZ c9iZ, int i) {
        C7384Etj.A0Y(c9jG, 2);
        return A8b(c9jG);
    }

    @Override // X.C9j4
    public void AAd(C9iZ c9iZ) {
    }

    public static int A00(Object obj) {
        A5Y a5y = (A5Y) obj;
        Bundle bundle = a5y.A02;
        C7384Etj.A0Y(bundle, 0);
        String str = a5y.A00;
        C7384Etj.A0Y(str, 1);
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        A5q.A00(str);
        throw F60.createAndThrow();
    }

    public static void A03(String str, String str2, C9sS c9sS) {
        c9sS.A0N(FGI.A0N(str, str2, '\''), "", c9sS.A00);
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC07829iw
    public C9j4 A55(C9iZ c9iZ) {
        if (!(this instanceof A5Y)) {
            return this;
        }
        A5Y a5y = (A5Y) this;
        if (C3cH.A1Q(a5y.A00)) {
            return a5y;
        }
        Bundle bundle = a5y.A02;
        String strA01 = A01(a5y, bundle);
        Bundle bundle2 = bundle.getBundle(strA01);
        if (bundle2 != null) {
            return new A5Y(bundle2, a5y.A03);
        }
        A5q.A00(strA01);
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC07829iw
    public boolean A8F() {
        if (this instanceof A5Y) {
            A5Y a5y = (A5Y) this;
            Bundle bundle = a5y.A02;
            C7384Etj.A0Y(bundle, 0);
            String str = a5y.A00;
            C7384Etj.A0Y(str, 1);
            boolean z = bundle.getBoolean(str, false);
            if (z || !bundle.getBoolean(str, true)) {
                return z;
            }
            A5q.A00(str);
        } else {
            A02();
        }
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC07829iw
    public final byte A8H() {
        if (this instanceof C9sP) {
            C9sS c9sS = ((C9sP) this).A04;
            long jA09 = c9sS.A09();
            byte b = (byte) jA09;
            if (jA09 == b) {
                return b;
            }
            c9sS.A0N(C8j3.A16(C60O.A0z("Failed to parse byte for input '", jA09), '\''), "", c9sS.A00);
        } else {
            if (this instanceof C9sY) {
                C9sS c9sS2 = ((C9sY) this).A00;
                String strA0C = c9sS2.A0C();
                try {
                    C7384Etj.A0Y(strA0C, 0);
                    FKC fkcA02 = C9sY.A02(strA0C);
                    if (fkcA02 != null) {
                        int i = fkcA02.A00;
                        if (AbstractC7532Ezu.A00(i ^ Integer.MIN_VALUE, -2147483393) <= 0) {
                            return (byte) i;
                        }
                    }
                    C9tI.A0u(strA0C);
                    throw F60.createAndThrow();
                } catch (IllegalArgumentException unused) {
                    A03("Failed to parse type 'UByte' for input '", strA0C, c9sS2);
                    throw F60.createAndThrow();
                }
            }
            if (this instanceof A5Y) {
                return (byte) A00(this);
            }
            A02();
        }
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC07829iw
    public final char A8J() {
        if (this instanceof C9sP) {
            C9sS c9sS = ((C9sP) this).A04;
            String strA0C = c9sS.A0C();
            if (strA0C.length() == 1) {
                return strA0C.charAt(0);
            }
            A03("Expected single char, but got '", strA0C, c9sS);
        } else if (this instanceof A5Y) {
            A5Y a5y = (A5Y) this;
            Bundle bundle = a5y.A02;
            String strA01 = A01(a5y, bundle);
            char c = bundle.getChar(strA01, (char) 0);
            if (c != 0 || bundle.getChar(strA01, '\uffff') != '\uffff') {
                return c;
            }
            A5q.A00(strA01);
        } else {
            A02();
        }
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC07829iw
    public final double A8L() throws NumberFormatException {
        double d;
        if (this instanceof C9sP) {
            C9sP c9sP = (C9sP) this;
            C9sS c9sS = c9sP.A04;
            String strA0C = c9sS.A0C();
            try {
                d = Double.parseDouble(strA0C);
                if (!c9sP.A02.A00.A04 && Math.abs(d) > Double.MAX_VALUE) {
                    c9sS.A0N(AnonymousClass001.A0v(". By default, non-finite floating point values are prohibited because they do not conform JSON specification", C3cG.A0f(Double.valueOf(d), "Unexpected special floating-point value ")), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", c9sS.A00);
                    throw F60.createAndThrow();
                }
                return d;
            } catch (IllegalArgumentException unused) {
                A03("Failed to parse type 'double' for input '", strA0C, c9sS);
                throw F60.createAndThrow();
            }
        }
        if (this instanceof A5Y) {
            A5Y a5y = (A5Y) this;
            Bundle bundle = a5y.A02;
            String strA01 = A01(a5y, bundle);
            d = bundle.getDouble(strA01, Double.MIN_VALUE);
            if (d == Double.MIN_VALUE && bundle.getDouble(strA01, Double.MAX_VALUE) == Double.MAX_VALUE) {
                A5q.A00(strA01);
            }
            return d;
        }
        A02();
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC07829iw
    public int A8O(C9iZ c9iZ) {
        if (this instanceof A5Y) {
            return A00(this);
        }
        A02();
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC07829iw
    public float A8P() {
        if (this instanceof A5Y) {
            A5Y a5y = (A5Y) this;
            Bundle bundle = a5y.A02;
            String strA01 = A01(a5y, bundle);
            float f = bundle.getFloat(strA01, Float.MIN_VALUE);
            if (f != Float.MIN_VALUE || bundle.getFloat(strA01, Float.MAX_VALUE) != Float.MAX_VALUE) {
                return f;
            }
            A5q.A00(strA01);
        } else {
            A02();
        }
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC07829iw
    public final InterfaceC07829iw A8R(C9iZ c9iZ) {
        if (!(this instanceof C9sP)) {
            return this;
        }
        C9sP c9sP = (C9sP) this;
        C7384Etj.A0Y(c9iZ, 0);
        Set<C9iZ> set = C9oB.A00;
        if (!c9iZ.isInline() || !C9oB.A00.contains(c9iZ)) {
            return c9sP;
        }
        return new C9sY(c9sP.A02, c9sP.A04);
    }

    @Override // X.InterfaceC07829iw
    public int A8T() {
        if (!(this instanceof C9sY)) {
            if (this instanceof A5Y) {
                return A00(this);
            }
            A02();
            throw F60.createAndThrow();
        }
        C9sS c9sS = ((C9sY) this).A00;
        String strA0C = c9sS.A0C();
        try {
            C7384Etj.A0Y(strA0C, 0);
            FKC fkcA02 = C9sY.A02(strA0C);
            if (fkcA02 != null) {
                return fkcA02.A00;
            }
            C9tI.A0u(strA0C);
            throw F60.createAndThrow();
        } catch (IllegalArgumentException unused) {
            A03("Failed to parse type 'UInt' for input '", strA0C, c9sS);
            throw F60.createAndThrow();
        }
    }

    @Override // X.InterfaceC07829iw
    public long A8W() {
        if (this instanceof C9sY) {
            C9sS c9sS = ((C9sY) this).A00;
            String strA0C = c9sS.A0C();
            try {
                C7384Etj.A0Y(strA0C, 0);
                C9314GDq c9314GDqA00 = AbstractC08159sy.A00(strA0C);
                if (c9314GDqA00 != null) {
                    return c9314GDqA00.A00;
                }
                C9tI.A0u(strA0C);
                throw F60.createAndThrow();
            } catch (IllegalArgumentException unused) {
                A03("Failed to parse type 'ULong' for input '", strA0C, c9sS);
                throw F60.createAndThrow();
            }
        }
        if (this instanceof A5Y) {
            A5Y a5y = (A5Y) this;
            Bundle bundle = a5y.A02;
            String strA01 = A01(a5y, bundle);
            long j = bundle.getLong(strA01, Long.MIN_VALUE);
            if (j != Long.MIN_VALUE || bundle.getLong(strA01, LinkEncryptedPairingKt.LINK_COUNTER_MAX) != LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                return j;
            }
            A5q.A00(strA01);
        } else {
            A02();
        }
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC07829iw
    public boolean A8Y() {
        if (!(this instanceof A5Y)) {
            return true;
        }
        A5Y a5y = (A5Y) this;
        Bundle bundle = a5y.A02;
        C7384Etj.A0Y(bundle, 0);
        String str = a5y.A00;
        C7384Etj.A0Y(str, 1);
        return !(bundle.containsKey(str) && bundle.get(str) == null);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0101  */
    @Override // X.InterfaceC07829iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ java.lang.Object A8b(X.C9jG r5) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9jF.A8b(X.9jG):java.lang.Object");
    }

    @Override // X.InterfaceC07829iw
    public final short A8c() {
        if (this instanceof C9sP) {
            C9sS c9sS = ((C9sP) this).A04;
            long jA09 = c9sS.A09();
            short s = (short) jA09;
            if (jA09 == s) {
                return s;
            }
            c9sS.A0N(C8j3.A16(C60O.A0z("Failed to parse short for input '", jA09), '\''), "", c9sS.A00);
        } else {
            if (this instanceof C9sY) {
                C9sS c9sS2 = ((C9sY) this).A00;
                String strA0C = c9sS2.A0C();
                try {
                    C7384Etj.A0Y(strA0C, 0);
                    FKC fkcA02 = C9sY.A02(strA0C);
                    if (fkcA02 != null) {
                        int i = fkcA02.A00;
                        if (AbstractC7532Ezu.A00(i ^ Integer.MIN_VALUE, -2147418113) <= 0) {
                            return (short) i;
                        }
                    }
                    C9tI.A0u(strA0C);
                    throw F60.createAndThrow();
                } catch (IllegalArgumentException unused) {
                    A03("Failed to parse type 'UShort' for input '", strA0C, c9sS2);
                    throw F60.createAndThrow();
                }
            }
            if (this instanceof A5Y) {
                return (short) A00(this);
            }
            A02();
        }
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC07829iw
    public String A8e() {
        if (this instanceof A5Y) {
            A5Y a5y = (A5Y) this;
            Bundle bundle = a5y.A02;
            String strA01 = A01(a5y, bundle);
            String string = bundle.getString(strA01);
            if (string != null) {
                return string;
            }
            A5q.A00(strA01);
        } else {
            A02();
        }
        throw F60.createAndThrow();
    }

    private final void A02() {
        StringBuilder sbA0w = C60O.A0w();
        C8j5.A0o(sbA0w, this);
        throw new SerializationException(AnonymousClass001.A0v(" can't retrieve untyped values", sbA0w));
    }

    @Override // X.C9j4
    public final boolean A8G(C9iZ c9iZ, int i) {
        return A8F();
    }

    @Override // X.C9j4
    public final byte A8I(C9iZ c9iZ, int i) {
        return A8H();
    }

    @Override // X.C9j4
    public final char A8K(C9iZ c9iZ, int i) {
        return A8J();
    }

    @Override // X.C9j4
    public final double A8M(C9iZ c9iZ, int i) {
        return A8L();
    }

    @Override // X.C9j4
    public final float A8Q(C9iZ c9iZ, int i) {
        return A8P();
    }

    @Override // X.C9j4
    public final int A8U(C9iZ c9iZ, int i) {
        return A8T();
    }

    @Override // X.C9j4
    public final long A8X(C9iZ c9iZ, int i) {
        return A8W();
    }

    @Override // X.C9j4
    public final short A8d(C9iZ c9iZ, int i) {
        return A8c();
    }

    @Override // X.C9j4
    public final String A8f(C9iZ c9iZ, int i) {
        return A8e();
    }
}
