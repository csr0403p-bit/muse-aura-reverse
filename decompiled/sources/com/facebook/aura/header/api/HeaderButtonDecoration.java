package com.facebook.aura.header.api;

import X.AnonymousClass003;
import X.BFM;
import X.BRg;
import X.G0W;
import X.G2k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HeaderButtonDecoration {
    public static final int $stable = 0;
    public final String buttonKey;
    public final G2k<Boolean, BRg, G0W<? super Function0<Unit>, ? super BFM, ? super Integer, Unit>, BFM, Integer, Unit> content;

    public final String getButtonKey() {
        return this.buttonKey;
    }

    public final G2k<Boolean, BRg, G0W<? super Function0<Unit>, ? super BFM, ? super Integer, Unit>, BFM, Integer, Unit> getContent() {
        return this.content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeaderButtonDecoration(String str, G2k<? super Boolean, ? super BRg, ? super G0W<? super Function0<Unit>, ? super BFM, ? super Integer, Unit>, ? super BFM, ? super Integer, Unit> g2k) {
        AnonymousClass003.A0u(str, g2k);
        this.buttonKey = str;
        this.content = g2k;
    }
}
