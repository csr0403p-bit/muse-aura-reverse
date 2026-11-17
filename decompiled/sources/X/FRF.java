package X;

import android.graphics.drawable.Drawable;
import android.text.Selection;
import android.text.Spannable;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.rendercore.text.RCTextView;

/* loaded from: classes6.dex */
public final class FRF implements ViewTreeObserver.OnTouchModeChangeListener {
    public FRJ A05;
    public FRJ A06;
    public boolean A07;
    public boolean A08;
    public final RCTextView A0A;
    public final FRD A0B;
    public int A04 = -1;
    public int A01 = -1;
    public boolean A09 = false;
    public int A00 = 0;
    public int A02 = -1;
    public int A03 = -1;

    public static void A02(FRF frf) {
        frf.A04 = -1;
        frf.A00 = 0;
        frf.A09 = false;
        FRD frd = frf.A0B;
        Spannable spannable = frd.A02;
        if (spannable != null) {
            int iA03 = frd.A03();
            int iA02 = frd.A02();
            if (iA03 < 0 || iA02 < 0) {
                Selection.removeSelection(spannable);
            } else if (iA03 > iA02) {
                Selection.setSelection(spannable, iA02, iA03);
            }
        }
    }

    private void A00(int i, int i2, boolean z) {
        FRD frd = this.A0B;
        Spannable spannable = frd.A02;
        if (spannable != null) {
            int iA03 = frd.A03();
            int iA02 = frd.A02();
            Selection.setSelection(spannable, i, i2);
            if (z) {
                if (iA03 == i && iA02 == i2) {
                    return;
                }
                this.A0A.performHapticFeedback(9);
            }
        }
    }

    public static void A01(MotionEvent motionEvent, FRF frf) {
        int iA05;
        int iA06;
        FRD frd;
        int iA09;
        RCTextView rCTextView = frf.A0A;
        if (rCTextView.A06 != null) {
            int i = frf.A00;
            if (i == 1) {
                iA05 = frf.A0B.A05(motionEvent.getX(), motionEvent.getY());
                iA06 = frf.A04;
            } else {
                if (i != 2) {
                    if (i == 3) {
                        FRD frd2 = frf.A0B;
                        int iA052 = frd2.A05(motionEvent.getX(), motionEvent.getY());
                        int i2 = frf.A04;
                        long jA0A = frd2.A0A(Math.min(iA052, i2), Math.max(iA052, i2));
                        frf.A00(BV6.A03(jA0A), (int) (jA0A & 4294967295L), motionEvent.isFromSource(4098));
                        return;
                    }
                    return;
                }
                if (frf.A08) {
                    return;
                }
                boolean zIsFromSource = motionEvent.isFromSource(8194);
                ViewConfiguration viewConfiguration = ViewConfiguration.get(rCTextView.getContext());
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (zIsFromSource) {
                    frd = frf.A0B;
                    iA09 = frd.A04(y);
                } else {
                    if (frf.A09) {
                        int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                        FRJ frj = frf.A06;
                        y -= frj != null ? frj.A0P : scaledTouchSlop;
                    }
                    frd = frf.A0B;
                    iA09 = frd.A09(rCTextView.A06, y, frf.A01);
                    if (!frf.A09 && iA09 != frf.A01) {
                        frf.A09 = true;
                        return;
                    }
                }
                RCTextView rCTextView2 = frd.A0F;
                int offsetForHorizontal = rCTextView2.A06.getOffsetForHorizontal(iA09, AbstractC7611F5y.A02(rCTextView2, x));
                if (frf.A04 < offsetForHorizontal) {
                    iA05 = frd.A06(offsetForHorizontal);
                    iA06 = frd.A07(frf.A04);
                } else {
                    iA05 = frd.A07(offsetForHorizontal);
                    iA06 = frd.A06(frf.A04);
                    if (iA06 == iA05) {
                        iA05 = frd.A08(iA05, false);
                    }
                }
                frf.A01 = iA09;
            }
            frf.A00(iA06, iA05, motionEvent.isFromSource(4098));
        }
    }

    public final void A04() {
        FRJ frj = this.A06;
        if (frj != null) {
            frj.A02();
        }
        FRJ frj2 = this.A05;
        if (frj2 != null) {
            frj2.A02();
        }
    }

    public final void A05() {
        FRD frd = this.A0B;
        FRD.A01(frd);
        Drawable drawable = frd.A00;
        FRD.A01(frd);
        Drawable drawable2 = frd.A01;
        if (drawable != null && drawable2 != null) {
            if (this.A06 == null) {
                this.A06 = new FRJ(drawable, drawable2, this.A0A, frd, 0);
            }
            if (this.A05 == null) {
                this.A05 = new FRJ(drawable2, drawable, this.A0A, frd, 1);
            }
            this.A06.A03();
            this.A05.A03();
        }
        this.A0A.getViewTreeObserver().addOnTouchModeChangeListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A06() {
        /*
            r12 = this;
            X.FRD r6 = r12.A0B
            r6.A0E()
            boolean r0 = r6.A0G()
            if (r0 != 0) goto L64
            android.text.Spannable r11 = r6.A02
            r4 = 0
            if (r11 == 0) goto Lc2
            X.FRF r0 = r6.A04
            if (r0 == 0) goto Lbb
            int r1 = r0.A03
            int r0 = r0.A02
            if (r1 < 0) goto Lbb
            if (r0 < 0) goto Lbb
            long r2 = (long) r1
            r10 = 32
            long r2 = r2 << r10
            long r0 = X.BV4.A03(r0)
            long r0 = r0 | r2
        L25:
            long r2 = r0 >>> r10
            int r5 = (int) r2
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r8
            int r7 = (int) r0
            if (r5 < 0) goto Lc2
            int r0 = r11.length()
            if (r5 > r0) goto Lc2
            if (r7 < 0) goto Lc2
            android.text.Spannable r0 = r6.A02
            int r0 = r0.length()
            if (r7 > r0) goto Lc2
            android.text.Spannable r1 = r6.A02
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r1 = r1.getSpans(r5, r7, r0)
            android.text.style.URLSpan[] r1 = (android.text.style.URLSpan[]) r1
            int r0 = r1.length
            r3 = 1
            if (r0 < r3) goto L6a
            r2 = r1[r4]
            android.text.Spannable r0 = r6.A02
            int r1 = r0.getSpanStart(r2)
            android.text.Spannable r0 = r6.A02
            int r0 = r0.getSpanEnd(r2)
        L5d:
            android.text.Spannable r2 = r6.A02
            android.text.Selection.setSelection(r2, r1, r0)
            if (r0 <= r1) goto Lc2
        L64:
            r0 = 2
            A03(r12, r0)
            r0 = 1
            return r0
        L6a:
            X.Hhy r2 = r6.A06
            if (r2 != 0) goto L79
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.Hhy r2 = new X.Hhy
            r2.<init>(r0)
            r6.A06 = r2
        L79:
            android.text.Spannable r0 = r6.A02
            r2.A06(r0, r5, r7)
            int r1 = X.Hhy.A00(r2, r5, r4)
            int r0 = X.Hhy.A01(r2, r7, r4)
            r2 = -1
            if (r1 == r2) goto L8d
            if (r0 == r2) goto L8d
            if (r1 != r0) goto L5d
        L8d:
            android.text.Spannable r0 = r6.A02
            if (r0 == 0) goto Lb7
            int r0 = r0.length()
            if (r5 >= r0) goto Laa
            int r2 = r6.A08(r5, r3)
            int r0 = r6.A08(r2, r4)
        L9f:
            long r0 = (long) r0
            long r0 = r0 << r10
            long r4 = (long) r2
        La2:
            long r4 = r4 & r8
            long r4 = r4 | r0
            long r2 = r4 >>> r10
            int r1 = (int) r2
            long r4 = r4 & r8
            int r0 = (int) r4
            goto L5d
        Laa:
            int r0 = r5 + (-1)
            if (r0 < 0) goto Lb7
            int r0 = r6.A08(r5, r4)
            int r2 = r6.A08(r0, r3)
            goto L9f
        Lb7:
            long r4 = (long) r5
            long r0 = r4 << r10
            goto La2
        Lbb:
            r0 = 0
            r10 = 32
            long r0 = r0 << r10
            goto L25
        Lc2:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FRF.A06():boolean");
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        if (z) {
            return;
        }
        A04();
    }

    public FRF(RCTextView rCTextView, FRD frd) {
        this.A0A = rCTextView;
        this.A0B = frd;
        A02(this);
    }

    public static final void A03(FRF frf, int i) {
        frf.A05();
        frf.A00 = i;
        FRD frd = frf.A0B;
        FRL frl = frd.A0G;
        frf.A04 = frd.A05(frl.A00, frl.A01);
        frf.A01 = frd.A04(frl.A01);
        frf.A04();
        RCTextView rCTextView = frf.A0A;
        ViewParent parent = rCTextView.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        rCTextView.cancelLongPress();
    }
}
