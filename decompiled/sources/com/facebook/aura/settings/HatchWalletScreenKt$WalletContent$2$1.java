package com.facebook.aura.settings;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C01N;
import X.C0CD;
import X.C1BO;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import X.G0W;
import com.facebook.aura.ui.HatchLazySectionScope;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchWalletScreenKt$WalletContent$2$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ C1BO<HatchWalletUiState> $state$delegate;
    public final /* synthetic */ float $topPadding;
    public final /* synthetic */ HatchWalletViewModel $viewModel;

    /* renamed from: com.facebook.aura.settings.HatchWalletScreenKt$WalletContent$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<HatchWalletUiState> $state$delegate;
        public final /* synthetic */ float $topPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, C1BO<HatchWalletUiState> c1bo) {
            super(3);
            this.$topPadding = f;
            this.$state$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C01N.A08(bfm, bs0, this.$topPadding);
                HatchWalletScreenKt.WalletHeader(this.$state$delegate.getValue().agentName, null, bfm, 0, 2);
                C01N.A08(bfm, bs0, AuraDimensKt.SpacingLarge);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWalletScreenKt$WalletContent$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchLazySectionScope, Unit> {
        public final /* synthetic */ C1BO<HatchWalletUiState> $state$delegate;
        public final /* synthetic */ HatchWalletViewModel $viewModel;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchLazySectionScope hatchLazySectionScope) {
            C7384Etj.A0Y(hatchLazySectionScope, 0);
            AHD<WalletEntryUiState> ahd = this.$state$delegate.getValue().entries;
            HatchWalletViewModel hatchWalletViewModel = this.$viewModel;
            for (WalletEntryUiState walletEntryUiState : ahd) {
                hatchLazySectionScope.item(walletEntryUiState.getKey(), walletEntryUiState.getContentType(), AnonymousClass001.A0M(new HatchWalletScreenKt$WalletContent$2$1$2$1$1(walletEntryUiState, hatchWalletViewModel), -184268083));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C1BO<HatchWalletUiState> c1bo, HatchWalletViewModel hatchWalletViewModel) {
            super(1);
            this.$state$delegate = c1bo;
            this.$viewModel = hatchWalletViewModel;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchLazySectionScope hatchLazySectionScope) {
            invoke2(hatchLazySectionScope);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWalletScreenKt$WalletContent$2$1$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass3(Object obj) {
            super(0, obj, HatchWalletViewModel.class, "retry", "retry()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((HatchWalletViewModel) this.receiver).retry();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchWalletScreenKt$WalletContent$2$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $bottomPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(float f) {
            super(3);
            this.$bottomPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$bottomPadding);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ("header", "header", B1V.A01(new AnonymousClass1(this.$topPadding, this.$state$delegate), 841796577, true));
        HatchSectionKt.m2324HatchSectionlMAxDYE(c0cd, false, null, null, null, null, new AnonymousClass2(this.$state$delegate, this.$viewModel));
        HatchWalletScreenKt.walletPageStatus(c0cd, this.$state$delegate.getValue(), new AnonymousClass3(this.$viewModel));
        c0cd.APJ("bottom-padding", "spacer", B1V.A01(new AnonymousClass4(this.$bottomPadding), -1152520488, true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWalletScreenKt$WalletContent$2$1(HatchWalletViewModel hatchWalletViewModel, float f, C1BO<HatchWalletUiState> c1bo, float f2) {
        super(1);
        this.$viewModel = hatchWalletViewModel;
        this.$topPadding = f;
        this.$state$delegate = c1bo;
        this.$bottomPadding = f2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
