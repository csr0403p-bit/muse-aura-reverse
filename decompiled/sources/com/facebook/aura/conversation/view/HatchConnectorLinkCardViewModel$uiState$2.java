package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel$uiState$2", f = "HatchConnectorLinkCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectorLinkCardViewModel$uiState$2 extends AbstractC07127nr implements G0W<ConnectorCardState, Boolean, HtJ<? super ConnectorCardState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    public HatchConnectorLinkCardViewModel$uiState$2(HtJ<? super HatchConnectorLinkCardViewModel$uiState$2> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(ConnectorCardState connectorCardState, Boolean bool, HtJ<? super ConnectorCardState> htJ) {
        return invoke(connectorCardState, AnonymousClass001.A1X(bool), htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        boolean z = this.Z$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return z ? ConnectorCardState.Connected : obj2;
    }

    public final Object invoke(ConnectorCardState connectorCardState, boolean z, HtJ<? super ConnectorCardState> htJ) {
        HatchConnectorLinkCardViewModel$uiState$2 hatchConnectorLinkCardViewModel$uiState$2 = new HatchConnectorLinkCardViewModel$uiState$2(htJ);
        hatchConnectorLinkCardViewModel$uiState$2.L$0 = connectorCardState;
        hatchConnectorLinkCardViewModel$uiState$2.Z$0 = z;
        return hatchConnectorLinkCardViewModel$uiState$2.invokeSuspend(Unit.INSTANCE);
    }
}
