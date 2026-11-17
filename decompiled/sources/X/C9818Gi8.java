package X;

/* renamed from: X.Gi8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9818Gi8 extends AbstractC9789Ggy {
    public static final C9818Gi8[] A00;
    public final int _value;

    @Override // X.AbstractC9804GhQ
    public final boolean equals(Object obj) {
        return obj == this || (obj != null && (obj instanceof C9818Gi8) && ((C9818Gi8) obj)._value == this._value);
    }

    static {
        C9818Gi8[] c9818Gi8Arr = new C9818Gi8[12];
        A00 = c9818Gi8Arr;
        int i = 0;
        do {
            c9818Gi8Arr[i] = new C9818Gi8(i - 1);
            i++;
        } while (i < 12);
    }

    @Override // X.AbstractC9941Glq
    public final int hashCode() {
        return this._value;
    }

    public C9818Gi8(int i) {
        this._value = i;
    }
}
