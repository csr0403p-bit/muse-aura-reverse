package com.facebook.aura.ageverification;

import X.BV7;
import X.C2678Bha;
import X.C7Bm;
import X.GBL;
import X.HtJ;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public abstract class CameraProviderKt {
    public static final Object awaitCameraProvider(Context context, HtJ<? super C2678Bha> htJ) {
        final GBL gblA03 = C7Bm.A03(htJ);
        final ListenableFuture<C2678Bha> listenableFutureA00 = C2678Bha.A00(context);
        listenableFutureA00.addListener(new Runnable() { // from class: com.facebook.aura.ageverification.CameraProviderKt$awaitCameraProvider$2$1
            @Override // java.lang.Runnable
            public final void run() {
                if (gblA03.isActive()) {
                    try {
                        gblA03.resumeWith(listenableFutureA00.get());
                    } catch (Exception e) {
                        BV7.A1K(e, gblA03);
                    }
                }
            }
        }, context.getMainExecutor());
        return gblA03.A0F();
    }
}
