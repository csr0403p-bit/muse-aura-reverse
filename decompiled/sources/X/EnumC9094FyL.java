package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FyL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC9094FyL {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC9094FyL[] A01;
    public static final EnumC9094FyL A02;

    static {
        C9127Fys c9127Fys = new C9127Fys();
        A02 = c9127Fys;
        EnumC9094FyL[] enumC9094FyLArr = {c9127Fys, new C9126Fyr(), new C9128Fyt()};
        A01 = enumC9094FyLArr;
        A00 = C3cG.A0w(enumC9094FyLArr);
    }

    public static EnumC9094FyL valueOf(String str) {
        return (EnumC9094FyL) Enum.valueOf(EnumC9094FyL.class, str);
    }

    public static EnumC9094FyL[] values() {
        return (EnumC9094FyL[]) A01.clone();
    }

    public final double A00() {
        return this instanceof C9128Fyt ? ((C9128Fyt) this).metersPerSecondPerUnit : this instanceof C9127Fys ? ((C9127Fys) this).metersPerSecondPerUnit : ((C9126Fyr) this).metersPerSecondPerUnit;
    }

    public EnumC9094FyL(String str, int i) {
    }
}
