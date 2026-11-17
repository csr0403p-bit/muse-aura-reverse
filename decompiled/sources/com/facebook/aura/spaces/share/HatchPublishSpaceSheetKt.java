package com.facebook.aura.spaces.share;

import X.AIW;
import X.AKO;
import X.AKQ;
import X.ARD;
import X.ARK;
import X.AVy;
import X.AbstractC05192Wm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C07C;
import X.C0924AIa;
import X.C0fG;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D8;
import X.C1YL;
import X.C1b8;
import X.C1er;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.F60;
import X.FXS;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.PublishSpaceSheetKey;
import com.facebook.aura.spaces.share.HatchPublishSpaceState;
import com.facebook.aura.vds.compose.button.AuraButtonAccessibility;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.button.IconContext;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchPublishSpaceSheetKt {
    public static final float PUBLISH_BUTTON_HEIGHT = 44.0f;
    public static final float PUBLISH_SHEET_PADDING = 20.0f;
    public static final float SHARE_URL_ROW_HEIGHT = 54.0f;

    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$ConfirmDisclosureContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isPublishing;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onPublish;
        public final /* synthetic */ String $spaceId;
        public final /* synthetic */ String $summary;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$summary = str2;
            this.$spaceId = str3;
            this.$isPublishing = z;
            this.$onPublish = function0;
            this.$onCancel = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishSpaceSheetKt.ConfirmDisclosureContent(this.$title, this.$summary, this.$spaceId, this.$isPublishing, this.$onPublish, this.$onCancel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$ConfirmPublishContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C139302 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isPublishing;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onPublish;
        public final /* synthetic */ String $spaceId;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139302(String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$title = str;
            this.$spaceId = str2;
            this.$isPublishing = z;
            this.$onPublish = function0;
            this.$onDismiss = function02;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishSpaceSheetKt.ConfirmPublishContent(this.$title, this.$spaceId, this.$isPublishing, this.$onPublish, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$ConfirmUnpublishContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C139312 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isUnpublishing;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onUnpublish;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139312(String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$title = str;
            this.$isUnpublishing = z;
            this.$onUnpublish = function0;
            this.$onCancel = function02;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishSpaceSheetKt.ConfirmUnpublishContent(this.$title, this.$isUnpublishing, this.$onUnpublish, this.$onCancel, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$DisclosureCategoryRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C139322 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139322(String str, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$label = str;
            this.$modifier = bRg;
            this.$iconRes = i;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishSpaceSheetKt.DisclosureCategoryRow(this.$label, this.$modifier, this.$iconRes, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$FailedContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C139332 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ boolean $retrying;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139332(String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$message = str;
            this.$retrying = z;
            this.$onRetry = function0;
            this.$onDismiss = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishSpaceSheetKt.FailedContent(this.$message, this.$retrying, this.$onRetry, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $closeSheet;
        public final /* synthetic */ G0U<HatchScreen, Unit> $closeWithButton;
        public final /* synthetic */ HatchPublishSpaceState $publishState;
        public final /* synthetic */ G0U<String, Unit> $shareSpace;
        public final /* synthetic */ String $spaceId;
        public final /* synthetic */ HatchPublishSpaceViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchPublishSpaceState hatchPublishSpaceState, String str, HatchPublishSpaceViewModel hatchPublishSpaceViewModel, Function0<Unit> function0, G0U<? super String, Unit> g0u, G0U<? super HatchScreen, Unit> g0u2) {
            super(3);
            this.$publishState = hatchPublishSpaceState;
            this.$spaceId = str;
            this.$viewModel = hatchPublishSpaceViewModel;
            this.$closeSheet = function0;
            this.$shareSpace = g0u;
            this.$closeWithButton = g0u2;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            String str;
            String str2;
            Function0 function0;
            Function0<Unit> function02;
            int i2;
            boolean z;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            HatchPublishSpaceState hatchPublishSpaceState = this.$publishState;
            if (hatchPublishSpaceState instanceof HatchPublishSpaceState.Loading) {
                bfm.AgE(226865293);
                BRg bRgA06 = C3U4.A06(C10G.A02, 32.0f);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA06);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                BBI.A0R(bbi, true);
            } else {
                if (hatchPublishSpaceState instanceof HatchPublishSpaceState.ConfirmPublish) {
                    bfm.AgE(226873152);
                    str = ((HatchPublishSpaceState.ConfirmPublish) this.$publishState).title;
                    str2 = this.$spaceId;
                    HatchPublishSpaceViewModel hatchPublishSpaceViewModel = this.$viewModel;
                    boolean zA67 = bfm.A67(hatchPublishSpaceViewModel);
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$2$1(hatchPublishSpaceViewModel);
                        BBI.A0T(bfm, objAaT);
                    }
                    function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
                    function02 = this.$closeSheet;
                    i2 = 384;
                    z = false;
                } else if (hatchPublishSpaceState instanceof HatchPublishSpaceState.Publishing) {
                    bfm.AgE(226882442);
                    str = ((HatchPublishSpaceState.Publishing) this.$publishState).title;
                    str2 = this.$spaceId;
                    Object objAaT2 = bfm.AaT();
                    if (objAaT2 == C78N.A00) {
                        objAaT2 = HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$3$1.INSTANCE;
                        bfm.Ai0(objAaT2);
                    }
                    function0 = (Function0) objAaT2;
                    function02 = this.$closeSheet;
                    i2 = 3456;
                    z = true;
                } else if (hatchPublishSpaceState instanceof HatchPublishSpaceState.UpToDate) {
                    bfm.AgE(226891273);
                    String strA04 = FXS.A03().A04(((HatchPublishSpaceState.UpToDate) this.$publishState).title);
                    C7384Etj.A0U(strA04);
                    String strA0t = AnonymousClass001.A0t(bfm, strA04, R.string._name_removed__res_0x7f120bc3);
                    HatchPublishSpaceState.UpToDate upToDate = (HatchPublishSpaceState.UpToDate) this.$publishState;
                    String str3 = upToDate.url;
                    HatchPublishSpaceState.Deployment deployment = upToDate.deployment;
                    String str4 = this.$spaceId;
                    boolean zA1T = AnonymousClass001.A1T(bfm, this.$publishState, bfm.A65(this.$shareSpace));
                    G0U<String, Unit> g0u = this.$shareSpace;
                    HatchPublishSpaceState hatchPublishSpaceState2 = this.$publishState;
                    Object objAaT3 = bfm.AaT();
                    if (zA1T || objAaT3 == C78N.A00) {
                        objAaT3 = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$4$1(g0u, hatchPublishSpaceState2);
                        BBI.A0T(bfm, objAaT3);
                    }
                    Function0 function04 = (Function0) objAaT3;
                    HatchPublishSpaceViewModel hatchPublishSpaceViewModel2 = this.$viewModel;
                    boolean zA672 = bfm.A67(hatchPublishSpaceViewModel2);
                    Object objAaT4 = bfm.AaT();
                    if (zA672 || objAaT4 == C78N.A00) {
                        objAaT4 = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$5$1(hatchPublishSpaceViewModel2);
                        BBI.A0T(bfm, objAaT4);
                    }
                    HatchPublishSpaceSheetKt.PublishedContent(strA0t, str3, deployment, str4, function04, (Function0) ((InterfaceC7353EnQ) objAaT4), bfm, 0);
                } else if (hatchPublishSpaceState instanceof HatchPublishSpaceState.Published) {
                    bfm.AgE(226908899);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bc7);
                    HatchPublishSpaceState.Published published = (HatchPublishSpaceState.Published) this.$publishState;
                    String str5 = published.url;
                    HatchPublishSpaceState.Deployment deployment2 = published.deployment;
                    String str6 = this.$spaceId;
                    boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$publishState, bfm.A65(this.$shareSpace));
                    G0U<String, Unit> g0u2 = this.$shareSpace;
                    HatchPublishSpaceState hatchPublishSpaceState3 = this.$publishState;
                    Object objAaT5 = bfm.AaT();
                    if (zA1T2 || objAaT5 == C78N.A00) {
                        objAaT5 = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$6$1(g0u2, hatchPublishSpaceState3);
                        BBI.A0T(bfm, objAaT5);
                    }
                    Function0 function05 = (Function0) objAaT5;
                    HatchPublishSpaceViewModel hatchPublishSpaceViewModel3 = this.$viewModel;
                    boolean zA673 = bfm.A67(hatchPublishSpaceViewModel3);
                    Object objAaT6 = bfm.AaT();
                    if (zA673 || objAaT6 == C78N.A00) {
                        objAaT6 = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$7$1(hatchPublishSpaceViewModel3);
                        BBI.A0T(bfm, objAaT6);
                    }
                    HatchPublishSpaceSheetKt.PublishedContent(strA01, str5, deployment2, str6, function05, (Function0) ((InterfaceC7353EnQ) objAaT6), bfm, 0);
                } else if (hatchPublishSpaceState instanceof HatchPublishSpaceState.ConfirmDisclosure) {
                    bfm.AgE(226922586);
                    HatchPublishSpaceState.ConfirmDisclosure confirmDisclosure = (HatchPublishSpaceState.ConfirmDisclosure) this.$publishState;
                    String str7 = confirmDisclosure.title;
                    String str8 = confirmDisclosure.summary;
                    String str9 = this.$spaceId;
                    boolean z2 = confirmDisclosure.isPublishing;
                    HatchPublishSpaceViewModel hatchPublishSpaceViewModel4 = this.$viewModel;
                    boolean zA674 = bfm.A67(hatchPublishSpaceViewModel4);
                    Object objAaT7 = bfm.AaT();
                    if (zA674 || objAaT7 == C78N.A00) {
                        objAaT7 = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$8$1(hatchPublishSpaceViewModel4);
                        BBI.A0T(bfm, objAaT7);
                    }
                    Function0 function06 = (Function0) ((InterfaceC7353EnQ) objAaT7);
                    HatchPublishSpaceViewModel hatchPublishSpaceViewModel5 = this.$viewModel;
                    boolean zA675 = bfm.A67(hatchPublishSpaceViewModel5);
                    Object objAaT8 = bfm.AaT();
                    if (zA675 || objAaT8 == C78N.A00) {
                        objAaT8 = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$9$1(hatchPublishSpaceViewModel5);
                        BBI.A0T(bfm, objAaT8);
                    }
                    HatchPublishSpaceSheetKt.ConfirmDisclosureContent(str7, str8, str9, z2, function06, (Function0) ((InterfaceC7353EnQ) objAaT8), null, bfm, 0, 64);
                } else if (hatchPublishSpaceState instanceof HatchPublishSpaceState.ConfirmUnpublish) {
                    bfm.AgE(226935097);
                    HatchPublishSpaceState.ConfirmUnpublish confirmUnpublish = (HatchPublishSpaceState.ConfirmUnpublish) this.$publishState;
                    String str10 = confirmUnpublish.title;
                    boolean z3 = confirmUnpublish.isUnpublishing;
                    boolean zA1T3 = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A65(this.$spaceId));
                    String str11 = this.$spaceId;
                    HatchPublishSpaceViewModel hatchPublishSpaceViewModel6 = this.$viewModel;
                    Object objAaT9 = bfm.AaT();
                    if (zA1T3 || objAaT9 == C78N.A00) {
                        objAaT9 = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$10$1(str11, hatchPublishSpaceViewModel6);
                        BBI.A0T(bfm, objAaT9);
                    }
                    Function0 function07 = (Function0) objAaT9;
                    boolean zA1T4 = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A65(this.$spaceId));
                    String str12 = this.$spaceId;
                    HatchPublishSpaceViewModel hatchPublishSpaceViewModel7 = this.$viewModel;
                    Object objAaT10 = bfm.AaT();
                    if (zA1T4 || objAaT10 == C78N.A00) {
                        objAaT10 = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$11$1(str12, hatchPublishSpaceViewModel7);
                        BBI.A0T(bfm, objAaT10);
                    }
                    HatchPublishSpaceSheetKt.ConfirmUnpublishContent(str10, z3, function07, (Function0) objAaT10, bfm, 0);
                } else if (hatchPublishSpaceState instanceof HatchPublishSpaceState.Unpublished) {
                    bfm.AgE(226951080);
                    HatchPublishSpaceViewModel hatchPublishSpaceViewModel8 = this.$viewModel;
                    boolean zA676 = bfm.A67(hatchPublishSpaceViewModel8);
                    Object objAaT11 = bfm.AaT();
                    if (zA676 || objAaT11 == C78N.A00) {
                        objAaT11 = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$12$1(hatchPublishSpaceViewModel8);
                        BBI.A0T(bfm, objAaT11);
                    }
                    Function0 function08 = (Function0) ((InterfaceC7353EnQ) objAaT11);
                    boolean zA65 = bfm.A65(this.$closeWithButton);
                    G0U<HatchScreen, Unit> g0u3 = this.$closeWithButton;
                    Object objAaT12 = bfm.AaT();
                    if (zA65 || objAaT12 == C78N.A00) {
                        objAaT12 = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$13$1(g0u3);
                        BBI.A0T(bfm, objAaT12);
                    }
                    HatchPublishSpaceSheetKt.UnpublishedContent(function08, (Function0) objAaT12, bfm, 0);
                } else if (hatchPublishSpaceState instanceof HatchPublishSpaceState.PolicyRefused) {
                    bfm.AgE(226957818);
                    HatchPublishSpaceState.PolicyRefused policyRefused = (HatchPublishSpaceState.PolicyRefused) this.$publishState;
                    String str13 = policyRefused.title;
                    String strA012 = policyRefused.message;
                    if (strA012 == null) {
                        bfm.AgE(226962457);
                        strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bc6);
                    } else {
                        bfm.AgE(226961031);
                    }
                    BBI bbiA07 = C3cG.A07(bfm);
                    boolean zA652 = bfm.A65(this.$closeWithButton);
                    G0U<HatchScreen, Unit> g0u4 = this.$closeWithButton;
                    Object objAaT13 = bfm.AaT();
                    if (zA652 || objAaT13 == C78N.A00) {
                        objAaT13 = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$14$1(g0u4);
                        BBI.A0O(bbiA07, objAaT13);
                    }
                    HatchPublishSpaceSheetKt.PolicyRefusedContent(str13, strA012, (Function0) objAaT13, null, bfm, 0, 8);
                } else {
                    if (!(hatchPublishSpaceState instanceof HatchPublishSpaceState.Failed)) {
                        throw AnonymousClass005.A0k(bfm, 226866425);
                    }
                    bfm.AgE(226968967);
                    String strA013 = ((HatchPublishSpaceState.Failed) this.$publishState).message;
                    if (strA013 == null) {
                        bfm.AgE(226970633);
                        strA013 = AbstractC2271BQs.A01(bfm, ((HatchPublishSpaceState.Failed) this.$publishState).fallbackMessageRes);
                    } else {
                        bfm.AgE(226969889);
                    }
                    BBI bbiA072 = C3cG.A07(bfm);
                    boolean z4 = ((HatchPublishSpaceState.Failed) this.$publishState).isRetrying;
                    boolean zA1T5 = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A65(this.$spaceId));
                    String str14 = this.$spaceId;
                    HatchPublishSpaceViewModel hatchPublishSpaceViewModel9 = this.$viewModel;
                    Object objAaT14 = bfm.AaT();
                    if (zA1T5 || objAaT14 == C78N.A00) {
                        objAaT14 = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$15$1(str14, hatchPublishSpaceViewModel9);
                        BBI.A0O(bbiA072, objAaT14);
                    }
                    Function0 function09 = (Function0) objAaT14;
                    boolean zA653 = bfm.A65(this.$closeWithButton);
                    G0U<HatchScreen, Unit> g0u5 = this.$closeWithButton;
                    Object objAaT15 = bfm.AaT();
                    if (zA653 || objAaT15 == C78N.A00) {
                        objAaT15 = new HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$3$16$1(g0u5);
                        BBI.A0O(bbiA072, objAaT15);
                    }
                    HatchPublishSpaceSheetKt.FailedContent(strA013, z4, function09, (Function0) objAaT15, null, bfm, 0, 16);
                }
                HatchPublishSpaceSheetKt.ConfirmPublishContent(str, str2, z, function0, function02, bfm, i2);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ PublishSpaceSheetKey $navKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PublishSpaceSheetKey publishSpaceSheetKey, int i) {
            super(2);
            this.$navKey = publishSpaceSheetKey;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishSpaceSheetKt.HatchPublishSpaceSheet(this.$navKey, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$PolicyRefusedContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C139342 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDone;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139342(String str, String str2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$message = str2;
            this.$onDone = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishSpaceSheetKt.PolicyRefusedContent(this.$title, this.$message, this.$onDone, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$PublishedContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C139352 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchPublishSpaceState.Deployment $deployment;
        public final /* synthetic */ String $headerTitle;
        public final /* synthetic */ Function0<Unit> $onShare;
        public final /* synthetic */ Function0<Unit> $onUnpublish;
        public final /* synthetic */ String $spaceId;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139352(String str, String str2, HatchPublishSpaceState.Deployment deployment, String str3, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$headerTitle = str;
            this.$url = str2;
            this.$deployment = deployment;
            this.$spaceId = str3;
            this.$onShare = function0;
            this.$onUnpublish = function02;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishSpaceSheetKt.PublishedContent(this.$headerTitle, this.$url, this.$deployment, this.$spaceId, this.$onShare, this.$onUnpublish, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$SpacePublishSheetDismissLogging$2, reason: invalid class name and case insensitive filesystem */
    public final class C139362 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AtomicBoolean $buttonClosed;
        public final /* synthetic */ PublishSpaceSheetKey $navKey;
        public final /* synthetic */ HatchPublishSpaceState $publishState;
        public final /* synthetic */ String $spaceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139362(PublishSpaceSheetKey publishSpaceSheetKey, HatchPublishSpaceState hatchPublishSpaceState, String str, AtomicBoolean atomicBoolean, int i) {
            super(2);
            this.$navKey = publishSpaceSheetKey;
            this.$publishState = hatchPublishSpaceState;
            this.$spaceId = str;
            this.$buttonClosed = atomicBoolean;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishSpaceSheetKt.SpacePublishSheetDismissLogging(this.$navKey, this.$publishState, this.$spaceId, this.$buttonClosed, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$SpaceShareUrlRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C139372 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onCopy;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139372(String str, Function0<Unit> function0, int i) {
            super(2);
            this.$url = str;
            this.$onCopy = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishSpaceSheetKt.SpaceShareUrlRow(this.$url, this.$onCopy, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$UnpublishedContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C139382 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onPublish;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139382(Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$onPublish = function0;
            this.$onDismiss = function02;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishSpaceSheetKt.UnpublishedContent(this.$onPublish, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchPublishSpaceSheet(com.facebook.aura.navigation.key.PublishSpaceSheetKey r42, X.BFM r43, int r44) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt.HatchPublishSpaceSheet(com.facebook.aura.navigation.key.PublishSpaceSheetKey, X.BFM, int):void");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchPublishSpaceState.Deployment.values().length];
            try {
                AnonymousClass002.A13(HatchPublishSpaceState.Deployment.PENDING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchPublishSpaceState.Deployment.UNCONFIRMED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchPublishSpaceState.Deployment.READY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ConfirmDisclosureContent(String str, String str2, String str3, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        AuraButtonStyles auraButtonStyles;
        AuraButtonSize auraButtonSize;
        float f;
        String str4;
        C1YL c1yl;
        boolean z2;
        String str5;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        G0V g0v;
        Function0 function06;
        Function0 function07;
        AuraButtonAccessibility auraButtonAccessibility;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        BFM bfm2;
        int i5;
        BRg bRg2 = bRg;
        bfm.AgG(469353132);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function02);
        }
        int i6 = i2 & 64;
        int iA0j = 1572864;
        if (i6 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0d), bfm, iA0d)) {
            if (i6 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(bRg2.then(c1062ATq), PUBLISH_SHEET_PADDING);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function08 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function08);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, 16.0f);
            String strA04 = FXS.A03().A04(str);
            C7384Etj.A0U(strA04);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, strA04, R.string._name_removed__res_0x7f120bb7), null, colors.primaryText, typography.title3Medium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            if (str2 == null) {
                bfm.AgE(60317063);
                C01N.A08(bfm, bs0, 4.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bb9), null, colors.secondaryText, typography.subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, false);
                bfm.AgE(61204128);
                BBI.A0R(bbi, false);
                bfm.AgE(61237732);
                C01N.A08(bfm, bs0, 12.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bc1), null, colors.secondaryText, typography.subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else {
                bfm.AgE(60556352);
                BBI.A0R(bbi, false);
                bfm.AgE(60601581);
                C01N.A08(bfm, bs0, 12.0f);
                DisclosureCategoryRow(str2, C3U4.A0B(C1b8.A03(c1062ATq, C1D8.A00(20.0f), colors.elevated), 16.0f, 12.0f), R.drawable.circle_info_wght400_outline_24, bfm, (iA0d >> 3) & 14, 0);
                BBI.A0R(bbi, false);
                bfm.AgE(61479904);
            }
            BBI.A0R(bbi, false);
            C01N.A08(bfm, bs0, 28.0f);
            if (z) {
                bfm.AgE(61565247);
                auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStylePrimary = auraButtonStyles.primary(null, bfm, 48, 1);
                auraButtonSize = AuraButtonSize.MEDIUM;
                f = PUBLISH_BUTTON_HEIGHT;
                BRg bRgA04 = C10G.A04(c1062ATq, f);
                G0W<IconContext, BFM, Integer, Unit> g0w = ComposableSingletons$HatchPublishSpaceSheetKt.f297lambda$1336180290;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchPublishSpaceSheetKt$ConfirmDisclosureContent$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                c1yl = null;
                z2 = false;
                str5 = null;
                function03 = null;
                function04 = null;
                function05 = null;
                g0v = null;
                function06 = null;
                function07 = null;
                auraButtonAccessibility = null;
                z3 = false;
                i3 = 0;
                z4 = false;
                i4 = 0;
                bfm2 = bfm;
                i5 = 0;
                str4 = null;
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, "", null, bRgA04, auraLabelButtonStylePrimary, auraButtonSize, g0w, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm2, 807078960, RuntimeInternals.IOPRIO_BACKGROUND, 0, 134200709);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(61884795);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bba);
                auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStylePrimary2 = auraButtonStyles.primary(null, bfm, 48, 1);
                auraButtonSize = AuraButtonSize.MEDIUM;
                f = PUBLISH_BUTTON_HEIGHT;
                BRg bRgA042 = C10G.A04(c1062ATq, f);
                boolean zA1K = AnonymousClass004.A1K(iA0d) | AnonymousClass005.A1L(iA0d);
                Object objAaT2 = bfm.AaT();
                if (zA1K || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchPublishSpaceSheetKt$ConfirmDisclosureContent$1$2$1(function0, str3);
                    BBI.A0O(bbi, objAaT2);
                }
                str4 = null;
                c1yl = null;
                z2 = false;
                str5 = null;
                function03 = null;
                function04 = null;
                function05 = null;
                g0v = null;
                function06 = null;
                function07 = null;
                auraButtonAccessibility = null;
                z3 = false;
                i3 = 0;
                z4 = false;
                i4 = 0;
                bfm2 = bfm;
                i5 = 0;
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA042, auraLabelButtonStylePrimary2, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm2, 199680, 0, 0, 134201285);
                BBI.A0R(bbi, false);
            }
            C01N.A08(bfm, bs0, 6.0f);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bb6);
            AuraLabelButtonStyle auraLabelButtonStyleTertiary = auraButtonStyles.tertiary(null, bfm, 48, 1);
            BRg bRgA043 = C10G.A04(c1062ATq, f);
            boolean z5 = !z;
            boolean zA1K2 = AnonymousClass004.A1K(iA0d) | ((iA0d & 458752) == 131072);
            Object objAaT3 = bfm.AaT();
            if (zA1K2 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchPublishSpaceSheetKt$ConfirmDisclosureContent$1$3$1(function02, str3);
                BBI.A0O(bbi, objAaT3);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(str4, strA012, c1yl, bRgA043, auraLabelButtonStyleTertiary, auraButtonSize, null, z2, false, z5, false, false, null, null, (Function0) objAaT3, str5, function03, function04, function05, g0v, function06, function07, auraButtonAccessibility, z3, i3, z4, i4, bfm2, 199680, 0, i5, 134200773);
            C01N.A04(bfm, bbi, bs0, 24.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, str3, z, function0, function02, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DisclosureCategoryRow(java.lang.String r30, X.BRg r31, int r32, X.BFM r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt.DisclosureCategoryRow(java.lang.String, X.BRg, int, X.BFM, int, int):void");
    }

    public static final void FailedContent(String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(301998360);
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
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(bRg2.then(c1062ATq), 24.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, 16.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bbc), null, colors.primaryText, typography.title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 8.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, colors.secondaryText, typography.subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            C01N.A08(bfm, bs0, 24.0f);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bc2);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStylePrimaryAlt = auraButtonStyles.primaryAlt(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimaryAlt, auraButtonSize, null, false, false, false, z, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, ((iA0d >> 3) & 14) | ((iA0d << 6) & 57344), 0, 134200261);
            C01N.A08(bfm, bs0, 8.0f);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bb6), null, c1062ATq, auraButtonStyles.tertiary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0d << 3) & 57344, 0, 134201285);
            C01N.A04(bfm, bbi, bs0, 16.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139332(str, z, function0, function02, bRg2, i, i2);
        }
    }

    public static final void PolicyRefusedContent(String str, String str2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1992506514);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
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
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(bRg2.then(c1062ATq), PUBLISH_SHEET_PADDING);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            int iA00 = C01N.A00(bfm, bs0, 16.0f);
            String strA04 = FXS.A03().A04(str);
            C7384Etj.A0U(strA04);
            String strA0t = AnonymousClass001.A0t(bfm, strA04, R.string._name_removed__res_0x7f120bbe);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, iA00).title3Medium;
            long jA06 = C3cH.A06(bfm, auraTheme);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchPublishSpaceSheetKt$PolicyRefusedContent$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, ARD.A01(bs0, (G0U) objAaT, false), jA06, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            C01N.A08(bfm, bs0, 12.0f);
            BRg bRgA0B = C3U4.A0B(C1b8.A03(bs0, C1D8.A00(20.0f), auraTheme.getColors(bfm, iA00).elevated), 16.0f, 12.0f);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = HatchPublishSpaceSheetKt$PolicyRefusedContent$1$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            DisclosureCategoryRow(str2, AnonymousClass001.A0Y(bRgA0B, objAaT2, false), 0, bfm, (iA0d >> 3) & 14, 4);
            C01N.A08(bfm, bs0, 28.0f);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bbb), null, C10G.A04(c1062ATq, PUBLISH_BUTTON_HEIGHT), AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1), AuraButtonSize.MEDIUM, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0d << 6) & 57344, 0, 134201285);
            C01N.A04(bfm, bbi, bs0, 24.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139342(str, str2, function0, bRg2, i, i2);
        }
    }

    public static final void logSpacePublishClick(String str, HatchScreen hatchScreen, HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SPACES, HatchSubsurface.PUBLISH_SHEET, hatchScreen, hatchComponent, null, spaceIdMetadata(str), null);
    }

    public static final HatchScreen publishScreen(HatchPublishSpaceState hatchPublishSpaceState) {
        if ((hatchPublishSpaceState instanceof HatchPublishSpaceState.Loading) || (hatchPublishSpaceState instanceof HatchPublishSpaceState.ConfirmPublish) || (hatchPublishSpaceState instanceof HatchPublishSpaceState.Publishing) || (hatchPublishSpaceState instanceof HatchPublishSpaceState.ConfirmDisclosure)) {
            return HatchScreen.PUBLISH_CONFIRM;
        }
        if ((hatchPublishSpaceState instanceof HatchPublishSpaceState.UpToDate) || (hatchPublishSpaceState instanceof HatchPublishSpaceState.Published) || (hatchPublishSpaceState instanceof HatchPublishSpaceState.ConfirmUnpublish) || (hatchPublishSpaceState instanceof HatchPublishSpaceState.Unpublished)) {
            return HatchScreen.PUBLISH_SUCCESS;
        }
        if ((hatchPublishSpaceState instanceof HatchPublishSpaceState.PolicyRefused) || (hatchPublishSpaceState instanceof HatchPublishSpaceState.Failed)) {
            return HatchScreen.PUBLISH_FAILED;
        }
        throw C3cG.A0q();
    }

    public static final void ConfirmPublishContent(String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        AuraButtonStyles auraButtonStyles;
        AuraButtonSize auraButtonSize;
        float f;
        String str3;
        C1YL c1yl;
        boolean z2;
        String str4;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        G0V g0v;
        Function0 function06;
        Function0 function07;
        AuraButtonAccessibility auraButtonAccessibility;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        BFM bfm2;
        int i4;
        bfm.AgG(280323688);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(c1062ATq, PUBLISH_SHEET_PADDING);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function08 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function08);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA02);
            C01N.A08(bfm, bs0, 16.0f);
            String strA04 = FXS.A03().A04(str);
            C7384Etj.A0U(strA04);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, strA04, R.string._name_removed__res_0x7f120bb7), null, colors.primaryText, typography.title3Medium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 4.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bc0), null, colors.secondaryText, typography.subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 28.0f);
            if (z) {
                bfm.AgE(-2110082321);
                auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStylePrimary = auraButtonStyles.primary(null, bfm, 48, 1);
                auraButtonSize = AuraButtonSize.MEDIUM;
                f = PUBLISH_BUTTON_HEIGHT;
                BRg bRgA04 = C10G.A04(c1062ATq, f);
                G0W<IconContext, BFM, Integer, Unit> g0w = ComposableSingletons$HatchPublishSpaceSheetKt.f296lambda$1068604817;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchPublishSpaceSheetKt$ConfirmPublishContent$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                c1yl = null;
                z2 = false;
                str4 = null;
                function03 = null;
                function04 = null;
                function05 = null;
                g0v = null;
                function06 = null;
                function07 = null;
                auraButtonAccessibility = null;
                z3 = false;
                i2 = 0;
                z4 = false;
                i3 = 0;
                bfm2 = bfm;
                i4 = 0;
                str3 = null;
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, "", null, bRgA04, auraLabelButtonStylePrimary, auraButtonSize, g0w, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm2, 807078960, RuntimeInternals.IOPRIO_BACKGROUND, 0, 134200709);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-2109763114);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bbf);
                auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStylePrimary2 = auraButtonStyles.primary(null, bfm, 48, 1);
                auraButtonSize = AuraButtonSize.MEDIUM;
                f = PUBLISH_BUTTON_HEIGHT;
                BRg bRgA042 = C10G.A04(c1062ATq, f);
                boolean zA1M = AnonymousClass004.A1M(iA0d) | AnonymousClass003.A1C(iA0d);
                Object objAaT2 = bfm.AaT();
                if (zA1M || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchPublishSpaceSheetKt$ConfirmPublishContent$1$2$1(function0, str2);
                    BBI.A0O(bbi, objAaT2);
                }
                str3 = null;
                c1yl = null;
                z2 = false;
                str4 = null;
                function03 = null;
                function04 = null;
                function05 = null;
                g0v = null;
                function06 = null;
                function07 = null;
                auraButtonAccessibility = null;
                z3 = false;
                i2 = 0;
                z4 = false;
                i3 = 0;
                bfm2 = bfm;
                i4 = 0;
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA042, auraLabelButtonStylePrimary2, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm2, 199680, 0, 0, 134201285);
                BBI.A0R(bbi, false);
            }
            C01N.A08(bfm, bs0, 6.0f);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bb6);
            AuraLabelButtonStyle auraLabelButtonStyleTertiary = auraButtonStyles.tertiary(null, bfm, 48, 1);
            BRg bRgA043 = C10G.A04(c1062ATq, f);
            boolean zA1C = AnonymousClass003.A1C(iA0d) | ((iA0d & 57344) == 16384);
            Object objAaT3 = bfm.AaT();
            if (zA1C || objAaT3 == C78N.A00) {
                objAaT3 = new HatchPublishSpaceSheetKt$ConfirmPublishContent$1$3$1(function02, str2);
                BBI.A0O(bbi, objAaT3);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(str3, strA012, c1yl, bRgA043, auraLabelButtonStyleTertiary, auraButtonSize, null, z2, false, false, false, false, null, null, (Function0) objAaT3, str4, function03, function04, function05, g0v, function06, function07, auraButtonAccessibility, z3, i2, z4, i3, bfm2, 199680, 0, i4, 134201285);
            C01N.A04(bfm, bbi, bs0, 24.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139302(str, str2, z, function0, function02, i);
        }
    }

    public static final void ConfirmUnpublishContent(String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        AuraButtonStyles auraButtonStyles;
        AuraButtonSize auraButtonSize;
        float f;
        C1YL c1yl;
        boolean z2;
        String str2;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        G0V g0v;
        Function0 function06;
        Function0 function07;
        AuraButtonAccessibility auraButtonAccessibility;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        BFM bfm2;
        int i4;
        bfm.AgG(-1288699356);
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
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(c1062ATq, PUBLISH_SHEET_PADDING);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function08 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function08);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C01N.A08(bfm, bs0, 16.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120bcb), null, colors.primaryText, typography.title3Medium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 4.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bca), null, colors.secondaryText, typography.subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 28.0f);
            if (z) {
                bfm.AgE(692822275);
                auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStyleDestructive = auraButtonStyles.destructive(null, bfm, 48, 1);
                auraButtonSize = AuraButtonSize.MEDIUM;
                f = PUBLISH_BUTTON_HEIGHT;
                BRg bRgA04 = C10G.A04(c1062ATq, f);
                G0W<IconContext, BFM, Integer, Unit> g0w = ComposableSingletons$HatchPublishSpaceSheetKt.lambda$734879165;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchPublishSpaceSheetKt$ConfirmUnpublishContent$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                c1yl = null;
                z2 = false;
                str2 = null;
                function03 = null;
                function04 = null;
                function05 = null;
                g0v = null;
                function06 = null;
                function07 = null;
                auraButtonAccessibility = null;
                z3 = false;
                i2 = 0;
                z4 = false;
                i3 = 0;
                bfm2 = bfm;
                i4 = 0;
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, "", null, bRgA04, auraLabelButtonStyleDestructive, auraButtonSize, g0w, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm2, 807078960, RuntimeInternals.IOPRIO_BACKGROUND, 0, 134200709);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(693132988);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bc9);
                auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStyleDestructive2 = auraButtonStyles.destructive(null, bfm, 48, 1);
                auraButtonSize = AuraButtonSize.MEDIUM;
                f = PUBLISH_BUTTON_HEIGHT;
                c1yl = null;
                z2 = false;
                str2 = null;
                function03 = null;
                function04 = null;
                function05 = null;
                g0v = null;
                function06 = null;
                function07 = null;
                auraButtonAccessibility = null;
                z3 = false;
                i2 = 0;
                z4 = false;
                i3 = 0;
                bfm2 = bfm;
                i4 = 0;
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, C10G.A04(c1062ATq, f), auraLabelButtonStyleDestructive2, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm2, 199680, (iA0d << 6) & 57344, 0, 134201285);
                BBI.A0R(bbi, false);
            }
            C01N.A08(bfm, bs0, 6.0f);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bb6), c1yl, C10G.A04(c1062ATq, f), auraButtonStyles.tertiary(null, bfm, 48, 1), auraButtonSize, null, false, false, !z, false, z2, null, null, function02, str2, function03, function04, function05, g0v, function06, function07, auraButtonAccessibility, z3, i2, z4, i3, bfm2, 199680, (iA0d << 3) & 57344, i4, 134200773);
            C01N.A04(bfm, bbi, bs0, 24.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139312(str, z, function0, function02, i);
        }
    }

    public static final void PublishedContent(String str, String str2, HatchPublishSpaceState.Deployment deployment, String str3, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        int i2;
        bfm.AgG(-1222351237);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass005.A0A(bfm, deployment);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            BBI bbi = (BBI) bfm;
            C0fG c0fG = (C0fG) AKO.A07(Am0.A02, bbi);
            View view = (View) AKO.A07(AndroidCompositionLocals_androidKt.A05, bbi);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bbd);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA00 = AbstractC05192Wm.A00(AnonymousClass005.A0O(), C3U4.A07(c1062ATq, PUBLISH_SHEET_PADDING));
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA02);
            C01N.A08(bfm, bs0, 16.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, colors.primaryText, typography.title3Medium, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            C01N.A08(bfm, bs0, 4.0f);
            int iOrdinal = deployment.ordinal();
            if (iOrdinal == 1) {
                i2 = R.string._name_removed__res_0x7f120bc5;
            } else if (iOrdinal == 2) {
                i2 = R.string._name_removed__res_0x7f120bc4;
            } else {
                if (iOrdinal != 0) {
                    throw C3cG.A0q();
                }
                i2 = R.string._name_removed__res_0x7f120bc1;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i2), null, colors.secondaryText, typography.subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 28.0f);
            int i3 = iA0d & 7168;
            boolean zA1O = AnonymousClass003.A1O(bfm, view, strA01, bfm.A67(c0fG) | AnonymousClass002.A1Q(i3, 2048) | AnonymousClass003.A1C(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchPublishSpaceSheetKt$PublishedContent$1$1$1(c0fG, str2, view, strA01, str3);
                BBI.A0O(bbi, objAaT);
            }
            SpaceShareUrlRow(str2, (Function0) objAaT, bfm, (iA0d >> 3) & 14);
            C01N.A08(bfm, bs0, 32.0f);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bb5);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStylePrimary = auraButtonStyles.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            float f = PUBLISH_BUTTON_HEIGHT;
            BRg bRgA04 = C10G.A04(c1062ATq, f);
            boolean zA1Q = AnonymousClass002.A1Q(i3, 2048) | AnonymousClass005.A1M(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1Q || objAaT2 == C78N.A00) {
                objAaT2 = new HatchPublishSpaceSheetKt$PublishedContent$1$2$1(function0, str3);
                BBI.A0O(bbi, objAaT2);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, bRgA04, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            C01N.A08(bfm, bs0, 6.0f);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bc9);
            AuraLabelButtonStyle auraLabelButtonStyleTertiary = auraButtonStyles.tertiary(null, bfm, 48, 1);
            BRg bRgA042 = C10G.A04(c1062ATq, f);
            boolean zA1Q2 = AnonymousClass002.A1Q(i3, 2048) | ((iA0d & 458752) == 131072);
            Object objAaT3 = bfm.AaT();
            if (zA1Q2 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchPublishSpaceSheetKt$PublishedContent$1$3$1(function02, str3);
                BBI.A0O(bbi, objAaT3);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA013, null, bRgA042, auraLabelButtonStyleTertiary, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT3, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            C01N.A04(bfm, bbi, bs0, 24.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139352(str, str2, deployment, str3, function0, function02, i);
        }
    }

    public static final void SpacePublishSheetDismissLogging(PublishSpaceSheetKey publishSpaceSheetKey, HatchPublishSpaceState hatchPublishSpaceState, String str, AtomicBoolean atomicBoolean, BFM bfm, int i) {
        bfm.AgG(-1079473934);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, publishSpaceSheetKey) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchPublishSpaceState, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, atomicBoolean);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            MutableState mutableStateA00 = C1er.A00(bfm, hatchPublishSpaceState);
            boolean zA1R = AnonymousClass001.A1R(bfm, mutableStateA00, AnonymousClass005.A1S(bfm, auraNavigatorA05, publishSpaceSheetKey, atomicBoolean)) | ((iA0T & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchPublishSpaceSheetKt$SpacePublishSheetDismissLogging$1$1(auraNavigatorA05, publishSpaceSheetKey, atomicBoolean, str, mutableStateA00);
                BBI.A0O(bbi, objAaT);
            }
            C78e.A01(bfm, auraNavigatorA05, publishSpaceSheetKey, str, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139362(publishSpaceSheetKey, hatchPublishSpaceState, str, atomicBoolean, i);
        }
    }

    public static final void SpaceShareUrlRow(String str, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(1416309193);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA0U = AnonymousClass001.A0U(C10G.A02, SHARE_URL_ROW_HEIGHT);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA07 = C3U4.A07(C1b8.A03(bRgA0U, C1D8.A00(20.0f), auraTheme.getColors(bfm, 6).elevated), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A00(8.0f), bfm, C2VU.A04);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA02);
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARK.A00(bs0), C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14832);
            AuraIconKt.m2567AuraIconFHprtrg(C0v5.A05(bs0, null, function0, true), BOf.A00(bfm, R.drawable.copy_wght400_outline_24, 0), AuraIconSize.SMALL, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bb8), auraTheme.getColors(bfm, 6).secondaryIcon.enabled, null, bfm, (AVy.$stable << 3) | 384, 32);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139372(str, function0, i);
        }
    }

    public static final void UnpublishedContent(Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(-1445741362);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(c1062ATq, PUBLISH_SHEET_PADDING);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C01N.A08(bfm, bs0, 16.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bc8), null, colors.primaryText, typography.title3Medium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 4.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bcc), null, colors.secondaryText, typography.subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 28.0f);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bbf);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStylePrimary = auraButtonStyles.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            float f = PUBLISH_BUTTON_HEIGHT;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, C10G.A04(c1062ATq, f), auraLabelButtonStylePrimary, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0T << 12) & 57344, 0, 134201285);
            C01N.A08(bfm, bs0, 6.0f);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bb6), null, C10G.A04(c1062ATq, f), auraButtonStyles.tertiary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0T << 9) & 57344, 0, 134201285);
            C01N.A04(bfm, bbi, bs0, 24.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139382(function0, function02, i);
        }
    }

    public static final /* synthetic */ HatchPublishSpaceState access$SpacePublishSheetDismissLogging$lambda$0(C1BO c1bo) {
        return (HatchPublishSpaceState) c1bo.getValue();
    }

    public static final Map<String, String> spaceIdMetadata(String str) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.SPACE_ID, str, c0924AIaA0u);
        }
        return AIW.A0K(c0924AIaA0u);
    }
}
