package com.facebook.common.json;

import X.AbstractC7610F5x;
import X.AbstractC9794GhC;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.C9796GhE;
import X.C9860Gj8;
import X.EnumC9834GiY;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes6.dex */
public class ImmutableListDeserializer<T> extends JsonDeserializer<ImmutableList<T>> {
    public JsonDeserializer<T> A00;
    public final AbstractC9870GjI A01;
    public final Class<T> A02;

    public ImmutableListDeserializer(AbstractC9870GjI abstractC9870GjI) {
        this.A02 = null;
        AbstractC9870GjI abstractC9870GjIA0B = abstractC9870GjI.A0B(0);
        this.A01 = abstractC9870GjIA0B == null ? C9860Gj8.A05 : abstractC9870GjIA0B;
        this.A00 = null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IOException {
        EnumC9834GiY enumC9834GiYA1O;
        AbstractC9794GhC abstractC9794GhCA1Q = abstractC9916Gl7.A1Q();
        if (!abstractC9916Gl7.A1u() || (enumC9834GiYA1O = abstractC9916Gl7.A1O()) == EnumC9834GiY.VALUE_NULL) {
            abstractC9916Gl7.A1j();
            return ImmutableList.of();
        }
        if (enumC9834GiYA1O != EnumC9834GiY.START_ARRAY) {
            throw AbstractC7610F5x.A0g(abstractC9916Gl7, "Failed to deserialize to a list - missing start_array token");
        }
        if (this.A00 == null) {
            abstractC9794GhCA1Q.getClass();
            C9796GhE c9796GhE = (C9796GhE) abstractC9794GhCA1Q;
            Type type = this.A02;
            if (type == null) {
                type = this.A01;
            }
            this.A00 = type instanceof Class ? c9796GhE.A0A(abstractC9904Gkk, (Class) type) : c9796GhE.A09(abstractC9904Gkk, c9796GhE._typeFactory.A09(type));
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        while (true) {
            EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
            if (enumC9834GiYA1P == null) {
                throw new IOException("Unexpected end of json input");
            }
            if (enumC9834GiYA1P == EnumC9834GiY.END_ARRAY) {
                return builder.build();
            }
            try {
                T tA0i = this.A00.A0i(abstractC9916Gl7, abstractC9904Gkk);
                if (tA0i != null) {
                    builder.add((ImmutableList.Builder) tA0i);
                }
            } catch (InvalidFormatException unused) {
            }
        }
    }

    public ImmutableListDeserializer(Class<T> cls) {
        this.A02 = cls;
        this.A01 = null;
        this.A00 = null;
    }
}
