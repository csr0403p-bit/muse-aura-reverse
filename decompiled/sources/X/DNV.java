package X;

import com.google.common.base.Predicate;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class DNV<T> extends DNU<T> {
    public final /* synthetic */ Predicate A00;
    public final /* synthetic */ Iterator A01;

    public DNV(final Predicate val$unfiltered, final Iterator val$retainIfTrue) {
        this.A01 = val$retainIfTrue;
        this.A00 = val$unfiltered;
    }
}
