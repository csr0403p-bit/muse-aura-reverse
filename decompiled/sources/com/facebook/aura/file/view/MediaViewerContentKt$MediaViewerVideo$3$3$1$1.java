package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerVideo$3$3$1$1 extends AbstractC7559F3s implements G0U<Float, Unit> {
    public final /* synthetic */ MediaViewerVideoAspectRatio $aspectRatio;
    public final /* synthetic */ MutableState<Boolean> $hasRendered$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerVideo$3$3$1$1(MediaViewerVideoAspectRatio mediaViewerVideoAspectRatio, MutableState<Boolean> mutableState) {
        super(1);
        this.$aspectRatio = mediaViewerVideoAspectRatio;
        this.$hasRendered$delegate = mutableState;
    }

    public final void invoke(float f) {
        MutableState<Boolean> mutableState = this.$hasRendered$delegate;
        float f2 = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
        if (MutableState.A0A((MutableState) mutableState)) {
            return;
        }
        this.$aspectRatio.update(f, false);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(AnonymousClass001.A02(f));
        return Unit.INSTANCE;
    }
}
