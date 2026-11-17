package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Field;

/* renamed from: X.Gm2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9947Gm2 extends AbstractC9915Gl5 {
    public static final long serialVersionUID = 1;
    public final transient Field A00;
    public final C9943Glv _annotated;
    public final boolean _skipNulls;

    public Object readResolve() {
        return new C9947Gm2(this);
    }

    public C9947Gm2(C9947Gm2 c9947Gm2) {
        super(c9947Gm2);
        C9943Glv c9943Glv = c9947Gm2._annotated;
        this._annotated = c9943Glv;
        Field field = c9943Glv.A00;
        if (field == null) {
            throw C60O.A0i("Missing field (broken JDK (de)serialization?)");
        }
        this.A00 = field;
        this._skipNulls = c9947Gm2._skipNulls;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gm2;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/Gqa;)V */
    public C9947Gm2(JsonDeserializer jsonDeserializer, InterfaceC10165Gqa interfaceC10165Gqa, C9947Gm2 c9947Gm2) {
        super(jsonDeserializer, interfaceC10165Gqa, c9947Gm2);
        this._annotated = c9947Gm2._annotated;
        this.A00 = c9947Gm2.A00;
        this._skipNulls = AnonymousClass002.A1Z(interfaceC10165Gqa, C10119Gpk.A01);
    }

    public C9947Gm2(AbstractC9870GjI abstractC9870GjI, C9943Glv c9943Glv, AbstractC9958GmS abstractC9958GmS, AbstractC9986Gn8 abstractC9986Gn8, InterfaceC10076Gox interfaceC10076Gox) {
        super(abstractC9870GjI, abstractC9958GmS, abstractC9986Gn8, interfaceC10076Gox);
        this._annotated = c9943Glv;
        this.A00 = c9943Glv.A00;
        this._skipNulls = AnonymousClass002.A1Z(this._nullProvider, C10119Gpk.A01);
    }

    public C9947Gm2(C10009Gnh c10009Gnh, C9947Gm2 c9947Gm2) {
        super(c10009Gnh, c9947Gm2);
        this._annotated = c9947Gm2._annotated;
        this.A00 = c9947Gm2.A00;
        this._skipNulls = c9947Gm2._skipNulls;
    }
}
