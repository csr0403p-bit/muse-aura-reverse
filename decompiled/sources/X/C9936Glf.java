package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;

/* renamed from: X.Glf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9936Glf extends AbstractC9915Gl5 {
    public static final long serialVersionUID = 1;
    public final C9959GmU _annotated;
    public final int _creatorIndex;
    public AbstractC9915Gl5 _fallbackSetter;
    public boolean _ignorable;
    public final C10085Gp8 _injectableValue;

    public static final void A01(C9936Glf c9936Glf) {
        if (c9936Glf._fallbackSetter == null) {
            C9959GmU c9959GmU = c9936Glf._annotated;
            String strA08 = c9959GmU == null ? "UNKNOWN TYPE" : AbstractC9855Gj3.A08(c9959GmU._owner.A0C());
            String str = c9936Glf._propName._simpleName;
            C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
            throw new InvalidDefinitionException((AbstractC9916Gl7) null, c9936Glf._type, String.format("No fallback setter/field defined for creator property %s (of %s)", AbstractC7609F5w.A0s(str), strA08));
        }
    }

    @Override // X.AbstractC9915Gl5
    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("[creator property, name ");
        String str = this._propName._simpleName;
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        sbA0x.append(AbstractC7609F5w.A0s(str));
        sbA0x.append("; inject id '");
        sbA0x.append(A0B());
        return AnonymousClass001.A0v("']", sbA0x);
    }

    public C9936Glf(C10009Gnh c10009Gnh, C9936Glf c9936Glf) {
        super(c10009Gnh, c9936Glf);
        this._annotated = c9936Glf._annotated;
        this._injectableValue = c9936Glf._injectableValue;
        this._fallbackSetter = c9936Glf._fallbackSetter;
        this._creatorIndex = c9936Glf._creatorIndex;
        this._ignorable = c9936Glf._ignorable;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Glf;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/Gqa;)V */
    public C9936Glf(JsonDeserializer jsonDeserializer, C9936Glf c9936Glf, InterfaceC10165Gqa interfaceC10165Gqa) {
        super(jsonDeserializer, interfaceC10165Gqa, c9936Glf);
        this._annotated = c9936Glf._annotated;
        this._injectableValue = c9936Glf._injectableValue;
        this._fallbackSetter = c9936Glf._fallbackSetter;
        this._creatorIndex = c9936Glf._creatorIndex;
        this._ignorable = c9936Glf._ignorable;
    }

    public C9936Glf(C10085Gp8 c10085Gp8, AbstractC9870GjI abstractC9870GjI, C10034GoA c10034GoA, C10009Gnh c10009Gnh, C9959GmU c9959GmU, AbstractC9986Gn8 abstractC9986Gn8, InterfaceC10076Gox interfaceC10076Gox, int i) {
        super(abstractC9870GjI, c10034GoA, c10009Gnh, abstractC9986Gn8, interfaceC10076Gox);
        this._annotated = c9959GmU;
        this._creatorIndex = i;
        this._injectableValue = c10085Gp8;
        this._fallbackSetter = null;
    }
}
