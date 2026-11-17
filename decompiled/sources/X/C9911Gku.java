package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

@JacksonStdImpl
/* renamed from: X.Gku, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9911Gku extends AbstractC10181Gqr implements Serializable {
    public static final Object A05 = EnumC10065Gom.NON_EMPTY;
    public static final long serialVersionUID = 1;
    public transient AbstractC10109Gpa A00;
    public transient Field A01;
    public transient Method A02;
    public transient HashMap<Object, Object> A03;
    public final transient InterfaceC10076Gox A04;
    public final AbstractC9870GjI _cfgSerializationType;
    public final AbstractC9870GjI _declaredType;
    public final Class<?>[] _includeInViews;
    public final AbstractC9970Gmj _member;
    public final C10026Go0 _name;
    public AbstractC9870GjI _nonTrivialBaseType;
    public JsonSerializer<Object> _nullSerializer;
    public JsonSerializer<Object> _serializer;
    public final boolean _suppressNulls;
    public final Object _suppressableValue;
    public AbstractC9996GnP _typeSerializer;
    public final C10009Gnh _wrapperName;

    public C9911Gku() {
        super(C10034GoA.A03);
        this._member = null;
        this.A04 = null;
        this._name = null;
        this._wrapperName = null;
        this._includeInViews = null;
        this._declaredType = null;
        this._serializer = null;
        this.A00 = null;
        this._typeSerializer = null;
        this._cfgSerializationType = null;
        this.A02 = null;
        this.A01 = null;
        this._suppressNulls = false;
        this._suppressableValue = null;
        this._nullSerializer = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.Gii] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.Gku, X.Gnp] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.Gku] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.Gku, X.Gm7, X.Gnp] */
    public static JsonSerializer A00(AbstractC9842Gii abstractC9842Gii, C9911Gku c9911Gku, Object obj) {
        Class<?> cls;
        AbstractC10109Gpa abstractC10109Gpa;
        JsonSerializer jsonSerializerA0M;
        AbstractC10109Gpa abstractC10109GpaA01;
        JsonSerializer<Object> jsonSerializerA00 = c9911Gku._serializer;
        if (jsonSerializerA00 != null || (jsonSerializerA00 = (abstractC10109Gpa = c9911Gku.A00).A00((cls = obj.getClass()))) != null) {
            return jsonSerializerA00;
        }
        if (!(c9911Gku instanceof C9949Gm7)) {
            AbstractC9870GjI abstractC9870GjI = c9911Gku._nonTrivialBaseType;
            if (abstractC9870GjI != null) {
                AbstractC9870GjI abstractC9870GjIA0G = abstractC9842Gii.A0G(abstractC9870GjI, cls);
                jsonSerializerA0M = abstractC9842Gii.A0J(c9911Gku, abstractC9870GjIA0G);
                abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA0M, abstractC9870GjIA0G._class);
            } else {
                jsonSerializerA0M = abstractC9842Gii.A0M(c9911Gku, cls);
                abstractC10109GpaA01 = abstractC10109Gpa.A01(jsonSerializerA0M, cls);
            }
            if (abstractC10109Gpa != abstractC10109GpaA01) {
            }
            return jsonSerializerA0M;
        }
        c9911Gku = (C9949Gm7) c9911Gku;
        AbstractC9870GjI abstractC9870GjI2 = c9911Gku._nonTrivialBaseType;
        JsonSerializer jsonSerializerA0K = abstractC9870GjI2 != null ? abstractC9842Gii.A0K(c9911Gku, abstractC9842Gii.A0G(abstractC9870GjI2, cls)) : abstractC9842Gii.A0N(c9911Gku, cls);
        AbstractC10187Gqy c10094GpI = c9911Gku._nameTransformer;
        if (jsonSerializerA0K.A0D() && (jsonSerializerA0K instanceof UnwrappingBeanSerializer)) {
            c10094GpI = new C10094GpI(c10094GpI, ((UnwrappingBeanSerializer) jsonSerializerA0K)._nameTransformer);
        }
        jsonSerializerA0M = jsonSerializerA0K.A0A(c10094GpI);
        abstractC10109GpaA01 = c9911Gku.A00.A01(jsonSerializerA0M, cls);
        c9911Gku.A00 = abstractC10109GpaA01;
        return jsonSerializerA0M;
    }

    public static boolean A01(JsonSerializer jsonSerializer, AbstractC9842Gii abstractC9842Gii, Object obj, Object obj2) {
        return A05 == obj ? jsonSerializer.A0E(abstractC9842Gii, obj2) : obj.equals(obj2);
    }

    public final C9911Gku A02(AbstractC10187Gqy abstractC10187Gqy) {
        if (this instanceof C9949Gm7) {
            C9949Gm7 c9949Gm7 = (C9949Gm7) this;
            String strA00 = abstractC10187Gqy.A00(c9949Gm7._name._value);
            C10094GpI c10094GpI = new C10094GpI(abstractC10187Gqy, c9949Gm7._nameTransformer);
            C10026Go0 c10026Go0 = new C10026Go0(strA00);
            return c9949Gm7 instanceof C10068Gop ? new C10068Gop(c10026Go0, c9949Gm7, c10094GpI) : new C9949Gm7(c10026Go0, c9949Gm7, c10094GpI);
        }
        if (this instanceof C10015Gnn) {
            C10015Gnn c10015Gnn = (C10015Gnn) this;
            return new C10015Gnn(c10015Gnn._delegate.A02(abstractC10187Gqy), c10015Gnn._view);
        }
        if (this instanceof C10004Gnc) {
            C10004Gnc c10004Gnc = (C10004Gnc) this;
            return new C10004Gnc(c10004Gnc._delegate.A02(abstractC10187Gqy), c10004Gnc._views);
        }
        C10026Go0 c10026Go02 = this._name;
        String strA002 = abstractC10187Gqy.A00(c10026Go02._value);
        if (strA002.equals(c10026Go02.toString())) {
            return this;
        }
        C10009Gnh c10009GnhA00 = C10009Gnh.A00(strA002);
        return this instanceof C10083Gp6 ? new C10083Gp6(c10009GnhA00, this) : new C9911Gku(c10009GnhA00, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (r1 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.AbstractC9919GlE r5, X.AbstractC9842Gii r6, java.lang.Object r7) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9911Gku.A03(X.GlE, X.Gii, java.lang.Object):void");
    }

    public void A04(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, Object obj) throws IOException {
        Method method = this.A02;
        Object objInvoke = method == null ? this.A01.get(obj) : method.invoke(obj, null);
        if (objInvoke == null) {
            Object obj2 = this._suppressableValue;
            if ((obj2 == null || !abstractC9842Gii.A0Z(obj2)) && this._nullSerializer != null) {
                abstractC9919GlE.A0c(this._name);
                this._nullSerializer.A0C(abstractC9919GlE, abstractC9842Gii, null);
                return;
            }
            return;
        }
        JsonSerializer jsonSerializerA00 = A00(abstractC9842Gii, this, objInvoke);
        Object obj3 = this._suppressableValue;
        if (obj3 == null || !A01(jsonSerializerA00, abstractC9842Gii, obj3, objInvoke)) {
            if (objInvoke == obj && A07(abstractC9919GlE, jsonSerializerA00, abstractC9842Gii)) {
                return;
            }
            abstractC9919GlE.A0c(this._name);
            JsonSerializer.A07(abstractC9919GlE, jsonSerializerA00, abstractC9842Gii, this._typeSerializer, objInvoke);
        }
    }

    public final void A05(JsonSerializer<Object> jsonSerializer) {
        C9911Gku c9911Gku;
        if (this instanceof C10015Gnn) {
            c9911Gku = ((C10015Gnn) this)._delegate;
        } else {
            if (!(this instanceof C10004Gnc)) {
                JsonSerializer<Object> jsonSerializer2 = this._nullSerializer;
                if (jsonSerializer2 != null && jsonSerializer2 != jsonSerializer) {
                    throw BV5.A0W("Cannot override _nullSerializer: had a %s, trying to set to %s", new Object[]{AbstractC9855Gj3.A07(jsonSerializer2), AbstractC9855Gj3.A07(jsonSerializer)});
                }
                this._nullSerializer = jsonSerializer;
                return;
            }
            c9911Gku = ((C10004Gnc) this)._delegate;
        }
        c9911Gku.A05(jsonSerializer);
    }

    public void A06(JsonSerializer<Object> jsonSerializer) {
        JsonSerializer<Object> jsonSerializer2 = this._serializer;
        if (jsonSerializer2 != null && jsonSerializer2 != jsonSerializer) {
            throw BV5.A0W("Cannot override _serializer: had a %s, trying to set to %s", new Object[]{AbstractC9855Gj3.A07(jsonSerializer2), AbstractC9855Gj3.A07(jsonSerializer)});
        }
        this._serializer = jsonSerializer;
    }

    public final boolean A07(AbstractC9919GlE abstractC9919GlE, JsonSerializer jsonSerializer, AbstractC9842Gii abstractC9842Gii) throws IOException {
        boolean z = jsonSerializer instanceof BeanSerializerBase;
        if (z && AnonymousClass002.A1X(((BeanSerializerBase) jsonSerializer)._objectIdWriter)) {
            return false;
        }
        EnumC9975Gmp enumC9975Gmp = EnumC9975Gmp.FAIL_ON_SELF_REFERENCES;
        C9963Gma c9963Gma = abstractC9842Gii._config;
        if (c9963Gma.A0E(enumC9975Gmp)) {
            if (!z) {
                return false;
            }
            abstractC9842Gii.A0E(this._declaredType, "Direct self-reference leading to cycle");
            throw F60.createAndThrow();
        }
        if (!c9963Gma.A0E(EnumC9975Gmp.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        }
        if (this._nullSerializer == null) {
            return true;
        }
        if (((AbstractC10020Gns) (abstractC9919GlE instanceof C9913Gl1 ? ((C9913Gl1) abstractC9919GlE).A03 : ((AbstractC9932GlT) abstractC9919GlE).A02)).A02 != 1) {
            abstractC9919GlE.A0c(this._name);
        }
        this._nullSerializer.A0C(abstractC9919GlE, abstractC9842Gii, null);
        return true;
    }

    @Override // X.InterfaceC10017Gnp
    public final C10009Gnh AFv() {
        return new C10009Gnh(this._name._value, null);
    }

    @Override // X.InterfaceC10017Gnp
    public final AbstractC9970Gmj AHe() {
        return this._member;
    }

    @Override // X.InterfaceC10017Gnp
    public final AbstractC9870GjI AM9() {
        return this._declaredType;
    }

    @Override // X.InterfaceC10017Gnp
    public final String getName() {
        return this._name._value;
    }

    public Object readResolve() {
        AbstractC9970Gmj abstractC9970Gmj = this._member;
        if (abstractC9970Gmj instanceof C9943Glv) {
            this.A02 = null;
            this.A01 = (Field) abstractC9970Gmj.A0F();
        } else if (abstractC9970Gmj instanceof C9934Glc) {
            this.A02 = (Method) abstractC9970Gmj.A0F();
            this.A01 = null;
        }
        if (this._serializer == null) {
            this.A00 = C10110Gpb.A00;
        }
        return this;
    }

    public final String toString() {
        String name;
        StringBuilder sbA0p = BV4.A0p(40);
        sbA0p.append("property '");
        sbA0p.append(this._name._value);
        sbA0p.append("' (");
        Method method = this.A02;
        if (method != null) {
            sbA0p.append("via method ");
            BV6.A18(method.getDeclaringClass(), sbA0p);
            sbA0p.append("#");
            name = this.A02.getName();
        } else {
            Field field = this.A01;
            if (field != null) {
                sbA0p.append("field \"");
                BV6.A18(field.getDeclaringClass(), sbA0p);
                sbA0p.append("#");
                name = this.A01.getName();
            } else {
                name = "virtual";
            }
        }
        sbA0p.append(name);
        JsonSerializer<Object> jsonSerializer = this._serializer;
        sbA0p.append(jsonSerializer == null ? ", no static serializer" : FGI.A0M(", static serializer of type ", C60Q.A0e(jsonSerializer)));
        return AnonymousClass006.A0z(sbA0p);
    }

    public C9911Gku(C10009Gnh c10009Gnh, C9911Gku c9911Gku) {
        super(c9911Gku);
        this._name = new C10026Go0(c10009Gnh._simpleName);
        this._wrapperName = c9911Gku._wrapperName;
        this.A04 = c9911Gku.A04;
        this._declaredType = c9911Gku._declaredType;
        this._member = c9911Gku._member;
        this.A02 = c9911Gku.A02;
        this.A01 = c9911Gku.A01;
        this._serializer = c9911Gku._serializer;
        this._nullSerializer = c9911Gku._nullSerializer;
        HashMap<Object, Object> map = c9911Gku.A03;
        if (map != null) {
            this.A03 = BV4.A0w(map);
        }
        this._cfgSerializationType = c9911Gku._cfgSerializationType;
        this.A00 = c9911Gku.A00;
        this._suppressNulls = c9911Gku._suppressNulls;
        this._suppressableValue = c9911Gku._suppressableValue;
        this._includeInViews = c9911Gku._includeInViews;
        this._typeSerializer = c9911Gku._typeSerializer;
        this._nonTrivialBaseType = c9911Gku._nonTrivialBaseType;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GmS;LX/Gmj;LX/Gox;LX/GjI;Lcom/fasterxml/jackson/databind/JsonSerializer<*>;LX/GnP;LX/GjI;ZLjava/lang/Object;[Ljava/lang/Class<*>;)V */
    public C9911Gku(AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2, JsonSerializer jsonSerializer, AbstractC9970Gmj abstractC9970Gmj, AbstractC9958GmS abstractC9958GmS, AbstractC9996GnP abstractC9996GnP, InterfaceC10076Gox interfaceC10076Gox, Object obj, Class[] clsArr, boolean z) {
        C10110Gpb c10110Gpb;
        super(abstractC9958GmS.A0D());
        this._member = abstractC9970Gmj;
        this.A04 = interfaceC10076Gox;
        Gn4 gn4 = C10026Go0.A01;
        this._name = new C10026Go0(abstractC9958GmS.A0J());
        if (!(abstractC9958GmS instanceof C9978Gmt)) {
            abstractC9958GmS.A0F();
        }
        this._wrapperName = null;
        this._declaredType = abstractC9870GjI;
        this._serializer = jsonSerializer;
        if (jsonSerializer == null) {
            c10110Gpb = C10110Gpb.A00;
        } else {
            c10110Gpb = null;
        }
        this.A00 = c10110Gpb;
        this._typeSerializer = abstractC9996GnP;
        this._cfgSerializationType = abstractC9870GjI2;
        if (abstractC9970Gmj instanceof C9943Glv) {
            this.A02 = null;
            this.A01 = (Field) abstractC9970Gmj.A0F();
        } else if (abstractC9970Gmj instanceof C9934Glc) {
            this.A02 = (Method) abstractC9970Gmj.A0F();
            this.A01 = null;
        } else {
            this.A02 = null;
            this.A01 = null;
        }
        this._suppressNulls = z;
        this._suppressableValue = obj;
        this._nullSerializer = null;
        this._includeInViews = clsArr;
    }

    public C9911Gku(C10026Go0 c10026Go0, C9911Gku c9911Gku) {
        super(c9911Gku);
        this._name = c10026Go0;
        this._wrapperName = c9911Gku._wrapperName;
        this._member = c9911Gku._member;
        this.A04 = c9911Gku.A04;
        this._declaredType = c9911Gku._declaredType;
        this.A02 = c9911Gku.A02;
        this.A01 = c9911Gku.A01;
        this._serializer = c9911Gku._serializer;
        this._nullSerializer = c9911Gku._nullSerializer;
        HashMap<Object, Object> map = c9911Gku.A03;
        if (map != null) {
            this.A03 = BV4.A0w(map);
        }
        this._cfgSerializationType = c9911Gku._cfgSerializationType;
        this.A00 = c9911Gku.A00;
        this._suppressNulls = c9911Gku._suppressNulls;
        this._suppressableValue = c9911Gku._suppressableValue;
        this._includeInViews = c9911Gku._includeInViews;
        this._typeSerializer = c9911Gku._typeSerializer;
        this._nonTrivialBaseType = c9911Gku._nonTrivialBaseType;
    }
}
