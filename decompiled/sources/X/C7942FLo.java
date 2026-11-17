package X;

/* renamed from: X.FLo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7942FLo {
    public final EnumC7946FMb A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7942FLo) && this.A00 == ((C7942FLo) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("KeyboardUpdate(keyboardMode=", this.A00);
    }

    public C7942FLo(EnumC7946FMb enumC7946FMb) {
        this.A00 = enumC7946FMb;
    }
}
