package X;

import android.content.Context;
import java.util.Collection;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final /* synthetic */ class HmN extends C7438Evz implements G0U<Collection<String>, Unit> {
    public HmN(Object obj) {
        super(1, obj, Context.class, "revokeSelfPermissionsOnKill", "revokeSelfPermissionsOnKill(Ljava/util/Collection;)V", 0);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(Collection<String> collection) {
        Collection<String> collection2 = collection;
        ((Context) AnonymousClass006.A0o(collection2, this)).revokeSelfPermissionsOnKill(collection2);
        return Unit.INSTANCE;
    }
}
