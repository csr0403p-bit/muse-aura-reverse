package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Ff2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8495Ff2 extends C8496Ff3 {
    public static Class<?> A0B;
    public static Field A0C;
    public static Field A0D;
    public static Method A0E;
    public static boolean A0F;
    public int A00;
    public int A01;
    public int A02;
    public C8345FcJ A03;
    public C7nE A04;
    public C8497Ff4 A05;
    public Rect[][] A06;
    public Rect[][] A07;
    public C8345FcJ A08;
    public C8345FcJ[] A09;
    public final WindowInsets A0A;

    public static final C8345FcJ A00(C8495Ff2 c8495Ff2, int i, boolean z) {
        C8345FcJ c8345FcJ;
        C8345FcJ c8345FcJ2;
        if (i != 1) {
            if (i != 2) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i == 128) {
                                    C8497Ff4 c8497Ff4 = c8495Ff2.A05;
                                    C8500Ff7 c8500Ff7A06 = c8497Ff4 != null ? c8497Ff4.A00.A06() : c8495Ff2.A06();
                                    if (c8500Ff7A06 != null) {
                                        DisplayCutout displayCutout = c8500Ff7A06.A00;
                                        return C8345FcJ.A00(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                    }
                                }
                            } else if (c8495Ff2 instanceof C8503FfA) {
                                C8503FfA c8503FfA = (C8503FfA) c8495Ff2;
                                C8345FcJ c8345FcJ3 = c8503FfA.A02;
                                if (c8345FcJ3 != null) {
                                    return c8345FcJ3;
                                }
                                C8345FcJ c8345FcJA01 = C8345FcJ.A01(c8503FfA.A0A.getTappableElementInsets());
                                c8503FfA.A02 = c8345FcJA01;
                                return c8345FcJA01;
                            }
                        } else if (c8495Ff2 instanceof C8503FfA) {
                            C8503FfA c8503FfA2 = (C8503FfA) c8495Ff2;
                            C8345FcJ c8345FcJ4 = c8503FfA2.A00;
                            if (c8345FcJ4 != null) {
                                return c8345FcJ4;
                            }
                            C8345FcJ c8345FcJA012 = C8345FcJ.A01(c8503FfA2.A0A.getMandatorySystemGestureInsets());
                            c8503FfA2.A00 = c8345FcJA012;
                            return c8345FcJA012;
                        }
                    } else if (c8495Ff2 instanceof C8503FfA) {
                        C8503FfA c8503FfA3 = (C8503FfA) c8495Ff2;
                        C8345FcJ c8345FcJ5 = c8503FfA3.A01;
                        if (c8345FcJ5 != null) {
                            return c8345FcJ5;
                        }
                        C8345FcJ c8345FcJA013 = C8345FcJ.A01(c8503FfA3.A0A.getSystemGestureInsets());
                        c8503FfA3.A01 = c8345FcJA013;
                        return c8345FcJA013;
                    }
                    return c8495Ff2.A0D();
                }
                C8345FcJ[] c8345FcJArr = c8495Ff2.A09;
                if (c8345FcJArr != null && (c8345FcJ2 = c8345FcJArr[3]) != null) {
                    return c8345FcJ2;
                }
                C8345FcJ c8345FcJA0D = c8495Ff2.A0D();
                C8497Ff4 c8497Ff42 = c8495Ff2.A05;
                C8345FcJ c8345FcJA03 = c8497Ff42 != null ? c8497Ff42.A00.A03() : C8345FcJ.A04;
                int i2 = c8345FcJA0D.A00;
                int i3 = c8345FcJA03.A00;
                if (i2 > i3 || ((c8345FcJ = c8495Ff2.A03) != null && !c8345FcJ.equals(C8345FcJ.A04) && (i2 = c8345FcJ.A00) > i3)) {
                    return C8345FcJ.A00(0, 0, 0, i2);
                }
            } else {
                if (z) {
                    C8497Ff4 c8497Ff43 = c8495Ff2.A05;
                    C8345FcJ c8345FcJA032 = c8497Ff43 != null ? c8497Ff43.A00.A03() : C8345FcJ.A04;
                    C8345FcJ c8345FcJA033 = c8495Ff2.A03();
                    return C8345FcJ.A00(Math.max(c8345FcJA032.A01, c8345FcJA033.A01), 0, Math.max(c8345FcJA032.A02, c8345FcJA033.A02), Math.max(c8345FcJA032.A00, c8345FcJA033.A00));
                }
                if ((c8495Ff2.A02 & 2) == 0) {
                    C8345FcJ c8345FcJA0D2 = c8495Ff2.A0D();
                    C8497Ff4 c8497Ff44 = c8495Ff2.A05;
                    C8345FcJ c8345FcJA034 = c8497Ff44 != null ? c8497Ff44.A00.A03() : null;
                    int iMin = c8345FcJA0D2.A00;
                    if (c8345FcJA034 != null) {
                        iMin = Math.min(iMin, c8345FcJA034.A00);
                    }
                    return C8345FcJ.A00(c8345FcJA0D2.A01, 0, c8345FcJA0D2.A02, iMin);
                }
            }
        } else {
            if (z) {
                C8497Ff4 c8497Ff45 = c8495Ff2.A05;
                return C8345FcJ.A00(0, Math.max((c8497Ff45 != null ? c8497Ff45.A00.A03() : C8345FcJ.A04).A03, c8495Ff2.A0D().A03), 0, 0);
            }
            if ((c8495Ff2.A02 & 4) == 0) {
                return C8345FcJ.A00(0, c8495Ff2.A0D().A03, 0, 0);
            }
        }
        return C8345FcJ.A04;
    }

    public static List<Rect> A01(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        int i2 = 1;
        do {
            if ((i & i2) != 0 && (rectArr2 = rectArr[HlQ.A00(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    int length = rectArr3.length;
                    int length2 = rectArr2.length;
                    Rect[] rectArr4 = new Rect[length + length2];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, length);
                    System.arraycopy(rectArr2, 0, rectArr4, length, length2);
                    rectArr3 = rectArr4;
                }
            }
            i2 <<= 1;
        } while (i2 <= 512);
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    @Override // X.C8496Ff3
    public void A0G() {
        int i = 1;
        do {
            int iA00 = HlQ.A00(i);
            this.A06[iA00] = A02(A04(i));
            if (i != 8) {
                this.A07[iA00] = A02(A05(i));
            }
            i <<= 1;
        } while (i <= 512);
    }

    @Override // X.C8496Ff3
    public void A0J(View view) {
        Display display;
        HkQ hkQA00;
        HkQ hkQA002;
        int i;
        int i2;
        String str;
        StringBuilder sbA0x;
        C7nE c7nE = null;
        if (view != null && (display = view.getDisplay()) != null) {
            Point point = new Point();
            display.getRealSize(point);
            if (super.A00.A00.A0P()) {
                i = point.x;
                i2 = point.y;
                str = " Z";
                int i3 = i / 2;
                int i4 = i2 / 2;
                sbA0x = C60O.A0y("M0,", i4);
                AbstractC7607F5u.A1P(" A", ",", sbA0x, i3, i4);
                AbstractC7607F5u.A1P(" 0 1,1 ", ",", sbA0x, i, i4);
                AbstractC7607F5u.A1P(" A", ",", sbA0x, i3, i4);
                sbA0x.append(" 0 1,1 0,");
                sbA0x.append(i4);
            } else {
                int i5 = Build.VERSION.SDK_INT;
                HkQ hkQA003 = i5 >= 31 ? HkQ.A00(display.getRoundedCorner(0)) : null;
                HkQ hkQA004 = i5 >= 31 ? HkQ.A00(display.getRoundedCorner(1)) : null;
                if (i5 >= 31) {
                    hkQA00 = HkQ.A00(display.getRoundedCorner(2));
                    hkQA002 = HkQ.A00(display.getRoundedCorner(3));
                } else {
                    hkQA00 = null;
                    hkQA002 = null;
                }
                i = point.x;
                i2 = point.y;
                int i6 = hkQA003 != null ? hkQA003.A01 : 0;
                int i7 = hkQA004 != null ? hkQA004.A01 : 0;
                int i8 = hkQA00 != null ? hkQA00.A01 : 0;
                int i9 = hkQA002 != null ? hkQA002.A01 : 0;
                str = " Z";
                sbA0x = C60O.A0x("M ");
                int iMin = Math.min(i / 2, i2 / 2);
                int iMin2 = Math.min(iMin, i6);
                int iMin3 = Math.min(iMin, i7);
                int iMin4 = Math.min(iMin, i8);
                int iMin5 = Math.min(iMin, i9);
                sbA0x.append(iMin2);
                AbstractC7607F5u.A1Q(",0 L ", sbA0x, i, iMin3);
                sbA0x.append(",0");
                if (iMin3 > 0) {
                    sbA0x.append(" A ");
                    sbA0x.append(iMin3);
                    AbstractC7607F5u.A1P(",", " 0 0,1 ", sbA0x, iMin3, i);
                    sbA0x.append(",");
                    sbA0x.append(iMin3);
                }
                BV7.A1G(" L ", ",", sbA0x, i);
                sbA0x.append(i2 - iMin4);
                if (iMin4 > 0) {
                    BV7.A1G(" A ", ",", sbA0x, iMin4);
                    sbA0x.append(iMin4);
                    AbstractC7607F5u.A1Q(" 0 0,1 ", sbA0x, i, iMin4);
                    sbA0x.append(",");
                    sbA0x.append(i2);
                }
                AbstractC7607F5u.A1P(" L ", ",", sbA0x, iMin5, i2);
                if (iMin5 > 0) {
                    BV7.A1G(" A ", ",", sbA0x, iMin5);
                    sbA0x.append(iMin5);
                    AbstractC7607F5u.A1Q(" 0 0,1 0,", sbA0x, i2, iMin5);
                }
                if (iMin2 > 0) {
                    BV7.A1G(" L 0,", " A ", sbA0x, iMin2);
                    sbA0x.append(iMin2);
                    BV7.A1G(",", " 0 0,1 ", sbA0x, iMin2);
                    sbA0x.append(iMin2);
                    sbA0x.append(",0");
                }
            }
            c7nE = new C7nE(AnonymousClass001.A0v(str, sbA0x), i, i2);
        }
        this.A04 = c7nE;
    }

    private Rect[] A02(C8345FcJ c8345FcJ) {
        ArrayList arrayList = new ArrayList();
        int i = c8345FcJ.A01;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, i, this.A00));
        }
        int i2 = c8345FcJ.A03;
        if (i2 != 0) {
            arrayList.add(new Rect(0, 0, this.A01, i2));
        }
        int i3 = c8345FcJ.A02;
        if (i3 != 0) {
            int i4 = this.A01;
            arrayList.add(new Rect(i4 - i3, 0, i4, this.A00));
        }
        int i5 = c8345FcJ.A00;
        if (i5 != 0) {
            int i6 = this.A00;
            arrayList.add(new Rect(0, i6 - i5, this.A01, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    @Override // X.C8496Ff3
    public final C8345FcJ A0D() {
        C8345FcJ c8345FcJ = this.A08;
        if (c8345FcJ != null) {
            return c8345FcJ;
        }
        WindowInsets windowInsets = this.A0A;
        C8345FcJ c8345FcJA00 = C8345FcJ.A00(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.A08 = c8345FcJA00;
        return c8345FcJA00;
    }

    @Override // X.C8496Ff3
    public List<Rect> A0E(int i) {
        return A01(this.A06, i);
    }

    @Override // X.C8496Ff3
    public List<Rect> A0F(int i) {
        return A01(this.A07, i);
    }

    @Override // X.C8496Ff3
    public final void A0H(int i) {
        this.A02 = i;
    }

    @Override // X.C8496Ff3
    public final void A0K(C7nE c7nE) {
        this.A04 = c7nE;
    }

    @Override // X.C8496Ff3
    public final void A0L(C8497Ff4 c8497Ff4) {
        this.A05 = c8497Ff4;
    }

    @Override // X.C8496Ff3
    public final void A0M(C8345FcJ[] c8345FcJArr) {
        this.A09 = c8345FcJArr;
    }

    @Override // X.C8496Ff3
    public final boolean A0P() {
        return this.A0A.isRound();
    }

    public C8495Ff2(C8497Ff4 c8497Ff4, WindowInsets windowInsets) {
        super(c8497Ff4);
        this.A08 = null;
        this.A06 = new Rect[10][];
        this.A07 = new Rect[10][];
        this.A0A = windowInsets;
    }

    @Override // X.C8496Ff3
    public void A0I(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C8345FcJ c8345FcJA00;
        this.A01 = view.getWidth();
        this.A00 = view.getHeight();
        if (Build.VERSION.SDK_INT >= 30) {
            throw C8j3.A18("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!A0F) {
            try {
                A0E = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                A0B = cls;
                A0D = cls.getDeclaredField("mVisibleInsets");
                A0C = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                A0D.setAccessible(true);
                A0C.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", BV5.A0n("Failed to get visible insets. (Reflection error). ", e), e);
            }
            A0F = true;
        }
        Method method = A0E;
        if (method == null || A0B == null || A0D == null) {
            c8345FcJA00 = C8345FcJ.A04;
        } else {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                } else {
                    Rect rect = (Rect) A0D.get(A0C.get(objInvoke));
                    if (rect != null) {
                        c8345FcJA00 = C8345FcJ.A00(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", BV5.A0n("Failed to get visible insets. (Reflection error). ", e2), e2);
            }
            c8345FcJA00 = C8345FcJ.A04;
        }
        this.A03 = c8345FcJA00;
    }

    @Override // X.C8496Ff3
    public final void A0N(Rect[][] rectArr) {
        rectArr.getClass();
        this.A06 = (Rect[][]) rectArr.clone();
    }

    @Override // X.C8496Ff3
    public final void A0O(Rect[][] rectArr) {
        rectArr.getClass();
        this.A07 = (Rect[][]) rectArr.clone();
    }

    @Override // X.C8496Ff3
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C8495Ff2 c8495Ff2 = (C8495Ff2) obj;
        if (Ht0.A00(this.A03, c8495Ff2.A03)) {
            return (this.A02 & 6) == (c8495Ff2.A02 & 6);
        }
        return false;
    }
}
