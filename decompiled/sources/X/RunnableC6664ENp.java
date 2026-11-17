package X;

import android.database.Cursor;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.ENp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC6664ENp implements Runnable {
    public static final String __redex_internal_original_name = "ContentProviderResolver$abandonBatch$2$1";
    public final /* synthetic */ ListenableFuture<Cursor> A00;
    public final /* synthetic */ ENq A01;

    /* JADX WARN: Incorrect types in method signature: (LX/ENq;Lcom/google/common/util/concurrent/ListenableFuture<Landroid/database/Cursor;>;)V */
    public RunnableC6664ENp(ListenableFuture listenableFuture, ENq eNq) {
        this.A01 = eNq;
        this.A00 = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Cursor cursor = (Cursor) CQD.A00(this.A00);
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            C3cG.A0s(th);
        }
    }
}
