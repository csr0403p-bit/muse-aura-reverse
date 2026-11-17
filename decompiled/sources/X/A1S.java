package X;

import androidx.savedstate.serialization.serializers.SparseArraySerializer$SparseArraySurrogate$Companion;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class A1S<T> {
    public static final C9iZ A03;
    public final List<Integer> A00;
    public final List<T> A01;
    public static final SparseArraySerializer$SparseArraySurrogate$Companion Companion = new SparseArraySerializer$SparseArraySurrogate$Companion();
    public static final F0C<C9hr<Object>>[] A02 = {C2283BSj.A01(C79.A01, 35), null};

    static {
        C9iK c9iKA1C = C3cG.A1C("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        c9iKA1C.A08(BrowserOperationCatalogKt.KEYS, false);
        c9iKA1C.A08("values", false);
        A03 = c9iKA1C;
    }

    public /* synthetic */ A1S(List list, List list2, int i) {
        if (3 != (i & 3)) {
            C9iI.A00(A03, i, 3);
            throw F60.createAndThrow();
        }
        this.A00 = list;
        this.A01 = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A1S(List<Integer> list, List<? extends T> list2) {
        this.A00 = list;
        this.A01 = list2;
    }
}
