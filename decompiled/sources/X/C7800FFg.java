package X;

import android.content.Context;
import android.graphics.Rect;

/* renamed from: X.FFg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7800FFg extends AbstractC8109FTy {
    public final int A00;
    public final FBB A01;
    public final FDW A02;
    public final Rect[] A03;
    public final C7802FFi A04;

    public C7800FFg(FBB fbb, FDW fdw) {
        this.A02 = fdw;
        this.A01 = fbb;
        FF4 ff4 = FF4.A00;
        Context contextA00 = FBB.A00(fbb);
        C7802FFi c7802FFiA05 = ff4.A05(contextA00, fdw);
        this.A04 = c7802FFiA05;
        int i = c7802FFiA05.A01;
        this.A00 = i;
        this.A03 = AbstractC7801FFh.A00(i, i == 1 ? c7802FFiA05.A00 : c7802FFiA05.A03, c7802FFiA05.A02, FKH.A00(contextA00));
    }
}
