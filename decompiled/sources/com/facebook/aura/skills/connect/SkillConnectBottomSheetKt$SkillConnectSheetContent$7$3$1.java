package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SkillConnectBottomSheetKt$SkillConnectSheetContent$7$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchSkillOAuthOrigin $origin;
    public final /* synthetic */ SkillConnectViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillConnectBottomSheetKt$SkillConnectSheetContent$7$3$1(SkillConnectViewModel skillConnectViewModel, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        super(0);
        this.$viewModel = skillConnectViewModel;
        this.$origin = hatchSkillOAuthOrigin;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onAccountsChipClicked(this.$origin);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
