package X;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;

/* renamed from: X.GMk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9517GMk implements Serializable {
    public static final long serialVersionUID = 1;
    public final transient Object A00;
    public final boolean _isContentTextual;
    public final int _length;
    public final int _maxRawContentLength;
    public final int _offset;
    public static final C9517GMk A02 = new C9517GMk(null);
    public static final C9517GMk A01 = new C9517GMk(null);

    @Deprecated
    public C9517GMk(Object obj) {
        C9518GMl c9518GMl = C9518GMl.A00;
        this._isContentTextual = false;
        this.A00 = obj;
        this._offset = -1;
        this._length = -1;
        this._maxRawContentLength = c9518GMl._maxRawContentLength;
    }

    public static final void A00(int[] iArr, int i) {
        int i2 = iArr[0];
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= i) {
            i2 = i;
        }
        iArr[0] = i2;
        int i3 = iArr[1];
        int i4 = i - i2;
        if (i3 < 0 || i3 > i4) {
            iArr[1] = i4;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && (obj instanceof C9517GMk)) {
                C9517GMk c9517GMk = (C9517GMk) obj;
                if (this._offset == c9517GMk._offset && this._length == c9517GMk._length) {
                    Object obj2 = c9517GMk.A00;
                    Object obj3 = this.A00;
                    if (obj3 == null) {
                        if (obj2 == null) {
                        }
                    } else if (obj2 != null) {
                        if ((obj3 instanceof File) || (obj3 instanceof URL) || (obj3 instanceof URI)) {
                            return obj3.equals(obj2);
                        }
                        if (obj3 == obj2) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    private void readObject(ObjectInputStream objectInputStream) {
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A00);
    }

    public Object readResolve() {
        return A02;
    }

    public C9517GMk(C9518GMl c9518GMl, Object obj) {
        this._isContentTextual = true;
        this.A00 = obj;
        this._offset = -1;
        this._length = -1;
        this._maxRawContentLength = c9518GMl._maxRawContentLength;
    }
}
