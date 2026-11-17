package X;

import java.time.Instant;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Fxq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9068Fxq {
    public static final Map<Integer, Set<Integer>> A04;
    public static final Set<Integer> A05;
    public static final Set<Integer> A06;
    public static final Set<Integer> A07;
    public static final Set<Integer> A08;
    public final int A00;
    public final int A01;
    public final Instant A02;
    public final Instant A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9068Fxq) {
                C9068Fxq c9068Fxq = (C9068Fxq) obj;
                if (!this.A03.equals(c9068Fxq.A03) || !this.A02.equals(c9068Fxq.A02) || this.A01 != c9068Fxq.A01 || this.A00 != c9068Fxq.A00) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Integer numA0V = BV4.A0V();
        A06 = BFI.A0H(new Integer[]{10, 36, numA0V});
        A05 = BFI.A0H(new Integer[]{38, 39, 44, 54, numA0V});
        Integer[] numArr = new Integer[42];
        System.arraycopy(new Integer[]{32, 33, 34, 35, 36, 37, 41, 42, 43, 48, 49, 50, 51, 63, 65}, BV5.A1U(new Integer[]{1, 2, 3, 4, 5, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 23, 25, 26, 28, 27, 29, 30, 31}, numArr) ? 1 : 0, numArr, 27, 15);
        Set<Integer> setA0H = BFI.A0H(numArr);
        A07 = setA0H;
        Set<Integer> setA0H2 = BFI.A0H(new Integer[]{55, 56, 58, 57, 59, 61});
        A08 = setA0H2;
        HxE hxEA00 = A00(8, 7);
        HxE hxEA0r = C3cG.A0r(9, Collections.singleton(8));
        HxE hxEA0r2 = C3cG.A0r(13, setA0H);
        HxE hxEA002 = A00(25, 21);
        HxE hxEA0r3 = C3cG.A0r(26, BFI.A0H(new Integer[]{67, 8, 40, 24}));
        HxE hxEA0r4 = C3cG.A0r(34, setA0H);
        HxE hxEA0r5 = C3cG.A0r(37, BFI.A0H(new Integer[]{64, 66}));
        HxE hxEA0r6 = C3cG.A0r(48, Collections.singleton(40));
        HxE hxEA003 = A00(54, 45);
        HxE hxEA0r7 = C3cG.A0r(56, BFI.A0H(new Integer[]{46, 64}));
        HxE hxEA004 = A00(57, 47);
        HxE hxEA0y = C60Q.A0y(setA0H, 70);
        HxE hxEA005 = A00(68, 52);
        HxE hxEA006 = A00(69, 53);
        AIY aiy = new AIY();
        C60Q.A1P(aiy, 60);
        aiy.addAll(setA0H2);
        HxE hxEA0r8 = C3cG.A0r(73, AIX.A00(aiy));
        AIY aiy2 = new AIY();
        C60Q.A1P(aiy2, 62);
        aiy2.addAll(setA0H2);
        A04 = AGH.A0D(hxEA00, hxEA0r, hxEA0r2, hxEA002, hxEA0r3, hxEA0r4, hxEA0r5, hxEA0r6, hxEA003, hxEA0r7, hxEA004, hxEA0y, hxEA005, hxEA006, hxEA0r8, C3cG.A0r(74, AIX.A00(aiy2)), C3cG.A0r(79, Collections.singleton(64)), C3cG.A0r(82, Collections.singleton(66)), C60Q.A0y(setA0H, 81), C3cG.A0r(83, Collections.singleton(67)));
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A03)) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ExerciseSegment(startTime=");
        AbstractC7608F5v.A1P(sbA0x, this.A03);
        sbA0x.append(this.A02);
        sbA0x.append(", segmentType=");
        sbA0x.append(this.A01);
        sbA0x.append(", repetitions=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public C9068Fxq(Instant instant, Instant instant2, int i, int i2) {
        this.A03 = instant;
        this.A02 = instant2;
        this.A01 = i;
        this.A00 = i2;
        if (!instant.isBefore(instant2)) {
            throw AbstractC7608F5v.A0d();
        }
        if (i2 < 0) {
            throw C60O.A0i("repetitions can not be negative.");
        }
    }

    public static HxE A00(Object obj, int i) {
        return new HxE(obj, Collections.singleton(Integer.valueOf(i)));
    }
}
