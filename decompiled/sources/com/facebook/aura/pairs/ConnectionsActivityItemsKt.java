package com.facebook.aura.pairs;

import X.AGI;
import X.AKQ;
import X.ARD;
import X.ARL;
import X.AVy;
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
import X.B18;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C0A8;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1SA;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C6tn;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.file.view.api.ContentTypeDetector;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ConnectionsActivityItemsKt {
    public static final Set<Integer> GLYPH_ICONS = BFI.A0H(new Integer[]{Integer.valueOf(R.drawable.link_outline_24_wght400), Integer.valueOf(R.drawable.aura_tab_goals_outline_24), Integer.valueOf(R.drawable.aura_tab_feed_outline_24), Integer.valueOf(R.drawable.aura_tab_ideas_outline_24)});
    public static final int MAX_EXTENSION_LENGTH = 8;
    public static final int MENU_REMOVE = 0;

    /* renamed from: com.facebook.aura.pairs.ConnectionsActivityItemsKt$ConnectionsActivityDetail$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsActivity $activity;
        public final /* synthetic */ Set<String> $busyIds;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onReview;
        public final /* synthetic */ int $position;
        public final /* synthetic */ ConnectionsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ConnectionsActivity connectionsActivity, Set<String> set, ConnectionsViewModel connectionsViewModel, Function0<Unit> function0, ConnectionsLogContext connectionsLogContext, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$activity = connectionsActivity;
            this.$busyIds = set;
            this.$viewModel = connectionsViewModel;
            this.$onReview = function0;
            this.$log = connectionsLogContext;
            this.$position = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsActivityItemsKt.ConnectionsActivityDetail(this.$activity, this.$busyIds, this.$viewModel, this.$onReview, this.$log, this.$position, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsActivityItemsKt$ConnectionsActivityHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsActivity $activity;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ long $nowMs;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onMenuOpen;
        public final /* synthetic */ Function0<Unit> $onOpenPerson;
        public final /* synthetic */ String $personName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConnectionsActivity connectionsActivity, String str, long j, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$activity = connectionsActivity;
            this.$personName = str;
            this.$nowMs = j;
            this.$onOpenPerson = function0;
            this.$onMenuOpen = function02;
            this.$onDismiss = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsActivityItemsKt.ConnectionsActivityHeader(this.$activity, this.$personName, this.$nowMs, this.$onOpenPerson, this.$onMenuOpen, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsActivityItemsKt$ConnectionsActivityItem$2, reason: invalid class name and case insensitive filesystem */
    public final class C128102 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectionsActivity $activity;
        public final /* synthetic */ Set<String> $busyIds;
        public final /* synthetic */ ConnectionsLogContext $log;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ long $nowMs;
        public final /* synthetic */ AuraNavKey $personTarget;
        public final /* synthetic */ int $position;
        public final /* synthetic */ ConnectionsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128102(ConnectionsActivity connectionsActivity, Set<String> set, long j, AuraNavKey auraNavKey, ConnectionsViewModel connectionsViewModel, ConnectionsLogContext connectionsLogContext, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$activity = connectionsActivity;
            this.$busyIds = set;
            this.$nowMs = j;
            this.$personTarget = auraNavKey;
            this.$viewModel = connectionsViewModel;
            this.$log = connectionsLogContext;
            this.$position = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsActivityItemsKt.ConnectionsActivityItem(this.$activity, this.$busyIds, this.$nowMs, this.$personTarget, this.$viewModel, this.$log, this.$position, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsActivityItemsKt$ConnectionsActivityMenu$2, reason: invalid class name and case insensitive filesystem */
    public final class C128112 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onOpen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128112(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onOpen = function0;
            this.$onDismiss = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsActivityItemsKt.ConnectionsActivityMenu(this.$onOpen, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsActivityItemsKt$ConnectionsAttachmentCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C128122 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $icon;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128122(int i, String str, String str2, BRg bRg, String str3, int i2, int i3) {
            super(2);
            this.$icon = i;
            this.$title = str;
            this.$subtitle = str2;
            this.$modifier = bRg;
            this.$imageUrl = str3;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsActivityItemsKt.ConnectionsAttachmentCard(this.$icon, this.$title, this.$subtitle, this.$modifier, this.$imageUrl, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsActivityItemsKt$ConnectionsItemIcon$2, reason: invalid class name and case insensitive filesystem */
    public final class C128132 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $icon;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128132(int i, BRg bRg, String str, int i2, int i3) {
            super(2);
            this.$icon = i;
            this.$modifier = bRg;
            this.$imageUrl = str;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsActivityItemsKt.ConnectionsItemIcon(this.$icon, this.$modifier, this.$imageUrl, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pairs.ConnectionsActivityItemsKt$ConnectionsRequestButtons$2, reason: invalid class name and case insensitive filesystem */
    public final class C128142 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $acceptLabel;
        public final /* synthetic */ int $ignoreLabel;
        public final /* synthetic */ boolean $isBusy;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAccept;
        public final /* synthetic */ Function0<Unit> $onIgnore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128142(int i, int i2, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i3, int i4) {
            super(2);
            this.$acceptLabel = i;
            this.$ignoreLabel = i2;
            this.$isBusy = z;
            this.$onAccept = function0;
            this.$onIgnore = function02;
            this.$modifier = bRg;
            this.$$changed = i3;
            this.$$default = i4;
        }

        public final void invoke(BFM bfm, int i) {
            ConnectionsActivityItemsKt.ConnectionsRequestButtons(this.$acceptLabel, this.$ignoreLabel, this.$isBusy, this.$onAccept, this.$onIgnore, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final int connectionsFileIconRes(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        return HatchFileUIUtils.INSTANCE.getWorkspaceEntryIconRes(WorkspaceEntry.EntryType.FILE, C6tn.A02(C7BY.A0N(str)), bfm, 390);
    }

    public static final String connectionsTimeAgo(long j, long j2, BFM bfm, int i) {
        int i2;
        long j3;
        String strA0t;
        long j4 = j2 - j;
        if (j4 < 0) {
            j4 = 0;
        }
        long j5 = j4 / 60000;
        if (j5 < 1) {
            bfm.AgE(-189596880);
            strA0t = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120834);
        } else {
            if (j5 < 60) {
                bfm.AgE(-189594627);
                i2 = R.string._name_removed__res_0x7f120833;
            } else {
                if (j5 < 1440) {
                    bfm.AgE(-189591808);
                    i2 = R.string._name_removed__res_0x7f120832;
                    j3 = 60;
                } else if (j5 < 10080) {
                    bfm.AgE(-189588762);
                    i2 = R.string._name_removed__res_0x7f120831;
                    j3 = 1440;
                } else {
                    bfm.AgE(-189586069);
                    i2 = R.string._name_removed__res_0x7f120835;
                    j3 = 10080;
                }
                j5 /= j3;
            }
            strA0t = AnonymousClass001.A0t(bfm, Long.valueOf(j5), i2);
        }
        AnonymousClass001.A1D(bfm);
        return strA0t;
    }

    public static final int iconRes(ConnectionsSharedItemKind connectionsSharedItemKind) {
        int iA0E = AnonymousClass001.A0E(connectionsSharedItemKind, 0);
        return iA0E != 2 ? iA0E != 0 ? iA0E != 1 ? R.drawable.hatch_file_types_artifact_40 : R.drawable.aura_tab_ideas_outline_24 : R.drawable.aura_tab_feed_outline_24 : R.drawable.aura_tab_goals_outline_24;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ConnectionsSharedItemKind.values().length];
            try {
                AnonymousClass005.A0v(ConnectionsSharedItemKind.GOAL, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ConnectionsSharedItemKind.FEED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(ConnectionsSharedItemKind.IDEA, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(ConnectionsSharedItemKind.SPACE, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(ConnectionsSharedItemKind.FILE, iArr, 5);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConnectionsActivityKind.values().length];
            try {
                AnonymousClass005.A0v(ConnectionsActivityKind.REQUEST_RECEIVED, iArr2, 1);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(ConnectionsActivityKind.REQUEST_ACCEPTED, iArr2, 2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(ConnectionsActivityKind.CONNECTED, iArr2, 3);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(ConnectionsActivityKind.CONFIRM_NEEDED, iArr2, 4);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(ConnectionsActivityKind.FILE_SHARED, iArr2, 5);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass002.A18(ConnectionsActivityKind.SPACE_SHARED, iArr2);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1G(ConnectionsActivityKind.ITEM_SHARED, iArr2);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass006.A1H(ConnectionsActivityKind.GOAL_UPDATED, iArr2);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass006.A1I(ConnectionsActivityKind.LINK_SHARED, iArr2);
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void ConnectionsActivityDetail(ConnectionsActivity connectionsActivity, Set<String> set, ConnectionsViewModel connectionsViewModel, Function0<Unit> function0, ConnectionsLogContext connectionsLogContext, int i, BRg bRg, BFM bfm, int i2, int i3) {
        int iIconRes;
        String str;
        String strLabel;
        int i4;
        int i5;
        String str2;
        BRg bRg2;
        String str3;
        BFM bfm2;
        int i6;
        String str4;
        String str5;
        String strFileTypeLabel;
        int i7;
        int i8;
        boolean zContains;
        Function0 function02;
        Function0 function03;
        int i9;
        int i10;
        BRg bRg3 = bRg;
        bfm.AgG(1455430289);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsActivity, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(set, bfm, i2) ? 1 : 0);
        }
        if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(connectionsViewModel, bfm, i2) ? 1 : 0);
        }
        if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, connectionsLogContext, i2, 32768) ? 1 : 0);
        }
        if ((196608 & i2) == 0) {
            iA05 |= AnonymousClass002.A02(bfm.A63(i) ? 1 : 0);
        }
        int i11 = i3 & 64;
        int iA0j = 1572864;
        if (i11 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i2) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg3);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA05), bfm, iA05)) {
            if (i11 != 0) {
                bRg3 = BRg.A00;
            }
            boolean zA1I = AnonymousClass007.A1I(iA05) | ((iA05 & 57344) == 16384 || ((iA05 & 32768) != 0 && bfm.A67(connectionsLogContext))) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(connectionsActivity)));
            Object objAaT = bfm.AaT();
            if (zA1I || objAaT == C78N.A00) {
                objAaT = new ConnectionsActivityItemsKt$ConnectionsActivityDetail$logClick$1$1(connectionsLogContext, connectionsActivity, i);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) objAaT;
            PairsInboxRequest pairsInboxRequest = connectionsActivity.request;
            PairsContact pairsContact = connectionsActivity.confirmContact;
            ConnectionsSharedFile connectionsSharedFile = connectionsActivity.file;
            ConnectionsSharedSpace connectionsSharedSpace = connectionsActivity.space;
            ConnectionsSharedItem connectionsSharedItem = connectionsActivity.item;
            ConnectionsSharedLink connectionsSharedLink = connectionsActivity.link;
            if (pairsInboxRequest != null) {
                bfm.AgE(1029506512);
                i8 = R.string._name_removed__res_0x7f1207eb;
                zContains = set.contains(pairsInboxRequest.deliveryId);
                int i12 = iA05 & 896;
                boolean zA1V = AnonymousClass002.A1V(bfm, pairsInboxRequest, bfm.A65(g0u), i12 == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsViewModel)));
                Object objAaT2 = bfm.AaT();
                if (zA1V || objAaT2 == C78N.A00) {
                    objAaT2 = new ConnectionsActivityItemsKt$ConnectionsActivityDetail$1$1(g0u, connectionsViewModel, pairsInboxRequest);
                    bfm.Ai0(objAaT2);
                }
                function02 = (Function0) objAaT2;
                boolean zA1V2 = AnonymousClass002.A1V(bfm, pairsInboxRequest, bfm.A65(g0u), i12 == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsViewModel)));
                Object objAaT3 = bfm.AaT();
                if (zA1V2 || objAaT3 == C78N.A00) {
                    objAaT3 = new ConnectionsActivityItemsKt$ConnectionsActivityDetail$2$1(g0u, connectionsViewModel, pairsInboxRequest);
                    bfm.Ai0(objAaT3);
                }
                function03 = (Function0) objAaT3;
                i9 = (iA05 >> 3) & 458752;
                i10 = 0;
                i7 = R.string._name_removed__res_0x7f120d4b;
            } else if (pairsContact != null) {
                bfm.AgE(-1490795102);
                i7 = R.string._name_removed__res_0x7f1207e3;
                i8 = R.string._name_removed__res_0x7f1207f5;
                zContains = set.contains(pairsContact.museId);
                int i13 = iA05 & 896;
                boolean zA1V3 = AnonymousClass002.A1V(bfm, pairsContact, i13 == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsViewModel)), bfm.A65(g0u));
                Object objAaT4 = bfm.AaT();
                if (zA1V3 || objAaT4 == C78N.A00) {
                    objAaT4 = new ConnectionsActivityItemsKt$ConnectionsActivityDetail$3$1(g0u, connectionsViewModel, pairsContact);
                    bfm.Ai0(objAaT4);
                }
                function02 = (Function0) objAaT4;
                boolean zA1V4 = AnonymousClass002.A1V(bfm, pairsContact, bfm.A65(g0u), i13 == 256 || ((iA05 & 512) != 0 && bfm.A67(connectionsViewModel)));
                Object objAaT5 = bfm.AaT();
                if (zA1V4 || objAaT5 == C78N.A00) {
                    objAaT5 = new ConnectionsActivityItemsKt$ConnectionsActivityDetail$4$1(g0u, connectionsViewModel, pairsContact);
                    bfm.Ai0(objAaT5);
                }
                function03 = (Function0) objAaT5;
                i9 = (iA05 >> 3) & 458752;
                i10 = 0;
            } else {
                if (connectionsSharedFile != null) {
                    if (!connectionsSharedFile.isAwaitingApproval || function0 == null) {
                        bfm.AgE(-1490767801);
                        iIconRes = connectionsFileIconRes(connectionsSharedFile.name, bfm, 0);
                        str5 = connectionsSharedFile.name;
                        strFileTypeLabel = fileTypeLabel(connectionsSharedFile);
                        i5 = 16;
                        str4 = str5;
                        strLabel = strFileTypeLabel;
                        bRg2 = bRg3;
                        str3 = null;
                        bfm2 = bfm;
                        i6 = (iA05 >> 9) & 7168;
                        ConnectionsAttachmentCard(iIconRes, str4, strLabel, bRg2, str3, bfm2, i6, i5);
                    } else {
                        bfm.AgE(1030553196);
                        AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12080c), null, AnonymousClass001.A0R(bRg3), AuraButtonStyles.INSTANCE.primaryAlt(null, bfm, 48, 1), AuraButtonSize.SMALL, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA05 << 3) & 57344, 0, 134201285);
                    }
                } else if (connectionsSharedLink != null) {
                    bfm.AgE(-1490761041);
                    iIconRes = R.drawable.link_outline_24_wght400;
                    str5 = connectionsSharedLink.title;
                    strFileTypeLabel = connectionsSharedLink.host;
                    i5 = 16;
                    str4 = str5;
                    strLabel = strFileTypeLabel;
                    bRg2 = bRg3;
                    str3 = null;
                    bfm2 = bfm;
                    i6 = (iA05 >> 9) & 7168;
                    ConnectionsAttachmentCard(iIconRes, str4, strLabel, bRg2, str3, bfm2, i6, i5);
                } else {
                    if (connectionsSharedSpace != null) {
                        bfm.AgE(1031269172);
                        iIconRes = R.drawable.hatch_file_types_artifact_40;
                        str = connectionsSharedSpace.name;
                        i5 = 0;
                        strLabel = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207da);
                        str2 = connectionsSharedSpace.iconUrl;
                        i4 = (iA05 >> 9) & 7168;
                    } else if (connectionsSharedItem == null || connectionsSharedItem.title == null) {
                        bfm.AgE(1032105521);
                    } else {
                        if (connectionsSharedItem.kind == ConnectionsSharedItemKind.FILE) {
                            bfm.AgE(1031625796);
                            ConnectionsSharedFile connectionsSharedFile2 = new ConnectionsSharedFile(connectionsSharedItem.title, null, false, null);
                            iIconRes = connectionsFileIconRes(connectionsSharedFile2.name, bfm, 0);
                            str = connectionsSharedItem.title;
                            strLabel = fileTypeLabel(connectionsSharedFile2);
                        } else {
                            bfm.AgE(-1490732728);
                            iIconRes = iconRes(connectionsSharedItem.kind);
                            str = connectionsSharedItem.title;
                            strLabel = label(connectionsSharedItem.kind, bfm, 0);
                        }
                        i4 = (iA05 >> 9) & 7168;
                        i5 = 16;
                        str2 = null;
                    }
                    bRg2 = bRg3;
                    str3 = str2;
                    bfm2 = bfm;
                    i6 = i4;
                    str4 = str;
                    ConnectionsAttachmentCard(iIconRes, str4, strLabel, bRg2, str3, bfm2, i6, i5);
                }
                AnonymousClass002.A19(bfm);
            }
            ConnectionsRequestButtons(i7, i8, zContains, function02, function03, bRg3, bfm, i9, i10);
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(connectionsActivity, set, connectionsViewModel, function0, connectionsLogContext, i, bRg3, i2, i3);
        }
    }

    public static final void ConnectionsActivityHeader(ConnectionsActivity connectionsActivity, String str, long j, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(1621137000);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsActivity, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function02);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, function03);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRgA0Q);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            C1AC c1ac = C2VU.A04;
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0W);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BRg bRgA05 = BRg.A00;
            BRg bRgAiP = c90m.AiP(bRgA05, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, c1ac, 4.0f);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function04);
            BPg.A02(bfm, interfaceC1380AiAA0V, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0D = C60Q.A0D(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgAiP2 = c90m.AiP(bRgA05, 1.0f, false);
            if (function0 != null) {
                bRgA05 = C0v5.A05(bRgA05, null, function0, true);
            }
            int i4 = iA05 >> 3;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRgAiP2.then(bRgA05), jA06, c1822ArmA0D, null, null, null, false, 0, 1, 2, null, null, null, bfm, (i4 & 14) | 805306368, 6, 14832);
            AuraTextKt.m2639AuraTextUY9GdpU(connectionsTimeAgo(connectionsActivity.atMs, j, bfm, i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), null, C3cH.A05(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            if (function03 != null) {
                bfm.AgE(2055067506);
                ConnectionsActivityMenu(function02, function03, null, bfm, (iA05 >> 12) & 126, 4);
            } else {
                bfm.AgE(-717372546);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(connectionsActivity, str, j, function0, function02, function03, bRgA0Q, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v14, types: [X.BRg, com.facebook.aura.vds.compose.divider.AuraDividerStyle] */
    /* JADX WARN: Type inference failed for: r17v4, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r42v2, types: [X.B0A] */
    /* JADX WARN: Type inference failed for: r43v2, types: [X.ApY] */
    /* JADX WARN: Type inference failed for: r44v3, types: [X.1YL] */
    /* JADX WARN: Type inference failed for: r45v2, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r49v1, types: [X.G0U] */
    /* JADX WARN: Type inference failed for: r50v0, types: [X.ArU] */
    /* JADX WARN: Type inference failed for: r51v0, types: [X.013] */
    /* JADX WARN: Type inference failed for: r70v0, types: [X.BFM, java.lang.Object] */
    public static final void ConnectionsActivityItem(ConnectionsActivity connectionsActivity, Set<String> set, long j, AuraNavKey auraNavKey, ConnectionsViewModel connectionsViewModel, ConnectionsLogContext connectionsLogContext, int i, BRg bRg, BFM bfm, int i2, int i3) {
        Function0 function0;
        BRg bRg2;
        BRg bRgA01;
        Object obj;
        Object obj2;
        BRg bRg3 = bRg;
        boolean zA1a = AnonymousClass002.A1a(connectionsActivity, set);
        AnonymousClass002.A1D(connectionsViewModel, 4, connectionsLogContext);
        bfm.AgG(673681954);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectionsActivity, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(set, bfm, i2) ? 1 : 0);
        }
        if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass002.A00(AnonymousClass004.A1a(auraNavKey, bfm, i2) ? 1 : 0);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass002.A04(AnonymousClass004.A1R(bfm, connectionsViewModel, i2, 32768) ? 1 : 0);
        }
        if ((196608 & i2) == 0) {
            iA05 |= AnonymousClass002.A02(AnonymousClass004.A1R(bfm, connectionsLogContext, i2, 262144) ? 1 : 0);
        }
        if ((i2 & 1572864) == 0) {
            iA05 |= AnonymousClass004.A0I(bfm, i);
        }
        int i4 = i3 & 128;
        int iA0k = 12582912;
        if (i4 != 0) {
            iA05 |= iA0k;
        } else if ((i2 & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg3);
            iA05 |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA05), bfm, iA05)) {
            if (i4 != 0) {
                bRg3 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String str = connectionsActivity.personName;
            String strA01 = str;
            if (str == null) {
                bfm.AgE(-1131692718);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120837);
            } else {
                bfm.AgE(-1131693431);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            boolean zContains = set.contains(connectionsActivity.id);
            int i5 = iA05 & 14;
            boolean zA1C = (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(connectionsActivity))) | ((458752 & iA05) == 131072 || ((iA05 & 262144) != 0 && bfm.A67(connectionsLogContext))) | AnonymousClass005.A1C(iA05);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new ConnectionsActivityItemsKt$ConnectionsActivityItem$logClick$1$1(connectionsLogContext, connectionsActivity, i);
                bfm.Ai0(objAaT);
            }
            G0V g0v = (G0V) objAaT;
            if (auraNavKey == null) {
                bfm.AgE(-722439467);
                BBI.A0R(bbiA07, false);
                function0 = null;
            } else {
                bfm.AgE(-722439466);
                boolean zA1O = C3cH.A1O(bfm, g0v, auraNavigatorA0b, auraNavKey);
                Object objAaT2 = bfm.AaT();
                if (zA1O || objAaT2 == C78N.A00) {
                    objAaT2 = new ConnectionsActivityItemsKt$ConnectionsActivityItem$onOpenPerson$1$1$1(g0v, auraNavigatorA0b, auraNavKey);
                    bfm.Ai0(objAaT2);
                }
                function0 = (Function0) objAaT2;
                BBI.A0R(bbiA07, false);
            }
            boolean z = i5 == 4 || ((iA05 & 8) != 0 && bfm.A65(connectionsActivity));
            Object objAaT3 = bfm.AaT();
            if (z || objAaT3 == C78N.A00) {
                objAaT3 = PairsAnalytics.INSTANCE.activityKind$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(connectionsActivity);
                bfm.Ai0(objAaT3);
            }
            boolean zIsOpenable = ConnectionsViewModelKt.isOpenable(connectionsActivity);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg3.then(c1062ATq);
            HatchComponent hatchComponent = HatchComponent.CONNECTIONS_ACTIVITY_ROW;
            HatchSubsurface hatchSubsurface = HatchSubsurface.CONNECTIONS_ACTIVITY;
            Integer numValueOf = Integer.valueOf(i);
            String str2 = connectionsActivity.id;
            int i6 = ConnectionsLogContext.$stable;
            int i7 = iA05 >> 6;
            BRg bRgThen2 = bRgThen.then(PairsAnalyticsKt.rememberConnectionsImpression(connectionsLogContext, hatchComponent, hatchSubsurface, (Map) objAaT3, numValueOf, str2, bfm, i6 | 432 | ((iA05 >> 15) & 14) | (i7 & 57344), 0));
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA02 = C3cG.A02(bbiA07.A06);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA012 = AxM.A01(bfm, bRgThen2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            BRg bRgA04 = BRg.A00;
            if (zIsOpenable) {
                bfm.AgE(716977998);
                C1YD c1ydA0A = C3cG.A0A(0);
                boolean zA65 = bfm.A65(g0v) | ((iA05 & 57344) == 16384 || ((iA05 & 32768) != 0 && bfm.A67(connectionsViewModel))) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(connectionsActivity)));
                Object objAaT4 = bfm.AaT();
                if (zA65 || objAaT4 == C78N.A00) {
                    objAaT4 = new ConnectionsActivityItemsKt$ConnectionsActivityItem$1$1$1(g0v, connectionsViewModel, connectionsActivity);
                    bfm.Ai0(objAaT4);
                }
                bRgA04 = C0v5.A04(bRgA04, c1ydA0A, null, (Function0) objAaT4, zA1a);
            } else {
                bfm.AgE(717196796);
            }
            BBI.A0R(bbiA07, false);
            BRg bRgA09 = C3U4.A09(c1062ATq.then(bRgA04), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A00(12.0f), bfm, C2VU.A05, 6);
            int iA0D = AnonymousClass001.A0D(bbiA07);
            AKQ akqA042 = BBI.A04(bbiA07);
            BRg bRgA013 = AxM.A01(bfm, bRgA09);
            AnonymousClass005.A0n(bfm, bbiA07, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            C90m c90m = C90m.A00;
            PairsImageRef pairsImageRef = connectionsActivity.photo;
            if (function0 != null) {
                bfm.AgE(-816392554);
                BRg bRgA042 = C0v5.A04(bRgA04, C3cG.A0A(0), null, function0, zA1a);
                boolean zA652 = bfm.A65(strA01);
                Object objAaT5 = bfm.AaT();
                if (zA652 || objAaT5 == C78N.A00) {
                    objAaT5 = new ConnectionsActivityItemsKt$ConnectionsActivityItem$1$2$1$1(strA01);
                    bfm.Ai0(objAaT5);
                }
                bRg2 = null;
                bRgA01 = ARD.A01(bRgA042, (G0U) objAaT5, false);
                BBI.A0R(bbiA07, false);
            } else {
                bRg2 = null;
                bfm.AgE(-816216164);
                BBI.A0R(bbiA07, false);
                bRgA01 = bRgA04;
            }
            PairsComponentsKt.m1664PairsPersonPhotovlEVYhg(pairsImageRef, 44.0f, bRgA01, 0L, bfm, PairsImageRef.$stable | 48, 8);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bRgA04, zA1a);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, 2.0f, 6);
            int iA0D2 = AnonymousClass001.A0D(bbiA07);
            AKQ akqA043 = BBI.A04(bbiA07);
            BRg bRgA014 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbiA07, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA014, g0vA0u);
            boolean zA653 = bfm.A65(g0v);
            Object objAaT6 = bfm.AaT();
            if (zA653 || objAaT6 == C78N.A00) {
                objAaT6 = new ConnectionsActivityItemsKt$ConnectionsActivityItem$1$2$2$1$1(g0v);
                bfm.Ai0(objAaT6);
            }
            Function0 function03 = (Function0) objAaT6;
            if (connectionsActivity.feedActivityId == null || zContains) {
                bfm.AgE(-1007324890);
                BBI.A0R(bbiA07, false);
                obj = bRg2;
            } else {
                boolean zA1Y = AnonymousClass001.A1Y(g0v, bfm, -1007496475) | ((iA05 & 57344) == 16384 || ((iA05 & 32768) != 0 && bfm.A67(connectionsViewModel))) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(connectionsActivity)));
                Object objAaT7 = bfm.AaT();
                if (zA1Y || objAaT7 == C78N.A00) {
                    objAaT7 = new ConnectionsActivityItemsKt$ConnectionsActivityItem$1$2$2$2$1(g0v, connectionsViewModel, connectionsActivity);
                    bfm.Ai0(objAaT7);
                }
                BBI.A0R(bbiA07, false);
                obj = (Function0) objAaT7;
            }
            ConnectionsActivityHeader(connectionsActivity, strA01, j, function0, function03, obj, bRg2, bfm, ConnectionsActivity.$stable | i5 | (iA05 & 896), 64);
            String strSummary = summary(connectionsActivity, bfm, ConnectionsActivity.$stable | i5);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strSummary, bRg2, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), bRg2, bRg2, bRg2, false, 0, 0, 0, bRg2, bRg2, bRg2, bfm, 0, 0, 16370);
            if (zIsOpenable) {
                boolean zA1Y2 = AnonymousClass001.A1Y(g0v, bfm, -1006901306) | ((iA05 & 57344) == 16384 || ((iA05 & 32768) != 0 && bfm.A67(connectionsViewModel))) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(connectionsActivity)));
                Object objAaT8 = bfm.AaT();
                if (zA1Y2 || objAaT8 == C78N.A00) {
                    objAaT8 = new ConnectionsActivityItemsKt$ConnectionsActivityItem$1$2$2$3$1(g0v, connectionsViewModel, connectionsActivity);
                    bfm.Ai0(objAaT8);
                }
                BBI.A0R(bbiA07, false);
                obj2 = (Function0) objAaT8;
            } else {
                bfm.AgE(-1006730682);
                BBI.A0R(bbiA07, false);
                obj2 = bRg2;
            }
            int i8 = iA05 >> 3;
            ConnectionsActivityDetail(connectionsActivity, set, connectionsViewModel, obj2, connectionsLogContext, i, C3U4.A04(bRgA04, 8.0f), bfm, ConnectionsActivity.$stable | 1572864 | i5 | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (ConnectionsViewModel.$stable << 6) | (i7 & 896) | (i6 << 12) | (i8 & 57344) | (i8 & 458752), 0);
            BBI.A0R(bbiA07, zA1a);
            BBI.A0R(bbiA07, zA1a);
            ?? r14 = bRg2;
            AuraDividerKt.AuraDivider(r14, r14, false, bfm, 0, 7);
            BBI.A0R(bbiA07, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128102(connectionsActivity, set, j, auraNavKey, connectionsViewModel, connectionsLogContext, i, bRg3, i2, i3);
        }
    }

    public static final void ConnectionsActivityMenu(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1813124357);
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207d7);
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
            boolean zA1F = AnonymousClass004.A1F(iA0T);
            Object objAaT2 = bfm.AaT();
            if (zA1F || objAaT2 == obj) {
                objAaT2 = new ConnectionsActivityItemsKt$ConnectionsActivityMenu$1$1$1(function0, mutableState);
                bfm.Ai0(objAaT2);
            }
            ConnectionsComponentsKt.m1650ConnectionsOverflowButtonxfPyhaw((Function0) objAaT2, null, false, 0.0f, 0L, bfm, 0, 30);
            boolean zA0A = MutableState.A0A(mutableState);
            boolean zA1C = AnonymousClass003.A1C(iA0T);
            Object objAaT3 = bfm.AaT();
            if (zA1C || objAaT3 == obj) {
                objAaT3 = new ConnectionsActivityItemsKt$ConnectionsActivityMenu$1$2$1(function02, mutableState);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new ConnectionsActivityItemsKt$ConnectionsActivityMenu$1$3$1(mutableState);
                bfm.Ai0(objAaT4);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u, (Function0) objAaT4, zA0A, null, 0L, null, false, new ConnectionsActivityItemsKt$ConnectionsActivityMenu$1$4(strA01), false, null, null, null, false, bfm, 384, 0, 16113);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128112(function0, function02, bRg2, i, i2);
        }
    }

    public static final void ConnectionsAttachmentCard(int i, String str, String str2, BRg bRg, String str3, BFM bfm, int i2, int i3) {
        String str4;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 1);
        C7384Etj.A0Y(str2, 2);
        bfm.AgG(596041710);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, str2);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0h(bfm, str3);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            str4 = i5 == 0 ? str3 : null;
            C1D3 c1d3A00 = C1D8.A00(12.0f);
            BRg bRgA03 = C11U.A03(AnonymousClass001.A0R(bRg2), c1d3A00);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA09 = C3U4.A09(C1DI.A02(C1b8.A01(bRgA03, auraTheme.getColors(bfm, 6).highlight), c1d3A00, 1.0f, auraTheme.getColors(bfm, 6).fillDivider), 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0V);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            int i6 = iA0D >> 6;
            ConnectionsItemIcon(i, null, str4, bfm, (iA0D & 14) | (i6 & 896), 2);
            BRg bRgAiP = c90m.AiP(BRg.A00, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0D >> 3) & 14) | 805306368, 6, 14834);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, (i6 & 14) | 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
            str4 = str3;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128122(i, str, str2, bRg2, str4, i2, i3);
        }
    }

    public static final void ConnectionsItemIcon(int i, BRg bRg, String str, BFM bfm, int i2, int i3) {
        String str2 = str;
        BRg bRg2 = bRg;
        bfm.AgG(1389394983);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            iA0D |= 384;
        } else if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                str2 = null;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h) | ((iA0D & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = WorkspaceUriResolver.INSTANCE.resolveDaemonApiUrl(str2, abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            String str3 = (String) objAaT;
            boolean zA652 = bfm.A65(str3);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT2;
            if (str3 != null && !MutableState.A0A(mutableState)) {
                bfm.AgE(866551791);
                BRg bRgA01 = C11U.A01(C10G.A07(bRg2, 40.0f), 8.0f);
                ARL arl = B18.A00;
                C1DG c1dg = new C1DG(40.0f);
                boolean zA653 = bfm.A65(mutableState);
                Object objAaT3 = bfm.AaT();
                if (zA653 || objAaT3 == C78N.A00) {
                    objAaT3 = new ConnectionsActivityItemsKt$ConnectionsItemIcon$1$1(mutableState);
                    bfm.Ai0(objAaT3);
                }
                AuraImageKt.m2573AuraImageXRP3Ue8(str3, bRgA01, arl, null, null, false, c1dg, 0L, false, false, false, null, null, (Function0) objAaT3, null, bfm, 1573248, 48, 22456);
            } else if (C60Q.A1W(GLYPH_ICONS, i)) {
                bfm.AgE(866861791);
                BRg bRgA012 = C11U.A01(C10G.A07(bRg2, 40.0f), 8.0f);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraIconKt.m2567AuraIconFHprtrg(C3U4.A09(C1b8.A01(bRgA012, auraTheme.getColors(bfm, 6).bubble), 10.0f), BOf.A00(bfm, i, iA0D & 14), AuraIconSize.X_SMALL, null, C3cH.A06(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 32);
            } else {
                bfm.AgE(867241324);
                C1SA.A00(bfm, null, C10G.A07(bRg2, 40.0f), null, BOf.A00(bfm, i, iA0D & 14), null, null, 0.0f, AVy.$stable | 48, 120);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128132(i, bRg2, str2, i2, i3);
        }
    }

    public static final void ConnectionsRequestButtons(int i, int i2, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i3, int i4) {
        BRg bRg2 = bRg;
        bfm.AgG(1910847487);
        int iA0D = (i3 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i3 : i3;
        if ((i3 & 48) == 0) {
            iA0D |= AnonymousClass004.A0E(bfm, i2);
        }
        if ((i3 & 384) == 0) {
            iA0D |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i3 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i3 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0X(bfm, function02);
        }
        int i5 = i4 & 32;
        int iA0i = 196608;
        if (i5 != 0) {
            iA0D |= iA0i;
        } else if ((196608 & i3) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0D |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0D), bfm, iA0D)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(10.0f), bfm, C2VU.A05, 6);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            String strA01 = AbstractC2271BQs.A01(bfm, i);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStylePrimaryAlt = auraButtonStyles.primaryAlt(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            boolean z2 = !z;
            BS0 bs0 = BRg.A00;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c90m.AiP(bs0, 1.0f, true), auraLabelButtonStylePrimaryAlt, auraButtonSize, null, false, false, z2, z, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, ((iA0D >> 6) & 14) | ((iA0D << 3) & 57344), 0, 134199749);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, i2), null, c90m.AiP(bs0, 1.0f, true), auraButtonStyles.secondaryOutlined(null, bfm, 48, 1), AuraButtonSize.SMALL, null, false, false, z2, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, iA0D & 57344, 0, 134200773);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C128142(i, i2, z, function0, function02, bRg2, i3, i4);
        }
    }

    public static final String fileExtension(ConnectionsSharedFile connectionsSharedFile) {
        return C6tn.A02(C7BY.A0N(connectionsSharedFile.name));
    }

    public static final int fileIconRes(ConnectionsSharedFile connectionsSharedFile, BFM bfm, int i) {
        return connectionsFileIconRes(connectionsSharedFile.name, bfm, 0);
    }

    public static final void logActivityClick(ConnectionsLogContext connectionsLogContext, ConnectionsActivity connectionsActivity, int i, HatchComponent hatchComponent, HatchSubsurface hatchSubsurface) {
        PairsAnalytics pairsAnalytics = PairsAnalytics.INSTANCE;
        pairsAnalytics.click$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(connectionsLogContext.screen, hatchComponent, hatchSubsurface, pairsAnalytics.activity$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(connectionsActivity, i));
    }

    public static final ContentType mediaTypeFromMime(String str) {
        String strA0u = AnonymousClass001.A0u(C7BY.A0S(str, str, '/'));
        int iHashCode = strA0u.hashCode();
        if (iHashCode != 93166550) {
            if (iHashCode != 100313435) {
                if (iHashCode == 112202875 && strA0u.equals("video")) {
                    return ContentType.Video.INSTANCE;
                }
            } else if (strA0u.equals("image")) {
                return ContentType.Image.INSTANCE;
            }
        } else if (strA0u.equals("audio")) {
            return ContentType.Audio.INSTANCE;
        }
        return ContentType.Unknown.INSTANCE;
    }

    public static final boolean openConnectionsFile(String str, String str2, String str3, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator) {
        Object next;
        String strA0R = str2;
        AnonymousClass005.A12(str, abstractC3358CGz, auraNavigator, 0);
        ContentType contentTypeFromFileName = str2 != null ? ContentTypeDetector.INSTANCE.fromFileName(strA0R) : null;
        ContentType contentTypeMediaTypeFromMime = str3 != null ? mediaTypeFromMime(str3) : null;
        ContentTypeDetector contentTypeDetector = ContentTypeDetector.INSTANCE;
        String strA0S = C7BY.A0S(str, str, '?');
        String strA0S2 = C7BY.A0S(strA0S, strA0S, '#');
        Iterator it = BFI.A0F(new ContentType[]{contentTypeFromFileName, contentTypeMediaTypeFromMime, contentTypeDetector.fromFileName(C7BY.A0R(strA0S2, strA0S2, '/'))}).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ContentType) next).isMedia()) {
                break;
            }
        }
        ContentType contentType = (ContentType) next;
        if (contentType == null) {
            return ContentViewerDataHolderKt.navigateToFileViewerFromUrl(str, strA0R, abstractC3358CGz, auraNavigator, null, true);
        }
        String strResolvePreviewPathFromUrl = HatchFileUIUtils.INSTANCE.resolvePreviewPathFromUrl(str);
        if (strResolvePreviewPathFromUrl == null) {
            return false;
        }
        if (strA0R == null) {
            strA0R = C7BY.A0R(strResolvePreviewPathFromUrl, strResolvePreviewPathFromUrl, '/');
        }
        ContentViewerDataHolderKt.navigateToContentViewer(auraNavigator, AGI.A0E(new ContentItem(strA0R, contentType, strResolvePreviewPathFromUrl, WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(strResolvePreviewPathFromUrl, abstractC3358CGz), null, null, null, null, null, false, null, null, null, null, null)), 0, true, true, null, true);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String summary(com.facebook.aura.pairs.ConnectionsActivity r5, X.BFM r6, int r7) {
        /*
            com.facebook.aura.pairs.ConnectionsActivityKind r0 = r5.kind
            int r0 = r0.ordinal()
            r4 = 2
            r3 = 0
            r2 = 1
            switch(r0) {
                case 0: goto Lc9;
                case 1: goto Lbf;
                case 2: goto Lb1;
                case 3: goto La7;
                case 4: goto L76;
                case 5: goto L4d;
                case 6: goto L2a;
                case 7: goto L1f;
                case 8: goto L14;
                default: goto Lc;
            }
        Lc:
            r0 = 2002375835(0x7759d49b, float:4.4181272E33)
            kotlin.NoWhenBranchMatchedException r0 = X.AnonymousClass005.A0k(r6, r0)
            throw r0
        L14:
            r0 = 2002427382(0x775a9df6, float:4.4340802E33)
            r6.AgE(r0)
            r1 = 2131888085(0x7f1207d5, float:1.9410795E38)
            goto Ld2
        L1f:
            r0 = 2002423934(0x775a907e, float:4.433013E33)
            r6.AgE(r0)
            r1 = 2131888082(0x7f1207d2, float:1.941079E38)
            goto Ld2
        L2a:
            r0 = 2002412407(0x775a6377, float:4.4294457E33)
            r6.AgE(r0)
            com.facebook.aura.pairs.ConnectionsSharedItem r0 = r5.item
            if (r0 == 0) goto L43
            com.facebook.aura.pairs.ConnectionsSharedItemKind r0 = r0.kind
            if (r0 == 0) goto L43
            int r0 = r0.ordinal()
            if (r0 == r3) goto L48
            r1 = 2131888083(0x7f1207d3, float:1.9410791E38)
            if (r0 == r2) goto Ld2
        L43:
            r1 = 2131888080(0x7f1207d0, float:1.9410785E38)
            goto Ld2
        L48:
            r1 = 2131888075(0x7f1207cb, float:1.9410775E38)
            goto Ld2
        L4d:
            r0 = 1944890904(0x73ecae18, float:3.7503452E31)
            r6.AgE(r0)
            com.facebook.aura.pairs.ConnectionsSharedSpace r0 = r5.space
            if (r0 == 0) goto L6c
            int r1 = r0.memberCount
            int r1 = r1 - r4
            if (r1 < r3) goto L6c
            if (r1 == 0) goto L6c
            r0 = 1945066519(0x73ef5c17, float:3.7928063E31)
            r6.AgE(r0)
            r0 = 2131755044(0x7f100024, float:1.9140956E38)
            java.lang.String r0 = X.AnonymousClass007.A0Y(r1, r6, r0)
            goto L95
        L6c:
            r0 = 1944983253(0x73ee16d5, float:3.7726738E31)
            r6.AgE(r0)
            r0 = 2131888089(0x7f1207d9, float:1.9410803E38)
            goto La2
        L76:
            r0 = 2002392103(0x775a1427, float:4.423162E33)
            r6.AgE(r0)
            com.facebook.aura.pairs.ConnectionsSharedFile r0 = r5.file
            if (r0 == 0) goto L99
            boolean r0 = r0.isAwaitingApproval
            if (r0 == 0) goto L99
            r0 = 1944653630(0x73e90f3e, float:3.6929758E31)
            r6.AgE(r0)
            r1 = 2131888078(0x7f1207ce, float:1.9410781E38)
            com.facebook.aura.pairs.ConnectionsSharedFile r0 = r5.file
            java.lang.String r0 = r0.name
            java.lang.String r0 = X.AnonymousClass001.A0t(r6, r0, r1)
        L95:
            X.AnonymousClass001.A1D(r6)
            goto Ld6
        L99:
            r0 = 1944758162(0x73eaa792, float:3.71825E31)
            r6.AgE(r0)
            r0 = 2131888077(0x7f1207cd, float:1.941078E38)
        La2:
            java.lang.String r0 = X.AbstractC2271BQs.A01(r6, r0)
            goto L95
        La7:
            r0 = 2002388313(0x775a0559, float:4.421989E33)
            r6.AgE(r0)
            r1 = 2131888072(0x7f1207c8, float:1.941077E38)
            goto Ld2
        Lb1:
            r0 = 2002383919(0x7759f42f, float:4.420629E33)
            r6.AgE(r0)
            r0 = 2131888073(0x7f1207c9, float:1.9410771E38)
            java.lang.String r0 = X.AnonymousClass006.A0v(r6, r0)
            goto Ld6
        Lbf:
            r0 = 2002380314(0x7759e61a, float:4.4195134E33)
            r6.AgE(r0)
            r1 = 2131888071(0x7f1207c7, float:1.9410767E38)
            goto Ld2
        Lc9:
            r0 = 2002376537(0x7759d759, float:4.4183445E33)
            r6.AgE(r0)
            r1 = 2131888088(0x7f1207d8, float:1.9410801E38)
        Ld2:
            java.lang.String r0 = X.AbstractC2271BQs.A01(r6, r1)
        Ld6:
            X.AnonymousClass001.A1D(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsActivityItemsKt.summary(com.facebook.aura.pairs.ConnectionsActivity, X.BFM, int):java.lang.String");
    }

    public static final String fileTypeLabel(ConnectionsSharedFile connectionsSharedFile) {
        String strA0Q;
        String strFileExtension = fileExtension(connectionsSharedFile);
        Locale locale = Locale.ROOT;
        String upperCase = strFileExtension.toUpperCase(locale);
        if (upperCase.length() != 0) {
            return upperCase;
        }
        String str = connectionsSharedFile.mimeType;
        return (str == null || (strA0Q = C7BY.A0Q(str, str, '/')) == null) ? "" : strA0Q.toUpperCase(locale);
    }

    public static final String label(ConnectionsSharedItemKind connectionsSharedItemKind, BFM bfm, int i) {
        int i2;
        int iOrdinal = connectionsSharedItemKind.ordinal();
        if (iOrdinal == 2) {
            i2 = R.string._name_removed__res_0x7f1207d1;
        } else if (iOrdinal == 0) {
            i2 = R.string._name_removed__res_0x7f1207cc;
        } else if (iOrdinal == 1) {
            i2 = R.string._name_removed__res_0x7f1207d4;
        } else if (iOrdinal == 3) {
            i2 = R.string._name_removed__res_0x7f1207da;
        } else {
            if (iOrdinal != 4) {
                throw C3cG.A0q();
            }
            i2 = R.string._name_removed__res_0x7f1207cf;
        }
        return AbstractC2271BQs.A01(bfm, i2);
    }

    public static final void open(AuraNavigator auraNavigator, AuraNavKey auraNavKey) {
        boolean zA1b = AnonymousClass004.A1b(auraNavigator, auraNavKey);
        if (!(auraNavKey instanceof AuraTabRootNavKey)) {
            auraNavigator.navigate(auraNavKey, zA1b);
        } else {
            auraNavigator.popToTabRoot((AuraTabRootNavKey) auraNavKey);
            auraNavigator.navigate(auraNavKey, LaunchFlag.BRING_TO_FRONT);
        }
    }
}
