package com.facebook.rsys.mediastats.gen;

import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class DedicatedStunQualityStats {
    public static G50<DedicatedStunQualityStats> CONVERTER = C8925Fth.A00(47);
    public static long sMcfTypeId;
    public final Integer lossRateBasisPoints;
    public final int receivedCount;
    public final Long rttP50Ms;
    public final Long rttP90Ms;
    public final int sentCount;
    public final String state;
    public final int totalProbes;

    public static native DedicatedStunQualityStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DedicatedStunQualityStats) {
                DedicatedStunQualityStats dedicatedStunQualityStats = (DedicatedStunQualityStats) obj;
                if (this.state.equals(dedicatedStunQualityStats.state) && this.totalProbes == dedicatedStunQualityStats.totalProbes && this.sentCount == dedicatedStunQualityStats.sentCount && this.receivedCount == dedicatedStunQualityStats.receivedCount) {
                    Integer num = this.lossRateBasisPoints;
                    Integer num2 = dedicatedStunQualityStats.lossRateBasisPoints;
                    if (num != null ? num.equals(num2) : num2 == null) {
                        Long l = this.rttP50Ms;
                        Long l2 = dedicatedStunQualityStats.rttP50Ms;
                        if (l == null) {
                            if (l2 != null) {
                                return false;
                            }
                        } else if (l.equals(l2)) {
                        }
                        Long l3 = this.rttP90Ms;
                        Long l4 = dedicatedStunQualityStats.rttP90Ms;
                        if (l3 == null) {
                            if (l4 != null) {
                                return false;
                            }
                        } else if (l3.equals(l4)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((BV8.A0B(this.state) + this.totalProbes) * 31) + this.sentCount) * 31) + this.receivedCount) * 31) + AnonymousClass006.A0D(this.lossRateBasisPoints)) * 31) + AnonymousClass006.A0D(this.rttP50Ms)) * 31) + C3cH.A02(this.rttP90Ms);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DedicatedStunQualityStats{state=");
        sbA0x.append(this.state);
        sbA0x.append(",totalProbes=");
        sbA0x.append(this.totalProbes);
        sbA0x.append(",sentCount=");
        sbA0x.append(this.sentCount);
        sbA0x.append(",receivedCount=");
        sbA0x.append(this.receivedCount);
        sbA0x.append(",lossRateBasisPoints=");
        sbA0x.append(this.lossRateBasisPoints);
        sbA0x.append(",rttP50Ms=");
        sbA0x.append(this.rttP50Ms);
        sbA0x.append(",rttP90Ms=");
        return BV8.A0v(this.rttP90Ms, sbA0x);
    }

    public DedicatedStunQualityStats(String str, int i, int i2, int i3, Integer num, Long l, Long l2) {
        str.getClass();
        this.state = str;
        this.totalProbes = i;
        this.sentCount = i2;
        this.receivedCount = i3;
        this.lossRateBasisPoints = num;
        this.rttP50Ms = l;
        this.rttP90Ms = l2;
    }
}
