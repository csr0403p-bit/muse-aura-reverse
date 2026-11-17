package X;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9u9, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9u9 {
    public static final C9uC<? extends Object> A00;
    public static final C9uC<Object> A01;
    public static final C9uD<? extends Object> A02;
    public static final C9uD<Object> A03;

    static {
        final C2276BSc c2276BSc = new C2276BSc(42);
        boolean z = C9uH.A00;
        A02 = (C9uD) (z ? new C9uL(c2276BSc) : new C9uD<T>(c2276BSc) { // from class: X.9uM
            public final ConcurrentHashMap<Class<?>, C9uP<T>> A00 = C60O.A1C();
            public final G0U<C9uG<?>, C9hr<T>> A01;

            @Override // X.C9uD
            public final C9hr<T> AC2(C9uG<Object> c9uG) {
                C9uP<T> c9uPPutIfAbsent;
                C7384Etj.A0Y(c9uG, 0);
                ConcurrentHashMap<Class<?>, C9uP<T>> concurrentHashMap = this.A00;
                Class<?> clsA01 = C9uT.A01(c9uG);
                C9uP<T> c9uP = concurrentHashMap.get(clsA01);
                if (c9uP == null && (c9uPPutIfAbsent = concurrentHashMap.putIfAbsent(clsA01, (c9uP = new C9uP<>(this.A01.invoke(c9uG))))) != null) {
                    c9uP = c9uPPutIfAbsent;
                }
                return c9uP.A00;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.A01 = c2276BSc;
            }
        });
        final C2276BSc c2276BSc2 = new C2276BSc(43);
        A03 = z ? new C9uL<>(c2276BSc2) : new C9uD<T>(c2276BSc2) { // from class: X.9uM
            public final ConcurrentHashMap<Class<?>, C9uP<T>> A00 = C60O.A1C();
            public final G0U<C9uG<?>, C9hr<T>> A01;

            @Override // X.C9uD
            public final C9hr<T> AC2(C9uG<Object> c9uG) {
                C9uP<T> c9uPPutIfAbsent;
                C7384Etj.A0Y(c9uG, 0);
                ConcurrentHashMap<Class<?>, C9uP<T>> concurrentHashMap = this.A00;
                Class<?> clsA01 = C9uT.A01(c9uG);
                C9uP<T> c9uP = concurrentHashMap.get(clsA01);
                if (c9uP == null && (c9uPPutIfAbsent = concurrentHashMap.putIfAbsent(clsA01, (c9uP = new C9uP<>(this.A01.invoke(c9uG))))) != null) {
                    c9uP = c9uPPutIfAbsent;
                }
                return c9uP.A00;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.A01 = c2276BSc2;
            }
        };
        final C2280BSg c2280BSg = new C2280BSg(21);
        A00 = (C9uC) (z ? new C9uC<T>(c2280BSg) { // from class: X.9uK
            public final G0V<C9uG<Object>, List<? extends C9uE>, C9hr<T>> A00;
            public final C9uQ<C9uO<T>> A01 = new C9uQ<>();

            /* JADX WARN: Incorrect types in method signature: (LX/9uG<Ljava/lang/Object;>;Ljava/util/List<+LX/9uE;>;)Ljava/lang/Object; */
            @Override // X.C9uC
            public final Object AC5(List list, C9uG c9uG) {
                Object objA0s;
                C7384Etj.A0Y(c9uG, 0);
                C9uO<T> c9uO = this.A01.get(C9uT.A01(c9uG));
                C7384Etj.A0U(c9uO);
                C9uN c9uN = (C9uN) c9uO;
                T t = c9uN.reference.get();
                if (t == null) {
                    C2277BSd c2277BSd = new C2277BSd(22);
                    synchronized (c9uN) {
                        t = c9uN.reference.get();
                        if (t == null) {
                            t = (T) c2277BSd.invoke();
                            c9uN.reference = new SoftReference<>(t);
                        }
                    }
                }
                C9uO c9uO2 = t;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(new C9uF((C9uE) it.next()));
                }
                ConcurrentHashMap<List<C9uF>, HsJ<C9hr<T>>> concurrentHashMap = c9uO2.A00;
                HsJ<C9hr<T>> hsJPutIfAbsent = concurrentHashMap.get(arrayListA0i);
                if (hsJPutIfAbsent == null) {
                    try {
                        objA0s = (C9hr) this.A00.invoke(c9uG, list);
                    } catch (Throwable th) {
                        objA0s = C3cG.A0s(th);
                    }
                    HsJ<C9hr<T>> hsJA0t = C3cG.A0t(objA0s);
                    hsJPutIfAbsent = concurrentHashMap.putIfAbsent(arrayListA0i, hsJA0t);
                    if (hsJPutIfAbsent == null) {
                        hsJPutIfAbsent = hsJA0t;
                    }
                }
                return hsJPutIfAbsent.value;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.A00 = c2280BSg;
            }
        } : new C9uC<T>(c2280BSg) { // from class: X.9uJ
            public final ConcurrentHashMap<Class<?>, C9uO<T>> A00 = C60O.A1C();
            public final G0V<C9uG<Object>, List<? extends C9uE>, C9hr<T>> A01;

            /* JADX WARN: Incorrect types in method signature: (LX/9uG<Ljava/lang/Object;>;Ljava/util/List<+LX/9uE;>;)Ljava/lang/Object; */
            @Override // X.C9uC
            public final Object AC5(List list, C9uG c9uG) {
                Object objA0s;
                C9uO<T> c9uOPutIfAbsent;
                C7384Etj.A0Y(c9uG, 0);
                ConcurrentHashMap<Class<?>, C9uO<T>> concurrentHashMap = this.A00;
                Class<?> clsA01 = C9uT.A01(c9uG);
                C9uO<T> c9uO = concurrentHashMap.get(clsA01);
                if (c9uO == null && (c9uOPutIfAbsent = concurrentHashMap.putIfAbsent(clsA01, (c9uO = new C9uO<>()))) != null) {
                    c9uO = c9uOPutIfAbsent;
                }
                C9uO<T> c9uO2 = c9uO;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(new C9uF((C9uE) it.next()));
                }
                ConcurrentHashMap<List<C9uF>, HsJ<C9hr<T>>> concurrentHashMap2 = c9uO2.A00;
                HsJ<C9hr<T>> hsJPutIfAbsent = concurrentHashMap2.get(arrayListA0i);
                if (hsJPutIfAbsent == null) {
                    try {
                        objA0s = (C9hr) this.A01.invoke(c9uG, list);
                    } catch (Throwable th) {
                        objA0s = C3cG.A0s(th);
                    }
                    HsJ<C9hr<T>> hsJA0t = C3cG.A0t(objA0s);
                    hsJPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayListA0i, hsJA0t);
                    if (hsJPutIfAbsent == null) {
                        hsJPutIfAbsent = hsJA0t;
                    }
                }
                return hsJPutIfAbsent.value;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.A01 = c2280BSg;
            }
        });
        final C2280BSg c2280BSg2 = new C2280BSg(22);
        A01 = z ? new C9uC<T>(c2280BSg2) { // from class: X.9uK
            public final G0V<C9uG<Object>, List<? extends C9uE>, C9hr<T>> A00;
            public final C9uQ<C9uO<T>> A01 = new C9uQ<>();

            /* JADX WARN: Incorrect types in method signature: (LX/9uG<Ljava/lang/Object;>;Ljava/util/List<+LX/9uE;>;)Ljava/lang/Object; */
            @Override // X.C9uC
            public final Object AC5(List list, C9uG c9uG) {
                Object objA0s;
                C7384Etj.A0Y(c9uG, 0);
                C9uO<T> c9uO = this.A01.get(C9uT.A01(c9uG));
                C7384Etj.A0U(c9uO);
                C9uN c9uN = (C9uN) c9uO;
                T t = c9uN.reference.get();
                if (t == null) {
                    C2277BSd c2277BSd = new C2277BSd(22);
                    synchronized (c9uN) {
                        t = c9uN.reference.get();
                        if (t == null) {
                            t = (T) c2277BSd.invoke();
                            c9uN.reference = new SoftReference<>(t);
                        }
                    }
                }
                C9uO c9uO2 = t;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(new C9uF((C9uE) it.next()));
                }
                ConcurrentHashMap<List<C9uF>, HsJ<C9hr<T>>> concurrentHashMap = c9uO2.A00;
                HsJ<C9hr<T>> hsJPutIfAbsent = concurrentHashMap.get(arrayListA0i);
                if (hsJPutIfAbsent == null) {
                    try {
                        objA0s = (C9hr) this.A00.invoke(c9uG, list);
                    } catch (Throwable th) {
                        objA0s = C3cG.A0s(th);
                    }
                    HsJ<C9hr<T>> hsJA0t = C3cG.A0t(objA0s);
                    hsJPutIfAbsent = concurrentHashMap.putIfAbsent(arrayListA0i, hsJA0t);
                    if (hsJPutIfAbsent == null) {
                        hsJPutIfAbsent = hsJA0t;
                    }
                }
                return hsJPutIfAbsent.value;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.A00 = c2280BSg2;
            }
        } : new C9uC<T>(c2280BSg2) { // from class: X.9uJ
            public final ConcurrentHashMap<Class<?>, C9uO<T>> A00 = C60O.A1C();
            public final G0V<C9uG<Object>, List<? extends C9uE>, C9hr<T>> A01;

            /* JADX WARN: Incorrect types in method signature: (LX/9uG<Ljava/lang/Object;>;Ljava/util/List<+LX/9uE;>;)Ljava/lang/Object; */
            @Override // X.C9uC
            public final Object AC5(List list, C9uG c9uG) {
                Object objA0s;
                C9uO<T> c9uOPutIfAbsent;
                C7384Etj.A0Y(c9uG, 0);
                ConcurrentHashMap<Class<?>, C9uO<T>> concurrentHashMap = this.A00;
                Class<?> clsA01 = C9uT.A01(c9uG);
                C9uO<T> c9uO = concurrentHashMap.get(clsA01);
                if (c9uO == null && (c9uOPutIfAbsent = concurrentHashMap.putIfAbsent(clsA01, (c9uO = new C9uO<>()))) != null) {
                    c9uO = c9uOPutIfAbsent;
                }
                C9uO<T> c9uO2 = c9uO;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(new C9uF((C9uE) it.next()));
                }
                ConcurrentHashMap<List<C9uF>, HsJ<C9hr<T>>> concurrentHashMap2 = c9uO2.A00;
                HsJ<C9hr<T>> hsJPutIfAbsent = concurrentHashMap2.get(arrayListA0i);
                if (hsJPutIfAbsent == null) {
                    try {
                        objA0s = (C9hr) this.A01.invoke(c9uG, list);
                    } catch (Throwable th) {
                        objA0s = C3cG.A0s(th);
                    }
                    HsJ<C9hr<T>> hsJA0t = C3cG.A0t(objA0s);
                    hsJPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayListA0i, hsJA0t);
                    if (hsJPutIfAbsent == null) {
                        hsJPutIfAbsent = hsJA0t;
                    }
                }
                return hsJPutIfAbsent.value;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.A01 = c2280BSg2;
            }
        };
    }
}
