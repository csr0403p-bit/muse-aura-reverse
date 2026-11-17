package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C00q;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$VideoPlaybackControls$onProgressChanged$1$1 extends AbstractC7559F3s implements G0U<Float, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isSeeking$delegate;
    public final /* synthetic */ C00q $seekProgress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$VideoPlaybackControls$onProgressChanged$1$1(MutableState<Boolean> mutableState, C00q c00q) {
        super(1);
        this.$isSeeking$delegate = mutableState;
        this.$seekProgress$delegate = c00q;
    }

    public final void invoke(float f) {
        MutableState<Boolean> mutableState = this.$isSeeking$delegate;
        float f2 = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
        MutableState.A09(true, mutableState);
        this.$seekProgress$delegate.AdS(f);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(AnonymousClass001.A02(f));
        return Unit.INSTANCE;
    }
}
