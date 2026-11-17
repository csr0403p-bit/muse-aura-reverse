package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EOI {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EOI[] A01;
    public static final EOI A02;
    public static final EOI A03;
    public static final EOI A04;
    public static final EOI A05;
    public final String key;

    static {
        EOI eoi = new EOI("RESOLVER_TYPE", 0, "resolver_type");
        A05 = eoi;
        EOI eoi2 = new EOI("ERROR", 1, "error");
        A02 = eoi2;
        EOI eoi3 = new EOI("PROVIDER_URL", 2, "provider_url");
        A03 = eoi3;
        EOI eoi4 = new EOI("PROVIDER_VERSION", 3, "provider_version");
        A04 = eoi4;
        EOI[] eoiArr = {eoi, eoi2, eoi3, eoi4};
        A01 = eoiArr;
        A00 = C3cG.A0w(eoiArr);
    }

    public static EOI valueOf(String str) {
        return (EOI) Enum.valueOf(EOI.class, str);
    }

    public static EOI[] values() {
        return (EOI[]) A01.clone();
    }

    public EOI(String str, int i, String str2) {
        this.key = str2;
    }
}
