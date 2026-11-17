package com.facebook.aura.status.view;

import X.AKH;
import X.AKQ;
import X.ATF;
import X.AVy;
import X.AYD;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0v5;
import X.C0z7;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1D8;
import X.C1DG;
import X.C1b8;
import X.C2VU;
import X.C31t;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.avatarsize.HatchAvatarSize;
import com.facebook.aura.avatarsize.HatchAvatarSizeKt;
import com.facebook.aura.conversation.common.HatchPendingMessage;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import com.facebook.aura.vds.compose.accessibility.AuraHapticsKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAvatarEditMenuButtonKt {
    public static final float AVATAR_CIRCLE_CORNER_INSET_RATIO = 0.1464f;
    public static final int AVATAR_EDIT_BADGE_ENTER_DELAY_MS = 350;
    public static final int AVATAR_EDIT_BADGE_FADE_DURATION_MS = 200;
    public static final float AVATAR_EDIT_BADGE_ICON_RATIO = 0.5f;
    public static final int AVATAR_EDIT_MENU_CHANGE_AVATAR = 1;
    public static final int AVATAR_EDIT_MENU_CHANGE_VOICE = 3;
    public static final int AVATAR_EDIT_MENU_EDIT_NAME = 2;
    public static final float AvatarEditBadgeElevation = 4.0f;
    public static final float AvatarEditBadgeSizeLarge = 32.0f;
    public static final float AvatarEditBadgeSizeMedium = 28.0f;
    public static final float AvatarEditBadgeSizeSmall = 24.0f;

    public static final void logAvatarEditMenuPick(int i) {
        HatchComponent hatchComponent;
        if (i == 1) {
            hatchComponent = HatchComponent.EDIT_MENU_CHANGE_AVATAR;
        } else if (i == 2) {
            hatchComponent = HatchComponent.EDIT_MENU_EDIT_NAME;
        } else if (i != 3) {
            return;
        } else {
            hatchComponent = HatchComponent.EDIT_MENU_CHANGE_VOICE;
        }
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, null, HatchScreen.BOT_SHEET, hatchComponent, null, null, null);
    }

    /* renamed from: HatchAvatarEditBadge-Kz89ssw, reason: not valid java name */
    public static final void m2219HatchAvatarEditBadgeKz89ssw(float f, Function0<Float> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-753539294);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA04 |= 384;
        } else if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            float fRememberHatchAvatarScale = HatchAvatarSizeKt.rememberHatchAvatarScale(bfm, 0);
            float f2 = C1DG.A01(f, (HatchAvatarSize.LARGE.m278getBaseSizeDpD9Ej5fM() * fRememberHatchAvatarScale) * 1.5f) >= 0 ? AvatarEditBadgeSizeLarge : C1DG.A01(f, (HatchAvatarSize.MEDIUM.m278getBaseSizeDpD9Ej5fM() * fRememberHatchAvatarScale) * 1.5f) >= 0 ? AvatarEditBadgeSizeMedium : AvatarEditBadgeSizeSmall;
            float f3 = (f2 / 2.0f) - (0.1464f * f);
            BRg bRgA07 = C10G.A07(AYD.A01(bRgA0P, f3, f3), f2);
            boolean zA1N = AnonymousClass001.A1N(iA04);
            Object objAaT = bfm.AaT();
            if (zA1N || objAaT == C78N.A00) {
                objAaT = new HatchAvatarEditMenuButtonKt$HatchAvatarEditBadge$1$1(function0);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA07, objAaT);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA00 = AbstractC07539Wl.A00(C1b8.A03(bRgA0W, C1D8.A00, AnonymousClass001.A0f(bfm, akh).secondaryElevated), "hatch-status-avatar-edit-button");
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0D);
            float f4 = f2 * 0.5f;
            AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(BRg.A00, f4), BOf.A00(bfm, R.drawable.pencil_wght400_outline_24, 0), AuraIconKt.m2570auraIconSizeFromDp8Feqmps(f4, bfm, 0), null, C06G.A0L(bfm, akh), null, bfm, (AVy.$stable << 3) | 3072, 32);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchAvatarEditMenuButtonKt$HatchAvatarEditBadge$3(f, function0, bRgA0P, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v1, types: [com.facebook.aura.vds.compose.contextmenu.AuraContextMenuStyle] */
    /* JADX WARN: Type inference failed for: r32v1, types: [X.AYw] */
    /* JADX WARN: Type inference failed for: r36v0, types: [X.AHD] */
    /* JADX WARN: Type inference failed for: r37v0, types: [X.1DG] */
    /* JADX WARN: Type inference failed for: r38v1, types: [X.G0U] */
    /* JADX WARN: Type inference failed for: r44v0, types: [X.BFM, java.lang.Object] */
    /* renamed from: HatchAvatarEditMenu-AjpBEmI, reason: not valid java name */
    public static final void m2220HatchAvatarEditMenuAjpBEmI(float f, boolean z, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        ATF atf;
        BS0 bs0;
        Object objA00;
        BRg bRgA0P = bRg;
        C7384Etj.A0Y(g0w, 3);
        bfm.AgG(-1518036884);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA04 |= 384;
        } else if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        if ((i & 3072) == 0) {
            iA04 |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 1171, 1170), bfm, iA04)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            boolean zA1C = AnonymousClass003.A1C(iA04);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121027);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12102c);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121028);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12102d);
            String strA015 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121029);
            String strA016 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12102a);
            String strA017 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12102b);
            boolean zA65 = bfm.A65(mutableState);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$openMenu$1$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            BRg bRgA07 = C10G.A07(bRgA0P, f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0D);
            C0z7 c0z7 = C0z7.A00;
            if (z) {
                bfm.AgE(1122913466);
                bs0 = BRg.A00;
                atf = null;
                BRg bRgA05 = C0v5.A05(AuraHapticsKt.m2392auraHapticZShFqVg(C10G.A01, AuraHaptics.BUTTON_TAP, true), null, function0, true);
                boolean zA652 = bfm.A65(strA017);
                Object objAaT3 = bfm.AaT();
                if (zA652 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$1$avatarModifier$1$1(strA017);
                    bfm.Ai0(objAaT3);
                }
                objA00 = AbstractC07539Wl.A00(AnonymousClass001.A0Y(bRgA05, objAaT3, false), "hatch-status-avatar-edit-target");
                BBI.A0R(bbi, false);
            } else {
                atf = null;
                bfm.AgE(1123199472);
                BBI.A0R(bbi, false);
                bs0 = BRg.A00;
                objA00 = C10G.A01;
            }
            AnonymousClass001.A1G(objA00, bfm, g0w, (iA04 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            float f2 = 0.0f;
            int i4 = 0;
            if (z) {
                f2 = 1.0f;
                i4 = 350;
            }
            C1BO c1boA01 = C31t.A01(AnonymousClass001.A0K(200, i4), bfm, f2, 3072, 20);
            boolean zA653 = bfm.A65(c1boA01);
            Object objAaT4 = bfm.AaT();
            if (zA653 || objAaT4 == C78N.A00) {
                objAaT4 = AnonymousClass002.A0K(bfm, atf, new HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$1$isBadgeComposed$2$1(c1boA01));
            }
            if (C1BO.A0F((C1BO) objAaT4)) {
                boolean zA1Y = AnonymousClass001.A1Y(c1boA01, bfm, 1124022956);
                Object objAaT5 = bfm.AaT();
                if (zA1Y || objAaT5 == C78N.A00) {
                    objAaT5 = new HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$1$1$1(c1boA01);
                    bfm.Ai0(objAaT5);
                }
                m2219HatchAvatarEditBadgeKz89ssw(f, (Function0) objAaT5, c0z7.A4C(C2VU.A07, bs0), bfm, iA04 & 14, 0);
            } else {
                bfm.AgE(1124192092);
            }
            BBI.A0R(bbi, false);
            BRg bRgAQJ = c0z7.AQJ(bs0);
            boolean zA0A = MutableState.A0A(mutableState);
            long jFloatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(8.0f) & 4294967295L);
            boolean zA1W = AnonymousClass005.A1W(bfm, auraNavigatorA0b, strA014, strA016, AnonymousClass003.A1K(bfm, mutableState, strA013));
            Object objAaT6 = bfm.AaT();
            if (zA1W || objAaT6 == C78N.A00) {
                objAaT6 = new HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$1$2$1(strA013, auraNavigatorA0b, strA014, strA016, mutableState);
                bfm.Ai0(objAaT6);
            }
            G0U g0u = (G0U) objAaT6;
            boolean zA654 = bfm.A65(mutableState);
            Object objAaT7 = bfm.AaT();
            if (zA654 || objAaT7 == C78N.A00) {
                objAaT7 = new HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$1$3$1(mutableState);
                bfm.Ai0(objAaT7);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(bRgAQJ, g0u, (Function0) objAaT7, zA0A, atf, jFloatToRawIntBits, atf, false, new HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$1$4(strA01, strA012, strA015), false, atf, atf, atf, false, bfm, 196608, 0, 16080);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchAvatarEditMenuButtonKt$HatchAvatarEditMenu$2(f, z, bRgA0P, g0w, i, i2);
        }
    }

    public static final void logAvatarEditMenuDismiss() {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.STATUS, null, HatchScreen.BOT_SHEET, HatchComponent.EDIT_BUTTON, null, null);
    }

    public static final void draftIdentityPromptInComposer(String str, AuraNavigator auraNavigator) {
        AnonymousClass003.A0u(str, auraNavigator);
        auraNavigator.back();
        HatchPendingMessage.INSTANCE.setPendingComposerText(str, null);
        AnonymousClass006.A1D(auraNavigator);
    }
}
