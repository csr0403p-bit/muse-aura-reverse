package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Dof, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC5744Dof {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC5744Dof[] A01;
    public static final EnumC5744Dof A02;
    public static final EnumC5744Dof A03;
    public static final EnumC5744Dof A04;
    public static final EnumC5744Dof A05;

    static {
        EnumC5744Dof enumC5744Dof = new EnumC5744Dof("UNDEFINED", 0);
        A05 = enumC5744Dof;
        EnumC5744Dof enumC5744Dof2 = new EnumC5744Dof("ULTRA_LOW_LATENCY", 1);
        A04 = enumC5744Dof2;
        EnumC5744Dof enumC5744Dof3 = new EnumC5744Dof("LOW_LATENCY", 2);
        A02 = enumC5744Dof3;
        EnumC5744Dof enumC5744Dof4 = new EnumC5744Dof("LOW_LATENCY_HUDDLE", 3);
        EnumC5744Dof enumC5744Dof5 = new EnumC5744Dof("REGULAR_LATENCY", 4);
        A03 = enumC5744Dof5;
        EnumC5744Dof[] enumC5744DofArr = {enumC5744Dof, enumC5744Dof2, enumC5744Dof3, enumC5744Dof4, enumC5744Dof5};
        A01 = enumC5744DofArr;
        A00 = C3cG.A0w(enumC5744DofArr);
    }

    public static EnumC5744Dof valueOf(String str) {
        return (EnumC5744Dof) Enum.valueOf(EnumC5744Dof.class, str);
    }

    public static EnumC5744Dof[] values() {
        return (EnumC5744Dof[]) A01.clone();
    }

    public EnumC5744Dof(String str, int i) {
    }
}
