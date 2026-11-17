package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.LinkedListMultimap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.DOz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5025DOz<K, V> extends DOv<K, V> {
    public final /* synthetic */ AbstractC5024DOu A00;

    public C5025DOz(final AbstractC5024DOu this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        AbstractC5024DOu abstractC5024DOu = this.A00;
        if (abstractC5024DOu instanceof LinkedListMultimap) {
            throw BV4.A0N("should never be called");
        }
        AbstractMapBasedMultimap abstractMapBasedMultimap = (AbstractMapBasedMultimap) abstractC5024DOu;
        return abstractMapBasedMultimap instanceof LinkedHashMultimap ? new F5P((LinkedHashMultimap) abstractMapBasedMultimap) : new DOX(abstractMapBasedMultimap);
    }
}
