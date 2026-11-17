package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.F1g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC7544F1g {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC7544F1g[] A01;
    public static final EnumC7544F1g A02;

    static {
        EnumC7544F1g enumC7544F1g = new EnumC7544F1g("WARMUP_ISSUED", 0);
        EnumC7544F1g enumC7544F1g2 = new EnumC7544F1g("WARMUP_STARTED", 1);
        EnumC7544F1g enumC7544F1g3 = new EnumC7544F1g("WARMUP_COMPLETED", 2);
        A02 = enumC7544F1g3;
        EnumC7544F1g[] enumC7544F1gArr = {enumC7544F1g, enumC7544F1g2, enumC7544F1g3, new EnumC7544F1g("WARMUP_SWITCHED", 3), new EnumC7544F1g("PREFETCH_ISSUED", 4), new EnumC7544F1g("PREFETCH_STARTED", 5), new EnumC7544F1g("PREFETCH_COMPLETED", 6)};
        A01 = enumC7544F1gArr;
        A00 = C3cG.A0w(enumC7544F1gArr);
    }

    public static EnumC7544F1g valueOf(String str) {
        return (EnumC7544F1g) Enum.valueOf(EnumC7544F1g.class, str);
    }

    public static EnumC7544F1g[] values() {
        return (EnumC7544F1g[]) A01.clone();
    }

    public EnumC7544F1g(String str, int i) {
    }
}
