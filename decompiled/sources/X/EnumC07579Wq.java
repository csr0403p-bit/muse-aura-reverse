package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9Wq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC07579Wq {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC07579Wq[] A01;
    public static final EnumC07579Wq A02;
    public static final EnumC07579Wq A03;
    public static final EnumC07579Wq A04;
    public static final EnumC07579Wq A05;
    public static final EnumC07579Wq A06;
    public final String serverValue;

    static {
        EnumC07579Wq enumC07579Wq = new EnumC07579Wq("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A05 = enumC07579Wq;
        EnumC07579Wq enumC07579Wq2 = new EnumC07579Wq("FB_PAGE", 1, "FB_PAGE");
        A02 = enumC07579Wq2;
        EnumC07579Wq enumC07579Wq3 = new EnumC07579Wq("IG_ACCOUNT", 2, "IG_ACCOUNT");
        A03 = enumC07579Wq3;
        EnumC07579Wq enumC07579Wq4 = new EnumC07579Wq("IG_EXPLORE_PLACE", 3, "IG_EXPLORE_PLACE");
        A04 = enumC07579Wq4;
        EnumC07579Wq enumC07579Wq5 = new EnumC07579Wq("OPENTABLE", 4, "OPENTABLE");
        EnumC07579Wq enumC07579Wq6 = new EnumC07579Wq("TRIPADVISOR", 5, "TRIPADVISOR");
        EnumC07579Wq enumC07579Wq7 = new EnumC07579Wq("WEBSITE", 6, "WEBSITE");
        A06 = enumC07579Wq7;
        EnumC07579Wq[] enumC07579WqArr = {enumC07579Wq, enumC07579Wq2, enumC07579Wq3, enumC07579Wq4, enumC07579Wq5, enumC07579Wq6, enumC07579Wq7, new EnumC07579Wq("YELP", 7, "YELP")};
        A01 = enumC07579WqArr;
        A00 = C3cG.A0w(enumC07579WqArr);
    }

    public static EnumC07579Wq valueOf(String str) {
        return (EnumC07579Wq) Enum.valueOf(EnumC07579Wq.class, str);
    }

    public static EnumC07579Wq[] values() {
        return (EnumC07579Wq[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverValue;
    }

    public EnumC07579Wq(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
