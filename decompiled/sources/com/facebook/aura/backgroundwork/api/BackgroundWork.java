package com.facebook.aura.backgroundwork.api;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C1BN;
import X.C7384Etj;
import com.facebook.aura.gateway.service.BackgroundWorkDoneNotifier;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class BackgroundWork {
    public static final BackgroundWork INSTANCE = new BackgroundWork();

    /* renamed from: com.facebook.aura.backgroundwork.api.BackgroundWork$owner$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<BackgroundWorkOwner> {
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz) {
            super(0);
            this.$userSession = abstractC3358CGz;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final BackgroundWorkOwner invoke() {
            return new BackgroundWorkOwner(this.$userSession);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ BackgroundWorkOwner invoke() {
            return new BackgroundWorkOwner(this.$userSession);
        }
    }

    public final C1BN<Boolean> activeDismissed(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return owner(abstractC3358CGz).activeDismissed;
    }

    public final C1BN<BackgroundWorkHeadline> activeHeadline(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return owner(abstractC3358CGz).activeHeadline;
    }

    public final void dismissActive(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        owner(abstractC3358CGz).dismissActive();
    }

    public final void resurfaceActive(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        owner(abstractC3358CGz).resurfaceActive();
    }

    public final BackgroundWorkClaim standBy(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return owner(abstractC3358CGz).standBy();
    }

    public final C1BN<Boolean> standingBy(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return owner(abstractC3358CGz).standingBy;
    }

    private final BackgroundWorkOwner owner(AbstractC3358CGz abstractC3358CGz) {
        return (BackgroundWorkOwner) abstractC3358CGz.A03(BackgroundWorkOwner.class, new AnonymousClass1(abstractC3358CGz));
    }

    public final void acknowledge(AbstractC3358CGz abstractC3358CGz, String str) {
        int iA1b = AnonymousClass004.A1b(abstractC3358CGz, str);
        int i = new int[]{iA1b}[iA1b];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        BackgroundWorkDoneNotifier.INSTANCE.onAcknowledged(abstractC3358CGz, str);
    }

    public final BackgroundWorkContentClaim claim(AbstractC3358CGz abstractC3358CGz, BackgroundWorkContent backgroundWorkContent) {
        AnonymousClass003.A0u(abstractC3358CGz, backgroundWorkContent);
        return owner(abstractC3358CGz).claim(backgroundWorkContent);
    }

    public final void stop(AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        owner(abstractC3358CGz).stop(str);
    }
}
