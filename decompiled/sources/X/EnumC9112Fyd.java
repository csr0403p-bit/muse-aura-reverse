package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Fyd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC9112Fyd {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC9112Fyd[] A01;
    public static final EnumC9112Fyd A02;
    public static final EnumC9112Fyd A03;

    static {
        C9135Fz0 c9135Fz0 = new C9135Fz0();
        A02 = c9135Fz0;
        Fz2 fz2 = new Fz2();
        A03 = fz2;
        EnumC9112Fyd[] enumC9112FydArr = {c9135Fz0, fz2};
        A01 = enumC9112FydArr;
        A00 = C3cG.A0w(enumC9112FydArr);
    }

    public static EnumC9112Fyd valueOf(String str) {
        return (EnumC9112Fyd) Enum.valueOf(EnumC9112Fyd.class, str);
    }

    public static EnumC9112Fyd[] values() {
        return (EnumC9112Fyd[]) A01.clone();
    }

    public EnumC9112Fyd(String str, int i) {
    }
}
