package X;

import java.io.Serializable;

/* renamed from: X.Gok, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10063Gok implements Serializable {
    public static final long serialVersionUID = 1;
    public final Hgc[] _abstractTypeResolvers;
    public final InterfaceC9884Gjs[] _additionalDeserializers;
    public final InterfaceC10212GrY[] _additionalKeyDeserializers;
    public final HtI[] _modifiers;
    public final Hga[] _valueInstantiators;
    public static final InterfaceC9884Gjs[] A02 = new InterfaceC9884Gjs[0];
    public static final HtI[] A01 = new HtI[0];
    public static final Hgc[] A00 = new Hgc[0];
    public static final Hga[] A04 = new Hga[0];
    public static final InterfaceC10212GrY[] A03 = {new C10041GoL()};

    public C10063Gok() {
        this(null, null, null, null, null);
    }

    public C10063Gok(Hgc[] hgcArr, HtI[] htIArr, InterfaceC9884Gjs[] interfaceC9884GjsArr, InterfaceC10212GrY[] interfaceC10212GrYArr, Hga[] hgaArr) {
        this._additionalDeserializers = interfaceC9884GjsArr == null ? A02 : interfaceC9884GjsArr;
        this._additionalKeyDeserializers = interfaceC10212GrYArr == null ? A03 : interfaceC10212GrYArr;
        this._modifiers = htIArr == null ? A01 : htIArr;
        this._abstractTypeResolvers = hgcArr == null ? A00 : hgcArr;
        this._valueInstantiators = hgaArr == null ? A04 : hgaArr;
    }
}
