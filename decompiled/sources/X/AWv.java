package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AWv {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ AWv[] A01;
    public static final AWv A02;
    public static final AWv A03;
    public static final AWv A04;

    static {
        AWv aWv = new AWv("Cursor", 0);
        A02 = aWv;
        AWv aWv2 = new AWv("SelectionStart", 1);
        A04 = aWv2;
        AWv aWv3 = new AWv("SelectionEnd", 2);
        A03 = aWv3;
        AWv[] aWvArr = {aWv, aWv2, aWv3};
        A01 = aWvArr;
        A00 = C3cG.A0w(aWvArr);
    }

    public static AWv valueOf(String str) {
        return (AWv) Enum.valueOf(AWv.class, str);
    }

    public static AWv[] values() {
        return (AWv[]) A01.clone();
    }

    public AWv(String str, int i) {
    }
}
