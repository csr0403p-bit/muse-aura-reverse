package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FMb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC7946FMb {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC7946FMb[] A01;
    public static final EnumC7946FMb A02;
    public static final EnumC7946FMb A03;
    public static final EnumC7946FMb A04;
    public static final EnumC7946FMb A05;

    static {
        EnumC7946FMb enumC7946FMb = new EnumC7946FMb("AnimateResize", 0);
        A03 = enumC7946FMb;
        EnumC7946FMb enumC7946FMb2 = new EnumC7946FMb("ImmediateResize", 1);
        A04 = enumC7946FMb2;
        EnumC7946FMb enumC7946FMb3 = new EnumC7946FMb("AdjustPan", 2);
        A02 = enumC7946FMb3;
        EnumC7946FMb enumC7946FMb4 = new EnumC7946FMb("None", 3);
        A05 = enumC7946FMb4;
        EnumC7946FMb[] enumC7946FMbArr = {enumC7946FMb, enumC7946FMb2, enumC7946FMb3, enumC7946FMb4};
        A01 = enumC7946FMbArr;
        A00 = C3cG.A0w(enumC7946FMbArr);
    }

    public static EnumC7946FMb valueOf(String str) {
        return (EnumC7946FMb) Enum.valueOf(EnumC7946FMb.class, str);
    }

    public static EnumC7946FMb[] values() {
        return (EnumC7946FMb[]) A01.clone();
    }

    public EnumC7946FMb(String str, int i) {
    }
}
