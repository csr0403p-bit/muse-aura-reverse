package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.BRg;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import android.content.Context;
import com.facebook.aura.channels.ChannelApp;
import com.facebook.aura.channels.ChannelAppLauncherKt;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTelegramSettingsScreenKt$ConnectedScreen$2$1$2$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ String $chatText;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchTelegramUiState $uiState;

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$ConnectedScreen$2$1$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchTelegramUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchTelegramUiState hatchTelegramUiState, Context context) {
            super(0);
            this.$uiState = hatchTelegramUiState;
            this.$context = context;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String str = this.$uiState.botUsername;
            ChannelAppLauncherKt.openChannelApp(this.$context, ChannelApp.TELEGRAM, str != null ? FGI.A0M("https://t.me/", str) : null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        C7384Etj.A0Y(auraButtonGroupStyleByScope, 0);
        auraButtonGroupStyleByScope.mo2449buttonLKWACpY(this.$chatText, null, null, true, false, null, new AnonymousClass1(this.$uiState, this.$context), null, BRg.A00, AuraHaptics.BUTTON_TAP);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTelegramSettingsScreenKt$ConnectedScreen$2$1$2$1$1(String str, HatchTelegramUiState hatchTelegramUiState, Context context) {
        super(1);
        this.$chatText = str;
        this.$uiState = hatchTelegramUiState;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
