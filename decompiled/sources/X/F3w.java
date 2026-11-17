package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public final class F3w<T extends Enum<T>> extends AH7<T> implements Ey9<T>, RandomAccess, Serializable {
    public final T[] entries;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException(C8j2.A00(1));
    }

    private final Object writeReplace() {
        return new C7557F3q(this.entries);
    }

    @Override // X.AbstractC0890AGr
    public final int A0D() {
        return this.entries.length;
    }

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) obj;
        C7384Etj.A0Y(r5, 0);
        T[] tArr = this.entries;
        int iOrdinal = r5.ordinal();
        C7384Etj.A0Y(tArr, 0);
        return iOrdinal >= 0 && iOrdinal < tArr.length && tArr[iOrdinal] == r5;
    }

    @Override // X.AH7, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        AH7.A01(i, this.entries.length);
        return this.entries[i];
    }

    @Override // X.AH7, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iA0E = AnonymousClass001.A0E(r4, 0);
        T[] tArr = this.entries;
        C7384Etj.A0Y(tArr, 0);
        if (iA0E < 0 || iA0E >= tArr.length || tArr[iA0E] != r4) {
            return -1;
        }
        return iA0E;
    }

    @Override // X.AH7, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iA0E = AnonymousClass001.A0E(r4, 0);
        T[] tArr = this.entries;
        C7384Etj.A0Y(tArr, 0);
        if (iA0E < 0 || iA0E >= tArr.length || tArr[iA0E] != r4) {
            return -1;
        }
        return iA0E;
    }

    public F3w(T[] tArr) {
        this.entries = tArr;
    }
}
