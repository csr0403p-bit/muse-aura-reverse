package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.ccv.CcvBloksHelperKt;
import com.facebook.aura.ccv.HatchAccountLinkingTarget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SkillConnectBottomSheetKt$SkillConnectSheetContent$7$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAccountLinkingTarget $accountLinkingTarget;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchSkillOAuthOrigin $origin;
    public final /* synthetic */ SkillConnectViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillConnectBottomSheetKt$SkillConnectSheetContent$7$1$1(SkillConnectViewModel skillConnectViewModel, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, HatchAccountLinkingTarget hatchAccountLinkingTarget, Context context) {
        super(0);
        this.$viewModel = skillConnectViewModel;
        this.$origin = hatchSkillOAuthOrigin;
        this.$accountLinkingTarget = hatchAccountLinkingTarget;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.onAddAccountTapped(this.$origin);
        HatchAccountLinkingTarget hatchAccountLinkingTarget = this.$accountLinkingTarget;
        if (hatchAccountLinkingTarget != null) {
            CcvBloksHelperKt.openAccountLinkingUpsellBloksScreen(this.$context, hatchAccountLinkingTarget, false, CcvBloksHelperKt.AnonymousClass1.INSTANCE, new SkillConnectBottomSheetKt$SkillConnectSheetContent$7$1$1$1$1(this.$viewModel));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
