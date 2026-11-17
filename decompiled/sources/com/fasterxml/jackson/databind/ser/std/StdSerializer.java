package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC7609F5w;
import X.AbstractC9842Gii;
import X.AbstractC9849Git;
import X.AbstractC9850Giu;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9910Gks;
import X.AbstractC9970Gmj;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV4;
import X.C10082Gp3;
import X.C3cG;
import X.C9888GkO;
import X.C9894GkV;
import X.C9963Gma;
import X.F60;
import X.InterfaceC10017Gnp;
import X.InterfaceC9833GiW;
import X.InterfaceC9854Giz;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class StdSerializer extends JsonSerializer implements Serializable {
    public static final Object A00 = C3cG.A0T();
    public static final long serialVersionUID = 1;
    public final Class<T> _handledType;

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;Ljava/lang/Class<*>;)LX/GkV; */
    public static final C9894GkV A02(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9842Gii abstractC9842Gii, Class cls) {
        C9963Gma c9963Gma = abstractC9842Gii._config;
        return interfaceC10017Gnp != null ? interfaceC10017Gnp.ABX(c9963Gma, cls) : c9963Gma.A00(cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.AbstractC9842Gii r2, java.lang.Object r3, java.lang.String r4, java.lang.Throwable r5) throws java.lang.Throwable {
        /*
        L0:
            boolean r0 = r5 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto Lf
            java.lang.Throwable r5 = r5.getCause()
            goto L0
        Lf:
            X.GpS[] r0 = X.AbstractC9855Gj3.A01
            boolean r0 = r5 instanceof java.lang.Error
            if (r0 != 0) goto L2d
            if (r2 == 0) goto L22
            X.Gmp r1 = X.EnumC9975Gmp.WRAP_EXCEPTIONS
            X.Gma r0 = r2._config
            boolean r0 = r0.A0E(r1)
            r1 = 0
            if (r0 == 0) goto L23
        L22:
            r1 = 1
        L23:
            boolean r0 = r5 instanceof java.io.IOException
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L2d
            boolean r0 = r5 instanceof com.fasterxml.jackson.core.JacksonException
            if (r0 != 0) goto L33
        L2d:
            throw r5
        L2e:
            if (r1 != 0) goto L33
            X.AbstractC9855Gj3.A0F(r5)
        L33:
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.A02(r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdSerializer.A03(X.Gii, java.lang.Object, java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.AbstractC9842Gii r2, java.lang.Object r3, java.lang.Throwable r4, int r5) throws java.lang.Throwable {
        /*
        L0:
            boolean r0 = r4 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto Lf
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto Lf
            java.lang.Throwable r4 = r4.getCause()
            goto L0
        Lf:
            X.GpS[] r0 = X.AbstractC9855Gj3.A01
            boolean r0 = r4 instanceof java.lang.Error
            if (r0 != 0) goto L2d
            if (r2 == 0) goto L22
            X.Gmp r1 = X.EnumC9975Gmp.WRAP_EXCEPTIONS
            X.Gma r0 = r2._config
            boolean r0 = r0.A0E(r1)
            r1 = 0
            if (r0 == 0) goto L23
        L22:
            r1 = 1
        L23:
            boolean r0 = r4 instanceof java.io.IOException
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L2d
            boolean r0 = r4 instanceof com.fasterxml.jackson.core.JacksonException
            if (r0 != 0) goto L33
        L2d:
            throw r4
        L2e:
            if (r1 != 0) goto L33
            X.AbstractC9855Gj3.A0F(r4)
        L33:
            com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.A03(r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdSerializer.A04(X.Gii, java.lang.Object, java.lang.Throwable, int):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/Gnp;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;)Lcom/fasterxml/jackson/databind/JsonSerializer<*>; */
    public final JsonSerializer A0F(InterfaceC10017Gnp interfaceC10017Gnp, JsonSerializer jsonSerializer, AbstractC9842Gii abstractC9842Gii) {
        Object obj;
        AbstractC9970Gmj abstractC9970GmjAHe;
        JsonSerialize jsonSerializeA03;
        Class<? extends InterfaceC9854Giz> clsContentConverter;
        Object obj2 = A00;
        C10082Gp3 c10082Gp3 = (C10082Gp3) abstractC9842Gii.A00;
        Map<Object, Object> map = c10082Gp3.A00;
        if (map == null || (obj = map.get(obj2)) == null) {
            obj = c10082Gp3._shared.get(obj2);
        } else if (obj == C10082Gp3.A02) {
            obj = null;
        }
        Map identityHashMap = (Map) obj;
        if (identityHashMap == null) {
            identityHashMap = new IdentityHashMap();
            C10082Gp3 c10082Gp32 = (C10082Gp3) abstractC9842Gii.A00;
            Map<Object, Object> map2 = c10082Gp32.A00;
            if (map2 == null) {
                HashMap mapA0u = BV4.A0u();
                mapA0u.put(obj2, identityHashMap);
                c10082Gp32 = new C10082Gp3(c10082Gp32._shared, mapA0u);
            } else {
                map2.put(obj2, identityHashMap);
            }
            abstractC9842Gii.A00 = c10082Gp32;
        } else if (identityHashMap.get(interfaceC10017Gnp) != null) {
            return jsonSerializer;
        }
        identityHashMap.put(interfaceC10017Gnp, Boolean.TRUE);
        try {
            AbstractC9910Gks abstractC9910GksA03 = AbstractC9849Git.A03(abstractC9842Gii);
            if (abstractC9910GksA03 != null && interfaceC10017Gnp != null && (abstractC9970GmjAHe = interfaceC10017Gnp.AHe()) != null && (abstractC9910GksA03 instanceof C9888GkO) && (jsonSerializeA03 = AbstractC9910Gks.A03(abstractC9970GmjAHe)) != null && (clsContentConverter = jsonSerializeA03.contentConverter()) != null && !AbstractC9855Gj3.A0I(clsContentConverter) && clsContentConverter != AbstractC9850Giu.class) {
                InterfaceC9854Giz interfaceC9854GizA0C = abstractC9842Gii.A0C(clsContentConverter);
                AbstractC9870GjI abstractC9870GjIAIN = interfaceC9854GizA0C.AIN(abstractC9842Gii.A0B());
                if (jsonSerializer == null && !AnonymousClass002.A1Z(abstractC9870GjIAIN._class, Object.class)) {
                    jsonSerializer = abstractC9842Gii.A0P(abstractC9870GjIAIN);
                }
                jsonSerializer = new StdDelegatingSerializer(abstractC9870GjIAIN, jsonSerializer, interfaceC9854GizA0C);
            } else if (jsonSerializer == null) {
                return jsonSerializer;
            }
            return AbstractC7609F5w.A0b(interfaceC10017Gnp, jsonSerializer, abstractC9842Gii, jsonSerializer instanceof InterfaceC9833GiW ? 1 : 0);
        } finally {
            identityHashMap.remove(interfaceC10017Gnp);
        }
    }

    public final void A0G(AbstractC9842Gii abstractC9842Gii, Object obj) throws InvalidDefinitionException {
        int i = C9963Gma.A00;
        abstractC9842Gii.A0F(AnonymousClass001.A0v("'; no FilterProvider configured", C3cG.A0f(obj, "Cannot resolve PropertyFilter with id '")), this._handledType);
        throw F60.createAndThrow();
    }

    public StdSerializer(AbstractC9870GjI abstractC9870GjI) {
        this._handledType = abstractC9870GjI._class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StdSerializer(Class<?> cls, boolean z) {
        this._handledType = cls;
    }

    public StdSerializer(StdSerializer<?> stdSerializer) {
        this._handledType = stdSerializer._handledType;
    }

    public StdSerializer(Class<T> cls) {
        this._handledType = cls;
    }
}
