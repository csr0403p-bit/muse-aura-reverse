package X;

import android.os.Build;
import android.view.View;

/* renamed from: X.FRp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8061FRp<T> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Class<T> A03;

    public final T A01(View view) {
        boolean zIsScreenReaderFocusable;
        if (Build.VERSION.SDK_INT < this.A01) {
            T t = (T) view.getTag(this.A02);
            if (this.A03.isInstance(t)) {
                return t;
            }
            return null;
        }
        switch (((I0D) this).$t) {
            case 0:
                zIsScreenReaderFocusable = view.isScreenReaderFocusable();
                break;
            case 1:
                return (T) view.getAccessibilityPaneTitle();
            case 2:
                return (T) AbstractC8059FRn.A01(view);
            default:
                zIsScreenReaderFocusable = view.isAccessibilityHeading();
                break;
        }
        return (T) Boolean.valueOf(zIsScreenReaderFocusable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.view.View r4, T r5) {
        /*
            r3 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            int r0 = r3.A01
            if (r1 < r0) goto L15
            X.I0D r3 = (X.I0D) r3
            int r0 = r3.$t
            switch(r0) {
                case 0: goto L63;
                case 1: goto L6b;
                case 2: goto L71;
                default: goto Ld;
            }
        Ld:
            boolean r0 = X.AnonymousClass001.A1X(r5)
            r4.setAccessibilityHeading(r0)
        L14:
            return
        L15:
            java.lang.Object r2 = r3.A01(r4)
            r0 = r3
            X.I0D r0 = (X.I0D) r0
            int r0 = r0.$t
            switch(r0) {
                case 1: goto L3d;
                case 2: goto L71;
                default: goto L21;
            }
        L21:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r1 = r5
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r2 == 0) goto L2f
            boolean r0 = r2.booleanValue()
            r2 = 1
            if (r0 != 0) goto L30
        L2f:
            r2 = 0
        L30:
            if (r1 == 0) goto L39
            boolean r1 = r1.booleanValue()
            r0 = 1
            if (r1 != 0) goto L3a
        L39:
            r0 = 0
        L3a:
            if (r2 != r0) goto L4a
            return
        L3d:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L14
        L4a:
            X.FRg r0 = X.AbstractC8060FRo.A00(r4)
            if (r0 != 0) goto L55
            X.FRg r0 = new X.FRg
            r0.<init>()
        L55:
            X.AbstractC8060FRo.A06(r4, r0)
            int r0 = r3.A02
            r4.setTag(r0, r5)
            int r0 = r3.A00
            X.AbstractC8060FRo.A04(r4, r0)
            return
        L63:
            boolean r0 = X.AnonymousClass001.A1X(r5)
            r4.setScreenReaderFocusable(r0)
            return
        L6b:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setAccessibilityPaneTitle(r5)
            return
        L71:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8061FRp.A02(android.view.View, java.lang.Object):void");
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/lang/Class<TT;>;II)V */
    public AbstractC8061FRp(Class cls, int i, int i2, int i3) {
        this.A02 = i;
        this.A03 = cls;
        this.A00 = i2;
        this.A01 = i3;
    }
}
