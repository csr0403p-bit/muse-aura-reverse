package X;

/* renamed from: X.FNd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7970FNd {
    public static long A00(Hi0 hi0, long j) {
        Object customInfo = hi0.getCustomInfo("POSTNAV_DATA_TTL_MIILLI");
        if (customInfo != null) {
            return C3cG.A05(customInfo);
        }
        Object customInfo2 = hi0.getCustomInfo("DATA_TTL_MIILLI");
        return customInfo2 != null ? C3cG.A05(customInfo2) : j;
    }
}
