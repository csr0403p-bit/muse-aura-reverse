package com.facebook.aura.vds.compose.image;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraImageKt$ThumbnailGenerationRecovery$1$1$retryAction$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraImagePainter $painter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraImageKt$ThumbnailGenerationRecovery$1$1$retryAction$1(AuraImagePainter auraImagePainter) {
        super(0);
        this.$painter = auraImagePainter;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws NumberFormatException {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws NumberFormatException {
        this.$painter.retry();
    }
}
