package com.facebook.aura.partners.voice.api;

import X.C7384Etj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public final class PreviewResponseSink extends OutputStream {
    public final ByteArrayOutputStream audio = new ByteArrayOutputStream();
    public final SsePcmDecodingOutputStream decoder;
    public final long maxResponseBytes;
    public long responseBytes;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        long j = i2;
        long j2 = this.maxResponseBytes;
        long j3 = this.responseBytes;
        if (j > j2 - j3) {
            throw new IOException("Voice preview exceeds response limit");
        }
        this.responseBytes = j3 + j;
        this.decoder.write(bArr, i, i2);
    }

    public final byte[] audio() throws UnsupportedEncodingException {
        this.decoder.flushRemaining();
        byte[] byteArray = this.audio.toByteArray();
        C7384Etj.A0X(byteArray);
        if (byteArray.length == 0) {
            return null;
        }
        return byteArray;
    }

    public PreviewResponseSink(long j, int i) {
        this.maxResponseBytes = j;
        this.decoder = new SsePcmDecodingOutputStream(new PreviewResponseSink$decoder$1(i, this), (int) j);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
