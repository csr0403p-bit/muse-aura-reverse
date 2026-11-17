package com.facebook.aura.browsertask.view;

import X.AbstractC2271BQs;
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
import X.BOI;
import X.BOf;
import X.BRg;
import X.C10G;
import X.C1D3;
import X.C1D8;
import X.C1b8;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C7BY;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC0857A6e;
import com.facebook.aura.R;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import com.facebook.aura.model.BrowserTaskDisplayStatus;
import com.facebook.aura.model.BrowserTaskExecution;
import com.facebook.aura.model.BrowserTaskExecutionKind;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.ui.BrowserTaskTextKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class BrowserTaskCardContentKt {
    public static final float BrowserTaskPreviewAspectRatio = 1.7777778f;
    public static final C1D3 BrowserTaskPreviewShape = C1D8.A00(12.0f);
    public static final long BrowserTaskWarningColor;
    public static final float PortraitPreviewAspectRatio = 0.75f;
    public static final float PortraitPreviewMaxHeight = 320.0f;

    public static final String browserTaskHeaderText(BrowserTaskPresentation browserTaskPresentation, BFM bfm, int i) {
        C7384Etj.A0Y(browserTaskPresentation, 0);
        String strA01 = browserTaskPresentation.title;
        if (strA01 == null) {
            bfm.AgE(-372053911);
            strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201c8);
        } else {
            bfm.AgE(-372054562);
        }
        AnonymousClass001.A1D(bfm);
        return strA01;
    }

    public static final long browserTaskIconTint(BrowserTaskDisplayStatus browserTaskDisplayStatus, BFM bfm, int i) {
        long j;
        int i2;
        switch (AnonymousClass001.A0E(browserTaskDisplayStatus, 0)) {
            case 0:
                i2 = 429294806;
                j = C3cI.A0K(bfm, i2).secondaryText;
                AnonymousClass001.A1D(bfm);
                return j;
            case 1:
            case 2:
            case 4:
                j = C3cI.A0K(bfm, 429292719).accent;
                AnonymousClass001.A1D(bfm);
                return j;
            case 3:
            case 8:
                AnonymousClass003.A0l(bfm, 429297952);
                return BrowserTaskWarningColor;
            case 5:
                j = C3cI.A0K(bfm, 429305168).success;
                AnonymousClass001.A1D(bfm);
                return j;
            case 6:
                j = C3cI.A0K(bfm, 429300562).errorText;
                AnonymousClass001.A1D(bfm);
                return j;
            case 7:
                i2 = 429302774;
                j = C3cI.A0K(bfm, i2).secondaryText;
                AnonymousClass001.A1D(bfm);
                return j;
            default:
                throw AnonymousClass005.A0k(bfm, 429288124);
        }
    }

    public static final String browserTaskSecondaryText(BrowserTaskPresentation browserTaskPresentation, BFM bfm, int i) {
        String strA0t;
        C7384Etj.A0Y(browserTaskPresentation, 0);
        String strBrowserTaskStatusText = browserTaskStatusText(browserTaskPresentation, bfm, (i & 14) | BrowserTaskPresentation.$stable);
        boolean zA1Z = AnonymousClass002.A1Z(browserTaskPresentation.getDisplayState(), BrowserTaskDisplayStatus.QUEUED);
        Integer num = browserTaskPresentation.queuePosition;
        if (zA1Z) {
            if (num != null) {
                bfm.AgE(-844284254);
                strA0t = AnonymousClass001.A0t(bfm, num, R.string._name_removed__res_0x7f1201a0);
            }
            String strBrowserTaskStatusWithDetail = BrowserTaskTextKt.browserTaskStatusWithDetail(strBrowserTaskStatusText, strA0t, bfm, 0);
            AnonymousClass001.A1D(bfm);
            return strBrowserTaskStatusWithDetail;
        }
        if (!browserTaskPresentation.isTerminal()) {
            AnonymousClass003.A0l(bfm, -402737001);
            String str = browserTaskPresentation.activityTitle;
            return (str == null || C7BY.A0j(str)) ? strBrowserTaskStatusText : str;
        }
        bfm.AgE(-844277910);
        strA0t = browserTaskPresentation.activityTitle;
        String strBrowserTaskStatusWithDetail2 = BrowserTaskTextKt.browserTaskStatusWithDetail(strBrowserTaskStatusText, strA0t, bfm, 0);
        AnonymousClass001.A1D(bfm);
        return strBrowserTaskStatusWithDetail2;
    }

    public static final String browserTaskStatusText(BrowserTaskPresentation browserTaskPresentation, BFM bfm, int i) {
        C7384Etj.A0Y(browserTaskPresentation, 0);
        String strA01 = browserTaskPresentation.displayStatus;
        if (C7BY.A0j(strA01) || strA01 == null) {
            bfm.AgE(1348737877);
            strA01 = AbstractC2271BQs.A01(bfm, BrowserTaskTextKt.fallbackStatusLabelRes(browserTaskPresentation.getDisplayState()));
        } else {
            bfm.AgE(1348735893);
        }
        AnonymousClass001.A1D(bfm);
        return strA01;
    }

    public static final int openBrowserLabelRes(BrowserTaskPresentation browserTaskPresentation) {
        C7384Etj.A0Y(browserTaskPresentation, 0);
        return (!browserTaskPresentation.isWaitingForUser() || getRunsOnOtherDevice(browserTaskPresentation)) ? R.string._name_removed__res_0x7f12019b : R.string._name_removed__res_0x7f1201b4;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrowserTaskDisplayStatus.values().length];
            try {
                AnonymousClass002.A13(BrowserTaskDisplayStatus.QUEUED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BrowserTaskDisplayStatus.STARTING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(BrowserTaskDisplayStatus.WORKING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(BrowserTaskDisplayStatus.PAUSED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(BrowserTaskDisplayStatus.WAITING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(BrowserTaskDisplayStatus.NEEDS_YOU, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(BrowserTaskDisplayStatus.FAILED, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(BrowserTaskDisplayStatus.STOPPED, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(BrowserTaskDisplayStatus.COMPLETED, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        long j = B6A.A01;
        BrowserTaskWarningColor = 4293431564L << 32;
    }

    /* renamed from: BrowserTaskStateIcon-3IgeMak, reason: not valid java name */
    public static final void m320BrowserTaskStateIcon3IgeMak(final BrowserTaskDisplayStatus browserTaskDisplayStatus, final long j, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(353105208);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, browserTaskDisplayStatus) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 147, 146), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraIconKt.m2567AuraIconFHprtrg(C3U4.A09(C1b8.A03(C10G.A07(bRg2, 48.0f), C1D8.A00, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.1f)), 12.0f), BOf.A00(bfm, iconRes(browserTaskDisplayStatus), 0), AuraIconSize.SMALL, null, j, null, bfm, AnonymousClass001.A0B(iA08 << 9, AnonymousClass001.A04()), 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.BrowserTaskCardContentKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BrowserTaskDisplayStatus browserTaskDisplayStatus2 = browserTaskDisplayStatus;
                    long j2 = j;
                    BRg bRg4 = bRg3;
                    int i4 = i;
                    int i5 = i2;
                    ((Number) obj2).intValue();
                    float f = BrowserTaskCardContentKt.BrowserTaskPreviewAspectRatio;
                    BrowserTaskCardContentKt.m320BrowserTaskStateIcon3IgeMak(browserTaskDisplayStatus2, j2, bRg4, (BFM) obj, AnonymousClass011.A00(i4), i5);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final boolean getRunsOnOtherDevice(BrowserTaskPresentation browserTaskPresentation) {
        BrowserTaskExecution browserTaskExecution = browserTaskPresentation.execution;
        return browserTaskExecution.kind == BrowserTaskExecutionKind.LOCAL_DEVICE && !C7384Etj.areEqual(browserTaskExecution.deviceId, AuraDeviceId.INSTANCE.getNodeId());
    }

    public static /* synthetic */ Unit $r8$lambda$TBIcDxCphBMzb_9UgmVlikvxcZM(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final void BrowserTaskCardPlaceholder(final BRg bRg, BFM bfm, final int i, final int i2) {
        bfm.AgG(997845605);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C3Ue.A04(BOI.A00(bRg, BrowserTaskPreviewShape, BOI.A01(bfm, null, 0.0f, 252, auraTheme.getColors(bfm, 6).shimmeringBase, auraTheme.getColors(bfm, 6).shimmeringHighlight)), bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.BrowserTaskCardContentKt$$ExternalSyntheticLambda3
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BRg bRg2 = bRg;
                    int i4 = i;
                    int i5 = i2;
                    AnonymousClass001.A0F(obj2);
                    float f = BrowserTaskCardContentKt.BrowserTaskPreviewAspectRatio;
                    BrowserTaskCardContentKt.BrowserTaskCardPlaceholder(bRg2, (BFM) obj, AnonymousClass011.A00(i4), i5);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit BrowserTaskCardPlaceholder$lambda$0(BRg bRg, int i, int i2, BFM bfm, int i3) {
        BrowserTaskCardPlaceholder(bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit BrowserTaskStateIcon_3IgeMak$lambda$0(BrowserTaskDisplayStatus browserTaskDisplayStatus, long j, BRg bRg, int i, int i2, BFM bfm, int i3) {
        m320BrowserTaskStateIcon3IgeMak(browserTaskDisplayStatus, j, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit HatchBrowserTaskCardContent_j30j4ZQ$lambda$0$0$0$0$0(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit HatchBrowserTaskCardContent_j30j4ZQ$lambda$1(BrowserTaskDisplayStatus browserTaskDisplayStatus, String str, String str2, String str3, boolean z, boolean z2, Function0 function0, long j, C1D3 c1d3, BRg bRg, boolean z3, G0V g0v, int i, int i2, int i3, BFM bfm, int i4) {
        m321HatchBrowserTaskCardContentj30j4ZQ(browserTaskDisplayStatus, str, str2, str3, z, z2, function0, j, c1d3, bRg, z3, g0v, bfm, AnonymousClass011.A00(i), AnonymousClass011.A01(i2), i3);
        return Unit.INSTANCE;
    }

    public static final int iconRes(BrowserTaskDisplayStatus browserTaskDisplayStatus) {
        switch (AnonymousClass003.A0L(browserTaskDisplayStatus)) {
            case 0:
            case 1:
            case 2:
            case 4:
                return R.drawable.globe_wght400_outline_24;
            case 3:
            case 8:
                return R.drawable.exclamation_triangle_outline_svg;
            case 5:
                return R.drawable.circle_check_wght400_outline_24;
            case 6:
                return R.drawable.exclamation_circle_outline;
            case 7:
                return R.drawable.hatch_stop_square;
            default:
                throw C3cG.A0q();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* renamed from: HatchBrowserTaskCardContent-j30j4ZQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m321HatchBrowserTaskCardContentj30j4ZQ(final com.facebook.aura.model.BrowserTaskDisplayStatus r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final boolean r76, final boolean r77, final kotlin.jvm.functions.Function0<kotlin.Unit> r78, final long r79, final X.C1D3 r81, X.BRg r82, boolean r83, final X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r84, X.BFM r85, final int r86, final int r87, final int r88) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.view.BrowserTaskCardContentKt.m321HatchBrowserTaskCardContentj30j4ZQ(com.facebook.aura.model.BrowserTaskDisplayStatus, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, long, X.1D3, X.BRg, boolean, X.G0V, X.BFM, int, int, int):void");
    }
}
