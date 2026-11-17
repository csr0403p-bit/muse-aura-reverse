package com.facebook.aura.spaces.view;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.AnonymousClass603;
import X.C1BN;
import X.C20Q;
import X.C3Ek;
import X.C3UX;
import X.C3rb;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.EnumC10460Hji;
import X.G0V;
import X.GCV;
import X.HtJ;
import X.Hu1;
import X.Hwg;
import X.HzR;
import com.facebook.aura.R;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.library.repo.SpaceRenameOutcome;
import com.facebook.aura.library.repo.SpaceRenameResult;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.navigation.key.SpaceMenuSheetKey;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.spaces.menu.SpacesSidebarAnalytics;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import com.facebook.aura.spaces.view.SpaceMenuEffect;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class SpaceMenuViewModel extends AEs {
    public static final int $stable = 8;
    public final UnifiedArtifactsRepository artifacts;
    public final C20Q<SpaceMenuEffect> effects;
    public final HzR<SpaceMenuEffect> effectsChannel;
    public final SpaceMenuSheetKey key;
    public final ArtifactsDataSource navigation;
    public final PinnedItemsRepository pinned;
    public final AbstractC3358CGz session;
    public final C1BN<SpaceMenuState> state;

    public final class Factory extends AuraViewModelFactory<SpaceMenuViewModel> {
        public static final int $stable = 8;
        public final SpaceMenuSheetKey key;
        public final C1BN<UnifiedArtifactsRepository.SpaceLookupResult> lookup;
        public final AbstractC3358CGz session;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SpaceMenuViewModel create() {
            return new SpaceMenuViewModel(this.session, this.key, this.lookup);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(AbstractC3358CGz abstractC3358CGz, SpaceMenuSheetKey spaceMenuSheetKey, C1BN<? extends UnifiedArtifactsRepository.SpaceLookupResult> c1bn) {
            AnonymousClass005.A0x(abstractC3358CGz, spaceMenuSheetKey, c1bn);
            this.session = abstractC3358CGz;
            this.key = spaceMenuSheetKey;
            this.lookup = c1bn;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.view.SpaceMenuViewModel$move$1", f = "SpaceMenuViewModel.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 131, 132, 135, 136}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.view.SpaceMenuViewModel$move$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ArtifactPlacementRequest $request;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ArtifactPlacementRequest artifactPlacementRequest, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$request = artifactPlacementRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceMenuViewModel.this.new AnonymousClass1(this.$request, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r7 = 5
                r6 = 4
                r5 = 3
                r2 = 2
                r4 = 1
                if (r0 == 0) goto L1a
                if (r0 == r4) goto L2c
                if (r0 == r2) goto L44
                if (r0 == r5) goto L88
                if (r0 == r6) goto L88
                if (r0 == r7) goto L88
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L1a:
                X.Hwg.A00(r9)
                com.facebook.aura.spaces.view.SpaceMenuViewModel r0 = com.facebook.aura.spaces.view.SpaceMenuViewModel.this
                com.facebook.aura.library.repo.UnifiedArtifactsRepository r1 = r0.artifacts
                com.facebook.aura.library.repo.ArtifactPlacementRequest r0 = r8.$request
                r8.label = r4
                java.lang.Object r9 = r1.setArtifactPlacement(r0, r8)
                if (r9 != r3) goto L2f
                return r3
            L2c:
                X.Hwg.A00(r9)
            L2f:
                com.facebook.aura.library.repo.ArtifactPlacementOutcome$Moved r0 = com.facebook.aura.library.repo.ArtifactPlacementOutcome.Moved.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r9, r0)
                if (r0 == 0) goto L5c
                com.facebook.aura.spaces.view.SpaceMenuViewModel r0 = com.facebook.aura.spaces.view.SpaceMenuViewModel.this
                com.facebook.aura.spaces.repo.PinnedItemsRepository r0 = r0.pinned
                r8.label = r2
                java.lang.Object r0 = r0.m2183refreshNavigationOrderIoAF18A(r8)
                if (r0 != r3) goto L47
                return r3
            L44:
                X.Hwg.A00(r9)
            L47:
                com.facebook.aura.spaces.view.SpaceMenuViewModel r0 = com.facebook.aura.spaces.view.SpaceMenuViewModel.this
                X.HzR<com.facebook.aura.spaces.view.SpaceMenuEffect> r2 = r0.effectsChannel
                com.facebook.aura.library.repo.ArtifactPlacementRequest r0 = r8.$request
                com.facebook.aura.library.repo.ArtifactPlacement r1 = r0.placement
                com.facebook.aura.library.repo.ArtifactPlacement r0 = com.facebook.aura.library.repo.ArtifactPlacement.LIBRARY
                if (r1 == r0) goto L54
                r4 = 0
            L54:
                com.facebook.aura.spaces.view.SpaceMenuEffect$Moved r0 = new com.facebook.aura.spaces.view.SpaceMenuEffect$Moved
                r0.<init>(r4)
                r8.label = r5
                goto L72
            L5c:
                com.facebook.aura.library.repo.ArtifactPlacementOutcome$SidebarFull r0 = com.facebook.aura.library.repo.ArtifactPlacementOutcome.SidebarFull.INSTANCE
                boolean r1 = X.C7384Etj.areEqual(r9, r0)
                com.facebook.aura.spaces.view.SpaceMenuViewModel r0 = com.facebook.aura.spaces.view.SpaceMenuViewModel.this
                X.HzR<com.facebook.aura.spaces.view.SpaceMenuEffect> r2 = r0.effectsChannel
                if (r1 == 0) goto L79
                r1 = 2131887239(0x7f120487, float:1.940908E38)
                com.facebook.aura.spaces.view.SpaceMenuEffect$Failed r0 = new com.facebook.aura.spaces.view.SpaceMenuEffect$Failed
                r0.<init>(r1)
                r8.label = r6
            L72:
                java.lang.Object r0 = r2.AcU(r0, r8)
            L76:
                if (r0 != r3) goto L8b
                return r3
            L79:
                r1 = 2131887238(0x7f120486, float:1.9409077E38)
                com.facebook.aura.spaces.view.SpaceMenuEffect$Failed r0 = new com.facebook.aura.spaces.view.SpaceMenuEffect$Failed
                r0.<init>(r1)
                r8.label = r7
                java.lang.Object r0 = r2.AcU(r0, r8)
                goto L76
            L88:
                X.Hwg.A00(r9)
            L8b:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.SpaceMenuViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.view.SpaceMenuViewModel$rename$1", f = "SpaceMenuViewModel.kt", l = {VoiceCallForegroundService.AVATAR_TARGET_PX, 147, 150, 151}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.view.SpaceMenuViewModel$rename$1, reason: invalid class name and case insensitive filesystem */
    public final class C139731 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $name;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139731(String str, HtJ<? super C139731> htJ) {
            super(2, htJ);
            this.$name = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceMenuViewModel.this.new C139731(this.$name, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HzR<SpaceMenuEffect> hzR;
            SpaceMenuEffect failed;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SpaceMenuViewModel spaceMenuViewModel = SpaceMenuViewModel.this;
                UnifiedArtifactsRepository unifiedArtifactsRepository = spaceMenuViewModel.artifacts;
                String str = spaceMenuViewModel.key.slug;
                String str2 = this.$name;
                this.label = 1;
                obj = unifiedArtifactsRepository.renameSpace(str, str2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3 && i != 4) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            SpaceRenameOutcome spaceRenameOutcome = (SpaceRenameOutcome) obj;
            if (spaceRenameOutcome instanceof SpaceRenameOutcome.Renamed) {
                ArtifactsDataSource artifactsDataSource = SpaceMenuViewModel.this.navigation;
                SpaceRenameResult spaceRenameResult = ((SpaceRenameOutcome.Renamed) spaceRenameOutcome).result;
                artifactsDataSource.applySpaceRename(spaceRenameResult.slug, spaceRenameResult.name);
                hzR = SpaceMenuViewModel.this.effectsChannel;
                failed = SpaceMenuEffect.Renamed.INSTANCE;
                this.L$0 = null;
                this.label = 2;
            } else {
                boolean zAreEqual = C7384Etj.areEqual(spaceRenameOutcome, SpaceRenameOutcome.Busy.INSTANCE);
                hzR = SpaceMenuViewModel.this.effectsChannel;
                if (zAreEqual) {
                    failed = new SpaceMenuEffect.Failed(R.string._name_removed__res_0x7f12060b);
                    this.L$0 = null;
                    this.label = 3;
                } else {
                    failed = new SpaceMenuEffect.Failed(R.string._name_removed__res_0x7f12060d);
                    this.L$0 = null;
                    this.label = 4;
                }
            }
            if (hzR.AcU(failed, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C139731) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.view.SpaceMenuViewModel$togglePin$1", f = "SpaceMenuViewModel.kt", l = {161, 162, 163}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.view.SpaceMenuViewModel$togglePin$1, reason: invalid class name and case insensitive filesystem */
    public final class C139741 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SpaceMenuState $current;
        public Object L$0;
        public int label;
        public final /* synthetic */ SpaceMenuViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139741(SpaceMenuState spaceMenuState, SpaceMenuViewModel spaceMenuViewModel, HtJ<? super C139741> htJ) {
            super(2, htJ);
            this.$current = spaceMenuState;
            this.this$0 = spaceMenuViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C139741(this.$current, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objPinToTop;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SpaceMenuState spaceMenuState = this.$current;
                ArtifactSource artifactSource = spaceMenuState.isShared ? ArtifactSource.SAVED_SPACE : ArtifactSource.SPACE;
                boolean z = spaceMenuState.isPinned;
                SpaceMenuViewModel spaceMenuViewModel = this.this$0;
                ArtifactsDataSource artifactsDataSource = spaceMenuViewModel.navigation;
                String str = spaceMenuViewModel.key.slug;
                this.L$0 = null;
                if (z) {
                    this.label = 1;
                    objPinToTop = artifactsDataSource.unpin(artifactSource, str, this);
                } else {
                    this.label = 2;
                    objPinToTop = artifactsDataSource.pinToTop(artifactSource, str, this);
                }
                if (objPinToTop == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            HzR<SpaceMenuEffect> hzR = this.this$0.effectsChannel;
            SpaceMenuEffect.Pinned pinned = new SpaceMenuEffect.Pinned(!this.$current.isPinned);
            this.L$0 = null;
            this.label = 3;
            if (hzR.AcU(pinned, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C139741) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SpaceMenuViewModel(AbstractC3358CGz abstractC3358CGz, SpaceMenuSheetKey spaceMenuSheetKey, C1BN<? extends UnifiedArtifactsRepository.SpaceLookupResult> c1bn) {
        boolean zA1Z = AnonymousClass005.A1Z(abstractC3358CGz, spaceMenuSheetKey, c1bn);
        this.session = abstractC3358CGz;
        this.key = spaceMenuSheetKey;
        UnifiedArtifactsRepository companion = UnifiedArtifactsRepository.Companion.getInstance(abstractC3358CGz);
        this.artifacts = companion;
        ArtifactsDataSource companion2 = ArtifactsDataSource.Companion.getInstance(abstractC3358CGz);
        this.navigation = companion2;
        this.pinned = PinnedItemsRepository.Companion.getInstance(abstractC3358CGz);
        GCV gcvA00 = AbstractC10623Hzj.A00(C79.A00, -2);
        this.effectsChannel = gcvA00;
        this.effects = Hu1.A01(gcvA00);
        AnonymousClass603 anonymousClass603A00 = C3rb.A00(new SpaceMenuViewModel$state$1(this, null), companion.items, companion2.items, c1bn);
        this.state = AnonymousClass441.A00(new SpaceMenuState(spaceMenuSheetKey.slug, null, false, zA1Z, false, null, false, false, false, false, null, null, null, null, null), AEu.A00(this), anonymousClass603A00, C3Ek.A00);
    }

    public final void move(ArtifactPlacementRequest artifactPlacementRequest) {
        C7384Etj.A0Y(artifactPlacementRequest, 0);
        SpacesSidebarAnalytics.INSTANCE.logMoveFromSpaceMenu(artifactPlacementRequest);
        AnonymousClass001.A1J(new AnonymousClass1(artifactPlacementRequest, null), AEu.A00(this));
    }

    public final void rename(String str) {
        C7384Etj.A0Y(str, 0);
        if (C7BY.A0j(str)) {
            return;
        }
        AnonymousClass001.A1J(new C139731(str, null), AEu.A00(this));
    }

    public final C20Q<SpaceMenuEffect> getEffects() {
        return this.effects;
    }

    public final C1BN<SpaceMenuState> getState() {
        return this.state;
    }

    public final void togglePin() {
        SpaceMenuState value = this.state.getValue();
        if (value.showPin) {
            AnonymousClass001.A1J(new C139741(value, this, null), AEu.A00(this));
        }
    }
}
