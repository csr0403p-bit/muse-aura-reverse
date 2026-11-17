package X;

/* renamed from: X.FLn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7941FLn {
    public final EnumC7949FMf A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7941FLn) && this.A00 == ((C7941FLn) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("BehaviorUpdate(dragToDismiss=", this.A00);
    }

    public C7941FLn(EnumC7949FMf enumC7949FMf) {
        this.A00 = enumC7949FMf;
    }
}
