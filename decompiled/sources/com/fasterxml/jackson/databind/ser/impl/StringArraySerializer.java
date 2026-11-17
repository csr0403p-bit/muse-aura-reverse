package com.fasterxml.jackson.databind.ser.impl;

import X.AbstractC9842Gii;
import X.AbstractC9870GjI;
import X.AbstractC9919GlE;
import X.C9860Gj8;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.ArraySerializerBase;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class StringArraySerializer extends ArraySerializerBase<String[]> implements InterfaceC9833GiW {
    public final JsonSerializer<Object> _elementSerializer;
    public static final AbstractC9870GjI A01 = C9860Gj8.A08.A0C(String.class);
    public static final StringArraySerializer A00 = new StringArraySerializer();

    public static final void A00(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, StringArraySerializer stringArraySerializer, String[] strArr) {
        int length = strArr.length;
        if (length != 0) {
            JsonSerializer<Object> jsonSerializer = stringArraySerializer._elementSerializer;
            int i = 0;
            if (jsonSerializer != null) {
                do {
                    String str = strArr[i];
                    if (str == null) {
                        abstractC9842Gii.A0U(abstractC9919GlE);
                    } else {
                        jsonSerializer.A0C(abstractC9919GlE, abstractC9842Gii, str);
                    }
                    i++;
                } while (i < length);
                return;
            }
            do {
                String str2 = strArr[i];
                if (str2 == null) {
                    abstractC9919GlE.A0R();
                } else {
                    abstractC9919GlE.A0s(str2);
                }
                i++;
            } while (i < length);
        }
    }

    public StringArraySerializer() {
        super(String[].class);
        this._elementSerializer = null;
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/ser/impl/StringArraySerializer;LX/Gnp;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;Ljava/lang/Boolean;)V */
    public StringArraySerializer(InterfaceC10017Gnp interfaceC10017Gnp, JsonSerializer jsonSerializer, StringArraySerializer stringArraySerializer, Boolean bool) {
        super(interfaceC10017Gnp, stringArraySerializer, bool);
        this._elementSerializer = jsonSerializer;
    }
}
