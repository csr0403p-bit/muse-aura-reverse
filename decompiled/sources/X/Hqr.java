package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Hqr {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ Hqr[] A01;
    public static final Hqr A02;
    public static final Hqr A03;
    public final Number type;

    public static Hqr valueOf(String str) {
        return (Hqr) Enum.valueOf(Hqr.class, str);
    }

    public static Hqr[] values() {
        return (Hqr[]) A01.clone();
    }

    static {
        Hqr hqr = new Hqr(3707012, "ANDROID_BILLING_CLIENT_NOT_READY", 0);
        A02 = hqr;
        Hqr hqr2 = new Hqr(3707013, "ANDROID_CANNOT_CONNECT_PLAY_STORE", 1);
        Hqr hqr3 = new Hqr(3707014, "META_COUNTRY_BLOCKLISTED", 2);
        A03 = hqr3;
        Hqr[] hqrArr = {hqr, hqr2, hqr3, new Hqr(3707018, "ANDROID_OS_VERSION_UNSUPPORTED", 3)};
        A01 = hqrArr;
        A00 = C3cG.A0w(hqrArr);
    }

    public Hqr(Number number, String str, int i) {
        this.type = number;
    }
}
