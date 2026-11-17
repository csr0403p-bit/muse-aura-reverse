package com.facebook.aura.partners.voice.api;

import X.C06H;
import X.C60N;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.G0U;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class SsePcmDecodingOutputStream extends OutputStream {
    public static final int $stable = 8;
    public final ByteArrayOutputStream lineBuffer;
    public boolean lineOverflowed;
    public final int maxLineBytes;
    public final G0U<byte[], Unit> onPcmChunk;
    public boolean skipNextLf;
    public final TtsStreamStats stats;

    /* JADX WARN: Multi-variable type inference failed */
    public SsePcmDecodingOutputStream(G0U<? super byte[], Unit> g0u, int i) {
        C7384Etj.A0Y(g0u, 0);
        this.onPcmChunk = g0u;
        this.maxLineBytes = i;
        this.stats = new TtsStreamStats();
        this.lineBuffer = new ByteArrayOutputStream();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        this.stats.bytes += i2;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            byte b = bArr[i];
            if (b == 10 && this.skipNextLf) {
                this.skipNextLf = false;
                i4 = i + 1;
                i = i4;
            } else {
                this.skipNextLf = false;
                if (b == 10 || b == 13) {
                    appendToLine(bArr, i4, i - i4);
                    emitLine();
                    if (b == 13) {
                        this.skipNextLf = true;
                    }
                    i4 = i + 1;
                }
                i++;
            }
        }
        if (i4 < i3) {
            appendToLine(bArr, i4, i3 - i4);
        }
    }

    private final void appendToLine(byte[] bArr, int i, int i2) throws IOException {
        if (this.lineOverflowed || i2 <= 0) {
            return;
        }
        long size = this.lineBuffer.size() + i2;
        int i3 = this.maxLineBytes;
        if (size <= i3) {
            this.lineBuffer.write(bArr, i, i2);
            return;
        }
        CFK.A06(SsePcmDecodingOutputStreamKt.TAG, FGI.A0I("Dropping oversized SSE line (> ", i3, C60N.A00(8)));
        this.lineBuffer.reset();
        this.lineOverflowed = true;
        this.stats.oversizedLines++;
    }

    private final void emitLine() throws UnsupportedEncodingException {
        if (this.lineOverflowed) {
            this.lineOverflowed = false;
            this.lineBuffer.reset();
            return;
        }
        String string = this.lineBuffer.toString(HatchWebPageParserKt.UTF_8);
        this.lineBuffer.reset();
        C7384Etj.A0X(string);
        byte[] bArrDecodeTtsDeltaLine = TtsDeltaDecoderKt.decodeTtsDeltaLine(string, this.stats);
        if (bArrDecodeTtsDeltaLine == null || bArrDecodeTtsDeltaLine.length == 0) {
            return;
        }
        this.onPcmChunk.invoke(bArrDecodeTtsDeltaLine);
    }

    public final void flushRemaining() throws UnsupportedEncodingException {
        if (this.lineBuffer.size() > 0) {
            emitLine();
        }
    }

    public final TtsStreamStats getStats() {
        return this.stats;
    }

    public /* synthetic */ SsePcmDecodingOutputStream(G0U g0u, int i, int i2, C06H c06h) {
        this(g0u, (i2 & 2) != 0 ? 1048576 : i);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}
