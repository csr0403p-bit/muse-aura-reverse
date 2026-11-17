package com.facebook.aura.markdown.render.block;

import X.AEk;
import X.AKH;
import X.AKQ;
import X.AT3;
import X.AbstractC1103AYp;
import X.AbstractC2271BQs;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1DP;
import X.C1b8;
import X.C2VU;
import X.C3TQ;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.render.AuraMarkdownTheme;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.button.IconContext;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class CodeBlockRendererKt {
    public static final float CARD_CORNER_RADIUS = 8.0f;
    public static final float CONTENT_PADDING = 12.0f;
    public static final long COPIED_RESET_MS = 2000;
    public static final float HEADER_HEIGHT = 44.0f;

    public static final void CodeBlockRenderer(final AuraBlock.CodeBlock codeBlock, final AuraMarkdownTheme auraMarkdownTheme, BFM bfm, final int i) {
        String strA0s;
        boolean zA1a = AnonymousClass002.A1a(codeBlock, auraMarkdownTheme);
        bfm.AgG(-1217458465);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, codeBlock) : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, auraMarkdownTheme);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            final Context contextA0H = AnonymousClass002.A0H(bfm);
            final String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120854);
            boolean zA65 = bfm.A65(codeBlock.code);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            final MutableState mutableState = (MutableState) objAaT;
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(1693958071);
                Unit unit = Unit.INSTANCE;
                boolean zA652 = bfm.A65(mutableState);
                Object objAaT2 = bfm.AaT();
                if (zA652 || objAaT2 == C78N.A00) {
                    objAaT2 = new CodeBlockRendererKt$CodeBlockRenderer$1$1(mutableState, null);
                    bfm.Ai0(objAaT2);
                }
                AnonymousClass001.A18(bfm, objAaT2, unit);
            } else {
                bfm.AgE(1694061859);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            C1D3 c1d3A00 = C1D8.A00(CARD_CORNER_RADIUS);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0K = C06G.A0K(bfm, akh);
            long jA0K2 = C06G.A0K(bfm, akh);
            final long jA0E = C06G.A0E(bfm, akh);
            String strA0v = codeBlock.language;
            BS0 bs0 = BRg.A00;
            BRg bRgA03 = C11U.A03(bs0, c1d3A00);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRgA03.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            if (strA0v != null) {
                bfm.AgE(1021681308);
                BRg bRgA012 = C1b8.A01(C10G.A04(c1062ATq, HEADER_HEIGHT), jA0K);
                boolean zA64 = bfm.A64(jA0E);
                Object objAaT3 = bfm.AaT();
                if (zA64 || objAaT3 == C78N.A00) {
                    objAaT3 = new G0U() { // from class: com.facebook.aura.markdown.render.block.CodeBlockRendererKt$$ExternalSyntheticLambda0
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return CodeBlockRendererKt.CodeBlockRenderer$lambda$4$0$0(jA0E, (AT3) obj);
                        }
                    };
                    bfm.Ai0(objAaT3);
                }
                BRg bRgA07 = C3U4.A07(AEk.A01(bRgA012, (G0U) objAaT3), CONTENT_PADDING);
                InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA07);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA013, g0vA0u);
                C90m c90m = C90m.A00;
                if (strA0v.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) AnonymousClass006.A0q(strA0v.charAt(0)));
                    strA0v = AnonymousClass001.A0v(strA0v.substring(zA1a ? 1 : 0), sb);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA0v, AnonymousClass001.A0O(c90m, bs0, zA1a), C06G.A08(bfm), AnonymousClass002.A0f(bfm).footnoteEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                if (MutableState.A0A(mutableState)) {
                    bfm.AgE(-1596166850);
                    strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120ac2);
                } else {
                    bfm.AgE(2058491251);
                    BBI.A0R(bbi, false);
                    strA0s = null;
                }
                AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, zA1a ? 1 : 0);
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                G0W<IconContext, BFM, Integer, Unit> g0w = ComposableSingletons$CodeBlockRendererKt.f82lambda$749320894;
                boolean zA1U = AnonymousClass005.A1U(bfm, strA01, codeBlock, mutableState, bfm.A67(contextA0H));
                Object objAaT4 = bfm.AaT();
                if (zA1U || objAaT4 == C78N.A00) {
                    objAaT4 = new Function0() { // from class: com.facebook.aura.markdown.render.block.CodeBlockRendererKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CodeBlockRendererKt.CodeBlockRenderer$lambda$4$1$1$0(contextA0H, strA01, codeBlock, mutableState);
                        }
                    };
                    bfm.Ai0(objAaT4);
                }
                Function0 function02 = (Function0) objAaT4;
                Object objAaT5 = bfm.AaT();
                if (objAaT5 == C78N.A00) {
                    objAaT5 = new Function0() { // from class: com.facebook.aura.markdown.render.block.CodeBlockRendererKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CodeBlockRendererKt.CodeBlockRenderer$lambda$4$1$2$0();
                        }
                    };
                    bfm.Ai0(objAaT5);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0s, null, null, auraLabelButtonStyleSecondary, auraButtonSize, g0w, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, (Function0) objAaT5, null, false, 0, false, 0, bfm, 1769472, 0, 48, 132104077);
                BBI.A0R(bbi, zA1a);
            } else {
                bfm.AgE(1023462041);
            }
            BBI.A0R(bbi, false);
            BRg bRgA09 = C3U4.A09(AbstractC1103AYp.A01(AbstractC1103AYp.A00(0, bfm, 0, zA1a ? 1 : 0), C1b8.A01(c1062ATq, jA0K2), zA1a), CONTENT_PADDING);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA014 = AxM.A01(bfm, bRgA09);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA014, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(codeBlock.code, null, auraMarkdownTheme.baseTextColor, auraMarkdownTheme.codeBlockTextStyle, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, zA1a);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.markdown.render.block.CodeBlockRendererKt$$ExternalSyntheticLambda3
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AuraBlock.CodeBlock codeBlock2 = codeBlock;
                    AuraMarkdownTheme auraMarkdownTheme2 = auraMarkdownTheme;
                    int i3 = i;
                    AnonymousClass001.A0F(obj2);
                    CodeBlockRendererKt.CodeBlockRenderer(codeBlock2, auraMarkdownTheme2, (BFM) obj, AnonymousClass011.A00(i3));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit CodeBlockRenderer$lambda$4$0$0(long j, AT3 at3) {
        C7384Etj.A0Y(at3, 1);
        float fA01 = AnonymousClass001.A01(at3.AKb(), 4294967295L);
        long jFloatToRawIntBits = Float.floatToRawIntBits(fA01) & 4294967295L;
        at3.A9X(null, null, at3.Ah4(1.0f), 1.0f, 0, 3, j, jFloatToRawIntBits | (AnonymousClass002.A0F() << 32), jFloatToRawIntBits | (Float.floatToRawIntBits(AnonymousClass001.A00(r2)) << 32));
        return Unit.INSTANCE;
    }

    public static final Unit CodeBlockRenderer$lambda$4$1$1$0(Context context, String str, AuraBlock.CodeBlock codeBlock, MutableState mutableState) {
        ClipboardManager clipboardManager;
        Object systemService = context.getSystemService(HatchFileUIUtils.CLIPBOARD_STAGING_DIR);
        if ((systemService instanceof ClipboardManager) && (clipboardManager = (ClipboardManager) systemService) != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(str, codeBlock.code));
        }
        MutableState.A09(true, mutableState);
        return Unit.INSTANCE;
    }

    public static final C3TQ CodeBlockRenderer$lambda$4$1$2$0() {
        return new C1DP(8.0f, 4.0f, 8.0f, 4.0f);
    }

    public static final Unit CodeBlockRenderer$lambda$5(AuraBlock.CodeBlock codeBlock, AuraMarkdownTheme auraMarkdownTheme, int i, BFM bfm, int i2) {
        CodeBlockRenderer(codeBlock, auraMarkdownTheme, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
