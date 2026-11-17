package X;

import java.io.Serializable;
import java.util.Map;

/* renamed from: X.GoX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10053GoX implements InterfaceC10159GqS, Serializable {
    public static final long serialVersionUID = 1;
    public Map<C8887Fss, Class<?>> _localMixIns;
    public final InterfaceC10159GqS _overrides = null;

    public final boolean A00() {
        if (this._localMixIns != null) {
            return true;
        }
        InterfaceC10159GqS interfaceC10159GqS = this._overrides;
        if (interfaceC10159GqS == null) {
            return false;
        }
        if (interfaceC10159GqS instanceof C10053GoX) {
            return ((C10053GoX) interfaceC10159GqS).A00();
        }
        return true;
    }

    @Override // X.InterfaceC10159GqS
    public final Class<?> ABU(Class<?> cls) {
        Class<?> clsABU;
        InterfaceC10159GqS interfaceC10159GqS = this._overrides;
        if (interfaceC10159GqS == null) {
            clsABU = null;
        } else {
            clsABU = interfaceC10159GqS.ABU(cls);
            if (clsABU != null) {
                return clsABU;
            }
        }
        Map<C8887Fss, Class<?>> map = this._localMixIns;
        return map != null ? map.get(new C8887Fss(cls)) : clsABU;
    }
}
