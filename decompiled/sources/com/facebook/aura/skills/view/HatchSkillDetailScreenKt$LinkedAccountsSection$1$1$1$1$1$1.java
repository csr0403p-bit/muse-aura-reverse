package com.facebook.aura.skills.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1$1$1 extends C7438Evz implements G0U<SkillLinkedAccountUiModel, Unit> {
    public HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1$1$1(Object obj) {
        super(1, obj, SkillLinkedAccountsViewModel.class, "showRemoveAccountDialog", "showRemoveAccountDialog(Lcom/facebook/aura/skills/viewmodel/SkillLinkedAccountUiModel;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(SkillLinkedAccountUiModel skillLinkedAccountUiModel) {
        ((SkillLinkedAccountsViewModel) AnonymousClass006.A0o(skillLinkedAccountUiModel, this)).showRemoveAccountDialog(skillLinkedAccountUiModel);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(SkillLinkedAccountUiModel skillLinkedAccountUiModel) {
        invoke2(skillLinkedAccountUiModel);
        return Unit.INSTANCE;
    }
}
