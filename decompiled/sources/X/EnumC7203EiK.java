package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EiK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC7203EiK {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC7203EiK[] A01;
    public static final EnumC7203EiK A02;
    public static final EnumC7203EiK A03;
    public static final EnumC7203EiK A04;

    static {
        EnumC7203EiK enumC7203EiK = new EnumC7203EiK("LOW", 0);
        A03 = enumC7203EiK;
        EnumC7203EiK enumC7203EiK2 = new EnumC7203EiK("MEDIUM", 1);
        A04 = enumC7203EiK2;
        EnumC7203EiK enumC7203EiK3 = new EnumC7203EiK("HIGH", 2);
        A02 = enumC7203EiK3;
        EnumC7203EiK[] enumC7203EiKArr = {enumC7203EiK, enumC7203EiK2, enumC7203EiK3};
        A01 = enumC7203EiKArr;
        A00 = C3cG.A0w(enumC7203EiKArr);
    }

    public static EnumC7203EiK valueOf(String str) {
        return (EnumC7203EiK) Enum.valueOf(EnumC7203EiK.class, str);
    }

    public static EnumC7203EiK[] values() {
        return (EnumC7203EiK[]) A01.clone();
    }

    public EnumC7203EiK(String str, int i) {
    }
}
