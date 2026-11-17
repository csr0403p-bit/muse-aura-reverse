package X;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.webrtc.voiceengine.WebRtcAudioUtils;

/* loaded from: classes5.dex */
public final class EA2 implements InterfaceC6172DxF {
    public static int A0s;
    public static ScheduledExecutorService A0t;
    public static final Object A0u = C3cG.A0T();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public AudioTrack A0C;
    public Handler A0D;
    public C6504E9t A0E;
    public C6233Dyb A0F;
    public E6Y A0G;
    public EB5 A0H;
    public InterfaceC6515EAr A0I;
    public EAV A0J;
    public C6520EAy A0K;
    public C6520EAy A0L;
    public EAY A0M;
    public ByteBuffer A0N;
    public ByteBuffer A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public long A0Y;
    public EAD A0a;
    public DMY A0b;
    public EAV A0c;
    public boolean A0d;
    public boolean A0e;
    public final InterfaceC6516EAu A0f;
    public final InterfaceC5909Drs A0h;
    public final EA0<AudioSink$InitializationException> A0i;
    public final EAB A0j;
    public final ArrayDeque<C6520EAy> A0k;
    public final EAE A0l;
    public final EA7 A0m;
    public final BVM A0n;
    public final BVN A0o;
    public final EA0<AudioSink$WriteException> A0p;
    public final EAF A0q;
    public final ImmutableList<EAX> A0r;
    public DrN A0Z = DrN.A02;
    public final EA3 A0g = new EA3(new C6517EAv(this));

    private void A07(long j) {
        int iWrite;
        long j2 = j;
        if (this.A0O != null) {
            EA0<AudioSink$WriteException> ea0 = this.A0p;
            if (ea0.A02()) {
                return;
            }
            int iRemaining = this.A0O.remaining();
            if (this.A0X) {
                C1G.A08(AnonymousClass002.A1L((j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1))));
                if (j == Long.MIN_VALUE) {
                    j2 = this.A0Y;
                } else {
                    this.A0Y = j;
                }
                iWrite = this.A0C.write(this.A0O, iRemaining, 1, j2 * 1000);
            } else {
                iWrite = this.A0C.write(this.A0O, iRemaining, 1);
            }
            this.A05 = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                if ((iWrite != -6 && iWrite != -32) || (A01(this) <= 0 && !this.A0C.isOffloadedPlayback())) {
                    z = false;
                }
                AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(this.A0J.A07, iWrite, z);
                InterfaceC6515EAr interfaceC6515EAr = this.A0I;
                if (interfaceC6515EAr != null) {
                    interfaceC6515EAr.onAudioSinkError(audioSink$WriteException);
                }
                ea0.A01(audioSink$WriteException);
                return;
            }
            ea0.A00();
            if (this.A0C.isOffloadedPlayback() && this.A0A > 0) {
                this.A0R = false;
            }
            int i = this.A0J.A04;
            if (i == 0) {
                this.A0B += iWrite;
            }
            if (iWrite == iRemaining) {
                if (i != 0) {
                    C1G.A08(this.A0O == this.A0N);
                    this.A0A += this.A02 * this.A03;
                }
                this.A0O = null;
            }
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void AN3() {
        this.A0V = true;
    }

    @Override // X.InterfaceC6172DxF
    public final void pause() throws IllegalStateException {
        this.A0T = false;
        if (this.A0C != null) {
            EA3 ea3 = this.A0g;
            EA3.A03(ea3);
            if (ea3.A0H == -9223372036854775807L) {
                EAG eag = ea3.A0K;
                eag.getClass();
                EAG.A01(eag, 0);
            } else {
                ea3.A0G = EA3.A02(ea3);
                if (!this.A0C.isOffloadedPlayback()) {
                    return;
                }
            }
            this.A0C.pause();
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void play() throws IllegalStateException {
        this.A0T = true;
        if (this.A0C != null) {
            EA3 ea3 = this.A0g;
            if (ea3.A0H != -9223372036854775807L) {
                ea3.A0H = BV7.A0R();
            }
            ea3.A0C = BV7.A0X(RoundingMode.DOWN, EA3.A02(ea3), ea3.A04);
            EAG eag = ea3.A0K;
            eag.getClass();
            EAG.A01(eag, 0);
            this.A0C.play();
        }
    }

    public static int A00(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return WebRtcAudioUtils.DEFAULT_SAMPLE_RATE_HZ;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return Process.WAIT_RESULT_STOPPED;
                }
        }
    }

    public static long A01(EA2 ea2) {
        EAV eav = ea2.A0J;
        if (eav.A04 != 0) {
            return ea2.A0A;
        }
        long j = ea2.A0B;
        long j2 = eav.A05;
        return BV7.A0S(j, j2) / j2;
    }

    private AudioTrack A02(EAV eav) throws AudioSink$InitializationException {
        try {
            int i = this.A01;
            C6518EAw c6518EAwA00 = eav.A00();
            DrN drN = this.A0Z;
            C6154Dwx c6154Dwx = eav.A07;
            try {
                AudioTrack audioTrackACa = this.A0h.ACa(null, drN, c6518EAwA00, i);
                int state = audioTrackACa.getState();
                if (state == 1) {
                    return audioTrackACa;
                }
                try {
                    audioTrackACa.release();
                } catch (Exception unused) {
                }
                throw new AudioSink$InitializationException(c6154Dwx, null, state, c6518EAwA00.A03, c6518EAwA00.A01, c6518EAwA00.A02, c6518EAwA00.A00, c6518EAwA00.A04);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink$InitializationException(c6154Dwx, e, 0, c6518EAwA00.A03, c6518EAwA00.A01, c6518EAwA00.A02, c6518EAwA00.A00, c6518EAwA00.A04);
            }
        } catch (AudioSink$InitializationException e2) {
            InterfaceC6515EAr interfaceC6515EAr = this.A0I;
            if (interfaceC6515EAr != null) {
                interfaceC6515EAr.onAudioSinkError(e2);
            }
            throw e2;
        }
    }

    private void A03() throws IllegalStateException {
        if (this.A0W) {
            return;
        }
        this.A0W = true;
        EA3 ea3 = this.A0g;
        long jA01 = A01(this);
        ea3.A0G = EA3.A02(ea3);
        ea3.A0H = BV7.A0R();
        ea3.A07 = jA01;
        if (this.A0C.isOffloadedPlayback()) {
            this.A0Q = false;
        }
        this.A0C.stop();
    }

    private void A04() {
        if (this.A0C != null) {
            try {
                this.A0C.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.A0F.A01).setPitch(this.A0F.A00).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                CNC.A06("DefaultAudioSink", "Failed to set playback params", e);
            }
            C6233Dyb c6233Dyb = new C6233Dyb(this.A0C.getPlaybackParams().getSpeed(), this.A0C.getPlaybackParams().getPitch());
            this.A0F = c6233Dyb;
            EA3 ea3 = this.A0g;
            ea3.A00 = c6233Dyb.A01;
            EAG eag = ea3.A0K;
            if (eag != null) {
                EAG.A01(eag, 0);
            }
            EA3.A03(ea3);
        }
    }

    private void A05() {
        EAD ead = this.A0J.A08;
        this.A0a = ead;
        List<EAX> list = ead.A05;
        list.clear();
        ead.A00 = ead.A01;
        int i = 0;
        ead.A02 = false;
        int i2 = 0;
        while (true) {
            ImmutableList<EAX> immutableList = ead.A04;
            if (i2 >= immutableList.size()) {
                break;
            }
            EAX eax = immutableList.get(i2);
            eax.flush();
            if (eax.isActive()) {
                list.add(eax);
            }
            i2++;
        }
        ead.A03 = new ByteBuffer[list.size()];
        while (true) {
            ByteBuffer[] byteBufferArr = ead.A03;
            if (i > byteBufferArr.length - 1) {
                return;
            }
            byteBufferArr[i] = list.get(i).AIL();
            i++;
        }
    }

    private void A06(long j) {
        C6233Dyb c6233DybA4X;
        EAV eav = this.A0J;
        if (eav == null || !eav.A09) {
            c6233DybA4X = (this.A0X || eav.A04 != 0) ? C6233Dyb.A03 : this.A0f.A4X(this.A0F);
            this.A0F = c6233DybA4X;
        } else {
            c6233DybA4X = C6233Dyb.A03;
        }
        this.A0e = (this.A0X || this.A0J.A04 != 0) ? false : this.A0f.A4Z(this.A0e);
        this.A0k.add(new C6520EAy(c6233DybA4X, BV5.A07(j), BV7.A0X(RoundingMode.DOWN, A01(this), this.A0J.A06)));
        A05();
        InterfaceC6515EAr interfaceC6515EAr = this.A0I;
        if (interfaceC6515EAr != null) {
            interfaceC6515EAr.onSkipSilenceEnabledChanged(this.A0e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0171, code lost:
    
        r10.put(r13);
        r10.flip();
        r13 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[LOOP:1: B:10:0x0040->B:86:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A09(java.nio.ByteBuffer r13) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EA2.A09(java.nio.ByteBuffer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0A() {
        /*
            r7 = this;
            X.EAD r0 = r7.A0a
            java.util.List<X.EAX> r0 = r0.A05
            boolean r0 = X.BV6.A1b(r0)
            r6 = 1
            r5 = 0
            r1 = -9223372036854775808
            if (r0 != 0) goto L16
            r7.A07(r1)
            java.nio.ByteBuffer r0 = r7.A0O
            if (r0 != 0) goto L45
        L15:
            return r6
        L16:
            X.EAD r4 = r7.A0a
            java.util.List<X.EAX> r3 = r4.A05
            boolean r0 = X.BV6.A1b(r3)
            if (r0 == 0) goto L2f
            boolean r0 = r4.A02
            if (r0 != 0) goto L2f
            r4.A02 = r6
            java.lang.Object r0 = r3.get(r5)
            X.EAX r0 = (X.EAX) r0
            r0.AYz()
        L2f:
            r7.A08(r1)
            X.EAD r0 = r7.A0a
            boolean r0 = r0.A01()
            if (r0 == 0) goto L45
            java.nio.ByteBuffer r0 = r7.A0O
            if (r0 == 0) goto L15
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L45
            return r6
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EA2.A0A():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015f  */
    @Override // X.InterfaceC6172DxF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6p(X.C6154Dwx r31, int[] r32, int r33) throws androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException, androidx.media3.exoplayer.audio.AudioSink$ConfigurationException {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EA2.A6p(X.Dwx, int[], int):void");
    }

    @Override // X.InterfaceC6172DxF
    public final void A92() throws IllegalStateException {
        if (this.A0X) {
            this.A0X = false;
            flush();
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void AA0() throws IllegalStateException {
        C1G.A08(this.A0d);
        if (this.A0X) {
            return;
        }
        this.A0X = true;
        flush();
    }

    @Override // X.InterfaceC6172DxF
    public final long ACb() {
        AudioTrack audioTrack = this.A0C;
        if (audioTrack == null) {
            return -9223372036854775807L;
        }
        EAV eav = this.A0J;
        int i = eav.A04;
        long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
        if (i == 0) {
            return BV7.A0X(RoundingMode.DOWN, bufferSizeInFrames, eav.A06);
        }
        int iA00 = A00(eav.A03);
        C1G.A08(AnonymousClass002.A1P(iA00, Process.WAIT_RESULT_STOPPED));
        return BV7.A0X(RoundingMode.DOWN, bufferSizeInFrames, iA00);
    }

    @Override // X.InterfaceC6172DxF
    public final long AEW(boolean z) {
        ArrayDeque<C6520EAy> arrayDeque;
        long j;
        if (this.A0C == null || this.A0U) {
            return Long.MIN_VALUE;
        }
        long jA04 = this.A0g.A04();
        EAV eav = this.A0J;
        long jA01 = A01(this);
        long j2 = eav.A06;
        RoundingMode roundingMode = RoundingMode.DOWN;
        long jMin = Math.min(jA04, BV7.A0X(roundingMode, jA01, j2));
        while (true) {
            arrayDeque = this.A0k;
            if (arrayDeque.isEmpty() || jMin < arrayDeque.getFirst().A01) {
                break;
            }
            this.A0L = arrayDeque.remove();
        }
        C6520EAy c6520EAy = this.A0L;
        long j3 = jMin - c6520EAy.A01;
        long jA0C = Util.A0C(j3, c6520EAy.A03.A01);
        if (arrayDeque.isEmpty()) {
            long jAHa = this.A0f.AHa(j3);
            C6520EAy c6520EAy2 = this.A0L;
            j = c6520EAy2.A02 + jAHa;
            c6520EAy2.A00 = jAHa - jA0C;
        } else {
            C6520EAy c6520EAy3 = this.A0L;
            j = c6520EAy3.A02 + jA0C + c6520EAy3.A00;
        }
        long jAKg = this.A0f.AKg();
        long jA0X = j + BV7.A0X(roundingMode, jAKg, this.A0J.A06);
        long j4 = this.A06;
        if (jAKg <= j4) {
            return jA0X;
        }
        long jA0X2 = BV7.A0X(roundingMode, jAKg - j4, this.A0J.A06);
        this.A06 = jAKg;
        this.A04 += jA0X2;
        Handler handlerA09 = this.A0D;
        if (handlerA09 == null) {
            handlerA09 = BV4.A09(Looper.myLooper());
            this.A0D = handlerA09;
        }
        handlerA09.removeCallbacksAndMessages(null);
        this.A0D.postDelayed(new Runnable() { // from class: X.EB1
            public static final String __redex_internal_original_name = "DefaultAudioSink$$ExternalSyntheticLambda1";

            @Override // java.lang.Runnable
            public final void run() {
                EA2 ea2 = this.A00;
                if (ea2.A04 >= 300000) {
                    ea2.A04 = 0L;
                }
            }
        }, 100L);
        return jA0X;
    }

    @Override // X.InterfaceC6172DxF
    public final C6233Dyb AIo() {
        return this.A0F;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ef  */
    @Override // X.InterfaceC6172DxF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AN2(java.nio.ByteBuffer r31, int r32, long r33) throws java.lang.IllegalStateException, java.lang.IllegalAccessException, java.lang.IllegalArgumentException, androidx.media3.exoplayer.audio.AudioSink$InitializationException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EA2.AN2(java.nio.ByteBuffer, int, long):boolean");
    }

    @Override // X.InterfaceC6172DxF
    public final boolean ANF() {
        AudioTrack audioTrack = this.A0C;
        if (audioTrack != null && (!audioTrack.isOffloadedPlayback() || !this.A0Q)) {
            if (A01(this) > Util.A0F(RoundingMode.UP, this.A0g.A04(), r0.A04, 1000000L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC6172DxF
    public final void AXz() throws IllegalStateException {
        if (this.A0P || this.A0C == null || !A0A()) {
            return;
        }
        A03();
        this.A0P = true;
    }

    @Override // X.InterfaceC6172DxF
    public final void Aco(DrN drN) throws IllegalStateException {
        if (this.A0Z.equals(drN)) {
            return;
        }
        this.A0Z = drN;
        if (this.A0X) {
            return;
        }
        flush();
    }

    @Override // X.InterfaceC6172DxF
    public final void Acq(int i) throws IllegalStateException {
        if (this.A0S) {
            if (this.A01 != i) {
                return;
            } else {
                this.A0S = false;
            }
        }
        if (this.A01 != i) {
            this.A01 = i;
            this.A0d = i != 0;
            flush();
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void Acr(C6504E9t c6504E9t) {
        if (this.A0E.equals(c6504E9t)) {
            return;
        }
        this.A0E = c6504E9t;
    }

    @Override // X.InterfaceC6172DxF
    public final void Ae1(C6233Dyb c6233Dyb) {
        C6233Dyb c6233Dyb2 = C6233Dyb.A03;
        this.A0F = new C6233Dyb(BV7.A01(c6233Dyb.A01, 8.0f, 0.1f), BV7.A01(c6233Dyb.A00, 8.0f, 0.1f));
        EAV eav = this.A0J;
        if (eav != null && eav.A09) {
            A04();
            return;
        }
        C6520EAy c6520EAy = new C6520EAy(c6233Dyb, -9223372036854775807L, -9223372036854775807L);
        if (this.A0C != null) {
            this.A0K = c6520EAy;
        } else {
            this.A0L = c6520EAy;
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void AeB(AudioDeviceInfo audioDeviceInfo) {
        EB5 eb5 = audioDeviceInfo == null ? null : new EB5(audioDeviceInfo);
        this.A0H = eb5;
        AudioTrack audioTrack = this.A0C;
        if (audioTrack != null) {
            audioTrack.setPreferredDevice(eb5 == null ? null : eb5.A00);
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void Aei(boolean z) {
        this.A0e = z;
        EAV eav = this.A0J;
        C6520EAy c6520EAy = new C6520EAy((eav == null || !eav.A09) ? this.A0F : C6233Dyb.A03, -9223372036854775807L, -9223372036854775807L);
        if (this.A0C != null) {
            this.A0K = c6520EAy;
        } else {
            this.A0L = c6520EAy;
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void AfF(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            AudioTrack audioTrack = this.A0C;
            if (audioTrack != null) {
                audioTrack.setVolume(f);
            }
        }
    }

    @Override // X.InterfaceC6172DxF
    public final void flush() throws IllegalStateException {
        if (AnonymousClass002.A1X(this.A0C)) {
            this.A09 = 0L;
            this.A08 = 0L;
            this.A0B = 0L;
            this.A0A = 0L;
            this.A0R = false;
            this.A02 = 0;
            this.A0L = new C6520EAy(this.A0F, 0L, 0L);
            this.A07 = 0L;
            this.A0K = null;
            this.A0k.clear();
            this.A0N = null;
            this.A03 = 0;
            this.A0O = null;
            this.A0W = false;
            this.A0P = false;
            this.A0Q = false;
            this.A0j.A04 = 0L;
            A05();
            EA3 ea3 = this.A0g;
            AudioTrack audioTrack = ea3.A0J;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.A0C.pause();
            }
            if (this.A0C.isOffloadedPlayback()) {
                EAY eay = this.A0M;
                eay.getClass();
                this.A0C.unregisterStreamEventCallback(eay.A00);
                eay.A01.removeCallbacksAndMessages(null);
            }
            final C6518EAw c6518EAwA00 = this.A0J.A00();
            EAV eav = this.A0c;
            if (eav != null) {
                this.A0J = eav;
                this.A0c = null;
            }
            EA3.A03(ea3);
            ea3.A0J = null;
            ea3.A0K = null;
            final AudioTrack audioTrack2 = this.A0C;
            final InterfaceC6515EAr interfaceC6515EAr = this.A0I;
            final Handler handlerA09 = BV4.A09(Looper.myLooper());
            synchronized (A0u) {
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = A0t;
                if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC2510Bcg(0));
                    A0t = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                }
                A0s++;
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new Runnable() { // from class: X.E9y
                    public static final String __redex_internal_original_name = "DefaultAudioSink$$ExternalSyntheticLambda0";

                    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x005b
                        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
                        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                        */
                    @Override // java.lang.Runnable
                    public final void run() {
                        /*
                            r6 = this;
                            android.media.AudioTrack r0 = r1
                            X.EAr r5 = r4
                            android.os.Handler r4 = r2
                            X.EAw r1 = r3
                            r3 = 0
                            r0.flush()     // Catch: java.lang.Throwable -> L3a
                            r0.release()     // Catch: java.lang.Throwable -> L3a
                            if (r5 == 0) goto L23
                            java.lang.Thread r0 = X.BV7.A13(r4)
                            boolean r0 = r0.isAlive()
                            if (r0 == 0) goto L23
                            X.E9z r0 = new X.E9z
                            r0.<init>()
                            r4.post(r0)
                        L23:
                            java.lang.Object r1 = X.EA2.A0u
                            monitor-enter(r1)
                            int r0 = X.EA2.A0s     // Catch: java.lang.Throwable -> L37
                            int r0 = r0 + (-1)
                            X.EA2.A0s = r0     // Catch: java.lang.Throwable -> L37
                            if (r0 != 0) goto L35
                            java.util.concurrent.ScheduledExecutorService r0 = X.EA2.A0t     // Catch: java.lang.Throwable -> L37
                            r0.shutdown()     // Catch: java.lang.Throwable -> L37
                            X.EA2.A0t = r3     // Catch: java.lang.Throwable -> L37
                        L35:
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
                            return
                        L37:
                            r2 = move-exception
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
                            throw r2
                        L3a:
                            r2 = move-exception
                            if (r5 == 0) goto L4f
                            java.lang.Thread r0 = X.BV7.A13(r4)
                            boolean r0 = r0.isAlive()
                            if (r0 == 0) goto L4f
                            X.E9z r0 = new X.E9z
                            r0.<init>()
                            r4.post(r0)
                        L4f:
                            java.lang.Object r1 = X.EA2.A0u
                            monitor-enter(r1)
                            int r0 = X.EA2.A0s     // Catch: java.lang.Throwable -> L5b
                            int r0 = r0 + (-1)
                            X.EA2.A0s = r0     // Catch: java.lang.Throwable -> L5b
                            if (r0 != 0) goto L64
                            goto L5d
                        L5b:
                            r2 = move-exception
                            goto L64
                        L5d:
                            java.util.concurrent.ScheduledExecutorService r0 = X.EA2.A0t     // Catch: java.lang.Throwable -> L5b
                            r0.shutdown()     // Catch: java.lang.Throwable -> L5b
                            X.EA2.A0t = r3     // Catch: java.lang.Throwable -> L5b
                        L64:
                            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5b
                            throw r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC6509E9y.run():void");
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            }
            this.A0C = null;
        }
        this.A0p.A00();
        this.A0i.A00();
        this.A06 = 0L;
        this.A04 = 0L;
        Handler handler = this.A0D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // X.InterfaceC6172DxF
    public final boolean isEnded() {
        if (this.A0C != null) {
            return this.A0P && !ANF();
        }
        return true;
    }

    public EA2(InterfaceC6516EAu interfaceC6516EAu, DMY dmy, BVM bvm, BVN bvn, InterfaceC5909Drs interfaceC5909Drs) {
        this.A0b = dmy;
        this.A0f = interfaceC6516EAu;
        this.A0o = bvn;
        this.A0n = bvm;
        EA7 ea7 = new EA7();
        this.A0m = ea7;
        EAB eab = new EAB();
        this.A0j = eab;
        this.A0l = new EAE();
        this.A0q = new EAF();
        this.A0r = ImmutableList.of((EA7) eab, ea7);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A0E = new C6504E9t();
        C6233Dyb c6233Dyb = C6233Dyb.A03;
        this.A0L = new C6520EAy(c6233Dyb, 0L, 0L);
        this.A0F = c6233Dyb;
        this.A0e = false;
        this.A0k = BV4.A0s();
        this.A0i = new EA0<>();
        this.A0p = new EA0<>();
        this.A0h = interfaceC5909Drs;
    }

    private void A08(long j) {
        ByteBuffer byteBuffer;
        A07(j);
        if (this.A0O == null) {
            if (!BV6.A1b(this.A0a.A05)) {
                ByteBuffer byteBuffer2 = this.A0N;
                if (byteBuffer2 != null) {
                    A09(byteBuffer2);
                    A07(j);
                    return;
                }
                return;
            }
            while (!this.A0a.A01()) {
                do {
                    EAD ead = this.A0a;
                    if (BV6.A1b(ead.A05)) {
                        byteBuffer = ead.A03[r1.length - 1];
                        if (!byteBuffer.hasRemaining()) {
                            EAD.A00(ead, EAX.A00);
                            byteBuffer = ead.A03[r1.length - 1];
                        }
                    } else {
                        byteBuffer = EAX.A00;
                    }
                    if (byteBuffer.hasRemaining()) {
                        A09(byteBuffer);
                        A07(j);
                    } else {
                        ByteBuffer byteBuffer3 = this.A0N;
                        if (byteBuffer3 == null || !byteBuffer3.hasRemaining()) {
                            return;
                        }
                        EAD ead2 = this.A0a;
                        ByteBuffer byteBuffer4 = this.A0N;
                        if (BV6.A1b(ead2.A05) && !ead2.A02) {
                            EAD.A00(ead2, byteBuffer4);
                        }
                    }
                } while (this.A0O == null);
                return;
            }
        }
    }

    @Override // X.InterfaceC6172DxF
    public final int AFr(C6154Dwx c6154Dwx) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            looperMyLooper.getThread();
        }
        if (BV6.A1W(c6154Dwx, "audio/raw")) {
            int i = c6154Dwx.A0H;
            if (Util.A0O(i)) {
                return i != 2 ? 1 : 2;
            }
            CNC.A04("DefaultAudioSink", FGI.A0H("Invalid PCM encoding: ", i));
        } else if (this.A0b.A00(this.A0Z, c6154Dwx) != null) {
            return 2;
        }
        return 0;
    }

    @Override // X.InterfaceC6172DxF
    public final void Ade(InterfaceC6515EAr interfaceC6515EAr) {
        this.A0I = interfaceC6515EAr;
    }

    @Override // X.InterfaceC6172DxF
    public final void Ae6(E6Y e6y) {
        this.A0G = e6y;
    }

    @Override // X.InterfaceC6172DxF
    public final boolean Agg(C6154Dwx c6154Dwx) {
        return AnonymousClass002.A1L(AFr(c6154Dwx));
    }

    @Override // X.InterfaceC6172DxF
    public final void reset() throws IllegalStateException {
        flush();
        AbstractC7489Ext<EAX> it = this.A0r.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        this.A0l.reset();
        this.A0q.reset();
        EAD ead = this.A0a;
        if (ead != null) {
            int i = 0;
            while (true) {
                ImmutableList<EAX> immutableList = ead.A04;
                if (i >= immutableList.size()) {
                    break;
                }
                EAX eax = immutableList.get(i);
                eax.flush();
                eax.reset();
                i++;
            }
            ead.A03 = new ByteBuffer[0];
            EAL eal = EAL.A04;
            ead.A00 = eal;
            ead.A01 = eal;
            ead.A02 = false;
        }
        this.A0T = false;
    }
}
