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
import X.C01N;
import X.C0CD;
import X.C10G;
import X.C3U4;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.G2j;
import com.facebook.aura.R;
import com.facebook.aura.pairs.PairsHistoryUiState;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PairsHistoryScreenKt$PairsHistoryList$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ ConnectionsLogContext $log;
    public final /* synthetic */ Function0<Unit> $onRetryOlder;
    public final /* synthetic */ G0U<String, ConnectionsSharedLinkTarget> $sharedLinkTarget;
    public final /* synthetic */ PairsHistoryUiState.Ready $state;

    /* renamed from: com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistoryList$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onRetryOlder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(3);
            this.$onRetryOlder = function0;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                PairsComponentsKt.PairsMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d62), C10G.A04(BRg.A00, 96.0f), this.$onRetryOlder, bfm, 48, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistoryList$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<PairsHistoryMessage, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(PairsHistoryMessage pairsHistoryMessage) {
            PairsHistoryMessage pairsHistoryMessage2 = pairsHistoryMessage;
            C7384Etj.A0Y(pairsHistoryMessage2, 0);
            return pairsHistoryMessage2.id;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PairsHistoryMessage pairsHistoryMessage) {
            C7384Etj.A0Y(pairsHistoryMessage, 0);
            return pairsHistoryMessage.id;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistoryList$1$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $bottomPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(float f) {
            super(3);
            this.$bottomPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$bottomPadding);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        if (this.$state.isLoadingOlder) {
            c0cd.APJ("older-loading", null, ComposableSingletons$PairsHistoryScreenKt.f208lambda$982641472);
        }
        if (this.$state.olderFailed) {
            c0cd.APJ("older-failed", null, B1V.A01(new AnonymousClass1(this.$onRetryOlder), -2135213129, true));
        }
        final PairsHistoryUiState.Ready ready = this.$state;
        final AHD<PairsHistoryMessage> ahd = ready.messages;
        final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        final ConnectionsLogContext connectionsLogContext = this.$log;
        final G0U<String, ConnectionsSharedLinkTarget> g0u = this.$sharedLinkTarget;
        final PairsHistoryScreenKt$PairsHistoryList$1$1$invoke$$inlined$items$default$1 pairsHistoryScreenKt$PairsHistoryList$1$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistoryList$1$1$invoke$$inlined$items$default$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(PairsHistoryMessage pairsHistoryMessage) {
                return null;
            }
        };
        c0cd.APL(anonymousClass2 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistoryList$1$1$invoke$$inlined$items$default$2
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, anonymousClass2, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistoryList$1$1$invoke$$inlined$items$default$3
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, pairsHistoryScreenKt$PairsHistoryList$1$1$invoke$$inlined$items$default$1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistoryList$1$1$invoke$$inlined$items$default$4
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                PairsHistoryMessage pairsHistoryMessage = (PairsHistoryMessage) ahd.get(i);
                bfm.AgE(-293296831);
                PairsHistoryScreenKt.PairsHistoryRow(pairsHistoryMessage, ready.contact, connectionsLogContext, g0u, C3U4.A07(BRg.A00, 16.0f), bfm, PairsHistoryMessage.$stable | RuntimeInternals.IOPRIO_BACKGROUND | (PairsContact.$stable << 3) | (ConnectionsLogContext.$stable << 6), 0);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018, true), ahd.size());
        if (!this.$state.hasMore) {
            c0cd.APJ("end", null, ComposableSingletons$PairsHistoryScreenKt.f207lambda$2012309192);
        }
        c0cd.APJ("bottom", null, B1V.A01(new AnonymousClass4(this.$bottomPadding), 645829349, true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PairsHistoryScreenKt$PairsHistoryList$1$1(PairsHistoryUiState.Ready ready, Function0<Unit> function0, ConnectionsLogContext connectionsLogContext, G0U<? super String, ConnectionsSharedLinkTarget> g0u, float f) {
        super(1);
        this.$state = ready;
        this.$onRetryOlder = function0;
        this.$log = connectionsLogContext;
        this.$sharedLinkTarget = g0u;
        this.$bottomPadding = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
