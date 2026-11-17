package X;

@Deprecated
/* loaded from: classes6.dex */
public final class GtE extends AbstractC10245Gsg {
    public static boolean A00;

    public final String toString() {
        return ":matchText";
    }

    public GtE() {
        if (A00) {
            return;
        }
        A00 = true;
        System.err.println("WARNING: :matchText selector is deprecated and will be removed in jsoup 1.24.1. Use Element#selectNodes(String, Class) with selector ::textnode and class TextNode instead.");
    }
}
