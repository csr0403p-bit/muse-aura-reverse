package X;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bloks.stdlib.components.bkcomponentscollection.BloksStaggeredGridLayoutManager;
import com.bloks.stdlib.components.bkcomponentscollection.StickyItemsLinearLayoutManager;

/* renamed from: X.FHb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7843FHb implements InterfaceC7833FGo<FHV, FS4, Void> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    @Override // X.InterfaceC7833FGo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean Afc(X.FHV r1, X.FHV r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            r0 = this;
            X.FHV r1 = (X.FHV) r1
            X.FHV r2 = (X.FHV) r2
            X.FHf r4 = r1.A0F
            X.FHf r3 = r2.A0F
            boolean r0 = r4 instanceof X.FJ4
            if (r0 == 0) goto L28
            X.FJ4 r4 = (X.FJ4) r4
            r2 = 0
            X.C7384Etj.A0Y(r3, r2)
            boolean r0 = r3 instanceof X.FJ4
            if (r0 == 0) goto L25
            int r1 = r4.A00
            X.FJ4 r3 = (X.FJ4) r3
            int r0 = r3.A00
            if (r1 != r0) goto L25
            int r1 = r4.A00
            int r0 = r3.A00
        L22:
            if (r1 != r0) goto L25
            r2 = 1
        L25:
            r0 = r2 ^ 1
            return r0
        L28:
            boolean r0 = r4 instanceof X.FJ3
            if (r0 == 0) goto L49
            X.FJ3 r4 = (X.FJ3) r4
            r2 = 0
            X.C7384Etj.A0Y(r3, r2)
            boolean r0 = r3 instanceof X.FJ3
            if (r0 == 0) goto L25
            int r1 = r4.A00
            X.FJ3 r3 = (X.FJ3) r3
            int r0 = r3.A00
            if (r1 != r0) goto L25
            boolean r1 = r4.A01
            boolean r0 = r3.A01
            if (r1 != r0) goto L25
            boolean r1 = r4.A00
            boolean r0 = r3.A00
            goto L22
        L49:
            X.FHh r4 = (X.C7849FHh) r4
            r2 = 0
            X.C7384Etj.A0Y(r3, r2)
            boolean r0 = r3 instanceof X.C7849FHh
            if (r0 == 0) goto L25
            int r1 = r4.A00
            X.FHh r3 = (X.C7849FHh) r3
            int r0 = r3.A00
            if (r1 != r0) goto L25
            int r1 = r4.A00
            int r0 = r3.A00
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7843FHb.Afc(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        ((RecyclerView) obj).setLayoutManager(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ Object A59(Context context, FG3 fg3, Object obj, Object obj2, Object obj3) {
        LinearLayoutManager gridLayoutManager;
        RecyclerView recyclerView = (RecyclerView) AbstractC7608F5v.A0k(context, obj);
        AbstractC7847FHf abstractC7847FHf = ((FHV) obj2).A0F;
        if (abstractC7847FHf instanceof FJ4) {
            FJ4 fj4 = (FJ4) abstractC7847FHf;
            BloksStaggeredGridLayoutManager bloksStaggeredGridLayoutManager = new BloksStaggeredGridLayoutManager(fj4.A00, ((AbstractC7847FHf) fj4).A00);
            bloksStaggeredGridLayoutManager.A00 = true;
            gridLayoutManager = bloksStaggeredGridLayoutManager;
        } else if (abstractC7847FHf instanceof FJ3) {
            FJ3 fj3 = (FJ3) abstractC7847FHf;
            C7384Etj.A0Y(context, 0);
            LinearLayoutManager stickyItemsLinearLayoutManager = fj3.A00 ? new StickyItemsLinearLayoutManager(((AbstractC7847FHf) fj3).A00) : new LinearLayoutManager(((AbstractC7847FHf) fj3).A00);
            stickyItemsLinearLayoutManager.A1e(fj3.A01);
            gridLayoutManager = stickyItemsLinearLayoutManager;
        } else {
            C7849FHh c7849FHh = (C7849FHh) abstractC7847FHf;
            C7384Etj.A0Y(context, 0);
            gridLayoutManager = new GridLayoutManager(c7849FHh.A00, ((AbstractC7847FHf) c7849FHh).A00);
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        return null;
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ FH1 AGl() {
        return Hov.A00(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ String getDescription() {
        return AbstractC7608F5v.A0w(this);
    }

    @Override // X.InterfaceC7833FGo
    public final /* synthetic */ void Ahc(Context context, FG3 fg3, Object obj, Object obj2, Object obj3, Object obj4) {
        Hov.A01(context, this, obj, obj2, obj3);
    }
}
