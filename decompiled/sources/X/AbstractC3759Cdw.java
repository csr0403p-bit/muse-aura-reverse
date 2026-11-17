package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: X.Cdw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3759Cdw extends AbstractC3753Cdq implements Serializable {
    public transient int A00;
    public transient Map A01;

    public final List A00(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new C3735CdY(null, this, obj, list) : new DR8(null, this, obj, list);
    }
}
