package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import android.content.Context;
import com.facebook.aura.ccv.CcvBloksHelperKt;
import com.facebook.aura.ccv.HatchAccountLinkingTarget;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SkillConnectBottomSheetKt$SkillConnectSheetContent$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchAccountLinkingTarget $accountLinkingTarget;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<SkillConnectUiState> $linkedAccountsUiState$delegate;
    public final /* synthetic */ SkillConnectViewModel $viewModel;

    /* renamed from: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$SkillConnectSheetContent$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
        public final /* synthetic */ SkillConnectViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SkillConnectViewModel skillConnectViewModel) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillConnectBottomSheetKt$SkillConnectSheetContent$3$1(HatchAccountLinkingTarget hatchAccountLinkingTarget, SkillConnectViewModel skillConnectViewModel, Context context, C1BO<SkillConnectUiState> c1bo) {
        super(1);
        this.$accountLinkingTarget = hatchAccountLinkingTarget;
        this.$viewModel = skillConnectViewModel;
        this.$context = context;
        this.$linkedAccountsUiState$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$linkedAccountsUiState$delegate.getValue().showLinkUpsell && this.$accountLinkingTarget != null) {
            this.$viewModel.onLinkUpsellShown();
            CcvBloksHelperKt.openAccountLinkingUpsellBloksScreen(this.$context, this.$accountLinkingTarget, false, CcvBloksHelperKt.AnonymousClass1.INSTANCE, new AnonymousClass1(this.$viewModel));
        }
        return new C78g() { // from class: com.facebook.aura.skills.connect.SkillConnectBottomSheetKt$SkillConnectSheetContent$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
