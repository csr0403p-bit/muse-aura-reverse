package com.facebook.tigon;

import X.AnonymousClass003;
import X.FGI;
import com.facebook.tigon.iface.TigonErrorCode;

/* loaded from: classes5.dex */
public final class TigonError {
    public final int A00;
    public final String A01;
    public final String A02;
    public final TigonErrorCode category;

    static {
        new TigonError(TigonErrorCode.A07, "", "", 0);
    }

    public final String A00() {
        return FGI.A0U(FGI.A0S(FGI.A0U(this.category.toString(), " domain: ", this.A02), " code: ", this.A00), " detail: ", this.A01);
    }

    public TigonError(TigonErrorCode tigonErrorCode, String str, String str2, int i) {
        AnonymousClass003.A0w(tigonErrorCode, str2);
        this.category = tigonErrorCode;
        this.A02 = str;
        this.A00 = i;
        this.A01 = str2;
    }
}
