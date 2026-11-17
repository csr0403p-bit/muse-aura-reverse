package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9WZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WZ {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C9WZ[] A01;
    public static final C9WZ A02;
    public static final C9WZ A03;
    public static final C9WZ A04;
    public static final C9WZ A05;
    public static final C9WZ A06;
    public static final C9WZ A07;

    static {
        C9WZ c9wz = new C9WZ("HOURS", 0);
        A04 = c9wz;
        C9WZ c9wz2 = new C9WZ("ADDRESS", 1);
        A02 = c9wz2;
        C9WZ c9wz3 = new C9WZ("PHONE", 2);
        A06 = c9wz3;
        C9WZ c9wz4 = new C9WZ("WEBSITE", 3);
        A07 = c9wz4;
        C9WZ c9wz5 = new C9WZ("INSTAGRAM", 4);
        A05 = c9wz5;
        C9WZ c9wz6 = new C9WZ("FACEBOOK", 5);
        A03 = c9wz6;
        C9WZ[] c9wzArr = {c9wz, c9wz2, c9wz3, c9wz4, c9wz5, c9wz6};
        A01 = c9wzArr;
        A00 = C3cG.A0w(c9wzArr);
    }

    public static C9WZ valueOf(String str) {
        return (C9WZ) Enum.valueOf(C9WZ.class, str);
    }

    public static C9WZ[] values() {
        return (C9WZ[]) A01.clone();
    }

    public C9WZ(String str, int i) {
    }
}
