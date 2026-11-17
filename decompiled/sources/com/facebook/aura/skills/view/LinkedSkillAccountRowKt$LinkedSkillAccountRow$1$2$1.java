package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LinkedSkillAccountRowKt$LinkedSkillAccountRow$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SkillLinkedAccountUiModel $account;
    public final /* synthetic */ G0U<SkillLinkedAccountUiModel, Unit> $onRemoveAccountClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LinkedSkillAccountRowKt$LinkedSkillAccountRow$1$2$1(G0U<? super SkillLinkedAccountUiModel, Unit> g0u, SkillLinkedAccountUiModel skillLinkedAccountUiModel) {
        super(0);
        this.$onRemoveAccountClick = g0u;
        this.$account = skillLinkedAccountUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onRemoveAccountClick.invoke(this.$account);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
