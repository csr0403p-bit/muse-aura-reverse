package com.facebook.aura.skills.viewmodel;

import X.AnonymousClass001;
import X.F2X;
import X.G2j;
import X.HtJ;
import com.facebook.aura.skills.model.Skill;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchConnectorLookupViewModel$uiState$1 extends F2X implements G2j {
    public HatchConnectorLookupViewModel$uiState$1(Object obj) {
        super(4, obj, HatchConnectorLookupViewModel.class, "present", "present(Lcom/facebook/aura/skills/model/Skill;ZLcom/facebook/aura/skills/viewmodel/DirectSignInState;)Lcom/facebook/aura/skills/viewmodel/ConnectorLookupUiState;", 4);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((HatchConnectorLookupViewModel) this.receiver).present((Skill) obj, AnonymousClass001.A1X(obj2), (DirectSignInState) obj3);
    }

    public final Object invoke(Skill skill, boolean z, DirectSignInState directSignInState, HtJ<? super ConnectorLookupUiState> htJ) {
        return ((HatchConnectorLookupViewModel) this.receiver).present(skill, z, directSignInState);
    }
}
