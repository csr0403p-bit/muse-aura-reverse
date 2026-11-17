package X;

import com.facebook.aura.utils.HatchUtil;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CRP {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ CRP[] A01;
    public static final CRP A02;
    public final String loggingValue;

    static {
        CRP crp = new CRP("UNREAD", 0, "unread");
        CRP crp2 = new CRP("UNBOUND", 1, "unbound");
        A02 = crp2;
        CRP[] crpArr = {crp, crp2, new CRP("ON", 2, HatchUtil.TYPING_INDICATOR_STATE_ON), new CRP("OFF", 3, HatchUtil.TYPING_INDICATOR_STATE_OFF)};
        A01 = crpArr;
        A00 = C3cG.A0w(crpArr);
    }

    public static CRP valueOf(String str) {
        return (CRP) Enum.valueOf(CRP.class, str);
    }

    public static CRP[] values() {
        return (CRP[]) A01.clone();
    }

    public CRP(String str, int i, String str2) {
        this.loggingValue = str2;
    }
}
