package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Gof, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10058Gof {
    public final Collection<HjD> A05(AbstractC9901Gkh<?> abstractC9901Gkh, C9909Gkr c9909Gkr) {
        C9890GkR c9890GkR = (C9890GkR) this;
        Class<?> cls = c9909Gkr.A05;
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        C9890GkR.A02(abstractC9901Gkh, c9909Gkr, new HjD(cls, null), c9890GkR, linkedHashMapA0j, linkedHashSetA0k);
        LinkedHashSet<HjD> linkedHashSet = c9890GkR._registeredSubtypes;
        if (linkedHashSet != null) {
            Iterator<HjD> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                HjD next = it.next();
                if (cls.isAssignableFrom(next._class)) {
                    C9890GkR.A02(abstractC9901Gkh, C9928GlP.A01(abstractC9901Gkh, abstractC9901Gkh, next._class), next, c9890GkR, linkedHashMapA0j, linkedHashSetA0k);
                }
            }
        }
        return C9890GkR.A00(cls, linkedHashMapA0j, linkedHashSetA0k);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/Gmj;LX/GjI;)Ljava/util/Collection<LX/HjD;>; */
    public final ArrayList A03(AbstractC9870GjI abstractC9870GjI, AbstractC9901Gkh abstractC9901Gkh, AbstractC9970Gmj abstractC9970Gmj) {
        C9890GkR c9890GkR = (C9890GkR) this;
        AbstractC9910Gks abstractC9910GksA02 = abstractC9901Gkh.A02();
        Class<?> clsA08 = abstractC9870GjI != null ? abstractC9870GjI._class : abstractC9970Gmj.A08();
        HashMap mapA0u = BV4.A0u();
        LinkedHashSet<HjD> linkedHashSet = c9890GkR._registeredSubtypes;
        if (linkedHashSet != null) {
            Iterator<HjD> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                HjD next = it.next();
                if (clsA08.isAssignableFrom(next._class)) {
                    C9890GkR.A01(abstractC9910GksA02, abstractC9901Gkh, C9928GlP.A01(abstractC9901Gkh, abstractC9901Gkh, next._class), next, c9890GkR, mapA0u);
                }
            }
        }
        List<HjD> listA0c = abstractC9910GksA02.A0c(abstractC9970Gmj);
        if (listA0c != null) {
            for (HjD hjD : listA0c) {
                C9890GkR.A01(abstractC9910GksA02, abstractC9901Gkh, C9928GlP.A01(abstractC9901Gkh, abstractC9901Gkh, hjD._class), hjD, c9890GkR, mapA0u);
            }
        }
        C9890GkR.A01(abstractC9910GksA02, abstractC9901Gkh, C9928GlP.A01(abstractC9901Gkh, abstractC9901Gkh, clsA08), new HjD(clsA08, null), c9890GkR, mapA0u);
        return BV4.A0t(mapA0u.values());
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/Gmj;LX/GjI;)Ljava/util/Collection<LX/HjD;>; */
    public final ArrayList A04(AbstractC9870GjI abstractC9870GjI, AbstractC9901Gkh abstractC9901Gkh, AbstractC9970Gmj abstractC9970Gmj) {
        C9890GkR c9890GkR = (C9890GkR) this;
        AbstractC9910Gks abstractC9910GksA02 = abstractC9901Gkh.A02();
        Class<?> cls = abstractC9870GjI._class;
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        C9890GkR.A02(abstractC9901Gkh, C9928GlP.A01(abstractC9901Gkh, abstractC9901Gkh, cls), new HjD(cls, null), c9890GkR, linkedHashMapA0j, linkedHashSetA0k);
        List<HjD> listA0c = abstractC9910GksA02.A0c(abstractC9970Gmj);
        if (listA0c != null) {
            for (HjD hjD : listA0c) {
                C9890GkR.A02(abstractC9901Gkh, C9928GlP.A01(abstractC9901Gkh, abstractC9901Gkh, hjD._class), hjD, c9890GkR, linkedHashMapA0j, linkedHashSetA0k);
            }
        }
        LinkedHashSet<HjD> linkedHashSet = c9890GkR._registeredSubtypes;
        if (linkedHashSet != null) {
            Iterator<HjD> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                HjD next = it.next();
                if (cls.isAssignableFrom(next._class)) {
                    C9890GkR.A02(abstractC9901Gkh, C9928GlP.A01(abstractC9901Gkh, abstractC9901Gkh, next._class), next, c9890GkR, linkedHashMapA0j, linkedHashSetA0k);
                }
            }
        }
        return C9890GkR.A00(cls, linkedHashMapA0j, linkedHashSetA0k);
    }
}
