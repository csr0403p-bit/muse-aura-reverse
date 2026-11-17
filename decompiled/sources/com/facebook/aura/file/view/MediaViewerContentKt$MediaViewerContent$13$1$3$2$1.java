package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$13$1$3$2$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ MutableState<Boolean> $showFullscreenVideoControls$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerContent$13$1$3$2$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$showFullscreenVideoControls$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        MutableState<Boolean> mutableState = this.$showFullscreenVideoControls$delegate;
        float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
        MutableState.A09(z, mutableState);
    }
}
