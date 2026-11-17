package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.C6t6;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.spaces.preload.SpacesInitialDataBridge;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpaceSnapshotRenderer$render$2$1$1 extends AbstractC7559F3s implements G0U<C6t6, Unit> {
    public final /* synthetic */ SpacesInitialDataBridge $initialDataBridge;
    public final /* synthetic */ G0U<C6t6, Unit> $installActionBridge;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6t6 c6t6) {
        C7384Etj.A0Y(c6t6, 0);
        c6t6.removeJavascriptInterface(SpaceSnapshotRendererKt.INITIAL_DATA_BRIDGE);
        c6t6.addJavascriptInterface(this.$initialDataBridge, SpaceSnapshotRendererKt.INITIAL_DATA_BRIDGE);
        this.$initialDataBridge.secureWebView = c6t6;
        this.$installActionBridge.invoke(c6t6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpaceSnapshotRenderer$render$2$1$1(SpacesInitialDataBridge spacesInitialDataBridge, G0U<? super C6t6, Unit> g0u) {
        super(1);
        this.$initialDataBridge = spacesInitialDataBridge;
        this.$installActionBridge = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C6t6 c6t6) {
        invoke2(c6t6);
        return Unit.INSTANCE;
    }
}
