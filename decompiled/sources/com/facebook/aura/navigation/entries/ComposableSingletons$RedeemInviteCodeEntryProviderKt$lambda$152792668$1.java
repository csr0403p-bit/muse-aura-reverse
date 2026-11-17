package com.facebook.aura.navigation.entries;

import X.AKO;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BBI;
import X.BFM;
import X.BOD;
import X.C1BO;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import X.InterfaceC7353EnQ;
import com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel;
import com.facebook.aura.activation.view.HatchRedeemInviteCodeScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.RedeemInviteCodeScreenKey;
import com.facebook.aura.session.LocalUserSessionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$RedeemInviteCodeEntryProviderKt$lambda$152792668$1 extends AbstractC7559F3s implements G0W<RedeemInviteCodeScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$RedeemInviteCodeEntryProviderKt$lambda$152792668$1 INSTANCE = new ComposableSingletons$RedeemInviteCodeEntryProviderKt$lambda$152792668$1();

    public ComposableSingletons$RedeemInviteCodeEntryProviderKt$lambda$152792668$1() {
        super(3);
    }

    public final void invoke(RedeemInviteCodeScreenKey redeemInviteCodeScreenKey, BFM bfm, int i) {
        C7384Etj.A0Y(redeemInviteCodeScreenKey, 0);
        BBI bbi = (BBI) bfm;
        AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
        HatchRedeemInviteCodeViewModel.Factory factory = new HatchRedeemInviteCodeViewModel.Factory(AKO.A06(LocalUserSessionKt.LocalUserSession, bbi), redeemInviteCodeScreenKey.initialCode);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 == null) {
            throw AnonymousClass001.A0o();
        }
        HatchRedeemInviteCodeViewModel hatchRedeemInviteCodeViewModel = (HatchRedeemInviteCodeViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(HatchRedeemInviteCodeViewModel.class));
        HatchRedeemInviteCodeViewModel.UiState uiState = (HatchRedeemInviteCodeViewModel.UiState) C1BO.A07(bfm, hatchRedeemInviteCodeViewModel.uiState);
        boolean zA67 = bfm.A67(hatchRedeemInviteCodeViewModel);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new ComposableSingletons$RedeemInviteCodeEntryProviderKt$lambda$152792668$1$1$1(hatchRedeemInviteCodeViewModel);
            BBI.A0O(bbi, objAaT);
        }
        G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT);
        boolean zA672 = bfm.A67(hatchRedeemInviteCodeViewModel);
        Object objAaT2 = bfm.AaT();
        if (zA672 || objAaT2 == C78N.A00) {
            objAaT2 = new ComposableSingletons$RedeemInviteCodeEntryProviderKt$lambda$152792668$1$2$1(hatchRedeemInviteCodeViewModel);
            BBI.A0O(bbi, objAaT2);
        }
        Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT2);
        boolean zA673 = bfm.A67(hatchRedeemInviteCodeViewModel);
        Object objAaT3 = bfm.AaT();
        if (zA673 || objAaT3 == C78N.A00) {
            objAaT3 = new ComposableSingletons$RedeemInviteCodeEntryProviderKt$lambda$152792668$1$3$1(hatchRedeemInviteCodeViewModel);
            BBI.A0O(bbi, objAaT3);
        }
        Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT3);
        boolean zA674 = bfm.A67(auraNavigatorA05);
        Object objAaT4 = bfm.AaT();
        if (zA674 || objAaT4 == C78N.A00) {
            objAaT4 = new ComposableSingletons$RedeemInviteCodeEntryProviderKt$lambda$152792668$1$4$1(auraNavigatorA05);
            BBI.A0O(bbi, objAaT4);
        }
        HatchRedeemInviteCodeScreenKt.HatchRedeemInviteCodeScreen(uiState, g0u, function0, function02, (Function0) objAaT4, null, bfm, 0, 32);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(RedeemInviteCodeScreenKey redeemInviteCodeScreenKey, BFM bfm, Integer num) {
        invoke(redeemInviteCodeScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
