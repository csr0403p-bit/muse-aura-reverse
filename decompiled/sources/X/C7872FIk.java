package X;

import com.facebook.flexlayout.FlexLayoutNativeMeasureCallback;
import com.facebook.flexlayout.layoutoutput.LayoutOutput;
import com.facebook.flexlayout.layoutoutput.MeasureOutput;

/* JADX INFO: Add missing generic type declarations: [MeasureResult] */
/* renamed from: X.FIk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7872FIk<MeasureResult> extends FlexLayoutNativeMeasureCallback<MeasureResult> {
    public final /* synthetic */ LayoutOutput A00;
    public final /* synthetic */ FI3[] A01;

    public C7872FIk(LayoutOutput layoutOutput, FI3[] fi3Arr) {
        this.A01 = fi3Arr;
        this.A00 = layoutOutput;
    }

    @Override // com.facebook.flexlayout.FlexLayoutNativeMeasureCallback
    public final MeasureOutput<MeasureResult> measure(int i, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        MeasureOutput<MeasureResult> measureOutputA00 = this.A01[i].A00(f, f2, f3, f4, f5, z);
        if (!z) {
            this.A00.measureResults[i] = measureOutputA00.measureResult;
        }
        return measureOutputA00;
    }
}
