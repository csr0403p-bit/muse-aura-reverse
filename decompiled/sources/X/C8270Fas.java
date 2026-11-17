package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import com.facebook.aura.R;

/* renamed from: X.Fas, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8270Fas extends ContextWrapper {
    public static Configuration A05;
    public int A00;
    public Configuration A01;
    public Resources.Theme A02;
    public Resources A03;
    public LayoutInflater A04;

    public C8270Fas() {
        super(null);
    }

    private void A00() {
        if (this.A02 == null) {
            this.A02 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.A02.setTo(theme);
            }
        }
        this.A02.applyStyle(this.A00, true);
    }

    public final void A01(Configuration configuration) {
        if (this.A03 != null) {
            throw C3cG.A0Q("getResources() or getAssets() has already been called");
        }
        if (this.A01 != null) {
            throw C3cG.A0Q("Override configuration has already been set");
        }
        this.A01 = new Configuration(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.A03
            if (r0 != 0) goto L28
            android.content.res.Configuration r2 = r3.A01
            if (r2 == 0) goto L29
            android.content.res.Configuration r1 = X.C8270Fas.A05
            if (r1 != 0) goto L16
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r0 = 0
            r1.fontScale = r0
            X.C8270Fas.A05 = r1
        L16:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto L29
            android.content.res.Configuration r0 = r3.A01
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
        L26:
            r3.A03 = r0
        L28:
            return r0
        L29:
            android.content.res.Resources r0 = super.getResources()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8270Fas.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A04;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterCloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.A04 = layoutInflaterCloneInContext;
        return layoutInflaterCloneInContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.A02;
        if (theme != null) {
            return theme;
        }
        if (this.A00 == 0) {
            this.A00 = R.style._name_removed__res_0x7f1300c2;
        }
        A00();
        return this.A02;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A00();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
