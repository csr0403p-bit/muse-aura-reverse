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

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserBackgroundWorkKt$captureLocalBrowserNotificationPreview$unchanged$1", f = "LocalBrowserBackgroundWork.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserBackgroundWorkKt$captureLocalBrowserNotificationPreview$unchanged$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ Bitmap $captured;
    public final /* synthetic */ Bitmap $previous;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserBackgroundWorkKt$captureLocalBrowserNotificationPreview$unchanged$1(Bitmap bitmap, Bitmap bitmap2, HtJ<? super LocalBrowserBackgroundWorkKt$captureLocalBrowserNotificationPreview$unchanged$1> htJ) {
        super(2, htJ);
        this.$previous = bitmap;
        this.$captured = bitmap2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserBackgroundWorkKt$captureLocalBrowserNotificationPreview$unchanged$1(this.$previous, this.$captured, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return Boolean.valueOf(this.$previous.sameAs(this.$captured));
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((LocalBrowserBackgroundWorkKt$captureLocalBrowserNotificationPreview$unchanged$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
