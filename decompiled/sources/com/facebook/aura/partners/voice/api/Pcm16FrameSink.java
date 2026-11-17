package com.facebook.aura.partners.voice.api;

import X.AbstractC0903AHf;
import X.C7384Etj;
import X.G0U;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class Pcm16FrameSink extends OutputStream {
    public final G0U<byte[], Unit> onPcmChunk;
    public Byte pendingByte;

    /* JADX WARN: Multi-variable type inference failed */
    public Pcm16FrameSink(G0U<? super byte[], Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.onPcmChunk = g0u;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        C7384Etj.A0Y(bArr, 0);
        byte[] bArrA06 = AbstractC0903AHf.A06(bArr, i, i2 + i);
        Byte b = this.pendingByte;
        if (b != null) {
            bArrA06 = AbstractC0903AHf.A07(new byte[]{b.byteValue()}, bArrA06);
        }
        int length = bArrA06.length;
        int i3 = length - (length % 2);
        this.pendingByte = (i3 < 0 || i3 >= length) ? null : Byte.valueOf(bArrA06[i3]);
        if (i3 > 0) {
            G0U<byte[], Unit> g0u = this.onPcmChunk;
            if (i3 != length) {
                bArrA06 = Arrays.copyOf(bArrA06, i3);
                C7384Etj.A0U(bArrA06);
            }
            g0u.invoke(bArrA06);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
