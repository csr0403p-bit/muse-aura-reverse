package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.io.IOException;

/* renamed from: X.C3h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3206C3h extends AbstractC3198C2y implements C3F {
    public AbstractC3214C3v A00;
    public C30[] A01;
    public final AbstractC3211C3m A02;
    public final String A03;

    public C3206C3h(Context context, AbstractC3211C3m abstractC3211C3m, AbstractC3214C3v abstractC3214C3v, File file, String str) {
        super(context, file, true, false);
        this.A01 = null;
        this.A03 = str;
        this.A02 = abstractC3211C3m;
        this.A00 = abstractC3214C3v;
    }

    @Override // X.C3H, X.C3g
    public final String A04() {
        return "SuperpackSoSource";
    }

    @Override // X.C3F
    public final C3g AZr(ApplicationInfo applicationInfo) {
        ((C3H) this).A00 |= 1;
        return this;
    }

    @Override // X.C3H, X.C3g
    public final String toString() {
        String name;
        try {
            name = String.valueOf(((C3H) this).A01.getCanonicalPath());
        } catch (IOException unused) {
            name = ((C3H) this).A01.getName();
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append("SuperpackSoSource");
        sbA0w.append("[root = ");
        sbA0w.append(name);
        sbA0w.append(" flags = ");
        sbA0w.append(((C3H) this).A00);
        sbA0w.append(" split = ");
        sbA0w.append(this.A02);
        sbA0w.append(" compressedPath = ");
        AbstractC3214C3v abstractC3214C3v = this.A00;
        String str = this.A03;
        sbA0w.append(abstractC3214C3v.A00(str));
        sbA0w.append(" identity = ");
        sbA0w.append(str);
        return BV5.A0o(sbA0w);
    }
}
