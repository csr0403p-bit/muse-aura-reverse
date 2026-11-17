package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;

/* renamed from: X.EXw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6738EXw {
    public static final C6738EXw A03 = new C6738EXw("", "", false);
    public final String A00;
    public final String A01;
    public final boolean A02;

    static {
        new C6738EXw(PairsDiscretionDocument.TERMINATOR, "  ", true);
    }

    public C6738EXw(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            throw C60O.A0i("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw C60O.A0i("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.A01 = str;
        this.A00 = str2;
        this.A02 = z;
    }
}
