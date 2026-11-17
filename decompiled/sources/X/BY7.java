package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BY7 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BY7[] A01;
    public static final BY7 A02;
    public static final BY7 A03;
    public static final BY7 A04;
    public static final BY7 A05;
    public static final BY7 A06;
    public static final BY7 A07;

    static {
        BY7 by7 = new BY7("CREATING", 0);
        A04 = by7;
        BY7 by72 = new BY7("CREATED", 1);
        A03 = by72;
        BY7 by73 = new BY7("ACQUIRED_FROM_POOL", 2);
        A02 = by73;
        BY7 by74 = new BY7("RETURNED_TO_POOL", 3);
        A07 = by74;
        BY7 by75 = new BY7("RELEASING", 4);
        A06 = by75;
        BY7 by76 = new BY7("RELEASED", 5);
        A05 = by76;
        BY7[] by7Arr = {by7, by72, by73, by74, by75, by76};
        A01 = by7Arr;
        A00 = C3cG.A0w(by7Arr);
    }

    public static BY7 valueOf(String str) {
        return (BY7) Enum.valueOf(BY7.class, str);
    }

    public static BY7[] values() {
        return (BY7[]) A01.clone();
    }

    public BY7(String str, int i) {
    }
}
