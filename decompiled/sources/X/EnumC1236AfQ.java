package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.AfQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1236AfQ {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ EnumC1236AfQ[] A01;
    public static final EnumC1236AfQ A02;
    public static final EnumC1236AfQ A03;
    public static final EnumC1236AfQ A04;

    static {
        EnumC1236AfQ enumC1236AfQ = new EnumC1236AfQ("ContinueTraversal", 0);
        A03 = enumC1236AfQ;
        EnumC1236AfQ enumC1236AfQ2 = new EnumC1236AfQ("SkipSubtreeAndContinueTraversal", 1);
        A04 = enumC1236AfQ2;
        EnumC1236AfQ enumC1236AfQ3 = new EnumC1236AfQ("CancelTraversal", 2);
        A02 = enumC1236AfQ3;
        EnumC1236AfQ[] enumC1236AfQArr = {enumC1236AfQ, enumC1236AfQ2, enumC1236AfQ3};
        A01 = enumC1236AfQArr;
        A00 = C3cG.A0w(enumC1236AfQArr);
    }

    public static EnumC1236AfQ valueOf(String str) {
        return (EnumC1236AfQ) Enum.valueOf(EnumC1236AfQ.class, str);
    }

    public static EnumC1236AfQ[] values() {
        return (EnumC1236AfQ[]) A01.clone();
    }

    public EnumC1236AfQ(String str, int i) {
    }
}
