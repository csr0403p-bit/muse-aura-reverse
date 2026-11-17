package X;

import java.util.Arrays;

/* renamed from: X.Ghl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9811Ghl extends AbstractC9806GhU {
    public static final C9811Ghl A00 = new C9811Ghl(new byte[0]);
    public static final long serialVersionUID = 2;
    public final byte[] _data;

    @Override // X.AbstractC9804GhQ
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || !(obj instanceof C9811Ghl)) {
                return false;
            }
            byte[] bArr = ((C9811Ghl) obj)._data;
            byte[] bArr2 = this._data;
            if (bArr2 != bArr) {
                if (bArr2 == null || bArr == null) {
                    return false;
                }
                return Arrays.equals(bArr2, bArr);
            }
        }
        return true;
    }

    @Override // X.AbstractC9941Glq
    public final int hashCode() {
        byte[] bArr = this._data;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }

    public C9811Ghl(byte[] bArr) {
        this._data = bArr;
    }
}
