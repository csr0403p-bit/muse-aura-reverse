package X;

import java.io.Serializable;

/* renamed from: X.Gps, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10127Gps implements Serializable {
    public static final C10127Gps A00 = new C10127Gps(new Object[4], 1, 0);
    public static final long serialVersionUID = 1;
    public final Object[] _hashArea;
    public final int _hashMask;
    public final int _spillCount;

    public C10127Gps(Object[] objArr, int i, int i2) {
        this._hashMask = i;
        this._spillCount = i2;
        this._hashArea = objArr;
    }

    public final Object A00(String str) {
        int iHashCode = str.hashCode();
        int i = this._hashMask;
        int i2 = iHashCode & i;
        int i3 = i2 << 1;
        Object[] objArr = this._hashArea;
        Object obj = objArr[i3];
        if (obj != str && !str.equals(obj)) {
            if (obj == null) {
                return null;
            }
            int i4 = i + 1;
            i3 = ((i2 >> 1) + i4) << 1;
            Object obj2 = objArr[i3];
            if (!str.equals(obj2)) {
                if (obj2 == null) {
                    return null;
                }
                i3 = (i4 + (i4 >> 1)) << 1;
                int i5 = this._spillCount + i3;
                while (i3 < i5) {
                    Object obj3 = objArr[i3];
                    if (obj3 != str && !str.equals(obj3)) {
                        i3 += 2;
                    }
                }
                return null;
            }
        }
        return objArr[i3 + 1];
    }
}
