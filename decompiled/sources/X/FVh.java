package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.Reference;

/* loaded from: classes6.dex */
public final class FVh implements FPU {
    public final /* synthetic */ InterfaceC8134FVx A00;
    public final /* synthetic */ C8133FVv A01;

    public FVh(InterfaceC8134FVx interfaceC8134FVx, C8133FVv c8133FVv) {
        this.A00 = interfaceC8134FVx;
        this.A01 = c8133FVv;
    }

    @Override // X.FPU
    public final C8497Ff4 onApplyWindowInsets(View view, C8497Ff4 c8497Ff4) {
        Reference reference;
        View viewA0c;
        C8345FcJ c8345FcJA0D;
        InterfaceC8134FVx interfaceC8134FVx = this.A00;
        C8133FVv c8133FVv = this.A01;
        int i = c8133FVv.A02;
        int i2 = c8133FVv.A01;
        int i3 = c8133FVv.A00;
        FVq fVq = (FVq) interfaceC8134FVx;
        BottomSheetBehavior bottomSheetBehavior = fVq.A00;
        C8496Ff3 c8496Ff3 = c8497Ff4.A00;
        bottomSheetBehavior.A0A = c8496Ff3.A0D().A03;
        boolean zA1Q = BV7.A1Q(view.getLayoutDirection());
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z = bottomSheetBehavior.A0S;
        if (z) {
            int i4 = c8496Ff3.A0D().A00;
            bottomSheetBehavior.A09 = i4;
            paddingBottom = i3 + i4;
        }
        if (bottomSheetBehavior.A0T) {
            int i5 = i;
            if (zA1Q) {
                i5 = i2;
            }
            paddingLeft = i5 + c8496Ff3.A0D().A01;
        }
        if (bottomSheetBehavior.A0U) {
            if (zA1Q) {
                i2 = i;
            }
            paddingRight = i2 + c8496Ff3.A0D().A02;
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z2 = fVq.A01;
        if (z2) {
            if (c8496Ff3 instanceof C8503FfA) {
                C8503FfA c8503FfA = (C8503FfA) c8496Ff3;
                c8345FcJA0D = c8503FfA.A00;
                if (c8345FcJA0D == null) {
                    c8345FcJA0D = C8345FcJ.A01(c8503FfA.A0A.getMandatorySystemGestureInsets());
                    c8503FfA.A00 = c8345FcJA0D;
                }
            } else {
                c8345FcJA0D = c8496Ff3.A0D();
            }
            bottomSheetBehavior.A07 = c8345FcJA0D.A00;
        }
        if ((z || z2) && (reference = bottomSheetBehavior.A0M) != null) {
            BottomSheetBehavior.A06(bottomSheetBehavior);
            if (bottomSheetBehavior.A0G == 4 && (viewA0c = AbstractC7607F5u.A0c(reference)) != null) {
                viewA0c.requestLayout();
            }
        }
        return c8497Ff4;
    }
}
