package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import meta.androidx.media3.exoplayer.mediacodec.MediaCodecRenderer2$DecoderInitializationException;

/* renamed from: X.Dwq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6148Dwq extends AbstractC6146Dwo {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public MediaFormat A0A;
    public C6154Dwx A0B;
    public C6154Dwx A0C;
    public C6154Dwx A0D;
    public C6173DxG A0E;
    public ExoPlaybackException A0F;
    public InterfaceC5547DkP A0G;
    public Integer A0H;
    public ByteBuffer A0I;
    public ArrayDeque<C6153Dwv> A0J;
    public C6277DzU A0K;
    public InterfaceC6185DxT A0L;
    public C6153Dwv A0M;
    public MediaCodecRenderer2$DecoderInitializationException A0N;
    public C6228DyO A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public float A0g;
    public float A0h;
    public long A0i;
    public long A0j;
    public long A0k;
    public MediaCrypto A0l;
    public C6154Dwx A0m;
    public InterfaceC5547DkP A0n;
    public Object A0o;
    public String A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public final int A0w;
    public final MediaCodec.BufferInfo A0x;
    public final Di2 A0y;
    public final Di2 A0z;
    public final C6175DxI A10;
    public final ArrayDeque<C6228DyO> A11;
    public final ArrayList<Long> A12;
    public final C6190Dxa A13;
    public final InterfaceC2356BVg A14;
    public final boolean A15;
    public final boolean A16;
    public final float A17;
    public final int A18;
    public final Di2 A19;
    public final BWK A1A;
    public final BVV A1B;
    public final boolean A1C;

    private void A00() {
        this.A0P = false;
        this.A13.A02();
        this.A0z.A02();
        this.A0R = false;
        this.A0Q = false;
    }

    private boolean A0B() {
        if (this.A0L == null || this.A01 == 3 || super.A01 == 0) {
            return true;
        }
        float f = this.A0h;
        C6154Dwx[] c6154DwxArr = super.A0C;
        c6154DwxArr.getClass();
        float fA0b = A0b(c6154DwxArr, f);
        float f2 = this.A0g;
        if (f2 == fA0b) {
            return true;
        }
        if (fA0b == -1.0f) {
            A03();
            return false;
        }
        if (f2 == -1.0f && fA0b <= this.A17) {
            return true;
        }
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putFloat("operating-rate", fA0b);
        this.A0L.setParameters(bundleA0N);
        this.A0g = fA0b;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC6146Dwo
    public void A0W() {
        try {
            A00();
            A0h();
        } finally {
            InterfaceC5547DkP interfaceC5547DkP = this.A0G;
            if (interfaceC5547DkP != null) {
                interfaceC5547DkP.Aa8(null);
            }
            this.A0G = null;
        }
    }

    @Override // X.AbstractC6146Dwo
    public void A0X() throws MediaCryptoException {
        this.A0C = null;
        A0A(C6228DyO.A03);
        this.A11.clear();
        if (this.A0v) {
            A0W();
        } else {
            A0D(this);
        }
    }

    @Override // X.AbstractC6146Dwo
    public void A0Y(long j, boolean z) {
        int i;
        this.A0W = false;
        this.A0b = false;
        this.A0c = false;
        if (this.A0Q) {
            this.A13.A02();
            this.A0z.A02();
            this.A0R = false;
        } else if (A0D(this)) {
            A0g();
        }
        C6218Dy8<C6154Dwx> c6218Dy8 = this.A0O.A02;
        synchronized (c6218Dy8) {
            i = c6218Dy8.A01;
        }
        if (i > 0) {
            this.A0f = true;
        }
        this.A0O.A02.A00();
        this.A11.clear();
    }

    public void A0f() {
        this.A04 = -1;
        this.A0y.A01 = null;
        this.A05 = -1;
        this.A0I = null;
        this.A0i = -9223372036854775807L;
        this.A0V = false;
        this.A0X = false;
        this.A0Y = false;
        this.A12.clear();
        this.A07 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0k = -9223372036854775807L;
        C6277DzU c6277DzU = this.A0K;
        if (c6277DzU != null) {
            c6277DzU.A00 = 0L;
            c6277DzU.A01 = 0L;
            c6277DzU.A02 = false;
        }
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = this.A0s ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0h() {
        Handler handler;
        Runnable runnableC6251Dyu;
        try {
            InterfaceC6185DxT interfaceC6185DxT = this.A0L;
            if (interfaceC6185DxT != null) {
                interfaceC6185DxT.release();
                this.A0E.A03++;
                String str = this.A0M.A06;
                if (this instanceof C6149Dwr) {
                    C6205Dxp c6205Dxp = ((C6149Dwr) this).A0m;
                    handler = c6205Dxp.A00;
                    if (handler != null) {
                        runnableC6251Dyu = new RunnableC6245Dyo(c6205Dxp, str);
                        handler.post(runnableC6251Dyu);
                    }
                } else {
                    Dy9 dy9 = ((C6156Dwz) this).A0E;
                    handler = dy9.A00;
                    if (handler != null) {
                        runnableC6251Dyu = new RunnableC6251Dyu(dy9, str);
                        handler.post(runnableC6251Dyu);
                    }
                }
            }
            this.A0L = null;
            this.A0p = null;
            try {
                MediaCrypto mediaCrypto = this.A0l;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.A0L = null;
            this.A0p = null;
            try {
                MediaCrypto mediaCrypto2 = this.A0l;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void A0l(Di2 di2);

    private void A03() {
        if (this.A0V) {
            this.A02 = 1;
            this.A01 = 3;
        } else {
            A0h();
            A0g();
        }
    }

    private void A04() {
        try {
            this.A0L.flush();
        } finally {
            A0f();
        }
    }

    private void A05() throws MediaCryptoException, ExoPlaybackException {
        int i = this.A01;
        if (i == 1) {
            A04();
            return;
        }
        if (i == 2) {
            A04();
            A06();
        } else if (i != 3) {
            this.A0b = true;
            A0e();
        } else {
            A0h();
            A0g();
        }
    }

    private void A06() throws MediaCryptoException, ExoPlaybackException {
        InterfaceC5392Dhj interfaceC5392DhjAEF = this.A0G.AEF();
        if (interfaceC5392DhjAEF instanceof C5396Dhn) {
            try {
                this.A0l.setMediaDrmSession(((C5396Dhn) interfaceC5392DhjAEF).A01);
            } catch (MediaCryptoException e) {
                throw AbstractC6146Dwo.A02(this.A0C, this, e, 6006);
            }
        }
        A09(this.A0G);
        this.A02 = 0;
        this.A01 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[PHI: r1 r6 r24
  0x0037: PHI (r1v53 X.Dwr) = (r1v3 X.Dwr), (r1v55 X.Dwr) binds: [B:186:0x03af, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r6v21 X.Dwx) = (r6v1 X.Dwx), (r6v22 X.Dwx) binds: [B:186:0x03af, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r24v2 boolean) = (r24v0 boolean), (r24v3 boolean) binds: [B:186:0x03af, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(android.media.MediaCrypto r34, X.C6153Dwv r35) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6148Dwq.A08(android.media.MediaCrypto, X.Dwv):void");
    }

    private void A09(InterfaceC5547DkP interfaceC5547DkP) {
        InterfaceC5547DkP interfaceC5547DkP2 = this.A0n;
        if (interfaceC5547DkP2 != interfaceC5547DkP) {
            if (interfaceC5547DkP != null) {
                interfaceC5547DkP.A2v(null);
            }
            if (interfaceC5547DkP2 != null) {
                interfaceC5547DkP2.Aa8(null);
            }
        }
        this.A0n = interfaceC5547DkP;
    }

    private void A0A(C6228DyO c6228DyO) {
        this.A0O = c6228DyO;
        if (c6228DyO.A01 != -9223372036854775807L) {
            this.A0u = true;
        }
    }

    private boolean A0C(int i) throws MediaCryptoException, ExoPlaybackException {
        C5406Dhz c5406Dhz = super.A0G;
        c5406Dhz.A01 = null;
        c5406Dhz.A00 = null;
        Di2 di2 = this.A19;
        di2.A02();
        int iA0T = A0T(di2, c5406Dhz, i | 4);
        if (iA0T == -5) {
            A0c(c5406Dhz);
            return true;
        }
        if (iA0T != -4 || !AbstractC5364DhG.A00(di2)) {
            return false;
        }
        this.A0W = true;
        A05();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r1.A0E) < 500) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0D(X.AbstractC6148Dwq r8) throws android.media.MediaCryptoException {
        /*
            X.DxT r0 = r8.A0L
            r7 = 0
            if (r0 == 0) goto L46
            int r6 = r8.A01
            r0 = 3
            r5 = 1
            if (r6 == r0) goto L42
            boolean r0 = r8.A0r
            if (r0 == 0) goto L13
            boolean r0 = r8.A0S
            if (r0 == 0) goto L42
        L13:
            boolean r0 = r8 instanceof X.C6149Dwr
            if (r0 == 0) goto L2b
            r1 = r8
            X.Dwr r1 = (X.C6149Dwr) r1
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L2b
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.A0E
            long r3 = r3 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L42
        L2b:
            r0 = 2
            if (r6 != r0) goto L3e
            r8.A06()     // Catch: androidx.media3.exoplayer.ExoPlaybackException -> L32
            goto L3e
        L32:
            r2 = move-exception
            java.lang.String r1 = "MediaCodecRenderer2"
            java.lang.String r0 = "Failed to update the DRM session, releasing the codec instead."
            X.CNC.A06(r1, r0, r2)
            r8.A0h()
            return r5
        L3e:
            r8.A04()
            return r7
        L42:
            r8.A0h()
            return r5
        L46:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6148Dwq.A0D(X.Dwq):boolean");
    }

    private final float A0b(C6154Dwx[] c6154DwxArr, float f) {
        float fMax;
        if (this instanceof C6149Dwr) {
            if (((C6149Dwr) this).A0c) {
                return -1.0f;
            }
            fMax = -1.0f;
            for (C6154Dwx c6154Dwx : c6154DwxArr) {
                float f2 = c6154Dwx.A01;
                if (f2 != -1.0f) {
                    fMax = Math.max(fMax, f2);
                }
            }
            if (fMax == -1.0f) {
                return -1.0f;
            }
        } else {
            if (((C6156Dwz) this).A0A) {
                return -1.0f;
            }
            int iMax = -1;
            for (C6154Dwx c6154Dwx2 : c6154DwxArr) {
                int i = c6154Dwx2.A0L;
                if (i != -1) {
                    iMax = Math.max(iMax, i);
                }
            }
            if (iMax == -1) {
                return -1.0f;
            }
            fMax = iMax;
        }
        return fMax * f;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BVg;LX/Dwx;Z)Ljava/util/List<LX/Dwv;>; */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList A0d(X.C6154Dwx r11, X.InterfaceC2356BVg r12, boolean r13) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C6149Dwr
            r5 = r11
            r6 = r12
            r7 = r13
            if (r0 == 0) goto L9c
            X.Dwr r10 = (X.C6149Dwr) r10
            android.content.Context r4 = r10.A0l
            boolean r8 = r10.A0g
            boolean r0 = r10.A0e
            if (r0 == 0) goto L16
            boolean r0 = r10.A0Z
            r9 = 1
            if (r0 == 0) goto L17
        L16:
            r9 = 0
        L17:
            java.util.List r0 = X.C6149Dwr.A05(r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r3 = X.BV4.A0t(r0)
            X.Dz8 r2 = new X.Dz8
            r2.<init>(r11)
            r1 = 7
            X.F4m r0 = new X.F4m
            r0.<init>(r2, r1)
            java.util.Collections.sort(r3, r0)
            X.Dlz r0 = X.EnumC5618Dlz.A1H
            boolean r0 = X.AbstractC5653Dmh.A03(r0)
            if (r0 == 0) goto L9b
            java.lang.String r1 = r11.A0b
            if (r1 != 0) goto L65
            java.util.List r4 = java.util.Collections.EMPTY_LIST
        L3b:
            int r1 = r4.size()
            int r0 = r3.size()
            if (r1 != r0) goto L6f
            r2 = 0
        L46:
            int r0 = r4.size()
            if (r2 >= r0) goto L9b
            java.lang.Object r1 = r4.get(r2)
            X.Dwv r1 = (X.C6153Dwv) r1
            java.lang.Object r0 = r3.get(r2)
            X.Dwv r0 = (X.C6153Dwv) r0
            java.lang.String r1 = r1.A06
            java.lang.String r0 = r0.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6f
            int r2 = r2 + 1
            goto L46
        L65:
            r0 = 0
            java.util.List r0 = r12.AEg(r1, r13, r0)
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            goto L3b
        L6f:
            java.lang.StringBuilder r1 = X.C60O.A0w()
            java.lang.String r0 = "MCR1 supported decoders differs from MCR2 supported decoders for "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = "\nMCR1 Decoders:\n"
            r1.append(r0)
            X.C6149Dwr.A07(r1, r4)
            java.lang.String r0 = "MCR2 Decoders:\n"
            r1.append(r0)
            X.C6149Dwr.A07(r1, r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "MediaCodecVideoRenderer2"
            X.CNC.A04(r0, r1)
            X.Dwb r0 = r10.A0K
            if (r0 == 0) goto L9b
            r0.APy(r1)
        L9b:
            return r3
        L9c:
            X.Dwz r10 = (X.C6156Dwz) r10
            X.DzP r0 = r10.A0G
            com.google.common.collect.ImmutableList r0 = X.C6156Dwz.A00(r11, r0, r12, r13)
            java.util.ArrayList r3 = X.BV4.A0t(r0)
            X.Dz8 r2 = new X.Dz8
            r2.<init>(r11)
            r1 = 7
            X.F4m r0 = new X.F4m
            r0.<init>(r2, r1)
            java.util.Collections.sort(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6148Dwq.A0d(X.Dwx, X.BVg, boolean):java.util.ArrayList");
    }

    private final void A0e() throws ExoPlaybackException {
        if (this instanceof C6156Dwz) {
            C6156Dwz c6156Dwz = (C6156Dwz) this;
            try {
                c6156Dwz.A0G.AXz();
            } catch (AudioSink$WriteException e) {
                throw c6156Dwz.A0U(e.format, e, 5002, e.isRecoverable);
            }
        }
    }

    private final void A0k(MediaFormat mediaFormat, C6154Dwx c6154Dwx) throws ExoPlaybackException {
        int iA06;
        int integer;
        int integer2;
        if (this instanceof C6149Dwr) {
            C6149Dwr c6149Dwr = (C6149Dwr) this;
            InterfaceC6185DxT interfaceC6185DxT = ((AbstractC6148Dwq) c6149Dwr).A0L;
            if (interfaceC6185DxT != null) {
                interfaceC6185DxT.AfE(c6149Dwr.A04);
            }
            if (c6149Dwr.A0g) {
                integer = c6154Dwx.A0Q;
                integer2 = c6154Dwx.A0D;
            } else {
                mediaFormat.getClass();
                if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                    integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
                    integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
                } else {
                    integer = mediaFormat.getInteger(HatchWebPageParserKt.WIDTH_ATTR);
                    integer2 = mediaFormat.getInteger(HatchWebPageParserKt.HEIGHT_ATTR);
                }
            }
            float f = c6154Dwx.A02;
            int i = c6154Dwx.A0K;
            if (i == 90 || i == 270) {
                f = 1.0f / f;
                int i2 = integer2;
                integer2 = integer;
                integer = i2;
            }
            c6149Dwr.A0H = new C6232Dya(integer, integer2, f);
            c6149Dwr.A0o.A05(c6154Dwx.A01);
            return;
        }
        C6156Dwz c6156Dwz = (C6156Dwz) this;
        C6154Dwx c6154DwxA0U = c6156Dwz.A05;
        if (c6154DwxA0U != null) {
            c6154Dwx = c6154DwxA0U;
        } else if (c6156Dwz.A0L != null) {
            if ("audio/raw".equals(c6154Dwx.A0b)) {
                iA06 = c6154Dwx.A0H;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iA06 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                iA06 = Util.A06(ByteOrder.LITTLE_ENDIAN, mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                iA06 = 2;
            }
            c6156Dwz.A03 = mediaFormat.getInteger("sample-rate") * mediaFormat.getInteger("channel-count");
            C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
            c6162Dx5A00.A06("audio/raw");
            c6162Dx5A00.A0F = iA06;
            c6162Dx5A00.A04 = mediaFormat.getInteger("channel-count");
            c6162Dx5A00.A0J = mediaFormat.getInteger("sample-rate");
            if (!AbstractC5653Dmh.A03(EnumC5618Dlz.A0A)) {
                c6162Dx5A00.A09 = c6154Dwx.A0B;
                c6162Dx5A00.A0A = c6154Dwx.A0C;
            }
            c6154DwxA0U = BV6.A0U(c6162Dx5A00);
            c6154Dwx = c6154DwxA0U;
        }
        try {
            c6156Dwz.A0G.A6p(c6154Dwx, null, 0);
        } catch (AudioSink$ConfigurationException e) {
            throw c6156Dwz.A0U(e.format, e, 5001, false);
        }
    }

    private final void A0m(final Exception exc) {
        Handler handler;
        Runnable runnable;
        if (this instanceof C6149Dwr) {
            CNC.A05("MediaCodecVideoRenderer2", "Video codec error", exc);
            final C6205Dxp c6205Dxp = ((C6149Dwr) this).A0m;
            handler = c6205Dxp.A00;
            if (handler == null) {
                return;
            } else {
                runnable = new Runnable() { // from class: X.Dyl
                    public static final String __redex_internal_original_name = "VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda5";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C6205Dxp c6205Dxp2 = c6205Dxp;
                        c6205Dxp2.A01.onVideoCodecError(exc);
                    }
                };
            }
        } else {
            CNC.A05("MediaCodecAudioRenderer2", "Audio codec error", exc);
            final Dy9 dy9 = ((C6156Dwz) this).A0E;
            handler = dy9.A00;
            if (handler == null) {
                return;
            } else {
                runnable = new Runnable() { // from class: X.Dye
                    public static final String __redex_internal_original_name = "AudioRendererEventListener$EventDispatcher$$ExternalSyntheticLambda4";

                    @Override // java.lang.Runnable
                    public final void run() {
                        Dy9 dy92 = dy9;
                        dy92.A01.onAudioCodecError(exc);
                    }
                };
            }
        }
        handler.post(runnable);
    }

    private final boolean A0n() {
        C6154Dwx c6154Dwx = this.A0C;
        if (c6154Dwx == null || !BV6.A1W(c6154Dwx, "video/dolby-vision") || !"meta.dav1d.av1.decoder".equals(this.A0p) || !AbstractC5653Dmh.A03(EnumC5618Dlz.A0z)) {
            this.A0m = null;
            C6154Dwx c6154Dwx2 = this.A0C;
            return c6154Dwx2 != null && this.A0e && "video/av01".equalsIgnoreCase(c6154Dwx2.A0b);
        }
        C6154Dwx c6154Dwx3 = this.A0m;
        C6154Dwx c6154Dwx4 = this.A0C;
        if (c6154Dwx3 != c6154Dwx4) {
            this.A0m = c6154Dwx4;
            this.A0q = C6155Dwy.A07(c6154Dwx4, this.A0p);
        }
        return this.A0q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r1 >= r5) goto L14;
     */
    @Override // X.AbstractC6146Dwo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0Z(X.Dy6 r9, X.C6154Dwx[] r10, long r11, long r13) {
        /*
            r8 = this;
            X.DyO r0 = r8.A0O
            long r1 = r0.A01
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L16
            X.DyO r0 = new X.DyO
            r0.<init>(r3, r13)
            r8.A0A(r0)
        L15:
            return
        L16:
            java.util.ArrayDeque<X.DyO> r7 = r8.A11
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L54
            long r5 = r8.A07
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L2e
            long r1 = r8.A0k
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L54
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L54
        L2e:
            X.DyO r0 = new X.DyO
            r0.<init>(r3, r13)
            r8.A0A(r0)
            X.DyO r0 = r8.A0O
            long r1 = r0.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L15
            boolean r0 = r8 instanceof X.C6149Dwr
            if (r0 == 0) goto L4c
            X.Dwr r8 = (X.C6149Dwr) r8
            boolean r0 = r8.A0T
            if (r0 != 0) goto L15
            X.C6149Dwr.A0A(r8)
            return
        L4c:
            X.Dwz r8 = (X.C6156Dwz) r8
            X.DzP r0 = r8.A0G
            r0.AN3()
            return
        L54:
            long r1 = r8.A07
            X.DyO r0 = new X.DyO
            r0.<init>(r1, r13)
            r7.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6148Dwq.A0Z(X.Dy6, X.Dwx[], long, long):void");
    }

    @Override // X.AbstractC6146Dwo
    public void A0a(boolean z, boolean z2) {
        this.A0E = new C6173DxG();
        this.A09 = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0125, code lost:
    
        if (A0B() == false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C2461Bbo A0c(X.C5406Dhz r17) throws android.media.MediaCryptoException, androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6148Dwq.A0c(X.Dhz):X.Bbo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x023f A[Catch: MediaCodecRenderer2$DecoderInitializationException -> 0x0256, TryCatch #4 {MediaCodecRenderer2$DecoderInitializationException -> 0x0256, blocks: (B:45:0x00a0, B:47:0x00a9, B:49:0x00b9, B:52:0x00c2, B:54:0x00ce, B:55:0x00ee, B:57:0x00f4, B:59:0x00f8, B:61:0x0100, B:63:0x0111, B:66:0x0118, B:68:0x0122, B:69:0x0125, B:70:0x0128, B:72:0x012e, B:73:0x0138, B:75:0x013c, B:77:0x0144, B:79:0x014a, B:80:0x0160, B:82:0x0168, B:83:0x016e, B:85:0x0172, B:87:0x017e, B:89:0x0185, B:91:0x0189, B:96:0x0197, B:99:0x01a1, B:101:0x01a7, B:93:0x018f, B:104:0x01ae, B:108:0x01b7, B:110:0x01c4, B:112:0x01c8, B:113:0x01cf, B:115:0x01d1, B:117:0x01f8, B:118:0x01ff, B:120:0x020e, B:121:0x0210, B:123:0x0218, B:130:0x0255, B:124:0x021b, B:126:0x023c, B:127:0x023f, B:129:0x024b), top: B:163:0x00a0, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117 A[PHI: r6
  0x0117: PHI (r6v2 java.util.ArrayList) = 
  (r6v1 java.util.ArrayList)
  (r6v3 java.util.ArrayList)
  (r6v3 java.util.ArrayList)
  (r6v3 java.util.ArrayList)
  (r6v3 java.util.ArrayList)
  (r6v3 java.util.ArrayList)
 binds: [B:48:0x00b7, B:56:0x00f2, B:58:0x00f6, B:60:0x00fe, B:62:0x010f, B:64:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0122 A[Catch: MediaCodecUtil$DecoderQueryException -> 0x024a, MediaCodecRenderer2$DecoderInitializationException -> 0x0256, TryCatch #1 {MediaCodecUtil$DecoderQueryException -> 0x024a, blocks: (B:47:0x00a9, B:49:0x00b9, B:52:0x00c2, B:54:0x00ce, B:55:0x00ee, B:57:0x00f4, B:59:0x00f8, B:61:0x0100, B:63:0x0111, B:66:0x0118, B:68:0x0122, B:69:0x0125, B:70:0x0128, B:72:0x012e), top: B:157:0x00a9, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128 A[Catch: MediaCodecUtil$DecoderQueryException -> 0x024a, MediaCodecRenderer2$DecoderInitializationException -> 0x0256, TryCatch #1 {MediaCodecUtil$DecoderQueryException -> 0x024a, blocks: (B:47:0x00a9, B:49:0x00b9, B:52:0x00c2, B:54:0x00ce, B:55:0x00ee, B:57:0x00f4, B:59:0x00f8, B:61:0x0100, B:63:0x0111, B:66:0x0118, B:68:0x0122, B:69:0x0125, B:70:0x0128, B:72:0x012e), top: B:157:0x00a9, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0168 A[Catch: MediaCodecRenderer2$DecoderInitializationException -> 0x0256, TryCatch #4 {MediaCodecRenderer2$DecoderInitializationException -> 0x0256, blocks: (B:45:0x00a0, B:47:0x00a9, B:49:0x00b9, B:52:0x00c2, B:54:0x00ce, B:55:0x00ee, B:57:0x00f4, B:59:0x00f8, B:61:0x0100, B:63:0x0111, B:66:0x0118, B:68:0x0122, B:69:0x0125, B:70:0x0128, B:72:0x012e, B:73:0x0138, B:75:0x013c, B:77:0x0144, B:79:0x014a, B:80:0x0160, B:82:0x0168, B:83:0x016e, B:85:0x0172, B:87:0x017e, B:89:0x0185, B:91:0x0189, B:96:0x0197, B:99:0x01a1, B:101:0x01a7, B:93:0x018f, B:104:0x01ae, B:108:0x01b7, B:110:0x01c4, B:112:0x01c8, B:113:0x01cf, B:115:0x01d1, B:117:0x01f8, B:118:0x01ff, B:120:0x020e, B:121:0x0210, B:123:0x0218, B:130:0x0255, B:124:0x021b, B:126:0x023c, B:127:0x023f, B:129:0x024b), top: B:163:0x00a0, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0g() {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6148Dwq.A0g():void");
    }

    public void A0i(long j) {
        this.A0k = j;
        while (true) {
            ArrayDeque<C6228DyO> arrayDeque = this.A11;
            if (arrayDeque.isEmpty() || j < arrayDeque.peek().A00) {
                return;
            }
            A0A(arrayDeque.poll());
            if (this instanceof C6149Dwr) {
                C6149Dwr c6149Dwr = (C6149Dwr) this;
                if (!c6149Dwr.A0T) {
                    C6149Dwr.A0A(c6149Dwr);
                }
            } else {
                ((C6156Dwz) this).A0G.AN3();
            }
        }
    }

    public final void A0j(long j) throws ExoPlaybackException {
        C6154Dwx c6154Dwx;
        boolean z;
        C6154Dwx c6154Dwx2;
        C6218Dy8<C6154Dwx> c6218Dy8 = this.A0O.A02;
        synchronized (c6218Dy8) {
            c6154Dwx = null;
            while (true) {
                int i = c6218Dy8.A01;
                if (i <= 0) {
                    break;
                }
                long[] jArr = c6218Dy8.A02;
                int i2 = c6218Dy8.A00;
                if (j - jArr[i2] < 0) {
                    break;
                }
                C6154Dwx[] c6154DwxArr = c6218Dy8.A03;
                c6154Dwx = c6154DwxArr[i2];
                c6154DwxArr[i2] = null;
                c6218Dy8.A00 = (i2 + 1) % c6154DwxArr.length;
                c6218Dy8.A01 = i - 1;
            }
        }
        C6154Dwx c6154Dwx3 = c6154Dwx;
        if (c6154Dwx3 == null && this.A0u && this.A0A != null) {
            C6218Dy8<C6154Dwx> c6218Dy82 = this.A0O.A02;
            synchronized (c6218Dy82) {
                int i3 = c6218Dy82.A01;
                if (i3 == 0) {
                    c6154Dwx2 = null;
                } else {
                    C1G.A08(AnonymousClass002.A1N(i3));
                    C6154Dwx[] c6154DwxArr2 = c6218Dy82.A03;
                    int i4 = c6218Dy82.A00;
                    c6154Dwx2 = c6154DwxArr2[i4];
                    c6154DwxArr2[i4] = null;
                    c6218Dy82.A00 = (i4 + 1) % c6154DwxArr2.length;
                    c6218Dy82.A01 = i3 - 1;
                }
            }
            c6154Dwx3 = c6154Dwx2;
        }
        if (c6154Dwx3 != null) {
            this.A0D = c6154Dwx3;
            z = true;
        } else {
            z = false;
        }
        if (this.A0U && this.A0D == null && this.A0C != null && super.A0F == 1 && AbstractC5653Dmh.A03(EnumC5618Dlz.A1d)) {
            this.A0D = this.A0C;
        } else if (!z && (!this.A0U || this.A0D == null)) {
            return;
        }
        A0k(this.A0A, this.A0D);
        this.A0U = false;
        this.A0u = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0296, code lost:
    
        if (r42.A03 != 2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0298, code lost:
    
        r6.A02();
        r42.A03 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x029d, code lost:
    
        r42.A0W = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02a1, code lost:
    
        if (r42.A0V != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02a3, code lost:
    
        A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02a9, code lost:
    
        if (r42.A0T != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02ab, code lost:
    
        r42.A0L.queueInputBuffer(r42.A04, 0, 0, 0, 4);
        r42.A04 = -1;
        r6.A01 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022f A[Catch: IllegalStateException -> 0x04d1, all -> 0x053e, TryCatch #1 {IllegalStateException -> 0x04d1, blocks: (B:74:0x0115, B:75:0x011a, B:77:0x011e, B:81:0x012b, B:108:0x01d1, B:110:0x01d5, B:112:0x01d9, B:114:0x01de, B:115:0x01e1, B:117:0x01e5, B:119:0x01ea, B:121:0x01ee, B:123:0x01f2, B:125:0x01fa, B:126:0x0207, B:128:0x020b, B:130:0x020f, B:131:0x0224, B:133:0x022f, B:136:0x0234, B:138:0x023e, B:139:0x0252, B:140:0x0254, B:141:0x0266, B:142:0x026a, B:144:0x0270, B:163:0x02c1, B:165:0x02c5, B:166:0x02ca, B:152:0x0286, B:154:0x0294, B:156:0x0298, B:157:0x029d, B:159:0x02a3, B:160:0x02a7, B:162:0x02ab, B:253:0x04c2, B:254:0x04d0, B:167:0x02cf, B:169:0x02d3, B:171:0x02dd, B:173:0x02e4, B:174:0x02e8, B:176:0x02f3, B:178:0x02f7, B:180:0x02fb, B:181:0x0303, B:182:0x0308, B:184:0x030e, B:186:0x0318, B:187:0x031a, B:189:0x031e, B:190:0x0325, B:192:0x0332, B:194:0x0339, B:209:0x0397, B:196:0x034a, B:195:0x0348, B:197:0x036c, B:199:0x0377, B:200:0x037c, B:202:0x0380, B:204:0x0388, B:205:0x038e, B:206:0x0392, B:222:0x040d, B:223:0x040e, B:208:0x0394, B:224:0x0410, B:226:0x0426, B:228:0x042a, B:230:0x0431, B:232:0x043d, B:241:0x0466, B:242:0x047b, B:244:0x0482, B:246:0x049d, B:245:0x048d, B:146:0x027b, B:248:0x04b3, B:132:0x0226, B:82:0x0138, B:84:0x013c, B:87:0x0144, B:89:0x0150, B:90:0x015a, B:92:0x0165, B:94:0x0171, B:98:0x017b, B:100:0x0185, B:95:0x0175, B:101:0x018a, B:103:0x01ba, B:105:0x01c7), top: B:307:0x0115, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[Catch: IllegalStateException -> 0x0543, DONT_GENERATE, TryCatch #2 {IllegalStateException -> 0x0543, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001b, B:14:0x001f, B:17:0x0027, B:19:0x0032, B:20:0x0037, B:22:0x0044, B:24:0x0071, B:28:0x007f, B:29:0x0082, B:30:0x0084, B:31:0x0085, B:25:0x0079, B:27:0x007d, B:33:0x0088, B:35:0x008c, B:36:0x0097, B:38:0x009b, B:40:0x009f, B:43:0x00ac, B:44:0x00bf, B:278:0x0530, B:283:0x0542, B:61:0x00f9, B:63:0x00fd, B:64:0x0100, B:66:0x0104, B:68:0x0108, B:51:0x00d1, B:53:0x00d7, B:54:0x00da, B:56:0x00de, B:57:0x00ea, B:59:0x00f3, B:60:0x00f6, B:71:0x010e, B:73:0x0112, B:282:0x053f, B:276:0x051f, B:74:0x0115, B:75:0x011a, B:77:0x011e, B:81:0x012b, B:108:0x01d1, B:110:0x01d5, B:112:0x01d9, B:114:0x01de, B:115:0x01e1, B:117:0x01e5, B:119:0x01ea, B:121:0x01ee, B:123:0x01f2, B:125:0x01fa, B:126:0x0207, B:128:0x020b, B:130:0x020f, B:131:0x0224, B:133:0x022f, B:136:0x0234, B:138:0x023e, B:139:0x0252, B:140:0x0254, B:141:0x0266, B:142:0x026a, B:144:0x0270, B:163:0x02c1, B:165:0x02c5, B:166:0x02ca, B:152:0x0286, B:154:0x0294, B:156:0x0298, B:157:0x029d, B:159:0x02a3, B:160:0x02a7, B:162:0x02ab, B:253:0x04c2, B:254:0x04d0, B:167:0x02cf, B:169:0x02d3, B:171:0x02dd, B:173:0x02e4, B:174:0x02e8, B:176:0x02f3, B:178:0x02f7, B:180:0x02fb, B:181:0x0303, B:182:0x0308, B:184:0x030e, B:186:0x0318, B:187:0x031a, B:189:0x031e, B:190:0x0325, B:192:0x0332, B:194:0x0339, B:209:0x0397, B:196:0x034a, B:195:0x0348, B:197:0x036c, B:199:0x0377, B:200:0x037c, B:202:0x0380, B:204:0x0388, B:205:0x038e, B:206:0x0392, B:222:0x040d, B:223:0x040e, B:208:0x0394, B:224:0x0410, B:226:0x0426, B:228:0x042a, B:230:0x0431, B:232:0x043d, B:241:0x0466, B:242:0x047b, B:244:0x0482, B:246:0x049d, B:245:0x048d, B:146:0x027b, B:248:0x04b3, B:132:0x0226, B:82:0x0138, B:84:0x013c, B:87:0x0144, B:89:0x0150, B:90:0x015a, B:92:0x0165, B:94:0x0171, B:98:0x017b, B:100:0x0185, B:95:0x0175, B:101:0x018a, B:103:0x01ba, B:105:0x01c7, B:256:0x04d2, B:258:0x04d7, B:260:0x04e2, B:265:0x04f0, B:266:0x04f8, B:267:0x04fd, B:268:0x0504, B:270:0x0508, B:272:0x050d, B:273:0x050f, B:279:0x0535, B:280:0x053d), top: B:308:0x0013, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[Catch: IllegalStateException -> 0x0543, TryCatch #2 {IllegalStateException -> 0x0543, blocks: (B:8:0x0013, B:10:0x0017, B:12:0x001b, B:14:0x001f, B:17:0x0027, B:19:0x0032, B:20:0x0037, B:22:0x0044, B:24:0x0071, B:28:0x007f, B:29:0x0082, B:30:0x0084, B:31:0x0085, B:25:0x0079, B:27:0x007d, B:33:0x0088, B:35:0x008c, B:36:0x0097, B:38:0x009b, B:40:0x009f, B:43:0x00ac, B:44:0x00bf, B:278:0x0530, B:283:0x0542, B:61:0x00f9, B:63:0x00fd, B:64:0x0100, B:66:0x0104, B:68:0x0108, B:51:0x00d1, B:53:0x00d7, B:54:0x00da, B:56:0x00de, B:57:0x00ea, B:59:0x00f3, B:60:0x00f6, B:71:0x010e, B:73:0x0112, B:282:0x053f, B:276:0x051f, B:74:0x0115, B:75:0x011a, B:77:0x011e, B:81:0x012b, B:108:0x01d1, B:110:0x01d5, B:112:0x01d9, B:114:0x01de, B:115:0x01e1, B:117:0x01e5, B:119:0x01ea, B:121:0x01ee, B:123:0x01f2, B:125:0x01fa, B:126:0x0207, B:128:0x020b, B:130:0x020f, B:131:0x0224, B:133:0x022f, B:136:0x0234, B:138:0x023e, B:139:0x0252, B:140:0x0254, B:141:0x0266, B:142:0x026a, B:144:0x0270, B:163:0x02c1, B:165:0x02c5, B:166:0x02ca, B:152:0x0286, B:154:0x0294, B:156:0x0298, B:157:0x029d, B:159:0x02a3, B:160:0x02a7, B:162:0x02ab, B:253:0x04c2, B:254:0x04d0, B:167:0x02cf, B:169:0x02d3, B:171:0x02dd, B:173:0x02e4, B:174:0x02e8, B:176:0x02f3, B:178:0x02f7, B:180:0x02fb, B:181:0x0303, B:182:0x0308, B:184:0x030e, B:186:0x0318, B:187:0x031a, B:189:0x031e, B:190:0x0325, B:192:0x0332, B:194:0x0339, B:209:0x0397, B:196:0x034a, B:195:0x0348, B:197:0x036c, B:199:0x0377, B:200:0x037c, B:202:0x0380, B:204:0x0388, B:205:0x038e, B:206:0x0392, B:222:0x040d, B:223:0x040e, B:208:0x0394, B:224:0x0410, B:226:0x0426, B:228:0x042a, B:230:0x0431, B:232:0x043d, B:241:0x0466, B:242:0x047b, B:244:0x0482, B:246:0x049d, B:245:0x048d, B:146:0x027b, B:248:0x04b3, B:132:0x0226, B:82:0x0138, B:84:0x013c, B:87:0x0144, B:89:0x0150, B:90:0x015a, B:92:0x0165, B:94:0x0171, B:98:0x017b, B:100:0x0185, B:95:0x0175, B:101:0x018a, B:103:0x01ba, B:105:0x01c7, B:256:0x04d2, B:258:0x04d7, B:260:0x04e2, B:265:0x04f0, B:266:0x04f8, B:267:0x04fd, B:268:0x0504, B:270:0x0508, B:272:0x050d, B:273:0x050f, B:279:0x0535, B:280:0x053d), top: B:308:0x0013, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x020b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v9, types: [V[], java.lang.Object, java.lang.Object[]] */
    @Override // X.InterfaceC6068Dv6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Aaz(long r43, long r45) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6148Dwq.Aaz(long, long):void");
    }

    @Override // X.AbstractC6146Dwo, X.InterfaceC6068Dv6
    public void Ae2(float f, float f2) {
        this.A00 = f;
        this.A0h = f2;
        A0B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00fc: INVOKE (r0 I:androidx.media3.exoplayer.ExoPlaybackException) = (r12 I:X.Dwx), (r3 I:X.Dwo), (r1 I:java.lang.Throwable), (r0 I:int) STATIC call: X.Dwo.A02(X.Dwx, X.Dwo, java.lang.Throwable, int):androidx.media3.exoplayer.ExoPlaybackException A[MD:(X.Dwx, X.Dwo, java.lang.Throwable, int):androidx.media3.exoplayer.ExoPlaybackException (m)] (LINE:252), block:B:77:0x00fa */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00fc: INVOKE (r0 I:androidx.media3.exoplayer.ExoPlaybackException) = (r12v0 ?? I:X.Dwx), (r3 I:X.Dwo), (r1 I:java.lang.Throwable), (r0 I:int) STATIC call: X.Dwo.A02(X.Dwx, X.Dwo, java.lang.Throwable, int):androidx.media3.exoplayer.ExoPlaybackException A[MD:(X.Dwx, X.Dwo, java.lang.Throwable, int):androidx.media3.exoplayer.ExoPlaybackException (m)] (LINE:252), block:B:77:0x00fa */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dd A[Catch: MediaCodecUtil$DecoderQueryException -> 0x00f9, EDGE_INSN: B:60:0x00d5->B:64:0x00dd BREAK  A[LOOP:0: B:54:0x00bf->B:59:0x00d2], PHI: r2 r5
  0x00dd: PHI (r2v4 boolean) = (r2v2 boolean), (r2v7 boolean) binds: [B:62:0x00d9, B:60:0x00d5] A[DONT_GENERATE, DONT_INLINE]
  0x00dd: PHI (r5v4 X.Dwv) = (r5v2 X.Dwv), (r5v5 X.Dwv) binds: [B:62:0x00d9, B:60:0x00d5] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {MediaCodecUtil$DecoderQueryException -> 0x00f9, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x000f, B:8:0x0013, B:12:0x0021, B:14:0x002d, B:17:0x0035, B:19:0x003c, B:23:0x004d, B:30:0x005f, B:33:0x0069, B:37:0x0074, B:39:0x007c, B:42:0x0085, B:44:0x009f, B:49:0x00ae, B:51:0x00ba, B:54:0x00bf, B:56:0x00c5, B:64:0x00dd, B:67:0x00e5, B:72:0x00f0, B:59:0x00d2), top: B:79:0x0000 }] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.Dwx] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Dwo] */
    @Override // X.InterfaceC5921Ds8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Agf(X.C6154Dwx r17) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6148Dwq.Agf(X.Dwx):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0038 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000c  */
    @Override // X.InterfaceC6068Dv6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isReady() {
        /*
            r4 = this;
            X.Dwx r0 = r4.A0C
            if (r0 != 0) goto L2b
            java.lang.Integer r0 = X.C79.A01
        L6:
            r4.A0H = r0
        L8:
            X.Dwx r0 = r4.A0C
            if (r0 == 0) goto L38
            boolean r0 = r4.A0V()
            if (r0 != 0) goto L29
            int r0 = r4.A05
            if (r0 >= 0) goto L29
            long r3 = r4.A0i
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L38
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L38
        L29:
            r0 = 1
            return r0
        L2b:
            boolean r0 = r4.A0V()
            if (r0 != 0) goto L8
            int r0 = r4.A05
            if (r0 >= 0) goto L8
            java.lang.Integer r0 = X.C79.A0K
            goto L6
        L38:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6148Dwq.isReady():boolean");
    }

    public AbstractC6148Dwq(BVV bvv, C6175DxI c6175DxI, Object obj, BWK bwk, InterfaceC2356BVg interfaceC2356BVg, float f, int i, int i2, int i3, boolean z, boolean z2) {
        super(i);
        this.A0e = false;
        this.A0Z = false;
        this.A0j = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        this.A0H = C79.A00;
        this.A10 = c6175DxI;
        this.A1B = bvv;
        this.A0o = obj;
        this.A1A = bwk;
        this.A14 = interfaceC2356BVg;
        this.A15 = z;
        this.A17 = f;
        this.A18 = i2;
        this.A0w = i3;
        this.A16 = AbstractC5653Dmh.A03(EnumC5618Dlz.A1Q);
        this.A0a = z2;
        this.A19 = new Di2(0);
        this.A0y = new Di2(0);
        this.A0z = new Di2(2);
        C6190Dxa c6190Dxa = new C6190Dxa();
        this.A13 = c6190Dxa;
        this.A12 = C3cG.A0h();
        this.A0x = new MediaCodec.BufferInfo();
        this.A00 = 1.0f;
        this.A0h = 1.0f;
        this.A11 = BV4.A0s();
        A0A(C6228DyO.A03);
        c6190Dxa.A04(0);
        ((Di2) c6190Dxa).A01.order(ByteOrder.nativeOrder());
        this.A0g = -1.0f;
        this.A03 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A0i = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0k = -9223372036854775807L;
        this.A02 = 0;
        this.A01 = 0;
        this.A0v = AbstractC5653Dmh.A03(EnumC5618Dlz.A29);
        this.A1C = AbstractC5653Dmh.A03(EnumC5618Dlz.A2G);
    }

    private final void A07() {
        A0f();
        this.A0F = null;
        this.A0K = null;
        this.A0J = null;
        this.A0M = null;
        this.A0B = null;
        this.A0A = null;
        this.A0U = false;
        this.A0S = false;
        this.A0g = -1.0f;
        this.A0r = false;
        this.A0T = false;
        this.A0s = false;
        this.A03 = 0;
        this.A0t = false;
        this.A0j = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0o(X.C6154Dwx r31, java.nio.ByteBuffer r32, X.InterfaceC6185DxT r33, int r34, int r35, int r36, long r37, long r39, long r41, boolean r43, boolean r44) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6148Dwq.A0o(X.Dwx, java.nio.ByteBuffer, X.DxT, int, int, int, long, long, long, boolean, boolean):boolean");
    }
}
