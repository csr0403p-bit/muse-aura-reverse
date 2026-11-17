package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class GRO {
    /* JADX WARN: Incorrect return type in method signature: <State:Ljava/lang/Object;>(LX/F1F;LX/Hqv<TState;>;LX/Hqv<LX/G0V<TState;Ljava/lang/Object;TState;>;>;LX/Hqv<Ljava/util/List<Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;>;>;LX/Hqv<Ljava/util/List<Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;>;>;Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    public static final void A01(Object obj, F1F f1f, C10543Hqv c10543Hqv, C10543Hqv c10543Hqv2, C10543Hqv c10543Hqv3, C10543Hqv c10543Hqv4) {
        if (!(!(obj instanceof Ht9))) {
            throw C60O.A0i("Actions must be plain objects. Use custom middleware for async \nactions.");
        }
        try {
            f1f.element = true;
            c10543Hqv.element = ((G0V) c10543Hqv2.element).invoke(c10543Hqv.element, obj);
            f1f.element = false;
            T t = c10543Hqv3.element;
            c10543Hqv4.element = t;
            Iterator it = ((List) t).iterator();
            while (it.hasNext()) {
                BV7.A1M(it);
            }
        } catch (Throwable th) {
            f1f.element = false;
            throw th;
        }
    }

    /* JADX WARN: Incorrect types in method signature: <State:Ljava/lang/Object;>(LX/G0V<-TState;Ljava/lang/Object;+TState;>;TState;LX/G0U<-LX/G0W<-LX/G0V<-TState;Ljava/lang/Object;+TState;>;-TState;Ljava/lang/Object;+LX/GRU<TState;>;>;+LX/G0W<-LX/G0V<-TState;Ljava/lang/Object;+TState;>;-TState;Ljava/lang/Object;+LX/GRU<TState;>;>;>;)LX/GRU<TState;>; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
    public static final GRU A00(Object obj, G0U g0u, G0V g0v) {
        Object grq;
        if (g0u != null) {
            grq = ((G0W) g0u.invoke(new C8633Fhk(3))).invoke(g0v, obj, null);
        } else {
            C10543Hqv c10543HqvA0z = C3cG.A0z();
            c10543HqvA0z.element = g0v;
            C10543Hqv c10543HqvA0z2 = C3cG.A0z();
            c10543HqvA0z2.element = obj;
            C10543Hqv c10543HqvA0z3 = C3cG.A0z();
            ?? A0h = C3cG.A0h();
            c10543HqvA0z3.element = A0h;
            C10543Hqv c10543HqvA0z4 = C3cG.A0z();
            c10543HqvA0z4.element = A0h;
            F1F f1f = new F1F();
            A01(GRG.A00, f1f, c10543HqvA0z2, c10543HqvA0z, c10543HqvA0z4, c10543HqvA0z3);
            grq = new GRQ(f1f, c10543HqvA0z2, c10543HqvA0z, c10543HqvA0z4, c10543HqvA0z3);
        }
        return (GRU) grq;
    }
}
