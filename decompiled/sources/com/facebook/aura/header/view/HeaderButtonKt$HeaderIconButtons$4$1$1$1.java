package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.BL4;
import X.C00r;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HeaderButtonKt$HeaderIconButtons$4$1$1$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ C00r $contentWidth$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderButtonKt$HeaderIconButtons$4$1$1$1(C00r c00r) {
        super(1);
        this.$contentWidth$delegate = c00r;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m1036invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1036invokeozmzZPI(long j) {
        this.$contentWidth$delegate.AdX((int) (j >> 32));
    }
}
