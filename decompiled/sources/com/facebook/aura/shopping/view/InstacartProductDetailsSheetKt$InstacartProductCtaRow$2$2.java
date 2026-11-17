package com.facebook.aura.shopping.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.shopping.viewmodel.InstacartProductDetailsUiState;
import com.facebook.aura.shopping.viewmodel.InstacartProductDetailsViewModel;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class InstacartProductDetailsSheetKt$InstacartProductCtaRow$2$2 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ InstacartProductDetailsUiState $uiState;
    public final /* synthetic */ InstacartProductDetailsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstacartProductDetailsSheetKt$InstacartProductCtaRow$2$2(InstacartProductDetailsUiState instacartProductDetailsUiState, InstacartProductDetailsViewModel instacartProductDetailsViewModel) {
        super(3);
        this.$uiState = instacartProductDetailsUiState;
        this.$viewModel = instacartProductDetailsViewModel;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(bRg, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, bRg);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            bfm.Afo();
            return;
        }
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120db9);
        AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
        AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
        boolean z = this.$uiState.isAddingToCart;
        InstacartProductDetailsViewModel instacartProductDetailsViewModel = this.$viewModel;
        boolean zA67 = bfm.A67(instacartProductDetailsViewModel);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new InstacartProductDetailsSheetKt$InstacartProductCtaRow$2$2$1$1(instacartProductDetailsViewModel);
            BBI.A0T(bfm, objAaT);
        }
        AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRg, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, false, z, false, null, null, (Function0) ((InterfaceC7353EnQ) objAaT), null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, ((iA0d << 9) & 7168) | 196608, 0, 0, 134200261);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
