package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public interface Ej6 extends InterfaceC7256Ejf<C2eL> {
    void onFailure(long j, Drawable drawable, Throwable th);

    void onFinalImageSet(long j, int i, C2eL c2eL, Drawable drawable);

    void onIntermediateImageFailed(long j, Throwable th);

    void onIntermediateImageSet(long j, C2eL c2eL);

    void onPlaceholderSet(long j, Drawable drawable);

    void onRelease(long j);

    void onSubmit(long j, Object obj);
}
