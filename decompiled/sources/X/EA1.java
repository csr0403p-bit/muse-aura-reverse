package X;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.AndroidVideoDecoder;

/* loaded from: classes5.dex */
public final class EA1 implements InterfaceC6172DxF {
    public static int A0n;
    public static ExecutorService A0o;
    public float A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public AudioTrack A05;
    public DrN A06;
    public DrN A07;
    public C6504E9t A08;
    public E6Y A09;
    public InterfaceC6515EAr A0A;
    public EB6 A0B;
    public EAW A0C;
    public C6521EAz A0D;
    public C6512EAb A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public EAX[] A0L;
    public ByteBuffer[] A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public long A0Q;
    public long A0R;
    public long A0S;
    public C6233Dyb A0T;
    public ByteBuffer A0U;
    public ByteBuffer A0V;
    public EAW A0W;
    public C6521EAz A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public final InterfaceC6516EAu A0b;
    public final C5778DpK A0c;
    public final ArrayDeque<C6521EAz> A0d;
    public final DMX A0e;
    public final EA6 A0f;
    public final C6506E9v<AudioSink$InitializationException> A0g;
    public final C6506E9v<AudioSink$WriteException> A0h;
    public final EAK A0i;
    public final BVI A0j;
    public final EAC A0k;
    public final EAX[] A0l;
    public final EAX[] A0m;
    public static final Object A0q = C3cG.A0T();
    public static AtomicInteger A0p = BV5.A17();

    private void A07(ByteBuffer byteBuffer, long j) throws AudioSink$WriteException {
        int iWrite;
        if (byteBuffer.hasRemaining()) {
            C6506E9v<AudioSink$WriteException> c6506E9v = this.A0h;
            if (c6506E9v.A02()) {
                return;
            }
            ByteBuffer byteBuffer2 = this.A0V;
            if (byteBuffer2 != null) {
                C1G.A07(AnonymousClass002.A1Z(byteBuffer2, byteBuffer));
            } else {
                this.A0V = byteBuffer;
            }
            int iRemaining = byteBuffer.remaining();
            if (this.A0K) {
                C1G.A08(AnonymousClass002.A1L((j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1))));
                iWrite = this.A05.write(byteBuffer, iRemaining, 1, j * 1000);
            } else {
                iWrite = this.A05.write(byteBuffer, iRemaining, 1);
            }
            this.A02 = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(this.A0C.A07, iWrite, (iWrite == -6 || iWrite == -32) && this.A0R > 0);
                InterfaceC6515EAr interfaceC6515EAr = this.A0A;
                if (interfaceC6515EAr != null) {
                    interfaceC6515EAr.onAudioSinkError(audioSink$WriteException);
                }
                if (audioSink$WriteException.isRecoverable) {
                    throw audioSink$WriteException;
                }
                c6506E9v.A01(audioSink$WriteException);
                return;
            }
            c6506E9v.A00();
            if (this.A05.isOffloadedPlayback() && this.A0R > 0) {
                this.A0Z = false;
            }
            int i = this.A0C.A04;
            if (i == 0) {
                this.A0S += iWrite;
            }
            if (iWrite == iRemaining) {
                if (i != 0) {
                    C1G.A08(byteBuffer == this.A0U);
                    this.A0R += this.A0O * this.A0P;
                }
                this.A0V = null;
            }
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void AA0() throws IllegalStateException {
        C1G.A08(this.A0G);
        if (this.A0K) {
            return;
        }
        this.A0K = true;
        flush();
    }

    @Override // X.InterfaceC6172DxF
    public final void AN3() {
        this.A0J = true;
    }

    @Override // X.InterfaceC6172DxF
    public final void pause() throws IllegalStateException {
        this.A0H = false;
        if (this.A05 != null) {
            EA6 ea6 = this.A0f;
            ea6.A0H = 0L;
            ea6.A04 = 0;
            ea6.A02 = 0;
            ea6.A09 = 0L;
            ea6.A0B = 0L;
            ea6.A0E = 0L;
            ea6.A0Q = false;
            if (ea6.A0J == -9223372036854775807L) {
                C6513EAc c6513EAc = ea6.A0M;
                c6513EAc.getClass();
                c6513EAc.A00();
                this.A05.pause();
            }
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void play() throws IllegalStateException {
        this.A0H = true;
        if (this.A05 != null) {
            C6513EAc c6513EAc = this.A0f.A0M;
            c6513EAc.getClass();
            c6513EAc.A00();
            this.A05.play();
        }
    }

    public static long A00(EA1 ea1) {
        return ea1.A0C.A04 == 0 ? ea1.A0S / r1.A05 : ea1.A0R;
    }

    private AudioTrack A01(EAW eaw) throws UnsupportedOperationException, AudioSink$InitializationException {
        AudioTrack audioTrackBuild;
        AudioAttributes audioAttributesBuild;
        String str;
        try {
            boolean z = this.A0K;
            DrN drN = this.A06;
            int i = this.A01;
            boolean z2 = this.A0G;
            if (!AbstractC5653Dmh.A03(EnumC5618Dlz.A0Q) || (i != 0 && z2)) {
                audioTrackBuild = null;
            } else {
                C6507E9w c6507E9w = C6507E9w.A03;
                int i2 = eaw.A03;
                int i3 = eaw.A06;
                int i4 = eaw.A02;
                int i5 = eaw.A00;
                boolean zA1Q = BV7.A1Q(eaw.A04);
                int i6 = drN.A01;
                audioTrackBuild = null;
                if (!z && !zA1Q) {
                    BeO beO = new BeO(i2, i3, i4, i5, i6);
                    synchronized (c6507E9w.A01) {
                        try {
                            ArrayDeque<AudioTrack> arrayDeque = c6507E9w.A02.get(beO);
                            if (arrayDeque != null && !arrayDeque.isEmpty()) {
                                AudioTrack audioTrackRemoveFirst = arrayDeque.removeFirst();
                                c6507E9w.A00--;
                                if (audioTrackRemoveFirst.getState() != 1) {
                                    str = "AudioTrackPool";
                                    CNC.A04("AudioTrackPool", "Pooled AudioTrack in invalid state, discarding");
                                } else {
                                    try {
                                        audioTrackRemoveFirst.flush();
                                        audioTrackRemoveFirst.pause();
                                        StringBuilder sbA0f = C3cG.A0f(beO, "Reused AudioTrack from pool: ");
                                        sbA0f.append(", remaining in pool: ");
                                        CNC.A01("AudioTrackPool", BV4.A0l(sbA0f, c6507E9w.A00));
                                        audioTrackBuild = audioTrackRemoveFirst;
                                    } catch (Exception e) {
                                        str = "AudioTrackPool";
                                        CNC.A06("AudioTrackPool", "Failed to flush pooled AudioTrack, discarding", e);
                                    }
                                }
                                try {
                                    audioTrackRemoveFirst.release();
                                } catch (Exception e2) {
                                    CNC.A06(str, "Failed to release AudioTrack", e2);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            if (audioTrackBuild == null) {
                try {
                    AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(eaw.A06).setChannelMask(eaw.A02).setEncoding(eaw.A03).build();
                    if (z) {
                        audioAttributesBuild = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
                    } else {
                        C5887DrO c5887DrO = drN.A00;
                        if (c5887DrO == null) {
                            c5887DrO = new C5887DrO(drN);
                            drN.A00 = c5887DrO;
                        }
                        audioAttributesBuild = c5887DrO.A00;
                    }
                    audioTrackBuild = new AudioTrack.Builder().setAudioAttributes(audioAttributesBuild).setAudioFormat(audioFormatBuild).setTransferMode(1).setBufferSizeInBytes(eaw.A00).setSessionId(i).setOffloadedPlayback(eaw.A04 == 1).build();
                    A0p.incrementAndGet();
                } catch (IllegalArgumentException | UnsupportedOperationException e3) {
                    throw new AudioSink$InitializationException(eaw.A07, e3, 0, eaw.A06, eaw.A02, eaw.A03, eaw.A00, BV7.A1Q(eaw.A04));
                }
            }
            int state = audioTrackBuild.getState();
            if (state == 1) {
                return audioTrackBuild;
            }
            try {
                audioTrackBuild.release();
                A0p.decrementAndGet();
            } catch (Exception e4) {
                CNC.A05("DefaultAudioSink", String.format("buildAudioTrack: state=%d, audioTrackAllocated.get()=%d", Integer.valueOf(state), Integer.valueOf(A0p.get())), e4);
            }
            throw new AudioSink$InitializationException(eaw.A07, null, state, eaw.A06, eaw.A02, eaw.A03, eaw.A00, BV5.A1O(eaw.A04, 1));
        } catch (AudioSink$InitializationException e5) {
            InterfaceC6515EAr interfaceC6515EAr = this.A0A;
            if (interfaceC6515EAr != null) {
                interfaceC6515EAr.onAudioSinkError(e5);
            }
            throw e5;
        }
    }

    public static C6521EAz A02(EA1 ea1) {
        C6521EAz c6521EAz = ea1.A0X;
        if (c6521EAz != null) {
            return c6521EAz;
        }
        ArrayDeque<C6521EAz> arrayDeque = ea1.A0d;
        return !arrayDeque.isEmpty() ? arrayDeque.getLast() : ea1.A0D;
    }

    private void A03() throws IllegalStateException {
        if (this.A0a) {
            return;
        }
        this.A0a = true;
        EA6 ea6 = this.A0f;
        long jA00 = A00(this);
        ea6.A0I = EA6.A00(ea6);
        ea6.A0J = BV8.A0F();
        ea6.A06 = jA00;
        this.A05.stop();
    }

    private void A04(long j) {
        C6233Dyb c6233DybA4X = (this.A0K || !"audio/raw".equals(this.A0C.A07.A0b)) ? C6233Dyb.A03 : this.A0b.A4X(A02(this).A02);
        boolean zA4Z = (this.A0K || !"audio/raw".equals(this.A0C.A07.A0b)) ? false : this.A0b.A4Z(A02(this).A03);
        this.A0d.add(new C6521EAz(c6233DybA4X, BV5.A07(j), (A00(this) * 1000000) / this.A0C.A06, zA4Z));
        EAX[] eaxArr = this.A0C.A09;
        ArrayList arrayListA0h = C3cG.A0h();
        for (EAX eax : eaxArr) {
            if (eax.isActive()) {
                arrayListA0h.add(eax);
            } else {
                eax.flush();
            }
        }
        int size = arrayListA0h.size();
        this.A0L = (EAX[]) arrayListA0h.toArray(new EAX[size]);
        this.A0M = new ByteBuffer[size];
        int i = 0;
        while (true) {
            EAX[] eaxArr2 = this.A0L;
            if (i >= eaxArr2.length) {
                break;
            }
            EAX eax2 = eaxArr2[i];
            eax2.flush();
            this.A0M[i] = eax2.AIL();
            i++;
        }
        InterfaceC6515EAr interfaceC6515EAr = this.A0A;
        if (interfaceC6515EAr != null) {
            interfaceC6515EAr.onSkipSilenceEnabledChanged(zA4Z);
        }
    }

    private void A05(long j) throws AudioSink$WriteException {
        ByteBuffer byteBuffer;
        int length = this.A0L.length;
        int i = length;
        do {
            if (i <= 0) {
                byteBuffer = this.A0U;
                if (byteBuffer == null) {
                    byteBuffer = EAX.A00;
                }
            } else {
                byteBuffer = this.A0M[i - 1];
            }
            if (i == length) {
                A07(byteBuffer, j);
            } else {
                EAX eax = this.A0L[i];
                if (i > this.A0N) {
                    eax.AZ0(byteBuffer);
                }
                ByteBuffer byteBufferAIL = eax.AIL();
                this.A0M[i] = byteBufferAIL;
                if (byteBufferAIL.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        } while (i >= 0);
    }

    public static void A08(EA1 ea1) {
        ea1.A04 = 0L;
        ea1.A03 = 0L;
        ea1.A0S = 0L;
        ea1.A0R = 0L;
        int i = 0;
        ea1.A0Z = false;
        ea1.A0O = 0;
        ea1.A0D = new C6521EAz(A02(ea1).A02, 0L, 0L, A02(ea1).A03);
        ea1.A0Q = 0L;
        ea1.A0X = null;
        ea1.A0d.clear();
        ea1.A0U = null;
        ea1.A0P = 0;
        ea1.A0V = null;
        ea1.A0a = false;
        ea1.A0Y = false;
        ea1.A0N = -1;
        ea1.A0k.A04 = 0L;
        while (true) {
            EAX[] eaxArr = ea1.A0L;
            if (i >= eaxArr.length) {
                return;
            }
            EAX eax = eaxArr[i];
            eax.flush();
            ea1.A0M[i] = eax.AIL();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r9.A0V != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0025 -> B:5:0x000a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A09() throws androidx.media3.exoplayer.audio.AudioSink$WriteException {
        /*
            r9 = this;
            int r8 = r9.A0N
            r7 = 1
            r6 = 0
            r5 = -1
            if (r8 != r5) goto L2c
            r9.A0N = r6
            r8 = 0
        La:
            r4 = 1
        Lb:
            X.EAX[] r3 = r9.A0L
            int r0 = r3.length
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 >= r0) goto L2e
            r0 = r3[r8]
            if (r4 == 0) goto L1c
            r0.AYz()
        L1c:
            r9.A05(r1)
            boolean r0 = r0.isEnded()
            if (r0 == 0) goto L39
            int r0 = r9.A0N
            int r8 = r0 + 1
            r9.A0N = r8
            goto La
        L2c:
            r4 = 0
            goto Lb
        L2e:
            java.nio.ByteBuffer r0 = r9.A0V
            if (r0 == 0) goto L3a
            r9.A07(r0, r1)
            java.nio.ByteBuffer r0 = r9.A0V
            if (r0 == 0) goto L3a
        L39:
            return r6
        L3a:
            r9.A0N = r5
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EA1.A09():boolean");
    }

    @Override // X.InterfaceC6172DxF
    public final void A6p(C6154Dwx c6154Dwx, int[] iArr, int i) throws AudioSink$ConfigurationException {
        EAX[] eaxArr;
        int i2;
        int iA08;
        int iA07;
        int iA01;
        int iA012;
        int i3;
        int iA02;
        int iMax = i;
        if (BV6.A1W(c6154Dwx, "audio/raw")) {
            int i4 = c6154Dwx.A0H;
            C1G.A07(Util.A0O(i4));
            int i5 = c6154Dwx.A06;
            iA01 = Util.A01(i4) * i5;
            eaxArr = this.A0m;
            EAC eac = this.A0k;
            int i6 = c6154Dwx.A0B;
            int i7 = c6154Dwx.A0C;
            eac.A03 = i6;
            eac.A02 = i7;
            this.A0i.A01 = iArr;
            EAL eal = new EAL(c6154Dwx.A0L, i5, i4);
            for (EAX eax : eaxArr) {
                try {
                    EAL ealA6n = eax.A6n(eal);
                    if (eax.isActive()) {
                        eal = ealA6n;
                    }
                } catch (AudioProcessor$UnhandledAudioFormatException e) {
                    throw new AudioSink$ConfigurationException(c6154Dwx, e);
                }
            }
            iA08 = eal.A02;
            i2 = eal.A03;
            int i8 = eal.A01;
            iA07 = Util.A00(i8);
            iA012 = Util.A01(iA08) * i8;
            i3 = 0;
        } else {
            eaxArr = new EAX[0];
            i2 = c6154Dwx.A0L;
            Pair<Integer, Integer> pairA00 = this.A0e.A00(c6154Dwx);
            if (pairA00 == null) {
                throw new AudioSink$ConfigurationException(c6154Dwx, AnonymousClass007.A0a("Unable to configure passthrough for: ", c6154Dwx));
            }
            iA08 = BV7.A08(pairA00);
            iA07 = BV7.A07(pairA00);
            iA01 = -1;
            iA012 = -1;
            i3 = 2;
        }
        if (iA08 == 0) {
            throw new AudioSink$ConfigurationException(c6154Dwx, AnonymousClass006.A0y(c6154Dwx, ") for: ", C60O.A0y("Invalid output encoding (mode=", i3)));
        }
        if (iA07 == 0) {
            throw new AudioSink$ConfigurationException(c6154Dwx, AnonymousClass006.A0y(c6154Dwx, ") for: ", C60O.A0y("Invalid output channel config (mode=", i3)));
        }
        if (i == 0) {
            BVI bvi = this.A0j;
            int minBufferSize = AudioTrack.getMinBufferSize(i2, iA07, iA08);
            C1G.A08(AnonymousClass002.A1P(minBufferSize, -2));
            int i9 = iA012 != -1 ? iA012 : 1;
            int i10 = c6154Dwx.A05;
            BXt bXt = (BXt) bvi;
            if (i3 != 0) {
                iA02 = DX6.A00(BV4.A05((iA08 == 5 ? AndroidVideoDecoder.DEQUEUE_INPUT_TIMEOUT_US : 250000) * (i10 != -1 ? AbstractC4595Cza.A00(RoundingMode.CEILING, i10, 8) : BXt.A00(iA08))));
            } else {
                long j = i2;
                long j2 = i9;
                iA02 = BV5.A02(minBufferSize * bXt.A02, DX6.A00(((bXt.A00 * j) * j2) / 1000000), DX6.A00(((bXt.A01 * j) * j2) / 1000000));
            }
            iMax = (((Math.max(minBufferSize, (int) (iA02 * 1.0d)) + i9) - 1) / i9) * i9;
        }
        EAW eaw = new EAW(c6154Dwx, eaxArr, iA01, i3, iA012, i2, iA07, iA08, iMax, this.A0K);
        if (this.A05 != null) {
            this.A0W = eaw;
        } else {
            this.A0C = eaw;
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void A92() throws IllegalStateException {
        if (this.A0K) {
            this.A0K = false;
            flush();
        }
    }

    @Override // X.InterfaceC6172DxF
    public final long ACb() {
        AudioTrack audioTrack = this.A05;
        if (audioTrack == null) {
            return -9223372036854775807L;
        }
        int i = this.A0C.A04;
        long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
        if (i == 0) {
            return (bufferSizeInFrames * 1000000) / r2.A06;
        }
        return BV7.A0X(RoundingMode.DOWN, bufferSizeInFrames, BXt.A00(r2.A03));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (r11 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (r11 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110 A[PHI: r2 r4 r5 r8
  0x0110: PHI (r2v26 X.EAW) = (r2v25 X.EAW), (r2v29 X.EAW) binds: [B:57:0x015a, B:51:0x010e] A[DONT_GENERATE, DONT_INLINE]
  0x0110: PHI (r4v11 java.lang.StringBuilder) = (r4v8 java.lang.StringBuilder), (r4v12 java.lang.StringBuilder) binds: [B:57:0x015a, B:51:0x010e] A[DONT_GENERATE, DONT_INLINE]
  0x0110: PHI (r5v11 java.lang.String) = (r5v8 java.lang.String), (r5v12 java.lang.String) binds: [B:57:0x015a, B:51:0x010e] A[DONT_GENERATE, DONT_INLINE]
  0x0110: PHI (r8v7 X.EA1) = (r8v4 X.EA1), (r8v8 X.EA1) binds: [B:57:0x015a, B:51:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d A[PHI: r4 r5 r8
  0x015d: PHI (r4v9 java.lang.StringBuilder) = (r4v8 java.lang.StringBuilder), (r4v12 java.lang.StringBuilder) binds: [B:57:0x015a, B:51:0x010e] A[DONT_GENERATE, DONT_INLINE]
  0x015d: PHI (r5v9 java.lang.String) = (r5v8 java.lang.String), (r5v12 java.lang.String) binds: [B:57:0x015a, B:51:0x010e] A[DONT_GENERATE, DONT_INLINE]
  0x015d: PHI (r8v5 X.EA1) = (r8v4 X.EA1), (r8v8 X.EA1) binds: [B:57:0x015a, B:51:0x010e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba A[Catch: Exception -> 0x01c8, TRY_LEAVE, TryCatch #0 {Exception -> 0x01c8, blocks: (B:72:0x0195, B:74:0x01ba), top: B:117:0x0195 }] */
    @Override // X.InterfaceC6172DxF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AEW(boolean r21) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EA1.AEW(boolean):long");
    }

    @Override // X.InterfaceC6172DxF
    public final int AFr(C6154Dwx c6154Dwx) {
        if (BV6.A1W(c6154Dwx, "audio/raw")) {
            int i = c6154Dwx.A0H;
            if (Util.A0O(i)) {
                return i != 2 ? 1 : 2;
            }
            CNC.A04("DefaultAudioSink", FGI.A0H("Invalid PCM encoding: ", i));
        } else if (this.A0e.A00(c6154Dwx) != null) {
            return 2;
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f9  */
    @Override // X.InterfaceC6172DxF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AN2(java.nio.ByteBuffer r29, int r30, long r31) throws java.lang.IllegalStateException, java.lang.UnsupportedOperationException, java.lang.IllegalAccessException, androidx.media3.exoplayer.audio.AudioSink$WriteException, java.lang.IllegalArgumentException, androidx.media3.exoplayer.audio.AudioSink$InitializationException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EA1.AN2(java.nio.ByteBuffer, int, long):boolean");
    }

    @Override // X.InterfaceC6172DxF
    public final boolean ANF() {
        if (this.A05 != null) {
            if (A00(this) > EA6.A00(this.A0f)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC6172DxF
    public final void AXz() throws IllegalStateException {
        if (this.A0Y || this.A05 == null || !A09()) {
            return;
        }
        A03();
        this.A0Y = true;
    }

    @Override // X.InterfaceC6172DxF
    public final void Aco(DrN drN) throws IllegalStateException {
        if (this.A06.equals(drN)) {
            return;
        }
        this.A06 = drN;
        if (this.A0K) {
            return;
        }
        flush();
    }

    @Override // X.InterfaceC6172DxF
    public final void Acq(int i) throws IllegalStateException {
        if (this.A01 != i) {
            this.A01 = i;
            this.A0G = AnonymousClass002.A1L(i);
            flush();
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void Acr(C6504E9t c6504E9t) {
        if (this.A08.equals(c6504E9t)) {
            return;
        }
        this.A08 = c6504E9t;
    }

    @Override // X.InterfaceC6172DxF
    public final void Ae1(C6233Dyb c6233Dyb) {
        C6233Dyb c6233Dyb2 = C6233Dyb.A03;
        A06(new C6233Dyb(BV7.A01(c6233Dyb.A01, 8.0f, 0.1f), BV7.A01(c6233Dyb.A00, 8.0f, 0.1f)), A02(this).A03);
    }

    @Override // X.InterfaceC6172DxF
    public final void AeB(AudioDeviceInfo audioDeviceInfo) {
        EB6 eb6 = audioDeviceInfo == null ? null : new EB6(audioDeviceInfo);
        this.A0B = eb6;
        AudioTrack audioTrack = this.A05;
        if (audioTrack != null) {
            audioTrack.setPreferredDevice(eb6 == null ? null : eb6.A00);
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void AfF(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            AudioTrack audioTrack = this.A05;
            if (audioTrack != null) {
                audioTrack.setVolume(f);
            }
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void flush() throws IllegalStateException {
        final DrN drN;
        if (this.A05 != null) {
            A08(this);
            EA6 ea6 = this.A0f;
            AudioTrack audioTrack = ea6.A0K;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.A05.pause();
            }
            if (this.A05.isOffloadedPlayback()) {
                C6512EAb c6512EAb = this.A0E;
                c6512EAb.getClass();
                this.A05.unregisterStreamEventCallback(c6512EAb.A00);
                c6512EAb.A01.removeCallbacksAndMessages(null);
            }
            final EAW eaw = this.A0C;
            final C6518EAw c6518EAw = new C6518EAw(eaw.A03, eaw.A06, eaw.A02, eaw.A00, eaw.A08, AnonymousClass002.A1Q(eaw.A04, 1));
            EAW eaw2 = this.A0W;
            if (eaw2 != null) {
                this.A0C = eaw2;
                this.A0W = null;
            }
            ea6.A0H = 0L;
            ea6.A04 = 0;
            ea6.A02 = 0;
            ea6.A09 = 0L;
            ea6.A0B = 0L;
            ea6.A0E = 0L;
            ea6.A0Q = false;
            ea6.A0K = null;
            ea6.A0M = null;
            if (AbstractC5653Dmh.A03(EnumC5618Dlz.A0Q)) {
                drN = this.A07;
                if (drN == null) {
                    drN = this.A06;
                }
                this.A07 = null;
            } else {
                drN = this.A06;
            }
            final AudioTrack audioTrack2 = this.A05;
            final C5778DpK c5778DpK = this.A0c;
            final InterfaceC6515EAr interfaceC6515EAr = this.A0A;
            c5778DpK.A01();
            final Handler handlerA09 = BV4.A09(Looper.myLooper());
            final int i = this.A01;
            final boolean z = this.A0G;
            synchronized (A0q) {
                ExecutorService executorServiceNewSingleThreadExecutor = A0o;
                if (executorServiceNewSingleThreadExecutor == null) {
                    executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new Ev6("ExoPlayer:AudioTrackReleaseThread", 1));
                    A0o = executorServiceNewSingleThreadExecutor;
                }
                A0n++;
                executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: X.E9u
                    public static final String __redex_internal_original_name = "DefaultAudioSink$$ExternalSyntheticLambda0";

                    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:78:0x0165
                        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
                        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                        */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd A[Catch: all -> 0x010d, TRY_ENTER, TryCatch #4 {, blocks: (B:16:0x0057, B:20:0x006a, B:48:0x010b, B:23:0x0072, B:26:0x007b, B:28:0x007f, B:29:0x0083, B:31:0x0089, B:33:0x0099, B:35:0x00a5, B:36:0x00b6, B:39:0x00c2, B:38:0x00bb, B:40:0x00d5, B:42:0x00dd, B:43:0x00e4, B:44:0x0101, B:47:0x0104), top: B:90:0x0057, outer: #0, inners: #2, #3 }] */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x0110 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:3:0x0015, B:7:0x0024, B:9:0x0036, B:12:0x003e, B:14:0x0045, B:15:0x0056, B:52:0x010f, B:53:0x0110, B:16:0x0057, B:20:0x006a, B:48:0x010b, B:23:0x0072, B:26:0x007b, B:28:0x007f, B:29:0x0083, B:31:0x0089, B:33:0x0099, B:35:0x00a5, B:36:0x00b6, B:39:0x00c2, B:38:0x00bb, B:40:0x00d5, B:42:0x00dd, B:43:0x00e4, B:44:0x0101, B:47:0x0104), top: B:83:0x0015, inners: #4 }] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 368
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC6505E9u.run():void");
                    }
                });
            }
            this.A05 = null;
        }
        this.A0h.A00();
        this.A0g.A00();
    }

    @Override // X.InterfaceC6172DxF
    public final boolean isEnded() {
        if (this.A05 != null) {
            return this.A0Y && !ANF();
        }
        return true;
    }

    public EA1(InterfaceC6516EAu interfaceC6516EAu, DMX dmx, BVI bvi) {
        this.A0e = dmx;
        this.A0b = interfaceC6516EAu;
        this.A0j = bvi;
        C5778DpK c5778DpK = new C5778DpK(E7C.A00);
        this.A0c = c5778DpK;
        c5778DpK.A02();
        this.A0f = new EA6(new C6519EAx(this));
        EAK eak = new EAK();
        this.A0i = eak;
        EAC eac = new EAC();
        this.A0k = eac;
        ArrayList arrayListA0h = C3cG.A0h();
        Collections.addAll(arrayListA0h, new EAH(), eak, eac);
        Collections.addAll(arrayListA0h, interfaceC6516EAu.ACY());
        this.A0m = (EAX[]) arrayListA0h.toArray(new EAX[0]);
        this.A0l = new EAX[]{new EAJ()};
        this.A00 = 1.0f;
        this.A06 = DrN.A02;
        this.A01 = 0;
        this.A08 = new C6504E9t();
        C6233Dyb c6233Dyb = C6233Dyb.A03;
        this.A0D = new C6521EAz(c6233Dyb, 0L, 0L, false);
        this.A0T = c6233Dyb;
        this.A0N = -1;
        this.A0L = new EAX[0];
        this.A0M = new ByteBuffer[0];
        this.A0d = BV4.A0s();
        this.A0g = new C6506E9v<>();
        this.A0h = new C6506E9v<>();
    }

    private void A06(C6233Dyb c6233Dyb, boolean z) {
        C6521EAz c6521EAzA02 = A02(this);
        if (c6233Dyb.equals(c6521EAzA02.A02) && z == c6521EAzA02.A03) {
            return;
        }
        C6521EAz c6521EAz = new C6521EAz(c6233Dyb, -9223372036854775807L, -9223372036854775807L, z);
        if (this.A05 != null) {
            this.A0X = c6521EAz;
        } else {
            this.A0D = c6521EAz;
        }
    }

    @Override // X.InterfaceC6172DxF
    public final C6233Dyb AIo() {
        return A02(this).A02;
    }

    @Override // X.InterfaceC6172DxF
    public final void Ade(InterfaceC6515EAr interfaceC6515EAr) {
        this.A0A = interfaceC6515EAr;
    }

    @Override // X.InterfaceC6172DxF
    public final void Ae6(E6Y e6y) {
        this.A09 = e6y;
    }

    @Override // X.InterfaceC6172DxF
    public final void Aei(boolean z) {
        A06(A02(this).A02, z);
    }

    @Override // X.InterfaceC6172DxF
    public final boolean Agg(C6154Dwx c6154Dwx) {
        return AnonymousClass002.A1L(AFr(c6154Dwx));
    }

    @Override // X.InterfaceC6172DxF
    public final void reset() throws IllegalStateException {
        flush();
        for (EAX eax : this.A0m) {
            eax.reset();
        }
        for (EAX eax2 : this.A0l) {
            eax2.reset();
        }
        this.A0H = false;
    }
}
