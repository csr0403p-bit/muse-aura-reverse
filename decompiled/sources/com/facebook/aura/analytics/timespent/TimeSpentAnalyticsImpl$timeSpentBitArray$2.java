package com.facebook.aura.analytics.timespent;

import X.AbstractC7559F3s;
import X.BV4;
import X.C4930DFb;
import X.CIA;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TimeSpentAnalyticsImpl$timeSpentBitArray$2 extends AbstractC7559F3s implements Function0<String> {
    public static final TimeSpentAnalyticsImpl$timeSpentBitArray$2 INSTANCE = new TimeSpentAnalyticsImpl$timeSpentBitArray$2();

    public TimeSpentAnalyticsImpl$timeSpentBitArray$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        C4930DFb c4930DFb = BV4.A0C().A06;
        synchronized (c4930DFb) {
            CIA cia = c4930DFb.A00;
            if (cia == null) {
                return null;
            }
            return cia.A02;
        }
    }
}
