package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.AYu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1108AYu {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC1108AYu[] A01;
    public static final EnumC1108AYu A02;
    public static final EnumC1108AYu A03;

    static {
        EnumC1108AYu enumC1108AYu = new EnumC1108AYu("Vertical", 0);
        A03 = enumC1108AYu;
        EnumC1108AYu enumC1108AYu2 = new EnumC1108AYu("Horizontal", 1);
        A02 = enumC1108AYu2;
        EnumC1108AYu[] enumC1108AYuArr = {enumC1108AYu, enumC1108AYu2};
        A01 = enumC1108AYuArr;
        A00 = C3cG.A0w(enumC1108AYuArr);
    }

    public static EnumC1108AYu valueOf(String str) {
        return (EnumC1108AYu) Enum.valueOf(EnumC1108AYu.class, str);
    }

    public static EnumC1108AYu[] values() {
        return (EnumC1108AYu[]) A01.clone();
    }

    public EnumC1108AYu(String str, int i) {
    }
}
