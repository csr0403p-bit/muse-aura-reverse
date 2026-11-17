package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AtE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1895AtE {
    public static final void A01(C1897AtH c1897AtH) {
        AuB auB = c1897AtH.A04;
        if (auB != null) {
            C1905AtQ c1905AtQ = c1897AtH.A0O;
            G0U<C1805ArO, Unit> g0u = c1897AtH.A0R;
            C1805ArO c1805ArO = c1905AtQ.A01;
            g0u.invoke(new C1805ArO(c1805ArO.A01, null, c1805ArO.A00));
            AmD amD = auB.A01;
            if (Bs8.A00(auB, null, amD.A01)) {
                amD.A00.AgT();
            }
        }
        c1897AtH.A04 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #0 {all -> 0x00af, blocks: (B:3:0x000c, B:5:0x0012, B:7:0x0016, B:9:0x001c, B:11:0x0028, B:14:0x0041, B:15:0x0044, B:17:0x0067, B:19:0x00a6, B:16:0x0063), top: B:25:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C1897AtH r12, X.InterfaceC2128Ayu r13, X.C1805ArO r14) {
        /*
            androidx.compose.runtime.snapshots.Snapshot r7 = androidx.compose.runtime.snapshots.Snapshot.A03()
            X.G0U r6 = X.C8j3.A1F(r7)
            androidx.compose.runtime.snapshots.Snapshot r5 = androidx.compose.runtime.snapshots.Snapshot.A04(r7)
            X.Atl r0 = X.C1897AtH.A00(r12)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lab
            X.AuB r4 = r12.A04     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto Lab
            X.Ak4 r8 = r12.A01()     // Catch: java.lang.Throwable -> Laf
            if (r8 == 0) goto Lab
            X.Atj r9 = r12.A01     // Catch: java.lang.Throwable -> Laf
            X.Aux r10 = r0.A02     // Catch: java.lang.Throwable -> Laf
            androidx.compose.runtime.MutableState r0 = r12.A0B     // Catch: java.lang.Throwable -> Laf
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lab
            long r0 = r14.A00     // Catch: java.lang.Throwable -> Laf
            int r0 = X.Au3.A01(r0)     // Catch: java.lang.Throwable -> Laf
            int r1 = r13.originalToTransformed(r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r0 = X.AbstractC1933Atw.A00     // Catch: java.lang.Throwable -> Laf
            int r0 = X.C1870Ask.A00(r10)     // Catch: java.lang.Throwable -> Laf
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 < r0) goto L63
            if (r1 == 0) goto L44
            int r1 = r1 + (-1)
            goto L63
        L44:
            X.Arm r11 = r9.A03     // Catch: java.lang.Throwable -> Laf
            X.AXN r10 = r9.A05     // Catch: java.lang.Throwable -> Laf
            X.2K7 r9 = r9.A04     // Catch: java.lang.Throwable -> Laf
            java.lang.String r1 = X.AbstractC1933Atw.A00     // Catch: java.lang.Throwable -> Laf
            r0 = 1
            long r0 = X.AbstractC1933Atw.A00(r11, r9, r10, r1, r0)     // Catch: java.lang.Throwable -> Laf
            X.BL4 r0 = X.BL4.A00(r0)     // Catch: java.lang.Throwable -> Laf
            long r0 = r0.A00     // Catch: java.lang.Throwable -> Laf
            long r0 = r0 & r2
            int r9 = (int) r0     // Catch: java.lang.Throwable -> Laf
            float r10 = (float) r9     // Catch: java.lang.Throwable -> Laf
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            X.AaC r9 = new X.AaC     // Catch: java.lang.Throwable -> Laf
            r9.<init>(r1, r1, r0, r10)     // Catch: java.lang.Throwable -> Laf
            goto L67
        L63:
            X.AaC r9 = r10.A05(r1)     // Catch: java.lang.Throwable -> Laf
        L67:
            float r11 = r9.A01     // Catch: java.lang.Throwable -> Laf
            float r10 = r9.A03     // Catch: java.lang.Throwable -> Laf
            long r13 = X.C8j3.A0P(r11)     // Catch: java.lang.Throwable -> Laf
            long r0 = X.C8j3.A0P(r10)     // Catch: java.lang.Throwable -> Laf
            r12 = 32
            long r13 = r13 << r12
            long r0 = r0 & r2
            long r0 = r0 | r13
            long r0 = r8.APo(r0)     // Catch: java.lang.Throwable -> Laf
            float r8 = X.AnonymousClass001.A00(r0)     // Catch: java.lang.Throwable -> Laf
            float r0 = X.AnonymousClass001.A01(r0, r2)     // Catch: java.lang.Throwable -> Laf
            long r2 = X.AnonymousClass005.A0L(r8, r0)     // Catch: java.lang.Throwable -> Laf
            float r1 = r9.A02     // Catch: java.lang.Throwable -> Laf
            float r1 = r1 - r11
            float r0 = r9.A00     // Catch: java.lang.Throwable -> Laf
            float r0 = r0 - r10
            long r0 = X.C8j5.A09(r1, r0)     // Catch: java.lang.Throwable -> Laf
            X.AaC r1 = X.C2J7.A00(r2, r0)     // Catch: java.lang.Throwable -> Laf
            X.AmD r0 = r4.A01     // Catch: java.lang.Throwable -> Laf
            java.util.concurrent.atomic.AtomicReference<X.AuB> r0 = r0.A01     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Laf
            X.AuB r0 = (X.AuB) r0     // Catch: java.lang.Throwable -> Laf
            boolean r0 = X.C7384Etj.areEqual(r0, r4)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lab
            X.Atm r0 = r4.A00     // Catch: java.lang.Throwable -> Laf
            r0.ARO(r1)     // Catch: java.lang.Throwable -> Laf
        Lab:
            androidx.compose.runtime.snapshots.Snapshot.A07(r7, r5, r6)
            return
        Laf:
            r0 = move-exception
            androidx.compose.runtime.snapshots.Snapshot.A07(r7, r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1895AtE.A02(X.AtH, X.Ayu, X.ArO):void");
    }

    public static final void A03(TextFieldSelectionManager textFieldSelectionManager, BFM bfm, int i) {
        C1897AtH c1897AtH;
        ApQ apQ;
        bfm.AgG(-1436003720);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, textFieldSelectionManager) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            C1897AtH c1897AtH2 = textFieldSelectionManager.A03;
            if (c1897AtH2 == null || !MutableState.A0A(c1897AtH2.A0H) || (c1897AtH = textFieldSelectionManager.A03) == null || (apQ = c1897AtH.A01.A02) == null || apQ.length() <= 0) {
                bfm.AgE(-2111042550);
            } else {
                boolean zA1Y = AnonymousClass001.A1Y(textFieldSelectionManager, bfm, -2112351432);
                Object objAaT = bfm.AaT();
                if (zA1Y || objAaT == C78N.A00) {
                    objAaT = new C1901AtL(textFieldSelectionManager);
                    BBI.A0T(bfm, objAaT);
                }
                AXN axnA04 = AKO.A04(Am0.A04, (BBI) bfm);
                int iOriginalToTransformed = textFieldSelectionManager.A0C.originalToTransformed((int) (C8j4.A0O(textFieldSelectionManager.A0S) >> 32));
                C1897AtH c1897AtH3 = textFieldSelectionManager.A03;
                C1924Atl c1924AtlA00 = c1897AtH3 != null ? C1897AtH.A00(c1897AtH3) : null;
                C7384Etj.A0X(c1924AtlA00);
                C1958Aux c1958Aux = c1924AtlA00.A02;
                AaC aaCA06 = c1958Aux.A06(ATD.A04(iOriginalToTransformed, 0, C1870Ask.A00(c1958Aux)));
                long jA0K = AnonymousClass005.A0K(aaCA06.A01 + (axnA04.Ah4(2.0f) / 2.0f), aaCA06.A00);
                boolean zA64 = bfm.A64(jA0K);
                Object objAaT2 = bfm.AaT();
                if (zA64 || objAaT2 == C78N.A00) {
                    objAaT2 = new C2141AzD(jA0K);
                    bfm.Ai0(objAaT2);
                }
                InterfaceC2267BNn interfaceC2267BNn = (InterfaceC2267BNn) objAaT2;
                BS0 bs0 = BRg.A00;
                boolean zA1M = AnonymousClass003.A1M(bfm, objAaT, textFieldSelectionManager);
                Object objAaT3 = bfm.AaT();
                if (zA1M || objAaT3 == C78N.A00) {
                    objAaT3 = new BSK(2, textFieldSelectionManager, objAaT);
                    bfm.Ai0(objAaT3);
                }
                BRg bRgA00 = AaM.A00(bs0, (PointerInputEventHandler) objAaT3, objAaT);
                boolean zA642 = bfm.A64(jA0K);
                Object objAaT4 = bfm.AaT();
                if (zA642 || objAaT4 == C78N.A00) {
                    objAaT4 = new C2286BSm(jA0K, 0);
                    bfm.Ai0(objAaT4);
                }
                BPb.A00(interfaceC2267BNn, bfm, AnonymousClass001.A0Y(bRgA00, objAaT4, false), 0, 4, 0L);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BT2(textFieldSelectionManager, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(final androidx.compose.foundation.text.selection.TextFieldSelectionManager r10, X.BFM r11, final int r12, final boolean r13) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1895AtE.A04(androidx.compose.foundation.text.selection.TextFieldSelectionManager, X.BFM, int, boolean):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A05(TextFieldSelectionManager textFieldSelectionManager, BFM bfm, BRg bRg, G0V g0v, int i) {
        bfm.AgG(2036174316);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, textFieldSelectionManager);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(true);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AbstractC1914Atb.A03(textFieldSelectionManager, bfm, g0v, (iA0d >> 3) & 126);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTR(bRg, textFieldSelectionManager, g0v, i, 1);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/ArO;LX/G0U<-LX/ArO;Lkotlin/Unit;>;LX/BRg;LX/Arm;LX/19h;LX/G0U<-LX/Aux;Lkotlin/Unit;>;LX/AWd;LX/1EQ;ZIILX/AuI;LX/BGr;ZZLX/G0W<-LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/AZ0;LX/BFM;III)V */
    /* JADX WARN: Removed duplicated region for block: B:247:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.InterfaceC1072AWd r74, X.C2257BGr r75, X.AZ0 r76, X.BFM r77, X.BRg r78, X.C1EQ r79, X.C1822Arm r80, X.AuI r81, final X.C1805ArO r82, X.C19h r83, final X.G0U r84, X.G0U r85, X.G0W r86, int r87, int r88, final int r89, final int r90, final int r91, boolean r92, boolean r93, boolean r94) {
        /*
            Method dump skipped, instructions count: 2488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1895AtE.A00(X.AWd, X.BGr, X.AZ0, X.BFM, X.BRg, X.1EQ, X.Arm, X.AuI, X.ArO, X.19h, X.G0U, X.G0U, X.G0W, int, int, int, int, int, boolean, boolean, boolean):void");
    }
}
