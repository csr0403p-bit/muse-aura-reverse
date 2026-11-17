package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.BFM;
import X.C78N;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChannelSettingsScreensKt$ChannelConnectedScreen$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $cancelText;
    public final /* synthetic */ String $disconnectText;
    public final /* synthetic */ Function0<Unit> $onDisconnect;
    public final /* synthetic */ Function0<Unit> $onDismissDisconnectDialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelSettingsScreensKt$ChannelConnectedScreen$3(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
        super(2);
        this.$disconnectText = str;
        this.$onDisconnect = function0;
        this.$cancelText = str2;
        this.$onDismissDisconnectDialog = function02;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismissDisconnectDialog, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onDisconnect, bfm.A65(this.$disconnectText))));
            String str = this.$disconnectText;
            Function0<Unit> function0 = this.$onDisconnect;
            String str2 = this.$cancelText;
            Function0<Unit> function02 = this.$onDismissDisconnectDialog;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new ChannelSettingsScreensKt$ChannelConnectedScreen$3$1$1(str, function0, str2, function02);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A14(bfm, objAaT);
            return;
        }
        bfm.Afo();
    }
}
