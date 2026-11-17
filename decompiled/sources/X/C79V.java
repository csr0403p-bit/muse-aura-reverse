package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.79V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C79V {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C79V[] A01;
    public static final C79V A02;
    public static final C79V A03;

    static {
        C79V c79v = new C79V("APP_SET", 0);
        C79V c79v2 = new C79V("FBPERMISSION", 1);
        C79V c79v3 = new C79V("SAME_APP", 2);
        C79V c79v4 = new C79V("SAME_KEY", 3);
        C79V c79v5 = new C79V("PUBLIC", 4);
        A03 = c79v5;
        C79V c79v6 = new C79V("ALL_FAMILY", 5);
        A02 = c79v6;
        C79V[] c79vArr = {c79v, c79v2, c79v3, c79v4, c79v5, c79v6};
        A01 = c79vArr;
        A00 = C3cG.A0w(c79vArr);
    }

    public static C79V valueOf(String str) {
        return (C79V) Enum.valueOf(C79V.class, str);
    }

    public static C79V[] values() {
        return (C79V[]) A01.clone();
    }

    public C79V(String str, int i) {
    }
}
