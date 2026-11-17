package com.facebook.aura.common.image;

import X.AbstractC7559F3s;
import X.C78T;
import X.G0W;
import android.graphics.Bitmap;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class AuraBitmapLoader$load$2$1$onNewResultImpl$1 extends AbstractC7559F3s implements G0W<Throwable, Bitmap, C78T, Unit> {
    public static final AuraBitmapLoader$load$2$1$onNewResultImpl$1 INSTANCE = new AuraBitmapLoader$load$2$1$onNewResultImpl$1();

    public AuraBitmapLoader$load$2$1$onNewResultImpl$1() {
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
