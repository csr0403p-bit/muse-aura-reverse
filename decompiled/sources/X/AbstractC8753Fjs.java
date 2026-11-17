package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fjs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8753Fjs {
    public static C6823Eab A00 = C6823Eab.A00("k");

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/EaH;LX/Eap;FLX/HoR<TT;>;Z)Ljava/util/List<LX/FjQ<TT;>;>; */
    public static ArrayList A00(C6837Eap c6837Eap, InterfaceC10514HoR interfaceC10514HoR, AbstractC6806EaH abstractC6806EaH, float f, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (abstractC6806EaH.A0C() == C79.A0T) {
            c6837Eap.A02("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC6806EaH.A0G();
        while (abstractC6806EaH.A0L()) {
            if (abstractC6806EaH.A0B(A00) != 0) {
                abstractC6806EaH.A0K();
            } else if (abstractC6806EaH.A0C() == C79.A00) {
                abstractC6806EaH.A0F();
                if (abstractC6806EaH.A0C() == C79.A0W) {
                    C6823Eab c6823Eab = AbstractC8751Fjq.A00;
                    arrayList.add(new C8725FjQ(interfaceC10514HoR.AXc(abstractC6806EaH, f)));
                } else {
                    while (abstractC6806EaH.A0L()) {
                        arrayList.add(AbstractC8751Fjq.A01(c6837Eap, interfaceC10514HoR, abstractC6806EaH, f, true, z));
                    }
                }
                abstractC6806EaH.A0H();
            } else {
                C6823Eab c6823Eab2 = AbstractC8751Fjq.A00;
                arrayList.add(new C8725FjQ(interfaceC10514HoR.AXc(abstractC6806EaH, f)));
            }
        }
        abstractC6806EaH.A0I();
        A01(arrayList);
        return arrayList;
    }

    public static <T> void A01(List<? extends C8725FjQ<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C8725FjQ<T> c8725FjQ = list.get(i2);
            i2++;
            C8725FjQ<T> c8725FjQ2 = list.get(i2);
            c8725FjQ.A06 = Float.valueOf(c8725FjQ2.A0A);
            if (c8725FjQ.A07 == null && c8725FjQ2.A0E != null) {
                c8725FjQ.A07 = c8725FjQ2.A0E;
                if (c8725FjQ instanceof C8726FjR) {
                    ((C8726FjR) c8725FjQ).A03();
                }
            }
        }
        C8725FjQ<T> c8725FjQ3 = list.get(i);
        if ((c8725FjQ3.A0E == null || c8725FjQ3.A07 == null) && list.size() > 1) {
            list.remove(c8725FjQ3);
        }
    }
}
