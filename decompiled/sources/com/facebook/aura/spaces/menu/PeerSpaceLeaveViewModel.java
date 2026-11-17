package com.facebook.aura.spaces.menu;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BLG;
import X.C1BN;
import X.C20Q;
import X.C3Pi;
import X.C3UX;
import X.C79;
import X.C9286GCn;
import X.G0V;
import X.GCV;
import X.HtJ;
import X.Hu1;
import X.HzR;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class PeerSpaceLeaveViewModel extends AEs {
    public static final int $stable = 8;
    public final C1BN<Boolean> leaving;
    public final C20Q<Unit> left;
    public final BLG<Boolean> mutableLeaving;
    public final HzR<Unit> mutableLeft;
    public final PeerSpaceAccessRepository repository;
    public final AbstractC3358CGz userSession;

    public final class Factory extends AuraViewModelFactory<PeerSpaceLeaveViewModel> {
        public static final int $stable = 8;
        public final String hostMuse;
        public final String spaceId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public PeerSpaceLeaveViewModel create() {
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new PeerSpaceLeaveViewModel(abstractC3358CGz, new PeerSpaceAccessRepository(abstractC3358CGz, this.hostMuse, this.spaceId));
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            AnonymousClass005.A0x(abstractC3358CGz, str, str2);
            this.userSession = abstractC3358CGz;
            this.hostMuse = str;
            this.spaceId = str2;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.menu.PeerSpaceLeaveViewModel$leave$1", f = "PeerSpaceLeaveViewModel.kt", l = {36, R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft, R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceLeaveViewModel$leave$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PeerSpaceLeaveViewModel.this.new AnonymousClass1(htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x004f A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r5 = 3
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L18
                if (r0 == r2) goto L28
                if (r0 == r3) goto L3a
                if (r0 != r5) goto L13
                X.Hwg.A00(r7)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                goto L58
            L13:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L18:
                X.Hwg.A00(r7)
                com.facebook.aura.spaces.menu.PeerSpaceLeaveViewModel r0 = com.facebook.aura.spaces.menu.PeerSpaceLeaveViewModel.this     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                com.facebook.aura.spaces.menu.PeerSpaceAccessRepository r0 = r0.repository     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                r6.label = r2     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                java.lang.Object r0 = r0.leave(r6)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                if (r0 != r4) goto L2b
                return r4
            L28:
                X.Hwg.A00(r7)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
            L2b:
                com.facebook.aura.spaces.menu.PeerSpaceLeaveViewModel r0 = com.facebook.aura.spaces.menu.PeerSpaceLeaveViewModel.this     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                X.HzR<kotlin.Unit> r1 = r0.mutableLeft     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                r6.label = r3     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                java.lang.Object r0 = r1.AcU(r0, r6)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                if (r0 != r4) goto L3d
                return r4
            L3a:
                X.Hwg.A00(r7)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
            L3d:
                com.facebook.aura.library.repo.UnifiedArtifactsRepository$Companion r1 = com.facebook.aura.library.repo.UnifiedArtifactsRepository.Companion     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                com.facebook.aura.spaces.menu.PeerSpaceLeaveViewModel r0 = com.facebook.aura.spaces.menu.PeerSpaceLeaveViewModel.this     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                X.CGz r0 = r0.userSession     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                com.facebook.aura.library.repo.UnifiedArtifactsRepository r0 = r1.getInstance(r0)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                r6.label = r5     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                java.lang.Object r0 = r0.refresh(r2, r6)     // Catch: java.lang.Exception -> L50 java.util.concurrent.CancellationException -> L63
                if (r0 != r4) goto L58
                return r4
            L50:
                com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
                r0 = 2131889649(0x7f120df1, float:1.9413968E38)
                r1.showToast(r0)
            L58:
                com.facebook.aura.spaces.menu.PeerSpaceLeaveViewModel r0 = com.facebook.aura.spaces.menu.PeerSpaceLeaveViewModel.this
                X.BLG<java.lang.Boolean> r1 = r0.mutableLeaving
                r0 = 0
                X.AnonymousClass004.A1D(r0, r1)
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L63:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.menu.PeerSpaceLeaveViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PeerSpaceLeaveViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final C1BN<Boolean> getLeaving() {
        return this.leaving;
    }

    public final C20Q<Unit> getLeft() {
        return this.left;
    }

    public final void leave() {
        if (AnonymousClass003.A1Z(this.mutableLeaving)) {
            return;
        }
        C9286GCn.A00(null, AnonymousClass001.A0i(), (C9286GCn) this.mutableLeaving);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }

    public PeerSpaceLeaveViewModel(AbstractC3358CGz abstractC3358CGz, PeerSpaceAccessRepository peerSpaceAccessRepository) {
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, peerSpaceAccessRepository);
        this.userSession = abstractC3358CGz;
        this.repository = peerSpaceAccessRepository;
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(zA1b);
        this.mutableLeaving = c9286GCnA0v;
        this.leaving = new C3Pi(null, c9286GCnA0v);
        GCV gcvA00 = AbstractC10623Hzj.A00(C79.A00, -1);
        this.mutableLeft = gcvA00;
        this.left = Hu1.A01(gcvA00);
    }
}
