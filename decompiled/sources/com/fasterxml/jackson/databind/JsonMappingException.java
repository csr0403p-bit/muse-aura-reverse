package com.fasterxml.jackson.databind;

import X.AbstractC9855Gj3;
import X.AbstractC9916Gl7;
import X.AnonymousClass006;
import X.BV4;
import X.C10455Hiy;
import X.C60O;
import X.C60Q;
import X.C9516GMj;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes6.dex */
public class JsonMappingException extends DatabindException {
    public static final long serialVersionUID = 3;
    public transient Closeable A00;
    public LinkedList<C10455Hiy> _path;

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.JsonMappingException A00(X.C10455Hiy r3, java.lang.Throwable r4) {
        /*
            boolean r0 = r4 instanceof com.fasterxml.jackson.databind.JsonMappingException
            if (r0 == 0) goto L1c
            com.fasterxml.jackson.databind.JsonMappingException r4 = (com.fasterxml.jackson.databind.JsonMappingException) r4
        L6:
            java.util.LinkedList<X.Hiy> r2 = r4._path
            if (r2 != 0) goto L10
            java.util.LinkedList r2 = X.BV4.A0y()
            r4._path = r2
        L10:
            int r1 = r2.size()
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 >= r0) goto L1b
            r2.addFirst(r3)
        L1b:
            return r4
        L1c:
            java.lang.String r2 = X.AbstractC9855Gj3.A0A(r4)
            if (r2 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L32
        L28:
            java.lang.String r1 = "(was "
            java.lang.String r0 = X.C60Q.A0e(r4)
            java.lang.String r2 = X.C60O.A0r(r1, r0)
        L32:
            boolean r0 = r4 instanceof com.fasterxml.jackson.core.JacksonException
            if (r0 == 0) goto L5e
            r1 = r4
            com.fasterxml.jackson.core.JacksonException r1 = (com.fasterxml.jackson.core.JacksonException) r1
            com.fasterxml.jackson.core.JsonProcessingException r1 = (com.fasterxml.jackson.core.JsonProcessingException) r1
            boolean r0 = r1 instanceof com.fasterxml.jackson.databind.JsonMappingException
            if (r0 == 0) goto L4c
            com.fasterxml.jackson.databind.JsonMappingException r1 = (com.fasterxml.jackson.databind.JsonMappingException) r1
            java.io.Closeable r1 = r1.A00
        L43:
            if (r1 == 0) goto L5e
        L45:
            com.fasterxml.jackson.databind.JsonMappingException r0 = new com.fasterxml.jackson.databind.JsonMappingException
            r0.<init>(r1, r2, r4)
            r4 = r0
            goto L6
        L4c:
            boolean r0 = r1 instanceof com.fasterxml.jackson.core.exc.StreamReadException
            if (r0 == 0) goto L55
            com.fasterxml.jackson.core.exc.StreamReadException r1 = (com.fasterxml.jackson.core.exc.StreamReadException) r1
            X.Gl7 r1 = r1.A00
            goto L43
        L55:
            boolean r0 = r1 instanceof com.fasterxml.jackson.core.JsonGenerationException
            if (r0 == 0) goto L5e
            com.fasterxml.jackson.core.exc.StreamWriteException r1 = (com.fasterxml.jackson.core.exc.StreamWriteException) r1
            X.GlE r1 = r1.A00
            goto L43
        L5e:
            r1 = 0
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.JsonMappingException.A00(X.Hiy, java.lang.Throwable):com.fasterxml.jackson.databind.JsonMappingException");
    }

    public static JsonMappingException A02(Object obj, String str, Throwable th) {
        C10455Hiy c10455Hiy = new C10455Hiy();
        c10455Hiy._index = -1;
        c10455Hiy.A00 = obj;
        if (str == null) {
            throw BV4.A0a("Cannot pass null fieldName");
        }
        c10455Hiy._fieldName = str;
        return A00(c10455Hiy, th);
    }

    public static JsonMappingException A03(Object obj, Throwable th, int i) {
        C10455Hiy c10455Hiy = new C10455Hiy();
        c10455Hiy.A00 = obj;
        c10455Hiy._index = i;
        return A00(c10455Hiy, th);
    }

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this.A00 = closeable;
        if (closeable instanceof AbstractC9916Gl7) {
            this._location = ((AbstractC9916Gl7) closeable).A1J();
        }
    }

    public static JsonMappingException A01(IOException iOException) {
        return new JsonMappingException(null, String.format("Unexpected IOException (of type %s): %s", C60Q.A0e(iOException), AbstractC9855Gj3.A0A(iOException)));
    }

    public static final String A04(JsonMappingException jsonMappingException) {
        String message = super.getMessage();
        LinkedList<C10455Hiy> linkedList = jsonMappingException._path;
        if (linkedList == null) {
            return message;
        }
        StringBuilder sbA0w = message == null ? C60O.A0w() : C60O.A0x(message);
        sbA0w.append(" (through reference chain: ");
        Iterator<C10455Hiy> it = linkedList.iterator();
        while (it.hasNext()) {
            BV4.A1O(sbA0w, it.next());
            if (it.hasNext()) {
                sbA0w.append("->");
            }
        }
        return AnonymousClass006.A0z(sbA0w);
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return A04(this);
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return A04(this);
    }

    public JsonMappingException(Closeable closeable, String str, Throwable th) {
        C9516GMj c9516GMjA1J;
        super(str, th);
        this._location = null;
        this.A00 = closeable;
        if (th instanceof JacksonException) {
            c9516GMjA1J = ((JsonProcessingException) ((JacksonException) th))._location;
        } else if (!(closeable instanceof AbstractC9916Gl7)) {
            return;
        } else {
            c9516GMjA1J = ((AbstractC9916Gl7) closeable).A1J();
        }
        this._location = c9516GMjA1J;
    }
}
