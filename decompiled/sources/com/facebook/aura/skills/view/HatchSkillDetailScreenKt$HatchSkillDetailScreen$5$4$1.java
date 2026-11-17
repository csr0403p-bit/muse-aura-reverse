package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.C7438Evz;
import X.G0V;
import android.content.Context;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSkillDetailScreenKt$HatchSkillDetailScreen$5$4$1 extends AbstractC7559F3s implements G0V<Skill, Boolean, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ SkillLinkedAccountsViewModel $linkedAccountsViewModel;

    /* renamed from: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$HatchSkillDetailScreen$5$4$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, SkillLinkedAccountsViewModel.class, "refresh", "refresh()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((SkillLinkedAccountsViewModel) this.receiver).refresh();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillDetailScreenKt$HatchSkillDetailScreen$5$4$1(SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, Context context) {
        super(2);
        this.$linkedAccountsViewModel = skillLinkedAccountsViewModel;
        this.$context = context;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Skill skill, Boolean bool) {
        invoke(skill, AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(Skill skill, boolean z) {
        C7384Etj.A0Y(skill, 0);
        this.$linkedAccountsViewModel.onAccountsCenterTapped();
        HatchSkillDetailScreenKt.openFirstPartyAccountsCenter(this.$context, skill.id, z, new AnonymousClass1(this.$linkedAccountsViewModel));
    }
}
