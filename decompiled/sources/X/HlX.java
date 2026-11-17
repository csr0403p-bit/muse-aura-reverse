package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HlX {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HlX[] A01;
    public static final HlX A02;
    public static final HlX A03;
    public static final HlX A04;

    static {
        HlX hlX = new HlX("PARALLEL_FETCH", 0);
        A03 = hlX;
        HlX hlX2 = new HlX("PREFETCH", 1);
        A04 = hlX2;
        HlX hlX3 = new HlX("FETCH", 2);
        A02 = hlX3;
        HlX[] hlXArr = {hlX, hlX2, hlX3};
        A01 = hlXArr;
        A00 = C3cG.A0w(hlXArr);
    }

    public static HlX valueOf(String str) {
        return (HlX) Enum.valueOf(HlX.class, str);
    }

    public static HlX[] values() {
        return (HlX[]) A01.clone();
    }

    public HlX(String str, int i) {
    }
}
