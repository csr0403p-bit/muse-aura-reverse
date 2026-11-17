package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BI3 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ BI3[] A01;
    public static final BI3 A02;
    public static final BI3 A03;

    static {
        BI3 bi3 = new BI3("EditableText", 0);
        A02 = bi3;
        BI3 bi32 = new BI3("StaticText", 1);
        A03 = bi32;
        BI3[] bi3Arr = {bi3, bi32};
        A01 = bi3Arr;
        A00 = C3cG.A0w(bi3Arr);
    }

    public static BI3 valueOf(String str) {
        return (BI3) Enum.valueOf(BI3.class, str);
    }

    public static BI3[] values() {
        return (BI3[]) A01.clone();
    }

    public BI3(String str, int i) {
    }
}
