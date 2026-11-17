package com.facebook.aura.partners.voice.viewmodel;

import X.C7384Etj;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class ShortArrayBuilder {
    public short[] data = new short[48000];
    public int size;

    public final void append(short[] sArr) {
        C7384Etj.A0Y(sArr, 0);
        int i = this.size;
        int length = sArr.length;
        int i2 = length + i;
        short[] sArrCopyOf = this.data;
        int length2 = sArrCopyOf.length;
        if (i2 > length2) {
            sArrCopyOf = Arrays.copyOf(sArrCopyOf, Math.max(length2 * 2, i2));
            C7384Etj.A0U(sArrCopyOf);
            this.data = sArrCopyOf;
        }
        System.arraycopy(sArr, 0, sArrCopyOf, this.size, length);
        this.size += length;
    }

    public final short[] build() {
        short[] sArrCopyOf = Arrays.copyOf(this.data, this.size);
        C7384Etj.A0U(sArrCopyOf);
        return sArrCopyOf;
    }

    public final int getSize() {
        return this.size;
    }
}
