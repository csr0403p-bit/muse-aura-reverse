package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1YJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YJ {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C1YJ[] A01;
    public static final C1YJ A02;

    static {
        C1YJ c1yj = new C1YJ("WiFi", 0);
        A02 = c1yj;
        C1YJ[] c1yjArr = {c1yj, new C1YJ("Cell", 1)};
        A01 = c1yjArr;
        A00 = new F3w(c1yjArr);
    }

    public static C1YJ valueOf(String str) {
        return (C1YJ) Enum.valueOf(C1YJ.class, str);
    }

    public static C1YJ[] values() {
        return (C1YJ[]) A01.clone();
    }

    public C1YJ(String str, int i) {
    }
}
