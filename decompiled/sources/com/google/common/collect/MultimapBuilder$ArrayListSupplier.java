package com.google.common.collect;

import X.C60O;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes5.dex */
public final class MultimapBuilder$ArrayListSupplier<V> implements Supplier<List<V>>, Serializable {
    public final int expectedValuesPerKey = 2;

    @Override // com.google.common.base.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return C60O.A11(this.expectedValuesPerKey);
    }
}
