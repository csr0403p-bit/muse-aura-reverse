package X;

/* renamed from: X.737, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass737 {
    public final int A00;
    public final int A01;
    public final C75e A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass737) {
                AnonymousClass737 anonymousClass737 = (AnonymousClass737) obj;
                if (this.A02 != anonymousClass737.A02 || this.A00 != anonymousClass737.A00 || this.A01 != anonymousClass737.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public static AnonymousClass737 A00(C75e c75e, int i, int i2) {
        return new AnonymousClass737(c75e, i, i2);
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0E(this.A02) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("BoxChildSelector(type=");
        sbA0x.append(this.A02);
        sbA0x.append(", horizontalAlignment=");
        sbA0x.append((Object) FGI.A0G("Horizontal(value=", ')', this.A00));
        sbA0x.append(", verticalAlignment=");
        sbA0x.append((Object) FGI.A0G("Vertical(value=", ')', this.A01));
        sbA0x.append(')');
        return sbA0x.toString();
    }

    public AnonymousClass737(C75e c75e, int i, int i2) {
        this.A02 = c75e;
        this.A00 = i;
        this.A01 = i2;
    }
}
