package X;

/* renamed from: X.GLg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9490GLg extends AbstractC9494GLk {
    public final int A00;
    public final C9486GLc A01;

    public final boolean equals(Object o) {
        if (!(o instanceof C9490GLg)) {
            return false;
        }
        C9490GLg c9490GLg = (C9490GLg) o;
        return c9490GLg.A00 == this.A00 && c9490GLg.A01 == this.A01;
    }

    public final int hashCode() {
        return BV7.A0E(C9490GLg.class, Integer.valueOf(this.A00), this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AesSiv Parameters (variant: ");
        AbstractC7608F5v.A1O(sbA0x, this.A01);
        sbA0x.append(this.A00);
        return AnonymousClass001.A0v("-byte key)", sbA0x);
    }

    public C9490GLg(C9486GLc keySizeBytes, int variant) {
        this.A00 = variant;
        this.A01 = keySizeBytes;
    }
}
