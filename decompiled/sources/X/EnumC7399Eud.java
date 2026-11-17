package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eud, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC7399Eud implements InterfaceC7540F0s {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC7399Eud[] A01;
    public static final EnumC7399Eud A02;

    static {
        EnumC7399Eud enumC7399Eud = new EnumC7399Eud("DEFAULT", 0);
        A02 = enumC7399Eud;
        EnumC7399Eud[] enumC7399EudArr = {enumC7399Eud, new EnumC7399Eud("FALLBACK_DISABLED", 1), new EnumC7399Eud("MAIN_THREAD", 2), new EnumC7399Eud("DISK_CACHE_TIMEOUT", 3), new EnumC7399Eud("VARIATION", 4)};
        A01 = enumC7399EudArr;
        A00 = C3cG.A0w(enumC7399EudArr);
    }

    public static EnumC7399Eud valueOf(String str) {
        return (EnumC7399Eud) Enum.valueOf(EnumC7399Eud.class, str);
    }

    public static EnumC7399Eud[] values() {
        return (EnumC7399Eud[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return FGI.A0M("SmartFetchStrategy: ", name());
    }

    public EnumC7399Eud(String str, int i) {
    }
}
