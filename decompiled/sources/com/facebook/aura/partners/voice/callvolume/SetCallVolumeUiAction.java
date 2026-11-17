package com.facebook.aura.partners.voice.callvolume;

import X.AbstractC3358CGz;
import X.BFI;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.HtJ;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.facebook.aura.partners.voice.callvolume.VolumeChange;
import com.facebook.aura.partners.voice.gating.VoiceCallVolume;
import com.facebook.aura.partners.voice.runtime.VoiceCallRuntime;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiActionExecutor;
import com.facebook.aura.uicontrol.UiSuggestionLabel;
import java.util.Set;

/* loaded from: classes2.dex */
public final class SetCallVolumeUiAction extends C06G implements ContributedUiAction {
    public static final Companion Companion = new Companion();
    public static final Set<Integer> nonBuiltinSpeakerCallOutputs = BFI.A0H(new Integer[]{1, 3, 4, 22, 11, 7, 8, 26, 27, 23});
    public final VolumeChange change;

    public final class Companion {
        public final Set<Integer> getNonBuiltinSpeakerCallOutputs() {
            return SetCallVolumeUiAction.nonBuiltinSpeakerCallOutputs;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SetCallVolumeUiAction(VolumeChange volumeChange) {
        C7384Etj.A0Y(volumeChange, 0);
        this.change = volumeChange;
    }

    public final SetCallVolumeUiAction copy(VolumeChange volumeChange) {
        C7384Etj.A0Y(volumeChange, 0);
        return new SetCallVolumeUiAction(volumeChange);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SetCallVolumeUiAction) && C7384Etj.areEqual(this.change, ((SetCallVolumeUiAction) obj).change));
    }

    public static /* synthetic */ SetCallVolumeUiAction copy$default(SetCallVolumeUiAction setCallVolumeUiAction, VolumeChange volumeChange, int i, Object obj) {
        if ((i & 1) != 0) {
            volumeChange = setCallVolumeUiAction.change;
        }
        C7384Etj.A0Y(volumeChange, 0);
        return new SetCallVolumeUiAction(volumeChange);
    }

    private final boolean needsActiveCall() {
        AudioDeviceInfo[] devices;
        VoiceCallVolume voiceCallVolume = VoiceCallVolume.INSTANCE;
        Integer numCallStream = voiceCallVolume.callStream();
        if (numCallStream != null) {
            if (numCallStream.intValue() == 0) {
                AudioManager audioManager = voiceCallVolume.audioManager();
                if (audioManager != null && (devices = audioManager.getDevices(2)) != null) {
                    for (AudioDeviceInfo audioDeviceInfo : devices) {
                        if (!nonBuiltinSpeakerCallOutputs.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final VolumeChange component1() {
        return this.change;
    }

    public final VolumeChange getChange() {
        return this.change;
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Integer getIconRes() {
        return null;
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public UiSuggestionLabel getSuggestionLabel() {
        return null;
    }

    public int hashCode() {
        return this.change.hashCode();
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Object perform(AbstractC3358CGz abstractC3358CGz, HtJ<? super UiActionExecutor.Result> htJ) {
        boolean zStep;
        String str;
        if (!VoiceCallRuntime.INSTANCE.isCallSupported(abstractC3358CGz)) {
            str = "This voice command is turned off on this device.";
        } else {
            if (!C3cG.A0K(abstractC3358CGz).canAcceptInput() && needsActiveCall()) {
                return new UiActionExecutor.Result.Unsupported("No active voice call is available to change the call volume.", null);
            }
            VolumeChange volumeChange = this.change;
            if (volumeChange instanceof VolumeChange.Level) {
                zStep = VoiceCallVolume.INSTANCE.setPercent(((VolumeChange.Level) volumeChange).percent);
            } else {
                if (!(volumeChange instanceof VolumeChange.Step)) {
                    throw C3cG.A0q();
                }
                zStep = VoiceCallVolume.INSTANCE.step(((VolumeChange.Step) volumeChange).raise);
            }
            if (zStep) {
                return UiActionExecutor.Result.Performed.INSTANCE;
            }
            str = "The call volume can't be changed on this device.";
        }
        return new UiActionExecutor.Result.Unsupported(str, "unsupported_target");
    }

    public String toString() {
        return super.toString();
    }
}
