package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3Eq, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3Eq {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C3Eq[] A01;
    public static final C3Eq A02;
    public static final C3Eq A03;
    public static final C3Eq A04;

    static {
        C3Eq c3Eq = new C3Eq("START", 0);
        A02 = c3Eq;
        C3Eq c3Eq2 = new C3Eq("STOP", 1);
        A03 = c3Eq2;
        C3Eq c3Eq3 = new C3Eq("STOP_AND_RESET_REPLAY_CACHE", 2);
        A04 = c3Eq3;
        C3Eq[] c3EqArr = {c3Eq, c3Eq2, c3Eq3};
        A01 = c3EqArr;
        A00 = new F3w(c3EqArr);
    }

    public static C3Eq valueOf(String str) {
        return (C3Eq) Enum.valueOf(C3Eq.class, str);
    }

    public static C3Eq[] values() {
        return (C3Eq[]) A01.clone();
    }

    public C3Eq(String str, int i) {
    }
}
