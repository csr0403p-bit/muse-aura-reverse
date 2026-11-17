package X;

/* renamed from: X.736, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass736 {
    public final int A00;
    public final C75e A01;
    public final C059472r A02;
    public final C059572s A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass736) {
                AnonymousClass736 anonymousClass736 = (AnonymousClass736) obj;
                if (this.A01 != anonymousClass736.A01 || this.A00 != anonymousClass736.A00 || !C7384Etj.areEqual(this.A02, anonymousClass736.A02) || !C7384Etj.areEqual(this.A03, anonymousClass736.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass736 A00(C75e c75e, C059472r c059472r, C059572s c059572s, int i) {
        return new AnonymousClass736(c75e, c059472r, c059572s, i);
    }

    public final int hashCode() {
        int iA0E = (AnonymousClass005.A0E(this.A01) + this.A00) * 31;
        C059472r c059472r = this.A02;
        int i = (iA0E + (c059472r == null ? 0 : c059472r.A00)) * 31;
        C059572s c059572s = this.A03;
        return i + (c059572s != null ? c059572s.A00 : 0);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ContainerSelector(type=");
        sbA0x.append(this.A01);
        sbA0x.append(", numChildren=");
        sbA0x.append(this.A00);
        sbA0x.append(", horizontalAlignment=");
        sbA0x.append(this.A02);
        sbA0x.append(", verticalAlignment=");
        return AnonymousClass007.A0Z(this.A03, sbA0x);
    }

    public AnonymousClass736(C75e c75e, C059472r c059472r, C059572s c059572s, int i) {
        this.A01 = c75e;
        this.A00 = i;
        this.A02 = c059472r;
        this.A03 = c059572s;
    }
}
