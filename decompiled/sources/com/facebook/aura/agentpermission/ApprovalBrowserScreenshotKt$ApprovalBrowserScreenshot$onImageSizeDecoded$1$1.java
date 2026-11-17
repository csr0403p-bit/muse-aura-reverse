package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ApprovalBrowserScreenshotKt$ApprovalBrowserScreenshot$onImageSizeDecoded$1$1 extends AbstractC7559F3s implements G0V<Integer, Integer, Unit> {
    public final /* synthetic */ MutableState<Float> $decodedAspectRatio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApprovalBrowserScreenshotKt$ApprovalBrowserScreenshot$onImageSizeDecoded$1$1(MutableState<Float> mutableState) {
        super(2);
        this.$decodedAspectRatio = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.$decodedAspectRatio.Af8(Float.valueOf(i / i2));
        }
    }
}
