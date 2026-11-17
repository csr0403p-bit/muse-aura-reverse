package com.facebook.aura.json;

import X.C06H;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes2.dex */
public final class HatchEnvelopeMissingResultException extends NetworkException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEnvelopeMissingResultException(String str, int i, String str2, Boolean bool) {
        super(FGI.A0M(str, " response is missing result"), i, str2, null, bool, null, null);
        C7384Etj.A0Y(str, 0);
    }

    public /* synthetic */ HatchEnvelopeMissingResultException(String str, int i, String str2, Boolean bool, int i2, C06H c06h) {
        this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : bool);
    }
}
