package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchSkillDetailScreenKey;
import com.facebook.aura.skills.model.Skill;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$HatchSkillDetailContent$2$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Skill $connectedSkill;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchSkillDetailScreenKey $sourceSkillKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillDetailScreenKt$HatchSkillDetailContent$2$3$1(Skill skill, AuraNavigator auraNavigator, HatchSkillDetailScreenKey hatchSkillDetailScreenKey) {
        super(0);
        this.$connectedSkill = skill;
        this.$navigator = auraNavigator;
        this.$sourceSkillKey = hatchSkillDetailScreenKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchSkillDetailScreenKt.handleDisconnectSkill(this.$connectedSkill, this.$navigator, this.$sourceSkillKey);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
