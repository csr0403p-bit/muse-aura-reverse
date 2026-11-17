package com.facebook.aura.email.view;

import X.AFz;
import X.AKH;
import X.AKQ;
import X.AbstractC07539Wl;
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
import X.B1V;
import X.B6A;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0n6;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DM;
import X.C1YD;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.email.model.EmailMailbox;
import com.facebook.aura.email.model.EmailSettingsCopy;
import com.facebook.aura.email.repo.EmailRepository;
import com.facebook.aura.email.viewmodel.EmailError;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.view.RecipientPermissionsEntryKt;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailSettingsScreenKt {
    public static final String EMAIL_ADDRESS_CLIP_LABEL = "email_address";

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailCreateButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EmailViewModel emailViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$model = emailViewModel;
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
            EmailSettingsScreenKt.EmailCreateButton(this.$model, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailCreateButton$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(EmailViewModel emailViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$model = emailViewModel;
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
            EmailSettingsScreenKt.EmailCreateButton(this.$model, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailDeleteMailboxSection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Boolean> $confirming$delegate;
        public final /* synthetic */ String $deleteLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<Boolean> mutableState, String str) {
            super(3);
            this.$confirming$delegate = mutableState;
            this.$deleteLabel = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                C1822Arm c1822ArmA0T = C06G.A0T(bfm);
                long j = AnonymousClass002.A0c(bfm).errorText;
                BRg bRgA0U = AnonymousClass001.A0U(C10G.A02, 56.0f);
                C1YD c1yd = new C1YD(0);
                boolean zA65 = bfm.A65(this.$confirming$delegate);
                MutableState<Boolean> mutableState = this.$confirming$delegate;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new EmailSettingsScreenKt$EmailDeleteMailboxSection$1$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(this.$deleteLabel, C10G.A01(C2VU.A04, C3U4.A07(C0v5.A02(bRgA0U, c1yd, objAaT, null), 16.0f), false), j, c1822ArmA0T, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailDeleteMailboxSection$4, reason: invalid class name and case insensitive filesystem */
    public final class C117964 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $address;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<String, String, Unit> $onDelete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C117964(String str, String str2, BRg bRg, G0V<? super String, ? super String, Unit> g0v, int i, int i2) {
            super(2);
            this.$environmentId = str;
            this.$address = str2;
            this.$modifier = bRg;
            this.$onDelete = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailSettingsScreenKt.EmailDeleteMailboxSection(this.$environmentId, this.$address, this.$modifier, this.$onDelete, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailDeletingOverlay$2, reason: invalid class name and case insensitive filesystem */
    public final class C117972 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117972(BRg bRg, String str) {
            super(2);
            this.$modifier = bRg;
            this.$label = str;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                BRg bRg = this.$modifier;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = EmailSettingsScreenKt$EmailDeletingOverlay$2$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0Y = AnonymousClass001.A0Y(bRg, objAaT, true);
                C3TH c3th = C2VU.A00;
                C9m9 c9m9A00 = AcQ.A00(12.0f);
                String strA01 = this.$label;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 54);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, AnonymousClass002.A0c(bfm).onMedia, bfm, 0, 3);
                if (strA01 == null) {
                    bfm.AgE(1341844110);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120958);
                } else {
                    bfm.AgE(1341843831);
                }
                BBI.A0R(bbi, false);
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, AnonymousClass002.A0c(bfm).onMedia, C06G.A0W(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailDeletingOverlay$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, String str, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$label = str;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailSettingsScreenKt.EmailDeletingOverlay(this.$modifier, this.$label, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailEditText$2, reason: invalid class name and case insensitive filesystem */
    public final class C117982 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ C1822Arm $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117982(String str, C1822Arm c1822Arm, Function0<Unit> function0, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$label = str;
            this.$style = c1822Arm;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailSettingsScreenKt.EmailEditText(this.$label, this.$style, this.$onClick, this.$modifier, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailFormScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C117993 extends AbstractC7559F3s implements G2j<C07C, EmailViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ String $environmentId;

        public final void invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, int i) {
            boolean zA1a = AnonymousClass002.A1a(c07c, emailViewModel);
            C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
            C1BO c1boA022 = C2CK.A02(bfm, AnonymousClass007.A0N(bfm).aiIdentityName);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = EmailSettingsScreenKt$EmailFormScreen$3$formKey$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            Object objA03 = AFz.A03(bfm, (Function0) objAaT, objArr);
            C7384Etj.A0U(objA03);
            String str = (String) objA03;
            boolean zA1P = AnonymousClass003.A1P(bfm, c1boA022, str, bfm.A67(emailViewModel));
            Object objAaT2 = bfm.AaT();
            if (zA1P || objAaT2 == obj) {
                objAaT2 = new EmailSettingsScreenKt$EmailFormScreen$3$1$1(emailViewModel, str, c1boA022);
                bfm.Ai0(objAaT2);
            }
            int i2 = (i >> 3) & 14;
            C78e.A05(bfm, emailViewModel, (G0U) objAaT2);
            String str2 = C1BO.A06(c1boA02).savedFormKey;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$environmentId, AnonymousClass004.A1S(bfm, str, auraNavigatorA0b, bfm.A65(c1boA02)));
            String str3 = this.$environmentId;
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == obj) {
                objAaT3 = new EmailSettingsScreenKt$EmailFormScreen$3$2$1(str, auraNavigatorA0b, str3, c1boA02);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, str2);
            boolean zA67 = bfm.A67(emailViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == obj) {
                objAaT4 = new EmailSettingsScreenKt$EmailFormScreen$3$3$1(emailViewModel);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass006.A16(bfm, objAaT4, emailViewModel, i2);
            EmailCreateFormKt.EmailCreateForm(C1BO.A06(c1boA02), emailViewModel, C1BO.A08(c1boA022), c07c.AiP(BRg.A00, 1.0f, zA1a), bfm, i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117993(String str) {
            super(4);
            this.$environmentId = str;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, Integer num) {
            invoke(c07c, emailViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailFormScreen$4, reason: invalid class name and case insensitive filesystem */
    public final class C118004 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118004(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$environmentId = str;
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
            EmailSettingsScreenKt.EmailFormScreen(this.$environmentId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailMailboxCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C118012 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $address;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118012(String str, String str2, String str3, BRg bRg, int i, int i2) {
            super(2);
            this.$environmentId = str;
            this.$address = str2;
            this.$name = str3;
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
            EmailSettingsScreenKt.EmailMailboxCard(this.$environmentId, this.$address, this.$name, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailSenderNameFields$2, reason: invalid class name and case insensitive filesystem */
    public final class C118022 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailSettingsCopy $copy;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ EmailState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118022(EmailState emailState, EmailViewModel emailViewModel, EmailSettingsCopy emailSettingsCopy, BRg bRg, int i, int i2) {
            super(2);
            this.$state = emailState;
            this.$model = emailViewModel;
            this.$copy = emailSettingsCopy;
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
            EmailSettingsScreenKt.EmailSenderNameFields(this.$state, this.$model, this.$copy, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailSenderNameScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C118032 extends AbstractC7559F3s implements G2j<C07C, EmailViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ EmailSettingsCopy $copy;
        public final /* synthetic */ String $formKey;

        public final void invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, int i) {
            C7384Etj.A0Y(emailViewModel, 1);
            C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
            C1BO c1boA022 = C2CK.A02(bfm, AnonymousClass007.A0N(bfm).aiIdentityName);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$formKey, AnonymousClass003.A1N(bfm, emailViewModel, c1boA022));
            String str = this.$formKey;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new EmailSettingsScreenKt$EmailSenderNameScreen$2$1$1(emailViewModel, str, c1boA022);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, emailViewModel);
            String str2 = C1BO.A06(c1boA02).savedFormKey;
            boolean zA1S = AnonymousClass004.A1S(bfm, this.$formKey, auraNavigatorA0b, bfm.A65(c1boA02));
            String str3 = this.$formKey;
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new EmailSettingsScreenKt$EmailSenderNameScreen$2$2$1(str3, auraNavigatorA0b, c1boA02);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, str2);
            EmailSettingsScreenKt.EmailSenderNameFields(C1BO.A06(c1boA02), emailViewModel, this.$copy, null, bfm, i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 8);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118032(String str, EmailSettingsCopy emailSettingsCopy) {
            super(4);
            this.$formKey = str;
            this.$copy = emailSettingsCopy;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, Integer num) {
            invoke(c07c, emailViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailSenderNameScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C118043 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118043(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$environmentId = str;
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
            EmailSettingsScreenKt.EmailSenderNameScreen(this.$environmentId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailSettingsScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C118052 extends AbstractC7559F3s implements G2j<C07C, EmailViewModel, BFM, Integer, Unit> {
        public final /* synthetic */ String $deleteKey;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ String $pageTitle;

        /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailSettingsScreen$2$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
            public final /* synthetic */ EmailSettingsCopy $copy;
            public final /* synthetic */ String $environmentId;
            public final /* synthetic */ AuraNavigator $navigator;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(EmailSettingsCopy emailSettingsCopy, AuraNavigator auraNavigator, String str) {
                super(3);
                this.$copy = emailSettingsCopy;
                this.$navigator = auraNavigator;
                this.$environmentId = str;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
                invoke(c07c, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(C07C c07c, BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                    String strA01 = this.$copy.verifiedEmailRowTitle;
                    if (strA01 == null) {
                        bfm.AgE(508930528);
                        strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209b9);
                    } else {
                        bfm.AgE(508929040);
                    }
                    AnonymousClass001.A1D(bfm);
                    boolean zA1R = AnonymousClass001.A1R(bfm, this.$environmentId, bfm.A67(this.$navigator));
                    AuraNavigator auraNavigator = this.$navigator;
                    String str = this.$environmentId;
                    Object objAaT = bfm.AaT();
                    if (zA1R || objAaT == C78N.A00) {
                        objAaT = new EmailSettingsScreenKt$EmailSettingsScreen$2$3$1$1(auraNavigator, str);
                        bfm.Ai0(objAaT);
                    }
                    EmailSettingsComponentsKt.EmailNavRow(strA01, (Function0) objAaT, null, bfm, 0, 4);
                    return;
                }
                bfm.Afo();
            }
        }

        public final void invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, int i) {
            int i2;
            boolean zA1a = AnonymousClass002.A1a(c07c, emailViewModel);
            C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            boolean zA67 = bfm.A67(emailViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new EmailSettingsScreenKt$EmailSettingsScreen$2$1$1(emailViewModel);
                bfm.Ai0(objAaT);
            }
            int i3 = (i >> 3) & 14;
            C78e.A05(bfm, emailViewModel, (G0U) objAaT);
            String str = C1BO.A06(c1boA02).mailboxDeletedKey;
            boolean zA1S = AnonymousClass004.A1S(bfm, this.$deleteKey, auraNavigatorA0b, bfm.A65(c1boA02));
            String str2 = this.$deleteKey;
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new EmailSettingsScreenKt$EmailSettingsScreen$2$2$1(str2, auraNavigatorA0b, c1boA02);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, str);
            EmailSettingsCopy emailSettingsCopy = EmailProductNameKt.emailSettingsCopy(this.$environmentId, bfm, 0);
            EmailMailbox emailMailbox = C1BO.A06(c1boA02).mailbox;
            if (emailMailbox == null || emailMailbox.isTakenDown()) {
                emailMailbox = null;
                bfm.AgE(56833328);
            } else {
                bfm.AgE(971663728);
                EmailSettingsComponentsKt.EmailSettingsLoadEffect(emailViewModel, bfm, i3);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (C1BO.A06(c1boA02).deletingMailbox) {
                bfm.AgE(971666077);
                EmailSettingsScreenKt.EmailDeletingOverlay(null, emailSettingsCopy.deleting, bfm, 0, zA1a ? 1 : 0);
            } else if (emailMailbox != null) {
                if (C1BO.A06(c1boA02).permissionsLoaded && C1BO.A06(c1boA02).settingsLoaded) {
                    bfm.AgE(57133098);
                    EmailSettingsScreenKt.EmailMailboxCard(this.$environmentId, emailMailbox.emailAddress, emailMailbox.name, null, bfm, 0, 8);
                    String str3 = this.$pageTitle;
                    BS0 bs0 = BRg.A00;
                    RecipientPermissionsEntryKt.RecipientPermissionsEntry(EmailRepository.MUSE_MAIL_CONNECTOR, str3, C3U4.A0C(bs0, 0.0f, 16.0f, 0.0f, 0.0f), bfm, 390, 0);
                    EmailSettingsComponentsKt.EmailPermissionsSection(this.$environmentId, C1BO.A06(c1boA02), emailViewModel, C3U4.A0C(bs0, 0.0f, 16.0f, 0.0f, 0.0f), bfm, ((i << 3) & 896) | 3072, 0);
                    EmailSettingsComponentsKt.EmailSettingsCard(C3U4.A0C(bs0, 0.0f, 16.0f, 0.0f, 0.0f), B1V.A00(bfm, new AnonymousClass3(emailSettingsCopy, auraNavigatorA0b, this.$environmentId), -1907848187), bfm, 54, 0);
                    String strA01 = emailSettingsCopy.verifiedEmailRowNote;
                    if (strA01 == null) {
                        bfm.AgE(971698546);
                        strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209ba);
                    } else {
                        bfm.AgE(971697027);
                    }
                    BBI.A0R(bbi, false);
                    AuraTextKt.m2640AuraTextVmYn7U0(EmailIntroFooterKt.rememberEmailLinkText(strA01, bfm, 0), C3U4.A0B(bs0, 16.0f, 8.0f), C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 48, 0, 32752);
                    EmailSettingsComponentsKt.EmailSignatureSection(C1BO.A06(c1boA02), emailViewModel, C3U4.A0C(bs0, 0.0f, 8.0f, 0.0f, 0.0f), bfm, (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, 0);
                    String str4 = this.$environmentId;
                    String str5 = emailMailbox.emailAddress;
                    boolean zA1R = AnonymousClass001.A1R(bfm, this.$deleteKey, bfm.A67(emailViewModel));
                    String str6 = this.$deleteKey;
                    Object objAaT3 = bfm.AaT();
                    if (zA1R || objAaT3 == C78N.A00) {
                        objAaT3 = new EmailSettingsScreenKt$EmailSettingsScreen$2$4$1(emailViewModel, str6);
                        bfm.Ai0(objAaT3);
                    }
                    EmailSettingsScreenKt.EmailDeleteMailboxSection(str4, str5, null, (G0V) objAaT3, bfm, 0, 4);
                } else {
                    i2 = 971670349;
                    bfm.AgE(i2);
                    HatchScreenLoadingStateKt.HatchScreenLoadingState(C07C.A00(c07c), bfm, 0, 0);
                }
            } else if (C1BO.A06(c1boA02).loading) {
                i2 = 971716013;
                bfm.AgE(i2);
                HatchScreenLoadingStateKt.HatchScreenLoadingState(C07C.A00(c07c), bfm, 0, 0);
            } else if (C1BO.A06(c1boA02).error != null) {
                bfm.AgE(971719197);
                EmailError emailError = C1BO.A06(c1boA02).error;
                boolean zA672 = bfm.A67(emailViewModel);
                Object objAaT4 = bfm.AaT();
                if (zA672 || objAaT4 == C78N.A00) {
                    objAaT4 = new EmailSettingsScreenKt$EmailSettingsScreen$2$5$1(emailViewModel);
                    bfm.Ai0(objAaT4);
                }
                EmailComponentsKt.EmailRetry(emailError, (Function0) ((InterfaceC7353EnQ) objAaT4), C07C.A00(c07c), bfm, 0, 0);
            } else if (C1BO.A06(c1boA02).pendingResetAddress != null) {
                bfm.AgE(971723330);
                EmailComponentsKt.EmailErrorMessage(EmailError.RESET_REQUIRED, C07C.A00(c07c), bfm, 6, 0);
            } else {
                bfm.AgE(971726793);
                BRg bRgA00 = C07C.A00(c07c);
                EmailMailbox emailMailbox2 = C1BO.A06(c1boA02).mailbox;
                EmailScreenKt.m754EmailSetupPromptcmhDWc(0.0f, 0.0f, bRgA00, emailMailbox2 != null ? emailMailbox2.getTakenDownNotice() : null, null, bfm, 54, 16);
            }
            BBI.A0R(bbi, false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118052(String str, String str2, String str3) {
            super(4);
            this.$deleteKey = str;
            this.$environmentId = str2;
            this.$pageTitle = str3;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, EmailViewModel emailViewModel, BFM bfm, Integer num) {
            invoke(c07c, emailViewModel, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsScreenKt$EmailSettingsScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C118063 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118063(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$environmentId = str;
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
            EmailSettingsScreenKt.EmailSettingsScreen(this.$environmentId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void EmailCreateButton(EmailViewModel emailViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass4;
        BRg bRg2 = bRg;
        bfm.AgG(360194215);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailViewModel) | i : i;
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
            C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
            if (C1BO.A06(c1boA02).setupFailed) {
                bfm.AgE(1717719261);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209a3);
                boolean zA67 = bfm.A67(emailViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new EmailSettingsScreenKt$EmailCreateButton$1$1(emailViewModel);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, C3U4.A02(AnonymousClass001.A0R(bRg2)), null, null, null, false, false, false, false, false, null, null, (Function0) ((InterfaceC7353EnQ) objAaT), null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134201333);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass4 = new AnonymousClass2(emailViewModel, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass4;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 1717932603);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120947);
            boolean zCanSave = emailViewModel.canSave(false);
            boolean z = C1BO.A06(c1boA02).saving;
            BRg bRgA02 = C3U4.A02(AnonymousClass001.A0R(bRg2));
            boolean zA672 = bfm.A67(emailViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new EmailSettingsScreenKt$EmailCreateButton$3$1(emailViewModel);
                bfm.Ai0(objAaT2);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, bRgA02, null, null, null, false, false, zCanSave, z, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134199797);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(emailViewModel, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass4;
        }
    }

    public static final void EmailDeleteMailboxSection(String str, String str2, BRg bRg, G0V<? super String, ? super String, Unit> g0v, BFM bfm, int i, int i2) {
        boolean z;
        int i3;
        Object[] objArr;
        int i4;
        Object[] objArr2;
        BRg bRg2 = bRg;
        bfm.AgG(1462026971);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            int i6 = iA0d & 14;
            EmailSettingsCopy emailSettingsCopy = EmailProductNameKt.emailSettingsCopy(str, bfm, i6);
            String strEmailProductName = EmailProductNameKt.emailProductName(str, bfm, i6);
            String strA02 = emailSettingsCopy.deleteAction;
            if (strA02 == null) {
                if (strEmailProductName == null) {
                    bfm.AgE(553625697);
                    i4 = R.string._name_removed__res_0x7f1209ab;
                    objArr2 = new Object[]{HatchAppName.value};
                } else {
                    bfm.AgE(553628450);
                    i4 = R.string._name_removed__res_0x7f1209ac;
                    objArr2 = new Object[]{strEmailProductName};
                }
                strA02 = AbstractC2271BQs.A02(bfm, objArr2, i4);
                AnonymousClass001.A1D(bfm);
            }
            String strA022 = emailSettingsCopy.deleteDialogTitle;
            if (strA022 == null) {
                if (strEmailProductName == null) {
                    bfm.AgE(553633990);
                    i3 = R.string._name_removed__res_0x7f120955;
                    objArr = new Object[]{HatchAppName.value};
                } else {
                    bfm.AgE(553636903);
                    i3 = R.string._name_removed__res_0x7f120953;
                    objArr = new Object[]{strEmailProductName};
                }
                strA022 = AbstractC2271BQs.A02(bfm, objArr, i3);
                AnonymousClass001.A1D(bfm);
            }
            Object[] objArr3 = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = EmailSettingsScreenKt$EmailDeleteMailboxSection$confirming$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableState = (MutableState) AFz.A03(bfm, (Function0) objAaT, objArr3);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12097e);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12095d);
            EmailSettingsComponentsKt.EmailSettingsCard(C3U4.A04(bRg2, 16.0f), B1V.A00(bfm, new AnonymousClass1(mutableState, strA02), 1282331784), bfm, 48, 0);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-16388908);
                String strDeleteDialogMessage = emailSettingsCopy.deleteDialogMessage(str2);
                if (strDeleteDialogMessage == null) {
                    bfm.AgE(553664666);
                    z = false;
                    strDeleteDialogMessage = AnonymousClass001.A0t(bfm, str2, R.string._name_removed__res_0x7f120951);
                } else {
                    z = false;
                    bfm.AgE(553663023);
                }
                AnonymousClass001.A1D(bfm);
                if ((iA0d & 7168) == 2048) {
                    z = true;
                }
                boolean zA1W = AnonymousClass002.A1W(bfm, strA012, bfm.A65(strA01), z);
                Object objAaT2 = bfm.AaT();
                if (zA1W || objAaT2 == obj) {
                    objAaT2 = new EmailSettingsScreenKt$EmailDeleteMailboxSection$2$1(g0v, strA01, strA012);
                    bfm.Ai0(objAaT2);
                }
                Function0 function0 = (Function0) objAaT2;
                boolean zA65 = bfm.A65(mutableState);
                Object objAaT3 = bfm.AaT();
                if (zA65 || objAaT3 == obj) {
                    objAaT3 = new EmailSettingsScreenKt$EmailDeleteMailboxSection$3$1(mutableState);
                    bfm.Ai0(objAaT3);
                }
                EmailSettingsComponentsKt.EmailConfirmation(strA022, strDeleteDialogMessage, strA02, function0, (Function0) objAaT3, null, bfm, 0, 32);
            } else {
                bfm.AgE(-16063129);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117964(str, str2, bRg2, g0v, i, i2);
        }
    }

    public static final void EmailEditText(String str, C1822Arm c1822Arm, Function0<Unit> function0, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        boolean z2 = z;
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(str, c1822Arm, function0);
        bfm.AgG(-811570785);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c1822Arm);
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
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            long jA0D = C06G.A0D(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120959);
            if (!z2) {
                jA0D = HxS.A04(HDi.A0O[(int) (jA0D & 63)], B6A.A03(jA0D), B6A.A02(jA0D), B6A.A01(jA0D), 0.3f);
            }
            BRg bRgA04 = C0v5.A04(bRg2, new C1YD(0), null, function0, z2);
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new EmailSettingsScreenKt$EmailEditText$1$1(str);
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(AnonymousClass001.A0Y(bRgA04, objAaT, false), 16.0f, 13.0f), jA0D, c1822Arm, null, null, null, false, 0, zA1Z ? 1 : 0, 0, null, null, null, bfm, ((iA0d << 6) & 7168) | 805306368, 0, 15856);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117982(str, c1822Arm, function0, bRg2, z2, i, i2);
        }
    }

    public static final void EmailFormScreen(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1677343168);
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
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = EmailSettingsScreenKt$EmailFormScreen$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = EmailSettingsScreenKt$EmailFormScreen$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            EmailComponentsKt.EmailSettingsPage(str, "", bRg2, false, g0u, true, (G0U) objAaT2, null, null, null, ComposableSingletons$EmailSettingsScreenKt.lambda$1011989188, B1V.A00(bfm, new C117993(str), -1183041037), bfm, (iA0d & 14) | 1794096 | ((iA0d << 3) & 896), 54, 904);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118004(str, bRg2, i, i2);
        }
    }

    public static final void EmailMailboxCard(String str, String str2, String str3, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-287821608);
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
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AuraDrawableSource auraDrawableSourceRememberDefaultAvatarSource = AnonymousClass007.A0N(bfm).rememberDefaultAvatarSource(null, bfm, HatchIdentityProvider.$stable << 3, 1);
            BRg bRgA0C = C3U4.A0C(C1b8.A03(AnonymousClass001.A0R(bRg2), C06G.A0R(bfm), AnonymousClass002.A0c(bfm).card), 12.0f, 16.0f, 0.0f, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 16.0f);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            AuraImageKt.AuraImage(auraDrawableSourceRememberDefaultAvatarSource, C11U.A02(bs0, 44.0f), null, null, false, false, null, false, null, bfm, 384, 504);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120946);
            C1YD c1yd = new C1YD(0);
            boolean zA67 = bfm.A67(contextA0H) | AnonymousClass003.A1C(iA0d);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new EmailSettingsScreenKt$EmailMailboxCard$1$1$1(contextA0H, str2);
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = AbstractC07539Wl.A00(C0v5.A04(bRgA0O, c1yd, strA01, (Function0) objAaT, true), "email-mailbox-address");
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA00);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, 0L, AnonymousClass001.A0g(bfm, akh).bodyRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14838);
            AuraTextKt.m2639AuraTextUY9GdpU(str3, null, C06G.A08(bfm), C06G.A0a(bfm, akh), null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0d >> 6) & 14) | 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12095a);
            C1822Arm c1822ArmA0V = C06G.A0V(bfm);
            boolean zA672 = bfm.A67(auraNavigatorA0b) | AnonymousClass001.A1L(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new EmailSettingsScreenKt$EmailMailboxCard$1$3$1(auraNavigatorA0b, str);
                bfm.Ai0(objAaT2);
            }
            EmailEditText(strA012, c1822ArmA0V, (Function0) objAaT2, null, false, bfm, 0, 24);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118012(str, str2, str3, bRg2, i, i2);
        }
    }

    public static final void EmailSenderNameFields(EmailState emailState, EmailViewModel emailViewModel, EmailSettingsCopy emailSettingsCopy, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-415573739);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, emailViewModel);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, emailSettingsCopy);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA13 = AnonymousClass004.A13(bfm, 8.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA13, akqA04, bRgA01, iA0J);
            if (emailState.formLoading) {
                bfm.AgE(-1136383272);
                HatchScreenLoadingStateKt.HatchScreenLoadingState(null, bfm, 0, 1);
            } else {
                bfm.AgE(-868119037);
            }
            BBI.A0R(bbi, false);
            String strA01 = emailSettingsCopy.senderNameLabel;
            if (strA01 == null) {
                bfm.AgE(-1136381139);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209a6);
            } else {
                bfm.AgE(-1136381883);
            }
            BBI.A0R(bbi, false);
            String str = emailState.senderName;
            C1DM c1dm = AnonymousClass002.A0e(bfm).large;
            boolean zA67 = bfm.A67(emailViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new EmailSettingsScreenKt$EmailSenderNameFields$1$1$1(emailViewModel);
                bfm.Ai0(objAaT);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT;
            boolean z = !emailState.saving;
            BS0 bs0 = BRg.A00;
            boolean zA65 = bfm.A65(strA01);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new EmailSettingsScreenKt$EmailSenderNameFields$1$2$1(strA01);
                bfm.Ai0(objAaT2);
            }
            AuraTextInputKt.AuraTextInput(str, null, AnonymousClass001.A0Y(c1062ATq, objAaT2, false), B1V.A00(bfm, new EmailSettingsScreenKt$EmailSenderNameFields$1$3(strA01), -1582372621), null, null, null, null, true, 0, 0, null, null, null, null, z, false, false, false, c1dm, (G0U) interfaceC7353EnQ, bfm, 100666368, 0, 0, 491250);
            String strA012 = emailSettingsCopy.senderNameHelp;
            if (strA012 == null) {
                bfm.AgE(-1136366579);
                strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209a5);
            } else {
                bfm.AgE(-1136367292);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(strA012, C3U4.A0B(bs0, 16.0f, 0.0f), C06G.A08(bfm), C06G.A0S(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            EmailSenderNameErrorKt.EmailSenderNameError(emailState, C3U4.A0B(bs0, 16.0f, 0.0f), bfm, (iA0T & 14) | 48, 0);
            EmailComponentsKt.EmailErrorMessage(emailState.formError, null, bfm, 0, 2);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118022(emailState, emailViewModel, emailSettingsCopy, bRg2, i, i2);
        }
    }

    public static final void EmailSenderNameScreen(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1679402660);
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
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = EmailSettingsScreenKt$EmailSenderNameScreen$formKey$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            Object objA03 = AFz.A03(bfm, (Function0) objAaT, objArr);
            C7384Etj.A0U(objA03);
            String str2 = (String) objA03;
            int i4 = iA0d & 14;
            EmailSettingsCopy emailSettingsCopy = EmailProductNameKt.emailSettingsCopy(str, bfm, i4);
            String strA01 = emailSettingsCopy.senderNamePageTitle;
            if (strA01 == null) {
                bfm.AgE(1001755727);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12095a);
            } else {
                bfm.AgE(1001754859);
            }
            AnonymousClass001.A1D(bfm);
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "email-form");
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = EmailSettingsScreenKt$EmailSenderNameScreen$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            EmailComponentsKt.EmailSettingsPage(str, strA01, bRgA00, false, null, false, (G0U) objAaT2, null, null, null, ComposableSingletons$EmailSettingsScreenKt.lambda$1327618784, B1V.A00(bfm, new C118032(str2, emailSettingsCopy), -1300890929), bfm, i4 | 1572864, 54, 952);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118043(str, bRg2, i, i2);
        }
    }

    public static final void EmailSettingsScreen(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(1578269087);
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
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = EmailSettingsScreenKt$EmailSettingsScreen$deleteKey$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            Object objA03 = AFz.A03(bfm, (Function0) objAaT, objArr);
            C7384Etj.A0U(objA03);
            String str2 = (String) objA03;
            int i4 = iA0d & 14;
            String strA0v = EmailProductNameKt.emailSettingsCopy(str, bfm, i4).museMailPageTitle;
            if (strA0v == null) {
                bfm.AgE(593144702);
                strA0v = EmailProductNameKt.emailProductName(str, bfm, i4);
            } else {
                bfm.AgE(593142718);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (strA0v == null) {
                bfm.AgE(593146180);
                strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f1209ad);
            } else {
                bfm.AgE(593142801);
            }
            BBI.A0R(bbi, false);
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "email-settings");
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = EmailSettingsScreenKt$EmailSettingsScreen$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            EmailComponentsKt.EmailSettingsPage(str, strA0v, bRgA00, true, (G0U) objAaT2, false, null, null, null, null, null, B1V.A00(bfm, new C118052(str2, str, strA0v), 787602386), bfm, i4 | 27648, 48, 2016);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118063(str, bRg2, i, i2);
        }
    }

    public static final void copyEmailAddress(Context context, String str) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(ClipboardManager.class);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(EMAIL_ADDRESS_CLIP_LABEL, str));
            if (Build.VERSION.SDK_INT < 33) {
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120945);
            }
        }
    }

    public static final void EmailDeletingOverlay(BRg bRg, String str, BFM bfm, int i, int i2) {
        bfm.AgG(-1122065904);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            if (i4 != 0) {
                str = null;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = EmailSettingsScreenKt$EmailDeletingOverlay$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            C0n6.A00(bfm, new BA2(false, false, true), (Function0) objAaT, B1V.A00(bfm, new C117972(bRg, str), -897180455), 438, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg, str, i, i2);
        }
    }
}
