package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes6.dex */
public class FZZ implements FZD {
    public int A01;
    public int A02;
    public Context A04;
    public Rect A05;
    public View A06;
    public AdapterView.OnItemClickListener A07;
    public ListAdapter A08;
    public PopupWindow A09;
    public FYL A0A;
    public Runnable A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public DataSetObserver A0G;
    public final Handler A0I;
    public int A03 = -2;
    public int A00 = 0;
    public final RunnableC8212FZf A0K = new RunnableC8212FZf(this);
    public final FZb A0M = new FZb(this);
    public final C8211FZe A0J = new C8211FZe(this);
    public final FZr A0L = new FZr(this);
    public final Rect A0H = AbstractC7607F5u.A0X();

    public final void A00(int i) {
        Drawable background = this.A09.getBackground();
        if (background == null) {
            this.A03 = i;
            return;
        }
        Rect rect = this.A0H;
        background.getPadding(rect);
        this.A03 = rect.left + rect.right + i;
    }

    public final Drawable ACj() {
        return this.A09.getBackground();
    }

    public final int AGH() {
        return this.A01;
    }

    @Override // X.FZD
    public final FYL AH8() {
        return this.A0A;
    }

    public final int AMc() {
        if (this.A0C) {
            return this.A02;
        }
        return 0;
    }

    @Override // X.FZD
    public final boolean AP1() {
        return this.A09.isShowing();
    }

    public void Aci(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.A0G;
        if (dataSetObserver == null) {
            this.A0G = new C8223FZq(this);
        } else {
            ListAdapter listAdapter2 = this.A08;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A08 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.A0G);
        }
        FYL fyl = this.A0A;
        if (fyl != null) {
            fyl.setAdapter(this.A08);
        }
    }

    public final void Acs(Drawable drawable) {
        this.A09.setBackgroundDrawable(drawable);
    }

    public final void AdU(int i) {
        this.A01 = i;
    }

    public final void AfB(int i) {
        this.A02 = i;
        this.A0C = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x013b A[PHI: r7
  0x013b: PHI (r7v1 int) = (r7v0 int), (r7v3 int) binds: [B:17:0x0081, B:19:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.FZD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Afd() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FZZ.Afd():void");
    }

    @Override // X.FZD
    public final void dismiss() {
        PopupWindow popupWindow = this.A09;
        popupWindow.dismiss();
        popupWindow.setContentView(null);
        this.A0A = null;
        this.A0I.removeCallbacks(this.A0K);
    }

    public FZZ(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A04 = context;
        this.A0I = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FYT.A0E, i, i2);
        this.A01 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.A02 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.A0C = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C8224FZs c8224FZs = new C8224FZs(context, attributeSet, i, i2);
        C8140FWd c8140FWdA00 = C8140FWd.A00(context, attributeSet, FYT.A0I, i, i2);
        TypedArray typedArray = c8140FWdA00.A02;
        if (typedArray.hasValue(2)) {
            c8224FZs.setOverlapAnchor(typedArray.getBoolean(2, false));
        }
        c8224FZs.setBackgroundDrawable(c8140FWdA00.A02(0));
        typedArray.recycle();
        this.A09 = c8224FZs;
        c8224FZs.setInputMethodMode(1);
    }
}
