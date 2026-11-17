package com.facebook.aura.hotels;

import X.C7384Etj;
import X.G0U;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HotelRequestTicket {
    public final G0U<HtJ<? super HsJ<Unit>>, Object> post;
    public HsJ<Unit> result;

    /* JADX WARN: Multi-variable type inference failed */
    public HotelRequestTicket(G0U<? super HtJ<? super HsJ<Unit>>, ? extends Object> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.post = g0u;
    }

    public final G0U<HtJ<? super HsJ<Unit>>, Object> getPost() {
        return this.post;
    }

    /* renamed from: getResult-xLWZpok, reason: not valid java name */
    public final HsJ<Unit> m1079getResultxLWZpok() {
        return this.result;
    }

    public final void setResult(HsJ<Unit> hsJ) {
        this.result = hsJ;
    }
}
