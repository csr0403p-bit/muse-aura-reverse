package X;

/* loaded from: classes4.dex */
public abstract class BMv {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void A13(Appendable appendable, T t, G0U<? super T, ? extends CharSequence> g0u) {
        CharSequence charSequence = t;
        if (g0u != null) {
            charSequence = (T) g0u.invoke(t);
        } else if (t != 0) {
            boolean z = t instanceof CharSequence;
            charSequence = t;
            if (!z) {
                if (t instanceof Character) {
                    appendable.append(((Character) t).charValue());
                    return;
                }
                charSequence = (T) t.toString();
            }
        }
        appendable.append(charSequence);
    }
}
