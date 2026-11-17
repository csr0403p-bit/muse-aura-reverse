package X;

import X.DaI;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.C1s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3185C1s<T extends DaI> implements DZT {
    public TreeJNI A00;
    public final Class<T> A01;
    public final List A02;
    public final Map<String, Object> A03;

    @Override // X.DZT
    public final DZW AJQ() {
        return null;
    }

    @Override // X.DZT
    public final Class<? extends TreeJNI> AM5() {
        return this.A01;
    }

    @Override // X.DZT
    public final TreeUpdaterJNI AhP() {
        TreeJNI treeJNI = this.A00;
        TreeUpdaterJNI treeUpdaterJNI = new TreeUpdaterJNI((Map<String, ? extends Object>) this.A03, treeJNI);
        treeUpdaterJNI.addAdditionalSnapshot(treeJNI);
        Iterator it = this.A02.iterator();
        if (!it.hasNext()) {
            return treeUpdaterJNI;
        }
        it.next();
        throw BV4.A0a("addTo");
    }

    public C3185C1s(T t) {
        Class<T> cls = (Class<T>) t.getClass();
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        ArrayList arrayListA0h = C3cG.A0h();
        this.A00 = t;
        this.A01 = cls;
        this.A03 = linkedHashMapA0j;
        this.A02 = arrayListA0h;
    }
}
