package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.AuJ;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C07C;
import X.C1BO;
import X.C1DM;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$3$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
    public final /* synthetic */ C1BO<SecureStorageCaptureUiState> $uiState$delegate;
    public final /* synthetic */ HatchCredentialsViewModel $viewModel;
    public final /* synthetic */ MutableState<String> $website$delegate;

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<String> $idempotencyKey$delegate;
        public final /* synthetic */ C1BO<SecureStorageCaptureUiState> $uiState$delegate;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;
        public final /* synthetic */ MutableState<String> $website$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<String> mutableState, MutableState<String> mutableState2, HatchCredentialsViewModel hatchCredentialsViewModel, C1BO<SecureStorageCaptureUiState> c1bo) {
            super(3);
            this.$website$delegate = mutableState;
            this.$idempotencyKey$delegate = mutableState2;
            this.$viewModel = hatchCredentialsViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String strA05 = MutableState.A05(this.$website$delegate);
                BRg bRgA0N = AnonymousClass006.A0N(BRg.A00);
                boolean z = !this.$uiState$delegate.getValue().isSaving;
                AuJ auJ = new AuJ(null, -1, 5, 6);
                AuraColorsTextInput auraColorsTextInputA0b = C06G.A0b(bfm);
                C1DM c1dmHatchSectionRowShape = HatchSectionKt.hatchSectionRowShape(0, 1, bfm, 54);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchSecureStorageScreenKt.f248lambda$266601160;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, AnonymousClass001.A1R(bfm, this.$idempotencyKey$delegate, bfm.A65(this.$website$delegate)));
                HatchCredentialsViewModel hatchCredentialsViewModel = this.$viewModel;
                MutableState<String> mutableState = this.$website$delegate;
                MutableState<String> mutableState2 = this.$idempotencyKey$delegate;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$3$1$1$1$1(hatchCredentialsViewModel, mutableState, mutableState2);
                    bfm.Ai0(objAaT);
                }
                AuraTextInputKt.AuraTextInput(strA05, null, bRgA0N, g0v, auJ, null, null, null, true, 0, 0, null, null, auraColorsTextInputA0b, null, z, false, false, false, c1dmHatchSectionRowShape, (G0U) objAaT, bfm, 100691328, 0, 0, 483042);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$website$delegate, this.$idempotencyKey$delegate, this.$viewModel, this.$uiState$delegate), -1399697628);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSecureStorageScreenKt$HatchSecureStorageCaptureSheet$5$1$3$1(MutableState<String> mutableState, MutableState<String> mutableState2, HatchCredentialsViewModel hatchCredentialsViewModel, C1BO<SecureStorageCaptureUiState> c1bo) {
        super(1);
        this.$website$delegate = mutableState;
        this.$idempotencyKey$delegate = mutableState2;
        this.$viewModel = hatchCredentialsViewModel;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
