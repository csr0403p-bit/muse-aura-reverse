package com.facebook.aura.network.transport.tigon;

import X.AnonymousClass003;
import X.BV4;
import X.BV5;
import X.C60O;
import com.facebook.aura.network.transport.HatchTransportException;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonErrorCode;

/* loaded from: classes5.dex */
public final class TigonTransportException extends HatchTransportException {
    /* JADX WARN: Illegal instructions before constructor call */
    public TigonTransportException(String str, TigonError tigonError) {
        AnonymousClass003.A0u(str, tigonError);
        TigonErrorCode tigonErrorCode = tigonError.category;
        String str2 = tigonError.A02;
        int i = tigonError.A00;
        StringBuilder sbA0q = BV5.A0q(tigonErrorCode);
        C60O.A1R(":", str2, sbA0q);
        super(str, BV4.A0l(sbA0q, i));
    }
}
