package X;

import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CPP {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ CPP[] A01;
    public static final CPP A02;
    public static final CPP A03;
    public static final CPP A04;
    public static final CPP A05;
    public static final CPP A06;
    public static final CPP A07;

    static {
        CPP cpp = new CPP(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        A04 = cpp;
        CPP cpp2 = new CPP("WARNING", 1);
        A07 = cpp2;
        CPP cpp3 = new CPP("ERROR", 2);
        A03 = cpp3;
        CPP cpp4 = new CPP("CRITICAL", 3);
        A02 = cpp4;
        CPP cpp5 = new CPP("UNSET", 4);
        A06 = cpp5;
        CPP cpp6 = new CPP("UNKNOWN", 5);
        A05 = cpp6;
        CPP[] cppArr = {cpp, cpp2, cpp3, cpp4, cpp5, cpp6};
        A01 = cppArr;
        A00 = C3cG.A0w(cppArr);
    }

    public static CPP valueOf(String str) {
        return (CPP) Enum.valueOf(CPP.class, str);
    }

    public static CPP[] values() {
        return (CPP[]) A01.clone();
    }

    public CPP(String str, int i) {
    }
}
