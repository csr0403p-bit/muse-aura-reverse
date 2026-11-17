package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.F3r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC7558F3r {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC7558F3r[] A01;
    public static final EnumC7558F3r A02;
    public final String serverValue;

    static {
        EnumC7558F3r enumC7558F3r = new EnumC7558F3r("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A02 = enumC7558F3r;
        EnumC7558F3r[] enumC7558F3rArr = {enumC7558F3r, new EnumC7558F3r("FB", 1, "FB"), new EnumC7558F3r("IG", 2, "IG"), new EnumC7558F3r("SEATGEEK", 3, "SEATGEEK"), new EnumC7558F3r("TRIPADVISOR", 4, "TRIPADVISOR"), new EnumC7558F3r("YELP", 5, "YELP")};
        A01 = enumC7558F3rArr;
        A00 = C3cG.A0w(enumC7558F3rArr);
    }

    public static EnumC7558F3r valueOf(String str) {
        return (EnumC7558F3r) Enum.valueOf(EnumC7558F3r.class, str);
    }

    public static EnumC7558F3r[] values() {
        return (EnumC7558F3r[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverValue;
    }

    public EnumC7558F3r(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
