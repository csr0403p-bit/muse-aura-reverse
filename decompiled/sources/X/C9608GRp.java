package X;

import android.content.Context;
import android.database.ContentObserver;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.GRp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9608GRp {
    public ContentObserver A00;
    public final int A01;
    public final Context A02;
    public final String A03;
    public final AtomicInteger A04;
    public final F0C A05;
    public final C3UX A06;
    public final C20Q<C10563Htj> A07;
    public final BLG<C10563Htj> A08;

    public C9608GRp(Context context, C3UX c3ux, int i) {
        C7384Etj.A0Y(c3ux, 1);
        this.A06 = c3ux;
        this.A01 = i;
        this.A02 = AnonymousClass001.A0I(context);
        this.A03 = i != 3 ? i != 11 ? "system/volume_voice" : "system/volume_assistant" : "system/volume_music";
        this.A05 = FZP.A00(C79.A0C, this, 3);
        C9286GCn c9286GCnA14 = C3cG.A14(HwN.A01);
        this.A08 = c9286GCnA14;
        this.A04 = new AtomicInteger(0);
        this.A07 = new C10650I0u(0, new C8901FtI(this, null, 2), new C10650I0u(new C8902FtJ(this, null, 11), c9286GCnA14, 1));
    }
}
