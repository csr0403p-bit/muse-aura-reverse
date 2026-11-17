package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DOX<K, V> extends AbstractMapBasedMultimap<K, V>.Itr<Map.Entry<K, V>> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DOX(final AbstractMapBasedMultimap this$0) {
        super(this$0);
        this.A00 = this$0;
    }
}
