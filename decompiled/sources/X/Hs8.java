package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Hs8 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ Hs8[] A01;
    public static final Hs8 A02;
    public static final Hs8 A03;

    static {
        Hs8 hs8 = new Hs8("SUBS", 0);
        A03 = hs8;
        Hs8 hs82 = new Hs8("INAPP", 1);
        A02 = hs82;
        Hs8[] hs8Arr = {hs8, hs82};
        A01 = hs8Arr;
        A00 = C3cG.A0w(hs8Arr);
    }

    public static Hs8 valueOf(String str) {
        return (Hs8) Enum.valueOf(Hs8.class, str);
    }

    public static Hs8[] values() {
        return (Hs8[]) A01.clone();
    }

    public Hs8(String str, int i) {
    }
}
