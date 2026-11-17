package X;

import java.io.Serializable;

/* renamed from: X.Gnf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10007Gnf implements Serializable {
    public static final C10007Gnf A00;
    public static final long serialVersionUID = 1;
    public final Class<?> _contentFilter;
    public final EnumC10065Gom _contentInclusion;
    public final Class<?> _valueFilter;
    public final EnumC10065Gom _valueInclusion;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C10007Gnf c10007Gnf = (C10007Gnf) obj;
                if (c10007Gnf._valueInclusion != this._valueInclusion || c10007Gnf._contentInclusion != this._contentInclusion || c10007Gnf._valueFilter != this._valueFilter || c10007Gnf._contentFilter != this._contentFilter) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        EnumC10065Gom enumC10065Gom = EnumC10065Gom.USE_DEFAULTS;
        A00 = new C10007Gnf(enumC10065Gom, enumC10065Gom, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C10007Gnf A00(X.C10007Gnf r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L48
            X.Gnf r0 = X.C10007Gnf.A00
            if (r11 == r0) goto L48
            X.Gom r9 = r11._valueInclusion
            X.Gom r8 = r11._contentInclusion
            java.lang.Class<?> r7 = r11._valueFilter
            java.lang.Class<?> r6 = r11._contentFilter
            X.Gom r5 = r10._valueInclusion
            r4 = 1
            if (r9 == r5) goto L18
            X.Gom r0 = X.EnumC10065Gom.USE_DEFAULTS
            r3 = 1
            if (r9 != r0) goto L19
        L18:
            r3 = 0
        L19:
            X.Gom r2 = r10._contentInclusion
            if (r8 == r2) goto L22
            X.Gom r0 = X.EnumC10065Gom.USE_DEFAULTS
            r1 = 1
            if (r8 != r0) goto L23
        L22:
            r1 = 0
        L23:
            java.lang.Class<?> r0 = r10._valueFilter
            if (r7 != r0) goto L2a
            if (r6 != r0) goto L2a
            r4 = 0
        L2a:
            if (r3 == 0) goto L38
            X.Gnf r0 = new X.Gnf
            if (r1 == 0) goto L34
            r0.<init>(r9, r8, r7, r6)
            return r0
        L34:
            r0.<init>(r9, r2, r7, r6)
            return r0
        L38:
            if (r1 == 0) goto L40
            X.Gnf r0 = new X.Gnf
            r0.<init>(r5, r8, r7, r6)
            return r0
        L40:
            if (r4 == 0) goto L48
            X.Gnf r0 = new X.Gnf
            r0.<init>(r5, r2, r7, r6)
            return r0
        L48:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10007Gnf.A00(X.Gnf):X.Gnf");
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this._contentInclusion, this._valueInclusion.hashCode() << 2);
    }

    public Object readResolve() {
        EnumC10065Gom enumC10065Gom = this._valueInclusion;
        EnumC10065Gom enumC10065Gom2 = EnumC10065Gom.USE_DEFAULTS;
        return (enumC10065Gom == enumC10065Gom2 && this._contentInclusion == enumC10065Gom2 && this._valueFilter == null && this._contentFilter == null) ? A00 : this;
    }

    public final String toString() {
        StringBuilder sbA0p = BV4.A0p(80);
        sbA0p.append("JsonInclude.Value(value=");
        sbA0p.append(this._valueInclusion);
        sbA0p.append(",content=");
        sbA0p.append(this._contentInclusion);
        Class<?> cls = this._valueFilter;
        if (cls != null) {
            sbA0p.append(",valueFilter=");
            BV6.A18(cls, sbA0p);
            sbA0p.append(".class");
        }
        Class<?> cls2 = this._contentFilter;
        if (cls2 != null) {
            sbA0p.append(",contentFilter=");
            BV6.A18(cls2, sbA0p);
            sbA0p.append(".class");
        }
        return AnonymousClass006.A0z(sbA0p);
    }

    public C10007Gnf(EnumC10065Gom enumC10065Gom, EnumC10065Gom enumC10065Gom2, Class<?> cls, Class<?> cls2) {
        this._valueInclusion = enumC10065Gom == null ? EnumC10065Gom.USE_DEFAULTS : enumC10065Gom;
        this._contentInclusion = enumC10065Gom2 == null ? EnumC10065Gom.USE_DEFAULTS : enumC10065Gom2;
        this._valueFilter = cls == Void.class ? null : cls;
        this._contentFilter = cls2 == Void.class ? null : cls2;
    }
}
