package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.G0V;
import com.facebook.aura.skills.model.Skill;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$HatchSkillDetailContent$2$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Skill $connectedSkill;
    public final /* synthetic */ G0V<Skill, Boolean, Unit> $onAccountsCenterClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSkillDetailScreenKt$HatchSkillDetailContent$2$1$1(G0V<? super Skill, ? super Boolean, Unit> g0v, Skill skill) {
        super(1);
        this.$onAccountsCenterClick = g0v;
        this.$connectedSkill = skill;
    }

    public final void invoke(boolean z) {
        this.$onAccountsCenterClick.invoke(this.$connectedSkill, Boolean.valueOf(z));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
