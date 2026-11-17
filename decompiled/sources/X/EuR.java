package X;

import android.location.Location;

/* loaded from: classes5.dex */
public final class EuR {
    public final Location A00;

    public final Float A00() {
        Location location = this.A00;
        if (location.hasAccuracy()) {
            return Float.valueOf(location.getAccuracy());
        }
        return null;
    }

    public final Long A01() {
        long time = this.A00.getTime();
        if (time == 0) {
            return null;
        }
        return Long.valueOf(time);
    }

    public final String toString() {
        return this.A00.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EuR(android.location.Location r6) {
        /*
            r5 = this;
            r5.<init>()
            double r1 = r6.getLatitude()
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L16
            double r1 = r6.getLongitude()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L17
        L16:
            r1 = 1
        L17:
            java.lang.String r0 = "location must have latitude/longitude"
            com.google.common.base.Preconditions.checkArgument(r1, r0)
            r5.A00 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EuR.<init>(android.location.Location):void");
    }
}
