package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Doe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC5743Doe {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC5743Doe[] A01;
    public static final EnumC5743Doe A02;
    public static final EnumC5743Doe A03;
    public static final EnumC5743Doe A04;
    public static final EnumC5743Doe A05;
    public static final EnumC5743Doe A06;

    static {
        EnumC5743Doe enumC5743Doe = new EnumC5743Doe("JUMP_BY_SEEKING_GENERAL_TARGET_BUFFER", 0);
        A05 = enumC5743Doe;
        EnumC5743Doe enumC5743Doe2 = new EnumC5743Doe("JUMP_BY_TRIMMING_BY_BUFFER_METER", 1);
        A06 = enumC5743Doe2;
        EnumC5743Doe enumC5743Doe3 = new EnumC5743Doe("JUMP_BY_DISCONTINUITY_LOADING", 2);
        A03 = enumC5743Doe3;
        EnumC5743Doe enumC5743Doe4 = new EnumC5743Doe("JUMP_BY_PAUSE_LOADING", 3);
        A04 = enumC5743Doe4;
        EnumC5743Doe enumC5743Doe5 = new EnumC5743Doe("INITIAL_BUFFER_TRIM", 4);
        A02 = enumC5743Doe5;
        EnumC5743Doe[] enumC5743DoeArr = {enumC5743Doe, enumC5743Doe2, enumC5743Doe3, enumC5743Doe4, enumC5743Doe5};
        A01 = enumC5743DoeArr;
        A00 = C3cG.A0w(enumC5743DoeArr);
    }

    public static EnumC5743Doe valueOf(String str) {
        return (EnumC5743Doe) Enum.valueOf(EnumC5743Doe.class, str);
    }

    public static EnumC5743Doe[] values() {
        return (EnumC5743Doe[]) A01.clone();
    }

    public EnumC5743Doe(String str, int i) {
    }
}
