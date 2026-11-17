package com.facebook.aura.spaces.menu;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C3Ej;
import X.C3Ek;
import X.C3Pi;
import X.C3UX;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.HwN;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.spaces.menu.PeerSpaceMembersState;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class PeerSpaceMembersViewModel extends AEs {
    public static final int $stable = 8;
    public final UnifiedArtifactsRepository artifacts;
    public final C1BN<Boolean> canDownloadHtml;
    public final C1BN<UnifiedArtifact> catalogEntry;
    public final BLG<UnifiedArtifact> fetchedEntry;
    public final C1BN<String> iconUrl;
    public HoC load;
    public final C1BN<ArtifactPlacementRequest> moveToLibrary;
    public final BLG<PeerSpaceMembersState> mutableState;
    public final C1BN<ArtifactItem> navItem;
    public final PeerSpaceAccessRepository repository;
    public final C1BN<PeerSpaceMembersState> state;

    @DebugMetadata(c = "com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$1", f = "PeerSpaceMembersViewModel.kt", l = {87}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hostMuse;
        public final /* synthetic */ String $spaceId;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$hostMuse = str;
            this.$spaceId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PeerSpaceMembersViewModel.this.new AnonymousClass1(this.$hostMuse, this.$spaceId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG blg;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (PeerSpaceMembersViewModel.this.catalogEntry.getValue() == null) {
                    PeerSpaceMembersViewModel peerSpaceMembersViewModel = PeerSpaceMembersViewModel.this;
                    blg = peerSpaceMembersViewModel.fetchedEntry;
                    UnifiedArtifactsRepository unifiedArtifactsRepository = peerSpaceMembersViewModel.artifacts;
                    String str = this.$hostMuse;
                    String str2 = this.$spaceId;
                    this.L$0 = blg;
                    this.label = 1;
                    obj = unifiedArtifactsRepository.artifactForPeerSpace(str, str2, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            blg = (BLG) this.L$0;
            Hwg.A00(obj);
            blg.Af8(obj);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<PeerSpaceMembersViewModel> {
        public static final int $stable = 8;
        public final String hostMuse;
        public final String spaceId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public PeerSpaceMembersViewModel create() {
            return new PeerSpaceMembersViewModel(new PeerSpaceAccessRepository(this.userSession, this.hostMuse, this.spaceId), this.userSession, this.hostMuse, this.spaceId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            AnonymousClass005.A0x(abstractC3358CGz, str, str2);
            this.userSession = abstractC3358CGz;
            this.hostMuse = str;
            this.spaceId = str2;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$reload$1", f = "PeerSpaceMembersViewModel.kt", l = {98}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel$reload$1, reason: invalid class name and case insensitive filesystem */
    public final class C138951 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public C138951(HtJ<? super C138951> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PeerSpaceMembersViewModel.this.new C138951(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            PeerSpaceMembersState loaded;
            BLG<PeerSpaceMembersState> blg;
            BLG<PeerSpaceMembersState> blg2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    PeerSpaceMembersViewModel peerSpaceMembersViewModel = PeerSpaceMembersViewModel.this;
                    blg2 = peerSpaceMembersViewModel.mutableState;
                    PeerSpaceAccessRepository peerSpaceAccessRepository = peerSpaceMembersViewModel.repository;
                    this.L$0 = blg2;
                    this.L$1 = blg2;
                    this.label = 1;
                    obj = peerSpaceAccessRepository.members(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    blg = blg2;
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    blg = (BLG) this.L$1;
                    blg2 = (BLG) this.L$0;
                    Hwg.A00(obj);
                }
                loaded = new PeerSpaceMembersState.Loaded(AGI.A07((Iterable) obj));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                Set<Integer> set = PeerSpaceMembersViewModelKt.UNAVAILABLE_CODES;
                NetworkException networkException = e2 instanceof NetworkException ? (NetworkException) e2 : null;
                loaded = AbstractC0878AGe.A0k(set, networkException != null ? new Integer(networkException.httpResponseCode) : null) ? PeerSpaceMembersState.Unavailable.INSTANCE : PeerSpaceMembersState.Failed.INSTANCE;
                blg = blg2;
            }
            blg.Af8(loaded);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return PeerSpaceMembersViewModel.this.new C138951(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public PeerSpaceMembersViewModel(PeerSpaceAccessRepository peerSpaceAccessRepository, AbstractC3358CGz abstractC3358CGz, String str, String str2) {
        C7384Etj.A0Y(peerSpaceAccessRepository, 0);
        AnonymousClass005.A11(abstractC3358CGz, str, str2, 1);
        this.repository = peerSpaceAccessRepository;
        UnifiedArtifactsRepository companion = UnifiedArtifactsRepository.Companion.getInstance(abstractC3358CGz);
        this.artifacts = companion;
        C9286GCn c9286GCn = new C9286GCn(HwN.A01);
        this.fetchedEntry = c9286GCn;
        C60I c60iA03 = C3rb.A03(new PeerSpaceMembersViewModel$catalogEntry$1(str, str2, null), companion.items, c9286GCn);
        BLL bllA00 = AEu.A00(this);
        C3Ej c3Ej = C3Ek.A00;
        C3Pi c3PiA00 = AnonymousClass441.A00(null, bllA00, c60iA03, c3Ej);
        this.catalogEntry = c3PiA00;
        C3Pi c3PiA002 = AnonymousClass441.A00(null, AEu.A00(this), new PeerSpaceMembersViewModel$special$$inlined$map$1(ArtifactsDataSource.Companion.getInstance(abstractC3358CGz).items, str, str2), c3Ej);
        this.navItem = c3PiA002;
        this.iconUrl = AnonymousClass441.A00(null, AEu.A00(this), C3rb.A03(new PeerSpaceMembersViewModel$iconUrl$1(abstractC3358CGz, null), c3PiA00, c3PiA002), c3Ej);
        this.moveToLibrary = AnonymousClass441.A00(null, AEu.A00(this), C3rb.A03(new PeerSpaceMembersViewModel$moveToLibrary$1(null), c3PiA00, c3PiA002), c3Ej);
        this.canDownloadHtml = AnonymousClass441.A00(false, AEu.A00(this), new PeerSpaceMembersViewModel$special$$inlined$map$2(c3PiA00), c3Ej);
        C9286GCn c9286GCnA01 = HnJ.A01(PeerSpaceMembersState.Loading.INSTANCE);
        this.mutableState = c9286GCnA01;
        this.state = new C3Pi(null, c9286GCnA01);
        reload();
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(str, str2, null), AEu.A00(this));
    }

    public final void move(ArtifactPlacementRequest artifactPlacementRequest) {
        C7384Etj.A0Y(artifactPlacementRequest, 0);
        this.artifacts.setArtifactPlacementDetached(artifactPlacementRequest, new UnifiedArtifactsRepository.C123361(null));
    }

    public final C1BN<Boolean> getCanDownloadHtml() {
        return this.canDownloadHtml;
    }

    public final C1BN<String> getIconUrl() {
        return this.iconUrl;
    }

    public final C1BN<ArtifactPlacementRequest> getMoveToLibrary() {
        return this.moveToLibrary;
    }

    public final C1BN<PeerSpaceMembersState> getState() {
        return this.state;
    }

    public final void reload() {
        HoC hoC = this.load;
        if (hoC == null || !hoC.isActive()) {
            BLL bllA00 = AEu.A00(this);
            this.load = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C138951(null), bllA00);
        }
    }
}
