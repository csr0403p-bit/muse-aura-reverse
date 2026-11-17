package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* loaded from: classes5.dex */
public final class CMN {
    public static final ThreadLocal<CMM> A03 = new ThreadLocal<>();
    public final int A00;
    public final CPK A01;
    public volatile int A02 = 0;

    public static CMM A00(CMN cmn) {
        ThreadLocal<CMM> threadLocal = A03;
        CMM cmm = threadLocal.get();
        if (cmm == null) {
            cmm = new CMM();
            threadLocal.set(cmm);
        }
        cmn.A01.A08.A03(cmm, cmn.A00);
        return cmm;
    }

    public CMN(CPK cpk, int i) {
        this.A01 = cpk;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(super.toString());
        sbA0w.append(", id:");
        BV4.A1N(sbA0w, CLp.A00(A00(this)));
        sbA0w.append(", codepoints:");
        int iA01 = CLp.A01(A00(this), 16);
        for (int i = 0; i < iA01; i++) {
            BV4.A1N(sbA0w, A00(this).A03(i));
            sbA0w.append(InviteCodeScratcherKt.CODE_SEPARATOR);
        }
        return sbA0w.toString();
    }
}
