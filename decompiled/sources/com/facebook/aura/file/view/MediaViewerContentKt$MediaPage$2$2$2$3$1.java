package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.BL4;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaPage$2$2$2$3$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ ZoomState $zoomState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaPage$2$2$2$3$1(ZoomState zoomState) {
        super(1);
        this.$zoomState = zoomState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m919invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m919invokeozmzZPI(long j) {
        this.$zoomState.mediaSize = j;
    }
}
