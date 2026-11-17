package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerVideo$3$1$1 extends AbstractC7559F3s implements G0V<Integer, Integer, Unit> {
    public final /* synthetic */ MediaViewerVideoAspectRatio $aspectRatio;
    public final /* synthetic */ ZoomState $zoomState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerVideo$3$1$1(MediaViewerVideoAspectRatio mediaViewerVideoAspectRatio, ZoomState zoomState) {
        super(2);
        this.$aspectRatio = mediaViewerVideoAspectRatio;
        this.$zoomState = zoomState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.$aspectRatio.update(i / i2, true);
            this.$zoomState.mediaSize = AnonymousClass002.A0G(i2, i << 32);
        }
    }
}
