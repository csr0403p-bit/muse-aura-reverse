package com.facebook.aura.composer.view;

import X.C06H;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class DictationSendStandIn {
    public final long bubbleColor;
    public final long iconColor;
    public final boolean isBlocked;
    public final boolean isEnabled;
    public final Function0<Unit> onSend;

    public DictationSendStandIn(long j, long j2, boolean z, boolean z2, Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 4);
        this.bubbleColor = j;
        this.iconColor = j2;
        this.isEnabled = z;
        this.isBlocked = z2;
        this.onSend = function0;
    }

    /* renamed from: getBubbleColor-0d7_KjU, reason: not valid java name */
    public final long m428getBubbleColor0d7_KjU() {
        return this.bubbleColor;
    }

    /* renamed from: getIconColor-0d7_KjU, reason: not valid java name */
    public final long m429getIconColor0d7_KjU() {
        return this.iconColor;
    }

    public final Function0<Unit> getOnSend() {
        return this.onSend;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public /* synthetic */ DictationSendStandIn(long j, long j2, boolean z, boolean z2, Function0 function0, C06H c06h) {
        this(j, j2, z, z2, function0);
    }
}
