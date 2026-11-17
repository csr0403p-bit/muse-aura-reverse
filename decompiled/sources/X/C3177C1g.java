package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.C1g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3177C1g extends C06G {
    public final int A00;
    public final Integer A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3177C1g) {
                C3177C1g c3177C1g = (C3177C1g) obj;
                if (this.A00 != c3177C1g.A00 || this.A01 != c3177C1g.A01 || this.A02 != c3177C1g.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        Integer num = this.A01;
        return C0KA.A00((i + BV5.A03(num, AbstractC3178C1h.A01(num))) * 31, this.A02);
    }

    public final String toString() {
        int i = this.A00;
        Integer num = this.A01;
        boolean z = this.A02;
        StringBuilder sbA0y = C60O.A0y("PowerStatsData(batteryLevel=", i);
        sbA0y.append(", batteryState=");
        sbA0y.append(num != null ? AbstractC3178C1h.A01(num) : HatchCcvLoggingKt.NO_POSTAL_FIELD);
        return C8j5.A0W(", isPowerSaveMode=", sbA0y, z);
    }

    public C3177C1g(int i, Integer num, boolean z) {
        this.A00 = i;
        this.A01 = num;
        this.A02 = z;
    }
}
