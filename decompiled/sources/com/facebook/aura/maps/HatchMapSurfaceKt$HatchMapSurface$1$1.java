package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C9n4;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMapSurfaceKt$HatchMapSurface$1$1 extends AbstractC7559F3s implements G0U<C9n4, Unit> {
    public final /* synthetic */ G0U<C9n4, Unit> $onMapRelease;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMapSurfaceKt$HatchMapSurface$1$1(G0U<? super C9n4, Unit> g0u) {
        super(1);
        this.$onMapRelease = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C9n4 c9n4) {
        invoke2(c9n4);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C9n4 c9n4) {
        if (c9n4 != null) {
            this.$onMapRelease.invoke(c9n4);
        }
    }
}
