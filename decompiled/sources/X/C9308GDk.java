package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: X.GDk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9308GDk extends C9306GDi {
    public static final long serialVersionUID = 1;
    public final int bytesLength;
    public final int bytesOffset;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    public C9308GDk(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC9309GDl.A00(i, i + i2, bArr.length);
        this.bytesOffset = i;
        this.bytesLength = i2;
    }

    public Object writeReplace() {
        byte[] bArr;
        int iA01 = A01();
        if (iA01 == 0) {
            bArr = GGV.A04;
        } else {
            bArr = new byte[iA01];
            System.arraycopy(this.bytes, this.bytesOffset, bArr, 0, iA01);
        }
        return new C9306GDi(bArr);
    }
}
