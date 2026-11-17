package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public final class FGV extends ViewGroup implements FH4 {
    public FGV A00;
    public FEE<Object, FBB> A01;
    public FEE<Object, FBB> A02;
    public FBB A03;
    public FDW A04;
    public boolean A05;
    public boolean A06;
    public ViewGroup A07;
    public C7836FGs A08;
    public final FEa A09;
    public final int[] A0A;
    public final int[] A0B;
    public final int[] A0C;

    public final void A00() {
        this.A05 = false;
        FEa fEa = this.A09;
        ViewParent parent = fEa.getParent();
        C7384Etj.A0Z(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(fEa);
        C7836FGs c7836FGs = this.A08;
        if (c7836FGs != null) {
            AbstractC7611F5y.A0h(c7836FGs);
        }
        ViewGroup.LayoutParams layoutParams = fEa.getLayoutParams();
        C7384Etj.A0Z(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.topMargin = 0;
        fEa.setRenderResult(this.A02, this.A03);
        fEa.setScaleX(1.0f);
        fEa.setScaleY(1.0f);
        if (this.A06) {
            return;
        }
        this.A06 = true;
        addView(fEa);
        requestLayout();
    }

    public final void A01() {
        ViewGroup viewGroup;
        this.A05 = true;
        if (this.A06) {
            this.A06 = false;
            removeView(this.A09);
            requestLayout();
        }
        FEa fEa = this.A09;
        AbstractC7611F5y.A0h(fEa);
        C7836FGs c7836FGs = this.A08;
        if (c7836FGs == null) {
            c7836FGs = new C7836FGs(AbstractC7608F5v.A0E(this));
            this.A08 = c7836FGs;
        }
        ViewParent parent = c7836FGs.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.removeView(c7836FGs);
        }
        ViewGroup viewGroup2 = this.A07;
        if (viewGroup2 == null) {
            throw BV4.A0U();
        }
        viewGroup2.addView(c7836FGs, new ViewGroup.LayoutParams(-1, -1));
        c7836FGs.addView(fEa);
    }

    public final void A02(FDW fdw, float f, float f2, int i, int i2, int i3, int i4) {
        FEa fEa = this.A09;
        ViewGroup.LayoutParams layoutParams = fEa.getLayoutParams();
        C7384Etj.A0Z(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.topMargin = i2;
        fEa.setScaleX(f);
        fEa.setScaleY(f2);
        FBB fbb = this.A03;
        if (fdw == null || fbb == null) {
            fEa.A01 = i3;
            fEa.A00 = i4;
            FEa.A00(fEa);
        } else {
            FEE<Object, FBB> feeA00 = FEC.A00(this.A01, fbb, fdw, C7827FGi.A00(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824)));
            this.A01 = feeA00;
            fEa.A0E(feeA00, fbb, i3, i4);
        }
        fEa.requestLayout();
    }

    public final FBB getBloksContext$fbandroid_libraries_bloks_stdlib_components_bk_components_animated_sharedelementcontainer_bk_components_animated_sharedelementcontainer() {
        return this.A03;
    }

    public final FDW getChildModel$fbandroid_libraries_bloks_stdlib_components_bk_components_animated_sharedelementcontainer_bk_components_animated_sharedelementcontainer() {
        return this.A04;
    }

    @Override // X.FH4
    public boolean getForwardsOutsetBoxShadows() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] getLocation() {
        /*
            r8 = this;
            X.FGV r2 = r8.A00
            if (r2 == 0) goto L9
            boolean r1 = r2.A05
            r0 = 1
            if (r1 != 0) goto La
        L9:
            r0 = 0
        La:
            r7 = 1
            r6 = 0
            if (r0 != 0) goto L2d
            int[] r5 = r8.A0A
            r8.getLocationOnScreen(r5)
            android.view.ViewGroup r1 = r8.A07
            if (r1 == 0) goto L1c
            int[] r0 = r8.A0B
            r1.getLocationOnScreen(r0)
        L1c:
            r1 = r5[r6]
            int[] r2 = r8.A0B
            r0 = r2[r6]
            int r1 = r1 - r0
            r5[r6] = r1
            r1 = r5[r7]
            r0 = r2[r7]
            int r1 = r1 - r0
            r5[r7] = r1
            return r5
        L2d:
            if (r2 == 0) goto L4c
            int[] r5 = r8.A0A
            int[] r4 = r8.A0C
            r1 = r4[r6]
            int[] r3 = r2.A0A
            r0 = r3[r6]
            int r1 = r1 + r0
            int[] r2 = r2.A0C
            r0 = r2[r6]
            int r1 = r1 - r0
            r5[r6] = r1
            r1 = r4[r7]
            r0 = r3[r7]
            int r1 = r1 + r0
            r0 = r2[r7]
            int r1 = r1 - r0
            r5[r7] = r1
            return r5
        L4c:
            java.lang.IllegalStateException r0 = X.BV4.A0U()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGV.getLocation():int[]");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.A06) {
            this.A09.layout(0, 0, i3 - i, i4 - i2);
            getLocationOnScreen(this.A0C);
        }
        if (this.A00 == null) {
            FGV fgv = null;
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof FGV) {
                    fgv = (FGV) parent;
                }
            }
            this.A00 = fgv;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        FEa fEa = this.A09;
        fEa.measure(i, i2);
        setMeasuredDimension(fEa.getMeasuredWidth(), fEa.getMeasuredHeight());
    }

    public final void setBloksContext$fbandroid_libraries_bloks_stdlib_components_bk_components_animated_sharedelementcontainer_bk_components_animated_sharedelementcontainer(FBB fbb) {
        this.A03 = fbb;
    }

    public final void setChildModel$fbandroid_libraries_bloks_stdlib_components_bk_components_animated_sharedelementcontainer_bk_components_animated_sharedelementcontainer(FDW fdw) {
        this.A04 = fdw;
    }

    public FGV(Context context) {
        super(context);
        FEa fEa = new FEa(context);
        ((FGE) fEa).A00 = true;
        this.A09 = fEa;
        this.A0C = new int[2];
        this.A0A = new int[2];
        this.A0B = new int[2];
        if (!this.A06) {
            this.A06 = true;
            addView(fEa);
            requestLayout();
        }
        fEa.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 51));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View rootView = getRootView();
        C7384Etj.A0Z(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        this.A07 = (ViewGroup) rootView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A07 = null;
    }
}
