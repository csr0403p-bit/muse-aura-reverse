package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.content.Context;
import com.facebook.aura.ccv.CcvBloksHelperKt;
import com.facebook.aura.ccv.HatchAccountLinkingTarget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessengerSettingsScreenKt$MessengerConsentScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchMessengerUiState $uiState;
    public final /* synthetic */ HatchMessengerViewModel $viewModel;

    /* renamed from: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$MessengerConsentScreen$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ HatchMessengerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchMessengerViewModel hatchMessengerViewModel) {
            super(0);
            this.$viewModel = hatchMessengerViewModel;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.invalidateFBAccountCache();
            this.$viewModel.fetchLinkedFBAccounts();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$MessengerConsentScreen$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Integer, Unit> {
        public final /* synthetic */ HatchMessengerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchMessengerViewModel hatchMessengerViewModel) {
            super(1);
            this.$viewModel = hatchMessengerViewModel;
        }

        public final void invoke(int i) {
            this.$viewModel.invalidateFBAccountCache();
            this.$viewModel.fetchLinkedFBAccounts();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessengerSettingsScreenKt$MessengerConsentScreen$1$1(HatchMessengerUiState hatchMessengerUiState, HatchMessengerViewModel hatchMessengerViewModel, Context context) {
        super(1);
        this.$uiState = hatchMessengerUiState;
        this.$viewModel = hatchMessengerViewModel;
        this.$context = context;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$uiState.showAccountLinkingUpsell) {
            this.$viewModel.onAccountLinkingUpsellShown();
            Context context = this.$context;
            HatchAccountLinkingTarget hatchAccountLinkingTarget = HatchAccountLinkingTarget.MESSENGER;
            HatchMessengerViewModel hatchMessengerViewModel = this.$viewModel;
            CcvBloksHelperKt.openAccountLinkingUpsellBloksScreen(context, hatchAccountLinkingTarget, false, new AnonymousClass1(hatchMessengerViewModel), new AnonymousClass2(hatchMessengerViewModel));
        }
        return new C78g() { // from class: com.facebook.aura.settings.HatchMessengerSettingsScreenKt$MessengerConsentScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
