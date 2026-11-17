package com.fasterxml.jackson.databind.deser;

import X.BV4;
import X.C9966Gme;
import X.FGI;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class UnresolvedForwardReference extends JsonMappingException {
    public static final long serialVersionUID = 1;
    public C9966Gme _roid;
    public List _unresolvedIds;

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonMappingException, com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public final String getMessage() {
        String strA04 = JsonMappingException.A04(this);
        List list = this._unresolvedIds;
        if (list == null) {
            return strA04;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return FGI.A0E(strA04, '.');
        }
        it.next();
        throw BV4.A0a("toString");
    }
}
