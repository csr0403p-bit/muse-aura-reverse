package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BL4;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$IdeaRowContent$contentHeightModifier$1$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ int $dividerTailHeightPx;
    public final /* synthetic */ int $iconHeightPx;
    public final /* synthetic */ G0U<Integer, Unit> $onContentHeightChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeasTabScreenKt$IdeaRowContent$contentHeightModifier$1$1(G0U<? super Integer, Unit> g0u, int i, int i2) {
        super(1);
        this.$onContentHeightChanged = g0u;
        this.$iconHeightPx = i;
        this.$dividerTailHeightPx = i2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m774invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m774invokeozmzZPI(long j) {
        AnonymousClass005.A0l(Math.max(this.$iconHeightPx, AnonymousClass002.A09(j) - this.$dividerTailHeightPx), this.$onContentHeightChanged);
    }
}
