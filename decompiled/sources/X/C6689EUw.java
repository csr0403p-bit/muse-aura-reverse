package X;

import java.util.concurrent.Future;

/* renamed from: X.EUw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6689EUw extends AbstractC7260Ejk {
    public final /* synthetic */ C6687EUo A00;
    public final /* synthetic */ EUm A01;
    public final /* synthetic */ Future A02;

    public C6689EUw(C6687EUo c6687EUo, EUm eUm, Future future) {
        this.A02 = future;
        this.A01 = eUm;
        this.A00 = c6687EUo;
    }

    @Override // X.AbstractC7260Ejk
    public final void onCancellationRequested() {
        if (this.A02.cancel(false)) {
            this.A01.AS7();
        }
    }
}
