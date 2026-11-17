package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchImageOptionsWidgetKt$HatchImageOptionsWidget$onPreview$1$1 extends AbstractC7559F3s implements G0U<ImageOptionPreviewRequest, Unit> {
    public final /* synthetic */ MutableState<ImageOptionPreviewRequest> $previewRequest$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ImageOptionPreviewRequest imageOptionPreviewRequest) {
        C7384Etj.A0Y(imageOptionPreviewRequest, 0);
        this.$previewRequest$delegate.Af8(imageOptionPreviewRequest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionsWidgetKt$HatchImageOptionsWidget$onPreview$1$1(MutableState<ImageOptionPreviewRequest> mutableState) {
        super(1);
        this.$previewRequest$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ImageOptionPreviewRequest imageOptionPreviewRequest) {
        invoke2(imageOptionPreviewRequest);
        return Unit.INSTANCE;
    }
}
