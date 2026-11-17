package com.facebook.rsys.audio.gen;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8923Ftf;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class AudioStream {
    public static G50<AudioStream> CONVERTER = C8923Ftf.A00(44);
    public static long sMcfTypeId;
    public final int channelState;
    public final String codec;
    public final Float playbackVolumeDesiredDeprecated;
    public final String streamId;
    public final McfReference streamSource;
    public final int streamState;
    public final int streamStateDesired;
    public final int type;

    public static native AudioStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioStream) {
                AudioStream audioStream = (AudioStream) obj;
                McfReference mcfReference = this.streamSource;
                McfReference mcfReference2 = audioStream.streamSource;
                if (mcfReference != null ? mcfReference.equals(mcfReference2) : mcfReference2 == null) {
                    if (this.type == audioStream.type) {
                        String str = this.streamId;
                        String str2 = audioStream.streamId;
                        if (str == null) {
                            if (str2 != null) {
                                return false;
                            }
                        } else if (str.equals(str2)) {
                        }
                        if (this.streamState == audioStream.streamState && this.streamStateDesired == audioStream.streamStateDesired && this.channelState == audioStream.channelState) {
                            Float f = this.playbackVolumeDesiredDeprecated;
                            Float f2 = audioStream.playbackVolumeDesiredDeprecated;
                            if (f == null) {
                                if (f2 != null) {
                                    return false;
                                }
                            } else if (f.equals(f2)) {
                            }
                            String str3 = this.codec;
                            String str4 = audioStream.codec;
                            if (str3 == null) {
                                if (str4 != null) {
                                    return false;
                                }
                            } else if (str3.equals(str4)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((AbstractC7608F5v.A02(AnonymousClass006.A0D(this.streamSource)) + this.type) * 31) + AnonymousClass006.A0G(this.streamId)) * 31) + this.streamState) * 31) + this.streamStateDesired) * 31) + this.channelState) * 31) + AnonymousClass006.A0D(this.playbackVolumeDesiredDeprecated)) * 31) + AnonymousClass005.A0H(this.codec);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioStream{streamSource=");
        sbA0x.append(this.streamSource);
        sbA0x.append(",type=");
        sbA0x.append(this.type);
        sbA0x.append(",streamId=");
        sbA0x.append(this.streamId);
        sbA0x.append(",streamState=");
        sbA0x.append(this.streamState);
        sbA0x.append(",streamStateDesired=");
        sbA0x.append(this.streamStateDesired);
        sbA0x.append(",channelState=");
        sbA0x.append(this.channelState);
        sbA0x.append(",playbackVolumeDesiredDeprecated=");
        sbA0x.append(this.playbackVolumeDesiredDeprecated);
        sbA0x.append(",codec=");
        return AbstractC7610F5x.A0w(this.codec, sbA0x);
    }

    public AudioStream(McfReference mcfReference, int i, String str, int i2, int i3, int i4, Float f, String str2) {
        this.streamSource = mcfReference;
        this.type = i;
        this.streamId = str;
        this.streamState = i2;
        this.streamStateDesired = i3;
        this.channelState = i4;
        this.playbackVolumeDesiredDeprecated = f;
        this.codec = str2;
    }
}
