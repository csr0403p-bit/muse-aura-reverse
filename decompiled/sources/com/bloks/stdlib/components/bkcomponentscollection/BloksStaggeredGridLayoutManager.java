package com.bloks.stdlib.components.bkcomponentscollection;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes6.dex */
public final class BloksStaggeredGridLayoutManager extends StaggeredGridLayoutManager {
    public boolean A00;

    public static final boolean A00(View view, BloksStaggeredGridLayoutManager bloksStaggeredGridLayoutManager) {
        Object parent = view.getParent();
        if (parent instanceof RecyclerView) {
            return true;
        }
        if (parent instanceof View) {
            return A00((View) parent, bloksStaggeredGridLayoutManager);
        }
        return false;
    }
}
