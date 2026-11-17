package com.facebook.aura.vds.toolbar;

import X.ASZ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHJ;
import X.BRg;
import X.C06G;
import X.C10G;
import X.C1518AkS;
import X.C1822Arm;
import X.C2VU;
import X.C3TH;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class TitleKt {

    /* renamed from: com.facebook.aura.vds.toolbar.TitleKt$CenterSection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $focusOnTitle;
        public final /* synthetic */ C3TH $horizontalAlignment;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ C1822Arm $subtitleStyle;
        public final /* synthetic */ String $title;
        public final /* synthetic */ int $titleMaxLines;
        public final /* synthetic */ C1822Arm $titleStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, String str, C1822Arm c1822Arm, boolean z, String str2, int i, C1822Arm c1822Arm2, C3TH c3th, int i2, int i3) {
            super(2);
            this.$modifier = bRg;
            this.$title = str;
            this.$titleStyle = c1822Arm;
            this.$focusOnTitle = z;
            this.$subtitle = str2;
            this.$titleMaxLines = i;
            this.$subtitleStyle = c1822Arm2;
            this.$horizontalAlignment = c3th;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            TitleKt.CenterSection(this.$modifier, this.$title, this.$titleStyle, this.$focusOnTitle, this.$subtitle, this.$titleMaxLines, this.$subtitleStyle, this.$horizontalAlignment, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.toolbar.TitleKt$Subtitle$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ C1822Arm $textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, C1822Arm c1822Arm, int i) {
            super(2);
            this.$subtitle = str;
            this.$textStyle = c1822Arm;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            TitleKt.Subtitle(this.$subtitle, this.$textStyle, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.vds.toolbar.TitleKt$Title$3, reason: invalid class name and case insensitive filesystem */
    public final class C143103 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $focusOnTitle;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ C1822Arm $textStyle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143103(String str, boolean z, C1822Arm c1822Arm, int i, int i2) {
            super(2);
            this.$title = str;
            this.$focusOnTitle = z;
            this.$textStyle = c1822Arm;
            this.$maxLines = i;
            this.$$changed = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            TitleKt.Title(this.$title, this.$focusOnTitle, this.$textStyle, this.$maxLines, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CenterSection(X.BRg r19, java.lang.String r20, X.C1822Arm r21, boolean r22, java.lang.String r23, int r24, X.C1822Arm r25, X.C3TH r26, X.BFM r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.toolbar.TitleKt.CenterSection(X.BRg, java.lang.String, X.Arm, boolean, java.lang.String, int, X.Arm, X.3TH, X.BFM, int, int):void");
    }

    public static final void Subtitle(String str, C1822Arm c1822Arm, BFM bfm, int i) {
        bfm.AgG(-317710955);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (str == null) {
                bfm.AgE(1180933233);
            } else {
                bfm.AgE(1180933234);
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0d << 6) & 7168) | 805306368, 6, 14834);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, c1822Arm, i);
        }
    }

    public static final void Title(String str, boolean z, C1822Arm c1822Arm, int i, BFM bfm, int i2) {
        bfm.AgG(1972185242);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1822Arm);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, i);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            BRg bRgA00 = BRg.A00;
            if (z) {
                Object objA0p = AnonymousClass001.A0p(bfm, -1781891504);
                Object obj = C78N.A00;
                C1518AkS c1518AkS = (C1518AkS) AnonymousClass003.A0d(bfm, objA0p, obj);
                BRg bRgA002 = BHJ.A00(bRgA00, c1518AkS);
                Object objAaT = bfm.AaT();
                if (objAaT == obj) {
                    objAaT = new TitleKt$Title$1$1(c1518AkS);
                    bfm.Ai0(objAaT);
                }
                bRgA00 = ASZ.A00(bRgA002, (G0U) objAaT);
            } else {
                bfm.AgE(-1781683928);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (str == null) {
                bfm.AgE(-1781665701);
            } else {
                bfm.AgE(-1781665700);
                BRg bRgA02 = C10G.A02(C2VU.A09, bRgA00, false);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = TitleKt$Title$2$1$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA02, objAaT2, false), C06G.A0C(bfm), c1822Arm, null, null, null, false, 0, i, 2, null, null, null, bfm, AnonymousClass001.A06(iA0d << 18, (iA0d << 3) & 7168), 6, 14832);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143103(str, z, c1822Arm, i, i2);
        }
    }
}
