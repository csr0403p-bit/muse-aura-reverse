package X;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.Fvh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8982Fvh {
    public static final Map<String, G0V<C8978Fvd, Double, Unit>> A03 = AGH.A0D(C3cG.A0r("steps_sum", new I16(0)), C3cG.A0r("active_energy_sum", new I16(15)), C3cG.A0r("basal_energy_sum", new I16(16)), C3cG.A0r("distance_sum", new I16(1)), C3cG.A0r("flights_climbed_sum", new I16(2)), C3cG.A0r("heart_rate_average", new I16(3)), C3cG.A0r("heart_rate_max", new I16(4)), C3cG.A0r("resting_heart_rate_average", new I16(5)), C3cG.A0r("heart_rate_variability_average", new I16(6)), C3cG.A0r("vo2_max_average", new I16(7)), C3cG.A0r("body_fat_percentage_average", new I16(8)), C3cG.A0r("body_mass_average", new I16(9)), C3cG.A0r("elevation_gained_sum", new I16(10)), C3cG.A0r("total_energy_sum", new I16(11)), C3cG.A0r("body_water_mass_average", new I16(12)), C3cG.A0r("bone_mass_average", new I16(13)), C3cG.A0r("lean_body_mass_average", new I16(14)));
    public final List<C8966Fuk> A00;
    public final Instant A01;
    public final Instant A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8982Fvh) {
                C8982Fvh c8982Fvh = (C8982Fvh) obj;
                if (!this.A02.equals(c8982Fvh.A02) || !this.A01.equals(c8982Fvh.A01) || !this.A00.equals(c8982Fvh.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A02)));
    }

    public final String toString() {
        Instant instant = this.A02;
        Instant instant2 = this.A01;
        List<C8966Fuk> list = this.A00;
        StringBuilder sbA0f = C3cG.A0f(instant, "MetaHealthCombinedStatisticsResult(startDate=");
        sbA0f.append(", endDate=");
        sbA0f.append(instant2);
        return C3cJ.A0L(list, C8j2.A00(11), sbA0f);
    }

    public C8982Fvh(Instant instant, Instant instant2, List<C8966Fuk> list) {
        AnonymousClass003.A0v(instant, list);
        this.A02 = instant;
        this.A01 = instant2;
        this.A00 = list;
    }
}
