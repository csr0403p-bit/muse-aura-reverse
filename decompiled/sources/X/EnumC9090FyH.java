package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FyH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC9090FyH {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC9090FyH[] A01;
    public static final EnumC9090FyH A02;
    public static final EnumC9090FyH A03;

    static {
        C9123Fyo c9123Fyo = new C9123Fyo();
        A02 = c9123Fyo;
        C9117Fyi c9117Fyi = new C9117Fyi();
        A03 = c9117Fyi;
        EnumC9090FyH[] enumC9090FyHArr = {c9123Fyo, c9117Fyi, new C9116Fyh(), new C9124Fyp()};
        A01 = enumC9090FyHArr;
        A00 = C3cG.A0w(enumC9090FyHArr);
    }

    public static EnumC9090FyH valueOf(String str) {
        return (EnumC9090FyH) Enum.valueOf(EnumC9090FyH.class, str);
    }

    public static EnumC9090FyH[] values() {
        return (EnumC9090FyH[]) A01.clone();
    }

    public final double A00() {
        return this instanceof C9124Fyp ? ((C9124Fyp) this).caloriesPerUnit : this instanceof C9117Fyi ? ((C9117Fyi) this).caloriesPerUnit : this instanceof C9116Fyh ? ((C9116Fyh) this).caloriesPerUnit : ((C9123Fyo) this).caloriesPerUnit;
    }

    public EnumC9090FyH(String str, int i) {
    }
}
