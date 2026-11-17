package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.skills.model.Skill;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConnectorLinkCardViewModel$uiState$1$1", f = "HatchConnectorLinkCardViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectorLinkCardViewModel$uiState$1$1 extends AbstractC07127nr implements G0W<Skill, HatchGatewayConnectionState, HtJ<? super HxE<? extends Skill, ? extends Boolean>>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public HatchConnectorLinkCardViewModel$uiState$1$1(HtJ<? super HatchConnectorLinkCardViewModel$uiState$1$1> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(Skill skill, HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super HxE<? extends Skill, ? extends Boolean>> htJ) {
        return invoke2(skill, hatchGatewayConnectionState, (HtJ<? super HxE<Skill, Boolean>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        Object obj3 = this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return AnonymousClass002.A0q(obj2, obj3 instanceof HatchGatewayConnectionState.Connected);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Skill skill, HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super HxE<Skill, Boolean>> htJ) {
        HatchConnectorLinkCardViewModel$uiState$1$1 hatchConnectorLinkCardViewModel$uiState$1$1 = new HatchConnectorLinkCardViewModel$uiState$1$1(htJ);
        hatchConnectorLinkCardViewModel$uiState$1$1.L$0 = skill;
        hatchConnectorLinkCardViewModel$uiState$1$1.L$1 = hatchGatewayConnectionState;
        return hatchConnectorLinkCardViewModel$uiState$1$1.invokeSuspend(Unit.INSTANCE);
    }
}
