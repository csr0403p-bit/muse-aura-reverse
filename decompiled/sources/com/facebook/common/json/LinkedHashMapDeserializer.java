package com.facebook.common.json;

import X.AbstractC7610F5x;
import X.AbstractC9794GhC;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.C3cG;
import X.C9796GhE;
import X.C9899Gkf;
import X.C9981Gmx;
import X.EnumC9834GiY;
import X.FGI;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public class LinkedHashMapDeserializer<K, V> extends JsonDeserializer<LinkedHashMap<K, V>> {
    public JsonDeserializer<K> A00;
    public JsonDeserializer<V> A01;
    public boolean A02 = false;
    public final AbstractC9870GjI A03;
    public final Class A04;

    public LinkedHashMapDeserializer(AbstractC9870GjI abstractC9870GjI) {
        AbstractC9870GjI abstractC9870GjIA0B = abstractC9870GjI.A0B(0);
        abstractC9870GjIA0B.getClass();
        Class<?> cls = abstractC9870GjIA0B._class;
        this.A04 = cls;
        Preconditions.checkArgument(cls == String.class || Enum.class.isAssignableFrom(cls), "Map keys must be a String or an enum.");
        this.A03 = abstractC9870GjI.A0B(1);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IOException {
        EnumC9834GiY enumC9834GiYA1O;
        EnumC9834GiY enumC9834GiY;
        V vA0i;
        AbstractC9794GhC abstractC9794GhCA1Q = abstractC9916Gl7.A1Q();
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        if (!abstractC9916Gl7.A1u() || (enumC9834GiYA1O = abstractC9916Gl7.A1O()) == (enumC9834GiY = EnumC9834GiY.VALUE_NULL)) {
            abstractC9916Gl7.A1j();
        } else {
            if (enumC9834GiYA1O != EnumC9834GiY.START_OBJECT) {
                throw AbstractC7610F5x.A0g(abstractC9916Gl7, "Failed to deserialize to a map - missing start_object token");
            }
            if (!this.A02) {
                Class cls = this.A04;
                if (cls != String.class) {
                    abstractC9794GhCA1Q.getClass();
                    this.A00 = ((C9796GhE) abstractC9794GhCA1Q).A0A(abstractC9904Gkk, cls);
                }
                this.A02 = true;
            }
            if (this.A01 == null) {
                abstractC9794GhCA1Q.getClass();
                this.A01 = ((C9796GhE) abstractC9794GhCA1Q).A09(abstractC9904Gkk, this.A03);
            }
            while (true) {
                EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                if (enumC9834GiYA1P == null) {
                    throw new IOException("Unexpected end of json input");
                }
                if (enumC9834GiYA1P == EnumC9834GiY.END_OBJECT) {
                    break;
                }
                if (abstractC9916Gl7.A1O() == EnumC9834GiY.FIELD_NAME) {
                    K kA0i = (K) abstractC9916Gl7.A1b();
                    abstractC9916Gl7.A1P();
                    EnumC9834GiY enumC9834GiYA1O2 = abstractC9916Gl7.A1O();
                    JsonDeserializer<V> jsonDeserializer = this.A01;
                    if (enumC9834GiYA1O2 == enumC9834GiY) {
                        vA0i = null;
                    } else {
                        vA0i = jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
                        if (vA0i == null) {
                        }
                    }
                    if (this.A00 != null) {
                        abstractC9794GhCA1Q.getClass();
                        C9981Gmx c9981GmxA01 = ((C9899Gkf) abstractC9794GhCA1Q)._jsonFactory.A01(FGI.A0U("\"", kA0i, "\""));
                        c9981GmxA01.A1P();
                        kA0i = this.A00.A0i(c9981GmxA01, abstractC9904Gkk);
                    }
                    linkedHashMapA0j.put(kA0i, vA0i);
                }
            }
        }
        return linkedHashMapA0j;
    }
}
