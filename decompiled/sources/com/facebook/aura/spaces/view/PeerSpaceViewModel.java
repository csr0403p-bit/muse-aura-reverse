package com.facebook.aura.spaces.view;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3Pi;
import X.C3UX;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.GDB;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSpaceEntryPoint;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.library.repo.PeerSpaceAccess;
import com.facebook.aura.library.repo.PeerSpaceAccessKt;
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import com.facebook.aura.spaces.repo.SpacesWebViewSessionKt;
import com.facebook.aura.spaces.view.PeerSpaceUiState;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class PeerSpaceViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<PeerSpaceUiState> _state;
    public HoC checkJob;
    public final String hostMuse;
    public final String itemKey;
    public final AtomicBoolean recordedRecent;
    public final String spaceId;
    public final C1BN<PeerSpaceUiState> state;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.spaces.view.PeerSpaceViewModel$1", f = "PeerSpaceViewModel.kt", l = {63}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.view.PeerSpaceViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PeerSpaceViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<AHD<ArtifactItem>> c1bn = ArtifactsDataSource.Companion.getInstance(PeerSpaceViewModel.this.userSession).items;
                final PeerSpaceViewModel peerSpaceViewModel = PeerSpaceViewModel.this;
                C20Q c20qA01 = GDB.A01(new PeerSpaceViewModel$1$invokeSuspend$$inlined$map$1(c1bn, peerSpaceViewModel));
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.spaces.view.PeerSpaceViewModel.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if (!z && (peerSpaceViewModel._state.getValue() instanceof PeerSpaceUiState.Ready)) {
                            peerSpaceViewModel.check();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20qA01.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PeerSpaceViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<PeerSpaceViewModel> {
        public static final int $stable = 8;
        public final String hostMuse;
        public final String spaceId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public PeerSpaceViewModel create() {
            return new PeerSpaceViewModel(this.userSession, this.hostMuse, this.spaceId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            AnonymousClass005.A0x(abstractC3358CGz, str, str2);
            this.userSession = abstractC3358CGz;
            this.hostMuse = str;
            this.spaceId = str2;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.view.PeerSpaceViewModel$check$1", f = "PeerSpaceViewModel.kt", l = {83}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.view.PeerSpaceViewModel$check$1, reason: invalid class name and case insensitive filesystem */
    public final class C139701 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        /* renamed from: com.facebook.aura.spaces.view.PeerSpaceViewModel$check$1$WhenMappings */
        /* loaded from: classes3.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PeerSpaceAccess.values().length];
                try {
                    AnonymousClass002.A13(PeerSpaceAccess.AVAILABLE, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(PeerSpaceAccess.UNAVAILABLE, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(PeerSpaceAccess.UNREACHABLE, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C139701(HtJ<? super C139701> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PeerSpaceViewModel.this.new C139701(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG<PeerSpaceUiState> blg;
            PeerSpaceUiState ready;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PeerSpaceViewModel peerSpaceViewModel = PeerSpaceViewModel.this;
                blg = peerSpaceViewModel._state;
                AbstractC3358CGz abstractC3358CGz = peerSpaceViewModel.userSession;
                String str = peerSpaceViewModel.hostMuse;
                String str2 = peerSpaceViewModel.spaceId;
                this.L$0 = blg;
                this.label = 1;
                obj = PeerSpaceAccessKt.checkPeerSpaceAccess(abstractC3358CGz, str, str2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                blg = (BLG) this.L$0;
                Hwg.A00(obj);
            }
            int iOrdinal = ((PeerSpaceAccess) obj).ordinal();
            if (iOrdinal == 0) {
                PeerSpaceViewModel peerSpaceViewModel2 = PeerSpaceViewModel.this;
                String str3 = peerSpaceViewModel2.spaceId;
                ready = new PeerSpaceUiState.Ready(SpacesWebViewSessionKt.peerSpaceDocumentUrl(str3, UnifiedArtifactKt.peerSpaceRootPath(peerSpaceViewModel2.hostMuse, str3)));
                PeerSpaceViewModel.this.recordRecent();
            } else if (iOrdinal == 1) {
                ready = PeerSpaceUiState.Unavailable.INSTANCE;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ready = PeerSpaceUiState.Failed.INSTANCE;
            }
            blg.Af8(ready);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PeerSpaceViewModel.this.new C139701(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.view.PeerSpaceViewModel$recordRecent$1", f = "PeerSpaceViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.view.PeerSpaceViewModel$recordRecent$1, reason: invalid class name and case insensitive filesystem */
    public final class C139711 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C139711(HtJ<? super C139711> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PeerSpaceViewModel.this.new C139711(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ArtifactsDataSource companion = ArtifactsDataSource.Companion.getInstance(PeerSpaceViewModel.this.userSession);
                ArtifactSource artifactSource = ArtifactSource.PEER_SPACE;
                String str = PeerSpaceViewModel.this.itemKey;
                this.label = 1;
                if (companion.touchRecent(artifactSource, str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PeerSpaceViewModel.this.new C139711(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public PeerSpaceViewModel(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
        AnonymousClass005.A10(abstractC3358CGz, str, str2);
        this.userSession = abstractC3358CGz;
        this.hostMuse = str;
        this.spaceId = str2;
        C9286GCn c9286GCnA01 = HnJ.A01(PeerSpaceUiState.Checking.INSTANCE);
        this._state = c9286GCnA01;
        this.state = new C3Pi(null, c9286GCnA01);
        this.recordedRecent = new AtomicBoolean(false);
        this.itemKey = FGI.A0U(str, ":", str2);
        check();
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void check() {
        HtJ htJA13 = AnonymousClass006.A13(this.checkJob);
        BLL bllA00 = AEu.A00(this);
        this.checkJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C139701(htJA13), bllA00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordRecent() {
        if (this.recordedRecent.compareAndSet(false, true)) {
            HatchImpressionLogger.INSTANCE.logImpression(HatchOrigin.SPACES, HatchSurface.SPACES, null, HatchScreen.SPACES_HOME, HatchComponent.SPACE_CARD, null, AnonymousClass007.A0d(HatchMetadataKey.ENTRY_POINT.getValue(), HatchSpaceEntryPoint.PEER_SPACE.getValue(), new HxE(HatchMetadataKey.SPACE_ID.getValue(), this.spaceId)), null);
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C139711(null), AEu.A00(this));
        }
    }

    public final void accessEnded() {
        this._state.Af8(PeerSpaceUiState.Unavailable.INSTANCE);
    }

    public final C1BN<PeerSpaceUiState> getState() {
        return this.state;
    }

    public final void retry() {
        this._state.Af8(PeerSpaceUiState.Checking.INSTANCE);
        check();
    }
}
