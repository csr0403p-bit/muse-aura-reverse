package com.facebook.aura.analytics.impl;

import X.AbstractC3136BzG;
import X.AbstractC7559F3s;
import X.DFX;
import android.os.Trace;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class MetaAnalyticsInstance$instanceLazy$1 extends AbstractC7559F3s implements Function0<DFX> {
    public static final MetaAnalyticsInstance$instanceLazy$1 INSTANCE = new MetaAnalyticsInstance$instanceLazy$1();

    public MetaAnalyticsInstance$instanceLazy$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DFX invoke() {
        AbstractC3136BzG.A00("MetaAnalyticsInstance");
        try {
            return new DFX(new MetaAnalyticsBuilder().builder);
        } finally {
            Trace.endSection();
        }
    }
}
