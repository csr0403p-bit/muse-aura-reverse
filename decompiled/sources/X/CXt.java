package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CXt {
    public static final Map<Integer, CXt> A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ CXt[] A02;
    public static final CXt A03;
    public static final CXt A04;
    public static final CXt A05;
    public final int value;

    static {
        CXt cXt = new CXt(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0, 0);
        A04 = cXt;
        CXt cXt2 = new CXt("PREFETCH", 1, 1);
        A05 = cXt2;
        CXt cXt3 = new CXt("FETCH", 2, 2);
        A03 = cXt3;
        CXt[] cXtArr = {cXt, cXt2, cXt3, new CXt("REFRESH", 3, 3), new CXt("WARMUP", 4, 4), new CXt("UPLOAD", 5, 5), new CXt("PREUPLOAD", 6, 6), new CXt("OFFLINE", 7, 7)};
        A02 = cXtArr;
        A01 = C3cG.A0w(cXtArr);
        A00 = BV4.A0u();
        for (CXt cXt4 : values()) {
            A00.put(Integer.valueOf(cXt4.value), cXt4);
        }
    }

    public static CXt valueOf(String str) {
        return (CXt) Enum.valueOf(CXt.class, str);
    }

    public static CXt[] values() {
        return (CXt[]) A02.clone();
    }

    public CXt(String str, int i, int i2) {
        this.value = i2;
    }
}
