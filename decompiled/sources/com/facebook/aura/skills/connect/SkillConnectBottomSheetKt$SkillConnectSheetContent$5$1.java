package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.skills.model.Skill;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SkillConnectBottomSheetKt$SkillConnectSheetContent$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchComponent $cancelComponent;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ HatchSkillOAuthOrigin $origin;
    public final /* synthetic */ Skill $skill;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillConnectBottomSheetKt$SkillConnectSheetContent$5$1(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HatchComponent hatchComponent, Skill skill, Function0<Unit> function0) {
        super(0);
        this.$origin = hatchSkillOAuthOrigin;
        this.$cancelComponent = hatchComponent;
        this.$skill = skill;
        this.$onDismiss = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(this.$origin, this.$cancelComponent, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), this.$skill.id));
        this.$onDismiss.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
