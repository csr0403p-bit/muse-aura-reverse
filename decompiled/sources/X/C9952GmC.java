package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.lang.reflect.Method;

/* renamed from: X.GmC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9952GmC extends AbstractC9915Gl5 {
    public static final long serialVersionUID = 1;
    public final transient Method A00;
    public final C9934Glc _annotated;
    public final boolean _skipNulls;

    public Object readResolve() {
        return new C9952GmC(this, this._annotated.A00);
    }

    public C9952GmC(C10009Gnh c10009Gnh, C9952GmC c9952GmC) {
        super(c10009Gnh, c9952GmC);
        this._annotated = c9952GmC._annotated;
        this.A00 = c9952GmC.A00;
        this._skipNulls = c9952GmC._skipNulls;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GmC;Lcom/fasterxml/jackson/databind/JsonDeserializer<*>;LX/Gqa;)V */
    public C9952GmC(JsonDeserializer jsonDeserializer, InterfaceC10165Gqa interfaceC10165Gqa, C9952GmC c9952GmC) {
        super(jsonDeserializer, interfaceC10165Gqa, c9952GmC);
        this._annotated = c9952GmC._annotated;
        this.A00 = c9952GmC.A00;
        this._skipNulls = AnonymousClass002.A1Z(interfaceC10165Gqa, C10119Gpk.A01);
    }

    public C9952GmC(AbstractC9870GjI abstractC9870GjI, C9934Glc c9934Glc, AbstractC9958GmS abstractC9958GmS, AbstractC9986Gn8 abstractC9986Gn8, InterfaceC10076Gox interfaceC10076Gox) {
        super(abstractC9870GjI, abstractC9958GmS, abstractC9986Gn8, interfaceC10076Gox);
        this._annotated = c9934Glc;
        this.A00 = c9934Glc.A00;
        this._skipNulls = AnonymousClass002.A1Z(this._nullProvider, C10119Gpk.A01);
    }

    public C9952GmC(C9952GmC c9952GmC, Method method) {
        super(c9952GmC);
        this._annotated = c9952GmC._annotated;
        this.A00 = method;
        this._skipNulls = c9952GmC._skipNulls;
    }
}
