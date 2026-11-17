package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class FTA extends FTP {
    public static TimeInterpolator A0C;
    public ArrayList<FTV> A00;
    public ArrayList<ArrayList<FTV>> A01;
    public ArrayList<FTV> A02;
    public ArrayList<ArrayList<FTC>> A03;
    public ArrayList<FTV> A04;
    public ArrayList<ArrayList<FTE>> A05;
    public ArrayList<FTV> A06;
    public ArrayList<FTC> A07;
    public ArrayList<FTE> A08;
    public ArrayList<FTV> A09;
    public ArrayList<FTV> A0A;
    public boolean A0B;

    public FTA() {
        this(0);
        this.A09 = C3cG.A0h();
        this.A06 = C3cG.A0h();
        this.A08 = C3cG.A0h();
        this.A07 = C3cG.A0h();
        this.A01 = C3cG.A0h();
        this.A05 = C3cG.A0h();
        this.A03 = C3cG.A0h();
        this.A00 = C3cG.A0h();
        this.A04 = C3cG.A0h();
        this.A0A = C3cG.A0h();
        this.A02 = C3cG.A0h();
    }

    public static void A00(FTA fta, FTV ftv) {
        if (A0C == null) {
            A0C = new ValueAnimator().getInterpolator();
        }
        ftv.A0I.animate().setInterpolator(A0C);
        fta.A05(ftv);
    }

    public static boolean A03(FTC ftc, FTA fta, FTV ftv) {
        if (ftc.A04 == ftv) {
            ftc.A04 = null;
        } else {
            if (ftc.A05 != ftv) {
                return false;
            }
            ftc.A05 = null;
        }
        View view = ftv.A0I;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        fta.A06(ftv);
        return true;
    }

    public final boolean A0B(FTV ftv, int i, int i2, int i3, int i4) {
        View view = ftv.A0I;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) view.getTranslationY());
        A00(this, ftv);
        int i5 = i4 - translationY;
        if (i3 - translationX != 0) {
            view.setTranslationX(-r0);
            if (i5 != 0) {
            }
            ArrayList<FTE> arrayList = this.A08;
            FTE fte = new FTE();
            fte.A04 = ftv;
            fte.A00 = translationX;
            fte.A01 = translationY;
            fte.A02 = i3;
            fte.A03 = i4;
            arrayList.add(fte);
            return true;
        }
        if (i5 == 0) {
            A06(ftv);
            return false;
        }
        view.setTranslationY(-i5);
        ArrayList<FTE> arrayList2 = this.A08;
        FTE fte2 = new FTE();
        fte2.A04 = ftv;
        fte2.A00 = translationX;
        fte2.A01 = translationY;
        fte2.A02 = i3;
        fte2.A03 = i4;
        arrayList2.add(fte2);
        return true;
    }

    public static void A01(FTA fta, FTV ftv, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            FTC ftc = (FTC) list.get(size);
            if (A03(ftc, fta, ftv) && ftc.A05 == null && ftc.A04 == null) {
                list.remove(ftc);
            }
        }
    }

    public static final void A02(List<FTV> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                list.get(size).A0I.animate().cancel();
            }
        }
    }

    @Override // X.FTP
    public final boolean A09(FTV ftv, List<Object> list) {
        return !list.isEmpty() || super.A09(ftv, list);
    }

    public final void A0A() {
        if (A07()) {
            return;
        }
        ArrayList arrayList = super.A01;
        if (0 < arrayList.size()) {
            arrayList.get(0);
            throw BV4.A0a("onAnimationsFinished");
        }
        arrayList.clear();
    }

    public FTA(int i) {
        this.A0B = true;
    }
}
