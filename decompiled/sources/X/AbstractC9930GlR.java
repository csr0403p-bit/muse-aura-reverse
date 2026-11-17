package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

/* renamed from: X.GlR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9930GlR implements Serializable {
    public static final long serialVersionUID = 1;
    public final AbstractC9877Gjl _keyDeserializer;
    public final InterfaceC10017Gnp _property;
    public final AbstractC9970Gmj _setter;
    public final boolean _setterIsField;
    public final AbstractC9870GjI _type;
    public JsonDeserializer<Object> _valueDeserializer;
    public final AbstractC9986Gn8 _valueTypeDeserializer;

    public final int A01() {
        if (this instanceof C9985Gn7) {
            return ((C9985Gn7) this)._parameterIndex;
        }
        if (this instanceof C9969Gmh) {
            return ((C9969Gmh) this)._parameterIndex;
        }
        return -1;
    }

    public final Object A02(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        if ((this instanceof C9969Gmh) || (this instanceof C9954GmE)) {
            return this._valueDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
        }
        if (AbstractC7607F5u.A1W(abstractC9916Gl7)) {
            return this._valueDeserializer.AIA(abstractC9904Gkk);
        }
        AbstractC9986Gn8 abstractC9986Gn8 = this._valueTypeDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        return abstractC9986Gn8 != null ? jsonDeserializer.A0j(abstractC9916Gl7, abstractC9904Gkk, abstractC9986Gn8) : jsonDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
    }

    public final void A03(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Object obj, String str) {
        if (this instanceof C9954GmE) {
            C9954GmE c9954GmE = (C9954GmE) this;
            C9954GmE.A00((AbstractC9804GhQ) c9954GmE._valueDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk), c9954GmE, obj, str);
            return;
        }
        try {
            AbstractC9877Gjl abstractC9877Gjl = this._keyDeserializer;
            A04(obj, abstractC9877Gjl == null ? str : abstractC9877Gjl.A00(abstractC9904Gkk, str), A02(abstractC9916Gl7, abstractC9904Gkk));
        } catch (UnresolvedForwardReference e) {
            if (this._valueDeserializer.A0d() == null) {
                throw new JsonMappingException(abstractC9916Gl7, "Unresolved forward reference but no identity info.", e);
            }
            e._roid.A00(new C10021Gnt(this, e, obj, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A04(Object obj, Object obj2, Object obj3) {
        Map map;
        try {
            if (this instanceof C10030Go5) {
                ((C9934Glc) this._setter).A00.invoke(obj, obj2, obj3);
                return;
            }
            if (this instanceof C9985Gn7) {
                map = (Map) obj;
            } else {
                if (!(this instanceof C9956GmP)) {
                    if (!(this instanceof C9969Gmh)) {
                        C9954GmE.A00((AbstractC9804GhQ) obj3, (C9954GmE) this, obj, (String) obj2);
                        return;
                    }
                    C9809Ghf c9809Ghf = (C9809Ghf) obj;
                    Object obj4 = obj3;
                    if (obj3 == null) {
                        obj4 = Gh1.A00;
                    }
                    c9809Ghf._children.put(obj2, obj4);
                    return;
                }
                C9956GmP c9956GmP = (C9956GmP) this;
                C9943Glv c9943Glv = (C9943Glv) c9956GmP._setter;
                map = (Map) c9943Glv.A0D(obj);
                if (map == null) {
                    AbstractC9944Glx abstractC9944Glx = c9956GmP._valueInstantiator;
                    if (abstractC9944Glx == null) {
                        throw new JsonMappingException(null, String.format("Cannot create an instance of %s for use as \"any-setter\" '%s'", AbstractC9855Gj3.A06(c9956GmP._type._class), c9956GmP._property.getName()));
                    }
                    map = (Map) abstractC9944Glx.A0D(null);
                    c9943Glv.A0G(obj, map);
                }
            }
            map.put(obj2, obj3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            e = e2;
            if (!(e instanceof IllegalArgumentException)) {
                C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
                if (e instanceof IOException) {
                    throw e;
                }
                AbstractC9855Gj3.A0F(e);
                while (e.getCause() != null) {
                    e = e.getCause();
                }
                throw new JsonMappingException(null, AbstractC9855Gj3.A0A(e), e);
            }
            String strA07 = AbstractC9855Gj3.A07(obj3);
            StringBuilder sbA0f = C3cG.A0f(obj2, "Problem deserializing \"any-property\" '");
            sbA0f.append(FGI.A0U("' of class ", AbstractC9855Gj3.A06(this._setter.A0C()), " (expected type: "));
            sbA0f.append(this._type);
            sbA0f.append("; actual type: ");
            sbA0f.append(strA07);
            sbA0f.append(")");
            String strA0A = AbstractC9855Gj3.A0A(e);
            if (strA0A != null) {
                sbA0f.append(", problem: ");
            } else {
                strA0A = " (no error message provided)";
            }
            throw new JsonMappingException(null, AnonymousClass001.A0v(strA0A, sbA0f), e);
        }
    }

    public Object readResolve() {
        AbstractC9970Gmj abstractC9970Gmj = this._setter;
        if (abstractC9970Gmj == null || abstractC9970Gmj.A0B() == null) {
            throw C60O.A0i("Missing method/field (broken JDK (de)serialization?)");
        }
        return this;
    }

    public final String toString() {
        return FGI.A0U("[any property on class ", AbstractC9855Gj3.A06(this._setter.A0C()), "]");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gnp;LX/Gmj;LX/GjI;LX/Gjl;Lcom/fasterxml/jackson/databind/JsonDeserializer<Ljava/lang/Object;>;LX/Gn8;)V */
    public AbstractC9930GlR(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9870GjI abstractC9870GjI, JsonDeserializer jsonDeserializer, AbstractC9877Gjl abstractC9877Gjl, AbstractC9970Gmj abstractC9970Gmj, AbstractC9986Gn8 abstractC9986Gn8) {
        this._property = interfaceC10017Gnp;
        this._setter = abstractC9970Gmj;
        this._type = abstractC9870GjI;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = abstractC9986Gn8;
        this._keyDeserializer = abstractC9877Gjl;
        this._setterIsField = abstractC9970Gmj instanceof C9943Glv;
    }
}
