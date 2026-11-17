package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Fyb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class EnumC9110Fyb {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC9110Fyb[] A01;
    public static final EnumC9110Fyb A02;
    public static final EnumC9110Fyb A03;

    static {
        C9134Fyz c9134Fyz = new C9134Fyz();
        A02 = c9134Fyz;
        C9136Fz1 c9136Fz1 = new C9136Fz1();
        A03 = c9136Fz1;
        EnumC9110Fyb[] enumC9110FybArr = {c9134Fyz, c9136Fz1};
        A01 = enumC9110FybArr;
        A00 = C3cG.A0w(enumC9110FybArr);
    }

    public static EnumC9110Fyb valueOf(String str) {
        return (EnumC9110Fyb) Enum.valueOf(EnumC9110Fyb.class, str);
    }

    public static EnumC9110Fyb[] values() {
        return (EnumC9110Fyb[]) A01.clone();
    }

    public EnumC9110Fyb(String str, int i) {
    }
}
