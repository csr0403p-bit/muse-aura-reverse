package com.facebook.aura.skills.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C78N;
import X.G0W;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.model.Skill;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$2$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Skill $skill;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$2$1$1$1(Skill skill, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz) {
        super(3);
        this.$skill = skill;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            Skill skill = this.$skill;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$skill, AnonymousClass001.A1T(bfm, this.$userSession, bfm.A67(this.$navigator)));
            AuraNavigator auraNavigator = this.$navigator;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            Skill skill2 = this.$skill;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$2$1$1$1$1$1(auraNavigator, abstractC3358CGz, skill2);
                bfm.Ai0(objAaT);
            }
            ConnectorRowKt.ConnectorRow(skill, null, null, null, (Function0) objAaT, ComposableSingletons$HatchConnectorPermissionsListScreenKt.f288lambda$39988686, bfm, 196608, 14);
            return;
        }
        bfm.Afo();
    }
}
