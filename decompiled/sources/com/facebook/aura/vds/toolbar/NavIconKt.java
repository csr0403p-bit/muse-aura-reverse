package com.facebook.aura.vds.toolbar;

import X.AKQ;
import X.AVy;
import X.AXZ;
import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C1515AkP;
import X.C2VG;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import android.view.View;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.ext.StringExtKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.toolbar.AuraToolbarAgent;
import com.facebook.common.dextricks.RuntimeInternals;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class NavIconKt {

    /* renamed from: com.facebook.aura.vds.toolbar.NavIconKt$ButtonPlaceHolder$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
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
            NavIconKt.ButtonPlaceHolder(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.toolbar.NavIconKt$NavIcon$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $navIconContentDescription;
        public final /* synthetic */ Function0<Unit> $navIconListener;
        public final /* synthetic */ AuraToolbarAgent.NavIconType $navIconType;
        public final /* synthetic */ View $nextViewToFocus;
        public final /* synthetic */ boolean $shouldShowNavIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, AuraToolbarAgent.NavIconType navIconType, Function0<Unit> function0, boolean z, View view, String str, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$navIconType = navIconType;
            this.$navIconListener = function0;
            this.$shouldShowNavIcon = z;
            this.$nextViewToFocus = view;
            this.$navIconContentDescription = str;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
            NavIconKt.NavIcon(this.$modifier, this.$navIconType, this.$navIconListener, this.$shouldShowNavIcon, this.$nextViewToFocus, this.$navIconContentDescription, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final BRg navIconModifier(View view, AuraToolbarAgent.NavIconType navIconType, BFM bfm, int i) {
        String str;
        C7384Etj.A0Y(navIconType, 1);
        if (navIconType.equals(AuraToolbarAgent.NavIconType.Close.INSTANCE)) {
            str = "close-icon-identifier";
        } else if (navIconType.equals(AuraToolbarAgent.NavIconType.Search.INSTANCE)) {
            str = "search-icon-identifier";
        } else if (navIconType.equals(AuraToolbarAgent.NavIconType.Back.INSTANCE)) {
            str = "back-icon-identifier";
        } else if (navIconType.equals(AuraToolbarAgent.NavIconType.Settings.INSTANCE)) {
            str = "settings-icon-identifier";
        } else {
            if (!navIconType.equals(AuraToolbarAgent.NavIconType.Sidebar.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "sidebar-icon-identifier";
        }
        BRg bRgA00 = AbstractC07539Wl.A00(BRg.A00, str);
        boolean zA67 = bfm.A67(view);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new NavIconKt$navIconModifier$modifier$1$1(view);
            bfm.Ai0(objAaT);
        }
        return AXZ.A00(bRgA00, (G0U) objAaT);
    }

    public static final void NavIcon(BRg bRg, AuraToolbarAgent.NavIconType navIconType, Function0<Unit> function0, boolean z, View view, String str, BFM bfm, int i, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        boolean z2;
        String string;
        View view2 = view;
        String str2 = str;
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(navIconType, 1, function0);
        bfm.AgG(2062869421);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(navIconType, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, view2);
        }
        int i5 = i2 & 32;
        int iA0i = 196608;
        if (i5 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, str2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                view2 = null;
            }
            if (i5 != 0) {
                str2 = null;
            }
            BRg bRgA0C = C3U4.A0C(bRg2, 0.0f, 0.0f, AuraDimensKt.SpacingXlarge, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, C2VG.A00);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
            if (z) {
                bfm.AgE(1273649425);
                BRg bRgNavIconModifier = navIconModifier(view2, navIconType, bfm, ((iA0d >> 12) & 14) | (AuraToolbarAgent.NavIconType.$stable << 3) | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
                z2 = false;
                AVy aVyA00 = AbstractC8407FdO.A00(bfm, navIconType.navIcon);
                AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.SMALL;
                AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
                AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
                if (str2 == null) {
                    bfm.AgE(-235994867);
                    string = StringExtKt.annotatedStringResource(navIconType.stringDescr, null, false, null, null, bfm, 0, 30).toString();
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(-235998215);
                    BBI.A0R(bbi, false);
                    string = str2;
                }
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(bRgNavIconModifier, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, string, function0, null, false, null, null, null, null, bfm, AnonymousClass001.A0C(iA0d << 15, (AVy.$stable << 3) | 28032), 0, 16160);
            } else {
                bfm.AgE(1274161886);
                z2 = false;
                ButtonPlaceHolder(null, bfm, 0, 1);
            }
            BBI.A0R(bbi, z2);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, navIconType, function0, z, view2, str2, i, i2);
        }
    }

    public static final void ButtonPlaceHolder(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(869989616);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            C01N.A0A(bfm, bRg, AuraIconKt.auraIconSize(AuraIconSize.SMALL, bfm, 6));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg, i, i2);
        }
    }
}
