package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.FUx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8128FUx extends ViewGroup.MarginLayoutParams {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public View A09;
    public CoordinatorLayout.Behavior A0A;
    public Object A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Rect A0G;

    public static Rect A00(C8128FUx c8128FUx) {
        c8128FUx.A0C = false;
        c8128FUx.A02 = 0;
        c8128FUx.A00 = 0;
        c8128FUx.A04 = -1;
        c8128FUx.A05 = -1;
        c8128FUx.A03 = 0;
        c8128FUx.A01 = 0;
        return new Rect();
    }

    public C8128FUx(C8128FUx c8128FUx) {
        super((ViewGroup.MarginLayoutParams) c8128FUx);
        this.A0G = A00(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:21:0x009b, B:23:0x00a5, B:24:0x00ac, B:26:0x00b4, B:27:0x00c8), top: B:31:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:21:0x009b, B:23:0x00a5, B:24:0x00ac, B:26:0x00b4, B:27:0x00c8), top: B:31:0x009b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8128FUx(android.content.Context r8, android.util.AttributeSet r9) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r7 = this;
            r7.<init>(r8, r9)
            r6 = 0
            r7.A0C = r6
            r7.A02 = r6
            r7.A00 = r6
            r1 = -1
            r7.A04 = r1
            r7.A05 = r1
            r7.A03 = r6
            r7.A01 = r6
            android.graphics.Rect r0 = X.AbstractC7607F5u.A0X()
            r7.A0G = r0
            int[] r0 = X.FV6.A01
            android.content.res.TypedArray r4 = r8.obtainStyledAttributes(r9, r0)
            int r0 = r4.getInteger(r6, r6)
            r7.A02 = r0
            r5 = 1
            int r0 = r4.getResourceId(r5, r1)
            r7.A05 = r0
            r0 = 2
            int r0 = r4.getInteger(r0, r6)
            r7.A00 = r0
            r0 = 6
            int r0 = r4.getInteger(r0, r1)
            r7.A04 = r0
            r0 = 5
            int r0 = r4.getInt(r0, r6)
            r7.A03 = r0
            r0 = 4
            int r0 = r4.getInt(r0, r6)
            r7.A01 = r0
            r1 = 3
            boolean r0 = r4.hasValue(r1)
            r7.A0C = r0
            if (r0 == 0) goto L60
            java.lang.String r3 = r4.getString(r1)
            java.lang.Class<?>[] r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.A0M
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L6b
            r0 = 0
        L5e:
            r7.A0A = r0
        L60:
            r4.recycle()
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r7.A0A
            if (r0 == 0) goto L6a
            r0.onAttachedToLayoutParams(r7)
        L6a:
            return
        L6b:
            java.lang.String r0 = "."
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L83
            java.lang.StringBuilder r1 = X.C60O.A0w()
            java.lang.String r0 = r8.getPackageName()
            r1.append(r0)
        L7e:
            java.lang.String r3 = X.AnonymousClass001.A0v(r3, r1)
            goto L9b
        L83:
            r2 = 46
            int r0 = r3.indexOf(r2)
            if (r0 >= 0) goto L9b
            java.lang.String r1 = androidx.coordinatorlayout.widget.CoordinatorLayout.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L9b
            java.lang.StringBuilder r1 = X.C3cG.A0g(r1)
            r1.append(r2)
            goto L7e
        L9b:
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior>>> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.A0K     // Catch: java.lang.Exception -> Ld3
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Exception -> Ld3
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> Ld3
            if (r2 != 0) goto Lac
            java.util.HashMap r2 = X.BV4.A0u()     // Catch: java.lang.Exception -> Ld3
            r0.set(r2)     // Catch: java.lang.Exception -> Ld3
        Lac:
            java.lang.Object r1 = r2.get(r3)     // Catch: java.lang.Exception -> Ld3
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1     // Catch: java.lang.Exception -> Ld3
            if (r1 != 0) goto Lc8
            java.lang.ClassLoader r0 = r8.getClassLoader()     // Catch: java.lang.Exception -> Ld3
            java.lang.Class r1 = java.lang.Class.forName(r3, r6, r0)     // Catch: java.lang.Exception -> Ld3
            java.lang.Class<?>[] r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.A0M     // Catch: java.lang.Exception -> Ld3
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch: java.lang.Exception -> Ld3
            r1.setAccessible(r5)     // Catch: java.lang.Exception -> Ld3
            r2.put(r3, r1)     // Catch: java.lang.Exception -> Ld3
        Lc8:
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r9}     // Catch: java.lang.Exception -> Ld3
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Exception -> Ld3
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior) r0     // Catch: java.lang.Exception -> Ld3
            goto L5e
        Ld3:
            r1 = move-exception
            java.lang.String r0 = "Could not inflate Behavior subclass "
            java.lang.String r0 = X.FGI.A0M(r0, r3)
            java.lang.RuntimeException r0 = X.BV4.A0d(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8128FUx.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public C8128FUx(int i, int i2) {
        super(i, i2);
        this.A0G = A00(this);
    }

    public C8128FUx(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A0G = A00(this);
    }

    public C8128FUx(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A0G = A00(this);
    }
}
