package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes6.dex */
public final class FTW {
    public View A01;
    public final FUJ A03;
    public int A00 = 0;
    public final C8107FTw A02 = new C8107FTw();
    public final List<View> A04 = C3cG.A0h();

    public static int A00(FTW ftw, int i) {
        if (i >= 0) {
            int childCount = ((C8103FTr) ftw.A03).A00.getChildCount();
            int i2 = i;
            while (i2 < childCount) {
                C8107FTw c8107FTw = ftw.A02;
                int iA01 = i - (i2 - c8107FTw.A01(i2));
                if (iA01 == 0) {
                    while (c8107FTw.A06(i2)) {
                        i2++;
                    }
                    return i2;
                }
                i2 += iA01;
            }
        }
        return -1;
    }

    public static FTV A01(FTW ftw, int i) {
        return RecyclerView.A08(((C8103FTr) ftw.A03).A00.getChildAt(i));
    }

    public static void A02(View view, FTW ftw) {
        ftw.A04.add(view);
        C8103FTr c8103FTr = (C8103FTr) ftw.A03;
        float f = RecyclerView.A1J;
        FTV ftv = AbstractC7607F5u.A0m(view).A00;
        if (ftv != null) {
            RecyclerView recyclerView = c8103FTr.A00;
            int importantForAccessibility = ftv.A03;
            if (importantForAccessibility == -1) {
                importantForAccessibility = ftv.A0I.getImportantForAccessibility();
            }
            ftv.A06 = importantForAccessibility;
            if (recyclerView.A03 <= 0) {
                ftv.A0I.setImportantForAccessibility(4);
            } else {
                ftv.A03 = 4;
                recyclerView.A1A.add(ftv);
            }
        }
    }

    public static void A03(View view, FTW ftw) {
        if (ftw.A04.remove(view)) {
            ftw.A03.ATo(view);
        }
    }

    public final int A04() {
        return ((C8103FTr) this.A03).A00.getChildCount() - this.A04.size();
    }

    public final int A05() {
        return ((C8103FTr) this.A03).A00.getChildCount();
    }

    public final int A06(View view) {
        int iIndexOfChild = ((C8103FTr) this.A03).A00.indexOfChild(view);
        if (iIndexOfChild == -1) {
            return -1;
        }
        C8107FTw c8107FTw = this.A02;
        if (c8107FTw.A06(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - c8107FTw.A01(iIndexOfChild);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A09(View view, int i, boolean z) {
        HsM hsMA0D;
        C7782FEm c7782FEm;
        C7782FEm c7782FEm2;
        FCA fcaA0m;
        int childCount = i < 0 ? ((C8103FTr) this.A03).A00.getChildCount() : A00(this, i);
        this.A02.A05(childCount, z);
        if (z) {
            A02(view, this);
        }
        RecyclerView recyclerView = ((C8103FTr) this.A03).A00;
        recyclerView.addView(view, childCount);
        float f = RecyclerView.A1J;
        FTV ftv = AbstractC7607F5u.A0m(view).A00;
        AbstractC8091FSx abstractC8091FSx = recyclerView.A0F;
        if (abstractC8091FSx == null || ftv == null || !(abstractC8091FSx instanceof FF9)) {
            return;
        }
        FF9 ff9 = (FF9) abstractC8091FSx;
        FFD ffd = (FFD) ftv;
        FES fes = ff9.A01;
        if (fes != null) {
            FFC ffc = (FFC) ffd;
            C7384Etj.A0Y(ffc, 0);
            fes.A00.A08(((C7782FEm) ((FFD) ffc).A00).A01.A04, ffc);
            ffc.A03 = true;
            if (ffc.A02 && (c7782FEm = ffc.A01) != null && (c7782FEm2 = ffc.A00) != null && (fcaA0m = AbstractC7610F5x.A0m(fes.A01)) != null) {
                ffc.A02 = false;
                ffc.A01 = null;
                ffc.A00 = null;
                if (!c7782FEm2.A00(c7782FEm) || FES.A00(c7782FEm2, c7782FEm, ffc, fes, fcaA0m)) {
                    View view2 = ffc.A0I;
                    C7384Etj.A0Z(view2, "null cannot be cast to non-null type com.instagram.common.bloks.BloksRenderTreeHostView");
                    ((FGR) view2).setMountInput(c7782FEm.A00.A00().A01);
                }
            }
        }
        FFB ffb = ff9.A00;
        C7384Etj.A0Y(ffd, 0);
        FDW fdwA0C = ((C7782FEm) ffd.A00).A01.A0C(132);
        if (fdwA0C == null || fdwA0C.A05 != 13366 || (hsMA0D = fdwA0C.A0D(38)) == null) {
            return;
        }
        C6979Edd.A00();
        FFA ffa = ffb.A01;
        ffa.sendMessage(ffa.obtainMessage(0, hsMA0D));
    }

    public final void A0A(View view, ViewGroup.LayoutParams layoutParams, int i, boolean z) {
        int childCount = i < 0 ? ((C8103FTr) this.A03).A00.getChildCount() : A00(this, i);
        this.A02.A05(childCount, z);
        if (z) {
            A02(view, this);
        }
        C8103FTr c8103FTr = (C8103FTr) this.A03;
        float f = RecyclerView.A1J;
        FTV ftv = AbstractC7607F5u.A0m(view).A00;
        if (ftv != null) {
            if (!AnonymousClass002.A1L(ftv.A00 & 256) && !AnonymousClass002.A1L(ftv.A00 & 128)) {
                throw C8j3.A0w(c8103FTr.A00.A0j(), C3cG.A0f(ftv, "Called attach on a child which is not detached: "));
            }
            if (RecyclerView.A1I) {
                Log.d("RecyclerView", AnonymousClass007.A0a("reAttach ", ftv));
            }
            ftv.A00 &= -257;
        } else if (RecyclerView.A1H) {
            StringBuilder sbA0f = C3cG.A0f(view, "No ViewHolder found for child: ");
            sbA0f.append(", index: ");
            sbA0f.append(childCount);
            throw C8j3.A0w(c8103FTr.A00.A0j(), sbA0f);
        }
        c8103FTr.A00.attachViewToParent(view, childCount, layoutParams);
    }

    public final String toString() {
        return FGI.A0S(this.A02.toString(), ", hidden list:", this.A04.size());
    }

    public FTW(FUJ fuj) {
        this.A03 = fuj;
    }

    public final View A07(int i) {
        return ((C8103FTr) this.A03).A00.getChildAt(A00(this, i));
    }

    public final void A08(int i) {
        int iA00 = A00(this, i);
        this.A02.A07(iA00);
        RecyclerView recyclerView = ((C8103FTr) this.A03).A00;
        View childAt = recyclerView.getChildAt(iA00);
        if (childAt != null) {
            float f = RecyclerView.A1J;
            FTV ftv = AbstractC7607F5u.A0m(childAt).A00;
            if (ftv != null) {
                if (AnonymousClass002.A1L(ftv.A00 & 256) && !AnonymousClass002.A1L(ftv.A00 & 128)) {
                    throw C8j3.A0w(recyclerView.A0j(), C3cG.A0f(ftv, "called detach on an already detached child "));
                }
                if (RecyclerView.A1I) {
                    Log.d("RecyclerView", AnonymousClass007.A0a("tmpDetach ", ftv));
                }
                ftv.A00 = 256 | ftv.A00;
            }
        } else if (RecyclerView.A1H) {
            throw BV5.A0S("No view at offset ", recyclerView.A0j(), iA00);
        }
        recyclerView.detachViewFromParent(iA00);
    }
}
