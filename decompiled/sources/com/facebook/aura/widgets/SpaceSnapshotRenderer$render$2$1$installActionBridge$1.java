package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import X.C6t6;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.spaces.preload.SpacesActionResponseBridge;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpaceSnapshotRenderer$render$2$1$installActionBridge$1 extends AbstractC7559F3s implements G0U<C6t6, Unit> {
    public final /* synthetic */ SpacesActionResponseBridge $actionBridge;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C6t6 c6t6) {
        C7384Etj.A0Y(c6t6, 0);
        c6t6.removeJavascriptInterface(SpaceSnapshotRendererKt.ACTION_RESPONSE_BRIDGE);
        c6t6.addJavascriptInterface(this.$actionBridge, SpaceSnapshotRendererKt.ACTION_RESPONSE_BRIDGE);
        this.$actionBridge.secureWebView = c6t6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceSnapshotRenderer$render$2$1$installActionBridge$1(SpacesActionResponseBridge spacesActionResponseBridge) {
        super(1);
        this.$actionBridge = spacesActionResponseBridge;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C6t6 c6t6) {
        invoke2(c6t6);
        return Unit.INSTANCE;
    }
}
