package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sh, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9sh {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C9sh[] A01;
    public static final C9sh A02;
    public static final C9sh A03;
    public static final C9sh A04;
    public static final C9sh A05;
    public final char begin;
    public final char end;

    static {
        C9sh c9sh = new C9sh("OBJ", '{', '}', 0);
        A04 = c9sh;
        C9sh c9sh2 = new C9sh("LIST", '[', ']', 1);
        A02 = c9sh2;
        C9sh c9sh3 = new C9sh("MAP", '{', '}', 2);
        A03 = c9sh3;
        C9sh c9sh4 = new C9sh("POLY_OBJ", '[', ']', 3);
        A05 = c9sh4;
        C9sh[] c9shArr = {c9sh, c9sh2, c9sh3, c9sh4};
        A01 = c9shArr;
        A00 = C3cG.A0w(c9shArr);
    }

    public static C9sh valueOf(String str) {
        return (C9sh) Enum.valueOf(C9sh.class, str);
    }

    public static C9sh[] values() {
        return (C9sh[]) A01.clone();
    }

    public C9sh(String str, char c, char c2, int i) {
        this.begin = c;
        this.end = c2;
    }
}
