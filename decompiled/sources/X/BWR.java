package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BWR {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BWR[] A01;
    public static final BWR A02;
    public static final BWR A03;
    public final int priority;

    static {
        BWR bwr = new BWR("FULL_THROW", 0, 0);
        A02 = bwr;
        BWR bwr2 = new BWR(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 1, 1);
        A03 = bwr2;
        BWR[] bwrArr = {bwr, bwr2};
        A01 = bwrArr;
        A00 = C3cG.A0w(bwrArr);
    }

    public static BWR valueOf(String str) {
        return (BWR) Enum.valueOf(BWR.class, str);
    }

    public static BWR[] values() {
        return (BWR[]) A01.clone();
    }

    public BWR(String str, int i, int i2) {
        this.priority = i2;
    }
}
