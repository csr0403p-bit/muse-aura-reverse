package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass001;
import X.C1BN;
import X.C7384Etj;
import X.HtJ;
import android.view.Surface;
import kotlin.Unit;

/* loaded from: classes2.dex */
public interface BackgroundVoiceCall {

    /* renamed from: com.facebook.aura.partners.voice.intf.BackgroundVoiceCall$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$getHasAccessory(BackgroundVoiceCall backgroundVoiceCall) {
            return false;
        }

        public static /* synthetic */ boolean access$getHasAccessory$jd(BackgroundVoiceCall backgroundVoiceCall) {
            return false;
        }

        public static boolean $default$attachAccessoryVideoSurface(BackgroundVoiceCall backgroundVoiceCall, Surface surface, int i, int i2) {
            return false;
        }

        public static /* synthetic */ boolean access$attachAccessoryVideoSurface$jd(BackgroundVoiceCall backgroundVoiceCall, Surface surface, int i, int i2) {
            return false;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static boolean attachAccessoryVideoSurface(BackgroundVoiceCall backgroundVoiceCall, Surface surface, int i, int i2) {
            C7384Etj.A0Y(surface, 1);
            return false;
        }

        @Deprecated
        public static C1BN<Boolean> getAccessoryLiveVideo(BackgroundVoiceCall backgroundVoiceCall) {
            return VoiceIntegrationKt.NO_ACCESSORY_LIVE_VIDEO;
        }

        @Deprecated
        public static boolean getHasAccessory(BackgroundVoiceCall backgroundVoiceCall) {
            return false;
        }

        @Deprecated
        public static Object pushAccessoryAudio(BackgroundVoiceCall backgroundVoiceCall, short[] sArr, int i, HtJ<? super Boolean> htJ) {
            return AnonymousClass001.A0h();
        }

        @Deprecated
        public static Object detachAccessoryVideoSurface(BackgroundVoiceCall backgroundVoiceCall, Surface surface, HtJ<? super Unit> htJ) {
            return Unit.INSTANCE;
        }
    }

    boolean attachAccessoryVideoSurface(Surface surface, int i, int i2);

    Integer attachVideoSurface(Surface surface, int i, int i2);

    Object detachAccessoryVideoSurface(Surface surface, HtJ<? super Unit> htJ);

    void detachVideoSurface(Surface surface);

    void end();

    void endForOtherCall();

    C1BN<Boolean> getAccessoryLiveVideo();

    C1BN<Float> getAssistantAudioLevel();

    boolean getHasAccessory();

    C1BN<VoiceCallUiState> getState();

    C1BN<Float> getUserAudioLevel();

    C1BN<Integer> getVideoReadyGeneration();

    Object pushAccessoryAudio(short[] sArr, int i, HtJ<? super Boolean> htJ);

    void resizeVideoSurface(Surface surface, int i, int i2);

    void setMuted(boolean z);
}
