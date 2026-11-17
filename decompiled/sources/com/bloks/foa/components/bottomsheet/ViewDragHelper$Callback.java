package com.bloks.foa.components.bottomsheet;

import X.C3cG;
import X.FS7;
import X.FS8;
import X.FS9;
import X.FSC;
import X.FSE;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class ViewDragHelper$Callback {
    public final void A00(View view) {
        FS7 fs7 = ((FS9) this).A00;
        List<FSC> list = fs7.A0J;
        if (list.isEmpty()) {
            return;
        }
        Iterator<FSC> it = list.iterator();
        while (it.hasNext()) {
            it.next().AUm(view, fs7.getHeight());
        }
    }

    public final void A01(View view, float f) {
        FS9 fs9 = (FS9) this;
        if (view != null) {
            FS7 fs7 = fs9.A00;
            int height = fs7.getHeight();
            FS8 fs8 = fs7.A06;
            fs8.A0A.abortAnimation();
            fs8.A0A.fling(0, 0, 0, (int) f, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            int finalY = fs8.A0A.getFinalY();
            fs8.A0A.abortAnimation();
            int top = height - (view.getTop() + finalY);
            List<FSE> list = fs7.A08;
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            FSE fseA00 = FS7.A00(view, fs7, list, top, height);
            if (fseA00 != null) {
                fs7.A03 = fseA00;
                int iAIt = height - fseA00.AIt(view, height);
                try {
                    int i = fs7.A00;
                    if (!fs8.A0B) {
                        throw C3cG.A0Q("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
                    }
                    fs8.A07.getXVelocity(fs8.A02);
                    FS8.A07(fs8, iAIt, (int) fs8.A07.getYVelocity(fs8.A02), i);
                    fs7.postInvalidateOnAnimation();
                } catch (NullPointerException unused) {
                }
            }
        }
    }
}
