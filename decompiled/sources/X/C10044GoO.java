package X;

import java.io.Serializable;

/* renamed from: X.GoO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10044GoO implements InterfaceC10176Gql<C10044GoO>, Serializable {
    public static final C10044GoO A00;
    public static final C10044GoO A01;
    public static final long serialVersionUID = 1;
    public final EnumC9856Gj4 _creatorMinLevel;
    public final EnumC9856Gj4 _fieldMinLevel;
    public final EnumC9856Gj4 _getterMinLevel;
    public final EnumC9856Gj4 _isGetterMinLevel;
    public final EnumC9856Gj4 _setterMinLevel;

    static {
        EnumC9856Gj4 enumC9856Gj4 = EnumC9856Gj4.PUBLIC_ONLY;
        EnumC9856Gj4 enumC9856Gj42 = EnumC9856Gj4.ANY;
        A01 = new C10044GoO(enumC9856Gj4, enumC9856Gj4, enumC9856Gj42, enumC9856Gj42, enumC9856Gj4);
        A00 = new C10044GoO(enumC9856Gj4, enumC9856Gj4, enumC9856Gj4, enumC9856Gj4, enumC9856Gj4);
    }

    public final String toString() {
        return String.format("[Visibility: getter=%s,isGetter=%s,setter=%s,creator=%s,field=%s]", this._getterMinLevel, this._isGetterMinLevel, this._setterMinLevel, this._creatorMinLevel, this._fieldMinLevel);
    }

    public C10044GoO(EnumC9856Gj4 enumC9856Gj4) {
        this._getterMinLevel = enumC9856Gj4;
        this._isGetterMinLevel = enumC9856Gj4;
        this._setterMinLevel = enumC9856Gj4;
        this._creatorMinLevel = enumC9856Gj4;
        this._fieldMinLevel = enumC9856Gj4;
    }

    public C10044GoO(EnumC9856Gj4 enumC9856Gj4, EnumC9856Gj4 enumC9856Gj42, EnumC9856Gj4 enumC9856Gj43, EnumC9856Gj4 enumC9856Gj44, EnumC9856Gj4 enumC9856Gj45) {
        this._getterMinLevel = enumC9856Gj4;
        this._isGetterMinLevel = enumC9856Gj42;
        this._setterMinLevel = enumC9856Gj43;
        this._creatorMinLevel = enumC9856Gj44;
        this._fieldMinLevel = enumC9856Gj45;
    }
}
