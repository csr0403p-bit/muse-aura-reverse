package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$13$1$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isCurrentPage;
    public final /* synthetic */ MutableState<Boolean> $isCurrentPageZoomed$delegate;
    public final /* synthetic */ ZoomState $zoomState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerContent$13$1$1$1(boolean z, ZoomState zoomState, MutableState<Boolean> mutableState) {
        super(1);
        this.$isCurrentPage = z;
        this.$zoomState = zoomState;
        this.$isCurrentPageZoomed$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$isCurrentPage) {
            MutableState<Boolean> mutableState = this.$isCurrentPageZoomed$delegate;
            boolean zA0F = C1BO.A0F(this.$zoomState.isZoomed$delegate);
            float f = MediaViewerContentKt.CONTROLS_SCRIM_ALPHA;
            MutableState.A09(zA0F, mutableState);
        }
        return new C78g() { // from class: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerContent$13$1$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
