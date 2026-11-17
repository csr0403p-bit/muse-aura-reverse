package X;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.util.Util;
import java.util.List;

/* renamed from: X.Dwv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6153Dwv {
    public float A00;
    public int A01;
    public int A02;
    public final MediaCodecInfo.CodecCapabilities A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[PHI: r9
  0x001b: PHI (r9v2 boolean) = (r9v0 boolean), (r9v3 boolean) binds: [B:8:0x000f, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[PHI: r9
  0x0011: PHI (r9v3 boolean) = (r9v0 boolean), (r9v4 boolean) binds: [B:8:0x000f, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C6153Dwv A00(android.media.MediaCodecInfo.CodecCapabilities r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r2 = r12
            if (r19 != 0) goto Le
            if (r12 == 0) goto Le
            java.lang.String r0 = "adaptive-playback"
            boolean r0 = r12.isFeatureSupported(r0)
            r9 = 1
            if (r0 != 0) goto L11
        Le:
            r9 = 0
            if (r12 == 0) goto L1b
        L11:
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r12.isFeatureSupported(r0)
            r10 = 1
            if (r0 != 0) goto L1c
        L1b:
            r10 = 0
        L1c:
            if (r20 != 0) goto L28
            if (r12 == 0) goto L52
            java.lang.String r0 = "secure-playback"
            boolean r0 = r12.isFeatureSupported(r0)
            if (r0 == 0) goto L52
        L28:
            r11 = 1
        L29:
            int r1 = androidx.media3.common.util.Util.A00
            r0 = 35
            if (r1 < r0) goto L42
            if (r12 == 0) goto L42
            X.Dlz r0 = X.EnumC5618Dlz.A0j
            boolean r0 = X.AbstractC5653Dmh.A03(r0)
            if (r0 == 0) goto L42
            java.lang.String r0 = "detached-surface"
            boolean r0 = r12.isFeatureSupported(r0)
            r12 = 1
            if (r0 != 0) goto L43
        L42:
            r12 = 0
        L43:
            X.Dwv r1 = new X.Dwv
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L52:
            r11 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6153Dwv.A00(android.media.MediaCodecInfo$CodecCapabilities, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean):X.Dwv");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[PHI: r7
  0x0053: PHI (r7v14 int) = (r7v6 int), (r7v18 int) binds: [B:47:0x0090, B:25:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2461Bbo A04(X.C6154Dwx r7, X.C6154Dwx r8) {
        /*
            r6 = this;
            r3 = r7
            java.lang.String r1 = r7.A0b
            r4 = r8
            java.lang.String r0 = r8.A0b
            boolean r0 = X.C6xC.A00(r1, r0)
            r7 = 0
            if (r0 != 0) goto Lf
            r7 = 8
        Lf:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L68
            int r1 = r3.A0K
            int r0 = r8.A0K
            if (r1 == r0) goto L1b
            r7 = r7 | 1024(0x400, float:1.435E-42)
        L1b:
            boolean r0 = r6.A07
            if (r0 != 0) goto L2d
            int r1 = r3.A0Q
            int r0 = r8.A0Q
            if (r1 != r0) goto L2b
            int r1 = r3.A0D
            int r0 = r8.A0D
            if (r1 == r0) goto L2d
        L2b:
            r7 = r7 | 512(0x200, float:7.175E-43)
        L2d:
            X.DxO r1 = r3.A0S
            X.DxO r0 = r8.A0S
            boolean r0 = X.C6xC.A00(r1, r0)
            if (r0 != 0) goto L39
            r7 = r7 | 2048(0x800, float:2.87E-42)
        L39:
            java.lang.String r5 = r6.A06
            java.lang.String r1 = androidx.media3.common.util.Util.A04
            java.lang.String r0 = "SM-T230"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L5e
            java.lang.String r0 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L5e
            boolean r0 = r3.A01(r8)
            if (r0 != 0) goto L5e
        L53:
            r7 = r7 | 2
        L55:
            java.lang.String r5 = r6.A06
            r6 = 0
        L58:
            X.Bbo r2 = new X.Bbo
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L5e:
            if (r7 != 0) goto L55
            boolean r0 = r3.A01(r8)
            r6 = 2
            if (r0 == 0) goto L97
            goto Lc1
        L68:
            int r1 = r3.A06
            int r0 = r8.A06
            if (r1 == r0) goto L70
            r7 = r7 | 4096(0x1000, float:5.74E-42)
        L70:
            int r1 = r3.A0L
            int r0 = r8.A0L
            if (r1 == r0) goto L78
            r7 = r7 | 8192(0x2000, float:1.14794E-41)
        L78:
            int r1 = r3.A0H
            int r0 = r8.A0H
            if (r1 == r0) goto L99
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
        L80:
            boolean r0 = r3.A01(r8)
            if (r0 != 0) goto L88
            r7 = r7 | 32
        L88:
            java.lang.String r1 = r6.A05
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L53
            if (r7 != 0) goto L55
            java.lang.String r5 = r6.A06
            r6 = 1
        L97:
            r7 = 0
            goto L58
        L99:
            if (r7 != 0) goto L80
            java.lang.String r1 = "audio/mp4a-latm"
            java.lang.String r0 = r6.A05
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L80
            android.util.Pair r1 = X.C6155Dwy.A00(r3)
            android.util.Pair r0 = X.C6155Dwy.A00(r8)
            if (r1 == 0) goto L80
            if (r0 == 0) goto L80
            int r2 = X.BV7.A08(r1)
            int r1 = X.BV7.A08(r0)
            r0 = 42
            if (r2 != r0) goto L80
            if (r1 != r0) goto L80
            java.lang.String r5 = r6.A06
        Lc1:
            r6 = 3
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6153Dwv.A04(X.Dwx, X.Dwx):X.Bbo");
    }

    public static void A01(String str, C6153Dwv c6153Dwv) {
        CNC.A01("MediaCodecInfo", FGI.A0m("NoSupport [", str, "] [", c6153Dwv.A06, ", ", c6153Dwv.A05, "] [", Util.A02, "]"));
    }

    public final boolean A05(int i) {
        String strA0H;
        int i2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A03;
        if (codecCapabilities == null) {
            strA0H = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                strA0H = "channelCount.aCaps";
            } else {
                String str = this.A06;
                String str2 = this.A05;
                int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    if ("audio/ac3".equals(str2)) {
                        i2 = 6;
                    } else {
                        boolean zEquals = "audio/eac3".equals(str2);
                        i2 = 30;
                        if (zEquals) {
                            i2 = 16;
                        }
                    }
                    StringBuilder sbA0x = C3cI.A0x("AssumedMaxChannelAdjustment: ", str);
                    sbA0x.append(", [");
                    sbA0x.append(maxInputChannelCount);
                    sbA0x.append(" to ");
                    sbA0x.append(i2);
                    CNC.A04("MediaCodecInfo", AnonymousClass001.A0v("]", sbA0x));
                    maxInputChannelCount = i2;
                }
                if (maxInputChannelCount >= i) {
                    return true;
                }
                strA0H = FGI.A0H("channelCount.support, ", i);
            }
        }
        A01(strA0H, this);
        return false;
    }

    public final boolean A06(int i) {
        String strA0H;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A03;
        if (codecCapabilities == null) {
            strA0H = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                strA0H = "sampleRate.aCaps";
            } else {
                if (audioCapabilities.isSampleRateSupported(i)) {
                    return true;
                }
                strA0H = FGI.A0H("sampleRate.support, ", i);
            }
        }
        A01(strA0H, this);
        return false;
    }

    public final boolean A07(int i, int i2, double d) {
        String string;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A03;
        if (codecCapabilities == null) {
            string = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
                if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
                    String str = Util.A01;
                    if (!str.equals("sabrina") && !str.equals("boreal")) {
                        String str2 = Util.A04;
                        if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
                            for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                                if (supportedPerformancePoints.get(i3).covers(performancePoint)) {
                                    return true;
                                }
                            }
                            StringBuilder sbA0y = C60O.A0y("sizeAndRate.cover, ", i);
                            BV7.A1G("x", "@", sbA0y, i2);
                            sbA0y.append(d);
                            string = sbA0y.toString();
                        }
                    }
                }
                if (!A02(videoCapabilities, d, i, i2)) {
                    if (i < i2) {
                        String str3 = this.A06;
                        if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str3) || !"mcv5a".equals(Util.A01)) && A02(videoCapabilities, d, i2, i)) {
                            StringBuilder sbA0y2 = C60O.A0y("sizeAndRate.rotated, ", i);
                            BV7.A1G("x", "@", sbA0y2, i2);
                            sbA0y2.append(d);
                            CNC.A01("MediaCodecInfo", FGI.A0m("AssumedSupport [", sbA0y2.toString(), "] [", str3, ", ", this.A05, "] [", Util.A02, "]"));
                        }
                    }
                    StringBuilder sbA0y3 = C60O.A0y("sizeAndRate.support, ", i);
                    BV7.A1G("x", "@", sbA0y3, i2);
                    sbA0y3.append(d);
                    string = sbA0y3.toString();
                }
                return true;
            }
            string = "sizeAndRate.vCaps";
        }
        A01(string, this);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A08(X.C6154Dwx r6) {
        /*
            r5 = this;
            java.lang.String r3 = r5.A05
            boolean r0 = X.BV6.A1W(r6, r3)
            if (r0 != 0) goto L13
            java.lang.String r0 = X.C6155Dwy.A03(r6)
            boolean r1 = r3.equals(r0)
            r0 = 0
            if (r1 == 0) goto L14
        L13:
            r0 = 1
        L14:
            r2 = 0
            if (r0 == 0) goto L62
            r4 = 1
            boolean r0 = A03(r6, r5, r4)
            if (r0 == 0) goto L62
            boolean r0 = r5.A0A
            if (r0 == 0) goto L4c
            java.lang.String r0 = "video/av01"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L3c
            boolean r0 = r5.A0B
            if (r0 != 0) goto L3c
            boolean r0 = r5.A0D
            if (r0 != 0) goto L3c
            java.lang.String r0 = r5.A06
            boolean r0 = X.C6155Dwy.A07(r6, r0)
            if (r0 == 0) goto L3c
        L3b:
            return r4
        L3c:
            int r3 = r6.A0Q
            if (r3 <= 0) goto L3b
            int r2 = r6.A0D
            if (r2 <= 0) goto L3b
            float r0 = r6.A01
            double r0 = (double) r0
            boolean r4 = r5.A07(r3, r2, r0)
            return r4
        L4c:
            int r0 = r6.A0L
            r1 = -1
            if (r0 == r1) goto L57
            boolean r0 = r5.A06(r0)
            if (r0 == 0) goto L62
        L57:
            int r0 = r6.A06
            if (r0 == r1) goto L3b
            boolean r0 = r5.A05(r0)
            if (r0 == 0) goto L62
            return r4
        L62:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6153Dwv.A08(X.Dwx):boolean");
    }

    public final boolean A09(C6154Dwx c6154Dwx) {
        if (this.A0A) {
            return this.A07;
        }
        Pair<Integer, Integer> pairA00 = C6155Dwy.A00(c6154Dwx);
        return pairA00 != null && BV7.A08(pairA00) == 42;
    }

    public final String toString() {
        return this.A06;
    }

    public C6153Dwv(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A03 = codecCapabilities;
        this.A09 = z;
        this.A0C = z2;
        this.A0E = z3;
        this.A07 = z4;
        this.A0D = z5;
        this.A0B = z6;
        this.A08 = z7;
        this.A0A = BV7.A1Z(str2, "video");
        this.A00 = -3.4028235E38f;
        this.A02 = -1;
        this.A01 = -1;
    }

    public static boolean A02(MediaCodecInfo.VideoCapabilities videoCapabilities, double d, int i, int i2) {
        Point pointA0O = BV8.A0O(videoCapabilities, i, i2);
        int i3 = pointA0O.x;
        int i4 = pointA0O.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A03(X.C6154Dwx r11, X.C6153Dwv r12, boolean r13) {
        /*
            android.util.Pair r0 = X.C6155Dwy.A00(r11)
            r10 = 1
            if (r0 == 0) goto L30
            int r7 = X.BV7.A08(r0)
            int r6 = X.BV7.A07(r0)
            java.lang.String r0 = "video/dolby-vision"
            boolean r0 = X.BV6.A1W(r11, r0)
            r4 = 0
            if (r0 == 0) goto L27
            java.lang.String r0 = "video/avc"
            java.lang.String r1 = r12.A05
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L87
            r7 = 8
            r6 = 0
        L27:
            r9 = 0
        L28:
            boolean r0 = r12.A0A
            if (r0 != 0) goto L31
            r0 = 42
            if (r7 == r0) goto L31
        L30:
            return r10
        L31:
            android.media.MediaCodecInfo$CodecCapabilities r1 = r12.A03
            if (r1 == 0) goto L39
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r1.profileLevels
            if (r0 != 0) goto L3b
        L39:
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r4]
        L3b:
            int r0 = r0.length
            if (r0 <= 0) goto L30
            if (r1 == 0) goto L44
            android.media.MediaCodecInfo$CodecProfileLevel[] r5 = r1.profileLevels
            if (r5 != 0) goto L46
        L44:
            android.media.MediaCodecInfo$CodecProfileLevel[] r5 = new android.media.MediaCodecInfo.CodecProfileLevel[r4]
        L46:
            int r3 = r5.length
            r2 = 0
        L48:
            if (r2 >= r3) goto La6
            r8 = r5[r2]
            int r0 = r8.profile
            if (r0 == r7) goto L5e
            if (r9 == 0) goto L84
            int r1 = r8.profile
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 == r0) goto L5e
            int r1 = r8.profile
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 != r0) goto L84
        L5e:
            int r0 = r8.level
            if (r0 >= r6) goto L64
            if (r13 != 0) goto L84
        L64:
            java.lang.String r1 = r12.A05
            java.lang.String r0 = "video/hevc"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            r0 = 2
            if (r0 != r7) goto L30
            java.lang.String r0 = "sailfish"
            java.lang.String r1 = androidx.media3.common.util.Util.A01
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L84
            java.lang.String r0 = "marlin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
        L84:
            int r2 = r2 + 1
            goto L48
        L87:
            java.lang.String r0 = "video/hevc"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L93
            r6 = 0
            r7 = 2
            goto L27
        L93:
            java.lang.String r0 = "video/av01"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L27
            boolean r0 = X.C6155Dwy.A06(r11)
            if (r0 == 0) goto L27
            r6 = 0
            r7 = 2
            r9 = 1
            goto L28
        La6:
            java.lang.String r3 = "codec.profileLevel, "
            java.lang.String r2 = r11.A0W
            java.lang.String r1 = ", "
            java.lang.String r0 = r12.A04
            java.lang.String r0 = X.FGI.A0d(r3, r2, r1, r0)
            A01(r0, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6153Dwv.A03(X.Dwx, X.Dwv, boolean):boolean");
    }
}
