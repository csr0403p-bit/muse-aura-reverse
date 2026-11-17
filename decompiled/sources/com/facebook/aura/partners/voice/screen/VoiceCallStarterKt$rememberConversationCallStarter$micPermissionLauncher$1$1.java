package com.facebook.aura.partners.voice.screen;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.MicPermissionDeniedOverlayScreenKey;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.partners.voice.intf.VoiceMicPermissionLogger;
import com.facebook.aura.partners.voice.screen.VoiceCallStarterKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallStarterKt$rememberConversationCallStarter$micPermissionLauncher$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ boolean $canStartCall;
    public final /* synthetic */ Function0<Boolean> $isStartWanted;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Boolean> $onNuxDue;
    public final /* synthetic */ Function0<Boolean> $skipsNux;
    public final /* synthetic */ MutableState<VoiceCallStart> $startAwaitingMicPermission$delegate;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallStarterKt$rememberConversationCallStarter$micPermissionLauncher$1$1(boolean z, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str, Function0<Boolean> function0, Function0<Boolean> function02, Function0<Boolean> function03, MutableState<VoiceCallStart> mutableState) {
        super(1);
        this.$canStartCall = z;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$threadId = str;
        this.$skipsNux = function0;
        this.$onNuxDue = function02;
        this.$isStartWanted = function03;
        this.$startAwaitingMicPermission$delegate = mutableState;
    }

    public final void invoke(boolean z) {
        VoiceMicPermissionLogger.INSTANCE.logDecision(z);
        VoiceCallStart value = this.$startAwaitingMicPermission$delegate.getValue();
        this.$startAwaitingMicPermission$delegate.Af8(null);
        if (this.$canStartCall) {
            if (!z) {
                this.$navigator.navigate((AuraNavKey) MicPermissionDeniedOverlayScreenKey.INSTANCE, false);
            } else if (value != null) {
                AuraNavigator auraNavigator = this.$navigator;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                VoiceCallStarterKt.proceedToVoiceCall(auraNavigator, abstractC3358CGz, this.$threadId, value, this.$skipsNux, this.$onNuxDue, this.$isStartWanted, new VoiceCallStarterKt.AnonymousClass4(abstractC3358CGz));
            }
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
