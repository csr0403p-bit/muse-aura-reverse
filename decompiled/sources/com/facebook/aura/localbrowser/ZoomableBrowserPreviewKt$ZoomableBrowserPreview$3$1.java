package com.facebook.aura.localbrowser;

import X.AWx;
import X.AnonymousClass001;
import X.BRr;
import X.EnumC10460Hji;
import X.G2j;
import X.HtJ;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ZoomableBrowserPreviewKt$ZoomableBrowserPreview$3$1 implements PointerInputEventHandler {
    public final /* synthetic */ BrowserPreviewTransform $state;

    public ZoomableBrowserPreviewKt$ZoomableBrowserPreview$3$1(BrowserPreviewTransform browserPreviewTransform) {
        this.$state = browserPreviewTransform;
    }

    public static final Unit invoke$lambda$0(BrowserPreviewTransform browserPreviewTransform, AWx aWx, AWx aWx2, float f, float f2) {
        browserPreviewTransform.m1203transformWko1d7g(aWx.A00, aWx2.A00, f);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
        final BrowserPreviewTransform browserPreviewTransform = this.$state;
        Object objA01 = ForEachGestureKt.A01(bRr, htJ, new TransformGestureDetectorKt$detectTransformGestures$2(null, new G2j() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$ZoomableBrowserPreview$3$1$$ExternalSyntheticLambda0
            @Override // X.G2j
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ZoomableBrowserPreviewKt$ZoomableBrowserPreview$3$1.invoke$lambda$0(browserPreviewTransform, (AWx) obj, (AWx) obj2, AnonymousClass001.A02(obj3), AnonymousClass001.A02(obj4));
            }
        }, false));
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        if (objA01 != enumC10460Hji) {
            objA01 = Unit.INSTANCE;
        }
        return objA01 != enumC10460Hji ? Unit.INSTANCE : objA01;
    }
}
