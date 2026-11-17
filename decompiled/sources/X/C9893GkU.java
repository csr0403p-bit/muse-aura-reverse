package X;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import java.io.Serializable;

/* renamed from: X.GkU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9893GkU extends AbstractC9852Giw implements Serializable {
    public static final long serialVersionUID = 1;

    public static final Object A01(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, C9893GkU c9893GkU) throws MismatchedInputException, JsonGenerationException {
        EnumC9834GiY enumC9834GiY;
        AbstractC9870GjI abstractC9870GjI;
        String strA0r;
        Object objA1Z;
        if (abstractC9916Gl7.A1q() && (objA1Z = abstractC9916Gl7.A1Z()) != null) {
            return c9893GkU.A08(abstractC9904Gkk, objA1Z instanceof String ? (String) objA1Z : String.valueOf(objA1Z)).A0i(abstractC9916Gl7, abstractC9904Gkk);
        }
        EnumC9834GiY enumC9834GiYA1N = abstractC9916Gl7.A1N();
        EnumC9834GiY enumC9834GiY2 = EnumC9834GiY.START_OBJECT;
        if (enumC9834GiYA1N == enumC9834GiY2) {
            EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
            enumC9834GiY = EnumC9834GiY.FIELD_NAME;
            if (enumC9834GiYA1P != enumC9834GiY) {
                abstractC9870GjI = c9893GkU._baseType;
                strA0r = C60O.A0r("need JSON String that contains type id (for subtype of ", AbstractC9870GjI.A04(abstractC9870GjI));
            }
            abstractC9904Gkk.A0Y(enumC9834GiY, abstractC9870GjI, strA0r, new Object[0]);
            throw F60.createAndThrow();
        }
        if (enumC9834GiYA1N != EnumC9834GiY.FIELD_NAME) {
            AbstractC9870GjI abstractC9870GjI2 = c9893GkU._baseType;
            abstractC9904Gkk.A0Y(enumC9834GiY2, abstractC9870GjI2, FGI.A0M("need JSON Object to contain As.WRAPPER_OBJECT type information for class ", AbstractC9870GjI.A04(abstractC9870GjI2)), new Object[0]);
            throw F60.createAndThrow();
        }
        String strA1c = abstractC9916Gl7.A1c();
        JsonDeserializer<Object> jsonDeserializerA08 = c9893GkU.A08(abstractC9904Gkk, strA1c);
        abstractC9916Gl7.A1P();
        if (c9893GkU._typeIdVisible) {
            abstractC9916Gl7 = AbstractC9852Giw.A00(abstractC9916Gl7, enumC9834GiY2, c9893GkU, strA1c);
        }
        Object objA0i = jsonDeserializerA08.A0i(abstractC9916Gl7, abstractC9904Gkk);
        EnumC9834GiY enumC9834GiYA1P2 = abstractC9916Gl7.A1P();
        enumC9834GiY = EnumC9834GiY.END_OBJECT;
        if (enumC9834GiYA1P2 == enumC9834GiY) {
            return objA0i;
        }
        abstractC9870GjI = c9893GkU._baseType;
        strA0r = "expected closing END_OBJECT after type information and deserialized value";
        abstractC9904Gkk.A0Y(enumC9834GiY, abstractC9870GjI, strA0r, new Object[0]);
        throw F60.createAndThrow();
    }
}
