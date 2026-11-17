package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC7609F5w;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AnonymousClass002;
import X.C10104GpS;
import X.C10119Gpk;
import X.EnumC9965Gmd;
import X.InterfaceC10165Gqa;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public abstract class ContainerDeserializerBase extends StdDeserializer {
    public final AbstractC9870GjI _containerType;
    public final InterfaceC10165Gqa _nullProvider;
    public final boolean _skipNullValues;
    public final Boolean _unwrapSingle;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase, InterfaceC10165Gqa interfaceC10165Gqa, Boolean bool) {
        AbstractC9870GjI abstractC9870GjI = interfaceC10165Gqa._containerType;
        super(abstractC9870GjI);
        this._containerType = abstractC9870GjI;
        this._nullProvider = containerDeserializerBase;
        this._unwrapSingle = bool;
        this._skipNullValues = AnonymousClass002.A1Z(containerDeserializerBase, C10119Gpk.A01);
    }

    /* JADX WARN: Incorrect return type in method signature: <BOGUS:Ljava/lang/Object;>(LX/Gkk;Ljava/lang/Throwable;Ljava/lang/Object;Ljava/lang/String;)TBOGUS; */
    public static final void A05(AbstractC9904Gkk abstractC9904Gkk, Object obj, String str, Throwable th) {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        if (th instanceof Error) {
            throw th;
        }
        if (abstractC9904Gkk != null) {
            if (!AbstractC7609F5w.A1U(EnumC9965Gmd.A0R._mask, abstractC9904Gkk._featureFlags)) {
                AbstractC9855Gj3.A0F(th);
            }
        }
        if ((th instanceof IOException) && !(th instanceof JsonMappingException)) {
            throw th;
        }
        throw JsonMappingException.A02(obj, str != null ? str : "N/A", th);
    }

    public ContainerDeserializerBase(AbstractC9870GjI abstractC9870GjI, InterfaceC10165Gqa interfaceC10165Gqa, Boolean bool) {
        super(abstractC9870GjI);
        this._containerType = abstractC9870GjI;
        this._unwrapSingle = bool;
        this._nullProvider = interfaceC10165Gqa;
        this._skipNullValues = AnonymousClass002.A1Z(interfaceC10165Gqa, C10119Gpk.A01);
    }
}
