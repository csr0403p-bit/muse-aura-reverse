package X;

import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GkQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9889GkQ extends C9891GkS {
    public static final BitSet A00 = new BitSet(0);
    public static final long serialVersionUID = 1;
    public final Map<String, Integer> fieldBitIndex;
    public final Map<BitSet, String> subtypeFingerprints;

    public C9889GkQ(InterfaceC10017Gnp interfaceC10017Gnp, C9889GkQ c9889GkQ) {
        super(interfaceC10017Gnp, c9889GkQ);
        this.fieldBitIndex = c9889GkQ.fieldBitIndex;
        this.subtypeFingerprints = c9889GkQ.subtypeFingerprints;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GjI;LX/Gix;LX/GjI;LX/Gke;Ljava/util/Collection<LX/HjD;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public C9889GkQ(C9898Gke c9898Gke, AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2, InterfaceC9853Gix interfaceC9853Gix, Collection collection) {
        AbstractC9970Gmj abstractC9970GmjA0F;
        AbstractC9910Gks abstractC9910Gks;
        List<C10009Gnh> listA0b;
        super(null, abstractC9870GjI, abstractC9870GjI2, interfaceC9853Gix, null, false, true);
        this.fieldBitIndex = BV4.A0u();
        boolean zA09 = c9898Gke.A09(EnumC9951GmA.A02);
        HashMap mapA0u = BV4.A0u();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            HjD hjD = (HjD) it.next();
            List<AbstractC9958GmS> listA01 = C9914Gl4.A01(((C9935Gle) c9898Gke._base._classIntrospector).A03(c9898Gke, c9898Gke._base._typeFactory.A09(hjD._class), c9898Gke));
            BitSet bitSet = new BitSet(listA01.size() + i);
            for (AbstractC9958GmS abstractC9958GmS : listA01) {
                String strA0J = abstractC9958GmS.A0J();
                strA0J = zA09 ? strA0J.toLowerCase() : strA0J;
                Number numberA0b = BV4.A0b(strA0J, this.fieldBitIndex);
                if (numberA0b == null) {
                    numberA0b = Integer.valueOf(i);
                    this.fieldBitIndex.put(strA0J, numberA0b);
                    i++;
                }
                if (abstractC9958GmS instanceof C9978Gmt) {
                    C9978Gmt c9978Gmt = (C9978Gmt) abstractC9958GmS;
                    abstractC9970GmjA0F = c9978Gmt.A04;
                    if (abstractC9970GmjA0F != null) {
                        abstractC9910Gks = c9978Gmt.A01;
                        listA0b = abstractC9910Gks.A0b(abstractC9970GmjA0F);
                        if (listA0b == null) {
                        }
                    }
                    listA0b = Collections.EMPTY_LIST;
                } else {
                    C9908Gko c9908Gko = (C9908Gko) abstractC9958GmS;
                    abstractC9970GmjA0F = c9908Gko.A0F();
                    if (abstractC9970GmjA0F != null) {
                        abstractC9910Gks = c9908Gko.A04;
                        listA0b = abstractC9910Gks.A0b(abstractC9970GmjA0F);
                        if (listA0b == null) {
                        }
                    }
                    listA0b = Collections.EMPTY_LIST;
                }
                Iterator<C10009Gnh> it2 = listA0b.iterator();
                while (it2.hasNext()) {
                    String lowerCase = it2.next()._simpleName;
                    lowerCase = zA09 ? lowerCase.toLowerCase() : lowerCase;
                    if (!this.fieldBitIndex.containsKey(lowerCase)) {
                        this.fieldBitIndex.put(lowerCase, numberA0b);
                    }
                }
                bitSet.set(numberA0b.intValue());
            }
            Object objPut = mapA0u.put(bitSet, hjD._class.getName());
            if (objPut != null) {
                throw BV5.A0W("Subtypes %s and %s have the same signature and cannot be uniquely deduced.", AbstractC7609F5w.A1b(hjD._class, objPut));
            }
        }
        this.subtypeFingerprints = mapA0u;
    }
}
