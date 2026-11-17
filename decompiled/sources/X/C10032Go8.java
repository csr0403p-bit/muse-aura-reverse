package X;

import java.io.Serializable;

/* renamed from: X.Go8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10032Go8 implements Serializable {
    public static final InterfaceC10049GoT A00 = new C10033Go9();
    public static final long serialVersionUID = 1;
    public final C9963Gma _config;
    public final C9924GlL _generatorFactory;
    public final C10116Gph _generatorSettings;
    public final C9847Giq _prefetch;
    public final AbstractC9843Gik _serializerFactory;
    public final AbstractC9846Gip _serializerProvider;

    public C10032Go8(C9899Gkf c9899Gkf, C9963Gma c9963Gma) {
        this._config = c9963Gma;
        this._serializerProvider = c9899Gkf._serializerProvider;
        this._serializerFactory = c9899Gkf._serializerFactory;
        this._generatorFactory = c9899Gkf._jsonFactory;
        this._generatorSettings = C10116Gph.A00;
        this._prefetch = C9847Giq.A00;
    }

    public C10032Go8(C10116Gph c10116Gph, C9847Giq c9847Giq, C10032Go8 c10032Go8, C9963Gma c9963Gma) {
        this._config = c9963Gma;
        this._serializerProvider = c10032Go8._serializerProvider;
        this._serializerFactory = c10032Go8._serializerFactory;
        this._generatorFactory = c10032Go8._generatorFactory;
        this._generatorSettings = c10116Gph;
        this._prefetch = c9847Giq;
    }
}
