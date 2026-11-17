package com.fasterxml.jackson.databind;

import X.BV4;
import X.C10455Hiy;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.LinkedList;

/* loaded from: classes6.dex */
public abstract class DatabindException extends JsonProcessingException {
    public static final long serialVersionUID = 3;

    public final void A06(Object obj, String str) {
        JsonMappingException jsonMappingException = (JsonMappingException) this;
        C10455Hiy c10455Hiy = new C10455Hiy();
        c10455Hiy._index = -1;
        c10455Hiy.A00 = obj;
        if (str == null) {
            throw BV4.A0a("Cannot pass null fieldName");
        }
        c10455Hiy._fieldName = str;
        LinkedList<C10455Hiy> linkedListA0y = jsonMappingException._path;
        if (linkedListA0y == null) {
            linkedListA0y = BV4.A0y();
            jsonMappingException._path = linkedListA0y;
        }
        if (linkedListA0y.size() < 1000) {
            linkedListA0y.addFirst(c10455Hiy);
        }
    }
}
