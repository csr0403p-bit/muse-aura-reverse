package androidx.glance.session;

import X.AnonymousClass001;
import X.C07298ii;
import X.C77Q;
import X.C78T;
import X.C78p;
import X.HqU;
import android.content.Context;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class SessionWorkerKt$runSession$$inlined$CoroutineExceptionHandler$1 extends HqU implements CoroutineExceptionHandler {
    public final /* synthetic */ Context $context$inlined;
    public final /* synthetic */ Session $session$inlined;
    public final /* synthetic */ C77Q $this_runSession$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorkerKt$runSession$$inlined$CoroutineExceptionHandler$1(C78p c78p, C77Q c77q, Session session, Context context) {
        super(c78p);
        this.$this_runSession$inlined = c77q;
        this.$session$inlined = session;
        this.$context$inlined = context;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C78T c78t, Throwable th) {
        C77Q c77q = this.$this_runSession$inlined;
        AnonymousClass001.A1J(new C07298ii(this.$context$inlined, this.$session$inlined, c77q, th, null, 7), c77q);
    }
}
