package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class DTS {
    public static final /* synthetic */ DTS[] A00;
    public static final DTS A01;
    public static final DTS A02;
    public static final DTS A03;

    static {
        DTS dts = new DTS() { // from class: X.DTY
        };
        A01 = dts;
        DTX dtx = new DTX();
        A03 = dtx;
        DTZ dtz = new DTZ();
        A02 = dtz;
        A00 = new DTS[]{dts, dtx, dtz};
    }

    public static DTS valueOf(String str) {
        return (DTS) Enum.valueOf(DTS.class, str);
    }

    public static DTS[] values() {
        return (DTS[]) A00.clone();
    }

    public DTS(String str, int i) {
    }
}
