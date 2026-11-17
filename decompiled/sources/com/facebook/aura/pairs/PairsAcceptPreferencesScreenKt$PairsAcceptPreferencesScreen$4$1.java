package com.facebook.aura.pairs;

import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C7384Etj;
import X.C78N;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.pairs.PairsAcceptPreferencesUiState;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$4$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ PairsAcceptPreferencesUiState.Ready $readyState;
    public final /* synthetic */ PairsAcceptPreferencesViewModel $viewModel;

    public final void invoke(C07C c07c, BFM bfm, int i) {
        C7384Etj.A0Y(c07c, 0);
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d4b);
        boolean z = this.$readyState.isAccepting;
        BRg bRgA00 = AbstractC07539Wl.A00(BRg.A00, "pairs-accept-confirm");
        boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, AnonymousClass001.A1T(bfm, this.$readyState, bfm.A67(this.$log)));
        ConnectionsLogContext connectionsLogContext = this.$log;
        PairsAcceptPreferencesUiState.Ready ready = this.$readyState;
        PairsAcceptPreferencesViewModel pairsAcceptPreferencesViewModel = this.$viewModel;
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            objAaT = new PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$4$1$1$1(connectionsLogContext, ready, pairsAcceptPreferencesViewModel);
            bfm.Ai0(objAaT);
        }
        PairsComponentsKt.PairsPrimaryButton(strA01, (Function0) objAaT, bRgA00, false, z, bfm, 384, 8);
        String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d79);
        AuraLabelButtonStyle auraLabelButtonStyleTertiary = AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1);
        C1062ATq c1062ATq = C10G.A02;
        boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$navigator, bfm.A67(this.$log));
        ConnectionsLogContext connectionsLogContext2 = this.$log;
        AuraNavigator auraNavigator = this.$navigator;
        Object objAaT2 = bfm.AaT();
        if (zA1T2 || objAaT2 == C78N.A00) {
            objAaT2 = new PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$4$1$2$1(connectionsLogContext2, auraNavigator);
            bfm.Ai0(objAaT2);
        }
        AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, c1062ATq, auraLabelButtonStyleTertiary, null, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, 0, 0, 134201317);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsAcceptPreferencesScreenKt$PairsAcceptPreferencesScreen$4$1(PairsAcceptPreferencesUiState.Ready ready, ConnectionsLogContext connectionsLogContext, PairsAcceptPreferencesViewModel pairsAcceptPreferencesViewModel, AuraNavigator auraNavigator) {
        super(3);
        this.$readyState = ready;
        this.$log = connectionsLogContext;
        this.$viewModel = pairsAcceptPreferencesViewModel;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
