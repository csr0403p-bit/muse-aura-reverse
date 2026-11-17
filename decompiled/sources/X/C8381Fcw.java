package X;

/* renamed from: X.Fcw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8381Fcw {
    public final int A00;
    public final CharSequence A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C8381Fcw) {
            C8381Fcw c8381Fcw = (C8381Fcw) obj;
            if (this.A00 == c8381Fcw.A00) {
                CharSequence charSequence = c8381Fcw.A01;
                CharSequence charSequence2 = this.A01;
                String string = charSequence2 != null ? charSequence2.toString() : null;
                String string2 = charSequence != null ? charSequence.toString() : null;
                if (string == null) {
                    if (string2 == null) {
                        return true;
                    }
                } else if (string.equals(string2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.A00);
        CharSequence charSequence = this.A01;
        return BV7.A0D(numValueOf, charSequence != null ? charSequence.toString() : null);
    }

    public C8381Fcw(int i, CharSequence charSequence) {
        this.A00 = i;
        this.A01 = charSequence;
    }
}
