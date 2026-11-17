package X;

import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fgt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class SharedElementCallbackC8592Fgt extends SharedElementCallback {
    public final AbstractC8629Fhg A00;

    @Override // android.app.SharedElementCallback
    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        throw BV4.A0a("onCaptureSharedElementSnapshot");
    }

    @Override // android.app.SharedElementCallback
    public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
        throw BV4.A0a("onCreateSnapshotView");
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(List<String> list, Map<String, View> map) {
        throw BV4.A0a("onMapSharedElements");
    }

    @Override // android.app.SharedElementCallback
    public final void onRejectSharedElements(List<View> list) {
        throw BV4.A0a("onRejectSharedElements");
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        throw BV4.A0a("onSharedElementEnd");
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        throw BV4.A0a("onSharedElementStart");
    }

    public SharedElementCallbackC8592Fgt(AbstractC8629Fhg abstractC8629Fhg) {
        this.A00 = abstractC8629Fhg;
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        onSharedElementsReadyListener.getClass();
        throw BV4.A0a("onSharedElementsArrived");
    }
}
