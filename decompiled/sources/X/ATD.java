package X;

import com.facebook.aura.components.reactions.AuraReactionMotionKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class ATD extends ATG {
    public static float A01(float f) {
        return A03((f - 0.55f) / 0.45f, 0.0f, 1.0f);
    }

    public static float A02(float f, float f2) {
        return A03(f / f2, 0.0f, 1.0f);
    }

    public static final long A08(CUB cub, C07739il c07739il) {
        C7384Etj.A0Y(c07739il, 0);
        try {
            if (c07739il.isEmpty()) {
                throw C60O.A0i(AnonymousClass007.A0a("Cannot get random in empty range: ", c07739il));
            }
            long j = c07739il.A01;
            long j2 = c07739il.A00;
            return j < LinkEncryptedPairingKt.LINK_COUNTER_MAX ? cub.A08(j2, j + 1) : j2 > Long.MIN_VALUE ? cub.A08(j2 - 1, j) + 1 : cub.A06();
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends java.lang.Comparable<? super T>> T A09(T r1, T r2, T r3) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r1, r0)
            if (r2 == 0) goto L2f
            if (r3 == 0) goto L28
            int r0 = r2.compareTo(r3)
            if (r0 > 0) goto L15
            int r0 = r1.compareTo(r2)
            if (r0 >= 0) goto L31
            return r2
        L15:
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            java.lang.StringBuilder r1 = X.C3cG.A0f(r3, r0)
            java.lang.String r0 = " is less than minimum "
            r1.append(r0)
            r1.append(r2)
            java.lang.IllegalArgumentException r0 = X.C8j3.A0x(r1)
            throw r0
        L28:
            int r0 = r1.compareTo(r2)
            if (r0 >= 0) goto L38
            return r2
        L2f:
            if (r3 == 0) goto L38
        L31:
            int r0 = r1.compareTo(r3)
            if (r0 <= 0) goto L38
            return r3
        L38:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ATD.A09(java.lang.Comparable, java.lang.Comparable, java.lang.Comparable):java.lang.Comparable");
    }

    public static void A0D(C2av c2av, List list, float f) {
        float fKeyframe = AuraReactionMotionKt.keyframe(list, AuraReactionMotionKt.easeOut(A03(f, 0.0f, 1.0f)));
        c2av.AeX(fKeyframe);
        c2av.AeY(fKeyframe);
    }

    public static final double A00(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        StringBuilder sbA0x = C60O.A0x("Cannot coerce value to an empty range: maximum ");
        sbA0x.append(d3);
        sbA0x.append(" is less than minimum ");
        sbA0x.append(d2);
        throw C8j3.A0x(sbA0x);
    }

    public static final float A03(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException(FGI.A0P("Cannot coerce value to an empty range: maximum ", " is less than minimum ", '.', f3, f2));
    }

    public static final int A04(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException(FGI.A0Q("Cannot coerce value to an empty range: maximum ", " is less than minimum ", '.', i3, i2));
    }

    public static int A05(C1960Auz c1960Auz, int i) {
        int i2 = c1960Auz.A05;
        return A04(i, i2, c1960Auz.A04) - i2;
    }

    /* JADX WARN: Incorrect types in method signature: (ILX/AT1<Ljava/lang/Integer;>;)I */
    public static final int A06(AT1 at1, int i) {
        Comparable comparableAKt;
        if (at1 instanceof ATE) {
            comparableAKt = A0A(Integer.valueOf(i), (ATE) at1);
        } else {
            if (at1.isEmpty()) {
                throw C8j3.A0x(C3cG.A0f(at1, "Cannot coerce value to an empty range: "));
            }
            comparableAKt = at1.AKt();
            if (i >= AnonymousClass001.A0F(comparableAKt)) {
                comparableAKt = at1.AF8();
                if (i <= AnonymousClass001.A0F(comparableAKt)) {
                    return i;
                }
            }
        }
        return AnonymousClass001.A0F(comparableAKt);
    }

    public static final long A07(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        StringBuilder sbA0z = C60O.A0z("Cannot coerce value to an empty range: maximum ", j3);
        sbA0z.append(" is less than minimum ");
        sbA0z.append(j2);
        throw C8j3.A0x(sbA0z);
    }

    public static final C0968AJv A0B(C0968AJv c0968AJv, int i) {
        int i2 = c0968AJv.A00;
        int i3 = c0968AJv.A01;
        if (c0968AJv.A02 <= 0) {
            i = -i;
        }
        return new C0968AJv(i2, i3, i);
    }

    public static final ADq A0C(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? ADq.A00 : new ADq(i, i2 - 1);
    }

    public static final <T extends Comparable<? super T>> T A0A(T t, ATE<T> ate) {
        if (ate.isEmpty()) {
            throw C8j3.A0x(C3cG.A0f(ate, "Cannot coerce value to an empty range: "));
        }
        T tAKt = ate.AKt();
        if (AnonymousClass001.A02(t) > AnonymousClass001.A02(tAKt) || AnonymousClass001.A02(tAKt) <= AnonymousClass001.A02(t)) {
            tAKt = ate.AF8();
            if (AnonymousClass001.A02(tAKt) > AnonymousClass001.A02(t) || AnonymousClass001.A02(t) <= AnonymousClass001.A02(tAKt)) {
                return t;
            }
        }
        return tAKt;
    }
}
