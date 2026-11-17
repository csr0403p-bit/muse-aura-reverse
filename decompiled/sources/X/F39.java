package X;

/* loaded from: classes5.dex */
public final class F39 {
    public static final String A00(BM4 bm4) {
        String string = bm4.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
