package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9WR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WR {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C9WR[] A01;
    public static final C9WR A02;
    public static final C9WR A03;
    public static final C9WR A04;
    public static final C9WR A05;
    public static final C9WR A06;
    public static final C9WR A07;
    public static final C9WR A08;
    public static final C9WR A09;

    static {
        C9WR c9wr = new C9WR("NOT_A_DAY_OF_WEEK", 0);
        A04 = c9wr;
        C9WR c9wr2 = new C9WR("SUNDAY", 1);
        A06 = c9wr2;
        C9WR c9wr3 = new C9WR("MONDAY", 2);
        A03 = c9wr3;
        C9WR c9wr4 = new C9WR("TUESDAY", 3);
        A08 = c9wr4;
        C9WR c9wr5 = new C9WR("WEDNESDAY", 4);
        A09 = c9wr5;
        C9WR c9wr6 = new C9WR("THURSDAY", 5);
        A07 = c9wr6;
        C9WR c9wr7 = new C9WR("FRIDAY", 6);
        A02 = c9wr7;
        C9WR c9wr8 = new C9WR("SATURDAY", 7);
        A05 = c9wr8;
        C9WR[] c9wrArr = {c9wr, c9wr2, c9wr3, c9wr4, c9wr5, c9wr6, c9wr7, c9wr8};
        A01 = c9wrArr;
        A00 = C3cG.A0w(c9wrArr);
    }

    public static C9WR valueOf(String str) {
        return (C9WR) Enum.valueOf(C9WR.class, str);
    }

    public static C9WR[] values() {
        return (C9WR[]) A01.clone();
    }

    public C9WR(String str, int i) {
    }
}
