package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchExternalLinkCardKt$ExternalLinkPreviewImage$1$1$1 extends AbstractC7559F3s implements G0U<Float, Unit> {
    public final /* synthetic */ MutableState<Float> $imageAspectRatio$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchExternalLinkCardKt$ExternalLinkPreviewImage$1$1$1(MutableState<Float> mutableState) {
        super(1);
        this.$imageAspectRatio$delegate = mutableState;
    }

    public final void invoke(float f) {
        MutableState<Float> mutableState = this.$imageAspectRatio$delegate;
        Float fValueOf = Float.valueOf(f);
        float f2 = HatchExternalLinkCardKt.CardWidthFraction;
        mutableState.Af8(fValueOf);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(AnonymousClass001.A02(f));
        return Unit.INSTANCE;
    }
}
