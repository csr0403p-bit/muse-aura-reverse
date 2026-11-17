package X;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class GHR {
    public int A00;
    public GHN A01;

    public final void A0V() {
        if (this instanceof GGB) {
            if (((GGB) this).A02 != 0) {
                throw AbstractC7609F5w.A0c("Protocol message end-group tag did not match expected tag.");
            }
        } else if (((GGE) this).A01 != 0) {
            throw AbstractC7609F5w.A0c("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final double A0C() {
        return Double.longBitsToDouble(this instanceof GGB ? GGB.A03((GGB) this) : GGE.A03((GGE) this));
    }

    public final float A0D() {
        return Float.intBitsToFloat(this instanceof GGB ? GGB.A00((GGB) this) : GGE.A00((GGE) this));
    }

    public final int A0E() {
        if (this instanceof GGB) {
            GGB ggb = (GGB) this;
            return ggb.A04 + ggb.A03;
        }
        GGE gge = (GGE) this;
        return gge.A03 - gge.A04;
    }

    public final int A0F() {
        return this instanceof GGB ? GGB.A01((GGB) this) : GGE.A01((GGE) this);
    }

    public final int A0G() {
        return this instanceof GGB ? GGB.A00((GGB) this) : GGE.A00((GGE) this);
    }

    public final int A0H() {
        return this instanceof GGB ? GGB.A01((GGB) this) : GGE.A01((GGE) this);
    }

    public final int A0I() {
        return this instanceof GGB ? GGB.A00((GGB) this) : GGE.A00((GGE) this);
    }

    public final int A0J() {
        return this instanceof GGB ? AbstractC7608F5v.A04(GGB.A01((GGB) this)) : AbstractC7608F5v.A04(GGE.A01((GGE) this));
    }

    public final int A0K() throws InvalidProtocolBufferException {
        if (this instanceof GGB) {
            GGB ggb = (GGB) this;
            if (ggb.A0W()) {
                ggb.A02 = 0;
                return 0;
            }
            int iA01 = GGB.A01(ggb);
            ggb.A02 = iA01;
            if ((iA01 >>> 3) == 0) {
                throw AbstractC7609F5w.A0c("Protocol message contained an invalid tag (zero).");
            }
            return iA01;
        }
        GGE gge = (GGE) this;
        if (gge.A0W()) {
            gge.A01 = 0;
            return 0;
        }
        int iA012 = GGE.A01(gge);
        gge.A01 = iA012;
        if ((iA012 >>> 3) == 0) {
            throw AbstractC7609F5w.A0c("Protocol message contained an invalid tag (zero).");
        }
        return iA012;
    }

    public final int A0L() {
        return this instanceof GGB ? GGB.A01((GGB) this) : GGE.A01((GGE) this);
    }

    public final int A0M(int byteLimit) {
        if (this instanceof GGB) {
            GGB ggb = (GGB) this;
            if (byteLimit < 0) {
                throw AbstractC7609F5w.A0c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int i = byteLimit + ggb.A04 + ggb.A03;
            if (i < 0) {
                throw AbstractC7609F5w.A0c("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            int i2 = ggb.A01;
            if (i > i2) {
                throw AbstractC7609F5w.A0c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            ggb.A01 = i;
            GGB.A07(ggb);
            return i2;
        }
        GGE gge = (GGE) this;
        if (byteLimit < 0) {
            throw AbstractC7609F5w.A0c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i3 = byteLimit + (gge.A03 - gge.A04);
        if (i3 < 0) {
            throw AbstractC7609F5w.A0c("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i4 = gge.A00;
        if (i3 > i4) {
            throw AbstractC7609F5w.A0c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        gge.A00 = i3;
        GGE.A05(gge);
        return i4;
    }

    public final long A0N() {
        return this instanceof GGB ? GGB.A03((GGB) this) : GGE.A03((GGE) this);
    }

    public final long A0O() {
        return this instanceof GGB ? GGB.A04((GGB) this) : GGE.A04((GGE) this);
    }

    public final long A0P() {
        return this instanceof GGB ? GGB.A03((GGB) this) : GGE.A03((GGE) this);
    }

    public final long A0Q() {
        return this instanceof GGB ? AbstractC7610F5x.A0T(GGB.A04((GGB) this)) : AbstractC7610F5x.A0T(GGE.A04((GGE) this));
    }

    public final long A0R() {
        return this instanceof GGB ? GGB.A04((GGB) this) : GGE.A04((GGE) this);
    }

    public final AbstractC9321GEc A0S() throws InvalidProtocolBufferException {
        if (this instanceof GGB) {
            GGB ggb = (GGB) this;
            int iA01 = GGB.A01(ggb);
            int i = ggb.A00;
            int i2 = ggb.A03;
            if (iA01 <= i - i2 && iA01 > 0) {
                C9324GEf c9324GEfA01 = AbstractC9321GEc.A01(ggb.A07, i2, iA01);
                ggb.A03 += iA01;
                return c9324GEfA01;
            }
            if (iA01 != 0) {
                if (iA01 < 0) {
                    throw AbstractC7609F5w.A0c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                byte[] bArrA0B = GGB.A0B(ggb, iA01);
                if (bArrA0B != null) {
                    return AbstractC9321GEc.A01(bArrA0B, 0, bArrA0B.length);
                }
                int i3 = ggb.A03;
                int i4 = ggb.A00;
                int iA0O = i4 - i3;
                ggb.A04 += i4;
                ggb.A03 = 0;
                ggb.A00 = 0;
                ArrayList arrayListA05 = GGB.A05(ggb, iA01 - iA0O);
                byte[] bArr = new byte[iA01];
                System.arraycopy(ggb.A07, i3, bArr, 0, iA0O);
                Iterator it = arrayListA05.iterator();
                while (it.hasNext()) {
                    iA0O = AbstractC7610F5x.A0O(bArr, it, iA0O);
                }
                return new C9324GEf(bArr);
            }
        } else {
            GGE gge = (GGE) this;
            int iA012 = GGE.A01(gge);
            if (iA012 > 0) {
                int i5 = gge.A02;
                int i6 = gge.A03;
                if (iA012 > i5 - i6) {
                    throw AbstractC7609F5w.A0c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                C9324GEf c9324GEfA012 = AbstractC9321GEc.A01(gge.A06, i6, iA012);
                gge.A03 += iA012;
                return c9324GEfA012;
            }
            if (iA012 != 0) {
                throw AbstractC7609F5w.A0c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return AbstractC9321GEc.A00;
    }

    public final String A0T() throws InvalidProtocolBufferException {
        String strA0n;
        if (!(this instanceof GGB)) {
            GGE gge = (GGE) this;
            int iA01 = GGE.A01(gge);
            if (iA01 <= 0) {
                if (iA01 != 0) {
                    throw AbstractC7609F5w.A0c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return "";
            }
            int i = gge.A02;
            int i2 = gge.A03;
            if (iA01 > i - i2) {
                throw AbstractC7609F5w.A0c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            String strA0n2 = BV4.A0n(AbstractC9352GFl.A04, gge.A06, i2, iA01);
            gge.A03 += iA01;
            return strA0n2;
        }
        GGB ggb = (GGB) this;
        int iA012 = GGB.A01(ggb);
        if (iA012 <= 0) {
            if (iA012 != 0) {
                throw AbstractC7609F5w.A0c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            return "";
        }
        int i3 = ggb.A00;
        int i4 = ggb.A03;
        if (iA012 <= i3 - i4) {
            strA0n = BV4.A0n(AbstractC9352GFl.A04, ggb.A07, i4, iA012);
        } else {
            if (iA012 > i3) {
                return new String(GGB.A0A(ggb, iA012), AbstractC9352GFl.A04);
            }
            GGB.A08(ggb, iA012);
            strA0n = BV4.A0n(AbstractC9352GFl.A04, ggb.A07, ggb.A03, iA012);
        }
        ggb.A03 += iA012;
        return strA0n;
    }

    public final String A0U() throws InvalidProtocolBufferException {
        byte[] bArrA0A;
        if (!(this instanceof GGB)) {
            GGE gge = (GGE) this;
            int iA01 = GGE.A01(gge);
            if (iA01 <= 0) {
                if (iA01 != 0) {
                    throw AbstractC7609F5w.A0c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                return "";
            }
            int i = gge.A02;
            int i2 = gge.A03;
            if (iA01 > i - i2) {
                throw AbstractC7609F5w.A0c("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            String strA03 = GEA.A00.A03(gge.A06, i2, iA01);
            gge.A03 += iA01;
            return strA03;
        }
        GGB ggb = (GGB) this;
        int iA012 = GGB.A01(ggb);
        int i3 = ggb.A03;
        int i4 = ggb.A00;
        if (iA012 <= i4 - i3 && iA012 > 0) {
            bArrA0A = ggb.A07;
            ggb.A03 = i3 + iA012;
        } else {
            if (iA012 == 0) {
                return "";
            }
            if (iA012 < 0) {
                throw AbstractC7609F5w.A0c("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            i3 = 0;
            if (iA012 <= i4) {
                GGB.A08(ggb, iA012);
                bArrA0A = ggb.A07;
                ggb.A03 = iA012;
            } else {
                bArrA0A = GGB.A0A(ggb, iA012);
            }
        }
        return GEA.A00.A03(bArrA0A, i3, iA012);
    }

    public final boolean A0W() {
        if (this instanceof GGB) {
            GGB ggb = (GGB) this;
            return ggb.A03 == ggb.A00 && !GGB.A09(ggb, 1);
        }
        GGE gge = (GGE) this;
        return AnonymousClass002.A1Q(gge.A03, gge.A02);
    }

    public final boolean A0X() {
        return this instanceof GGB ? AnonymousClass002.A1L((GGB.A04((GGB) this) > 0L ? 1 : (GGB.A04((GGB) this) == 0L ? 0 : -1))) : AnonymousClass002.A1L((GGE.A04((GGE) this) > 0L ? 1 : (GGE.A04((GGE) this) == 0L ? 0 : -1)));
    }
}
