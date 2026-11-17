package com.facebook.aura.localbrowser;

import X.BL4;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class ZoomableBrowserPreviewKt$ZoomableBrowserPreview$1$1 extends C7438Evz implements G0U<BL4, Unit> {
    public ZoomableBrowserPreviewKt$ZoomableBrowserPreview$1$1(Object obj) {
        super(1, obj, BrowserPreviewTransform.class, "resize", "resize-ozmzZPI(J)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m1242invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1242invokeozmzZPI(long j) {
        ((BrowserPreviewTransform) this.receiver).m1202resizeozmzZPI(j);
    }
}
