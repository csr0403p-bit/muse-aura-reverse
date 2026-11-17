package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.FMh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC7951FMh {
    public static final EnumC7951FMh[] A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ EnumC7951FMh[] A02;
    public static final EnumC7951FMh A03;
    public static final EnumC7951FMh A04;
    public static final EnumC7951FMh A05;
    public static final EnumC7951FMh A06;
    public final String value;

    static {
        EnumC7951FMh enumC7951FMh = new EnumC7951FMh("STATIC", 0, "static");
        A06 = enumC7951FMh;
        EnumC7951FMh enumC7951FMh2 = new EnumC7951FMh("ANIMATED", 1, "animated");
        A03 = enumC7951FMh2;
        EnumC7951FMh enumC7951FMh3 = new EnumC7951FMh("ANIMATED_WHILE_LOADING", 2, "animated_while_loading");
        A04 = enumC7951FMh3;
        EnumC7951FMh enumC7951FMh4 = new EnumC7951FMh("ANIMATED_WHILE_LOADED", 3, "animated_while_loaded");
        EnumC7951FMh enumC7951FMh5 = new EnumC7951FMh("DISABLED", 4, "disabled");
        A05 = enumC7951FMh5;
        EnumC7951FMh[] enumC7951FMhArr = {enumC7951FMh, enumC7951FMh2, enumC7951FMh3, enumC7951FMh4, enumC7951FMh5};
        A02 = enumC7951FMhArr;
        F3w f3wA0w = C3cG.A0w(enumC7951FMhArr);
        A01 = f3wA0w;
        A00 = (EnumC7951FMh[]) f3wA0w.toArray(new EnumC7951FMh[0]);
    }

    public static EnumC7951FMh valueOf(String str) {
        return (EnumC7951FMh) Enum.valueOf(EnumC7951FMh.class, str);
    }

    public static EnumC7951FMh[] values() {
        return (EnumC7951FMh[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }

    public EnumC7951FMh(String str, int i, String str2) {
        this.value = str2;
    }
}
