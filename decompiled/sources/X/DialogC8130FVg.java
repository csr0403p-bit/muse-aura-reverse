package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.aura.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.FVg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogC8130FVg extends AbstractDialogC8260Fag {
    public FrameLayout A00;
    public AbstractC8132FVu A01;
    public AbstractC8132FVu A02;
    public BottomSheetBehavior<FrameLayout> A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public FrameLayout A08;
    public CoordinatorLayout A09;

    @Override // X.AbstractDialogC8260Fag, X.DialogC10469Hka, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(A00(view, null, 0));
    }

    public static void A01(DialogC8130FVg dialogC8130FVg) throws Resources.NotFoundException {
        if (dialogC8130FVg.A08 == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(dialogC8130FVg.getContext(), R.layout._name_removed__res_0x7f0d013e, null);
            dialogC8130FVg.A08 = frameLayout;
            dialogC8130FVg.A09 = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) dialogC8130FVg.A08.findViewById(R.id.design_bottom_sheet);
            dialogC8130FVg.A00 = frameLayout2;
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (!(layoutParams instanceof C8128FUx)) {
                throw C60O.A0i("The view is not a child of CoordinatorLayout");
            }
            CoordinatorLayout.Behavior behavior = ((C8128FUx) layoutParams).A0A;
            if (!(behavior instanceof BottomSheetBehavior)) {
                throw C60O.A0i("The view is not associated with BottomSheetBehavior");
            }
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = (BottomSheetBehavior) behavior;
            dialogC8130FVg.A03 = bottomSheetBehavior;
            BV7.A1D(dialogC8130FVg.A01, bottomSheetBehavior.A0l);
            dialogC8130FVg.A03.A0D(dialogC8130FVg.A04);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() throws Resources.NotFoundException {
        if (this.A03 == null) {
            A01(this);
        }
        super.cancel();
    }

    private FrameLayout A00(View view, ViewGroup.LayoutParams layoutParams, int i) throws Resources.NotFoundException {
        A01(this);
        ViewGroup viewGroup = (ViewGroup) this.A08.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, viewGroup, false);
        }
        if (this.A07) {
            AbstractC8082FSn.A00(this.A00, new I10(this, 3));
        }
        this.A00.removeAllViews();
        FrameLayout frameLayout = this.A00;
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        viewGroup.findViewById(R.id.touch_outside).setOnClickListener(new I0W(this, 5));
        AbstractC8060FRo.A06(this.A00, new I0C(this, 1));
        this.A00.setOnTouchListener(new FVn(this));
        return this.A08;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // android.app.Dialog, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            android.view.Window r3 = r4.getWindow()
            if (r3 == 0) goto L38
            boolean r0 = r4.A07
            if (r0 == 0) goto L1a
            int r0 = r3.getNavigationBarColor()
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 255(0xff, float:3.57E-43)
            r2 = 1
            if (r1 < r0) goto L1b
        L1a:
            r2 = 0
        L1b:
            android.widget.FrameLayout r1 = r4.A08
            if (r1 == 0) goto L24
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L24:
            androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r4.A09
            if (r1 == 0) goto L2d
            r0 = r2 ^ 1
            r1.setFitsSystemWindows(r0)
        L2d:
            if (r2 == 0) goto L38
            r1 = 768(0x300, float:1.076E-42)
            android.view.View r0 = r3.getDecorView()
            r0.setSystemUiVisibility(r1)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC8130FVg.onAttachedToWindow():void");
    }

    @Override // X.AbstractDialogC8260Fag, X.DialogC10469Hka, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // X.DialogC10469Hka, android.app.Dialog
    public final void onStart() throws Resources.NotFoundException {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.A03;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0G != 5) {
            return;
        }
        bottomSheetBehavior.A09(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) throws Resources.NotFoundException {
        super.setCancelable(z);
        if (this.A04 != z) {
            this.A04 = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.A03;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.A0D(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.A04) {
            this.A04 = true;
        }
        this.A05 = z;
        this.A06 = true;
    }

    @Override // X.AbstractDialogC8260Fag, X.DialogC10469Hka, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(A00(view, layoutParams, 0));
    }

    @Override // X.AbstractDialogC8260Fag, X.DialogC10469Hka, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(A00(null, null, i));
    }
}
