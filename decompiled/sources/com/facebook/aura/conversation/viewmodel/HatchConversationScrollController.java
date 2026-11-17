package com.facebook.aura.conversation.viewmodel;

import X.AbstractC3358CGz;
import X.C06H;
import X.C22I;
import X.C3Em;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C9290GCr;
import X.InterfaceC7549F2g;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchConversationScrollController implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final ConcurrentHashMap<String, C3Em<Unit>> requestsBySession;

    public final void release(String str) {
        C7384Etj.A0Y(str, 0);
        this.requestsBySession.remove(str);
    }

    public final void requestScrollToBottom(String str) {
        C7384Etj.A0Y(str, 0);
        flowFor(str).AhV(Unit.INSTANCE);
    }

    public final C22I<Unit> scrollRequests(String str) {
        C7384Etj.A0Y(str, 0);
        return flowFor(str);
    }

    private final C3Em<Unit> flowFor(String str) {
        C3Em<Unit> c3EmComputeIfAbsent = this.requestsBySession.computeIfAbsent(str, new Function() { // from class: com.facebook.aura.conversation.viewmodel.HatchConversationScrollController.flowFor.1
            public final C3Em<Unit> apply(String str2) {
                return new C9290GCr(C79.A00, 0, 1);
            }

            @Override // java.util.function.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return new C9290GCr(C79.A00, 0, 1);
            }
        });
        C7384Etj.A0U(c3EmComputeIfAbsent);
        return c3EmComputeIfAbsent;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.requestsBySession.clear();
    }

    public final class Companion {
        public final HatchConversationScrollController getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchConversationScrollController) abstractC3358CGz.A03(HatchConversationScrollController.class, HatchConversationScrollController$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchConversationScrollController(C06H c06h) {
        this();
    }

    public HatchConversationScrollController() {
        this.requestsBySession = C60O.A1C();
    }
}
