package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class I0T implements View.OnFocusChangeListener {
    public final int $t;
    public final Object A00;

    public I0T(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    @Override // android.view.View.OnFocusChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFocusChange(android.view.View r3, boolean r4) {
        /*
            r2 = this;
            int r0 = r2.$t
            switch(r0) {
                case 0: goto Ld;
                case 1: goto L6d;
                case 2: goto L89;
                case 3: goto L9b;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = "textInputLayout"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        Ld:
            boolean r0 = r3 instanceof X.FL4
            if (r0 == 0) goto L9a
            if (r4 == 0) goto L4f
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r0 = r2.A00
            X.FKx r0 = (X.C7925FKx) r0
            r2 = 0
            X.C7384Etj.A0Y(r3, r2)
            android.text.method.KeyListener r1 = r0.A00
            if (r1 != 0) goto L27
            X.FKv r0 = r0.A03
            if (r0 == 0) goto L4a
            android.text.method.KeyListener r1 = r0.A0H
        L27:
            android.text.method.KeyListener r0 = r3.getKeyListener()
            if (r0 != r1) goto L33
            android.text.TextUtils$TruncateAt r0 = r3.getEllipsize()
            if (r0 == 0) goto L9a
        L33:
            r3.setKeyListener(r1)
            r0 = 0
            r3.setEllipsize(r0)
            r3.getExtendedPaddingTop()
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            X.I0m r0 = new X.I0m
            r0.<init>(r3, r2)
            r1.addOnPreDrawListener(r0)
            return
        L4a:
            java.lang.IllegalStateException r0 = X.BV4.A0U()
            throw r0
        L4f:
            X.FL4 r3 = (X.FL4) r3
            android.text.TextUtils$TruncateAt r0 = r3.getEllipsize()
            if (r0 != 0) goto L9a
            boolean r0 = X.AbstractC7924FKw.A03(r3)
            if (r0 == 0) goto L9a
            boolean r0 = X.AbstractC7924FKw.A02(r3)
            if (r0 == 0) goto L9a
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            java.lang.Object r0 = r2.A00
            X.FKx r0 = (X.C7925FKx) r0
            X.AbstractC7924FKw.A00(r1, r0, r3)
            return
        L6d:
            if (r4 == 0) goto L9a
            java.lang.Object r1 = r2.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "input_method"
            java.lang.Object r2 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            X.C7384Etj.A0Z(r2, r0)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            android.os.IBinder r1 = r3.getWindowToken()
            r0 = 0
            r2.hideSoftInputFromWindow(r1, r0)
            return
        L89:
            java.lang.Object r0 = r2.A00
            X.FKk r0 = (X.C7912FKk) r0
            if (r4 == 0) goto L97
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.A0K
        L91:
            if (r0 == 0) goto L9a
            r0.invoke()
            return
        L97:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r0.A0L
            goto L91
        L9a:
            return
        L9b:
            android.widget.EditText r3 = (android.widget.EditText) r3
            android.text.Editable r0 = r3.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 != 0) goto Lab
            r0 = 1
            if (r4 != 0) goto Lac
        Lab:
            r0 = 0
        Lac:
            X.AbstractC8172FXo.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I0T.onFocusChange(android.view.View, boolean):void");
    }
}
