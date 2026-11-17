package com.facebook.aura.composer.dictation.voyager;

import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.C8j3;
import X.CFK;
import X.CUB;
import X.DCl;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class OggOpusStreamEncoder {
    public static final int BIT_RATE = 32000;
    public static final int BYTES_PER_SAMPLE = 2;
    public static final byte[] CAPTURE_PATTERN;
    public static final int[] CELT_FRAME_SAMPLES;
    public static final long CODEC_TIMEOUT_US = 10000;
    public static final int CRC_OFFSET = 22;
    public static final Companion Companion = new Companion();
    public static final byte[] EMPTY = new byte[0];
    public static final long END_OF_STREAM_TIMEOUT_MS = 500;
    public static final int FLAG_BEGINNING_OF_STREAM = 2;
    public static final int FLAG_END_OF_STREAM = 4;
    public static final int FRAME_BYTES = 960;
    public static final int[] HYBRID_FRAME_SAMPLES;
    public static final long INPUT_WAIT_MS = 200;
    public static final int MAX_INPUT_BYTES = 7680;
    public static final int MAX_LACING_VALUE = 255;
    public static final long MICROS_PER_SECOND = 1000000;
    public static final int[] OGG_CRC_TABLE;
    public static final byte[] OPUS_HEAD;
    public static final byte[] OPUS_TAGS;
    public static final int PACKETS_PER_PAGE = 4;
    public static final int PAGE_HEADER_BYTES = 27;
    public static final int PRE_SKIP_48K = 312;
    public static final int[] SILK_FRAME_SAMPLES;
    public static final String TAG = "OggOpusStreamEncoder";
    public final MediaCodec codec;
    public long granule;
    public boolean headersWritten;
    public final MediaCodec.BufferInfo info;
    public final ArrayList<byte[]> packets;
    public int pageSequence;
    public long queuedSamples;
    public final int serial;

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final int oggCrc(byte[] bArr) {
            int i = 0;
            for (byte b : bArr) {
                i = OggOpusStreamEncoder.OGG_CRC_TABLE[((i >>> 24) ^ (b & 255)) & 255] ^ (i << 8);
            }
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int opusPacketSamples48k(byte[] r7) {
            /*
                r6 = this;
                int r6 = r7.length
                r5 = 0
                if (r6 != 0) goto L5
                return r5
            L5:
                r4 = r7[r5]
                r0 = r4 & 255(0xff, float:3.57E-43)
                int r2 = r0 >>> 3
                r0 = 12
                r3 = 1
                if (r2 >= r0) goto L2b
                int[] r1 = com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder.SILK_FRAME_SAMPLES
            L12:
                r0 = r2 & 3
            L14:
                r2 = r1[r0]
                r1 = r4 & 3
                if (r1 == 0) goto L29
                r0 = 2
                if (r1 == r3) goto L27
                if (r1 == r0) goto L27
                if (r6 <= r3) goto L25
                r0 = r7[r3]
                r5 = r0 & 63
            L25:
                int r2 = r2 * r5
                return r2
            L27:
                r5 = 2
                goto L25
            L29:
                r5 = 1
                goto L25
            L2b:
                r0 = 16
                if (r2 >= r0) goto L34
                int[] r1 = com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder.HYBRID_FRAME_SAMPLES
                r0 = r2 & 1
                goto L14
            L34:
                int[] r1 = com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder.CELT_FRAME_SAMPLES
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder.Companion.opusPacketSamples48k(byte[]):int");
        }

        public final OggOpusStreamEncoder create() throws IOException {
            try {
                MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/opus");
                C7384Etj.A0X(mediaCodecCreateEncoderByType);
                try {
                    MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/opus", 24000, 1);
                    mediaFormatCreateAudioFormat.setInteger("bitrate", OggOpusStreamEncoder.BIT_RATE);
                    mediaFormatCreateAudioFormat.setInteger("max-input-size", OggOpusStreamEncoder.MAX_INPUT_BYTES);
                    mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
                    mediaCodecCreateEncoderByType.start();
                    return new OggOpusStreamEncoder(mediaCodecCreateEncoderByType);
                } catch (Exception e) {
                    CFK.A0A(OggOpusStreamEncoder.TAG, "Could not start the Opus encoder", e);
                    mediaCodecCreateEncoderByType.release();
                    return null;
                }
            } catch (Exception e2) {
                CFK.A0A(OggOpusStreamEncoder.TAG, "No Opus encoder on this device", e2);
                return null;
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void queue(byte[] bArr, int i) throws MediaCodec.CryptoException {
        boolean zA1Q;
        int i2 = 0;
        do {
            int iDequeueInputBuffer = dequeueInputBuffer();
            ByteBuffer inputBuffer = this.codec.getInputBuffer(iDequeueInputBuffer);
            if (inputBuffer == null) {
                throw BV4.A0U();
            }
            inputBuffer.clear();
            int iRemaining = inputBuffer.remaining();
            int length = bArr.length;
            int iA0F = C8j3.A0F(length, i2, iRemaining);
            inputBuffer.put(bArr, i2, iA0F);
            i2 += iA0F;
            zA1Q = AnonymousClass002.A1Q(i2, length);
            this.codec.queueInputBuffer(iDequeueInputBuffer, 0, iA0F, (this.queuedSamples * 1000000) / VoyagerAsrSession.OPUS_RELEASE_SLICE_BYTES, zA1Q ? i : 0);
            this.queuedSamples += iA0F / 2;
        } while (!zA1Q);
    }

    public final byte[] encode(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        try {
            queue(bArr, 0);
            drain(false);
            return this.packets.size() < 4 ? EMPTY : takePages(false);
        } catch (RuntimeException e) {
            CFK.A08(TAG, "Opus encoding failed", e);
            return null;
        }
    }

    static {
        Charset charset = DCl.A01;
        CAPTURE_PATTERN = "OggS".getBytes(charset);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(19);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBufferOrder = byteBufferAllocate.order(byteOrder);
        byteBufferOrder.put("OpusHead".getBytes(charset));
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.putShort((short) 312);
        byteBufferOrder.putInt(24000);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        OPUS_HEAD = byteBufferOrder.array();
        byte[] bytes = "Aura".getBytes(charset);
        int length = bytes.length;
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(length + 16).order(byteOrder);
        byteBufferOrder2.put("OpusTags".getBytes(charset));
        byteBufferOrder2.putInt(length);
        byteBufferOrder2.put(bytes);
        byteBufferOrder2.putInt(0);
        OPUS_TAGS = byteBufferOrder2.array();
        SILK_FRAME_SAMPLES = new int[]{480, 960, 1920, 2880};
        HYBRID_FRAME_SAMPLES = new int[]{480, 960};
        CELT_FRAME_SAMPLES = new int[]{120, 240, 480, 960};
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            int i2 = i << 24;
            int i3 = 0;
            do {
                int i4 = Integer.MIN_VALUE & i2;
                i2 <<= 1;
                if (i4 != 0) {
                    i2 ^= 79764919;
                }
                i3++;
            } while (i3 < 8);
            iArr[i] = i2;
        }
        OGG_CRC_TABLE = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final byte[] takePages(boolean r13) throws java.io.IOException {
        /*
            r12 = this;
            java.util.ArrayList<byte[]> r0 = r12.packets
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            byte[] r0 = com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder.EMPTY
            return r0
        Lb:
            java.io.ByteArrayOutputStream r5 = X.BV4.A0F()
            boolean r0 = r12.headersWritten
            r2 = 0
            if (r0 != 0) goto L32
            r0 = 1
            r12.headersWritten = r0
            byte[] r0 = com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder.OPUS_HEAD
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 2
            byte[] r0 = r12.page(r1, r0)
            r5.write(r0)
            byte[] r0 = com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder.OPUS_TAGS
            java.util.List r0 = java.util.Collections.singletonList(r0)
            byte[] r0 = r12.page(r0, r2)
            r5.write(r0)
        L32:
            java.util.ArrayList<byte[]> r1 = r12.packets
            r0 = 4
            java.util.ArrayList r11 = X.AbstractC0878AGe.A0N(r1, r0)
            java.util.Iterator r10 = r11.iterator()
            r7 = 0
        L3e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r6 = r10.next()
            int r9 = r7 + 1
            if (r7 >= 0) goto L54
            X.AbstractC0885AGm.A14()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L54:
            java.util.List r6 = (java.util.List) r6
            long r2 = r12.granule
            com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder$Companion r8 = com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder.Companion
            java.util.Iterator r4 = r6.iterator()
            r1 = 0
        L5f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r4.next()
            byte[] r0 = (byte[]) r0
            int r0 = com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder.Companion.access$opusPacketSamples48k(r8, r0)
            int r1 = r1 + r0
            goto L5f
        L71:
            long r0 = (long) r1
            long r2 = r2 + r0
            r12.granule = r2
            if (r13 == 0) goto L7e
            int r1 = X.C8j3.A0K(r11)
            r0 = 4
            if (r7 == r1) goto L7f
        L7e:
            r0 = 0
        L7f:
            byte[] r0 = r12.page(r6, r0)
            r5.write(r0)
            r7 = r9
            goto L3e
        L88:
            java.util.ArrayList<byte[]> r0 = r12.packets
            r0.clear()
            byte[] r0 = X.C7384Etj.A0d(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder.takePages(boolean):byte[]");
    }

    public final byte[] finish() {
        try {
            queue(new byte[960], 0);
            queue(EMPTY, 4);
            drain(true);
            return takePages(true);
        } catch (RuntimeException e) {
            CFK.A08(TAG, "Opus encoding failed", e);
            return null;
        }
    }

    public final void release() {
        try {
            this.codec.release();
        } catch (RuntimeException e) {
            CFK.A0A(TAG, "Opus encoder release failed", e);
        }
    }

    public OggOpusStreamEncoder(MediaCodec mediaCodec) {
        this.codec = mediaCodec;
        this.info = new MediaCodec.BufferInfo();
        this.packets = C3cG.A0h();
        this.serial = CUB.A01.A03();
    }

    private final int dequeueInputBuffer() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 200;
        while (true) {
            int iDequeueInputBuffer = this.codec.dequeueInputBuffer(10000L);
            if (iDequeueInputBuffer >= 0) {
                return iDequeueInputBuffer;
            }
            if (SystemClock.elapsedRealtime() >= jElapsedRealtime) {
                throw C3cG.A0Q("Opus encoder has no free input buffer");
            }
            drain(false);
        }
    }

    private final void drain(boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 500;
        while (true) {
            int iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(this.info, z ? 10000L : 0L);
            if (iDequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
                if (SystemClock.elapsedRealtime() >= jElapsedRealtime) {
                    throw C3cG.A0Q("Opus encoder did not reach the end of stream");
                }
            } else if (iDequeueOutputBuffer >= 0) {
                MediaCodec.BufferInfo bufferInfo = this.info;
                int i = bufferInfo.flags;
                if ((i & 2) == 0 && bufferInfo.size > 0) {
                    ByteBuffer outputBuffer = this.codec.getOutputBuffer(iDequeueOutputBuffer);
                    if (outputBuffer == null) {
                        throw BV4.A0U();
                    }
                    outputBuffer.position(this.info.offset);
                    ArrayList<byte[]> arrayList = this.packets;
                    byte[] bArr = new byte[this.info.size];
                    outputBuffer.get(bArr);
                    arrayList.add(bArr);
                }
                this.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((i & 4) != 0) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    private final byte[] page(List<byte[]> list, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
        Iterator<byte[]> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int length = it.next().length;
            int i2 = length / 255;
            for (int i3 = 0; i3 < i2; i3++) {
                byteArrayOutputStreamA0F.write(255);
            }
            byteArrayOutputStreamA0F.write(length % 255);
        }
        byte[] byteArray = byteArrayOutputStreamA0F.toByteArray();
        int length2 = byteArray.length;
        int i4 = length2 + 27;
        Iterator<byte[]> it2 = list.iterator();
        int length3 = 0;
        while (it2.hasNext()) {
            length3 += it2.next().length;
        }
        ByteBuffer byteBufferA0t = BV5.A0t(i4 + length3);
        byteBufferA0t.put(CAPTURE_PATTERN);
        byteBufferA0t.put((byte) 0);
        byteBufferA0t.put((byte) i);
        byteBufferA0t.putLong(this.granule);
        byteBufferA0t.putInt(this.serial);
        int i5 = this.pageSequence;
        this.pageSequence = i5 + 1;
        byteBufferA0t.putInt(i5);
        byteBufferA0t.putInt(0);
        byteBufferA0t.put((byte) length2);
        byteBufferA0t.put(byteArray);
        Iterator<byte[]> it3 = list.iterator();
        while (it3.hasNext()) {
            byteBufferA0t.put(it3.next());
        }
        Companion companion = Companion;
        byte[] bArrArray = byteBufferA0t.array();
        C7384Etj.A0U(bArrArray);
        byteBufferA0t.putInt(22, companion.oggCrc(bArrArray));
        byte[] bArrArray2 = byteBufferA0t.array();
        C7384Etj.A0U(bArrArray2);
        return bArrArray2;
    }

    private final byte[] runEncoder(Function0<byte[]> function0) {
        try {
            return function0.invoke();
        } catch (RuntimeException e) {
            CFK.A08(TAG, "Opus encoding failed", e);
            return null;
        }
    }

    public /* synthetic */ OggOpusStreamEncoder(MediaCodec mediaCodec, C06H c06h) {
        this(mediaCodec);
    }
}
