package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

/* renamed from: X.Gmg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9968Gmg extends C9911Gku implements Serializable {
    public static final long serialVersionUID = 1;

    @Override // X.C9911Gku
    public final void A04(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, Object obj) throws IOException {
        Object obj2;
        String str = ((C10025Gnz) this)._attrName;
        C10082Gp3 c10082Gp3 = (C10082Gp3) abstractC9842Gii.A00;
        Map<Object, Object> map = c10082Gp3.A00;
        if (map == null || (obj2 = map.get(str)) == null ? (obj2 = c10082Gp3._shared.get(str)) == null : obj2 == C10082Gp3.A02) {
            if (this._nullSerializer != null) {
                abstractC9919GlE.A0c(this._name);
                this._nullSerializer.A0C(abstractC9919GlE, abstractC9842Gii, null);
                return;
            }
            return;
        }
        JsonSerializer jsonSerializerA00 = C9911Gku.A00(abstractC9842Gii, this, obj2);
        Object obj3 = this._suppressableValue;
        if (obj3 == null || !C9911Gku.A01(jsonSerializerA00, abstractC9842Gii, obj3, obj2)) {
            if (obj2 == obj && A07(abstractC9919GlE, jsonSerializerA00, abstractC9842Gii)) {
                return;
            }
            abstractC9919GlE.A0c(this._name);
            JsonSerializer.A07(abstractC9919GlE, jsonSerializerA00, abstractC9842Gii, this._typeSerializer, obj2);
        }
    }
}
