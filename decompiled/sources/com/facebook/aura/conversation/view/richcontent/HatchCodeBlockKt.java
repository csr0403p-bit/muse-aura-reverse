package com.facebook.aura.conversation.view.richcontent;

import X.AEk;
import X.AKH;
import X.AKQ;
import X.AbstractC1103AYp;
import X.AbstractC1996Aw5;
import X.AbstractC2271BQs;
import X.AcQ;
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
import X.BPg;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D3;
import X.C1D8;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.button.IconContext;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchCodeBlockKt {
    public static final float CODE_PADDING = 12.0f;
    public static final float COLLAPSED_HEIGHT = 400.0f;
    public static final float CORNER_RADIUS = 8.0f;
    public static final float HEADER_HEIGHT = 44.0f;

    /* renamed from: HatchCodeBlock-hGBTI10, reason: not valid java name */
    public static final void m675HatchCodeBlockhGBTI10(String str, String str2, BRg bRg, float f, Function0<Unit> function0, BFM bfm, int i, int i2) {
        Function0<Unit> function02;
        String strA0v;
        String strA0s;
        BRg bRg2 = bRg;
        float f2 = f;
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        bfm.AgG(-1105844740);
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
            iA0d |= AnonymousClass004.A07(bfm, f2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 12.0f;
            }
            function02 = i5 == 0 ? function0 : null;
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120854);
            int i6 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = AnonymousClass002.A1Q(i6, 32);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean zA1G = AnonymousClass003.A1G(bfm, LocalIsPrimaryThreadKt.LocalIsPrimaryThread);
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-1821020391);
                Unit unit = Unit.INSTANCE;
                boolean zA65 = bfm.A65(mutableState);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchCodeBlockKt$HatchCodeBlock$1$1(mutableState, null);
                    bfm.Ai0(objAaT2);
                }
                AnonymousClass001.A18(bfm, objAaT2, unit);
            } else {
                bfm.AgE(-1820946394);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            C1D3 c1d3A00 = C1D8.A00(CORNER_RADIUS);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0K = C06G.A0K(bfm, akh);
            long jA0K2 = C06G.A0K(bfm, akh);
            long jA0E = C06G.A0E(bfm, akh);
            boolean zA18 = AnonymousClass003.A18(i6);
            Object objAaT3 = bfm.AaT();
            if (zA18 || objAaT3 == C78N.A00) {
                int i7 = 0;
                for (int i8 = 0; i8 < str2.length(); i8++) {
                    if (str2.charAt(i8) == '\n') {
                        i7++;
                    }
                }
                objAaT3 = Integer.valueOf(i7 + 1);
                bfm.Ai0(objAaT3);
            }
            boolean z = AnonymousClass001.A0F(objAaT3) > 20;
            BRg bRgA0B = C3U4.A0B(bRg2, 0.0f, f2);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            long j = bbi.A06;
            int i9 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i9);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA0A = BRg.A00;
            BRg bRgA03 = C11U.A03(bRgA0A, c1d3A00);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA03.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            BRg bRgA04 = C10G.A04(c1062ATq, HEADER_HEIGHT);
            C1DM c1dm = C1OM.A00;
            BRg bRgA032 = C1b8.A03(bRgA04, c1dm, jA0K);
            boolean zA64 = bfm.A64(jA0E);
            Object objAaT4 = bfm.AaT();
            if (zA64 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchCodeBlockKt$HatchCodeBlock$2$1$1$1(jA0E);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA02 = AEk.A02(bRgA032, (G0U) objAaT4);
            float f3 = CODE_PADDING;
            BRg bRgA0B2 = C3U4.A0B(bRgA02, f3, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA003 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0B2);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA003, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            C90m c90m = C90m.A00;
            if (str.length() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) AnonymousClass006.A0q(str.charAt(0)));
                strA0v = AnonymousClass001.A0v(str.substring(zA1a ? 1 : 0), sb);
            } else {
                strA0v = str;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, AnonymousClass001.A0O(c90m, bRgA0A, zA1a), C06G.A08(bfm), AnonymousClass002.A0f(bfm).footnoteEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(508574400);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120ac2);
            } else {
                bfm.AgE(-1414006735);
                BBI.A0R(bbi, false);
                strA0s = null;
            }
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = auraButtonStyles.secondary(null, bfm, 48, zA1a ? 1 : 0);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            G0W<IconContext, BFM, Integer, Unit> g0w = ComposableSingletons$HatchCodeBlockKt.lambda$1917249636;
            int i10 = iA0d & 14;
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableState, AnonymousClass003.A1O(bfm, contextA0H, strA01, AnonymousClass001.A1T(bfm, mapCurrentChatThreadLogMetadata, AnonymousClass002.A1O(i10))), AnonymousClass002.A1Q(i6, 32));
            Object objAaT5 = bfm.AaT();
            if (zA1W || objAaT5 == C78N.A00) {
                objAaT5 = new HatchCodeBlockKt$HatchCodeBlock$2$1$2$2$1(str, mapCurrentChatThreadLogMetadata, contextA0H, strA01, str2, mutableState);
                bfm.Ai0(objAaT5);
            }
            Function0 function04 = (Function0) objAaT5;
            Object objAaT6 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT6 == obj) {
                objAaT6 = HatchCodeBlockKt$HatchCodeBlock$2$1$2$3$1.INSTANCE;
                bfm.Ai0(objAaT6);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0s, null, null, auraLabelButtonStyleSecondary, auraButtonSize, g0w, false, false, false, false, false, null, null, function04, null, null, null, null, null, null, (Function0) objAaT6, null, false, 0, false, 0, bfm, 1769472, 0, 48, 132104077);
            BBI.A0R(bbi, zA1a);
            if (z) {
                bRgA0A = C10G.A0A(bRgA0A, Float.NaN, COLLAPSED_HEIGHT);
            }
            BRg bRgA09 = C3U4.A09(AbstractC1103AYp.A01(AbstractC1103AYp.A00(0, bfm, 0, zA1a ? 1 : 0), C1b8.A03(bRgA0A.then(c1062ATq), c1dm, jA0K2), zA1a), f3);
            Alignment alignment = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            int iA0D3 = AnonymousClass001.A0D(bbi);
            AKQ akqA044 = BBI.A04(bbi);
            BRg bRgA014 = AxM.A01(bfm, bRgA09);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA01, g0v);
            BPg.A02(bfm, akqA044, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA014, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A0C(bfm), C1822Arm.A00(null, C06G.A0Y(bfm), AbstractC1996Aw5.A01, null, null, null, null, null, null, null, 0, 0, 0, 16777183, 0L, 0L, 0L, 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16370);
            BBI.A0R(bbi, zA1a);
            if (!z || function02 == null) {
                bfm.AgE(477713234);
            } else {
                bfm.AgE(476612889);
                BRg bRgA033 = C1b8.A03(c1062ATq, c1dm, jA0K2);
                boolean zA642 = bfm.A64(jA0E);
                Object objAaT7 = bfm.AaT();
                if (zA642 || objAaT7 == obj) {
                    objAaT7 = new HatchCodeBlockKt$HatchCodeBlock$2$1$4$1(jA0E);
                    bfm.Ai0(objAaT7);
                }
                BRg bRgA092 = C3U4.A09(AEk.A02(bRgA033, (G0U) objAaT7), 8.0f);
                InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
                int iA0D4 = AnonymousClass001.A0D(bbi);
                AKQ akqA045 = BBI.A04(bbi);
                BRg bRgA015 = AxM.A01(bfm, bRgA092);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA012, g0v);
                BPg.A02(bfm, akqA045, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D4);
                BPg.A02(bfm, bRgA015, g0vA0u);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ac4);
                AuraLabelButtonStyle auraLabelButtonStyleSecondary2 = auraButtonStyles.secondary(null, bfm, 48, zA1a ? 1 : 0);
                AuraButtonSize auraButtonSize2 = AuraButtonSize.MEDIUM;
                boolean zA1V = AnonymousClass004.A1V(bfm, mapCurrentChatThreadLogMetadata, zA1G, AnonymousClass003.A17(i10)) | ((iA0d & 57344) == 16384);
                Object objAaT8 = bfm.AaT();
                if (zA1V || objAaT8 == obj) {
                    objAaT8 = new HatchCodeBlockKt$HatchCodeBlock$2$1$5$1$1(str, zA1G, mapCurrentChatThreadLogMetadata, function02);
                    bfm.Ai0(objAaT8);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, c1062ATq, auraLabelButtonStyleSecondary2, auraButtonSize2, null, false, false, false, false, false, null, null, (Function0) objAaT8, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
                BBI.A0R(bbi, zA1a);
            }
            AnonymousClass002.A10(bbi, false, zA1a);
        } else {
            bfm.Afo();
            function02 = function0;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchCodeBlockKt$HatchCodeBlock$3(str, str2, bRg2, f2, function02, i, i2);
        }
    }

    public static final void logCodeCopyClick(String str, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.CODE_COPY_BUTTON, null, AnonymousClass006.A11(HatchMetadataKey.CODE_LANGUAGE.getValue(), AnonymousClass001.A0u(str), map), null);
    }

    public static final void logCodeSeeMoreClick(String str, boolean z, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.CODE_BLOCK, null, AnonymousClass006.A11(HatchMetadataKey.CODE_LANGUAGE.getValue(), AnonymousClass001.A0u(str), map), null);
    }
}
