package com.facebook.aura.pairs;

import X.AEk;
import X.AHI;
import X.AKQ;
import X.AZ3;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
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
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BPg;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06827l3;
import X.C06847l8;
import X.C0953AJg;
import X.C0A8;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1DP;
import X.C1YD;
import X.C1YY;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7BY;
import X.C90m;
import X.C9m9;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.conversation.view.HatchMessageBubbleContentKt;
import com.facebook.aura.conversation.viewmodel.BubbleGroupPosition;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.header.view.ScrimConfig;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchMessageSendStatus;
import com.facebook.aura.model.HatchMessageUnsendStatus;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.PairsHistoryScreenKey;
import com.facebook.aura.pairs.PairsHistoryUiState;
import com.facebook.aura.pairs.PairsHistoryViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class PairsHistoryScreenKt {
    public static final String IMAGE_MIME_TYPE = "image/*";
    public static final int OLDER_PREFETCH_ROWS = 3;
    public static final C06827l3 SOLE_SHARED_LINK = C06827l3.A02("^\\[([^\\]]{1,256})]\\((muse-shared://[A-Za-z0-9-]{1,64})\\)$");
    public static final String VIDEO_MIME_TYPE = "video/*";

    /* renamed from: com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistoryEnd$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsHistoryScreenKt.PairsHistoryEnd(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistoryRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PairsContact $contact;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ PairsHistoryMessage $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, ConnectionsSharedLinkTarget> $sharedLinkTarget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(PairsHistoryMessage pairsHistoryMessage, PairsContact pairsContact, ConnectionsLogContext connectionsLogContext, G0U<? super String, ConnectionsSharedLinkTarget> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$message = pairsHistoryMessage;
            this.$contact = pairsContact;
            this.$log = connectionsLogContext;
            this.$sharedLinkTarget = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsHistoryScreenKt.PairsHistoryRow(this.$message, this.$contact, this.$log, this.$sharedLinkTarget, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistoryScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C129083 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ C1BO<PairsHistoryUiState> $uiState$delegate;
        public final /* synthetic */ PairsHistoryViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C129083(ConnectionsLogContext connectionsLogContext, PairsHistoryViewModel pairsHistoryViewModel, C1BO<? extends PairsHistoryUiState> c1bo) {
            super(4);
            this.$log = connectionsLogContext;
            this.$viewModel = pairsHistoryViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1675invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1675invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            PairsHistoryUiState value = this.$uiState$delegate.getValue();
            if (C7384Etj.areEqual(value, PairsHistoryUiState.Loading.INSTANCE)) {
                bfm.AgE(-1996290385);
                PairsComponentsKt.PairsLoading(null, bfm, 0, 1);
            } else if (C7384Etj.areEqual(value, PairsHistoryUiState.Failed.INSTANCE)) {
                bfm.AgE(-1996288142);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d61);
                BRg bRgA0G = C60R.A0G(bfm, HatchComponent.CONNECTIONS_ERROR_STATE, this.$log, ConnectionsLogContext.$stable);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A67(this.$log));
                ConnectionsLogContext connectionsLogContext = this.$log;
                PairsHistoryViewModel pairsHistoryViewModel = this.$viewModel;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new PairsHistoryScreenKt$PairsHistoryScreen$3$1$1(connectionsLogContext, pairsHistoryViewModel);
                    bfm.Ai0(objAaT);
                }
                PairsComponentsKt.PairsMessage(strA01, bRgA0G, (Function0) objAaT, bfm, 0, 0);
            } else if (C7384Etj.areEqual(value, PairsHistoryUiState.Missing.INSTANCE)) {
                bfm.AgE(-1996277086);
                PairsComponentsKt.PairsMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d78), null, null, bfm, 0, 6);
            } else {
                if (!(value instanceof PairsHistoryUiState.Ready)) {
                    throw AnonymousClass005.A0k(bfm, -1996291091);
                }
                bfm.AgE(-1996272683);
                PairsHistoryUiState.Ready ready = (PairsHistoryUiState.Ready) value;
                if (ready.isEmpty()) {
                    bfm.AgE(-1754910903);
                    PairsComponentsKt.PairsMessage(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120d5e), PairsAnalyticsKt.rememberConnectionsImpression(this.$log, HatchComponent.CONNECTIONS_EMPTY_STATE, null, null, null, null, bfm, ConnectionsLogContext.$stable | 48, 60), null, bfm, 0, 4);
                } else {
                    bfm.AgE(-1754679426);
                    ConnectionsLogContext connectionsLogContext2 = this.$log;
                    PairsHistoryViewModel pairsHistoryViewModel2 = this.$viewModel;
                    boolean zA67 = bfm.A67(pairsHistoryViewModel2);
                    Object objAaT2 = bfm.AaT();
                    if (zA67 || objAaT2 == C78N.A00) {
                        objAaT2 = new PairsHistoryScreenKt$PairsHistoryScreen$3$2$1(pairsHistoryViewModel2);
                        bfm.Ai0(objAaT2);
                    }
                    Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT2);
                    boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A67(this.$log));
                    ConnectionsLogContext connectionsLogContext3 = this.$log;
                    PairsHistoryViewModel pairsHistoryViewModel3 = this.$viewModel;
                    Object objAaT3 = bfm.AaT();
                    if (zA1T2 || objAaT3 == C78N.A00) {
                        objAaT3 = new PairsHistoryScreenKt$PairsHistoryScreen$3$3$1(connectionsLogContext3, pairsHistoryViewModel3);
                        bfm.Ai0(objAaT3);
                    }
                    Function0 function02 = (Function0) objAaT3;
                    PairsHistoryViewModel pairsHistoryViewModel4 = this.$viewModel;
                    boolean zA672 = bfm.A67(pairsHistoryViewModel4);
                    Object objAaT4 = bfm.AaT();
                    if (zA672 || objAaT4 == C78N.A00) {
                        objAaT4 = new PairsHistoryScreenKt$PairsHistoryScreen$3$4$1(pairsHistoryViewModel4);
                        bfm.Ai0(objAaT4);
                    }
                    ConnectionsLogContext connectionsLogContext4 = this.$log;
                    HatchComponent hatchComponent = HatchComponent.CONNECTIONS_SCREEN_VIEW;
                    int i2 = ConnectionsLogContext.$stable;
                    PairsHistoryScreenKt.m1669PairsHistoryListeWuZFaY(ready, f, f2, connectionsLogContext2, function0, function02, (G0U) ((InterfaceC7353EnQ) objAaT4), C60R.A0G(bfm, hatchComponent, connectionsLogContext4, i2), bfm, AnonymousClass002.A07(iA04 << 3, PairsHistoryUiState.Ready.$stable) | (i2 << 9), 0);
                }
                AnonymousClass001.A1D(bfm);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistoryScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PairsHistoryScreenKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PairsHistoryScreenKey pairsHistoryScreenKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = pairsHistoryScreenKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsHistoryScreenKt.PairsHistoryScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistoryScrollEffects$3, reason: invalid class name and case insensitive filesystem */
    public final class C129093 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isLoadingOlder;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ int $messageCount;
        public final /* synthetic */ Function0<Unit> $onLoadOlder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129093(LazyListState lazyListState, int i, boolean z, Function0<Unit> function0, int i2) {
            super(2);
            this.$listState = lazyListState;
            this.$messageCount = i;
            this.$isLoadingOlder = z;
            this.$onLoadOlder = function0;
            this.$$changed = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsHistoryScreenKt.PairsHistoryScrollEffects(this.$listState, this.$messageCount, this.$isLoadingOlder, this.$onLoadOlder, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.PairsHistoryScreenKt$PairsHistorySharedItem$2, reason: invalid class name and case insensitive filesystem */
    public final class C129102 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PairsSharedLink $link;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpen;
        public final /* synthetic */ ConnectionsSharedLinkTarget $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129102(PairsSharedLink pairsSharedLink, ConnectionsSharedLinkTarget connectionsSharedLinkTarget, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$link = pairsSharedLink;
            this.$target = connectionsSharedLinkTarget;
            this.$onOpen = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            PairsHistoryScreenKt.PairsHistorySharedItem(this.$link, this.$target, this.$onOpen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final String formatActivityTime(Context context, long j) {
        C7384Etj.A0Y(context, 0);
        if (!DateUtils.isToday(j)) {
            return formatShortDate(context, j);
        }
        String str = DateFormat.getTimeFormat(context).format(Long.valueOf(j));
        C7384Etj.A0U(str);
        return str;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PairsHistoryAuthor.values().length];
            try {
                AnonymousClass002.A13(PairsHistoryAuthor.OWN_AGENT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PairsHistoryAuthor.PEER_AGENT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PairsHistoryAuthor.PEER_HUMAN, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void PairsHistoryEnd(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-282699819);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).fillDivider;
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0R(bRg2), 16.0f, 0.0f);
            boolean zA64 = bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                objAaT = new PairsHistoryScreenKt$PairsHistoryEnd$1$1(j);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0C = C3U4.A0C(AEk.A01(bRgA0B, (G0U) objAaT), 16.0f, 16.0f, 16.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0T = AnonymousClass006.A0T(bfm, C2VU.A00, 2.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0T, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d60);
            C1822Arm c1822ArmA0C = C60Q.A0C(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = PairsHistoryScreenKt$PairsHistoryEnd$2$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT2, false), jA06, c1822ArmA0C, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120d5f), null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, i, i2);
        }
    }

    /* renamed from: PairsHistoryList-eWuZFaY, reason: not valid java name */
    public static final void m1669PairsHistoryListeWuZFaY(PairsHistoryUiState.Ready ready, float f, float f2, ConnectionsLogContext connectionsLogContext, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, ConnectionsSharedLinkTarget> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1524059024);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ready, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass002.A00(AnonymousClass004.A1a(connectionsLogContext, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, function02);
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, g0u);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA05 |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA05 |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 4793491, 4793490), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            LazyListState lazyListStateA00 = AZ3.A00(0, 0, bfm, 0, 3);
            PairsHistoryScrollEffects(lazyListStateA00, ready.messages.size(), ready.isLoadingOlder, function0, bfm, (iA05 >> 3) & 7168);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            C1DP c1dp = new C1DP(0.0f, f, 0.0f, 0.0f);
            C9m9 c9m9A00 = AcQ.A00(16.0f);
            boolean zA1F = ((iA05 & 7168) == 2048 || ((iA05 & 4096) != 0 && bfm.A67(connectionsLogContext))) | AnonymousClass003.A1F(458752, iA05, 131072) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(ready))) | AnonymousClass005.A1B(iA05) | AnonymousClass004.A1K(iA05);
            Object objAaT = bfm.AaT();
            if (zA1F || objAaT == C78N.A00) {
                objAaT = new PairsHistoryScreenKt$PairsHistoryList$1$1(ready, function02, connectionsLogContext, g0u, f2);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, c9m9A00, c1dp, lazyListStateA00, bfm, null, bRgA0T, (G0U) objAaT, RuntimeInternals.IOPRIO_BACKGROUND, 488, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new PairsHistoryScreenKt$PairsHistoryList$2(ready, f, f2, connectionsLogContext, function0, function02, g0u, bRg2, i, i2);
        }
    }

    public static final void PairsHistoryRow(PairsHistoryMessage pairsHistoryMessage, PairsContact pairsContact, ConnectionsLogContext connectionsLogContext, G0U<? super String, ConnectionsSharedLinkTarget> g0u, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(962895340);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pairsHistoryMessage, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(pairsContact, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(connectionsLogContext, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA1K = AnonymousClass003.A1K(bfm, pairsHistoryMessage.id, pairsHistoryMessage.text);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                String str = pairsHistoryMessage.id;
                HatchMessageRole hatchMessageRole = HatchMessageRole.AGENT;
                String str2 = pairsHistoryMessage.text;
                long j = pairsHistoryMessage.atMs;
                int i5 = HatchMessageUiModel.$stable;
                BubbleGroupPosition bubbleGroupPosition = BubbleGroupPosition.STANDALONE;
                AHI ahi = AHI.A01;
                HatchMessageSendStatus hatchMessageSendStatus = HatchMessageSendStatus.SENT;
                HatchMessageUnsendStatus hatchMessageUnsendStatus = HatchMessageUnsendStatus.NONE;
                C0953AJg c0953AJgA00 = C0953AJg.A00();
                objAaT = new HatchMessageUiModel(str, null, null, hatchMessageRole, str2, j, false, false, null, true, null, bubbleGroupPosition, ahi, ahi, null, null, null, ahi, null, false, null, null, null, null, false, false, null, hatchMessageSendStatus, hatchMessageUnsendStatus, null, null, null, null, null, ahi, null, c0953AJgA00, c0953AJgA00, null);
                bfm.Ai0(objAaT);
            }
            HatchMessageUiModel hatchMessageUiModel = (HatchMessageUiModel) objAaT;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(10.0f), bfm, C2VU.A05, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C90m c90m = C90m.A00;
            int iOrdinal = pairsHistoryMessage.author.ordinal();
            if (iOrdinal == 0) {
                i3 = 48;
                bfm.AgE(-1761527062);
                m1670PairsOwnAgentAvatarorJrPs(40.0f, null, bfm, 6, 2);
            } else if (iOrdinal == 1) {
                i3 = 48;
                bfm.AgE(-1761524933);
                m1671PairsPeerAgentAvataruFdPcIQ(pairsContact.avatar, 40.0f, null, bfm, PairsImageRef.$stable | 48, 4);
            } else {
                if (iOrdinal != 2) {
                    throw AnonymousClass003.A0k(bfm, bbi, -1761528629);
                }
                bfm.AgE(-1761521784);
                PairsImageRef pairsImageRef = pairsContact.photo;
                BS0 bs0 = BRg.A00;
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                i3 = 48;
                PairsComponentsKt.m1664PairsPersonPhotovlEVYhg(pairsImageRef, 40.0f, C1DI.A02(bs0, C1D8.A00, 1.0f, auraTheme.getColors(bfm, 6).avatarBorder), auraTheme.getColors(bfm, 6).card, bfm, PairsImageRef.$stable | 48, 0);
            }
            BBI.A0R(bbi, false);
            BS0 bs02 = BRg.A00;
            BRg bRgAiP = c90m.AiP(bs02, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            bfm.AgE(2139315145);
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, i3);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs02);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            int i6 = iA05 & 14;
            int i7 = PairsHistoryMessage.$stable | i6;
            int i8 = PairsContact.$stable;
            int i9 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            String strSpeakerName = speakerName(pairsHistoryMessage, pairsContact, bfm, i7 | (i8 << 3) | i9);
            AuraTheme auraTheme2 = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strSpeakerName, c90m.AiP(bs02, 1.0f, false), C3cH.A06(bfm, auraTheme2), auraTheme2.getTypography(bfm, 6).subheadlineEmphasized, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            AuraTextKt.m2639AuraTextUY9GdpU(speakerDetail(pairsHistoryMessage, pairsContact, formatActivityTime(contextA0H, pairsHistoryMessage.atMs), bfm, PairsHistoryMessage.$stable | i6 | (i8 << 3) | i9), C3U4.A0C(bs02, 4.0f, 0.0f, 0.0f, 0.0f), C3cH.A05(bfm, auraTheme2), C3cH.A0E(bfm, auraTheme2), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306416, 6, 14832);
            BBI.A0R(bbi, true);
            boolean zA1S = AnonymousClass005.A1S(bfm, abstractC3358CGzA0h, auraNavigatorA0b, contextA0H);
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new PairsHistoryScreenKt$PairsHistoryRow$1$1$openFile$1$1(abstractC3358CGzA0h, auraNavigatorA0b, contextA0H);
                bfm.Ai0(objAaT2);
            }
            G0W g0w = (G0W) objAaT2;
            boolean zA65 = bfm.A65(pairsHistoryMessage.text);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = soleSharedLink(pairsHistoryMessage.text);
                bfm.Ai0(objAaT3);
            }
            PairsSharedLink pairsSharedLink = (PairsSharedLink) objAaT3;
            if (pairsSharedLink != null) {
                bfm.AgE(2140333122);
                ConnectionsSharedLinkTarget connectionsSharedLinkTargetInvoke = g0u.invoke(pairsSharedLink.url);
                if ((iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsLogContext))) {
                    z = true;
                }
                Object objAaT4 = bfm.AaT();
                if (z || objAaT4 == C78N.A00) {
                    objAaT4 = new PairsHistoryScreenKt$PairsHistoryRow$1$1$2$1(connectionsLogContext);
                    bfm.Ai0(objAaT4);
                }
                PairsHistorySharedItem(pairsSharedLink, connectionsSharedLinkTargetInvoke, (Function0) objAaT4, null, bfm, ConnectionsSharedLinkTarget.$stable << 3, 8);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(2140573372);
                BBI.A0R(bbi, false);
                boolean z = (iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsLogContext));
                Object objAaT5 = bfm.AaT();
                if (z || objAaT5 == C78N.A00) {
                    objAaT5 = new PairsHistoryScreenKt$PairsHistoryRow$1$1$logMessageClick$1$1(connectionsLogContext);
                    bfm.Ai0(objAaT5);
                }
                G0V g0v2 = (G0V) objAaT5;
                long jA06 = C3cH.A06(bfm, auraTheme2);
                long j2 = auraTheme2.getColors(bfm, 6).link;
                boolean zA1K2 = AnonymousClass003.A1K(bfm, g0v2, g0w);
                Object objAaT6 = bfm.AaT();
                if (zA1K2 || objAaT6 == C78N.A00) {
                    objAaT6 = new PairsHistoryScreenKt$PairsHistoryRow$1$1$3$1(g0v2, g0w);
                    bfm.Ai0(objAaT6);
                }
                G0V g0v3 = (G0V) objAaT6;
                boolean zA1K3 = AnonymousClass003.A1K(bfm, g0v2, g0w);
                Object objAaT7 = bfm.AaT();
                if (zA1K3 || objAaT7 == C78N.A00) {
                    objAaT7 = new PairsHistoryScreenKt$PairsHistoryRow$1$1$4$1(g0v2, g0w);
                    bfm.Ai0(objAaT7);
                }
                G0V g0v4 = (G0V) objAaT7;
                boolean zA1K4 = AnonymousClass003.A1K(bfm, g0v2, g0w);
                Object objAaT8 = bfm.AaT();
                if (zA1K4 || objAaT8 == C78N.A00) {
                    objAaT8 = new PairsHistoryScreenKt$PairsHistoryRow$1$1$5$1(g0v2, g0w);
                    bfm.Ai0(objAaT8);
                }
                G0V g0v5 = (G0V) objAaT8;
                boolean zA1K5 = AnonymousClass003.A1K(bfm, g0v2, g0w);
                Object objAaT9 = bfm.AaT();
                if (zA1K5 || objAaT9 == C78N.A00) {
                    objAaT9 = new PairsHistoryScreenKt$PairsHistoryRow$1$1$6$1(g0v2, g0w);
                    bfm.Ai0(objAaT9);
                }
                G0V g0v6 = (G0V) objAaT9;
                B6A b6aA04 = C60P.A04(jA06);
                B6A b6aA042 = C60P.A04(j2);
                boolean zA1V = AnonymousClass005.A1V(bfm, abstractC3358CGzA0h, auraNavigatorA0b, contextA0H, bfm.A65(g0v2) | ((iA05 & 7168) == 2048));
                Object objAaT10 = bfm.AaT();
                if (zA1V || objAaT10 == C78N.A00) {
                    objAaT10 = new PairsHistoryScreenKt$PairsHistoryRow$1$1$7$1(g0v2, g0u, abstractC3358CGzA0h, auraNavigatorA0b, contextA0H);
                    bfm.Ai0(objAaT10);
                }
                HatchMessageBubbleContentKt.m634HatchMessageContentZdSQAXI(hatchMessageUiModel, null, null, null, g0v3, null, null, g0v4, g0v5, g0v6, null, null, null, b6aA04, b6aA042, false, null, null, null, false, (G0U) objAaT10, false, null, null, bfm, HatchMessageUiModel.$stable, 0, 0, 15703150);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(pairsHistoryMessage, pairsContact, connectionsLogContext, g0u, bRg2, i, i2);
        }
    }

    public static final void PairsHistoryScreen(PairsHistoryScreenKey pairsHistoryScreenKey, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(pairsHistoryScreenKey, 0);
        bfm.AgG(-1588723802);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, pairsHistoryScreenKey) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String str = ((CH0) abstractC3358CGzA0h).A01;
            String str2 = pairsHistoryScreenKey.chatSessionId;
            String strA0d = FGI.A0d("pairs-history:", str, ":", str2);
            PairsHistoryViewModel.Factory factory = new PairsHistoryViewModel.Factory(abstractC3358CGzA0h, pairsHistoryScreenKey.museId, str2, pairsHistoryScreenKey.connectionId);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            PairsHistoryViewModel pairsHistoryViewModel = (PairsHistoryViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), strA0d, C3cG.A0x(PairsHistoryViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, pairsHistoryViewModel.uiState);
            long j = AuraTheme.INSTANCE.getColors(bfm, 6).highlight;
            ConnectionsLogContext connectionsLogContextRememberConnectionsLogContext = PairsAnalyticsKt.rememberConnectionsLogContext(HatchScreen.CONNECTION_HISTORY, bfm, 6);
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "pairs-history");
            boolean zA64 = bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                objAaT = new ScrimConfig.CustomStops(new HxE[]{AnonymousClass007.A0g(0.0f, j), AnonymousClass007.A0g(1.0f, j)});
                bfm.Ai0(objAaT);
            }
            ScrimConfig.CustomStops customStops = (ScrimConfig.CustomStops) objAaT;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d59);
            boolean zA1M = AnonymousClass003.A1M(bfm, connectionsLogContextRememberConnectionsLogContext, auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new PairsHistoryScreenKt$PairsHistoryScreen$2$1(connectionsLogContextRememberConnectionsLogContext, auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, bRgA00, null, j, strA01, null, (Function0) objAaT2, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, customStops, null, null, 0, null, null, null, false, B1V.A00(bfm, new C129083(connectionsLogContextRememberConnectionsLogContext, pairsHistoryViewModel, c1boA02), -842299839), bfm, 6, 0, 805306374, 533725092);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(pairsHistoryScreenKey, bRg2, i, i2);
        }
    }

    public static final void PairsHistorySharedItem(PairsSharedLink pairsSharedLink, ConnectionsSharedLinkTarget connectionsSharedLinkTarget, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        int iConnectionsFileIconRes;
        String strA0s;
        BRg bRgA04;
        BRg bRg2 = bRg;
        bfm.AgG(1876808469);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, pairsSharedLink) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectionsSharedLinkTarget, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String strA0R = C7BY.A0R(pairsSharedLink.title, "", '.');
            int length = strA0R.length();
            if (length > 0) {
                bfm.AgE(-273313321);
                iConnectionsFileIconRes = ConnectionsActivityItemsKt.connectionsFileIconRes(pairsSharedLink.title, bfm, 0);
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -273311375);
                iConnectionsFileIconRes = R.drawable.hatch_file_types_artifact_40;
            }
            String str = pairsSharedLink.title;
            if (length > 0) {
                bfm.AgE(-273307520);
                BBI.A0R(bbiA0M, false);
                strA0s = strA0R.toUpperCase(Locale.ROOT);
            } else {
                bfm.AgE(-273306606);
                strA0s = AnonymousClass001.A0s(bfm, bbiA0M, R.string._name_removed__res_0x7f1207da);
            }
            BRg bRgA042 = C3U4.A04(bRg2, 8.0f);
            if (connectionsSharedLinkTarget != null) {
                BS0 bs0A09 = C3cG.A09(bfm, 117625356);
                C1YD c1ydA0A = C3cG.A0A(0);
                boolean zA1Y = AnonymousClass005.A1Y(bfm, abstractC3358CGzA0h, auraNavigatorA0b, AnonymousClass003.A1D(iA0d), (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A67(connectionsSharedLinkTarget)));
                Object objAaT = bfm.AaT();
                if (zA1Y || objAaT == C78N.A00) {
                    objAaT = new PairsHistoryScreenKt$PairsHistorySharedItem$1$1(function0, connectionsSharedLinkTarget, abstractC3358CGzA0h, auraNavigatorA0b);
                    bfm.Ai0(objAaT);
                }
                bRgA04 = C0v5.A04(bs0A09, c1ydA0A, null, (Function0) objAaT, true);
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(117818331);
                BBI.A0R(bbiA0M, false);
                bRgA04 = BRg.A00;
            }
            ConnectionsActivityItemsKt.ConnectionsAttachmentCard(iConnectionsFileIconRes, str, strA0s, bRgA042.then(bRgA04), null, bfm, 0, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C129102(pairsSharedLink, connectionsSharedLinkTarget, function0, bRg2, i, i2);
        }
    }

    /* renamed from: PairsOwnAgentAvatar--orJrPs, reason: not valid java name */
    public static final void m1670PairsOwnAgentAvatarorJrPs(float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1299229862);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            AuraDrawableSource auraDrawableSourceRememberDefaultAvatarSource = ((HatchIdentityProvider) objAaT).rememberDefaultAvatarSource(null, bfm, HatchIdentityProvider.$stable << 3, 1);
            BRg bRgA07 = C10G.A07(bRg2, f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).avatarBorder;
            C1D3 c1d3 = C1D8.A00;
            AuraImageKt.AuraImage(auraDrawableSourceRememberDefaultAvatarSource, C1b8.A01(C11U.A03(C1DI.A02(bRgA07, c1d3, 1.0f, j), c1d3), auraTheme.getColors(bfm, 6).card), null, null, false, false, null, false, null, bfm, 384, 504);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new PairsHistoryScreenKt$PairsOwnAgentAvatar$1(f, bRg2, i, i2);
        }
    }

    /* renamed from: PairsPeerAgentAvatar-uFdPcIQ, reason: not valid java name */
    public static final void m1671PairsPeerAgentAvataruFdPcIQ(PairsImageRef pairsImageRef, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-432226707);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pairsImageRef, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A05(bfm, f);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C10G.A07(bRg2, f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).avatarBorder;
            C1D3 c1d3 = C1D8.A00;
            BRg bRgA01 = C1b8.A01(C11U.A03(C1DI.A02(bRgA07, c1d3, 1.0f, j), c1d3), auraTheme.getColors(bfm, 6).card);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            PairsComponentsKt.m1663PairsMuseAvataruFdPcIQ(pairsImageRef, f, null, bfm, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | PairsImageRef.$stable | (iA05 & 14), 4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new PairsHistoryScreenKt$PairsPeerAgentAvatar$2(pairsImageRef, f, bRg2, i, i2);
        }
    }

    public static final void open(ConnectionsSharedLinkTarget connectionsSharedLinkTarget, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator) {
        AuraNavKey auraNavKey;
        String str = connectionsSharedLinkTarget.fileReference;
        if ((str == null || !ConnectionsActivityItemsKt.openConnectionsFile(str, connectionsSharedLinkTarget.title, connectionsSharedLinkTarget.mimeType, abstractC3358CGz, auraNavigator)) && (auraNavKey = connectionsSharedLinkTarget.destination) != null) {
            auraNavigator.navigate(auraNavKey, false);
        }
    }

    public static final PairsSharedLink soleSharedLink(String str) {
        C06847l8 c06847l8A06 = SOLE_SHARED_LINK.A06(AnonymousClass002.A0l(str));
        if (c06847l8A06 != null) {
            return new PairsSharedLink(C60Q.A0n(c06847l8A06.AG1(), 1), C60Q.A0n(c06847l8A06.AG1(), 2));
        }
        return null;
    }

    public static final String speakerDetail(PairsHistoryMessage pairsHistoryMessage, PairsContact pairsContact, String str, BFM bfm, int i) {
        int i2;
        int i3;
        Object[] objArr;
        BBI bbiA0M;
        int iOrdinal = pairsHistoryMessage.author.ordinal();
        String strA02 = null;
        if (iOrdinal == 0) {
            bfm.AgE(1747699265);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            i2 = 1747989362;
            if (!C7BY.A0j((String) C1BO.A07(bfm, ((HatchIdentityProvider) objAaT).aiIdentityName))) {
                bfm.AgE(1580408114);
                i3 = R.string._name_removed__res_0x7f120d63;
                objArr = new Object[]{HatchAppName.value};
                strA02 = AbstractC2271BQs.A02(bfm, objArr, i3);
            }
            bfm.AgE(i2);
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw AnonymousClass005.A0k(bfm, 1580396398);
                }
                bbiA0M = AnonymousClass002.A0M(bfm, 1748407986);
                bfm.AgE(1580422223);
                BBI.A0R(bbiA0M, false);
                return str;
            }
            bfm.AgE(1748251840);
            String strA0l = AnonymousClass002.A0l(pairsContact.displayName);
            if (strA0l.length() > 0) {
                bfm.AgE(1748251840);
                i3 = R.string._name_removed__res_0x7f120d64;
                objArr = new Object[]{strA0l, HatchAppName.value};
                strA02 = AbstractC2271BQs.A02(bfm, objArr, i3);
            } else {
                i2 = 1748251839;
                bfm.AgE(i2);
            }
        }
        bbiA0M = (BBI) bfm;
        BBI.A0R(bbiA0M, false);
        BBI.A0R(bbiA0M, false);
        if (strA02 != null) {
            bfm.AgE(1580422672);
            str = AnonymousClass006.A0w(bfm, strA02, str, R.string._name_removed__res_0x7f120d5d);
        } else {
            bfm.AgE(1580422223);
        }
        BBI.A0R(bbiA0M, false);
        return str;
    }

    public static final String speakerName(PairsHistoryMessage pairsHistoryMessage, PairsContact pairsContact, BFM bfm, int i) {
        String strA0l;
        int i2;
        int iOrdinal = pairsHistoryMessage.author.ordinal();
        if (iOrdinal == 0) {
            bfm.AgE(-1811753560);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            strA0l = AnonymousClass002.A0l((String) C1BO.A07(bfm, ((HatchIdentityProvider) objAaT).aiIdentityName));
            if (strA0l.length() == 0) {
                i2 = R.string._name_removed__res_0x7f120d63;
                strA0l = AnonymousClass001.A0t(bfm, HatchAppName.value, i2);
            }
        } else if (iOrdinal == 1) {
            bfm.AgE(-1811295318);
            strA0l = AnonymousClass002.A0l(pairsContact.agentName);
            if (strA0l.length() == 0) {
                i2 = R.string._name_removed__res_0x7f120d65;
                strA0l = AnonymousClass001.A0t(bfm, HatchAppName.value, i2);
            }
        } else {
            if (iOrdinal != 2) {
                throw AnonymousClass005.A0k(bfm, 1327028083);
            }
            bfm.AgE(-1811114495);
            strA0l = AnonymousClass002.A0l(pairsContact.displayName);
            if (strA0l.length() == 0) {
                strA0l = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120da0);
            }
        }
        AnonymousClass001.A1D(bfm);
        return strA0l;
    }

    public static final void PairsHistoryScrollEffects(LazyListState lazyListState, int i, boolean z, Function0<Unit> function0, BFM bfm, int i2) {
        bfm.AgG(-790913802);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, lazyListState) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = PairsHistoryScreenKt$PairsHistoryScrollEffects$scrolledToEnd$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            Integer numValueOf = Integer.valueOf(i);
            int i3 = iA0d & 14;
            boolean zA1C = AnonymousClass003.A1C(iA0d) | bfm.A65(mutableStateA0N) | AnonymousClass002.A1Q(i3, 4);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == obj) {
                objAaT2 = new PairsHistoryScreenKt$PairsHistoryScrollEffects$1$1(i, lazyListState, mutableStateA0N, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A1A(bfm, objAaT2, lazyListState, numValueOf);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA1R = AnonymousClass001.A1R(bfm, mutableStateA0N, AnonymousClass002.A1Q(i3, 4)) | AnonymousClass003.A1E(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == obj) {
                objAaT3 = new PairsHistoryScreenKt$PairsHistoryScrollEffects$2$1(lazyListState, mutableStateA0N, function0, null);
                bfm.Ai0(objAaT3);
            }
            C78e.A02(bfm, lazyListState, numValueOf, boolValueOf, (G0V) objAaT3);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C129093(lazyListState, i, z, function0, i2);
        }
    }

    public static final /* synthetic */ PairsHistoryUiState access$PairsHistoryScreen$lambda$0(C1BO c1bo) {
        return (PairsHistoryUiState) c1bo.getValue();
    }

    public static final String formatShortDate(Context context, long j) {
        String dateTime = DateUtils.formatDateTime(context, j, 65560);
        C7384Etj.A0U(dateTime);
        return dateTime;
    }
}
