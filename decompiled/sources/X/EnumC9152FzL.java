package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FzL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC9152FzL {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC9152FzL[] A01;
    public static final EnumC9152FzL A02;

    static {
        C9156FzP c9156FzP = new C9156FzP();
        A02 = c9156FzP;
        EnumC9152FzL[] enumC9152FzLArr = {c9156FzP, new C9155FzO(), new C9157FzQ(), new C9154FzN(), new C9153FzM()};
        A01 = enumC9152FzLArr;
        A00 = C3cG.A0w(enumC9152FzLArr);
    }

    public static EnumC9152FzL valueOf(String str) {
        return (EnumC9152FzL) Enum.valueOf(EnumC9152FzL.class, str);
    }

    public static EnumC9152FzL[] values() {
        return (EnumC9152FzL[]) A01.clone();
    }

    public final double A00() {
        return this instanceof C9157FzQ ? ((C9157FzQ) this).metersPerUnit : this instanceof C9156FzP ? ((C9156FzP) this).metersPerUnit : this instanceof C9155FzO ? ((C9155FzO) this).metersPerUnit : this instanceof C9154FzN ? ((C9154FzN) this).metersPerUnit : ((C9153FzM) this).metersPerUnit;
    }

    public EnumC9152FzL(String str, int i) {
    }
}
