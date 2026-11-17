package X;

/* renamed from: X.Bbe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2451Bbe extends AbstractC2453Bbg {
    public final AbstractC2452Bbf A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2453Bbg) {
                C2451Bbe c2451Bbe = (C2451Bbe) ((AbstractC2453Bbg) obj);
                if (!this.A01.equals(c2451Bbe.A01) || !this.A00.equals(c2451Bbe.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A09(this.A00, (this.A01.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CameraId{cameraIdString=");
        sbA0x.append(this.A01);
        sbA0x.append(", cameraConfigId=");
        return BV8.A0v(this.A00, sbA0x);
    }

    public C2451Bbe(AbstractC2452Bbf abstractC2452Bbf, String str) {
        if (str == null) {
            throw BV4.A0a("Null cameraIdString");
        }
        this.A01 = str;
        this.A00 = abstractC2452Bbf;
    }
}
