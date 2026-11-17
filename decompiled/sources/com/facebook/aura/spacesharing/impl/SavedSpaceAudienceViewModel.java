package com.facebook.aura.spacesharing.impl;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass441;
import X.BLG;
import X.C1BN;
import X.C20Q;
import X.C3Ek;
import X.C3UX;
import X.C3cG;
import X.C3pU;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.spacesharing.impl.SavedSpaceAudience;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SavedSpaceAudienceViewModel extends AEs {
    public static final int $stable = 8;
    public final UnifiedArtifactsRepository artifacts;
    public final BLG<SavedSpaceAudienceState> catalogState;
    public final AbstractC3358CGz session;
    public final String shortcode;
    public final C1BN<SavedSpaceAudienceState> state;
    public final C20Q<String> viewerPhotoUrl;

    @DebugMetadata(c = "com.facebook.aura.spacesharing.impl.SavedSpaceAudienceViewModel$1", f = "SavedSpaceAudienceViewModel.kt", l = {137}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spacesharing.impl.SavedSpaceAudienceViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.spacesharing.impl.SavedSpaceAudienceViewModel$1$1", f = "SavedSpaceAudienceViewModel.kt", l = {86}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.spacesharing.impl.SavedSpaceAudienceViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03861 extends AbstractC07127nr implements G0V<AHD<? extends UnifiedArtifact>, HtJ<? super Unit>, Object> {
            public Object L$0;
            public Object L$1;
            public int label;
            public final /* synthetic */ SavedSpaceAudienceViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03861(SavedSpaceAudienceViewModel savedSpaceAudienceViewModel, HtJ<? super C03861> htJ) {
                super(2, htJ);
                this.this$0 = savedSpaceAudienceViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03861(this.this$0, htJ);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AHD<UnifiedArtifact> ahd, HtJ<? super Unit> htJ) {
                return new C03861(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                SavedSpaceAudienceViewModel savedSpaceAudienceViewModel;
                BLG<SavedSpaceAudienceState> blg;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    savedSpaceAudienceViewModel = this.this$0;
                    blg = savedSpaceAudienceViewModel.catalogState;
                    UnifiedArtifactsRepository unifiedArtifactsRepository = savedSpaceAudienceViewModel.artifacts;
                    String str = savedSpaceAudienceViewModel.shortcode;
                    this.L$0 = blg;
                    this.L$1 = savedSpaceAudienceViewModel;
                    this.label = 1;
                    obj = unifiedArtifactsRepository.lookUpSpaceBySlug(str, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    savedSpaceAudienceViewModel = (SavedSpaceAudienceViewModel) this.L$1;
                    blg = (BLG) this.L$0;
                    Hwg.A00(obj);
                }
                blg.Af8(savedSpaceAudienceViewModel.toState((UnifiedArtifactsRepository.SpaceLookupResult) obj));
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(AHD<? extends UnifiedArtifact> ahd, HtJ<? super Unit> htJ) {
                return invoke2((AHD<UnifiedArtifact>) ahd, htJ);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SavedSpaceAudienceViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SavedSpaceAudienceViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SavedSpaceAudienceViewModel savedSpaceAudienceViewModel = SavedSpaceAudienceViewModel.this;
                C1BN<AHD<UnifiedArtifact>> c1bn = savedSpaceAudienceViewModel.artifacts.items;
                C03861 c03861 = new C03861(savedSpaceAudienceViewModel, null);
                C7384Etj.A0Z(c1bn, AnonymousClass000.A00(33));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C3pU.A00(this, c03861, c1bn) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0Q(AnonymousClass000.A00(24));
        }
    }

    public final class Factory extends AuraViewModelFactory<SavedSpaceAudienceViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz session;
        public final String shortcode;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SavedSpaceAudienceViewModel create() {
            return new SavedSpaceAudienceViewModel(this.session, this.shortcode);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.session = abstractC3358CGz;
            this.shortcode = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SavedSpaceAudienceState toState(UnifiedArtifactsRepository.SpaceLookupResult spaceLookupResult) {
        String str;
        SavedSpaceAudience savedSpaceAudience;
        SavedSpaceAudience savedSpaceAudience2;
        if (spaceLookupResult instanceof UnifiedArtifactsRepository.SpaceLookupResult.Found) {
            UnifiedArtifact unifiedArtifact = ((UnifiedArtifactsRepository.SpaceLookupResult.Found) spaceLookupResult).artifact;
            if (unifiedArtifact.source == ArtifactSource.SAVED_SPACE) {
                return toState(unifiedArtifact);
            }
            str = this.shortcode;
            savedSpaceAudience = SavedSpaceAudience.Revoked.INSTANCE;
        } else {
            if (C7384Etj.areEqual(spaceLookupResult, UnifiedArtifactsRepository.SpaceLookupResult.Missing.INSTANCE)) {
                str = this.shortcode;
                savedSpaceAudience2 = SavedSpaceAudience.Revoked.INSTANCE;
                return new SavedSpaceAudienceState(str, null, null, savedSpaceAudience2);
            }
            if (!C7384Etj.areEqual(spaceLookupResult, UnifiedArtifactsRepository.SpaceLookupResult.Failed.INSTANCE)) {
                throw C3cG.A0q();
            }
            str = this.shortcode;
            savedSpaceAudience = SavedSpaceAudience.Unavailable.INSTANCE;
        }
        savedSpaceAudience2 = savedSpaceAudience;
        return new SavedSpaceAudienceState(str, null, null, savedSpaceAudience2);
    }

    public final C1BN<SavedSpaceAudienceState> getState() {
        return this.state;
    }

    public SavedSpaceAudienceViewModel(AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        this.session = abstractC3358CGz;
        this.shortcode = str;
        this.artifacts = UnifiedArtifactsRepository.Companion.getInstance(abstractC3358CGz);
        C9286GCn c9286GCnA14 = C3cG.A14(new SavedSpaceAudienceState(str, null, null, SavedSpaceAudience.Loading.INSTANCE));
        this.catalogState = c9286GCnA14;
        SavedSpaceAudienceViewModel$special$$inlined$map$1 savedSpaceAudienceViewModel$special$$inlined$map$1 = new SavedSpaceAudienceViewModel$special$$inlined$map$1(AuraViewerDataProvider.Companion.getInstance(abstractC3358CGz).userData);
        this.viewerPhotoUrl = savedSpaceAudienceViewModel$special$$inlined$map$1;
        C60I c60iA03 = C3rb.A03(new SavedSpaceAudienceViewModel$state$1(null), c9286GCnA14, savedSpaceAudienceViewModel$special$$inlined$map$1);
        this.state = AnonymousClass441.A00(c9286GCnA14.getValue(), AEu.A00(this), c60iA03, C3Ek.A00);
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    private final SavedSpaceAudienceState toState(UnifiedArtifact unifiedArtifact) {
        String str = unifiedArtifact.displayName;
        if (C7BY.A0j(str)) {
            str = this.shortcode;
        }
        String strResolveRawAssetUrl = WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(unifiedArtifact.iconUrl, this.session);
        String str2 = unifiedArtifact.viewUrl;
        if (!unifiedArtifact.canOpen) {
            str2 = null;
        }
        return new SavedSpaceAudienceState(str, strResolveRawAssetUrl, str2, SavedSpaceAudienceViewModelKt.toAudience(unifiedArtifact.sharing));
    }
}
