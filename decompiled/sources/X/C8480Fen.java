package X;

import android.graphics.drawable.ColorDrawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: X.Fen, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8480Fen {
    public int A00;
    public C8345FcJ A01;
    public C8345FcJ A02;
    public Object A03;
    public boolean A04;
    public final int A05;
    public final ColorDrawable A06;
    public final C8481Feo A07 = new C8481Feo();
    public static final Interpolator A0A = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    public static final Interpolator A0B = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
    public static final Interpolator A08 = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
    public static final Interpolator A09 = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);

    public C8480Fen(int i) {
        C8345FcJ c8345FcJ = C8345FcJ.A04;
        this.A01 = c8345FcJ;
        this.A02 = c8345FcJ;
        this.A03 = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            throw BV5.A0Q("Unexpected side: ", i);
        }
        this.A05 = i;
        this.A06 = new ColorDrawable();
        this.A00 = 0;
        this.A04 = true;
        A00(this, 0);
    }

    public static void A00(C8480Fen c8480Fen, int i) {
        if (c8480Fen.A00 != i) {
            c8480Fen.A00 = i;
            ColorDrawable colorDrawable = c8480Fen.A06;
            colorDrawable.setColor(i);
            C8481Feo c8481Feo = c8480Fen.A07;
            c8481Feo.A05 = colorDrawable;
            InterfaceC8485Fes interfaceC8485Fes = c8481Feo.A07;
            if (interfaceC8485Fes != null) {
                ((C8482Fep) interfaceC8485Fes).A00.setBackground(colorDrawable);
            }
        }
    }

    public final void A01(float f) {
        C8481Feo c8481Feo;
        float f2;
        C8481Feo c8481Feo2;
        float f3;
        float f4 = 1.0f * f;
        int i = this.A05;
        if (i != 1) {
            if (i == 2) {
                c8481Feo2 = this.A07;
                f3 = -(1.0f - f4);
            } else if (i == 4) {
                c8481Feo = this.A07;
                f2 = 1.0f - f4;
            } else {
                if (i != 8) {
                    return;
                }
                c8481Feo2 = this.A07;
                f3 = 1.0f - f4;
            }
            float f5 = f3 * c8481Feo2.A03;
            if (c8481Feo2.A02 != f5) {
                c8481Feo2.A02 = f5;
                InterfaceC8485Fes interfaceC8485Fes = c8481Feo2.A07;
                if (interfaceC8485Fes != null) {
                    ((C8482Fep) interfaceC8485Fes).A00.setTranslationY(f5);
                    return;
                }
                return;
            }
            return;
        }
        c8481Feo = this.A07;
        f2 = -(1.0f - f4);
        float f6 = f2 * c8481Feo.A04;
        if (c8481Feo.A01 != f6) {
            c8481Feo.A01 = f6;
            InterfaceC8485Fes interfaceC8485Fes2 = c8481Feo.A07;
            if (interfaceC8485Fes2 != null) {
                ((C8482Fep) interfaceC8485Fes2).A00.setTranslationX(f6);
            }
        }
    }
}
