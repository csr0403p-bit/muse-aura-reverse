package X;

/* loaded from: classes6.dex */
public final class Hym {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof Hym) && this.A00.equals(((Hym) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, 1054);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("HealthConnectPlatformVersion(buildVersionCode=");
        sbA0x.append(34);
        sbA0x.append(", sdkExtensionVersion=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public Hym(Integer num) {
        this.A00 = num;
    }
}
