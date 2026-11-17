package com.facebook.aura.composer.dictation.pcm;

import X.C7384Etj;

/* loaded from: classes5.dex */
public abstract class PcmDictationKt {
    public static final byte[] toLittleEndianPcmBytes(short[] sArr) {
        C7384Etj.A0Y(sArr, 0);
        int length = sArr.length;
        byte[] bArr = new byte[length * 2];
        for (int i = 0; i < length; i++) {
            short s = sArr[i];
            int i2 = i * 2;
            bArr[i2] = (byte) s;
            bArr[i2 + 1] = (byte) (s >> 8);
        }
        return bArr;
    }
}
