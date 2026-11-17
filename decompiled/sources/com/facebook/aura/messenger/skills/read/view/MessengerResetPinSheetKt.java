package com.facebook.aura.messenger.skills.read.view;

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
import X.C06G;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.MessengerPinLockoutReason;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class MessengerResetPinSheetKt {

    /* renamed from: com.facebook.aura.messenger.skills.read.view.MessengerResetPinSheetKt$MessengerResetPinSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ MessengerPinLockoutReason $reason;

        /* renamed from: com.facebook.aura.messenger.skills.read.view.MessengerResetPinSheetKt$MessengerResetPinSheet$1$WhenMappings */
        /* loaded from: classes3.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MessengerPinLockoutReason.values().length];
                try {
                    AnonymousClass002.A13(MessengerPinLockoutReason.TOO_MANY_ATTEMPTS, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(MessengerPinLockoutReason.RATE_LIMITED, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(MessengerPinLockoutReason.NO_PIN, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MessengerPinLockoutReason messengerPinLockoutReason, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, Context context, AuraNavigator auraNavigator, String str) {
            super(3);
            this.$reason = messengerPinLockoutReason;
            this.$origin = hatchSkillOAuthOrigin;
            this.$context = context;
            this.$navigator = auraNavigator;
            this.$iconUrl = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r28v0 */
        /* JADX WARN: Type inference failed for: r28v1, types: [X.ApY, X.G0W] */
        /* JADX WARN: Type inference failed for: r28v2 */
        public final void invoke(C07C c07c, BFM bfm, int i) {
            ?? r28;
            int i2;
            String strA0s;
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA0C = C3U4.A0C(C3U4.A0B(c1062ATq, 20.0f, 0.0f), 0.0f, 0.0f, 0.0f, 24.0f);
                C3TH c3th = C2VU.A00;
                MessengerPinLockoutReason messengerPinLockoutReason = this.$reason;
                HatchSkillOAuthOrigin hatchSkillOAuthOrigin = this.$origin;
                Context context = this.$context;
                AuraNavigator auraNavigator = this.$navigator;
                String str = this.$iconUrl;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i3 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i3);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                BRg bRgA0C2 = C3U4.A0C(bs0, 0.0f, 24.0f, 0.0f, 12.0f);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0C2);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                if (str != null) {
                    bfm.AgE(2004762374);
                    r28 = 0;
                    AuraImageKt.m2573AuraImageXRP3Ue8(str, C11U.A01(C10G.A07(bs0, 48.0f), 14.0f), null, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, 3072, 0, 32756);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(2004961704);
                    r28 = 0;
                    AuraImageKt.AuraImage(new AuraDrawableSourceResource(R.drawable.app_icon_messenger_squircle), C11U.A01(C10G.A07(bs0, 48.0f), 14.0f), null, null, false, false, null, false, null, bfm, 384, 504);
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, true);
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                int iOrdinal = messengerPinLockoutReason.ordinal();
                if (iOrdinal != 0 && iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        i2 = R.string._name_removed__res_0x7f120f8f;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i2 = R.string._name_removed__res_0x7f120f98;
                }
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i2), C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, 12.0f), C06G.A0C(bfm), C06G.A0U(bfm), null, r28, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        bfm.AgE(-931004547);
                        strA0s = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120f8e);
                        BBI.A0R(bbi, false);
                    } else {
                        bfm.AgE(-931009034);
                        strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120f96);
                    }
                } else {
                    bfm.AgE(-931013303);
                    strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120f95);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA0s, C3U4.A0C(c1062ATq, 0.0f, 0.0f, 0.0f, 20.0f), C06G.A08(bfm), C06G.A0Z(bfm), null, r28, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f97);
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                AuraLabelButtonStyle auraLabelButtonStylePrimary = auraButtonStyles.primary(null, bfm, 48, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
                int iOrdinal2 = hatchSkillOAuthOrigin.ordinal();
                boolean zA1Y = AnonymousClass005.A1Y(bfm, context, auraNavigator, bfm.A63(iOrdinal2), bfm.A63(iOrdinal));
                Object objAaT = bfm.AaT();
                if (zA1Y || objAaT == C78N.A00) {
                    objAaT = new MessengerResetPinSheetKt$MessengerResetPinSheet$1$1$2$1(hatchSkillOAuthOrigin, messengerPinLockoutReason, context, auraNavigator);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, r28, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f99);
                AuraLabelButtonStyle auraLabelButtonStyleTertiary = auraButtonStyles.tertiary(null, bfm, 48, 1);
                BRg bRgA0C3 = C3U4.A0C(c1062ATq, 0.0f, 6.0f, 0.0f, 0.0f);
                boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigator, bfm.A63(iOrdinal2), bfm.A63(iOrdinal));
                Object objAaT2 = bfm.AaT();
                if (zA1V || objAaT2 == C78N.A00) {
                    objAaT2 = new MessengerResetPinSheetKt$MessengerResetPinSheet$1$1$3$1(hatchSkillOAuthOrigin, messengerPinLockoutReason, auraNavigator);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, bRgA0C3, auraLabelButtonStyleTertiary, auraButtonSize, r28, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.messenger.skills.read.view.MessengerResetPinSheetKt$MessengerResetPinSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ MessengerPinLockoutReason $reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str, MessengerPinLockoutReason messengerPinLockoutReason, int i, int i2) {
            super(2);
            this.$origin = hatchSkillOAuthOrigin;
            this.$iconUrl = str;
            this.$reason = messengerPinLockoutReason;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            MessengerResetPinSheetKt.MessengerResetPinSheet(this.$origin, this.$iconUrl, this.$reason, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void MessengerResetPinSheet(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str, MessengerPinLockoutReason messengerPinLockoutReason, BFM bfm, int i, int i2) {
        String str2 = str;
        MessengerPinLockoutReason messengerPinLockoutReason2 = messengerPinLockoutReason;
        C7384Etj.A0Y(hatchSkillOAuthOrigin, 0);
        bfm.AgG(-2030214958);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchSkillOAuthOrigin) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, str2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(messengerPinLockoutReason2));
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            if (i3 != 0) {
                str2 = null;
            }
            if (i4 != 0) {
                messengerPinLockoutReason2 = MessengerPinLockoutReason.TOO_MANY_ATTEMPTS;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, null, null, null, null, null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass1(messengerPinLockoutReason2, hatchSkillOAuthOrigin, AnonymousClass003.A0O(bfm), AnonymousClass003.A0b(bfm), str2), 917514805), bfm, 0, 48, 2047);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchSkillOAuthOrigin, str2, messengerPinLockoutReason2, i, i2);
        }
    }
}
