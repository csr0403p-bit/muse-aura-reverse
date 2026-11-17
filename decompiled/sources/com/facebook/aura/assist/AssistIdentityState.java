package com.facebook.aura.assist;

import X.AGE;
import X.AGF;
import X.AOW;
import X.AT5;
import X.AT8;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00r;
import X.C1BO;
import X.C3cG;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AssistIdentityState {
    public static final int $stable = AssistIdentityDockPosition.$stable | 8;
    public final MutableState activityVisible$delegate;
    public final AT5<Float, AOW> animation;
    public final MutableState cameraOwner$delegate;
    public final MutableState identity$delegate;
    public final MutableState phase$delegate;
    public final C1BO<Float> progress;
    public final AssistIdentityDockPosition dockPosition = new AssistIdentityDockPosition();
    public final C00r identityHeight$delegate = new ParcelableSnapshotMutableIntState(0);

    @DebugMetadata(c = "com.facebook.aura.assist.AssistIdentityState", f = "AssistIdentityState.kt", l = {89}, m = "animateCollapse", v = 2)
    /* renamed from: com.facebook.aura.assist.AssistIdentityState$animateCollapse$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssistIdentityState.this.animateCollapse(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.assist.AssistIdentityState", f = "AssistIdentityState.kt", l = {94}, m = "animateExpansion", v = 2)
    /* renamed from: com.facebook.aura.assist.AssistIdentityState$animateExpansion$1, reason: invalid class name and case insensitive filesystem */
    public final class C109491 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C109491(HtJ<? super C109491> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AssistIdentityState.this.animateExpansion(this);
        }
    }

    public final void setCameraVisible(Object obj, boolean z) {
        C7384Etj.A0Y(obj, 0);
        if (!z) {
            if (this.cameraOwner$delegate.getValue() != obj) {
                return;
            } else {
                obj = null;
            }
        }
        setCameraOwner(obj);
    }

    private final Object getCameraOwner() {
        return this.cameraOwner$delegate.getValue();
    }

    private final void setCameraOwner(Object obj) {
        this.cameraOwner$delegate.Af8(obj);
    }

    private final void setPhase(AssistIdentityPhase assistIdentityPhase) {
        this.phase$delegate.Af8(assistIdentityPhase);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateCollapse(X.HtJ<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.assist.AssistIdentityState.AnonymousClass1
            if (r0 == 0) goto L43
            r7 = r9
            com.facebook.aura.assist.AssistIdentityState$animateCollapse$1 r7 = (com.facebook.aura.assist.AssistIdentityState.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L28
            if (r0 != r5) goto L49
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.assist.AssistIdentityPhase r0 = com.facebook.aura.assist.AssistIdentityPhase.COLLAPSED
            r8.setPhase(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L28:
            X.Hwg.A00(r1)
            X.AT5<java.lang.Float, X.AOW> r4 = r8.animation
            java.lang.Float r3 = X.AnonymousClass001.A0m()
            X.28s r2 = X.C2HU.A01
            r1 = 0
            r0 = 500(0x1f4, float:7.0E-43)
            X.ASj r0 = X.AnonymousClass002.A0J(r2, r0)
            r7.label = r5
            java.lang.Object r0 = X.AnonymousClass002.A0i(r4, r0, r3, r7, r1)
            if (r0 != r6) goto L20
            return r6
        L43:
            com.facebook.aura.assist.AssistIdentityState$animateCollapse$1 r7 = new com.facebook.aura.assist.AssistIdentityState$animateCollapse$1
            r7.<init>(r9)
            goto L12
        L49:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.AssistIdentityState.animateCollapse(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateExpansion(X.HtJ<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.assist.AssistIdentityState.C109491
            if (r0 == 0) goto L43
            r7 = r9
            com.facebook.aura.assist.AssistIdentityState$animateExpansion$1 r7 = (com.facebook.aura.assist.AssistIdentityState.C109491) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L28
            if (r0 != r5) goto L49
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.assist.AssistIdentityPhase r0 = com.facebook.aura.assist.AssistIdentityPhase.EXPANDED
            r8.setPhase(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L28:
            X.Hwg.A00(r1)
            X.AT5<java.lang.Float, X.AOW> r4 = r8.animation
            java.lang.Float r3 = X.AnonymousClass001.A0l()
            X.28s r2 = X.C2HU.A01
            r1 = 0
            r0 = 500(0x1f4, float:7.0E-43)
            X.ASj r0 = X.AnonymousClass002.A0J(r2, r0)
            r7.label = r5
            java.lang.Object r0 = X.AnonymousClass002.A0i(r4, r0, r3, r7, r1)
            if (r0 != r6) goto L20
            return r6
        L43:
            com.facebook.aura.assist.AssistIdentityState$animateExpansion$1 r7 = new com.facebook.aura.assist.AssistIdentityState$animateExpansion$1
            r7.<init>(r9)
            goto L12
        L49:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.assist.AssistIdentityState.animateExpansion(X.HtJ):java.lang.Object");
    }

    public final boolean getActivityVisible() {
        return MutableState.A0A(this.activityVisible$delegate);
    }

    public final AssistIdentityDockPosition getDockPosition() {
        return this.dockPosition;
    }

    public final AssistIdentityPresentation getIdentity() {
        return (AssistIdentityPresentation) this.identity$delegate.getValue();
    }

    public final int getIdentityHeight() {
        return this.identityHeight$delegate.AGd();
    }

    public final AssistIdentityPhase getPhase() {
        return (AssistIdentityPhase) this.phase$delegate.getValue();
    }

    public final C1BO<Float> getProgress() {
        return this.progress;
    }

    public final boolean isVisible() {
        AssistIdentityPresentation identity;
        if (this.cameraOwner$delegate.getValue() == null) {
            return (MutableState.A0A(this.activityVisible$delegate) || getPhase() != AssistIdentityPhase.EXPANDED) && (identity = getIdentity()) != null && identity.visible;
        }
        return false;
    }

    public final void restore() {
        this.dockPosition.stop();
        if (getPhase() != AssistIdentityPhase.EXPANDED) {
            setPhase(AssistIdentityPhase.EXPANDING);
        }
    }

    public final void setActivityVisible(boolean z) {
        MutableState.A09(z, this.activityVisible$delegate);
    }

    public final void setIdentity(AssistIdentityPresentation assistIdentityPresentation) {
        this.identity$delegate.Af8(assistIdentityPresentation);
    }

    public final void setIdentityHeight(int i) {
        this.identityHeight$delegate.AdX(i);
    }

    public AssistIdentityState() {
        AGE ageA01 = AGF.A01();
        this.identity$delegate = C3cG.A08(ageA01, null);
        this.cameraOwner$delegate = C3cG.A08(ageA01, null);
        this.activityVisible$delegate = C3cG.A08(ageA01, AnonymousClass001.A0i());
        this.phase$delegate = C3cG.A08(ageA01, AssistIdentityPhase.EXPANDED);
        AT5<Float, AOW> at5A00 = AT8.A00(0.0f);
        this.animation = at5A00;
        this.progress = at5A00.A04;
    }

    public final void collapse() {
        AssistIdentityPresentation identity;
        if (getPhase() == AssistIdentityPhase.EXPANDED && (identity = getIdentity()) != null && identity.isVoice) {
            this.dockPosition.stop();
            setPhase(AssistIdentityPhase.COLLAPSING);
        }
    }

    public final void detachPresentation() {
        AssistIdentityPresentation identity = getIdentity();
        AssistIdentityPresentation assistIdentityPresentationM262copy712uMfE = null;
        if (identity != null) {
            assistIdentityPresentationM262copy712uMfE = identity.m262copy712uMfE(identity.isVoice, identity.showingVoice, AnonymousClass002.A0P(identity.bounds.getValue()), identity.windowOrigin, identity.threadId, AssistIdentityState$detachPresentation$1$1.INSTANCE, identity.visible);
        }
        setIdentity(assistIdentityPresentationM262copy712uMfE);
    }

    public final boolean isInteractive() {
        if (isVisible()) {
            return getPhase() == AssistIdentityPhase.EXPANDED || isParked();
        }
        return false;
    }

    public final boolean isParked() {
        return AnonymousClass002.A1Z(getPhase(), AssistIdentityPhase.COLLAPSED);
    }
}
