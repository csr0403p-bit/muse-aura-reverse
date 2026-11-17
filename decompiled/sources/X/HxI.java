package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.meta.foa.cds.CdsBottomSheetTopSpan;

/* loaded from: classes6.dex */
public final class HxI implements FSE {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ CdsBottomSheetTopSpan A02;

    public HxI(Context context, CdsBottomSheetTopSpan cdsBottomSheetTopSpan, float f) {
        this.A02 = cdsBottomSheetTopSpan;
        this.A00 = f;
        this.A01 = context;
    }

    @Override // X.FSE
    public final int AIt(View view, int i) {
        float f;
        CdsBottomSheetTopSpan cdsBottomSheetTopSpan = this.A02;
        if (cdsBottomSheetTopSpan == null) {
            f = this.A00;
        } else if (cdsBottomSheetTopSpan instanceof CdsBottomSheetTopSpan.Dp) {
            Context context = this.A01;
            C7384Etj.A0Y((CdsBottomSheetTopSpan.Dp) cdsBottomSheetTopSpan, 0);
            i -= (int) TypedValue.applyDimension(1, r1.A00, C60Q.A0B(context));
            f = this.A00;
        } else {
            if (!(cdsBottomSheetTopSpan instanceof CdsBottomSheetTopSpan.ScreenPercent)) {
                throw C3cG.A0q();
            }
            f = this.A00 - (((CdsBottomSheetTopSpan.ScreenPercent) cdsBottomSheetTopSpan).A00 / 100.0f);
        }
        return (int) (f * i);
    }
}
