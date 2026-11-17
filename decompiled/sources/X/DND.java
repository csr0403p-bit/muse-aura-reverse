package X;

import com.google.common.base.Predicate;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class DND extends DNC<String, List<String>> {
    public final Map<String, List<String>> A00;

    @Override // X.DNC, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // X.DNC, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            return (obj instanceof Map) && entrySet().equals(((Map) obj).entrySet());
        }
        return true;
    }

    @Override // X.DNC, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return super.get(obj);
    }

    public DND(Map<String, List<String>> map) {
        this.A00 = map;
    }

    @Override // X.DNC, java.util.Map
    public final Set<Map.Entry<String, List<String>>> entrySet() {
        return DNa.A02(new Predicate() { // from class: X.DNF
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return AnonymousClass002.A1X(((Map.Entry) obj).getKey());
            }
        }, super.entrySet());
    }

    @Override // X.DNC, java.util.Map
    public final int hashCode() {
        return DNa.A00(entrySet());
    }

    @Override // X.DNC, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // X.DNC, java.util.Map
    public final Set<String> keySet() {
        return DNa.A02(new Predicate() { // from class: X.DNG
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return AnonymousClass002.A1X(obj);
            }
        }, super.keySet());
    }

    @Override // X.DNC, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
