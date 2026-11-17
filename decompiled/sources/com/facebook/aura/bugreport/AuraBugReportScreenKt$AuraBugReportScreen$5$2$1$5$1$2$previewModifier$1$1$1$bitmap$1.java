package com.facebook.aura.bugreport;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1$1$bitmap$1", f = "AuraBugReportScreen.kt", l = {388}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1$1$bitmap$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
    public final /* synthetic */ Uri $uri;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1$1$bitmap$1(Uri uri, HtJ<? super AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1$1$bitmap$1> htJ) {
        super(2, htJ);
        this.$uri = uri;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1$1$bitmap$1(this.$uri, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws NumberFormatException {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Uri uri = this.$uri;
            this.label = 1;
            obj = AuraBugReportScreenKt.decodeScreenshotBitmap(uri, this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
        return new AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1$1$bitmap$1(this.$uri, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
