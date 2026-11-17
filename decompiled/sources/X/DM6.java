package X;

/* loaded from: classes5.dex */
public final class DM6 extends AbstractC3582CVd<DM6> {
    public static final long serialVersionUID = 1;
    public float batteryLevelPct;
    public long batteryRealtimeMs;
    public long chargingRealtimeMs;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                DM6 dm6 = (DM6) obj;
                if (this.batteryLevelPct != dm6.batteryLevelPct || this.batteryRealtimeMs != dm6.batteryRealtimeMs || this.chargingRealtimeMs != dm6.chargingRealtimeMs) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        float f = this.batteryLevelPct;
        return C8j4.A0B(this.chargingRealtimeMs, AnonymousClass006.A06(this.batteryRealtimeMs, (f == 0.0f ? 0 : Float.floatToIntBits(f)) * 31));
    }

    public final String toString() {
        float f = this.batteryLevelPct;
        long j = this.batteryRealtimeMs;
        long j2 = this.chargingRealtimeMs;
        StringBuilder sbA0x = C60O.A0x("DeviceBatteryMetrics{batteryLevelPct=");
        sbA0x.append(f);
        sbA0x.append(", batteryRealtimeMs=");
        sbA0x.append(j);
        sbA0x.append(", chargingRealtimeMs=");
        sbA0x.append(j2);
        return BV7.A11(sbA0x);
    }
}
