package com.facebook.aura.backgroundwork.api;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BLG;
import X.C1BN;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.C9286GCn;
import X.InterfaceC7549F2g;
import com.facebook.aura.backgroundwork.api.BackgroundWorkOwner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class BackgroundWorkOwner implements InterfaceC7549F2g {
    public final BLG<Boolean> _activeDismissed;
    public final BLG<BackgroundWorkHeadline> _activeHeadline;
    public final BLG<Boolean> _standingBy;
    public final C1BN<Boolean> activeDismissed;
    public final C1BN<BackgroundWorkHeadline> activeHeadline;
    public long claimCount;
    public final List<Claim> claims;
    public Claim dismissed;
    public final List<Standby> standbys;
    public final C1BN<Boolean> standingBy;
    public final AbstractC3358CGz userSession;

    public final class Claim implements BackgroundWorkContentClaim {
        public BackgroundWorkContent content;
        public final long sequence;
        public final /* synthetic */ BackgroundWorkOwner this$0;

        public Claim(BackgroundWorkOwner backgroundWorkOwner, BackgroundWorkContent backgroundWorkContent, long j) {
            C7384Etj.A0Y(backgroundWorkContent, 1);
            this.this$0 = backgroundWorkOwner;
            this.content = backgroundWorkContent;
            this.sequence = j;
        }

        public final void setContent(BackgroundWorkContent backgroundWorkContent) {
            C7384Etj.A0Y(backgroundWorkContent, 0);
            this.content = backgroundWorkContent;
        }

        @Override // com.facebook.aura.backgroundwork.api.BackgroundWorkContentClaim
        public void update(BackgroundWorkContent backgroundWorkContent) {
            C7384Etj.A0Y(backgroundWorkContent, 0);
            this.this$0.update(this, backgroundWorkContent);
        }

        public final BackgroundWorkContent getContent() {
            return this.content;
        }

        public final long getSequence() {
            return this.sequence;
        }

        @Override // com.facebook.aura.backgroundwork.api.BackgroundWorkClaim
        public void release() {
            this.this$0.release(this);
        }
    }

    public final class Standby implements BackgroundWorkClaim {
        public Standby() {
        }

        @Override // com.facebook.aura.backgroundwork.api.BackgroundWorkClaim
        public void release() {
            BackgroundWorkOwner.this.release(this);
        }
    }

    public BackgroundWorkOwner(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.claims = C3cG.A0h();
        this.standbys = C3cG.A0h();
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._activeHeadline = c9286GCnA13;
        this.activeHeadline = C3cG.A11(c9286GCnA13);
        C9286GCn c9286GCnA14 = C3cG.A14(false);
        this._activeDismissed = c9286GCnA14;
        this.activeDismissed = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(false);
        this._standingBy = c9286GCnA142;
        this.standingBy = C3cG.A11(c9286GCnA142);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void release(Claim claim) {
        if (this.claims.remove(claim)) {
            publish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(com.facebook.aura.backgroundwork.api.BackgroundWorkOwner.Claim r6, com.facebook.aura.backgroundwork.api.BackgroundWorkContent r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.List<com.facebook.aura.backgroundwork.api.BackgroundWorkOwner$Claim> r0 = r5.claims     // Catch: java.lang.Throwable -> L53
            boolean r0 = r0.contains(r6)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L51
            com.facebook.aura.backgroundwork.api.BackgroundWorkContent r0 = r6.content     // Catch: java.lang.Throwable -> L53
            boolean r0 = X.C7384Etj.areEqual(r0, r7)     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L51
            com.facebook.aura.backgroundwork.api.BackgroundWorkContent r0 = r6.content     // Catch: java.lang.Throwable -> L53
            com.facebook.aura.backgroundwork.api.BackgroundWorkState r4 = r0.state     // Catch: java.lang.Throwable -> L53
            com.facebook.aura.backgroundwork.api.BackgroundWorkState r1 = com.facebook.aura.backgroundwork.api.BackgroundWorkState.FINISHED     // Catch: java.lang.Throwable -> L53
            r3 = 0
            if (r4 == r1) goto L1f
            com.facebook.aura.backgroundwork.api.BackgroundWorkState r0 = r7.state     // Catch: java.lang.Throwable -> L53
            r2 = 1
            if (r0 == r1) goto L20
        L1f:
            r2 = 0
        L20:
            com.facebook.aura.backgroundwork.api.BackgroundWorkOwner$Claim r0 = r5.dismissed     // Catch: java.lang.Throwable -> L53
            if (r0 != r6) goto L2f
            com.facebook.aura.backgroundwork.api.BackgroundWorkState r1 = com.facebook.aura.backgroundwork.api.BackgroundWorkState.NEEDS_USER     // Catch: java.lang.Throwable -> L53
            if (r4 == r1) goto L2f
            com.facebook.aura.backgroundwork.api.BackgroundWorkState r0 = r7.state     // Catch: java.lang.Throwable -> L53
            if (r0 != r1) goto L2f
            r0 = 0
            r5.dismissed = r0     // Catch: java.lang.Throwable -> L53
        L2f:
            r6.setContent(r7)     // Catch: java.lang.Throwable -> L53
            r5.publish()     // Catch: java.lang.Throwable -> L53
            monitor-exit(r5)
            if (r2 == 0) goto L4b
            boolean r0 = r7.notifyWhenFinished
            if (r0 == 0) goto L4b
            int[] r0 = new int[]{r3}
            r0 = r0[r3]
            X.CGz r1 = r5.userSession
            if (r0 != 0) goto L4c
            com.facebook.aura.gateway.service.BackgroundWorkDoneNotifier r0 = com.facebook.aura.gateway.service.BackgroundWorkDoneNotifier.INSTANCE
            r0.onFinished(r1, r7)
        L4b:
            return
        L4c:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass005.A0c(r0)
            throw r0
        L51:
            monitor-exit(r5)
            return
        L53:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.backgroundwork.api.BackgroundWorkOwner.update(com.facebook.aura.backgroundwork.api.BackgroundWorkOwner$Claim, com.facebook.aura.backgroundwork.api.BackgroundWorkContent):void");
    }

    public final synchronized BackgroundWorkContentClaim claim(BackgroundWorkContent backgroundWorkContent) {
        Claim claim;
        C7384Etj.A0Y(backgroundWorkContent, 0);
        long j = this.claimCount + 1;
        this.claimCount = j;
        claim = new Claim(this, backgroundWorkContent, j);
        this.claims.add(claim);
        publish();
        return claim;
    }

    @Override // X.InterfaceC7549F2g
    public synchronized void clearUserData() {
        this.claims.clear();
        this.standbys.clear();
        publish();
    }

    public final synchronized void dismissActive() {
        this.dismissed = (Claim) AbstractC0878AGe.A0G(activeClaims());
        publish();
    }

    public final synchronized void resurfaceActive() {
        if (this.dismissed != null) {
            this.dismissed = null;
            publish();
        }
    }

    public final synchronized BackgroundWorkClaim standBy() {
        Standby standby;
        standby = new Standby();
        this.standbys.add(standby);
        publish();
        return standby;
    }

    public final void stop(String str) {
        Object objPrevious;
        Claim claim;
        BackgroundWorkContent backgroundWorkContent;
        Function0<Unit> function0;
        C7384Etj.A0Y(str, 0);
        synchronized (this) {
            ListIterator listIteratorA0n = C3cG.A0n(this.claims);
            do {
                objPrevious = null;
                if (!listIteratorA0n.hasPrevious()) {
                    break;
                } else {
                    objPrevious = listIteratorA0n.previous();
                }
            } while (!str.equals(((Claim) objPrevious).content.openUri));
            claim = (Claim) objPrevious;
        }
        if (claim == null || (backgroundWorkContent = claim.content) == null || (function0 = backgroundWorkContent.onStop) == null) {
            return;
        }
        function0.invoke();
    }

    private final List<Claim> activeClaims() {
        List<Claim> list = this.claims;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Claim claim : list) {
            if (claim.content.state != BackgroundWorkState.FINISHED) {
                arrayListA0h.add(claim);
            }
        }
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.backgroundwork.api.BackgroundWorkOwner$activeClaims$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                BackgroundWorkState backgroundWorkState = ((BackgroundWorkOwner.Claim) t).content.state;
                BackgroundWorkState backgroundWorkState2 = BackgroundWorkState.NEEDS_USER;
                return Boolean.valueOf(AnonymousClass006.A1Z(backgroundWorkState, backgroundWorkState2)).compareTo(Boolean.valueOf(((BackgroundWorkOwner.Claim) t2).content.state != backgroundWorkState2));
            }
        };
        return AbstractC0878AGe.A0c(arrayListA0h, new Comparator() { // from class: com.facebook.aura.backgroundwork.api.BackgroundWorkOwner$activeClaims$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare == 0 ? Long.valueOf(((BackgroundWorkOwner.Claim) t2).sequence).compareTo(Long.valueOf(((BackgroundWorkOwner.Claim) t).sequence)) : iCompare;
            }
        });
    }

    public final C1BN<Boolean> getActiveDismissed() {
        return this.activeDismissed;
    }

    public final C1BN<BackgroundWorkHeadline> getActiveHeadline() {
        return this.activeHeadline;
    }

    public final C1BN<Boolean> getStandingBy() {
        return this.standingBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.String] */
    private final void publish() {
        List<Claim> listActiveClaims = activeClaims();
        Claim claim = (Claim) AbstractC0878AGe.A0G(listActiveClaims);
        BackgroundWorkHeadline backgroundWorkHeadline = null;
        if (this.dismissed != claim) {
            this.dismissed = null;
        }
        BLG<BackgroundWorkHeadline> blg = this._activeHeadline;
        if (claim != null) {
            BackgroundWorkContent backgroundWorkContent = claim.content;
            HashSet hashSet = new HashSet();
            ArrayList arrayListA0h = C3cG.A0h();
            for (Claim claim2 : listActiveClaims) {
                Claim claim3 = claim2;
                ?? r0 = claim3.content.openUri;
                if (r0 != 0) {
                    claim3 = r0;
                }
                AnonymousClass006.A1P(claim3, claim2, hashSet, arrayListA0h);
            }
            backgroundWorkHeadline = new BackgroundWorkHeadline(backgroundWorkContent, arrayListA0h.size() - 1);
        }
        blg.Af8(backgroundWorkHeadline);
        C3cJ.A0C(this._activeDismissed, AnonymousClass002.A1X(this.dismissed));
        AnonymousClass003.A14(this._standingBy, !this.standbys.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void release(Standby standby) {
        if (this.standbys.remove(standby)) {
            publish();
        }
    }
}
