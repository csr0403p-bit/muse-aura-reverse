package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.navigation.key.HatchSkillDetailScreenKey;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.viewmodel.SkillAccountsUiState;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSkillDetailScreenKt$HatchSkillDetailContent$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ Skill $connectedSkill;
    public final /* synthetic */ boolean $isSkillLoading;
    public final /* synthetic */ SkillAccountsUiState $linkedAccountsUiState;
    public final /* synthetic */ SkillLinkedAccountsViewModel $linkedAccountsViewModel;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<Skill, Boolean, Unit> $onAccountsCenterClick;
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ HatchSkillDetailScreenKey $sourceSkillKey;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSkillDetailScreenKt$HatchSkillDetailContent$3(Skill skill, SkillAccountsUiState skillAccountsUiState, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel, boolean z, Function0<Unit> function0, float f, float f2, HatchSkillDetailScreenKey hatchSkillDetailScreenKey, G0V<? super Skill, ? super Boolean, Unit> g0v, BRg bRg, int i, int i2) {
        super(2);
        this.$connectedSkill = skill;
        this.$linkedAccountsUiState = skillAccountsUiState;
        this.$linkedAccountsViewModel = skillLinkedAccountsViewModel;
        this.$isSkillLoading = z;
        this.$onRetry = function0;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$sourceSkillKey = hatchSkillDetailScreenKey;
        this.$onAccountsCenterClick = g0v;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchSkillDetailScreenKt.m2161HatchSkillDetailContent_UtchM0(this.$connectedSkill, this.$linkedAccountsUiState, this.$linkedAccountsViewModel, this.$isSkillLoading, this.$onRetry, this.$topPadding, this.$bottomPadding, this.$sourceSkillKey, this.$onAccountsCenterClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
