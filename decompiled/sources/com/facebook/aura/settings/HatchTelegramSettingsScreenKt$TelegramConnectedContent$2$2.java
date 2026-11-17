package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.BFM;
import X.C78N;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTelegramSettingsScreenKt$TelegramConnectedContent$2$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $cancelText;
    public final /* synthetic */ String $disconnectText;
    public final /* synthetic */ Function0<Unit> $onDisconnect;
    public final /* synthetic */ MutableState<Boolean> $showConfirmDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTelegramSettingsScreenKt$TelegramConnectedContent$2$2(Function0<Unit> function0, String str, MutableState<Boolean> mutableState, String str2) {
        super(2);
        this.$onDisconnect = function0;
        this.$disconnectText = str;
        this.$showConfirmDialog$delegate = mutableState;
        this.$cancelText = str2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            Function0<Unit> function0 = this.$onDisconnect;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$cancelText, bfm.A65(function0) | AnonymousClass001.A1R(bfm, this.$showConfirmDialog$delegate, bfm.A65(this.$disconnectText)));
            String str = this.$disconnectText;
            String str2 = this.$cancelText;
            Function0<Unit> function02 = this.$onDisconnect;
            MutableState<Boolean> mutableState = this.$showConfirmDialog$delegate;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchTelegramSettingsScreenKt$TelegramConnectedContent$2$2$1$1(str, str2, function02, mutableState);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A14(bfm, objAaT);
            return;
        }
        bfm.Afo();
    }
}
