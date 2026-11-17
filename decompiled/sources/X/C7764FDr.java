package X;

import android.content.Context;

/* renamed from: X.FDr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7764FDr<RenderContext> {
    public C7749FDb A00;
    public boolean A01;
    public final int A02;
    public final Context A03;
    public final RenderContext A04;

    public final C7749FDb A00() {
        C7749FDb c7749FDb = this.A00;
        if (c7749FDb != null) {
            return c7749FDb;
        }
        throw C3cG.A0Q("Trying to access the LayoutCache from outside a layout call");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7764FDr(Context context, C7749FDb c7749FDb, Object obj, int i) {
        this.A03 = context;
        this.A04 = obj;
        this.A02 = i;
        this.A00 = c7749FDb;
    }
}
