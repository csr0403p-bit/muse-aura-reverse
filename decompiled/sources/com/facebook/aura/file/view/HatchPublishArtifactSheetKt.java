package com.facebook.aura.file.view;

import X.AFz;
import X.AKO;
import X.AKQ;
import X.ARK;
import X.AbstractC1103AYp;
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
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
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
import X.C01N;
import X.C06I;
import X.C07C;
import X.C0dx;
import X.C0fG;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1D8;
import X.C1YD;
import X.C1b8;
import X.C1er;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.viewmodel.HatchPublishArtifactViewModel;
import com.facebook.aura.file.viewmodel.HatchPublishBottomSheetState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.PublishArtifactSheetKey;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchPublishArtifactSheetKt {

    /* renamed from: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$ArtifactShareButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onShare;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ HatchSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchSurface hatchSurface, HatchScreen hatchScreen, Function0<Unit> function0, int i) {
            super(2);
            this.$surface = hatchSurface;
            this.$screen = hatchScreen;
            this.$onShare = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishArtifactSheetKt.ArtifactShareButton(this.$surface, this.$screen, this.$onShare, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$FailedPublishSheetContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119562 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isUnpublishFailure;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onRetry;
        public final /* synthetic */ HatchSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119562(HatchSurface hatchSurface, boolean z, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$surface = hatchSurface;
            this.$isUnpublishFailure = z;
            this.$onRetry = function0;
            this.$onDismiss = function02;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishArtifactSheetKt.FailedPublishSheetContent(this.$surface, this.$isUnpublishFailure, this.$onRetry, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$HasChangesPublishSheetContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119572 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isPublishing;
        public final /* synthetic */ boolean $isUnpublishing;
        public final /* synthetic */ Function0<Unit> $onPublish;
        public final /* synthetic */ Function0<Unit> $onShare;
        public final /* synthetic */ Function0<Unit> $onUnpublish;
        public final /* synthetic */ HatchSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119572(HatchSurface hatchSurface, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$surface = hatchSurface;
            this.$isPublishing = z;
            this.$isUnpublishing = z2;
            this.$onPublish = function0;
            this.$onShare = function02;
            this.$onUnpublish = function03;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishArtifactSheetKt.HasChangesPublishSheetContent(this.$surface, this.$isPublishing, this.$isUnpublishing, this.$onPublish, this.$onShare, this.$onUnpublish, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C119582 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<HatchScreen, Unit> $closeWithButton;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ PublishArtifactSheetKey $navKey;
        public final /* synthetic */ HatchPublishBottomSheetState $publishState;
        public final /* synthetic */ G0V<String, String, Unit> $shareArtifact;
        public final /* synthetic */ HatchPublishArtifactViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C119582(HatchPublishBottomSheetState hatchPublishBottomSheetState, PublishArtifactSheetKey publishArtifactSheetKey, HatchPublishArtifactViewModel hatchPublishArtifactViewModel, G0U<? super HatchScreen, Unit> g0u, Context context, G0V<? super String, ? super String, Unit> g0v) {
            super(3);
            this.$publishState = hatchPublishBottomSheetState;
            this.$navKey = publishArtifactSheetKey;
            this.$viewModel = hatchPublishArtifactViewModel;
            this.$closeWithButton = g0u;
            this.$context = context;
            this.$shareArtifact = g0v;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            Function0 function0;
            BBI bbi;
            int i2;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            HatchPublishBottomSheetState hatchPublishBottomSheetState = this.$publishState;
            if (hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.Loading) {
                bfm.AgE(-1362265771);
                HatchPublishArtifactSheetKt.LoadingPublishSheetContent(((HatchPublishBottomSheetState.Loading) this.$publishState).getFileName(), bfm, 0);
            } else if (hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.Ready) {
                bfm.AgE(-1362261756);
                HatchSurface hatchSurface = this.$navKey.surface;
                HatchPublishBottomSheetState.Ready ready = (HatchPublishBottomSheetState.Ready) this.$publishState;
                String fileName = ready.getFileName();
                boolean z = ready.isPublishing;
                Object obj = this.$viewModel;
                boolean zA67 = bfm.A67(obj);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$1$1(obj);
                    BBI.A0T(bfm, objAaT);
                }
                Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT);
                boolean zA65 = bfm.A65(this.$closeWithButton);
                G0U<HatchScreen, Unit> g0u = this.$closeWithButton;
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$2$1(g0u);
                    BBI.A0T(bfm, objAaT2);
                }
                HatchPublishArtifactSheetKt.ReadyPublishSheetContent(hatchSurface, fileName, z, function02, (Function0) objAaT2, bfm, 0);
            } else if (hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.HasChanges) {
                bfm.AgE(-1362249875);
                HatchSurface hatchSurface2 = this.$navKey.surface;
                HatchPublishBottomSheetState.HasChanges hasChanges = (HatchPublishBottomSheetState.HasChanges) this.$publishState;
                boolean z2 = hasChanges.isPublishing;
                boolean z3 = hasChanges.isUnpublishing;
                Object obj2 = this.$viewModel;
                boolean zA672 = bfm.A67(obj2);
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$3$1(obj2);
                    BBI.A0T(bfm, objAaT3);
                }
                Function0 function03 = (Function0) ((InterfaceC7353EnQ) objAaT3);
                String str = ((HatchPublishBottomSheetState.HasChanges) this.$publishState).url;
                if (str == null) {
                    bfm.AgE(720209990);
                    bbi = (BBI) bfm;
                    i2 = 0;
                    BBI.A0R(bbi, false);
                    function0 = null;
                } else {
                    bfm.AgE(720209991);
                    G0V<String, String, Unit> g0v = this.$shareArtifact;
                    HatchPublishBottomSheetState hatchPublishBottomSheetState2 = this.$publishState;
                    boolean zA1S = AnonymousClass004.A1S(bfm, str, hatchPublishBottomSheetState2, bfm.A65(g0v));
                    Object objAaT4 = bfm.AaT();
                    if (zA1S || objAaT4 == C78N.A00) {
                        objAaT4 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$4$1$1(g0v, str, hatchPublishBottomSheetState2);
                        BBI.A0T(bfm, objAaT4);
                    }
                    function0 = (Function0) objAaT4;
                    bbi = (BBI) bfm;
                    i2 = 0;
                    BBI.A0R(bbi, false);
                }
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A67(this.$navKey));
                PublishArtifactSheetKey publishArtifactSheetKey = this.$navKey;
                HatchPublishArtifactViewModel hatchPublishArtifactViewModel = this.$viewModel;
                Object objAaT5 = bfm.AaT();
                if (zA1T || objAaT5 == C78N.A00) {
                    objAaT5 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$5$1(publishArtifactSheetKey, hatchPublishArtifactViewModel);
                    BBI.A0O(bbi, objAaT5);
                }
                HatchPublishArtifactSheetKt.HasChangesPublishSheetContent(hatchSurface2, z2, z3, function03, function0, (Function0) objAaT5, bfm, i2);
            } else if (hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.UpToDate) {
                bfm.AgE(-1362228610);
                PublishArtifactSheetKey publishArtifactSheetKey2 = this.$navKey;
                HatchSurface hatchSurface3 = publishArtifactSheetKey2.surface;
                HatchPublishBottomSheetState.UpToDate upToDate = (HatchPublishBottomSheetState.UpToDate) this.$publishState;
                String fileName2 = upToDate.getFileName();
                String str2 = upToDate.url;
                boolean z4 = upToDate.isUnpublishing;
                boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$context, AnonymousClass001.A1T(bfm, this.$publishState, bfm.A67(publishArtifactSheetKey2)));
                PublishArtifactSheetKey publishArtifactSheetKey3 = this.$navKey;
                HatchPublishBottomSheetState hatchPublishBottomSheetState3 = this.$publishState;
                Context context = this.$context;
                Object objAaT6 = bfm.AaT();
                if (zA1T2 || objAaT6 == C78N.A00) {
                    objAaT6 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$6$1(publishArtifactSheetKey3, hatchPublishBottomSheetState3, context);
                    BBI.A0T(bfm, objAaT6);
                }
                Function0 function04 = (Function0) objAaT6;
                boolean zA1T3 = AnonymousClass001.A1T(bfm, this.$publishState, bfm.A65(this.$shareArtifact));
                G0V<String, String, Unit> g0v2 = this.$shareArtifact;
                HatchPublishBottomSheetState hatchPublishBottomSheetState4 = this.$publishState;
                Object objAaT7 = bfm.AaT();
                if (zA1T3 || objAaT7 == C78N.A00) {
                    objAaT7 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$7$1(g0v2, hatchPublishBottomSheetState4);
                    BBI.A0T(bfm, objAaT7);
                }
                Function0 function05 = (Function0) objAaT7;
                boolean zA1T4 = AnonymousClass001.A1T(bfm, this.$viewModel, bfm.A67(this.$navKey));
                PublishArtifactSheetKey publishArtifactSheetKey4 = this.$navKey;
                HatchPublishArtifactViewModel hatchPublishArtifactViewModel2 = this.$viewModel;
                Object objAaT8 = bfm.AaT();
                if (zA1T4 || objAaT8 == C78N.A00) {
                    objAaT8 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$8$1(publishArtifactSheetKey4, hatchPublishArtifactViewModel2);
                    BBI.A0T(bfm, objAaT8);
                }
                HatchPublishArtifactSheetKt.UpToDatePublishSheetContent(hatchSurface3, fileName2, str2, z4, function04, function05, (Function0) objAaT8, bfm, 0);
            } else if (hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.Success) {
                bfm.AgE(-1362200478);
                HatchSurface hatchSurface4 = this.$navKey.surface;
                String str3 = ((HatchPublishBottomSheetState.Success) this.$publishState).url;
                boolean zA1T5 = AnonymousClass001.A1T(bfm, this.$publishState, bfm.A65(this.$shareArtifact));
                G0V<String, String, Unit> g0v3 = this.$shareArtifact;
                HatchPublishBottomSheetState hatchPublishBottomSheetState5 = this.$publishState;
                Object objAaT9 = bfm.AaT();
                if (zA1T5 || objAaT9 == C78N.A00) {
                    objAaT9 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$9$1(g0v3, hatchPublishBottomSheetState5);
                    BBI.A0T(bfm, objAaT9);
                }
                Function0 function06 = (Function0) objAaT9;
                boolean zA652 = bfm.A65(this.$closeWithButton);
                G0U<HatchScreen, Unit> g0u2 = this.$closeWithButton;
                Object objAaT10 = bfm.AaT();
                if (zA652 || objAaT10 == C78N.A00) {
                    objAaT10 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$10$1(g0u2);
                    BBI.A0T(bfm, objAaT10);
                }
                HatchPublishArtifactSheetKt.PublishSuccessSheetContent(hatchSurface4, str3, function06, (Function0) objAaT10, bfm, 0);
            } else if (hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.Unpublished) {
                bfm.AgE(-1362190135);
                boolean zA653 = bfm.A65(this.$closeWithButton);
                G0U<HatchScreen, Unit> g0u3 = this.$closeWithButton;
                Object objAaT11 = bfm.AaT();
                if (zA653 || objAaT11 == C78N.A00) {
                    objAaT11 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$11$1(g0u3);
                    BBI.A0T(bfm, objAaT11);
                }
                HatchPublishArtifactSheetKt.UnpublishedPublishSheetContent((Function0) objAaT11, bfm, 0);
            } else {
                if (!(hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.Failed)) {
                    AnonymousClass004.A1A(bfm, -1362265503);
                    throw C3cG.A0q();
                }
                bfm.AgE(-1362185436);
                HatchSurface hatchSurface5 = this.$navKey.surface;
                boolean zA1Z = AnonymousClass002.A1Z(((HatchPublishBottomSheetState.Failed) this.$publishState).retryAction, HatchPublishBottomSheetState.RetryAction.UNPUBLISH);
                Object obj3 = this.$viewModel;
                boolean zA673 = bfm.A67(obj3);
                Object objAaT12 = bfm.AaT();
                if (zA673 || objAaT12 == C78N.A00) {
                    objAaT12 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$12$1(obj3);
                    BBI.A0T(bfm, objAaT12);
                }
                Function0 function07 = (Function0) ((InterfaceC7353EnQ) objAaT12);
                boolean zA654 = bfm.A65(this.$closeWithButton);
                G0U<HatchScreen, Unit> g0u4 = this.$closeWithButton;
                Object objAaT13 = bfm.AaT();
                if (zA654 || objAaT13 == C78N.A00) {
                    objAaT13 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$2$13$1(g0u4);
                    BBI.A0T(bfm, objAaT13);
                }
                HatchPublishArtifactSheetKt.FailedPublishSheetContent(hatchSurface5, zA1Z, function07, (Function0) objAaT13, bfm, 0);
            }
            AnonymousClass002.A19(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ PublishArtifactSheetKey $navKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PublishArtifactSheetKey publishArtifactSheetKey, int i) {
            super(2);
            this.$navKey = publishArtifactSheetKey;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishArtifactSheetKt.HatchPublishArtifactSheet(this.$navKey, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$LoadingPublishSheetContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119592 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $fileName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119592(String str, int i) {
            super(2);
            this.$fileName = str;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishArtifactSheetKt.LoadingPublishSheetContent(this.$fileName, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$PublishSheetDismissLogging$2, reason: invalid class name and case insensitive filesystem */
    public final class C119602 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AtomicBoolean $buttonClosed;
        public final /* synthetic */ PublishArtifactSheetKey $navKey;
        public final /* synthetic */ HatchPublishBottomSheetState $publishState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119602(PublishArtifactSheetKey publishArtifactSheetKey, HatchPublishBottomSheetState hatchPublishBottomSheetState, AtomicBoolean atomicBoolean, int i) {
            super(2);
            this.$navKey = publishArtifactSheetKey;
            this.$publishState = hatchPublishBottomSheetState;
            this.$buttonClosed = atomicBoolean;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishArtifactSheetKt.PublishSheetDismissLogging(this.$navKey, this.$publishState, this.$buttonClosed, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$PublishSuccessSheetContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119612 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onShare;
        public final /* synthetic */ HatchSurface $surface;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119612(HatchSurface hatchSurface, String str, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$surface = hatchSurface;
            this.$url = str;
            this.$onShare = function0;
            this.$onDismiss = function02;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishArtifactSheetKt.PublishSuccessSheetContent(this.$surface, this.$url, this.$onShare, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$PublishUrlRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C119622 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onCopy;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119622(String str, Function0<Unit> function0, int i) {
            super(2);
            this.$url = str;
            this.$onCopy = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishArtifactSheetKt.PublishUrlRow(this.$url, this.$onCopy, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$ReadyPublishSheetContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119632 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ boolean $isPublishing;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onPublish;
        public final /* synthetic */ HatchSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119632(HatchSurface hatchSurface, String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$surface = hatchSurface;
            this.$fileName = str;
            this.$isPublishing = z;
            this.$onPublish = function0;
            this.$onDismiss = function02;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishArtifactSheetKt.ReadyPublishSheetContent(this.$surface, this.$fileName, this.$isPublishing, this.$onPublish, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$UnpublishedPublishSheetContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119642 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119642(Function0<Unit> function0, int i) {
            super(2);
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishArtifactSheetKt.UnpublishedPublishSheetContent(this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$UpToDatePublishSheetContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119652 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ boolean $isUnpublishing;
        public final /* synthetic */ Function0<Unit> $onShare;
        public final /* synthetic */ Function0<Unit> $onUnpublish;
        public final /* synthetic */ Function0<Unit> $onView;
        public final /* synthetic */ HatchSurface $surface;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119652(HatchSurface hatchSurface, String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$surface = hatchSurface;
            this.$fileName = str;
            this.$url = str2;
            this.$isUnpublishing = z;
            this.$onView = function0;
            this.$onShare = function02;
            this.$onUnpublish = function03;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishArtifactSheetKt.UpToDatePublishSheetContent(this.$surface, this.$fileName, this.$url, this.$isUnpublishing, this.$onView, this.$onShare, this.$onUnpublish, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchPublishArtifactSheet(PublishArtifactSheetKey publishArtifactSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(publishArtifactSheetKey, 0);
        bfm.AgG(-1805204650);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, publishArtifactSheetKey) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            BBI bbi = (BBI) bfm;
            Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            HatchPublishArtifactViewModel.Factory factory = new HatchPublishArtifactViewModel.Factory(abstractC3358CGzA06, publishArtifactSheetKey.url, publishArtifactSheetKey.fileName, publishArtifactSheetKey.initialDeployedUrl, publishArtifactSheetKey.hasPendingChangesHint);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchPublishArtifactViewModel hatchPublishArtifactViewModel = (HatchPublishArtifactViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(HatchPublishArtifactViewModel.class));
            HatchPublishBottomSheetState hatchPublishBottomSheetState = (HatchPublishBottomSheetState) C1BO.A07(bfm, hatchPublishArtifactViewModel.uiState);
            boolean zA1V = AnonymousClass005.A1V(bfm, abstractC3358CGzA06, auraNavigatorA05, contextA00, bfm.A67(publishArtifactSheetKey));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$shareArtifact$1$1(publishArtifactSheetKey, auraNavigatorA05, abstractC3358CGzA06, contextA00);
                BBI.A0O(bbi, objAaT);
            }
            G0V g0v = (G0V) objAaT;
            Object[] objArr = new Object[0];
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$impressionKey$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            long jA05 = C3cG.A05(AFz.A03(bfm, (Function0) objAaT2, objArr));
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.CHAT, HatchSurface.CHAT, HatchSubsurface.ARTIFACT_SHARE_SHEET, HatchScreen.PUBLISH_CONFIRM, HatchComponent.ARTIFACT_SHARE_SHEET, null, null, null, 500L, 0.0f, FGI.A0B(jA05, "artifact_share_sheet:"), null, null);
                bfm.Ai0(objAaT3);
            }
            BRg bRg = (BRg) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new AtomicBoolean(false);
                bfm.Ai0(objAaT4);
            }
            AtomicBoolean atomicBoolean = (AtomicBoolean) objAaT4;
            boolean zA1S = AnonymousClass005.A1S(bfm, publishArtifactSheetKey, atomicBoolean, auraNavigatorA05);
            Object objAaT5 = bfm.AaT();
            if (zA1S || objAaT5 == obj) {
                objAaT5 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$closeWithButton$1$1(publishArtifactSheetKey, atomicBoolean, auraNavigatorA05);
                BBI.A0O(bbi, objAaT5);
            }
            G0U g0u = (G0U) objAaT5;
            PublishSheetDismissLogging(publishArtifactSheetKey, hatchPublishBottomSheetState, atomicBoolean, bfm, iA0T & 14);
            boolean zA67 = bfm.A67(auraNavigatorA05);
            Object objAaT6 = bfm.AaT();
            if (zA67 || objAaT6 == obj) {
                objAaT6 = new HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$1$1(auraNavigatorA05);
                BBI.A0O(bbi, objAaT6);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, bRg, AbstractC1103AYp.A00(0, bfm, 0, 1), null, null, null, (Function0) objAaT6, false, false, false, null, B1V.A00(bfm, new C119582(hatchPublishBottomSheetState, publishArtifactSheetKey, hatchPublishArtifactViewModel, g0u, contextA00, g0v), -1114265479), bfm, 54, 48, 1976);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(publishArtifactSheetKey, i);
        }
    }

    public static final void logPublishClick(HatchSurface hatchSurface, HatchScreen hatchScreen, HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(hatchSurface, HatchSubsurface.PUBLISH_SHEET, hatchScreen, hatchComponent, null, null, null);
    }

    public static final HatchScreen publishScreen(HatchPublishBottomSheetState hatchPublishBottomSheetState) {
        if ((hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.Loading) || (hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.Ready) || (hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.HasChanges)) {
            return HatchScreen.PUBLISH_CONFIRM;
        }
        if ((hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.UpToDate) || (hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.Success) || (hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.Unpublished)) {
            return HatchScreen.PUBLISH_SUCCESS;
        }
        if (hatchPublishBottomSheetState instanceof HatchPublishBottomSheetState.Failed) {
            return HatchScreen.PUBLISH_FAILED;
        }
        throw C3cG.A0q();
    }

    public static final void ArtifactShareButton(HatchSurface hatchSurface, HatchScreen hatchScreen, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(1850052015);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchSurface) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass005.A09(bfm, hatchScreen);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 147, 146), bfm, iA08)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba0);
            AuraLabelButtonStyle auraLabelButtonStylePrimaryAlt = AuraButtonStyles.INSTANCE.primaryAlt(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            C1062ATq c1062ATq = C10G.A02;
            boolean zA1B = AnonymousClass003.A1B(iA08) | AnonymousClass003.A1C(iA08) | AnonymousClass003.A1D(iA08);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new HatchPublishArtifactSheetKt$ArtifactShareButton$1$1(hatchSurface, hatchScreen, function0);
                BBI.A0T(bfm, objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimaryAlt, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchSurface, hatchScreen, function0, i);
        }
    }

    public static final void FailedPublishSheetContent(HatchSurface hatchSurface, boolean z, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(2002392532);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchSurface) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA08), bfm, iA08)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(c1062ATq, 24.0f);
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
            C01N.A08(bfm, bs0, 8.0f);
            int i2 = R.string._name_removed__res_0x7f120b9d;
            if (z) {
                i2 = R.string._name_removed__res_0x7f120bf3;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i2), null, colors.primaryText, typography.title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 8.0f);
            int i3 = R.string._name_removed__res_0x7f120b9c;
            if (z) {
                i3 = R.string._name_removed__res_0x7f120bf2;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i3), null, colors.secondaryText, typography.subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 24.0f);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b9f);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStylePrimaryAlt = auraButtonStyles.primaryAlt(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            boolean zA1F = AnonymousClass004.A1F(iA08) | AnonymousClass004.A1K(iA08);
            Object objAaT = bfm.AaT();
            if (zA1F || objAaT == C78N.A00) {
                objAaT = new HatchPublishArtifactSheetKt$FailedPublishSheetContent$1$1$1(hatchSurface, function0);
                BBI.A0O(bbi, objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimaryAlt, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            C01N.A08(bfm, bs0, 8.0f);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b98), null, c1062ATq, auraButtonStyles.tertiary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA08 << 3) & 57344, 0, 134201285);
            C01N.A04(bfm, bbi, bs0, 16.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119562(hatchSurface, z, function0, function02, i);
        }
    }

    public static final void HasChangesPublishSheetContent(HatchSurface hatchSurface, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i) {
        bfm.AgG(627539872);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchSurface) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0X(bfm, function02);
        }
        if ((196608 & i) == 0) {
            iA08 |= AnonymousClass004.A0Y(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA08), bfm, iA08)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0B = C3U4.A0B(c1062ATq, 24.0f, 0.0f);
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
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b9a), C3U4.A0B(bs0, 0.0f, 16.0f), colors.primaryText, typography.title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            C01N.A08(bfm, bs0, 24.0f);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b99);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStylePrimaryAlt = auraButtonStyles.primaryAlt(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            B1U b1uA00 = B1V.A00(bfm, new HatchPublishArtifactSheetKt$HasChangesPublishSheetContent$1$1(colors), -1849454114);
            int i2 = iA08 & 14;
            boolean zA1M = AnonymousClass004.A1M(iA08) | AnonymousClass003.A17(i2);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchPublishArtifactSheetKt$HasChangesPublishSheetContent$1$2$1(hatchSurface, function0);
                BBI.A0O(bbi, objAaT);
            }
            int i3 = iA08 >> 3;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimaryAlt, auraButtonSize, b1uA00, false, false, false, z, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 1772544, i3 & 14, 0, 134200197);
            C01N.A08(bfm, bs0, 8.0f);
            if (function02 != null) {
                bfm.AgE(214661929);
                ArtifactShareButton(hatchSurface, HatchScreen.PUBLISH_CONFIRM, function02, bfm, i2 | 48 | ((iA08 >> 6) & 896));
                C01N.A04(bfm, bbi, bs0, 8.0f, false);
            } else {
                bfm.AgE(214849324);
                BBI.A0R(bbi, false);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba5), null, c1062ATq, auraButtonStyles.destructive(null, bfm, 48, 1), auraButtonSize, null, false, false, !z2, false, false, null, null, function03, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, i3 & 57344, 0, 134200773);
            C01N.A04(bfm, bbi, bs0, 16.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119572(hatchSurface, z, z2, function0, function02, function03, i);
        }
    }

    public static final void LoadingPublishSheetContent(String str, BFM bfm, int i) {
        bfm.AgG(757350529);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            AuraColors colors = auraTheme.getColors(bfm, 6);
            BRg bRgA0B = C3U4.A0B(C10G.A02, 24.0f, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(16.0f), bfm, C2VU.A00, 54);
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
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120ba4), null, colors.primaryText, typography.title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119592(str, i);
        }
    }

    public static final void PublishSheetDismissLogging(PublishArtifactSheetKey publishArtifactSheetKey, HatchPublishBottomSheetState hatchPublishBottomSheetState, AtomicBoolean atomicBoolean, BFM bfm, int i) {
        bfm.AgG(-1644304670);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, publishArtifactSheetKey) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchPublishBottomSheetState, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, atomicBoolean);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            MutableState mutableStateA00 = C1er.A00(bfm, hatchPublishBottomSheetState);
            boolean zA1R = AnonymousClass001.A1R(bfm, mutableStateA00, AnonymousClass005.A1S(bfm, auraNavigatorA05, publishArtifactSheetKey, atomicBoolean));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchPublishArtifactSheetKt$PublishSheetDismissLogging$1$1(auraNavigatorA05, publishArtifactSheetKey, atomicBoolean, mutableStateA00);
                BBI.A0O(bbi, objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, auraNavigatorA05, publishArtifactSheetKey);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119602(publishArtifactSheetKey, hatchPublishBottomSheetState, atomicBoolean, i);
        }
    }

    public static final void PublishSuccessSheetContent(HatchSurface hatchSurface, String str, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(-1501395709);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchSurface) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 1171, 1170), bfm, iA08)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            BBI bbi = (BBI) bfm;
            C0fG c0fG = (C0fG) AKO.A07(Am0.A02, bbi);
            View view = (View) AKO.A07(AndroidCompositionLocals_androidKt.A05, bbi);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b9e);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(c1062ATq, 24.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
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
            C01N.A08(bfm, bs0, 8.0f);
            BRg bRgA03 = C1b8.A03(C10G.A07(bs0, 40.0f), C1D8.A00(8.0f), colors.background);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA03);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.aura_wand, 0), AuraIconSize.X_SMALL, null, colors.primaryIcon.enabled, null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
            C01N.A08(bfm, bs0, 16.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba1), null, colors.primaryText, typography.title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 8.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba3), null, colors.secondaryText, typography.subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 24.0f);
            int i2 = iA08 & 14;
            boolean zA1O = AnonymousClass003.A1O(bfm, view, strA01, bfm.A67(c0fG) | AnonymousClass003.A17(i2) | AnonymousClass003.A1C(iA08));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchPublishArtifactSheetKt$PublishSuccessSheetContent$1$2$1(hatchSurface, c0fG, str, view, strA01);
                BBI.A0O(bbi, objAaT);
            }
            PublishUrlRow(str, (Function0) objAaT, bfm, (iA08 >> 3) & 14);
            C01N.A08(bfm, bs0, 24.0f);
            ArtifactShareButton(hatchSurface, HatchScreen.PUBLISH_SUCCESS, function0, bfm, i2 | 48 | (iA08 & 896));
            C01N.A08(bfm, bs0, 8.0f);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b9b), null, c1062ATq, AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA08 << 3) & 57344, 0, 134201285);
            C01N.A04(bfm, bbi, bs0, 16.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119612(hatchSurface, str, function0, function02, i);
        }
    }

    public static final void PublishUrlRow(String str, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(1937831366);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            BBI bbi = (BBI) bfm;
            C0dx c0dx = (C0dx) AKO.A08(Am0.A08, BBI.A04(bbi));
            BS0 bs0 = BRg.A00;
            BRg bRgA0C = C3U4.A0C(C1b8.A03(C10G.A02, C1D8.A00(12.0f), colors.highlight), 16.0f, 4.0f, 4.0f, 4.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0W);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARK.A01(bs0, 1.0f, true), colors.secondaryText, typography.bodyRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14832);
            C01N.A09(bfm, bs0, 8.0f);
            BRg bRgA09 = C10G.A09(bs0, 48.0f, 48.0f);
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA67 = bfm.A67(c0dx) | AnonymousClass001.A1N(iA0d);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchPublishArtifactSheetKt$PublishUrlRow$1$1$1(function0, c0dx);
                BBI.A0O(bbi, objAaT);
            }
            BRg bRgA04 = C0v5.A04(bRgA09, c1ydA0A, null, (Function0) objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA04);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.copy_wght400_outline_24, 0), AuraIconSize.X_SMALL, null, colors.primaryIcon.enabled, null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119622(str, function0, i);
        }
    }

    public static final void ReadyPublishSheetContent(HatchSurface hatchSurface, String str, boolean z, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(1777663151);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchSurface) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0X(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 9363, 9362), bfm, iA08)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0B = C3U4.A0B(c1062ATq, 24.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120ba4), C3U4.A0B(bs0, 0.0f, 16.0f), colors.primaryText, typography.title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            C01N.A08(bfm, bs0, 24.0f);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b97);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStylePrimaryAlt = auraButtonStyles.primaryAlt(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            B1U b1uA00 = B1V.A00(bfm, new HatchPublishArtifactSheetKt$ReadyPublishSheetContent$1$1(colors), 864635629);
            boolean zA1M = AnonymousClass004.A1M(iA08) | AnonymousClass004.A1F(iA08);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchPublishArtifactSheetKt$ReadyPublishSheetContent$1$2$1(hatchSurface, function0);
                BBI.A0O(bbi, objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimaryAlt, auraButtonSize, b1uA00, false, false, false, z, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 1772544, (iA08 >> 6) & 14, 0, 134200197);
            C01N.A08(bfm, bs0, 8.0f);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b98), null, c1062ATq, auraButtonStyles.tertiary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, iA08 & 57344, 0, 134201285);
            C01N.A04(bfm, bbi, bs0, 16.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119632(hatchSurface, str, z, function0, function02, i);
        }
    }

    public static final void UnpublishedPublishSheetContent(Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(496808461);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(c1062ATq, 24.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
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
            C01N.A08(bfm, bs0, 8.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba2), null, colors.primaryText, typography.title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 8.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba6), null, colors.secondaryText, typography.subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 24.0f);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b9b), null, c1062ATq, AuraButtonStyles.INSTANCE.primaryAlt(null, bfm, 48, 1), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0T << 12) & 57344, 0, 134201285);
            C01N.A04(bfm, bbi, bs0, 16.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119642(function0, i);
        }
    }

    public static final void UpToDatePublishSheetContent(HatchSurface hatchSurface, String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i) {
        bfm.AgG(1907093633);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchSurface) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA08 |= AnonymousClass004.A0Y(bfm, function02);
        }
        if ((1572864 & i) == 0) {
            iA08 |= AnonymousClass004.A0Z(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA08, 599186), bfm, iA08)) {
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            BBI bbi = (BBI) bfm;
            C0fG c0fG = (C0fG) AKO.A07(Am0.A02, bbi);
            View view = (View) AKO.A07(AndroidCompositionLocals_androidKt.A05, bbi);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b9e);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0B = C3U4.A0B(c1062ATq, 24.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0B(bs0, 0.0f, 16.0f), colors.primaryText, typography.title3Emphasized, null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA08 >> 3) & 14) | 805306416, 6, 14832);
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            C01N.A08(bfm, bs0, 16.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba7), null, colors.secondaryText, typography.subheadlineEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 8.0f);
            int i2 = iA08 & 14;
            boolean zA1O = AnonymousClass003.A1O(bfm, view, strA01, AnonymousClass001.A1T(bfm, c0fG, AnonymousClass003.A17(i2)) | AnonymousClass004.A1K(iA08));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchPublishArtifactSheetKt$UpToDatePublishSheetContent$1$1$1(hatchSurface, c0fG, str2, view, strA01);
                BBI.A0O(bbi, objAaT);
            }
            int i3 = iA08 >> 6;
            PublishUrlRow(str2, (Function0) objAaT, bfm, i3 & 14);
            C01N.A08(bfm, bs0, 24.0f);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba8);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStylePrimaryAlt = auraButtonStyles.primaryAlt(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, c1062ATq, auraLabelButtonStylePrimaryAlt, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, iA08 & 57344, 0, 134201285);
            C01N.A08(bfm, bs0, 8.0f);
            ArtifactShareButton(hatchSurface, HatchScreen.PUBLISH_SUCCESS, function02, bfm, i2 | 48 | ((iA08 >> 9) & 896));
            C01N.A08(bfm, bs0, 8.0f);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba5), null, c1062ATq, auraButtonStyles.destructive(null, bfm, 48, 1), auraButtonSize, null, false, false, !z, false, false, null, null, function03, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, i3 & 57344, 0, 134200773);
            C01N.A04(bfm, bbi, bs0, 16.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119652(hatchSurface, str, str2, z, function0, function02, function03, i);
        }
    }

    public static final /* synthetic */ HatchPublishBottomSheetState access$PublishSheetDismissLogging$lambda$0(C1BO c1bo) {
        return (HatchPublishBottomSheetState) c1bo.getValue();
    }
}
