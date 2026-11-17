package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Hky {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ Hky[] A01;
    public static final Hky A02;
    public static final Hky A03;
    public final int value;

    static {
        Hky hky = new Hky("NOT_SET", 0, 0);
        Hky hky2 = new Hky("FORWARD", 1, 1);
        A03 = hky2;
        Hky hky3 = new Hky("BACK", 2, 2);
        A02 = hky3;
        Hky[] hkyArr = {hky, hky2, hky3};
        A01 = hkyArr;
        A00 = C3cG.A0w(hkyArr);
    }

    public static Hky valueOf(String str) {
        return (Hky) Enum.valueOf(Hky.class, str);
    }

    public static Hky[] values() {
        return (Hky[]) A01.clone();
    }

    public Hky(String str, int i, int i2) {
        this.value = i2;
    }
}
