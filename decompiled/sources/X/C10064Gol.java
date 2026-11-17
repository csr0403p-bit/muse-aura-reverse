package X;

import java.io.Serializable;
import java.util.Map;

/* renamed from: X.Gol, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10064Gol implements Serializable {
    public static final long serialVersionUID = 1;
    public EnumC10072Got _defaultAction;
    public final C9667Gd9 _defaultCoercions;
    public Map<Class<?>, C9667Gd9> _perClassCoercions;
    public C9667Gd9[] _perTypeCoercions;

    public C10064Gol() {
        EnumC10072Got enumC10072Got = EnumC10072Got.TryConvert;
        this._defaultCoercions = new C9667Gd9();
        this._defaultAction = enumC10072Got;
        this._perTypeCoercions = null;
        this._perClassCoercions = null;
    }
}
