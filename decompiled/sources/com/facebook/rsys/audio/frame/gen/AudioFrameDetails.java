package com.facebook.rsys.audio.frame.gen;

import X.C8923Ftf;
import X.G50;
import X.GUQ;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class AudioFrameDetails {
    public static G50<AudioFrameDetails> CONVERTER = C8923Ftf.A00(29);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native AudioFrameDetails createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, long j, long j2, short s, short s2, byte b, Long l, long j3, long j4, long j5, ArrayList<Long> arrayList, Long l2, Long l3, AudioTtsMetadata audioTtsMetadata, ArrayList<String> arrayList2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native Long getAbsoluteCaptureTimestampMs();

    public native long getArrivalTimeUs();

    public native Long getCaptureToPlayoutLatencyMs();

    public native short getChannelLayout();

    public native ArrayList<Long> getCsrcs();

    public native long getElapsedTimeMs();

    public native long getEndDecodingTimeUs();

    public native Long getLocalCaptureClockOffsetMs();

    public native long getNtpTimeMs();

    public native short getSpeechType();

    public native long getSyncBufferSizeUs();

    public native int getTimestamp();

    public native AudioTtsMetadata getTtsMetadata();

    public native ArrayList<String> getUserIds();

    public native byte getVadActivity();

    public native int hashCode();

    public native String toString();

    static {
        GUQ.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AudioFrameDetails)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public AudioFrameDetails(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AudioFrameDetails(int i, long j, long j2, short s, short s2, byte b, Long l, long j3, long j4, long j5, ArrayList<Long> arrayList, Long l2, Long l3, AudioTtsMetadata audioTtsMetadata, ArrayList<String> arrayList2) {
        arrayList.getClass();
        this.mNativeHolder = initNativeHolder(i, j, j2, s, s2, b, l, j3, j4, j5, arrayList, l2, l3, audioTtsMetadata, arrayList2);
    }
}
