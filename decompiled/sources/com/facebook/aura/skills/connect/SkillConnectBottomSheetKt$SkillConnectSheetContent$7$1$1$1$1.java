package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SkillConnectBottomSheetKt$SkillConnectSheetContent$7$1$1$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ SkillConnectViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillConnectBottomSheetKt$SkillConnectSheetContent$7$1$1$1$1(SkillConnectViewModel skillConnectViewModel) {
        super(1);
        this.$viewModel = skillConnectViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        AnonymousClass005.A0w(num);
        this.$viewModel.refreshLinkedAccounts();
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        this.$viewModel.refreshLinkedAccounts();
    }
}
