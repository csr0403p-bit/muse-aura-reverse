package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Locale;
import meta.androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;

/* renamed from: X.Dwp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6147Dwp extends AbstractC6146Dwo {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public MediaFormat A0D;
    public C6154Dwx A0E;
    public C6154Dwx A0F;
    public C6173DxG A0G;
    public InterfaceC5547DkP A0H;
    public InterfaceC5547DkP A0I;
    public Integer A0J;
    public String A0K;
    public ByteBuffer A0L;
    public ArrayDeque<C6153Dwv> A0M;
    public InterfaceC6181DxP A0N;
    public C6153Dwv A0O;
    public MediaCodecRenderer$DecoderInitializationException A0P;
    public C6254Dyx A0Q;
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
    public int A0c;
    public long A0d;
    public long A0e;
    public C6154Dwx A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public final float A0k;
    public final int A0l;
    public final Di2 A0m;
    public final C5406Dhz A0n;
    public final BVV A0o;
    public final C6175DxI A0p;
    public final Dy3 A0q;
    public final InterfaceC2356BVg A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final int A12;
    public final int A13;
    public final MediaCodec.BufferInfo A14;
    public final Di2 A15;
    public final InterfaceC5460Div A16;
    public final C2386BYm A17;
    public final ArrayDeque<C6254Dyx> A18;
    public final boolean A19;
    public final boolean A1A;
    public final boolean A1B;
    public final boolean A1C;
    public final boolean A1D;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A00(X.C5406Dhz r8) {
        /*
            r7 = this;
            r6 = 0
            X.Di2 r0 = r7.A0m     // Catch: androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException -> L8
            int r0 = r7.A0T(r0, r8, r6)     // Catch: androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException -> L8
            return r0
        L8:
            r5 = move-exception
            boolean r0 = r7.A0z
            if (r0 == 0) goto L40
            X.Di2 r4 = r7.A0m
            java.nio.ByteBuffer r3 = r4.A01
            if (r3 == 0) goto L40
            int r2 = r5.requiredCapacity
            int r0 = r3.position()
            int r2 = r2 - r0
            int r1 = r7.A0F
            r0 = 2
            if (r1 != r0) goto L36
            java.lang.String r1 = "meta.dav1d.av1.decoder"
            java.lang.String r0 = r7.A0K
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L36
            X.DxP r1 = r7.A0N
            r1.getClass()
            int r0 = r7.A06
            java.nio.ByteBuffer r0 = r1.AN1(r0, r2)
            if (r0 != 0) goto L37
        L36:
            r0 = r3
        L37:
            if (r0 == r3) goto L40
            r4.A01 = r0
            int r0 = r7.A0T(r4, r8, r6)
            return r0
        L40:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6147Dwp.A00(X.Dhz):int");
    }

    private ByteBuffer A03() throws ExoPlaybackException {
        try {
            ByteBuffer inputBuffer = this.A0N.getInputBuffer(this.A06);
            if (inputBuffer == null) {
                A0A("null input buffer", null);
            }
            return inputBuffer;
        } catch (MediaCodec.CodecException e) {
            if (e.getErrorCode() != 1101) {
                throw e;
            }
            A0A("getInputBuffer threw ERROR_RECLAIMED", e);
            return null;
        }
    }

    private void A07() {
        this.A06 = -1;
        boolean z = this.A0u;
        Di2 di2 = this.A0m;
        if (!z) {
            di2.A01 = null;
        } else if (di2.A01 != null) {
            di2.A02();
        }
    }

    public static void A0B(AbstractC6147Dwp abstractC6147Dwp) {
        InterfaceC5547DkP interfaceC5547DkP = abstractC6147Dwp.A0I;
        if (interfaceC5547DkP == null || interfaceC5547DkP == abstractC6147Dwp.A0H) {
            return;
        }
        interfaceC5547DkP.Aa8(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Override // X.AbstractC6146Dwo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0X() {
        /*
            r6 = this;
            r2 = 0
            r6.A0F = r2
            X.Dyx r0 = X.C6254Dyx.A01
            r6.A0Q = r0
            java.util.ArrayDeque<X.Dyx> r0 = r6.A18
            r0.clear()
            r6.A0M = r2
            r0 = 0
            r6.A0c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.A0C = r0
            boolean r0 = r6.A19
            if (r0 == 0) goto L61
            X.DxP r0 = r6.A0N
            if (r0 == 0) goto L4e
            boolean r0 = r6.A0T
            if (r0 != 0) goto L4b
            boolean r5 = r6 instanceof X.C6150Dws
            if (r5 == 0) goto L3c
            r1 = r6
            X.Dws r1 = (X.C6150Dws) r1
            boolean r0 = r1.A0b
            if (r0 == 0) goto L3c
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.A0L
            long r3 = r3 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L4b
        L3c:
            if (r5 == 0) goto L4f
            X.Dwv r0 = r6.A0O
            if (r0 == 0) goto L4f
            java.lang.String r1 = r0.A06
            r0 = 1
            boolean r0 = X.AbstractC5337DgY.A00(r1, r0)
            if (r0 == 0) goto L4f
        L4b:
            r6.A0f()
        L4e:
            return
        L4f:
            int r0 = r6.A04
            if (r0 != 0) goto L4b
            X.DxP r0 = r6.A0N     // Catch: java.lang.Throwable -> L5c
            r0.flush()     // Catch: java.lang.Throwable -> L5c
            r6.A06()
            return
        L5c:
            r0 = move-exception
            r6.A06()
            throw r0
        L61:
            r6.A0f()     // Catch: java.lang.Throwable -> L88
            X.DkP r0 = r6.A0H     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L6b
            r0.Aa8(r2)     // Catch: java.lang.Throwable -> L79
        L6b:
            A0B(r6)     // Catch: java.lang.Throwable -> L73
            r6.A0H = r2
            r6.A0I = r2
            return
        L73:
            r0 = move-exception
            r6.A0H = r2
            r6.A0I = r2
            throw r0
        L79:
            r0 = move-exception
            A0B(r6)     // Catch: java.lang.Throwable -> L82
            r6.A0H = r2
            r6.A0I = r2
            throw r0
        L82:
            r0 = move-exception
            r6.A0H = r2
            r6.A0I = r2
            throw r0
        L88:
            r1 = move-exception
            X.DkP r0 = r6.A0H     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L90
            r0.Aa8(r2)     // Catch: java.lang.Throwable -> L9e
        L90:
            A0B(r6)     // Catch: java.lang.Throwable -> L98
            r6.A0H = r2
            r6.A0I = r2
            throw r1
        L98:
            r0 = move-exception
            r6.A0H = r2
            r6.A0I = r2
            throw r0
        L9e:
            r0 = move-exception
            A0B(r6)     // Catch: java.lang.Throwable -> La7
            r6.A0H = r2
            r6.A0I = r2
            throw r0
        La7:
            r0 = move-exception
            r6.A0H = r2
            r6.A0I = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6147Dwp.A0X():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0f() {
        Handler handler;
        Runnable runnableC6251Dyu;
        this.A0T = false;
        this.A0d = -9223372036854775807L;
        this.A0e = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        A07();
        if (this.A0u) {
            this.A0m.A01 = null;
        }
        this.A07 = -1;
        this.A0L = null;
        this.A0D = null;
        this.A0b = false;
        this.A0i = false;
        this.A0q.A03.clear();
        this.A0O = null;
        this.A0h = false;
        this.A0S = false;
        this.A0R = false;
        this.A0C = -9223372036854775807L;
        this.A03 = 0;
        this.A04 = 0;
        this.A0E = null;
        InterfaceC6181DxP interfaceC6181DxP = this.A0N;
        if (interfaceC6181DxP != null) {
            this.A0G.A03++;
            String str = this.A0K;
            C6175DxI c6175DxI = this.A0p;
            if (c6175DxI.A0T) {
                this.A0N = null;
            }
            try {
                boolean z = this instanceof C6150Dws;
                C6204Dxo.A00.AaD(this.A0o.A00, c6175DxI, C79.A01, str, interfaceC6181DxP, z);
                this.A0N = null;
                InterfaceC5547DkP interfaceC5547DkP = this.A0H;
                if (interfaceC5547DkP != null && this.A0I != interfaceC5547DkP) {
                    try {
                        interfaceC5547DkP.Aa8(null);
                    } finally {
                    }
                }
                if (this.A1A) {
                    if (z) {
                        C6205Dxp c6205Dxp = ((C6150Dws) this).A14;
                        handler = c6205Dxp.A00;
                        if (handler == null) {
                            return;
                        } else {
                            runnableC6251Dyu = new RunnableC6245Dyo(c6205Dxp, str);
                        }
                    } else {
                        Dy9 dy9 = ((C6157Dx0) this).A0H;
                        handler = dy9.A00;
                        if (handler == null) {
                            return;
                        } else {
                            runnableC6251Dyu = new RunnableC6251Dyu(dy9, str);
                        }
                    }
                    handler.post(runnableC6251Dyu);
                }
            } catch (Throwable th) {
                this.A0N = null;
                InterfaceC5547DkP interfaceC5547DkP2 = this.A0H;
                if (interfaceC5547DkP2 != null && this.A0I != interfaceC5547DkP2) {
                    try {
                        interfaceC5547DkP2.Aa8(null);
                    } finally {
                    }
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0168, code lost:
    
        if (r6.A0C == 0) goto L154;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0j(X.C6154Dwx r16) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6147Dwp.A0j(X.Dwx):void");
    }

    public abstract void A0k(Di2 di2);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A04() {
        /*
            r4 = this;
            boolean r0 = r4.A0U
            if (r0 != 0) goto L2a
            java.lang.String r3 = r4.A0K
            if (r3 == 0) goto L2a
            X.BYm r0 = r4.A17
            X.BVF r0 = r0.A00
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicReference<java.lang.Thread> r2 = X.C2386BYm.A03
            r1 = 0
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = X.Bs8.A00(r1, r0, r2)
            if (r0 == 0) goto L27
            java.lang.String r0 = X.C2386BYm.A01
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L25
            X.C2386BYm.A01 = r3     // Catch: java.lang.Throwable -> L25
        L25:
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            r4.A0U = r0
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6147Dwp.A04():void");
    }

    private void A05() throws ExoPlaybackException {
        if (this.A04 == 2) {
            A0f();
            A0g();
        } else {
            this.A0X = true;
            A0d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0145 A[Catch: Exception -> 0x0308, TryCatch #1 {Exception -> 0x0308, blocks: (B:47:0x00b5, B:51:0x00c4, B:53:0x00d1, B:129:0x0250, B:54:0x00dc, B:56:0x00e7, B:58:0x00fd, B:60:0x0101, B:62:0x0105, B:64:0x0109, B:66:0x0114, B:68:0x0118, B:78:0x013d, B:80:0x0145, B:83:0x014d, B:87:0x0157, B:89:0x015f, B:91:0x0163, B:96:0x016d, B:98:0x0184, B:128:0x023f, B:71:0x0121, B:73:0x0125, B:75:0x0130, B:76:0x0138, B:99:0x0192, B:101:0x01a8, B:104:0x01b0, B:106:0x01d6, B:107:0x01d9, B:109:0x01e5, B:110:0x01ea, B:112:0x01ee, B:114:0x01f6, B:116:0x01fc, B:118:0x0204, B:119:0x020e, B:123:0x021e, B:124:0x0220, B:125:0x0225, B:127:0x0238, B:130:0x0255), top: B:189:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0184 A[Catch: Exception -> 0x0308, TryCatch #1 {Exception -> 0x0308, blocks: (B:47:0x00b5, B:51:0x00c4, B:53:0x00d1, B:129:0x0250, B:54:0x00dc, B:56:0x00e7, B:58:0x00fd, B:60:0x0101, B:62:0x0105, B:64:0x0109, B:66:0x0114, B:68:0x0118, B:78:0x013d, B:80:0x0145, B:83:0x014d, B:87:0x0157, B:89:0x015f, B:91:0x0163, B:96:0x016d, B:98:0x0184, B:128:0x023f, B:71:0x0121, B:73:0x0125, B:75:0x0130, B:76:0x0138, B:99:0x0192, B:101:0x01a8, B:104:0x01b0, B:106:0x01d6, B:107:0x01d9, B:109:0x01e5, B:110:0x01ea, B:112:0x01ee, B:114:0x01f6, B:116:0x01fc, B:118:0x0204, B:119:0x020e, B:123:0x021e, B:124:0x0220, B:125:0x0225, B:127:0x0238, B:130:0x0255), top: B:189:0x00b5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08(android.media.MediaCrypto r31, X.C6153Dwv r32) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6147Dwp.A08(android.media.MediaCrypto, X.Dwv):void");
    }

    public static void A09(C6175DxI c6175DxI, InterfaceC6181DxP interfaceC6181DxP, boolean z) {
        int i = Util.A00;
        if (z || !c6175DxI.A0R || i < 30 || i > 35 || !interfaceC6181DxP.A70()) {
            return;
        }
        C0Q.A01("flushReusedAudioCodec");
        try {
            interfaceC6181DxP.flush();
        } finally {
            C0Q.A00();
        }
    }

    private void A0A(String str, Throwable th) throws ExoPlaybackException {
        int i;
        int i2 = this.A05 + 1;
        this.A05 = i2;
        int i3 = this.A0c + 1;
        this.A0c = i3;
        if (th != null && super.A0F == 2) {
            this.A0T = true;
        }
        if (i2 >= 5 || ((i = this.A13) > 0 && i3 >= i)) {
            throw AbstractC6146Dwo.A02(this.A0F, this, new IllegalStateException(FGI.A0M("Codec input buffer unavailable: ", str), th), 4003);
        }
        CNC.A04("MediaCodecRenderer", String.format(Locale.US, "Input buffer guard dropped sample (%s), consecutive=%d total=%d", BV8.A1b(str, i2, i3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a8 A[Catch: all -> 0x068b, EDGE_INSN: B:437:0x02a8->B:178:0x02a8 BREAK  A[LOOP:1: B:162:0x0260->B:170:0x0294], EDGE_INSN: B:438:0x02a8->B:178:0x02a8 BREAK  A[LOOP:1: B:162:0x0260->B:170:0x0294], EDGE_INSN: B:439:0x02a8->B:178:0x02a8 BREAK  A[LOOP:1: B:162:0x0260->B:170:0x0294], TryCatch #6 {all -> 0x068b, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000c, B:8:0x0010, B:10:0x0015, B:12:0x001d, B:14:0x0023, B:16:0x002d, B:18:0x0033, B:19:0x0037, B:30:0x0072, B:32:0x0076, B:38:0x009b, B:37:0x008f, B:36:0x008a, B:396:0x065e, B:39:0x00a2, B:84:0x0141, B:86:0x0147, B:93:0x015e, B:95:0x0162, B:96:0x0169, B:97:0x0172, B:99:0x017f, B:101:0x0183, B:102:0x0188, B:104:0x018e, B:105:0x0193, B:106:0x0195, B:110:0x01b4, B:109:0x01a7, B:382:0x05e4, B:372:0x05b0, B:394:0x0638, B:111:0x01b9, B:113:0x01bd, B:115:0x01c7, B:117:0x01ce, B:118:0x01d2, B:120:0x01d8, B:122:0x01df, B:125:0x01ee, B:127:0x01fc, B:129:0x0202, B:131:0x0208, B:133:0x020e, B:135:0x0214, B:138:0x021c, B:140:0x0220, B:142:0x0226, B:144:0x022e, B:154:0x024a, B:156:0x024e, B:174:0x029e, B:294:0x0478, B:179:0x02ac, B:181:0x02b0, B:296:0x047c, B:297:0x047f, B:293:0x0476, B:147:0x0237, B:149:0x023d, B:151:0x0241, B:160:0x025c, B:162:0x0260, B:164:0x0264, B:166:0x0282, B:168:0x0288, B:170:0x0294, B:178:0x02a8, B:182:0x02b2, B:184:0x02b6, B:186:0x02bc, B:188:0x02c7, B:190:0x02d2, B:192:0x02de, B:194:0x02e9, B:196:0x02f3, B:201:0x0308, B:203:0x0313, B:205:0x031e, B:397:0x065f, B:399:0x0663, B:206:0x0323, B:208:0x0327, B:210:0x0337, B:213:0x033d, B:216:0x0345, B:218:0x035d, B:233:0x0380, B:240:0x038b, B:242:0x03aa, B:244:0x03b0, B:251:0x03c6, B:252:0x03ca, B:254:0x03d3, B:256:0x03d9, B:258:0x03df, B:272:0x0405, B:277:0x0422, B:259:0x03e2, B:262:0x03e8, B:263:0x03eb, B:267:0x03f6, B:269:0x03fb, B:276:0x041d, B:273:0x040b, B:274:0x0411, B:275:0x0417, B:278:0x0423, B:280:0x042e, B:283:0x043b, B:282:0x0439, B:286:0x044e, B:287:0x0452, B:290:0x046a, B:284:0x043f, B:285:0x0449, B:198:0x02f7, B:299:0x048b, B:301:0x048f, B:303:0x0493, B:304:0x049b, B:305:0x04a1, B:308:0x04a7, B:311:0x04ac, B:316:0x04b6, B:318:0x04ba, B:320:0x04c9, B:322:0x04cd, B:324:0x04d1, B:326:0x04d5, B:327:0x04de, B:329:0x04ea, B:330:0x04f2, B:332:0x04f9, B:333:0x04fe, B:386:0x061a, B:387:0x061d, B:389:0x062b, B:385:0x060c, B:340:0x052b, B:342:0x053f, B:390:0x062e, B:391:0x0631, B:392:0x0633, B:352:0x0560, B:354:0x056d, B:356:0x0573, B:358:0x0577, B:360:0x0581, B:363:0x058f, B:365:0x0595, B:367:0x0599, B:369:0x059d, B:371:0x05a7, B:383:0x05e8, B:373:0x05b1, B:375:0x05b5, B:376:0x05b8, B:377:0x05c0, B:384:0x0606, B:349:0x0552, B:395:0x0647, B:88:0x0154, B:42:0x00ab, B:44:0x00af, B:46:0x00b3, B:48:0x00b7, B:50:0x00bd, B:51:0x00c0, B:53:0x00c4, B:55:0x00c8, B:57:0x00cc, B:59:0x00d7, B:61:0x00e4, B:67:0x00f1, B:69:0x00f5, B:72:0x00fe, B:74:0x0106, B:76:0x0110, B:77:0x0116, B:70:0x00fb, B:62:0x00e6, B:64:0x00ea, B:80:0x012e, B:82:0x0138, B:83:0x013d, B:400:0x0671, B:79:0x0126, B:401:0x0674, B:20:0x003d, B:22:0x0041, B:23:0x004c, B:25:0x0052, B:27:0x005c, B:29:0x006d, B:34:0x007c), top: B:423:0x0000, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a8 A[Catch: all -> 0x068b, TryCatch #6 {all -> 0x068b, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000c, B:8:0x0010, B:10:0x0015, B:12:0x001d, B:14:0x0023, B:16:0x002d, B:18:0x0033, B:19:0x0037, B:30:0x0072, B:32:0x0076, B:38:0x009b, B:37:0x008f, B:36:0x008a, B:396:0x065e, B:39:0x00a2, B:84:0x0141, B:86:0x0147, B:93:0x015e, B:95:0x0162, B:96:0x0169, B:97:0x0172, B:99:0x017f, B:101:0x0183, B:102:0x0188, B:104:0x018e, B:105:0x0193, B:106:0x0195, B:110:0x01b4, B:109:0x01a7, B:382:0x05e4, B:372:0x05b0, B:394:0x0638, B:111:0x01b9, B:113:0x01bd, B:115:0x01c7, B:117:0x01ce, B:118:0x01d2, B:120:0x01d8, B:122:0x01df, B:125:0x01ee, B:127:0x01fc, B:129:0x0202, B:131:0x0208, B:133:0x020e, B:135:0x0214, B:138:0x021c, B:140:0x0220, B:142:0x0226, B:144:0x022e, B:154:0x024a, B:156:0x024e, B:174:0x029e, B:294:0x0478, B:179:0x02ac, B:181:0x02b0, B:296:0x047c, B:297:0x047f, B:293:0x0476, B:147:0x0237, B:149:0x023d, B:151:0x0241, B:160:0x025c, B:162:0x0260, B:164:0x0264, B:166:0x0282, B:168:0x0288, B:170:0x0294, B:178:0x02a8, B:182:0x02b2, B:184:0x02b6, B:186:0x02bc, B:188:0x02c7, B:190:0x02d2, B:192:0x02de, B:194:0x02e9, B:196:0x02f3, B:201:0x0308, B:203:0x0313, B:205:0x031e, B:397:0x065f, B:399:0x0663, B:206:0x0323, B:208:0x0327, B:210:0x0337, B:213:0x033d, B:216:0x0345, B:218:0x035d, B:233:0x0380, B:240:0x038b, B:242:0x03aa, B:244:0x03b0, B:251:0x03c6, B:252:0x03ca, B:254:0x03d3, B:256:0x03d9, B:258:0x03df, B:272:0x0405, B:277:0x0422, B:259:0x03e2, B:262:0x03e8, B:263:0x03eb, B:267:0x03f6, B:269:0x03fb, B:276:0x041d, B:273:0x040b, B:274:0x0411, B:275:0x0417, B:278:0x0423, B:280:0x042e, B:283:0x043b, B:282:0x0439, B:286:0x044e, B:287:0x0452, B:290:0x046a, B:284:0x043f, B:285:0x0449, B:198:0x02f7, B:299:0x048b, B:301:0x048f, B:303:0x0493, B:304:0x049b, B:305:0x04a1, B:308:0x04a7, B:311:0x04ac, B:316:0x04b6, B:318:0x04ba, B:320:0x04c9, B:322:0x04cd, B:324:0x04d1, B:326:0x04d5, B:327:0x04de, B:329:0x04ea, B:330:0x04f2, B:332:0x04f9, B:333:0x04fe, B:386:0x061a, B:387:0x061d, B:389:0x062b, B:385:0x060c, B:340:0x052b, B:342:0x053f, B:390:0x062e, B:391:0x0631, B:392:0x0633, B:352:0x0560, B:354:0x056d, B:356:0x0573, B:358:0x0577, B:360:0x0581, B:363:0x058f, B:365:0x0595, B:367:0x0599, B:369:0x059d, B:371:0x05a7, B:383:0x05e8, B:373:0x05b1, B:375:0x05b5, B:376:0x05b8, B:377:0x05c0, B:384:0x0606, B:349:0x0552, B:395:0x0647, B:88:0x0154, B:42:0x00ab, B:44:0x00af, B:46:0x00b3, B:48:0x00b7, B:50:0x00bd, B:51:0x00c0, B:53:0x00c4, B:55:0x00c8, B:57:0x00cc, B:59:0x00d7, B:61:0x00e4, B:67:0x00f1, B:69:0x00f5, B:72:0x00fe, B:74:0x0106, B:76:0x0110, B:77:0x0116, B:70:0x00fb, B:62:0x00e6, B:64:0x00ea, B:80:0x012e, B:82:0x0138, B:83:0x013d, B:400:0x0671, B:79:0x0126, B:401:0x0674, B:20:0x003d, B:22:0x0041, B:23:0x004c, B:25:0x0052, B:27:0x005c, B:29:0x006d, B:34:0x007c), top: B:423:0x0000, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ac A[Catch: all -> 0x068b, TryCatch #6 {all -> 0x068b, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000c, B:8:0x0010, B:10:0x0015, B:12:0x001d, B:14:0x0023, B:16:0x002d, B:18:0x0033, B:19:0x0037, B:30:0x0072, B:32:0x0076, B:38:0x009b, B:37:0x008f, B:36:0x008a, B:396:0x065e, B:39:0x00a2, B:84:0x0141, B:86:0x0147, B:93:0x015e, B:95:0x0162, B:96:0x0169, B:97:0x0172, B:99:0x017f, B:101:0x0183, B:102:0x0188, B:104:0x018e, B:105:0x0193, B:106:0x0195, B:110:0x01b4, B:109:0x01a7, B:382:0x05e4, B:372:0x05b0, B:394:0x0638, B:111:0x01b9, B:113:0x01bd, B:115:0x01c7, B:117:0x01ce, B:118:0x01d2, B:120:0x01d8, B:122:0x01df, B:125:0x01ee, B:127:0x01fc, B:129:0x0202, B:131:0x0208, B:133:0x020e, B:135:0x0214, B:138:0x021c, B:140:0x0220, B:142:0x0226, B:144:0x022e, B:154:0x024a, B:156:0x024e, B:174:0x029e, B:294:0x0478, B:179:0x02ac, B:181:0x02b0, B:296:0x047c, B:297:0x047f, B:293:0x0476, B:147:0x0237, B:149:0x023d, B:151:0x0241, B:160:0x025c, B:162:0x0260, B:164:0x0264, B:166:0x0282, B:168:0x0288, B:170:0x0294, B:178:0x02a8, B:182:0x02b2, B:184:0x02b6, B:186:0x02bc, B:188:0x02c7, B:190:0x02d2, B:192:0x02de, B:194:0x02e9, B:196:0x02f3, B:201:0x0308, B:203:0x0313, B:205:0x031e, B:397:0x065f, B:399:0x0663, B:206:0x0323, B:208:0x0327, B:210:0x0337, B:213:0x033d, B:216:0x0345, B:218:0x035d, B:233:0x0380, B:240:0x038b, B:242:0x03aa, B:244:0x03b0, B:251:0x03c6, B:252:0x03ca, B:254:0x03d3, B:256:0x03d9, B:258:0x03df, B:272:0x0405, B:277:0x0422, B:259:0x03e2, B:262:0x03e8, B:263:0x03eb, B:267:0x03f6, B:269:0x03fb, B:276:0x041d, B:273:0x040b, B:274:0x0411, B:275:0x0417, B:278:0x0423, B:280:0x042e, B:283:0x043b, B:282:0x0439, B:286:0x044e, B:287:0x0452, B:290:0x046a, B:284:0x043f, B:285:0x0449, B:198:0x02f7, B:299:0x048b, B:301:0x048f, B:303:0x0493, B:304:0x049b, B:305:0x04a1, B:308:0x04a7, B:311:0x04ac, B:316:0x04b6, B:318:0x04ba, B:320:0x04c9, B:322:0x04cd, B:324:0x04d1, B:326:0x04d5, B:327:0x04de, B:329:0x04ea, B:330:0x04f2, B:332:0x04f9, B:333:0x04fe, B:386:0x061a, B:387:0x061d, B:389:0x062b, B:385:0x060c, B:340:0x052b, B:342:0x053f, B:390:0x062e, B:391:0x0631, B:392:0x0633, B:352:0x0560, B:354:0x056d, B:356:0x0573, B:358:0x0577, B:360:0x0581, B:363:0x058f, B:365:0x0595, B:367:0x0599, B:369:0x059d, B:371:0x05a7, B:383:0x05e8, B:373:0x05b1, B:375:0x05b5, B:376:0x05b8, B:377:0x05c0, B:384:0x0606, B:349:0x0552, B:395:0x0647, B:88:0x0154, B:42:0x00ab, B:44:0x00af, B:46:0x00b3, B:48:0x00b7, B:50:0x00bd, B:51:0x00c0, B:53:0x00c4, B:55:0x00c8, B:57:0x00cc, B:59:0x00d7, B:61:0x00e4, B:67:0x00f1, B:69:0x00f5, B:72:0x00fe, B:74:0x0106, B:76:0x0110, B:77:0x0116, B:70:0x00fb, B:62:0x00e6, B:64:0x00ea, B:80:0x012e, B:82:0x0138, B:83:0x013d, B:400:0x0671, B:79:0x0126, B:401:0x0674, B:20:0x003d, B:22:0x0041, B:23:0x004c, B:25:0x0052, B:27:0x005c, B:29:0x006d, B:34:0x007c), top: B:423:0x0000, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02f7 A[Catch: all -> 0x068b, TryCatch #6 {all -> 0x068b, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000c, B:8:0x0010, B:10:0x0015, B:12:0x001d, B:14:0x0023, B:16:0x002d, B:18:0x0033, B:19:0x0037, B:30:0x0072, B:32:0x0076, B:38:0x009b, B:37:0x008f, B:36:0x008a, B:396:0x065e, B:39:0x00a2, B:84:0x0141, B:86:0x0147, B:93:0x015e, B:95:0x0162, B:96:0x0169, B:97:0x0172, B:99:0x017f, B:101:0x0183, B:102:0x0188, B:104:0x018e, B:105:0x0193, B:106:0x0195, B:110:0x01b4, B:109:0x01a7, B:382:0x05e4, B:372:0x05b0, B:394:0x0638, B:111:0x01b9, B:113:0x01bd, B:115:0x01c7, B:117:0x01ce, B:118:0x01d2, B:120:0x01d8, B:122:0x01df, B:125:0x01ee, B:127:0x01fc, B:129:0x0202, B:131:0x0208, B:133:0x020e, B:135:0x0214, B:138:0x021c, B:140:0x0220, B:142:0x0226, B:144:0x022e, B:154:0x024a, B:156:0x024e, B:174:0x029e, B:294:0x0478, B:179:0x02ac, B:181:0x02b0, B:296:0x047c, B:297:0x047f, B:293:0x0476, B:147:0x0237, B:149:0x023d, B:151:0x0241, B:160:0x025c, B:162:0x0260, B:164:0x0264, B:166:0x0282, B:168:0x0288, B:170:0x0294, B:178:0x02a8, B:182:0x02b2, B:184:0x02b6, B:186:0x02bc, B:188:0x02c7, B:190:0x02d2, B:192:0x02de, B:194:0x02e9, B:196:0x02f3, B:201:0x0308, B:203:0x0313, B:205:0x031e, B:397:0x065f, B:399:0x0663, B:206:0x0323, B:208:0x0327, B:210:0x0337, B:213:0x033d, B:216:0x0345, B:218:0x035d, B:233:0x0380, B:240:0x038b, B:242:0x03aa, B:244:0x03b0, B:251:0x03c6, B:252:0x03ca, B:254:0x03d3, B:256:0x03d9, B:258:0x03df, B:272:0x0405, B:277:0x0422, B:259:0x03e2, B:262:0x03e8, B:263:0x03eb, B:267:0x03f6, B:269:0x03fb, B:276:0x041d, B:273:0x040b, B:274:0x0411, B:275:0x0417, B:278:0x0423, B:280:0x042e, B:283:0x043b, B:282:0x0439, B:286:0x044e, B:287:0x0452, B:290:0x046a, B:284:0x043f, B:285:0x0449, B:198:0x02f7, B:299:0x048b, B:301:0x048f, B:303:0x0493, B:304:0x049b, B:305:0x04a1, B:308:0x04a7, B:311:0x04ac, B:316:0x04b6, B:318:0x04ba, B:320:0x04c9, B:322:0x04cd, B:324:0x04d1, B:326:0x04d5, B:327:0x04de, B:329:0x04ea, B:330:0x04f2, B:332:0x04f9, B:333:0x04fe, B:386:0x061a, B:387:0x061d, B:389:0x062b, B:385:0x060c, B:340:0x052b, B:342:0x053f, B:390:0x062e, B:391:0x0631, B:392:0x0633, B:352:0x0560, B:354:0x056d, B:356:0x0573, B:358:0x0577, B:360:0x0581, B:363:0x058f, B:365:0x0595, B:367:0x0599, B:369:0x059d, B:371:0x05a7, B:383:0x05e8, B:373:0x05b1, B:375:0x05b5, B:376:0x05b8, B:377:0x05c0, B:384:0x0606, B:349:0x0552, B:395:0x0647, B:88:0x0154, B:42:0x00ab, B:44:0x00af, B:46:0x00b3, B:48:0x00b7, B:50:0x00bd, B:51:0x00c0, B:53:0x00c4, B:55:0x00c8, B:57:0x00cc, B:59:0x00d7, B:61:0x00e4, B:67:0x00f1, B:69:0x00f5, B:72:0x00fe, B:74:0x0106, B:76:0x0110, B:77:0x0116, B:70:0x00fb, B:62:0x00e6, B:64:0x00ea, B:80:0x012e, B:82:0x0138, B:83:0x013d, B:400:0x0671, B:79:0x0126, B:401:0x0674, B:20:0x003d, B:22:0x0041, B:23:0x004c, B:25:0x0052, B:27:0x005c, B:29:0x006d, B:34:0x007c), top: B:423:0x0000, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0380 A[Catch: all -> 0x068b, TRY_ENTER, TryCatch #6 {all -> 0x068b, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000c, B:8:0x0010, B:10:0x0015, B:12:0x001d, B:14:0x0023, B:16:0x002d, B:18:0x0033, B:19:0x0037, B:30:0x0072, B:32:0x0076, B:38:0x009b, B:37:0x008f, B:36:0x008a, B:396:0x065e, B:39:0x00a2, B:84:0x0141, B:86:0x0147, B:93:0x015e, B:95:0x0162, B:96:0x0169, B:97:0x0172, B:99:0x017f, B:101:0x0183, B:102:0x0188, B:104:0x018e, B:105:0x0193, B:106:0x0195, B:110:0x01b4, B:109:0x01a7, B:382:0x05e4, B:372:0x05b0, B:394:0x0638, B:111:0x01b9, B:113:0x01bd, B:115:0x01c7, B:117:0x01ce, B:118:0x01d2, B:120:0x01d8, B:122:0x01df, B:125:0x01ee, B:127:0x01fc, B:129:0x0202, B:131:0x0208, B:133:0x020e, B:135:0x0214, B:138:0x021c, B:140:0x0220, B:142:0x0226, B:144:0x022e, B:154:0x024a, B:156:0x024e, B:174:0x029e, B:294:0x0478, B:179:0x02ac, B:181:0x02b0, B:296:0x047c, B:297:0x047f, B:293:0x0476, B:147:0x0237, B:149:0x023d, B:151:0x0241, B:160:0x025c, B:162:0x0260, B:164:0x0264, B:166:0x0282, B:168:0x0288, B:170:0x0294, B:178:0x02a8, B:182:0x02b2, B:184:0x02b6, B:186:0x02bc, B:188:0x02c7, B:190:0x02d2, B:192:0x02de, B:194:0x02e9, B:196:0x02f3, B:201:0x0308, B:203:0x0313, B:205:0x031e, B:397:0x065f, B:399:0x0663, B:206:0x0323, B:208:0x0327, B:210:0x0337, B:213:0x033d, B:216:0x0345, B:218:0x035d, B:233:0x0380, B:240:0x038b, B:242:0x03aa, B:244:0x03b0, B:251:0x03c6, B:252:0x03ca, B:254:0x03d3, B:256:0x03d9, B:258:0x03df, B:272:0x0405, B:277:0x0422, B:259:0x03e2, B:262:0x03e8, B:263:0x03eb, B:267:0x03f6, B:269:0x03fb, B:276:0x041d, B:273:0x040b, B:274:0x0411, B:275:0x0417, B:278:0x0423, B:280:0x042e, B:283:0x043b, B:282:0x0439, B:286:0x044e, B:287:0x0452, B:290:0x046a, B:284:0x043f, B:285:0x0449, B:198:0x02f7, B:299:0x048b, B:301:0x048f, B:303:0x0493, B:304:0x049b, B:305:0x04a1, B:308:0x04a7, B:311:0x04ac, B:316:0x04b6, B:318:0x04ba, B:320:0x04c9, B:322:0x04cd, B:324:0x04d1, B:326:0x04d5, B:327:0x04de, B:329:0x04ea, B:330:0x04f2, B:332:0x04f9, B:333:0x04fe, B:386:0x061a, B:387:0x061d, B:389:0x062b, B:385:0x060c, B:340:0x052b, B:342:0x053f, B:390:0x062e, B:391:0x0631, B:392:0x0633, B:352:0x0560, B:354:0x056d, B:356:0x0573, B:358:0x0577, B:360:0x0581, B:363:0x058f, B:365:0x0595, B:367:0x0599, B:369:0x059d, B:371:0x05a7, B:383:0x05e8, B:373:0x05b1, B:375:0x05b5, B:376:0x05b8, B:377:0x05c0, B:384:0x0606, B:349:0x0552, B:395:0x0647, B:88:0x0154, B:42:0x00ab, B:44:0x00af, B:46:0x00b3, B:48:0x00b7, B:50:0x00bd, B:51:0x00c0, B:53:0x00c4, B:55:0x00c8, B:57:0x00cc, B:59:0x00d7, B:61:0x00e4, B:67:0x00f1, B:69:0x00f5, B:72:0x00fe, B:74:0x0106, B:76:0x0110, B:77:0x0116, B:70:0x00fb, B:62:0x00e6, B:64:0x00ea, B:80:0x012e, B:82:0x0138, B:83:0x013d, B:400:0x0671, B:79:0x0126, B:401:0x0674, B:20:0x003d, B:22:0x0041, B:23:0x004c, B:25:0x0052, B:27:0x005c, B:29:0x006d, B:34:0x007c), top: B:423:0x0000, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03fb A[Catch: ObuParser$NotYetImplementedException -> 0x0370, all -> 0x068b, TryCatch #2 {ObuParser$NotYetImplementedException -> 0x0370, blocks: (B:240:0x038b, B:242:0x03aa, B:244:0x03b0, B:251:0x03c6, B:252:0x03ca, B:254:0x03d3, B:256:0x03d9, B:258:0x03df, B:272:0x0405, B:277:0x0422, B:259:0x03e2, B:262:0x03e8, B:263:0x03eb, B:267:0x03f6, B:269:0x03fb, B:276:0x041d, B:273:0x040b, B:274:0x0411, B:275:0x0417), top: B:417:0x038b }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0468 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x047c A[Catch: all -> 0x068b, TryCatch #6 {all -> 0x068b, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000c, B:8:0x0010, B:10:0x0015, B:12:0x001d, B:14:0x0023, B:16:0x002d, B:18:0x0033, B:19:0x0037, B:30:0x0072, B:32:0x0076, B:38:0x009b, B:37:0x008f, B:36:0x008a, B:396:0x065e, B:39:0x00a2, B:84:0x0141, B:86:0x0147, B:93:0x015e, B:95:0x0162, B:96:0x0169, B:97:0x0172, B:99:0x017f, B:101:0x0183, B:102:0x0188, B:104:0x018e, B:105:0x0193, B:106:0x0195, B:110:0x01b4, B:109:0x01a7, B:382:0x05e4, B:372:0x05b0, B:394:0x0638, B:111:0x01b9, B:113:0x01bd, B:115:0x01c7, B:117:0x01ce, B:118:0x01d2, B:120:0x01d8, B:122:0x01df, B:125:0x01ee, B:127:0x01fc, B:129:0x0202, B:131:0x0208, B:133:0x020e, B:135:0x0214, B:138:0x021c, B:140:0x0220, B:142:0x0226, B:144:0x022e, B:154:0x024a, B:156:0x024e, B:174:0x029e, B:294:0x0478, B:179:0x02ac, B:181:0x02b0, B:296:0x047c, B:297:0x047f, B:293:0x0476, B:147:0x0237, B:149:0x023d, B:151:0x0241, B:160:0x025c, B:162:0x0260, B:164:0x0264, B:166:0x0282, B:168:0x0288, B:170:0x0294, B:178:0x02a8, B:182:0x02b2, B:184:0x02b6, B:186:0x02bc, B:188:0x02c7, B:190:0x02d2, B:192:0x02de, B:194:0x02e9, B:196:0x02f3, B:201:0x0308, B:203:0x0313, B:205:0x031e, B:397:0x065f, B:399:0x0663, B:206:0x0323, B:208:0x0327, B:210:0x0337, B:213:0x033d, B:216:0x0345, B:218:0x035d, B:233:0x0380, B:240:0x038b, B:242:0x03aa, B:244:0x03b0, B:251:0x03c6, B:252:0x03ca, B:254:0x03d3, B:256:0x03d9, B:258:0x03df, B:272:0x0405, B:277:0x0422, B:259:0x03e2, B:262:0x03e8, B:263:0x03eb, B:267:0x03f6, B:269:0x03fb, B:276:0x041d, B:273:0x040b, B:274:0x0411, B:275:0x0417, B:278:0x0423, B:280:0x042e, B:283:0x043b, B:282:0x0439, B:286:0x044e, B:287:0x0452, B:290:0x046a, B:284:0x043f, B:285:0x0449, B:198:0x02f7, B:299:0x048b, B:301:0x048f, B:303:0x0493, B:304:0x049b, B:305:0x04a1, B:308:0x04a7, B:311:0x04ac, B:316:0x04b6, B:318:0x04ba, B:320:0x04c9, B:322:0x04cd, B:324:0x04d1, B:326:0x04d5, B:327:0x04de, B:329:0x04ea, B:330:0x04f2, B:332:0x04f9, B:333:0x04fe, B:386:0x061a, B:387:0x061d, B:389:0x062b, B:385:0x060c, B:340:0x052b, B:342:0x053f, B:390:0x062e, B:391:0x0631, B:392:0x0633, B:352:0x0560, B:354:0x056d, B:356:0x0573, B:358:0x0577, B:360:0x0581, B:363:0x058f, B:365:0x0595, B:367:0x0599, B:369:0x059d, B:371:0x05a7, B:383:0x05e8, B:373:0x05b1, B:375:0x05b5, B:376:0x05b8, B:377:0x05c0, B:384:0x0606, B:349:0x0552, B:395:0x0647, B:88:0x0154, B:42:0x00ab, B:44:0x00af, B:46:0x00b3, B:48:0x00b7, B:50:0x00bd, B:51:0x00c0, B:53:0x00c4, B:55:0x00c8, B:57:0x00cc, B:59:0x00d7, B:61:0x00e4, B:67:0x00f1, B:69:0x00f5, B:72:0x00fe, B:74:0x0106, B:76:0x0110, B:77:0x0116, B:70:0x00fb, B:62:0x00e6, B:64:0x00ea, B:80:0x012e, B:82:0x0138, B:83:0x013d, B:400:0x0671, B:79:0x0126, B:401:0x0674, B:20:0x003d, B:22:0x0041, B:23:0x004c, B:25:0x0052, B:27:0x005c, B:29:0x006d, B:34:0x007c), top: B:423:0x0000, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x048f A[Catch: all -> 0x068b, TryCatch #6 {all -> 0x068b, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000c, B:8:0x0010, B:10:0x0015, B:12:0x001d, B:14:0x0023, B:16:0x002d, B:18:0x0033, B:19:0x0037, B:30:0x0072, B:32:0x0076, B:38:0x009b, B:37:0x008f, B:36:0x008a, B:396:0x065e, B:39:0x00a2, B:84:0x0141, B:86:0x0147, B:93:0x015e, B:95:0x0162, B:96:0x0169, B:97:0x0172, B:99:0x017f, B:101:0x0183, B:102:0x0188, B:104:0x018e, B:105:0x0193, B:106:0x0195, B:110:0x01b4, B:109:0x01a7, B:382:0x05e4, B:372:0x05b0, B:394:0x0638, B:111:0x01b9, B:113:0x01bd, B:115:0x01c7, B:117:0x01ce, B:118:0x01d2, B:120:0x01d8, B:122:0x01df, B:125:0x01ee, B:127:0x01fc, B:129:0x0202, B:131:0x0208, B:133:0x020e, B:135:0x0214, B:138:0x021c, B:140:0x0220, B:142:0x0226, B:144:0x022e, B:154:0x024a, B:156:0x024e, B:174:0x029e, B:294:0x0478, B:179:0x02ac, B:181:0x02b0, B:296:0x047c, B:297:0x047f, B:293:0x0476, B:147:0x0237, B:149:0x023d, B:151:0x0241, B:160:0x025c, B:162:0x0260, B:164:0x0264, B:166:0x0282, B:168:0x0288, B:170:0x0294, B:178:0x02a8, B:182:0x02b2, B:184:0x02b6, B:186:0x02bc, B:188:0x02c7, B:190:0x02d2, B:192:0x02de, B:194:0x02e9, B:196:0x02f3, B:201:0x0308, B:203:0x0313, B:205:0x031e, B:397:0x065f, B:399:0x0663, B:206:0x0323, B:208:0x0327, B:210:0x0337, B:213:0x033d, B:216:0x0345, B:218:0x035d, B:233:0x0380, B:240:0x038b, B:242:0x03aa, B:244:0x03b0, B:251:0x03c6, B:252:0x03ca, B:254:0x03d3, B:256:0x03d9, B:258:0x03df, B:272:0x0405, B:277:0x0422, B:259:0x03e2, B:262:0x03e8, B:263:0x03eb, B:267:0x03f6, B:269:0x03fb, B:276:0x041d, B:273:0x040b, B:274:0x0411, B:275:0x0417, B:278:0x0423, B:280:0x042e, B:283:0x043b, B:282:0x0439, B:286:0x044e, B:287:0x0452, B:290:0x046a, B:284:0x043f, B:285:0x0449, B:198:0x02f7, B:299:0x048b, B:301:0x048f, B:303:0x0493, B:304:0x049b, B:305:0x04a1, B:308:0x04a7, B:311:0x04ac, B:316:0x04b6, B:318:0x04ba, B:320:0x04c9, B:322:0x04cd, B:324:0x04d1, B:326:0x04d5, B:327:0x04de, B:329:0x04ea, B:330:0x04f2, B:332:0x04f9, B:333:0x04fe, B:386:0x061a, B:387:0x061d, B:389:0x062b, B:385:0x060c, B:340:0x052b, B:342:0x053f, B:390:0x062e, B:391:0x0631, B:392:0x0633, B:352:0x0560, B:354:0x056d, B:356:0x0573, B:358:0x0577, B:360:0x0581, B:363:0x058f, B:365:0x0595, B:367:0x0599, B:369:0x059d, B:371:0x05a7, B:383:0x05e8, B:373:0x05b1, B:375:0x05b5, B:376:0x05b8, B:377:0x05c0, B:384:0x0606, B:349:0x0552, B:395:0x0647, B:88:0x0154, B:42:0x00ab, B:44:0x00af, B:46:0x00b3, B:48:0x00b7, B:50:0x00bd, B:51:0x00c0, B:53:0x00c4, B:55:0x00c8, B:57:0x00cc, B:59:0x00d7, B:61:0x00e4, B:67:0x00f1, B:69:0x00f5, B:72:0x00fe, B:74:0x0106, B:76:0x0110, B:77:0x0116, B:70:0x00fb, B:62:0x00e6, B:64:0x00ea, B:80:0x012e, B:82:0x0138, B:83:0x013d, B:400:0x0671, B:79:0x0126, B:401:0x0674, B:20:0x003d, B:22:0x0041, B:23:0x004c, B:25:0x0052, B:27:0x005c, B:29:0x006d, B:34:0x007c), top: B:423:0x0000, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04ba A[Catch: CryptoException -> 0x0637, all -> 0x068b, TRY_ENTER, TryCatch #5 {CryptoException -> 0x0637, blocks: (B:105:0x0193, B:110:0x01b4, B:109:0x01a7, B:382:0x05e4, B:372:0x05b0, B:318:0x04ba, B:320:0x04c9, B:322:0x04cd, B:324:0x04d1, B:326:0x04d5, B:327:0x04de, B:329:0x04ea, B:330:0x04f2, B:332:0x04f9, B:386:0x061a, B:387:0x061d, B:389:0x062b, B:385:0x060c, B:340:0x052b, B:342:0x053f, B:390:0x062e, B:391:0x0631, B:392:0x0633, B:352:0x0560, B:354:0x056d, B:356:0x0573, B:358:0x0577, B:360:0x0581, B:363:0x058f, B:365:0x0595, B:367:0x0599, B:369:0x059d, B:371:0x05a7, B:383:0x05e8, B:373:0x05b1, B:375:0x05b5, B:376:0x05b8, B:384:0x0606, B:349:0x0552), top: B:416:0x017d, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[Catch: all -> 0x068b, TryCatch #6 {all -> 0x068b, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000c, B:8:0x0010, B:10:0x0015, B:12:0x001d, B:14:0x0023, B:16:0x002d, B:18:0x0033, B:19:0x0037, B:30:0x0072, B:32:0x0076, B:38:0x009b, B:37:0x008f, B:36:0x008a, B:396:0x065e, B:39:0x00a2, B:84:0x0141, B:86:0x0147, B:93:0x015e, B:95:0x0162, B:96:0x0169, B:97:0x0172, B:99:0x017f, B:101:0x0183, B:102:0x0188, B:104:0x018e, B:105:0x0193, B:106:0x0195, B:110:0x01b4, B:109:0x01a7, B:382:0x05e4, B:372:0x05b0, B:394:0x0638, B:111:0x01b9, B:113:0x01bd, B:115:0x01c7, B:117:0x01ce, B:118:0x01d2, B:120:0x01d8, B:122:0x01df, B:125:0x01ee, B:127:0x01fc, B:129:0x0202, B:131:0x0208, B:133:0x020e, B:135:0x0214, B:138:0x021c, B:140:0x0220, B:142:0x0226, B:144:0x022e, B:154:0x024a, B:156:0x024e, B:174:0x029e, B:294:0x0478, B:179:0x02ac, B:181:0x02b0, B:296:0x047c, B:297:0x047f, B:293:0x0476, B:147:0x0237, B:149:0x023d, B:151:0x0241, B:160:0x025c, B:162:0x0260, B:164:0x0264, B:166:0x0282, B:168:0x0288, B:170:0x0294, B:178:0x02a8, B:182:0x02b2, B:184:0x02b6, B:186:0x02bc, B:188:0x02c7, B:190:0x02d2, B:192:0x02de, B:194:0x02e9, B:196:0x02f3, B:201:0x0308, B:203:0x0313, B:205:0x031e, B:397:0x065f, B:399:0x0663, B:206:0x0323, B:208:0x0327, B:210:0x0337, B:213:0x033d, B:216:0x0345, B:218:0x035d, B:233:0x0380, B:240:0x038b, B:242:0x03aa, B:244:0x03b0, B:251:0x03c6, B:252:0x03ca, B:254:0x03d3, B:256:0x03d9, B:258:0x03df, B:272:0x0405, B:277:0x0422, B:259:0x03e2, B:262:0x03e8, B:263:0x03eb, B:267:0x03f6, B:269:0x03fb, B:276:0x041d, B:273:0x040b, B:274:0x0411, B:275:0x0417, B:278:0x0423, B:280:0x042e, B:283:0x043b, B:282:0x0439, B:286:0x044e, B:287:0x0452, B:290:0x046a, B:284:0x043f, B:285:0x0449, B:198:0x02f7, B:299:0x048b, B:301:0x048f, B:303:0x0493, B:304:0x049b, B:305:0x04a1, B:308:0x04a7, B:311:0x04ac, B:316:0x04b6, B:318:0x04ba, B:320:0x04c9, B:322:0x04cd, B:324:0x04d1, B:326:0x04d5, B:327:0x04de, B:329:0x04ea, B:330:0x04f2, B:332:0x04f9, B:333:0x04fe, B:386:0x061a, B:387:0x061d, B:389:0x062b, B:385:0x060c, B:340:0x052b, B:342:0x053f, B:390:0x062e, B:391:0x0631, B:392:0x0633, B:352:0x0560, B:354:0x056d, B:356:0x0573, B:358:0x0577, B:360:0x0581, B:363:0x058f, B:365:0x0595, B:367:0x0599, B:369:0x059d, B:371:0x05a7, B:383:0x05e8, B:373:0x05b1, B:375:0x05b5, B:376:0x05b8, B:377:0x05c0, B:384:0x0606, B:349:0x0552, B:395:0x0647, B:88:0x0154, B:42:0x00ab, B:44:0x00af, B:46:0x00b3, B:48:0x00b7, B:50:0x00bd, B:51:0x00c0, B:53:0x00c4, B:55:0x00c8, B:57:0x00cc, B:59:0x00d7, B:61:0x00e4, B:67:0x00f1, B:69:0x00f5, B:72:0x00fe, B:74:0x0106, B:76:0x0110, B:77:0x0116, B:70:0x00fb, B:62:0x00e6, B:64:0x00ea, B:80:0x012e, B:82:0x0138, B:83:0x013d, B:400:0x0671, B:79:0x0126, B:401:0x0674, B:20:0x003d, B:22:0x0041, B:23:0x004c, B:25:0x0052, B:27:0x005c, B:29:0x006d, B:34:0x007c), top: B:423:0x0000, inners: #0, #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2 A[Catch: all -> 0x068b, TryCatch #6 {all -> 0x068b, blocks: (B:2:0x0000, B:4:0x0007, B:6:0x000c, B:8:0x0010, B:10:0x0015, B:12:0x001d, B:14:0x0023, B:16:0x002d, B:18:0x0033, B:19:0x0037, B:30:0x0072, B:32:0x0076, B:38:0x009b, B:37:0x008f, B:36:0x008a, B:396:0x065e, B:39:0x00a2, B:84:0x0141, B:86:0x0147, B:93:0x015e, B:95:0x0162, B:96:0x0169, B:97:0x0172, B:99:0x017f, B:101:0x0183, B:102:0x0188, B:104:0x018e, B:105:0x0193, B:106:0x0195, B:110:0x01b4, B:109:0x01a7, B:382:0x05e4, B:372:0x05b0, B:394:0x0638, B:111:0x01b9, B:113:0x01bd, B:115:0x01c7, B:117:0x01ce, B:118:0x01d2, B:120:0x01d8, B:122:0x01df, B:125:0x01ee, B:127:0x01fc, B:129:0x0202, B:131:0x0208, B:133:0x020e, B:135:0x0214, B:138:0x021c, B:140:0x0220, B:142:0x0226, B:144:0x022e, B:154:0x024a, B:156:0x024e, B:174:0x029e, B:294:0x0478, B:179:0x02ac, B:181:0x02b0, B:296:0x047c, B:297:0x047f, B:293:0x0476, B:147:0x0237, B:149:0x023d, B:151:0x0241, B:160:0x025c, B:162:0x0260, B:164:0x0264, B:166:0x0282, B:168:0x0288, B:170:0x0294, B:178:0x02a8, B:182:0x02b2, B:184:0x02b6, B:186:0x02bc, B:188:0x02c7, B:190:0x02d2, B:192:0x02de, B:194:0x02e9, B:196:0x02f3, B:201:0x0308, B:203:0x0313, B:205:0x031e, B:397:0x065f, B:399:0x0663, B:206:0x0323, B:208:0x0327, B:210:0x0337, B:213:0x033d, B:216:0x0345, B:218:0x035d, B:233:0x0380, B:240:0x038b, B:242:0x03aa, B:244:0x03b0, B:251:0x03c6, B:252:0x03ca, B:254:0x03d3, B:256:0x03d9, B:258:0x03df, B:272:0x0405, B:277:0x0422, B:259:0x03e2, B:262:0x03e8, B:263:0x03eb, B:267:0x03f6, B:269:0x03fb, B:276:0x041d, B:273:0x040b, B:274:0x0411, B:275:0x0417, B:278:0x0423, B:280:0x042e, B:283:0x043b, B:282:0x0439, B:286:0x044e, B:287:0x0452, B:290:0x046a, B:284:0x043f, B:285:0x0449, B:198:0x02f7, B:299:0x048b, B:301:0x048f, B:303:0x0493, B:304:0x049b, B:305:0x04a1, B:308:0x04a7, B:311:0x04ac, B:316:0x04b6, B:318:0x04ba, B:320:0x04c9, B:322:0x04cd, B:324:0x04d1, B:326:0x04d5, B:327:0x04de, B:329:0x04ea, B:330:0x04f2, B:332:0x04f9, B:333:0x04fe, B:386:0x061a, B:387:0x061d, B:389:0x062b, B:385:0x060c, B:340:0x052b, B:342:0x053f, B:390:0x062e, B:391:0x0631, B:392:0x0633, B:352:0x0560, B:354:0x056d, B:356:0x0573, B:358:0x0577, B:360:0x0581, B:363:0x058f, B:365:0x0595, B:367:0x0599, B:369:0x059d, B:371:0x05a7, B:383:0x05e8, B:373:0x05b1, B:375:0x05b5, B:376:0x05b8, B:377:0x05c0, B:384:0x0606, B:349:0x0552, B:395:0x0647, B:88:0x0154, B:42:0x00ab, B:44:0x00af, B:46:0x00b3, B:48:0x00b7, B:50:0x00bd, B:51:0x00c0, B:53:0x00c4, B:55:0x00c8, B:57:0x00cc, B:59:0x00d7, B:61:0x00e4, B:67:0x00f1, B:69:0x00f5, B:72:0x00fe, B:74:0x0106, B:76:0x0110, B:77:0x0116, B:70:0x00fb, B:62:0x00e6, B:64:0x00ea, B:80:0x012e, B:82:0x0138, B:83:0x013d, B:400:0x0671, B:79:0x0126, B:401:0x0674, B:20:0x003d, B:22:0x0041, B:23:0x004c, B:25:0x0052, B:27:0x005c, B:29:0x006d, B:34:0x007c), top: B:423:0x0000, inners: #0, #3, #5 }] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0C() throws androidx.media3.exoplayer.ExoPlaybackException, androidx.media3.container.ObuParser$NotYetImplementedException {
        /*
            Method dump skipped, instructions count: 1694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6147Dwp.A0C():boolean");
    }

    private boolean A0D(int i) throws ExoPlaybackException {
        C5406Dhz c5406Dhz = super.A0G;
        c5406Dhz.A01 = null;
        c5406Dhz.A00 = null;
        Di2 di2 = this.A15;
        di2.A02();
        int iA0T = A0T(di2, c5406Dhz, i | 4);
        if (iA0T == -5) {
            A0j(c5406Dhz.A00);
            return true;
        }
        if (iA0T != -4 || !AbstractC5364DhG.A00(di2)) {
            return false;
        }
        this.A0V = true;
        A05();
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018b, code lost:
    
        if (r1 == false) goto L70;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0E(long r23, long r25) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6147Dwp.A0E(long, long):boolean");
    }

    private final float A0b(C6154Dwx c6154Dwx, C6154Dwx[] c6154DwxArr, float f) {
        C6153Dwv c6153Dwv;
        float f2;
        if (!(this instanceof C6150Dws)) {
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
            return iMax * f;
        }
        C6150Dws c6150Dws = (C6150Dws) this;
        float fMax = -1.0f;
        for (C6154Dwx c6154Dwx3 : c6154DwxArr) {
            float f3 = c6154Dwx3.A01;
            if (f3 != -1.0f) {
                fMax = Math.max(fMax, f3);
            }
        }
        float f4 = fMax == -1.0f ? -1.0f : fMax * f;
        if (c6150Dws.A0S == null || (c6153Dwv = ((AbstractC6147Dwp) c6150Dws).A0O) == null) {
            return f4;
        }
        int i2 = c6154Dwx.A0Q;
        int i3 = c6154Dwx.A0D;
        if (c6153Dwv.A0A) {
            f2 = c6153Dwv.A00;
            if (f2 == -3.4028235E38f || c6153Dwv.A02 != i2 || c6153Dwv.A01 != i3) {
                float f5 = 1024.0f;
                if (!c6153Dwv.A07(i2, i3, 1024.0d)) {
                    f2 = 0.0f;
                    while (true) {
                        float f6 = f5 - f2;
                        if (Math.abs(f6) <= 5.0f) {
                            break;
                        }
                        float f7 = (f6 / 2.0f) + f2;
                        if (c6153Dwv.A07(i2, i3, f7)) {
                            f2 = f7;
                        } else {
                            f5 = f7;
                        }
                    }
                } else {
                    f2 = 1024.0f;
                }
                c6153Dwv.A00 = f2;
                c6153Dwv.A02 = i2;
                c6153Dwv.A01 = i3;
            }
        } else {
            f2 = -3.4028235E38f;
        }
        return f4 != -1.0f ? Math.max(f4, f2) : f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Incorrect types in method signature: (LX/BVg;LX/Dwx;Z)Ljava/util/List<LX/Dwv;>; */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List A0c(X.C6154Dwx r8, X.InterfaceC2356BVg r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C6150Dws
            r3 = r8
            r4 = r9
            r5 = r10
            if (r0 == 0) goto L21
            X.Dws r7 = (X.C6150Dws) r7
            boolean r0 = X.C6155Dwy.A06(r8)
            if (r0 == 0) goto L42
            boolean r6 = r7.A0m
            boolean r0 = r7.A0Z
            if (r0 == 0) goto L1a
            boolean r0 = r7.A0W
            r7 = 1
            if (r0 == 0) goto L1b
        L1a:
            r7 = 0
        L1b:
            r8 = 0
            com.google.common.collect.ImmutableList r0 = X.C6155Dwy.A02(r3, r4, r5, r6, r7, r8)
            return r0
        L21:
            X.Dx0 r7 = (X.C6157Dx0) r7
            java.lang.String r2 = r8.A0b
            if (r2 == 0) goto L46
            java.lang.String r1 = "audio/raw"
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L49
            X.DzP r0 = r7.A0J
            boolean r0 = r0.Agg(r8)
            if (r0 == 0) goto L49
            X.Dwv r0 = X.C6155Dwy.A05(r1)
            if (r0 == 0) goto L49
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
        L42:
            java.lang.String r2 = r8.A0b
            if (r2 != 0) goto L49
        L46:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        L49:
            r0 = 0
            java.util.List r0 = r9.AEg(r2, r10, r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6147Dwp.A0c(X.Dwx, X.BVg, boolean):java.util.List");
    }

    private final void A0d() throws ExoPlaybackException {
        if (this instanceof C6157Dx0) {
            C6157Dx0 c6157Dx0 = (C6157Dx0) this;
            try {
                c6157Dx0.A0J.AXz();
                long j = ((AbstractC6147Dwp) c6157Dx0).A0A;
                if (j != -9223372036854775807L) {
                    c6157Dx0.A04 = j;
                }
            } catch (AudioSink$WriteException e) {
                throw c6157Dx0.A0U(e.format, e, 5002, e.isRecoverable);
            }
        }
    }

    @Override // X.AbstractC6146Dwo
    public void A0W() {
        if (!this.A19) {
            if (this.A1C) {
                A0f();
                return;
            }
            return;
        }
        try {
            A0f();
            try {
                InterfaceC5547DkP interfaceC5547DkP = this.A0H;
                if (interfaceC5547DkP != null) {
                    interfaceC5547DkP.Aa8(null);
                }
                try {
                    A0B(this);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    A0B(this);
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                InterfaceC5547DkP interfaceC5547DkP2 = this.A0H;
                if (interfaceC5547DkP2 != null) {
                    interfaceC5547DkP2.Aa8(null);
                }
                try {
                    A0B(this);
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    A0B(this);
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // X.AbstractC6146Dwo
    public void A0Y(long j, boolean z) {
        Dy3 dy3 = this.A0q;
        dy3.A01 = dy3.A00;
        dy3.A00 = false;
        dy3.A02 = false;
        dy3.A03.clear();
        this.A0V = false;
        this.A0X = false;
        this.A0C = -9223372036854775807L;
        if (this.A0N != null) {
            A0e();
        }
        synchronized (this.A0Q.A00) {
        }
        this.A0Q.A00.A00();
        this.A18.clear();
    }

    @Override // X.AbstractC6146Dwo
    public void A0a(boolean z, boolean z2) {
        this.A0G = new C6173DxG();
        this.A0B = 0L;
        this.A0q.A00 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2 A[PHI: r11
  0x00b2: PHI (r11v1 java.util.List<X.Dwv>) = 
  (r11v0 java.util.List<X.Dwv>)
  (r11v2 java.util.List<X.Dwv>)
  (r11v2 java.util.List<X.Dwv>)
  (r11v2 java.util.List<X.Dwv>)
  (r11v2 java.util.List<X.Dwv>)
  (r11v2 java.util.List<X.Dwv>)
 binds: [B:21:0x0053, B:29:0x008d, B:31:0x0091, B:33:0x0099, B:35:0x00aa, B:37:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd A[Catch: MediaCodecUtil$DecoderQueryException -> 0x00e5, MediaCodecRenderer$DecoderInitializationException -> 0x026d, TryCatch #4 {MediaCodecUtil$DecoderQueryException -> 0x00e5, blocks: (B:20:0x0045, B:22:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x0089, B:30:0x008f, B:32:0x0093, B:34:0x009b, B:36:0x00ac, B:39:0x00b3, B:41:0x00b9, B:43:0x00c1, B:44:0x00c8, B:45:0x00c9, B:47:0x00cd, B:48:0x00d2, B:49:0x00d7), top: B:153:0x0045, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7 A[Catch: MediaCodecUtil$DecoderQueryException -> 0x00e5, MediaCodecRenderer$DecoderInitializationException -> 0x026d, TRY_LEAVE, TryCatch #4 {MediaCodecUtil$DecoderQueryException -> 0x00e5, blocks: (B:20:0x0045, B:22:0x0055, B:25:0x005d, B:27:0x0069, B:28:0x0089, B:30:0x008f, B:32:0x0093, B:34:0x009b, B:36:0x00ac, B:39:0x00b3, B:41:0x00b9, B:43:0x00c1, B:44:0x00c8, B:45:0x00c9, B:47:0x00cd, B:48:0x00d2, B:49:0x00d7), top: B:153:0x0045, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0g() {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6147Dwp.A0g():void");
    }

    public final void A0h() {
        C6154Dwx c6154Dwx = this.A0E;
        if (this.A0N == null || this.A04 != 0 || super.A01 == 0) {
            return;
        }
        float f = this.A02;
        c6154Dwx.getClass();
        C6154Dwx[] c6154DwxArr = super.A0C;
        c6154DwxArr.getClass();
        float fA0b = A0b(c6154Dwx, c6154DwxArr, f);
        float f2 = this.A00;
        if (f2 != fA0b) {
            if (fA0b == -1.0f) {
                this.A0M = null;
                if (this.A0S) {
                    this.A04 = 1;
                    return;
                } else {
                    A0f();
                    A0g();
                    return;
                }
            }
            if (f2 != -1.0f || fA0b > this.A0k) {
                Bundle bundleA0N = BV6.A0N();
                bundleA0N.putFloat("operating-rate", fA0b);
                InterfaceC6181DxP interfaceC6181DxP = this.A0N;
                interfaceC6181DxP.getClass();
                interfaceC6181DxP.setParameters(bundleA0N);
                this.A00 = fA0b;
            }
        }
    }

    public final boolean A0l() {
        C6154Dwx c6154Dwx = this.A0F;
        if (c6154Dwx == null || !BV6.A1W(c6154Dwx, "video/dolby-vision") || !"meta.dav1d.av1.decoder".equals(this.A0K) || !AbstractC5653Dmh.A03(EnumC5618Dlz.A0z)) {
            this.A0f = null;
            C6154Dwx c6154Dwx2 = this.A0F;
            return c6154Dwx2 != null && this.A0Z && "video/av01".equalsIgnoreCase(c6154Dwx2.A0b);
        }
        C6154Dwx c6154Dwx3 = this.A0f;
        C6154Dwx c6154Dwx4 = this.A0F;
        if (c6154Dwx3 != c6154Dwx4) {
            this.A0f = c6154Dwx4;
            this.A0g = C6155Dwy.A07(c6154Dwx4, this.A0K);
        }
        return this.A0g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean A0m(ByteBuffer byteBuffer, InterfaceC6185DxT interfaceC6185DxT, int i, int i2, long j, long j2, long j3, boolean z, boolean z2) throws ExoPlaybackException {
        C6154Dwx c6154Dwx;
        boolean z3;
        int i3;
        AudioSink$WriteException audioSink$WriteException;
        C6157Dx0 c6157Dx0 = (C6157Dx0) this;
        c6157Dx0.A04 = -9223372036854775807L;
        if (c6157Dx0.A0C && (i2 & 2) != 0) {
            interfaceC6185DxT.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            interfaceC6185DxT.releaseOutputBuffer(i, false);
            ((AbstractC6147Dwp) c6157Dx0).A0G.A0E++;
            c6157Dx0.A0J.AN3();
            return true;
        }
        if (c6157Dx0.A0L) {
            C6154Dwx c6154Dwx2 = c6157Dx0.A07;
            if ((!BV6.A1W(c6154Dwx2, "audio/raw") || c6154Dwx2.A0H == 2) && i2 == 0 && c6157Dx0.A03 > 0 && byteBuffer.limit() - byteBuffer.position() >= 12) {
                int iPosition = byteBuffer.position();
                int iLimit = byteBuffer.limit();
                byteBuffer.position(10);
                short s = byteBuffer.getShort();
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                int iLimit2 = c6157Dx0.A01 + (byteBuffer.limit() - byteBuffer.position());
                c6157Dx0.A01 = iLimit2;
                int i4 = c6157Dx0.A02 + 1;
                c6157Dx0.A02 = i4;
                long jAbs = c6157Dx0.A05 + Math.abs((int) s);
                c6157Dx0.A05 = jAbs;
                if (iLimit2 >= c6157Dx0.A03 * 2) {
                    C6259DzA c6259DzA = c6157Dx0.A0I;
                    int i5 = (int) (jAbs / i4);
                    HeroExoPlayer2EventListener heroExoPlayer2EventListener = c6259DzA.A01;
                    Handler handler = c6259DzA.A00;
                    if (handler != null && heroExoPlayer2EventListener != null) {
                        handler.post(new RunnableC6263DzE(heroExoPlayer2EventListener, i5));
                    }
                    c6157Dx0.A01 = 0;
                    c6157Dx0.A02 = 0;
                    c6157Dx0.A05 = 0L;
                }
            }
        }
        if (c6157Dx0.A0K && byteBuffer.limit() > byteBuffer.position()) {
            int iPosition2 = byteBuffer.position();
            int iLimit3 = byteBuffer.limit();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iLimit3 - iPosition2);
            byteBufferAllocate.put(byteBuffer);
            byteBufferAllocate.flip();
            byteBuffer.position(iPosition2);
            byteBuffer.limit(iLimit3);
            C6259DzA c6259DzA2 = c6157Dx0.A0I;
            byte[] bArrArray = byteBufferAllocate.array();
            long jA04 = BV4.A04(j3);
            HeroExoPlayer2EventListener heroExoPlayer2EventListener2 = c6259DzA2.A01;
            Handler handler2 = c6259DzA2.A00;
            if (handler2 != null && heroExoPlayer2EventListener2 != null) {
                handler2.post(new Dz6(heroExoPlayer2EventListener2, bArrArray, jA04));
            }
        }
        try {
            if (!c6157Dx0.A0J.AN2(byteBuffer, 1, j3)) {
                c6157Dx0.A04 = j3;
                return false;
            }
            interfaceC6185DxT.releaseOutputBuffer(i, false);
            ((AbstractC6147Dwp) c6157Dx0).A0G.A0C++;
            return true;
        } catch (AudioSink$InitializationException e) {
            c6154Dwx = c6157Dx0.A07;
            z3 = e.isRecoverable;
            i3 = 5001;
            audioSink$WriteException = e;
            throw c6157Dx0.A0U(c6154Dwx, audioSink$WriteException, i3, z3);
        } catch (AudioSink$WriteException e2) {
            c6154Dwx = ((AbstractC6147Dwp) c6157Dx0).A0F;
            z3 = e2.isRecoverable;
            i3 = 5002;
            audioSink$WriteException = e2;
            throw c6157Dx0.A0U(c6154Dwx, audioSink$WriteException, i3, z3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x013c, code lost:
    
        if (r10 != false) goto L90;
     */
    @Override // X.InterfaceC6068Dv6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Aaz(long r12, long r14) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6147Dwp.Aaz(long, long):void");
    }

    @Override // X.AbstractC6146Dwo, X.InterfaceC6068Dv6
    public void Ae2(float f, float f2) {
        this.A01 = f;
        this.A02 = f2;
        if (!this.A0s || this.A0N == null) {
            return;
        }
        A0h();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2 A[PHI: r3
  0x00e2: PHI (r3v2 boolean) = (r3v1 boolean), (r3v0 boolean), (r3v0 boolean) binds: [B:61:0x00e0, B:59:0x00d7, B:55:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7 A[PHI: r0
  0x00e7: PHI (r0v15 int) = (r0v10 int), (r0v16 int) binds: [B:61:0x00e0, B:63:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC5921Ds8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Agf(X.C6154Dwx r11) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6147Dwp.Agf(X.Dwx):int");
    }

    @Override // X.InterfaceC6068Dv6
    public boolean isReady() {
        Integer num;
        if (this.A0F == null) {
            num = C79.A01;
        } else {
            if (!this.A0b) {
                if (!A0V() && this.A07 < 0) {
                    num = C79.A0K;
                }
                if (this.A0F == null && !this.A0b) {
                    if (A0V() || this.A07 >= 0) {
                        return true;
                    }
                    long j = this.A0d;
                    return j != -9223372036854775807L && SystemClock.elapsedRealtime() < j;
                }
            }
            num = C79.A0C;
        }
        this.A0J = num;
        return this.A0F == null ? false : false;
    }

    public AbstractC6147Dwp(InterfaceC5460Div interfaceC5460Div, BVV bvv, C6175DxI c6175DxI, InterfaceC2356BVg interfaceC2356BVg, float f, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(i);
        this.A0e = -9223372036854775807L;
        this.A08 = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0Z = false;
        this.A0W = false;
        this.A0J = C79.A00;
        this.A0p = c6175DxI;
        this.A0o = bvv;
        C2386BYm c2386BYm = i == 2 ? bvv.A01 : C2386BYm.A02;
        this.A17 = c2386BYm;
        this.A11 = AnonymousClass006.A1Z(c2386BYm, C2386BYm.A02);
        this.A0r = interfaceC2356BVg;
        this.A16 = interfaceC5460Div;
        this.A10 = z;
        this.A0t = z2;
        this.A0k = f;
        this.A0s = z3;
        this.A12 = i2;
        this.A0l = i3;
        boolean zA03 = AbstractC5653Dmh.A03(EnumC5618Dlz.A1M);
        this.A0u = zA03;
        this.A0q = new Dy3(super.A0I, AbstractC5653Dmh.A03(EnumC5618Dlz.A23));
        this.A0v = AbstractC5653Dmh.A03(EnumC5618Dlz.A13);
        this.A0z = AbstractC5653Dmh.A03(EnumC5618Dlz.A21);
        this.A0w = !zA03 && i == 2 && AbstractC5653Dmh.A03(EnumC5618Dlz.A14);
        this.A13 = AbstractC5653Dmh.A00(EnumC5679DnI.A05);
        this.A0m = new Di2(zA03 ? 1 : 0);
        this.A15 = new Di2(0);
        this.A0n = new C5406Dhz();
        this.A14 = new MediaCodec.BufferInfo();
        this.A01 = 1.0f;
        this.A02 = 1.0f;
        this.A18 = BV4.A0s();
        this.A0Q = C6254Dyx.A01;
        this.A00 = -1.0f;
        this.A03 = 0;
        this.A04 = 0;
        this.A09 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A1C = AbstractC5653Dmh.A03(EnumC5618Dlz.A2a);
        this.A1D = AbstractC5653Dmh.A03(EnumC5618Dlz.A2G);
        this.A1B = AbstractC5653Dmh.A03(EnumC5618Dlz.A1g);
        this.A0y = AbstractC5653Dmh.A03(EnumC5618Dlz.A1L);
        this.A0x = AbstractC5653Dmh.A03(EnumC5618Dlz.A16);
        this.A19 = AbstractC5653Dmh.A03(EnumC5618Dlz.A1R);
        this.A1A = AbstractC5653Dmh.A03(EnumC5618Dlz.A1c);
    }

    private void A06() {
        A07();
        this.A07 = -1;
        this.A0L = null;
        this.A0d = -9223372036854775807L;
        this.A0S = false;
        this.A0i = false;
        this.A0j = false;
        this.A0q.A03.clear();
        this.A09 = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0a = true;
        this.A0b = false;
        this.A03 = this.A0h ? 1 : 0;
    }

    public void A0i(long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0e() {
        /*
            r8 = this;
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A0d = r1
            r8.A07()
            r0 = -1
            r8.A07 = r0
            r0 = 0
            r8.A0L = r0
            r5 = 1
            r8.A0a = r5
            r6 = 0
            r8.A0b = r6
            r8.A0i = r6
            X.Dy3 r0 = r8.A0q
            java.util.List<java.lang.Long> r0 = r0.A03
            r0.clear()
            r8.A0j = r6
            r8.A0A = r1
            r8.A0C = r1
            boolean r0 = r8.A0T
            if (r0 != 0) goto L4f
            boolean r7 = r8 instanceof X.C6150Dws
            if (r7 == 0) goto L41
            r1 = r8
            X.Dws r1 = (X.C6150Dws) r1
            boolean r0 = r1.A0b
            if (r0 == 0) goto L41
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.A0L
            long r3 = r3 - r0
            r1 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L4f
        L41:
            if (r7 == 0) goto L60
            X.Dwv r0 = r8.A0O
            if (r0 == 0) goto L60
            java.lang.String r0 = r0.A06
            boolean r0 = X.AbstractC5337DgY.A00(r0, r5)
            if (r0 == 0) goto L60
        L4f:
            r8.A0f()
            r8.A0g()
        L55:
            boolean r0 = r8.A0h
            if (r0 == 0) goto L5f
            X.Dwx r0 = r8.A0F
            if (r0 == 0) goto L5f
            r8.A03 = r5
        L5f:
            return
        L60:
            int r0 = r8.A04
            if (r0 != 0) goto L4f
            X.DxP r0 = r8.A0N
            r0.flush()
            r8.A0S = r6
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6147Dwp.A0e():void");
    }
}
