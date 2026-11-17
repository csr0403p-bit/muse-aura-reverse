package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3uF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC05543uF {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC05543uF[] A01;

    static {
        EnumC05543uF[] enumC05543uFArr = {new EnumC05543uF("PIP", 0), new EnumC05543uF("RESET", 1), new EnumC05543uF("HIDE_FADE", 2), new EnumC05543uF("IDLE", 3)};
        A01 = enumC05543uFArr;
        A00 = C3cG.A0w(enumC05543uFArr);
    }

    public static EnumC05543uF valueOf(String str) {
        return (EnumC05543uF) Enum.valueOf(EnumC05543uF.class, str);
    }

    public static EnumC05543uF[] values() {
        return (EnumC05543uF[]) A01.clone();
    }

    public EnumC05543uF(String str, int i) {
    }
}
