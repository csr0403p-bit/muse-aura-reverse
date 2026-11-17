package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6N {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C6N[] A01;
    public static final C6N A02;
    public static final C6N A03;
    public static final C6N A04;
    public static final C6N A05;
    public static final C6N A06;
    public static final C6N A07;
    public static final C6N A08;
    public static final C6N A09;
    public static final C6N A0A;
    public static final C6N A0B;

    static {
        C6N c6n = new C6N("NO_ANR_DETECTED", 0);
        A04 = c6n;
        C6N c6n2 = new C6N("DURING_ANR", 1);
        A03 = c6n2;
        C6N c6n3 = new C6N("ANR_RECOVERED", 2);
        A02 = c6n3;
        C6N c6n4 = new C6N("SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_BLOCKED", 3);
        A0A = c6n4;
        C6N c6n5 = new C6N("SIGQUIT_RECEIVED_AM_CONFIRMED_MT_BLOCKED", 4);
        A07 = c6n5;
        C6N c6n6 = new C6N("SIGQUIT_RECEIVED_AM_CONFIRMED_MT_UNBLOCKED", 5);
        A08 = c6n6;
        C6N c6n7 = new C6N("SIGQUIT_RECEIVED_AM_UNCONFIRMED_MT_UNBLOCKED", 6);
        A0B = c6n7;
        C6N c6n8 = new C6N("SIGQUIT_RECEIVED_AM_EXPIRED_MT_BLOCKED", 7);
        A09 = c6n8;
        C6N c6n9 = new C6N("NO_SIGQUIT_AM_CONFIRMED_MT_BLOCKED", 8);
        A05 = c6n9;
        C6N c6n10 = new C6N("NO_SIGQUIT_AM_CONFIRMED_MT_UNBLOCKED", 9);
        A06 = c6n10;
        C6N[] c6nArr = {c6n, c6n2, c6n3, c6n4, c6n5, c6n6, c6n7, c6n8, c6n9, c6n10};
        A01 = c6nArr;
        A00 = C3cG.A0w(c6nArr);
    }

    public static C6N valueOf(String str) {
        return (C6N) Enum.valueOf(C6N.class, str);
    }

    public static C6N[] values() {
        return (C6N[]) A01.clone();
    }

    public C6N(String str, int i) {
    }
}
