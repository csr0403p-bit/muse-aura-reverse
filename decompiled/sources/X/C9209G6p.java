package X;

/* renamed from: X.G6p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9209G6p {
    public final CharSequence A00;
    public final CharSequence A01;
    public final G65 A02;

    public C9209G6p(CharSequence charSequence, CharSequence charSequence2, G65 g65) {
        C7384Etj.A0Y(charSequence, 1);
        this.A02 = g65;
        this.A00 = charSequence;
        this.A01 = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9209G6p) {
                C9209G6p c9209G6p = (C9209G6p) obj;
                if (!this.A02.equals(c9209G6p.A02) || !this.A00.equals(c9209G6p.A00) || !C7384Etj.areEqual(this.A01, c9209G6p.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A02)) + AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("LinkInfo(node=");
        sbA0x.append(this.A02);
        sbA0x.append(", destination=");
        sbA0x.append((Object) this.A00);
        sbA0x.append(", title=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }
}
