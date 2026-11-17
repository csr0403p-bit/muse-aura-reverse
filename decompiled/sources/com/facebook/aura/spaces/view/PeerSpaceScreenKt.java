package com.facebook.aura.spaces.view;

import X.AHI;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2k;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.library.view.PeerSpaceLibraryItemsKt;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.spaces.repo.CardMetadata;
import com.facebook.aura.spaces.repo.SpaceCard;
import com.facebook.aura.spaces.repo.SpaceCardPriority;
import com.facebook.aura.spaces.repo.SpaceCardType;
import com.facebook.aura.spaces.view.PeerSpaceUiState;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class PeerSpaceScreenKt {
    public static final String PEER_SPACE_PRESENTATION_PREFIX = "peer_space";

    /* renamed from: com.facebook.aura.spaces.view.PeerSpaceScreenKt$PeerSpaceMessage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$onRetry = function0;
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
            PeerSpaceScreenKt.PeerSpaceMessage(this.$text, this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.PeerSpaceScreenKt$PeerSpaceScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2k<C1DG, G0V<? super Boolean, ? super Function0<? extends Unit>, ? extends Unit>, G0U<? super B6A, ? extends Unit>, BFM, Integer, Unit> {
        public final /* synthetic */ PeerSpaceScreenKey $key;
        public final /* synthetic */ PeerSpacePageLogging $logging;
        public final /* synthetic */ String $presentationKey;
        public final /* synthetic */ C1BO<PeerSpaceUiState> $state$delegate;
        public final /* synthetic */ String $title;
        public final /* synthetic */ PeerSpaceViewModel $viewModel;

        /* renamed from: invoke--orJrPs, reason: not valid java name */
        public final void m2201invokeorJrPs(float f, G0V<? super Boolean, ? super Function0<Unit>, Unit> g0v, G0U<? super B6A, Unit> g0u, BFM bfm, int i) {
            C7384Etj.A0Y(g0u, 2);
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A0U(bfm, g0v);
            }
            if ((i & 384) == 0) {
                iA04 |= AnonymousClass004.A0V(bfm, g0u);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 1171, 1170), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            PeerSpaceUiState value = this.$state$delegate.getValue();
            if (value instanceof PeerSpaceUiState.Ready) {
                bfm.AgE(1231235990);
                PeerSpaceUiState.Ready ready = (PeerSpaceUiState.Ready) value;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$title, bfm.A65(ready.documentUrl));
                PeerSpaceScreenKey peerSpaceScreenKey = this.$key;
                String str = this.$title;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    String str2 = peerSpaceScreenKey.hostMuse;
                    String str3 = peerSpaceScreenKey.spaceId;
                    objAaT = new SpaceCard(FGI.A0d(PeerSpaceLibraryItemsKt.PEER_SPACE_REF_PREFIX, str2, ":", str3), SpaceCardType.HTML_WEB_VIEW, str, str3, null, null, SpaceCardPriority.MEDIUM, null, null, null, null, null, null, null, null, null, AHI.A01, new CardMetadata(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ready.documentUrl, null, null), null, true, null, null, null, null, null);
                    bfm.Ai0(objAaT);
                }
                SpaceCard spaceCard = (SpaceCard) objAaT;
                SpaceRenderState spaceRenderState = SpaceRenderState.READY;
                String str4 = this.$key.spaceId;
                String str5 = spaceCard.id;
                PeerSpaceViewModel peerSpaceViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(peerSpaceViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new PeerSpaceScreenKt$PeerSpaceScreen$4$1$1(peerSpaceViewModel);
                    bfm.Ai0(objAaT2);
                }
                HatchSpacesModalScreenKt.m2193SpaceScreenContent7SJwSw(spaceRenderState, spaceCard, str4, str5, f, null, false, g0v, g0u, (Function0) ((InterfaceC7353EnQ) objAaT2), this.$logging, bfm, AnonymousClass005.A03(iA04 << 18, ((iA04 << 12) & 57344) | 6), 0, 96);
            } else if (C7384Etj.areEqual(value, PeerSpaceUiState.Checking.INSTANCE)) {
                bfm.AgE(-2038464168);
                C1062ATq c1062ATq = C10G.A01;
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, c1062ATq);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                AnonymousClass007.A0s(bfm, bbi);
            } else if (C7384Etj.areEqual(value, PeerSpaceUiState.Unavailable.INSTANCE)) {
                bfm.AgE(-2038459608);
                PeerSpaceScreenKt.PeerSpaceMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dfe), null, C3U4.A04(BRg.A00, f).then(PeerSpaceScreenKt.rememberPeerSpaceImpression(this.$presentationKey, HatchComponent.CONNECTIONS_UNAVAILABLE_STATE, bfm, 48)), bfm, 48, 0);
            } else {
                if (!C7384Etj.areEqual(value, PeerSpaceUiState.Failed.INSTANCE)) {
                    throw AnonymousClass005.A0k(bfm, -2038493579);
                }
                bfm.AgE(-2038443830);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dff);
                boolean zA672 = bfm.A67(this.$viewModel);
                PeerSpaceViewModel peerSpaceViewModel2 = this.$viewModel;
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == C78N.A00) {
                    objAaT3 = new PeerSpaceScreenKt$PeerSpaceScreen$4$3$1(peerSpaceViewModel2);
                    bfm.Ai0(objAaT3);
                }
                PeerSpaceScreenKt.PeerSpaceMessage(strA01, (Function0) objAaT3, C3U4.A04(BRg.A00, f).then(PeerSpaceScreenKt.rememberPeerSpaceImpression(this.$presentationKey, HatchComponent.CONNECTIONS_ERROR_STATE, bfm, 48)), bfm, 0, 0);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, PeerSpaceScreenKey peerSpaceScreenKey, PeerSpaceViewModel peerSpaceViewModel, PeerSpacePageLogging peerSpacePageLogging, String str2, C1BO<? extends PeerSpaceUiState> c1bo) {
            super(5);
            this.$title = str;
            this.$key = peerSpaceScreenKey;
            this.$viewModel = peerSpaceViewModel;
            this.$logging = peerSpacePageLogging;
            this.$presentationKey = str2;
            this.$state$delegate = c1bo;
        }

        @Override // X.G2k
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, G0V<? super Boolean, ? super Function0<? extends Unit>, ? extends Unit> g0v, G0U<? super B6A, ? extends Unit> g0u, BFM bfm, Integer num) {
            m2201invokeorJrPs(c1dg.A00, g0v, g0u, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.view.PeerSpaceScreenKt$PeerSpaceScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PeerSpaceScreenKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(PeerSpaceScreenKey peerSpaceScreenKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = peerSpaceScreenKey;
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
            PeerSpaceScreenKt.PeerSpaceScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void PeerSpaceMessage(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-21852691);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0T(bRgA0Q), 32.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02(C2VU.A04, 16.0f), bfm, C2VU.A00, 54);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), C06G.A0T(bfm), null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16306);
            if (function0 != null) {
                bfm.AgE(-1456116655);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120df7), null, null, AnonymousClass006.A0g(bfm), null, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, (iA0d << 9) & 57344, 0, 134201325);
            } else {
                bfm.AgE(-1455949441);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, function0, bRgA0Q, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PeerSpaceScreen(com.facebook.aura.navigation.key.PeerSpaceScreenKey r30, X.BRg r31, X.BFM r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.PeerSpaceScreenKt.PeerSpaceScreen(com.facebook.aura.navigation.key.PeerSpaceScreenKey, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg rememberPeerSpaceImpression(java.lang.String r4, com.facebook.aura.analytics.hatch.HatchComponent r5, X.BFM r6, int r7) {
        /*
            r0 = r7 & 14
            r0 = r0 ^ 6
            r3 = 0
            r1 = 4
            if (r0 <= r1) goto Le
            boolean r0 = r6.A65(r4)
            if (r0 != 0) goto L13
        Le:
            r0 = r7 & 6
            r2 = 0
            if (r0 != r1) goto L14
        L13:
            r2 = 1
        L14:
            r0 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L22
            boolean r0 = X.AnonymousClass002.A1U(r6, r5)
            if (r0 != 0) goto L26
        L22:
            r0 = r7 & 48
            if (r0 != r1) goto L27
        L26:
            r3 = 1
        L27:
            r2 = r2 | r3
            java.lang.Object r1 = r6.AaT()
            if (r2 != 0) goto L32
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L45
        L32:
            com.facebook.aura.pairs.intf.ConnectionsAnalytics r2 = com.facebook.aura.pairs.intf.ConnectionsAnalytics.INSTANCE
            java.lang.String r1 = r5.getValue()
            java.lang.String r0 = ":"
            java.lang.String r0 = X.FGI.A0U(r4, r0, r1)
            X.BRg r1 = r2.peerSpaceImpression(r5, r0)
            r6.Ai0(r1)
        L45:
            X.BRg r1 = (X.BRg) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.PeerSpaceScreenKt.rememberPeerSpaceImpression(java.lang.String, com.facebook.aura.analytics.hatch.HatchComponent, X.BFM, int):X.BRg");
    }

    public static final /* synthetic */ PeerSpaceUiState access$PeerSpaceScreen$lambda$0(C1BO c1bo) {
        return (PeerSpaceUiState) c1bo.getValue();
    }
}
