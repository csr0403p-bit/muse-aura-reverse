package com.facebook.aura.spaces.share;

import X.AKO;
import X.AKQ;
import X.ARD;
import X.ARK;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC1798ArH;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
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
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C0fG;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C19U;
import X.C1AC;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1YD;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C8j3;
import X.C8j4;
import X.C9m9;
import X.F60;
import X.FXS;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.PublishSpaceSheetKey;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.spaces.repo.HatchSpacesDataSource;
import com.facebook.aura.spaces.share.SpaceShareLinkViewModel;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class SpaceShareLinkSheetKt {
    public static final long COPIED_CHECK_MS = 2000;
    public static final long RowLineHeight = C19U.A03(24);

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkConfirmUnpublish$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onUnpublish;
        public final /* synthetic */ boolean $unpublishing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$unpublishing = z;
            this.$onUnpublish = function0;
            this.$onCancel = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bc9);
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStyleDestructive = auraButtonStyles.destructive(null, bfm, 48, 1);
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA00 = AbstractC07539Wl.A00(c1062ATq, "hatch-space-share-link-confirm-unpublish");
                boolean z = this.$unpublishing;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onUnpublish, bfm.A66(z));
                boolean z2 = this.$unpublishing;
                Function0<Unit> function0 = this.$onUnpublish;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new SpaceShareLinkSheetKt$SpaceShareLinkConfirmUnpublish$1$1$1(z2, function0);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA00, auraLabelButtonStyleDestructive, null, null, false, false, false, z, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, 0, 0, 134200293);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bb6), null, c1062ATq, auraButtonStyles.secondary(null, bfm, 48, 1), null, null, false, false, !this.$unpublishing, false, false, null, null, this.$onCancel, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, 0, 0, 134200805);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkConfirmUnpublish$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onUnpublish;
        public final /* synthetic */ String $title;
        public final /* synthetic */ boolean $unpublishing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$unpublishing = z;
            this.$onUnpublish = function0;
            this.$onCancel = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkConfirmUnpublish(this.$title, this.$unpublishing, this.$onUnpublish, this.$onCancel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkCreate$2, reason: invalid class name and case insensitive filesystem */
    public final class C139452 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ PublishSpaceSheetKey $navKey;
        public final /* synthetic */ Function0<Unit> $onCreate;
        public final /* synthetic */ SpaceShareLinkState $state;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139452(PublishSpaceSheetKey publishSpaceSheetKey, String str, SpaceShareLinkState spaceShareLinkState, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$navKey = publishSpaceSheetKey;
            this.$title = str;
            this.$state = spaceShareLinkState;
            this.$onCreate = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkCreate(this.$navKey, this.$title, this.$state, this.$onCreate, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C139462 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139462(String str, String str2, String str3, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$imageUrl = str2;
            this.$subtitle = str3;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkHeader(this.$title, this.$imageUrl, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkLoadFailed$2, reason: invalid class name and case insensitive filesystem */
    public final class C139472 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139472(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkLoadFailed(this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkLoading$2, reason: invalid class name and case insensitive filesystem */
    public final class C139482 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139482(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkMessage$2, reason: invalid class name and case insensitive filesystem */
    public final class C139492 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $buttons;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C139492(String str, String str2, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$title = str;
            this.$body = str2;
            this.$modifier = bRg;
            this.$buttons = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkMessage(this.$title, this.$body, this.$modifier, this.$buttons, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkPrimaryButton$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C139502 extends AbstractC7559F3s implements G0V<BFM, Integer, C1822Arm> {
        public static final C139502 INSTANCE = new C139502();

        public C139502() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ C1822Arm invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final C1822Arm invoke(BFM bfm, int i) {
            C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, 1849848341).bodyMedium;
            AnonymousClass002.A19(bfm);
            return c1822Arm;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkPrimaryButton$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$enabled = z;
            this.$loading = z2;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkPrimaryButton(this.$text, this.$enabled, this.$loading, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkPublishError$2, reason: invalid class name and case insensitive filesystem */
    public final class C139512 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $message;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139512(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$message = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkPublishError(this.$message, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkPublished$2, reason: invalid class name and case insensitive filesystem */
    public final class C139522 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ PublishSpaceSheetKey $navKey;
        public final /* synthetic */ SpaceShareLinkState $state;
        public final /* synthetic */ String $title;
        public final /* synthetic */ SpaceShareLinkViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139522(PublishSpaceSheetKey publishSpaceSheetKey, String str, SpaceShareLinkState spaceShareLinkState, SpaceShareLinkViewModel spaceShareLinkViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$navKey = publishSpaceSheetKey;
            this.$title = str;
            this.$state = spaceShareLinkState;
            this.$viewModel = spaceShareLinkViewModel;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkPublished(this.$navKey, this.$title, this.$state, this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkRowValue$1, reason: invalid class name and case insensitive filesystem */
    public final class C139531 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139531(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkRowValue(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkShareButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C139542 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ PublishSpaceSheetKey $navKey;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139542(PublishSpaceSheetKey publishSpaceSheetKey, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$navKey = publishSpaceSheetKey;
            this.$url = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkShareButton(this.$navKey, this.$url, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ PublishSpaceSheetKey $navKey;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ C1BO<SpaceShareLinkState> $state$delegate;
        public final /* synthetic */ String $title;
        public final /* synthetic */ SpaceShareLinkViewModel $viewModel;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            BRg bRgA0B = C3U4.A0B(C10G.A02, AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmall);
            C3TH c3th = C2VU.A00;
            SpaceShareLinkViewModel spaceShareLinkViewModel = this.$viewModel;
            PublishSpaceSheetKey publishSpaceSheetKey = this.$navKey;
            String str = this.$title;
            AuraNavigator auraNavigator = this.$navigator;
            C1BO<SpaceShareLinkState> c1bo = this.$state$delegate;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            long j = SpaceShareLinkSheetKt.COPIED_CHECK_MS;
            int iOrdinal = c1bo.getValue().phase.ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(146370302);
                SpaceShareLinkSheetKt.SpaceShareLinkLoading(null, bfm, 0, 1);
            } else if (iOrdinal == 1) {
                boolean zA1Z = AnonymousClass001.A1Z(spaceShareLinkViewModel, bfm, 146372474);
                Object objAaT = bfm.AaT();
                if (zA1Z || objAaT == C78N.A00) {
                    objAaT = new SpaceShareLinkSheetKt$SpaceShareLinkSheet$3$1$1$1(spaceShareLinkViewModel);
                    BBI.A0O(bbi, objAaT);
                }
                SpaceShareLinkSheetKt.SpaceShareLinkLoadFailed((Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 2);
            } else if (iOrdinal == 2) {
                bfm.AgE(146375873);
                if (c1bo.getValue().isPublished) {
                    bfm.AgE(242703493);
                    SpaceShareLinkSheetKt.SpaceShareLinkPublished(publishSpaceSheetKey, str, c1bo.getValue(), spaceShareLinkViewModel, null, bfm, (SpaceShareLinkState.$stable << 6) | (SpaceShareLinkViewModel.$stable << 9), 16);
                } else {
                    bfm.AgE(242795284);
                    SpaceShareLinkState value = c1bo.getValue();
                    boolean zA67 = bfm.A67(spaceShareLinkViewModel);
                    Object objAaT2 = bfm.AaT();
                    if (zA67 || objAaT2 == C78N.A00) {
                        objAaT2 = new SpaceShareLinkSheetKt$SpaceShareLinkSheet$3$1$2$1(spaceShareLinkViewModel);
                        BBI.A0O(bbi, objAaT2);
                    }
                    SpaceShareLinkSheetKt.SpaceShareLinkCreate(publishSpaceSheetKey, str, value, (Function0) ((InterfaceC7353EnQ) objAaT2), null, bfm, SpaceShareLinkState.$stable << 6, 16);
                }
                BBI.A0R(bbi, false);
            } else if (iOrdinal == 3) {
                bfm.AgE(146384849);
                boolean z = c1bo.getValue().unpublishing;
                boolean zA672 = bfm.A67(spaceShareLinkViewModel);
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == C78N.A00) {
                    objAaT3 = new SpaceShareLinkSheetKt$SpaceShareLinkSheet$3$1$3$1(spaceShareLinkViewModel);
                    BBI.A0O(bbi, objAaT3);
                }
                Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT3);
                boolean zA673 = bfm.A67(spaceShareLinkViewModel);
                Object objAaT4 = bfm.AaT();
                if (zA673 || objAaT4 == C78N.A00) {
                    objAaT4 = new SpaceShareLinkSheetKt$SpaceShareLinkSheet$3$1$4$1(spaceShareLinkViewModel);
                    BBI.A0O(bbi, objAaT4);
                }
                SpaceShareLinkSheetKt.SpaceShareLinkConfirmUnpublish(str, z, function02, (Function0) ((InterfaceC7353EnQ) objAaT4), null, bfm, 0, 16);
            } else {
                if (iOrdinal != 4) {
                    throw AnonymousClass003.A0k(bfm, bbi, 146369204);
                }
                boolean zA1Z2 = AnonymousClass001.A1Z(auraNavigator, bfm, 146393562);
                Object objAaT5 = bfm.AaT();
                if (zA1Z2 || objAaT5 == C78N.A00) {
                    objAaT5 = new SpaceShareLinkSheetKt$SpaceShareLinkSheet$3$1$5$1(auraNavigator);
                    BBI.A0O(bbi, objAaT5);
                }
                SpaceShareLinkSheetKt.SpaceShareLinkUnpublished((Function0) objAaT5, null, bfm, 0, 2);
            }
            AnonymousClass003.A0q(bbi);
        }

        /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkSheet$3$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SpaceShareLinkPhase.values().length];
                try {
                    AnonymousClass002.A13(SpaceShareLinkPhase.LOADING, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(SpaceShareLinkPhase.LOAD_FAILED, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(SpaceShareLinkPhase.READY, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(SpaceShareLinkPhase.CONFIRM_UNPUBLISH, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass002.A17(SpaceShareLinkPhase.UNPUBLISHED, iArr);
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SpaceShareLinkViewModel spaceShareLinkViewModel, PublishSpaceSheetKey publishSpaceSheetKey, String str, AuraNavigator auraNavigator, C1BO<SpaceShareLinkState> c1bo) {
            super(3);
            this.$viewModel = spaceShareLinkViewModel;
            this.$navKey = publishSpaceSheetKey;
            this.$title = str;
            this.$navigator = auraNavigator;
            this.$state$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkSheet$4, reason: invalid class name and case insensitive filesystem */
    public final class C139554 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ PublishSpaceSheetKey $navKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139554(PublishSpaceSheetKey publishSpaceSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$navKey = publishSpaceSheetKey;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkSheet(this.$navKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkSyncRow$1, reason: invalid class name and case insensitive filesystem */
    public final class C139561 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ SpaceShareLinkState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139561(SpaceShareLinkState spaceShareLinkState) {
            super(2);
            this.$state = spaceShareLinkState;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$state.publishing) {
                bfm.AgE(-1988247573);
                SpaceShareLinkSheetKt.SpaceShareLinkRowValue(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120feb), null, bfm, 0, 2);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120feb);
                BRg bRgA07 = C10G.A07(BRg.A00, 20.0f);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new SpaceShareLinkSheetKt$SpaceShareLinkSyncRow$1$1$1(strA01);
                    BBI.A0T(bfm, objAaT);
                }
                AnonymousClass007.A0v(bfm, bRgA07, (G0U) objAaT);
            } else {
                bfm.AgE(-1987873620);
                if (this.$state.canPublish) {
                    bfm.AgE(1598444504);
                    Long l = this.$state.lastSyncedAtMs;
                    if (l == null) {
                        bfm.AgE(-1987827927);
                    } else {
                        bfm.AgE(-1987827926);
                        SpaceShareLinkSheetKt.SpaceShareLinkRowValue(SpaceShareLinkSheetKt.syncedAgo(l.longValue(), bfm, 0), null, bfm, 0, 2);
                    }
                    AnonymousClass001.A1D(bfm);
                } else {
                    bfm.AgE(-1987784681);
                }
                AnonymousClass001.A1D(bfm);
                AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0), 20.0f, null, C3cH.A0W(bfm).tertiaryText, null, bfm, (AVy.$stable << 3) | 384, 41);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkSyncRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C139572 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSync;
        public final /* synthetic */ SpaceShareLinkState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139572(SpaceShareLinkState spaceShareLinkState, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$state = spaceShareLinkState;
            this.$onSync = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkSyncRow(this.$state, this.$onSync, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkUnpublishRow$1, reason: invalid class name and case insensitive filesystem */
    public final class C139581 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139581(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkUnpublishRow(this.$enabled, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkUnpublished$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C139591 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onDone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139591(Function0<Unit> function0) {
            super(2);
            this.$onDone = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bbb), null, C10G.A02, AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1), null, null, false, false, false, false, false, null, null, this.$onDone, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, 0, 0, 134201317);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkUnpublished$2, reason: invalid class name and case insensitive filesystem */
    public final class C139602 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139602(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onDone = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkUnpublished(this.$onDone, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkUrlPill$3, reason: invalid class name and case insensitive filesystem */
    public final class C139613 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139613(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceShareLinkSheetKt.SpaceShareLinkUrlPill(this.$url, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SpaceShareLinkConfirmUnpublish(String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1125846421);
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
            iA0d |= AnonymousClass004.A0h(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA04 = FXS.A03().A04(str);
            C7384Etj.A0U(strA04);
            SpaceShareLinkMessage(AnonymousClass001.A0t(bfm, strA04, R.string._name_removed__res_0x7f120bcb), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bca), bRg2, B1V.A00(bfm, new AnonymousClass1(z, function0, function02), -2121851323), bfm, ((iA0d >> 6) & 896) | 3072, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, z, function0, function02, bRg2, i, i2);
        }
    }

    public static final void SpaceShareLinkUnpublished(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1071187901);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            SpaceShareLinkMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bc8), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bcc), bRg2, B1V.A00(bfm, new C139591(function0), -1709470441), bfm, ((iA0T << 3) & 896) | 3072, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139602(function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SpaceShareLinkCreate(com.facebook.aura.navigation.key.PublishSpaceSheetKey r38, java.lang.String r39, com.facebook.aura.spaces.share.SpaceShareLinkState r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, X.BRg r42, X.BFM r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt.SpaceShareLinkCreate(com.facebook.aura.navigation.key.PublishSpaceSheetKey, java.lang.String, com.facebook.aura.spaces.share.SpaceShareLinkState, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: SpaceShareLinkFootnote-3IgeMak, reason: not valid java name */
    public static final void m2186SpaceShareLinkFootnote3IgeMak(String str, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1076107758);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1822Arm c1822Arm = C8j4.A0l(bfm).footnoteRegular;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SpaceShareLinkSheetKt$SpaceShareLinkFootnote$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bRgA0R, (G0U) objAaT, false), j, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, (iA0d & 14) | ((iA0d << 3) & 896), 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SpaceShareLinkSheetKt$SpaceShareLinkFootnote$2(str, j, bRg2, i, i2);
        }
    }

    public static final void SpaceShareLinkHeader(String str, String str2, String str3, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1884401686);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
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
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            C3TH c3th = C2VU.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            if (str2 == null || C7BY.A0j(str2)) {
                bfm.AgE(-1508473790);
            } else {
                bfm.AgE(-1508664254);
                AuraImageKt.m2573AuraImageXRP3Ue8(str2, C11U.A03(C10G.A07(BRg.A00, 64.0f), AuraTheme.INSTANCE.getShapes(bfm, 6).media), B18.A00, null, null, false, C8j3.A0k(64.0f), 0L, false, false, false, null, null, null, null, bfm, ((iA0d >> 3) & 14) | 1573248, 0, 32696);
            }
            BBI.A0R(bbi, false);
            float f = AuraDimensKt.SpacingMicro;
            BRg bRgA0C = C3U4.A0C(c1062ATq, 0.0f, f, 0.0f, AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, f, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).title3Emphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16646141, 0L, C60Q.A04(), 0L, C19U.A03(25));
            long jA06 = C3cH.A06(bfm, auraTheme);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SpaceShareLinkSheetKt$SpaceShareLinkHeader$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(c1062ATq, objAaT, false), jA06, c1822ArmA00, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16304);
            AuraTextKt.m2639AuraTextUY9GdpU(str3, c1062ATq, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, ((iA0d >> 6) & 14) | 48, 0, 16304);
            BBI.A0R(bbi, true);
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139462(str, str2, str3, bRg2, i, i2);
        }
    }

    public static final void SpaceShareLinkLoadFailed(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-101319091);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA06 = C3U4.A06(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fe1);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SpaceShareLinkSheetKt$SpaceShareLinkLoadFailed$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT, false), jA06, c1822ArmA0C, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bc2), null, null, AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1), null, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, (iA0T << 12) & 57344, 0, 134201325);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139472(function0, bRg2, i, i2);
        }
    }

    public static final void SpaceShareLinkMessage(String str, String str2, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1876663062);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            float f = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgThen, 0.0f, f);
            C9m9 c9m9A00 = AcQ.A00(f);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).title3Emphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16646141, 0L, C60Q.A04(), 0L, C19U.A03(28));
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SpaceShareLinkSheetKt$SpaceShareLinkMessage$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bs0, objAaT, false), jA06, c1822ArmA00, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16370);
            BRg bRgA0C = C3U4.A0C(c1062ATq, 0.0f, f, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, AuraDimensKt.SpacingXsmall, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AnonymousClass003.A13(bfm, g0v, iA0d >> 9);
            AnonymousClass002.A0y(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139492(str, str2, bRg2, g0v, i, i2);
        }
    }

    public static final void SpaceShareLinkPrimaryButton(String str, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-628307113);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
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
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
            BRg bRgA0U = AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 46.0f);
            boolean zA1C = AnonymousClass003.A1C(iA0d) | AnonymousClass003.A1D(iA0d) | ((iA0d & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new SpaceShareLinkSheetKt$SpaceShareLinkPrimaryButton$1$1(z, z2, function0);
                BBI.A0T(bfm, objAaT);
            }
            Function0 function02 = (Function0) objAaT;
            C139502 c139502 = C139502.INSTANCE;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = SpaceShareLinkSheetKt$SpaceShareLinkPrimaryButton$3$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, bRgA0U, auraLabelButtonStylePrimary, null, null, false, false, z, z2, false, null, null, function02, null, null, null, null, c139502, null, (Function0) objAaT2, null, false, 0, false, 0, bfm, AnonymousClass001.A06(iA0d << 24, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), (iA0d >> 6) & 14, 48, 131578341);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, z, z2, function0, bRg2, i, i2);
        }
    }

    public static final void SpaceShareLinkPublishError(String str, BRg bRg, BFM bfm, int i, int i2) {
        String strA0e;
        BRg bRg2 = bRg;
        bfm.AgG(-1774044382);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (str == null) {
                bfm.AgE(245369244);
                strA0e = AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f120b19);
            } else {
                AnonymousClass003.A0l(bfm, 245368903);
                strA0e = str;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            long j = auraTheme.getColors(bfm, 6).destructiveText;
            BRg bRgA09 = C3U4.A09(C1b8.A01(C11U.A01(AnonymousClass001.A0R(bRg2), 12.0f), auraTheme.getColors(bfm, 6).secondaryButtonBackground), AuraDimensKt.SpacingSmall);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SpaceShareLinkSheetKt$SpaceShareLinkPublishError$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0e, AnonymousClass001.A0Y(bRgA09, objAaT, false), j, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139512(str, bRg2, i, i2);
        }
    }

    public static final void SpaceShareLinkPublished(PublishSpaceSheetKey publishSpaceSheetKey, String str, SpaceShareLinkState spaceShareLinkState, SpaceShareLinkViewModel spaceShareLinkViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c139522;
        BRg bRg2 = bRg;
        bfm.AgG(131301023);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, publishSpaceSheetKey) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass003.A05(AnonymousClass004.A1Z(spaceShareLinkState, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass002.A00(AnonymousClass004.A1a(spaceShareLinkViewModel, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String str2 = spaceShareLinkState.url;
            if (str2 == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c139522 = new SpaceShareLinkSheetKt$SpaceShareLinkPublished$url$1(publishSpaceSheetKey, str, spaceShareLinkState, spaceShareLinkViewModel, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c139522);
                }
                return;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            SpaceShareLinkHeader(str, publishSpaceSheetKey.previewUri, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120610), null, bfm, (iA0T >> 3) & 14, 8);
            BS0 bs0 = BRg.A00;
            BRg bRgA0B = C3U4.A0B(c1062ATq, 0.0f, AuraDimensKt.SpacingMedium);
            float f = AuraDimensKt.SpacingMicro;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, 2.0f + f, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (spaceShareLinkState.currentBuildPublished || spaceShareLinkState.publishing) {
                bfm.AgE(-18916401);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-19148963);
                m2186SpaceShareLinkFootnote3IgeMak(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fe0), C3cH.A0W(bfm).primaryText, C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, f), bfm, 0, 0);
                BBI.A0R(bbi, false);
            }
            if (spaceShareLinkState.publishFailed) {
                bfm.AgE(-18881402);
                SpaceShareLinkPublishError(spaceShareLinkState.publishError, C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, f), bfm, 0, 0);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-18780497);
                BBI.A0R(bbi, false);
            }
            SpaceShareLinkUrlPill(str2, null, bfm, 0, 2);
            SpaceShareLinkShareButton(publishSpaceSheetKey, str2, null, bfm, iA0T & 14, 4);
            BBI.A0R(bbi, true);
            boolean z2 = false;
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            int i4 = iA0T & 7168;
            if (i4 == 2048 || ((iA0T & 4096) != 0 && bfm.A67(spaceShareLinkViewModel))) {
                z2 = true;
            }
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new SpaceShareLinkSheetKt$SpaceShareLinkPublished$1$2$1(spaceShareLinkViewModel);
                BBI.A0O(bbi, objAaT);
            }
            SpaceShareLinkSyncRow(spaceShareLinkState, (Function0) ((InterfaceC7353EnQ) objAaT), C3U4.A0C(bs0, 0.0f, AuraDimensKt.SpacingXsmall, 0.0f, 0.0f), bfm, SpaceShareLinkState.$stable | ((iA0T >> 6) & 14), 0);
            boolean z3 = !spaceShareLinkState.publishing;
            if (i4 != 2048 && ((iA0T & 4096) == 0 || !bfm.A67(spaceShareLinkViewModel))) {
                z = false;
            }
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == C78N.A00) {
                objAaT2 = new SpaceShareLinkSheetKt$SpaceShareLinkPublished$1$3$1(spaceShareLinkViewModel);
                BBI.A0O(bbi, objAaT2);
            }
            SpaceShareLinkUnpublishRow(z3, (Function0) ((InterfaceC7353EnQ) objAaT2), null, bfm, 0, 4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c139522 = new C139522(publishSpaceSheetKey, str, spaceShareLinkState, spaceShareLinkViewModel, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c139522);
        }
    }

    /* renamed from: SpaceShareLinkRow-TgFrcIs, reason: not valid java name */
    public static final void m2187SpaceShareLinkRowTgFrcIs(int i, String str, long j, boolean z, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        bfm.AgG(107707172);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0X(bfm, function0);
        }
        int i4 = i3 & 32;
        int iA0i = 196608;
        if (i4 != 0) {
            iA0D |= iA0i;
        } else if ((196608 & i2) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0D |= iA0i;
        }
        int i5 = i3 & 64;
        int iA0Z = 1572864;
        if (i5 != 0) {
            iA0D |= iA0Z;
        } else if ((1572864 & i2) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0v2);
            iA0D |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                g0v2 = ComposableSingletons$SpaceShareLinkSheetKt.lambda$1078518798;
            }
            BRg bRgA06 = C3U4.A06(C0v5.A05(C11U.A01(AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 56.0f), 24.0f), null, function0, z), AuraDimensKt.SpacingSmall);
            C1AC c1ac = C2VU.A04;
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A00(10.0f), bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0b);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(bs0, 32.0f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA07);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v3);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, i, iA0D & 14), 24.0f, null, j, null, bfm, AnonymousClass001.A0B(iA0D << 6, (AVy.$stable << 3) | 384), 41);
            BBI.A0R(bbi, true);
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARK.A00(bs0), j, C1822Arm.A00(null, C8j4.A0l(bfm).bodyMedium, null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, RowLineHeight), null, null, null, false, 0, 0, 0, null, null, null, bfm, ((iA0D >> 3) & 14) | (iA0D & 896), 0, 16368);
            InterfaceC1380AiA interfaceC1380AiAA0b2 = C8j4.A0b(AcQ.A00(AuraDimensKt.SpacingXsmall), bfm, c1ac);
            int iA0D3 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0b2, g0vA0v);
            BPg.A02(bfm, akqA043, g0v3);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AnonymousClass004.A1C(bbi, bfm, g0v2, iA0D >> 18, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SpaceShareLinkSheetKt$SpaceShareLinkRow$2(i, str, j, z, function0, bRg2, g0v2, i2, i3);
        }
    }

    public static final void SpaceShareLinkRowValue(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1185341984);
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
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, auraTheme.getColors(bfm, 6).tertiaryText, C1822Arm.A00(null, C3cH.A0C(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, RowLineHeight), null, null, C3cH.A0F(6), false, 0, 0, 0, null, null, null, bfm, iA0d & 126, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139531(str, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SpaceShareLinkShareButton(com.facebook.aura.navigation.key.PublishSpaceSheetKey r17, java.lang.String r18, X.BRg r19, X.BFM r20, int r21, int r22) {
        /*
            r2 = r19
            r0 = 518392627(0x1ee60b33, float:2.4356829E-20)
            r15 = r20
            r15.AgG(r0)
            r3 = r21
            r0 = r21 & 6
            r5 = r17
            if (r0 != 0) goto Ld4
            int r7 = X.AnonymousClass004.A0T(r15, r5)
            r7 = r7 | r21
        L18:
            r0 = r21 & 48
            r4 = r18
            if (r0 != 0) goto L23
            int r0 = X.AnonymousClass004.A0e(r15, r4)
            r7 = r7 | r0
        L23:
            r6 = r22 & 4
            if (r6 == 0) goto Lc9
            r7 = r7 | 384(0x180, float:5.38E-43)
        L29:
            r1 = r7 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            r11 = 1
            r12 = 0
            boolean r0 = X.AnonymousClass002.A1P(r1, r0)
            boolean r0 = X.AnonymousClass001.A1b(r0, r15, r7)
            if (r0 == 0) goto Lc5
            if (r6 == 0) goto L3d
            X.BS0 r2 = X.BRg.A00
        L3d:
            X.AKH<com.facebook.aura.navigation.AuraNavigator> r0 = com.facebook.aura.navigation.AuraNavigatorKt.LocalNavigator
            r8 = r15
            X.BBI r8 = (X.BBI) r8
            com.facebook.aura.navigation.AuraNavigator r6 = X.AKO.A05(r0, r8)
            android.content.Context r1 = X.AKO.A01(r8)
            java.lang.String r0 = r5.slug
            com.facebook.aura.library.repo.UnifiedArtifact r0 = com.facebook.aura.spaces.menu.SpaceContextMenuKt.rememberSpaceCatalogEntry(r0, r15, r12)
            if (r0 == 0) goto L57
            boolean r0 = r0.canDownloadHtml
            r9 = 1
            if (r0 == r11) goto L58
        L57:
            r9 = 0
        L58:
            java.lang.String r0 = r5.slug
            com.facebook.aura.library.repo.ArtifactItem r0 = com.facebook.aura.spaces.menu.SpaceContextMenuKt.rememberSpaceNavItem(r0, r15, r12)
            if (r0 == 0) goto Lc3
            com.facebook.aura.model.SpaceConstructionStatus r0 = r0.constructionStatus
        L62:
            boolean r0 = com.facebook.aura.spaces.menu.SpaceContextMenuKt.shouldShowDownload(r9, r0)
            r9 = 2131890148(0x7f120fe4, float:1.941498E38)
            java.lang.String r10 = X.AbstractC2271BQs.A01(r15, r9)
            java.lang.String r9 = "hatch-space-share-link-share"
            X.BRg r14 = X.AbstractC07539Wl.A00(r2, r9)
            boolean r9 = X.AnonymousClass003.A1M(r15, r6, r5)
            boolean r7 = X.AnonymousClass001.A1N(r7)
            r9 = r9 | r7
            boolean r7 = r15.A66(r0)
            boolean r7 = X.AnonymousClass002.A1V(r15, r1, r9, r7)
            java.lang.Object r13 = r15.AaT()
            if (r7 != 0) goto L8e
            java.lang.Object r7 = X.C78N.A00
            if (r13 != r7) goto La2
        L8e:
            com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkShareButton$1$1 r13 = new com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkShareButton$1$1
            r16 = r13
            r21 = r1
            r20 = r0
            r19 = r4
            r18 = r5
            r17 = r6
            r16.<init>(r17, r18, r19, r20, r21)
            X.BBI.A0O(r8, r13)
        La2:
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            r16 = 432(0x1b0, float:6.05E-43)
            r17 = r12
            SpaceShareLinkPrimaryButton(r10, r11, r12, r13, r14, r15, r16, r17)
        Lab:
            X.BBb r1 = r15.AAc()
            if (r1 == 0) goto Lc2
            com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkShareButton$2 r0 = new com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkShareButton$2
            r18 = r5
            r19 = r4
            r20 = r2
            r21 = r3
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22)
            r1.A06 = r0
        Lc2:
            return
        Lc3:
            r0 = 0
            goto L62
        Lc5:
            r15.Afo()
            goto Lab
        Lc9:
            r0 = r3 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L29
            int r0 = X.AnonymousClass004.A0f(r15, r2)
            r7 = r7 | r0
            goto L29
        Ld4:
            r7 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt.SpaceShareLinkShareButton(com.facebook.aura.navigation.key.PublishSpaceSheetKey, java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    public static final void SpaceShareLinkSheet(PublishSpaceSheetKey publishSpaceSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(publishSpaceSheetKey, 0);
        bfm.AgG(-1284770272);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, publishSpaceSheetKey) | i : i;
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
            BBI bbi = (BBI) bfm;
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            SpaceShareLinkViewModel.Factory factory = new SpaceShareLinkViewModel.Factory(abstractC3358CGzA06, publishSpaceSheetKey.slug);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            SpaceShareLinkViewModel spaceShareLinkViewModel = (SpaceShareLinkViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(SpaceShareLinkViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, spaceShareLinkViewModel.state);
            boolean zA1L = AnonymousClass003.A1L(bfm, abstractC3358CGzA06, publishSpaceSheetKey.slug);
            Object objAaT = bfm.AaT();
            if (zA1L || objAaT == C78N.A00) {
                objAaT = HatchSpacesDataSource.Companion.getInstance(abstractC3358CGzA06).spaceUuidForSlug(publishSpaceSheetKey.slug);
                bfm.Ai0(objAaT);
            }
            String str = publishSpaceSheetKey.title;
            if (str == null) {
                str = publishSpaceSheetKey.slug;
            }
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            boolean zA67 = bfm.A67(auraNavigatorA05);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new SpaceShareLinkSheetKt$SpaceShareLinkSheet$1$1(auraNavigatorA05);
                BBI.A0O(bbi, objAaT2);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, HatchImpressionModifierKt.hatchImpression(AbstractC07539Wl.A00(bRg2, "hatch-space-share-link-sheet"), HatchOrigin.SPACES, HatchSurface.SPACES, HatchSubsurface.ARTIFACT_SHARE_SHEET, HatchScreen.SPACES_HOME, HatchComponent.ARTIFACT_SHARE_SHEET, null, objAaT != null ? AnonymousClass007.A0c(HatchMetadataKey.SPACE_ID, objAaT) : null, null, 500L, 0.0f, null, null, null), null, null, null, null, (Function0) objAaT2, false, false, false, null, B1V.A00(bfm, new AnonymousClass3(spaceShareLinkViewModel, publishSpaceSheetKey, str, auraNavigatorA05, c1boA02), -1431512099), bfm, 6, 48, 1980);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139554(publishSpaceSheetKey, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[PHI: r8
  0x0092: PHI (r8v2 boolean) = (r8v0 boolean), (r8v3 boolean) binds: [B:20:0x004a, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SpaceShareLinkSyncRow(com.facebook.aura.spaces.share.SpaceShareLinkState r15, kotlin.jvm.functions.Function0<kotlin.Unit> r16, X.BRg r17, X.BFM r18, int r19, int r20) {
        /*
            r1 = r17
            r0 = -820732543(0xffffffffcf149d81, float:-2.49335014E9)
            r12 = r18
            r12.AgG(r0)
            r0 = r19
            r2 = r19 & 6
            if (r2 != 0) goto Laa
            boolean r2 = X.AnonymousClass004.A1X(r15, r12, r0)
            int r3 = X.AnonymousClass002.A05(r2)
            r3 = r3 | r19
        L1a:
            r2 = r19 & 48
            r9 = r16
            if (r2 != 0) goto L25
            int r2 = X.AnonymousClass004.A0U(r12, r9)
            r3 = r3 | r2
        L25:
            r19 = r20
            r5 = r20 & 4
            if (r5 == 0) goto La0
            r3 = r3 | 384(0x180, float:5.38E-43)
        L2d:
            r4 = r3 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            r14 = 0
            boolean r2 = X.AnonymousClass002.A1P(r4, r2)
            boolean r2 = X.AnonymousClass001.A1b(r2, r12, r3)
            if (r2 == 0) goto L9c
            if (r5 == 0) goto L40
            X.BS0 r1 = X.BRg.A00
        L40:
            boolean r4 = r15.canPublish
            if (r4 == 0) goto L49
            boolean r2 = r15.publishing
            r8 = 1
            if (r2 == 0) goto L92
        L49:
            r8 = 0
            if (r4 != 0) goto L92
            r2 = 1550017485(0x5c6363cd, float:2.56018207E17)
            com.facebook.aura.vds.compose.theme.AuraColors r2 = X.C3cI.A0K(r12, r2)
            long r6 = r2.tertiaryText
        L55:
            X.AnonymousClass001.A1D(r12)
            r2 = 2131890150(0x7f120fe6, float:1.9414984E38)
            java.lang.String r5 = X.AbstractC2271BQs.A01(r12, r2)
            java.lang.String r2 = "hatch-space-share-link-sync"
            X.BRg r10 = X.AbstractC07539Wl.A00(r1, r2)
            com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkSyncRow$1 r4 = new com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkSyncRow$1
            r4.<init>(r15)
            r2 = -1531295893(0xffffffffa4ba476b, float:-8.078563E-17)
            X.B1U r11 = X.B1V.A00(r12, r4, r2)
            int r13 = r3 << 9
            r2 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r2
            r2 = 1572864(0x180000, float:2.204052E-39)
            r13 = r13 | r2
            r4 = 2131230869(0x7f080095, float:1.8077803E38)
            m2187SpaceShareLinkRowTgFrcIs(r4, r5, r6, r8, r9, r10, r11, r12, r13, r14)
        L80:
            X.BBb r2 = r12.AAc()
            if (r2 == 0) goto L91
            com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkSyncRow$2 r14 = new com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkSyncRow$2
            r18 = r0
            r17 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            r2.A06 = r14
        L91:
            return
        L92:
            r2 = 1550016396(0x5c635f8c, float:2.55999498E17)
            com.facebook.aura.vds.compose.theme.AuraColors r2 = X.C3cI.A0K(r12, r2)
            long r6 = r2.primaryText
            goto L55
        L9c:
            r12.Afo()
            goto L80
        La0:
            r2 = r0 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L2d
            int r2 = X.AnonymousClass004.A0f(r12, r1)
            r3 = r3 | r2
            goto L2d
        Laa:
            r3 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt.SpaceShareLinkSyncRow(com.facebook.aura.spaces.share.SpaceShareLinkState, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void SpaceShareLinkUrlPill(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1748504911);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            C0fG c0fG = (C0fG) AKO.A07(Am0.A02, bbi);
            View view = (View) AKO.A07(AndroidCompositionLocals_androidKt.A05, bbi);
            int i4 = R.string._name_removed__res_0x7f120bbd;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bbd);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AbstractC1798ArH.A05(bbi, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(346742011);
                Unit unit = Unit.INSTANCE;
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == obj) {
                    objAaT2 = new SpaceShareLinkSheetKt$SpaceShareLinkUrlPill$1$1(mutableState, null);
                    BBI.A0O(bbi, objAaT2);
                }
                AnonymousClass001.A18(bfm, objAaT2, unit);
            } else {
                bfm.AgE(346826579);
            }
            BBI.A0R(bbi, false);
            BRg bRgA0U = AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 46.0f);
            C1D3 c1d3 = C1D8.A00;
            BRg bRgA03 = C11U.A03(bRgA0U, c1d3);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0B = C3U4.A0B(C1b8.A01(bRgA03, auraTheme.getColors(bfm, 6).secondaryButtonBackground), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA0b = C8j4.A0b(AcQ.A00(AuraDimensKt.SpacingMicro + 2.0f), bfm, C2VU.A04);
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0b);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String strA04 = FXS.A03().A04(str);
            C7384Etj.A0U(strA04);
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(strA04, ARK.A00(bs0), jA07, c1822ArmA0C, null, null, null, false, 0, 1, 5, null, null, null, bfm, 805306368, 6, 14832);
            if (!MutableState.A0A(mutableState)) {
                i4 = R.string._name_removed__res_0x7f120fde;
            }
            String strA012 = AbstractC2271BQs.A01(bfm, i4);
            BRg bRgA032 = C11U.A03(C10G.A07(bs0, 32.0f), c1d3);
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA1O = AnonymousClass003.A1O(bfm, view, strA01, bfm.A67(c0fG) | AnonymousClass004.A1F(iA0d));
            Object objAaT3 = bfm.AaT();
            if (zA1O || objAaT3 == obj) {
                objAaT3 = new SpaceShareLinkSheetKt$SpaceShareLinkUrlPill$2$1$1(c0fG, str, view, strA01, mutableState);
                BBI.A0O(bbi, objAaT3);
            }
            BRg bRgA04 = C0v5.A04(bRgA032, c1ydA0A, null, (Function0) objAaT3, true);
            boolean zA65 = bfm.A65(strA012);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == obj) {
                objAaT4 = new SpaceShareLinkSheetKt$SpaceShareLinkUrlPill$2$2$1(strA012);
                BBI.A0O(bbi, objAaT4);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT4, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0Y);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(972114851);
                AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.circle_check_wght400_filled_24, 0), 20.0f, null, auraTheme.getColors(bfm, 6).iconSuccess, null, bfm, (AVy.$stable << 3) | 384, 41);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(972317002);
                AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.copy_wght400_outline_24, 0), 20.0f, null, C3cH.A06(bfm, auraTheme), null, bfm, (AVy.$stable << 3) | 384, 41);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139613(str, bRg2, i, i2);
        }
    }

    public static final void SpaceShareLinkLoading(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1769807646);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
            BRg bRgA06 = C3U4.A06(bRg, 32.0f);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new SpaceShareLinkSheetKt$SpaceShareLinkLoading$1$1(strA01);
                BBI.A0T(bfm, objAaT);
            }
            AnonymousClass007.A0v(bfm, bRgA06, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139482(bRg, i, i2);
        }
    }

    public static final void SpaceShareLinkUnpublishRow(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(485843888);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            m2187SpaceShareLinkRowTgFrcIs(R.drawable.trash_wght400_outline_24, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bc9), C3cH.A0W(bfm).destructiveText, z, function0, AbstractC07539Wl.A00(bRg, "hatch-space-share-link-unpublish"), null, bfm, (iA0n << 9) & 64512, 64);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139581(z, function0, bRg, i, i2);
        }
    }

    public static final /* synthetic */ SpaceShareLinkState access$SpaceShareLinkSheet$lambda$0(C1BO c1bo) {
        return (SpaceShareLinkState) c1bo.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String syncedAgo(long r6, X.BFM r8, int r9) {
        /*
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L4c
            r6 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L4c
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L30
            r0 = 108584643(0x678dec3, float:4.6807275E-35)
            r8.AgE(r0)
            r3 = 2131890154(0x7f120fea, float:1.9414992E38)
        L22:
            long r1 = r1 / r6
        L23:
            int r0 = (int) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.AnonymousClass001.A0t(r8, r0, r3)
        L2c:
            X.AnonymousClass001.A1D(r8)
            return r0
        L30:
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L42
            r0 = 108590815(0x678f6df, float:4.6824988E-35)
            r8.AgE(r0)
            r3 = 2131890152(0x7f120fe8, float:1.9414988E38)
            long r1 = r1 / r4
            goto L23
        L42:
            r0 = 108595933(0x6790add, float:4.6839676E-35)
            r8.AgE(r0)
            r3 = 2131890151(0x7f120fe7, float:1.9414986E38)
            goto L22
        L4c:
            r0 = 108580977(0x678d071, float:4.6796754E-35)
            r8.AgE(r0)
            r0 = 2131890153(0x7f120fe9, float:1.941499E38)
            java.lang.String r0 = X.AbstractC2271BQs.A01(r8, r0)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt.syncedAgo(long, X.BFM, int):java.lang.String");
    }
}
