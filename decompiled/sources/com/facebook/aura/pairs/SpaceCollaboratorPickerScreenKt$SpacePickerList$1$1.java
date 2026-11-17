package com.facebook.aura.pairs;

import X.AHD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C0CD;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0W;
import X.G2j;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ SpacePickerUiState $state;
    public final /* synthetic */ SpaceCollaboratorPickerViewModel $viewModel;

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ SpacePickerUiState $state;
        public final /* synthetic */ SpaceCollaboratorPickerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SpacePickerUiState spacePickerUiState, SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel) {
            super(3);
            this.$state = spacePickerUiState;
            this.$viewModel = spaceCollaboratorPickerViewModel;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean z = this.$state.mintingLink;
            SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(spaceCollaboratorPickerViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$1$1$1(spaceCollaboratorPickerViewModel);
                bfm.Ai0(objAaT);
            }
            SpaceCollaboratorPickerScreenKt.SpacePickerLinkRow(z, (Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 4);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ SpacePickerUiState $state;
        public final /* synthetic */ SpaceCollaboratorPickerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SpacePickerUiState spacePickerUiState, SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel) {
            super(3);
            this.$state = spacePickerUiState;
            this.$viewModel = spaceCollaboratorPickerViewModel;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            String str = this.$state.query;
            SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(spaceCollaboratorPickerViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$2$1$1(spaceCollaboratorPickerViewModel);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT);
            ConnectionsComponentsKt.m1651PairsSearchFieldwBJOh4Y(str, g0u, C3U4.A0C(BRg.A00, 20.0f, 4.0f, 20.0f, 12.0f), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fc9), 0L, 0L, bfm, 0, 48);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ SpacePickerUiState $state;
        public final /* synthetic */ SpaceCollaboratorPickerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SpacePickerUiState spacePickerUiState, SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel) {
            super(3);
            this.$state = spacePickerUiState;
            this.$viewModel = spaceCollaboratorPickerViewModel;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            SpacePickerUiState spacePickerUiState = this.$state;
            SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(spaceCollaboratorPickerViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$3$1$1(spaceCollaboratorPickerViewModel);
                bfm.Ai0(objAaT);
            }
            SpaceCollaboratorPickerScreenKt.SpacePickerChips(spacePickerUiState, (G0U) ((InterfaceC7353EnQ) objAaT), null, bfm, SpacePickerUiState.$stable, 4);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<SpacePickerPerson, Object> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1);
        }

        @Override // X.G0U
        public final Object invoke(SpacePickerPerson spacePickerPerson) {
            C7384Etj.A0Y(spacePickerPerson, 0);
            return FGI.A0M("c:", spacePickerPerson.id);
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ SpaceCollaboratorPickerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel) {
            super(3);
            this.$viewModel = spaceCollaboratorPickerViewModel;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(spaceCollaboratorPickerViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$6$1$1(spaceCollaboratorPickerViewModel);
                bfm.Ai0(objAaT);
            }
            SpaceCollaboratorPickerScreenKt.SpacePickerSuggestionsFailed((Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 2);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0U<SpacePickerPerson, Object> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(1);
        }

        @Override // X.G0U
        public final Object invoke(SpacePickerPerson spacePickerPerson) {
            C7384Etj.A0Y(spacePickerPerson, 0);
            return FGI.A0M("s:", spacePickerPerson.id);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ("link", null, B1V.A01(new AnonymousClass1(this.$state, this.$viewModel), -2068211084, true));
        c0cd.APJ(AuraDeeplinkRouteMapper.SEARCH_ROUTE, null, B1V.A01(new AnonymousClass2(this.$state, this.$viewModel), 308202987, true));
        if (!this.$state.selected.isEmpty()) {
            c0cd.APJ("selected", null, B1V.A01(new AnonymousClass3(this.$state, this.$viewModel), 902158095, true));
        }
        if (this.$state.atLimit) {
            c0cd.APJ(PhotosSearchHandlerKt.PARAM_LIMIT, null, ComposableSingletons$SpaceCollaboratorPickerScreenKt.f210lambda$1320267834);
        }
        if (this.$state.getHasNoMatches()) {
            c0cd.APJ("no-matches", null, ComposableSingletons$SpaceCollaboratorPickerScreenKt.lambda$892148103);
        }
        if (!this.$state.connections.isEmpty()) {
            c0cd.APJ("connections-header", null, ComposableSingletons$SpaceCollaboratorPickerScreenKt.f209lambda$1190403256);
            final SpacePickerUiState spacePickerUiState = this.$state;
            final AHD<SpacePickerPerson> ahd = spacePickerUiState.connections;
            final AnonymousClass4 anonymousClass4 = AnonymousClass4.INSTANCE;
            final SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel = this.$viewModel;
            final SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$1 spaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$1
                @Override // X.G0U
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return null;
                }

                @Override // X.G0U
                public final Void invoke(SpacePickerPerson spacePickerPerson) {
                    return null;
                }
            };
            c0cd.APL(anonymousClass4 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$2
                public final Object invoke(int i) {
                    return AnonymousClass006.A0p(ahd, anonymousClass4, i);
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(AnonymousClass001.A0F(num));
                }
            } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$3
                public final Object invoke(int i) {
                    return AnonymousClass006.A0p(ahd, spaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$1, i);
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(AnonymousClass001.A0F(num));
                }
            }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$4
                public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                    int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                    if ((i2 & 48) == 0) {
                        iA0d |= AnonymousClass004.A0E(bfm, i);
                    }
                    if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                        bfm.Afo();
                        return;
                    }
                    SpacePickerPerson spacePickerPerson = (SpacePickerPerson) ahd.get(i);
                    bfm.AgE(-857230382);
                    boolean zIsSelected = spacePickerUiState.isSelected(spacePickerPerson);
                    boolean zA67 = bfm.A67(spaceCollaboratorPickerViewModel);
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$5$1$1(spaceCollaboratorPickerViewModel);
                        bfm.Ai0(objAaT);
                    }
                    SpaceCollaboratorPickerScreenKt.SpacePickerRow(spacePickerPerson, zIsSelected, (G0U) ((InterfaceC7353EnQ) objAaT), null, bfm, SpacePickerPerson.$stable, 8);
                    AnonymousClass002.A19(bfm);
                }

                @Override // X.G2j
                public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                    invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                    return Unit.INSTANCE;
                }
            }, 802480018, true), ahd.size());
        }
        if (!this.$state.suggested.isEmpty() || this.$state.suggestionsFailed) {
            c0cd.APJ("suggested-header", null, ComposableSingletons$SpaceCollaboratorPickerScreenKt.lambda$1022012681);
        }
        if (this.$state.suggestionsFailed) {
            c0cd.APJ("suggested-failed", null, B1V.A01(new AnonymousClass6(this.$viewModel), -1060538678, true));
        }
        final SpacePickerUiState spacePickerUiState2 = this.$state;
        final AHD<SpacePickerPerson> ahd2 = spacePickerUiState2.suggested;
        final AnonymousClass7 anonymousClass7 = AnonymousClass7.INSTANCE;
        final SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel2 = this.$viewModel;
        final SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$5 spaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$5 = new G0U() { // from class: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$5
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(SpacePickerPerson spacePickerPerson) {
                return null;
            }
        };
        c0cd.APL(anonymousClass7 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$6
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd2, anonymousClass7, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$7
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd2, spaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$5, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$invoke$$inlined$items$default$8
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                SpacePickerPerson spacePickerPerson = (SpacePickerPerson) ahd2.get(i);
                bfm.AgE(-359843610);
                boolean zIsSelected = spacePickerUiState2.isSelected(spacePickerPerson);
                boolean zA67 = bfm.A67(spaceCollaboratorPickerViewModel2);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1$8$1$1(spaceCollaboratorPickerViewModel2);
                    bfm.Ai0(objAaT);
                }
                SpaceCollaboratorPickerScreenKt.SpacePickerRow(spacePickerPerson, zIsSelected, (G0U) ((InterfaceC7353EnQ) objAaT), null, bfm, SpacePickerPerson.$stable, 8);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018, true), ahd2.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceCollaboratorPickerScreenKt$SpacePickerList$1$1(SpacePickerUiState spacePickerUiState, SpaceCollaboratorPickerViewModel spaceCollaboratorPickerViewModel) {
        super(1);
        this.$state = spacePickerUiState;
        this.$viewModel = spaceCollaboratorPickerViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
