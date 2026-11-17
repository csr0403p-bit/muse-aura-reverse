package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Hl3 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ Hl3[] A01;
    public static final Hl3 A02;
    public final String useCaseName;

    static {
        Hl3 hl3 = new Hl3("MSGR_ENC_BACKUP", 0, "MSGR_ENC_BACKUP");
        Hl3 hl32 = new Hl3("IGD_ENC_BACKUP", 1, "IGD_ENC_BACKUP");
        Hl3 hl33 = new Hl3("HATCH", 2, "HATCH");
        A02 = hl33;
        Hl3[] hl3Arr = {hl3, hl32, hl33, new Hl3("WA_CLOUD_STORAGE", 3, "WA_CLOUD_STORAGE"), new Hl3("MNEMO_PERSONAL_CLOUD", 4, "MNEMO_PERSONAL_CLOUD")};
        A01 = hl3Arr;
        A00 = C3cG.A0w(hl3Arr);
    }

    public static Hl3 valueOf(String str) {
        return (Hl3) Enum.valueOf(Hl3.class, str);
    }

    public static Hl3[] values() {
        return (Hl3[]) A01.clone();
    }

    public Hl3(String str, int i, String str2) {
        this.useCaseName = str2;
    }
}
