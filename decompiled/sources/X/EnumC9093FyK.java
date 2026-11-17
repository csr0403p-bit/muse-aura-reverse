package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FyK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC9093FyK {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC9093FyK[] A01;
    public static final EnumC9093FyK A02;

    static {
        C9122Fyn c9122Fyn = new C9122Fyn();
        A02 = c9122Fyn;
        EnumC9093FyK[] enumC9093FyKArr = {c9122Fyn, new C9121Fym()};
        A01 = enumC9093FyKArr;
        A00 = C3cG.A0w(enumC9093FyKArr);
    }

    public static EnumC9093FyK valueOf(String str) {
        return (EnumC9093FyK) Enum.valueOf(EnumC9093FyK.class, str);
    }

    public static EnumC9093FyK[] values() {
        return (EnumC9093FyK[]) A01.clone();
    }

    public final double A00() {
        return this instanceof C9122Fyn ? ((C9122Fyn) this).millimolesPerLiterPerUnit : ((C9121Fym) this).millimolesPerLiterPerUnit;
    }

    public EnumC9093FyK(String str, int i) {
    }
}
