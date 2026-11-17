package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public final class DNm extends AbstractMapBasedMultimap<K, V>.WrappedList implements RandomAccess {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/google/common/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection;)V */
    public DNm(final DNh this$0, AbstractMapBasedMultimap key, Object delegate, List ancestor) {
        super(this$0, key, delegate, ancestor);
        this.A00 = key;
    }
}
