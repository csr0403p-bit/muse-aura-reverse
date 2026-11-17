package X;

import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* renamed from: X.Aso, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1874Aso {
    public static final C1Hj A00 = At6.A00;
    public static final long A01 = C16n.A00(40.0f, 40.0f);

    /* JADX WARN: Incorrect types in method signature: (LX/ArO;LX/G0U<-LX/ArO;Lkotlin/Unit;>;LX/BRg;ZZLX/Arm;LX/AuJ;LX/BGr;ZIILX/19h;LX/G0U<-LX/Aux;Lkotlin/Unit;>;LX/AWd;LX/1EQ;LX/G0W<-LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;III)V */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.InterfaceC1072AWd r38, X.C2257BGr r39, X.AuJ r40, X.BFM r41, X.BRg r42, X.C1EQ r43, X.C1822Arm r44, final X.C1805ArO r45, X.C19h r46, final X.G0U r47, X.G0U r48, X.G0W r49, int r50, int r51, final int r52, final int r53, final int r54, boolean r55, boolean r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1874Aso.A02(X.AWd, X.BGr, X.AuJ, X.BFM, X.BRg, X.1EQ, X.Arm, X.ArO, X.19h, X.G0U, X.G0U, X.G0W, int, int, int, int, int, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/G0U<-Ljava/lang/String;Lkotlin/Unit;>;LX/BRg;ZZLX/Arm;LX/AuJ;LX/BGr;ZIILX/19h;LX/G0U<-LX/Aux;Lkotlin/Unit;>;LX/AWd;LX/1EQ;LX/G0W<-LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;III)V */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.InterfaceC1072AWd r39, X.C2257BGr r40, X.AuJ r41, X.BFM r42, X.BRg r43, X.C1EQ r44, X.C1822Arm r45, X.C19h r46, final java.lang.String r47, final X.G0U r48, X.G0U r49, X.G0W r50, int r51, int r52, final int r53, final int r54, final int r55, boolean r56, boolean r57, boolean r58) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1874Aso.A03(X.AWd, X.BGr, X.AuJ, X.BFM, X.BRg, X.1EQ, X.Arm, X.19h, java.lang.String, X.G0U, X.G0U, X.G0W, int, int, int, int, int, boolean, boolean, boolean):void");
    }

    public static final void A04(TextFieldSelectionState textFieldSelectionState, BFM bfm, int i) {
        bfm.AgG(1991581797);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, textFieldSelectionState) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            boolean zA65 = bfm.A65(textFieldSelectionState);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = BBP.A0A(C2292BSs.A00(textFieldSelectionState, 43));
                BBI.A0T(bfm, objAaT);
            }
            if (C1BO.A0F((C1BO) objAaT)) {
                boolean zA1Z = AnonymousClass001.A1Z(textFieldSelectionState, bfm, 535437134);
                Object objAaT2 = bfm.AaT();
                if (zA1Z || objAaT2 == C78N.A00) {
                    objAaT2 = new C2275BSb(textFieldSelectionState, 0);
                    bfm.Ai0(objAaT2);
                }
                InterfaceC2267BNn interfaceC2267BNn = (InterfaceC2267BNn) objAaT2;
                BS0 bs0 = BRg.A00;
                boolean zA67 = bfm.A67(textFieldSelectionState);
                Object objAaT3 = bfm.AaT();
                if (zA67 || objAaT3 == C78N.A00) {
                    objAaT3 = new BSJ(textFieldSelectionState, 2);
                    bfm.Ai0(objAaT3);
                }
                BPb.A00(interfaceC2267BNn, bfm, AaM.A00(bs0, (PointerInputEventHandler) objAaT3, textFieldSelectionState), 384, 0, A01);
            } else {
                bfm.AgE(535820573);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BT2(textFieldSelectionState, i, 5);
        }
    }

    public static final void A05(TextFieldSelectionState textFieldSelectionState, BFM bfm, int i) {
        bfm.AgG(2025287684);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, textFieldSelectionState) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            boolean zA65 = bfm.A65(textFieldSelectionState);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = BBP.A0A(C2292BSs.A00(textFieldSelectionState, 44));
                BBI.A0T(bfm, objAaT);
            }
            C1878Ass c1878Ass = (C1878Ass) ((C1BO) objAaT).getValue();
            if (c1878Ass.A04) {
                boolean zA1Z = AnonymousClass001.A1Z(textFieldSelectionState, bfm, -354609545);
                Object objAaT2 = bfm.AaT();
                if (zA1Z || objAaT2 == C78N.A00) {
                    objAaT2 = new C2275BSb(textFieldSelectionState, 1);
                    bfm.Ai0(objAaT2);
                }
                InterfaceC2267BNn interfaceC2267BNn = (InterfaceC2267BNn) objAaT2;
                Integer num = c1878Ass.A02;
                boolean z = c1878Ass.A03;
                BS0 bs0 = BRg.A00;
                boolean zA67 = bfm.A67(textFieldSelectionState);
                Object objAaT3 = bfm.AaT();
                if (zA67 || objAaT3 == C78N.A00) {
                    objAaT3 = new BSJ(textFieldSelectionState, 3);
                    bfm.Ai0(objAaT3);
                }
                AWB.A02(interfaceC2267BNn, bfm, AaM.A00(bs0, (PointerInputEventHandler) objAaT3, textFieldSelectionState), num, c1878Ass.A00, 24624, 0, A01, true, z);
            } else {
                bfm.AgE(-353981826);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            boolean zA652 = bfm.A65(textFieldSelectionState);
            Object objAaT4 = bfm.AaT();
            if (zA652 || objAaT4 == C78N.A00) {
                objAaT4 = AbstractC1798ArH.A00(bbi, C2292BSs.A00(textFieldSelectionState, 45));
            }
            C1878Ass c1878Ass2 = (C1878Ass) ((C1BO) objAaT4).getValue();
            if (c1878Ass2.A04) {
                boolean zA1Z2 = AnonymousClass001.A1Z(textFieldSelectionState, bfm, -353488678);
                Object objAaT5 = bfm.AaT();
                if (zA1Z2 || objAaT5 == C78N.A00) {
                    objAaT5 = new C2275BSb(textFieldSelectionState, 2);
                    bfm.Ai0(objAaT5);
                }
                InterfaceC2267BNn interfaceC2267BNn2 = (InterfaceC2267BNn) objAaT5;
                Integer num2 = c1878Ass2.A02;
                boolean z2 = c1878Ass2.A03;
                BS0 bs02 = BRg.A00;
                boolean zA672 = bfm.A67(textFieldSelectionState);
                Object objAaT6 = bfm.AaT();
                if (zA672 || objAaT6 == C78N.A00) {
                    objAaT6 = new BSJ(textFieldSelectionState, 4);
                    bfm.Ai0(objAaT6);
                }
                AWB.A02(interfaceC2267BNn2, bfm, AaM.A00(bs02, (PointerInputEventHandler) objAaT6, textFieldSelectionState), num2, c1878Ass2.A00, 24624, 0, A01, false, z2);
            } else {
                bfm.AgE(-352863842);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BT2(textFieldSelectionState, i, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    /* JADX WARN: Type inference failed for: r0v63, types: [androidx.compose.runtime.MutableState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C1110AYw r52, X.InterfaceC1072AWd r53, X.AuJ r54, X.InterfaceC2143AzF r55, X.C1Hj r56, X.C1O2 r57, final X.C1890At8 r58, X.InterfaceC2154Azi r59, X.BFM r60, X.BRg r61, X.C1EQ r62, X.C1822Arm r63, X.G0V r64, final int r65, final int r66, final int r67, boolean r68, boolean r69, boolean r70) {
        /*
            Method dump skipped, instructions count: 1361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1874Aso.A00(X.AYw, X.AWd, X.AuJ, X.AzF, X.1Hj, X.1O2, X.At8, X.Azi, X.BFM, X.BRg, X.1EQ, X.Arm, X.G0V, int, int, int, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C1110AYw r38, X.InterfaceC1072AWd r39, X.AuJ r40, X.InterfaceC2143AzF r41, X.C1Hj r42, X.C1O2 r43, final X.C1890At8 r44, X.BFM r45, X.BRg r46, X.C1EQ r47, X.C1822Arm r48, X.G0V r49, final int r50, final int r51, final int r52, boolean r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1874Aso.A01(X.AYw, X.AWd, X.AuJ, X.AzF, X.1Hj, X.1O2, X.At8, X.BFM, X.BRg, X.1EQ, X.Arm, X.G0V, int, int, int, boolean, boolean):void");
    }
}
