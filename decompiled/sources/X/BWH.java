package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BWH {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BWH[] A01;
    public static final BWH A02;
    public static final BWH A03;
    public final String alignmentPointNamePrefix;

    static {
        BWH bwh = new BWH("BEFORE_REQUEST_SENT", 0, "join_request_");
        A03 = bwh;
        BWH bwh2 = new BWH("AFTER_REQUEST_RECEIVED", 1, "join_request_");
        BWH bwh3 = new BWH("BEFORE_RESPONSE_SENT", 2, "join_response_");
        BWH bwh4 = new BWH("AFTER_RESPONSE_RECEIVED", 3, "join_response_");
        A02 = bwh4;
        BWH[] bwhArr = {bwh, bwh2, bwh3, bwh4};
        A01 = bwhArr;
        A00 = C3cG.A0w(bwhArr);
    }

    public static BWH valueOf(String str) {
        return (BWH) Enum.valueOf(BWH.class, str);
    }

    public static BWH[] values() {
        return (BWH[]) A01.clone();
    }

    public BWH(String str, int i, String str2) {
        this.alignmentPointNamePrefix = str2;
    }
}
