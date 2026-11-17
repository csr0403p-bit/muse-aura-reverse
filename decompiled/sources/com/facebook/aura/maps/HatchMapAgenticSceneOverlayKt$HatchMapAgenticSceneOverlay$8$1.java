package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.AnonymousClass962;
import X.C1DG;
import X.C8j3;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$8$1 extends AbstractC7559F3s implements G0U<C1DG, Unit> {
    public final /* synthetic */ AnonymousClass962 $carouselStyle;
    public final /* synthetic */ G0U<C1DG, Unit> $onCarouselSectionHeightChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$8$1(G0U<? super C1DG, Unit> g0u, AnonymousClass962 anonymousClass962) {
        super(1);
        this.$onCarouselSectionHeightChanged = g0u;
        this.$carouselStyle = anonymousClass962;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg) {
        m1351invoke0680j_4(c1dg.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-0680j_4, reason: not valid java name */
    public final void m1351invoke0680j_4(float f) {
        G0U<C1DG, Unit> g0u = this.$onCarouselSectionHeightChanged;
        AnonymousClass962 anonymousClass962 = this.$carouselStyle;
        g0u.invoke(C8j3.A0k(f + anonymousClass962.A00 + anonymousClass962.A08));
    }
}
