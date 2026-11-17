package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EuY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC7395EuY {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC7395EuY[] A01;
    public static final EnumC7395EuY A02;
    public static final EnumC7395EuY A03;

    static {
        EnumC7395EuY enumC7395EuY = new EnumC7395EuY("DEFAULT_KEY_FALLBACK", 0);
        A02 = enumC7395EuY;
        EnumC7395EuY enumC7395EuY2 = new EnumC7395EuY("RAW_PASSWORD_FALLBACK", 1);
        A03 = enumC7395EuY2;
        EnumC7395EuY[] enumC7395EuYArr = {enumC7395EuY, enumC7395EuY2};
        A01 = enumC7395EuYArr;
        A00 = C3cG.A0w(enumC7395EuYArr);
    }

    public static EnumC7395EuY valueOf(String str) {
        return (EnumC7395EuY) Enum.valueOf(EnumC7395EuY.class, str);
    }

    public static EnumC7395EuY[] values() {
        return (EnumC7395EuY[]) A01.clone();
    }

    public EnumC7395EuY(String str, int i) {
    }
}
