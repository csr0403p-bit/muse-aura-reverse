package com.facebook.aura.vds.compose.input;

import X.AKQ;
import X.AVy;
import X.AbstractC7559F3s;
import X.AcQ;
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
import X.BS0;
import X.C00x;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1YL;
import X.C2VU;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0V;
import X.InterfaceC04981Yd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.vds.compose.input.AuraTextInputFooterStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class AuraTextInputWithHeaderDefaults {
    public static final int $stable = 0;
    public static final AuraTextInputWithHeaderDefaults INSTANCE = new AuraTextInputWithHeaderDefaults();

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputWithHeaderDefaults$FooterRemainingCount$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $currentCharCount;
        public final /* synthetic */ int $maxCharCount;
        public final /* synthetic */ AuraTextInputFooterStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, int i2, AuraTextInputFooterStyle auraTextInputFooterStyle, int i3, int i4) {
            super(2);
            this.$currentCharCount = i;
            this.$maxCharCount = i2;
            this.$style = auraTextInputFooterStyle;
            this.$$changed = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            AuraTextInputWithHeaderDefaults.this.FooterRemainingCount(this.$currentCharCount, this.$maxCharCount, this.$style, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraTextInputWithHeaderDefaults$FooterTextAndIcon$2, reason: invalid class name and case insensitive filesystem */
    public final class C142972 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AVy $icon;
        public final /* synthetic */ String $leadingText;
        public final /* synthetic */ AuraTextInputFooterStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142972(String str, AVy aVy, AuraTextInputFooterStyle auraTextInputFooterStyle, int i, int i2) {
            super(2);
            this.$leadingText = str;
            this.$icon = aVy;
            this.$style = auraTextInputFooterStyle;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
            AuraTextInputWithHeaderDefaults.this.FooterTextAndIcon(this.$leadingText, this.$icon, this.$style, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public final void FooterRemainingCount(int i, int i2, AuraTextInputFooterStyle auraTextInputFooterStyle, BFM bfm, int i3, int i4) throws Resources.NotFoundException {
        AuraTextInputFooterStyle auraTextInputFooterStyle2 = auraTextInputFooterStyle;
        bfm.AgG(130486283);
        int iA0D = (i3 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i3 : i3;
        if ((i3 & 48) == 0) {
            iA0D |= AnonymousClass004.A0E(bfm, i2);
        }
        int i5 = i4 & 4;
        if (i5 != 0) {
            iA0D |= 384;
        } else if ((i3 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, auraTextInputFooterStyle2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i5 != 0) {
                auraTextInputFooterStyle2 = AuraTextInputFooterStyle.Normal.INSTANCE;
            }
            InterfaceC04981Yd interfaceC04981Yd = AcQ.A00;
            String strA07 = FGI.A07(i, i2, CustomConnectorRegisterRepositoryKt.ROOT_PATH);
            String string = ((Resources) bfm.A6v(AndroidCompositionLocals_androidKt.A04)).getString(R.string._name_removed__res_0x7f1210f0, Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(interfaceC04981Yd, bfm, C2VU.A05, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            boolean zA65 = bfm.A65(string);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new AuraTextInputWithHeaderDefaults$FooterRemainingCount$1$1$1(string);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bs0, objAaT, false);
            int i6 = (iA0D >> 6) & 14;
            AuraTextKt.m2639AuraTextUY9GdpU(strA07, bRgA0Y, auraTextInputFooterStyle2.mo2588colorWaAFU9c(bfm, i6), auraTextInputFooterStyle2.style(bfm, i6), null, null, new C1YL(6), false, 1, 0, 0, null, null, null, bfm, 100663296, 0, 16048);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, i2, auraTextInputFooterStyle2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FooterTextAndIcon(java.lang.String r35, X.AVy r36, com.facebook.aura.vds.compose.input.AuraTextInputFooterStyle r37, X.BFM r38, int r39, int r40) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.input.AuraTextInputWithHeaderDefaults.FooterTextAndIcon(java.lang.String, X.AVy, com.facebook.aura.vds.compose.input.AuraTextInputFooterStyle, X.BFM, int, int):void");
    }
}
