package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0aK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0aK {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C0aK[] A01;

    static {
        C0aK[] c0aKArr = {new C0aK("Default", 0), new C0aK("FX_IG_TO_WA_CROSSPOSTING_CROSSPOST_ACTION", 1), new C0aK("IG4A_SWITCHER_LOGGING", 2)};
        A01 = c0aKArr;
        A00 = new F3w(c0aKArr);
    }

    public static C0aK valueOf(String str) {
        return (C0aK) Enum.valueOf(C0aK.class, str);
    }

    public static C0aK[] values() {
        return (C0aK[]) A01.clone();
    }

    public C0aK(String str, int i) {
    }
}
