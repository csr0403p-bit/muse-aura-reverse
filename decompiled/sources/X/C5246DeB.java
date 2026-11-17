package X;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.DeB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5246DeB {
    public final C5250DeF A00;
    public final AbstractC5257DeM A01;
    public final Context A02 = C4JM.A00();
    public static final InterfaceC5264DeT A05 = new C5260DeP();
    public static final ConcurrentHashMap<Integer, Object> A04 = C60O.A1C();
    public static final InterfaceC3064Bwk A03 = new InterfaceC3064Bwk() { // from class: X.By6
        @Override // X.InterfaceC3064Bwk
        public final Object get(int i) {
            return BV5.A0Z(i);
        }
    };

    public C5246DeB(AbstractC5257DeM abstractC5257DeM) {
        this.A01 = abstractC5257DeM;
        this.A00 = new C5250DeF(this, abstractC5257DeM);
    }

    public static <T> T A00(int i) {
        return (T) A01(C5249DeE.A00(), i);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(ILX/DeO;)TT; */
    public static Object A01(InterfaceC5259DeO interfaceC5259DeO, int i) {
        Object objPutIfAbsent;
        Object objA00;
        Integer numValueOf = Integer.valueOf(i);
        ConcurrentHashMap<Integer, Object> concurrentHashMap = A04;
        Object obj = concurrentHashMap.get(numValueOf);
        if (obj != null) {
            return obj;
        }
        ConcurrentHashMap<Integer, Object> concurrentHashMap2 = AbstractC7419EvP.A00;
        Object obj2 = concurrentHashMap2.get(numValueOf);
        if (obj2 != null || (objPutIfAbsent = concurrentHashMap2.putIfAbsent(numValueOf, (obj2 = new Object()))) == null) {
            objPutIfAbsent = obj2;
        }
        synchronized (objPutIfAbsent) {
            objA00 = concurrentHashMap.get(numValueOf);
            if (objA00 == null) {
                C5254DeJ c5254DeJAK2 = interfaceC5259DeO.AK2();
                InterfaceC5264DeT interfaceC5264DeT = A05;
                Map<Class, Object> map = c5254DeJAK2.A01.A00;
                Object objAPe = map.get(C5246DeB.class);
                if (objAPe == null) {
                    synchronized (map) {
                        try {
                            objAPe = map.get(C5246DeB.class);
                            if (objAPe == null) {
                                try {
                                    objAPe = interfaceC5264DeT.APe(c5254DeJAK2);
                                    map.put(C5246DeB.class, objAPe);
                                } catch (Exception e) {
                                    throw new IllegalStateException(FGI.A0M("Error creating the scope ", C5246DeB.class.getCanonicalName()), e);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                C5246DeB c5246DeB = (C5246DeB) objAPe;
                C5247DeC c5247DeCAGU = c5246DeB.A01.AGU();
                c5247DeCAGU.A00.add(c5246DeB.A00);
                InterfaceC5259DeO interfaceC5259DeOACT = interfaceC5259DeO.ACT();
                AbstractC5245DeA.A05(interfaceC5259DeOACT);
                try {
                    objA00 = C3bH.A00(i, interfaceC5259DeOACT.AK2(), C4JM.A00());
                    if (objA00 != null) {
                        concurrentHashMap.put(numValueOf, objA00);
                    }
                    AbstractC5245DeA.A04();
                    c5247DeCAGU.A00();
                } catch (Throwable th2) {
                    AbstractC5245DeA.A04();
                    c5247DeCAGU.A00();
                    throw th2;
                }
            }
        }
        return objA00;
    }
}
