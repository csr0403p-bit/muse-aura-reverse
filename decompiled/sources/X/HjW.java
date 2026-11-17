package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HjW {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HjW[] A01;
    public static final HjW A02;
    public static final HjW A03;

    static {
        HjW hjW = new HjW("UNKNOWN", 0);
        A03 = hjW;
        HjW hjW2 = new HjW("INCOMING_RINGING", 1);
        HjW hjW3 = new HjW("IN_CALL", 2);
        A02 = hjW3;
        HjW[] hjWArr = {hjW, hjW2, hjW3};
        A01 = hjWArr;
        A00 = C3cG.A0w(hjWArr);
    }

    public static HjW valueOf(String str) {
        return (HjW) Enum.valueOf(HjW.class, str);
    }

    public static HjW[] values() {
        return (HjW[]) A01.clone();
    }

    public HjW(String str, int i) {
    }
}
