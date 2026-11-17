package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ai0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1374Ai0 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC1374Ai0[] A01;
    public static final EnumC1374Ai0 A02;
    public static final EnumC1374Ai0 A03;
    public static final EnumC1374Ai0 A04;
    public static final EnumC1374Ai0 A05;
    public static final EnumC1374Ai0 A06;
    public static final EnumC1374Ai0 A07;
    public static final EnumC1374Ai0 A08;

    static {
        EnumC1374Ai0 enumC1374Ai0 = new EnumC1374Ai0("Invalid", 0);
        A06 = enumC1374Ai0;
        EnumC1374Ai0 enumC1374Ai02 = new EnumC1374Ai0("Cancelled", 1);
        A04 = enumC1374Ai02;
        EnumC1374Ai0 enumC1374Ai03 = new EnumC1374Ai0("InitialPending", 2);
        A05 = enumC1374Ai03;
        EnumC1374Ai0 enumC1374Ai04 = new EnumC1374Ai0("RecomposePending", 3);
        A07 = enumC1374Ai04;
        EnumC1374Ai0 enumC1374Ai05 = new EnumC1374Ai0("Recomposing", 4);
        A08 = enumC1374Ai05;
        EnumC1374Ai0 enumC1374Ai06 = new EnumC1374Ai0("ApplyPending", 5);
        A03 = enumC1374Ai06;
        EnumC1374Ai0 enumC1374Ai07 = new EnumC1374Ai0("Applied", 6);
        A02 = enumC1374Ai07;
        EnumC1374Ai0[] enumC1374Ai0Arr = {enumC1374Ai0, enumC1374Ai02, enumC1374Ai03, enumC1374Ai04, enumC1374Ai05, enumC1374Ai06, enumC1374Ai07};
        A01 = enumC1374Ai0Arr;
        A00 = C3cG.A0w(enumC1374Ai0Arr);
    }

    public static EnumC1374Ai0 valueOf(String str) {
        return (EnumC1374Ai0) Enum.valueOf(EnumC1374Ai0.class, str);
    }

    public static EnumC1374Ai0[] values() {
        return (EnumC1374Ai0[]) A01.clone();
    }

    public EnumC1374Ai0(String str, int i) {
    }
}
