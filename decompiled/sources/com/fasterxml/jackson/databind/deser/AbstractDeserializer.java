package com.fasterxml.jackson.databind.deser;

import X.AbstractC7608F5v;
import X.AbstractC9848Gir;
import X.AbstractC9849Git;
import X.AbstractC9855Gj3;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9910Gks;
import X.AbstractC9915Gl5;
import X.AbstractC9916Gl7;
import X.AbstractC9970Gmj;
import X.BV4;
import X.C10003Gna;
import X.C10009Gnh;
import X.C10035GoB;
import X.C10099GpN;
import X.C9860Gj8;
import X.F60;
import X.Gr5;
import X.InterfaceC10017Gnp;
import X.InterfaceC9830GiT;
import X.InterfaceC9851Giv;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes6.dex */
public class AbstractDeserializer extends JsonDeserializer<Object> implements InterfaceC9830GiT, Serializable {
    public static final long serialVersionUID = 1;
    public transient Map<String, AbstractC9915Gl5> A00;
    public final boolean _acceptBoolean;
    public final boolean _acceptDouble;
    public final boolean _acceptInt;
    public final boolean _acceptString;
    public final Map<String, AbstractC9915Gl5> _backRefProperties;
    public final AbstractC9870GjI _baseType;
    public final C10035GoB _objectIdReader;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws InvalidDefinitionException {
        Class<?> cls = this._baseType._class;
        if (abstractC9904Gkk._config._problemHandlers != null) {
            throw BV4.A0a("handleMissingInstantiator");
        }
        abstractC9904Gkk.A0F(String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", AbstractC9855Gj3.A06(cls), "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information"), cls);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractDeserializer(X.C9914Gl4 r5) {
        /*
            r4 = this;
            r4.<init>()
            X.GjI r1 = r5.A05
            r4._baseType = r1
            r0 = 0
            r4._objectIdReader = r0
            r4._backRefProperties = r0
            java.lang.Class<?> r3 = r1._class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r3.isAssignableFrom(r0)
            r4._acceptString = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r2 = 0
            if (r3 == r0) goto L24
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r1 = r3.isAssignableFrom(r0)
            r0 = 0
            if (r1 == 0) goto L25
        L24:
            r0 = 1
        L25:
            r4._acceptBoolean = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r3 == r0) goto L34
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r1 = r3.isAssignableFrom(r0)
            r0 = 0
            if (r1 == 0) goto L35
        L34:
            r0 = 1
        L35:
            r4._acceptInt = r0
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r3 == r0) goto L43
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto L44
        L43:
            r2 = 1
        L44:
            r4._acceptDouble = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.<init>(X.Gl4):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        C10035GoB c10035GoB;
        AbstractC9970Gmj abstractC9970GmjAHe;
        C10003Gna c10003GnaA0K;
        AbstractC9870GjI abstractC9870GjI;
        AbstractC9848Gir abstractC9848GirA08;
        AbstractC9910Gks abstractC9910GksA02 = AbstractC9849Git.A02(abstractC9904Gkk);
        AbstractC9915Gl5 abstractC9915Gl5 = null;
        if (interfaceC10017Gnp != null && abstractC9910GksA02 != null && (abstractC9970GmjAHe = interfaceC10017Gnp.AHe()) != null && (c10003GnaA0K = abstractC9910GksA02.A0K(abstractC9970GmjAHe)) != null) {
            InterfaceC9851Giv interfaceC9851Giv = (InterfaceC9851Giv) AbstractC7608F5v.A0h(abstractC9904Gkk.A09(), c10003GnaA0K.A02);
            C10003Gna c10003GnaA0L = abstractC9910GksA02.A0L(abstractC9970GmjAHe, c10003GnaA0K);
            Class<? extends AbstractC9848Gir<?>> cls = c10003GnaA0L.A01;
            if (cls == Gr5.class) {
                C10009Gnh c10009Gnh = c10003GnaA0L.A00;
                Map<String, AbstractC9915Gl5> map = this.A00;
                if (map == null || (abstractC9915Gl5 = map.get(c10009Gnh._simpleName)) == null) {
                    AbstractC9870GjI abstractC9870GjI2 = this._baseType;
                    AbstractC9849Git.A07(abstractC9904Gkk, abstractC9870GjI2, "Invalid Object Id definition for %s: cannot find property with name %s", new Object[]{AbstractC9855Gj3.A06(abstractC9870GjI2._class), c10009Gnh == null ? "[null]" : AbstractC9855Gj3.A09(c10009Gnh._simpleName)});
                    throw F60.createAndThrow();
                }
                abstractC9870GjI = abstractC9915Gl5._type;
                abstractC9848GirA08 = new C10099GpN(c10003GnaA0L.A03);
            } else {
                interfaceC9851Giv = (InterfaceC9851Giv) AbstractC7608F5v.A0h(abstractC9904Gkk.A09(), c10003GnaA0L.A02);
                abstractC9870GjI = C9860Gj8.A05(cls == null ? null : AbstractC7608F5v.A0R(abstractC9904Gkk._config, cls), AbstractC9848Gir.class)[0];
                abstractC9848GirA08 = abstractC9904Gkk.A08(c10003GnaA0L);
            }
            c10035GoB = new C10035GoB(abstractC9848GirA08, interfaceC9851Giv, abstractC9870GjI, abstractC9904Gkk.A0J(abstractC9870GjI), c10003GnaA0L.A00, abstractC9915Gl5);
        } else {
            if (this.A00 == null) {
                return this;
            }
            c10035GoB = this._objectIdReader;
        }
        return new AbstractDeserializer(this, c10035GoB);
    }

    public AbstractDeserializer(AbstractDeserializer abstractDeserializer, C10035GoB c10035GoB) {
        this._baseType = abstractDeserializer._baseType;
        this._backRefProperties = abstractDeserializer._backRefProperties;
        this._acceptString = abstractDeserializer._acceptString;
        this._acceptBoolean = abstractDeserializer._acceptBoolean;
        this._acceptInt = abstractDeserializer._acceptInt;
        this._acceptDouble = abstractDeserializer._acceptDouble;
        this._objectIdReader = c10035GoB;
        this.A00 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractDeserializer(X.C9912Gkv r5, X.C9914Gl4 r6, java.util.Map<java.lang.String, X.AbstractC9915Gl5> r7, java.util.Map<java.lang.String, X.AbstractC9915Gl5> r8) {
        /*
            r4 = this;
            r4.<init>()
            X.GjI r1 = r6.A05
            r4._baseType = r1
            X.GoB r0 = r5.A03
            r4._objectIdReader = r0
            r4._backRefProperties = r7
            r4.A00 = r8
            java.lang.Class<?> r3 = r1._class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r3.isAssignableFrom(r0)
            r4._acceptString = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r2 = 0
            if (r3 == r0) goto L27
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r1 = r3.isAssignableFrom(r0)
            r0 = 0
            if (r1 == 0) goto L28
        L27:
            r0 = 1
        L28:
            r4._acceptBoolean = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r3 == r0) goto L37
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r1 = r3.isAssignableFrom(r0)
            r0 = 0
            if (r1 == 0) goto L38
        L37:
            r0 = 1
        L38:
            r4._acceptInt = r0
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r3 == r0) goto L46
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto L47
        L46:
            r2 = 1
        L47:
            r4._acceptDouble = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.<init>(X.Gkv, X.Gl4, java.util.Map, java.util.Map):void");
    }
}
