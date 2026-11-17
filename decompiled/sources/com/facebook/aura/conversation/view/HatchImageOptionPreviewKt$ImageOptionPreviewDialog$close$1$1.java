package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewDialog$close$1$1 extends AbstractC7559F3s implements G0U<ImageOptionPreviewExit, Unit> {
    public final /* synthetic */ MutableState<ImageOptionPreviewExit> $exit$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ImageOptionPreviewExit imageOptionPreviewExit) {
        C7384Etj.A0Y(imageOptionPreviewExit, 0);
        if (this.$exit$delegate.getValue() == null) {
            this.$exit$delegate.Af8(imageOptionPreviewExit);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$ImageOptionPreviewDialog$close$1$1(MutableState<ImageOptionPreviewExit> mutableState) {
        super(1);
        this.$exit$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ImageOptionPreviewExit imageOptionPreviewExit) {
        invoke2(imageOptionPreviewExit);
        return Unit.INSTANCE;
    }
}
