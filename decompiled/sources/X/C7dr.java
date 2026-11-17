package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;

/* renamed from: X.7dr, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7dr {
    public static final C7dr A00 = new C7dr();

    public static final void A00(Drawable drawable, C7dr c7dr, BFM bfm, int i) {
        bfm.AgG(257732500);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, drawable) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            BS0 bs0 = BRg.A00;
            C1AC c1ac = C7b0.A03;
            BRg bRgA07 = C10G.A07(bs0, 24.0f);
            boolean zA67 = bfm.A67(drawable);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new C2294BSu(drawable, 19);
                bfm.Ai0(objAaT);
            }
            C3Ue.A04(AEk.A01(bRgA07, (G0U) objAaT), bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8iB(drawable, c7dr, i, 3);
        }
    }

    public static final void A01(Icon icon, C7dr c7dr, BFM bfm, int i) {
        BBb bBbAAc;
        int i2;
        bfm.AgG(2116504409);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, icon) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, c7dr);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA1K = AnonymousClass003.A1K(bfm, icon, contextA0H);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = icon.loadDrawable(contextA0H);
                bfm.Ai0(objAaT);
            }
            Drawable drawable = (Drawable) objAaT;
            if (drawable == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    i2 = 1;
                    bBbAAc.A06 = new C8iB(icon, c7dr, i, i2);
                }
                return;
            }
            A00(drawable, c7dr, bfm, iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            i2 = 2;
            bBbAAc.A06 = new C8iB(icon, c7dr, i, i2);
        }
    }
}
