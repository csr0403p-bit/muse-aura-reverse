package X;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes6.dex */
public final class FTg {
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public static boolean A01(FTg fTg, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        ViewParent viewParent;
        int i6;
        int i7;
        if (fTg.A02) {
            if (i5 == 0) {
                viewParent = fTg.A01;
            } else if (i5 == 1) {
                viewParent = fTg.A00;
            }
            if (viewParent != null) {
                if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                    if (iArr != null) {
                        fTg.A04.getLocationInWindow(iArr);
                        i6 = iArr[0];
                        i7 = iArr[1];
                    } else {
                        i6 = 0;
                        i7 = 0;
                    }
                    if (iArr2 == null) {
                        iArr2 = fTg.A03;
                        if (iArr2 == null) {
                            iArr2 = new int[2];
                            fTg.A03 = iArr2;
                        }
                        iArr2[0] = 0;
                        iArr2[1] = 0;
                    }
                    View view = fTg.A04;
                    if (viewParent instanceof FU9) {
                        ((FU9) viewParent).AUG(view, iArr2, i, i2, i3, i4, i5);
                    } else {
                        AbstractC7607F5u.A1T(iArr2, 0, i3);
                        AbstractC7607F5u.A1T(iArr2, 1, i4);
                        if (viewParent instanceof FU2) {
                            ((FU2) viewParent).AUF(view, i, i2, i3, i4, i5);
                        } else if (i5 == 0) {
                            try {
                                viewParent.onNestedScroll(view, i, i2, i3, i4);
                            } catch (AbstractMethodError e) {
                                A00(" does not implement interface method onNestedScroll", C3cG.A0f(viewParent, "ViewParent "), e);
                            }
                        }
                    }
                    if (iArr != null) {
                        view.getLocationInWindow(iArr);
                        iArr[0] = iArr[0] - i6;
                        iArr[1] = iArr[1] - i7;
                    }
                    return true;
                }
                if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                }
            }
        }
        return false;
    }

    public final boolean A07(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        ViewParent viewParent;
        int i4;
        int i5;
        int[] iArr3 = iArr;
        if (this.A02) {
            if (i3 == 0) {
                viewParent = this.A01;
            } else if (i3 == 1) {
                viewParent = this.A00;
            }
            if (viewParent != null) {
                if (i != 0 || i2 != 0) {
                    if (iArr2 != null) {
                        this.A04.getLocationInWindow(iArr2);
                        i4 = iArr2[0];
                        i5 = iArr2[1];
                    } else {
                        i4 = 0;
                        i5 = 0;
                    }
                    if (iArr == null && (iArr3 = this.A03) == null) {
                        iArr3 = new int[2];
                        this.A03 = iArr3;
                    }
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    View view = this.A04;
                    if (viewParent instanceof FU2) {
                        ((FU2) viewParent).AUE(view, iArr3, i, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            viewParent.onNestedPreScroll(view, i, i2, iArr3);
                        } catch (AbstractMethodError e) {
                            A00(" does not implement interface method onNestedPreScroll", C3cG.A0f(viewParent, "ViewParent "), e);
                        }
                    }
                    if (iArr2 != null) {
                        view.getLocationInWindow(iArr2);
                        iArr2[0] = iArr2[0] - i4;
                        iArr2[1] = iArr2[1] - i5;
                    }
                    if (iArr3[0] != 0 || iArr3[1] != 0) {
                        return true;
                    }
                } else if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
            }
        }
        return false;
    }

    public final void A02(int i) {
        ViewParent viewParent;
        if (i == 0) {
            viewParent = this.A01;
        } else if (i != 1) {
            return;
        } else {
            viewParent = this.A00;
        }
        if (viewParent != null) {
            View view = this.A04;
            if (viewParent instanceof FU2) {
                ((FU2) viewParent).AWH(view, i);
            } else if (i == 0) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    A00(" does not implement interface method onStopNestedScroll", C3cG.A0f(viewParent, "ViewParent "), e);
                }
            }
            if (i != 0) {
                this.A00 = null;
            } else {
                this.A01 = null;
            }
        }
    }

    public final void A03(boolean z) {
        if (this.A02) {
            this.A04.stopNestedScroll();
        }
        this.A02 = z;
    }

    public final boolean A04(float f, float f2) {
        ViewParent viewParent;
        if (!this.A02 || (viewParent = this.A01) == null) {
            return false;
        }
        try {
            return viewParent.onNestedPreFling(this.A04, f, f2);
        } catch (AbstractMethodError e) {
            A00(" does not implement interface method onNestedPreFling", C3cG.A0f(viewParent, "ViewParent "), e);
            return false;
        }
    }

    public final boolean A05(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (!this.A02 || (viewParent = this.A01) == null) {
            return false;
        }
        try {
            return viewParent.onNestedFling(this.A04, f, f2, z);
        } catch (AbstractMethodError e) {
            A00(" does not implement interface method onNestedFling", C3cG.A0f(viewParent, "ViewParent "), e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0058 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A06(int r8, int r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L5d
            r0 = 1
            if (r9 != r0) goto La
            android.view.ViewParent r0 = r7.A00
        L7:
            r1 = 1
            if (r0 != 0) goto Lb
        La:
            r1 = 0
        Lb:
            r3 = 1
            if (r1 != 0) goto L37
            boolean r0 = r7.A02
            if (r0 == 0) goto L71
            android.view.View r6 = r7.A04
            android.view.ViewParent r4 = r6.getParent()
            r5 = r6
        L19:
            if (r4 == 0) goto L71
            boolean r0 = r4 instanceof X.FU2
            if (r0 == 0) goto L3e
            r0 = r4
            X.FU2 r0 = (X.FU2) r0
            boolean r0 = r0.AWB(r5, r6, r8, r9)
        L26:
            if (r0 == 0) goto L51
            if (r9 == 0) goto L3b
            if (r9 != r3) goto L2e
            r7.A00 = r4
        L2e:
            boolean r0 = r4 instanceof X.FU2
            if (r0 == 0) goto L38
            X.FU2 r4 = (X.FU2) r4
            r4.AUH(r5, r6, r8, r9)
        L37:
            return r3
        L38:
            if (r9 != 0) goto L37
            goto L60
        L3b:
            r7.A01 = r4
            goto L2e
        L3e:
            if (r9 != 0) goto L51
            boolean r0 = r4.onStartNestedScroll(r5, r6, r8)     // Catch: java.lang.AbstractMethodError -> L45
            goto L26
        L45:
            r2 = move-exception
            java.lang.String r0 = "ViewParent "
            java.lang.StringBuilder r1 = X.C3cG.A0f(r4, r0)
            java.lang.String r0 = " does not implement interface method onStartNestedScroll"
            A00(r0, r1, r2)
        L51:
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L58
            r5 = r4
            android.view.View r5 = (android.view.View) r5
        L58:
            android.view.ViewParent r4 = r4.getParent()
            goto L19
        L5d:
            android.view.ViewParent r0 = r7.A01
            goto L7
        L60:
            r4.onNestedScrollAccepted(r5, r6, r8)     // Catch: java.lang.AbstractMethodError -> L64
            return r3
        L64:
            r2 = move-exception
            java.lang.String r0 = "ViewParent "
            java.lang.StringBuilder r1 = X.C3cG.A0f(r4, r0)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            A00(r0, r1, r2)
            return r3
        L71:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTg.A06(int, int):boolean");
    }

    public FTg(View view) {
        this.A04 = view;
    }

    public static void A00(String str, StringBuilder sb, Throwable th) {
        sb.append(str);
        Log.e("ViewParentCompat", sb.toString(), th);
    }
}
