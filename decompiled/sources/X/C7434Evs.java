package X;

/* renamed from: X.Evs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7434Evs {
    public static final C7434Evs A02 = new C7434Evs(0, false);
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        C7434Evs c7434Evs;
        if (this != obj) {
            if (!getClass().equals(obj != null ? obj.getClass() : null) || !(obj instanceof C7434Evs) || (c7434Evs = (C7434Evs) obj) == null || this.A00 != c7434Evs.A00 || this.A01 != c7434Evs.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(this.A00 * 31 * 31, this.A01);
    }

    public final String toString() {
        int i = this.A00;
        boolean z = this.A01;
        StringBuilder sbA0y = C60O.A0y("AnimatedOptions(loopCount=", i);
        sbA0y.append(C60N.A00(11));
        sbA0y.append((String) null);
        return C8j5.A0W(", disableAnimation=", sbA0y, z);
    }

    public C7434Evs(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
