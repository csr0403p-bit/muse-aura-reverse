package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AY3 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ AY3[] A01;
    public static final AY3 A02;
    public static final AY3 A03;

    static {
        AY3 ay3 = new AY3("On", 0);
        A03 = ay3;
        AY3 ay32 = new AY3("Off", 1);
        A02 = ay32;
        AY3[] ay3Arr = {ay3, ay32, new AY3("Indeterminate", 2)};
        A01 = ay3Arr;
        A00 = C3cG.A0w(ay3Arr);
    }

    public static AY3 valueOf(String str) {
        return (AY3) Enum.valueOf(AY3.class, str);
    }

    public static AY3[] values() {
        return (AY3[]) A01.clone();
    }

    public AY3(String str, int i) {
    }
}
