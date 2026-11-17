package X;

/* renamed from: X.9WA, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9WA {
    /* JADX WARN: Incorrect types in method signature: (LX/9WD;FFLX/9WB;LX/9W5;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;LX/BFM;I)V */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.BFM r21, X.C9W5 r22, X.C9WD r23, X.C9WB r24, X.G0U r25, X.G0U r26, X.G0U r27, float r28, float r29, int r30) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9WA.A02(X.BFM, X.9W5, X.9WD, X.9WB, X.G0U, X.G0U, X.G0U, float, float, int):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9Vd;LX/BRg;LX/9WB;LX/AYw;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;LX/BFM;II)V */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C1110AYw r30, X.BFM r31, X.BRg r32, X.C9Vd r33, X.C9WB r34, X.G0U r35, X.G0U r36, X.G0U r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9WA.A00(X.AYw, X.BFM, X.BRg, X.9Vd, X.9WB, X.G0U, X.G0U, X.G0U, int, int):void");
    }

    public static final void A01(InterfaceC05151eP interfaceC05151eP, BFM bfm, C9WB c9wb, int i) {
        bfm.AgG(-1700929473);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, interfaceC05151eP) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c9wb);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            BRg bRgA00 = AbstractC07539Wl.A00(C10G.A07(interfaceC05151eP.A4C(C2VU.A09, BRg.A00), c9wb.A06), "place_gallery_play_badge");
            boolean zA1N = AnonymousClass001.A1N(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new C2326BUa(c9wb, 21);
                bfm.Ai0(objAaT);
            }
            C0zJ.A00(bRgA00, (G0U) objAaT, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C9WE(interfaceC05151eP, c9wb, i);
        }
    }
}
