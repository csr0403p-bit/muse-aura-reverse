package X;

import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class Hpz extends HashMap<String, AbstractC9915Gl5> {
    public static final long serialVersionUID = 1;
    public final Locale _locale;

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return super.get(((String) obj).toLowerCase(this._locale));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put(((String) obj).toLowerCase(this._locale), obj2);
    }

    @Deprecated
    public Hpz() {
        this(Locale.getDefault());
    }

    public Hpz(Locale locale) {
        this._locale = locale;
    }
}
