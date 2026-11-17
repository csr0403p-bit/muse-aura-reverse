package com.facebook.aura.partners.voice.api;

import X.C7384Etj;
import X.DCl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class Pcm16WavSink extends OutputStream {
    public final ByteArrayOutputStream bytes;
    public final long maxPcmBytes;

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        if (i2 > this.maxPcmBytes - (this.bytes.size() - 44)) {
            throw new IOException("Designed voice preview exceeds response limit");
        }
        this.bytes.write(bArr, i, i2);
    }

    public final int pcmSize() {
        return this.bytes.size() - 44;
    }

    public final byte[] toWav(int i) {
        int size = this.bytes.size() - 44;
        if (size == 0 || size % 2 != 0) {
            return null;
        }
        byte[] byteArray = this.bytes.toByteArray();
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(byteArray, 0, 44).order(ByteOrder.LITTLE_ENDIAN);
        Charset charset = DCl.A01;
        byteBufferOrder.put("RIFF".getBytes(charset));
        byteBufferOrder.putInt(size + 36);
        byteBufferOrder.put("WAVEfmt ".getBytes(charset));
        byteBufferOrder.putInt(16);
        byteBufferOrder.putShort((short) 1);
        byteBufferOrder.putShort((short) 1);
        byteBufferOrder.putInt(i);
        byteBufferOrder.putInt(i * 2);
        byteBufferOrder.putShort((short) 2);
        byteBufferOrder.putShort((short) 16);
        byteBufferOrder.put("data".getBytes(charset));
        byteBufferOrder.putInt(size);
        return byteArray;
    }

    public Pcm16WavSink(long j) throws IOException {
        this.maxPcmBytes = j;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(new byte[44]);
        this.bytes = byteArrayOutputStream;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
