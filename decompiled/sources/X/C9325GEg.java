package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: X.GEg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9325GEg extends C9324GEf {
    public static final long serialVersionUID = 1;
    public final int bytesLength;
    public final int bytesOffset;

    private void readObject(ObjectInputStream in) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    public C9325GEg(byte[] bytes, int offset, int length) {
        super(bytes);
        AbstractC9321GEc.A00(offset, offset + length, bytes.length);
        this.bytesOffset = offset;
        this.bytesLength = length;
    }

    public Object writeReplace() {
        return new C9324GEf(A04());
    }
}
