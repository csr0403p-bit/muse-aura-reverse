package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: X.Gnc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10004Gnc extends C9911Gku implements Serializable {
    public static final long serialVersionUID = 1;
    public final C9911Gku _delegate;
    public final Class<?>[] _views;

    public C10004Gnc(C9911Gku c9911Gku, Class<?>[] clsArr) {
        super(c9911Gku._name, c9911Gku);
        this._delegate = c9911Gku;
        this._views = clsArr;
    }

    @Override // X.C9911Gku
    public final void A04(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, Object obj) throws IOException {
        boolean z;
        Class<?> cls = abstractC9842Gii._serializationView;
        if (cls == null) {
            z = true;
            break;
        }
        int length = this._views.length;
        for (int i = 0; i < length; i++) {
            if (this._views[i].isAssignableFrom(cls)) {
                z = true;
                break;
            }
        }
        z = false;
        C9911Gku c9911Gku = this._delegate;
        if (z) {
            c9911Gku.A04(abstractC9919GlE, abstractC9842Gii, obj);
        }
    }

    @Override // X.C9911Gku
    public final void A06(JsonSerializer<Object> jsonSerializer) {
        this._delegate.A06(jsonSerializer);
    }
}
