package X;

import java.util.Map;

/* renamed from: X.Fuk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8966Fuk {
    public final long A00;
    public final long A01;
    public final Double A02;
    public final Double A03;
    public final Double A04;
    public final Double A05;
    public final Double A06;
    public final Double A07;
    public final Double A08;
    public final Double A09;
    public final Double A0A;
    public final Double A0B;
    public final Double A0C;
    public final Double A0D;
    public final Double A0E;
    public final Double A0F;
    public final Double A0G;
    public final Integer A0H;
    public final Integer A0I;
    public final String A0J;
    public final Map<String, Double> A0K;
    public final String A0L;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8966Fuk) {
                C8966Fuk c8966Fuk = (C8966Fuk) obj;
                if (this.A01 != c8966Fuk.A01 || this.A00 != c8966Fuk.A00 || !this.A0J.equals(c8966Fuk.A0J) || !this.A0L.equals(c8966Fuk.A0L) || !C7384Etj.areEqual(this.A0I, c8966Fuk.A0I) || !C7384Etj.areEqual(this.A02, c8966Fuk.A02) || !C7384Etj.areEqual(this.A03, c8966Fuk.A03) || !C7384Etj.areEqual(this.A08, c8966Fuk.A08) || !C7384Etj.areEqual(this.A0H, c8966Fuk.A0H) || !C7384Etj.areEqual(this.A0B, c8966Fuk.A0B) || !C7384Etj.areEqual(this.A0C, c8966Fuk.A0C) || !C7384Etj.areEqual(this.A0E, c8966Fuk.A0E) || !C7384Etj.areEqual(this.A0A, c8966Fuk.A0A) || !C7384Etj.areEqual(this.A0G, c8966Fuk.A0G) || !C7384Etj.areEqual(this.A04, c8966Fuk.A04) || !C7384Etj.areEqual(this.A05, c8966Fuk.A05) || !C7384Etj.areEqual(this.A09, c8966Fuk.A09) || !C7384Etj.areEqual(this.A0F, c8966Fuk.A0F) || !C7384Etj.areEqual(this.A06, c8966Fuk.A06) || !C7384Etj.areEqual(this.A07, c8966Fuk.A07) || !C7384Etj.areEqual(this.A0D, c8966Fuk.A0D) || !C7384Etj.areEqual(this.A0K, c8966Fuk.A0K)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((AnonymousClass005.A0I(this.A0L, AnonymousClass005.A0I(this.A0J, AnonymousClass006.A06(this.A00, AnonymousClass005.A07(this.A01)))) + AnonymousClass006.A0D(this.A0I)) * 31) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass006.A0D(this.A03)) * 31) + AnonymousClass006.A0D(this.A08)) * 31) + AnonymousClass006.A0D(this.A0H)) * 31) + AnonymousClass006.A0D(this.A0B)) * 31) + AnonymousClass006.A0D(this.A0C)) * 31) + AnonymousClass006.A0D(this.A0E)) * 31) + AnonymousClass006.A0D(this.A0A)) * 31) + AnonymousClass006.A0D(this.A0G)) * 31) + AnonymousClass006.A0D(this.A04)) * 31) + AnonymousClass006.A0D(this.A05)) * 31) + AnonymousClass006.A0D(this.A09)) * 31) + AnonymousClass006.A0D(this.A0F)) * 31) + AnonymousClass006.A0D(this.A06)) * 31) + AnonymousClass006.A0D(this.A07)) * 31) + AnonymousClass006.A0D(this.A0D)) * 31) + C3cH.A02(this.A0K);
    }

    public final String toString() {
        long j = this.A01;
        long j2 = this.A00;
        String str = this.A0J;
        String str2 = this.A0L;
        Integer num = this.A0I;
        Double d = this.A02;
        Double d2 = this.A03;
        Double d3 = this.A08;
        Integer num2 = this.A0H;
        Double d4 = this.A0B;
        Double d5 = this.A0C;
        Double d6 = this.A0E;
        Double d7 = this.A0A;
        Double d8 = this.A0G;
        Double d9 = this.A04;
        Double d10 = this.A05;
        Double d11 = this.A09;
        Double d12 = this.A0F;
        Double d13 = this.A06;
        Double d14 = this.A07;
        Double d15 = this.A0D;
        Map<String, Double> map = this.A0K;
        StringBuilder sbA0z = C60O.A0z("Row(startTimeSec=", j);
        sbA0z.append(", endTimeSec=");
        sbA0z.append(j2);
        AbstractC7610F5x.A1N(str, str2, sbA0z);
        sbA0z.append(", stepCount=");
        sbA0z.append(num);
        sbA0z.append(", activeEnergy=");
        sbA0z.append(d);
        sbA0z.append(", basalEnergyBurned=");
        sbA0z.append(d2);
        sbA0z.append(", distanceWalkingRunningMeters=");
        sbA0z.append(d3);
        sbA0z.append(", flightsClimbed=");
        sbA0z.append(num2);
        sbA0z.append(", hrAverage=");
        sbA0z.append(d4);
        sbA0z.append(", hrMax=");
        sbA0z.append(d5);
        sbA0z.append(", restingHrAverage=");
        sbA0z.append(d6);
        sbA0z.append(", heartRateVariabilityMs=");
        sbA0z.append(d7);
        sbA0z.append(", vo2Max=");
        sbA0z.append(d8);
        sbA0z.append(", bodyFatPercentage=");
        sbA0z.append(d9);
        sbA0z.append(", bodyMassKg=");
        sbA0z.append(d10);
        sbA0z.append(", elevationGainedM=");
        sbA0z.append(d11);
        sbA0z.append(", totalEnergyKcal=");
        sbA0z.append(d12);
        sbA0z.append(", bodyWaterMassKg=");
        sbA0z.append(d13);
        sbA0z.append(", boneMassKg=");
        sbA0z.append(d14);
        sbA0z.append(", leanBodyMassKg=");
        sbA0z.append(d15);
        return C3cJ.A0L(map, ", extra=", sbA0z);
    }

    /* JADX WARN: Incorrect types in method signature: (JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Double;>;)V */
    public C8966Fuk(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11, Double d12, Double d13, Double d14, Double d15, Integer num, Integer num2, String str, String str2, Map map, long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
        this.A0J = str;
        this.A0L = str2;
        this.A0I = num;
        this.A02 = d;
        this.A03 = d2;
        this.A08 = d3;
        this.A0H = num2;
        this.A0B = d4;
        this.A0C = d5;
        this.A0E = d6;
        this.A0A = d7;
        this.A0G = d8;
        this.A04 = d9;
        this.A05 = d10;
        this.A09 = d11;
        this.A0F = d12;
        this.A06 = d13;
        this.A07 = d14;
        this.A0D = d15;
        this.A0K = map;
    }
}
