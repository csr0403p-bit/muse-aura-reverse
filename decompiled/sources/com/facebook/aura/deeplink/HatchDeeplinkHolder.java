package com.facebook.aura.deeplink;

import X.AnonymousClass002;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HwN;
import com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore;

/* loaded from: classes.dex */
public final class HatchDeeplinkHolder {
    public static final int $stable = 0;
    public static final String CHAT_HOST = "chat";
    public static final HatchDeeplinkHolder INSTANCE = new HatchDeeplinkHolder();
    public static final String INVITE_HOST = "invite";
    public static final String THREAD_HOST = "thread";
    public static final BLG<PendingDeeplinkMessage> _pendingMessage;
    public static final C1BN<HatchDeferredInviteCodeStore.PendingInviteCode> pendingInviteCode;
    public static final C1BN<PendingDeeplinkMessage> pendingMessage;

    public final void consumePendingInviteCode(HatchDeferredInviteCodeStore.PendingInviteCode pendingInviteCode2) {
        C7384Etj.A0Y(pendingInviteCode2, 0);
        HatchDeferredInviteCodeStore.INSTANCE.consume(pendingInviteCode2);
    }

    public final void consumePendingMessage(PendingDeeplinkMessage pendingDeeplinkMessage) {
        C7384Etj.A0Y(pendingDeeplinkMessage, 0);
        C9286GCn.A00(pendingDeeplinkMessage, HwN.A01, (C9286GCn) _pendingMessage);
    }

    public final void setPendingMessage(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        AnonymousClass002.A1I(_pendingMessage, new PendingDeeplinkMessage(str, str2));
    }

    static {
        C9286GCn c9286GCn = new C9286GCn(HwN.A01);
        _pendingMessage = c9286GCn;
        pendingMessage = new C3Pi(null, c9286GCn);
        pendingInviteCode = HatchDeferredInviteCodeStore.pendingInviteCode;
    }

    public final C1BN<HatchDeferredInviteCodeStore.PendingInviteCode> getPendingInviteCode() {
        return pendingInviteCode;
    }

    public final C1BN<PendingDeeplinkMessage> getPendingMessage() {
        return pendingMessage;
    }

    public final String consumePendingInviteCode() {
        return HatchDeferredInviteCodeStore.INSTANCE.consume();
    }
}
