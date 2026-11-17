package com.facebook.rendercore.text;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7887FJf;
import X.AbstractC8060FRo;
import X.AnonymousClass002;
import X.BV4;
import X.BV5;
import X.C7857FHt;
import X.C8053FRg;
import X.FGR;
import X.FK8;
import X.FK9;
import X.FKA;
import X.FRD;
import X.FRF;
import X.FRJ;
import X.FRO;
import X.FRQ;
import X.FRR;
import X.FRS;
import X.FRT;
import X.Hle;
import X.Hrs;
import X.InterfaceC10565Htv;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public class RCTextView extends ViewGroup {
    public static final float[] A0h = new float[2];
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Layout A06;
    public FKA A07;
    public FK9 A08;
    public FK8 A09;
    public FRD A0A;
    public CharSequence A0B;
    public Map<Object, FRQ> A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public ClickableSpan[] A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public ColorStateList A0M;
    public Paint A0N;
    public Path A0O;
    public ClickableSpan A0P;
    public CharSequence A0Q;
    public Integer A0R;
    public Integer A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public ImageSpan[] A0b;
    public final AccessibilityManager A0c;
    public final FRT A0d;
    public final Path A0e;
    public final Rect A0f;
    public final Region A0g;

    public static int A00(RCTextView rCTextView, int i, int i2) {
        float width;
        float lineRight;
        int i3 = (int) (i2 - rCTextView.A01);
        int i4 = (int) (i - rCTextView.A00);
        int lineForVertical = rCTextView.A06.getLineForVertical(i3);
        Layout.Alignment alignment = rCTextView.A06.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        Layout layout = rCTextView.A06;
        if (alignment == alignment2) {
            width = layout.getLineLeft(lineForVertical);
            lineRight = rCTextView.A06.getLineRight(lineForVertical);
        } else {
            boolean zA1Q = AnonymousClass002.A1Q(layout.getParagraphDirection(lineForVertical), -1);
            Layout layout2 = rCTextView.A06;
            width = zA1Q ? layout2.getWidth() - rCTextView.A06.getLineMax(lineForVertical) : layout2.getParagraphLeft(lineForVertical);
            lineRight = zA1Q ? r0.getParagraphRight(lineForVertical) : rCTextView.A06.getLineMax(lineForVertical);
        }
        float f = i4;
        if (f >= width && f <= lineRight) {
            try {
                return rCTextView.A06.getOffsetForHorizontal(lineForVertical, f);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(android.graphics.Canvas r7, com.facebook.rendercore.text.RCTextView r8) {
        /*
            X.FRD r0 = r8.A0A
            if (r0 == 0) goto L4f
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L4f
            X.FRD r6 = r8.A0A
            boolean r0 = r6.A0G()
            r5 = 0
            if (r0 == 0) goto L40
            com.facebook.rendercore.text.RCTextView r0 = r6.A0F
            android.text.Layout r4 = r0.A06
            if (r4 == 0) goto L40
            boolean r0 = r6.A08
            if (r0 == 0) goto L3e
            android.graphics.Path r3 = r6.A0E
            r3.reset()
            int r2 = r6.A03()
            int r0 = r6.A02()
            if (r2 < 0) goto L3b
            if (r0 < 0) goto L3b
            if (r2 == r0) goto L3b
            int r1 = java.lang.Math.min(r2, r0)
            int r0 = java.lang.Math.max(r2, r0)
            r4.getSelectionPath(r1, r0, r3)
        L3b:
            r0 = 0
            r6.A08 = r0
        L3e:
            android.graphics.Path r5 = r6.A0E
        L40:
            X.FRD r0 = r8.A0A
            android.graphics.Paint r4 = r0.A0D
            com.facebook.rendercore.text.RCTextView r0 = r0.A0F
            int r0 = r0.getHighlightColor()
            r4.setColor(r0)
            if (r5 != 0) goto L55
        L4f:
            android.graphics.Path r5 = r8.getSelectionPath()
            android.graphics.Paint r4 = r8.A0N
        L55:
            java.lang.String r1 = android.os.Build.BRAND
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "xiaomi"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L76
            java.lang.String r0 = "poco"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L76
            java.lang.String r0 = "redmi"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L77
        L76:
            r0 = 1
        L77:
            r3 = 34
            r2 = 0
            if (r0 == 0) goto L9e
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NullPointerException -> L8d
            android.text.Layout r0 = r8.A06
            if (r1 < r3) goto L83
            goto L87
        L83:
            r0.draw(r7, r5, r4, r2)     // Catch: java.lang.NullPointerException -> L8d
            goto L8a
        L87:
            X.FRM.A00(r7, r4, r5, r0)     // Catch: java.lang.NullPointerException -> L8d
        L8a:
            r8.A0U = r2     // Catch: java.lang.NullPointerException -> L8d
            return
        L8d:
            boolean r0 = r8.A0U
            r1 = 1
            if (r0 == 0) goto L9b
            boolean r0 = r8.A0V
            if (r0 != 0) goto L9b
            r8.A0V = r1
            X.Hx0.A00()
        L9b:
            r8.A0U = r1
            return
        L9e:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.text.Layout r0 = r8.A06
            if (r1 < r3) goto La8
            X.FRM.A00(r7, r4, r5, r0)
            return
        La8:
            r0.draw(r7, r5, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rendercore.text.RCTextView.A03(android.graphics.Canvas, com.facebook.rendercore.text.RCTextView):void");
    }

    private FRS[] getMountableSpans() {
        FRS[] frsArr;
        CharSequence charSequence = this.A0B;
        return (!(charSequence instanceof Spanned) || (frsArr = (FRS[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), FRS.class)) == null) ? new FRS[0] : frsArr;
    }

    private InterfaceC10565Htv[] getOnPrePostDrawSpans() {
        InterfaceC10565Htv[] interfaceC10565HtvArr;
        CharSequence charSequence = this.A0B;
        return (!(charSequence instanceof Spanned) || (interfaceC10565HtvArr = (InterfaceC10565Htv[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), InterfaceC10565Htv.class)) == null) ? new InterfaceC10565Htv[0] : interfaceC10565HtvArr;
    }

    private int getSelectedSpanIndex() {
        ClickableSpan[] clickableSpanArr = this.A0H;
        if (clickableSpanArr != null && clickableSpanArr.length != 0 && (this.A0L != 0 || this.A0K != 0)) {
            CharSequence charSequence = this.A0B;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                int i = 0;
                while (true) {
                    ClickableSpan[] clickableSpanArr2 = this.A0H;
                    if (i >= clickableSpanArr2.length) {
                        break;
                    }
                    ClickableSpan clickableSpan = clickableSpanArr2[i];
                    int spanStart = spanned.getSpanStart(clickableSpan);
                    int spanEnd = spanned.getSpanEnd(clickableSpan);
                    if (spanStart == this.A0L && spanEnd == this.A0K) {
                        return i;
                    }
                    i++;
                }
            }
        }
        return -1;
    }

    private Path getSelectionPath() {
        if (this.A0L == this.A0K || Color.alpha(this.A04) == 0) {
            return null;
        }
        if (this.A0W) {
            Path pathA0V = this.A0O;
            if (pathA0V == null) {
                pathA0V = AbstractC7607F5u.A0V();
                this.A0O = pathA0V;
            }
            this.A06.getSelectionPath(this.A0L, this.A0K, pathA0V);
            this.A0W = false;
        }
        return this.A0O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence getTextForAccessibility() {
        CharSequence charSequence = this.A0B;
        return (charSequence == null || charSequence.length() < 1000000) ? this.A0B : (Character.isHighSurrogate(this.A0B.charAt(999999)) && Character.isLowSurrogate(this.A0B.charAt(1000000))) ? this.A0B.subSequence(0, 999999) : this.A0B.subSequence(0, 1000000);
    }

    public final void A04() {
        Map<Object, FRQ> map = this.A0C;
        if (map != null) {
            ArrayList arrayListA0t = BV4.A0t(map.values());
            this.A0C = null;
            removeAllViews();
            Iterator it = arrayListA0t.iterator();
            while (it.hasNext()) {
                FGR fgr = (FGR) ((FRQ) it.next()).A02;
                if (fgr != null) {
                    fgr.setContentDescription(null);
                    fgr.setMountInput(null);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.C7907FKc r12) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rendercore.text.RCTextView.A06(X.FKc):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        FRT frt = this.A0d;
        return (frt != null && frt.dispatchHoverEvent(motionEvent)) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ClickableSpan[] clickableSpanArr;
        AccessibilityManager accessibilityManager;
        FRT frt = this.A0d;
        return (frt != null && (clickableSpanArr = this.A0H) != null && clickableSpanArr.length > 0 && ((Boolean.getBoolean("is_accessibility_enabled") || ((accessibilityManager = this.A0c) != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) && frt.dispatchKeyEvent(keyEvent))) || super.dispatchKeyEvent(keyEvent);
    }

    public int getCurrentTextColor() {
        Integer num = this.A0R;
        if (num != null) {
            return num.intValue();
        }
        if (this.A06 == null) {
            return 0;
        }
        ColorStateList colorStateList = this.A0M;
        return colorStateList != null ? colorStateList.getColorForState(getDrawableState(), this.A0M.getDefaultColor()) : this.A0J;
    }

    public Integer getDynamicTextColor() {
        return this.A0R;
    }

    public CharSequence getFullText() {
        CharSequence charSequence = this.A0Q;
        return charSequence == null ? this.A0B : charSequence;
    }

    public int getHighlightColor() {
        int i = this.A02;
        if (i != 0) {
            return i;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.textColorHighlight});
        int color = typedArrayObtainStyledAttributes.getColor(0, 1714664933);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public Layout getLayout() {
        return this.A06;
    }

    public float getLayoutTranslationX() {
        return this.A00;
    }

    public float getLayoutTranslationY() {
        return this.A01;
    }

    public float getLineHeight() {
        Layout layout = this.A06;
        if (layout == null) {
            return 0.0f;
        }
        return layout.getPaint().getFontMetrics(null);
    }

    public TextPaint getPaint() {
        Layout layout = this.A06;
        if (layout != null) {
            return layout.getPaint();
        }
        return null;
    }

    public int getSelectionHandleColor() {
        return this.A05;
    }

    public CharSequence getText() {
        return this.A0B;
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        ClickableSpan[] clickableSpanArr;
        int selectedSpanIndex;
        if (this.A0X && !z && (selectedSpanIndex = getSelectedSpanIndex()) != -1) {
            ClickableSpan clickableSpan = this.A0H[selectedSpanIndex];
            if (clickableSpan instanceof AbstractC7887FJf) {
                ((AbstractC7887FJf) clickableSpan).A02 = false;
            }
            A02(0, 0, this.A04);
        }
        super.onFocusChanged(z, i, rect);
        FRT frt = this.A0d;
        if (frt == null || (clickableSpanArr = this.A0H) == null || clickableSpanArr.length <= 0) {
            return;
        }
        frt.onFocusChanged(z, i, rect);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0149, code lost:
    
        if (r0 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0180, code lost:
    
        if (r6 != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d6, code lost:
    
        if (r7 != r3) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0106, code lost:
    
        if (android.view.KeyEvent.metaStateHasModifiers(r5, 2) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0123, code lost:
    
        if (android.view.KeyEvent.metaStateHasModifiers(r5, 2) != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r10, android.view.KeyEvent r11) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rendercore.text.RCTextView.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        if (this.A0G && this.A0A != null && keyEvent.hasModifiers(4096)) {
            if (i == 29) {
                FRD frd = this.A0A;
                Spannable spannable = frd.A02;
                if (spannable != null) {
                    Selection.setSelection(spannable, 0, spannable.length());
                    frd.A0D();
                    return true;
                }
            } else if (i == 31) {
                this.A0A.A0B();
            }
            return true;
        }
        return super.onKeyShortcut(i, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006d, code lost:
    
        if (r6.hasModifiers(1) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyUp(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.A0X
            if (r0 == 0) goto L75
            int r0 = r4.A0L
            if (r0 != 0) goto L75
            int r0 = r4.A0K
            if (r0 != 0) goto L75
            r0 = 21
            if (r5 == r0) goto L1d
            r0 = 22
            if (r5 == r0) goto L1d
            r0 = 19
            if (r5 == r0) goto L1d
            r1 = 20
            r0 = 0
            if (r5 != r1) goto L1e
        L1d:
            r0 = 1
        L1e:
            r2 = 61
            if (r0 != 0) goto L24
            if (r5 != r2) goto L75
        L24:
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L61
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L61
            r0 = 22
            if (r5 == r0) goto L70
            r0 = 20
            if (r5 == r0) goto L70
            r0 = 21
            if (r5 == r0) goto L3e
            r0 = 19
            if (r5 != r0) goto L61
        L3e:
            android.text.style.ClickableSpan[] r1 = r4.A0H
            int r0 = r1.length
            int r0 = r0 - r3
            r1 = r1[r0]
        L44:
            if (r1 == 0) goto L75
            boolean r0 = r1 instanceof X.AbstractC7887FJf
            if (r0 == 0) goto L4f
            r0 = r1
            X.FJf r0 = (X.AbstractC7887FJf) r0
            r0.A02 = r3
        L4f:
            java.lang.CharSequence r0 = r4.A0B
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r2 = r0.getSpanStart(r1)
            int r1 = r0.getSpanEnd(r1)
            int r0 = r4.A03
            r4.A02(r2, r1, r0)
            return r3
        L61:
            if (r5 != r2) goto L75
            boolean r0 = r6.hasNoModifiers()
            if (r0 != 0) goto L70
            boolean r0 = r6.hasModifiers(r3)
            if (r0 == 0) goto L75
            goto L3e
        L70:
            android.text.style.ClickableSpan[] r0 = r4.A0H
            r1 = r0[r1]
            goto L44
        L75:
            boolean r3 = super.onKeyUp(r5, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rendercore.text.RCTextView.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Map<Object, FRQ> map;
        int lineForOffset;
        int lineVisibleEnd;
        if (this.A06 != null) {
            CharSequence charSequence = this.A0B;
            if (!(charSequence instanceof Spanned) || (map = this.A0C) == null) {
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            Iterator itA10 = BV5.A10(map);
            while (itA10.hasNext()) {
                FRQ frq = (FRQ) itA10.next();
                if (frq.A01) {
                    FRR frr = frq.A00;
                    View view = frq.A02;
                    int spanStart = spanned.getSpanStart(frr);
                    int spanEnd = spanned.getSpanEnd(frr);
                    if (spanStart >= 0 && spanEnd > spanStart && spanStart < (lineVisibleEnd = this.A06.getLineVisibleEnd((lineForOffset = this.A06.getLineForOffset(spanStart)))) && spanEnd <= lineVisibleEnd) {
                        Layout layout = this.A06;
                        int ellipsisCount = layout.getEllipsisCount(lineForOffset);
                        if (ellipsisCount != 0) {
                            int lineStart = layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset);
                            if (spanStart >= ellipsisCount + lineStart || spanEnd <= lineStart) {
                            }
                        }
                        float primaryHorizontal = this.A06.getPrimaryHorizontal(spanStart);
                        float primaryHorizontal2 = this.A06.getPrimaryHorizontal(spanEnd);
                        C7857FHt c7857FHt = (C7857FHt) frr;
                        int iA00 = C7857FHt.A00(c7857FHt, this.A06.getLineAscent(lineForOffset), this.A06.getLineDescent(lineForOffset));
                        int i5 = c7857FHt.A03.left;
                        Rect rect = new Rect(i5, iA00, i5 + c7857FHt.A01, c7857FHt.A00 + iA00);
                        int iRound = Math.round(getPaddingLeft() + this.A00 + Math.min(primaryHorizontal, primaryHorizontal2));
                        int iRound2 = Math.round(getPaddingTop() + this.A01 + this.A06.getLineBaseline(lineForOffset));
                        AbstractC7608F5v.A1E(view, rect.height(), 1073741824, View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824));
                        view.setVisibility(0);
                        view.layout(rect.left + iRound, rect.top + iRound2, iRound + rect.right, iRound2 + rect.bottom);
                    }
                    view.setVisibility(8);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x034f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rendercore.text.RCTextView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performLongClick() {
        /*
            r4 = this;
            boolean r0 = r4.A0G
            if (r0 == 0) goto L53
            X.FRD r0 = r4.A0A
            if (r0 == 0) goto L53
            boolean r3 = super.performLongClick()
            X.FRD r2 = r4.A0A
            android.text.Spannable r0 = r2.A02
            if (r0 == 0) goto L51
            if (r3 != 0) goto L45
            android.view.ActionMode r0 = r2.A03
            if (r0 == 0) goto L2e
            r0.finish()
            X.FRF r1 = r2.A04
            if (r1 != 0) goto L28
            com.facebook.rendercore.text.RCTextView r0 = r2.A0F
            X.FRF r1 = new X.FRF
            r1.<init>(r0, r2)
            r2.A04 = r1
        L28:
            boolean r3 = r1.A06()
            if (r3 != 0) goto L45
        L2e:
            com.facebook.rendercore.text.RCTextView r1 = r2.A0F
            boolean r0 = r1.requestFocus()
            if (r0 == 0) goto L51
            X.FRF r0 = r2.A04
            if (r0 != 0) goto L41
            X.FRF r0 = new X.FRF
            r0.<init>(r1, r2)
            r2.A04 = r0
        L41:
            boolean r3 = r0.A06()
        L45:
            if (r3 == 0) goto L50
            X.FRD r1 = r4.A0A
            r0 = 1
            r1.A07 = r0
            r0 = 0
            r4.performHapticFeedback(r0)
        L50:
            return r3
        L51:
            r3 = 0
            return r3
        L53:
            boolean r3 = super.performLongClick()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rendercore.text.RCTextView.performLongClick():boolean");
    }

    public void setClickableSpanAccessibilityProvider(FKA fka) {
        this.A07 = fka;
    }

    public void setClickableSpanListener(FK9 fk9) {
        this.A08 = fk9;
    }

    public void setDynamicTextColor(Integer num) {
        this.A0R = num;
        invalidate();
    }

    public void setTouchableSpanListener(FK8 fk8) {
        this.A09 = fk8;
    }

    public RCTextView(Context context) {
        AccessibilityManager accessibilityManagerA0F;
        super(context);
        this.A0g = new Region();
        this.A0e = AbstractC7607F5u.A0V();
        this.A0F = false;
        this.A0f = AbstractC7607F5u.A0X();
        this.A0D = true;
        setWillNotDraw(false);
        if (getImportantForAccessibility() == 0) {
            FRT frt = new FRT(this);
            this.A0d = frt;
            this.A0F = true;
            AbstractC8060FRo.A06(this, frt);
            this.A0F = false;
            accessibilityManagerA0F = AbstractC7608F5v.A0F(context);
        } else {
            accessibilityManagerA0F = null;
            this.A0d = null;
        }
        this.A0c = accessibilityManagerA0F;
    }

    private void A02(int i, int i2, int i3) {
        if (Color.alpha(i3) != 0) {
            if (this.A0L == i && this.A0K == i2) {
                return;
            }
            this.A0L = i;
            this.A0K = i2;
            this.A04 = i3;
            Paint paintA0T = this.A0N;
            if (paintA0T == null) {
                paintA0T = AbstractC7607F5u.A0T();
                this.A0N = paintA0T;
            }
            paintA0T.setColor(this.A04);
            int i4 = this.A0I;
            this.A0N.setPathEffect(i4 != 0 ? new CornerPathEffect(i4) : null);
            this.A0W = true;
            invalidate();
        }
    }

    public final void A05() {
        FRQ frq;
        for (FRS frs : getMountableSpans()) {
            C7857FHt c7857FHt = (C7857FHt) frs;
            Map<Object, FRQ> map = this.A0C;
            if (map != null && (frq = map.get(Long.valueOf(c7857FHt.A02))) != null && frq.A00 == c7857FHt) {
                frq.A01 = false;
                frq.A02.setVisibility(8);
            }
        }
        this.A0B = null;
        this.A0Q = null;
        this.A06 = null;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A0D = true;
        this.A02 = 0;
        this.A03 = 0;
        this.A0I = 0;
        this.A05 = 0;
        this.A0M = null;
        ImageSpan[] imageSpanArr = this.A0b;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i = 0; i < length; i++) {
                Drawable drawable = this.A0b[i].getDrawable();
                if (drawable != null) {
                    drawable.setCallback(null);
                    drawable.setVisible(false, false);
                }
            }
            this.A0b = null;
        }
        this.A0H = null;
        this.A0Y = false;
        this.A0X = false;
        this.A0P = null;
        this.A0f.setEmpty();
        this.A0g.setEmpty();
        this.A0e.reset();
        FRD frd = this.A0A;
        if (frd != null) {
            frd.A0C();
            this.A0A = null;
        }
        if (this.A0G) {
            setFocusableInTouchMode(this.A0Z);
            setLongClickable(this.A0a);
        }
        this.A0G = false;
        Integer num = this.A0S;
        if (num != null) {
            setFocusable(num.intValue());
            if (this.A0T) {
                setDefaultFocusHighlightEnabled(true);
                this.A0T = false;
            }
            this.A0S = null;
        }
        setContentDescription("");
        FRT frt = this.A0d;
        if (frt != null) {
            frt.invalidateRoot();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ColorStateList colorStateList = this.A0M;
        if (colorStateList == null || !colorStateList.isStateful() || this.A06 == null) {
            return;
        }
        invalidate();
    }

    public Locale getTextServicesLocale() {
        return Locale.getDefault();
    }

    public int getTotalPaddingBottom() {
        return getPaddingBottom();
    }

    public int getTotalPaddingLeft() {
        return getPaddingLeft() + ((int) this.A00);
    }

    public int getTotalPaddingRight() {
        return getPaddingRight();
    }

    public int getTotalPaddingTop() {
        return getPaddingTop() + ((int) this.A01);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        FRD frd = this.A0A;
        if (frd != null) {
            frd.A0F.removeCallbacks(frd.A0I);
            FRF frf = frd.A04;
            if (frf != null) {
                frf.A04();
                FRF frf2 = frd.A04;
                frf2.A0A.getViewTreeObserver().removeOnTouchModeChangeListener(frf2);
                FRJ frj = frf2.A06;
                if (frj != null) {
                    frj.A01();
                }
                FRJ frj2 = frf2.A05;
                if (frj2 != null) {
                    frj2.A01();
                }
            }
            frd.A0E();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A06 != null) {
            int iSave = canvas.save();
            TextPaint paint = this.A06.getPaint();
            int color = paint.getColor();
            try {
                canvas.translate(this.A00, this.A01);
                canvas.translate(getPaddingLeft(), getPaddingTop());
                InterfaceC10565Htv[] onPrePostDrawSpans = getOnPrePostDrawSpans();
                paint.setColor(getCurrentTextColor());
                int length = onPrePostDrawSpans.length;
                if (length == 0) {
                    A03(canvas, this);
                } else {
                    Hrs fro = new FRO(this);
                    CharSequence charSequence = this.A0B;
                    if (charSequence instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence;
                        int i = length - 1;
                        while (true) {
                            Hrs hrs = fro;
                            if (i < 0) {
                                break;
                            }
                            InterfaceC10565Htv interfaceC10565Htv = onPrePostDrawSpans[i];
                            spanned.getSpanStart(interfaceC10565Htv);
                            spanned.getSpanEnd(interfaceC10565Htv);
                            fro = new Hle(hrs, interfaceC10565Htv, this);
                            i--;
                        }
                        fro.A9D(canvas);
                    }
                }
            } finally {
                paint.setColor(color);
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        FRD frd = this.A0A;
        if (frd == null || !this.A0G) {
            return;
        }
        if (!z) {
            FRF frf = frd.A04;
            if (frf != null) {
                frf.A04();
            }
            frd.A0E();
            return;
        }
        if (frd.A0G() && frd.A03 == null && frd.A0A) {
            frd.A0D();
        }
        frd.A0A = false;
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        C8053FRg c8053FRgA00;
        super.setAccessibilityDelegate(accessibilityDelegate);
        FRT frt = this.A0d;
        if (frt == null || this.A0F || (c8053FRgA00 = AbstractC8060FRo.A00(this)) == frt) {
            return;
        }
        frt.A00 = c8053FRgA00;
        this.A0F = true;
        AbstractC8060FRo.A06(this, frt);
        this.A0F = false;
    }
}
