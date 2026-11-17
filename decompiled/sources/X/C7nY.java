package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7nY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7nY {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C7nY[] A01;

    static {
        C7nY[] c7nYArr = {new C7nY("PUBLIC", 0), new C7nY("PROTECTED", 1), new C7nY("INTERNAL", 2), new C7nY("PRIVATE", 3)};
        A01 = c7nYArr;
        A00 = C3cG.A0w(c7nYArr);
    }

    public static C7nY valueOf(String str) {
        return (C7nY) Enum.valueOf(C7nY.class, str);
    }

    public static C7nY[] values() {
        return (C7nY[]) A01.clone();
    }

    public C7nY(String str, int i) {
    }
}
