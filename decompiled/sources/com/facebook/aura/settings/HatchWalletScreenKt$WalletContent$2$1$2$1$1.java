package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.settings.WalletEntryUiState;
import com.facebook.aura.skills.viewmodel.ConnectorCatalogRowUiState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchWalletScreenKt$WalletContent$2$1$2$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ WalletEntryUiState $entry;
    public final /* synthetic */ HatchWalletViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWalletScreenKt$WalletContent$2$1$2$1$1(WalletEntryUiState walletEntryUiState, HatchWalletViewModel hatchWalletViewModel) {
        super(2);
        this.$entry = walletEntryUiState;
        this.$viewModel = hatchWalletViewModel;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            WalletEntryUiState walletEntryUiState = this.$entry;
            if (walletEntryUiState instanceof WalletEntryUiState.Connector) {
                bfm.AgE(-987965563);
                WalletEntryUiState.Connector connector = (WalletEntryUiState.Connector) this.$entry;
                ConnectorCatalogRowUiState connectorCatalogRowUiState = connector.row;
                String str = connector.testTag;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$entry, bfm.A67(this.$viewModel));
                HatchWalletViewModel hatchWalletViewModel = this.$viewModel;
                WalletEntryUiState walletEntryUiState2 = this.$entry;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchWalletScreenKt$WalletContent$2$1$2$1$1$1$1(hatchWalletViewModel, walletEntryUiState2);
                    bfm.Ai0(objAaT);
                }
                HatchWalletScreenKt.PaymentMethodRow(connectorCatalogRowUiState, str, (Function0) objAaT, null, bfm, 0, 8);
                AnonymousClass001.A1D(bfm);
                return;
            }
            if (C7384Etj.areEqual(walletEntryUiState, WalletEntryUiState.NativeMetaPay.INSTANCE)) {
                bfm.AgE(-561909504);
                bfm.AgE(-561909505);
                AnonymousClass006.A1M(bfm);
                return;
            }
            AnonymousClass004.A1A(bfm, -987967873);
            throw new NoWhenBranchMatchedException();
        }
        bfm.Afo();
    }
}
