package X;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class Bb9 {
    public static /* synthetic */ AssertionError A00(String str, Throwable th) {
        try {
            return (AssertionError) AssertionError.class.getDeclaredConstructor(String.class, Throwable.class).newInstance(str, th);
        } catch (Exception unused) {
            return BV4.A0N(str);
        }
    }
}
