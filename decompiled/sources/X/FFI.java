package X;

import java.util.List;

/* loaded from: classes6.dex */
public abstract class FFI {
    public static final void A01(FBB fbb, String str, Throwable th) {
        Object ffk;
        if (th instanceof FFJ) {
            ffk = th;
        } else {
            ffk = new FFK(str, fbb != null ? FBB.A02(fbb) : null, th);
        }
        FFJ ffj = (FFJ) ffk;
        C7384Etj.A0Y(ffj, 1);
        ffj.AHF();
        List<String> listACv = ffj.ACv();
        if (listACv != null) {
            listACv.toArray(new String[0]);
        }
        ffj.AFP();
        ffj.AHu();
        Hx0.A00();
    }

    public static final void A04(Throwable th) {
        A01(null, "", th);
    }

    public static void A02(String str, int i) {
        A01(null, FGI.A0H(str, i), null);
    }

    public static void A03(String str, String str2) {
        A01(null, FGI.A0M(str, str2), null);
    }

    public static final void A00(FBB fbb, String str, Throwable th) {
        A01(fbb, str, th);
    }
}
