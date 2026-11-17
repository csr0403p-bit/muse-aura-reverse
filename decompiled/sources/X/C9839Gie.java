package X;

/* renamed from: X.Gie, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9839Gie extends C9838Gid {
    public static final long serialVersionUID = 1;
    public final String _basePackageName;
    public final String _basePackagePrefix;

    @Override // X.C9838Gid
    public final AbstractC9870GjI A01(AbstractC9849Git abstractC9849Git, String str) {
        if (str.startsWith(".")) {
            int length = str.length();
            String str2 = this._basePackageName;
            StringBuilder sbA0p = BV4.A0p(length + str2.length());
            if (str2.isEmpty()) {
                str = str.substring(1);
            } else {
                sbA0p.append(str2);
            }
            str = AnonymousClass001.A0v(str, sbA0p);
        }
        return super.A01(abstractC9849Git, str);
    }

    public C9839Gie(AbstractC9870GjI abstractC9870GjI, AbstractC9841Gig abstractC9841Gig, C9860Gj8 c9860Gj8) {
        super(abstractC9870GjI, abstractC9841Gig, c9860Gj8);
        String strA04 = AbstractC9870GjI.A04(abstractC9870GjI);
        int iLastIndexOf = strA04.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            this._basePackageName = "";
            this._basePackagePrefix = ".";
        } else {
            this._basePackagePrefix = strA04.substring(0, iLastIndexOf + 1);
            this._basePackageName = strA04.substring(0, iLastIndexOf);
        }
    }
}
