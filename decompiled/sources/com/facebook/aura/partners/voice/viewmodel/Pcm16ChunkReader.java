package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC0903AHf;
import X.C7384Etj;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class Pcm16ChunkReader {
    public static final int $stable = 8;
    public Byte pending;

    public final short[] read(byte[] bArr) {
        Byte bValueOf;
        C7384Etj.A0Y(bArr, 0);
        Byte b = this.pending;
        if (b != null) {
            bArr = AbstractC0903AHf.A07(new byte[]{b.byteValue()}, bArr);
        }
        int length = bArr.length;
        if (length % 2 != 1) {
            bValueOf = null;
        } else {
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            bValueOf = Byte.valueOf(bArr[length - 1]);
        }
        this.pending = bValueOf;
        int i = length / 2;
        short[] sArr = new short[i];
        ByteBuffer.wrap(bArr, 0, i * 2).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(sArr);
        return sArr;
    }
}
