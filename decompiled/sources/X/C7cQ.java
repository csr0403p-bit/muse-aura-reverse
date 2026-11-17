package X;

import com.facebook.aura.R;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: X.7cQ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7cQ {
    public static final void A00(BFM bfm, BRg bRg, BNO bno, C7cR c7cR, int i, int i2) {
        BBb bBbAAc;
        C6x4 c6x4;
        BRg bRg2 = bRg;
        C7cR c7cR2 = c7cR;
        C7384Etj.A0Y(bno, 0);
        bfm.AgG(-1383554519);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bno) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c7cR2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                c7cR2 = new C7cR(null, null, 7);
            }
            List<String> list = bno.A00;
            if (list.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c6x4 = new C6x4(bRg2, bno, c7cR2, i, i2, 0);
                    bBbAAc.A06 = c6x4;
                }
                return;
            }
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0R(bRg2), "place_known_for_section");
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, c7cR2.A00, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string.place_known_for_header);
            BS0 bs0 = BRg.A00;
            BRg bRgA002 = AbstractC07539Wl.A00(bs0, "place_known_for_header");
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new C07338im(4);
                bfm.Ai0(objAaT);
            }
            AbstractC1727ApL.A02(null, bfm, AnonymousClass001.A0Y(bRgA002, objAaT, false), null, c7cR2.A02, strA01, null, 0, 0, 0, 0, 1016, false);
            AbstractC1727ApL.A02(null, bfm, AbstractC07539Wl.A00(bs0, "place_known_for_body"), null, c7cR2.A01, AbstractC06907md.A01(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e6a), list, null), null, 0, 0, 0, 48, 1016, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c6x4 = new C6x4(bRg2, bno, c7cR2, i, i2, 1);
            bBbAAc.A06 = c6x4;
        }
    }
}
