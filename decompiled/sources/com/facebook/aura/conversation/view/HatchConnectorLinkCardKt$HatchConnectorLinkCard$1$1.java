package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class HatchConnectorLinkCardKt$HatchConnectorLinkCard$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $sawDisconnected$delegate;
    public final /* synthetic */ C1BO<ConnectorCardState> $state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectorLinkCardKt$HatchConnectorLinkCard$1$1(C1BO<? extends ConnectorCardState> c1bo, MutableState<Boolean> mutableState) {
        super(1);
        this.$state$delegate = c1bo;
        this.$sawDisconnected$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$state$delegate.getValue() == ConnectorCardState.NotConnected) {
            MutableState.A09(true, this.$sawDisconnected$delegate);
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchConnectorLinkCardKt$HatchConnectorLinkCard$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
