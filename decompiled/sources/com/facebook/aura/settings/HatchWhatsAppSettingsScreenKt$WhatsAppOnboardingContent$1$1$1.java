package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.settings.WhatsAppConnectDisclosure;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchWhatsAppSettingsScreenKt$WhatsAppOnboardingContent$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ String $buttonText;
    public final /* synthetic */ WhatsAppConnectDisclosure $disclosure;
    public final /* synthetic */ boolean $isConnecting;
    public final /* synthetic */ Function0<Unit> $onConnect;

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppOnboardingContent$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $onConnect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(0);
            this.$onConnect = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CHANNELS, HatchScreen.CHANNELS_WHATSAPP, HatchComponent.CONNECT_BUTTON, null, null, null);
            this.$onConnect.invoke();
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
        auraButtonGroupStyleByScope.mo2449buttonLKWACpY(this.$buttonText, null, null, !this.$isConnecting, this.$disclosure instanceof WhatsAppConnectDisclosure.Loading, null, new AnonymousClass1(this.$onConnect), null, BRg.A00, AuraHaptics.BUTTON_TAP);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWhatsAppSettingsScreenKt$WhatsAppOnboardingContent$1$1$1(boolean z, WhatsAppConnectDisclosure whatsAppConnectDisclosure, String str, Function0<Unit> function0) {
        super(1);
        this.$isConnecting = z;
        this.$disclosure = whatsAppConnectDisclosure;
        this.$buttonText = str;
        this.$onConnect = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
