package X;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: X.Go0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10026Go0 implements InterfaceC10180Gqq, Serializable {
    public static final Gn4 A01 = Gn4.A00;
    public static final long serialVersionUID = 1;
    public transient String A00;
    public volatile char[] _quotedChars;
    public volatile byte[] _quotedUTF8Ref;
    public volatile byte[] _unquotedUTF8Ref;
    public final String _value;

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this._value);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._value.equals(((C10026Go0) obj)._value);
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    public Object readResolve() {
        return new C10026Go0(this.A00);
    }

    public final String toString() {
        return this._value;
    }

    public C10026Go0(String str) {
        Hqg.A00(str, "Null String illegal for SerializedString");
        this._value = str;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.A00 = objectInputStream.readUTF();
    }

    @Override // X.InterfaceC10180Gqq
    public final int A4M(byte[] bArr, int i) {
        byte[] bArrA1a = AbstractC7610F5x.A1a(this);
        int length = bArrA1a.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrA1a, 0, bArr, i, length);
        return length;
    }
}
