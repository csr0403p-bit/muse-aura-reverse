package com.facebook.aura.partners.voice.screen;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C7OU;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.partners.voice.intf.VoiceCallStart;
import com.facebook.aura.partners.voice.intf.VoiceMicPermissionLogger;
import com.facebook.aura.partners.voice.screen.VoiceCallStarterKt;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.utils.HatchPermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallStarterKt$rememberConversationCallStarter$4$1 extends AbstractC7559F3s implements G0U<VoiceCallStart, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Boolean> $isStartWanted;
    public final /* synthetic */ C7OU<String, Boolean> $micPermissionLauncher;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Boolean> $onNuxDue;
    public final /* synthetic */ Function0<Boolean> $skipsNux;
    public final /* synthetic */ MutableState<VoiceCallStart> $startAwaitingMicPermission$delegate;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(VoiceCallStart voiceCallStart) {
        C7384Etj.A0Y(voiceCallStart, 0);
        if (VoiceCallStarterKt.blockIfOnOtherCall(this.$userSession, this.$threadId)) {
            return;
        }
        boolean zIsOutOfVoiceCredits = AuraSubscriptionRepository.Companion.getInstance(this.$userSession).isOutOfVoiceCredits();
        boolean zHasPermission = HatchPermissionUtils.INSTANCE.hasPermission(this.$context, "android.permission.RECORD_AUDIO");
        if (!zIsOutOfVoiceCredits) {
            VoiceMicPermissionLogger voiceMicPermissionLogger = VoiceMicPermissionLogger.INSTANCE;
            voiceMicPermissionLogger.logStatus(this.$context);
            if (!zHasPermission) {
                if (this.$startAwaitingMicPermission$delegate.getValue() == null) {
                    voiceMicPermissionLogger.onPromptLaunched(this.$context, HatchScreen.VOICE_OVERLAY);
                    this.$startAwaitingMicPermission$delegate.Af8(voiceCallStart);
                    A02("android.permission.RECORD_AUDIO");
                    return;
                }
                return;
            }
        }
        AuraNavigator auraNavigator = this.$navigator;
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        VoiceCallStarterKt.proceedToVoiceCall(auraNavigator, abstractC3358CGz, this.$threadId, voiceCallStart, this.$skipsNux, this.$onNuxDue, this.$isStartWanted, new VoiceCallStarterKt.AnonymousClass4(abstractC3358CGz));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallStarterKt$rememberConversationCallStarter$4$1(AbstractC3358CGz abstractC3358CGz, String str, Context context, AuraNavigator auraNavigator, Function0<Boolean> function0, Function0<Boolean> function02, Function0<Boolean> function03, C7OU<String, Boolean> c7ou, MutableState<VoiceCallStart> mutableState) {
        super(1);
        this.$userSession = abstractC3358CGz;
        this.$threadId = str;
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$skipsNux = function0;
        this.$onNuxDue = function02;
        this.$isStartWanted = function03;
        this.$micPermissionLauncher = c7ou;
        this.$startAwaitingMicPermission$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(VoiceCallStart voiceCallStart) {
        invoke2(voiceCallStart);
        return Unit.INSTANCE;
    }
}
