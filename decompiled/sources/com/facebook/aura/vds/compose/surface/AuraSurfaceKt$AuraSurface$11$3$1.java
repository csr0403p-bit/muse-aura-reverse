package com.facebook.aura.vds.compose.surface;

import X.AbstractC7559F3s;
import X.B6A;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSurfaceKt$AuraSurface$11$3$1 extends AbstractC7559F3s implements Function0<B6A> {
    public final /* synthetic */ long $color;
    public final /* synthetic */ float $contentAlpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSurfaceKt$AuraSurface$11$3$1(long j, float f) {
        super(0);
        this.$color = j;
        this.$contentAlpha = f;
    }

    /* renamed from: invoke-0d7_KjU, reason: not valid java name */
    public final long m2630invoke0d7_KjU() {
        return AuraSurfaceKt.m2628applyContentAlphaDxMtmZc(this.$color, this.$contentAlpha);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ B6A invoke() {
        return new B6A(m2630invoke0d7_KjU());
    }
}
