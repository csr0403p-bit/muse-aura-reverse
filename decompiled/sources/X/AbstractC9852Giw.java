package X;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Giw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9852Giw extends AbstractC9986Gn8 implements Serializable {
    public static final long serialVersionUID = 1;
    public final AbstractC9870GjI _baseType;
    public final AbstractC9870GjI _defaultImpl;
    public JsonDeserializer<Object> _defaultImplDeserializer;
    public final Map<String, JsonDeserializer<Object>> _deserializers;
    public final InterfaceC9853Gix _idResolver;
    public final InterfaceC10017Gnp _property;
    public final boolean _typeIdVisible;
    public final String _typePropertyName;

    public final JsonDeserializer<Object> A07(AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9870GjI abstractC9870GjI = this._defaultImpl;
        if (abstractC9870GjI == null) {
            EnumC9965Gmd enumC9965Gmd = EnumC9965Gmd.A07;
            if (AbstractC7609F5w.A1U(enumC9965Gmd._mask, abstractC9904Gkk._featureFlags)) {
                return null;
            }
        } else if (!AbstractC9855Gj3.A0I(abstractC9870GjI._class)) {
            if (this._defaultImplDeserializer == null) {
                synchronized (abstractC9870GjI) {
                    if (this._defaultImplDeserializer == null) {
                        this._defaultImplDeserializer = abstractC9904Gkk.A0G(this._property, this._defaultImpl);
                    }
                }
            }
            return this._defaultImplDeserializer;
        }
        return NullifyingDeserializer.A00;
    }

    public final JsonDeserializer<Object> A08(AbstractC9904Gkk abstractC9904Gkk, String str) throws InvalidTypeIdException {
        JsonDeserializer<Object> jsonDeserializerA0G = this._deserializers.get(str);
        if (jsonDeserializerA0G == null) {
            AbstractC9870GjI abstractC9870GjIAha = this._idResolver.Aha(abstractC9904Gkk, str);
            if (abstractC9870GjIAha == null) {
                jsonDeserializerA0G = A07(abstractC9904Gkk);
                if (jsonDeserializerA0G == null) {
                    String strAEn = this._idResolver.AEn();
                    String strA0M = strAEn == null ? "type ids are not statically known" : FGI.A0M("known type ids = ", strAEn);
                    InterfaceC10017Gnp interfaceC10017Gnp = this._property;
                    if (interfaceC10017Gnp != null) {
                        strA0M = String.format("%s (for POJO property '%s')", strA0M, interfaceC10017Gnp.getName());
                    }
                    AbstractC9870GjI abstractC9870GjI = this._baseType;
                    if (abstractC9904Gkk._config._problemHandlers != null) {
                        throw BV4.A0a("handleUnknownTypeId");
                    }
                    if (AbstractC7609F5w.A1U(EnumC9965Gmd.A07._mask, abstractC9904Gkk._featureFlags)) {
                        throw abstractC9904Gkk.A0A(abstractC9870GjI, str, strA0M);
                    }
                    return NullifyingDeserializer.A00;
                }
            } else {
                AbstractC9870GjI abstractC9870GjIA06 = this._baseType;
                if (abstractC9870GjIA06 != null && abstractC9870GjIA06.getClass() == abstractC9870GjIAha.getClass() && !abstractC9870GjIAha.A0N()) {
                    try {
                        Class<?> cls = abstractC9870GjIAha._class;
                        if (abstractC9870GjIA06._class != cls) {
                            abstractC9870GjIA06 = abstractC9904Gkk._config._base._typeFactory.A06(abstractC9870GjIA06, cls, false);
                        }
                        abstractC9870GjIAha = abstractC9870GjIA06;
                    } catch (IllegalArgumentException e) {
                        throw abstractC9904Gkk.A0A(this._baseType, str, e.getMessage());
                    }
                }
                jsonDeserializerA0G = abstractC9904Gkk.A0G(this._property, abstractC9870GjIAha);
            }
            this._deserializers.put(str, jsonDeserializerA0G);
        }
        return jsonDeserializerA0G;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("[");
        BV6.A18(getClass(), sbA0x);
        sbA0x.append("; base-type:");
        sbA0x.append(this._baseType);
        sbA0x.append("; id-resolver: ");
        sbA0x.append(this._idResolver);
        return BV5.A0o(sbA0x);
    }

    public AbstractC9852Giw(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9852Giw abstractC9852Giw) {
        this._baseType = abstractC9852Giw._baseType;
        this._idResolver = abstractC9852Giw._idResolver;
        this._typePropertyName = abstractC9852Giw._typePropertyName;
        this._typeIdVisible = abstractC9852Giw._typeIdVisible;
        this._deserializers = abstractC9852Giw._deserializers;
        this._defaultImpl = abstractC9852Giw._defaultImpl;
        this._defaultImplDeserializer = abstractC9852Giw._defaultImplDeserializer;
        this._property = interfaceC10017Gnp;
    }

    public static AbstractC9916Gl7 A00(AbstractC9916Gl7 abstractC9916Gl7, EnumC9834GiY enumC9834GiY, AbstractC9852Giw abstractC9852Giw, String str) throws JsonGenerationException {
        if (!abstractC9916Gl7.A22(enumC9834GiY)) {
            return abstractC9916Gl7;
        }
        C9913Gl1 c9913Gl1 = new C9913Gl1(abstractC9916Gl7);
        c9913Gl1.A0T();
        c9913Gl1.A0o(abstractC9852Giw._typePropertyName);
        c9913Gl1.A0s(str);
        abstractC9916Gl7.A1i();
        C10014Gnm c10014GnmA0A = C10014Gnm.A0A(c9913Gl1.A10(abstractC9916Gl7), abstractC9916Gl7);
        c10014GnmA0A.A1P();
        return c10014GnmA0A;
    }

    public AbstractC9852Giw(AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2, InterfaceC9853Gix interfaceC9853Gix, String str, boolean z) {
        this._baseType = abstractC9870GjI;
        this._idResolver = interfaceC9853Gix;
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        this._typePropertyName = str == null ? "" : str;
        this._typeIdVisible = z;
        this._deserializers = new ConcurrentHashMap(16, 0.75f, 2);
        this._defaultImpl = abstractC9870GjI2;
        this._property = null;
    }
}
