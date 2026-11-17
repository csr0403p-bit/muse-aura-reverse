package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class Ek0 implements InterfaceC7176Ehl {
    public final Bitmap.Config A00;
    public final SparseArray<Runnable> A01 = BV4.A0B();
    public final C7178Ehn A02;
    public final AbstractC7151EhM A03;
    public final ExecutorService A04;

    public Ek0(Bitmap.Config config, C7178Ehn c7178Ehn, AbstractC7151EhM abstractC7151EhM, ExecutorService executorService) {
        this.A03 = abstractC7151EhM;
        this.A02 = c7178Ehn;
        this.A00 = config;
        this.A04 = executorService;
    }
}
