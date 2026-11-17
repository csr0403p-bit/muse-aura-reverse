package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public class FTf extends ViewGroup.MarginLayoutParams {
    public FTV A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;

    @Deprecated
    public final int A01() {
        RecyclerView recyclerView;
        AbstractC8091FSx<? extends FTV> abstractC8091FSx;
        int iA0f;
        FTV ftv = this.A00;
        AbstractC8091FSx<? extends FTV> abstractC8091FSx2 = ftv.A08;
        if (abstractC8091FSx2 == null || (recyclerView = ftv.A0C) == null || (abstractC8091FSx = recyclerView.A0F) == null || (iA0f = recyclerView.A0f(ftv)) == -1 || abstractC8091FSx2 != abstractC8091FSx) {
            return -1;
        }
        return iA0f;
    }

    public FTf(FTf fTf) {
        super((ViewGroup.LayoutParams) fTf);
        this.A03 = AbstractC7607F5u.A0X();
        this.A01 = true;
        this.A02 = false;
    }

    public static Rect A00(View view) {
        return ((FTf) view.getLayoutParams()).A03;
    }

    public FTf(int i, int i2) {
        super(i, i2);
        this.A03 = AbstractC7607F5u.A0X();
        this.A01 = true;
        this.A02 = false;
    }

    public FTf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = AbstractC7607F5u.A0X();
        this.A01 = true;
        this.A02 = false;
    }

    public FTf(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A03 = AbstractC7607F5u.A0X();
        this.A01 = true;
        this.A02 = false;
    }

    public FTf(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A03 = AbstractC7607F5u.A0X();
        this.A01 = true;
        this.A02 = false;
    }
}
