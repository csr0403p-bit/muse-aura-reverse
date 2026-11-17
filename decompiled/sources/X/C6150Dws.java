package X;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.facebook.aura.components.reactions.AuraDoubleTakeKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer;
import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import meta.androidx.media3.exoplayer.video.DummySurface;

/* renamed from: X.Dws, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6150Dws extends AbstractC6147Dwp implements InterfaceC6284Dzg {
    public static boolean A1a;
    public static boolean A1b;
    public static final int[] A1c = {1920, AuraDoubleTakeKt.DOUBLE_TAKE_TOTAL_MS, HatchInviteStoryImageRenderer.TEXT_CENTER_Y_PX, 1280, 960, 854, 640, 540, 480};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    public MediaFormat A0P;
    public Surface A0Q;
    public Surface A0R;
    public C5725DoK A0S;
    public InterfaceC6271DzO A0T;
    public Object A0U;
    public String A0V;
    public InterfaceC6185DxT A0W;
    public Ds7 A0X;
    public C6269DzM A0Y;
    public C6213Dxz A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public float A0n;
    public int A0o;
    public int A0p;
    public long A0q;
    public long A0r;
    public long A0s;
    public long A0t;
    public long A0u;
    public C6154Dwx A0v;
    public boolean A0w;
    public boolean A0x;
    public final int A0y;
    public final long A0z;
    public final Context A10;
    public final Dy1 A11;
    public final C6276DzT A12;
    public final C6192Dxc A13;
    public final C6205Dxp A14;
    public final C6259DzA A15;
    public final PriorityQueue<Long> A16;
    public final C6167DxA A17;
    public final C6171DxE A18;
    public final boolean A19;
    public final boolean A1A;
    public final boolean A1B;
    public final boolean A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final boolean A1F;
    public final boolean A1G;
    public final boolean A1H;
    public final boolean A1I;
    public final int A1J;
    public final int A1K;
    public final int A1L;
    public final long A1M;
    public final long A1N;
    public final C6178DxM A1O;
    public final boolean A1P;
    public final boolean A1Q;
    public final boolean A1R;
    public final boolean A1S;
    public final boolean A1T;
    public final boolean A1U;
    public final boolean A1V;
    public final long[] A1W;
    public final long[] A1X;
    public volatile Boolean A1Y;
    public volatile Ds7 A1Z;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A04(X.C6154Dwx r11, X.InterfaceC2356BVg r12, boolean r13, boolean r14) {
        /*
            r7 = r11
            java.lang.String r3 = r11.A0b
            java.lang.String r0 = "video"
            boolean r0 = X.BV7.A1Z(r3, r0)
            r10 = 0
            if (r0 != 0) goto Le
            return r10
        Le:
            androidx.media3.common.DrmInitData r0 = r11.A0T
            r5 = 1
            boolean r9 = X.AnonymousClass002.A1X(r0)
            boolean r6 = X.C6155Dwy.A06(r11)
            r8 = r12
            if (r6 == 0) goto L2b
            r11 = r14
            r12 = r10
            com.google.common.collect.ImmutableList r2 = X.C6155Dwy.A02(r7, r8, r9, r10, r11, r12)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L2f
        L28:
            r1 = 129(0x81, float:1.81E-43)
        L2a:
            return r1
        L2b:
            java.util.List r2 = r12.AEg(r3, r9, r10)
        L2f:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L55
            if (r13 == 0) goto L55
            java.util.ArrayList r1 = X.C3cG.A0h()
            java.lang.String r0 = X.C6155Dwy.A03(r7)
            if (r0 == 0) goto L54
            java.util.List r2 = r8.AEg(r0, r10, r10)
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L54
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L55
        L54:
            r2 = r1
        L55:
            r1 = 2
            if (r9 == 0) goto L69
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L69
            java.util.List r0 = r8.AEg(r3, r10, r10)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2a
            return r5
        L69:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L28
            int r0 = r7.A07
            if (r0 == 0) goto L78
            if (r0 == r1) goto L78
            r1 = 130(0x82, float:1.82E-43)
            return r1
        L78:
            java.lang.Object r4 = r2.get(r10)
            X.Dwv r4 = (X.C6153Dwv) r4
            if (r6 == 0) goto Lb2
            boolean r0 = r4.A08(r7)
        L84:
            if (r0 == 0) goto L9d
        L86:
            java.lang.String r1 = r4.A06
            boolean r1 = X.C6155Dwy.A07(r7, r1)
            if (r1 != 0) goto L9d
            int r3 = r7.A0Q
            if (r3 <= 0) goto L9d
            int r2 = r7.A0D
            if (r2 <= 0) goto L9d
            float r0 = r7.A01
            double r0 = (double) r0
            boolean r0 = r4.A07(r3, r2, r0)
        L9d:
            boolean r1 = r4.A07
            r2 = 8
            if (r1 == 0) goto La5
            r2 = 16
        La5:
            boolean r1 = r4.A0D
            if (r1 == 0) goto Lab
            r10 = 32
        Lab:
            r1 = 3
            if (r0 == 0) goto Laf
            r1 = 4
        Laf:
            r2 = r2 | r10
            r1 = r1 | r2
            return r1
        Lb2:
            java.lang.String r3 = r7.A0W
            if (r3 == 0) goto Ld8
            java.lang.String r0 = r4.A05
            if (r0 == 0) goto Ld8
            java.lang.String r2 = X.AbstractC6161Dx4.A04(r3)
            if (r2 == 0) goto Ld8
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto Ld3
            java.lang.String r1 = "codec.mime "
            java.lang.String r0 = ", "
            java.lang.String r0 = X.FGI.A0d(r1, r3, r0, r2)
            X.C6153Dwv.A01(r0, r4)
            r0 = 0
            goto L84
        Ld3:
            boolean r0 = X.C6153Dwv.A03(r7, r4, r5)
            goto L84
        Ld8:
            r0 = 1
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6150Dws.A04(X.Dwx, X.BVg, boolean, boolean):int");
    }

    private final void A0F(InterfaceC6185DxT interfaceC6185DxT, int i, long j, long j2) {
        if (this.A1G) {
            A0H(interfaceC6185DxT, i, j, j2);
            return;
        }
        A0A();
        C6154Dwx c6154Dwx = ((AbstractC6147Dwp) this).A0F;
        MediaFormat mediaFormat = this.A0P;
        InterfaceC6271DzO interfaceC6271DzO = this.A0T;
        if (interfaceC6271DzO != null) {
            interfaceC6271DzO.AX9(mediaFormat, c6154Dwx, j, j2);
        }
        try {
            C0Q.A01("releaseOutputBuffer");
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            interfaceC6185DxT.AaH(i, j2);
            if (A0Q(interfaceC6185DxT, C3cG.A04(jElapsedRealtime))) {
                this.A0K = BV8.A0F();
                A0n();
                ((AbstractC6147Dwp) this).A0G.A00(((AbstractC6147Dwp) this).A0B);
            }
        } finally {
            C0Q.A00();
        }
    }

    private final void A0G(InterfaceC6185DxT interfaceC6185DxT, int i, long j, long j2) {
        if (this.A1G) {
            A0H(interfaceC6185DxT, i, j, j2);
            return;
        }
        A0A();
        C6154Dwx c6154Dwx = ((AbstractC6147Dwp) this).A0F;
        MediaFormat mediaFormat = this.A0P;
        InterfaceC6271DzO interfaceC6271DzO = this.A0T;
        if (interfaceC6271DzO != null) {
            interfaceC6271DzO.AX9(mediaFormat, c6154Dwx, j, j2);
        }
        try {
            C0Q.A01("releaseOutputBuffer");
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            interfaceC6185DxT.AaH(i, j2);
            if (A0Q(interfaceC6185DxT, C3cG.A04(jElapsedRealtime))) {
                this.A0K = BV8.A0F();
                A0n();
                ((AbstractC6147Dwp) this).A0G.A00(((AbstractC6147Dwp) this).A0B);
            }
        } finally {
            C0Q.A00();
        }
    }

    public static void A0I(C6150Dws c6150Dws) {
        c6150Dws.A0W = null;
        c6150Dws.A0V = null;
        c6150Dws.A0e = false;
    }

    public static void A0J(C6150Dws c6150Dws) {
        InterfaceC6181DxP interfaceC6181DxP;
        c6150Dws.A0j = false;
        c6150Dws.A0w = false;
        if (!c6150Dws.A0m || (interfaceC6181DxP = ((AbstractC6147Dwp) c6150Dws).A0N) == null) {
            return;
        }
        c6150Dws.A0Z = new C6213Dxz(interfaceC6181DxP, c6150Dws);
    }

    @Override // X.AbstractC6147Dwp
    public final void A0j(C6154Dwx c6154Dwx) throws ExoPlaybackException {
        C2461Bbo c2461Bbo = null;
        this.A0v = null;
        super.A0j(c6154Dwx);
        C6205Dxp c6205Dxp = this.A14;
        Handler handler = c6205Dxp.A00;
        if (handler != null) {
            handler.post(new DyV(c6154Dwx, c2461Bbo, c6205Dxp));
        }
        this.A01 = c6154Dwx.A02;
        this.A0A = c6154Dwx.A0K;
    }

    public final void A0n() {
        if (this.A0j) {
            return;
        }
        this.A0j = true;
        C6173DxG c6173DxG = ((AbstractC6147Dwp) this).A0G;
        c6173DxG.A00(((AbstractC6147Dwp) this).A0B);
        c6173DxG.A0J = true;
        this.A14.A02(this.A0R);
    }

    public static int A00(C6154Dwx c6154Dwx) {
        int i = c6154Dwx.A0E;
        if (i == -1) {
            return A03(c6154Dwx, c6154Dwx.A0Q, c6154Dwx.A0D);
        }
        List<byte[]> list = c6154Dwx.A0c;
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += list.get(i2).length;
        }
        return i + length;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A03(X.C6154Dwx r3, int r4, int r5) {
        /*
            X.Dlz r0 = X.EnumC5618Dlz.A0y
            boolean r0 = X.AbstractC5653Dmh.A03(r0)
            if (r0 == 0) goto L38
            java.lang.String r0 = "video/av01"
            boolean r0 = X.BV6.A1W(r3, r0)
            if (r0 != 0) goto L17
            boolean r0 = X.C6155Dwy.A06(r3)
            if (r0 == 0) goto L38
        L17:
            X.DxO r0 = r3.A0S
            boolean r0 = X.C6180DxO.A03(r0)
            if (r0 == 0) goto L38
            r1 = -1
            if (r4 <= 0) goto L37
            if (r5 <= 0) goto L37
            long r2 = (long) r4
            long r4 = (long) r5
            long r2 = r2 * r4
            r4 = 2863311529(0xaaaaaaa9, double:1.41466386E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L37
            r0 = 3
            long r2 = r2 * r0
            r0 = 4
            long r2 = r2 / r0
            int r1 = (int) r2
        L37:
            return r1
        L38:
            java.lang.String r1 = r3.A0b
            r0 = -1
            if (r4 == r0) goto L47
            if (r5 == r0) goto L47
            int r0 = r1.hashCode()
            r2 = 4
            switch(r0) {
                case -1664118616: goto L83;
                case -1662541442: goto L78;
                case 1187890754: goto L74;
                case 1331836730: goto L51;
                case 1599127256: goto L4d;
                case 1599127257: goto L49;
                default: goto L47;
            }
        L47:
            r1 = -1
            return r1
        L49:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            goto L7b
        L4d:
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L86
        L51:
            java.lang.String r0 = "video/avc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L47
            java.lang.String r1 = "BRAVIA 4K 2015"
            java.lang.String r0 = androidx.media3.common.util.Util.A04
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L47
            r2 = 16
            int r0 = r4 + 16
            int r1 = r0 + (-1)
            int r1 = r1 / r2
            int r0 = r5 + 16
            int r0 = r0 + (-1)
            int r0 = r0 / r2
            int r1 = r1 * r0
            int r4 = r1 * 256
            goto L8d
        L74:
            java.lang.String r0 = "video/mp4v-es"
            goto L86
        L78:
            java.lang.String r0 = "video/hevc"
        L7b:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L47
            int r4 = r4 * r5
            goto L8e
        L83:
            java.lang.String r0 = "video/3gpp"
        L86:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L47
            int r4 = r4 * r5
        L8d:
            r2 = 2
        L8e:
            int r1 = r4 * 3
            int r0 = r2 * 2
            int r1 = r1 / r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6150Dws.A03(X.Dwx, int, int):int");
    }

    public static Point A05(C6154Dwx c6154Dwx, C6153Dwv c6153Dwv, int i) {
        Point pointA0O;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i2 = c6154Dwx.A0D;
        int i3 = c6154Dwx.A0Q;
        int i4 = 0;
        boolean z = false;
        if (i2 > i3) {
            z = true;
            i3 = i2;
            i2 = i3;
        }
        float f = i2 / i3;
        int[] iArr = A1c;
        while (true) {
            pointA0O = null;
            if (i4 >= 9) {
                break;
            }
            int i5 = iArr[i4];
            if (i5 <= i) {
                int i6 = (int) (i5 * f);
                if (i5 <= i3 || i6 <= i2) {
                    break;
                }
                int i7 = i6;
                if (!z) {
                    i7 = i5;
                    i5 = i6;
                }
                MediaCodecInfo.CodecCapabilities codecCapabilities = c6153Dwv.A03;
                if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                    pointA0O = BV8.A0O(videoCapabilities, i7, i5);
                }
                if (c6153Dwv.A07(pointA0O.x, pointA0O.y, c6154Dwx.A01)) {
                    break;
                }
            }
            i4++;
        }
        return pointA0O;
    }

    public static final MediaFormat A06(C6154Dwx c6154Dwx, C6153Dwv c6153Dwv, C6269DzM c6269DzM, C6150Dws c6150Dws, float f) {
        int i = c6150Dws.A0m ? c6150Dws.A0F : 0;
        MediaFormat mediaFormat = new MediaFormat();
        String str = c6154Dwx.A0b;
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(HatchWebPageParserKt.WIDTH_ATTR, c6154Dwx.A0Q);
        mediaFormat.setInteger(HatchWebPageParserKt.HEIGHT_ATTR, c6154Dwx.A0D);
        if (!c6150Dws.A1A || !"video/x-vnd.on2.vp9".equals(str)) {
            AbstractC3123Byo.A01(mediaFormat, c6154Dwx.A0c);
        }
        float f2 = c6154Dwx.A01;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        int i2 = c6154Dwx.A0K;
        if (i2 != -1) {
            mediaFormat.setInteger("rotation-degrees", i2);
        }
        AbstractC3123Byo.A00(mediaFormat, c6154Dwx.A0S);
        mediaFormat.setInteger("max-width", c6269DzM.A02);
        mediaFormat.setInteger("max-height", c6269DzM.A00);
        int i3 = c6269DzM.A01;
        if (i3 != -1) {
            mediaFormat.setInteger("max-input-size", i3);
        }
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (i != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i);
        }
        if ((C6155Dwy.A06(c6154Dwx) && "video/av01".equals(c6153Dwv.A05)) || ("video/mv-hevc".equals(str) && "video/hevc".equals(c6153Dwv.A04))) {
            mediaFormat.setString("mime", c6153Dwv.A04);
        }
        return mediaFormat;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C6269DzM A08(X.C6154Dwx r12, X.C6153Dwv r13, X.C6150Dws r14) {
        /*
            X.Dwx[] r9 = r14.A0C
            r9.getClass()
            int r6 = r12.A0Q
            int r5 = r12.A0D
            int r4 = A00(r12)
            int r8 = r9.length
            r0 = 1
            if (r8 == r0) goto L76
            r7 = 0
            r11 = 0
        L13:
            if (r7 >= r8) goto L40
            r10 = r9[r7]
            boolean r0 = r13.A07
            boolean r0 = A0O(r12, r10, r0)
            if (r0 == 0) goto L3d
            int r3 = r10.A0Q
            r2 = -1
            if (r3 == r2) goto L29
            int r1 = r10.A0D
            r0 = 0
            if (r1 != r2) goto L2a
        L29:
            r0 = 1
        L2a:
            r11 = r11 | r0
            int r6 = java.lang.Math.max(r6, r3)
            int r0 = r10.A0D
            int r5 = java.lang.Math.max(r5, r0)
            int r0 = A00(r10)
            int r4 = java.lang.Math.max(r4, r0)
        L3d:
            int r7 = r7 + 1
            goto L13
        L40:
            if (r11 == 0) goto L76
            java.lang.String r0 = "Resolutions unknown. Codec max resolution: "
            java.lang.String r3 = "x"
            java.lang.String r0 = X.FGI.A0T(r0, r3, r6, r5)
            java.lang.String r2 = "MediaCodecVideoRenderer"
            X.CNC.A04(r2, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            android.graphics.Point r1 = A05(r12, r13, r0)
            if (r1 == 0) goto L76
            int r0 = r1.x
            int r6 = java.lang.Math.max(r6, r0)
            int r0 = r1.y
            int r5 = java.lang.Math.max(r5, r0)
            int r0 = A03(r12, r6, r5)
            int r4 = java.lang.Math.max(r4, r0)
            java.lang.String r0 = "Codec max resolution adjusted to: "
            java.lang.String r0 = X.FGI.A0T(r0, r3, r6, r5)
            X.CNC.A04(r2, r0)
        L76:
            X.DzM r7 = new X.DzM
            r7.<init>(r6, r5, r4)
            android.media.MediaCodecInfo$CodecCapabilities r0 = r13.A03
            if (r0 == 0) goto Lcb
            X.DxI r1 = r14.A0p
            boolean r0 = r1.A0T
            if (r0 == 0) goto Lc6
            boolean r0 = r1.A0O
            if (r0 == 0) goto Lc6
            boolean r0 = r1.A0N
            if (r0 == 0) goto Lc6
            boolean r0 = r14.A0m
            if (r0 != 0) goto Lc6
            java.lang.String r0 = r13.A06
            boolean r0 = A0P(r0)
            if (r0 != 0) goto Lc6
            android.view.Surface r0 = r14.A0R
            if (r0 == 0) goto Lc6
            r0 = 2147483647(0x7fffffff, float:NaN)
        La0:
            android.graphics.Point r2 = A05(r12, r13, r0)
            if (r2 == 0) goto Lcb
            int r1 = r7.A02
            int r0 = r2.x
            int r3 = java.lang.Math.max(r1, r0)
            int r1 = r7.A00
            int r0 = r2.y
            int r2 = java.lang.Math.max(r1, r0)
            int r1 = r7.A01
            int r0 = A03(r12, r3, r2)
            int r1 = java.lang.Math.max(r1, r0)
            X.DzM r0 = new X.DzM
            r0.<init>(r3, r2, r1)
            return r0
        Lc6:
            int r0 = r1.A07
            if (r0 <= 0) goto Lcb
            goto La0
        Lcb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6150Dws.A08(X.Dwx, X.Dwv, X.Dws):X.DzM");
    }

    private void A0A() {
        int i = this.A06;
        if (i == -1 && this.A05 == -1) {
            return;
        }
        if (this.A0D == i && this.A0B == this.A05 && this.A0C == 0 && this.A02 == this.A00) {
            return;
        }
        this.A14.A00(new C6232Dya(i, this.A05, this.A00));
        this.A0D = this.A06;
        this.A0B = this.A05;
        this.A0C = 0;
        this.A02 = this.A00;
    }

    private final void A0C(int i, int i2) {
        C6173DxG c6173DxG = ((AbstractC6147Dwp) this).A0G;
        c6173DxG.A05 += i;
        int i3 = i + i2;
        c6173DxG.A04 += i3;
        int i4 = this.A07 + i3;
        this.A07 = i4;
        int i5 = this.A0o + i3;
        this.A0o = i5;
        c6173DxG.A0A = Math.max(i5, c6173DxG.A0A);
        if (i4 >= this.A1J) {
            A0L(this);
        }
    }

    private final void A0H(InterfaceC6185DxT interfaceC6185DxT, int i, long j, long j2) {
        C6154Dwx c6154Dwx = ((AbstractC6147Dwp) this).A0F;
        MediaFormat mediaFormat = this.A0P;
        InterfaceC6271DzO interfaceC6271DzO = this.A0T;
        if (interfaceC6271DzO != null) {
            interfaceC6271DzO.AX9(mediaFormat, c6154Dwx, j, j2);
        }
        C0Q.A01("releaseOutputBuffer");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        interfaceC6185DxT.AaH(i, j2);
        long jA04 = C3cG.A04(jElapsedRealtime);
        C0Q.A00();
        boolean zA0Q = A0Q(interfaceC6185DxT, jA04);
        if (zA0Q) {
            this.A0K = BV8.A0F();
        }
        A0A();
        if (zA0Q) {
            A0n();
            ((AbstractC6147Dwp) this).A0G.A00(((AbstractC6147Dwp) this).A0B);
        }
    }

    public static void A0K(C6150Dws c6150Dws) {
        int i;
        int i2 = c6150Dws.A1K;
        if (i2 > 0 && (i = c6150Dws.A0o) > 0 && i >= i2) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - c6150Dws.A0q;
            C6259DzA c6259DzA = c6150Dws.A15;
            HeroExoPlayer2EventListener heroExoPlayer2EventListener = c6259DzA.A01;
            Handler handler = c6259DzA.A00;
            if (handler != null && heroExoPlayer2EventListener != null) {
                handler.post(new RunnableC6264DzF(heroExoPlayer2EventListener, i, jElapsedRealtime));
            }
        }
        c6150Dws.A0o = 0;
        c6150Dws.A0q = SystemClock.elapsedRealtime();
    }

    public static void A0L(C6150Dws c6150Dws) {
        int i = c6150Dws.A07;
        if (i > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - c6150Dws.A0G;
            C6205Dxp c6205Dxp = c6150Dws.A14;
            Handler handler = c6205Dxp.A00;
            if (handler != null) {
                handler.post(new RunnableC6248Dyr(c6205Dxp, i, j));
            }
            c6150Dws.A07 = 0;
            c6150Dws.A0G = jElapsedRealtime;
        }
    }

    private boolean A0M() {
        int i = this.A1L;
        if (i > 0) {
            long j = this.A0H;
            z = j == -9223372036854775807L || C3cG.A04(j) <= ((long) i);
            if (j == -9223372036854775807L) {
                CNC.A04("MediaCodecVideoRenderer", "Render output failed");
                this.A0H = SystemClock.elapsedRealtime();
            }
        }
        return z;
    }

    private boolean A0N(long j, boolean z) {
        if (!this.A0k || z) {
            return false;
        }
        long j2 = this.A0O;
        if (j2 != -9223372036854775807L) {
            long j3 = j - j2;
            if (j3 > 0 && j3 < this.A0N * ((AbstractC6147Dwp) this).A01) {
                return true;
            }
        }
        this.A0O = j;
        return false;
    }

    public static boolean A0O(C6154Dwx c6154Dwx, C6154Dwx c6154Dwx2, boolean z) {
        return BV6.A1W(c6154Dwx2, c6154Dwx.A0b) && c6154Dwx.A0K == c6154Dwx2.A0K && (z || (c6154Dwx.A0Q == c6154Dwx2.A0Q && c6154Dwx.A0D == c6154Dwx2.A0D)) && C6xC.A00(c6154Dwx.A0S, c6154Dwx2.A0S);
    }

    public static final boolean A0P(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C6150Dws.class) {
            if (!A1b) {
                if ("dangal".equals(Util.A01)) {
                    A1a = true;
                }
                A1b = true;
            }
        }
        return A1a;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0Q(X.InterfaceC6185DxT r5, long r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.InterfaceC6181DxP
            if (r0 == 0) goto Le
            r0 = r5
            X.DxP r0 = (X.InterfaceC6181DxP) r0
            boolean r1 = r0.AOq()
            r0 = 1
            if (r1 != 0) goto Lf
        Le:
            r0 = 0
        Lf:
            r3 = 1
            if (r0 == 0) goto L32
            X.DxP r5 = (X.InterfaceC6181DxP) r5
            java.lang.Integer r1 = r5.AGu()
            java.lang.Integer r0 = X.C79.A0C
            r2 = 0
            if (r1 != r0) goto L23
            r4.A0h = r2
            r4.A0C(r2, r3)
            return r2
        L23:
            java.lang.Integer r0 = X.C79.A00
            if (r1 == r0) goto L32
            r4.A0h = r2
            X.DxG r1 = r4.A0G
            int r0 = r1.A0E
            int r0 = r0 + 1
            r1.A0E = r0
            return r2
        L32:
            r4.A0h = r3
            long r0 = r4.A0B
            long r0 = r0 + r6
            r4.A0B = r0
            X.DxG r1 = r4.A0G
            int r0 = r1.A0C
            int r0 = r0 + 1
            r1.A0C = r0
            A0K(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6150Dws.A0Q(X.DxT, long):boolean");
    }

    public static boolean A0R(C6153Dwv c6153Dwv, C6150Dws c6150Dws) {
        if (!c6150Dws.A0f || c6150Dws.A0m || A0P(c6153Dwv.A06)) {
            return false;
        }
        return !c6153Dwv.A0B || DummySurface.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r3 != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0S(X.C6150Dws r8, long r9, long r11) {
        /*
            long r1 = r8.A02
            r3 = 200000(0x30d40, double:9.8813E-319)
            long r1 = r1 + r3
            r7 = 1
            r6 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            boolean r5 = X.AnonymousClass002.A1N(r0)
            long r1 = r8.A1N
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            boolean r4 = X.AnonymousClass002.A1L(r0)
            boolean r0 = r8.A1H
            if (r0 == 0) goto L8e
            int r0 = r8.A0y
            if (r0 <= 0) goto L8e
            X.Dwx r0 = r8.A0F
            if (r0 == 0) goto L8e
            java.lang.String r3 = r0.A0b
            java.lang.String r0 = "video/av01"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L8e
            boolean r0 = r8.A1I
            if (r0 != 0) goto L89
            r3 = 1
        L37:
            if (r4 != 0) goto L80
            if (r3 == 0) goto L50
        L3b:
            float r1 = r8.A0n
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r0 = r8.A0y
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L87
        L47:
            r1 = 1
        L48:
            if (r5 == 0) goto L4d
            r0 = 1
            if (r1 != 0) goto L4e
        L4d:
            r0 = 0
        L4e:
            r8.A0l = r0
        L50:
            X.DnI r0 = X.EnumC5679DnI.A03
            int r0 = X.AbstractC5653Dmh.A00(r0)
            if (r0 <= 0) goto L7c
            int r0 = -r0
            long r1 = (long) r0
        L5a:
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L90
            int r2 = X.AbstractC6146Dwo.A01(r8, r11)
            if (r2 == 0) goto L90
            X.DxG r1 = r8.A0G
            int r0 = r1.A06
            int r0 = r0 + 1
            r1.A06 = r0
            java.util.PriorityQueue<java.lang.Long> r0 = r8.A16
            int r0 = r0.size()
            int r2 = r2 + r0
            int r0 = r8.A03
            r8.A0C(r2, r0)
            r8.A0e()
            return r7
        L7c:
            r1 = -500000(0xfffffffffff85ee0, double:NaN)
            goto L5a
        L80:
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L47
            if (r3 == 0) goto L87
            goto L3b
        L87:
            r1 = 0
            goto L48
        L89:
            boolean r3 = r8.A0l()
            goto L37
        L8e:
            r3 = 0
            goto L37
        L90:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6150Dws.A0S(X.Dws, long, long):boolean");
    }

    @Override // X.AbstractC6147Dwp
    public void A0i(long j) {
        this.A03--;
        while (true) {
            int i = this.A0p;
            if (i == 0) {
                return;
            }
            long[] jArr = this.A1X;
            if (j < jArr[0]) {
                return;
            }
            long[] jArr2 = this.A1W;
            this.A0u = jArr2[0];
            int i2 = i - 1;
            this.A0p = i2;
            System.arraycopy(jArr2, 1, jArr2, 0, i2);
            System.arraycopy(jArr, 1, jArr, 0, this.A0p);
            C6192Dxc c6192Dxc = this.A13;
            if (c6192Dxc != null) {
                c6192Dxc.A01 = Math.min(c6192Dxc.A01, 2);
            }
        }
    }

    @Override // X.AbstractC6147Dwp
    public void A0k(Di2 di2) {
        ByteBuffer byteBuffer;
        C6153Dwv c6153Dwv;
        ByteBuffer byteBuffer2;
        if (this.A1V && (c6153Dwv = super.A0O) != null && "video/av01".equals(c6153Dwv.A05) && (byteBuffer2 = di2.A01) != null && !AnonymousClass002.A1Q(((AbstractC5364DhG) di2).A00 & 1073741824, 1073741824)) {
            AbstractC3150Bzk.A00(byteBuffer2);
        }
        Dy1 dy1 = this.A11;
        if (dy1 != null) {
            C6153Dwv c6153Dwv2 = super.A0O;
            c6153Dwv2.getClass();
            if (c6153Dwv2.A05.equals("video/av01") && (byteBuffer = di2.A01) != null) {
                Dy1.A00(dy1, A07(byteBuffer));
            }
        }
        this.A04 = 0;
        this.A03++;
        this.A0t = Math.max(di2.A00, this.A0t);
    }

    public final boolean A0o() {
        return this.A1T && Boolean.TRUE.equals(this.A1Y);
    }

    @Override // X.AbstractC6147Dwp, X.InterfaceC6068Dv6
    public final void Aaz(long j, long j2) throws ExoPlaybackException {
        C6154Dwx c6154Dwx = this.A0v;
        if (c6154Dwx != null && ((AbstractC6147Dwp) this).A0F == null && super.A0N == null) {
            ((AbstractC6147Dwp) this).A0F = c6154Dwx;
            this.A0v = null;
        }
        super.Aaz(j, j2);
    }

    @Override // X.InterfaceC6068Dv6, X.InterfaceC5921Ds8
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // X.InterfaceC6068Dv6
    public final boolean isEnded() {
        return super.A0X;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a A[PHI: r9
  0x002a: PHI (r9v1 boolean) = (r9v0 boolean), (r9v2 boolean), (r9v0 boolean) binds: [B:4:0x000a, B:18:0x0027, B:8:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC6147Dwp, X.InterfaceC6068Dv6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isReady() {
        /*
            r10 = this;
            X.Dxc r7 = r10.A13
            r9 = 0
            r8 = 1
            boolean r0 = super.isReady()
            if (r7 == 0) goto L53
            if (r0 == 0) goto L2a
            boolean r0 = r10.A0x
            if (r0 == 0) goto L14
            android.view.Surface r0 = r10.A0R
            if (r0 == 0) goto L2a
        L14:
            r9 = 1
            X.DxP r0 = r10.A0N
            if (r0 == 0) goto L29
            boolean r0 = r10.A19
            if (r0 == 0) goto L25
            boolean r0 = r10.A1P
            if (r0 == 0) goto L29
            boolean r0 = r10.A0w
            if (r0 != 0) goto L29
        L25:
            boolean r0 = r10.A0m
            if (r0 == 0) goto L2a
        L29:
            return r8
        L2a:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 == 0) goto L41
            int r1 = r7.A01
            r0 = 3
            if (r1 == r0) goto L3e
            boolean r0 = r7.A07
            if (r0 != 0) goto L41
            boolean r0 = r7.A06
            if (r0 == 0) goto L41
        L3e:
            r7.A03 = r5
            return r8
        L41:
            long r3 = r7.A03
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L51
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L29
            r7.A03 = r5
        L51:
            r8 = 0
            return r8
        L53:
            if (r0 == 0) goto L6d
            boolean r0 = r10.A0j
            if (r0 != 0) goto L6d
            android.view.Surface r1 = r10.A0Q
            if (r1 == 0) goto L61
            android.view.Surface r0 = r10.A0R
            if (r0 == r1) goto L6d
        L61:
            X.DxP r0 = r10.A0N
            if (r0 == 0) goto L6d
            boolean r0 = r10.A0m
            if (r0 != 0) goto L6d
            java.lang.Integer r0 = X.C79.A0P
            r10.A0J = r0
        L6d:
            boolean r0 = super.isReady()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto La3
            boolean r0 = r10.A0x
            if (r0 == 0) goto L80
            android.view.Surface r0 = r10.A0R
            if (r0 == 0) goto La3
        L80:
            boolean r0 = r10.A0j
            if (r0 != 0) goto La0
            android.view.Surface r1 = r10.A0Q
            if (r1 == 0) goto L8c
            android.view.Surface r0 = r10.A0R
            if (r0 == r1) goto La0
        L8c:
            X.DxP r0 = r10.A0N
            if (r0 == 0) goto La0
            boolean r0 = r10.A19
            if (r0 == 0) goto L9c
            boolean r0 = r10.A1P
            if (r0 == 0) goto La0
            boolean r0 = r10.A0w
            if (r0 != 0) goto La0
        L9c:
            boolean r0 = r10.A0m
            if (r0 == 0) goto La3
        La0:
            r10.A0J = r5
            return r8
        La3:
            long r3 = r10.A0J
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto Lb3
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L29
            r10.A0J = r5
        Lb3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6150Dws.isReady():boolean");
    }

    public static List<C6267DzK> A07(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayListA0h = C3cG.A0h();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b = byteBufferAsReadOnlyBuffer.get();
            int i = (b >> 3) & 15;
            if (((b >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            if (((b >> 1) & 1) != 0) {
                int i2 = 0;
                iRemaining = 0;
                do {
                    byte b2 = byteBufferAsReadOnlyBuffer.get();
                    iRemaining |= (b2 & Byte.MAX_VALUE) << (i2 * 7);
                    if ((b2 & 128) != 0) {
                        i2++;
                    }
                } while (i2 < 8);
            } else {
                iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            }
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            arrayListA0h.add(new C6267DzK(i, byteBufferDuplicate));
            BV7.A1L(byteBufferAsReadOnlyBuffer, iRemaining);
        }
        return arrayListA0h;
    }

    public static final void A0D(InterfaceC6185DxT interfaceC6185DxT) {
        interfaceC6185DxT.A8w();
    }

    private final void A0E(InterfaceC6185DxT interfaceC6185DxT, int i) {
        C0Q.A01("skipVideoBuffer");
        interfaceC6185DxT.releaseOutputBuffer(i, false);
        C0Q.A00();
        ((AbstractC6147Dwp) this).A0G.A0E++;
    }

    @Override // X.AbstractC6147Dwp, X.AbstractC6146Dwo
    public final void A0W() {
        if (A0o()) {
            this.A1Z = null;
            this.A0X = null;
            A0I(this);
        }
        if (this.A1G || AbstractC5653Dmh.A03(EnumC5618Dlz.A1R)) {
            try {
                super.A0W();
                Surface surface = this.A0Q;
                if (surface != null) {
                    if (this.A0R == surface) {
                        this.A0R = null;
                    }
                    surface.release();
                    this.A0Q = null;
                }
            } catch (Throwable th) {
                Surface surface2 = this.A0Q;
                if (surface2 != null) {
                    if (this.A0R == surface2) {
                        this.A0R = null;
                    }
                    surface2.release();
                    this.A0Q = null;
                }
                throw th;
            }
        }
    }

    @Override // X.AbstractC6147Dwp, X.AbstractC6146Dwo
    public final void A0X() {
        if (A0o()) {
            this.A1Z = null;
            this.A0X = null;
            A0I(this);
        }
        this.A0M = -9223372036854775807L;
        this.A06 = -1;
        this.A05 = -1;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0u = -9223372036854775807L;
        this.A0t = -9223372036854775807L;
        this.A0p = 0;
        this.A0D = -1;
        this.A0B = -1;
        this.A02 = -1.0f;
        this.A0C = -1;
        A0J(this);
        C6178DxM c6178DxM = this.A1O;
        if (c6178DxM.A09 != null) {
            DyH dyH = c6178DxM.A0A;
            if (dyH != null) {
                dyH.A00.unregisterDisplayListener(dyH);
            }
            c6178DxM.A0B.A02.sendEmptyMessage(2);
        }
        this.A0Z = null;
        this.A0m = false;
        this.A08 = 0;
        this.A09 = 0;
        this.A0k = false;
        this.A0N = 0L;
        this.A0O = -9223372036854775807L;
        try {
            super.A0X();
            synchronized (((AbstractC6147Dwp) this).A0G) {
            }
            this.A14.A01(((AbstractC6147Dwp) this).A0G);
        } catch (Throwable th) {
            synchronized (((AbstractC6147Dwp) this).A0G) {
                this.A14.A01(((AbstractC6147Dwp) this).A0G);
                throw th;
            }
        }
    }

    @Override // X.AbstractC6147Dwp, X.AbstractC6146Dwo
    public final void A0Y(long j, boolean z) {
        super.A0Y(j, z);
        A0J(this);
        this.A0O = -9223372036854775807L;
        if (this.A1G) {
            C6171DxE.A01(this.A18);
        }
        this.A0r = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A0t = -9223372036854775807L;
        this.A08 = 0;
        this.A09 = 0;
        int i = this.A0p;
        if (i != 0) {
            this.A0u = this.A1W[i - 1];
            this.A0p = 0;
        }
        if (z) {
            long j2 = this.A0z;
            this.A0J = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        } else {
            this.A0J = -9223372036854775807L;
        }
        C6192Dxc c6192Dxc = this.A13;
        if (c6192Dxc != null) {
            C6169DxC c6169DxC = c6192Dxc.A0C;
            c6169DxC.A03 = 0L;
            c6169DxC.A04 = -1L;
            c6169DxC.A06 = -1L;
            c6192Dxc.A04 = -9223372036854775807L;
            c6192Dxc.A02 = -9223372036854775807L;
            c6192Dxc.A01 = Math.min(c6192Dxc.A01, 1);
            c6192Dxc.A03 = -9223372036854775807L;
            if (z) {
                long j3 = c6192Dxc.A0A;
                c6192Dxc.A03 = j3 > 0 ? SystemClock.elapsedRealtime() + j3 : -9223372036854775807L;
            }
        }
        A0K(this);
    }

    @Override // X.AbstractC6146Dwo
    public void A0Z(Dy6 dy6, C6154Dwx[] c6154DwxArr, long j, long j2) {
        long j3;
        if (A0o()) {
            this.A0X = this.A1Z;
            A0I(this);
        }
        if (this.A0u == -9223372036854775807L) {
            this.A0u = j2;
        } else {
            int i = this.A0p;
            long[] jArr = this.A1W;
            if (i == jArr.length) {
                CNC.A04("MediaCodecVideoRenderer", FGI.A0B(jArr[i - 1], "Too many stream changes, so dropping offset: "));
            } else {
                this.A0p = i + 1;
            }
            int i2 = this.A0p - 1;
            jArr[i2] = j2;
            this.A1X[i2] = this.A0t;
        }
        if (this.A1H) {
            Timeline timeline = ((AbstractC6146Dwo) this).A05;
            if (AnonymousClass002.A1M(timeline.A02())) {
                j3 = -9223372036854775807L;
            } else {
                dy6.getClass();
                j3 = timeline.A0B(new E6B(), dy6.A04).A01;
            }
            this.A0M = j3;
        }
    }

    @Override // X.AbstractC6147Dwp, X.AbstractC6146Dwo
    public final void A0a(boolean z, boolean z2) {
        super.A0a(z, z2);
        C5951Dsl c5951Dsl = ((AbstractC6146Dwo) this).A08;
        c5951Dsl.getClass();
        this.A0m = c5951Dsl.A00;
        C6205Dxp c6205Dxp = this.A14;
        C6173DxG c6173DxG = ((AbstractC6147Dwp) this).A0G;
        Handler handler = c6205Dxp.A00;
        if (handler != null) {
            handler.post(new RunnableC6241Dyk(c6173DxG, c6205Dxp));
        }
        C6178DxM c6178DxM = this.A1O;
        c6178DxM.A08 = false;
        if (c6178DxM.A09 != null) {
            c6178DxM.A0B.A02.sendEmptyMessage(1);
            DyH dyH = c6178DxM.A0A;
            if (dyH != null) {
                dyH.A00.registerDisplayListener(dyH, null);
            }
            C6178DxM.A00(c6178DxM);
        }
        C6192Dxc c6192Dxc = this.A13;
        if (c6192Dxc != null) {
            c6192Dxc.A01 = 1;
        }
    }

    @Override // X.AbstractC6147Dwp
    public final void A0e() {
        C6154Dwx c6154Dwx;
        super.A0e();
        this.A03 = 0;
        this.A04 = 0;
        this.A16.clear();
        this.A0l = false;
        Dy1 dy1 = this.A11;
        if (dy1 != null) {
            dy1.A00 = null;
        }
        if (!this.A1E || (c6154Dwx = ((AbstractC6147Dwp) this).A0E) == null) {
            return;
        }
        String str = c6154Dwx.A0b;
        if ("video/hevc".equals(str) || "video/dolby-vision".equals(str)) {
            this.A0i = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC6147Dwp
    public final void A0f() {
        if (A0o()) {
            A0I(this);
        }
        try {
            super.A0f();
        } finally {
            this.A03 = 0;
            this.A04 = 0;
            Dy1 dy1 = this.A11;
            if (dy1 != null) {
                dy1.A00 = null;
            }
            this.A16.clear();
            this.A0l = false;
            Surface surface = this.A0Q;
            if (surface != null) {
                if (this.A0R == surface) {
                    this.A0R = null;
                }
                surface.release();
                this.A0Q = null;
            }
        }
    }

    @Override // X.AbstractC6147Dwp, X.AbstractC6146Dwo, X.InterfaceC6068Dv6
    public final void Ae2(float f, float f2) {
        super.Ae2(f, f2);
        this.A0n = f2;
        C6192Dxc c6192Dxc = this.A13;
        if (c6192Dxc != null) {
            C1G.A07(AnonymousClass002.A1N((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
            if (f != c6192Dxc.A00) {
                c6192Dxc.A00 = f;
                C6169DxC c6169DxC = c6192Dxc.A0C;
                c6169DxC.A01 = f;
                c6169DxC.A03 = 0L;
                c6169DxC.A04 = -1L;
                c6169DxC.A06 = -1L;
                C6169DxC.A02(c6169DxC, false);
            }
        }
        if (this.A1F) {
            C6171DxE c6171DxE = this.A18;
            c6171DxE.A00 = f;
            C6171DxE.A01(c6171DxE);
            C6171DxE.A03(c6171DxE, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6150Dws(android.content.Context r18, android.os.Handler r19, X.C6154Dwx r20, X.InterfaceC5460Div r21, X.InterfaceC6243Dym r22, X.BVV r23, X.C6175DxI r24, com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener r25, X.InterfaceC2356BVg r26, float r27, int r28, int r29, int r30, int r31, int r32, long r33, long r35, boolean r37, boolean r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6150Dws.<init>(android.content.Context, android.os.Handler, X.Dwx, X.Div, X.Dym, X.BVV, X.DxI, com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener, X.BVg, float, int, int, int, int, int, long, long, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r9 > 100000) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b2, code lost:
    
        if (r3 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d1, code lost:
    
        if (r37 >= (-9223372036854775807L)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01d6, code lost:
    
        if (r5 != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0307, code lost:
    
        if (r4 < (-30000)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0179, code lost:
    
        if (r0.A00 < 30000) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04bb A[Catch: IllegalStateException -> 0x050d, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x050d, blocks: (B:276:0x04ac, B:278:0x04bb), top: B:311:0x0332 }] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x02d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0145  */
    @Override // X.AbstractC6147Dwp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0m(java.nio.ByteBuffer r33, X.InterfaceC6185DxT r34, int r35, int r36, long r37, long r39, long r41, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6150Dws.A0m(java.nio.ByteBuffer, X.DxT, int, int, long, long, long, boolean, boolean):boolean");
    }
}
