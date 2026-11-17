package X;

import com.facebook.thrift.protocol.TProtocolException;
import java.io.IOException;

/* renamed from: X.DVa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5081DVa extends DVX {
    public final long A00;
    public final byte[] A01;
    public final long A02;

    public static void A00(C5081DVa c5081DVa, int i) {
        if (i < 0) {
            TProtocolException tProtocolException = new TProtocolException(FGI.A0H("Negative length: ", i));
            tProtocolException.type_ = 2;
            throw tProtocolException;
        }
        long j = c5081DVa.A02;
        if (j <= 0 || i <= j) {
            return;
        }
        TProtocolException tProtocolException2 = new TProtocolException(String.format("Container length %s exceeded max allowed %s", Integer.valueOf(i), Long.valueOf(j)));
        tProtocolException2.type_ = 3;
        throw tProtocolException2;
    }

    @Override // X.DVX
    public final void A0M() {
    }

    @Override // X.DVX
    public final void A0N() {
    }

    @Override // X.DVX
    public final int A0B() throws IOException {
        byte[] bArr = this.A01;
        C5091DVm c5091DVm = C5090DVl.A02;
        super.A00.A00(bArr, 4);
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    @Override // X.DVX
    public final short A0D() throws IOException {
        byte[] bArr = this.A01;
        C5091DVm c5091DVm = C5090DVl.A02;
        super.A00.A00(bArr, 2);
        return (short) ((bArr[1] & 255) | ((bArr[0] & 255) << 8));
    }

    @Override // X.DVX
    public final byte A0E() throws IOException {
        C5091DVm c5091DVm = C5090DVl.A02;
        byte[] bArr = this.A01;
        super.A00.A00(bArr, 1);
        return bArr[0];
    }

    @Override // X.DVX
    public final long A0F() throws IOException {
        byte[] bArr = this.A01;
        C5091DVm c5091DVm = C5090DVl.A02;
        super.A00.A00(bArr, 8);
        return (bArr[7] & 255) | ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
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

    public C5081DVa(C5090DVl c5090DVl, long j, long j2) {
        super.A00 = c5090DVl;
        this.A01 = new byte[8];
        this.A00 = j;
        this.A02 = j2;
    }

    @Override // X.DVX
    public final C5085DVe A0C() {
        byte bA0E = A0E();
        byte bA0E2 = A0E();
        int iA0B = A0B();
        A00(this, iA0B);
        A0O(bA0E);
        A0O(bA0E2);
        C5091DVm c5091DVm = C5090DVl.A02;
        return new C5085DVe(bA0E, bA0E2, iA0B);
    }

    @Override // X.DVX
    public final C5082DVb A0G() {
        byte bA0E = A0E();
        return new C5082DVb("", bA0E, bA0E == 0 ? (short) 0 : A0D());
    }

    @Override // X.DVX
    public final C5086DVg A0H() {
        byte bA0E = A0E();
        int iA0B = A0B();
        A00(this, iA0B);
        A0O(bA0E);
        C5091DVm c5091DVm = C5090DVl.A02;
        return new C5086DVg(bA0E, iA0B);
    }

    @Override // X.DVX
    public final String A0I() throws IOException {
        int iA0B = A0B();
        if (iA0B < 0) {
            TProtocolException tProtocolException = new TProtocolException(FGI.A0H("Negative length: ", iA0B));
            tProtocolException.type_ = 2;
            throw tProtocolException;
        }
        long j = this.A00;
        if (j > 0 && iA0B > j) {
            TProtocolException tProtocolException2 = new TProtocolException(String.format("String/binary length %s exceeded max allowed %s", Integer.valueOf(iA0B), Long.valueOf(j)));
            tProtocolException2.type_ = 3;
            throw tProtocolException2;
        }
        C5091DVm c5091DVm = C5090DVl.A02;
        byte[] bArr = new byte[iA0B];
        super.A00.A00(bArr, iA0B);
        return new String(bArr, AbstractC5088DVi.A00);
    }
}
