package com.facebook.aura.widgets;

import X.AbstractC7559F3s;
import com.facebook.aura.spaces.preload.SpacesActionResponseBridge;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SpaceSnapshotRenderer$render$2$1$2 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ SpacesActionResponseBridge $actionBridge;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceSnapshotRenderer$render$2$1$2(SpacesActionResponseBridge spacesActionResponseBridge) {
        super(0);
        this.$actionBridge = spacesActionResponseBridge;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$actionBridge.getHasOutstandingRequests());
    }
}
