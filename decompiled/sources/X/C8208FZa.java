package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.facebook.aura.R;

/* renamed from: X.FZa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8208FZa extends FZZ implements InterfaceC8216FZj {
    public int A00;
    public ListAdapter A01;
    public CharSequence A02;
    public final Rect A03;
    public final /* synthetic */ FZY A04;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r9 = this;
            android.widget.PopupWindow r2 = r9.A09
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            X.FZY r5 = r9.A04
            android.graphics.Rect r6 = r5.A05
            if (r0 == 0) goto L77
            r0.getPadding(r6)
            int r1 = r5.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L73
            int r3 = r6.right
        L18:
            int r8 = r5.getPaddingLeft()
            int r4 = r5.getPaddingRight()
            int r7 = r5.getWidth()
            int r1 = r5.A00
            r0 = -2
            if (r1 != r0) goto L68
            android.widget.ListAdapter r1 = r9.A01
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            int r2 = r5.A00(r0, r1)
            android.content.Context r0 = r5.getContext()
            android.util.DisplayMetrics r0 = X.C60Q.A0B(r0)
            int r1 = r0.widthPixels
            int r0 = r6.left
            int r1 = r1 - r0
            int r0 = r6.right
            int r1 = r1 - r0
            if (r2 <= r1) goto L48
            r2 = r1
        L48:
            int r0 = r7 - r8
            int r0 = X.AbstractC7607F5u.A0D(r0, r4, r2)
        L4e:
            r9.A00(r0)
        L51:
            int r1 = r5.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L63
            int r7 = r7 - r4
            int r0 = r9.A03
            int r7 = r7 - r0
            int r0 = r9.A00
            int r7 = r7 - r0
        L5f:
            int r3 = r3 + r7
            r9.A01 = r3
            return
        L63:
            int r0 = r9.A00
            int r7 = r8 + r0
            goto L5f
        L68:
            r0 = -1
            if (r1 != r0) goto L6f
            int r0 = r7 - r8
            int r0 = r0 - r4
            goto L4e
        L6f:
            r9.A00(r1)
            goto L51
        L73:
            int r0 = r6.left
            int r3 = -r0
            goto L18
        L77:
            r0 = 0
            r6.right = r0
            r6.left = r0
            r3 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8208FZa.A01():void");
    }

    @Override // X.InterfaceC8216FZj
    public final CharSequence AGG() {
        return this.A02;
    }

    @Override // X.InterfaceC8216FZj
    public final void AdV(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC8216FZj
    public final void AeH(CharSequence charSequence) {
        this.A02 = charSequence;
    }

    @Override // X.InterfaceC8216FZj
    public final void Afe(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.A09;
        boolean zIsShowing = popupWindow.isShowing();
        A01();
        popupWindow.setInputMethodMode(2);
        Afd();
        FYL fyl = this.A0A;
        fyl.setChoiceMode(1);
        fyl.setTextDirection(i);
        fyl.setTextAlignment(i2);
        FZY fzy = this.A04;
        int selectedItemPosition = fzy.getSelectedItemPosition();
        FYL fyl2 = this.A0A;
        if (popupWindow.isShowing() && fyl2 != null) {
            fyl2.A07 = false;
            fyl2.setSelection(selectedItemPosition);
            if (fyl2.getChoiceMode() != 0) {
                fyl2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = fzy.getViewTreeObserver()) == null) {
            return;
        }
        I14 i14 = new I14(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(i14);
        popupWindow.setOnDismissListener(new C8220FZn(i14, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8208FZa(Context context, AttributeSet attributeSet, FZY fzy) {
        super(context, attributeSet, R.attr._name_removed__res_0x7f0404e7, 0);
        this.A04 = fzy;
        this.A03 = AbstractC7607F5u.A0X();
        this.A06 = fzy;
        this.A0D = true;
        this.A09.setFocusable(true);
        this.A07 = new C8209FZc(this, fzy);
    }

    @Override // X.FZZ, X.InterfaceC8216FZj
    public final void Aci(ListAdapter listAdapter) {
        super.Aci(listAdapter);
        this.A01 = listAdapter;
    }
}
