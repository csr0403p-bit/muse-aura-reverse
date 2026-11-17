package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.skills.model.Skill;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class DisconnectConfirmationSheetKt$DisconnectConfirmationContent$2$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchSkillOAuthOrigin $origin;
    public final /* synthetic */ Skill $skill;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisconnectConfirmationSheetKt$DisconnectConfirmationContent$2$3$1(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, Skill skill, AuraNavigator auraNavigator) {
        super(0);
        this.$origin = hatchSkillOAuthOrigin;
        this.$skill = skill;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(this.$origin, HatchComponent.CANCEL_BUTTON, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), this.$skill.id));
        HatchConnectorQplLogger.INSTANCE.endDisconnectCancel();
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
