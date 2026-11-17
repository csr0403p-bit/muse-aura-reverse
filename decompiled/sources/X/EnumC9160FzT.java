package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FzT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC9160FzT {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC9160FzT[] A01;
    public static final EnumC9160FzT A02;
    public static final EnumC9160FzT A03;

    static {
        C9161FzU c9161FzU = new C9161FzU();
        A02 = c9161FzU;
        C9162FzV c9162FzV = new C9162FzV();
        A03 = c9162FzV;
        EnumC9160FzT[] enumC9160FzTArr = {c9161FzU, c9162FzV, new C9164FzX(), new C9163FzW(), new C9165FzY(), new C9166FzZ()};
        A01 = enumC9160FzTArr;
        A00 = C3cG.A0w(enumC9160FzTArr);
    }

    public static EnumC9160FzT valueOf(String str) {
        return (EnumC9160FzT) Enum.valueOf(EnumC9160FzT.class, str);
    }

    public static EnumC9160FzT[] values() {
        return (EnumC9160FzT[]) A01.clone();
    }

    public final double A00() {
        return this instanceof C9166FzZ ? ((C9166FzZ) this).gramsPerUnit : this instanceof C9165FzY ? ((C9165FzY) this).gramsPerUnit : this instanceof C9164FzX ? ((C9164FzX) this).gramsPerUnit : this instanceof C9163FzW ? ((C9163FzW) this).gramsPerUnit : this instanceof C9162FzV ? ((C9162FzV) this).gramsPerUnit : ((C9161FzU) this).gramsPerUnit;
    }

    public EnumC9160FzT(String str, int i) {
    }
}
