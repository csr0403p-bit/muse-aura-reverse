package X;

import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.AjC, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1443AjC implements C2Um {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC1443AjC[] A01;
    public static final EnumC1443AjC A02;
    public static final EnumC1443AjC A03;
    public static final EnumC1443AjC A04;

    static {
        EnumC1443AjC enumC1443AjC = new EnumC1443AjC("Active", 0);
        A02 = enumC1443AjC;
        EnumC1443AjC enumC1443AjC2 = new EnumC1443AjC("ActiveParent", 1);
        A03 = enumC1443AjC2;
        EnumC1443AjC enumC1443AjC3 = new EnumC1443AjC("Captured", 2);
        EnumC1443AjC enumC1443AjC4 = new EnumC1443AjC("Inactive", 3);
        A04 = enumC1443AjC4;
        EnumC1443AjC[] enumC1443AjCArr = {enumC1443AjC, enumC1443AjC2, enumC1443AjC3, enumC1443AjC4};
        A01 = enumC1443AjCArr;
        A00 = C3cG.A0w(enumC1443AjCArr);
    }

    public static EnumC1443AjC valueOf(String str) {
        return (EnumC1443AjC) Enum.valueOf(EnumC1443AjC.class, str);
    }

    public static EnumC1443AjC[] values() {
        return (EnumC1443AjC[]) A01.clone();
    }

    @Override // X.C2Um
    public final boolean AG5() {
        int iOrdinal = ordinal();
        if (iOrdinal == 2 || iOrdinal == 0 || iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw C3cG.A0q();
    }

    @Override // X.C2Um
    public final boolean AOS() {
        int iOrdinal = ordinal();
        if (iOrdinal == 2 || iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1 || iOrdinal == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public EnumC1443AjC(String str, int i) {
    }
}
