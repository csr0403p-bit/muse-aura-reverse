package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class EJ8 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EJ8[] A01;
    public static final EJ8 A02;
    public static final EJ8 A03;
    public static final EJ8 A04;

    static {
        EJ8 ej8 = new EJ8("NO_OP", 0);
        A03 = ej8;
        EJ8 ej82 = new EJ8("ADD", 1);
        A02 = ej82;
        EJ8 ej83 = new EJ8("REMOVE", 2);
        A04 = ej83;
        EJ8[] ej8Arr = {ej8, ej82, ej83};
        A01 = ej8Arr;
        A00 = C3cG.A0w(ej8Arr);
    }

    public static EJ8 valueOf(String str) {
        return (EJ8) Enum.valueOf(EJ8.class, str);
    }

    public static EJ8[] values() {
        return (EJ8[]) A01.clone();
    }

    public EJ8(String str, int i) {
    }
}
