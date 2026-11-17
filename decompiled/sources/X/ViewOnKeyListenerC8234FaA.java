package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.aura.R;

/* renamed from: X.FaA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnKeyListenerC8234FaA extends AbstractC8231Fa7 implements InterfaceC8291FbF, PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {
    public int A00;
    public View A02;
    public View A03;
    public ViewTreeObserver A04;
    public PopupWindow.OnDismissListener A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public InterfaceC8331Fby A09;
    public final int A0A;
    public final Context A0B;
    public final C8232Fa8 A0E;
    public final C8249FaR A0F;
    public final C8293FbI A0G;
    public final int A0H;
    public final int A0I;
    public final boolean A0J;
    public final ViewTreeObserver.OnGlobalLayoutListener A0D = new I14(this, 1);
    public final View.OnAttachStateChangeListener A0C = new I0U(this, 1);
    public int A01 = 0;

    @Override // X.InterfaceC8291FbF
    public final void Ahy() {
        this.A06 = false;
        C8232Fa8 c8232Fa8 = this.A0E;
        if (c8232Fa8 != null) {
            c8232Fa8.notifyDataSetChanged();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.A08 = true;
        this.A0F.close();
        ViewTreeObserver viewTreeObserver = this.A04;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A04 = this.A03.getViewTreeObserver();
            }
            this.A04.removeGlobalOnLayoutListener(this.A0D);
            this.A04 = null;
        }
        this.A03.removeOnAttachStateChangeListener(this.A0C);
        PopupWindow.OnDismissListener onDismissListener = this.A05;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // X.InterfaceC8291FbF
    public final boolean ABf() {
        return false;
    }

    @Override // X.FZD
    public final FYL AH8() {
        return this.A0G.A0A;
    }

    @Override // X.FZD
    public final boolean AP1() {
        return !this.A08 && this.A0G.A09.isShowing();
    }

    @Override // X.InterfaceC8291FbF
    public final void ASE(C8249FaR c8249FaR, boolean z) {
        if (c8249FaR == this.A0F) {
            dismiss();
            InterfaceC8331Fby interfaceC8331Fby = this.A09;
            if (interfaceC8331Fby != null) {
                interfaceC8331Fby.ASE(c8249FaR, z);
            }
        }
    }

    @Override // X.InterfaceC8291FbF
    public final boolean AWM(SubMenuC8248FaQ subMenuC8248FaQ) {
        if (!subMenuC8248FaQ.hasVisibleItems()) {
            return false;
        }
        C8236FaC c8236FaC = new C8236FaC(this.A0B, this.A03, subMenuC8248FaQ, this.A0H, this.A0I, this.A0J);
        InterfaceC8331Fby interfaceC8331Fby = this.A09;
        c8236FaC.A04 = interfaceC8331Fby;
        AbstractC8231Fa7 abstractC8231Fa7 = c8236FaC.A03;
        if (abstractC8231Fa7 != null) {
            abstractC8231Fa7.Acz(interfaceC8331Fby);
        }
        int size = subMenuC8248FaQ.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = subMenuC8248FaQ.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        c8236FaC.A05 = z;
        AbstractC8231Fa7 abstractC8231Fa72 = c8236FaC.A03;
        if (abstractC8231Fa72 != null) {
            abstractC8231Fa72.A02(z);
        }
        c8236FaC.A02 = this.A05;
        this.A05 = null;
        this.A0F.A0C(false);
        C8293FbI c8293FbI = this.A0G;
        int width = c8293FbI.A01;
        int iAMc = c8293FbI.AMc();
        if ((Gravity.getAbsoluteGravity(this.A01, this.A02.getLayoutDirection()) & 7) == 5) {
            width += this.A02.getWidth();
        }
        AbstractC8231Fa7 abstractC8231Fa73 = c8236FaC.A03;
        if (abstractC8231Fa73 == null || !abstractC8231Fa73.AP1()) {
            if (c8236FaC.A01 == null) {
                return false;
            }
            AbstractC8231Fa7 abstractC8231Fa7A00 = c8236FaC.A00();
            boolean z2 = abstractC8231Fa7A00 instanceof ViewOnKeyListenerC8234FaA;
            if (z2) {
                ((ViewOnKeyListenerC8234FaA) abstractC8231Fa7A00).A07 = true;
            } else {
                ((ViewOnKeyListenerC8233Fa9) abstractC8231Fa7A00).A0D = true;
            }
            if ((Gravity.getAbsoluteGravity(c8236FaC.A00, c8236FaC.A01.getLayoutDirection()) & 7) == 5) {
                width -= c8236FaC.A01.getWidth();
            }
            if (z2) {
                ((ViewOnKeyListenerC8234FaA) abstractC8231Fa7A00).A0G.A01 = width;
            } else {
                ViewOnKeyListenerC8233Fa9 viewOnKeyListenerC8233Fa9 = (ViewOnKeyListenerC8233Fa9) abstractC8231Fa7A00;
                viewOnKeyListenerC8233Fa9.A0A = true;
                viewOnKeyListenerC8233Fa9.A03 = width;
            }
            if (z2) {
                ((ViewOnKeyListenerC8234FaA) abstractC8231Fa7A00).A0G.AfB(iAMc);
            } else {
                ViewOnKeyListenerC8233Fa9 viewOnKeyListenerC8233Fa92 = (ViewOnKeyListenerC8233Fa9) abstractC8231Fa7A00;
                viewOnKeyListenerC8233Fa92.A0B = true;
                viewOnKeyListenerC8233Fa92.A04 = iAMc;
            }
            int i2 = (int) ((C60Q.A0B(c8236FaC.A08).density * 48.0f) / 2.0f);
            abstractC8231Fa7A00.A00 = new Rect(width - i2, iAMc - i2, width + i2, iAMc + i2);
            abstractC8231Fa7A00.Afd();
        }
        InterfaceC8331Fby interfaceC8331Fby2 = this.A09;
        if (interfaceC8331Fby2 != null) {
            interfaceC8331Fby2.AUQ(subMenuC8248FaQ);
        }
        return true;
    }

    @Override // X.InterfaceC8291FbF
    public final void Acz(InterfaceC8331Fby interfaceC8331Fby) {
        this.A09 = interfaceC8331Fby;
    }

    public ViewOnKeyListenerC8234FaA(Context context, View view, C8249FaR c8249FaR, int i, int i2, boolean z) {
        this.A0B = context;
        this.A0F = c8249FaR;
        this.A0J = z;
        this.A0E = new C8232Fa8(LayoutInflater.from(context), c8249FaR, R.layout._name_removed__res_0x7f0d0010, z);
        this.A0H = i;
        this.A0I = i2;
        Resources resources = context.getResources();
        this.A0A = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen._name_removed__res_0x7f07000d));
        this.A02 = view;
        this.A0G = new C8293FbI(context, null, i, i2);
        c8249FaR.A08(context, this);
    }

    @Override // X.FZD
    public final void Afd() {
        View view;
        if (AP1()) {
            return;
        }
        if (this.A08 || (view = this.A02) == null) {
            throw C3cG.A0Q("StandardMenuPopup cannot be used without an anchor");
        }
        this.A03 = view;
        C8293FbI c8293FbI = this.A0G;
        PopupWindow popupWindow = c8293FbI.A09;
        popupWindow.setOnDismissListener(this);
        c8293FbI.A07 = this;
        c8293FbI.A0D = true;
        popupWindow.setFocusable(true);
        View view2 = this.A03;
        boolean zA1Y = AnonymousClass002.A1Y(this.A04);
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A04 = viewTreeObserver;
        if (zA1Y) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0D);
        }
        view2.addOnAttachStateChangeListener(this.A0C);
        c8293FbI.A06 = view2;
        ((FZZ) c8293FbI).A00 = this.A01;
        if (!this.A06) {
            this.A00 = AbstractC8231Fa7.A00(this.A0B, this.A0E, this.A0A);
            this.A06 = true;
        }
        c8293FbI.A00(this.A00);
        popupWindow.setInputMethodMode(2);
        Rect rect = super.A00;
        c8293FbI.A05 = rect != null ? new Rect(rect) : null;
        c8293FbI.Afd();
        FYL fyl = c8293FbI.A0A;
        fyl.setOnKeyListener(this);
        if (this.A07) {
            C8249FaR c8249FaR = this.A0F;
            if (c8249FaR.A05 != null) {
                View viewInflate = LayoutInflater.from(this.A0B).inflate(R.layout._name_removed__res_0x7f0d000f, (ViewGroup) fyl, false);
                TextView textView = (TextView) viewInflate.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(c8249FaR.A05);
                }
                viewInflate.setEnabled(false);
                fyl.addHeaderView(viewInflate, null, false);
            }
        }
        c8293FbI.Aci(this.A0E);
        c8293FbI.Afd();
    }

    @Override // X.FZD
    public final void dismiss() {
        if (AP1()) {
            this.A0G.dismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
