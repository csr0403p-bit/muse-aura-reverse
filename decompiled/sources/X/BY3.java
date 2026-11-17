package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BY3 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BY3[] A01;
    public static final BY3 A02;
    public static final BY3 A03;
    public static final BY3 A04;

    static {
        BY3 by3 = new BY3("UNDEFINED", 0);
        A04 = by3;
        BY3 by32 = new BY3("SEAMLESS", 1);
        BY3 by33 = new BY3("BUILT_IN", 2);
        A02 = by33;
        BY3 by34 = new BY3("DOWNLOADABLE", 3);
        A03 = by34;
        BY3[] by3Arr = {by3, by32, by33, by34, new BY3("BUILT_IN_AND_DOWNLOADABLE", 4)};
        A01 = by3Arr;
        A00 = C3cG.A0w(by3Arr);
    }

    public static BY3 valueOf(String str) {
        return (BY3) Enum.valueOf(BY3.class, str);
    }

    public static BY3[] values() {
        return (BY3[]) A01.clone();
    }

    public BY3(String str, int i) {
    }
}
