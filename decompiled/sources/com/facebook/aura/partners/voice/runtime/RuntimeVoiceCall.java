package com.facebook.aura.partners.voice.runtime;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C1BN;
import X.C3cG;
import X.C7384Etj;
import X.HtJ;
import android.view.Surface;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.intf.BackgroundVoiceCall;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.intf.VoiceCallUiState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class RuntimeVoiceCall implements BackgroundVoiceCall {
    public final C1BN<Float> assistantAudioLevel;
    public final long callGeneration;
    public final VoiceCallStateHolder holder;
    public final VoiceCallManager manager;
    public final C1BN<VoiceCallUiState> state;
    public final C1BN<Float> userAudioLevel;
    public final C1BN<Integer> videoReadyGeneration;

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public boolean attachAccessoryVideoSurface(Surface surface, int i, int i2) {
        C7384Etj.A0Y(surface, 0);
        return this.manager.attachAccessoryVideoSurface(surface, i, i2);
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public Integer attachVideoSurface(Surface surface, int i, int i2) {
        C7384Etj.A0Y(surface, 0);
        Integer numAttachEmbodimentSurface = this.manager.attachEmbodimentSurface(surface, i, i2);
        this.holder.setEmbodimentRtcRendererAttached(surface, AnonymousClass002.A1X(numAttachEmbodimentSurface));
        return numAttachEmbodimentSurface;
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public void detachVideoSurface(Surface surface) {
        C7384Etj.A0Y(surface, 0);
        this.manager.detachEmbodimentSurface(surface);
        this.holder.setEmbodimentRtcRendererAttached(surface, false);
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public void resizeVideoSurface(Surface surface, int i, int i2) {
        C7384Etj.A0Y(surface, 0);
        this.manager.resizeEmbodimentSurface(surface, i, i2);
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public Object detachAccessoryVideoSurface(Surface surface, HtJ<? super Unit> htJ) {
        return C3cG.A0U(this.manager.detachAccessoryVideoSurface(surface, htJ));
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public void end() {
        this.manager.endCall(this.callGeneration);
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public void endForOtherCall() {
        this.manager.endCallForOtherCall(this.callGeneration);
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public C1BN<Boolean> getAccessoryLiveVideo() {
        return this.manager.getAccessoryLiveVideo();
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public C1BN<Float> getAssistantAudioLevel() {
        return this.assistantAudioLevel;
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public boolean getHasAccessory() {
        return this.manager.getHasAccessory();
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public C1BN<VoiceCallUiState> getState() {
        return this.state;
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public C1BN<Float> getUserAudioLevel() {
        return this.userAudioLevel;
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public C1BN<Integer> getVideoReadyGeneration() {
        return this.videoReadyGeneration;
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public Object pushAccessoryAudio(short[] sArr, int i, HtJ<? super Boolean> htJ) {
        return this.manager.pushAccessoryAudio(this.callGeneration, sArr, i, htJ);
    }

    @Override // com.facebook.aura.partners.voice.intf.BackgroundVoiceCall
    public void setMuted(boolean z) {
        this.manager.setMuted(this.callGeneration, z);
    }

    public RuntimeVoiceCall(VoiceCallSessionOwner voiceCallSessionOwner, VoiceCallManager voiceCallManager, VoiceCallStateHolder voiceCallStateHolder, long j) {
        AnonymousClass005.A0x(voiceCallSessionOwner, voiceCallManager, voiceCallStateHolder);
        this.manager = voiceCallManager;
        this.holder = voiceCallStateHolder;
        this.callGeneration = j;
        this.state = voiceCallSessionOwner.observeCallState$fbandroid_express_aura_java_com_facebook_aura_partners_voice_runtime_runtime(voiceCallManager, voiceCallStateHolder, j);
        this.videoReadyGeneration = voiceCallManager.getEmbodimentReadyGeneration();
        this.userAudioLevel = voiceCallManager.getUserSpeechLevel();
        this.assistantAudioLevel = voiceCallStateHolder.botAudioLevel;
    }
}
