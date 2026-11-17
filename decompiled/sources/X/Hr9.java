package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Hr9 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ Hr9[] A01;
    public static final Hr9 A02;
    public static final Hr9 A03;
    public static final Hr9 A04;
    public final String serverValue;

    static {
        Hr9 hr9 = new Hr9("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A04 = hr9;
        Hr9 hr92 = new Hr9("META_SET", 1, "META_SET");
        A02 = hr92;
        Hr9 hr93 = new Hr9("PRE_SET", 2, "PRE_SET");
        A03 = hr93;
        Hr9[] hr9Arr = {hr9, hr92, hr93};
        A01 = hr9Arr;
        A00 = C3cG.A0w(hr9Arr);
    }

    public static Hr9 valueOf(String str) {
        return (Hr9) Enum.valueOf(Hr9.class, str);
    }

    public static Hr9[] values() {
        return (Hr9[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverValue;
    }

    public Hr9(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
