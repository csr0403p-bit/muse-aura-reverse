package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes5.dex */
public final class C4P implements C4S {
    public Iterator<Map.Entry<Object, Object>> A00;
    public final Map<Object, Object> A01;

    @Override // X.C4S
    public final void reset() {
        this.A00 = null;
    }

    @Override // X.C4S
    public final void A3a(Properties properties) {
        this.A01.putAll(properties);
    }

    @Override // X.C4S
    public final Properties ACk() {
        return (Properties) this.A01;
    }

    @Override // X.C4S
    public final boolean AI6(C4Q c4q) {
        Iterator<Map.Entry<Object, Object>> itA0n = this.A00;
        if (itA0n == null) {
            itA0n = AnonymousClass002.A0n(this.A01);
            this.A00 = itA0n;
        }
        if (!itA0n.hasNext()) {
            return false;
        }
        Map.Entry entryA0l = C3cH.A0l(this.A00);
        c4q.A00 = entryA0l.getKey().toString();
        c4q.A01 = entryA0l.getValue().toString();
        return true;
    }

    public C4P(Properties properties) {
        this.A01 = properties;
    }

    @Override // X.C4S
    public final String[] AJD(List<String> list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Object obj = this.A01.get(list.get(i));
            strArr[i] = obj != null ? obj.toString() : null;
        }
        return strArr;
    }

    public C4P() {
        this.A01 = new Properties();
    }
}
