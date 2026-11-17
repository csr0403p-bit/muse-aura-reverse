package com.facebook.aura.nodes.cards;

import X.AKQ;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B0A;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class NodeCardFileChipKt {
    public static final float CHIP_ICON_SIZE = 40.0f;
    public static final C1D3 CHIP_SHAPE = C1D8.A00(12.0f);
    public static final C1D3 CHIP_ICON_SHAPE = C1D8.A00(8.0f);

    /* renamed from: com.facebook.aura.nodes.cards.NodeCardFileChipKt$NodeCardFileChip$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $fileName;
        public final /* synthetic */ String $mimeType;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$fileName = str;
            this.$mimeType = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            NodeCardFileChipKt.NodeCardFileChip(this.$fileName, this.$mimeType, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void NodeCardFileChip(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        String strA0M;
        BS0 bs0A09;
        B0A b0a;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1325195329);
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
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            String upperCase = "";
            String strA0R = C7BY.A0R(str, "", '.');
            Locale locale = Locale.ROOT;
            String lowerCase = strA0R.toLowerCase(locale);
            int iFileTypeIconRes = fileTypeIconRes(lowerCase, str2);
            boolean zA1W = C60Q.A1W(HatchFileUIUtils.SELF_COLORED_ICONS, iFileTypeIconRes);
            if (lowerCase.length() > 0) {
                upperCase = lowerCase.toUpperCase(locale);
            } else if (str2 != null && (strA0M = C7BY.A0M(str2)) != null) {
                upperCase = strA0M.toUpperCase(locale);
            }
            long j = colors.isLight ? B6A.A01 : B6A.A08;
            long jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.15f);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C1D3 c1d3 = CHIP_SHAPE;
            BRg bRgA0B = C3U4.A0B(C11U.A03(C1DI.A02(bRgA0R, c1d3, 1.0f, jA04), c1d3), 12.0f, 10.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0W);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            if (zA1W) {
                bfm.AgE(1367592439);
                AVy aVyA00 = BOf.A00(bfm, iFileTypeIconRes, 0);
                bs0A09 = BRg.A00;
                b0a = null;
                AuraIconKt.m2567AuraIconFHprtrg(C11U.A03(C10G.A07(bs0A09, CHIP_ICON_SIZE), CHIP_ICON_SHAPE), aVyA00, AuraIconSize.LARGE, null, B6A.A07, null, bfm, (AVy.$stable << 3) | 24966, 40);
            } else {
                bs0A09 = C3cG.A09(bfm, 1367841617);
                BRg bRgA012 = C1b8.A01(C11U.A03(C10G.A07(bs0A09, CHIP_ICON_SIZE), CHIP_ICON_SHAPE), fileTypeAccentColor(lowerCase));
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA012);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA013, g0vA0u);
                b0a = null;
                AuraIconKt.m2567AuraIconFHprtrg(C3U4.A09(bs0A09, 4.0f), BOf.A00(bfm, iFileTypeIconRes, 0), AuraIconSize.SMALL, null, B6A.A08, null, bfm, (AVy.$stable << 3) | 24966, 40);
                BBI.A0R(bbi, true);
            }
            BBI.A0R(bbi, false);
            C01N.A09(bfm, bs0A09, 12.0f);
            BRg bRgAiP = c90m.AiP(bs0A09, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA014 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA014, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, colors.primaryText, C60Q.A0C(bfm, auraTheme), b0a, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14834);
            if (upperCase.length() > 0) {
                AuraTextKt.m2639AuraTextUY9GdpU(upperCase, null, colors.secondaryText, C3cH.A0X(bfm, auraTheme, -432315077).caption1Regular, null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306368, 0, 15858);
            } else {
                bfm.AgE(-432139927);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, bRg2, i, i2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long fileTypeAccentColor(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            switch(r0) {
                case 99: goto La4;
                case 104: goto La1;
                case 3304: goto L9e;
                case 3401: goto L9b;
                case 3433: goto L98;
                case 3593: goto L95;
                case 3632: goto L92;
                case 3649: goto L8f;
                case 3669: goto L8c;
                case 3711: goto Lb1;
                case 98723: goto L89;
                case 98819: goto L78;
                case 98822: goto L67;
                case 102340: goto L56;
                case 103649: goto L53;
                case 105441: goto L50;
                case 110834: goto L42;
                case 110968: goto L3f;
                case 111145: goto L3c;
                case 114276: goto L39;
                case 115159: goto L36;
                case 118783: goto L33;
                case 118807: goto L22;
                case 119768: goto L1f;
                case 3213227: goto L7b;
                case 3254818: goto L1b;
                case 3268712: goto L18;
                case 3271912: goto L15;
                case 3565914: goto L12;
                case 3645340: goto L59;
                case 3682393: goto L6a;
                case 3701415: goto L25;
                case 109854227: goto La7;
                default: goto L7;
            }
        L7:
            r2 = 4287532691(0xff8e8e93, double:2.118322608E-314)
        Lc:
            r0 = 32
            long r2 = r2 << r0
            long r0 = X.B6A.A01
            return r2
        L12:
            java.lang.String r0 = "toml"
            goto L27
        L15:
            java.lang.String r0 = "json"
            goto L27
        L18:
            java.lang.String r0 = "jpeg"
            goto L5b
        L1b:
            java.lang.String r0 = "java"
            goto La9
        L1f:
            java.lang.String r0 = "yml"
            goto L27
        L22:
            java.lang.String r0 = "xml"
            goto L27
        L25:
            java.lang.String r0 = "yaml"
        L27:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r2 = 4294939904(0xffff9500, double:2.1219822575E-314)
            goto Lc
        L33:
            java.lang.String r0 = "xls"
            goto L6c
        L36:
            java.lang.String r0 = "tsv"
            goto L6c
        L39:
            java.lang.String r0 = "svg"
            goto L5b
        L3c:
            java.lang.String r0 = "png"
            goto L5b
        L3f:
            java.lang.String r0 = "php"
            goto La9
        L42:
            java.lang.String r0 = "pdf"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r2 = 4294916912(0xffff3b30, double:2.121970898E-314)
            goto Lc
        L50:
            java.lang.String r0 = "jpg"
            goto L5b
        L53:
            java.lang.String r0 = "htm"
            goto L7d
        L56:
            java.lang.String r0 = "gif"
            goto L5b
        L59:
            java.lang.String r0 = "webp"
        L5b:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r2 = 4284139770(0xff5ac8fa, double:2.1166462823E-314)
            goto Lc
        L67:
            java.lang.String r0 = "csv"
            goto L6c
        L6a:
            java.lang.String r0 = "xlsx"
        L6c:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r2 = 4281648985(0xff34c759, double:2.115415671E-314)
            goto Lc
        L78:
            java.lang.String r0 = "css"
            goto L7d
        L7b:
            java.lang.String r0 = "html"
        L7d:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r2 = 4289680094(0xffaf52de, double:2.119383566E-314)
            goto Lc
        L89:
            java.lang.String r0 = "cpp"
            goto La9
        L8c:
            java.lang.String r0 = "sh"
            goto La9
        L8f:
            java.lang.String r0 = "rs"
            goto La9
        L92:
            java.lang.String r0 = "rb"
            goto La9
        L95:
            java.lang.String r0 = "py"
            goto La9
        L98:
            java.lang.String r0 = "kt"
            goto La9
        L9b:
            java.lang.String r0 = "js"
            goto La9
        L9e:
            java.lang.String r0 = "go"
            goto La9
        La1:
            java.lang.String r0 = "h"
            goto La9
        La4:
            java.lang.String r0 = "c"
            goto La9
        La7:
            java.lang.String r0 = "swift"
        La9:
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lb9
            goto L7
        Lb1:
            java.lang.String r0 = "ts"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
        Lb9:
            r2 = 4278221567(0xff007aff, double:2.1137223016E-314)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.cards.NodeCardFileChipKt.fileTypeAccentColor(java.lang.String):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0134 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int fileTypeIconRes(java.lang.String r1, java.lang.String r2) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.cards.NodeCardFileChipKt.fileTypeIconRes(java.lang.String, java.lang.String):int");
    }
}
