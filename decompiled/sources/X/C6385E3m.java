package X;

import androidx.media3.common.util.Util;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.google.common.collect.ImmutableList;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;

/* renamed from: X.E3m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6385E3m implements E5W {
    public final int A00;
    public final ImmutableList<E5W> A01;

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x00bd. Please report as an issue. */
    public static C6385E3m A00(E1P e1p, int i) {
        StringBuilder sbA0x;
        String str;
        int iA08;
        String str2;
        C6162Dx5 c6162Dx5A00;
        String str3;
        E5W e52;
        String str4;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i2 = e1p.A00;
        int iA00 = -2;
        while (e1p.A04() > 8) {
            int iA06 = e1p.A06();
            int iA062 = e1p.A01 + e1p.A06();
            e1p.A0Q(iA062);
            if (iA06 == 1414744396) {
                e52 = A00(e1p, e1p.A06());
            } else {
                switch (iA06) {
                    case 1718776947:
                        if (iA00 == 2) {
                            e1p.A0S(4);
                            int iA063 = e1p.A06();
                            int iA064 = e1p.A06();
                            e1p.A0S(4);
                            iA08 = e1p.A06();
                            switch (iA08) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str4 = "video/mp4v-es";
                                    c6162Dx5A00 = C6162Dx5.A00();
                                    c6162Dx5A00.A0O = iA063;
                                    c6162Dx5A00.A0B = iA064;
                                    c6162Dx5A00.A06(str4);
                                    e52 = new E52(BV6.A0U(c6162Dx5A00));
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str4 = "video/avc";
                                    c6162Dx5A00 = C6162Dx5.A00();
                                    c6162Dx5A00.A0O = iA063;
                                    c6162Dx5A00.A0B = iA064;
                                    c6162Dx5A00.A06(str4);
                                    e52 = new E52(BV6.A0U(c6162Dx5A00));
                                    break;
                                case 842289229:
                                    str4 = "video/mp42";
                                    c6162Dx5A00 = C6162Dx5.A00();
                                    c6162Dx5A00.A0O = iA063;
                                    c6162Dx5A00.A0B = iA064;
                                    c6162Dx5A00.A06(str4);
                                    e52 = new E52(BV6.A0U(c6162Dx5A00));
                                    break;
                                case 859066445:
                                    str4 = "video/mp43";
                                    c6162Dx5A00 = C6162Dx5.A00();
                                    c6162Dx5A00.A0O = iA063;
                                    c6162Dx5A00.A0B = iA064;
                                    c6162Dx5A00.A06(str4);
                                    e52 = new E52(BV6.A0U(c6162Dx5A00));
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str4 = "video/mjpeg";
                                    c6162Dx5A00 = C6162Dx5.A00();
                                    c6162Dx5A00.A0O = iA063;
                                    c6162Dx5A00.A0B = iA064;
                                    c6162Dx5A00.A06(str4);
                                    e52 = new E52(BV6.A0U(c6162Dx5A00));
                                    break;
                                default:
                                    str3 = "Ignoring track with unsupported compression ";
                                    sbA0x = C60O.A0y(str3, iA08);
                                    CNC.A04("StreamFormatChunk", sbA0x.toString());
                                    break;
                            }
                        } else if (iA00 == 1) {
                            iA08 = e1p.A08();
                            if (iA08 == 1) {
                                str2 = "audio/raw";
                            } else if (iA08 == 85) {
                                str2 = "audio/mpeg";
                            } else if (iA08 == 255) {
                                str2 = "audio/mp4a-latm";
                            } else if (iA08 == 8192) {
                                str2 = "audio/ac3";
                            } else if (iA08 != 8193) {
                                str3 = "Ignoring track with unsupported format tag ";
                                sbA0x = C60O.A0y(str3, iA08);
                                CNC.A04("StreamFormatChunk", sbA0x.toString());
                            } else {
                                str2 = "audio/vnd.dts";
                            }
                            int iA082 = e1p.A08();
                            int iA065 = e1p.A06();
                            e1p.A0S(6);
                            int iA066 = Util.A06(ByteOrder.LITTLE_ENDIAN, e1p.A08());
                            int iA083 = e1p.A04() > 0 ? e1p.A08() : 0;
                            c6162Dx5A00 = C6162Dx5.A00();
                            C6162Dx5.A03(c6162Dx5A00, str2, iA082, iA065);
                            if (str2.equals("audio/raw") && iA066 != 0) {
                                c6162Dx5A00.A0F = iA066;
                            }
                            if (str2.equals("audio/mp4a-latm") && iA083 > 0) {
                                byte[] bArr = new byte[iA083];
                                e1p.A0U(bArr, 0, iA083);
                                c6162Dx5A00.A0a = ImmutableList.of(bArr);
                            }
                            e52 = new E52(BV6.A0U(c6162Dx5A00));
                        } else {
                            sbA0x = C60O.A0x("Ignoring strf box for unsupported track type: ");
                            switch (iA00) {
                                case -2:
                                    str = "none";
                                    break;
                                case -1:
                                    str = "unknown";
                                    break;
                                case 0:
                                case 1:
                                case 2:
                                default:
                                    str = HatchOpenGraphRepository.UNKNOWN_HOST;
                                    break;
                                case 3:
                                    str = "text";
                                    break;
                            }
                            sbA0x.append(str);
                            CNC.A04("StreamFormatChunk", sbA0x.toString());
                        }
                    case 1751742049:
                        int iA067 = e1p.A06();
                        e1p.A0S(8);
                        int iA068 = e1p.A06();
                        int iA069 = e1p.A06();
                        e1p.A0S(4);
                        e1p.A06();
                        e1p.A0S(12);
                        e52 = new C6420E4w(iA067, iA068, iA069);
                        break;
                    case 1752331379:
                        int iA0610 = e1p.A06();
                        e1p.A0S(12);
                        e1p.A06();
                        int iA0611 = e1p.A06();
                        int iA0612 = e1p.A06();
                        e1p.A0S(4);
                        int iA0613 = e1p.A06();
                        int iA0614 = e1p.A06();
                        e1p.A0S(4);
                        e52 = new E4E(iA0610, iA0611, iA0612, iA0613, iA0614, e1p.A06());
                        break;
                    case 1852994675:
                        e52 = new E5E(e1p.A0M(StandardCharsets.UTF_8, e1p.A04()));
                        break;
                }
                e1p.A0R(iA062);
                e1p.A0Q(i2);
            }
            if (e52.AM8() == 1752331379) {
                iA00 = ((E4E) e52).A00();
            }
            builder.add((ImmutableList.Builder) e52);
            e1p.A0R(iA062);
            e1p.A0Q(i2);
        }
        return new C6385E3m(builder.build(), i);
    }

    public final <T extends E5W> T A01(Class<T> cls) {
        AbstractC7489Ext<E5W> it = this.A01.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @Override // X.E5W
    public final int AM8() {
        return this.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (ILcom/google/common/collect/ImmutableList<LX/E5W;>;)V */
    public C6385E3m(ImmutableList immutableList, int i) {
        this.A00 = i;
        this.A01 = immutableList;
    }
}
