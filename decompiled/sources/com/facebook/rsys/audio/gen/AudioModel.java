package com.facebook.rsys.audio.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.C60O;
import X.C8923Ftf;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class AudioModel {
    public static G50<AudioModel> CONVERTER = C8923Ftf.A00(39);
    public static long sMcfTypeId;
    public final AudioInputRoute activeAudioInputRoute;
    public final AudioOutputRoute activeAudioOutputRoute;
    public final int audioActivationState;
    public final boolean audioBufferingStarted;
    public final boolean hasUsedBluetoothAudioOutputRoute;
    public final boolean isInitialModel;
    public final boolean micOn;
    public final boolean micOnDesired;
    public final boolean noiseSuppressionOn;

    public static native AudioModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioModel) {
                AudioModel audioModel = (AudioModel) obj;
                if (this.audioActivationState != audioModel.audioActivationState || this.micOnDesired != audioModel.micOnDesired || this.micOn != audioModel.micOn || this.noiseSuppressionOn != audioModel.noiseSuppressionOn || !this.activeAudioInputRoute.equals(audioModel.activeAudioInputRoute) || this.hasUsedBluetoothAudioOutputRoute != audioModel.hasUsedBluetoothAudioOutputRoute || !this.activeAudioOutputRoute.equals(audioModel.activeAudioOutputRoute) || this.audioBufferingStarted != audioModel.audioBufferingStarted || this.isInitialModel != audioModel.isInitialModel) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.activeAudioOutputRoute, (AnonymousClass005.A0F(this.activeAudioInputRoute, (((((((527 + this.audioActivationState) * 31) + (this.micOnDesired ? 1 : 0)) * 31) + (this.micOn ? 1 : 0)) * 31) + (this.noiseSuppressionOn ? 1 : 0)) * 31) + (this.hasUsedBluetoothAudioOutputRoute ? 1 : 0)) * 31) + (this.audioBufferingStarted ? 1 : 0)) * 31) + (this.isInitialModel ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioModel{audioActivationState=");
        sbA0x.append(this.audioActivationState);
        sbA0x.append(",micOnDesired=");
        sbA0x.append(this.micOnDesired);
        sbA0x.append(",micOn=");
        sbA0x.append(this.micOn);
        sbA0x.append(",noiseSuppressionOn=");
        sbA0x.append(this.noiseSuppressionOn);
        sbA0x.append(",activeAudioInputRoute=");
        sbA0x.append(this.activeAudioInputRoute);
        sbA0x.append(",hasUsedBluetoothAudioOutputRoute=");
        sbA0x.append(this.hasUsedBluetoothAudioOutputRoute);
        sbA0x.append(",activeAudioOutputRoute=");
        sbA0x.append(this.activeAudioOutputRoute);
        sbA0x.append(",audioBufferingStarted=");
        sbA0x.append(this.audioBufferingStarted);
        sbA0x.append(",isInitialModel=");
        return AbstractC7610F5x.A0y(sbA0x, this.isInitialModel);
    }

    public AudioModel(int i, boolean z, boolean z2, boolean z3, AudioInputRoute audioInputRoute, boolean z4, AudioOutputRoute audioOutputRoute, boolean z5, boolean z6) {
        audioInputRoute.getClass();
        audioOutputRoute.getClass();
        this.audioActivationState = i;
        this.micOnDesired = z;
        this.micOn = z2;
        this.noiseSuppressionOn = z3;
        this.activeAudioInputRoute = audioInputRoute;
        this.hasUsedBluetoothAudioOutputRoute = z4;
        this.activeAudioOutputRoute = audioOutputRoute;
        this.audioBufferingStarted = z5;
        this.isInitialModel = z6;
    }
}
