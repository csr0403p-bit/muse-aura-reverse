package X;

import android.content.ContentProviderClient;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.ENo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC6663ENo<V> implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ContentProviderClient A01;
    public final /* synthetic */ List<CancellationSignal> A02;
    public final /* synthetic */ ENq A03;
    public final /* synthetic */ C6662ENn A04;

    /* JADX WARN: Incorrect types in method signature: (LX/ENq;Landroid/content/ContentProviderClient;LX/ENn;Ljava/util/List<Landroid/os/CancellationSignal;>;I)V */
    public CallableC6663ENo(ContentProviderClient contentProviderClient, List list, ENq eNq, C6662ENn c6662ENn, int i) {
        this.A03 = eNq;
        this.A01 = contentProviderClient;
        this.A04 = c6662ENn;
        this.A02 = list;
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ContentProviderClient contentProviderClient = this.A01;
        C6662ENn c6662ENn = this.A04;
        CancellationSignal cancellationSignal = this.A02.get(this.A00);
        InterfaceExecutorServiceC3065Bwn interfaceExecutorServiceC3065Bwn = ENq.A05;
        Uri uri = c6662ENn.A00;
        List<String> list = c6662ENn.A02;
        return contentProviderClient.query(uri, list != null ? BV4.A1b(list) : null, c6662ENn.A01, null, null, cancellationSignal);
    }
}
