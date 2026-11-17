package X;

/* loaded from: classes6.dex */
public abstract class HwO {
    public static String A00(long j) {
        return A01(j, 10);
    }

    public static final String A01(long j, int i) {
        if (j >= 0) {
            String string = Long.toString(j, i);
            C7384Etj.A0U(string);
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        String string2 = Long.toString(j3, i);
        C7384Etj.A0U(string2);
        String string3 = Long.toString(j4, i);
        C7384Etj.A0U(string3);
        return FGI.A0M(string2, string3);
    }
}
