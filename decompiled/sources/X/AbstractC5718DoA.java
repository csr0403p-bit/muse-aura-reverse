package X;

/* renamed from: X.DoA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5718DoA {
    public static volatile boolean A00 = true;

    public static void A00(InterfaceC5860Dqu interfaceC5860Dqu, String str, Throwable th, Object... objArr) {
        BV6.A1J(FGI.A0L("playerId[", ((Dlw) interfaceC5860Dqu).A20, "]: ", str), "HeroService", th, objArr);
    }

    public static void A02(String str, Object... objArr) {
        if (A00) {
            AbstractC3426CMt.A03("HeroService", str, objArr);
        }
    }

    public static void A01(InterfaceC5860Dqu interfaceC5860Dqu, String str, Object... objArr) {
        A02("HeroService", interfaceC5860Dqu, str, objArr);
    }
}
