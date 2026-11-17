package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C07C;
import X.C78N;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.pairs.PairsStatusUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PairsStatusScreenKt$PairsStatusScreen$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<Boolean> $confirmRemoval$delegate;
    public final /* synthetic */ PairsStatusUiState.Loaded $it;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ PairsStatusViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsStatusScreenKt$PairsStatusScreen$1$1(PairsStatusUiState.Loaded loaded, PairsStatusViewModel pairsStatusViewModel, ConnectionsLogContext connectionsLogContext, MutableState<Boolean> mutableState) {
        super(3);
        this.$it = loaded;
        this.$viewModel = pairsStatusViewModel;
        this.$log = connectionsLogContext;
        this.$confirmRemoval$delegate = mutableState;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            bfm.Afo();
            return;
        }
        PairsStatusUiState.Loaded loaded = this.$it;
        PairsStatusViewModel pairsStatusViewModel = this.$viewModel;
        ConnectionsLogContext connectionsLogContext = this.$log;
        boolean zA67 = bfm.A67(connectionsLogContext);
        ConnectionsLogContext connectionsLogContext2 = this.$log;
        MutableState<Boolean> mutableState = this.$confirmRemoval$delegate;
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new PairsStatusScreenKt$PairsStatusScreen$1$1$1$1(connectionsLogContext2, mutableState);
            bfm.Ai0(objAaT);
        }
        PairsStatusScreenKt.PairsStatusActions(loaded, pairsStatusViewModel, connectionsLogContext, (Function0) objAaT, bfm, PairsStatusUiState.Loaded.$stable | (PairsStatusViewModel.$stable << 3) | (ConnectionsLogContext.$stable << 6));
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
