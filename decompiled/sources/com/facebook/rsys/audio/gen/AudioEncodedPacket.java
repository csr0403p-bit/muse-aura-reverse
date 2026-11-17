package com.facebook.rsys.audio.gen;

import X.C8923Ftf;
import X.G50;
import X.GUX;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class AudioEncodedPacket {
    public static G50<AudioEncodedPacket> CONVERTER = C8923Ftf.A00(36);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native AudioEncodedPacket createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(byte[] bArr, short s, int i, ArrayList<Integer> arrayList, AudioVadMetadata audioVadMetadata);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native ArrayList<Integer> getCsrcs();

    public native byte[] getEncodedData();

    public native short getSeqNum();

    public native int getTimestamp();

    public native AudioVadMetadata getVadMetadata();

    public native int hashCode();

    public native String toString();

    static {
        GUX.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AudioEncodedPacket)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public AudioEncodedPacket(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AudioEncodedPacket(byte[] bArr, short s, int i, ArrayList<Integer> arrayList, AudioVadMetadata audioVadMetadata) {
        bArr.getClass();
        this.mNativeHolder = initNativeHolder(bArr, s, i, arrayList, audioVadMetadata);
    }
}
