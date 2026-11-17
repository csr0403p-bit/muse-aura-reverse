package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1805ArO;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTelegramSettingsScreenKt$TelegramOnboardingContent$2$2$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ String $buttonText;
    public final /* synthetic */ boolean $isConnecting;
    public final /* synthetic */ G0U<String, Unit> $onConnect;
    public final /* synthetic */ MutableState<C1805ArO> $tokenValue$delegate;

    /* renamed from: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$TelegramOnboardingContent$2$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ G0U<String, Unit> $onConnect;
        public final /* synthetic */ MutableState<C1805ArO> $tokenValue$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super String, Unit> g0u, MutableState<C1805ArO> mutableState) {
            super(0);
            this.$onConnect = g0u;
            this.$tokenValue$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CHANNELS, HatchScreen.CHANNELS_TELEGRAM, HatchComponent.CONNECT_BUTTON, null, null, null);
            this.$onConnect.invoke(AnonymousClass002.A0l(MutableState.A04((MutableState) this.$tokenValue$delegate)));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope r12) {
        /*
            r11 = this;
            r7 = 0
            r2 = r12
            X.C7384Etj.A0Y(r12, r7)
            androidx.compose.runtime.MutableState<X.ArO> r0 = r11.$tokenValue$delegate
            java.lang.String r0 = androidx.compose.runtime.MutableState.A04(r0)
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L16
            boolean r0 = r11.$isConnecting
            r6 = 1
            if (r0 == 0) goto L17
        L16:
            r6 = 0
        L17:
            java.lang.String r3 = r11.$buttonText
            X.G0U<java.lang.String, kotlin.Unit> r1 = r11.$onConnect
            androidx.compose.runtime.MutableState<X.ArO> r0 = r11.$tokenValue$delegate
            com.facebook.aura.settings.HatchTelegramSettingsScreenKt$TelegramOnboardingContent$2$2$1$1 r9 = new com.facebook.aura.settings.HatchTelegramSettingsScreenKt$TelegramOnboardingContent$2$2$1$1
            r9.<init>(r1, r0)
            r4 = 0
            X.BS0 r11 = X.BRg.A00
            int r12 = com.facebook.aura.vds.compose.accessibility.AuraHaptics.BUTTON_TAP
            r5 = r4
            r8 = r4
            r10 = r4
            r2.mo2449buttonLKWACpY(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchTelegramSettingsScreenKt$TelegramOnboardingContent$2$2$1.invoke2(com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTelegramSettingsScreenKt$TelegramOnboardingContent$2$2$1(boolean z, String str, MutableState<C1805ArO> mutableState, G0U<? super String, Unit> g0u) {
        super(1);
        this.$isConnecting = z;
        this.$buttonText = str;
        this.$tokenValue$delegate = mutableState;
        this.$onConnect = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
