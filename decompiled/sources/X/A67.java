package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class A67<E, C extends Collection<? extends E>, B> extends C9tX<E, C, B> {
    @Override // X.C9tY
    public final /* bridge */ /* synthetic */ int A02(Object obj) {
        Collection collection = (Collection) obj;
        C7384Etj.A0Y(collection, 0);
        return collection.size();
    }

    @Override // X.C9tY
    public final /* bridge */ /* synthetic */ Iterator A06(Object obj) {
        Collection collection = (Collection) obj;
        C7384Etj.A0Y(collection, 0);
        return collection.iterator();
    }
}
