package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public abstract class Ce3 extends AbstractC3760Cdx implements Serializable {
    public transient int A00;
    public transient Map A01;

    public final List A00(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new C3740Cdd(null, this, obj, list) : new DRC(null, this, obj, list);
    }
}
