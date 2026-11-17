package com.facebook.aura.startup.conversation;

import X.CFK;
import X.EnumC10460Hji;
import X.GAt;
import X.GBM;
import X.HoC;
import X.HtJ;
import X.InterfaceC10560Hsz;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationFirstDrawSignal {
    public static final HatchConversationFirstDrawSignal INSTANCE = new HatchConversationFirstDrawSignal();
    public static final InterfaceC10560Hsz<Unit> firstChatViewFinished = new GAt(null);
    public static final InterfaceC10560Hsz<Unit> firstContentDrawn = new GAt(null);

    public final Object awaitFirstChatViewFinished(HtJ<? super Unit> htJ) {
        Object objA0E = ((GBM) firstChatViewFinished).A0E(htJ);
        return objA0E != EnumC10460Hji.A02 ? Unit.INSTANCE : objA0E;
    }

    public final Object awaitFirstContentDrawn(HtJ<? super Unit> htJ) {
        Object objA0E = ((GBM) firstContentDrawn).A0E(htJ);
        return objA0E != EnumC10460Hji.A02 ? Unit.INSTANCE : objA0E;
    }

    public final void onFirstChatViewFinished() {
        HoC hoC = firstChatViewFinished;
        if (hoC.AOG()) {
            return;
        }
        CFK.A05(HatchConversationPrefetchStartupJobKt.TAG, "onFirstChatViewFinished: releasing tab prefetch");
        ((GBM) hoC).A0R(Unit.INSTANCE);
    }

    public final void onFirstContentDrawn() {
        HoC hoC = firstContentDrawn;
        if (hoC.AOG()) {
            return;
        }
        CFK.A05(HatchConversationPrefetchStartupJobKt.TAG, "onFirstContentDrawn: releasing deferred history prefetch");
        ((GBM) hoC).A0R(Unit.INSTANCE);
    }
}
