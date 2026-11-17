package com.facebook.aura.bugreport;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraBugReportScreenKt$AuraBugReportScreen$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ ScreenshotAnnotationTarget $annotation;
    public final /* synthetic */ MutableState<ScreenshotAnnotationTarget> $annotationTarget$delegate;
    public final /* synthetic */ MutableState<List<Uri>> $imageUris$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        AuraBugReportScreenKt.logAnnotationClick(HatchComponent.SAVE_BUTTON);
        Uri uri = Uri.parse(str);
        MutableState<List<Uri>> mutableState = this.$imageUris$delegate;
        List<Uri> value = mutableState.getValue();
        ScreenshotAnnotationTarget screenshotAnnotationTarget = this.$annotation;
        ArrayList arrayListA0i = AnonymousClass003.A0i(value);
        for (Uri uri2 : value) {
            if (C7384Etj.areEqual(uri2, screenshotAnnotationTarget.uri)) {
                uri2 = uri;
            }
            arrayListA0i.add(uri2);
        }
        mutableState.Af8(arrayListA0i);
        this.$annotationTarget$delegate.Af8(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBugReportScreenKt$AuraBugReportScreen$2$1(MutableState<List<Uri>> mutableState, ScreenshotAnnotationTarget screenshotAnnotationTarget, MutableState<ScreenshotAnnotationTarget> mutableState2) {
        super(1);
        this.$imageUris$delegate = mutableState;
        this.$annotation = screenshotAnnotationTarget;
        this.$annotationTarget$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
