package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AvJ {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ AvJ[] A01;
    public static final AvJ A02;
    public static final AvJ A03;
    public static final AvJ A04;
    public static final AvJ A05;

    static {
        AvJ avJ = new AvJ("StartInput", 0);
        A04 = avJ;
        AvJ avJ2 = new AvJ("StopInput", 1);
        A05 = avJ2;
        AvJ avJ3 = new AvJ("ShowKeyboard", 2);
        A03 = avJ3;
        AvJ avJ4 = new AvJ("HideKeyboard", 3);
        A02 = avJ4;
        AvJ[] avJArr = {avJ, avJ2, avJ3, avJ4};
        A01 = avJArr;
        A00 = C3cG.A0w(avJArr);
    }

    public static AvJ valueOf(String str) {
        return (AvJ) Enum.valueOf(AvJ.class, str);
    }

    public static AvJ[] values() {
        return (AvJ[]) A01.clone();
    }

    public AvJ(String str, int i) {
    }
}
