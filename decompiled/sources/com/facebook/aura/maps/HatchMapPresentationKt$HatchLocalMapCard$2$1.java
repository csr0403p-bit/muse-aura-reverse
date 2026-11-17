package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMapPresentationKt$HatchLocalMapCard$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ G0U<String, Unit> $onArtifactSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMapPresentationKt$HatchLocalMapCard$2$1(G0U<? super String, Unit> g0u) {
        super(1);
        this.$onArtifactSelected = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        if (str != null) {
            this.$onArtifactSelected.invoke(str);
        }
    }
}
