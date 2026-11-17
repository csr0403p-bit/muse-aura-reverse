package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* renamed from: X.Fa3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8230Fa3 extends FYL {
    public InterfaceC8323Fbp A00;
    public MenuItem A01;
    public final int A02;
    public final int A03;

    @Override // X.FYL, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C8232Fa8 c8232Fa8;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.A00 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                c8232Fa8 = (C8232Fa8) headerViewListAdapter.getWrappedAdapter();
            } else {
                c8232Fa8 = (C8232Fa8) adapter;
                headersCount = 0;
            }
            C8252FaX c8252FaXA01 = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c8232Fa8.getCount()) ? null : c8232Fa8.getItem(i);
            MenuItem menuItem = this.A01;
            if (menuItem != c8252FaXA01) {
                C8249FaR c8249FaR = c8232Fa8.A00;
                if (menuItem != null) {
                    this.A00.ATj(menuItem, c8249FaR);
                }
                this.A01 = c8252FaXA01;
                if (c8252FaXA01 != null) {
                    this.A00.ATi(c8252FaXA01, c8249FaR);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public void setHoverListener(InterfaceC8323Fbp interfaceC8323Fbp) {
        this.A00 = interfaceC8323Fbp;
    }

    public C8230Fa3(Context context, boolean z) {
        super(context, z);
        if (1 == C8j3.A0Z(context).getLayoutDirection()) {
            this.A02 = 21;
            this.A03 = 22;
        } else {
            this.A02 = 22;
            this.A03 = 21;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null) {
            if (i == this.A02) {
                if (listMenuItemView.isEnabled() && listMenuItemView.A03.hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (i == this.A03) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((C8232Fa8) adapter).A00.A0C(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.FYL, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
