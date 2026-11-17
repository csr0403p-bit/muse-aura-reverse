package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BjE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2730BjE {
    public final String A00;
    public final Map<String, BjM> A01 = C3cG.A0j();

    public final C2644Bgb A00() {
        C2644Bgb c2644Bgb = new C2644Bgb();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(this.A01);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            BjM bjM = (BjM) entryA0l.getValue();
            if (bjM.A01) {
                c2644Bgb.A01(bjM.A02);
                arrayListA0h.add(entryA0l.getKey());
            }
        }
        StringBuilder sbA0f = C3cG.A0f(arrayListA0h, "All use case: ");
        sbA0f.append(" for camera: ");
        AbstractC2875Bni.A01("UseCaseAttachState", AnonymousClass001.A0v(this.A00, sbA0f));
        return c2644Bgb;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/Bga;LX/BfN<*>;LX/Bc8;Ljava/util/List<LX/BcG;>;)V */
    public final void A03(C2643Bga c2643Bga, AbstractC2481Bc8 abstractC2481Bc8, BfN bfN, String str, List list) {
        Map<String, BjM> map = this.A01;
        BjM bjM = map.get(str);
        if (bjM == null) {
            bjM = new BjM(c2643Bga, abstractC2481Bc8, bfN, list);
            map.put(str, bjM);
        }
        bjM.A01 = true;
        A04(c2643Bga, abstractC2481Bc8, bfN, str, list);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/Bga;LX/BfN<*>;LX/Bc8;Ljava/util/List<LX/BcG;>;)V */
    public final void A04(C2643Bga c2643Bga, AbstractC2481Bc8 abstractC2481Bc8, BfN bfN, String str, List list) {
        Map<String, BjM> map = this.A01;
        if (map.containsKey(str)) {
            BjM bjM = new BjM(c2643Bga, abstractC2481Bc8, bfN, list);
            BjM bjM2 = map.get(str);
            bjM.A01 = bjM2.A01;
            bjM.A00 = bjM2.A00;
            map.put(str, bjM);
        }
    }

    public C2730BjE(String str) {
        this.A00 = str;
    }

    public final Collection<C2643Bga> A01() {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(this.A01);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (((BjM) entryA0l.getValue()).A01) {
                arrayListA0h.add(((BjM) entryA0l.getValue()).A02);
            }
        }
        return Collections.unmodifiableCollection(arrayListA0h);
    }

    public final Collection<BfN<?>> A02() {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator itA0n = AnonymousClass002.A0n(this.A01);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (((BjM) entryA0l.getValue()).A01) {
                arrayListA0h.add(((BjM) entryA0l.getValue()).A04);
            }
        }
        return Collections.unmodifiableCollection(arrayListA0h);
    }
}
