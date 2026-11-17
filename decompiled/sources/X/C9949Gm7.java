package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: X.Gm7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9949Gm7 extends C9911Gku implements Serializable {
    public static final long serialVersionUID = 1;
    public final AbstractC10187Gqy _nameTransformer;

    public C9949Gm7(C9911Gku c9911Gku, AbstractC10187Gqy abstractC10187Gqy) {
        super(c9911Gku._name, c9911Gku);
        this._nameTransformer = abstractC10187Gqy;
    }

    @Override // X.C9911Gku
    public final void A06(JsonSerializer<Object> jsonSerializer) {
        if (jsonSerializer != null) {
            AbstractC10187Gqy c10094GpI = this._nameTransformer;
            if (jsonSerializer.A0D() && (jsonSerializer instanceof UnwrappingBeanSerializer)) {
                c10094GpI = new C10094GpI(c10094GpI, ((UnwrappingBeanSerializer) jsonSerializer)._nameTransformer);
            }
            jsonSerializer = jsonSerializer.A0A(c10094GpI);
        }
        super.A06(jsonSerializer);
    }

    @Override // X.C9911Gku
    public void A04(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, Object obj) throws IOException {
        Object objA02 = GmW.A02(this, obj);
        if (objA02 != null) {
            JsonSerializer jsonSerializerA00 = C9911Gku.A00(abstractC9842Gii, this, objA02);
            Object obj2 = this._suppressableValue;
            if (obj2 == null || !C9911Gku.A01(jsonSerializerA00, abstractC9842Gii, obj2, objA02)) {
                if (objA02 == obj && A07(abstractC9919GlE, jsonSerializerA00, abstractC9842Gii)) {
                    return;
                }
                if (!jsonSerializerA00.A0D()) {
                    abstractC9919GlE.A0c(this._name);
                }
                JsonSerializer.A07(abstractC9919GlE, jsonSerializerA00, abstractC9842Gii, this._typeSerializer, objA02);
            }
        }
    }

    public C9949Gm7(C10026Go0 c10026Go0, C9949Gm7 c9949Gm7, AbstractC10187Gqy abstractC10187Gqy) {
        super(c10026Go0, c9949Gm7);
        this._nameTransformer = abstractC10187Gqy;
    }
}
