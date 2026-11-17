package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9915Gl5;
import X.AbstractC9944Glx;
import X.AnonymousClass002;
import X.C9931GlS;
import X.C9934Glc;
import X.InterfaceC10017Gnp;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;

/* loaded from: classes6.dex */
public class FactoryBasedEnumDeserializer extends StdDeserializer<Object> implements InterfaceC9830GiT {
    public static final long serialVersionUID = 1;
    public volatile transient C9931GlS A00;
    public final AbstractC9915Gl5[] _creatorProps;
    public final JsonDeserializer<?> _deser;
    public final C9934Glc _factory;
    public final boolean _hasArgs;
    public final AbstractC9870GjI _inputType;
    public final AbstractC9944Glx _valueInstantiator;

    /* JADX WARN: Multi-variable type inference failed */
    public FactoryBasedEnumDeserializer(FactoryBasedEnumDeserializer factoryBasedEnumDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(jsonDeserializer._valueClass);
        this._inputType = jsonDeserializer._inputType;
        this._factory = jsonDeserializer._factory;
        this._hasArgs = jsonDeserializer._hasArgs;
        this._valueInstantiator = jsonDeserializer._valueInstantiator;
        this._creatorProps = jsonDeserializer._creatorProps;
        this._deser = factoryBasedEnumDeserializer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        if ((r4 instanceof com.fasterxml.jackson.core.JacksonException) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0i(X.AbstractC9916Gl7 r7, X.AbstractC9904Gkk r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer.A0i(X.Gl7, X.Gkk):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9870GjI abstractC9870GjI;
        return (this._deser == null && (abstractC9870GjI = this._inputType) != null && this._creatorProps == null) ? new FactoryBasedEnumDeserializer((FactoryBasedEnumDeserializer) abstractC9904Gkk.A0G(interfaceC10017Gnp, abstractC9870GjI), (JsonDeserializer<?>) this) : this;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Glc;)V */
    public FactoryBasedEnumDeserializer(C9934Glc c9934Glc, Class cls) {
        super((Class<?>) cls);
        this._factory = c9934Glc;
        this._hasArgs = false;
        this._inputType = null;
        this._deser = null;
        this._valueInstantiator = null;
        this._creatorProps = null;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Glc;LX/GjI;LX/Glx;[LX/Gl5;)V */
    public FactoryBasedEnumDeserializer(AbstractC9870GjI abstractC9870GjI, AbstractC9944Glx abstractC9944Glx, C9934Glc c9934Glc, Class cls, AbstractC9915Gl5[] abstractC9915Gl5Arr) {
        super((Class<?>) cls);
        this._factory = c9934Glc;
        this._hasArgs = true;
        Class<?> cls2 = abstractC9870GjI._class;
        this._inputType = (AnonymousClass002.A1Z(cls2, String.class) || cls2 == CharSequence.class) ? null : abstractC9870GjI;
        this._deser = null;
        this._valueInstantiator = abstractC9944Glx;
        this._creatorProps = abstractC9915Gl5Arr;
    }
}
