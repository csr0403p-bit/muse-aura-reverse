package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class Eu4 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ Eu4[] A01;
    public static final Eu4 A02;
    public static final Eu4 A03;

    static {
        Eu4 eu4 = new Eu4("REQUIRED", 0);
        A03 = eu4;
        Eu4 eu42 = new Eu4("OPTIONAL", 1);
        A02 = eu42;
        Eu4[] eu4Arr = {eu4, eu42};
        A01 = eu4Arr;
        A00 = C3cG.A0w(eu4Arr);
    }

    public static Eu4 valueOf(String str) {
        return (Eu4) Enum.valueOf(Eu4.class, str);
    }

    public static Eu4[] values() {
        return (Eu4[]) A01.clone();
    }

    public Eu4(String str, int i) {
    }
}
