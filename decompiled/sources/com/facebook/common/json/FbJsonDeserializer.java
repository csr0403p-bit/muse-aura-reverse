package com.facebook.common.json;

import X.AbstractC9779GgG;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV4;
import X.C7384Etj;
import X.EnumC9834GiY;
import X.F60;
import X.FGI;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.base.Throwables;
import java.io.IOException;
import java.lang.reflect.Constructor;

/* loaded from: classes6.dex */
public class FbJsonDeserializer extends JsonDeserializer<Object> {
    public Class<?> A00;

    public FbJsonField A0p(String str) {
        return null;
    }

    public final Object A0q() throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> declaredConstructor = this.A00.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(null);
        } catch (NoSuchMethodException e) {
            throw BV4.A0d(FGI.A0M(this.A00.getName(), " missing default constructor"), e);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IOException {
        try {
            Object objA0q = A0q();
            while (true) {
                C7384Etj.A0Y(abstractC9916Gl7, 0);
                EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                if (enumC9834GiYA1P == null) {
                    throw new IOException("Unexpected end of json input");
                }
                if (enumC9834GiYA1P == EnumC9834GiY.END_OBJECT) {
                    return objA0q;
                }
                if (abstractC9916Gl7.A1O() == EnumC9834GiY.FIELD_NAME) {
                    String strA1b = abstractC9916Gl7.A1b();
                    abstractC9916Gl7.A1P();
                    FbJsonField fbJsonFieldA0p = A0p(strA1b);
                    if (fbJsonFieldA0p != null) {
                        fbJsonFieldA0p.deserialize(objA0q, abstractC9916Gl7, abstractC9904Gkk);
                    } else {
                        abstractC9916Gl7.A1j();
                    }
                }
            }
        } catch (Exception e) {
            Throwables.propagateIfPossible(e, IOException.class);
            AbstractC9779GgG.A00(abstractC9916Gl7, this.A00, e);
            throw F60.createAndThrow();
        }
    }
}
