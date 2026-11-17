package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EOk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC6672EOk {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC6672EOk[] A01;
    public static final EnumC6672EOk A02;
    public final String serverValue;

    static {
        EnumC6672EOk enumC6672EOk = new EnumC6672EOk("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0, "UNSET_OR_UNRECOGNIZED_ENUM_VALUE");
        A02 = enumC6672EOk;
        EnumC6672EOk[] enumC6672EOkArr = {enumC6672EOk, new EnumC6672EOk("AVATAR_EDITOR", 1, "AVATAR_EDITOR"), new EnumC6672EOk("BASEL", 2, "BASEL"), new EnumC6672EOk("ECLIPSE", 3, "ECLIPSE"), new EnumC6672EOk("EXTERNAL", 4, "EXTERNAL"), new EnumC6672EOk("FACEBOOK", 5, "FACEBOOK"), new EnumC6672EOk("FACEBOOK_LITE", 6, "FACEBOOK_LITE"), new EnumC6672EOk("FB_MESSENGER", 7, "FB_MESSENGER"), new EnumC6672EOk("GAMES", 8, "GAMES"), new EnumC6672EOk("HATCH", 9, "HATCH"), new EnumC6672EOk("HORIZON_WORLDS", 10, "HORIZON_WORLDS"), new EnumC6672EOk("INSTAGRAM", 11, "INSTAGRAM"), new EnumC6672EOk("MBS", 12, "MBS"), new EnumC6672EOk("META_AI", 13, "META_AI"), new EnumC6672EOk("PULSE", 14, "PULSE"), new EnumC6672EOk("QUEST_STORE", 15, "QUEST_STORE"), new EnumC6672EOk("THREADS", 16, "THREADS"), new EnumC6672EOk("TWILIGHT", 17, "TWILIGHT"), new EnumC6672EOk("UNKNOWN", 18, "UNKNOWN"), new EnumC6672EOk("VIBES_AI", 19, "VIBES_AI"), new EnumC6672EOk("WA_BUSINESS", 20, "WA_BUSINESS"), new EnumC6672EOk("WHATSAPP", 21, "WHATSAPP")};
        A01 = enumC6672EOkArr;
        A00 = C3cG.A0w(enumC6672EOkArr);
    }

    public static EnumC6672EOk valueOf(String str) {
        return (EnumC6672EOk) Enum.valueOf(EnumC6672EOk.class, str);
    }

    public static EnumC6672EOk[] values() {
        return (EnumC6672EOk[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.serverValue;
    }

    public EnumC6672EOk(String str, int i, String str2) {
        this.serverValue = str2;
    }
}
