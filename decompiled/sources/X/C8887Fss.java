package X;

import java.io.Serializable;

/* renamed from: X.Fss, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8887Fss implements Comparable<C8887Fss>, Serializable {
    public static final long serialVersionUID = 1;
    public Class<?> _class;
    public String _className;
    public int _hashCode;

    public final boolean equals(Object obj) {
        return obj == this || (obj != null && obj.getClass() == getClass() && ((C8887Fss) obj)._class == this._class);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C8887Fss c8887Fss) {
        return this._className.compareTo(c8887Fss._className);
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public final String toString() {
        return this._className;
    }

    public C8887Fss() {
        this._class = null;
        this._className = null;
        this._hashCode = 0;
    }

    public C8887Fss(Class<?> cls) {
        this._class = cls;
        String name = cls.getName();
        this._className = name;
        this._hashCode = name.hashCode();
    }
}
