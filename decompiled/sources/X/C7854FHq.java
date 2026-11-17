package X;

import android.view.View;
import android.view.ViewOutlineProvider;
import com.instagram.common.bloks.lexer.ParsingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FHq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7854FHq extends C7862FHy {
    public int A00;
    public FJX A01;

    public static final float A00(FDW fdw, float f, int i) {
        float fA06 = fdw.A06(i, 0.0f) * f;
        if (Math.abs(fA06) <= Float.MAX_VALUE) {
            return fA06;
        }
        return 0.0f;
    }

    public static final void A07(FBB fbb, FDW fdw, FM6 fm6) {
        float fA00 = HjB.A00(fdw, 0.0f, 46);
        FE6 fe6A04 = fdw.A0C(77) != null ? AbstractC7855FHr.A04(fbb, fdw, FKI.A00(FBB.A00(fbb))) : null;
        if (fe6A04 == null) {
            if (fA00 != 0.0f) {
                boolean zA0L = fdw.A0L(43, false);
                float fA002 = HjB.A00(fdw, 0.0f, 40);
                int iA00 = Hnb.A00(fdw.A0H(56), 0);
                int iA02 = AbstractC7855FHr.A02(fbb, fdw);
                boolean z = iA02 != 0;
                if (zA0L) {
                    if (fA002 == 0.0f && !z && Hnb.A02(iA00)) {
                        fm6.setClipToOutline(true);
                        return;
                    }
                } else if (!z) {
                    return;
                }
                FM9 fm9 = fm6.A01;
                fm9.A07 = true;
                View view = fm9.A0E;
                view.setLayerType(2, null);
                view.invalidate();
                fm9.A00(AbstractC7855FHr.A07(fdw), fA002, fA00, AbstractC7855FHr.A00(fdw), iA02, AbstractC7855FHr.A01(fbb, fdw), iA00);
                return;
            }
            return;
        }
        fm6.setClipToOutline(false);
        FM9 fm92 = fm6.A01;
        int iA022 = AbstractC7855FHr.A02(fbb, fdw);
        int iA002 = Hnb.A00(fdw.A0H(56), 0);
        boolean zA0L2 = fdw.A0L(43, false);
        float[] fArrA07 = AbstractC7855FHr.A07(fdw);
        float fA003 = AbstractC7855FHr.A00(fdw);
        fm92.A00(null, 0.0f, fA00, 0.0f, iA022, 0, iA002);
        boolean z2 = true;
        fm92.A07 = true;
        if (!zA0L2 && iA022 == 0) {
            z2 = false;
        }
        fm92.A06 = z2;
        FKP fkp = fm92.A04;
        if (fkp == null) {
            fkp = new FKP();
            fm92.A04 = fkp;
        }
        fkp.A05(fe6A04, fArrA07, fA003);
        fm92.A05 = fkp;
        fm92.A0E.invalidate();
        fm6.A0D();
    }

    public static final void A0B(FDW fdw, FM6 fm6) {
        ViewOutlineProvider i0a;
        float fA00 = HjB.A00(fdw, 0.0f, 48);
        float fA002 = HjB.A00(fdw, 0.0f, 46);
        boolean zA0L = fdw.A0L(43, false);
        if (fA00 != 0.0f) {
            fm6.setOutlineProvider(new I0A(fdw, 1));
        }
        if (zA0L && fA002 != 0.0f) {
            i0a = new Hn3(fdw, fA002);
        } else if (fA002 == 0.0f) {
            return;
        } else {
            i0a = new I0A(fdw, 2);
        }
        fm6.setOutlineProvider(i0a);
    }

    public static final void A0C(FM6 fm6) {
        fm6.setBoxShadowStyle(null);
    }

    public static final void A0D(FM6 fm6) {
        fm6.setClipToOutline(false);
        FM9 fm9 = fm6.A01;
        FKP fkp = fm9.A05;
        fm9.A07 = false;
        if (fkp != null) {
            fm9.A05 = null;
            fm9.A0E.invalidate();
            fm6.A0D();
        } else {
            fm9.A05 = null;
            View view = fm9.A0E;
            view.setLayerType(0, null);
            view.invalidate();
        }
    }

    public static final void A0I(FM6 fm6, C7854FHq c7854FHq) {
        fm6.setElevation(0.0f);
        FJX fjx = c7854FHq.A01;
        C7384Etj.A0T(fjx);
        A0G(fm6, fjx);
    }

    public static final void A01(FBB fbb, FDW fdw, FM6 fm6) {
        float f = AbstractC7609F5w.A0S(fm6).density;
        List listA14 = AbstractC7608F5v.A14(fdw, 78);
        C7915FKn c7915FKn = null;
        if (!listA14.isEmpty()) {
            int iA00 = 15;
            try {
                iA00 = Hnb.A00(fdw.A0H(56), 15);
            } catch (ParsingException e) {
                FFI.A04(e);
            }
            ArrayList arrayListA0i = AnonymousClass003.A0i(listA14);
            Iterator it = listA14.iterator();
            while (it.hasNext()) {
                FDW fdwA0i = AbstractC7609F5w.A0i(it);
                FDW fdwA0C = fdwA0i.A0C(42);
                arrayListA0i.add(new C7916FKo(A00(fdwA0i, f, 38), A00(fdwA0i, f, 40), Math.max(A00(fdwA0i, f, 35), 0.0f), A00(fdwA0i, f, 41), fdwA0C == null ? -16777216 : HlW.A00(fdwA0C, fbb, -16777216), fdwA0i.A0L(36, false)));
            }
            c7915FKn = new C7915FKn(arrayListA0i, HjB.A00(fdw, 0.0f, 46), HjB.A00(fdw, 0.0f, 40), iA00);
        }
        fm6.setBoxShadowStyle(c7915FKn);
    }

    public static final void A08(FBB fbb, FDW fdw, FM6 fm6, FJX fjx) {
        if (fdw.A0C(68) != null) {
            int iA00 = fjx.A00;
            FDW fdwA0C = fdw.A0C(68);
            if (fdwA0C != null) {
                iA00 = HlW.A00(fdwA0C, fbb, iA00);
            }
            fm6.setOutlineAmbientShadowColor(iA00);
        }
        if (fdw.A0C(69) != null) {
            int iA002 = fjx.A01;
            FDW fdwA0C2 = fdw.A0C(69);
            if (fdwA0C2 != null) {
                iA002 = HlW.A00(fdwA0C2, fbb, iA002);
            }
            fm6.setOutlineSpotShadowColor(iA002);
        }
    }

    public static final void A0A(FBB fbb, FDW fdw, FM6 fm6, C7854FHq c7854FHq) {
        FJX fjx = c7854FHq.A01;
        C7384Etj.A0T(fjx);
        A0F(fm6, fjx);
        float fA00 = HjB.A00(fdw, 0.0f, 48);
        if (fA00 != 0.0f) {
            fm6.setElevation(fA00);
            A08(fbb, fdw, fm6, fjx);
        }
    }

    public static final void A0E(FM6 fm6) {
        fm6.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
    }

    public static final void A0G(FM6 fm6, FJX fjx) {
        fm6.setOutlineAmbientShadowColor(fjx.A00);
        fm6.setOutlineSpotShadowColor(fjx.A01);
    }

    public C7854FHq(FBB fbb, FDW fdw, long j, boolean z) {
        super(j);
        this.A00 = 0;
        this.A01 = new FJX();
        if (fdw != null) {
            FBA.A04(fbb);
            C7834FGp.A01(new FH8(fbb, this), this, fdw);
        }
        C7834FGp.A00(new FE8(), this);
        if (z) {
            return;
        }
        C7834FGp.A00(new FE9(this), this);
    }

    public static final void A09(FBB fbb, FDW fdw, FM6 fm6, C7854FHq c7854FHq) {
        AnonymousClass005.A0y(c7854FHq, fm6, fbb);
        A0A(fbb, fdw, fm6, c7854FHq);
        A0B(fdw, fm6);
        A07(fbb, fdw, fm6);
        A01(fbb, fdw, fm6);
    }

    public static final void A0F(FM6 fm6, FJX fjx) {
        fjx.A00 = fm6.getOutlineAmbientShadowColor();
        fjx.A01 = fm6.getOutlineSpotShadowColor();
    }

    public static final void A0H(FM6 fm6, C7854FHq c7854FHq) {
        A0I(fm6, c7854FHq);
        A0E(fm6);
        A0D(fm6);
        A0C(fm6);
    }
}
