package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: X.Gnn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10015Gnn extends C9911Gku implements Serializable {
    public static final long serialVersionUID = 1;
    public final C9911Gku _delegate;
    public final Class<?> _view;

    public C10015Gnn(C9911Gku c9911Gku, Class<?> cls) {
        super(c9911Gku._name, c9911Gku);
        this._delegate = c9911Gku;
        this._view = cls;
    }

    @Override // X.C9911Gku
    public final void A04(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, Object obj) throws IOException {
        Class<?> cls = abstractC9842Gii._serializationView;
        if (cls == null || this._view.isAssignableFrom(cls)) {
            this._delegate.A04(abstractC9919GlE, abstractC9842Gii, obj);
        }
    }

    @Override // X.C9911Gku
    public final void A06(JsonSerializer<Object> jsonSerializer) {
        this._delegate.A06(jsonSerializer);
    }
}
