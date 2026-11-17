package com.facebook.aura.partners.voice.impl;

import X.AGH;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C7384Etj;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.partners.voice.avatar.HatchAvatarReferenceImageProvider;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.intf.BackgroundCallAvailability;
import com.facebook.aura.partners.voice.intf.BackgroundVoiceCall;
import com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason;
import com.facebook.aura.partners.voice.intf.VoiceCallAccessory;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.partners.voice.intf.VoiceIntegration;
import com.facebook.aura.partners.voice.intf.VoiceUi;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import com.facebook.aura.partners.voice.runtime.VoiceCallRuntime;
import com.facebook.aura.partners.voice.runtime.VoiceCallSessionOwner;
import com.facebook.aura.partners.voice.screen.VoiceCallStarterKt;
import com.facebook.aura.partners.voice.session.intf.VoiceCallSupport;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceIntegration implements VoiceIntegration {
    public static final HatchVoiceIntegration INSTANCE = new HatchVoiceIntegration();
    public static final VoiceUi ui = HatchVoiceUi.INSTANCE;

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceIntegration$startCall$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz) {
            super(0);
            this.$navigator = auraNavigator;
            this.$userSession = abstractC3358CGz;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            VoiceCallStarterKt.openOutOfCreditsSheet(this.$navigator, this.$userSession, HatchComponent.VOICE_BUTTON, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceIntegration
    public void endCall(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        VoiceCallRuntime.INSTANCE.endCall(abstractC3358CGz);
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceIntegration
    public boolean hasSeenCallIntro(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return VoicePrefs.INSTANCE.hasSeenVoiceNux(abstractC3358CGz);
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceIntegration
    public boolean isCallSupported(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return VoiceCallRuntime.INSTANCE.isCallSupported(abstractC3358CGz);
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceIntegration
    public void prepareAccessoryCall(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        if (AnonymousClass002.A1Y(VoiceGating.INSTANCE.getEmbodimentOffReason())) {
            HatchAvatarReferenceImageProvider.Companion.getInstance(abstractC3358CGz).startCallIdleRestore();
        }
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceIntegration
    public BackgroundVoiceCall startBackgroundCall(Context context, AbstractC3358CGz abstractC3358CGz, String str, VoiceAudioOnlyReason voiceAudioOnlyReason, VoiceCallAccessory voiceCallAccessory, VoiceCallEntryPoint voiceCallEntryPoint) {
        AnonymousClass003.A0u(context, abstractC3358CGz);
        return VoiceCallRuntime.INSTANCE.start(context, abstractC3358CGz, str, voiceAudioOnlyReason, null, voiceCallAccessory, voiceCallEntryPoint);
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceIntegration
    public void startCall(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(auraNavigator, abstractC3358CGz);
        VoiceCallStarterKt.proceedToVoiceCall(auraNavigator, abstractC3358CGz, str, new VoiceCallStart(null, AGH.A0E()), VoiceCallStarterKt.AnonymousClass1.INSTANCE, VoiceCallStarterKt.AnonymousClass2.INSTANCE, VoiceCallStarterKt.AnonymousClass3.INSTANCE, new AnonymousClass1(auraNavigator, abstractC3358CGz));
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceIntegration
    public VoiceUi getUi() {
        return ui;
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceIntegration
    public boolean isEmbodimentEnabled() {
        return VoiceCallSupport.INSTANCE.isEmbodimentSupported();
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceIntegration
    public boolean isVoiceDesignSupported() {
        return VoiceCallSupport.INSTANCE.isVoiceDesignSupported();
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceIntegration
    public BackgroundCallAvailability backgroundCallAvailability(Context context, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(context, abstractC3358CGz);
        return VoiceCallRuntime.INSTANCE.availability(context, abstractC3358CGz);
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceIntegration
    public boolean sendInput(AbstractC3358CGz abstractC3358CGz, long j, String str) {
        AnonymousClass003.A0v(abstractC3358CGz, str);
        return VoiceCallSessionOwner.Companion.getInstance(abstractC3358CGz).sendInput(j, str);
    }
}
