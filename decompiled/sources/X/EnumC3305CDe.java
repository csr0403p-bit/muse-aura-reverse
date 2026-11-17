package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.CDe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3305CDe {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC3305CDe[] A01;
    public static final EnumC3305CDe A02;
    public static final EnumC3305CDe A03;
    public static final EnumC3305CDe A04;
    public static final EnumC3305CDe A05;
    public static final EnumC3305CDe A06;
    public static final EnumC3305CDe A07;
    public static final EnumC3305CDe A08;

    static {
        EnumC3305CDe enumC3305CDe = new EnumC3305CDe("FOREGROUND", 0);
        A03 = enumC3305CDe;
        EnumC3305CDe enumC3305CDe2 = new EnumC3305CDe("PREFETCH", 1);
        A06 = enumC3305CDe2;
        EnumC3305CDe enumC3305CDe3 = new EnumC3305CDe("LOAD_ONLY", 2);
        A04 = enumC3305CDe3;
        EnumC3305CDe enumC3305CDe4 = new EnumC3305CDe("SYSTEM_PREFETCH", 3);
        A07 = enumC3305CDe4;
        EnumC3305CDe enumC3305CDe5 = new EnumC3305CDe("FALLBACK_DOWNLOAD", 4);
        A02 = enumC3305CDe5;
        EnumC3305CDe enumC3305CDe6 = new EnumC3305CDe("MERGED", 5);
        EnumC3305CDe enumC3305CDe7 = new EnumC3305CDe("BACKGROUND", 6);
        EnumC3305CDe enumC3305CDe8 = new EnumC3305CDe("OPTIMISTIC_LOAD", 7);
        A05 = enumC3305CDe8;
        EnumC3305CDe enumC3305CDe9 = new EnumC3305CDe("UNINSTALL", 8);
        A08 = enumC3305CDe9;
        EnumC3305CDe[] enumC3305CDeArr = {enumC3305CDe, enumC3305CDe2, enumC3305CDe3, enumC3305CDe4, enumC3305CDe5, enumC3305CDe6, enumC3305CDe7, enumC3305CDe8, enumC3305CDe9};
        A01 = enumC3305CDeArr;
        A00 = C3cG.A0w(enumC3305CDeArr);
    }

    public static EnumC3305CDe valueOf(String str) {
        return (EnumC3305CDe) Enum.valueOf(EnumC3305CDe.class, str);
    }

    public static EnumC3305CDe[] values() {
        return (EnumC3305CDe[]) A01.clone();
    }

    public EnumC3305CDe(String str, int i) {
    }
}
