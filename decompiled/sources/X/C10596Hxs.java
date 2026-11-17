package X;

/* renamed from: X.Hxs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10596Hxs {
    public final Hym A00;
    public final Long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10596Hxs) {
                C10596Hxs c10596Hxs = (C10596Hxs) obj;
                if (!C7384Etj.areEqual(this.A01, c10596Hxs.A01) || !this.A00.equals(c10596Hxs.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass006.A0D(this.A01) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("HealthConnectVersionInfo(apkVersionCode=");
        sbA0x.append(this.A01);
        sbA0x.append(", platformVersion=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public C10596Hxs(Hym hym, Long l) {
        this.A01 = l;
        this.A00 = hym;
    }
}
