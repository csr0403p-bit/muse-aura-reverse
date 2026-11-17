package X;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Gip, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9846Gip extends AbstractC9842Gii implements Serializable {
    public static final long serialVersionUID = 1;
    public transient AbstractC9919GlE A00;
    public transient ArrayList<AbstractC9848Gir<?>> A01;
    public transient Map<Object, C10010Gni> A02;

    public static IOException A00(AbstractC9919GlE abstractC9919GlE, Exception exc) {
        if (exc instanceof IOException) {
            return (IOException) exc;
        }
        String strA0A = AbstractC9855Gj3.A0A(exc);
        if (strA0A == null) {
            strA0A = FGI.A0U("[no message for ", C60Q.A0e(exc), "]");
        }
        return new JsonMappingException(abstractC9919GlE, strA0A, exc);
    }

    public final void A0a(AbstractC9919GlE abstractC9919GlE, Object obj) throws IOException {
        this.A00 = abstractC9919GlE;
        Class<?> cls = obj.getClass();
        JsonSerializer jsonSerializerA0O = A0O(null, cls, true);
        C9963Gma c9963Gma = this._config;
        C10009Gnh c10009Gnh = c9963Gma._rootName;
        if (c10009Gnh == null) {
            if (c9963Gma.A0E(EnumC9975Gmp.WRAP_ROOT_VALUE)) {
                A01(abstractC9919GlE, jsonSerializerA0O, c9963Gma._rootNames.A00(c9963Gma, cls), this, obj);
                return;
            }
        } else if (!c10009Gnh.A02()) {
            A01(abstractC9919GlE, jsonSerializerA0O, c10009Gnh, this, obj);
            return;
        }
        try {
            jsonSerializerA0O.A0C(abstractC9919GlE, this, obj);
        } catch (Exception e) {
            throw A00(abstractC9919GlE, e);
        }
    }

    public static final void A01(AbstractC9919GlE abstractC9919GlE, JsonSerializer jsonSerializer, C10009Gnh c10009Gnh, AbstractC9846Gip abstractC9846Gip, Object obj) throws IOException {
        try {
            abstractC9919GlE.A0T();
            C9963Gma c9963Gma = abstractC9846Gip._config;
            InterfaceC10180Gqq c10026Go0 = c10009Gnh._encodedSimple;
            if (c10026Go0 == null) {
                String str = c10009Gnh._simpleName;
                if (c9963Gma == null) {
                    c10026Go0 = new C10026Go0(str);
                } else {
                    C9894GkV c9894GkV = AbstractC9901Gkh.A00;
                    c10026Go0 = new C10026Go0(str);
                }
                c10009Gnh._encodedSimple = c10026Go0;
            }
            abstractC9919GlE.A0c(c10026Go0);
            jsonSerializer.A0C(abstractC9919GlE, abstractC9846Gip, obj);
            abstractC9919GlE.A0Q();
        } catch (Exception e) {
            throw A00(abstractC9919GlE, e);
        }
    }
}
