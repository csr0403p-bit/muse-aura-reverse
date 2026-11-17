package X;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import kotlin.Unit;

/* renamed from: X.AkU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC1520AkU extends AbstractC1439Aj8 implements InterfaceC1449AjI, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View A00;
    public ViewTreeObserver A01;
    public final G0U<InterfaceC1535Akr, Unit> A02 = new C2326BUa(this, 7);
    public final G0U<InterfaceC1535Akr, Unit> A03 = new C2326BUa(this, 8);

    @Override // X.InterfaceC1449AjI
    public final void A4V(AkZ akZ) {
        akZ.Ad0(false);
        akZ.Ads(this.A02);
        akZ.Adu(this.A03);
    }

    private final C1506AkD A00() {
        AbstractC1439Aj8 abstractC1439Aj8 = this.node;
        if (!abstractC1439Aj8.isAttached) {
            ASP.A01("visitLocalDescendants called on an unattached node");
            throw F60.createAndThrow();
        }
        if ((abstractC1439Aj8.aggregateChildKindSet & 1024) != 0) {
            boolean z = false;
            for (AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8.child; abstractC1439Aj82 != null; abstractC1439Aj82 = abstractC1439Aj82.child) {
                if ((abstractC1439Aj82.kindSet & 1024) != 0) {
                    C0910AHm c0910AHmA0K = null;
                    AbstractC1439Aj8 abstractC1439Aj8A0X = abstractC1439Aj82;
                    do {
                        if (abstractC1439Aj8A0X instanceof C1506AkD) {
                            C1506AkD c1506AkD = (C1506AkD) abstractC1439Aj8A0X;
                            if (z) {
                                return c1506AkD;
                            }
                            z = true;
                        } else if ((abstractC1439Aj8A0X.kindSet & 1024) != 0 && (abstractC1439Aj8A0X instanceof AbstractC1437Aj6)) {
                            int i = 0;
                            for (AbstractC1439Aj8 abstractC1439Aj83 = ((AbstractC1437Aj6) abstractC1439Aj8A0X).A00; abstractC1439Aj83 != null; abstractC1439Aj83 = abstractC1439Aj83.child) {
                                if ((abstractC1439Aj83.kindSet & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC1439Aj8A0X = abstractC1439Aj83;
                                    } else {
                                        c0910AHmA0K = C8j5.A0K(c0910AHmA0K);
                                        abstractC1439Aj8A0X = C8j4.A0X(c0910AHmA0K, abstractC1439Aj8A0X);
                                        c0910AHmA0K.A0G(abstractC1439Aj83);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC1439Aj8A0X = AbstractC1414Aij.A00(c0910AHmA0K);
                    } while (abstractC1439Aj8A0X != null);
                }
            }
        }
        throw C3cG.A0Q("Could not find focus target of embedded view wrapper");
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        ViewTreeObserver viewTreeObserver = this.A01;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.A01 = null;
        AbstractC1329AhG.A00(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.A00 = null;
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        ViewTreeObserver viewTreeObserver = AbstractC1329AhG.A00(this).getViewTreeObserver();
        this.A01 = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        boolean z2;
        if (AbstractC1414Aij.A04(this).A0D != null) {
            View viewA00 = AkV.A00(this);
            InterfaceC1536Aks interfaceC1536AksA01 = AbstractC1414Aij.A01(this);
            InterfaceC1464AjX interfaceC1464AjXA07 = AbstractC1414Aij.A07(this);
            if (view == null || view.equals(interfaceC1464AjXA07)) {
                z = false;
            } else {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == viewA00.getParent()) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            if (view2 == null || view2.equals(interfaceC1464AjXA07)) {
                z2 = false;
            } else {
                for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                    if (parent2 == viewA00.getParent()) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            }
            if (z) {
                if (!z2) {
                }
                this.A00 = view2;
            } else if (z2) {
                this.A00 = view2;
                C1506AkD c1506AkDA00 = A00();
                if (c1506AkDA00.A03().AG5()) {
                    return;
                }
                AbstractC1507AkE.A01(c1506AkDA00);
                return;
            }
            view2 = null;
            if (z) {
                this.A00 = null;
                if (A00().A03().AOS()) {
                    interfaceC1536AksA01.A6H(8, false, true, false);
                    return;
                }
                return;
            }
            this.A00 = view2;
        }
    }
}
