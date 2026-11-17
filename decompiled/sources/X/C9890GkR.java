package X;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.GkR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9890GkR extends AbstractC10058Gof implements Serializable {
    public static final long serialVersionUID = 1;
    public LinkedHashSet<HjD> _registeredSubtypes;

    public static final void A01(AbstractC9910Gks abstractC9910Gks, AbstractC9901Gkh abstractC9901Gkh, C9909Gkr c9909Gkr, HjD hjD, C9890GkR c9890GkR, HashMap map) {
        String strA0a;
        if (hjD._name == null && (strA0a = abstractC9910Gks.A0a(c9909Gkr)) != null) {
            hjD = new HjD(hjD._class, strA0a);
        }
        HjD hjD2 = new HjD(hjD._class, null);
        if (map.containsKey(hjD2)) {
            if (hjD._name == null || ((HjD) map.get(hjD2))._name != null) {
                return;
            }
            map.put(hjD2, hjD);
            return;
        }
        map.put(hjD2, hjD);
        List<HjD> listA0c = abstractC9910Gks.A0c(c9909Gkr);
        if (listA0c == null || listA0c.isEmpty()) {
            return;
        }
        for (HjD hjD3 : listA0c) {
            A01(abstractC9910Gks, abstractC9901Gkh, C9928GlP.A01(abstractC9901Gkh, abstractC9901Gkh, hjD3._class), hjD3, c9890GkR, map);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;Ljava/util/Set<Ljava/lang/Class<*>;>;Ljava/util/Map<Ljava/lang/String;LX/HjD;>;)Ljava/util/Collection<LX/HjD;>; */
    public static final ArrayList A00(Class cls, Map map, Set set) {
        ArrayList arrayListA0t = BV4.A0t(map.values());
        Iterator itA10 = BV5.A10(map);
        while (itA10.hasNext()) {
            set.remove(((HjD) itA10.next())._class);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Class cls2 = (Class) it.next();
            if (cls2 != cls || !Modifier.isAbstract(cls2.getModifiers())) {
                arrayListA0t.add(new HjD(cls2, null));
            }
        }
        return arrayListA0t;
    }

    public static final void A02(AbstractC9901Gkh abstractC9901Gkh, C9909Gkr c9909Gkr, HjD hjD, C9890GkR c9890GkR, Map map, Set set) {
        List<HjD> listA0c;
        String strA0a;
        AbstractC9910Gks abstractC9910GksA02 = abstractC9901Gkh.A02();
        if (hjD._name == null && (strA0a = abstractC9910GksA02.A0a(c9909Gkr)) != null) {
            hjD = new HjD(hjD._class, strA0a);
        }
        String str = hjD._name;
        if (str != null) {
            map.put(str, hjD);
        }
        if (!set.add(hjD._class) || (listA0c = abstractC9910GksA02.A0c(c9909Gkr)) == null || listA0c.isEmpty()) {
            return;
        }
        for (HjD hjD2 : listA0c) {
            A02(abstractC9901Gkh, C9928GlP.A01(abstractC9901Gkh, abstractC9901Gkh, hjD2._class), hjD2, c9890GkR, map, set);
        }
    }
}
