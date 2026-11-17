package com.facebook.aura.bugreport.screenshot;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import android.view.Window;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil$createScreenshotFile$result$1", f = "AuraBugReportScreenshotUtil.kt", l = {61}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class AuraBugReportScreenshotUtil$createScreenshotFile$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Integer>, Object> {
    public final /* synthetic */ Bitmap $bitmap;
    public final /* synthetic */ Window $window;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportScreenshotUtil$createScreenshotFile$result$1(Window window, Bitmap bitmap, HtJ<? super AuraBugReportScreenshotUtil$createScreenshotFile$result$1> htJ) {
        super(2, htJ);
        this.$window = window;
        this.$bitmap = bitmap;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraBugReportScreenshotUtil$createScreenshotFile$result$1(this.$window, this.$bitmap, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AuraBugReportScreenshotUtil auraBugReportScreenshotUtil = AuraBugReportScreenshotUtil.INSTANCE;
            Window window = this.$window;
            Bitmap bitmap = this.$bitmap;
            this.label = 1;
            obj = auraBugReportScreenshotUtil.copyWindowPixels(window, bitmap, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Integer> htJ) {
        return ((AuraBugReportScreenshotUtil$createScreenshotFile$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
