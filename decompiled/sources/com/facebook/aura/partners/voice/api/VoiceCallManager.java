package com.facebook.aura.partners.voice.api;

import X.C1BN;
import X.C22I;
import X.C3cH;
import X.HtJ;
import android.view.Surface;
import com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason;
import com.facebook.aura.partners.voice.intf.VoiceCallAccessory;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public interface VoiceCallManager {

    /* renamed from: com.facebook.aura.partners.voice.api.VoiceCallManager$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ void startCall$default(VoiceCallManager voiceCallManager, VoiceAudioOnlyReason voiceAudioOnlyReason, Boolean bool, VoiceCallEntryPoint voiceCallEntryPoint, Map map, VoiceCallAccessory voiceCallAccessory, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCall");
            }
            if ((i & 1) != 0) {
                voiceAudioOnlyReason = null;
            }
            if ((i & 2) != 0) {
                bool = null;
            }
            if ((i & 4) != 0) {
                voiceCallEntryPoint = null;
            }
            Map<String, String> mapA0o = C3cH.A0o(map, i & 8);
            if ((i & 16) != 0) {
                voiceCallAccessory = null;
            }
            voiceCallManager.startCall(voiceAudioOnlyReason, bool, voiceCallEntryPoint, mapA0o, voiceCallAccessory);
        }
    }

    boolean attachAccessoryVideoSurface(Surface surface, int i, int i2);

    Integer attachEmbodimentSurface(Surface surface, int i, int i2);

    void close();

    Object detachAccessoryVideoSurface(Surface surface, HtJ<? super Unit> htJ);

    void detachEmbodimentSurface(Surface surface);

    void endCall();

    void endCall(long j);

    void endCallForOtherCall(long j);

    C1BN<Boolean> getAccessoryLiveVideo();

    C22I<Unit> getCallEnded();

    C1BN<VoiceCallUiState> getCallState();

    C1BN<Boolean> getEmbodimentReady();

    C1BN<Integer> getEmbodimentReadyGeneration();

    boolean getHasAccessory();

    C1BN<Float> getUserSpeechLevel();

    PlayoutInjection injectPlayoutPcm48k(long j, short[] sArr);

    void logSystemPipEvent(VoiceSystemPipEvent voiceSystemPipEvent);

    Object pushAccessoryAudio(long j, short[] sArr, int i, HtJ<? super Boolean> htJ);

    void resizeEmbodimentSurface(Surface surface, int i, int i2);

    boolean sendInput(long j, String str);

    void setMuted(long j, boolean z);

    void startCall(VoiceAudioOnlyReason voiceAudioOnlyReason, Boolean bool, VoiceCallEntryPoint voiceCallEntryPoint, Map<String, String> map, VoiceCallAccessory voiceCallAccessory);

    void toggleCaptions();

    void toggleMute();

    void toggleSpeaker();

    public abstract class DefaultImpls {
    }
}
