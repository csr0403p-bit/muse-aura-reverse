package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* renamed from: X.Fa7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8231Fa7 implements FZD, InterfaceC8291FbF, AdapterView.OnItemClickListener {
    public Rect A00;

    public static int A00(Context context, ListAdapter listAdapter, int i) {
        FrameLayout frameLayout = null;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public final void A02(boolean z) {
        if (this instanceof ViewOnKeyListenerC8234FaA) {
            ((ViewOnKeyListenerC8234FaA) this).A0E.A01 = z;
        } else {
            ((ViewOnKeyListenerC8233Fa9) this).A09 = z;
        }
    }

    @Override // X.InterfaceC8291FbF
    public final boolean A6W(C8252FaX c8252FaX) {
        return false;
    }

    @Override // X.InterfaceC8291FbF
    public final boolean ABB(C8252FaX c8252FaX) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        ListAdapter wrappedAdapter = listAdapter;
        if (listAdapter instanceof HeaderViewListAdapter) {
            wrappedAdapter = ((HeaderViewListAdapter) wrappedAdapter).getWrappedAdapter();
        }
        ((C8232Fa8) wrappedAdapter).A00.A0I((MenuItem) listAdapter.getItem(i), this, this instanceof ViewOnKeyListenerC8233Fa9 ? 4 : 0);
    }

    @Override // X.InterfaceC8291FbF
    public final void ANd(Context context, C8249FaR c8249FaR) {
    }
}
