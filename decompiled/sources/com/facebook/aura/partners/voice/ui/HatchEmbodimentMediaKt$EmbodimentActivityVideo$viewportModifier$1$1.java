package com.facebook.aura.partners.voice.ui;

import X.AWA;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.BL4;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchEmbodimentMediaKt$EmbodimentActivityVideo$viewportModifier$1$1 extends AbstractC7559F3s implements G0U<BL4, Unit> {
    public final /* synthetic */ G0U<AWA, Unit> $onViewportChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$EmbodimentActivityVideo$viewportModifier$1$1(G0U<? super AWA, Unit> g0u) {
        super(1);
        this.$onViewportChanged = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(BL4 bl4) {
        m1811invokeozmzZPI(bl4.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m1811invokeozmzZPI(long j) {
        this.$onViewportChanged.invoke(new AWA(AnonymousClass005.A0M((int) (j >> 32), (int) (j & 4294967295L))));
    }
}
