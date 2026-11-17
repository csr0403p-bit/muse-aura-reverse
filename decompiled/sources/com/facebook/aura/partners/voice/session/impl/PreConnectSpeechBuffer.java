package com.facebook.aura.partners.voice.session.impl;

import X.ADq;
import X.ATD;
import X.AbstractC0878AGe;
import X.AbstractC0886AGn;
import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.C8j3;
import com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioPcmSink;
import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.rsys.audio.frame.gen.AudioFrameMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class PreConnectSpeechBuffer extends AppDrivenAudioPcmSink {
    public static final Companion Companion = new Companion();
    public static final int END_OF_SPEECH_SAMPLES = 19200;
    public static final long JOIN_RESPONSE_MARGIN_MS = 3000;
    public static final int MIN_VOICED_MS = 300;
    public static final int PADDING_MS = 300;
    public static final int SAMPLE_RATE_HZ = 24000;
    public static final double VOICED_RMS = 500.0d;
    public static final int WINDOW_MS = 20;
    public int end;
    public double sourceCarry;
    public double voicedMs;
    public double voicedRunMs;
    public boolean wrapped;
    public long written;
    public final short[] ring = new short[(int) (((VoiceGating.INSTANCE.getConnectTimeoutMs() + 3000) * VoyagerAsrSession.OPUS_RELEASE_SLICE_BYTES) / 1000)];
    public long lastVoicedAt = -1;
    public long lastVoicedFrameAt = -1;
    public volatile boolean capturing = true;
    public volatile long speechStart = -1;

    public final void discard() {
        synchronized (this) {
            this.capturing = false;
            short[] sArr = this.ring;
            Arrays.fill(sArr, 0, sArr.length, (short) 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean hasSpeechEnded() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r6 = r8.lastVoicedAt     // Catch: java.lang.Throwable -> L16
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L13
            long r4 = r8.written     // Catch: java.lang.Throwable -> L16
            long r4 = r4 - r6
            r2 = 19200(0x4b00, double:9.486E-320)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 >= 0) goto L14
        L13:
            r0 = 0
        L14:
            monitor-exit(r8)
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.PreConnectSpeechBuffer.hasSpeechEnded():boolean");
    }

    @Override // com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioPcmSink
    public void onPcmFrame(AudioFrame audioFrame) {
        double d;
        int i;
        C7384Etj.A0Y(audioFrame, 0);
        if (this.capturing) {
            AudioFrameMetadata metadata = audioFrame.getMetadata();
            C7384Etj.A0U(metadata);
            int numberOfChannels = metadata.getNumberOfChannels();
            if (numberOfChannels < 1) {
                numberOfChannels = 1;
            }
            int numberOfSamples = metadata.getNumberOfSamples();
            int sampleRate = metadata.getSampleRate();
            if (numberOfSamples <= 0 || sampleRate <= 0) {
                return;
            }
            short[] audioData = audioFrame.getAudioData().getAudioData(numberOfSamples * numberOfChannels);
            C7384Etj.A0U(audioData);
            synchronized (this) {
                if (this.capturing) {
                    double d2 = sampleRate;
                    double d3 = d2 / 24000.0d;
                    double d4 = this.sourceCarry;
                    while (true) {
                        d = numberOfSamples;
                        i = 0;
                        if (d4 >= d) {
                            break;
                        }
                        int i2 = (int) d4;
                        d4 += d3;
                        int i3 = (int) d4;
                        int i4 = i2 + 1;
                        if (i3 < i4) {
                            i3 = i4;
                        }
                        int iMin = Math.min(numberOfSamples, i3);
                        for (int i5 = i2; i5 < iMin; i5++) {
                            i += audioData[i5 * numberOfChannels];
                        }
                        write((short) (i / (iMin - i2)));
                    }
                    this.sourceCarry = d4 - d;
                    double d5 = 0.0d;
                    do {
                        double d6 = audioData[i * numberOfChannels];
                        d5 += d6 * d6;
                        i++;
                    } while (i < numberOfSamples);
                    if (Math.sqrt(d5 / d) >= 500.0d) {
                        if (this.speechStart < 0) {
                            this.speechStart = this.written;
                        }
                        double d7 = (d * 1000.0d) / d2;
                        long j = this.written;
                        if (j - this.lastVoicedFrameAt >= 19200) {
                            this.voicedRunMs = 0.0d;
                        }
                        this.lastVoicedFrameAt = j;
                        double d8 = this.voicedRunMs + d7;
                        this.voicedRunMs = d8;
                        if (d8 >= 300.0d) {
                            this.lastVoicedAt = j;
                        }
                        this.voicedMs += d7;
                    }
                }
            }
        }
    }

    public final synchronized PcmChunk read(long j, int i) {
        long jA07;
        int iMin;
        short[] sArr;
        long j2 = this.written;
        short[] sArr2 = this.ring;
        int length = sArr2.length;
        long j3 = length;
        jA07 = ATD.A07(j, j2 - j3, j2);
        if (jA07 < 0) {
            jA07 = 0;
        }
        iMin = (int) Math.min(j2 - jA07, i);
        sArr = new short[iMin];
        int i2 = (int) (jA07 % j3);
        int iA0F = C8j3.A0F(length, i2, iMin);
        System.arraycopy(sArr2, i2, sArr, 0, (i2 + iA0F) - i2);
        short[] sArr3 = this.ring;
        C7384Etj.A0Y(sArr3, 0);
        System.arraycopy(sArr3, 0, sArr, iA0F, iMin - iA0F);
        return new PcmChunk(jA07 + iMin, sArr);
    }

    public final CapturedSpeech takeSpeech() {
        int i;
        short[] sArrCopyOf;
        synchronized (this) {
            this.capturing = false;
            double d = this.voicedMs;
            i = (int) d;
            if (d < 300.0d) {
                sArrCopyOf = null;
            } else {
                boolean z = this.wrapped;
                short[] sArr = this.ring;
                if (z) {
                    int i2 = this.end;
                    int length = sArr.length;
                    AbstractC0886AGn.A01(length, length);
                    short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, i2, length);
                    C7384Etj.A0U(sArrCopyOfRange);
                    short[] sArrCopyOf2 = Arrays.copyOf(this.ring, this.end);
                    C7384Etj.A0U(sArrCopyOf2);
                    int length2 = sArrCopyOfRange.length;
                    int length3 = sArrCopyOf2.length;
                    sArrCopyOf = Arrays.copyOf(sArrCopyOfRange, length2 + length3);
                    System.arraycopy(sArrCopyOf2, 0, sArrCopyOf, length2, length3);
                    C7384Etj.A0X(sArrCopyOf);
                } else {
                    sArrCopyOf = Arrays.copyOf(sArr, this.end);
                    C7384Etj.A0U(sArrCopyOf);
                }
            }
            short[] sArr2 = this.ring;
            Arrays.fill(sArr2, 0, sArr2.length, (short) 0);
        }
        if (sArrCopyOf == null) {
            return null;
        }
        int length4 = sArrCopyOf.length;
        ADq aDqA0C = ATD.A0C(0, length4 / 480);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Integer> it = aDqA0C.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (rms(sArrCopyOf, AnonymousClass001.A0F(next) * 480, 480) >= 500.0d) {
                arrayListA0h.add(next);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        int iA0F = (AnonymousClass001.A0F(AbstractC0878AGe.A0F(arrayListA0h)) * 480) - 7200;
        int i3 = iA0F >= 0 ? iA0F : 0;
        int iA0F2 = ((AnonymousClass001.A0F(AbstractC0878AGe.A0H(arrayListA0h)) + 1) * 480) + PreConnectLiveCaption.LEAD_SAMPLES;
        if (iA0F2 > length4) {
            iA0F2 = length4;
        }
        AbstractC0886AGn.A01(iA0F2, length4);
        short[] sArrCopyOfRange2 = Arrays.copyOfRange(sArrCopyOf, i3, iA0F2);
        C7384Etj.A0U(sArrCopyOfRange2);
        return new CapturedSpeech(sArrCopyOfRange2, i);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    private final double rms(short[] sArr, int i, int i2) {
        int i3 = i + i2;
        double d = 0.0d;
        while (i < i3) {
            double d2 = sArr[i];
            d += d2 * d2;
            i++;
        }
        return Math.sqrt(d / i2);
    }

    private final void write(short s) {
        short[] sArr = this.ring;
        int i = this.end;
        sArr[i] = s;
        this.written++;
        int length = (i + 1) % sArr.length;
        this.end = length;
        if (length == 0) {
            this.wrapped = true;
        }
    }

    public final long getSpeechStart() {
        return this.speechStart;
    }

    public final boolean isCapturing() {
        return this.capturing;
    }
}
