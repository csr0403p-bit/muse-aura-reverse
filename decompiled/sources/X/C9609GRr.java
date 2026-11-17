package X;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;

/* renamed from: X.GRr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9609GRr extends ContentObserver {
    public int A00;
    public final C3UX A01;
    public final /* synthetic */ C9608GRp A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9609GRr(Handler handler, C9608GRp c9608GRp, C3UX c3ux) {
        super(handler);
        this.A02 = c9608GRp;
        this.A01 = c3ux;
        this.A00 = -1;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        String path;
        if (uri == null || (path = uri.getPath()) == null) {
            return;
        }
        C9608GRp c9608GRp = this.A02;
        if (C7BY.A0q(path, c9608GRp.A03, false)) {
            AnonymousClass001.A1J(new C8899FtG((Object) c9608GRp, (MetaAiRsysSdkRealTimeSession) this, (Context) null, (HtJ<? super C8899FtG>) 17), this.A01);
        }
    }
}
