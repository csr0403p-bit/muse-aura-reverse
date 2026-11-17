package X;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.Gn8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9986Gn8 {
    public static Object A02(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9870GjI abstractC9870GjI) {
        Class<?> cls = abstractC9870GjI._class;
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        if (enumC9834GiYA1N == null) {
            return null;
        }
        int iOrdinal = enumC9834GiYA1N.ordinal();
        if (iOrdinal == 7) {
            if (cls.isAssignableFrom(String.class)) {
                return abstractC9916Gl7.A1c();
            }
            return null;
        }
        if (iOrdinal == 8) {
            if (cls.isAssignableFrom(Integer.class)) {
                return Integer.valueOf(abstractC9916Gl7.A1C());
            }
            return null;
        }
        if (iOrdinal == 9) {
            if (cls.isAssignableFrom(Double.class)) {
                return Double.valueOf(abstractC9916Gl7.A17());
            }
            return null;
        }
        if (iOrdinal == 10) {
            if (cls.isAssignableFrom(Boolean.class)) {
                return Boolean.TRUE;
            }
            return null;
        }
        if (iOrdinal == 11 && cls.isAssignableFrom(Boolean.class)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final AbstractC9986Gn8 A03(InterfaceC10017Gnp interfaceC10017Gnp) {
        C9892GkT c9892GkT;
        if (this instanceof C9893GkU) {
            AbstractC9852Giw abstractC9852Giw = (AbstractC9852Giw) this;
            return interfaceC10017Gnp != abstractC9852Giw._property ? new C9893GkU(interfaceC10017Gnp, abstractC9852Giw) : abstractC9852Giw;
        }
        C9892GkT c9892GkT2 = (C9892GkT) this;
        if (c9892GkT2 instanceof C10128Gpt) {
            InterfaceC10017Gnp interfaceC10017Gnp2 = c9892GkT2._property;
            c9892GkT = c9892GkT2;
            if (interfaceC10017Gnp != interfaceC10017Gnp2) {
                return new C10128Gpt(interfaceC10017Gnp, c9892GkT2);
            }
        } else if (c9892GkT2 instanceof C9891GkS) {
            C9891GkS c9891GkS = (C9891GkS) c9892GkT2;
            if (c9891GkS instanceof C9889GkQ) {
                C9889GkQ c9889GkQ = (C9889GkQ) c9891GkS;
                InterfaceC10017Gnp interfaceC10017Gnp3 = c9889GkQ._property;
                c9892GkT = c9889GkQ;
                if (interfaceC10017Gnp != interfaceC10017Gnp3) {
                    return new C9889GkQ(interfaceC10017Gnp, c9889GkQ);
                }
            } else {
                InterfaceC10017Gnp interfaceC10017Gnp4 = c9891GkS._property;
                c9892GkT = c9891GkS;
                if (interfaceC10017Gnp != interfaceC10017Gnp4) {
                    return new C9891GkS(interfaceC10017Gnp, c9891GkS);
                }
            }
        } else {
            InterfaceC10017Gnp interfaceC10017Gnp5 = c9892GkT2._property;
            c9892GkT = c9892GkT2;
            if (interfaceC10017Gnp != interfaceC10017Gnp5) {
                return new C9892GkT(interfaceC10017Gnp, c9892GkT2);
            }
        }
        return c9892GkT;
    }

    public final Object A04(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        if (this instanceof C9893GkU) {
            return C9893GkU.A01(abstractC9916Gl7, abstractC9904Gkk, (C9893GkU) this);
        }
        C9892GkT c9892GkT = (C9892GkT) this;
        return (!(c9892GkT instanceof C9891GkS) || abstractC9916Gl7.A22(EnumC9834GiY.START_ARRAY)) ? C9892GkT.A01(abstractC9916Gl7, abstractC9904Gkk, c9892GkT) : c9892GkT.A06(abstractC9916Gl7, abstractC9904Gkk);
    }

    public final Object A05(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        return this instanceof C9893GkU ? C9893GkU.A01(abstractC9916Gl7, abstractC9904Gkk, (C9893GkU) this) : C9892GkT.A01(abstractC9916Gl7, abstractC9904Gkk, (C9892GkT) this);
    }

    public final Object A06(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws JsonGenerationException {
        String strA27;
        Object objA1Z;
        if (this instanceof C9893GkU) {
            return C9893GkU.A01(abstractC9916Gl7, abstractC9904Gkk, (C9893GkU) this);
        }
        C9892GkT c9892GkT = (C9892GkT) this;
        if (!(c9892GkT instanceof C9891GkS)) {
            return C9892GkT.A01(abstractC9916Gl7, abstractC9904Gkk, c9892GkT);
        }
        C9891GkS c9891GkS = (C9891GkS) c9892GkT;
        if (!(c9891GkS instanceof C9889GkQ)) {
            if (abstractC9916Gl7.A1q() && (objA1Z = abstractC9916Gl7.A1Z()) != null) {
                return c9891GkS.A08(abstractC9904Gkk, objA1Z instanceof String ? (String) objA1Z : String.valueOf(objA1Z)).A0i(abstractC9916Gl7, abstractC9904Gkk);
            }
            EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
            C9913Gl1 c9913Gl1 = null;
            if (enumC9834GiYA1N != EnumC9834GiY.START_OBJECT) {
                if (enumC9834GiYA1N == EnumC9834GiY.FIELD_NAME) {
                }
                return c9891GkS.A0A(abstractC9916Gl7, abstractC9904Gkk, c9913Gl1, c9891GkS._msgForMissingId);
            }
            enumC9834GiYA1N = abstractC9916Gl7.A1P();
            boolean zA09 = abstractC9904Gkk._config.A09(EnumC9951GmA.A02);
            while (enumC9834GiYA1N == EnumC9834GiY.FIELD_NAME) {
                String strA1a = abstractC9916Gl7.A1a();
                abstractC9916Gl7.A1P();
                String str = c9891GkS._typePropertyName;
                if ((strA1a.equals(str) || (zA09 && strA1a.equalsIgnoreCase(str))) && (strA27 = abstractC9916Gl7.A27()) != null) {
                    return c9891GkS.A09(abstractC9916Gl7, abstractC9904Gkk, c9913Gl1, strA27);
                }
                if (c9913Gl1 == null) {
                    c9913Gl1 = new C9913Gl1(abstractC9916Gl7);
                }
                c9913Gl1.A0o(strA1a);
                c9913Gl1.A13(abstractC9916Gl7);
                enumC9834GiYA1N = abstractC9916Gl7.A1P();
            }
            return c9891GkS.A0A(abstractC9916Gl7, abstractC9904Gkk, c9913Gl1, c9891GkS._msgForMissingId);
        }
        C9889GkQ c9889GkQ = (C9889GkQ) c9891GkS;
        EnumC9834GiY enumC9834GiYA1N2 = abstractC9916Gl7.A1N();
        if (enumC9834GiYA1N2 == EnumC9834GiY.START_OBJECT) {
            enumC9834GiYA1N2 = abstractC9916Gl7.A1P();
        } else if (enumC9834GiYA1N2 != EnumC9834GiY.FIELD_NAME) {
            return c9889GkQ.A0A(abstractC9916Gl7, abstractC9904Gkk, null, "Unexpected input");
        }
        if (enumC9834GiYA1N2 == EnumC9834GiY.END_OBJECT) {
            String strA0p = C60O.A0p(C9889GkQ.A00, c9889GkQ.subtypeFingerprints);
            if (strA0p != null) {
                return c9889GkQ.A09(abstractC9916Gl7, abstractC9904Gkk, null, strA0p);
            }
        }
        LinkedList linkedList = new LinkedList(c9889GkQ.subtypeFingerprints.keySet());
        C9913Gl1 c9913Gl12 = new C9913Gl1(abstractC9916Gl7);
        boolean zA092 = abstractC9904Gkk._config.A09(EnumC9951GmA.A02);
        while (enumC9834GiYA1N2 == EnumC9834GiY.FIELD_NAME) {
            String strA1a2 = abstractC9916Gl7.A1a();
            if (zA092) {
                strA1a2 = strA1a2.toLowerCase();
            }
            c9913Gl12.A13(abstractC9916Gl7);
            Number numberA0b = BV4.A0b(strA1a2, c9889GkQ.fieldBitIndex);
            if (numberA0b != null) {
                int iIntValue = numberA0b.intValue();
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (!((BitSet) it.next()).get(iIntValue)) {
                        it.remove();
                    }
                }
                if (linkedList.size() == 1) {
                    return c9889GkQ.A09(abstractC9916Gl7, abstractC9904Gkk, c9913Gl12, C60O.A0p(linkedList.get(0), c9889GkQ.subtypeFingerprints));
                }
            }
            enumC9834GiYA1N2 = abstractC9916Gl7.A1P();
        }
        return c9889GkQ.A0A(abstractC9916Gl7, abstractC9904Gkk, c9913Gl12, String.format("Cannot deduce unique subtype of %s (%d candidates match)", BV5.A1a(AbstractC9855Gj3.A04(c9889GkQ._baseType), linkedList.size())));
    }
}
