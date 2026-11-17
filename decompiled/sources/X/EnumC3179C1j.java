package X;

import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C1j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3179C1j {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC3179C1j[] A01;
    public static final EnumC3179C1j A02;
    public static final EnumC3179C1j A03;
    public static final EnumC3179C1j A04;
    public static final EnumC3179C1j A05;
    public final String abi;

    static {
        EnumC3179C1j enumC3179C1j = new EnumC3179C1j("X86", 0, "x86");
        A04 = enumC3179C1j;
        EnumC3179C1j enumC3179C1j2 = new EnumC3179C1j("ARMV7", 1, "armeabi-v7a");
        A03 = enumC3179C1j2;
        EnumC3179C1j enumC3179C1j3 = new EnumC3179C1j("X86_64", 2, "x86_64");
        A05 = enumC3179C1j3;
        EnumC3179C1j enumC3179C1j4 = new EnumC3179C1j("ARM64", 3, "arm64-v8a");
        A02 = enumC3179C1j4;
        EnumC3179C1j[] enumC3179C1jArr = {enumC3179C1j, enumC3179C1j2, enumC3179C1j3, enumC3179C1j4};
        A01 = enumC3179C1jArr;
        A00 = C3cG.A0w(enumC3179C1jArr);
    }

    public static final String A01() {
        String str;
        String[] strArr = Build.SUPPORTED_ABIS;
        C7384Etj.A0V(strArr);
        if (strArr.length == 0 || (str = strArr[0]) == null) {
            throw BV4.A0c("Could not obtain device cpu abi: null");
        }
        return str;
    }

    public static EnumC3179C1j valueOf(String str) {
        return (EnumC3179C1j) Enum.valueOf(EnumC3179C1j.class, str);
    }

    public static EnumC3179C1j[] values() {
        return (EnumC3179C1j[]) A01.clone();
    }

    public EnumC3179C1j(String str, int i, String str2) {
        this.abi = str2;
    }

    public static final EnumC3179C1j A00() {
        String strA01 = A01();
        for (EnumC3179C1j enumC3179C1j : values()) {
            if (C7384Etj.areEqual(enumC3179C1j.abi, strA01)) {
                return enumC3179C1j;
            }
        }
        throw BV4.A0c(FGI.A0V("Could not parse cpu abi: ", strA01, " for SDK Version: ", Build.VERSION.SDK_INT));
    }
}
