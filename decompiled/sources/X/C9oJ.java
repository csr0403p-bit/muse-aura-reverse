package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9oJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9oJ {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C9oJ[] A01;
    public final int code;

    static {
        C9oJ[] c9oJArr = {new C9oJ("FACEBOOK", 0, 0), new C9oJ("INSTAGRAM", 1, 1), new C9oJ("FBLITE", 2, 2), new C9oJ("IGLITE", 3, 3), new C9oJ("META_AI", 4, 4)};
        A01 = c9oJArr;
        A00 = C3cG.A0w(c9oJArr);
    }

    public static C9oJ valueOf(String str) {
        return (C9oJ) Enum.valueOf(C9oJ.class, str);
    }

    public static C9oJ[] values() {
        return (C9oJ[]) A01.clone();
    }

    public C9oJ(String str, int i, int i2) {
        this.code = i2;
    }
}
