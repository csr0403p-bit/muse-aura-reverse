package X;

import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Bxl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3085Bxl {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ EnumC3085Bxl[] $VALUES;
    public static final EnumC3085Bxl ON_ANY;
    public static final EnumC3085Bxl ON_CREATE;
    public static final EnumC3085Bxl ON_DESTROY;
    public static final EnumC3085Bxl ON_PAUSE;
    public static final EnumC3085Bxl ON_RESUME;
    public static final EnumC3085Bxl ON_START;
    public static final EnumC3085Bxl ON_STOP;

    public static final EnumC3085Bxl A00(EnumC10573Huf enumC10573Huf) {
        C7384Etj.A0Y(enumC10573Huf, 0);
        int iOrdinal = enumC10573Huf.ordinal();
        if (iOrdinal == 2) {
            return ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return ON_PAUSE;
    }

    static {
        EnumC3085Bxl enumC3085Bxl = new EnumC3085Bxl("ON_CREATE", 0);
        ON_CREATE = enumC3085Bxl;
        EnumC3085Bxl enumC3085Bxl2 = new EnumC3085Bxl("ON_START", 1);
        ON_START = enumC3085Bxl2;
        EnumC3085Bxl enumC3085Bxl3 = new EnumC3085Bxl("ON_RESUME", 2);
        ON_RESUME = enumC3085Bxl3;
        EnumC3085Bxl enumC3085Bxl4 = new EnumC3085Bxl("ON_PAUSE", 3);
        ON_PAUSE = enumC3085Bxl4;
        EnumC3085Bxl enumC3085Bxl5 = new EnumC3085Bxl("ON_STOP", 4);
        ON_STOP = enumC3085Bxl5;
        EnumC3085Bxl enumC3085Bxl6 = new EnumC3085Bxl("ON_DESTROY", 5);
        ON_DESTROY = enumC3085Bxl6;
        EnumC3085Bxl enumC3085Bxl7 = new EnumC3085Bxl("ON_ANY", 6);
        ON_ANY = enumC3085Bxl7;
        EnumC3085Bxl[] enumC3085BxlArr = {enumC3085Bxl, enumC3085Bxl2, enumC3085Bxl3, enumC3085Bxl4, enumC3085Bxl5, enumC3085Bxl6, enumC3085Bxl7};
        $VALUES = enumC3085BxlArr;
        $ENTRIES = C3cG.A0w(enumC3085BxlArr);
    }

    public static EnumC3085Bxl valueOf(String str) {
        return (EnumC3085Bxl) Enum.valueOf(EnumC3085Bxl.class, str);
    }

    public static EnumC3085Bxl[] values() {
        return (EnumC3085Bxl[]) $VALUES.clone();
    }

    public final EnumC10573Huf A01() {
        switch (ordinal()) {
            case 0:
            case 4:
                return EnumC10573Huf.A02;
            case 1:
            case 3:
                return EnumC10573Huf.A06;
            case 2:
                return EnumC10573Huf.A05;
            case 5:
                return EnumC10573Huf.A03;
            case 6:
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append(" has no target state");
                throw new IllegalArgumentException(sb.toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public EnumC3085Bxl(String str, int i) {
    }
}
