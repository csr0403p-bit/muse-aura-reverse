package com.facebook.aura.email.view;

import X.AKH;
import X.AKQ;
import X.AVy;
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
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C0A8;
import X.C0v2;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DG;
import X.C1YD;
import X.C1YL;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.email.model.EmailPermissionMethod;
import com.facebook.aura.email.model.EmailPermissions;
import com.facebook.aura.email.model.EmailSendPermission;
import com.facebook.aura.email.model.EmailSignature;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonCorner;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.controls.AuraSwitchKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailSettingsComponentsKt {

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailAddRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$enabled = z;
            this.$onClick = function0;
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
            EmailSettingsComponentsKt.EmailAddRow(this.$label, this.$enabled, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailAddressRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C117812 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $address;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ Function0<Unit> $onVerify;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117812(String str, boolean z, Function0<Unit> function0, BRg bRg, String str2, Function0<Unit> function02, int i, int i2) {
            super(2);
            this.$address = str;
            this.$enabled = z;
            this.$onRemove = function0;
            this.$modifier = bRg;
            this.$subtitle = str2;
            this.$onVerify = function02;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailSettingsComponentsKt.EmailAddressRow(this.$address, this.$enabled, this.$onRemove, this.$modifier, this.$subtitle, this.$onVerify, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailConfirmation$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelLabel;
        public final /* synthetic */ String $confirmLabel;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0, Function0<Unit> function02, String str2) {
            super(2);
            this.$confirmLabel = str;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$cancelLabel = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$cancelLabel, AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A65(this.$confirmLabel))));
                String str = this.$confirmLabel;
                String str2 = this.$cancelLabel;
                Function0<Unit> function0 = this.$onDismiss;
                Function0<Unit> function02 = this.$onConfirm;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new EmailSettingsComponentsKt$EmailConfirmation$1$1$1(str, str2, function0, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailConfirmation$2, reason: invalid class name and case insensitive filesystem */
    public final class C117822 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ String $confirmLabel;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117822(String str, String str2, String str3, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$body = str2;
            this.$confirmLabel = str3;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
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
            EmailSettingsComponentsKt.EmailConfirmation(this.$title, this.$body, this.$confirmLabel, this.$onConfirm, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailNavHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C117832 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showBack;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117832(String str, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$showBack = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailSettingsComponentsKt.EmailNavHeader(this.$title, this.$modifier, this.$showBack, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailNavRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C117842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117842(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$onClick = function0;
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
            EmailSettingsComponentsKt.EmailNavRow(this.$title, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailPermissionRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C117852 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $busy;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ EmailPermissionMethod $method;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<EmailSendPermission, Unit> $onChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C117852(EmailPermissionMethod emailPermissionMethod, boolean z, boolean z2, G0U<? super EmailSendPermission, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$method = emailPermissionMethod;
            this.$busy = z;
            this.$enabled = z2;
            this.$onChange = g0u;
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
            EmailSettingsComponentsKt.EmailPermissionRow(this.$method, this.$busy, this.$enabled, this.$onChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailPermissionVerifyRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C117862 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onVerify;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117862(String str, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$enabled = z;
            this.$onVerify = function0;
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
            EmailSettingsComponentsKt.EmailPermissionVerifyRow(this.$title, this.$enabled, this.$onVerify, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailPermissionsSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C117871 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ EmailState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117871(String str, EmailState emailState, EmailViewModel emailViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$environmentId = str;
            this.$state = emailState;
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
            EmailSettingsComponentsKt.EmailPermissionsSection(this.$environmentId, this.$state, this.$model, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailPermissionsSection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ EmailState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, EmailState emailState, EmailViewModel emailViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$environmentId = str;
            this.$state = emailState;
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
            EmailSettingsComponentsKt.EmailPermissionsSection(this.$environmentId, this.$state, this.$model, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailRowDivider$1, reason: invalid class name and case insensitive filesystem */
    public final class C117881 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117881(BRg bRg, int i, int i2) {
            super(2);
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
            EmailSettingsComponentsKt.EmailRowDivider(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailSectionLabel$1, reason: invalid class name and case insensitive filesystem */
    public final class C117891 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117891(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            EmailSettingsComponentsKt.EmailSectionLabel(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailSettingsCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C117901 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C117901(BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$modifier = bRg;
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
            EmailSettingsComponentsKt.EmailSettingsCard(this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailSettingsHelp$1, reason: invalid class name and case insensitive filesystem */
    public final class C117911 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117911(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            EmailSettingsComponentsKt.EmailSettingsHelp(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailSettingsLoadEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C117922 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ EmailViewModel $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117922(EmailViewModel emailViewModel, int i) {
            super(2);
            this.$model = emailViewModel;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            EmailSettingsComponentsKt.EmailSettingsLoadEffect(this.$model, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailSignatureSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C117931 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $failure;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ EmailSignature $signature;
        public final /* synthetic */ EmailState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117931(EmailSignature emailSignature, EmailState emailState, EmailViewModel emailViewModel, String str) {
            super(3);
            this.$signature = emailSignature;
            this.$state = emailState;
            this.$model = emailViewModel;
            this.$failure = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r9, X.BFM r10, int r11) {
            /*
                r8 = this;
                boolean r0 = X.AnonymousClass004.A1G(r11)
                r9 = r10
                boolean r0 = X.AnonymousClass001.A1b(r0, r10, r11)
                if (r0 == 0) goto L52
                com.facebook.aura.email.model.EmailSignature r0 = r8.$signature
                java.lang.String r3 = r0.title
                java.lang.String r4 = r0.subtitle
                boolean r5 = r0.isOn
                com.facebook.aura.email.viewmodel.EmailState r1 = r8.$state
                boolean r0 = r1.signatureSaving
                if (r0 != 0) goto L1e
                boolean r0 = r1.deletingMailbox
                r6 = 1
                if (r0 == 0) goto L1f
            L1e:
                r6 = 0
            L1f:
                com.facebook.aura.email.viewmodel.EmailViewModel r0 = r8.$model
                boolean r1 = r10.A67(r0)
                java.lang.String r0 = r8.$failure
                boolean r0 = X.AnonymousClass001.A1R(r10, r0, r1)
                com.facebook.aura.email.viewmodel.EmailViewModel r2 = r8.$model
                java.lang.String r1 = r8.$failure
                java.lang.Object r7 = r10.AaT()
                if (r0 != 0) goto L39
                java.lang.Object r0 = X.C78N.A00
                if (r7 != r0) goto L41
            L39:
                com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailSignatureSection$1$1$1 r7 = new com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailSignatureSection$1$1$1
                r7.<init>(r2, r1)
                r10.Ai0(r7)
            L41:
                X.G0U r7 = (X.G0U) r7
                X.BS0 r1 = X.BRg.A00
                java.lang.String r0 = "email-signature-toggle"
                X.BRg r8 = X.AbstractC07539Wl.A00(r1, r0)
                r10 = 196608(0x30000, float:2.75506E-40)
                r11 = 0
                com.facebook.aura.email.view.EmailSettingsComponentsKt.EmailToggleRow(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            L52:
                r10.Afo()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailSettingsComponentsKt.C117931.invoke(X.07C, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailSignatureSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C117942 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ EmailState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117942(EmailState emailState, EmailViewModel emailViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$state = emailState;
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
            EmailSettingsComponentsKt.EmailSignatureSection(this.$state, this.$model, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailSettingsComponentsKt$EmailToggleRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C117952 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onChange;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C117952(String str, String str2, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$checked = z;
            this.$enabled = z2;
            this.$onChange = g0u;
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
            EmailSettingsComponentsKt.EmailToggleRow(this.$title, this.$subtitle, this.$checked, this.$enabled, this.$onChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void EmailSettingsCard(BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(g0w, 1);
        bfm.AgG(883203180);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA03 = C1b8.A03(AnonymousClass001.A0R(bRg), C06G.A0R(bfm), AnonymousClass002.A0c(bfm).card);
            int i4 = (iA0d << 6) & 7168;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1G(C90l.A00, bfm, g0w, ((i4 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117901(bRg, g0w, i, i2);
        }
    }

    public static final void EmailSettingsLoadEffect(EmailViewModel emailViewModel, BFM bfm, int i) {
        C7384Etj.A0Y(emailViewModel, 0);
        bfm.AgG(-749659914);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailViewModel) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            boolean zA67 = bfm.A67(emailViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new EmailSettingsComponentsKt$EmailSettingsLoadEffect$1$1(emailViewModel);
                bfm.Ai0(objAaT);
            }
            C7bA.A05(bfm, null, emailViewModel, (G0U) objAaT, iA0T & 14, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117922(emailViewModel, i);
        }
    }

    public static final void EmailSignatureSection(EmailState emailState, EmailViewModel emailViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c117942;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(emailState, emailViewModel);
        bfm.AgG(-343178113);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, emailViewModel);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            EmailSignature emailSignature = emailState.signature;
            if (emailSignature == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c117942 = new EmailSettingsComponentsKt$EmailSignatureSection$signature$1(emailState, emailViewModel, bRg2, i, i2);
                    bBbAAc.A06 = c117942;
                }
                return;
            }
            EmailSettingsCard(bRg2, B1V.A00(bfm, new C117931(emailSignature, emailState, emailViewModel, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120965)), -1231560980), bfm, ((iA0T >> 6) & 14) | 48, zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c117942 = new C117942(emailState, emailViewModel, bRg2, i, i2);
            bBbAAc.A06 = c117942;
        }
    }

    public static final void EmailAddRow(String str, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        AnonymousClass002.A1A(str, 0, function0);
        bfm.AgG(1695003095);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(C0v5.A05(AnonymousClass007.A0I(bRgA0P), null, function0, z), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 14.0f);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.plus_wght400_outline_24, 0), AuraIconSize.SMALL, null, C06G.A0C(bfm), null, bfm, AnonymousClass001.A04(), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, 0L, C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16374);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, z, function0, bRgA0P, i, i2);
        }
    }

    public static final void EmailAddressRow(String str, boolean z, Function0<Unit> function0, BRg bRg, String str2, Function0<Unit> function02, BFM bfm, int i, int i2) {
        Function0<Unit> function03;
        BRg bRg2 = bRg;
        String str3 = str2;
        int iA0C = AnonymousClass002.A0C(str, function0, 0);
        bfm.AgG(-1339538271);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
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
            iA0d |= AnonymousClass004.A0h(bfm, str3);
        }
        int i5 = i2 & 32;
        int iA0Y = 196608;
        if (i5 != 0) {
            iA0d |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, function02);
            iA0d |= iA0Y;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str3 = null;
            }
            function03 = i5 == 0 ? function02 : null;
            BRg bRgA0C = C3U4.A0C(AnonymousClass007.A0I(bRg2), 16.0f, 0.0f, 2.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i6 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i6);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA08 = C3U4.A08(AnonymousClass001.A0O(C90m.A00, BRg.A00, true), 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA08);
            AnonymousClass005.A0n(bfm, bbi, function04);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            B6A b6a = null;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, 0L, AnonymousClass001.A0g(bfm, akh).bodyRegular, null, null, null, false, 0, 1, iA0C, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14838);
            if (str3 != null) {
                bfm.AgE(-527647364);
                AuraTextKt.m2639AuraTextUY9GdpU(str3, null, C06G.A08(bfm), C06G.A0a(bfm, akh), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 12) & 14, 0, 16370);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-527494565);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            if (function03 != null) {
                bfm.AgE(-1652101380);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209bc);
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                long j2 = B6A.A07;
                long jA0D = C06G.A0D(bfm);
                b6a = null;
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, null, auraButtonStyles.m2416toLabelButtonStyle31qCuKU(j2, jA0D, AuraButtonCorner.PILL, AuraButtonKt.SIZES_REGULAR, null, false, j2, j2, j2, jA0D, jA0D, 0.0f, null), null, null, false, false, z, false, false, null, null, function03, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, (iA0d << 24) & 1879048192, (iA0d >> 3) & 57344, 0, 134200813);
            } else {
                bfm.AgE(-1651717755);
            }
            BBI.A0R(bbi, false);
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, BOf.A00(bfm, R.drawable.circle_minus_wght400_outline_24, 0), AuraIconButtonSizeV2.XM_LARGE, AuraIconButtonStyle.PRIMARY, AuraIconButtonBackground.NO_BACKGROUND, b6a, AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f12099c), function0, null, z, new B6A(C06G.A09(bfm)), new C1DG(20.0f), null, null, bfm, AnonymousClass001.A0C(iA0d << 15, (AVy.$stable << 3) | 28032) | (1879048192 & (iA0d << 24)), 48, 12577);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
            function03 = function02;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117812(str, z, function0, bRg2, str3, function03, i, i2);
        }
    }

    public static final void EmailConfirmation(String str, String str2, String str3, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(str2, str3, function0, 1);
        C7384Etj.A0Y(function02, 4);
        bfm.AgG(968720515);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function02);
        }
        int i3 = i2 & 32;
        if (i3 != 0) {
            iA0d |= 196608;
        } else if ((i & 196608) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraAlertDialogKt.AuraAlertDialog(bRg2, str, str2, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass1(str3, function0, function02, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120941)), -1674376940), function02, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass002.A07(iA0d << 3, 196608 | ((iA0d >> 15) & 14)) | ((iA0d << 6) & 3670016), 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117822(str, str2, str3, function0, function02, bRg2, i, i2);
        }
    }

    public static final void EmailNavHeader(String str, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z2 = z;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-2019733482);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0C = C3U4.A0C(AnonymousClass003.A0U(bRg2.then(c1062ATq)), 0.0f, 0.0f, 0.0f, 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            BS0 bs0 = BRg.A00;
            BRg bRgA4C = c0z7.A4C(C2VU.A09, C3U4.A0B(c1062ATq, 56.0f, 0.0f));
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = EmailSettingsComponentsKt$EmailNavHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA4C, objAaT, false), 0L, c1822ArmA0W, null, null, new C1YL(3), false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14772);
            if (z2) {
                bfm.AgE(832169963);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.caret_left, 0);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120940);
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == obj) {
                    objAaT2 = new EmailSettingsComponentsKt$EmailNavHeader$1$2$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA00, strA01, (Function0) objAaT2, c0z7.A4C(C2VU.A0B, bs0), false, 0.0f, null, null, null, false, false, bfm, AVy.$stable, 0, 2032);
            } else {
                bfm.AgE(27737042);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117832(str, bRg2, z2, i, i2);
        }
    }

    public static final void EmailNavRow(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, function0);
        bfm.AgG(-2095490319);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
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
            BRg bRgA08 = C3U4.A08(C0v5.A05(AnonymousClass007.A0I(bRg2), null, function0, zA1a), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA08);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(C90m.A00, BRg.A00, zA1a), 0L, C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16372);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0), AuraIconSize.X_SMALL, null, C06G.A09(bfm), null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117842(str, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmailPermissionRow(com.facebook.aura.email.model.EmailPermissionMethod r40, boolean r41, boolean r42, X.G0U<? super com.facebook.aura.email.model.EmailSendPermission, kotlin.Unit> r43, X.BRg r44, X.BFM r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailSettingsComponentsKt.EmailPermissionRow(com.facebook.aura.email.model.EmailPermissionMethod, boolean, boolean, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final void EmailPermissionVerifyRow(String str, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(286713108);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
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
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0C = C3U4.A0C(AnonymousClass007.A0I(bRg2), 16.0f, 0.0f, 4.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A08(c90m.AiP(BRg.A00, 1.0f, true), 0.0f), AnonymousClass001.A0f(bfm, akh).tertiaryText, c1822ArmA0T, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120995);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            long j = B6A.A07;
            long j2 = AnonymousClass001.A0f(bfm, akh).accent;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, null, auraButtonStyles.m2416toLabelButtonStyle31qCuKU(j, j2, AuraButtonCorner.PILL, AuraButtonKt.SIZES_REGULAR, null, false, j, j, j, j2, j2, 0.0f, null), null, null, false, false, z, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, (iA0d << 24) & 1879048192, (iA0d << 6) & 57344, 0, 134200813);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117862(str, z, function0, bRg2, i, i2);
        }
    }

    public static final void EmailPermissionsSection(String str, EmailState emailState, EmailViewModel emailViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, emailState);
        C7384Etj.A0Y(emailViewModel, 2);
        bfm.AgG(-862510380);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, emailState);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, emailViewModel);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (emailState.showPermissions) {
                EmailPermissions emailPermissions = emailState.permissions;
                if (emailPermissions == null) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass3 = new EmailSettingsComponentsKt$EmailPermissionsSection$permissions$1(str, emailState, emailViewModel, bRg2, i, i2);
                    }
                } else {
                    AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
                    BRg bRgA0R = AnonymousClass001.A0R(bRg2);
                    InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA0R);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                    EmailSectionLabel(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120996), null, bfm, 0, 2);
                    EmailSettingsCard(null, B1V.A00(bfm, new EmailSettingsComponentsKt$EmailPermissionsSection$2$1(emailPermissions, emailState, auraNavigatorA0b, str, emailViewModel), 362254205), bfm, 48, zA1a ? 1 : 0);
                    EmailComponentsKt.EmailErrorMessage(emailState.permissionsError, C3U4.A0C(BRg.A00, 16.0f, 8.0f, 0.0f, 0.0f), bfm, 48, 0);
                    BBI.A0R(bbi, zA1a);
                }
            } else {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass3 = new C117871(str, emailState, emailViewModel, bRg2, i, i2);
                }
            }
            bBbAAc.A06 = anonymousClass3;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(str, emailState, emailViewModel, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }

    public static final void EmailSectionLabel(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-850715435);
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
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0C(bRg2, 16.0f, 16.0f, 0.0f, 8.0f), C06G.A08(bfm), AnonymousClass002.A0f(bfm).footnoteMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117891(str, bRg2, i, i2);
        }
    }

    public static final void EmailSettingsHelp(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1244217846);
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
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A03(bRg2, 8.0f), C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117911(str, bRg2, i, i2);
        }
    }

    public static final void EmailToggleRow(String str, String str2, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-183800560);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA08 = C3U4.A08(C0v2.A01(AnonymousClass007.A0I(bRg2), new C1YD(2), AuraSwitchKt.withToggleHaptic(g0u, bfm, (iA0d >> 12) & 14), z, z2), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA08);
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
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, 0L, AnonymousClass001.A0g(bfm, akh).bodyRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16374);
            if (str2 != null) {
                bfm.AgE(1119637913);
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), C06G.A0a(bfm, akh), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16370);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1119790712);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = EmailSettingsComponentsKt$EmailToggleRow$1$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraSwitchKt.AuraSwitch(AnonymousClass001.A0X(bs0, objAaT), z2, z, g0u, null, null, null, bfm, ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (iA0d & 896) | ((iA0d >> 3) & 7168), HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117952(str, str2, z, z2, g0u, bRg2, i, i2);
        }
    }

    public static final void EmailRowDivider(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1832517472);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraDividerKt.AuraRowDivider(C3U4.A0C(bRg, 16.0f, 0.0f, 0.0f, 0.0f), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117881(bRg, i, i2);
        }
    }
}
