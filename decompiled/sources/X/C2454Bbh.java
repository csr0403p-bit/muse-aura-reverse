package X;

/* renamed from: X.Bbh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2454Bbh extends AbstractC2452Bbf {
    public final Object A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2452Bbf) {
            return this.A00.equals(((C2454Bbh) ((AbstractC2452Bbf) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() ^ 1000003;
    }

    public final String toString() {
        return BV8.A0v(this.A00, C60O.A0x("Identifier{value="));
    }

    public C2454Bbh(Object obj) {
        this.A00 = obj;
    }
}
