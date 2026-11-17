package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9Vm, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Vm {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C9Vm[] A01;
    public static final C9Vm A02;
    public static final C9Vm A03;
    public static final C9Vm A04;

    static {
        C9Vm c9Vm = new C9Vm("INSTAGRAM", 0);
        A03 = c9Vm;
        C9Vm c9Vm2 = new C9Vm("FACEBOOK", 1);
        A02 = c9Vm2;
        C9Vm c9Vm3 = new C9Vm("OTHER", 2);
        A04 = c9Vm3;
        C9Vm[] c9VmArr = {c9Vm, c9Vm2, c9Vm3};
        A01 = c9VmArr;
        A00 = C3cG.A0w(c9VmArr);
    }

    public static C9Vm valueOf(String str) {
        return (C9Vm) Enum.valueOf(C9Vm.class, str);
    }

    public static C9Vm[] values() {
        return (C9Vm[]) A01.clone();
    }

    public C9Vm(String str, int i) {
    }
}
