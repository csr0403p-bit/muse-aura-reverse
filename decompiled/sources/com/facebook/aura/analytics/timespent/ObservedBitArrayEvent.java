package com.facebook.aura.analytics.timespent;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.C7384Etj;
import X.C7BY;
import X.C9tI;
import X.CFK;
import X.DLT;
import com.facebook.aura.analytics.plugins.interfaces.analyticsdecorator.AuraAnalyticsDecoratorInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class ObservedBitArrayEvent implements DLT {
    public final AuraAnalyticsDecoratorInterface analyticsDecorator;
    public final DLT event;
    public Long startTimeSec;
    public int[] tosArray;
    public Integer tosLen;

    @Override // X.DLT
    public DLT addParameter(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (str.equals("tos_array")) {
            int[] bitArrayWords = str2 != null ? parseBitArrayWords(str2) : null;
            this.tosArray = bitArrayWords;
            if (str2 != null && bitArrayWords == null) {
                CFK.A06(TimeSpentAnalyticsKt.TAG, "Rejecting malformed time spent bit array; its CVM copy is not logged");
            }
        }
        this.event.addParameter(str, str2);
        return this;
    }

    private final int[] parseBitArrayWords(String str) {
        String strA0J = C7BY.A0J("[", "]", str);
        if (C7BY.A0j(strA0J)) {
            return new int[0];
        }
        List listA0i = C7BY.A0i(strA0J, new String[]{","}, 0);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0i);
        Iterator it = listA0i.iterator();
        while (it.hasNext()) {
            Integer numA0r = C9tI.A0r(C7BY.A0b(it));
            if (numA0r == null) {
                return null;
            }
            arrayListA0i.add(numA0r);
        }
        return AbstractC0878AGe.A0n(arrayListA0i);
    }

    @Override // X.DLT
    public void logAndRelease() {
        Integer num;
        this.event.logAndRelease();
        Long l = this.startTimeSec;
        if (l != null) {
            long jLongValue = l.longValue();
            int[] iArr = this.tosArray;
            if (iArr == null || (num = this.tosLen) == null) {
                return;
            }
            this.analyticsDecorator.onTimeSpentBitArray(jLongValue, iArr, num.intValue());
        }
    }

    public ObservedBitArrayEvent(DLT dlt, AuraAnalyticsDecoratorInterface auraAnalyticsDecoratorInterface) {
        AnonymousClass003.A0u(dlt, auraAnalyticsDecoratorInterface);
        this.event = dlt;
        this.analyticsDecorator = auraAnalyticsDecoratorInterface;
    }

    @Override // X.DLT
    public DLT addParameter(String str, int i) {
        C7384Etj.A0Y(str, 0);
        if (str.equals("tos_len")) {
            this.tosLen = Integer.valueOf(i);
        }
        this.event.addParameter(str, i);
        return this;
    }

    @Override // X.DLT
    public DLT addParameter(String str, long j) {
        C7384Etj.A0Y(str, 0);
        if (str.equals("start_time")) {
            this.startTimeSec = Long.valueOf(j);
        }
        this.event.addParameter(str, j);
        return this;
    }

    @Override // X.DLT
    public DLT addParameter(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.event.addParameter(str, z);
        return this;
    }

    @Override // X.DLT
    public DLT addParameter(String str, double d) {
        C7384Etj.A0Y(str, 0);
        this.event.addParameter(str, d);
        return this;
    }
}
