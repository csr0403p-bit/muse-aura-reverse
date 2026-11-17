package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChannelSettingsScreensKt$ChannelConnectedScreen$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onShowDisconnectDialog;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelSettingsScreensKt$ChannelConnectedScreen$1(HatchScreen hatchScreen, MutableState<Boolean> mutableState, Function0<Unit> function0) {
        super(2);
        this.$screen = hatchScreen;
        this.$showContextMenu$delegate = mutableState;
        this.$onShowDisconnectDialog = function0;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchScreen hatchScreen = this.$screen;
            boolean zA0A = MutableState.A0A((MutableState) this.$showContextMenu$delegate);
            boolean zA65 = bfm.A65(this.$showContextMenu$delegate);
            MutableState<Boolean> mutableState = this.$showContextMenu$delegate;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ChannelSettingsScreensKt$ChannelConnectedScreen$1$1$1(mutableState);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA652 = bfm.A65(this.$showContextMenu$delegate);
            MutableState<Boolean> mutableState2 = this.$showContextMenu$delegate;
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = new ChannelSettingsScreensKt$ChannelConnectedScreen$1$2$1(mutableState2);
                bfm.Ai0(objAaT2);
            }
            ChannelDisconnectActionButtonKt.ChannelDisconnectActionButton(hatchScreen, zA0A, function0, (Function0) objAaT2, this.$onShowDisconnectDialog, bfm, 0);
            return;
        }
        bfm.Afo();
    }
}
