package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Au8 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ Au8[] A01;
    public static final Au8 A02;
    public static final Au8 A03;
    public static final Au8 A04;

    static {
        Au8 au8 = new Au8("None", 0);
        A03 = au8;
        Au8 au82 = new Au8("Selection", 1);
        A04 = au82;
        Au8 au83 = new Au8("Cursor", 2);
        A02 = au83;
        Au8[] au8Arr = {au8, au82, au83};
        A01 = au8Arr;
        A00 = C3cG.A0w(au8Arr);
    }

    public static Au8 valueOf(String str) {
        return (Au8) Enum.valueOf(Au8.class, str);
    }

    public static Au8[] values() {
        return (Au8[]) A01.clone();
    }

    public Au8(String str, int i) {
    }
}
