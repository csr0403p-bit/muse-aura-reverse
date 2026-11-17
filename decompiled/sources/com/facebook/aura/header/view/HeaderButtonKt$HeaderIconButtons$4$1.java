package com.facebook.aura.header.view;

import X.AHD;
import X.AKQ;
import X.ARi;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BIj;
import X.BRg;
import X.BS0;
import X.C00r;
import X.C00x;
import X.C1003AOr;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1AC;
import X.C2VU;
import X.C3U4;
import X.C3UC;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0W;
import X.G2j;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.Alignment;
import com.facebook.aura.header.api.HeaderAction;
import com.facebook.aura.header.api.HeaderActionIcon;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HeaderButtonKt$HeaderIconButtons$4$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ HeaderButton $badgedButton;
    public final /* synthetic */ C00r $contentWidth$delegate;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $iconButtons;
    public final /* synthetic */ List<HeaderAction> $leavingActions;
    public final /* synthetic */ G0U<HeaderAction, Unit> $onHeaderActionClick;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ OnScreenState $pill;
    public final /* synthetic */ boolean $sharesPill;
    public final /* synthetic */ boolean $showDecorations;
    public final /* synthetic */ B6A $singleButtonTint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderButtonKt$HeaderIconButtons$4$1(boolean z, List<HeaderAction> list, C00r c00r, AHD<HeaderAction> ahd, AHD<? extends HeaderButton> ahd2, B6A b6a, OnScreenState onScreenState, G0U<? super HeaderAction, Unit> g0u, HeaderButton headerButton, G0U<? super HeaderButton, Unit> g0u2, boolean z2) {
        super(3);
        this.$sharesPill = z;
        this.$leavingActions = list;
        this.$contentWidth$delegate = c00r;
        this.$headerActions = ahd;
        this.$iconButtons = ahd2;
        this.$singleButtonTint = b6a;
        this.$pill = onScreenState;
        this.$onHeaderActionClick = g0u;
        this.$badgedButton = headerButton;
        this.$onHeaderButtonClick = g0u2;
        this.$showDecorations = z2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(interfaceC05151eP, 0);
        if ((iA0d & 6) == 0) {
            iA0d |= AnonymousClass004.A0d(bfm, interfaceC05151eP);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            BS0 bs0 = BRg.A00;
            C1003AOr c1003AOrHeaderPillSpring = HeaderButtonKt.headerPillSpring();
            Alignment alignment = C2VU.A0A;
            BRg bRgThen = C11U.A00(bs0).then(new ARi(c1003AOrHeaderPillSpring, alignment));
            C00r c00r = this.$contentWidth$delegate;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new HeaderButtonKt$HeaderIconButtons$4$1$1$1(c00r);
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = BIj.A00(bRgThen, (G0U) objAaT);
            boolean z = this.$sharesPill;
            if (z) {
                bRgA00 = bRgA00.then(C3U4.A0B(bs0, HeaderButtonKt.HeaderPillContentInset, (HeaderButtonKt.PillIconTouchTarget - HeaderButtonKt.HeaderPillButtonSize) / 2.0f));
            }
            C1AC c1ac = C2VU.A04;
            AHD<HeaderAction> ahd = this.$headerActions;
            AHD<HeaderButton> ahd2 = this.$iconButtons;
            B6A b6a = this.$singleButtonTint;
            OnScreenState onScreenState = this.$pill;
            G0U<HeaderAction, Unit> g0u = this.$onHeaderActionClick;
            HeaderButton headerButton = this.$badgedButton;
            G0U<HeaderButton, Unit> g0u2 = this.$onHeaderButtonClick;
            boolean z2 = this.$showDecorations;
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
                BRg bRgA07 = bs0;
                if (z) {
                    bRgA07 = C10G.A07(bs0, HeaderButtonKt.HeaderPillButtonSize);
                }
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 1051847802);
                while (itA0w.hasNext()) {
                    HeaderAction headerAction = (HeaderAction) itA0w.next();
                    bfm.Ag8(-401301292, headerAction.key);
                    HeaderActionIcon headerActionIcon = headerAction.icon;
                    String str = headerAction.testTag;
                    B6A b6a2 = null;
                    if (!z) {
                        b6a2 = b6a;
                    }
                    BRg bRgHeaderButtonEntrance = HeaderButtonKt.headerButtonEntrance(headerAction.modifier.then(bRgA07), onScreenState, bfm, 0);
                    G2j<B6A, BRg, BFM, Integer, Unit> g2j = headerAction.iconContent;
                    boolean zA65 = bfm.A65(g0u) | bfm.A65(headerAction);
                    Object objAaT2 = bfm.AaT();
                    if (zA65 || objAaT2 == obj) {
                        objAaT2 = new HeaderButtonKt$HeaderIconButtons$4$1$3$1$2$1(g0u, headerAction);
                        bfm.Ai0(objAaT2);
                    }
                    HeaderButtonKt.m1027HeaderIconButtonrglY58k(headerActionIcon, (Function0) objAaT2, str, bRgHeaderButtonEntrance, b6a2, false, false, g2j, bfm, 0, 96);
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, false);
                Iterator itA0w2 = AnonymousClass001.A0w(bfm, ahd2, 1051863543);
                while (itA0w2.hasNext()) {
                    HeaderButton headerButton2 = (HeaderButton) itA0w2.next();
                    bfm.Ag8(241064004, headerButton2);
                    Integer standaloneLabelRes$fbandroid_express_aura_java_com_facebook_aura_header_view_view = headerButton2.getStandaloneLabelRes$fbandroid_express_aura_java_com_facebook_aura_header_view_view();
                    if (!z && standaloneLabelRes$fbandroid_express_aura_java_com_facebook_aura_header_view_view != null) {
                        bfm.AgE(-1116826652);
                        int iIntValue = standaloneLabelRes$fbandroid_express_aura_java_com_facebook_aura_header_view_view.intValue();
                        String testTagId$fbandroid_express_aura_java_com_facebook_aura_header_view_view = headerButton2.getTestTagId$fbandroid_express_aura_java_com_facebook_aura_header_view_view();
                        boolean z3 = false;
                        if (headerButton2 == headerButton) {
                            z3 = true;
                        }
                        BRg bRgHeaderButtonEntrance2 = HeaderButtonKt.headerButtonEntrance(bs0, onScreenState, bfm, 6);
                        boolean zA652 = bfm.A65(g0u2) | bfm.A63(headerButton2.ordinal());
                        Object objAaT3 = bfm.AaT();
                        if (zA652 || objAaT3 == obj) {
                            objAaT3 = new HeaderButtonKt$HeaderIconButtons$4$1$3$2$1$1(g0u2, headerButton2);
                            bfm.Ai0(objAaT3);
                        }
                        HeaderButtonKt.m1029HeaderTextButtonjM_yU8I(iIntValue, (Function0) objAaT3, testTagId$fbandroid_express_aura_java_com_facebook_aura_header_view_view, bRgHeaderButtonEntrance2, b6a, z3, bfm, 0, 0);
                        BBI.A0R(bbi, false);
                    } else {
                        bfm.AgE(-1116465533);
                        B6A b6a3 = null;
                        if (!z) {
                            b6a3 = b6a;
                        }
                        BRg bRgHeaderButtonEntrance3 = HeaderButtonKt.headerButtonEntrance(bRgA07, onScreenState, bfm, 0);
                        boolean z4 = false;
                        if (headerButton2 == headerButton) {
                            z4 = true;
                        }
                        HeaderButtonKt.m1030PillHeaderButtonIcondgCrO4(headerButton2, g0u2, b6a3, bRgHeaderButtonEntrance3, z4, z2, bfm, 0, 0);
                        BBI.A0R(bbi, false);
                    }
                    BBI.A0R(bbi, false);
                }
                AnonymousClass003.A0q(bbi);
                List<HeaderAction> list = this.$leavingActions;
                boolean z5 = this.$sharesPill;
                C00r c00r2 = this.$contentWidth$delegate;
                int i2 = 0;
                for (HeaderAction headerAction2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        HeaderAction headerAction3 = headerAction2;
                        bfm.Ag8(1024767870, headerAction3.key);
                        BRg bRgA4C = interfaceC05151eP.A4C(alignment, bs0);
                        boolean zA66 = bfm.A66(z5) | bfm.A67(list) | bfm.A63(i2);
                        Object objAaT4 = bfm.AaT();
                        if (zA66 || objAaT4 == obj) {
                            objAaT4 = new HeaderButtonKt$HeaderIconButtons$4$1$4$1$1(z5, list, i2, c00r2);
                            bfm.Ai0(objAaT4);
                        }
                        HeaderButtonKt.LeavingHeaderActionIcon(headerAction3, C3UC.A00(bRgA4C, (G0W) objAaT4), bfm, 0, 0);
                        BBI.A0R(bbi, false);
                        i2 = i3;
                    }
                }
                return;
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
    }
}
