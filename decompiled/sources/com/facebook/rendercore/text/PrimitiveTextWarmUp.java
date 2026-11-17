package com.facebook.rendercore.text;

import X.AbstractC7608F5v;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7867FIf;
import X.C7907FKc;
import X.FFH;
import X.FI1;
import X.FI8;
import X.FIK;
import X.FJ0;
import X.FKW;
import X.FKX;
import X.FYY;
import X.Hnn;
import X.Hx0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class PrimitiveTextWarmUp {
    public static final AtomicBoolean A00 = C60O.A1E();
    public static volatile Object A01;

    public static final void warmUp(Context context) {
        C7384Etj.A0Y(context, 0);
        if (A00.compareAndSet(false, true)) {
            try {
                FKW fkw = new FKW();
                fkw.A0Q = 42;
                boolean zAON = A00(fkw).A00.AON(A00(fkw.A00()).A00);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1080, Integer.MIN_VALUE);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                SparseIntArray sparseIntArray = FKX.A00;
                boolean z = FFH.A00;
                Pair pairA02 = FKX.A02(context, fkw, "Warm up", iMakeMeasureSpec, iMakeMeasureSpec2);
                Rect rect = (Rect) pairA02.first;
                RCTextView rCTextView = new RCTextView(context);
                rCTextView.A06((C7907FKc) pairA02.second);
                AbstractC7608F5v.A1E(rCTextView, rect.height(), 1073741824, View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824));
                rCTextView.layout(0, 0, rect.width(), rect.height());
                rCTextView.draw(new Canvas(Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8)));
                rCTextView.A05();
                A01 = C3cG.A0r(Boolean.valueOf(zAON), rect);
            } catch (Exception | LinkageError unused) {
                Hx0.A00();
            }
        }
    }

    public static final FIK A00(FKW fkw) {
        boolean z = FFH.A00;
        C7384Etj.A0Y(fkw, 2);
        return new FIK(new FI1(fkw), new C7867FIf(new FI8(Hnn.A00, FJ0.A00, 30), new FYY(), Long.MIN_VALUE));
    }
}
