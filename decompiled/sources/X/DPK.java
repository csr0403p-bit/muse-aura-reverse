package X;

import com.google.common.base.Function;
import com.google.common.collect.Lists$TransformingRandomAccessList;
import com.google.common.collect.Lists$TransformingSequentialList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public abstract class DPK {
    /* JADX WARN: Incorrect types in method signature: <F:Ljava/lang/Object;T:Ljava/lang/Object;>(Ljava/util/List<TF;>;Lcom/google/common/base/Function<-TF;+TT;>;)Ljava/util/List<TT;>; */
    public static List A00(Function fromList, List function) {
        return function instanceof RandomAccess ? new Lists$TransformingRandomAccessList(fromList, function) : new Lists$TransformingSequentialList(fromList, function);
    }
}
