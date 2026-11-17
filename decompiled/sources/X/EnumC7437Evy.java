package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Evy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC7437Evy {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC7437Evy[] A01;
    public static final EnumC7437Evy A02;
    public static final EnumC7437Evy A03;

    static {
        EnumC7437Evy enumC7437Evy = new EnumC7437Evy("APPLICATION", 0);
        A02 = enumC7437Evy;
        EnumC7437Evy enumC7437Evy2 = new EnumC7437Evy("USER", 1);
        A03 = enumC7437Evy2;
        EnumC7437Evy[] enumC7437EvyArr = {enumC7437Evy, enumC7437Evy2};
        A01 = enumC7437EvyArr;
        A00 = C3cG.A0w(enumC7437EvyArr);
    }

    public static EnumC7437Evy valueOf(String str) {
        return (EnumC7437Evy) Enum.valueOf(EnumC7437Evy.class, str);
    }

    public static EnumC7437Evy[] values() {
        return (EnumC7437Evy[]) A01.clone();
    }

    public EnumC7437Evy(String str, int i) {
    }
}
