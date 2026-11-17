package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FyJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC9092FyJ {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC9092FyJ[] A01;
    public static final EnumC9092FyJ A02;
    public static final EnumC9092FyJ A03;

    static {
        C9130Fyv c9130Fyv = new C9130Fyv();
        A02 = c9130Fyv;
        C9131Fyw c9131Fyw = new C9131Fyw();
        A03 = c9131Fyw;
        EnumC9092FyJ[] enumC9092FyJArr = {c9130Fyv, c9131Fyw, new C9129Fyu()};
        A01 = enumC9092FyJArr;
        A00 = C3cG.A0w(enumC9092FyJArr);
    }

    public static EnumC9092FyJ valueOf(String str) {
        return (EnumC9092FyJ) Enum.valueOf(EnumC9092FyJ.class, str);
    }

    public static EnumC9092FyJ[] values() {
        return (EnumC9092FyJ[]) A01.clone();
    }

    public final double A00() {
        return this instanceof C9131Fyw ? ((C9131Fyw) this).litersPerUnit : this instanceof C9130Fyv ? ((C9130Fyv) this).litersPerUnit : ((C9129Fyu) this).litersPerUnit;
    }

    public EnumC9092FyJ(String str, int i) {
    }
}
