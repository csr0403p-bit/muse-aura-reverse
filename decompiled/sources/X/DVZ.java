package X;

import com.facebook.thrift.protocol.TProtocolException;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class DVZ extends DVX {
    public C5082DVb A00;
    public Boolean A01;
    public short A02;
    public CF8 A03;
    public final byte[] A04;
    public final long A05;
    public final long A06;
    public static final C5082DVb A08 = new C5082DVb("", (byte) 0, 0);
    public static final byte[] A07 = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9, 0, 0, 0, 13};

    public static void A03(DVZ dvz, int i) {
        if (i < 0) {
            TProtocolException tProtocolException = new TProtocolException(FGI.A0H("Negative length: ", i));
            tProtocolException.type_ = 2;
            throw tProtocolException;
        }
        long j = dvz.A05;
        if (j <= 0 || i <= j) {
            return;
        }
        TProtocolException tProtocolException2 = new TProtocolException(String.format("Container length %s exceeded max allowed %s", Integer.valueOf(i), Long.valueOf(j)));
        tProtocolException2.type_ = 3;
        throw tProtocolException2;
    }

    public static void A04(DVZ dvz, int i) {
        if (i < 0) {
            TProtocolException tProtocolException = new TProtocolException(FGI.A0H("Negative length: ", i));
            tProtocolException.type_ = 2;
            throw tProtocolException;
        }
        long j = dvz.A06;
        if (j <= 0 || i <= j) {
            return;
        }
        TProtocolException tProtocolException2 = new TProtocolException(String.format("String/binary length %s exceeded max allowed %s", Integer.valueOf(i), Long.valueOf(j)));
        tProtocolException2.type_ = 3;
        throw tProtocolException2;
    }

    public static void A05(DVZ dvz, int i) {
        int i2 = 0;
        while (true) {
            int i3 = i & (-128);
            byte[] bArr = dvz.A04;
            int i4 = i2 + 1;
            if (i3 == 0) {
                bArr[i2] = (byte) i;
                ((DVX) dvz).A00.A01(bArr, i4);
                return;
            } else {
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
                i2 = i4;
            }
        }
    }

    @Override // X.DVX
    public final void A0J() {
        A02(this, (byte) 0);
    }

    public DVZ(C5090DVl c5090DVl) {
        super.A00 = c5090DVl;
        CF8 cf8 = new CF8();
        cf8.A00 = -1;
        cf8.A01 = new short[15];
        this.A03 = cf8;
        this.A02 = (short) 0;
        this.A00 = null;
        this.A01 = null;
        this.A04 = new byte[10];
        this.A06 = -1L;
        this.A05 = -1L;
    }

    public static byte A00(byte b) {
        byte b2 = (byte) (b & 15);
        switch (b2) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return (byte) 15;
            case 10:
                return (byte) 14;
            case 11:
                return (byte) 13;
            case 12:
                return (byte) 12;
            case 13:
                return (byte) 19;
            default:
                TProtocolException tProtocolException = new TProtocolException(FGI.A0H("don't know what type: ", b2));
                tProtocolException.type_ = 0;
                throw tProtocolException;
        }
    }

    public static int A01(DVZ dvz) {
        C5091DVm c5091DVm = C5090DVl.A02;
        int i = 0;
        int i2 = 0;
        while (true) {
            byte bA0E = dvz.A0E();
            i |= (bA0E & Byte.MAX_VALUE) << i2;
            if ((bA0E & 128) != 128) {
                return i;
            }
            i2 += 7;
        }
    }

    public static void A02(DVZ dvz, byte b) {
        byte[] bArr = dvz.A04;
        bArr[0] = b;
        ((DVX) dvz).A00.A01(bArr, 1);
    }

    @Override // X.DVX
    public final byte A0E() throws IOException {
        C5091DVm c5091DVm = C5090DVl.A02;
        C5090DVl c5090DVl = super.A00;
        byte[] bArr = this.A04;
        c5090DVl.A00(bArr, 1);
        return bArr[0];
    }

    @Override // X.DVX
    public final long A0F() {
        C5091DVm c5091DVm = C5090DVl.A02;
        int i = 0;
        long j = 0;
        while (true) {
            j |= (r2 & Byte.MAX_VALUE) << i;
            if ((A0E() & 128) != 128) {
                return (-(j & 1)) ^ (j >>> 1);
            }
            i += 7;
        }
    }

    @Override // X.DVX
    public final void A0K() {
        this.A03.A00(this.A02);
        this.A02 = (short) 0;
    }

    @Override // X.DVX
    public final void A0L() {
        CF8 cf8 = this.A03;
        short[] sArr = cf8.A01;
        int i = cf8.A00;
        cf8.A00 = i - 1;
        this.A02 = sArr[i];
    }

    @Override // X.DVX
    public final void A0M() {
        this.A03.A00(this.A02);
        this.A02 = (short) 0;
    }

    @Override // X.DVX
    public final void A0N() {
        CF8 cf8 = this.A03;
        short[] sArr = cf8.A01;
        int i = cf8.A00;
        cf8.A00 = i - 1;
        this.A02 = sArr[i];
    }

    public final void A0O(byte b) {
        int i = b & 15;
        if (i == 2 || i == 3 || i == 4 || i == 6 || i == 8) {
            return;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return;
            default:
                TProtocolException tProtocolException = new TProtocolException(FGI.A0H("Unexpected data type ", (byte) i));
                tProtocolException.type_ = 1;
                throw tProtocolException;
        }
    }

    @Override // X.DVX
    public final C5082DVb A0G() {
        byte bA0E = A0E();
        if (bA0E == 0) {
            return A08;
        }
        short s = (short) ((bA0E & 240) >> 4);
        int i = bA0E & 15;
        byte b = (byte) i;
        C5082DVb c5082DVb = new C5082DVb("", A00(b), s == 0 ? A0D() : (short) (this.A02 + s));
        if (i == 1 || i == 2) {
            this.A01 = b == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.A02 = c5082DVb.A03;
        return c5082DVb;
    }

    @Override // X.DVX
    public final C5086DVg A0H() {
        byte bA0E = A0E();
        int iA01 = (bA0E >> 4) & 15;
        if (iA01 == 15) {
            iA01 = A01(this);
        }
        A03(this, iA01);
        byte bA00 = A00(bA0E);
        A0O(bA00);
        C5091DVm c5091DVm = C5090DVl.A02;
        return new C5086DVg(bA00, iA01);
    }

    @Override // X.DVX
    public final String A0I() throws IOException {
        int iA01 = A01(this);
        A04(this, iA01);
        if (iA01 == 0) {
            return "";
        }
        C5091DVm c5091DVm = C5090DVl.A02;
        if (-1 >= iA01) {
            return new String((byte[]) null, 0, iA01, AbstractC5088DVi.A00);
        }
        byte[] bArr = new byte[iA01];
        super.A00.A00(bArr, iA01);
        return new String(bArr, AbstractC5088DVi.A00);
    }
}
