package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class Bi7 {
    public final int A01;
    public final int A02;
    public final int A03;
    public final Matrix A04;
    public final Rect A05;
    public final C2771Bkn A06;
    public final BlY A07;
    public final ListenableFuture<Void> A08;
    public final String A09;
    public int A00 = -1;
    public final List<Integer> A0A = C3cG.A0h();

    /* JADX WARN: Incorrect types in method signature: (LX/BZ0;LX/Bkn;Landroid/graphics/Rect;IILandroid/graphics/Matrix;LX/BlY;Lcom/google/common/util/concurrent/ListenableFuture<Ljava/lang/Void;>;I)V */
    public Bi7(Matrix matrix, Rect rect, C2771Bkn c2771Bkn, BlY blY, BZ0 bz0, ListenableFuture listenableFuture, int i, int i2, int i3) {
        this.A02 = i3;
        this.A06 = c2771Bkn;
        this.A01 = i2;
        this.A03 = i;
        this.A05 = rect;
        this.A04 = matrix;
        this.A07 = blY;
        this.A09 = String.valueOf(bz0.hashCode());
        List<InterfaceC2817Blu> list = ((BYz) bz0).A00;
        list.getClass();
        Iterator<InterfaceC2817Blu> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            this.A0A.add(BV4.A0V());
        }
        this.A08 = listenableFuture;
    }
}
