package com.facebook.aura.composer.dictation.voyager;

import X.C3cG;
import X.Ey9;
import org.webrtc.voiceengine.WebRtcAudioUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class VoyagerAsrAudioEncoding {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoyagerAsrAudioEncoding[] $VALUES;
    public static final VoyagerAsrAudioEncoding OGG_OPUS;
    public static final VoyagerAsrAudioEncoding PCM_16KHZ;
    public static final VoyagerAsrAudioEncoding PCM_24KHZ;
    public final int sampleRateHz;
    public final String wireValue;

    static {
        VoyagerAsrAudioEncoding voyagerAsrAudioEncoding = new VoyagerAsrAudioEncoding("PCM_24KHZ", 0, "PCM_24KHZ", 24000);
        PCM_24KHZ = voyagerAsrAudioEncoding;
        VoyagerAsrAudioEncoding voyagerAsrAudioEncoding2 = new VoyagerAsrAudioEncoding("PCM_16KHZ", 1, "PCM_16KHZ", WebRtcAudioUtils.DEFAULT_SAMPLE_RATE_HZ);
        PCM_16KHZ = voyagerAsrAudioEncoding2;
        VoyagerAsrAudioEncoding voyagerAsrAudioEncoding3 = new VoyagerAsrAudioEncoding("OGG_OPUS", 2, "OGG_OPUS", 24000);
        OGG_OPUS = voyagerAsrAudioEncoding3;
        VoyagerAsrAudioEncoding[] voyagerAsrAudioEncodingArr = {voyagerAsrAudioEncoding, voyagerAsrAudioEncoding2, voyagerAsrAudioEncoding3};
        $VALUES = voyagerAsrAudioEncodingArr;
        $ENTRIES = C3cG.A0w(voyagerAsrAudioEncodingArr);
    }

    public static Ey9<VoyagerAsrAudioEncoding> getEntries() {
        return $ENTRIES;
    }

    public static VoyagerAsrAudioEncoding valueOf(String str) {
        return (VoyagerAsrAudioEncoding) Enum.valueOf(VoyagerAsrAudioEncoding.class, str);
    }

    public static VoyagerAsrAudioEncoding[] values() {
        return (VoyagerAsrAudioEncoding[]) $VALUES.clone();
    }

    public final int getSampleRateHz() {
        return this.sampleRateHz;
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public VoyagerAsrAudioEncoding(String str, int i, String str2, int i2) {
        this.wireValue = str2;
        this.sampleRateHz = i2;
    }
}
