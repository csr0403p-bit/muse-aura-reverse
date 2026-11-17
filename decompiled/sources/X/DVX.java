package X;

import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class DVX {
    public C5090DVl A00;

    public abstract byte A0E();

    public abstract long A0F();

    public abstract C5082DVb A0G();

    public abstract C5086DVg A0H();

    public abstract String A0I();

    public void A0J() throws IOException {
        A07((byte) 0);
    }

    public void A0K() {
    }

    public void A0L() {
    }

    public abstract void A0M();

    public abstract void A0N();

    public final C5087DVh A06() {
        byte bA0E;
        int iA0B;
        if (this instanceof DVZ) {
            C5086DVg c5086DVgA0H = A0H();
            bA0E = c5086DVgA0H.A00;
            iA0B = c5086DVgA0H.A01;
        } else {
            C5081DVa c5081DVa = (C5081DVa) this;
            bA0E = c5081DVa.A0E();
            iA0B = c5081DVa.A0B();
            C5081DVa.A00(c5081DVa, iA0B);
            c5081DVa.A0O(bA0E);
            C5091DVm c5091DVm = C5090DVl.A02;
        }
        return new C5087DVh(bA0E, iA0B);
    }

    public final void A07(byte b) throws IOException {
        if (this instanceof DVZ) {
            DVZ.A02((DVZ) this, b);
            return;
        }
        C5081DVa c5081DVa = (C5081DVa) this;
        byte[] bArr = c5081DVa.A01;
        bArr[0] = b;
        ((DVX) c5081DVa).A00.A01(bArr, 1);
    }

    public final void A08(int i) throws IOException {
        if (this instanceof DVZ) {
            DVZ.A05((DVZ) this, (i >> 31) ^ (i << 1));
            return;
        }
        C5081DVa c5081DVa = (C5081DVa) this;
        byte[] bArr = c5081DVa.A01;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        ((DVX) c5081DVa).A00.A01(bArr, 4);
    }

    public final void A09(short s) throws IOException {
        if (this instanceof DVZ) {
            DVZ.A05((DVZ) this, (s >> 31) ^ (s << 1));
            return;
        }
        C5081DVa c5081DVa = (C5081DVa) this;
        byte[] bArr = c5081DVa.A01;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        ((DVX) c5081DVa).A00.A01(bArr, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.DVX] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final byte[] A0A() throws IOException {
        int iA0B;
        ?? r3;
        if (this instanceof DVZ) {
            DVZ dvz = (DVZ) this;
            iA0B = DVZ.A01(dvz);
            DVZ.A04(dvz, iA0B);
            r3 = dvz;
            if (iA0B == 0) {
                return new byte[0];
            }
        } else {
            iA0B = A0B();
            this = this;
        }
        C5091DVm c5091DVm = C5090DVl.A02;
        byte[] bArr = new byte[iA0B];
        r3.A00.A00(bArr, iA0B);
        return bArr;
    }

    public int A0B() {
        int iA01 = DVZ.A01((DVZ) this);
        return (-(iA01 & 1)) ^ (iA01 >>> 1);
    }

    public C5085DVe A0C() {
        DVZ dvz = (DVZ) this;
        int iA01 = DVZ.A01(dvz);
        DVZ.A03(dvz, iA01);
        byte bA0E = iA01 == 0 ? (byte) 0 : dvz.A0E();
        byte bA00 = DVZ.A00((byte) (bA0E >> 4));
        byte bA002 = DVZ.A00((byte) (bA0E & 15));
        if (iA01 > 0) {
            dvz.A0O(bA00);
            dvz.A0O(bA002);
            C5091DVm c5091DVm = C5090DVl.A02;
        }
        return new C5085DVe(bA00, bA002, iA01);
    }

    public short A0D() {
        int iA01 = DVZ.A01((DVZ) this);
        return (short) ((-(iA01 & 1)) ^ (iA01 >>> 1));
    }
}
