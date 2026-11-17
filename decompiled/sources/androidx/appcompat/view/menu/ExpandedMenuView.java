package androidx.appcompat.view.menu;

import X.C8140FWd;
import X.C8249FaR;
import X.C8252FaX;
import X.InterfaceC8336Fc3;
import X.InterfaceC8337Fc4;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* loaded from: classes6.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC8336Fc3, AdapterView.OnItemClickListener, InterfaceC8337Fc4 {
    public static final int[] A01 = {R.attr.background, R.attr.divider};
    public C8249FaR A00;

    @Override // X.InterfaceC8337Fc4
    public final void ANe(C8249FaR c8249FaR) {
        this.A00 = c8249FaR;
    }

    @Override // X.InterfaceC8336Fc3
    public final boolean AO1(C8252FaX c8252FaX) {
        return this.A00.A0I(c8252FaX, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AO1((C8252FaX) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C8140FWd c8140FWdA00 = C8140FWd.A00(context, attributeSet, A01, i, 0);
        TypedArray typedArray = c8140FWdA00.A02;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(c8140FWdA00.A02(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(c8140FWdA00.A02(1));
        }
        typedArray.recycle();
    }
}
