package com.facebook.aura.partners.voice.shortcut;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.CFK;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.partners.voice.intf.BackgroundCallAvailability;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceIntegration;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public abstract class StartVoiceCallKt {
    public static final String TAG = "StartVoiceCall";

    @DebugMetadata(c = "com.facebook.aura.partners.voice.shortcut.StartVoiceCallKt$startVoiceCallIfAvailable$2", f = "StartVoiceCall.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.shortcut.StartVoiceCallKt$startVoiceCallIfAvailable$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super BackgroundCallAvailability>, Object> {
        public final /* synthetic */ VoiceAudioOnlyReason $audioOnlyReason;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ VoiceCallEntryPoint $entryPoint;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, AbstractC3358CGz abstractC3358CGz, VoiceAudioOnlyReason voiceAudioOnlyReason, VoiceCallEntryPoint voiceCallEntryPoint, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$userSession = abstractC3358CGz;
            this.$audioOnlyReason = voiceAudioOnlyReason;
            this.$entryPoint = voiceCallEntryPoint;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$context, this.$userSession, this.$audioOnlyReason, this.$entryPoint, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            VoiceIntegration integration = Voice.INSTANCE.getIntegration();
            if (integration == null) {
                return null;
            }
            try {
                BackgroundCallAvailability backgroundCallAvailability = integration.backgroundCallAvailability(this.$context, this.$userSession);
                if (backgroundCallAvailability != BackgroundCallAvailability.AVAILABLE || integration.startBackgroundCall(this.$context, this.$userSession, null, this.$audioOnlyReason, null, this.$entryPoint) != null) {
                    return backgroundCallAvailability;
                }
                CFK.A06(StartVoiceCallKt.TAG, "The call did not start");
                return null;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(StartVoiceCallKt.TAG, "Could not start the call", e2);
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super BackgroundCallAvailability> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static /* synthetic */ Object startVoiceCallIfAvailable$default(Context context, AbstractC3358CGz abstractC3358CGz, VoiceAudioOnlyReason voiceAudioOnlyReason, VoiceCallEntryPoint voiceCallEntryPoint, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            voiceAudioOnlyReason = null;
        }
        if ((i & 8) != 0) {
            voiceCallEntryPoint = null;
        }
        return startVoiceCallIfAvailable(context, abstractC3358CGz, voiceAudioOnlyReason, voiceCallEntryPoint, htJ);
    }

    public static final Object startVoiceCallIfAvailable(Context context, AbstractC3358CGz abstractC3358CGz, VoiceAudioOnlyReason voiceAudioOnlyReason, VoiceCallEntryPoint voiceCallEntryPoint, HtJ<? super BackgroundCallAvailability> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(context, abstractC3358CGz, voiceAudioOnlyReason, voiceCallEntryPoint, null));
    }
}
