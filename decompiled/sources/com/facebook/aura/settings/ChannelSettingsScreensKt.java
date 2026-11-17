package com.facebook.aura.settings;

import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C1822Arm;
import X.C1YL;
import X.C3U4;
import X.C78N;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class ChannelSettingsScreensKt {

    /* renamed from: com.facebook.aura.settings.ChannelSettingsScreensKt$ChannelConnectionIssueDescription$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
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
            ChannelSettingsScreensKt.ChannelConnectionIssueDescription(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ChannelConnectionIssueDescription(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1676271467);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206cc);
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            long jA08 = C06G.A08(bfm);
            BRg bRgA07 = C3U4.A07(bRg2, C06G.A00(bfm));
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ChannelSettingsScreensKt$ChannelConnectionIssueDescription$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AbstractC07539Wl.A00(AnonymousClass001.A0Y(bRgA07, objAaT, false), "hatch-channel-connection-issue"), jA08, c1822ArmA0Z, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f1  */
    /* renamed from: ChannelConsentScreen-WsuR4So, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1899ChannelConsentScreenWsuR4So(java.lang.String r67, java.lang.String r68, java.lang.String r69, boolean r70, kotlin.jvm.functions.Function0<kotlin.Unit> r71, kotlin.jvm.functions.Function0<kotlin.Unit> r72, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r73, X.BRg r74, X.BRg r75, boolean r76, float r77, com.facebook.aura.vds.compose.button.AuraButtonSize r78, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r79, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r80, X.BFM r81, int r82, int r83, int r84) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.ChannelSettingsScreensKt.m1899ChannelConsentScreenWsuR4So(java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0V, X.BRg, X.BRg, boolean, float, com.facebook.aura.vds.compose.button.AuraButtonSize, X.G0W, X.G0W, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* renamed from: ChannelConnectedScreen-ZSrRDQQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1898ChannelConnectedScreenZSrRDQQ(com.facebook.aura.analytics.hatch.HatchScreen r70, java.lang.String r71, java.lang.String r72, com.facebook.aura.vds.compose.button.AuraButtonSize r73, boolean r74, java.lang.String r75, java.lang.String r76, kotlin.jvm.functions.Function0<kotlin.Unit> r77, kotlin.jvm.functions.Function0<kotlin.Unit> r78, kotlin.jvm.functions.Function0<kotlin.Unit> r79, kotlin.jvm.functions.Function0<kotlin.Unit> r80, kotlin.jvm.functions.Function0<kotlin.Unit> r81, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r82, X.BRg r83, X.BRg r84, float r85, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r86, boolean r87, X.BFM r88, int r89, int r90, int r91) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.ChannelSettingsScreensKt.m1898ChannelConnectedScreenZSrRDQQ(com.facebook.aura.analytics.hatch.HatchScreen, java.lang.String, java.lang.String, com.facebook.aura.vds.compose.button.AuraButtonSize, boolean, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0V, X.BRg, X.BRg, float, X.G0W, boolean, X.BFM, int, int, int):void");
    }
}
