package X;

import java.io.Serializable;

/* renamed from: X.Hiy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10455Hiy implements Serializable {
    public static final long serialVersionUID = 2;
    public transient Object A00;
    public String _desc;
    public String _fieldName;
    public int _index = -1;

    private final String A00() {
        char c;
        String str = this._desc;
        if (str != null) {
            return str;
        }
        StringBuilder sbA0w = C60O.A0w();
        Object obj = this.A00;
        if (obj != null) {
            Class<?> componentType = obj instanceof Class ? (Class) obj : obj.getClass();
            int i = 0;
            while (componentType.isArray()) {
                componentType = componentType.getComponentType();
                i++;
            }
            String name = componentType.getName();
            while (true) {
                sbA0w.append(name);
                i--;
                if (i < 0) {
                    break;
                }
                name = "[]";
            }
        } else {
            sbA0w.append("UNKNOWN");
        }
        sbA0w.append('[');
        String str2 = this._fieldName;
        if (str2 != null) {
            c = '\"';
            sbA0w.append('\"');
            sbA0w.append(str2);
        } else {
            int i2 = this._index;
            if (i2 >= 0) {
                sbA0w.append(i2);
                String strA0o = BV5.A0o(sbA0w);
                this._desc = strA0o;
                return strA0o;
            }
            c = '?';
        }
        sbA0w.append(c);
        String strA0o2 = BV5.A0o(sbA0w);
        this._desc = strA0o2;
        return strA0o2;
    }

    public final String toString() {
        return A00();
    }

    public Object writeReplace() {
        A00();
        return this;
    }
}
