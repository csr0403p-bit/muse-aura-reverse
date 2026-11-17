package com.facebook.aura.vds.compose.typegroup;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C08R;
import X.C1822Arm;
import X.C1AC;
import X.C2VU;
import X.G0V;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraIconAndHeadlineKt {

    /* renamed from: com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineKt$Icon$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Icon $icon;
        public final /* synthetic */ C08R $this_Icon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C08R c08r, Icon icon, int i) {
            super(2);
            this.$this_Icon = c08r;
            this.$icon = icon;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraIconAndHeadlineKt.Icon(this.$this_Icon, this.$icon, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void Icon(C08R c08r, Icon icon, BFM bfm, int i) {
        BS0 bs0;
        C1AC c1ac;
        long jM2544applyContentAlphaek8zF_U;
        boolean zA1a = AnonymousClass002.A1a(c08r, icon);
        bfm.AgG(1231298901);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c08r) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, icon);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AVy aVy = icon.painter;
            int iOrdinal = icon.orientation.ordinal();
            if (iOrdinal == zA1a) {
                bs0 = BRg.A00;
                c1ac = C2VU.A04;
            } else {
                if (iOrdinal != 0) {
                    throw new NoWhenBranchMatchedException();
                }
                bs0 = BRg.A00;
                c1ac = C2VU.A05;
            }
            BRg bRgA4D = c08r.A4D(c1ac, bs0);
            AuraIconSize auraIconSize = icon.size;
            B6A b6a = icon.tint;
            if (b6a == null) {
                bfm.AgE(-2132718328);
                jM2544applyContentAlphaek8zF_U = ColorExtKt.m2544applyContentAlphaek8zF_U(AuraTheme.INSTANCE.getContentColor(bfm, 6), bfm, 0);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, -2132719444);
                jM2544applyContentAlphaek8zF_U = b6a.A00;
            }
            AuraIconKt.m2567AuraIconFHprtrg(bRgA4D, aVy, auraIconSize, null, jM2544applyContentAlphaek8zF_U, null, bfm, AVy.$stable << 3, 40);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(c08r, icon, i);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IconOrientation.values().length];
            try {
                AnonymousClass005.A0v(IconOrientation.MIDDLE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(IconOrientation.TOP, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AuraIconAndHeadlineStyle.values().length];
            try {
                AnonymousClass005.A0v(AuraIconAndHeadlineStyle.HEADLINE2, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(AuraIconAndHeadlineStyle.HEADLINE2_EMPHASIZED, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(AuraIconAndHeadlineStyle.TITLE1_EMPHASIZED, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A16(AuraIconAndHeadlineStyle.B1_EMPHASIZED, iArr2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass002.A17(AuraIconAndHeadlineStyle.B1, iArr2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass002.A18(AuraIconAndHeadlineStyle.B2_EMPHASIZED, iArr2);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1G(AuraIconAndHeadlineStyle.B2, iArr2);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1H(AuraIconAndHeadlineStyle.SUBTITLE, iArr2);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1I(AuraIconAndHeadlineStyle.BODY_REGULAR, iArr2);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1J(AuraIconAndHeadlineStyle.BODY_EMPHASIZED, iArr2);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass006.A1K(AuraIconAndHeadlineStyle.TITLE2_EMPHASIZED, iArr2);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass006.A1L(AuraIconAndHeadlineStyle.TITLE2_MEDIUM, iArr2);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[AuraIconAndHeadlineStyle.TITLE3_MEDIUM.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[AuraIconAndHeadlineStyle.FOOTNOTE_MEDIUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* renamed from: AuraIconAndHeadline-1nSa1A8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3099AuraIconAndHeadline1nSa1A8(java.lang.String r56, com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle r57, X.BRg r58, boolean r59, com.facebook.aura.vds.compose.typegroup.Icon r60, int r61, long r62, int r64, int r65, java.lang.String r66, long r67, X.C1822Arm r69, long r70, X.C1822Arm r72, X.BFM r73, int r74, int r75, int r76) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineKt.m3099AuraIconAndHeadline1nSa1A8(java.lang.String, com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle, X.BRg, boolean, com.facebook.aura.vds.compose.typegroup.Icon, int, long, int, int, java.lang.String, long, X.Arm, long, X.Arm, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a4 A[PHI: r60
  0x01a4: PHI (r60v4 X.Arm) = (r60v3 X.Arm), (r60v6 X.Arm) binds: [B:96:0x012e, B:98:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ee  */
    /* renamed from: AuraIconAndHeadline-8Ls536Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3100AuraIconAndHeadline8Ls536Q(X.BRg r59, X.ApQ r60, com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle r61, boolean r62, com.facebook.aura.vds.compose.typegroup.Icon r63, X.C1YL r64, long r65, boolean r67, int r68, int r69, X.ApQ r70, long r71, X.C1822Arm r73, long r74, X.BO6<java.lang.String, X.C14P> r76, X.C1822Arm r77, X.BFM r78, int r79, int r80, int r81) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineKt.m3100AuraIconAndHeadline8Ls536Q(X.BRg, X.ApQ, com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle, boolean, com.facebook.aura.vds.compose.typegroup.Icon, X.1YL, long, boolean, int, int, X.ApQ, long, X.Arm, long, X.BO6, X.Arm, X.BFM, int, int, int):void");
    }

    public static final C1822Arm getText(AuraIconAndHeadlineStyle auraIconAndHeadlineStyle, BFM bfm, int i) {
        C1822Arm c1822Arm;
        switch (auraIconAndHeadlineStyle.ordinal()) {
            case 0:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547693831).title3Regular;
                break;
            case 1:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547696650).title3Emphasized;
                break;
            case 2:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547699460).bodyMedium;
                break;
            case 3:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547701963).subheadlineMedium;
                break;
            case 4:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547704332).subheadlineRegular;
                break;
            case 5:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547707084).footnoteEmphasized;
                break;
            case 6:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547709481).footnoteRegular;
                break;
            case 7:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547711977).caption1Regular;
                break;
            case 8:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547714597).bodyRegular;
                break;
            case 9:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547717192).bodyEmphasized;
                break;
            case 10:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547719946).title2Emphasized;
                break;
            case 11:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547722630).title2Medium;
                break;
            case 12:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547725190).title3Medium;
                break;
            case 13:
                c1822Arm = AnonymousClass006.A0k(bfm, 1547727816).footnoteMedium;
                break;
            default:
                AnonymousClass004.A1A(bfm, 1547692480);
                throw new NoWhenBranchMatchedException();
        }
        AnonymousClass002.A19(bfm);
        return c1822Arm;
    }
}
