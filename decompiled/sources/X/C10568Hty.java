package X;

import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Hty, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10568Hty {
    public static final C10568Hty A01 = new C10568Hty();
    public final Set<String> A00;

    public C10568Hty() {
        HashSet hashSetA13 = C60O.A13();
        this.A00 = hashSetA13;
        AbstractC7608F5v.A1J(Object.class, hashSetA13);
        AbstractC7608F5v.A1J(Closeable.class, hashSetA13);
        AbstractC7608F5v.A1J(Serializable.class, hashSetA13);
        AbstractC7608F5v.A1J(AutoCloseable.class, hashSetA13);
        AbstractC7608F5v.A1J(Cloneable.class, hashSetA13);
        AbstractC7608F5v.A1J(Comparable.class, hashSetA13);
        hashSetA13.add("java.util.logging.Handler");
        hashSetA13.add("javax.naming.Referenceable");
        hashSetA13.add("javax.sql.DataSource");
    }
}
