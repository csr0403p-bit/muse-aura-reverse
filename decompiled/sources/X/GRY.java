package X;

import android.os.Looper;
import com.facebook.debug.tracer.Tracer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class GRY implements Runnable {
    public static final String __redex_internal_original_name = "RpStoreKt$createSubscriptionManagingStoreEnhancer$1$1$2$1";
    public final /* synthetic */ GRZ A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Thread A02;
    public final /* synthetic */ List<G0U<G0U<Object, ? extends Object>, G0U<Object, Object>>> A03;
    public final /* synthetic */ AtomicInteger A04;
    public final /* synthetic */ G0U<Integer, G0U<Object, Object>> A05;
    public final /* synthetic */ G0V<Integer, G0U<? super G0U<Object, ? extends Object>, ? extends G0U<Object, ? extends Object>>, G0U<G0U<Object, ? extends Object>, G0U<Object, Object>>> A06;

    public GRY(GRZ grz, Object obj, Thread thread, List list, AtomicInteger atomicInteger, G0U g0u, G0V g0v) {
        this.A02 = thread;
        this.A04 = atomicInteger;
        this.A00 = grz;
        this.A01 = obj;
        this.A06 = g0v;
        this.A03 = list;
        this.A05 = g0u;
    }

    public static Function0<Unit> A00(GSR gsr, GRH grh, Object obj, Object obj2) {
        if (gsr instanceof GSB) {
            throw C3cG.A0Q("RpStateSubscriber not supported in granular subscribers");
        }
        if (gsr instanceof GS0) {
            return new C8187FYe(obj2, grh, obj, gsr, 3);
        }
        if (gsr instanceof GSA) {
            return new C8188FYf(gsr, grh, obj2, 4);
        }
        if (gsr instanceof C9598GRe) {
            throw C3cG.A0Q("nested GranularSubscribers are not supported");
        }
        throw C3cG.A0q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C7384Etj.areEqual(this.A02, Thread.currentThread());
        AtomicInteger atomicInteger = this.A04;
        if (atomicInteger.incrementAndGet() > 1) {
            AbstractC7608F5v.A1L("RpStore execution entrant count > 1. Non-serial processing of actions may lead to undefined behavior.");
        }
        GRZ grz = this.A00;
        grz.A02.getValue();
        Object obj = this.A01;
        try {
            if (obj instanceof GSD) {
                if (grz.equals(GRK.A01)) {
                    AbstractC7608F5v.A1L("subscribe called on finalized RpStore. No updates will be provided.");
                } else {
                    C9598GRe c9598GRe = ((GSD) obj).A00;
                    if (c9598GRe.A05) {
                        GRX grx = grz.A00;
                        C7384Etj.A0Y(grx, 0);
                        if (c9598GRe.A05) {
                            Iterator<Map.Entry<Class<?>, List<G0U<Object, Object>>>> it = c9598GRe.A01.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entryA0l = C3cH.A0l(it);
                                Object key = entryA0l.getKey();
                                Object value = entryA0l.getValue();
                                C7384Etj.A0U(value);
                                for (Object obj2 : (Iterable) value) {
                                    C7384Etj.A0X(key);
                                    C7384Etj.A0Y(obj2, 1);
                                    Map<Class<? extends Object>, Map<G0U<Object, Object>, List<GSP>>> map = grx.A02;
                                    Tracer.A01("SubscriptionManager.registerSelectorToOnChangeMapping");
                                    Map map2 = (Map) map.get(key);
                                    if (map2 == null) {
                                        C0862A6j.A02(obj2, 1);
                                        map.put(key, AGH.A05(C3cG.A0r(obj2, AbstractC0885AGm.A0y(c9598GRe))));
                                    } else {
                                        C0862A6j.A02(obj2, 1);
                                        List list = (List) map2.get(obj2);
                                        if (list == null) {
                                            map2.put(obj2, AbstractC0885AGm.A0y(c9598GRe));
                                        } else {
                                            list.add(c9598GRe);
                                        }
                                    }
                                    Tracer.A00();
                                }
                            }
                            Iterator<Map.Entry<Class<?>, GSR>> it2 = c9598GRe.A02.entrySet().iterator();
                            while (it2.hasNext()) {
                                Object key2 = C3cH.A0l(it2).getKey();
                                C7384Etj.A0U(key2);
                                Map<Class<?>, List<GSP>> map3 = grx.A01;
                                Tracer.A01("SubscriptionManager.registerClassLevelSubscription");
                                List list2 = (List) map3.get(key2);
                                if (list2 == null) {
                                    map3.put(key2, AbstractC0885AGm.A0y(c9598GRe));
                                } else {
                                    list2.add(c9598GRe);
                                }
                                Tracer.A00();
                            }
                            Iterator itA0i = C3cG.A0i(c9598GRe.A04);
                            while (itA0i.hasNext()) {
                                Object key3 = C3cH.A0l(itA0i).getKey();
                                C7384Etj.A0Y(key3, 0);
                                Map<Class<?>, CopyOnWriteArrayList<GSP>> map4 = grx.A00;
                                Tracer.A01("SubscriptionManager.registerActionSubscription");
                                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) map4.get(key3);
                                if (copyOnWriteArrayList == null) {
                                    map4.put(key3, new CopyOnWriteArrayList(AbstractC0885AGm.A0y(c9598GRe)));
                                } else {
                                    copyOnWriteArrayList.add(c9598GRe);
                                }
                                Tracer.A00();
                            }
                        }
                    }
                }
            } else if (obj instanceof GSC) {
                GRX grx2 = grz.A00;
                GSP gsp = ((GSC) obj).A00;
                Tracer.A01("SubscriptionManager.unregister");
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator itA10 = BV5.A10(grx2.A02);
                while (itA10.hasNext()) {
                    Map map5 = (Map) itA10.next();
                    Iterator itA0n = AnonymousClass002.A0n(map5);
                    while (itA0n.hasNext()) {
                        Map.Entry entryA0l2 = C3cH.A0l(itA0n);
                        ((List) entryA0l2.getValue()).remove(gsp);
                        if (((List) entryA0l2.getValue()).isEmpty()) {
                            arrayListA0h.add(entryA0l2.getKey());
                        }
                    }
                    Iterator it3 = arrayListA0h.iterator();
                    while (it3.hasNext()) {
                        C0862A6j.A01(map5).remove((G0U) it3.next());
                    }
                }
                Iterator itA102 = BV5.A10(grx2.A01);
                while (itA102.hasNext()) {
                    ((List) itA102.next()).remove(gsp);
                }
                Iterator itA103 = BV5.A10(grx2.A00);
                while (itA103.hasNext()) {
                    ((CopyOnWriteArrayList) itA103.next()).remove(gsp);
                }
            } else {
                GRH grhA00 = C9659Gcj.A00(grz);
                G0V<Integer, G0U<? super G0U<Object, ? extends Object>, ? extends G0U<Object, ? extends Object>>, G0U<G0U<Object, ? extends Object>, G0U<Object, Object>>> g0v = this.A06;
                List<G0U<G0U<Object, ? extends Object>, G0U<Object, Object>>> list3 = this.A03;
                C7384Etj.A0Y(list3, 0);
                ((G0U) g0v.invoke(-1, new EQe(list3, 22)).invoke(this.A05.invoke(-1))).invoke(obj);
                GRH grhA002 = C9659Gcj.A00(grz);
                GRX grx3 = grz.A00;
                AnonymousClass002.A1A(grhA00, 1, grhA002);
                Tracer.A01("SubscriptionManager.onChange");
                C7384Etj.areEqual(Looper.myLooper(), Looper.getMainLooper());
                LinkedHashSet linkedHashSetA0k = C3cG.A0k();
                ArrayList arrayListA0h2 = C3cG.A0h();
                LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                F1E f1e = new F1E();
                Iterator itA0n2 = AnonymousClass002.A0n(grx3.A02);
                while (itA0n2.hasNext()) {
                    Map.Entry entryA0l3 = C3cH.A0l(itA0n2);
                    Class cls = (Class) entryA0l3.getKey();
                    Map map6 = (Map) entryA0l3.getValue();
                    G50 g50A00 = G9e.A00(cls);
                    Iterator itA0n3 = AnonymousClass002.A0n(map6);
                    while (itA0n3.hasNext()) {
                        Map.Entry entryA0l4 = C3cH.A0l(itA0n3);
                        G0U<Object, Object> g0u = (G0U) entryA0l4.getKey();
                        List list4 = (List) entryA0l4.getValue();
                        Object objA00 = GRX.A00(g50A00, grhA00, cls);
                        Object objA002 = GRX.A00(g50A00, grhA002, cls);
                        Object objInvoke = objA00 == null ? null : g0u.invoke(objA00);
                        Object objInvoke2 = objA002 != null ? g0u.invoke(objA002) : null;
                        if (!C7384Etj.areEqual(objInvoke, objInvoke2)) {
                            Iterator it4 = list4.iterator();
                            while (it4.hasNext()) {
                                C9598GRe c9598GRe2 = (C9598GRe) ((GSP) it4.next());
                                if (c9598GRe2.A05) {
                                    if (!(c9598GRe2 instanceof GSB)) {
                                        if (c9598GRe2 instanceof GSA) {
                                            arrayListA0h2.add(new C8188FYf(c9598GRe2, grhA002, objInvoke2, 5));
                                        } else {
                                            C7384Etj.A0Y(g0u, 1);
                                            GSR gsr = c9598GRe2.A03.get(g0u);
                                            if (gsr != null) {
                                                arrayListA0h2.add(A00(gsr, grhA002, objInvoke, objInvoke2));
                                            }
                                        }
                                    }
                                    linkedHashSetA0k.add(c9598GRe2);
                                }
                            }
                        }
                    }
                }
                Iterator itA0n4 = AnonymousClass002.A0n(grx3.A01);
                while (itA0n4.hasNext()) {
                    Map.Entry entryA0l5 = C3cH.A0l(itA0n4);
                    Class<?> cls2 = (Class) entryA0l5.getKey();
                    List list5 = (List) entryA0l5.getValue();
                    G50 g50A002 = G9e.A00(cls2);
                    Object objA003 = GRX.A00(g50A002, grhA00, cls2);
                    Object objA004 = GRX.A00(g50A002, grhA002, cls2);
                    if (!C7384Etj.areEqual(objA003, objA004)) {
                        Iterator it5 = list5.iterator();
                        while (it5.hasNext()) {
                            C9598GRe c9598GRe3 = (C9598GRe) ((GSP) it5.next());
                            if (c9598GRe3.A05) {
                                if (!(c9598GRe3 instanceof GSB)) {
                                    if (c9598GRe3 instanceof GSA) {
                                        arrayListA0h2.add(new C8188FYf(c9598GRe3, grhA002, objA004, 6));
                                    } else {
                                        C7384Etj.A0Y(cls2, 1);
                                        GSR gsr2 = c9598GRe3.A02.get(cls2);
                                        if (gsr2 != null) {
                                            arrayListA0h2.add(A00(gsr2, grhA002, objA003, objA004));
                                        }
                                        f1e.element++;
                                    }
                                }
                                linkedHashSetA0k.add(c9598GRe3);
                            }
                        }
                    }
                }
                if (!arrayListA0h2.isEmpty() || !linkedHashSetA0k.isEmpty() || !grx3.A00.isEmpty()) {
                    grx3.A03.execute(new RunnableC9594GRa(grx3, grhA002, obj, arrayListA0h2, linkedHashMapA0j, linkedHashSetA0k, f1e));
                }
            }
            atomicInteger.decrementAndGet();
        } finally {
            Tracer.A00();
        }
    }
}
