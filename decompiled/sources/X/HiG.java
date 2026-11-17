package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HiG {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ HiG[] A01;
    public static final HiG A02;
    public static final HiG A03;
    public final String value;

    static {
        HiG hiG = new HiG("DEFAULT", 0, "default");
        A02 = hiG;
        HiG hiG2 = new HiG("FADE", 1, "fade");
        HiG hiG3 = new HiG(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 2, "none");
        A03 = hiG3;
        HiG[] hiGArr = {hiG, hiG2, hiG3};
        A01 = hiGArr;
        A00 = C3cG.A0w(hiGArr);
    }

    public static final HiG A00(String str) {
        for (HiG hiG : A00) {
            if (str.equals(hiG.toString())) {
                return hiG;
            }
        }
        return A02;
    }

    public static HiG valueOf(String str) {
        return (HiG) Enum.valueOf(HiG.class, str);
    }

    public static HiG[] values() {
        return (HiG[]) A01.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }

    public HiG(String str, int i, String str2) {
        this.value = str2;
    }
}
