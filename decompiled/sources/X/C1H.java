package X;

/* loaded from: classes5.dex */
public abstract class C1H {
    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(TT;)TT; */
    public static void A00(Object obj) {
        if (obj == null) {
            throw new AssertionError();
        }
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(TT;Ljava/lang/String;)TT; */
    public static void A01(Object obj, String str) {
        if (obj == null) {
            throw new AssertionError(str);
        }
    }
}
