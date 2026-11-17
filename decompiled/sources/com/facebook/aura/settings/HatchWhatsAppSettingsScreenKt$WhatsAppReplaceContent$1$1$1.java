package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchWhatsAppSettingsScreenKt$WhatsAppReplaceContent$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupStyleByScope, Unit> {
    public final /* synthetic */ WhatsAppConnectDisclosure $disclosure;
    public final /* synthetic */ boolean $isSwitching;
    public final /* synthetic */ Function0<Unit> $onCancel;
    public final /* synthetic */ Function0<Unit> $onReplace;

    /* renamed from: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppReplaceContent$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $onReplace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(0);
            this.$onReplace = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.CHANNELS, HatchScreen.CHANNELS_WHATSAPP, HatchComponent.CONTINUE_BUTTON, null, null, null);
            this.$onReplace.invoke();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope r15) {
        /*
            r14 = this;
            r1 = 0
            r3 = r15
            X.C7384Etj.A0Y(r15, r1)
            r2 = r14
            boolean r0 = r14.$isSwitching
            if (r0 != 0) goto L11
            com.facebook.aura.settings.WhatsAppConnectDisclosure r0 = r14.$disclosure
            boolean r0 = r0 instanceof com.facebook.aura.settings.WhatsAppConnectDisclosure.Loading
            r9 = 0
            if (r0 == 0) goto L12
        L11:
            r9 = 1
        L12:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r14.$onReplace
            com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppReplaceContent$1$1$1$1 r11 = new com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppReplaceContent$1$1$1$1
            r11.<init>(r0)
            r5 = 0
            r4 = 2131886639(0x7f12022f, float:1.9407863E38)
            r8 = 1
            X.BS0 r14 = X.BRg.A00
            int r15 = com.facebook.aura.vds.compose.accessibility.AuraHaptics.BUTTON_TAP
            r6 = r5
            r7 = r5
            r10 = r5
            r12 = r5
            r13 = r5
            r3.mo2448buttonIiUgNnk(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = r2.$isSwitching
            r8 = r0 ^ 1
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r2.$onCancel
            r4 = 2131889878(0x7f120ed6, float:1.9414432E38)
            r9 = r1
            r11 = r0
            r3.mo2448buttonIiUgNnk(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$WhatsAppReplaceContent$1$1$1.invoke2(com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupStyleByScope):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWhatsAppSettingsScreenKt$WhatsAppReplaceContent$1$1$1(boolean z, WhatsAppConnectDisclosure whatsAppConnectDisclosure, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$isSwitching = z;
        this.$disclosure = whatsAppConnectDisclosure;
        this.$onCancel = function0;
        this.$onReplace = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupStyleByScope auraButtonGroupStyleByScope) {
        invoke2(auraButtonGroupStyleByScope);
        return Unit.INSTANCE;
    }
}
