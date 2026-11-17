package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import com.meta.foa.cds.CdsBottomSheetTopSpan;

/* renamed from: X.Hwk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10581Hwk implements FSE {
    public final /* synthetic */ float A00;
    public final /* synthetic */ CdsBottomSheetTopSpan A01;

    public C10581Hwk(CdsBottomSheetTopSpan cdsBottomSheetTopSpan, float f) {
        this.A01 = cdsBottomSheetTopSpan;
        this.A00 = f;
    }

    @Override // X.FSE
    public final int AIt(View view, int i) {
        float f;
        CdsBottomSheetTopSpan cdsBottomSheetTopSpan = this.A01;
        if (cdsBottomSheetTopSpan instanceof CdsBottomSheetTopSpan.Dp) {
            if (view != null) {
                Context contextA0E = AbstractC7608F5v.A0E(view);
                C7384Etj.A0Y((CdsBottomSheetTopSpan.Dp) cdsBottomSheetTopSpan, 0);
                i -= (int) TypedValue.applyDimension(1, r1.A00, C60Q.A0B(contextA0E));
            }
            f = this.A00;
        } else {
            boolean z = cdsBottomSheetTopSpan instanceof CdsBottomSheetTopSpan.ScreenPercent;
            f = this.A00;
            if (z) {
                f -= ((CdsBottomSheetTopSpan.ScreenPercent) cdsBottomSheetTopSpan).A00 / 100.0f;
            }
        }
        ViewParent parent = view != null ? view.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        int paddingBottom = view2 != null ? view2.getPaddingBottom() : 0;
        return Math.min((view != null ? view.getMeasuredHeight() : 0) + paddingBottom, ((int) (f * (i - paddingBottom))) + paddingBottom);
    }
}
