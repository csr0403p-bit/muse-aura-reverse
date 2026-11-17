package X;

import com.google.common.collect.CompactHashMap;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DQX<K, V> extends CompactHashMap<K, V>.Itr<Map.Entry<K, V>> {
    public final /* synthetic */ CompactHashMap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DQX(final CompactHashMap this$0) {
        super(this$0);
        this.A00 = this$0;
    }
}
