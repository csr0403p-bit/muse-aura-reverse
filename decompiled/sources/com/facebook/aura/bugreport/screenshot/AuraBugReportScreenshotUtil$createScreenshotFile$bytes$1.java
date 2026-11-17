package com.facebook.aura.bugreport.screenshot;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil$createScreenshotFile$bytes$1", f = "AuraBugReportScreenshotUtil.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class AuraBugReportScreenshotUtil$createScreenshotFile$bytes$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
    public final /* synthetic */ Bitmap $bitmap;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportScreenshotUtil$createScreenshotFile$bytes$1(Bitmap bitmap, HtJ<? super AuraBugReportScreenshotUtil$createScreenshotFile$bytes$1> htJ) {
        super(2, htJ);
        this.$bitmap = bitmap;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraBugReportScreenshotUtil$createScreenshotFile$bytes$1(this.$bitmap, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
        return new AuraBugReportScreenshotUtil$createScreenshotFile$bytes$1(this.$bitmap, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return AuraBugReportScreenshotUtil.INSTANCE.encodeJpeg(this.$bitmap);
    }
}
