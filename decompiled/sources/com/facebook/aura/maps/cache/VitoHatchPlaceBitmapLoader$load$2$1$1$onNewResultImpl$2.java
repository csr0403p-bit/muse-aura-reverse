package com.facebook.aura.maps.cache;

import X.AbstractC7559F3s;
import X.C78T;
import X.G0W;
import android.graphics.Bitmap;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class VitoHatchPlaceBitmapLoader$load$2$1$1$onNewResultImpl$2 extends AbstractC7559F3s implements G0W<Throwable, Bitmap, C78T, Unit> {
    public static final VitoHatchPlaceBitmapLoader$load$2$1$1$onNewResultImpl$2 INSTANCE = new VitoHatchPlaceBitmapLoader$load$2$1$1$onNewResultImpl$2();

    public VitoHatchPlaceBitmapLoader$load$2$1$1$onNewResultImpl$2() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th, Bitmap bitmap, C78T c78t) {
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th, Bitmap bitmap, C78T c78t) {
        if (bitmap != null) {
            bitmap.recycle();
        }
    }
}
