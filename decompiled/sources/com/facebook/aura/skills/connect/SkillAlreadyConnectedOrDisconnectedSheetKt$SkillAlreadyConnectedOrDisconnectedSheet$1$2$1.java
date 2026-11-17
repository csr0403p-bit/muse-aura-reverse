package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.navigation.key.SkillAlreadyConnectedOrDisconnectedSheetKey;
import com.facebook.aura.skills.model.Skill;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SkillAlreadyConnectedOrDisconnectedSheetKt$SkillAlreadyConnectedOrDisconnectedSheet$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SkillAlreadyConnectedOrDisconnectedSheetKey $navKey;
    public final /* synthetic */ ConnectorSettingsDestinationViewModel $settings;
    public final /* synthetic */ Skill $skill;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillAlreadyConnectedOrDisconnectedSheetKt$SkillAlreadyConnectedOrDisconnectedSheet$1$2$1(SkillAlreadyConnectedOrDisconnectedSheetKey skillAlreadyConnectedOrDisconnectedSheetKey, Skill skill, ConnectorSettingsDestinationViewModel connectorSettingsDestinationViewModel) {
        super(0);
        this.$navKey = skillAlreadyConnectedOrDisconnectedSheetKey;
        this.$skill = skill;
        this.$settings = connectorSettingsDestinationViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(this.$navKey.origin, HatchComponent.CONNECTORS_BUTTON, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), this.$skill.id));
        this.$settings.onGoToSettings(this.$skill.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
