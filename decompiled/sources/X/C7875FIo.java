package X;

import com.facebook.flexlayout.FlexLayoutNativeMeasureCallback;
import com.facebook.flexlayout.layoutoutput.MeasureOutput;

/* JADX INFO: Add missing generic type declarations: [MeasureResult] */
/* renamed from: X.FIo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7875FIo<MeasureResult> extends FlexLayoutNativeMeasureCallback<MeasureResult> {
    public final /* synthetic */ FI3[] A00;

    public C7875FIo(FI3[] fi3Arr) {
        this.A00 = fi3Arr;
    }

    @Override // com.facebook.flexlayout.FlexLayoutNativeMeasureCallback
    public final MeasureOutput<MeasureResult> measure(int i, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        return this.A00[i].A00(f, f2, f3, f4, f5, z);
    }
}
