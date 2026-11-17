package X;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class GG9 {
    public int A00;
    public GG3 A01;

    public final double A0C() {
        return Double.longBitsToDouble(this instanceof GGA ? GGA.A03((GGA) this) : GGD.A03((GGD) this));
    }

    public final float A0D() {
        return Float.intBitsToFloat(this instanceof GGA ? GGA.A00((GGA) this) : GGD.A00((GGD) this));
    }

    public final int A0E() {
        if (!(this instanceof GGA)) {
            return ((GGD) this).A04;
        }
        GGA gga = (GGA) this;
        return gga.A04 + gga.A03;
    }

    public final int A0F() {
        return this instanceof GGA ? GGA.A01((GGA) this) : GGD.A01((GGD) this);
    }

    public final int A0G() {
        return this instanceof GGA ? GGA.A00((GGA) this) : GGD.A00((GGD) this);
    }

    public final int A0H() {
        return this instanceof GGA ? GGA.A01((GGA) this) : GGD.A01((GGD) this);
    }

    public final int A0I() {
        return this instanceof GGA ? GGA.A00((GGA) this) : GGD.A00((GGD) this);
    }

    public final int A0J() {
        return this instanceof GGA ? AbstractC7608F5v.A04(GGA.A01((GGA) this)) : AbstractC7608F5v.A04(GGD.A01((GGD) this));
    }

    public final int A0K() throws InvalidProtocolBufferException {
        if (this instanceof GGA) {
            GGA gga = (GGA) this;
            if (gga.A0V()) {
                gga.A02 = 0;
                return 0;
            }
            int iA01 = GGA.A01(gga);
            gga.A02 = iA01;
            if ((iA01 >>> 3) == 0) {
                throw AbstractC7609F5w.A0U("Protocol message contained an invalid tag (zero).");
            }
            return iA01;
        }
        GGD ggd = (GGD) this;
        if (ggd.A0V()) {
            ggd.A02 = 0;
            return 0;
        }
        int iA012 = GGD.A01(ggd);
        ggd.A02 = iA012;
        if ((iA012 >>> 3) == 0) {
            throw AbstractC7609F5w.A0U("Protocol message contained an invalid tag (zero).");
        }
        return iA012;
    }

    public final int A0L() {
        return this instanceof GGA ? GGA.A01((GGA) this) : GGD.A01((GGD) this);
    }

    public final int A0M(int byteLimit) {
        if (this instanceof GGA) {
            GGA gga = (GGA) this;
            if (byteLimit < 0) {
                throw AbstractC7609F5w.A0U("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int i = byteLimit + gga.A04 + gga.A03;
            if (i < 0) {
                throw AbstractC7609F5w.A0U("Failed to parse the message.");
            }
            int i2 = gga.A01;
            if (i > i2) {
                throw AbstractC7609F5w.A0U("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            gga.A01 = i;
            GGA.A07(gga);
            return i2;
        }
        GGD ggd = (GGD) this;
        if (byteLimit < 0) {
            throw AbstractC7609F5w.A0U("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = byteLimit + ggd.A04;
        if (i3 < 0) {
            throw AbstractC7609F5w.A0U("Failed to parse the message.");
        }
        int i4 = ggd.A01;
        if (i3 > i4) {
            throw AbstractC7609F5w.A0U("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        ggd.A01 = i3;
        int i5 = ggd.A03 + ggd.A00;
        ggd.A03 = i5;
        if (i5 <= i3) {
            ggd.A00 = 0;
            return i4;
        }
        int i6 = i5 - i3;
        ggd.A00 = i6;
        ggd.A03 = i5 - i6;
        return i4;
    }

    public final long A0N() {
        return this instanceof GGA ? GGA.A03((GGA) this) : GGD.A03((GGD) this);
    }

    public final long A0O() {
        return this instanceof GGA ? GGA.A04((GGA) this) : GGD.A04((GGD) this);
    }

    public final long A0P() {
        return this instanceof GGA ? GGA.A03((GGA) this) : GGD.A03((GGD) this);
    }

    public final long A0Q() {
        return this instanceof GGA ? AbstractC7610F5x.A0T(GGA.A04((GGA) this)) : AbstractC7610F5x.A0T(GGD.A04((GGD) this));
    }

    public final long A0R() {
        return this instanceof GGA ? GGA.A04((GGA) this) : GGD.A04((GGD) this);
    }

    public final AbstractC9320GEb A0S() throws InvalidProtocolBufferException {
        if (this instanceof GGA) {
            GGA gga = (GGA) this;
            int iA01 = GGA.A01(gga);
            int i = gga.A00;
            int i2 = gga.A03;
            if (iA01 <= i - i2 && iA01 > 0) {
                C9322GEd c9322GEdA01 = AbstractC9320GEb.A01(gga.A07, i2, iA01);
                gga.A03 += iA01;
                return c9322GEdA01;
            }
            if (iA01 != 0) {
                if (iA01 < 0) {
                    throw AbstractC7609F5w.A0U("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                byte[] bArrA0B = GGA.A0B(gga, iA01);
                if (bArrA0B != null) {
                    return AbstractC9320GEb.A01(bArrA0B, 0, bArrA0B.length);
                }
                int i3 = gga.A03;
                int i4 = gga.A00;
                int iA0O = i4 - i3;
                gga.A04 += i4;
                gga.A03 = 0;
                gga.A00 = 0;
                ArrayList arrayListA05 = GGA.A05(gga, iA01 - iA0O);
                byte[] bArr = new byte[iA01];
                System.arraycopy(gga.A07, i3, bArr, 0, iA0O);
                Iterator it = arrayListA05.iterator();
                while (it.hasNext()) {
                    iA0O = AbstractC7610F5x.A0O(bArr, it, iA0O);
                }
                return new C9322GEd(bArr);
            }
        } else {
            GGD ggd = (GGD) this;
            int iA012 = GGD.A01(ggd);
            if (iA012 > 0) {
                int i5 = ggd.A03;
                int i6 = ggd.A04;
                if (iA012 > i5 - i6) {
                    throw AbstractC7609F5w.A0U("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                C9322GEd c9322GEdA012 = AbstractC9320GEb.A01(ggd.A05, i6, iA012);
                ggd.A04 += iA012;
                return c9322GEdA012;
            }
            if (iA012 != 0) {
                throw AbstractC7609F5w.A0U("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return AbstractC9320GEb.A00;
    }

    public final String A0T() throws InvalidProtocolBufferException {
        String strA0n;
        if (!(this instanceof GGA)) {
            GGD ggd = (GGD) this;
            int iA01 = GGD.A01(ggd);
            if (iA01 <= 0) {
                if (iA01 != 0) {
                    throw AbstractC7609F5w.A0U("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return "";
            }
            int i = ggd.A03;
            int i2 = ggd.A04;
            if (iA01 > i - i2) {
                throw AbstractC7609F5w.A0U("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            String strA0n2 = BV4.A0n(AbstractC9351GFk.A04, ggd.A05, i2, iA01);
            ggd.A04 += iA01;
            return strA0n2;
        }
        GGA gga = (GGA) this;
        int iA012 = GGA.A01(gga);
        if (iA012 <= 0) {
            if (iA012 != 0) {
                throw AbstractC7609F5w.A0U("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            return "";
        }
        int i3 = gga.A00;
        int i4 = gga.A03;
        if (iA012 <= i3 - i4) {
            strA0n = BV4.A0n(AbstractC9351GFk.A04, gga.A07, i4, iA012);
        } else {
            if (iA012 > i3) {
                return new String(GGA.A0A(gga, iA012), AbstractC9351GFk.A04);
            }
            GGA.A08(gga, iA012);
            strA0n = BV4.A0n(AbstractC9351GFk.A04, gga.A07, gga.A03, iA012);
        }
        gga.A03 += iA012;
        return strA0n;
    }

    public final String A0U() throws InvalidProtocolBufferException {
        byte[] bArrA0A;
        if (!(this instanceof GGA)) {
            GGD ggd = (GGD) this;
            int iA01 = GGD.A01(ggd);
            if (iA01 <= 0) {
                if (iA01 != 0) {
                    throw AbstractC7609F5w.A0U("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return "";
            }
            int i = ggd.A03;
            int i2 = ggd.A04;
            if (iA01 > i - i2) {
                throw AbstractC7609F5w.A0U("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            String strA03 = GEE.A00.A03(ggd.A05, i2, iA01);
            ggd.A04 += iA01;
            return strA03;
        }
        GGA gga = (GGA) this;
        int iA012 = GGA.A01(gga);
        int i3 = gga.A03;
        int i4 = gga.A00;
        if (iA012 <= i4 - i3 && iA012 > 0) {
            bArrA0A = gga.A07;
            gga.A03 = i3 + iA012;
        } else {
            if (iA012 == 0) {
                return "";
            }
            if (iA012 < 0) {
                throw AbstractC7609F5w.A0U("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i3 = 0;
            if (iA012 <= i4) {
                GGA.A08(gga, iA012);
                bArrA0A = gga.A07;
                gga.A03 = iA012;
            } else {
                bArrA0A = GGA.A0A(gga, iA012);
            }
        }
        return GEE.A00.A03(bArrA0A, i3, iA012);
    }

    public final boolean A0V() {
        if (this instanceof GGA) {
            GGA gga = (GGA) this;
            return gga.A03 == gga.A00 && !GGA.A09(gga, 1);
        }
        GGD ggd = (GGD) this;
        return AnonymousClass002.A1Q(ggd.A04, ggd.A03);
    }

    public final boolean A0W() {
        return this instanceof GGA ? AnonymousClass002.A1L((GGA.A04((GGA) this) > 0L ? 1 : (GGA.A04((GGA) this) == 0L ? 0 : -1))) : AnonymousClass002.A1L((GGD.A04((GGD) this) > 0L ? 1 : (GGD.A04((GGD) this) == 0L ? 0 : -1)));
    }
}
