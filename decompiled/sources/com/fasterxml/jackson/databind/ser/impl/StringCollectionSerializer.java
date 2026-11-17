package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC9842Gii;
import X.AbstractC9919GlE;
import X.AbstractC9996GnP;
import X.AnonymousClass005;
import X.C10091GpF;
import X.EnumC9834GiY;
import X.F60;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.util.Collection;
import java.util.Iterator;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class StringCollectionSerializer extends StaticListSerializerBase<Collection<String>> {
    public static final StringCollectionSerializer A00 = new StringCollectionSerializer();

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Collection<Ljava/lang/String;>;LX/GlE;LX/Gii;)V */
    public static final void A00(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, Collection collection) throws Throwable {
        int i = 0;
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (strA0j == null) {
                    abstractC9842Gii.A0U(abstractC9919GlE);
                } else {
                    abstractC9919GlE.A0s(strA0j);
                }
                i++;
            }
        } catch (Exception e) {
            StdSerializer.A04(abstractC9842Gii, collection, e, i);
            throw F60.createAndThrow();
        }
    }

    public StringCollectionSerializer() {
        super(Collection.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0B(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP, Object obj) throws Throwable {
        Collection collection = (Collection) obj;
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.START_ARRAY, abstractC9996GnP, collection);
        abstractC9919GlE.A0i(collection);
        A00(abstractC9919GlE, abstractC9842Gii, collection);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }
}
