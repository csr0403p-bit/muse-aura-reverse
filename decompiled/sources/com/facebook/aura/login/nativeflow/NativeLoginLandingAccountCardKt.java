package com.facebook.aura.login.nativeflow;

import X.AGI;
import X.AKH;
import X.AKQ;
import X.AYD;
import X.AbstractC05192Wm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
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
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C08R;
import X.C0A8;
import X.C0Ig;
import X.C0M7;
import X.C0dm;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C14P;
import X.C1515AkP;
import X.C1731ApS;
import X.C1821Arl;
import X.C1AC;
import X.C1D8;
import X.C1DH;
import X.C1DM;
import X.C1Ls;
import X.C1YL;
import X.C1b8;
import X.C1er;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HxE;
import X.InterfaceC05151eP;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.gateway.connection.ConnectionReducerKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bouncy.AuraBouncyIndication;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.profilepicture.AuraProfilePictureKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.surface.AuraSurfaceKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginLandingAccountCardKt {
    public static final String INFO_ICON_INLINE_ID = "info_icon";
    public static final float INFO_ICON_PLACEHOLDER_SIZE = 20.0f;
    public static final float LANDING_FACE_SIZE = 40.0f;
    public static final float LANDING_FACE_STEP = 34.0f;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginChevronCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ G0W<C08R, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $loading;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0W<? super C08R, ? super BFM, ? super Integer, Unit> g0w, boolean z) {
            super(3);
            this.$content = g0w;
            this.$loading = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BS0 bs0 = BRg.A00;
                float f = AuraDimensKt.SpacingLarge;
                BRg bRgA0C = C3U4.A0C(bs0, f, f, AuraDimensKt.SpacingSmall, AuraDimensKt.SpacingMedium);
                C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingMicro);
                C1AC c1ac = C2VU.A04;
                G0W<C08R, BFM, Integer, Unit> g0w = this.$content;
                boolean z = this.$loading;
                InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A00, bfm, c1ac, 48);
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
                AnonymousClass001.A1G(C90m.A00, bfm, g0w, 6);
                if (z) {
                    bfm.AgE(1629569545);
                    AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bs0, AuraIconKt.auraIconSize(AuraIconSize.TINY, bfm, 6)), null, 0L, bfm, 0, 6);
                } else {
                    bfm.AgE(1629669117);
                    AnonymousClass007.A0y(bfm, AbstractC8407FdO.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_caret_right_outline_24), AuraIconSize.TINY, C06G.A09(bfm));
                }
                AnonymousClass003.A0q(bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginChevronCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<C08R, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function0<Unit> function0, boolean z, BRg bRg, boolean z2, G0W<? super C08R, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$onClick = function0;
            this.$enabled = z;
            this.$modifier = bRg;
            this.$loading = z2;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginLandingAccountCardKt.NativeLoginChevronCard(this.$onClick, this.$enabled, this.$modifier, this.$loading, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginLandingAccountCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C125322 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ boolean $clickable;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $multiMuseAccountTreatment;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onUseAnotherAccount;
        public final /* synthetic */ String $primaryActionText;
        public final /* synthetic */ boolean $showTransparency;
        public final /* synthetic */ boolean $singleAccountTreatment;
        public final /* synthetic */ boolean $singleSignupTreatment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125322(NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, int i, int i2, int i3) {
            super(2);
            this.$account = nativeLoginAccountUiModel;
            this.$onClick = function0;
            this.$onUseAnotherAccount = function02;
            this.$modifier = bRg;
            this.$loading = z;
            this.$clickable = z2;
            this.$singleAccountTreatment = z3;
            this.$singleSignupTreatment = z4;
            this.$multiMuseAccountTreatment = z5;
            this.$showTransparency = z6;
            this.$primaryActionText = str;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginLandingAccountCardKt.NativeLoginLandingAccountCard(this.$account, this.$onClick, this.$onUseAnotherAccount, this.$modifier, this.$loading, this.$clickable, this.$singleAccountTreatment, this.$singleSignupTreatment, this.$multiMuseAccountTreatment, this.$showTransparency, this.$primaryActionText, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginLandingAccountDetails$2, reason: invalid class name and case insensitive filesystem */
    public final class C125332 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ NativeLoginMuseProfileUiModel $museProfile;
        public final /* synthetic */ Function0<Unit> $onViewProfiles;
        public final /* synthetic */ boolean $showTransparency;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125332(NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function0, BRg bRg, NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, boolean z, boolean z2, int i, int i2) {
            super(2);
            this.$account = nativeLoginAccountUiModel;
            this.$onViewProfiles = function0;
            this.$modifier = bRg;
            this.$museProfile = nativeLoginMuseProfileUiModel;
            this.$enabled = z;
            this.$showTransparency = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            NativeLoginLandingAccountCardKt.NativeLoginLandingAccountDetails(this.$account, this.$onViewProfiles, this.$modifier, this.$museProfile, this.$enabled, this.$showTransparency, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginLandingFace$2, reason: invalid class name and case insensitive filesystem */
    public final class C125342 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginLinkedAccountUiModel $face;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125342(NativeLoginLinkedAccountUiModel nativeLoginLinkedAccountUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$face = nativeLoginLinkedAccountUiModel;
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
            NativeLoginLandingAccountCardKt.NativeLoginLandingFace(this.$face, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginLandingFace$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginLinkedAccountUiModel $face;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(NativeLoginLinkedAccountUiModel nativeLoginLinkedAccountUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$face = nativeLoginLinkedAccountUiModel;
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
            NativeLoginLandingAccountCardKt.NativeLoginLandingFace(this.$face, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginLandingFacepile$2, reason: invalid class name and case insensitive filesystem */
    public final class C125352 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ NativeLoginMuseProfileUiModel $museProfile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125352(NativeLoginAccountUiModel nativeLoginAccountUiModel, BRg bRg, NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, int i, int i2) {
            super(2);
            this.$account = nativeLoginAccountUiModel;
            this.$modifier = bRg;
            this.$museProfile = nativeLoginMuseProfileUiModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginLandingAccountCardKt.NativeLoginLandingFacepile(this.$account, this.$modifier, this.$museProfile, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginLandingFacepile$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ List<NativeLoginLinkedAccountUiModel> $faces;
        public final /* synthetic */ NativeLoginMuseProfileUiModel $museProfile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(NativeLoginAccountUiModel nativeLoginAccountUiModel, NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, List<NativeLoginLinkedAccountUiModel> list) {
            super(3);
            this.$account = nativeLoginAccountUiModel;
            this.$museProfile = nativeLoginMuseProfileUiModel;
            this.$faces = list;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
            invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
            int iA0d = i;
            C7384Etj.A0Y(c0Ig, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, c0Ig);
            }
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
                float fAHT = c0Ig.AHT();
                float f = NativeLoginLandingAccountCardKt.LANDING_FACE_SIZE;
                float f2 = NativeLoginLandingAccountCardKt.LANDING_FACE_STEP;
                int i2 = ((int) ((fAHT - f) / f2)) + 1;
                if (i2 < 1) {
                    i2 = 1;
                } else if (i2 > 7) {
                    i2 = 7;
                }
                int profileCount$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow = this.$account.getProfileCount$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow() + (AnonymousClass002.A1X(this.$museProfile) ? 1 : 0);
                int size = this.$faces.size();
                if (profileCount$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow > i2 || profileCount$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow > this.$faces.size()) {
                    i2--;
                }
                int iMin = Math.min(size, i2);
                int i3 = profileCount$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow - iMin;
                int i4 = (AnonymousClass002.A1N(i3) ? 1 : 0) + iMin;
                BS0 bs0 = BRg.A00;
                BRg bRgA08 = C10G.A08(bs0, f + ((i4 - 1) * f2));
                List<NativeLoginLinkedAccountUiModel> list = this.$faces;
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA08);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                if (i3 > 0) {
                    bfm.AgE(1302001385);
                    NativeLoginLandingAccountCardKt.NativeLoginLandingFacepileOverflow(i3, AYD.A01(bs0, f2 * iMin, 0.0f), bfm, 0, 0);
                } else {
                    bfm.AgE(1302158989);
                }
                BBI.A0R(bbi, false);
                bfm.AgE(457647538);
                for (int i5 = iMin - 1; -1 < i5; i5--) {
                    NativeLoginLandingAccountCardKt.NativeLoginLandingFace(list.get(i5), AYD.A01(bs0, f2 * i5, 0.0f), bfm, NativeLoginLinkedAccountUiModel.$stable, 0);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginLandingFacepile$5, reason: invalid class name and case insensitive filesystem */
    public final class C125365 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ NativeLoginMuseProfileUiModel $museProfile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125365(NativeLoginAccountUiModel nativeLoginAccountUiModel, BRg bRg, NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, int i, int i2) {
            super(2);
            this.$account = nativeLoginAccountUiModel;
            this.$modifier = bRg;
            this.$museProfile = nativeLoginMuseProfileUiModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginLandingAccountCardKt.NativeLoginLandingFacepile(this.$account, this.$modifier, this.$museProfile, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginLandingFacepileOverflow$2, reason: invalid class name and case insensitive filesystem */
    public final class C125372 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $count;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125372(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$count = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginLandingAccountCardKt.NativeLoginLandingFacepileOverflow(this.$count, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginPickerAccountCard$3, reason: invalid class name and case insensitive filesystem */
    public final class C125383 extends AbstractC7559F3s implements G0W<C08R, BFM, Integer, Unit> {
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ boolean $clickable;
        public final /* synthetic */ NativeLoginMuseProfileUiModel $museProfile;
        public final /* synthetic */ MutableState<Boolean> $sheetOpen$delegate;
        public final /* synthetic */ boolean $showTransparency;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125383(NativeLoginAccountUiModel nativeLoginAccountUiModel, NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, MutableState<Boolean> mutableState, boolean z, boolean z2) {
            super(3);
            this.$account = nativeLoginAccountUiModel;
            this.$museProfile = nativeLoginMuseProfileUiModel;
            this.$sheetOpen$delegate = mutableState;
            this.$clickable = z;
            this.$showTransparency = z2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C08R c08r, BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(c08r, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C08R c08r, BFM bfm, int i) throws Resources.NotFoundException {
            int iA0d = i;
            C7384Etj.A0Y(c08r, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, c08r);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                BRg bRgAiP = c08r.AiP(BRg.A00, 1.0f, true);
                C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingSmall);
                NativeLoginAccountUiModel nativeLoginAccountUiModel = this.$account;
                NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel = this.$museProfile;
                MutableState<Boolean> mutableState = this.$sheetOpen$delegate;
                boolean z = this.$clickable;
                boolean z2 = this.$showTransparency;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgAiP);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                int i2 = NativeLoginAccountUiModel.$stable;
                int i3 = NativeLoginMuseProfileUiModel.$stable;
                NativeLoginLandingAccountCardKt.NativeLoginLandingFacepile(nativeLoginAccountUiModel, null, nativeLoginMuseProfileUiModel, bfm, i2 | (i3 << 6), 2);
                boolean zA65 = bfm.A65(mutableState);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new NativeLoginLandingAccountCardKt$NativeLoginPickerAccountCard$3$1$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                NativeLoginLandingAccountCardKt.NativeLoginLandingAccountDetails(nativeLoginAccountUiModel, (Function0) objAaT, null, nativeLoginMuseProfileUiModel, z, z2, bfm, i2 | (i3 << 9), 4);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginPickerAccountCard$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ boolean $clickable;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ NativeLoginMuseProfileUiModel $museProfile;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onUseAnotherAccount;
        public final /* synthetic */ String $primaryActionText;
        public final /* synthetic */ boolean $showTransparency;
        public final /* synthetic */ boolean $singleSignupTreatment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(NativeLoginAccountUiModel nativeLoginAccountUiModel, NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, boolean z2, boolean z3, boolean z4, String str, int i, int i2) {
            super(2);
            this.$account = nativeLoginAccountUiModel;
            this.$museProfile = nativeLoginMuseProfileUiModel;
            this.$onClick = function0;
            this.$onUseAnotherAccount = function02;
            this.$modifier = bRg;
            this.$loading = z;
            this.$clickable = z2;
            this.$singleSignupTreatment = z3;
            this.$showTransparency = z4;
            this.$primaryActionText = str;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginLandingAccountCardKt.NativeLoginPickerAccountCard(this.$account, this.$museProfile, this.$onClick, this.$onUseAnotherAccount, this.$modifier, this.$loading, this.$clickable, this.$singleSignupTreatment, this.$showTransparency, this.$primaryActionText, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginSingleMuseAccountContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C125392 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ String $accountLabel;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ NativeLoginMuseProfileUiModel $profile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125392(NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, String str, boolean z, boolean z2, Function0<Unit> function0) {
            super(3);
            this.$profile = nativeLoginMuseProfileUiModel;
            this.$accountLabel = str;
            this.$enabled = z;
            this.$loading = z2;
            this.$onClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA09 = C3U4.A09(c1062ATq, AuraDimensKt.SpacingLarge);
                C3TH c3th = C2VU.A00;
                NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel = this.$profile;
                String str = this.$accountLabel;
                boolean z = this.$enabled;
                boolean z2 = this.$loading;
                Function0<Unit> function0 = this.$onClick;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA09);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                String str2 = nativeLoginMuseProfileUiModel.photoUrl;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = NativeLoginLandingAccountCardKt$NativeLoginSingleMuseAccountContent$2$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraProfilePictureKt.m2594AuraProfilePictured7e1vww(str2, 96.0f, AnonymousClass001.A0X(bs0, objAaT), C1er.A00(bfm, new B6A(C06G.A0B(bfm))), null, null, null, null, null, null, 2.0f, bfm, 48, 6, 1008);
                C01N.A05(bfm, bs0);
                AuraTextKt.m2639AuraTextUY9GdpU(nativeLoginMuseProfileUiModel.name, null, C06G.A0C(bfm), C06G.A0W(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), C01N.A01(bfm, bs0, AuraDimensKt.SpacingMicro).footnoteRegular, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
                C01N.A06(bfm, bs0);
                AuraButtonKt.m2408AuraButtonnL3aKkM("lobster-native-auth-single-account-login", AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12051e), null, AnonymousClass001.A0U(c1062ATq, NativeLoginCommonKt.MIN_TOUCH_TARGET), null, null, null, false, false, z, z2, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 6, 0, 0, 134199796);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginSingleMuseAccountContent$3, reason: invalid class name and case insensitive filesystem */
    public final class C125403 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $accountLabel;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ NativeLoginMuseProfileUiModel $profile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125403(NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, String str, Function0<Unit> function0, BRg bRg, boolean z, boolean z2, int i, int i2) {
            super(2);
            this.$profile = nativeLoginMuseProfileUiModel;
            this.$accountLabel = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$loading = z;
            this.$enabled = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginLandingAccountCardKt.NativeLoginSingleMuseAccountContent(this.$profile, this.$accountLabel, this.$onClick, this.$modifier, this.$loading, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginSingleSignupAccountContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ Function0<Unit> $onSignUp;
        public final /* synthetic */ Function0<Unit> $onViewProfiles;
        public final /* synthetic */ String $primaryActionText;
        public final /* synthetic */ boolean $showTransparency;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z, boolean z2, Function0<Unit> function0, NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function02, boolean z3) {
            super(3);
            this.$primaryActionText = str;
            this.$enabled = z;
            this.$loading = z2;
            this.$onSignUp = function0;
            this.$account = nativeLoginAccountUiModel;
            this.$onViewProfiles = function02;
            this.$showTransparency = z3;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) throws Resources.NotFoundException {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                float f = AuraDimensKt.SpacingMedium;
                BRg bRgA09 = C3U4.A09(c1062ATq, f);
                String strA01 = this.$primaryActionText;
                boolean z = this.$enabled;
                boolean z2 = this.$loading;
                Function0<Unit> function0 = this.$onSignUp;
                NativeLoginAccountUiModel nativeLoginAccountUiModel = this.$account;
                Function0<Unit> function02 = this.$onViewProfiles;
                boolean z3 = this.$showTransparency;
                InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
                C3TH c3th = C2VU.A02;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA09);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                float f2 = AuraDimensKt.SpacingXsmall;
                BRg bRgA0C = C3U4.A0C(C3U4.A0B(c1062ATq, f2, 0.0f), 0.0f, f2, 0.0f, 0.0f);
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, f, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0C);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                int i3 = NativeLoginAccountUiModel.$stable;
                NativeLoginLandingAccountCardKt.NativeLoginLandingFacepile(nativeLoginAccountUiModel, null, null, bfm, i3, 6);
                NativeLoginLandingAccountCardKt.NativeLoginLandingAccountDetails(nativeLoginAccountUiModel, function02, null, null, z, z3, bfm, i3, 12);
                BBI.A0R(bbi, true);
                C01N.A08(bfm, bs0, AuraDimensKt.SpacingLargePlusMicro);
                if (strA01 == null) {
                    bfm.AgE(2037258422);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12052b);
                } else {
                    bfm.AgE(2037257213);
                }
                BBI.A0R(bbi, false);
                AuraButtonKt.m2408AuraButtonnL3aKkM("lobster-native-auth-single-account-signup", strA01, null, AnonymousClass001.A0U(c1062ATq, NativeLoginCommonKt.MIN_TOUCH_TARGET), null, null, null, false, false, z, z2, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 6, 0, 0, 134199796);
                C01N.A04(bfm, bbi, bs0, f2, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginSingleSignupAccountContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C125412 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSignUp;
        public final /* synthetic */ Function0<Unit> $onViewProfiles;
        public final /* synthetic */ String $primaryActionText;
        public final /* synthetic */ boolean $showTransparency;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125412(NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, boolean z2, boolean z3, String str, int i, int i2) {
            super(2);
            this.$account = nativeLoginAccountUiModel;
            this.$onSignUp = function0;
            this.$onViewProfiles = function02;
            this.$modifier = bRg;
            this.$loading = z;
            this.$enabled = z2;
            this.$showTransparency = z3;
            this.$primaryActionText = str;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginLandingAccountCardKt.NativeLoginSingleSignupAccountContent(this.$account, this.$onSignUp, this.$onViewProfiles, this.$modifier, this.$loading, this.$enabled, this.$showTransparency, this.$primaryActionText, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt$NativeLoginSubtitleWithInfoIcon$2, reason: invalid class name and case insensitive filesystem */
    public final class C125422 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onViewProfiles;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125422(String str, Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$subtitle = str;
            this.$onViewProfiles = function0;
            this.$enabled = z;
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
            NativeLoginLandingAccountCardKt.NativeLoginSubtitleWithInfoIcon(this.$subtitle, this.$onViewProfiles, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchAccountStatus.values().length];
            try {
                AnonymousClass002.A13(HatchAccountStatus.ACTIVE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchAccountStatus.DEACTIVATED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchAccountStatus.SCHEDULED_FOR_DELETION, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void NativeLoginChevronCard(Function0<Unit> function0, boolean z, BRg bRg, boolean z2, G0W<? super C08R, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        boolean z3 = z2;
        BRg bRg2 = bRg;
        AnonymousClass002.A1C(function0, 0, g0w);
        bfm.AgG(-363811190);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = false;
            }
            long jA0B = C06G.A0B(bfm);
            C1DM c1dmA0R = C06G.A0R(bfm);
            C1DH c1dhA00 = C0M7.A00(1.0f, AnonymousClass002.A0c(bfm).border);
            AuraBouncyIndication auraBouncyIndication = new AuraBouncyIndication(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
            boolean zA64 = bfm.A64(jA0B);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                objAaT = new NativeLoginLandingAccountCardKt$NativeLoginChevronCard$1$1(jA0B);
                bfm.Ai0(objAaT);
            }
            AuraSurfaceKt.m2624AuraSurfaceWiQJ_vM(bRg2, c1dmA0R, false, (Function0) objAaT, null, 0L, c1dhA00, function0, null, null, null, null, auraBouncyIndication, z, B1V.A00(bfm, new AnonymousClass2(g0w, z3), -1521734587), bfm, AnonymousClass001.A0C(iA0T << 21, (iA0T >> 6) & 14), ((iA0T << 6) & 7168) | RuntimeInternals.IOPRIO_BACKGROUND, 3892);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(function0, z, bRg2, z3, g0w, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginLandingAccountCard(com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel r28, kotlin.jvm.functions.Function0<kotlin.Unit> r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, X.BRg r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, java.lang.String r38, X.BFM r39, int r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt.NativeLoginLandingAccountCard(com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginLandingAccountDetails(com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel r30, kotlin.jvm.functions.Function0<kotlin.Unit> r31, X.BRg r32, com.facebook.aura.login.nativeflow.NativeLoginMuseProfileUiModel r33, boolean r34, boolean r35, X.BFM r36, int r37, int r38) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt.NativeLoginLandingAccountDetails(com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel, kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.login.nativeflow.NativeLoginMuseProfileUiModel, boolean, boolean, X.BFM, int, int):void");
    }

    public static final void NativeLoginLandingFace(NativeLoginLinkedAccountUiModel nativeLoginLinkedAccountUiModel, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass5;
        BRg bRg2 = bRg;
        bfm.AgG(244011206);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginLinkedAccountUiModel, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            MutableState mutableStateA00 = C1er.A00(bfm, new B6A(C06G.A0K(bfm, akh)));
            AuraDrawableSource auraDrawableSourceLinkedAccountBadge = NativeLoginAccountRowKt.linkedAccountBadge(nativeLoginLinkedAccountUiModel.platform);
            String str = nativeLoginLinkedAccountUiModel.photoUrl;
            if (str == null) {
                str = "";
            }
            if (auraDrawableSourceLinkedAccountBadge == null && !C7BY.A0j(str)) {
                bfm.AgE(-2041473082);
                float f = LANDING_FACE_SIZE;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = NativeLoginLandingAccountCardKt$NativeLoginLandingFace$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraProfilePictureKt.m2594AuraProfilePictured7e1vww(str, f, AnonymousClass001.A0X(bRg2, objAaT), mutableStateA00, null, null, null, null, null, null, 2.0f, bfm, 48, 6, 1008);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass5 = new C125342(nativeLoginLinkedAccountUiModel, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass5;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -2041236676);
            float f2 = LANDING_FACE_SIZE;
            BRg bRgA07 = C10G.A07(bRg2, f2);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = NativeLoginLandingAccountCardKt$NativeLoginLandingFace$3$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0X = AnonymousClass001.A0X(bRgA07, objAaT2);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0X);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            if (C7BY.A0j(str)) {
                bfm.AgE(895037302);
                C01N.A07(bfm, C1b8.A03(C10G.A07(BRg.A00, f2), C1D8.A00, AnonymousClass001.A0f(bfm, akh).avatarBorder));
            } else {
                bfm.AgE(895172338);
                AuraProfilePictureKt.m2594AuraProfilePictured7e1vww(str, f2, null, mutableStateA00, null, null, null, null, null, null, 2.0f, bfm, 48, 6, ConnectionReducerKt.SERVICE_NOTICE_CODE_RESTART);
            }
            BBI.A0R(bbiA0M, false);
            if (auraDrawableSourceLinkedAccountBadge != null) {
                bfm.AgE(895401087);
                AuraImageKt.AuraImage(auraDrawableSourceLinkedAccountBadge, C3U4.A09(C1b8.A03(C10G.A07(c0z7.A4C(C2VU.A07, BRg.A00), 20.0f), C1D8.A00, ((B6A) mutableStateA00.getValue()).A00), 2.0f), null, null, false, false, null, false, null, bfm, 384, 504);
            } else {
                bfm.AgE(895675158);
            }
            AnonymousClass003.A0q(bbiA0M);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(nativeLoginLinkedAccountUiModel, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Type inference failed for: r20v0, types: [X.BFM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.AHD<com.facebook.aura.login.nativeflow.NativeLoginLinkedAccountUiModel>] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginLandingFacepile(com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel r17, X.BRg r18, com.facebook.aura.login.nativeflow.NativeLoginMuseProfileUiModel r19, X.BFM r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginLandingAccountCardKt.NativeLoginLandingFacepile(com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel, X.BRg, com.facebook.aura.login.nativeflow.NativeLoginMuseProfileUiModel, X.BFM, int, int):void");
    }

    public static final void NativeLoginLandingFacepileOverflow(int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1399150922);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA03 = C1b8.A03(C10G.A07(bRg2, LANDING_FACE_SIZE), C1D8.A00, AnonymousClass002.A0c(bfm).avatarBorder);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, Integer.valueOf(i), R.string._name_removed__res_0x7f1204ce), null, C06G.A08(bfm), AnonymousClass002.A0f(bfm).footnoteMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125372(i, bRg2, i2, i3);
        }
    }

    public static final void NativeLoginPickerAccountCard(NativeLoginAccountUiModel nativeLoginAccountUiModel, NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, boolean z2, boolean z3, boolean z4, String str, BFM bfm, int i, int i2) {
        BBI bbi;
        boolean z5;
        BRg bRgA0Y;
        BRg bRg2 = bRg;
        boolean z6 = z;
        boolean z7 = z2;
        boolean z8 = z3;
        boolean z9 = z4;
        String str2 = str;
        bfm.AgG(704391657);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginAccountUiModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(nativeLoginMuseProfileUiModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function02);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i4 = i2 & 32;
        int iA0s = 196608;
        if (i4 != 0) {
            iA05 |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z6);
            iA05 |= iA0s;
        }
        int i5 = i2 & 64;
        int iA0t = 1572864;
        if (i5 != 0) {
            iA05 |= iA0t;
        } else if ((1572864 & i) == 0) {
            iA0t = AnonymousClass004.A0t(bfm, z7);
            iA05 |= iA0t;
        }
        int i6 = i2 & 128;
        int iA0u = 12582912;
        if (i6 != 0) {
            iA05 |= iA0u;
        } else if ((12582912 & i) == 0) {
            iA0u = AnonymousClass004.A0u(bfm, z8);
            iA05 |= iA0u;
        }
        int i7 = i2 & 256;
        int iA0v = 100663296;
        if (i7 != 0) {
            iA05 |= iA0v;
        } else if ((100663296 & i) == 0) {
            i7 = 0;
            iA0v = AnonymousClass004.A0v(bfm, z9);
            iA05 |= iA0v;
        }
        int i8 = i2 & 512;
        int iA0m = 805306368;
        if (i8 != 0) {
            iA05 |= iA0m;
        } else if ((805306368 & i) == 0) {
            i8 = 0;
            iA0m = AnonymousClass004.A0m(bfm, str2);
            iA05 |= iA0m;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1I(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z6 = false;
            }
            if (i5 != 0) {
                z7 = true;
            }
            if (i6 != 0) {
                z8 = false;
            }
            if (i7 != 0) {
                z9 = false;
            }
            if (i8 != 0) {
                str2 = null;
            }
            Object[] objArr = {nativeLoginAccountUiModel.id};
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = NativeLoginLandingAccountCardKt$NativeLoginPickerAccountCard$sheetOpen$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            Boolean boolValueOf = Boolean.valueOf(z7);
            Boolean boolValueOf2 = Boolean.valueOf(z9);
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA0N, AnonymousClass002.A1Q(iA05 & 3670016, 1048576), AnonymousClass005.A1F(iA05));
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == obj) {
                objAaT2 = new NativeLoginLandingAccountCardKt$NativeLoginPickerAccountCard$1$1(z7, z9, mutableStateA0N);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A19(bfm, objAaT2, boolValueOf, boolValueOf2);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12051b);
            BRg bRgA00 = AbstractC05192Wm.A00(AnonymousClass005.A0O(), bRg2);
            if (z6) {
                bfm.AgE(-677542739);
                BS0 bs0 = BRg.A00;
                boolean zA65 = bfm.A65(strA01);
                Object objAaT3 = bfm.AaT();
                if (zA65 || objAaT3 == obj) {
                    objAaT3 = new NativeLoginLandingAccountCardKt$NativeLoginPickerAccountCard$cardModifier$1$1(strA01);
                    bfm.Ai0(objAaT3);
                }
                bRgA0Y = AnonymousClass001.A0Y(bs0, objAaT3, false);
                bbi = (BBI) bfm;
                z5 = false;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-677370193);
                bbi = (BBI) bfm;
                z5 = false;
                BBI.A0R(bbi, false);
                bRgA0Y = BRg.A00;
            }
            BRg bRgThen = bRgA00.then(bRgA0Y);
            if (z8) {
                boolean zA1Y = AnonymousClass001.A1Y(mutableStateA0N, bfm, -677276728);
                Object objAaT4 = bfm.AaT();
                if (zA1Y || objAaT4 == obj) {
                    objAaT4 = new NativeLoginLandingAccountCardKt$NativeLoginPickerAccountCard$2$1(mutableStateA0N);
                    bfm.Ai0(objAaT4);
                }
                int i9 = iA05 >> 3;
                int iA08 = AnonymousClass001.A08(i9, AnonymousClass001.A0B(i9, NativeLoginAccountUiModel.$stable | (iA05 & 14) | (i9 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)));
                int i10 = iA05 >> 6;
                NativeLoginSingleSignupAccountContent(nativeLoginAccountUiModel, function0, (Function0) objAaT4, bRgThen, z6, z7, z9, str2, bfm, AnonymousClass001.A0C(i10, AnonymousClass001.A05(i10, iA08)), 0);
            } else {
                bfm.AgE(-676927048);
                int i11 = iA05 >> 6;
                NativeLoginChevronCard(function0, z7, bRgThen, z6, B1V.A00(bfm, new C125383(nativeLoginAccountUiModel, nativeLoginMuseProfileUiModel, mutableStateA0N, z7, z9), 840355411), bfm, (i11 & 14) | RuntimeInternals.IOPRIO_BACKGROUND | ((iA05 >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i11 & 7168), 0);
            }
            BBI.A0R(bbi, false);
            if (MutableState.A0A(mutableStateA0N) && z9 && z7) {
                boolean zA1Y2 = AnonymousClass001.A1Y(mutableStateA0N, bfm, -676251155) | AnonymousClass004.A1K(iA05);
                Object objAaT5 = bfm.AaT();
                if (zA1Y2 || objAaT5 == obj) {
                    objAaT5 = new NativeLoginLandingAccountCardKt$NativeLoginPickerAccountCard$4$1(function0, mutableStateA0N);
                    bfm.Ai0(objAaT5);
                }
                Function0 function03 = (Function0) objAaT5;
                boolean zA652 = bfm.A65(mutableStateA0N) | ((iA05 & 7168) == 2048);
                Object objAaT6 = bfm.AaT();
                if (zA652 || objAaT6 == obj) {
                    objAaT6 = new NativeLoginLandingAccountCardKt$NativeLoginPickerAccountCard$5$1(function02, mutableStateA0N);
                    bfm.Ai0(objAaT6);
                }
                Function0 function04 = (Function0) objAaT6;
                boolean zA653 = bfm.A65(mutableStateA0N);
                Object objAaT7 = bfm.AaT();
                if (zA653 || objAaT7 == obj) {
                    objAaT7 = new NativeLoginLandingAccountCardKt$NativeLoginPickerAccountCard$6$1(mutableStateA0N);
                    bfm.Ai0(objAaT7);
                }
                NativeLoginTransparencySheetKt.NativeLoginTransparencySheet(nativeLoginAccountUiModel, function03, function04, (Function0) objAaT7, null, bfm, (iA05 & 14) | NativeLoginAccountUiModel.$stable, 16);
            } else {
                bfm.AgE(-675962855);
            }
            BBI.A0R(bbi, z5);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass7(nativeLoginAccountUiModel, nativeLoginMuseProfileUiModel, function0, function02, bRg2, z6, z7, z8, z9, str2, i, i2);
        }
    }

    public static final void NativeLoginSingleMuseAccountContent(NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, String str, Function0<Unit> function0, BRg bRg, boolean z, boolean z2, BFM bfm, int i, int i2) {
        BRg bRgA0Y;
        BRg bRg2 = bRg;
        boolean z3 = z;
        boolean z4 = z2;
        bfm.AgG(19525938);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginMuseProfileUiModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z3);
        }
        int i5 = i2 & 32;
        int iA0s = 196608;
        if (i5 != 0) {
            iA05 |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z4);
            iA05 |= iA0s;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = false;
            }
            if (i5 != 0) {
                z4 = true;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12051b);
            BRg bRgA00 = AbstractC05192Wm.A00(AnonymousClass005.A0O(), bRg2);
            if (z3) {
                bfm.AgE(1877085360);
                BS0 bs0 = BRg.A00;
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new NativeLoginLandingAccountCardKt$NativeLoginSingleMuseAccountContent$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                bRgA0Y = AnonymousClass001.A0Y(bs0, objAaT, false);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, 1877277374);
                bRgA0Y = BRg.A00;
            }
            BRg bRgThen = bRgA00.then(bRgA0Y);
            C1DM c1dmA0R = C06G.A0R(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraSurfaceKt.m2623AuraSurface1esR5Hs(bRgThen, c1dmA0R, false, C06G.A0K(bfm, akh), null, 0L, C0M7.A00(1.0f, C06G.A0E(bfm, akh)), false, B1V.A00(bfm, new C125392(nativeLoginMuseProfileUiModel, str, z4, z3, function0), -69274030), bfm, 100663296, 180);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125403(nativeLoginMuseProfileUiModel, str, function0, bRg2, z3, z4, i, i2);
        }
    }

    public static final void NativeLoginSingleSignupAccountContent(NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, boolean z, boolean z2, boolean z3, String str, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z4 = z;
        boolean z5 = z2;
        boolean z6 = z3;
        String str2 = str;
        bfm.AgG(-913296834);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginAccountUiModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z4);
        }
        int i5 = i2 & 32;
        int iA0s = 196608;
        if (i5 != 0) {
            iA05 |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z5);
            iA05 |= iA0s;
        }
        int i6 = i2 & 64;
        int iA0t = 1572864;
        if (i6 != 0) {
            iA05 |= iA0t;
        } else if ((1572864 & i) == 0) {
            iA0t = AnonymousClass004.A0t(bfm, z6);
            iA05 |= iA0t;
        }
        int i7 = i2 & 128;
        int iA0k = 12582912;
        if (i7 != 0) {
            iA05 |= iA0k;
        } else if ((i & 12582912) == 0) {
            i7 = 0;
            iA0k = AnonymousClass004.A0k(bfm, str2);
            iA05 |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z4 = false;
            }
            if (i5 != 0) {
                z5 = true;
            }
            if (i6 != 0) {
                z6 = false;
            }
            if (i7 != 0) {
                str2 = null;
            }
            C1DM c1dmA0R = C06G.A0R(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraSurfaceKt.m2623AuraSurface1esR5Hs(bRg2, c1dmA0R, false, C06G.A0K(bfm, akh), null, 0L, C0M7.A00(1.0f, C06G.A0E(bfm, akh)), false, B1V.A00(bfm, new AnonymousClass1(str2, z5, z4, function0, nativeLoginAccountUiModel, function02, z6), 550958942), bfm, ((iA05 >> 9) & 14) | 100663296, 180);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125412(nativeLoginAccountUiModel, function0, function02, bRg2, z4, z5, z6, str2, i, i2);
        }
    }

    public static final void NativeLoginSubtitleWithInfoIcon(String str, Function0<Unit> function0, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1692291945);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
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
            long jAh7 = ((C0dm) bfm.A6v(Am0.A04)).Ah7(INFO_ICON_PLACEHOLDER_SIZE);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120546);
            long jA08 = C06G.A08(bfm);
            boolean zA1R = AnonymousClass001.A1R(bfm, strA01, bfm.A64(jAh7)) | bfm.A64(jA08) | AnonymousClass003.A1C(iA0d) | AnonymousClass003.A1D(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = AGI.A0G(new HxE(INFO_ICON_INLINE_ID, new C14P(new C1821Arl(jAh7, jAh7, 7), B1V.A01(new NativeLoginLandingAccountCardKt$NativeLoginSubtitleWithInfoIcon$inlineContent$1$1(strA01, function0, z, jA08), -1314721753, true))));
                bfm.Ai0(objAaT);
            }
            C1731ApS c1731ApSA0X = AnonymousClass006.A0X(str);
            c1731ApSA0X.A00.append(' ');
            C1Ls.A00(c1731ApSA0X, INFO_ICON_INLINE_ID, "\ufffd");
            AuraTextKt.m2640AuraTextVmYn7U0(c1731ApSA0X.A04(), bRg2, jA08, C06G.A0Z(bfm), null, null, null, 0L, false, 0, 0, 0, null, null, (BO6) objAaT, bfm, (iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125422(str, function0, z, bRg2, i, i2);
        }
    }

    public static final Integer labelRes(HatchAccountStatus hatchAccountStatus) {
        int i;
        int iOrdinal = hatchAccountStatus.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            i = R.string._name_removed__res_0x7f120491;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string._name_removed__res_0x7f120492;
        }
        return Integer.valueOf(i);
    }
}
