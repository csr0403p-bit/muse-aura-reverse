package com.facebook.aura.skills.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.skills.model.Skill;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$2$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Skill $skill;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectorPermissionsListScreenKt$HatchConnectorPermissionsListScreen$1$1$2$1$1$1$1$1(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, Skill skill) {
        super(0);
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$skill = skill;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchConnectorPermissionsListScreenKt.openConnectorPermissions(this.$navigator, this.$userSession, this.$skill.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
