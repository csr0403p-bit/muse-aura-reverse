package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: X.GEe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9323GEe extends C9322GEd {
    public static final long serialVersionUID = 1;
    public final int bytesLength;
    public final int bytesOffset;

    private void readObject(ObjectInputStream in) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    public C9323GEe(byte[] bytes, int offset, int length) {
        super(bytes);
        AbstractC9320GEb.A00(offset, offset + length, bytes.length);
        this.bytesOffset = offset;
        this.bytesLength = length;
    }

    public Object writeReplace() {
        byte[] bArr;
        int iA02 = A02();
        if (iA02 == 0) {
            bArr = AbstractC9351GFk.A05;
        } else {
            bArr = new byte[iA02];
            A04(bArr, iA02);
        }
        return new C9322GEd(bArr);
    }
}
