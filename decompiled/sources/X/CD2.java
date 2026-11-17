package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CD2 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ CD2[] A01;
    public static final CD2 A02;
    public static final CD2 A03;
    public static final CD2 A04;
    public static final CD2 A05;
    public static final CD2 A06;

    static {
        CD2 cd2 = new CD2("UNKNOWN", 0);
        A06 = cd2;
        CD2 cd22 = new CD2("DISABLED", 1);
        A02 = cd22;
        CD2 cd23 = new CD2("LOCAL", 2);
        A04 = cd23;
        CD2 cd24 = new CD2("REMOTE", 3);
        A05 = cd24;
        CD2 cd25 = new CD2("DOWNLOADING", 4);
        A03 = cd25;
        CD2[] cd2Arr = {cd2, cd22, cd23, cd24, cd25};
        A01 = cd2Arr;
        A00 = C3cG.A0w(cd2Arr);
    }

    public static CD2 valueOf(String str) {
        return (CD2) Enum.valueOf(CD2.class, str);
    }

    public static CD2[] values() {
        return (CD2[]) A01.clone();
    }

    public CD2(String str, int i) {
    }
}
