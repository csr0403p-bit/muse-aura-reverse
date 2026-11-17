package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class GXX {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ GXX[] A01;
    public static final GXX A02;
    public static final GXX A03;
    public static final GXX A04;
    public static final GXX A05;

    static {
        GXX gxx = new GXX("EARPIECE", 0);
        A03 = gxx;
        GXX gxx2 = new GXX("SPEAKERPHONE", 1);
        A05 = gxx2;
        GXX gxx3 = new GXX("BLUETOOTH", 2);
        A02 = gxx3;
        GXX gxx4 = new GXX("HEADSET", 3);
        A04 = gxx4;
        GXX[] gxxArr = {gxx, gxx2, gxx3, gxx4};
        A01 = gxxArr;
        A00 = C3cG.A0w(gxxArr);
    }

    public static GXX valueOf(String str) {
        return (GXX) Enum.valueOf(GXX.class, str);
    }

    public static GXX[] values() {
        return (GXX[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 2) {
            return "bluetooth";
        }
        if (iOrdinal == 0) {
            return "earpiece";
        }
        if (iOrdinal == 3) {
            return "headset";
        }
        if (iOrdinal == 1) {
            return "speaker";
        }
        throw C3cG.A0q();
    }

    public GXX(String str, int i) {
    }
}
