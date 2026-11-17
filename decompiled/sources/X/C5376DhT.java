package X;

import com.google.common.base.Objects;

/* renamed from: X.DhT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5376DhT {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5376DhT) {
                C5376DhT c5376DhT = (C5376DhT) obj;
                if (this.A00 != c5376DhT.A00 || this.A01 != c5376DhT.A01 || !Objects.equal(this.A03, c5376DhT.A03) || !Objects.equal(this.A02, c5376DhT.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A0A(this.A03, this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
    }

    public C5376DhT(String str, String str2, int i, int i2) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = i2;
    }
}
