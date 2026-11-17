package X;

import android.content.Context;
import com.facebook.payments.dcp.xapp.cache.prefetch.IapPrefetchCache;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* renamed from: X.GPu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9583GPu extends IapPrefetchCache {
    /* JADX WARN: Incorrect types in method signature: (LX/3UX;TKey;LX/G0V<-LX/G0U<-TResult;Lkotlin/Unit;>;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public final void A01(Object obj, G0V g0v, C3UX c3ux) {
        GAt gAt;
        synchronized (this) {
            gAt = new GAt(null);
            this.A01 = obj;
            this.A00 = gAt;
        }
        AnonymousClass001.A11(new C8899FtG((Object) g0v, (MetaAiRsysSdkRealTimeSession) gAt, (Context) null, (HtJ<? super C8899FtG>) 7), c3ux).AO5(new FZG(13, obj, gAt));
    }
}
