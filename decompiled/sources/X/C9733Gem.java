package X;

/* renamed from: X.Gem, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9733Gem extends C06G {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9733Gem) {
                C9733Gem c9733Gem = (C9733Gem) obj;
                if (!C7384Etj.areEqual(this.A00, c9733Gem.A00) || !C7384Etj.areEqual(this.A01, c9733Gem.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass006.A0G(this.A00) * 31) + AnonymousClass005.A0H(this.A01);
    }

    public C9733Gem(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
