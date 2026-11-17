package X;

import java.io.Serializable;

/* renamed from: X.GoA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10034GoA implements Serializable {
    public static final long serialVersionUID = -1;
    public final transient GqV A00;
    public EnumC10073Gou _contentNulls;
    public final String _defaultValue;
    public final String _description;
    public final Integer _index;
    public final Boolean _required;
    public EnumC10073Gou _valueNulls;
    public static final C10034GoA A02 = new C10034GoA(null, null, null, Boolean.TRUE, null, null, null);
    public static final C10034GoA A01 = new C10034GoA(null, null, null, Boolean.FALSE, null, null, null);
    public static final C10034GoA A03 = new C10034GoA(null, null, null, null, null, null, null);

    public static C10034GoA A00(Boolean bool, Integer num, String str, String str2) {
        return (str == null && num == null && str2 == null) ? bool == null ? A03 : bool.booleanValue() ? A02 : A01 : new C10034GoA(null, null, null, bool, num, str, str2);
    }

    public final C10034GoA A01(EnumC10073Gou enumC10073Gou, EnumC10073Gou enumC10073Gou2) {
        Boolean bool = this._required;
        String str = this._description;
        return new C10034GoA(enumC10073Gou, enumC10073Gou2, this.A00, bool, this._index, str, this._defaultValue);
    }

    public final C10034GoA A02(GqV gqV) {
        Boolean bool = this._required;
        String str = this._description;
        return new C10034GoA(this._valueNulls, this._contentNulls, gqV, bool, this._index, str, this._defaultValue);
    }

    public Object readResolve() {
        if (this._description != null || this._index != null || this._defaultValue != null || this.A00 != null || this._valueNulls != null || this._contentNulls != null) {
            return this;
        }
        Boolean bool = this._required;
        return bool == null ? A03 : bool.booleanValue() ? A02 : A01;
    }

    public C10034GoA(EnumC10073Gou enumC10073Gou, EnumC10073Gou enumC10073Gou2, GqV gqV, Boolean bool, Integer num, String str, String str2) {
        this._required = bool;
        this._description = str;
        this._index = num;
        this._defaultValue = (str2 == null || str2.isEmpty()) ? null : str2;
        this.A00 = gqV;
        this._valueNulls = enumC10073Gou;
        this._contentNulls = enumC10073Gou2;
    }
}
