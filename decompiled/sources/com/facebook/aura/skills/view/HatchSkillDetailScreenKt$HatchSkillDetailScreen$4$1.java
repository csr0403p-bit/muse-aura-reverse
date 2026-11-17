package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$HatchSkillDetailScreen$4$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ Skill $connectedSkill;
    public final /* synthetic */ SkillLinkedAccountsViewModel $linkedAccountsViewModel;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        this.$linkedAccountsViewModel.refreshAccountsForSkillIfSupported(this.$connectedSkill);
        return new InterfaceC06807bD() { // from class: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$HatchSkillDetailScreen$4$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillDetailScreenKt$HatchSkillDetailScreen$4$1(SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, Skill skill) {
        super(1);
        this.$linkedAccountsViewModel = skillLinkedAccountsViewModel;
        this.$connectedSkill = skill;
    }
}
