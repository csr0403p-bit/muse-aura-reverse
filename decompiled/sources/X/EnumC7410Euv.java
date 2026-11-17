package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Euv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC7410Euv {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC7410Euv[] A01;
    public final int value;

    static {
        EnumC7410Euv[] enumC7410EuvArr = {new EnumC7410Euv(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0, -1), new EnumC7410Euv("CLEAR_ALL", 1, 0), new EnumC7410Euv("CLEAR_HERO_POOL", 2, 1), new EnumC7410Euv("CLEAR_WARMUP_POOL", 3, 2), new EnumC7410Euv("CLEAR_CODEC_POOL", 4, 3), new EnumC7410Euv("TRIM_HERO_POOL_2", 5, 4), new EnumC7410Euv("TRIM_HERO_POOL_1", 6, 5), new EnumC7410Euv("TRIM_HERO_POOL_2_CLEAR_WARM_UP", 7, 6), new EnumC7410Euv("TRIM_HERO_POOL_1_CLEAR_WARM_UP", 8, 7), new EnumC7410Euv("CLEAR_WARM_UP_AND_CODEC_POOL", 9, 8), new EnumC7410Euv("TRIM_HERO_POOL_2_CLEAR_WARM_UP_AND_CODEC_POOL", 10, 9), new EnumC7410Euv("TRIM_HERO_POOL_1_CLEAR_WARM_UP_AND_CODEC_POOL", 11, 10), new EnumC7410Euv("TRIM_HERO_POOL_2_CLEAR_CODEC_POOL", 12, 11), new EnumC7410Euv("TRIM_HERO_POOL_1_CLEAR_CODEC_POOL", 13, 12)};
        A01 = enumC7410EuvArr;
        A00 = C3cG.A0w(enumC7410EuvArr);
    }

    public static EnumC7410Euv valueOf(String str) {
        return (EnumC7410Euv) Enum.valueOf(EnumC7410Euv.class, str);
    }

    public static EnumC7410Euv[] values() {
        return (EnumC7410Euv[]) A01.clone();
    }

    public EnumC7410Euv(String str, int i, int i2) {
        this.value = i2;
    }
}
