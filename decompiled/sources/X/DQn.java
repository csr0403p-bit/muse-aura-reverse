package X;

import java.util.AbstractMap;

/* loaded from: classes5.dex */
public final class DQn<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    public static final long serialVersionUID = 0;
    public final E9S cause;

    /* JADX WARN: Incorrect types in method signature: (TK;TV;LX/E9S;)V */
    public DQn(E9S key, Object value, Object cause) {
        super(value, cause);
        this.cause = key;
    }
}
