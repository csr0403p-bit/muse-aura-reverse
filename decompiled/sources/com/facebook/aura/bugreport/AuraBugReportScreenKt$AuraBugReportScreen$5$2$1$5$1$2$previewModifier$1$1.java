package com.facebook.aura.bugreport;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Uri> $annotationDecodeInFlightUri$delegate;
    public final /* synthetic */ String $annotationFailureToast;
    public final /* synthetic */ MutableState<ScreenshotAnnotationTarget> $annotationTarget$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ Uri $uri;

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1$1", f = "AuraBugReportScreen.kt", l = {388}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Uri> $annotationDecodeInFlightUri$delegate;
        public final /* synthetic */ String $annotationFailureToast;
        public final /* synthetic */ MutableState<ScreenshotAnnotationTarget> $annotationTarget$delegate;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Uri $uri;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str, Uri uri, MutableState<Uri> mutableState, MutableState<ScreenshotAnnotationTarget> mutableState2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$annotationFailureToast = str;
            this.$uri = uri;
            this.$annotationDecodeInFlightUri$delegate = mutableState;
            this.$annotationTarget$delegate = mutableState2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$annotationFailureToast, this.$uri, this.$annotationDecodeInFlightUri$delegate, this.$annotationTarget$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    C78T c78tA0y = AnonymousClass001.A0y();
                    AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1$1$bitmap$1 auraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1$1$bitmap$1 = new AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1$1$bitmap$1(this.$uri, null);
                    this.label = 1;
                    obj = GAo.A00(this, c78tA0y, auraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1$1$bitmap$1);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    Toast.makeText(this.$context, this.$annotationFailureToast, 0).show();
                } else {
                    this.$annotationTarget$delegate.Af8(new ScreenshotAnnotationTarget(this.$uri, bitmap));
                }
                return Unit.INSTANCE;
            } finally {
                MutableState<Uri> mutableState = this.$annotationDecodeInFlightUri$delegate;
                float f = AuraBugReportScreenKt.CLOSE_BUTTON_PADDING;
                mutableState.Af8(null);
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1$2$previewModifier$1$1(Uri uri, C3UX c3ux, MutableState<Uri> mutableState, Context context, String str, MutableState<ScreenshotAnnotationTarget> mutableState2) {
        super(0);
        this.$uri = uri;
        this.$scope = c3ux;
        this.$annotationDecodeInFlightUri$delegate = mutableState;
        this.$context = context;
        this.$annotationFailureToast = str;
        this.$annotationTarget$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.BUG_REPORT, HatchScreen.BUG_REPORT, HatchComponent.BUG_REPORT_ANNOTATE_IMAGE_BUTTON, null, null, null);
        MutableState<Uri> mutableState = this.$annotationDecodeInFlightUri$delegate;
        Uri uri = this.$uri;
        float f = AuraBugReportScreenKt.CLOSE_BUTTON_PADDING;
        mutableState.Af8(uri);
        AnonymousClass001.A1J(new AnonymousClass1(this.$context, this.$annotationFailureToast, this.$uri, this.$annotationDecodeInFlightUri$delegate, this.$annotationTarget$delegate, null), this.$scope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
