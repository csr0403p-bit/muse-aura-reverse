package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ENz {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ ENz[] A01;
    public static final ENz A02;
    public static final ENz A03;
    public static final ENz A04;
    public static final ENz A05;
    public static final ENz A06;
    public static final ENz A07;
    public static final ENz A08;
    public static final ENz A09;
    public static final ENz A0A;
    public static final ENz A0B;
    public static final ENz A0C;
    public static final ENz A0D;
    public static final ENz A0E;
    public static final ENz A0F;

    static {
        ENz eNz = new ENz("UNCONFIGURED_APP", 0);
        A0E = eNz;
        ENz eNz2 = new ENz("RESOLVER_ERROR", 1);
        A0D = eNz2;
        ENz eNz3 = new ENz("APP_NOT_INSTALLED", 2);
        A03 = eNz3;
        ENz eNz4 = new ENz("APP_DISABLED", 3);
        A02 = eNz4;
        ENz eNz5 = new ENz("MISSING_CONTENT_PROVIDER_CLIENT", 4);
        A0A = eNz5;
        ENz eNz6 = new ENz("MULTIPLE_CREDENTIAL_SOURCES", 5);
        ENz eNz7 = new ENz("INVALID_CREDENTIAL_SOURCE", 6);
        A06 = eNz7;
        ENz eNz8 = new ENz("EMPTY_USER_ID", 7);
        A05 = eNz8;
        ENz eNz9 = new ENz("MISSING_PERMISSION", 8);
        A0B = eNz9;
        ENz eNz10 = new ENz("PROD_DEBUG_MISMATCH", 9);
        A0C = eNz10;
        ENz eNz11 = new ENz("ITEM_INVALID_FORMAT", 10);
        A08 = eNz11;
        ENz eNz12 = new ENz("ITEM_MISSING_FIELD", 11);
        A09 = eNz12;
        ENz eNz13 = new ENz("ITEM_EXPIRED", 12);
        A07 = eNz13;
        ENz eNz14 = new ENz("CANCELLED", 13);
        A04 = eNz14;
        ENz eNz15 = new ENz("UNKNOWN", 14);
        A0F = eNz15;
        ENz[] eNzArr = {eNz, eNz2, eNz3, eNz4, eNz5, eNz6, eNz7, eNz8, eNz9, eNz10, eNz11, eNz12, eNz13, eNz14, eNz15};
        A01 = eNzArr;
        A00 = C3cG.A0w(eNzArr);
    }

    public static ENz valueOf(String str) {
        return (ENz) Enum.valueOf(ENz.class, str);
    }

    public static ENz[] values() {
        return (ENz[]) A01.clone();
    }

    public ENz(String str, int i) {
    }
}
