package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaCryptoException;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.facebook.aura.components.reactions.AuraDoubleTakeKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer;
import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import meta.androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import meta.androidx.media3.exoplayer.video.PlaceholderSurface;

@Deprecated
/* renamed from: X.Dwr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6149Dwr extends AbstractC6148Dwq {
    public static boolean A0w;
    public static boolean A0x;
    public static final int[] A0y = {1920, AuraDoubleTakeKt.DOUBLE_TAKE_TOTAL_MS, HatchInviteStoryImageRenderer.TEXT_CENTER_Y_PX, 1280, 960, 854, 640, 540, 480};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public Surface A0G;
    public C6232Dya A0H;
    public C6232Dya A0I;
    public InterfaceC6271DzO A0J;
    public InterfaceC6133Dwb A0K;
    public C6270DzN A0L;
    public C6187DxV A0M;
    public PlaceholderSurface A0N;
    public boolean A0O;
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
    public boolean A0g;
    public int A0h;
    public long A0i;
    public boolean A0j;
    public final int A0k;
    public final Context A0l;
    public final C6205Dxp A0m;
    public final C6168DxB A0n;
    public final C6171DxE A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final int A0s;
    public final int A0t;
    public final long A0u;
    public final C6259DzA A0v;

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/BVg;LX/Dwx;ZZZ)Ljava/util/List<LX/Dwv;>; */
    public static List A05(Context context, C6154Dwx c6154Dwx, InterfaceC2356BVg interfaceC2356BVg, boolean z, boolean z2, boolean z3) {
        String str = c6154Dwx.A0b;
        if (str == null) {
            return ImmutableList.of();
        }
        if (C6155Dwy.A06(c6154Dwx)) {
            return C6155Dwy.A02(c6154Dwx, interfaceC2356BVg, z, z2, z3, AnonymousClass002.A1M(A0I(context) ? 1 : 0));
        }
        if ("video/dolby-vision".equals(str) && !A0I(context)) {
            String strA03 = C6155Dwy.A03(c6154Dwx);
            List<C6153Dwv> listOf = strA03 == null ? ImmutableList.of() : interfaceC2356BVg.AEg(strA03, z, z2);
            if (!listOf.isEmpty()) {
                return listOf;
            }
        }
        return C6155Dwy.A01(c6154Dwx, interfaceC2356BVg, z, z2);
    }

    public static void A0A(C6149Dwr c6149Dwr) {
        InterfaceC6185DxT interfaceC6185DxT;
        c6149Dwr.A0e = false;
        if (!c6149Dwr.A0g || (interfaceC6185DxT = ((AbstractC6148Dwq) c6149Dwr).A0L) == null) {
            return;
        }
        c6149Dwr.A0M = new C6187DxV(interfaceC6185DxT, c6149Dwr);
    }

    public static final void A0F(C6149Dwr c6149Dwr) {
        c6149Dwr.A0d = true;
        if (c6149Dwr.A0e) {
            return;
        }
        c6149Dwr.A0e = true;
        C6173DxG c6173DxG = ((AbstractC6148Dwq) c6149Dwr).A0E;
        c6173DxG.A00(((AbstractC6148Dwq) c6149Dwr).A09);
        c6173DxG.A0J = true;
        c6149Dwr.A0m.A02(c6149Dwr.A0G);
        c6149Dwr.A0X = true;
    }

    @Override // X.AbstractC6148Dwq, X.AbstractC6146Dwo
    public final void A0X() {
        this.A0I = null;
        A0A(this);
        this.A0X = false;
        this.A0M = null;
        this.A02 = 0;
        this.A03 = 0;
        try {
            super.A0X();
        } finally {
            C6205Dxp c6205Dxp = this.A0m;
            c6205Dxp.A01(((AbstractC6148Dwq) this).A0E);
            c6205Dxp.A00(C6232Dya.A03);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[EDGE_INSN: B:48:0x00ca->B:49:0x00cc BREAK  A[LOOP:0: B:44:0x00b8->B:76:0x0138], PHI: r2 r5 r9
  0x00cc: PHI (r2v3 boolean) = (r2v0 boolean), (r2v6 boolean) binds: [B:78:0x013f, B:48:0x00ca] A[DONT_GENERATE, DONT_INLINE]
  0x00cc: PHI (r5v6 X.Dwv) = (r5v1 X.Dwv), (r5v7 X.Dwv) binds: [B:78:0x013f, B:48:0x00ca] A[DONT_GENERATE, DONT_INLINE]
  0x00cc: PHI (r9v3 boolean) = (r9v1 boolean), (r9v0 boolean) binds: [B:78:0x013f, B:48:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(android.content.Context r24, X.C6154Dwx r25, X.InterfaceC6133Dwb r26, X.InterfaceC2356BVg r27, boolean r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6149Dwr.A00(android.content.Context, X.Dwx, X.Dwb, X.BVg, boolean, boolean, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(X.C6154Dwx r11, X.C6153Dwv r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6149Dwr.A03(X.Dwx, X.Dwv):int");
    }

    public static int A04(C6154Dwx c6154Dwx, C6153Dwv c6153Dwv) {
        int i = c6154Dwx.A0E;
        if (i == -1) {
            return A03(c6154Dwx, c6153Dwv);
        }
        List<byte[]> list = c6154Dwx.A0c;
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += list.get(i2).length;
        }
        return i + length;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BVg;LX/Dwx;ZILX/Dwb;Ljava/util/List<LX/Dwv;>;)V */
    public static void A06(C6154Dwx c6154Dwx, InterfaceC6133Dwb interfaceC6133Dwb, List list, InterfaceC2356BVg interfaceC2356BVg, int i, boolean z) {
        try {
            int iA04 = C6150Dws.A04(c6154Dwx, interfaceC2356BVg, z, false);
            if (iA04 != (i & 63)) {
                List<C6153Dwv> listAEg = interfaceC2356BVg.AEg(c6154Dwx.A0b, AnonymousClass002.A1X(c6154Dwx.A0T), false);
                StringBuilder sbA0w = C60O.A0w();
                sbA0w.append("MCR1 returned 0b");
                sbA0w.append(Integer.toBinaryString(iA04));
                sbA0w.append(" and MCR2 returned 0b");
                sbA0w.append(Integer.toBinaryString(i));
                sbA0w.append(" for ");
                sbA0w.append(c6154Dwx);
                sbA0w.append("\nMCR2 Codecs: \n");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C6153Dwv c6153Dwv = (C6153Dwv) it.next();
                    sbA0w.append("\t");
                    sbA0w.append(c6153Dwv.A06);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                }
                sbA0w.append("MCR1 Codecs: \n");
                for (C6153Dwv c6153Dwv2 : listAEg) {
                    sbA0w.append("\t");
                    sbA0w.append(c6153Dwv2.A06);
                    sbA0w.append(PairsDiscretionDocument.TERMINATOR);
                }
                String string = sbA0w.toString();
                CNC.A04("MediaCodecVideoRenderer2", string);
                if (interfaceC6133Dwb != null) {
                    interfaceC6133Dwb.APy(string);
                }
            }
        } catch (MediaCodecUtil$DecoderQueryException e) {
            StringBuilder sbA0f = C3cG.A0f(e, "MCR1 threw an exception");
            sbA0f.append(" and MCR2 returned 0b");
            sbA0f.append(Integer.toBinaryString(i));
            sbA0f.append(" for ");
            sbA0f.append(c6154Dwx);
            sbA0f.append("\nMCR2 Codecs: \n");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C6153Dwv c6153Dwv3 = (C6153Dwv) it2.next();
                sbA0f.append("\t");
                sbA0f.append(c6153Dwv3.A06);
                sbA0f.append(PairsDiscretionDocument.TERMINATOR);
            }
            String string2 = sbA0f.toString();
            CNC.A04("MediaCodecVideoRenderer2", string2);
            if (interfaceC6133Dwb != null) {
                interfaceC6133Dwb.APy(string2);
            }
        }
    }

    public static final void A09(InterfaceC6185DxT interfaceC6185DxT, C6149Dwr c6149Dwr, int i, long j) {
        C0Q.A01("releaseOutputBuffer");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        interfaceC6185DxT.AaH(i, j);
        ((AbstractC6148Dwq) c6149Dwr).A09 += C3cG.A04(jElapsedRealtime);
        C0Q.A00();
        ((AbstractC6148Dwq) c6149Dwr).A0E.A0C++;
        A0B(c6149Dwr);
        c6149Dwr.A0D = BV8.A0F();
        C6232Dya c6232Dya = c6149Dwr.A0H;
        if (!c6232Dya.equals(C6232Dya.A03) && !c6232Dya.equals(c6149Dwr.A0I)) {
            c6149Dwr.A0I = c6232Dya;
            c6149Dwr.A0m.A00(c6232Dya);
        }
        A0F(c6149Dwr);
        ((AbstractC6148Dwq) c6149Dwr).A0E.A00(((AbstractC6148Dwq) c6149Dwr).A09);
    }

    public static void A0B(C6149Dwr c6149Dwr) {
        int i;
        int i2 = c6149Dwr.A0t;
        if (i2 > 0 && (i = c6149Dwr.A0h) > 0 && i >= i2) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - c6149Dwr.A0i;
            C6259DzA c6259DzA = c6149Dwr.A0v;
            HeroExoPlayer2EventListener heroExoPlayer2EventListener = c6259DzA.A01;
            Handler handler = c6259DzA.A00;
            if (handler != null && heroExoPlayer2EventListener != null) {
                handler.post(new RunnableC6264DzF(heroExoPlayer2EventListener, i, jElapsedRealtime));
            }
        }
        c6149Dwr.A0h = 0;
        c6149Dwr.A0i = SystemClock.elapsedRealtime();
    }

    public static void A0C(C6149Dwr c6149Dwr) {
        int i = c6149Dwr.A01;
        if (i > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - c6149Dwr.A07;
            C6205Dxp c6205Dxp = c6149Dwr.A0m;
            Handler handler = c6205Dxp.A00;
            if (handler != null) {
                handler.post(new RunnableC6248Dyr(c6205Dxp, i, j));
            }
            c6149Dwr.A01 = 0;
            c6149Dwr.A07 = jElapsedRealtime;
        }
    }

    public static void A0E(C6149Dwr c6149Dwr) {
        long j = c6149Dwr.A0u;
        c6149Dwr.A0A = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
    }

    public static final void A0G(C6149Dwr c6149Dwr, int i, int i2) {
        C6173DxG c6173DxG = ((AbstractC6148Dwq) c6149Dwr).A0E;
        c6173DxG.A05 += i;
        int i3 = i + i2;
        c6173DxG.A04 += i3;
        int i4 = c6149Dwr.A01 + i3;
        c6149Dwr.A01 = i4;
        int i5 = c6149Dwr.A0h + i3;
        c6149Dwr.A0h = i5;
        c6173DxG.A0A = Math.max(i5, c6173DxG.A0A);
        int i6 = c6149Dwr.A0s;
        if (i6 <= 0 || i4 < i6) {
            return;
        }
        A0C(c6149Dwr);
    }

    public static final void A0H(C6149Dwr c6149Dwr, long j) {
        C6173DxG c6173DxG = ((AbstractC6148Dwq) c6149Dwr).A0E;
        c6173DxG.A0I += j;
        c6173DxG.A0G++;
        c6149Dwr.A0F += j;
        c6149Dwr.A06++;
    }

    public static boolean A0I(Context context) {
        Display display;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null && (display = displayManager.getDisplay(0)) != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0017. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0J(java.lang.String r2) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.Class<X.Dws> r2 = X.C6150Dws.class
            monitor-enter(r2)
            boolean r0 = X.C6149Dwr.A0x     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L42
            java.lang.String r1 = androidx.media3.common.util.Util.A04     // Catch: java.lang.Throwable -> L46
            int r0 = r1.hashCode()     // Catch: java.lang.Throwable -> L46
            switch(r0) {
                case -349662828: goto L33;
                case -321033677: goto L30;
                case 2006354: goto L2d;
                case 2006367: goto L2a;
                case 2006371: goto L27;
                case 1785421873: goto L24;
                case 1785421876: goto L21;
                case 1798172390: goto L1e;
                case 2119412532: goto L1b;
                default: goto L1a;
            }     // Catch: java.lang.Throwable -> L46
        L1a:
            goto L3c
        L1b:
            java.lang.String r0 = "AFTEUFF014"
            goto L35
        L1e:
            java.lang.String r0 = "AFTSO001"
            goto L35
        L21:
            java.lang.String r0 = "AFTEU014"
            goto L35
        L24:
            java.lang.String r0 = "AFTEU011"
            goto L35
        L27:
            java.lang.String r0 = "AFTR"
            goto L35
        L2a:
            java.lang.String r0 = "AFTN"
            goto L35
        L2d:
            java.lang.String r0 = "AFTA"
            goto L35
        L30:
            java.lang.String r0 = "AFTKMST12"
            goto L35
        L33:
            java.lang.String r0 = "AFTJMST12"
        L35:
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L46
            r0 = 1
            if (r1 != 0) goto L3d
        L3c:
            r0 = 0
        L3d:
            X.C6149Dwr.A0w = r0     // Catch: java.lang.Throwable -> L46
            r0 = 1
            X.C6149Dwr.A0x = r0     // Catch: java.lang.Throwable -> L46
        L42:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L46
            boolean r0 = X.C6149Dwr.A0w
            return r0
        L46:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L46
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6149Dwr.A0J(java.lang.String):boolean");
    }

    public static boolean A0K(C6153Dwv c6153Dwv, C6149Dwr c6149Dwr) {
        if (!c6149Dwr.A0a || c6149Dwr.A0g || A0J(c6153Dwv.A06)) {
            return false;
        }
        return !c6153Dwv.A0B || PlaceholderSurface.A01();
    }

    @Override // X.AbstractC6148Dwq
    public void A0l(Di2 di2) {
        C6153Dwv c6153Dwv;
        ByteBuffer byteBuffer;
        if (AbstractC5653Dmh.A03(EnumC5618Dlz.A1n) && (c6153Dwv = super.A0M) != null && "video/av01".equals(c6153Dwv.A05) && (byteBuffer = di2.A01) != null && !AnonymousClass002.A1Q(((AbstractC5364DhG) di2).A00 & 1073741824, 1073741824)) {
            AbstractC3150Bzk.A00(byteBuffer);
        }
        if (this.A0g) {
            return;
        }
        this.A00++;
    }

    @Override // X.InterfaceC6068Dv6, X.InterfaceC5921Ds8
    public final String getName() {
        return "MediaCodecVideoRenderer2";
    }

    @Override // X.InterfaceC6068Dv6
    public final boolean isEnded() {
        return super.A0b;
    }

    public static void A07(StringBuilder sb, List<C6153Dwv> list) {
        for (C6153Dwv c6153Dwv : list) {
            sb.append("\t");
            sb.append(c6153Dwv.A06);
            sb.append(":");
            sb.append(c6153Dwv.A0C ? "sw" : "hw");
            sb.append(":");
            sb.append(c6153Dwv.A09 ? "hwAcc" : "noHwAcc");
            sb.append(":");
            sb.append(c6153Dwv.A07 ? "seamless" : "noSeamless");
            sb.append(":");
            sb.append(c6153Dwv.A0B ? "secure" : "noSecure");
            sb.append(PairsDiscretionDocument.TERMINATOR);
        }
    }

    public static final void A08(InterfaceC6185DxT interfaceC6185DxT, C6149Dwr c6149Dwr, int i) {
        C0Q.A01("skipVideoBuffer");
        interfaceC6185DxT.releaseOutputBuffer(i, false);
        C0Q.A00();
        ((AbstractC6148Dwq) c6149Dwr).A0E.A0E++;
    }

    public static boolean A0L(C6149Dwr c6149Dwr) {
        PlaceholderSurface placeholderSurface;
        PlaceholderSurface placeholderSurface2;
        if (super.isReady() && !c6149Dwr.A0e && (((placeholderSurface2 = c6149Dwr.A0N) == null || c6149Dwr.A0G != placeholderSurface2) && ((AbstractC6148Dwq) c6149Dwr).A0L != null && !c6149Dwr.A0g)) {
            ((AbstractC6148Dwq) c6149Dwr).A0H = C79.A0P;
        }
        if (!super.isReady() || ((c6149Dwr.A0j && c6149Dwr.A0G == null) || !(c6149Dwr.A0e || (((placeholderSurface = c6149Dwr.A0N) != null && c6149Dwr.A0G == placeholderSurface) || ((AbstractC6148Dwq) c6149Dwr).A0L == null || c6149Dwr.A0g)))) {
            long j = c6149Dwr.A0A;
            if (j != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() >= j) {
                    c6149Dwr.A0A = -9223372036854775807L;
                }
            }
            return false;
        }
        c6149Dwr.A0A = -9223372036854775807L;
        return true;
    }

    @Override // X.AbstractC6148Dwq, X.AbstractC6146Dwo
    public final void A0W() {
        try {
            super.A0W();
            PlaceholderSurface placeholderSurface = this.A0N;
            if (placeholderSurface != null) {
                if (this.A0G == placeholderSurface) {
                    this.A0G = null;
                }
                placeholderSurface.release();
                this.A0N = null;
            }
        } catch (Throwable th) {
            PlaceholderSurface placeholderSurface2 = this.A0N;
            if (placeholderSurface2 != null) {
                if (this.A0G == placeholderSurface2) {
                    this.A0G = null;
                }
                placeholderSurface2.release();
                this.A0N = null;
            }
            throw th;
        }
    }

    @Override // X.AbstractC6148Dwq, X.AbstractC6146Dwo
    public final void A0Y(long j, boolean z) {
        super.A0Y(j, z);
        A0A(this);
        C6171DxE.A01(this.A0o);
        this.A02 = 0;
        this.A03 = 0;
        this.A0B = -9223372036854775807L;
        this.A09 = -9223372036854775807L;
        A0B(this);
        if (z) {
            A0E(this);
        } else {
            this.A0A = -9223372036854775807L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    @Override // X.AbstractC6148Dwq, X.AbstractC6146Dwo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0a(boolean r6, boolean r7) {
        /*
            r5 = this;
            super.A0a(r6, r7)
            X.Dsl r0 = r5.A08
            r0.getClass()
            boolean r2 = r0.A00
            r4 = 0
            if (r2 == 0) goto L12
            int r1 = r5.A05
            r0 = 0
            if (r1 == 0) goto L13
        L12:
            r0 = 1
        L13:
            X.C1G.A08(r0)
            boolean r0 = r5.A0g
            if (r0 == r2) goto L1f
            r5.A0g = r2
            r5.A0h()
        L1f:
            X.Dxp r3 = r5.A0m
            X.DxG r2 = r5.A0E
            android.os.Handler r1 = r3.A00
            if (r1 == 0) goto L2f
            X.Dyk r0 = new X.Dyk
            r0.<init>(r2, r3)
            r1.post(r0)
        L2f:
            r5.A0b = r7
            r5.A0d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6149Dwr.A0a(boolean, boolean):void");
    }

    @Override // X.AbstractC6148Dwq
    public final C2461Bbo A0c(C5406Dhz c5406Dhz) throws MediaCryptoException, ExoPlaybackException {
        C2461Bbo c2461BboA0c = super.A0c(c5406Dhz);
        C6205Dxp c6205Dxp = this.A0m;
        C6154Dwx c6154Dwx = c5406Dhz.A00;
        Handler handler = c6205Dxp.A00;
        if (handler != null) {
            handler.post(new DyV(c6154Dwx, c2461BboA0c, c6205Dxp));
        }
        return c2461BboA0c;
    }

    @Override // X.AbstractC6148Dwq
    public final void A0f() {
        super.A0f();
        this.A00 = 0;
    }

    @Override // X.AbstractC6148Dwq
    public void A0i(long j) {
        super.A0i(j);
        if (this.A0g) {
            return;
        }
        this.A00--;
    }

    @Override // X.AbstractC6148Dwq, X.AbstractC6146Dwo, X.InterfaceC6068Dv6
    public final void Ae2(float f, float f2) {
        super.Ae2(f, f2);
        C6171DxE c6171DxE = this.A0o;
        c6171DxE.A00 = f;
        C6171DxE.A01(c6171DxE);
        C6171DxE.A03(c6171DxE, false);
    }

    @Override // X.AbstractC6148Dwq, X.InterfaceC6068Dv6
    public final boolean isReady() {
        return A0L(this);
    }

    @Override // X.AbstractC6148Dwq, X.InterfaceC6068Dv6
    public final void Aaz(long j, long j2) throws Exception {
        super.Aaz(j, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6149Dwr(android.content.Context r20, android.os.Handler r21, X.InterfaceC6243Dym r22, X.InterfaceC6133Dwb r23, X.BVV r24, X.C6175DxI r25, java.lang.Object r26, X.BWK r27, X.InterfaceC2356BVg r28, int r29, int r30, int r31, int r32, int r33, long r34, boolean r36) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6149Dwr.<init>(android.content.Context, android.os.Handler, X.Dym, X.Dwb, X.BVV, X.DxI, java.lang.Object, X.BWK, X.BVg, int, int, int, int, int, long, boolean):void");
    }
}
