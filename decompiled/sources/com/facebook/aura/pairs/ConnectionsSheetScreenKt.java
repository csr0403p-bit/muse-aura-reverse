package com.facebook.aura.pairs;

import X.AKQ;
import X.ARD;
import X.AVy;
import X.AYD;
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
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1YD;
import X.C1b8;
import X.C20Q;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.C90m;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.header.view.HeaderButtonKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConnectionsSheetKey;
import com.facebook.aura.navigation.key.ConnectionsSheetSubject;
import com.facebook.aura.navigation.key.PairsHistoryScreenKey;
import com.facebook.aura.pairs.ConnectionsInfoViewModel;
import com.facebook.aura.pairs.ConnectionsSheetItem;
import com.facebook.aura.pairs.ConnectionsSheetState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectionsSheetScreenKt {
    public static final int MENU_REMOVE = 1;

    /* renamed from: com.facebook.aura.pairs.ConnectionsSheetScreenKt$ConnectionsConversationRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PairsHistoryScreenKey $conversation;
        public final /* synthetic */ Long $lastActivityAtMs;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PairsHistoryScreenKey pairsHistoryScreenKey, Long l, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$conversation = pairsHistoryScreenKey;
            this.$lastActivityAtMs = l;
            this.$onOpen = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsSheetScreenKt.ConnectionsConversationRow(this.$conversation, this.$lastActivityAtMs, this.$onOpen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsSheetScreenKt$ConnectionsPersonMenu$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpen;
        public final /* synthetic */ Function0<Unit> $onRemove;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onOpen = function0;
            this.$onRemove = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsSheetScreenKt.ConnectionsPersonMenu(this.$onOpen, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsSheetScreenKt$ConnectionsRemoveDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C128432 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsDisconnectEffect $effect;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128432(String str, ConnectionsDisconnectEffect connectionsDisconnectEffect, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$name = str;
            this.$effect = connectionsDisconnectEffect;
            this.$onConfirm = function0;
            this.$onCancel = function02;
            this.$onDismiss = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsSheetScreenKt.ConnectionsRemoveDialog(this.$name, this.$effect, this.$onConfirm, this.$onCancel, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsSheetScreenKt$ConnectionsSectionHeading$2, reason: invalid class name and case insensitive filesystem */
    public final class C128442 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128442(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsSheetScreenKt.ConnectionsSectionHeading(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsSheetScreenKt$ConnectionsSheetAvatar$2, reason: invalid class name and case insensitive filesystem */
    public final class C128452 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsSheetItem $item;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128452(ConnectionsSheetItem connectionsSheetItem, BRg bRg, int i, int i2) {
            super(2);
            this.$item = connectionsSheetItem;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsSheetScreenKt.ConnectionsSheetAvatar(this.$item, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsSheetScreenKt$ConnectionsSheetContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C128462 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Map<String, String> $connectionType;
        public final /* synthetic */ PairsHistoryScreenKey $conversation;
        public final /* synthetic */ ConnectionsSheetItem $item;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRemove;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128462(ConnectionsSheetItem connectionsSheetItem, PairsHistoryScreenKey pairsHistoryScreenKey, ConnectionsLogContext connectionsLogContext, Map<String, String> map, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$item = connectionsSheetItem;
            this.$conversation = pairsHistoryScreenKey;
            this.$log = connectionsLogContext;
            this.$connectionType = map;
            this.$onRemove = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsSheetScreenKt.ConnectionsSheetContent(this.$item, this.$conversation, this.$log, this.$connectionType, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsSheetScreenKt$ConnectionsSheetHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C128472 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsSheetItem $item;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128472(ConnectionsSheetItem connectionsSheetItem, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$item = connectionsSheetItem;
            this.$name = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsSheetScreenKt.ConnectionsSheetHeader(this.$item, this.$name, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsSheetScreenKt$ConnectionsSheetScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C128483 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Boolean> $confirmRemove$delegate;
        public final /* synthetic */ Map<String, String> $connectionType;
        public final /* synthetic */ ConnectionsInfo $info;
        public final /* synthetic */ ConnectionsSheetItem $item;
        public final /* synthetic */ ConnectionsLogContext $log;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$item == null) {
                PairsComponentsKt.PairsLoading(C10G.A04(C3cG.A09(bfm, 1004120743), 200.0f), bfm, 6, 0);
            } else {
                bfm.AgE(1004188850);
                ConnectionsSheetItem connectionsSheetItem = this.$item;
                PairsHistoryScreenKey pairsHistoryScreenKeyConversation = ConnectionsSheetScreenKt.conversation(connectionsSheetItem, this.$info);
                ConnectionsLogContext connectionsLogContext = this.$log;
                Map<String, String> map = this.$connectionType;
                MutableState<Boolean> mutableState = this.$confirmRemove$delegate;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new ConnectionsSheetScreenKt$ConnectionsSheetScreen$3$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                ConnectionsLogContext connectionsLogContext2 = this.$log;
                HatchComponent hatchComponent = HatchComponent.CONNECTIONS_SCREEN_VIEW;
                Map<String, String> map2 = this.$connectionType;
                int i2 = ConnectionsLogContext.$stable;
                ConnectionsSheetScreenKt.ConnectionsSheetContent(connectionsSheetItem, pairsHistoryScreenKeyConversation, connectionsLogContext, map, (Function0) objAaT, PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext2, hatchComponent, null, map2, null, null, bfm, i2 | 48, 52), bfm, (i2 << 6) | RuntimeInternals.IOPRIO_BACKGROUND, 0);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128483(ConnectionsSheetItem connectionsSheetItem, ConnectionsInfo connectionsInfo, ConnectionsLogContext connectionsLogContext, Map<String, String> map, MutableState<Boolean> mutableState) {
            super(3);
            this.$item = connectionsSheetItem;
            this.$info = connectionsInfo;
            this.$log = connectionsLogContext;
            this.$connectionType = map;
            this.$confirmRemove$delegate = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsSheetScreenKt$ConnectionsSheetScreen$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(ConnectionsSheetKey connectionsSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = connectionsSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsSheetScreenKt.ConnectionsSheetScreen(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsSheetScreenKt$ConnectionsStatusCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C128492 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PairsHistoryScreenKey $conversation;
        public final /* synthetic */ boolean $isConnected;
        public final /* synthetic */ Long $lastActivityAtMs;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConversationOpen;
        public final /* synthetic */ Function0<Unit> $onMenuOpen;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128492(String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, PairsHistoryScreenKey pairsHistoryScreenKey, Function0<Unit> function03, Long l, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$isConnected = z;
            this.$onMenuOpen = function0;
            this.$onRemove = function02;
            this.$conversation = pairsHistoryScreenKey;
            this.$onConversationOpen = function03;
            this.$lastActivityAtMs = l;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsSheetScreenKt.ConnectionsStatusCard(this.$title, this.$isConnected, this.$onMenuOpen, this.$onRemove, this.$conversation, this.$onConversationOpen, this.$lastActivityAtMs, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsSheetScreenKt$ConnectionsStatusRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C128502 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isConnected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onMenuOpen;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128502(String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$isConnected = z;
            this.$onMenuOpen = function0;
            this.$onRemove = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsSheetScreenKt.ConnectionsStatusRow(this.$title, this.$isConnected, this.$onMenuOpen, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnectionsDisconnectEffect.values().length];
            try {
                AnonymousClass002.A13(ConnectionsDisconnectEffect.STOP_CONVERSATION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConnectionsDisconnectEffect.REMOVE_FROM_DIRECTORY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConnectionsDisconnectEffect.DISCONNECT_RELATIONSHIP, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ConnectionsConversationRow(PairsHistoryScreenKey pairsHistoryScreenKey, Long l, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1465596872);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, pairsHistoryScreenKey) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, l);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
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
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA1V = AnonymousClass002.A1V(bfm, pairsHistoryScreenKey, AnonymousClass003.A1D(iA0T), bfm.A67(auraNavigatorA0b));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new ConnectionsSheetScreenKt$ConnectionsConversationRow$1$1(function0, auraNavigatorA0b, pairsHistoryScreenKey);
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = AbstractC07539Wl.A00(C3U4.A04(C0v5.A04(bRgA0R, c1ydA0A, null, (Function0) objAaT, true), 12.0f), "connections-conversation-history");
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 4.0f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA02);
            C90m c90m = C90m.A00;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207e7);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0O(c90m, BRg.A00, true), C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            if (l != null) {
                bfm.AgE(-1049919516);
                boolean zA1C = AnonymousClass003.A1C(iA0T);
                Object objAaT2 = bfm.AaT();
                if (zA1C || objAaT2 == C78N.A00) {
                    objAaT2 = PairsHistoryScreenKt.formatActivityTime(contextA0H, l.longValue());
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU((String) objAaT2, null, C3cH.A05(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, C3cH.A0F(6), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            } else {
                bfm.AgE(-1049673314);
            }
            BBI.A0R(bbi, false);
            AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0), 16.0f, null, C3cH.A05(bfm, auraTheme), null, bfm, AnonymousClass001.A03(), 41);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(pairsHistoryScreenKey, l, function0, bRg2, i, i2);
        }
    }

    public static final void ConnectionsPersonMenu(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(function0, function02);
        bfm.AgG(1625116805);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120d80);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.trash_wght400_outline_24, 0);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA02);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.ellipsis_wght400_outline_24, 0);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207f1);
            boolean zA1F = AnonymousClass004.A1F(iA0T);
            Object objAaT2 = bfm.AaT();
            if (zA1F || objAaT2 == obj) {
                objAaT2 = new ConnectionsSheetScreenKt$ConnectionsPersonMenu$1$1$1(function0, mutableState);
                bfm.Ai0(objAaT2);
            }
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA002, strA012, (Function0) objAaT2, null, false, HeaderButtonKt.PillIconTouchTarget, null, null, null, false, false, bfm, AVy.$stable, 0, 2008);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA1N = AnonymousClass001.A1N(iA0T);
            Object objAaT3 = bfm.AaT();
            if (zA1N || objAaT3 == obj) {
                objAaT3 = new ConnectionsSheetScreenKt$ConnectionsPersonMenu$1$2$1(function02, mutableState);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new ConnectionsSheetScreenKt$ConnectionsPersonMenu$1$3$1(mutableState);
                bfm.Ai0(objAaT4);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u, (Function0) objAaT4, zA0A, null, 0L, null, false, new ConnectionsSheetScreenKt$ConnectionsPersonMenu$1$4(strA01, aVyA00), false, null, null, null, false, bfm, 384, 0, 16113);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, function02, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConnectionsRemoveDialog(java.lang.String r22, com.facebook.aura.pairs.ConnectionsDisconnectEffect r23, kotlin.jvm.functions.Function0<kotlin.Unit> r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, kotlin.jvm.functions.Function0<kotlin.Unit> r26, X.BRg r27, X.BFM r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsSheetScreenKt.ConnectionsRemoveDialog(java.lang.String, com.facebook.aura.pairs.ConnectionsDisconnectEffect, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* renamed from: ConnectionsRemoveMenu-xfPyhaw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1653ConnectionsRemoveMenuxfPyhaw(kotlin.jvm.functions.Function0<kotlin.Unit> r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, X.BRg r42, float r43, long r44, X.BFM r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsSheetScreenKt.m1653ConnectionsRemoveMenuxfPyhaw(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, float, long, X.BFM, int, int):void");
    }

    public static final void ConnectionsSectionHeading(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(1861048903);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).footnoteMedium;
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0R(bRg2), 12.0f, 0.0f, 0.0f, 8.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConnectionsSheetScreenKt$ConnectionsSectionHeading$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA0C, objAaT, false), jA07, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128442(str, bRg2, i, i2);
        }
    }

    public static final void ConnectionsSheetAvatar(ConnectionsSheetItem connectionsSheetItem, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(2060594408);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsSheetItem, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (connectionsSheetItem instanceof ConnectionsSheetItem.Person) {
                bfm.AgE(251307981);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0Q);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                C0z7 c0z7 = C0z7.A00;
                ConnectionsSheetItem.Person person = (ConnectionsSheetItem.Person) connectionsSheetItem;
                PairsImageRef pairsImageRef = person.person.contact.photo;
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                long jA04 = C60R.A04(bfm, auraTheme);
                int i4 = PairsImageRef.$stable;
                PairsComponentsKt.m1664PairsPersonPhotovlEVYhg(pairsImageRef, 72.0f, null, jA04, bfm, i4 | 48, 4);
                PairsImageRef pairsImageRef2 = person.person.contact.avatar;
                BRg bRgA012 = AYD.A01(c0z7.A4C(C2VU.A07, BRg.A00), 10.0f, 0.0f);
                C1D3 c1d3 = C1D8.A00;
                PairsComponentsKt.m1663PairsMuseAvataruFdPcIQ(pairsImageRef2, 32.0f, C1DI.A02(C1b8.A01(C11U.A03(bRgA012, c1d3), auraTheme.getColors(bfm, 6).modal), c1d3, 1.0f, auraTheme.getColors(bfm, 6).fillDivider), bfm, i4 | 48, 0);
                bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, true, false);
            } else {
                if (!(connectionsSheetItem instanceof ConnectionsSheetItem.Group)) {
                    throw AnonymousClass005.A0k(bfm, 251306309);
                }
                bfm.AgE(251326610);
                ConnectionsComponentsKt.m1649ConnectionsGroupAvatarDt02yhY(72.0f, bRgA0Q, C60R.A04(bfm, AuraTheme.INSTANCE), bfm, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 0);
                AnonymousClass001.A1D(bfm);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128452(connectionsSheetItem, bRgA0Q, i, i2);
        }
    }

    public static final void ConnectionsSheetContent(ConnectionsSheetItem connectionsSheetItem, PairsHistoryScreenKey pairsHistoryScreenKey, ConnectionsLogContext connectionsLogContext, Map<String, String> map, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        boolean zIsVerified;
        ConnectionsSheetItem.Person person;
        ConnectionsPerson connectionsPerson;
        PairsContact pairsContact;
        BRg bRg2 = bRg;
        bfm.AgG(-2111548356);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsSheetItem, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, pairsHistoryScreenKey);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(connectionsLogContext, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass002.A00(AnonymousClass004.A1a(map, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 74899, 74898), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA05 & 14;
            String strDisplayName = displayName(connectionsSheetItem, bfm, i4);
            int i5 = iA05 & 896;
            int i6 = iA05 & 7168;
            boolean zA1Q = AnonymousClass002.A1Q(iA05 & 57344, 16384) | (i5 == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsLogContext))) | (i6 == 2048 || ((iA05 & 4096) != 0 && bfm.A67(map)));
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new ConnectionsSheetScreenKt$ConnectionsSheetContent$onRemoveClick$1$1(connectionsLogContext, map, function0);
                bfm.Ai0(objAaT);
            }
            Function0 function02 = (Function0) objAaT;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0C = C3U4.A0C(bRg2.then(c1062ATq), 16.0f, 0.0f, 16.0f, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, c1062ATq);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C0z7 c0z7 = C0z7.A00;
            ConnectionsSheetHeader(connectionsSheetItem, strDisplayName, null, bfm, i4, 4);
            boolean z = (i6 == 2048 || ((iA05 & 4096) != 0 && bfm.A67(map))) | (i5 == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsLogContext)));
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == C78N.A00) {
                objAaT2 = new ConnectionsSheetScreenKt$ConnectionsSheetContent$1$1$1$1(connectionsLogContext, map);
                bfm.Ai0(objAaT2);
            }
            ConnectionsPersonMenu((Function0) objAaT2, function02, C3U4.A0C(c0z7.A4C(C2VU.A0D, bs0), 0.0f, 4.0f, 0.0f, 0.0f), bfm, 0, 0);
            BBI.A0R(bbi, true);
            ConnectionsSectionHeading(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120830), null, bfm, 0, 2);
            String strStatusTitle = statusTitle(connectionsSheetItem, bfm, i4);
            boolean z2 = connectionsSheetItem instanceof ConnectionsSheetItem.Person;
            if (z2) {
                zIsVerified = ((ConnectionsSheetItem.Person) connectionsSheetItem).person.contact.isVerified();
            } else {
                if (!(connectionsSheetItem instanceof ConnectionsSheetItem.Group)) {
                    throw C3cG.A0q();
                }
                zIsVerified = true;
            }
            boolean z3 = (i6 == 2048 || ((iA05 & 4096) != 0 && bfm.A67(map))) | (i5 == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsLogContext)));
            Object objAaT3 = bfm.AaT();
            if (z3 || objAaT3 == C78N.A00) {
                objAaT3 = new ConnectionsSheetScreenKt$ConnectionsSheetContent$1$2$1(connectionsLogContext, map);
                bfm.Ai0(objAaT3);
            }
            Function0 function04 = (Function0) objAaT3;
            boolean z4 = i5 == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsLogContext));
            Object objAaT4 = bfm.AaT();
            if (z4 || objAaT4 == C78N.A00) {
                objAaT4 = new ConnectionsSheetScreenKt$ConnectionsSheetContent$1$3$1(connectionsLogContext);
                bfm.Ai0(objAaT4);
            }
            ConnectionsStatusCard(strStatusTitle, zIsVerified, function04, function02, pairsHistoryScreenKey, (Function0) objAaT4, (!z2 || (person = (ConnectionsSheetItem.Person) connectionsSheetItem) == null || (connectionsPerson = person.person) == null || (pairsContact = connectionsPerson.contact) == null) ? null : pairsContact.lastActivityAtMs, null, bfm, (iA05 << 9) & 57344, 128);
            String museId = getMuseId(connectionsSheetItem);
            String groupConnectionId = getGroupConnectionId(connectionsSheetItem);
            BRg bRgA0C2 = C3U4.A0C(bs0, 0.0f, 20.0f, 0.0f, 0.0f);
            int i7 = ConnectionsLogContext.$stable;
            ConnectionsCollaboratingSectionKt.ConnectionsCollaboratingSection(museId, groupConnectionId, connectionsLogContext, bRgA0C2, bfm, (i7 << 6) | 3072 | i5, 0);
            ConnectionsGuidanceSectionKt.ConnectionsGuidanceSection(strDisplayName, getMuseId(connectionsSheetItem), getGroupConnectionId(connectionsSheetItem), connectionsLogContext, C3U4.A0C(bs0, 0.0f, 20.0f, 0.0f, 0.0f), bfm, (i7 << 9) | RuntimeInternals.IOPRIO_BACKGROUND | ((iA05 << 3) & 7168), 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128462(connectionsSheetItem, pairsHistoryScreenKey, connectionsLogContext, map, function0, bRg2, i, i2);
        }
    }

    public static final void ConnectionsSheetHeader(ConnectionsSheetItem connectionsSheetItem, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-318869281);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsSheetItem, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0R(bRg2), 0.0f, 0.0f, 0.0f, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            int i4 = iA05 & 14;
            ConnectionsSheetAvatar(connectionsSheetItem, null, bfm, i4, 2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title2Emphasized;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            BRg bRgA0C2 = C3U4.A0C(bs0, 0.0f, 12.0f, 0.0f, 0.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConnectionsSheetScreenKt$ConnectionsSheetHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bRgA0C2, (G0U) objAaT, false), jA06, c1822Arm, null, null, C3cH.A0F(3), false, 0, 2, 2, null, null, null, bfm, ((iA05 >> 3) & 14) | 805306368, 6, 14768);
            AuraTextKt.m2639AuraTextUY9GdpU(subtitle(connectionsSheetItem, bfm, i4), C3U4.A0C(bs0, 0.0f, 2.0f, 0.0f, 0.0f), C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128472(connectionsSheetItem, str, bRg2, i, i2);
        }
    }

    public static final void ConnectionsSheetScreen(ConnectionsSheetKey connectionsSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        ConnectionsSheetState.Found found;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(connectionsSheetKey, 0);
        bfm.AgG(-648578421);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, connectionsSheetKey) : i;
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
            ConnectionsViewModel connectionsViewModel = ConnectionsTabScreenKt.connectionsViewModel(bfm, 0);
            boolean zA65 = bfm.A65(connectionsSheetKey.subject) | bfm.A65(connectionsViewModel);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = connectionsViewModel.sheetState(connectionsSheetKey.subject);
                bfm.Ai0(objAaT);
            }
            C1BO c1boA01 = C2CK.A01(bfm, null, ConnectionsSheetState.Loading.INSTANCE, (C20Q) objAaT, 48, 14);
            if (C7384Etj.areEqual(c1boA01.getValue(), ConnectionsSheetState.Missing.INSTANCE)) {
                bfm.AgE(1258470810);
                AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
                Unit unit = Unit.INSTANCE;
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new ConnectionsSheetScreenKt$ConnectionsSheetScreen$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                AnonymousClass001.A17(bfm, objAaT2, unit);
            } else {
                bfm.AgE(1258590935);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            ConnectionsSheetSubject connectionsSheetSubject = connectionsSheetKey.subject;
            boolean zA672 = bfm.A67(connectionsViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new ConnectionsSheetScreenKt$ConnectionsSheetScreen$2$1(connectionsViewModel);
                bfm.Ai0(objAaT3);
            }
            C7bA.A05(bfm, null, connectionsSheetSubject, (G0U) objAaT3, 0, 2);
            ConnectionsSheetState connectionsSheetState = (ConnectionsSheetState) c1boA01.getValue();
            ConnectionsSheetItem connectionsSheetItem = (!(connectionsSheetState instanceof ConnectionsSheetState.Found) || (found = (ConnectionsSheetState.Found) connectionsSheetState) == null) ? null : found.item;
            ConnectionsInfo connectionsInfoRememberConnectionsInfo = rememberConnectionsInfo(connectionsSheetKey.subject, bfm, 0);
            Object objAaT4 = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT4, obj, false);
            ConnectionsLogContext connectionsLogContextRememberConnectionsLogContext = PairsAnalyticsKt.rememberConnectionsLogContext(HatchScreen.CONNECTION_DETAIL, bfm, 6);
            boolean zA652 = bfm.A65(connectionsSheetKey.subject);
            Object objAaT5 = bfm.AaT();
            if (zA652 || objAaT5 == obj) {
                objAaT5 = PairsAnalytics.INSTANCE.connectionType$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(connectionsSheetKey.subject);
                bfm.Ai0(objAaT5);
            }
            Map map = (Map) objAaT5;
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, AbstractC07539Wl.A00(bRg2, "connections-sheet"), null, null, null, null, null, false, false, false, null, B1V.A00(bfm, new C128483(connectionsSheetItem, connectionsInfoRememberConnectionsInfo, connectionsLogContextRememberConnectionsLogContext, map, mutableState), -568284280), bfm, 0, 48, 2045);
            if (!MutableState.A0A(mutableState) || connectionsSheetItem == null) {
                bfm.AgE(1260398359);
            } else {
                bfm.AgE(1259657428);
                String removeName = getRemoveName(connectionsSheetItem);
                ConnectionsDisconnectEffect connectionsDisconnectEffectDisconnectEffect = disconnectEffect(connectionsSheetItem, connectionsInfoRememberConnectionsInfo);
                boolean zA1T = AnonymousClass001.A1T(bfm, connectionsInfoRememberConnectionsInfo, AnonymousClass005.A1V(bfm, map, connectionsSheetItem, connectionsViewModel, bfm.A67(connectionsLogContextRememberConnectionsLogContext)));
                Object objAaT6 = bfm.AaT();
                if (zA1T || objAaT6 == obj) {
                    objAaT6 = new ConnectionsSheetScreenKt$ConnectionsSheetScreen$4$1(connectionsLogContextRememberConnectionsLogContext, map, connectionsSheetItem, connectionsViewModel, connectionsInfoRememberConnectionsInfo, mutableState);
                    bfm.Ai0(objAaT6);
                }
                Function0 function0 = (Function0) objAaT6;
                boolean zA1M = AnonymousClass003.A1M(bfm, connectionsLogContextRememberConnectionsLogContext, map);
                Object objAaT7 = bfm.AaT();
                if (zA1M || objAaT7 == obj) {
                    objAaT7 = new ConnectionsSheetScreenKt$ConnectionsSheetScreen$5$1(connectionsLogContextRememberConnectionsLogContext, map, mutableState);
                    bfm.Ai0(objAaT7);
                }
                Function0 function02 = (Function0) objAaT7;
                Object objAaT8 = bfm.AaT();
                if (objAaT8 == obj) {
                    objAaT8 = new ConnectionsSheetScreenKt$ConnectionsSheetScreen$6$1(mutableState);
                    bfm.Ai0(objAaT8);
                }
                ConnectionsRemoveDialog(removeName, connectionsDisconnectEffectDisconnectEffect, function0, function02, (Function0) objAaT8, null, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 32);
            }
            BBI.A0R(bbiA07, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass7(connectionsSheetKey, bRg2, i, i2);
        }
    }

    public static final void ConnectionsStatusCard(String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, PairsHistoryScreenKey pairsHistoryScreenKey, Function0<Unit> function03, Long l, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1058931792);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, pairsHistoryScreenKey);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function03);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, l);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0B = C3U4.A0B(C1b8.A03(bRgA0R, auraTheme.getShapes(bfm, 6).card, C60R.A04(bfm, auraTheme)), 12.0f, pairsHistoryScreenKey == null ? 17.0f : 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            BRg bRgA03 = BRg.A00;
            if (pairsHistoryScreenKey != null) {
                bRgA03 = C3U4.A03(bRgA03, 12.0f);
            }
            ConnectionsStatusRow(str, z, function0, function02, bRgA03, bfm, iA0d & 8190, 0);
            if (pairsHistoryScreenKey != null) {
                bfm.AgE(-303175752);
                AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
                ConnectionsConversationRow(pairsHistoryScreenKey, l, function03, null, bfm, ((iA0d >> 12) & 14) | ((iA0d >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0d >> 9) & 896), 8);
            } else {
                bfm.AgE(-303068120);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128492(str, z, function0, function02, pairsHistoryScreenKey, function03, l, bRg2, i, i2);
        }
    }

    public static final void ConnectionsStatusRow(String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        long jA05;
        BRg bRg2 = bRg;
        bfm.AgG(934186384);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 4.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(BRg.A00, 1.0f, true), C3cH.A06(bfm, auraTheme), C60Q.A0D(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            int i4 = R.string._name_removed__res_0x7f1207f4;
            if (z) {
                i4 = R.string._name_removed__res_0x7f1207f3;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i4);
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            if (z) {
                bfm.AgE(-532156237);
                jA05 = auraTheme.getColors(bfm, 6).success;
            } else {
                bfm.AgE(-532155272);
                jA05 = C3cH.A05(bfm, auraTheme);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, jA05, c1822ArmA0C, null, null, C3cH.A0F(6), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            m1653ConnectionsRemoveMenuxfPyhaw(function0, function02, null, 0.0f, 0L, bfm, (iA0d >> 6) & 126, 28);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128502(str, z, function0, function02, bRg2, i, i2);
        }
    }

    public static final PairsHistoryScreenKey conversation(ConnectionsSheetItem connectionsSheetItem, ConnectionsInfo connectionsInfo) {
        String str;
        if (!(connectionsSheetItem instanceof ConnectionsSheetItem.Person)) {
            if (connectionsSheetItem instanceof ConnectionsSheetItem.Group) {
                return null;
            }
            throw C3cG.A0q();
        }
        ConnectionsPerson connectionsPerson = ((ConnectionsSheetItem.Person) connectionsSheetItem).person;
        PairsHistoryScreenKey pairsHistoryScreenKey = connectionsPerson.conversation;
        if (pairsHistoryScreenKey != null) {
            return pairsHistoryScreenKey;
        }
        if (connectionsInfo == null || (str = connectionsInfo.chatSessionId) == null) {
            return null;
        }
        return new PairsHistoryScreenKey(connectionsPerson.contact.museId, str, connectionsInfo.connectionId);
    }

    public static final ConnectionsDisconnectEffect disconnectEffect(ConnectionsSheetItem connectionsSheetItem, ConnectionsInfo connectionsInfo) {
        if (connectionsSheetItem instanceof ConnectionsSheetItem.Person) {
            if (connectionsInfo != null) {
                return connectionsInfo.disconnectEffect;
            }
            return null;
        }
        if (connectionsSheetItem instanceof ConnectionsSheetItem.Group) {
            return ((ConnectionsSheetItem.Group) connectionsSheetItem).group.disconnectEffect;
        }
        throw C3cG.A0q();
    }

    public static final String displayName(ConnectionsSheetItem connectionsSheetItem, BFM bfm, int i) {
        if (connectionsSheetItem instanceof ConnectionsSheetItem.Person) {
            bfm.AgE(194642748);
            String strA01 = ((ConnectionsSheetItem.Person) connectionsSheetItem).person.contact.displayName;
            if (strA01.length() == 0) {
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120837);
            }
            AnonymousClass002.A19(bfm);
            return strA01;
        }
        if (connectionsSheetItem instanceof ConnectionsSheetItem.Group) {
            bfm.AgE(-270812523);
            AnonymousClass002.A19(bfm);
            return ((ConnectionsSheetItem.Group) connectionsSheetItem).group.displayName;
        }
        bfm.AgE(-270818624);
        AnonymousClass002.A19(bfm);
        throw C3cG.A0q();
    }

    public static final String getGroupConnectionId(ConnectionsSheetItem connectionsSheetItem) {
        ConnectionsSheetItem.Group group;
        ConnectionsGroup connectionsGroup;
        if (!(connectionsSheetItem instanceof ConnectionsSheetItem.Group) || (group = (ConnectionsSheetItem.Group) connectionsSheetItem) == null || (connectionsGroup = group.group) == null) {
            return null;
        }
        return connectionsGroup.connectionId;
    }

    public static final String getMuseId(ConnectionsSheetItem connectionsSheetItem) {
        ConnectionsSheetItem.Person person;
        ConnectionsPerson connectionsPerson;
        PairsContact pairsContact;
        if (!(connectionsSheetItem instanceof ConnectionsSheetItem.Person) || (person = (ConnectionsSheetItem.Person) connectionsSheetItem) == null || (connectionsPerson = person.person) == null || (pairsContact = connectionsPerson.contact) == null) {
            return null;
        }
        return pairsContact.museId;
    }

    public static final String getRemoveName(ConnectionsSheetItem connectionsSheetItem) {
        if (connectionsSheetItem instanceof ConnectionsSheetItem.Person) {
            return ((ConnectionsSheetItem.Person) connectionsSheetItem).person.contact.displayName;
        }
        if (connectionsSheetItem instanceof ConnectionsSheetItem.Group) {
            return ((ConnectionsSheetItem.Group) connectionsSheetItem).group.displayName;
        }
        throw C3cG.A0q();
    }

    public static final String statusTitle(ConnectionsSheetItem connectionsSheetItem, BFM bfm, int i) {
        String strA01;
        if (connectionsSheetItem instanceof ConnectionsSheetItem.Person) {
            bfm.AgE(1784628917);
            strA01 = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f1207f2);
        } else {
            if (!(connectionsSheetItem instanceof ConnectionsSheetItem.Group)) {
                throw AnonymousClass005.A0k(bfm, 1784627027);
            }
            bfm.AgE(1784632353);
            strA01 = AbstractC2271BQs.A01(bfm, ConnectionsComponentsKt.channelName(((ConnectionsSheetItem.Group) connectionsSheetItem).group.provider));
        }
        AnonymousClass001.A1D(bfm);
        return strA01;
    }

    public static final String subtitle(ConnectionsSheetItem connectionsSheetItem, BFM bfm, int i) {
        String strA01;
        int i2;
        String str;
        Object[] objArr;
        if (connectionsSheetItem instanceof ConnectionsSheetItem.Person) {
            bfm.AgE(-224816823);
            ConnectionsSheetItem.Person person = (ConnectionsSheetItem.Person) connectionsSheetItem;
            if (person.person.contact.agentName.length() == 0) {
                bfm.AgE(1620648359);
                i2 = R.string._name_removed__res_0x7f120d77;
                objArr = new Object[1];
                str = HatchAppName.value;
            } else {
                bfm.AgE(1620751465);
                i2 = R.string._name_removed__res_0x7f120d76;
                str = person.person.contact.agentName;
                objArr = new Object[1];
            }
            objArr[0] = str;
            strA01 = AbstractC2271BQs.A02(bfm, objArr, i2);
            AnonymousClass001.A1D(bfm);
        } else {
            if (!(connectionsSheetItem instanceof ConnectionsSheetItem.Group)) {
                throw AnonymousClass005.A0k(bfm, -224818713);
            }
            bfm.AgE(-224808055);
            strA01 = AbstractC2271BQs.A01(bfm, ConnectionsComponentsKt.channelName(((ConnectionsSheetItem.Group) connectionsSheetItem).group.provider));
        }
        AnonymousClass001.A1D(bfm);
        return strA01;
    }

    public static final ConnectionsInfo rememberConnectionsInfo(ConnectionsSheetSubject connectionsSheetSubject, BFM bfm, int i) {
        bfm.AgE(1254375786);
        if (!(connectionsSheetSubject instanceof ConnectionsSheetSubject.Person)) {
            AnonymousClass002.A19(bfm);
            return null;
        }
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        String str = ((CH0) abstractC3358CGzA0h).A01;
        String str2 = ((ConnectionsSheetSubject.Person) connectionsSheetSubject).museId;
        String strA0d = FGI.A0d("connections-info:", str, ":", str2);
        ConnectionsInfoViewModel.Factory factory = new ConnectionsInfoViewModel.Factory(abstractC3358CGzA0h, str2);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 == null) {
            throw AnonymousClass001.A0o();
        }
        ConnectionsInfo connectionsInfo = (ConnectionsInfo) C1BO.A07(bfm, ((ConnectionsInfoViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), strA0d, C3cG.A0x(ConnectionsInfoViewModel.class))).info);
        AnonymousClass001.A1D(bfm);
        return connectionsInfo;
    }
}
