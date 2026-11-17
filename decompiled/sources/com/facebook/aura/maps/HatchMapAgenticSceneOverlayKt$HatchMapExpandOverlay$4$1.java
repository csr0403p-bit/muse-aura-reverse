package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMapAgenticSceneOverlayKt$HatchMapExpandOverlay$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<String, Unit> $onExpand;
    public final /* synthetic */ String $selectedArtifactId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMapAgenticSceneOverlayKt$HatchMapExpandOverlay$4$1(G0U<? super String, Unit> g0u, String str) {
        super(0);
        this.$onExpand = g0u;
        this.$selectedArtifactId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onExpand.invoke(this.$selectedArtifactId);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
