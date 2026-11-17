package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$9$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $currentItemIsVideo;
    public final /* synthetic */ MutableState<Boolean> $isFullscreenMenuExpanded$delegate;
    public final /* synthetic */ MutableState<Boolean> $showFullscreenVideoControls$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerContent$9$1(boolean z, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$currentItemIsVideo = z;
        this.$showFullscreenVideoControls$delegate = mutableState;
        this.$isFullscreenMenuExpanded$delegate = mutableState2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        MutableState<Boolean> mutableState = this.$showFullscreenVideoControls$delegate;
        boolean z = !this.$currentItemIsVideo;
        float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
        MutableState.A09(z, mutableState);
        MutableState.A09(false, this.$isFullscreenMenuExpanded$delegate);
        return new C78g() { // from class: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerContent$9$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
