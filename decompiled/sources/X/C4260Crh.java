package X;

@Deprecated
/* renamed from: X.Crh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4260Crh implements InterfaceC3786CeU {
    public static final C4260Crh A02 = new C4260Crh(AnonymousClass001.A0h(), null);
    public final String A00;
    public final boolean A01;

    public C4260Crh(Boolean bool, String str) {
        this.A01 = bool.booleanValue();
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C4260Crh) {
                C4260Crh c4260Crh = (C4260Crh) obj;
                if (this.A01 != c4260Crh.A01 || !CS7.A01(this.A00, c4260Crh.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV7.A0E(null, Boolean.valueOf(this.A01), this.A00);
    }
}
