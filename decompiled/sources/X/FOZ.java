package X;

import android.content.Context;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FOZ {
    public static final void A00(FOX fox, CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins, FOY foy) {
        C7384Etj.A0Y(foy, 1);
        Context context = fox.getContext();
        C7384Etj.A0U(context);
        if (cdsOpenScreenConfig$BottomSheetMargins != null) {
            fox.A04.setPadding(cdsOpenScreenConfig$BottomSheetMargins.A01, cdsOpenScreenConfig$BottomSheetMargins.A03, cdsOpenScreenConfig$BottomSheetMargins.A02, cdsOpenScreenConfig$BottomSheetMargins.A00);
            return;
        }
        if (foy.A0G == EnumC7952FMi.A04) {
            FPW fpw = FP4.A00;
            if (fpw.supportXMDSThreeBackground()) {
                EnumC7995FOo themeName = fpw.getThemeName();
                Hi8 hi8 = Hi8.A03;
                C7384Etj.A0Y(themeName, 0);
                fox.A04.setPadding(0, (int) HsH.A00(context, FQX.A00(themeName).Aft(hi8)), 0, 0);
                return;
            }
        }
        int iA00 = (int) HsH.A00(context, 4.0f);
        fox.A04.setPadding(iA00, iA00, iA00, iA00);
    }

    public static final void A01(FOX fox, FPC fpc, FOY foy) {
        FS7 fs7;
        FSE fse;
        FSE hxI;
        C7384Etj.A0Y(fpc, 2);
        Context context = fox.getContext();
        C7384Etj.A0U(context);
        CdsBottomSheetTopSpan cdsBottomSheetTopSpan = foy.A0D;
        float fAGF = fpc.AGF();
        Float fAKu = fpc.AKu();
        FSE fpk = fAKu != null ? new FPK(fAKu) : null;
        if (fpc.AMr()) {
            FSE c10581Hwk = new C10581Hwk(cdsBottomSheetTopSpan, fAGF);
            if (fpk == null) {
                fpk = c10581Hwk;
            }
            fox.A09 = fpk;
            fs7 = fox.A0A;
            FSE fse2 = fox.A08;
            fse = FOX.A0N;
            FSE fse3 = fpk;
            fs7.A03(fse2 == null ? new FSE[]{fse, fse3} : new FSE[]{fse, fse3, fse2}, fox.isShowing());
            hxI = null;
        } else {
            hxI = new HxI(context, cdsBottomSheetTopSpan, fAGF);
            if (fpk == null) {
                fpk = hxI;
            }
            fox.A09 = fpk;
            fs7 = fox.A0A;
            FSE fse4 = fox.A08;
            fse = FOX.A0N;
            FSE fse5 = fpk;
            fs7.A03(fse4 == null ? new FSE[]{fse, fse5} : new FSE[]{fse, fse5, fse4}, fox.isShowing());
        }
        fox.A08 = hxI;
        FSE fse6 = fox.A09;
        fs7.A03(fse6 == null ? hxI == null ? new FSE[]{fse} : new FSE[]{fse, hxI} : hxI == null ? new FSE[]{fse, fse6} : new FSE[]{fse, fse6, hxI}, fox.isShowing());
        if (fpc.AJh()) {
            fs7.A05 = C8009FPd.A00;
            HashMap<FSE, List<FSE>> mapA0u = BV4.A0u();
            mapA0u.put(fox.A08, Collections.singletonList(fse));
            fs7.A07 = mapA0u;
        }
    }
}
