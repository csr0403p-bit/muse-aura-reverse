package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.ElD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class EnumC7335ElD {
    public static final /* synthetic */ EnumC7335ElD[] A00;
    public static final EnumC7335ElD A01;
    public static final EnumC7335ElD A02;

    static {
        EnumC7335ElD enumC7335ElD = new EnumC7335ElD() { // from class: X.ElF
        };
        A01 = enumC7335ElD;
        C7336ElE c7336ElE = new C7336ElE();
        A02 = c7336ElE;
        A00 = new EnumC7335ElD[]{enumC7335ElD, c7336ElE};
    }

    public static EnumC7335ElD valueOf(String name) {
        return (EnumC7335ElD) Enum.valueOf(EnumC7335ElD.class, name);
    }

    public static EnumC7335ElD[] values() {
        return (EnumC7335ElD[]) A00.clone();
    }

    public final boolean A00() {
        Boolean bool;
        boolean z = this instanceof C7336ElE;
        boolean z2 = C7338ElG.A00.get();
        if (!z) {
            return !AnonymousClass002.A1L(z2 ? 1 : 0);
        }
        if (!z2) {
            return true;
        }
        try {
            bool = (Boolean) BV5.A0d("isBoringSslFIPSBuild", Class.forName("org.conscrypt.Conscrypt"));
        } catch (Exception unused) {
            C7338ElG.A01.info("Conscrypt is not available or does not support checking for FIPS build.");
            bool = false;
        }
        return bool.booleanValue();
    }

    public EnumC7335ElD(String $enum$name, int $enum$ordinal) {
    }
}
