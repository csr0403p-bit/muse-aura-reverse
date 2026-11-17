package com.facebook.aura.conversation.view;

import X.AHD;
import X.AZ3;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C06G;
import X.C10G;
import X.C1BO;
import X.C1DG;
import X.C2CK;
import X.C3U4;
import X.C78N;
import X.C78e;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC7353EnQ;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.R;
import com.facebook.aura.conversation.repo.LoadingState;
import com.facebook.aura.conversation.repo.ThreadsView;
import com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchArchivedSideChatsScreenKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchArchivedSideChatsScreenKt$HatchArchivedSideChatsScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<Boolean> $hasMore$delegate;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ C1BO<LoadingState> $loadingState$delegate;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onThreadClick;
        public final /* synthetic */ C1BO<AHD<HatchSessionItem>> $sessions$delegate;
        public final /* synthetic */ HatchThreadsViewModel $viewModel;

        /* renamed from: com.facebook.aura.conversation.view.HatchArchivedSideChatsScreenKt$HatchArchivedSideChatsScreen$2$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ float $topPadding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(float f) {
                super(2);
                this.$topPadding = f;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    C01N.A08(bfm, BRg.A00, this.$topPadding);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* renamed from: com.facebook.aura.conversation.view.HatchArchivedSideChatsScreenKt$HatchArchivedSideChatsScreen$2$4, reason: invalid class name */
        public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ float $bottomPadding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(float f) {
                super(2);
                this.$bottomPadding = f;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    C01N.A08(bfm, BRg.A00, this.$bottomPadding);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(LazyListState lazyListState, HatchThreadsViewModel hatchThreadsViewModel, G0U<? super HatchSessionItem, Unit> g0u, C1BO<? extends AHD<HatchSessionItem>> c1bo, C1BO<Boolean> c1bo2, C1BO<? extends LoadingState> c1bo3) {
            super(4);
            this.$listState = lazyListState;
            this.$viewModel = hatchThreadsViewModel;
            this.$onThreadClick = g0u;
            this.$sessions$delegate = c1bo;
            this.$hasMore$delegate = c1bo2;
            this.$loadingState$delegate = c1bo3;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m528invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m528invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            ThreadsView threadsView = ThreadsView.ARCHIVED;
            AHD<HatchSessionItem> value = this.$sessions$delegate.getValue();
            LazyListState lazyListState = this.$listState;
            boolean zA0F = C1BO.A0F(this.$hasMore$delegate);
            LoadingState value2 = this.$loadingState$delegate.getValue();
            HatchThreadsViewModel hatchThreadsViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(hatchThreadsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchArchivedSideChatsScreenKt$HatchArchivedSideChatsScreen$2$1$1(hatchThreadsViewModel);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
            boolean zA65 = bfm.A65(this.$onThreadClick);
            G0U<HatchSessionItem, Unit> g0u = this.$onThreadClick;
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchArchivedSideChatsScreenKt$HatchArchivedSideChatsScreen$2$2$1(g0u);
                bfm.Ai0(objAaT2);
            }
            HatchConversationHistorySidePanelKt.ConversationHistoryLazyColumn(threadsView, value, lazyListState, zA0F, value2, null, function0, (G0U) objAaT2, C3U4.A0B(C10G.A01, C06G.A00(bfm), 0.0f), null, false, 0.0f, false, true, true, B1V.A00(bfm, new AnonymousClass3(f), -747194452), B1V.A00(bfm, new AnonymousClass4(f2), -1141598291), bfm, (HatchSessionItem.$stable << 3) | 196614, 1797504, 3584);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchArchivedSideChatsScreenKt$HatchArchivedSideChatsScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<HatchSessionItem, Unit> $onThreadClick;
        public final /* synthetic */ HatchThreadsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function0<Unit> function0, G0U<? super HatchSessionItem, Unit> g0u, HatchThreadsViewModel hatchThreadsViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$onThreadClick = g0u;
            this.$viewModel = hatchThreadsViewModel;
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
            HatchArchivedSideChatsScreenKt.HatchArchivedSideChatsScreen(this.$onBack, this.$onThreadClick, this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchArchivedSideChatsScreen(Function0<Unit> function0, G0U<? super HatchSessionItem, Unit> g0u, HatchThreadsViewModel hatchThreadsViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(function0, g0u, hatchThreadsViewModel);
        bfm.AgG(-1126948507);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass003.A05(AnonymousClass004.A1Z(hatchThreadsViewModel, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, hatchThreadsViewModel.sideChatSessions);
            C1BO c1boA022 = C2CK.A02(bfm, hatchThreadsViewModel.loadingState);
            C1BO c1boA023 = C2CK.A02(bfm, hatchThreadsViewModel.hasMore);
            LazyListState lazyListStateA00 = AZ3.A00(0, 0, bfm, 0, 3);
            boolean z = (iA0T & 896) == 256 || ((iA0T & 512) != 0 && bfm.A67(hatchThreadsViewModel));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new HatchArchivedSideChatsScreenKt$HatchArchivedSideChatsScreen$1$1(hatchThreadsViewModel);
                bfm.Ai0(objAaT);
            }
            C78e.A05(bfm, hatchThreadsViewModel, (G0U) objAaT);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ecf), null, function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass2(lazyListStateA00, hatchThreadsViewModel, g0u, c1boA02, c1boA023, c1boA022), -800841600), bfm, AnonymousClass007.A03(iA0T >> 6, iA0T), 0, 805306368, 536870828);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(function0, g0u, hatchThreadsViewModel, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ LoadingState access$HatchArchivedSideChatsScreen$lambda$1(C1BO c1bo) {
        return (LoadingState) c1bo.getValue();
    }
}
