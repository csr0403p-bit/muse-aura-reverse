package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FyI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC9091FyI {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC9091FyI[] A01;
    public static final EnumC9091FyI A02;
    public static final EnumC9091FyI A03;

    static {
        C9125Fyq c9125Fyq = new C9125Fyq();
        A03 = c9125Fyq;
        C9118Fyj c9118Fyj = new C9118Fyj();
        A02 = c9118Fyj;
        EnumC9091FyI[] enumC9091FyIArr = {c9125Fyq, c9118Fyj};
        A01 = enumC9091FyIArr;
        A00 = C3cG.A0w(enumC9091FyIArr);
    }

    public static EnumC9091FyI valueOf(String str) {
        return (EnumC9091FyI) Enum.valueOf(EnumC9091FyI.class, str);
    }

    public static EnumC9091FyI[] values() {
        return (EnumC9091FyI[]) A01.clone();
    }

    public final double A00() {
        return this instanceof C9125Fyq ? ((C9125Fyq) this).wattsPerUnit : ((C9118Fyj) this).wattsPerUnit;
    }

    public EnumC9091FyI(String str, int i) {
    }
}
