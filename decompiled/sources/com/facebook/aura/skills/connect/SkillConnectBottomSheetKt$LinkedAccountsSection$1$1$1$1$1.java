package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C78N;
import X.G0W;
import com.facebook.aura.skills.repo.OAuthLinkedAccount;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SkillConnectBottomSheetKt$LinkedAccountsSection$1$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ OAuthLinkedAccount $account;
    public final /* synthetic */ SkillConnectUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillConnectBottomSheetKt$LinkedAccountsSection$1$1$1$1$1(OAuthLinkedAccount oAuthLinkedAccount, SkillConnectUiState skillConnectUiState) {
        super(3);
        this.$account = oAuthLinkedAccount;
        this.$uiState = skillConnectUiState;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        OAuthLinkedAccount oAuthLinkedAccount = this.$account;
        String str = oAuthLinkedAccount.username;
        String str2 = oAuthLinkedAccount.profilePictureUrl;
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = SkillConnectBottomSheetKt$LinkedAccountsSection$1$1$1$1$1$1$1.INSTANCE;
            bfm.Ai0(objAaT);
        }
        SkillConnectBottomSheetKt.LinkedAccountRow(str, str2, false, false, (Function0) objAaT, null, this.$uiState.compactAccounts, bfm, 28032, 32);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
