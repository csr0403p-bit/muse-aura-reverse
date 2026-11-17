package X;

import java.io.Serializable;

/* renamed from: X.Gp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10079Gp0 implements Serializable {
    public static final C10079Gp0 A00;
    public static final long serialVersionUID = 1;
    public final EnumC10073Gou _contentNulls;
    public final EnumC10073Gou _nulls;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C10079Gp0 c10079Gp0 = (C10079Gp0) obj;
                if (c10079Gp0._nulls != this._nulls || c10079Gp0._contentNulls != this._contentNulls) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        EnumC10073Gou enumC10073Gou = EnumC10073Gou.DEFAULT;
        A00 = new C10079Gp0(enumC10073Gou, enumC10073Gou);
    }

    public final int hashCode() {
        return this._nulls.ordinal() + (this._contentNulls.ordinal() << 2);
    }

    public Object readResolve() {
        EnumC10073Gou enumC10073Gou = this._nulls;
        EnumC10073Gou enumC10073Gou2 = this._contentNulls;
        EnumC10073Gou enumC10073Gou3 = EnumC10073Gou.DEFAULT;
        return (enumC10073Gou == enumC10073Gou3 && enumC10073Gou2 == enumC10073Gou3) ? A00 : this;
    }

    public final String toString() {
        return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", this._nulls, this._contentNulls);
    }

    public C10079Gp0(EnumC10073Gou enumC10073Gou, EnumC10073Gou enumC10073Gou2) {
        this._nulls = enumC10073Gou;
        this._contentNulls = enumC10073Gou2;
    }
}
