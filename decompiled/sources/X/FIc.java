package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FIc {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ FIc[] A01;
    public static final FIc A02;
    public static final FIc A03;
    public static final FIc A04;
    public static final FIc A05;
    public static final FIc A06;

    static {
        FIc fIc = new FIc("DONE", 0);
        A02 = fIc;
        FIc fIc2 = new FIc("GO", 1);
        A03 = fIc2;
        FIc fIc3 = new FIc("NEXT", 2);
        A04 = fIc3;
        FIc fIc4 = new FIc("SEARCH", 3);
        A05 = fIc4;
        FIc fIc5 = new FIc("SEND", 4);
        A06 = fIc5;
        FIc[] fIcArr = {fIc, fIc2, fIc3, fIc4, fIc5};
        A01 = fIcArr;
        A00 = C3cG.A0w(fIcArr);
    }

    public static FIc valueOf(String str) {
        return (FIc) Enum.valueOf(FIc.class, str);
    }

    public static FIc[] values() {
        return (FIc[]) A01.clone();
    }

    public FIc(String str, int i) {
    }
}
