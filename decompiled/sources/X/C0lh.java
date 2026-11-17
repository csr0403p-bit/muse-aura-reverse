package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0lh, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0lh {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C0lh[] A01;
    public static final C0lh A02;
    public static final C0lh A03;

    static {
        C0lh c0lh = new C0lh("Min", 0);
        A03 = c0lh;
        C0lh c0lh2 = new C0lh("Max", 1);
        A02 = c0lh2;
        C0lh[] c0lhArr = {c0lh, c0lh2};
        A01 = c0lhArr;
        A00 = new F3w(c0lhArr);
    }

    public static C0lh valueOf(String str) {
        return (C0lh) Enum.valueOf(C0lh.class, str);
    }

    public static C0lh[] values() {
        return (C0lh[]) A01.clone();
    }

    public C0lh(String str, int i) {
    }
}
