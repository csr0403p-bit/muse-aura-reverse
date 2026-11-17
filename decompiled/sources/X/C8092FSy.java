package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.FSy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8092FSy implements FUR {
    public final /* synthetic */ RecyclerView A00;

    public C8092FSy(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    @Override // X.FUR
    public final float AJy() {
        float f;
        RecyclerView recyclerView = this.A00;
        FTN ftn = recyclerView.A0H;
        if (ftn.A1Q()) {
            f = recyclerView.A01;
        } else {
            if (!ftn.A1P()) {
                return 0.0f;
            }
            f = recyclerView.A00;
        }
        return -f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r3 == 0) goto L6;
     */
    @Override // X.FUR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Afz(float r5) {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r4 = r4.A00
            X.FTN r2 = r4.A0H
            boolean r1 = r2.A1Q()
            r0 = 0
            if (r1 == 0) goto L10
            int r3 = (int) r5
            r2 = 0
            if (r3 != 0) goto L1b
        Lf:
            return r0
        L10:
            boolean r1 = r2.A1P()
            if (r1 == 0) goto Lf
            int r2 = (int) r5
            r3 = 0
            if (r2 != 0) goto L1b
            return r0
        L1b:
            r4.A0m()
            r1 = 2147483647(0x7fffffff, float:NaN)
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A0e(r4, r2, r3, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8092FSy.Afz(float):boolean");
    }

    @Override // X.FUR
    public final void AgS() {
        this.A00.A0m();
    }
}
