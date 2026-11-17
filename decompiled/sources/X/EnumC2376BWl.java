package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.BWl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC2376BWl {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC2376BWl[] A01;
    public static final EnumC2376BWl A02;
    public static final EnumC2376BWl A03;
    public static final EnumC2376BWl A04;

    static {
        EnumC2376BWl enumC2376BWl = new EnumC2376BWl("REPORT", 0);
        A04 = enumC2376BWl;
        EnumC2376BWl enumC2376BWl2 = new EnumC2376BWl("IGNORE", 1);
        A03 = enumC2376BWl2;
        EnumC2376BWl enumC2376BWl3 = new EnumC2376BWl("BUFFER", 2);
        A02 = enumC2376BWl3;
        EnumC2376BWl[] enumC2376BWlArr = {enumC2376BWl, enumC2376BWl2, enumC2376BWl3};
        A01 = enumC2376BWlArr;
        A00 = C3cG.A0w(enumC2376BWlArr);
    }

    public static EnumC2376BWl valueOf(String str) {
        return (EnumC2376BWl) Enum.valueOf(EnumC2376BWl.class, str);
    }

    public static EnumC2376BWl[] values() {
        return (EnumC2376BWl[]) A01.clone();
    }

    public EnumC2376BWl(String str, int i) {
    }
}
