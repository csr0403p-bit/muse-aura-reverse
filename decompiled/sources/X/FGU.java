package X;

import android.content.Context;

/* loaded from: classes6.dex */
public abstract class FGU extends FHQ implements FH0 {
    public static final int[] A01 = new int[2];
    public final FGG A00;

    @Override // X.FHQ
    public final void A0C(boolean z, int i, int i2, int i3, int i4) {
        FGG fgg = ((FGJ) this).A00;
        FED<?, ?, ?> fed = fgg.A00;
        int i5 = 0;
        if (fgg.A02 && fed != null) {
            int i6 = i3 - i;
            int i7 = i4 - i2;
            fed.A04(C7828FGj.A00.A00(i6, i6, i7, i7), null);
            fgg.A02 = false;
        }
        FEJ fej = fgg.A01;
        if (fej != null) {
            fgg.A00(fej);
            while (true) {
                if (!fej.equals(fgg.A01)) {
                    if (i5 <= 4) {
                        fej = fgg.A01;
                        if (fej == null) {
                            break;
                        }
                        fgg.A00(fej);
                        i5++;
                    } else {
                        Hx0.A00();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        FHQ.A08(this);
    }

    @Override // X.FH0
    public final void ARW(Integer num) {
        C7384Etj.A0Y(num, 0);
        ((FGJ) this).A00.ARW(num);
    }

    public abstract FGG getRootHostDelegate();

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AbstractC7829FGk abstractC7829FGkA01;
        int iA02;
        FGG fgg = ((FGJ) this).A00;
        long jA00 = C7827FGi.A00(i, i2);
        int[] iArr = A01;
        AbstractC7829FGk abstractC7829FGkA012 = AbstractC7829FGk.A01(BV6.A03(jA00));
        int iA03 = abstractC7829FGkA012.A03(jA00);
        if (AnonymousClass002.A1Q(iA03, abstractC7829FGkA012.A05(jA00)) && (iA02 = (abstractC7829FGkA01 = AbstractC7829FGk.A01((int) jA00)).A02(jA00)) == abstractC7829FGkA01.A04(jA00)) {
            fgg.A02 = true;
            iArr[0] = iA03;
            iArr[1] = iA02;
        } else {
            FED<?, ?, ?> fed = fgg.A00;
            if (fed == null) {
                super.onMeasure(i, i2);
                return;
            } else {
                fed.A04(jA00, iArr);
                fgg.A02 = false;
            }
        }
        setMeasuredDimension(iArr[0], iArr[1]);
    }

    public void setRenderState(FED<?, ?, ?> fed) {
        FEJ fej;
        FGG fgg = ((FGJ) this).A00;
        if (C7384Etj.areEqual(fgg.A00, fed)) {
            return;
        }
        FED<?, ?, ?> fed2 = fgg.A00;
        if (fed2 != null) {
            fed2.A04 = null;
        }
        fgg.A00 = fed;
        if (fed != null) {
            FGG fgg2 = fed.A04;
            if (fgg2 != null && !fgg2.equals(fgg)) {
                throw BV4.A0c("Must detach from previous host listener first");
            }
            fed.A04 = fgg;
            fej = fed.A05;
        } else {
            fej = null;
        }
        fgg.A01(fej);
    }

    public void setRenderTreeUpdateListener(FH2 fh2) {
        FGG fgg = ((FGJ) this).A00;
        FGS fgs = fgg instanceof FGC ? ((FGC) fgg).A01 : fgg.A03;
        C7819FGa c7819FGa = fgs.A00;
        if (c7819FGa == null) {
            c7819FGa = new C7819FGa(fgs, fgs.A0C);
        }
        c7819FGa.A00 = fh2;
        fgs.A00 = c7819FGa;
    }

    public FGU(Context context) {
        super(context);
        this.A00 = new FGG(this);
    }

    @Override // android.view.View
    public final void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        ARW(C79.A00);
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        ARW(C79.A00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        FGG fgg = ((FGJ) this).A00;
        (fgg instanceof FGC ? ((FGC) fgg).A01 : fgg.A03).A0I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FGG fgg = ((FGJ) this).A00;
        (fgg instanceof FGC ? ((FGC) fgg).A01 : fgg.A03).A0J();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        ARW(C79.A00);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        ARW(C79.A00);
    }
}
