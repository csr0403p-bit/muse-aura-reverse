package X;

import java.io.Serializable;

/* renamed from: X.GMj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9516GMj implements Serializable {
    public static final C9516GMj A01 = new C9516GMj(C9517GMk.A02, -1, -1, -1, -1);
    public static final long serialVersionUID = 2;
    public transient String A00;
    public final int _columnNr;
    public final C9517GMk _contentReference;
    public final int _lineNr;
    public final long _totalBytes;
    public final long _totalChars;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && (obj instanceof C9516GMj)) {
                C9516GMj c9516GMj = (C9516GMj) obj;
                C9517GMk c9517GMk = this._contentReference;
                C9517GMk c9517GMk2 = c9516GMj._contentReference;
                if (c9517GMk == null) {
                    if (c9517GMk2 == null) {
                    }
                } else if (!c9517GMk.equals(c9517GMk2)) {
                    return false;
                }
                if (this._lineNr != c9516GMj._lineNr || this._columnNr != c9516GMj._columnNr || this._totalChars != c9516GMj._totalChars || this._totalBytes != c9516GMj._totalBytes) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this._contentReference == null ? 1 : 2) ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9516GMj.toString():java.lang.String");
    }

    public C9516GMj(C9517GMk c9517GMk, int i, int i2, long j, long j2) {
        this._contentReference = c9517GMk == null ? C9517GMk.A02 : c9517GMk;
        this._totalBytes = j;
        this._totalChars = j2;
        this._lineNr = i;
        this._columnNr = i2;
    }
}
