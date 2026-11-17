package com.facebook.aura.main;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C3cG;
import X.G0V;
import X.G0W;
import com.facebook.aura.auth.AuraSessionManager;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class HatchSessionTransitionHostKt {
    public static final long SETUP_PLAYBACK_FALLBACK_MS = 3000;

    /* renamed from: com.facebook.aura.main.HatchSessionTransitionHostKt$HatchSessionTransitionHost$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<AuraSessionManager.SessionState.Active, BFM, Integer, Unit> $activeContent;
        public final /* synthetic */ boolean $isInitialized;
        public final /* synthetic */ G0W<AbstractC3358CGz, BFM, Integer, Unit> $loadingContent;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraSessionManager.SessionState $sessionState;
        public final /* synthetic */ G0W<Boolean, BFM, Integer, Unit> $signedOutContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(boolean z, AuraSessionManager.SessionState sessionState, G0W<? super Boolean, ? super BFM, ? super Integer, Unit> g0w, G0W<? super AbstractC3358CGz, ? super BFM, ? super Integer, Unit> g0w2, G0W<? super AuraSessionManager.SessionState.Active, ? super BFM, ? super Integer, Unit> g0w3, BRg bRg, int i, int i2) {
            super(2);
            this.$isInitialized = z;
            this.$sessionState = sessionState;
            this.$signedOutContent = g0w;
            this.$loadingContent = g0w2;
            this.$activeContent = g0w3;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSessionTransitionHostKt.HatchSessionTransitionHost(this.$isInitialized, this.$sessionState, this.$signedOutContent, this.$loadingContent, this.$activeContent, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchSessionTransitionHost(boolean r34, com.facebook.aura.auth.AuraSessionManager.SessionState r35, X.G0W<? super java.lang.Boolean, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r36, X.G0W<? super X.AbstractC3358CGz, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r37, X.G0W<? super com.facebook.aura.auth.AuraSessionManager.SessionState.Active, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r38, X.BRg r39, X.BFM r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchSessionTransitionHostKt.HatchSessionTransitionHost(boolean, com.facebook.aura.auth.AuraSessionManager$SessionState, X.G0W, X.G0W, X.G0W, X.BRg, X.BFM, int, int):void");
    }

    public static final AbstractC3358CGz getAuthenticatedSession(AuraSessionManager.SessionState sessionState) {
        if (sessionState instanceof AuraSessionManager.SessionState.Activating) {
            return ((AuraSessionManager.SessionState.Activating) sessionState).session;
        }
        if (sessionState instanceof AuraSessionManager.SessionState.Active) {
            return ((AuraSessionManager.SessionState.Active) sessionState).session;
        }
        if ((sessionState instanceof AuraSessionManager.SessionState.Initializing) || (sessionState instanceof AuraSessionManager.SessionState.SignedOut)) {
            return null;
        }
        throw C3cG.A0q();
    }
}
