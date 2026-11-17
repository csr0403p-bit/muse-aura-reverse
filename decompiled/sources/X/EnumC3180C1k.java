package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C1k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC3180C1k {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC3180C1k[] A01;
    public static final EnumC3180C1k A02;
    public final String postfix;

    static {
        EnumC3180C1k enumC3180C1k = new EnumC3180C1k("MAIN", 0, "");
        A02 = enumC3180C1k;
        EnumC3180C1k[] enumC3180C1kArr = {enumC3180C1k, new EnumC3180C1k("X86", 1, ".config.x86"), new EnumC3180C1k("X86_64", 2, ".config.x86_64"), new EnumC3180C1k("ARMV7", 3, ".config.armeabi_v7a"), new EnumC3180C1k("ARM64", 4, ".config.arm64_v8a")};
        A01 = enumC3180C1kArr;
        A00 = C3cG.A0w(enumC3180C1kArr);
    }

    public static EnumC3180C1k valueOf(String str) {
        return (EnumC3180C1k) Enum.valueOf(EnumC3180C1k.class, str);
    }

    public static EnumC3180C1k[] values() {
        return (EnumC3180C1k[]) A01.clone();
    }

    public EnumC3180C1k(String str, int i, String str2) {
        this.postfix = str2;
    }

    public static final EnumC3180C1k A00(String str) {
        for (EnumC3180C1k enumC3180C1k : values()) {
            if (!C7384Etj.areEqual(enumC3180C1k.postfix, A02.postfix)) {
                String str2 = enumC3180C1k.postfix;
                C7384Etj.A0Y(str2, 1);
                if (str.endsWith(str2)) {
                    return enumC3180C1k;
                }
            }
        }
        return A02;
    }
}
