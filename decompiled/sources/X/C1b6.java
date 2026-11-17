package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1b6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1b6 {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C1b6[] A01;
    public final int code;
    public final String logValue;

    static {
        C1b6[] c1b6Arr = {new C1b6("UNKNOWN", 0, -1, "unknown"), new C1b6("DAV1D_VULKAN", 1, 0, "dav1d_vulkan"), new C1b6("DAV1D_OPENGL_HW", 2, 1, "dav1d_opengl_hw"), new C1b6("DAV1D_OPENGL", 3, 2, "dav1d_opengl"), new C1b6("DAV1D_CANVAS_HW", 4, 3, "dav1d_canvas_hw"), new C1b6("DAV1D_CANVAS", 5, 4, "dav1d_canvas")};
        A01 = c1b6Arr;
        A00 = new F3w(c1b6Arr);
    }

    public static C1b6 valueOf(String str) {
        return (C1b6) Enum.valueOf(C1b6.class, str);
    }

    public static C1b6[] values() {
        return (C1b6[]) A01.clone();
    }

    public C1b6(String str, int i, int i2, String str2) {
        this.code = i2;
        this.logValue = str2;
    }
}
