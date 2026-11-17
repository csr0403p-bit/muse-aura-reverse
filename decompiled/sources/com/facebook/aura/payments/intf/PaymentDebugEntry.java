package com.facebook.aura.payments.intf;

import X.AnonymousClass003;
import X.C06H;
import com.facebook.aura.navigation.AuraNavKey;

/* loaded from: classes.dex */
public final class PaymentDebugEntry {
    public static final int $stable = 8;
    public final String id;
    public final Integer subtitleRes;
    public final AuraNavKey target;
    public final int titleRes;

    public final String getId() {
        return this.id;
    }

    public final Integer getSubtitleRes() {
        return this.subtitleRes;
    }

    public final AuraNavKey getTarget() {
        return this.target;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public PaymentDebugEntry(String str, int i, AuraNavKey auraNavKey, Integer num) {
        AnonymousClass003.A0v(str, auraNavKey);
        this.id = str;
        this.titleRes = i;
        this.target = auraNavKey;
        this.subtitleRes = num;
    }

    public /* synthetic */ PaymentDebugEntry(String str, int i, AuraNavKey auraNavKey, Integer num, int i2, C06H c06h) {
        this(str, i, auraNavKey, (i2 & 8) != 0 ? null : num);
    }
}
