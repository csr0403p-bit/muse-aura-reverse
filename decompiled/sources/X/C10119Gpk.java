package X;

import java.io.Serializable;

/* renamed from: X.Gpk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10119Gpk implements InterfaceC10165Gqa, Serializable {
    public static final long serialVersionUID = 1;
    public final EnumC10102GpQ _access;
    public final Object _nullValue;
    public static final C10119Gpk A01 = new C10119Gpk(null);
    public static final C10119Gpk A00 = new C10119Gpk(null);

    @Override // X.InterfaceC10165Gqa
    public final /* synthetic */ Object ACA(AbstractC9904Gkk abstractC9904Gkk) {
        return this._nullValue;
    }

    @Override // X.InterfaceC10165Gqa
    public final Object AIA(AbstractC9904Gkk abstractC9904Gkk) {
        return this._nullValue;
    }

    public C10119Gpk(Object obj) {
        this._nullValue = obj;
        this._access = obj == null ? EnumC10102GpQ.ALWAYS_NULL : EnumC10102GpQ.CONSTANT;
    }
}
