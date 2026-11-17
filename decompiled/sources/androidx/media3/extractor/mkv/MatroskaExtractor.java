package androidx.media3.extractor.mkv;

import X.AbstractC6381E3i;
import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BV7;
import X.BV8;
import X.C1G;
import X.C6195Dxf;
import X.C6316E0o;
import X.C6407E4j;
import X.E1P;
import X.E2K;
import X.E2X;
import X.E3S;
import X.E3U;
import X.E3Z;
import X.FGI;
import X.InterfaceC5458Dit;
import X.InterfaceC5563Dkg;
import X.InterfaceC5885DrL;
import X.InterfaceC6413E4p;
import X.InterfaceC6425E5b;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class MatroskaExtractor implements InterfaceC5458Dit {
    public static final Map<String, Integer> A0v;
    public byte A00;
    public int A01;
    public int A02;
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
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    public C6316E0o A0P;
    public C6316E0o A0Q;
    public InterfaceC6413E4p A0R;
    public E2X A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public int[] A0c;
    public ByteBuffer A0d;
    public boolean A0e;
    public final SparseArray<E2X> A0f;
    public final E1P A0g;
    public final E1P A0h;
    public final E1P A0i;
    public final E1P A0j;
    public final E1P A0k;
    public final E3Z A0l;
    public final boolean A0m;
    public final E1P A0n;
    public final E1P A0o;
    public final E1P A0p;
    public final E1P A0q;
    public final E1P A0r;
    public final InterfaceC6425E5b A0s;
    public final InterfaceC5885DrL A0t;
    public final boolean A0u;
    public static final byte[] A0z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] A0x = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
    public static final byte[] A0y = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] A10 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public static final UUID A0w = new UUID(72057594037932032L, -9223371306706625679L);

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    static {
        HashMap mapA0u = BV4.A0u();
        mapA0u.put("htc_video_rotA-000", BV4.A0V());
        mapA0u.put("htc_video_rotA-090", 90);
        mapA0u.put("htc_video_rotA-180", 180);
        mapA0u.put("htc_video_rotA-270", 270);
        A0v = Collections.unmodifiableMap(mapA0u);
    }

    @Deprecated
    public MatroskaExtractor(int i) {
        this(new E3S(), InterfaceC5885DrL.A00, i | 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static int A00(E2K e2k, E2X e2x, MatroskaExtractor matroskaExtractor, int i, boolean z) throws ParserException {
        byte[] bArr;
        ?? r2;
        int iAbu;
        int iAbu2;
        int i2;
        String str = e2x.A0f;
        if ("S_TEXT/UTF8".equals(str)) {
            bArr = A0z;
        } else if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            bArr = A0y;
        } else {
            if (!"S_TEXT/WEBVTT".equals(str)) {
                InterfaceC5563Dkg interfaceC5563Dkg = e2x.A0d;
                r2 = 0;
                r2 = 0;
                if (!matroskaExtractor.A0V) {
                    if (e2x.A0l) {
                        matroskaExtractor.A02 &= -1073741825;
                        if (!matroskaExtractor.A0Y) {
                            E1P e1p = matroskaExtractor.A0h;
                            e2k.readFully(e1p.A02, 0, 1);
                            matroskaExtractor.A08++;
                            byte b = e1p.A02[0];
                            if ((b & 128) == 128) {
                                throw BV7.A0c("Extension bit is set in signal byte");
                            }
                            matroskaExtractor.A00 = b;
                            matroskaExtractor.A0Y = true;
                        }
                        byte b2 = matroskaExtractor.A00;
                        if ((b2 & 1) == 1) {
                            boolean zA1Q = AnonymousClass002.A1Q(b2 & 2, 2);
                            matroskaExtractor.A02 |= 1073741824;
                            if (!matroskaExtractor.A0W) {
                                E1P e1p2 = matroskaExtractor.A0n;
                                e2k.readFully(e1p2.A02, 0, 8);
                                matroskaExtractor.A08 += 8;
                                matroskaExtractor.A0W = true;
                                E1P e1p3 = matroskaExtractor.A0h;
                                e1p3.A02[0] = (byte) ((zA1Q ? 128 : 0) | 8);
                                e1p3.A0R(0);
                                interfaceC5563Dkg.Abw(e1p3, 1, 1);
                                matroskaExtractor.A09++;
                                e1p2.A0R(0);
                                interfaceC5563Dkg.Abw(e1p2, 8, 1);
                                matroskaExtractor.A09 += 8;
                            }
                            if (zA1Q) {
                                if (!matroskaExtractor.A0X) {
                                    E1P e1p4 = matroskaExtractor.A0h;
                                    e2k.readFully(e1p4.A02, 0, 1);
                                    matroskaExtractor.A08++;
                                    e1p4.A0R(0);
                                    matroskaExtractor.A0B = e1p4.A0A();
                                    matroskaExtractor.A0X = true;
                                }
                                int i3 = matroskaExtractor.A0B * 4;
                                E1P e1p5 = matroskaExtractor.A0h;
                                e1p5.A0P(i3);
                                e2k.readFully(e1p5.A02, 0, i3);
                                matroskaExtractor.A08 += i3;
                                short s = (short) ((matroskaExtractor.A0B / 2) + 1);
                                int i4 = (s * 6) + 2;
                                ByteBuffer byteBuffer = matroskaExtractor.A0d;
                                if (byteBuffer == null || byteBuffer.capacity() < i4) {
                                    matroskaExtractor.A0d = ByteBuffer.allocate(i4);
                                }
                                matroskaExtractor.A0d.position(0);
                                matroskaExtractor.A0d.putShort(s);
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    i2 = matroskaExtractor.A0B;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    int iA0C = e1p5.A0C();
                                    int i7 = i5 % 2;
                                    ByteBuffer byteBuffer2 = matroskaExtractor.A0d;
                                    int i8 = iA0C - i6;
                                    if (i7 == 0) {
                                        byteBuffer2.putShort((short) i8);
                                    } else {
                                        byteBuffer2.putInt(i8);
                                    }
                                    i5++;
                                    i6 = iA0C;
                                }
                                int i9 = (i - matroskaExtractor.A08) - i6;
                                int i10 = i2 % 2;
                                ByteBuffer byteBuffer3 = matroskaExtractor.A0d;
                                if (i10 == 1) {
                                    byteBuffer3.putInt(i9);
                                } else {
                                    byteBuffer3.putShort((short) i9);
                                    matroskaExtractor.A0d.putInt(0);
                                }
                                E1P e1p6 = matroskaExtractor.A0o;
                                e1p6.A0T(matroskaExtractor.A0d.array(), i4);
                                interfaceC5563Dkg.Abw(e1p6, i4, 1);
                                matroskaExtractor.A09 += i4;
                            }
                        }
                    } else {
                        byte[] bArr2 = e2x.A0q;
                        if (bArr2 != null) {
                            matroskaExtractor.A0g.A0T(bArr2, bArr2.length);
                        }
                    }
                    if (!"A_OPUS".equals(e2x.A0f) ? e2x.A0P > 0 : z) {
                        matroskaExtractor.A02 |= 268435456;
                        matroskaExtractor.A0k.A0P(0);
                        int i11 = (matroskaExtractor.A0g.A00 + i) - matroskaExtractor.A08;
                        E1P e1p7 = matroskaExtractor.A0h;
                        e1p7.A0P(4);
                        byte[] bArr3 = e1p7.A02;
                        BV5.A1C(i11 >> 24, bArr3, 0);
                        BV5.A1C(i11 >> 16, bArr3, 1);
                        BV5.A1C(i11 >> 8, bArr3, 2);
                        bArr3[3] = (byte) (i11 & 255);
                        interfaceC5563Dkg.Abw(e1p7, 4, 2);
                        matroskaExtractor.A09 += 4;
                    }
                    matroskaExtractor.A0V = true;
                }
                E1P e1p8 = matroskaExtractor.A0g;
                int i12 = e1p8.A00;
                int i13 = i + i12;
                String str2 = e2x.A0f;
                if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
                    E3U e3u = e2x.A0e;
                    if (e3u != null) {
                        C1G.A08(i12 == 0);
                        e3u.A00(e2k);
                    }
                    while (true) {
                        int i14 = matroskaExtractor.A08;
                        if (i14 >= i13) {
                            break;
                        }
                        int i15 = i13 - i14;
                        int iA04 = e1p8.A04();
                        if (iA04 > 0) {
                            iAbu2 = Math.min(i15, iA04);
                            interfaceC5563Dkg.Abv(e1p8, iAbu2);
                        } else {
                            iAbu2 = interfaceC5563Dkg.Abu(e2k, i15, false);
                        }
                        matroskaExtractor.A08 += iAbu2;
                        matroskaExtractor.A09 += iAbu2;
                    }
                } else {
                    E1P e1p9 = matroskaExtractor.A0p;
                    byte[] bArr4 = e1p9.A02;
                    bArr4[0] = 0;
                    bArr4[1] = 0;
                    bArr4[2] = 0;
                    int i16 = e2x.A0S;
                    int i17 = 4 - i16;
                    while (matroskaExtractor.A08 < i13) {
                        int i18 = matroskaExtractor.A0A;
                        int iA042 = e1p8.A04();
                        if (i18 == 0) {
                            int iMin = Math.min(i16, iA042);
                            e2k.readFully(bArr4, i17 + iMin, i16 - iMin);
                            if (iMin > 0) {
                                e1p8.A0U(bArr4, i17, iMin);
                            }
                            matroskaExtractor.A08 += i16;
                            matroskaExtractor.A0A = BV6.A04(e1p9, 0);
                            E1P e1p10 = matroskaExtractor.A0q;
                            e1p10.A0R(0);
                            interfaceC5563Dkg.Abv(e1p10, 4);
                            matroskaExtractor.A09 += 4;
                        } else {
                            if (iA042 > 0) {
                                iAbu = Math.min(i18, iA042);
                                interfaceC5563Dkg.Abv(e1p8, iAbu);
                            } else {
                                iAbu = interfaceC5563Dkg.Abu(e2k, i18, false);
                            }
                            matroskaExtractor.A08 += iAbu;
                            matroskaExtractor.A09 += iAbu;
                            matroskaExtractor.A0A -= iAbu;
                        }
                    }
                }
                if ("A_VORBIS".equals(e2x.A0f)) {
                    E1P e1p11 = matroskaExtractor.A0r;
                    e1p11.A0R(0);
                    interfaceC5563Dkg.Abv(e1p11, 4);
                    matroskaExtractor.A09 += 4;
                }
                int i19 = matroskaExtractor.A09;
                matroskaExtractor.A08 = r2;
                matroskaExtractor.A09 = r2;
                matroskaExtractor.A0A = r2;
                matroskaExtractor.A0V = r2;
                matroskaExtractor.A0Y = r2;
                matroskaExtractor.A0X = r2;
                matroskaExtractor.A0B = r2;
                matroskaExtractor.A00 = r2;
                matroskaExtractor.A0W = r2;
                matroskaExtractor.A0g.A0P(r2);
                return i19;
            }
            bArr = A10;
        }
        int length = bArr.length;
        int i20 = length + i;
        E1P e1p12 = matroskaExtractor.A0j;
        byte[] bArr5 = e1p12.A02;
        r2 = 0;
        if (bArr5.length < i20) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i20 + i);
            e1p12.A0T(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr5, 0, length);
        }
        e2k.readFully(e1p12.A02, length, i);
        e1p12.A0R(0);
        e1p12.A0Q(i20);
        int i192 = matroskaExtractor.A09;
        matroskaExtractor.A08 = r2;
        matroskaExtractor.A09 = r2;
        matroskaExtractor.A0A = r2;
        matroskaExtractor.A0V = r2;
        matroskaExtractor.A0Y = r2;
        matroskaExtractor.A0X = r2;
        matroskaExtractor.A0B = r2;
        matroskaExtractor.A00 = r2;
        matroskaExtractor.A0W = r2;
        matroskaExtractor.A0g.A0P(r2);
        return i192;
    }

    public static long A01(MatroskaExtractor matroskaExtractor, long j) throws ParserException {
        long j2 = matroskaExtractor.A0O;
        if (j2 != -9223372036854775807L) {
            return Util.A0F(RoundingMode.DOWN, j, j2, 1000L);
        }
        throw BV8.A0c("Can't scale timecode prior to timecodeScale being set.");
    }

    public static void A03(E2K e2k, MatroskaExtractor matroskaExtractor, int i) {
        E1P e1p = matroskaExtractor.A0h;
        if (e1p.A00 < i) {
            int length = e1p.A02.length;
            if (length < i) {
                e1p.A0O(Math.max(length * 2, i));
            }
            byte[] bArr = e1p.A02;
            int i2 = e1p.A00;
            e2k.readFully(bArr, i2, i - i2);
            e1p.A0Q(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(X.E2X r13, androidx.media3.extractor.mkv.MatroskaExtractor r14, int r15, int r16, int r17, long r18) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.A04(X.E2X, androidx.media3.extractor.mkv.MatroskaExtractor, int, int, int, long):void");
    }

    public static void A05(MatroskaExtractor matroskaExtractor, int i) throws ParserException {
        if (matroskaExtractor.A0S == null) {
            throw BV8.A0c(FGI.A0I("Element ", i, " must be in a TrackEntry"));
        }
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        if (this.A0u) {
            interfaceC6413E4p = new C6195Dxf(interfaceC6413E4p, this.A0t);
        }
        this.A0R = interfaceC6413E4p;
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        E1P e1pA0Y = BV6.A0Y(8);
        long length = e2k.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        e2k.AXi(e1pA0Y.A02, 0, 4);
        long jA0H = e1pA0Y.A0H();
        int i2 = 4;
        while (true) {
            if (jA0H != 440786851) {
                i2++;
                if (i2 == i) {
                    break;
                }
                E2K.A01(e1pA0Y, e2k, 1);
                jA0H = ((jA0H << 8) & (-256)) | (e1pA0Y.A02[0] & 255);
            } else {
                int i3 = 0;
                e2k.AXi(e1pA0Y.A02, 0, 1);
                byte[] bArr = e1pA0Y.A02;
                int i4 = bArr[0] & 255;
                if (i4 != 0) {
                    int i5 = 128;
                    int i6 = 0;
                    while ((i4 & i5) == 0) {
                        i5 >>= 1;
                        i6++;
                    }
                    int i7 = i4 & (i5 ^ (-1));
                    e2k.AXi(bArr, 1, i6);
                    while (i3 < i6) {
                        i3++;
                        i7 = (e1pA0Y.A02[i3] & 255) + (i7 << 8);
                    }
                    int i8 = i2 + i6 + 1;
                    long j2 = i7;
                    long j3 = i8;
                    if (j2 != Long.MIN_VALUE && (length == -1 || j3 + j2 < length)) {
                        while (true) {
                            long j4 = i8;
                            long j5 = j3 + j2;
                            if (j4 >= j5) {
                                if (j4 != j5) {
                                    break;
                                }
                                return true;
                            }
                            int i9 = 0;
                            e2k.AXi(e1pA0Y.A02, 0, 1);
                            byte[] bArr2 = e1pA0Y.A02;
                            int i10 = bArr2[0] & 255;
                            if (i10 == 0) {
                                break;
                            }
                            int i11 = 128;
                            int i12 = 0;
                            while ((i10 & i11) == 0) {
                                i11 >>= 1;
                                i12++;
                            }
                            int i13 = i10 & (i11 ^ (-1));
                            e2k.AXi(bArr2, 1, i12);
                            while (i9 < i12) {
                                i9++;
                                i13 = (e1pA0Y.A02[i9] & 255) + (i13 << 8);
                            }
                            int i14 = i8 + i12 + 1;
                            if (i13 == Long.MIN_VALUE) {
                                break;
                            }
                            int i15 = 0;
                            e2k.AXi(e1pA0Y.A02, 0, 1);
                            byte[] bArr3 = e1pA0Y.A02;
                            int i16 = bArr3[0] & 255;
                            if (i16 == 0) {
                                break;
                            }
                            int i17 = 128;
                            int i18 = 0;
                            while ((i16 & i17) == 0) {
                                i17 >>= 1;
                                i18++;
                            }
                            int i19 = i16 & (i17 ^ (-1));
                            e2k.AXi(bArr3, 1, i18);
                            while (i15 < i18) {
                                i15++;
                                i19 = (e1pA0Y.A02[i15] & 255) + (i19 << 8);
                            }
                            i8 = i14 + i18 + 1;
                            long j6 = i19;
                            if (j6 < 0 || j6 > 2147483647L) {
                                break;
                            }
                            if (j6 != 0) {
                                int i20 = (int) j6;
                                e2k.A47(i20);
                                i8 += i20;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static E2X A02(MatroskaExtractor matroskaExtractor, int i) throws ParserException {
        A05(matroskaExtractor, i);
        return matroskaExtractor.A0S;
    }

    public static void A06(ByteBuffer byteBuffer, float f) {
        byteBuffer.putShort((short) ((f * 50000.0f) + 0.5f));
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    public static byte[] A07(String str, long j, long j2) {
        C1G.A07(AnonymousClass002.A1L((j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1))));
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        return String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))).getBytes(StandardCharsets.UTF_8);
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        this.A0G = -9223372036854775807L;
        int i = 0;
        this.A05 = 0;
        E3S e3s = (E3S) this.A0s;
        e3s.A01 = 0;
        e3s.A05.clear();
        E3Z e3z = e3s.A04;
        e3z.A01 = 0;
        e3z.A00 = 0;
        E3Z e3z2 = this.A0l;
        e3z2.A01 = 0;
        e3z2.A00 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0V = false;
        this.A0Y = false;
        this.A0X = false;
        this.A0B = 0;
        this.A00 = (byte) 0;
        this.A0W = false;
        this.A0g.A0P(0);
        while (true) {
            SparseArray<E2X> sparseArray = this.A0f;
            if (i >= sparseArray.size()) {
                return;
            }
            E3U e3u = sparseArray.valueAt(i).A0e;
            if (e3u != null) {
                e3u.A01 = false;
                e3u.A00 = 0;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:485:0x0a23, code lost:
    
        if (r1 == 2) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0a26, code lost:
    
        if (r1 == 3) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0a28, code lost:
    
        r0 = r10.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0a2e, code lost:
    
        if (r0 == 4) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0a32, code lost:
    
        if (r0 == 8) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0a34, code lost:
    
        r2 = "Invalid float size: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0a36, code lost:
    
        r2 = X.C60O.A0z(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0a42, code lost:
    
        throw X.BV6.A0V(r2.toString(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0a43, code lost:
    
        r0 = r10.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0a4a, code lost:
    
        if (r0 > 2147483647L) goto L864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0a4c, code lost:
    
        r6 = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0a4d, code lost:
    
        if (r6 != 0) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0a4f, code lost:
    
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0a51, code lost:
    
        r2 = ((X.C6407E4j) r5).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0a57, code lost:
    
        if (r4 == 134) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0a5b, code lost:
    
        if (r4 == 17026) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0a5f, code lost:
    
        if (r4 == 21358) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0a64, code lost:
    
        if (r4 != 2274716) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0a66, code lost:
    
        A02(r2, 2274716).A0g = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0a6e, code lost:
    
        r2 = new byte[r6];
        r28.readFully(r2, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0a75, code lost:
    
        if (r6 <= 0) goto L928;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0a77, code lost:
    
        r1 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0a7b, code lost:
    
        if (r2[r1] != 0) goto L927;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0a7d, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0a7f, code lost:
    
        r3 = new java.lang.String(r2, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0a8c, code lost:
    
        if ("webm".equals(r3) != false) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0a94, code lost:
    
        if ("matroska".equals(r3) != false) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0a96, code lost:
    
        r2 = X.C3cI.A0x("DocType ", r3);
        r2.append(" not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0aa2, code lost:
    
        r2 = X.C60O.A0z("String element size: ", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0aa9, code lost:
    
        r0 = r10.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0aad, code lost:
    
        if (r0 > 8) goto L866;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0aaf, code lost:
    
        r11 = (int) r0;
        r12 = 0;
        r28.readFully(r10.A06, 0, r11);
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0aba, code lost:
    
        if (r12 >= r11) goto L929;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0abc, code lost:
    
        r2 = (r2 << 8) | (r13[r12] & 255);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0ac8, code lost:
    
        r11 = ((X.C6407E4j) r5).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0ad0, code lost:
    
        if (r4 == 20529) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0ad6, code lost:
    
        if (r4 == 20530) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0ad8, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0ada, code lost:
    
        switch(r4) {
            case 131: goto L646;
            case 136: goto L647;
            case 155: goto L637;
            case 159: goto L651;
            case 176: goto L652;
            case 179: goto L606;
            case 186: goto L653;
            case 215: goto L654;
            case 231: goto L638;
            case 238: goto L639;
            case 241: goto L611;
            case 251: goto L640;
            case 16871: goto L655;
            case 16980: goto L536;
            case 17029: goto L539;
            case 17143: goto L545;
            case 18401: goto L548;
            case 18408: goto L557;
            case 21420: goto L641;
            case 21432: goto L618;
            case 21680: goto L656;
            case 21682: goto L657;
            case 21690: goto L658;
            case 21930: goto L659;
            case 21938: goto L643;
            case 21998: goto L663;
            case 22186: goto L664;
            case 22203: goto L665;
            case 25188: goto L666;
            case 30114: goto L644;
            case 30321: goto L628;
            case 2352003: goto L667;
            case 2807729: goto L645;
            default: goto L533;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0ade, code lost:
    
        switch(r4) {
            case 21945: goto L593;
            case 21946: goto L598;
            case 21947: goto L601;
            case 21948: goto L604;
            case 21949: goto L605;
            default: goto L687;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0ae7, code lost:
    
        if (r2 == 3) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0ae9, code lost:
    
        r0 = "ContentCompAlgo ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0aee, code lost:
    
        if (r2 < 1) goto L868;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0af4, code lost:
    
        if (r2 > 2) goto L869;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0af8, code lost:
    
        r0 = "DocTypeReadVersion ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0afd, code lost:
    
        if (r2 == 1) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0aff, code lost:
    
        r0 = "EBMLReadVersion ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0b06, code lost:
    
        if (r2 == 5) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0b08, code lost:
    
        r0 = "ContentEncAlgo ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0b0d, code lost:
    
        if (r2 == 1) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0b0f, code lost:
    
        r0 = "ContentEncodingScope ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0b16, code lost:
    
        if (r2 == 0) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0b18, code lost:
    
        r0 = "ContentEncodingOrder ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0b1d, code lost:
    
        if (r2 == 1) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0b1f, code lost:
    
        r0 = "AESSettingsCipherMode ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0b21, code lost:
    
        r2 = X.C60O.A0z(r0, r2);
        r2.append(" not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0b2a, code lost:
    
        r2 = "Invalid integer size: ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0b2e, code lost:
    
        r6 = (int) r0;
        r7 = 0;
        r28.readFully(r10.A06, 0, r6);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0b39, code lost:
    
        if (r7 >= r6) goto L926;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0b3b, code lost:
    
        r0 = (r0 << 8) | (r12[r7] & 255);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0b47, code lost:
    
        if (r6 != 4) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0b49, code lost:
    
        r0 = java.lang.Float.intBitsToFloat((int) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0b4f, code lost:
    
        r5 = ((X.C6407E4j) r5).A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0b55, code lost:
    
        if (r4 == 181) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0b59, code lost:
    
        if (r4 == 17545) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0b5b, code lost:
    
        switch(r4) {
            case 21969: goto L578;
            case 21970: goto L579;
            case 21971: goto L580;
            case 21972: goto L581;
            case 21973: goto L582;
            case 21974: goto L583;
            case 21975: goto L584;
            case 21976: goto L585;
            case 21977: goto L586;
            case 21978: goto L587;
            default: goto L572;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0b5e, code lost:
    
        switch(r4) {
            case 30323: goto L575;
            case 30324: goto L576;
            case 30325: goto L577;
            default: goto L687;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0b63, code lost:
    
        r0 = java.lang.Double.longBitsToDouble(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0b68, code lost:
    
        A02(r5, r4).A0A = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0b71, code lost:
    
        A02(r5, r4).A08 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0b7a, code lost:
    
        A02(r5, r4).A09 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0b83, code lost:
    
        A02(r5, r4).A06 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0b8c, code lost:
    
        A02(r5, r4).A07 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0b95, code lost:
    
        A02(r5, r4).A04 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0b9e, code lost:
    
        A02(r5, r4).A05 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0ba7, code lost:
    
        A02(r5, r4).A02 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0bb0, code lost:
    
        A02(r5, r4).A03 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0bb9, code lost:
    
        A02(r5, r4).A0B = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0bc2, code lost:
    
        A02(r5, r4).A0C = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0bcb, code lost:
    
        A02(r5, r4).A00 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0bd4, code lost:
    
        A02(r5, r4).A01 = (float) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0bdd, code lost:
    
        r5.A0I = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0be2, code lost:
    
        A02(r5, 181).A0V = (int) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0beb, code lost:
    
        A02(r2, 21358).A0h = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0bf3, code lost:
    
        r2.A0U = X.C6xC.A00(r3, "webm");
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0bfb, code lost:
    
        A02(r2, 134).A0f = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0c03, code lost:
    
        A05(r11, r4);
        r0 = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0c07, code lost:
    
        if (r0 == 1) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0c09, code lost:
    
        if (r0 != 2) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0c0b, code lost:
    
        r11.A0S.A0H = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0c11, code lost:
    
        r11.A0S.A0H = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0c17, code lost:
    
        A05(r11, r4);
        r1 = X.C6180DxO.A01((int) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0c1f, code lost:
    
        if (r1 == (-1)) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0c21, code lost:
    
        r11.A0S.A0J = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0c27, code lost:
    
        r1 = A02(r11, r4);
        r1.A0k = true;
        r0 = X.C6180DxO.A00((int) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0c32, code lost:
    
        if (r0 == (-1)) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0c34, code lost:
    
        r1.A0I = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0c38, code lost:
    
        A02(r11, r4).A0Q = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0c41, code lost:
    
        A02(r11, r4).A0R = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0c4a, code lost:
    
        r5 = r11.A0Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0c4c, code lost:
    
        if (r5 == null) goto L875;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0c50, code lost:
    
        if (r11.A0P == null) goto L876;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0c52, code lost:
    
        r5.A01(A01(r11, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0c5d, code lost:
    
        if (r11.A0a != false) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0c61, code lost:
    
        if (r11.A0Q == null) goto L877;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0c63, code lost:
    
        r0 = r11.A0P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0c65, code lost:
    
        if (r0 == null) goto L878;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0c67, code lost:
    
        r0.A01(r2);
        r11.A0a = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0c6e, code lost:
    
        r1 = (int) r2;
        A05(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0c72, code lost:
    
        if (r1 == 0) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0c74, code lost:
    
        if (r1 == 1) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0c76, code lost:
    
        if (r1 == 3) goto L625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0c7a, code lost:
    
        if (r1 != 15) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0c7c, code lost:
    
        r11.A0S.A0W = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0c82, code lost:
    
        r11.A0S.A0W = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0c88, code lost:
    
        r11.A0S.A0W = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0c8e, code lost:
    
        r11.A0S.A0W = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0c94, code lost:
    
        A05(r11, r4);
        r0 = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0c98, code lost:
    
        if (r0 == 0) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0c9a, code lost:
    
        if (r0 == 1) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0c9c, code lost:
    
        if (r0 == 2) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0c9e, code lost:
    
        if (r0 != 3) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0ca0, code lost:
    
        r11.A0S.A0U = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0ca6, code lost:
    
        r11.A0S.A0U = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0cac, code lost:
    
        r11.A0S.A0U = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0cb2, code lost:
    
        r11.A0S.A0U = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0cb8, code lost:
    
        r11.A0D = A01(r11, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0cc0, code lost:
    
        r11.A0G = A01(r11, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0cc8, code lost:
    
        r11.A01 = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0ccd, code lost:
    
        r11.A0T = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0cd1, code lost:
    
        r2 = r2 + r11.A0M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0cd4, code lost:
    
        r11.A0K = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0cd8, code lost:
    
        r1 = A02(r11, r4);
        r1.A0k = true;
        r1.A0E = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0ce3, code lost:
    
        r11.A0E = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0ce7, code lost:
    
        r11.A0O = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0ceb, code lost:
    
        A02(r11, r4).A0X = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:647:0x0cf4, code lost:
    
        r1 = A02(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x0cfa, code lost:
    
        if (r2 != 1) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x0cfc, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0cfd, code lost:
    
        r1.A0i = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x0d01, code lost:
    
        A02(r11, r4).A0G = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0d0a, code lost:
    
        A02(r11, r4).A0Y = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x0d13, code lost:
    
        A02(r11, r4).A0O = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0d1c, code lost:
    
        A02(r11, r4).A0T = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:655:0x0d25, code lost:
    
        A02(r11, r4).A0F = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0d2e, code lost:
    
        A02(r11, r4).A0N = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:657:0x0d36, code lost:
    
        A02(r11, r4).A0M = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0d3e, code lost:
    
        A02(r11, r4).A0L = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x0d46, code lost:
    
        r1 = A02(r11, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0d4c, code lost:
    
        if (r2 != 1) goto L662;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x0d4e, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0d4f, code lost:
    
        r1.A0j = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x0d52, code lost:
    
        A02(r11, r4).A0P = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0d5a, code lost:
    
        A02(r11, r4).A0Z = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0d61, code lost:
    
        A02(r11, r4).A0a = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0d68, code lost:
    
        A02(r11, r4).A0D = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0d70, code lost:
    
        A02(r11, r4).A0K = (int) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x109f, code lost:
    
        throw X.BV8.A0c(X.FGI.A0I("Element ", r4, " must be in a Cues"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x10ac, code lost:
    
        throw X.BV8.A0c(X.FGI.A0I("Element ", r4, " must be in a Cues"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x10ad, code lost:
    
        r1 = "EBML lacing sample size out of range.";
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0813  */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v64, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZ4(X.E2K r28, X.C5542DkK r29) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 5242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.MatroskaExtractor.AZ4(X.E2K, X.DkK):int");
    }

    public MatroskaExtractor(InterfaceC6425E5b interfaceC6425E5b, InterfaceC5885DrL interfaceC5885DrL, int i) {
        this.A0M = -1L;
        this.A0O = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A0H = -1L;
        this.A0L = -1L;
        this.A0G = -9223372036854775807L;
        this.A0s = interfaceC6425E5b;
        ((E3S) interfaceC6425E5b).A03 = new C6407E4j(this);
        this.A0t = interfaceC5885DrL;
        this.A0m = AnonymousClass002.A1M(i & 1);
        this.A0u = (i & 2) == 0;
        this.A0l = new E3Z();
        this.A0f = BV4.A0B();
        this.A0h = BV6.A0Y(4);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(-1);
        this.A0r = BV6.A0Z(byteBufferAllocate.array());
        this.A0i = BV6.A0Y(4);
        this.A0q = BV6.A0Z(AbstractC6381E3i.A01);
        this.A0p = BV6.A0Y(4);
        this.A0g = BV6.A0X();
        this.A0j = BV6.A0X();
        this.A0n = BV6.A0Y(8);
        this.A0o = BV6.A0X();
        this.A0k = BV6.A0X();
        this.A0c = new int[1];
    }

    public MatroskaExtractor(InterfaceC5885DrL interfaceC5885DrL, int i) {
        this(new E3S(), interfaceC5885DrL, i);
    }

    public MatroskaExtractor(InterfaceC5885DrL interfaceC5885DrL) {
        this(new E3S(), interfaceC5885DrL, 0);
    }

    @Deprecated
    public MatroskaExtractor() {
        this(new E3S(), InterfaceC5885DrL.A00, 2);
    }
}
