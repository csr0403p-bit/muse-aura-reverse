package X;

/* loaded from: classes6.dex */
public abstract class GPQ {
    public static final GPX A00(GPR gpr, String str) {
        String str2;
        String str3;
        Integer numA0r;
        int iIntValue;
        C7384Etj.A0Y(gpr, 0);
        HoX hoX = gpr.A02;
        if (hoX != null && (str2 = hoX.A01) != null && !C7BY.A0j(str2) && (str3 = hoX.A00) != null && (numA0r = C9tI.A0r(str3)) != null && (iIntValue = numA0r.intValue()) >= 0) {
            long j = iIntValue * 10000;
            String str4 = hoX.A02;
            if (str4 != null && !C7BY.A0j(str4)) {
                return new GPX(null, new C10574Huh(iIntValue, str2), gpr.A00, new C10606Hye(new Hm8(gpr.A05, gpr.A06), gpr.A04, gpr.A03, str4, str2, str, C0881AGi.A00, j));
            }
        }
        return null;
    }
}
