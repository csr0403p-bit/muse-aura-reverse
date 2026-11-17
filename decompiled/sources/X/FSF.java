package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public abstract class FSF extends FSO {
    public Scroller A00;
    public RecyclerView A01;
    public final FS5 A02 = new FSL(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b A[PHI: r9 r10
  0x006b: PHI (r9v12 int) = (r9v7 int), (r9v13 int) binds: [B:31:0x0063, B:34:0x0069] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r10v4 android.view.View) = (r10v2 android.view.View), (r10v5 android.view.View) binds: [B:31:0x0063, B:34:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105  */
    @Override // X.FSO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A02(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FSF.A02(int, int):boolean");
    }

    public final View A03(FTN ftn) {
        AbstractC8085FSq c8084FSp;
        FSH fsh;
        if (this instanceof C7877FIq) {
            fsh = ((C7877FIq) this).A00;
        } else {
            FSI fsi = (FSI) this;
            if (!(fsi instanceof C7878FIr)) {
                if (ftn.A1Q()) {
                    c8084FSp = fsi.A01;
                    if (c8084FSp == null || c8084FSp.A02 != ftn) {
                        c8084FSp = new C8083FSo(ftn);
                        fsi.A01 = c8084FSp;
                    }
                } else {
                    if (!ftn.A1P()) {
                        return null;
                    }
                    c8084FSp = fsi.A00;
                    if (c8084FSp == null || c8084FSp.A02 != ftn) {
                        c8084FSp = new C8084FSp(ftn);
                        fsi.A00 = c8084FSp;
                    }
                }
                int iA0h = ftn.A0h();
                View view = null;
                if (iA0h == 0) {
                    return null;
                }
                int iA04 = c8084FSp.A04() + (c8084FSp.A05() / 2);
                int i = Integer.MAX_VALUE;
                for (int i2 = 0; i2 < iA0h; i2++) {
                    View viewA0x = ftn.A0x(i2);
                    int iA0B = AbstractC7607F5u.A0B(c8084FSp.A09(viewA0x) + (c8084FSp.A07(viewA0x) / 2), iA04);
                    if (iA0B < i) {
                        view = viewA0x;
                        i = iA0B;
                    }
                }
                return view;
            }
            fsh = ((C7878FIr) fsi).A00;
        }
        return fsh.A05(ftn);
    }

    public final void A04() {
        FTN ftn;
        View viewA03;
        RecyclerView recyclerView = this.A01;
        if (recyclerView == null || (ftn = recyclerView.A0H) == null || (viewA03 = A03(ftn)) == null) {
            return;
        }
        int[] iArrA06 = A06(viewA03, ftn);
        int i = iArrA06[0];
        if (i == 0 && iArrA06[1] == 0) {
            return;
        }
        this.A01.A0v(i, iArrA06[1], false);
    }

    public void A05(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A11(this.A02);
                this.A01.A0I = null;
            }
            this.A01 = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.A0I != null) {
                    throw C3cG.A0Q("An instance of OnFlingListener already set.");
                }
                recyclerView.A10(this.A02);
                RecyclerView recyclerView3 = this.A01;
                recyclerView3.A0I = this;
                this.A00 = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
                A04();
            }
        }
    }

    public final int[] A06(View view, FTN ftn) {
        FSH fsh;
        if (this instanceof C7877FIq) {
            fsh = ((C7877FIq) this).A00;
        } else {
            FSI fsi = (FSI) this;
            if (!(fsi instanceof C7878FIr)) {
                int[] iArr = new int[2];
                if (ftn.A1P()) {
                    AbstractC8085FSq c8084FSp = fsi.A00;
                    if (c8084FSp == null || c8084FSp.A02 != ftn) {
                        c8084FSp = new C8084FSp(ftn);
                        fsi.A00 = c8084FSp;
                    }
                    iArr[0] = A00(view, c8084FSp);
                } else {
                    iArr[0] = 0;
                }
                if (!ftn.A1Q()) {
                    iArr[1] = 0;
                    return iArr;
                }
                AbstractC8085FSq c8083FSo = fsi.A01;
                if (c8083FSo == null || c8083FSo.A02 != ftn) {
                    c8083FSo = new C8083FSo(ftn);
                    fsi.A01 = c8083FSo;
                }
                iArr[1] = A00(view, c8083FSo);
                return iArr;
            }
            fsh = ((C7878FIr) fsi).A00;
        }
        return fsh.A07(view, ftn);
    }

    public static int A00(View view, AbstractC8085FSq abstractC8085FSq) {
        return (abstractC8085FSq.A09(view) + (abstractC8085FSq.A07(view) / 2)) - (abstractC8085FSq.A04() + (abstractC8085FSq.A05() / 2));
    }
}
