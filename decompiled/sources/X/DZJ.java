package X;

import com.facebook.pando.NodeStoreTreeUpdaterJNI;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DZJ implements InterfaceC5114DZj<C5123Da7>, DZT {
    public final C5123Da7 A00;
    public final List A01;
    public final Map<String, Object> A02;

    @Override // X.DZT
    public final /* bridge */ DZW AJQ() {
        return null;
    }

    @Override // X.DZT
    public final Class<? extends TreeJNI> AM5() {
        return TreeJNI.class;
    }

    @Override // X.DZT
    public final TreeUpdaterJNI AhP() {
        Map<String, Object> map = this.A02;
        C5123Da7 c5123Da7 = this.A00;
        NodeStoreTreeUpdaterJNI nodeStoreTreeUpdaterJNI = new NodeStoreTreeUpdaterJNI(map, c5123Da7);
        c5123Da7.A01.addSnapshotTo$fbandroid_libraries_pando_graphql_pando_graphql(nodeStoreTreeUpdaterJNI);
        Iterator it = this.A01.iterator();
        if (!it.hasNext()) {
            return nodeStoreTreeUpdaterJNI;
        }
        it.next();
        throw BV4.A0a("addTo");
    }

    public /* synthetic */ DZJ(C5123Da7 c5123Da7) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        ArrayList arrayListA0h = C3cG.A0h();
        this.A00 = c5123Da7;
        this.A02 = linkedHashMapA0j;
        this.A01 = arrayListA0h;
    }
}
