package X;

import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Ahl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1360Ahl {
    public static final C1362Aho A00 = new C1362Aho();
    public static final Object A01 = C3cG.A0T();

    /* JADX WARN: Incorrect types in method signature: (LX/Ahm;LX/BRg;LX/G0V<-LX/3Su;-Landroidx/compose/ui/unit/Constraints;+LX/Abi;>;LX/BFM;II)V */
    public static final void A00(BFM bfm, BRg bRg, C1361Ahm c1361Ahm, G0V g0v, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-511989831);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c1361Ahm) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            BBM bbmA5U = bfm.A5U();
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            AKQ akqA04 = BBI.A04(bbi);
            Function0<C1453AjM> function0 = C1453AjM.A0j;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, c1361Ahm, c1361Ahm.A04);
            BPg.A02(bfm, bbmA5U, c1361Ahm.A02);
            BPg.A02(bfm, g0v, c1361Ahm.A03);
            BPg.A02(bfm, akqA04, C1515AkP.A06);
            AnonymousClass003.A0n(bfm, bRgA01);
            AnonymousClass002.A0w(bfm, iA0J);
            BBI.A0R(bbi, true);
            if (bfm.AKh()) {
                bfm.AgE(-1259187287);
            } else {
                boolean zA1Z = AnonymousClass001.A1Z(c1361Ahm, bfm, -1259245908);
                Object objAaT = bfm.AaT();
                if (zA1Z || objAaT == C78N.A00) {
                    objAaT = C2328BUc.A00(c1361Ahm, 15);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A15(bfm, objAaT);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C2341BUp(bRg2, c1361Ahm, g0v, i, i2, 0);
        }
    }

    public static final void A01(BRg bRg, G0V<? super C3Su, ? super Constraints, ? extends InterfaceC1134Abi> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1298353104);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new C1361Ahm();
                BBI.A0T(bfm, objAaT);
            }
            A00(bfm, bRg2, (C1361Ahm) objAaT, g0v, (iA0d << 3) & 1008, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3c2(bRg2, i, g0v, i2, 1);
        }
    }
}
