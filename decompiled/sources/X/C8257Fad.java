package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;

/* renamed from: X.Fad, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8257Fad implements InterfaceC8291FbF {
    public C8249FaR A00;
    public C8252FaX A01;
    public final /* synthetic */ Toolbar A02;

    public C8257Fad(Toolbar toolbar) {
        this.A02 = toolbar;
    }

    @Override // X.InterfaceC8291FbF
    public final boolean A6W(C8252FaX c8252FaX) {
        Toolbar toolbar = this.A02;
        KeyEvent.Callback callback = toolbar.A04;
        if (callback instanceof InterfaceC8341FcE) {
            ((C8294FbJ) ((InterfaceC8341FcE) callback)).A00.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.A04);
        toolbar.removeView(toolbar.A05);
        toolbar.A04 = null;
        ArrayList<View> arrayList = toolbar.A0g;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.A01 = null;
                toolbar.requestLayout();
                c8252FaX.A0G = false;
                c8252FaX.A0B.A0D(false);
                toolbar.A0F();
                return true;
            }
            toolbar.addView(AbstractC7607F5u.A0d(arrayList, size));
        }
    }

    @Override // X.InterfaceC8291FbF
    public final boolean ABB(C8252FaX c8252FaX) {
        Toolbar toolbar = this.A02;
        toolbar.A0D();
        ViewParent parent = toolbar.A05.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.A05);
            }
            toolbar.addView(toolbar.A05);
        }
        View actionView = c8252FaX.getActionView();
        toolbar.A04 = actionView;
        this.A01 = c8252FaX;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.A04);
            }
            C8318Fbk c8318Fbk = new C8318Fbk(-2);
            ((AbstractC8339Fc7) c8318Fbk).A00 = (toolbar.A00 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8388611;
            c8318Fbk.A00 = 2;
            toolbar.A04.setLayoutParams(c8318Fbk);
            toolbar.addView(toolbar.A04);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((C8318Fbk) childAt.getLayoutParams()).A00 != 2 && childAt != toolbar.A0A) {
                toolbar.removeViewAt(childCount);
                toolbar.A0g.add(childAt);
            }
        }
        toolbar.requestLayout();
        c8252FaX.A0G = true;
        C8252FaX.A00(c8252FaX);
        KeyEvent.Callback callback = toolbar.A04;
        if (callback instanceof InterfaceC8341FcE) {
            ((C8294FbJ) ((InterfaceC8341FcE) callback)).A00.onActionViewExpanded();
        }
        toolbar.A0F();
        return true;
    }

    @Override // X.InterfaceC8291FbF
    public final boolean ABf() {
        return false;
    }

    @Override // X.InterfaceC8291FbF
    public final void ANd(Context context, C8249FaR c8249FaR) {
        C8252FaX c8252FaX;
        C8249FaR c8249FaR2 = this.A00;
        if (c8249FaR2 != null && (c8252FaX = this.A01) != null) {
            c8249FaR2.A0J(c8252FaX);
        }
        this.A00 = c8249FaR;
    }

    @Override // X.InterfaceC8291FbF
    public final boolean AWM(SubMenuC8248FaQ subMenuC8248FaQ) {
        return false;
    }

    @Override // X.InterfaceC8291FbF
    public final void Ahy() {
        C8252FaX c8252FaX = this.A01;
        if (c8252FaX != null) {
            C8249FaR c8249FaR = this.A00;
            if (c8249FaR != null) {
                int size = c8249FaR.size();
                for (int i = 0; i < size; i++) {
                    if (c8249FaR.getItem(i) == c8252FaX) {
                        return;
                    }
                }
            }
            A6W(c8252FaX);
        }
    }

    @Override // X.InterfaceC8291FbF
    public final void Acz(InterfaceC8331Fby interfaceC8331Fby) {
        throw F60.createAndThrow();
    }

    @Override // X.InterfaceC8291FbF
    public final void ASE(C8249FaR c8249FaR, boolean z) {
    }
}
