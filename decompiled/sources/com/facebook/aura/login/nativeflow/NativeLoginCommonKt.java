package com.facebook.aura.login.nativeflow;

import X.AKQ;
import X.AOe;
import X.AQI;
import X.AVy;
import X.AbstractC04661Bq;
import X.AbstractC0878AGe;
import X.AbstractC1011APs;
import X.AbstractC1103AYp;
import X.AbstractC2271BQs;
import X.AbstractC7536F0j;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AuJ;
import X.AxM;
import X.B1V;
import X.B2y;
import X.B3B;
import X.B3C;
import X.BA2;
import X.BAs;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BL4;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C05433bp;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C1515AkP;
import X.C1822Arm;
import X.C18j;
import X.C19U;
import X.C19h;
import X.C19i;
import X.C1AC;
import X.C1Cd;
import X.C1SA;
import X.C1YL;
import X.C1YP;
import X.C1er;
import X.C28s;
import X.C2HU;
import X.C2VU;
import X.C3U4;
import X.C3UQ;
import X.C6837Eap;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.Hw8;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1497Ak4;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.facebook.aura.R;
import com.facebook.aura.linktext.HatchTextLink;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.input.AuraTextInputDefaults;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginCommonKt {
    public static final int IME_EDGE_UNSET = Integer.MIN_VALUE;
    public static final float MIN_TOUCH_TARGET = 48.0f;
    public static final float NATIVE_LOGIN_LOGO_SIZE = 56.0f;
    public static final String PLACEHOLDER_1 = "%1$s";
    public static final String PLACEHOLDER_2 = "%2$s";
    public static final String PLACEHOLDER_3 = "%3$s";
    public static final String SUBTITLE_LINK_TAG = "subtitle_link";
    public static final float NATIVE_LOGIN_PAGE_GUTTER = AuraDimensKt.SpacingMedium;
    public static final float NATIVE_LOGIN_CONTENT_TOP_SPACING = AuraDimensKt.SpacingXsmall;
    public static final float NATIVE_LOGIN_HEADER_LOGO_CONTENT_TOP_SPACING = AuraDimensKt.SpacingLarge;
    public static final float IME_LIFT_CLEARANCE = AuraDimensKt.SpacingLargePlusMicro;
    public static final AOe<BL4> ERROR_SIZE_SPEC = AnonymousClass002.A0J(C2HU.A01, 260);

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCommonKt$ClearOnLeave$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onLeave;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, int i) {
            super(2);
            this.$onLeave = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginCommonKt.ClearOnLeave(this.$onLeave, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCommonKt$NativeLoginErrorDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ NativeLoginErrorDialogAction $action;
        public final /* synthetic */ String $actionText;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $dismissText;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NativeLoginErrorDialogAction nativeLoginErrorDialogAction, String str, Context context, Function0<Unit> function0, String str2) {
            super(2);
            this.$action = nativeLoginErrorDialogAction;
            this.$actionText = str;
            this.$context = context;
            this.$onDismiss = function0;
            this.$dismissText = str2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$dismissText, AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1T(bfm, this.$context, AnonymousClass001.A1R(bfm, this.$actionText, bfm.A67(this.$action)))));
                NativeLoginErrorDialogAction nativeLoginErrorDialogAction = this.$action;
                String str = this.$actionText;
                String str2 = this.$dismissText;
                Function0<Unit> function0 = this.$onDismiss;
                Context context = this.$context;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new NativeLoginCommonKt$NativeLoginErrorDialog$1$1$1(nativeLoginErrorDialogAction, str, str2, function0, context);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCommonKt$NativeLoginErrorDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C125242 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ NativeLoginErrorDialogContent $content;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125242(NativeLoginErrorDialogContent nativeLoginErrorDialogContent, Function0<Unit> function0, int i) {
            super(2);
            this.$content = nativeLoginErrorDialogContent;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginCommonKt.NativeLoginErrorDialog(this.$content, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCommonKt$NativeLoginFieldErrorSlot$1, reason: invalid class name and case insensitive filesystem */
    public final class C125251 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<String> $retained$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125251(MutableState<String> mutableState) {
            super(3);
            this.$retained$delegate = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
            invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c1Cd), bfm, i)) {
                MutableState<String> mutableState = this.$retained$delegate;
                int i2 = NativeLoginCommonKt.IME_EDGE_UNSET;
                String strA05 = MutableState.A05(mutableState);
                C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
                long j = AnonymousClass002.A0c(bfm).errorText;
                BRg bRgA04 = C3U4.A04(NativeLoginCommonKt.nativeLoginTextInset(C10G.A02), AuraDimensKt.SpacingSmall);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = NativeLoginCommonKt$NativeLoginFieldErrorSlot$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA05, AnonymousClass001.A0Y(bRgA04, objAaT, false), j, c1822ArmA0Y, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCommonKt$NativeLoginFieldErrorSlot$2, reason: invalid class name and case insensitive filesystem */
    public final class C125262 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $message;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125262(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$message = str;
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
            NativeLoginCommonKt.NativeLoginFieldErrorSlot(this.$message, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCommonKt$NativeLoginHero$2, reason: invalid class name and case insensitive filesystem */
    public final class C125272 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $animatedLogo;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showLogo;
        public final /* synthetic */ ApQ $subtitle;
        public final /* synthetic */ String $title;
        public final /* synthetic */ NativeLoginTitleStyle $titleStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125272(String str, BRg bRg, ApQ apQ, boolean z, boolean z2, NativeLoginTitleStyle nativeLoginTitleStyle, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$subtitle = apQ;
            this.$animatedLogo = z;
            this.$showLogo = z2;
            this.$titleStyle = nativeLoginTitleStyle;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginCommonKt.NativeLoginHero(this.$title, this.$modifier, this.$subtitle, this.$animatedLogo, this.$showLogo, this.$titleStyle, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCommonKt$NativeLoginHeroLogo$2, reason: invalid class name and case insensitive filesystem */
    public final class C125282 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125282(BRg bRg, int i, int i2) {
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
            NativeLoginCommonKt.NativeLoginHeroLogo(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCommonKt$NativeLoginPasswordField$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ MutableState<Boolean> $isPasswordVisible$delegate;
        public final /* synthetic */ G0U<Boolean, Unit> $onRevealToggled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(G0U<? super Boolean, Unit> g0u, boolean z, MutableState<Boolean> mutableState) {
            super(2);
            this.$onRevealToggled = g0u;
            this.$enabled = z;
            this.$isPasswordVisible$delegate = mutableState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                AuraTextInputDefaults auraTextInputDefaults = AuraTextInputDefaults.INSTANCE;
                MutableState<Boolean> mutableState = this.$isPasswordVisible$delegate;
                int i2 = NativeLoginCommonKt.IME_EDGE_UNSET;
                boolean zA0A = MutableState.A0A((MutableState) mutableState);
                int i3 = R.drawable.eye_wght400_outline_24;
                if (zA0A) {
                    i3 = R.drawable.eyeslash_outline_24_wght400;
                }
                AVy aVyA00 = BOf.A00(bfm, i3, 0);
                boolean zA65 = bfm.A65(this.$onRevealToggled);
                G0U<Boolean, Unit> g0u = this.$onRevealToggled;
                MutableState<Boolean> mutableState2 = this.$isPasswordVisible$delegate;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new NativeLoginCommonKt$NativeLoginPasswordField$3$1$1(g0u, mutableState2);
                    bfm.Ai0(objAaT);
                }
                Function0<Unit> function0 = (Function0) objAaT;
                boolean z = this.$enabled;
                boolean zA0A2 = MutableState.A0A((MutableState) this.$isPasswordVisible$delegate);
                int i4 = R.string._name_removed__res_0x7f12051a;
                if (zA0A2) {
                    i4 = R.string._name_removed__res_0x7f1204d1;
                }
                auraTextInputDefaults.TrailingIconButton(aVyA00, function0, z, AbstractC2271BQs.A01(bfm, i4), bfm, AVy.$stable | RuntimeInternals.IOPRIO_BACKGROUND, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCommonKt$NativeLoginPasswordField$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Hw8 $contentType;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onChange;
        public final /* synthetic */ G0U<Boolean, Unit> $onRevealToggled;
        public final /* synthetic */ String $placeholderText;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, G0U<? super String, Unit> g0u, String str2, Hw8 hw8, BRg bRg, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u2, int i, int i2) {
            super(2);
            this.$value = str;
            this.$onChange = g0u;
            this.$placeholderText = str2;
            this.$contentType = hw8;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$isError = z2;
            this.$onRevealToggled = g0u2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginCommonKt.NativeLoginPasswordField(this.$value, this.$onChange, this.$placeholderText, this.$contentType, this.$modifier, this.$enabled, this.$isError, this.$onRevealToggled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCommonKt$NativeLoginPrimaryButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C125292 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125292(String str, Function0<Unit> function0, BRg bRg, boolean z, boolean z2, int i, int i2) {
            super(2);
            this.$text = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$loading = z2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginCommonKt.NativeLoginPrimaryButton(this.$text, this.$onClick, this.$modifier, this.$enabled, this.$loading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCommonKt$imeAnchor$1, reason: invalid class name and case insensitive filesystem */
    public final class C125301 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
        public final /* synthetic */ NativeLoginImeLift $lift;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
            C7384Etj.A0Y(interfaceC1497Ak4, 0);
            this.$lift.anchorCoordinates = interfaceC1497Ak4;
            this.$lift.measureAnchor$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125301(NativeLoginImeLift nativeLoginImeLift) {
            super(1);
            this.$lift = nativeLoginImeLift;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
            invoke2(interfaceC1497Ak4);
            return Unit.INSTANCE;
        }
    }

    public static final void ClearOnLeave(Function0<Unit> function0, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(983650818);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            Unit unit = Unit.INSTANCE;
            boolean zA65 = bfm.A65(mutableStateA00);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new NativeLoginCommonKt$ClearOnLeave$1$1(mutableStateA00);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, i);
        }
    }

    public static final void NativeLoginErrorDialog(NativeLoginErrorDialogContent nativeLoginErrorDialogContent, Function0<Unit> function0, BFM bfm, int i) {
        int i2;
        String strA0s;
        int i3;
        boolean zA1a = AnonymousClass002.A1a(nativeLoginErrorDialogContent, function0);
        bfm.AgG(221484356);
        int iA05 = (i & 6) == 0 ? i | AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginErrorDialogContent, bfm, i) ? 1 : 0) : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            int iOrdinal = nativeLoginErrorDialogContent.dismissal.ordinal();
            if (iOrdinal == 0 || iOrdinal == zA1a) {
                bfm.AgE(-1901885088);
                i2 = R.string._name_removed__res_0x7f1204b1;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    i3 = -1901873093;
                    if (iOrdinal != 4) {
                        throw AnonymousClass005.A0k(bfm, -1901888895);
                    }
                } else {
                    i3 = -1901876965;
                }
                bfm.AgE(i3);
                i2 = R.string._name_removed__res_0x7f1204a5;
            } else {
                bfm.AgE(-1901881121);
                i2 = R.string._name_removed__res_0x7f1204b9;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i2);
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            NativeLoginErrorDialogAction nativeLoginErrorDialogAction = nativeLoginErrorDialogContent.action;
            if (nativeLoginErrorDialogAction == null) {
                bfm.AgE(1171756502);
                BBI.A0R(bbi, false);
                strA0s = null;
            } else {
                bfm.AgE(1171756503);
                strA0s = AnonymousClass001.A0s(bfm, bbi, nativeLoginErrorDialogAction.labelRes);
            }
            Context contextA0O = AnonymousClass003.A0O(bfm);
            String strA012 = nativeLoginErrorDialogContent.serverTitle;
            if (strA012 == null) {
                bfm.AgE(-1901859800);
                strA012 = AbstractC2271BQs.A01(bfm, nativeLoginErrorDialogContent.titleRes);
            } else {
                bfm.AgE(-1901860513);
            }
            BBI.A0R(bbi, false);
            String strA013 = nativeLoginErrorDialogContent.serverMessage;
            if (strA013 == null) {
                bfm.AgE(-1901857366);
                strA013 = AbstractC2271BQs.A01(bfm, nativeLoginErrorDialogContent.messageRes);
            } else {
                bfm.AgE(-1901858141);
            }
            BBI.A0R(bbi, false);
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, strA012, strA013, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass1(nativeLoginErrorDialogAction, strA0s, contextA0O, function0, strA01), 150812179), function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass006.A02(iA05 << 15), 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125242(nativeLoginErrorDialogContent, function0, i);
        }
    }

    public static final void NativeLoginFieldErrorSlot(String str, BRg bRg, BFM bfm, int i, int i2) {
        boolean z;
        BRg bRg2 = bRg;
        bfm.AgG(177398323);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AnonymousClass004.A11(bfm, "");
            }
            MutableState mutableState = (MutableState) objAaT;
            if (str != null) {
                if (!str.equals(mutableState.getValue())) {
                    mutableState.Af8(str);
                }
                z = true;
            } else {
                z = false;
            }
            AOe<BL4> aOe = ERROR_SIZE_SPEC;
            C1AC c1ac = C2VU.A03;
            AQI aqiA06 = AbstractC1011APs.A06(aOe, c1ac, new C05433bp(8));
            C28s c28s = C2HU.A01;
            AbstractC04661Bq.A08(aqiA06.A00(AnonymousClass003.A0P(c28s, 140, 120)), AbstractC1011APs.A0E(AnonymousClass002.A0J(c28s, 90)).A00(AbstractC1011APs.A0G(aOe, c1ac, new C05433bp(11))), bfm, bRg2, null, B1V.A00(bfm, new C125251(mutableState), 1354948875), (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 196608, 16, z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125262(str, bRg2, i, i2);
        }
    }

    /* renamed from: NativeLoginHeaderLogo-rAjV9yQ, reason: not valid java name */
    public static final void m1279NativeLoginHeaderLogorAjV9yQ(BRg bRg, float f, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        float f2 = f;
        bfm.AgG(-778008338);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 64.0f;
            }
            C1SA.A00(bfm, null, C10G.A06(C10G.A04(bRg2, MIN_TOUCH_TARGET), f2), null, BOf.A00(bfm, R.drawable.hatch_logo, 0), null, null, 0.0f, AVy.$stable | 48, 120);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new NativeLoginCommonKt$NativeLoginHeaderLogo$1(bRg2, f2, i, i2);
        }
    }

    public static final void NativeLoginPrimaryButton(String str, Function0<Unit> function0, BRg bRg, boolean z, boolean z2, BFM bfm, int i, int i2) {
        boolean z3 = z;
        boolean z4 = z2;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, function0);
        bfm.AgG(1853363871);
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
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z3);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z4);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = true;
            }
            if (i5 != 0) {
                z4 = false;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA1B = AnonymousClass003.A1B(iA0d) | AnonymousClass004.A1M(iA0d) | AnonymousClass005.A1L(iA0d) | AnonymousClass006.A1V(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new NativeLoginCommonKt$NativeLoginPrimaryButton$1$1(str, z3, z4, function0);
                bfm.Ai0(objAaT);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(bRgA0R, null, null, null, null, null, null, zA1a, (G0U) objAaT, bfm, 12582912, 126);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125292(str, function0, bRg2, z3, z4, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* renamed from: NativeLoginSmsNotice-qd-pcsU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1281NativeLoginSmsNoticeqdpcsU(X.BRg r10, int r11, kotlin.jvm.functions.Function0<kotlin.Unit> r12, X.BFM r13, int r14, int r15) {
        /*
            r9 = r11
            r11 = r10
            r0 = -1705174205(0xffffffff9a5d1b43, float:-4.572375E-23)
            r13.AgG(r0)
            r1 = r15
            r6 = r15 & 1
            r2 = r14
            if (r6 == 0) goto Lc7
            r4 = r14 | 6
        L10:
            r0 = r14 & 48
            if (r0 != 0) goto L23
            r0 = r15 & 2
            if (r0 != 0) goto L20
            boolean r3 = r13.A63(r9)
            r0 = 32
            if (r3 != 0) goto L22
        L20:
            r0 = 16
        L22:
            r4 = r4 | r0
        L23:
            r5 = r15 & 4
            if (r5 == 0) goto Lbc
            r4 = r4 | 384(0x180, float:5.38E-43)
        L29:
            r3 = r4 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            r15 = 0
            boolean r0 = X.AnonymousClass002.A1P(r3, r0)
            boolean r0 = X.AnonymousClass001.A1b(r0, r13, r4)
            if (r0 == 0) goto Lb8
            r13.Afy()
            r0 = r14 & 1
            if (r0 == 0) goto L9b
            boolean r0 = r13.AEk()
            if (r0 != 0) goto L9b
            int r4 = X.AnonymousClass003.A0C(r1, r13, r4)
        L49:
            r13.AAb()
            r0 = 2131887392(0x7f120520, float:1.940939E38)
            java.lang.String r7 = X.AbstractC2271BQs.A01(r13, r0)
            r0 = 2131887393(0x7f120521, float:1.9409392E38)
            java.lang.String r6 = X.AbstractC2271BQs.A01(r13, r0)
            com.facebook.aura.settings.AuraExternalUriRegistry r0 = com.facebook.aura.settings.AuraExternalUriRegistry.INSTANCE
            com.facebook.aura.utils.navigation.SecureUri r0 = r0.getSmsNotificationsUri()
            android.net.Uri r0 = r0.uri
            java.lang.String r5 = r0.toString()
            java.lang.String r3 = "%1$s"
            com.facebook.aura.login.nativeflow.LegalSubstitution r0 = new com.facebook.aura.login.nativeflow.LegalSubstitution
            r0.<init>(r3, r6, r5, r15)
            java.util.List r8 = java.util.Collections.singletonList(r0)
            X.Arm r10 = X.C06G.A0S(r13)
            int r0 = r4 << 3
            r3 = r0 & 896(0x380, float:1.256E-42)
            int r0 = r4 << 12
            int r3 = X.AnonymousClass001.A0B(r0, r3)
            int r0 = r4 << 9
            int r14 = X.AnonymousClass001.A08(r0, r3)
            m1280NativeLoginLinkedLegalTextgm0gx_Q(r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L88:
            X.BBb r0 = r13.AAc()
            if (r0 == 0) goto L9a
            com.facebook.aura.login.nativeflow.NativeLoginCommonKt$NativeLoginSmsNotice$2 r3 = new com.facebook.aura.login.nativeflow.NativeLoginCommonKt$NativeLoginSmsNotice$2
            r4 = r11
            r5 = r9
            r6 = r12
            r7 = r2
            r8 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A06 = r3
        L9a:
            return
        L9b:
            if (r6 == 0) goto L9f
            X.BS0 r11 = X.BRg.A00
        L9f:
            r0 = r1 & 2
            if (r0 == 0) goto La6
            r9 = 5
            r4 = r4 & (-113(0xffffffffffffff8f, float:NaN))
        La6:
            if (r5 == 0) goto L49
            java.lang.Object r12 = r13.AaT()
            java.lang.Object r0 = X.C78N.A00
            if (r12 != r0) goto Lb5
            com.facebook.aura.login.nativeflow.NativeLoginCommonKt$NativeLoginSmsNotice$1$1 r12 = com.facebook.aura.login.nativeflow.NativeLoginCommonKt$NativeLoginSmsNotice$1$1.INSTANCE
            r13.Ai0(r12)
        Lb5:
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            goto L49
        Lb8:
            r13.Afo()
            goto L88
        Lbc:
            r0 = r14 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L29
            int r0 = X.AnonymousClass004.A0V(r13, r12)
            r4 = r4 | r0
            goto L29
        Lc7:
            r0 = r14 & 6
            if (r0 != 0) goto Ld2
            int r4 = X.AnonymousClass004.A0d(r13, r10)
            r4 = r4 | r14
            goto L10
        Ld2:
            r4 = r14
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCommonKt.m1281NativeLoginSmsNoticeqdpcsU(X.BRg, int, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg autoFocus(X.BRg r10, boolean r11, X.BFM r12, int r13, int r14) {
        /*
            r1 = 0
            X.C7384Etj.A0Y(r10, r1)
            r9 = 1
            r0 = r14 & 1
            if (r0 == 0) goto La
            r11 = 1
        La:
            java.lang.Object r0 = r12.AaT()
            java.lang.Object r6 = X.C78N.A00
            java.lang.Object r5 = X.AnonymousClass003.A0d(r12, r0, r6)
            X.AkS r5 = (X.C1518AkS) r5
            java.lang.Object r4 = r12.AaT()
            if (r4 != r6) goto L24
            com.facebook.aura.login.nativeflow.AutoFocusRequest r4 = new com.facebook.aura.login.nativeflow.AutoFocusRequest
            r4.<init>(r1, r1)
            r12.Ai0(r4)
        L24:
            com.facebook.aura.login.nativeflow.AutoFocusRequest r4 = (com.facebook.aura.login.nativeflow.AutoFocusRequest) r4
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0 = r13 & 112(0x70, float:1.57E-43)
            r8 = r0 ^ 48
            r7 = 32
            if (r8 <= r7) goto L38
            boolean r0 = r12.A66(r11)
            if (r0 != 0) goto L3d
        L38:
            r1 = r13 & 48
            r0 = 0
            if (r1 != r7) goto L3e
        L3d:
            r0 = 1
        L3e:
            boolean r1 = X.AnonymousClass001.A1T(r12, r4, r0)
            java.lang.Object r0 = r12.AaT()
            if (r1 != 0) goto L4a
            if (r0 != r6) goto L52
        L4a:
            com.facebook.aura.login.nativeflow.NativeLoginCommonKt$autoFocus$1$1 r0 = new com.facebook.aura.login.nativeflow.NativeLoginCommonKt$autoFocus$1$1
            r0.<init>(r11, r4, r5)
            r12.Ai0(r0)
        L52:
            X.AnonymousClass001.A17(r12, r0, r2)
            X.BRg r3 = X.BHJ.A00(r10, r5)
            boolean r2 = r12.A67(r4)
            if (r8 <= r7) goto L65
            boolean r0 = r12.A66(r11)
            if (r0 != 0) goto L6a
        L65:
            r0 = r13 & 48
            if (r0 == r7) goto L6a
            r9 = 0
        L6a:
            r2 = r2 | r9
            java.lang.Object r1 = r12.AaT()
            if (r2 != 0) goto L73
            if (r1 != r6) goto L7b
        L73:
            com.facebook.aura.login.nativeflow.NativeLoginCommonKt$autoFocus$2$1 r1 = new com.facebook.aura.login.nativeflow.NativeLoginCommonKt$autoFocus$2$1
            r1.<init>(r4, r11, r5)
            r12.Ai0(r1)
        L7b:
            X.G0U r1 = (X.G0U) r1
            X.3UQ r0 = new X.3UQ
            r0.<init>(r1)
            X.BRg r0 = r3.then(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCommonKt.autoFocus(X.BRg, boolean, X.BFM, int, int):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.ApQ linkedSubtitle(int r6, java.lang.String r7, boolean r8, final kotlin.jvm.functions.Function0<kotlin.Unit> r9, java.lang.String[] r10, boolean r11, X.C1822Arm r12, X.BFM r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCommonKt.linkedSubtitle(int, java.lang.String, boolean, kotlin.jvm.functions.Function0, java.lang.String[], boolean, X.Arm, X.BFM, int, int):X.ApQ");
    }

    public static final String messageFor(NativeLoginFieldError nativeLoginFieldError, NativeLoginField nativeLoginField, BFM bfm, int i) {
        C7384Etj.A0Y(nativeLoginField, 1);
        String strA0e = null;
        if (nativeLoginFieldError == null || nativeLoginFieldError.field != nativeLoginField) {
            bfm.AgE(-1822920602);
        } else {
            bfm.AgE(-1822920601);
            strA0e = nativeLoginFieldError.serverMessage;
            if (strA0e == null) {
                bfm.AgE(530309901);
                strA0e = AnonymousClass003.A0e(bfm, nativeLoginFieldError.messageRes);
            } else {
                AnonymousClass004.A1A(bfm, 530309281);
            }
        }
        AnonymousClass002.A19(bfm);
        return strA0e;
    }

    public static final BRg nativeLoginTextInset(BRg bRg) {
        C7384Etj.A0Y(bRg, 0);
        return C3U4.A07(bRg, AuraDimensKt.SpacingXsmall);
    }

    public static final NativeLoginImeLift rememberImeLiftState(BFM bfm, int i) {
        C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, 1);
        boolean zA65 = bfm.A65(c1110AYwA00);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new NativeLoginImeLift(c1110AYwA00);
            bfm.Ai0(objAaT);
        }
        return (NativeLoginImeLift) objAaT;
    }

    public static final ApQ resendLinkedSubtitle(int i, boolean z, Function0<Unit> function0, String[] strArr, boolean z2, C1822Arm c1822Arm, BFM bfm, int i2, int i3) {
        boolean z3 = z2;
        C1822Arm c1822Arm2 = c1822Arm;
        AnonymousClass002.A1B(function0, 2, strArr);
        if ((i3 & 16) != 0) {
            z3 = false;
        }
        if ((i3 & 32) != 0) {
            c1822Arm2 = null;
        }
        int i4 = i2 << 3;
        return linkedSubtitle(i, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120519), z, function0, (String[]) Arrays.copyOf(strArr, strArr.length), z3, c1822Arm2, bfm, AnonymousClass001.A05(i4, AnonymousClass001.A07(i4, AnonymousClass002.A08(i4, i2 & 14))), 0);
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NativeLoginErrorDismissal.values().length];
            try {
                AnonymousClass002.A13(NativeLoginErrorDismissal.CLOSE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(NativeLoginErrorDismissal.RETURN_TO_LANDING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(NativeLoginErrorDismissal.BACK_TO_LOGIN, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(NativeLoginErrorDismissal.CONTINUE_TO_BIRTHDAY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(NativeLoginErrorDismissal.CONTINUE_TO_OTP, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void NativeLoginHero(String str, BRg bRg, ApQ apQ, boolean z, boolean z2, NativeLoginTitleStyle nativeLoginTitleStyle, BFM bfm, int i, int i2) {
        BS0 bs0;
        BRg bRg2 = bRg;
        ApQ apQ2 = apQ;
        boolean z3 = z;
        boolean z4 = z2;
        NativeLoginTitleStyle nativeLoginTitleStyle2 = nativeLoginTitleStyle;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(1672904181);
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
            iA0d |= AnonymousClass004.A0f(bfm, apQ2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z3);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z4);
        }
        int i7 = i2 & 32;
        int iA0H = 196608;
        if (i7 != 0) {
            iA0d |= iA0H;
        } else if ((i & 196608) == 0) {
            iA0H = AnonymousClass004.A0H(bfm, AnonymousClass003.A0M(nativeLoginTitleStyle2));
            iA0d |= iA0H;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                apQ2 = null;
            }
            if (i5 != 0) {
                z3 = false;
            }
            if (i6 != 0) {
                z4 = true;
            }
            if (i7 != 0) {
                nativeLoginTitleStyle2 = NativeLoginTitleStyle.TEXT;
            }
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            boolean zA1Z = AnonymousClass002.A1Z(nativeLoginTitleStyle2, NativeLoginTitleStyle.TEXT_MEDIUM);
            if (z4) {
                bfm.AgE(1927586661);
                if (z3) {
                    bfm.AgE(1927603680);
                    bs0 = BRg.A00;
                    NativeLoginHeroLogo(C10G.A07(bs0, NATIVE_LOGIN_LOGO_SIZE), bfm, 6, 0);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(1927699470);
                    AVy aVyA00 = BOf.A00(bfm, R.drawable.hatch_logo, 0);
                    bs0 = BRg.A00;
                    C1SA.A00(bfm, null, C10G.A07(bs0, NATIVE_LOGIN_LOGO_SIZE), null, aVyA00, null, null, 0.0f, AVy.$stable | 432, 120);
                    BBI.A0R(bbi, false);
                }
                C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingLarge, false);
            } else {
                bfm.AgE(1927942231);
                BBI.A0R(bbi, false);
            }
            BS0 bs02 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            m1284NativeLoginTitleoTYcxuw(str, c1062ATq, 0, zA1Z, bfm, (iA0d & 14) | 48, 4);
            if (apQ2 != null) {
                bfm.AgE(1928106531);
                C01N.A08(bfm, bs02, zA1Z ? AuraDimensKt.SpacingXsmall : AuraDimensKt.SpacingSmall);
                C1822Arm c1822ArmA00 = zA1Z ? C1822Arm.A00(null, AnonymousClass006.A0k(bfm, 1928311534).subheadlineRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16646015, 0L, 0L, C19U.A03(0), C19U.A03(20)) : AnonymousClass006.A0k(bfm, 1928436526).subheadlineRegular;
                BBI.A0R(bbi, false);
                AuraTextKt.m2640AuraTextVmYn7U0(apQ2, nativeLoginTextInset(c1062ATq), C06G.A08(bfm), c1822ArmA00, null, null, new C1YL(3), 0L, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 6) & 14, 0, 32688);
            } else {
                bfm.AgE(1928679287);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125272(str, bRg2, apQ2, z3, z4, nativeLoginTitleStyle2, i, i2);
        }
    }

    public static final void NativeLoginHeroLogo(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(298586863);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BAs bAsA01 = RememberLottieCompositionKt.A01(bfm, new B3C(R.raw.hatch_logo_intro));
            C18j c18jA00 = B2y.A00(bfm, (C6837Eap) bAsA01.getValue(), 1, 958, false);
            C6837Eap c6837Eap = (C6837Eap) bAsA01.getValue();
            boolean zA65 = bfm.A65(c18jA00);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new NativeLoginCommonKt$NativeLoginHeroLogo$1$1(c18jA00);
                bfm.Ai0(objAaT);
            }
            B3B.A00(bfm, null, bRg2, null, c6837Eap, null, null, null, (Function0) objAaT, (iA0d << 6) & 896, 0, 8184, false, false, false, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125282(bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
    /* renamed from: NativeLoginLinkedLegalText-gm0gx_Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1280NativeLoginLinkedLegalTextgm0gx_Q(java.lang.String r30, java.util.List<com.facebook.aura.login.nativeflow.LegalSubstitution> r31, int r32, X.C1822Arm r33, X.BRg r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, X.BFM r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCommonKt.m1280NativeLoginLinkedLegalTextgm0gx_Q(java.lang.String, java.util.List, int, X.Arm, X.BRg, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final void NativeLoginPasswordField(String str, G0U<? super String, Unit> g0u, String str2, Hw8 hw8, BRg bRg, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u2, BFM bfm, int i, int i2) {
        boolean z3 = z;
        boolean z4 = z2;
        G0U<? super Boolean, Unit> g0u3 = g0u2;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(g0u, str2, hw8, 1);
        bfm.AgG(894257192);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(hw8, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i4 = i2 & 32;
        int iA0s = 196608;
        if (i4 != 0) {
            iA0d |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z3);
            iA0d |= iA0s;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            iA0d |= 1572864;
        } else if ((i & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0t(bfm, z4);
        }
        int i6 = i2 & 128;
        int iA0a = 12582912;
        if (i6 != 0) {
            iA0d |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g0u3);
            iA0d |= iA0a;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = true;
            }
            if (i5 != 0) {
                z4 = false;
            }
            if (i6 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = NativeLoginCommonKt$NativeLoginPasswordField$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                g0u3 = (G0U) objAaT;
            }
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT2, obj, false);
            C19h c1yp = MutableState.A0A(mutableState) ? C19i.A00 : new C1YP();
            AuJ auJ = new AuJ(null, -1, 7, -1);
            boolean z5 = (iA0d & 7168) == 2048 || ((iA0d & 4096) != 0 && bfm.A67(hw8));
            Object objAaT3 = bfm.AaT();
            if (z5 || objAaT3 == obj) {
                objAaT3 = new NativeLoginCommonKt$NativeLoginPasswordField$2$1(hw8);
                bfm.Ai0(objAaT3);
            }
            m1282NativeLoginTextFieldWHTdp1U(str, g0u, str2, AnonymousClass001.A0Y(bRg2, objAaT3, false), z3, z4, auJ, c1yp, false, null, B1V.A00(bfm, new AnonymousClass3(g0u3, z3, mutableState), -1435899161), 0, null, null, 0L, null, bfm, AnonymousClass004.A03(iA0d >> 3, AnonymousClass002.A07(iA0d, (iA0d & 14) | 1572864)), 6, 64256);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, g0u, str2, hw8, bRg2, z3, z4, g0u3, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0156  */
    /* renamed from: NativeLoginTextField-WHTdp1U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1282NativeLoginTextFieldWHTdp1U(java.lang.String r58, X.G0U<? super java.lang.String, kotlin.Unit> r59, java.lang.String r60, X.BRg r61, boolean r62, boolean r63, X.AuJ r64, X.C19h r65, boolean r66, java.lang.String r67, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r68, int r69, X.InterfaceC1072AWd r70, java.lang.String r71, long r72, X.C1DM r74, X.BFM r75, int r76, int r77, int r78) {
        /*
            Method dump skipped, instructions count: 1165
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCommonKt.m1282NativeLoginTextFieldWHTdp1U(java.lang.String, X.G0U, java.lang.String, X.BRg, boolean, boolean, X.AuJ, X.19h, boolean, java.lang.String, X.G0V, int, X.AWd, java.lang.String, long, X.1DM, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* renamed from: NativeLoginTextLink-fWhpE4E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1283NativeLoginTextLinkfWhpE4E(java.lang.String r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, X.BRg r36, long r37, X.C1822Arm r39, boolean r40, X.BFM r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCommonKt.m1283NativeLoginTextLinkfWhpE4E(java.lang.String, kotlin.jvm.functions.Function0, X.BRg, long, X.Arm, boolean, X.BFM, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* renamed from: NativeLoginTitle-oTYcxuw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1284NativeLoginTitleoTYcxuw(java.lang.String r29, X.BRg r30, int r31, boolean r32, X.BFM r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCommonKt.m1284NativeLoginTitleoTYcxuw(java.lang.String, X.BRg, int, boolean, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* renamed from: PreloadsTosBody-5stqomU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1285PreloadsTosBody5stqomU(X.BRg r17, int r18, X.BFM r19, int r20, int r21) {
        /*
            r4 = r17
            r15 = r18
            r0 = -1707134238(0xffffffff9a3f32e2, float:-3.9538977E-23)
            r5 = r19
            r5.AgG(r0)
            r2 = r21
            r6 = r21 & 1
            r3 = r20
            if (r6 == 0) goto Ldb
            r7 = r20 | 6
        L16:
            r0 = r20 & 48
            if (r0 != 0) goto L29
            r0 = r21 & 2
            if (r0 != 0) goto L26
            boolean r1 = r5.A63(r15)
            r0 = 32
            if (r1 != 0) goto L28
        L26:
            r0 = 16
        L28:
            r7 = r7 | r0
        L29:
            r1 = r7 & 19
            r0 = 18
            r11 = 0
            boolean r0 = X.AnonymousClass002.A1P(r1, r0)
            boolean r0 = X.AnonymousClass001.A1b(r0, r5, r7)
            if (r0 == 0) goto Ld7
            r5.Afy()
            r0 = r20 & 1
            if (r0 == 0) goto Lca
            boolean r0 = r5.AEk()
            if (r0 != 0) goto Lca
            int r7 = X.AnonymousClass003.A0C(r2, r5, r7)
        L49:
            r5.AAb()
            r0 = 2131887460(0x7f120564, float:1.9409528E38)
            java.lang.String r13 = X.AbstractC2271BQs.A01(r5, r0)
            r0 = 2131887463(0x7f120567, float:1.9409534E38)
            java.lang.String r6 = X.AbstractC2271BQs.A01(r5, r0)
            com.facebook.aura.settings.AuraExternalUriRegistry r12 = com.facebook.aura.settings.AuraExternalUriRegistry.INSTANCE
            com.facebook.aura.utils.navigation.SecureUri r0 = r12.getTermsOfServiceUri()
            android.net.Uri r0 = r0.uri
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "%1$s"
            com.facebook.aura.login.nativeflow.LegalSubstitution r10 = new com.facebook.aura.login.nativeflow.LegalSubstitution
            r10.<init>(r0, r6, r1, r11)
            r0 = 2131887462(0x7f120566, float:1.9409532E38)
            java.lang.String r6 = X.AbstractC2271BQs.A01(r5, r0)
            com.facebook.aura.utils.navigation.SecureUri r0 = r12.getPrivacyPolicyUri()
            android.net.Uri r0 = r0.uri
            java.lang.String r1 = r0.toString()
            r18 = 0
            java.lang.String r0 = "%2$s"
            com.facebook.aura.login.nativeflow.LegalSubstitution r9 = new com.facebook.aura.login.nativeflow.LegalSubstitution
            r9.<init>(r0, r6, r1, r11)
            r0 = 2131887461(0x7f120565, float:1.940953E38)
            java.lang.String r8 = X.AbstractC2271BQs.A01(r5, r0)
            com.facebook.aura.utils.navigation.SecureUri r0 = r12.getPreloadsTosLearnMoreUri()
            android.net.Uri r0 = r0.uri
            java.lang.String r6 = r0.toString()
            java.lang.String r1 = "%3$s"
            com.facebook.aura.login.nativeflow.LegalSubstitution r0 = new com.facebook.aura.login.nativeflow.LegalSubstitution
            r0.<init>(r1, r8, r6, r11)
            com.facebook.aura.login.nativeflow.LegalSubstitution[] r0 = new com.facebook.aura.login.nativeflow.LegalSubstitution[]{r10, r9, r0}
            java.util.List r14 = java.util.Arrays.asList(r0)
            X.Arm r16 = X.C06G.A0T(r5)
            int r0 = r7 << 3
            r1 = r0 & 896(0x380, float:1.256E-42)
            int r0 = r7 << 12
            int r20 = X.AnonymousClass001.A0B(r0, r1)
            r21 = 32
            r17 = r4
            m1280NativeLoginLinkedLegalTextgm0gx_Q(r13, r14, r15, r16, r17, r18, r19, r20, r21)
        Lbc:
            X.BBb r1 = r5.AAc()
            if (r1 == 0) goto Lc9
            com.facebook.aura.login.nativeflow.NativeLoginCommonKt$PreloadsTosBody$1 r0 = new com.facebook.aura.login.nativeflow.NativeLoginCommonKt$PreloadsTosBody$1
            r0.<init>(r4, r15, r3, r2)
            r1.A06 = r0
        Lc9:
            return
        Lca:
            if (r6 == 0) goto Lce
            X.BS0 r4 = X.BRg.A00
        Lce:
            r0 = r21 & 2
            if (r0 == 0) goto L49
            r15 = 5
            r7 = r7 & (-113(0xffffffffffffff8f, float:NaN))
            goto L49
        Ld7:
            r5.Afo()
            goto Lbc
        Ldb:
            r0 = r20 & 6
            if (r0 != 0) goto Le7
            int r7 = X.AnonymousClass004.A0d(r5, r4)
            r7 = r7 | r20
            goto L16
        Le7:
            r7 = r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCommonKt.m1285PreloadsTosBody5stqomU(X.BRg, int, X.BFM, int, int):void");
    }

    public static final float getMIN_TOUCH_TARGET() {
        return MIN_TOUCH_TARGET;
    }

    public static final float getNATIVE_LOGIN_CONTENT_TOP_SPACING() {
        return NATIVE_LOGIN_CONTENT_TOP_SPACING;
    }

    public static final float getNATIVE_LOGIN_HEADER_LOGO_CONTENT_TOP_SPACING() {
        return NATIVE_LOGIN_HEADER_LOGO_CONTENT_TOP_SPACING;
    }

    public static final float getNATIVE_LOGIN_LOGO_SIZE() {
        return NATIVE_LOGIN_LOGO_SIZE;
    }

    public static final float getNATIVE_LOGIN_PAGE_GUTTER() {
        return NATIVE_LOGIN_PAGE_GUTTER;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ResolvedLegalText resolveLegalText(String str, List<LegalSubstitution> list) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (LegalSubstitution legalSubstitution : list) {
            Integer numValueOf = Integer.valueOf(C7BY.A0B(str, legalSubstitution.placeholder, 0, false));
            if (numValueOf.intValue() >= 0) {
                AnonymousClass002.A1J(numValueOf, legalSubstitution, arrayList3);
            }
        }
        int length = 0;
        for (HxE hxE : AbstractC0878AGe.A0c(arrayList3, new Comparator() { // from class: com.facebook.aura.login.nativeflow.NativeLoginCommonKt$resolveLegalText$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC7536F0j.A00((Integer) ((HxE) t).first, (Integer) ((HxE) t2).first);
            }
        })) {
            int iA0F = AnonymousClass001.A0F(hxE.first);
            LegalSubstitution legalSubstitution2 = (LegalSubstitution) hxE.second;
            sb.append((CharSequence) str, length, iA0F);
            String str2 = legalSubstitution2.url;
            if (str2 != null) {
                arrayList.add(new HatchTextLink(sb.length(), legalSubstitution2.value.length(), str2));
            }
            if (legalSubstitution2.isEmphasized) {
                arrayList2.add(new LegalEmphasis(sb.length(), legalSubstitution2.value.length()));
            }
            sb.append(legalSubstitution2.value);
            length = legalSubstitution2.placeholder.length() + iA0F;
        }
        sb.append((CharSequence) str, length, str.length());
        return new ResolvedLegalText(sb.toString(), arrayList, arrayList2);
    }

    public static final BRg imeAnchor(BRg bRg, NativeLoginImeLift nativeLoginImeLift) {
        AnonymousClass003.A0u(bRg, nativeLoginImeLift);
        return bRg.then(new C3UQ(new C125301(nativeLoginImeLift)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* renamed from: imeLiftedPage-6a0pyJM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg m1287imeLiftedPage6a0pyJM(X.BRg r9, com.facebook.aura.login.nativeflow.NativeLoginImeLift r10, float r11, X.BFM r12, int r13, int r14) {
        /*
            boolean r5 = X.AnonymousClass002.A1a(r9, r10)
            r0 = r14 & 2
            if (r0 == 0) goto La
            r11 = 2139095040(0x7f800000, float:Infinity)
        La:
            X.Apg r0 = X.C1743Apg.A01(r12)
            X.Ape r7 = r0.A02
            X.AKH<X.60K> r0 = X.Am0.A0I
            java.lang.Object r0 = r12.A6v(r0)
            X.60K r0 = (X.C60K) r0
            long r0 = r0.AE1()
            int r6 = X.AnonymousClass002.A09(r0)
            r0 = r13 & 112(0x70, float:1.57E-43)
            r4 = r0 ^ 48
            r3 = 32
            if (r4 <= r3) goto L2e
            boolean r0 = r12.A65(r10)
            if (r0 != 0) goto L33
        L2e:
            r0 = r13 & 48
            r1 = 0
            if (r0 != r3) goto L34
        L33:
            r1 = 1
        L34:
            java.lang.Object r0 = r12.AaT()
            if (r1 != 0) goto L3e
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L46
        L3e:
            com.facebook.aura.login.nativeflow.NativeLoginCommonKt$imeLiftedPage$1$1 r0 = new com.facebook.aura.login.nativeflow.NativeLoginCommonKt$imeLiftedPage$1$1
            r0.<init>(r10)
            r12.Ai0(r0)
        L46:
            X.BRg r8 = X.AnonymousClass003.A0V(r9, r0)
            boolean r2 = r12.A65(r7)
            if (r4 <= r3) goto L56
            boolean r0 = r12.A65(r10)
            if (r0 != 0) goto L5b
        L56:
            r1 = r13 & 48
            r0 = 0
            if (r1 != r3) goto L5c
        L5b:
            r0 = 1
        L5c:
            boolean r9 = X.AnonymousClass002.A1S(r12, r6, r2, r0)
            r0 = r13 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L6e
            boolean r0 = r12.A62(r11)
            if (r0 != 0) goto L73
        L6e:
            r1 = r13 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L74
        L73:
            r0 = 1
        L74:
            r9 = r9 | r0
            java.lang.Object r0 = r12.AaT()
            if (r9 != 0) goto L7f
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L87
        L7f:
            com.facebook.aura.login.nativeflow.NativeLoginCommonKt$imeLiftedPage$2$1 r0 = new com.facebook.aura.login.nativeflow.NativeLoginCommonKt$imeLiftedPage$2$1
            r0.<init>(r7, r10, r6, r11)
            r12.Ai0(r0)
        L87:
            X.G0U r0 = (X.G0U) r0
            X.BRg r1 = X.AYD.A03(r8, r0)
            X.AYw r0 = r10.state
            X.BRg r2 = X.AbstractC1103AYp.A02(r0, r1, r5)
            if (r4 <= r3) goto L9b
            boolean r0 = r12.A65(r10)
            if (r0 != 0) goto La0
        L9b:
            r1 = r13 & 48
            r0 = 0
            if (r1 != r3) goto La1
        La0:
            r0 = 1
        La1:
            java.lang.Object r1 = r12.AaT()
            if (r0 != 0) goto Lab
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto Lb3
        Lab:
            com.facebook.aura.login.nativeflow.NativeLoginCommonKt$imeLiftedPage$3$1 r1 = new com.facebook.aura.login.nativeflow.NativeLoginCommonKt$imeLiftedPage$3$1
            r1.<init>(r10)
            r12.Ai0(r1)
        Lb3:
            X.G0U r1 = (X.G0U) r1
            X.3UQ r0 = new X.3UQ
            r0.<init>(r1)
            X.BRg r0 = r2.then(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCommonKt.m1287imeLiftedPage6a0pyJM(X.BRg, com.facebook.aura.login.nativeflow.NativeLoginImeLift, float, X.BFM, int, int):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg imePinnedAbove(X.BRg r5, com.facebook.aura.login.nativeflow.NativeLoginImeLift r6, X.BFM r7, int r8) {
        /*
            X.AnonymousClass003.A0u(r5, r6)
            X.Apg r0 = X.C1743Apg.A01(r7)
            X.Ape r4 = r0.A02
            X.Apg r0 = X.C1743Apg.A01(r7)
            X.Ape r3 = r0.A04
            r0 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L1d
            boolean r0 = r7.A65(r6)
            if (r0 != 0) goto L22
        L1d:
            r0 = r8 & 48
            r1 = 0
            if (r0 != r2) goto L23
        L22:
            r1 = 1
        L23:
            java.lang.Object r0 = r7.AaT()
            if (r1 != 0) goto L2d
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L35
        L2d:
            com.facebook.aura.login.nativeflow.NativeLoginCommonKt$imePinnedAbove$1$1 r0 = new com.facebook.aura.login.nativeflow.NativeLoginCommonKt$imePinnedAbove$1$1
            r0.<init>(r6)
            r7.Ai0(r0)
        L35:
            X.G0U r0 = (X.G0U) r0
            X.BRg r2 = X.BIj.A00(r5, r0)
            boolean r1 = X.AnonymousClass003.A1K(r7, r4, r3)
            java.lang.Object r0 = r7.AaT()
            if (r1 != 0) goto L49
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L51
        L49:
            com.facebook.aura.login.nativeflow.NativeLoginCommonKt$imePinnedAbove$2$1 r0 = new com.facebook.aura.login.nativeflow.NativeLoginCommonKt$imePinnedAbove$2$1
            r0.<init>(r4, r3)
            r7.Ai0(r0)
        L51:
            X.G0U r0 = (X.G0U) r0
            X.BRg r0 = X.AYD.A03(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginCommonKt.imePinnedAbove(X.BRg, com.facebook.aura.login.nativeflow.NativeLoginImeLift, X.BFM, int):X.BRg");
    }
}
