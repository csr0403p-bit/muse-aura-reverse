package com.facebook.aura.login.nativeflow;

import X.AKQ;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1DM;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.profilepicture.AuraBadgedProfilePictureKt;
import com.facebook.aura.vds.compose.profilepicture.AuraProfilePictureKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginProfilesSheetKt {
    public static final float PROFILE_AVATAR_STYLE = 40.0f;
    public static final float PROFILE_CARD_MIN_HEIGHT = 56.0f;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginProfilesSheetKt$NativeLoginProfileCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $accountLabel;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ NativeLoginProfileUiModel $profile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NativeLoginProfileUiModel nativeLoginProfileUiModel, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$profile = nativeLoginProfileUiModel;
            this.$accountLabel = str;
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
            NativeLoginProfilesSheetKt.NativeLoginProfileCard(this.$profile, this.$accountLabel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginProfilesSheetKt$NativeLoginProfilesCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(NativeLoginAccountUiModel nativeLoginAccountUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$account = nativeLoginAccountUiModel;
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
            NativeLoginProfilesSheetKt.NativeLoginProfilesCard(this.$account, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginProfilesSheetKt$NativeLoginProfilesSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ NativeLoginAccountUiModel $account;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
            super(3);
            this.$account = nativeLoginAccountUiModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BRg bRgA07 = C3U4.A07(C10G.A02, AuraDimensKt.SpacingMedium);
                C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingSmall);
                NativeLoginAccountUiModel nativeLoginAccountUiModel = this.$account;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA07);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                bfm.AgE(-84904998);
                Iterator it = nativeLoginAccountUiModel.profiles.iterator();
                while (it.hasNext()) {
                    NativeLoginProfilesSheetKt.NativeLoginProfileCard((NativeLoginProfileUiModel) it.next(), nativeLoginAccountUiModel.displayName, null, bfm, NativeLoginProfileUiModel.$stable, 4);
                }
                AnonymousClass003.A0q(bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginProfilesSheetKt$NativeLoginProfilesSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C125612 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125612(NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$account = nativeLoginAccountUiModel;
            this.$onDismiss = function0;
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
            NativeLoginProfilesSheetKt.NativeLoginProfilesSheet(this.$account, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: NativeLoginProfileAvatar-KGdREcs, reason: not valid java name */
    public static final void m1304NativeLoginProfileAvatarKGdREcs(String str, String str2, BRg bRg, AuraDrawableSource auraDrawableSource, float f, float f2, float f3, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> nativeLoginProfilesSheetKt$NativeLoginProfileAvatar$6;
        BRg bRg2 = bRg;
        AuraDrawableSource auraDrawableSource2 = auraDrawableSource;
        float f4 = f2;
        float f5 = f3;
        float f6 = f;
        bfm.AgG(-479493887);
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
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(auraDrawableSource2, bfm, i) ? 1 : 0);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A08(bfm, f6);
        }
        int i6 = i2 & 32;
        int iA09 = 196608;
        if (i6 != 0) {
            iA0d |= iA09;
        } else if ((196608 & i) == 0) {
            iA09 = AnonymousClass004.A09(bfm, f4);
            iA0d |= iA09;
        }
        int i7 = i2 & 64;
        int iA0A = 1572864;
        if (i7 != 0) {
            iA0d |= iA0A;
        } else if ((i & 1572864) == 0) {
            iA0A = AnonymousClass004.A0A(bfm, f5);
            iA0d |= iA0A;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 599187, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                auraDrawableSource2 = null;
            }
            if (i5 != 0) {
                f6 = PROFILE_AVATAR_STYLE;
            }
            if (i6 != 0) {
                f4 = 17.0f;
            }
            if (i7 != 0) {
                f5 = 4.0f;
            }
            if (str == null) {
                bfm.AgE(459152415);
                if (auraDrawableSource2 != null) {
                    bfm.AgE(459178021);
                    BRg bRgA07 = C10G.A07(bRg2, f6);
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = NativeLoginProfilesSheetKt$NativeLoginProfileAvatar$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    AuraImageKt.AuraImage(auraDrawableSource2, AnonymousClass001.A0X(bRgA07, objAaT), null, null, false, false, null, false, null, bfm, ((iA0d >> 9) & 14) | 384, 504);
                    AnonymousClass006.A1N(bfm);
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        nativeLoginProfilesSheetKt$NativeLoginProfileAvatar$6 = new NativeLoginProfilesSheetKt$NativeLoginProfileAvatar$2(str, str2, bRg2, auraDrawableSource2, f6, f4, f5, i, i2);
                    }
                } else {
                    BBI bbiA0M = AnonymousClass002.A0M(bfm, 459358689);
                    C01N.A0A(bfm, bRg2, f6);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbiA0M);
                    if (bBbAAc == null) {
                        return;
                    } else {
                        nativeLoginProfilesSheetKt$NativeLoginProfileAvatar$6 = new NativeLoginProfilesSheetKt$NativeLoginProfileAvatar$3(str, str2, bRg2, auraDrawableSource2, f6, f4, f5, i, i2);
                    }
                }
                bBbAAc.A06 = nativeLoginProfilesSheetKt$NativeLoginProfileAvatar$6;
            }
            BBI bbiA0M2 = AnonymousClass002.A0M(bfm, 459554113);
            AuraDrawableSource auraDrawableSourceLinkedAccountBadge = NativeLoginAccountRowKt.linkedAccountBadge(str2);
            if (auraDrawableSourceLinkedAccountBadge == null) {
                Object objA0p = AnonymousClass001.A0p(bfm, 459623770);
                if (objA0p == C78N.A00) {
                    objA0p = NativeLoginProfilesSheetKt$NativeLoginProfileAvatar$4$1.INSTANCE;
                    bfm.Ai0(objA0p);
                }
                AuraProfilePictureKt.m2594AuraProfilePictured7e1vww(str, f6, AnonymousClass001.A0X(bRg2, objA0p), null, null, null, null, null, null, null, 0.0f, bfm, (iA0d & 14) | ((iA0d >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0, 2040);
            } else {
                Object objA0p2 = AnonymousClass001.A0p(bfm, 459772415);
                if (objA0p2 == C78N.A00) {
                    objA0p2 = NativeLoginProfilesSheetKt$NativeLoginProfileAvatar$5$1.INSTANCE;
                    bfm.Ai0(objA0p2);
                }
                AuraBadgedProfilePictureKt.m2593AuraBadgedProfilePicture7lJwU(str, auraDrawableSourceLinkedAccountBadge, AnonymousClass001.A0X(bRg2, objA0p2), f6, f4, null, 0.0f, f5, bfm, AnonymousClass003.A07(iA0d >> 3, iA0d & 14) | ((iA0d << 3) & 29360128), 96);
            }
            BBI.A0R(bbiA0M2, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            nativeLoginProfilesSheetKt$NativeLoginProfileAvatar$6 = new NativeLoginProfilesSheetKt$NativeLoginProfileAvatar$6(str, str2, bRg2, auraDrawableSource2, f6, f4, f5, i, i2);
            bBbAAc.A06 = nativeLoginProfilesSheetKt$NativeLoginProfileAvatar$6;
        }
    }

    public static final void NativeLoginProfileCard(NativeLoginProfileUiModel nativeLoginProfileUiModel, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2141656260);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginProfileUiModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
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
            BRg bRgA0V = AnonymousClass001.A0V(C1b8.A01(C11U.A03(AnonymousClass001.A0R(bRg2), C06G.A0R(bfm)), AnonymousClass002.A0c(bfm).secondaryElevated), PROFILE_CARD_MIN_HEIGHT);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgA0V, f, f2);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f2);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0K, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            m1304NativeLoginProfileAvatarKGdREcs(nativeLoginProfileUiModel.photoUrl, nativeLoginProfileUiModel.platform, null, null, 0.0f, 0.0f, 0.0f, bfm, 0, 124);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingMicro);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str2 = nativeLoginProfileUiModel.displayName;
            if (str2 == null) {
                str2 = str;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A0C(bfm), C06G.A0W(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            Integer numProfileTypeLabelRes = profileTypeLabelRes(nativeLoginProfileUiModel.platform);
            if (numProfileTypeLabelRes != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass003.A0g(bfm, numProfileTypeLabelRes, 1572016169), null, C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            } else {
                bfm.AgE(1572265316);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(nativeLoginProfileUiModel, str, bRg2, i, i2);
        }
    }

    public static final void NativeLoginProfilesCard(NativeLoginAccountUiModel nativeLoginAccountUiModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(nativeLoginAccountUiModel, 0);
        bfm.AgG(-112314270);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginAccountUiModel, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = NativeLoginProfilesSheetKt$NativeLoginProfilesCard$sheetOpen$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0K = AnonymousClass006.A0K(bfm, objAaT, objArr);
            boolean zA65 = bfm.A65(mutableStateA0K);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new NativeLoginProfilesSheetKt$NativeLoginProfilesCard$1$1(mutableStateA0K);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C1DM c1dmA0R = C06G.A0R(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120546);
            int i4 = NativeLoginAccountUiModel.$stable;
            int i5 = iA05 & 14;
            NativeLoginAccountRowKt.NativeLoginAccountRow(nativeLoginAccountUiModel, (Function0) objAaT2, bRgA0R, false, false, c1dmA0R, strA01, false, bfm, i4 | i5, 152);
            if (MutableState.A0A(mutableStateA0K)) {
                boolean zA1Y = AnonymousClass001.A1Y(mutableStateA0K, bfm, -174453784);
                Object objAaT3 = bfm.AaT();
                if (zA1Y || objAaT3 == obj) {
                    objAaT3 = new NativeLoginProfilesSheetKt$NativeLoginProfilesCard$2$1(mutableStateA0K);
                    bfm.Ai0(objAaT3);
                }
                NativeLoginProfilesSheet(nativeLoginAccountUiModel, (Function0) objAaT3, null, bfm, i4 | i5, 4);
            } else {
                bfm.AgE(-174369216);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(nativeLoginAccountUiModel, bRg2, i, i2);
        }
    }

    public static final void NativeLoginProfilesSheet(NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(857123745);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(nativeLoginAccountUiModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
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
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(null, bRg2, function0, RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, null, false, bfm, 0, 7), null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12050b), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), null, null, null, null, false, false, false, B1V.A00(bfm, new AnonymousClass1(nativeLoginAccountUiModel), 112909566), bfm, ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA05 << 3) & 896), 3072, 8145);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125612(nativeLoginAccountUiModel, function0, bRg2, i, i2);
        }
    }

    public static final float getPROFILE_AVATAR_STYLE() {
        return PROFILE_AVATAR_STYLE;
    }

    public static final Integer profileTypeLabelRes(String str) {
        int i;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1337936983:
                if (!str.equals(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_THREADS)) {
                    return null;
                }
                i = R.string._name_removed__res_0x7f120509;
                break;
            case 101664:
                if (!str.equals("frl")) {
                    return null;
                }
                i = R.string._name_removed__res_0x7f120506;
                break;
            case 2987536:
                if (!str.equals(NativeLoginRememberedRowsKt.REMEMBERED_ROW_GLYPH_PLATFORM)) {
                    return null;
                }
                i = R.string._name_removed__res_0x7f120508;
                break;
            case 28903346:
                if (!str.equals(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM)) {
                    return null;
                }
                i = R.string._name_removed__res_0x7f120507;
                break;
            case 497130182:
                if (!str.equals(MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK)) {
                    return null;
                }
                i = R.string._name_removed__res_0x7f120505;
                break;
            case 1934780818:
                if (!str.equals(NativeLoginAccountResolverKt.WHATSAPP_USER_ID)) {
                    return null;
                }
                i = R.string._name_removed__res_0x7f12050a;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i);
    }
}
