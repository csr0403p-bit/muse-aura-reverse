package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBackgroundWorkKt$captureLocalBrowserNotificationPreview$2$1", f = "LocalBrowserBackgroundWork.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserBackgroundWorkKt$captureLocalBrowserNotificationPreview$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
    public final /* synthetic */ Bitmap $it;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserBackgroundWorkKt$captureLocalBrowserNotificationPreview$2$1(Bitmap bitmap, HtJ<? super LocalBrowserBackgroundWorkKt$captureLocalBrowserNotificationPreview$2$1> htJ) {
        super(2, htJ);
        this.$it = bitmap;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserBackgroundWorkKt$captureLocalBrowserNotificationPreview$2$1(this.$it, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return LocalBrowserBackgroundWorkKt.fitWithin(this.$it, 480);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
        return new LocalBrowserBackgroundWorkKt$captureLocalBrowserNotificationPreview$2$1(this.$it, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
