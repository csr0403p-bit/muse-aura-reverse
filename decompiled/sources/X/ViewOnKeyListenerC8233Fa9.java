package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.aura.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fa9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnKeyListenerC8233Fa9 extends AbstractC8231Fa7 implements InterfaceC8291FbF, PopupWindow.OnDismissListener, View.OnKeyListener {
    public int A01;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public ViewTreeObserver A07;
    public PopupWindow.OnDismissListener A08;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public InterfaceC8331Fby A0E;
    public final int A0F;
    public final int A0G;
    public final Context A0H;
    public final Handler A0I;
    public final int A0N;
    public final boolean A0P;
    public final List<C8249FaR> A0L = C3cG.A0h();
    public final List<C8319Fbl> A0M = C3cG.A0h();
    public final ViewTreeObserver.OnGlobalLayoutListener A0J = new I14(this, 0);
    public final View.OnAttachStateChangeListener A0O = new I0U(this, 0);
    public final InterfaceC8323Fbp A0K = new C8241FaH(this);
    public int A02 = 0;
    public int A00 = 0;
    public boolean A09 = false;

    public static void A01(ViewOnKeyListenerC8233Fa9 viewOnKeyListenerC8233Fa9, C8249FaR c8249FaR) {
        C8319Fbl c8319Fbl;
        View childAt;
        C8232Fa8 c8232Fa8;
        int headersCount;
        int firstVisiblePosition;
        Context context = viewOnKeyListenerC8233Fa9.A0H;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C8232Fa8 c8232Fa82 = new C8232Fa8(layoutInflaterFrom, c8249FaR, R.layout._name_removed__res_0x7f0d0008, viewOnKeyListenerC8233Fa9.A0P);
        if (!viewOnKeyListenerC8233Fa9.AP1() && viewOnKeyListenerC8233Fa9.A09) {
            c8232Fa82.A01 = true;
        } else if (viewOnKeyListenerC8233Fa9.AP1()) {
            int size = c8249FaR.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = c8249FaR.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            c8232Fa82.A01 = z;
        }
        int iA00 = AbstractC8231Fa7.A00(context, c8232Fa82, viewOnKeyListenerC8233Fa9.A0N);
        C8293FbI c8293FbI = new C8293FbI(context, null, viewOnKeyListenerC8233Fa9.A0F, viewOnKeyListenerC8233Fa9.A0G);
        c8293FbI.A00 = viewOnKeyListenerC8233Fa9.A0K;
        c8293FbI.A07 = viewOnKeyListenerC8233Fa9;
        PopupWindow popupWindow = c8293FbI.A09;
        popupWindow.setOnDismissListener(viewOnKeyListenerC8233Fa9);
        c8293FbI.A06 = viewOnKeyListenerC8233Fa9.A05;
        ((FZZ) c8293FbI).A00 = viewOnKeyListenerC8233Fa9.A00;
        c8293FbI.A0D = true;
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(2);
        c8293FbI.Aci(c8232Fa82);
        c8293FbI.A00(iA00);
        ((FZZ) c8293FbI).A00 = viewOnKeyListenerC8233Fa9.A00;
        List<C8319Fbl> list = viewOnKeyListenerC8233Fa9.A0M;
        if (list.size() > 0) {
            c8319Fbl = list.get(AbstractC7607F5u.A0J(list, 1));
            C8249FaR c8249FaR2 = c8319Fbl.A01;
            int size2 = c8249FaR2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                MenuItem item2 = c8249FaR2.getItem(i2);
                if (item2.hasSubMenu() && c8249FaR == item2.getSubMenu()) {
                    FYL fyl = c8319Fbl.A02.A0A;
                    ListAdapter adapter = fyl.getAdapter();
                    int i3 = 0;
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        headersCount = headerViewListAdapter.getHeadersCount();
                        c8232Fa8 = (C8232Fa8) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        c8232Fa8 = (C8232Fa8) adapter;
                        headersCount = 0;
                    }
                    int count = c8232Fa8.getCount();
                    while (true) {
                        if (i3 >= count) {
                            break;
                        }
                        if (item2 != c8232Fa8.getItem(i3)) {
                            i3++;
                        } else if (i3 == -1 || (firstVisiblePosition = (i3 + headersCount) - fyl.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= fyl.getChildCount()) {
                            break;
                        } else {
                            childAt = fyl.getChildAt(firstVisiblePosition);
                        }
                    }
                } else {
                    i2++;
                }
            }
            childAt = null;
        } else {
            c8319Fbl = null;
            childAt = null;
        }
        if (childAt != null) {
            popupWindow.setTouchModal(false);
            popupWindow.setEnterTransition(null);
            FYL fyl2 = list.get(AbstractC7607F5u.A0J(list, 1)).A02.A0A;
            int[] iArr = new int[2];
            fyl2.getLocationOnScreen(iArr);
            Rect rectA0X = AbstractC7607F5u.A0X();
            viewOnKeyListenerC8233Fa9.A06.getWindowVisibleDisplayFrame(rectA0X);
            int i4 = (viewOnKeyListenerC8233Fa9.A01 != 1 ? iArr[0] - iA00 >= 0 : (iArr[0] + fyl2.getWidth()) + iA00 > rectA0X.right) ? 0 : 1;
            viewOnKeyListenerC8233Fa9.A01 = i4;
            c8293FbI.A06 = childAt;
            if ((viewOnKeyListenerC8233Fa9.A00 & 5) == 5) {
                if (i4 == 0) {
                    iA00 = childAt.getWidth();
                }
                c8293FbI.A01 = iA00;
                c8293FbI.A0F = true;
                c8293FbI.A0E = true;
                c8293FbI.AfB(0);
            } else {
                iA00 = i4 != 0 ? childAt.getWidth() : -iA00;
                c8293FbI.A01 = iA00;
                c8293FbI.A0F = true;
                c8293FbI.A0E = true;
                c8293FbI.AfB(0);
            }
        } else {
            if (viewOnKeyListenerC8233Fa9.A0A) {
                c8293FbI.A01 = viewOnKeyListenerC8233Fa9.A03;
            }
            if (viewOnKeyListenerC8233Fa9.A0B) {
                c8293FbI.AfB(viewOnKeyListenerC8233Fa9.A04);
            }
            Rect rect = ((AbstractC8231Fa7) viewOnKeyListenerC8233Fa9).A00;
            c8293FbI.A05 = rect != null ? new Rect(rect) : null;
        }
        list.add(new C8319Fbl(c8249FaR, c8293FbI, viewOnKeyListenerC8233Fa9.A01));
        c8293FbI.Afd();
        FYL fyl3 = c8293FbI.A0A;
        fyl3.setOnKeyListener(viewOnKeyListenerC8233Fa9);
        if (c8319Fbl == null && viewOnKeyListenerC8233Fa9.A0D && c8249FaR.A05 != null) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout._name_removed__res_0x7f0d000f, (ViewGroup) fyl3, false);
            TextView textView = (TextView) viewInflate.findViewById(android.R.id.title);
            viewInflate.setEnabled(false);
            textView.setText(c8249FaR.A05);
            fyl3.addHeaderView(viewInflate, null, false);
            c8293FbI.Afd();
        }
    }

    @Override // X.InterfaceC8291FbF
    public final boolean ABf() {
        return false;
    }

    @Override // X.FZD
    public final FYL AH8() {
        List<C8319Fbl> list = this.A0M;
        if (list.isEmpty()) {
            return null;
        }
        return ((C8319Fbl) BV5.A0e(list)).A02.A0A;
    }

    @Override // X.FZD
    public final boolean AP1() {
        List<C8319Fbl> list = this.A0M;
        return list.size() > 0 && list.get(0).A02.A09.isShowing();
    }

    @Override // X.InterfaceC8291FbF
    public final void ASE(C8249FaR c8249FaR, boolean z) {
        List<C8319Fbl> list = this.A0M;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (c8249FaR == list.get(i).A01) {
                if (i >= 0) {
                    int i2 = i + 1;
                    if (i2 < list.size()) {
                        list.get(i2).A01.A0C(false);
                    }
                    C8319Fbl c8319FblRemove = list.remove(i);
                    c8319FblRemove.A01.A0B(this);
                    if (this.A0C) {
                        PopupWindow popupWindow = c8319FblRemove.A02.A09;
                        popupWindow.setExitTransition(null);
                        popupWindow.setAnimationStyle(0);
                    }
                    c8319FblRemove.A02.dismiss();
                    int size2 = list.size();
                    if (size2 > 0) {
                        this.A01 = list.get(size2 - 1).A00;
                    } else {
                        this.A01 = this.A05.getLayoutDirection() == 1 ? 0 : 1;
                        if (size2 == 0) {
                            dismiss();
                            InterfaceC8331Fby interfaceC8331Fby = this.A0E;
                            if (interfaceC8331Fby != null) {
                                interfaceC8331Fby.ASE(c8249FaR, true);
                            }
                            ViewTreeObserver viewTreeObserver = this.A07;
                            if (viewTreeObserver != null) {
                                if (viewTreeObserver.isAlive()) {
                                    this.A07.removeGlobalOnLayoutListener(this.A0J);
                                }
                                this.A07 = null;
                            }
                            this.A06.removeOnAttachStateChangeListener(this.A0O);
                            this.A08.onDismiss();
                            return;
                        }
                    }
                    if (z) {
                        list.get(0).A01.A0C(false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // X.InterfaceC8291FbF
    public final boolean AWM(SubMenuC8248FaQ subMenuC8248FaQ) {
        Iterator<C8319Fbl> it = this.A0M.iterator();
        while (true) {
            if (it.hasNext()) {
                C8319Fbl next = it.next();
                if (subMenuC8248FaQ == next.A01) {
                    next.A02.A0A.requestFocus();
                    break;
                }
            } else {
                if (!subMenuC8248FaQ.hasVisibleItems()) {
                    return false;
                }
                subMenuC8248FaQ.A08(this.A0H, this);
                if (AP1()) {
                    A01(this, subMenuC8248FaQ);
                } else {
                    this.A0L.add(subMenuC8248FaQ);
                }
                InterfaceC8331Fby interfaceC8331Fby = this.A0E;
                if (interfaceC8331Fby != null) {
                    interfaceC8331Fby.AUQ(subMenuC8248FaQ);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC8291FbF
    public final void Acz(InterfaceC8331Fby interfaceC8331Fby) {
        this.A0E = interfaceC8331Fby;
    }

    @Override // X.InterfaceC8291FbF
    public final void Ahy() {
        Iterator<C8319Fbl> it = this.A0M.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = it.next().A02.A0A.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C8232Fa8) adapter).notifyDataSetChanged();
        }
    }

    @Override // X.FZD
    public final void dismiss() {
        List<C8319Fbl> list = this.A0M;
        int size = list.size();
        if (size <= 0) {
            return;
        }
        C8319Fbl[] c8319FblArr = (C8319Fbl[]) list.toArray(new C8319Fbl[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C8319Fbl c8319Fbl = c8319FblArr[size];
            if (c8319Fbl.A02.A09.isShowing()) {
                c8319Fbl.A02.dismiss();
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        List<C8319Fbl> list = this.A0M;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C8319Fbl c8319Fbl = list.get(i);
            if (!c8319Fbl.A02.A09.isShowing()) {
                c8319Fbl.A01.A0C(false);
                return;
            }
        }
    }

    public ViewOnKeyListenerC8233Fa9(Context context, View view, int i, int i2, boolean z) {
        this.A0H = context;
        this.A05 = view;
        this.A0F = i;
        this.A0G = i2;
        this.A0P = z;
        this.A01 = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.A0N = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen._name_removed__res_0x7f07000d));
        this.A0I = new Handler();
    }

    @Override // X.FZD
    public final void Afd() {
        if (AP1()) {
            return;
        }
        List<C8249FaR> list = this.A0L;
        Iterator<C8249FaR> it = list.iterator();
        while (it.hasNext()) {
            A01(this, it.next());
        }
        list.clear();
        View view = this.A05;
        this.A06 = view;
        if (view != null) {
            boolean zA1Y = AnonymousClass002.A1Y(this.A07);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.A07 = viewTreeObserver;
            if (zA1Y) {
                viewTreeObserver.addOnGlobalLayoutListener(this.A0J);
            }
            this.A06.addOnAttachStateChangeListener(this.A0O);
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
