package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes6.dex */
public final class GEZ extends C9319GEa {
    public static final long serialVersionUID = 1;
    public final int bytesLength;
    public final int bytesOffset;

    private void readObject(ObjectInputStream in) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    public GEZ(byte[] bytes, int offset, int length) {
        super(bytes);
        GEY.A00(offset, offset + length, bytes.length);
        this.bytesOffset = offset;
        this.bytesLength = length;
    }

    public Object writeReplace() {
        byte[] bArr;
        int iA01 = A01();
        if (iA01 == 0) {
            bArr = AbstractC9349GFi.A05;
        } else {
            bArr = new byte[iA01];
            System.arraycopy(this.bytes, this.bytesOffset, bArr, 0, iA01);
        }
        return new C9319GEa(bArr);
    }
}
