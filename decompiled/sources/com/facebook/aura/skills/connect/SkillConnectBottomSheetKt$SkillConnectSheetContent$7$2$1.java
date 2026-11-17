package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SkillConnectBottomSheetKt$SkillConnectSheetContent$7$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ HatchSkillOAuthOrigin $origin;
    public final /* synthetic */ SkillConnectViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$viewModel.toggleAccountSelection(str, this.$origin);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillConnectBottomSheetKt$SkillConnectSheetContent$7$2$1(SkillConnectViewModel skillConnectViewModel, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        super(1);
        this.$viewModel = skillConnectViewModel;
        this.$origin = hatchSkillOAuthOrigin;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
