package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FND {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ FND[] A01;
    public static final FND A02;
    public static final FND A03;

    static {
        FND fnd = new FND("Bloks", 0);
        A02 = fnd;
        FND fnd2 = new FND("Native", 1);
        A03 = fnd2;
        FND[] fndArr = {fnd, fnd2};
        A01 = fndArr;
        A00 = C3cG.A0w(fndArr);
    }

    public static FND valueOf(String str) {
        return (FND) Enum.valueOf(FND.class, str);
    }

    public static FND[] values() {
        return (FND[]) A01.clone();
    }

    public FND(String str, int i) {
    }
}
