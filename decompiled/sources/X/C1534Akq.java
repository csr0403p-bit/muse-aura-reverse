package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.Unit;

/* renamed from: X.Akq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1534Akq extends C1634An9 {
    public G0U<? super T, Unit> A00;
    public G0U<? super T, Unit> A01;
    public G0U<? super T, Unit> A02;
    public AG2 A03;

    /* JADX INFO: Incorrect field signature: TT; */
    public final View A04;
    public final AFx A05;
    public final NestedScrollDispatcher A06;
    public final String A07;

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/G0U<-Landroid/content/Context;+TT;>;LX/BBV;LX/AFx;ILX/AjX;)V */
    public C1534Akq(Context context, BBV bbv, AFx aFx, InterfaceC1464AjX interfaceC1464AjX, G0U g0u, int i) {
        SparseArray<Parcelable> sparseArray;
        View view = (View) g0u.invoke(context);
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        super(context, view, bbv, nestedScrollDispatcher, interfaceC1464AjX);
        this.A04 = view;
        this.A06 = nestedScrollDispatcher;
        this.A05 = aFx;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        this.A07 = strValueOf;
        Object objA71 = aFx != null ? aFx.A71(strValueOf) : null;
        if ((objA71 instanceof SparseArray) && (sparseArray = (SparseArray) objA71) != null) {
            view.restoreHierarchyState(sparseArray);
        }
        AFx aFx2 = this.A05;
        if (aFx2 != null) {
            setSavableRegistryEntry(aFx2.Aa3(this.A07, C2328BUc.A00(this, 39)));
        }
        G0U<View, Unit> g0u2 = AbstractC1532Ako.A00;
        this.A02 = g0u2;
        this.A01 = g0u2;
        this.A00 = g0u2;
    }

    public static final void A00(C1534Akq c1534Akq) {
        c1534Akq.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(AG2 ag2) {
        AG2 ag22 = this.A03;
        if (ag22 != null) {
            ag22.Ahh();
        }
        this.A03 = ag2;
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.A06;
    }

    public final G0U<T, Unit> getReleaseBlock() {
        return this.A00;
    }

    public final G0U<T, Unit> getResetBlock() {
        return this.A01;
    }

    public /* synthetic */ AbstractC1718Ap2 getSubCompositionView() {
        return null;
    }

    public final G0U<T, Unit> getUpdateBlock() {
        return this.A02;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(G0U<? super T, Unit> g0u) {
        this.A00 = g0u;
        super.A04 = C2328BUc.A00(this, 40);
    }

    public final void setResetBlock(G0U<? super T, Unit> g0u) {
        this.A01 = g0u;
        super.A05 = C2328BUc.A00(this, 41);
    }

    public final void setUpdateBlock(G0U<? super T, Unit> g0u) {
        this.A02 = g0u;
        setUpdate(C2328BUc.A00(this, 42));
    }
}
