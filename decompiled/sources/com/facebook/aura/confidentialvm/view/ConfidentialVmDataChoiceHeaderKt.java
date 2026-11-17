package com.facebook.aura.confidentialvm.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C1736ApY;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.HxE;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationCopy;
import com.facebook.aura.linktext.HatchLinkTextKt;
import com.facebook.aura.linktext.HatchTextLink;
import com.facebook.aura.settings.AuraExternalUriRegistry;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmDataChoiceHeaderKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceHeaderKt$ConfidentialVmDataChoiceHeader$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConfidentialVmDataMigrationCopy $copy;
        public final /* synthetic */ boolean $isSwitchingBack;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $offersDataTransfer;
        public final /* synthetic */ Function0<Unit> $onLearnMoreClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$copy = confidentialVmDataMigrationCopy;
            this.$isSwitchingBack = z;
            this.$offersDataTransfer = z2;
            this.$onLearnMoreClick = function0;
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
            ConfidentialVmDataChoiceHeaderKt.ConfidentialVmDataChoiceHeader(this.$copy, this.$isSwitchingBack, this.$offersDataTransfer, this.$onLearnMoreClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceHeaderKt$ConfidentialVmDataChoiceHeadline$1, reason: invalid class name and case insensitive filesystem */
    public final class C112601 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ApQ $body;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112601(String str, ApQ apQ, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$body = apQ;
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
            ConfidentialVmDataChoiceHeaderKt.ConfidentialVmDataChoiceHeadline(this.$title, this.$body, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceHeaderKt$ConfidentialVmStartFreshOnlyHeadline$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ApQ $body;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ApQ apQ, BRg bRg) {
            super(2);
            this.$body = apQ;
            this.$modifier = bRg;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                ConfidentialVmDataChoiceHeaderKt.ConfidentialVmDataChoiceHeadline(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120755), this.$body, this.$modifier, bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceHeaderKt$ConfidentialVmStartFreshOnlyHeadline$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSwitchingBack;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLearnMoreClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isSwitchingBack = z;
            this.$onLearnMoreClick = function0;
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
            ConfidentialVmDataChoiceHeaderKt.ConfidentialVmStartFreshOnlyHeadline(this.$isSwitchingBack, this.$onLearnMoreClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConfidentialVmDataChoiceHeader(ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbi;
        String strA01;
        String strA012;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 3);
        bfm.AgG(-427959003);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, confidentialVmDataMigrationCopy) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (z2) {
                bfm.AgE(-1863457801);
                if (confidentialVmDataMigrationCopy == null || (strA01 = confidentialVmDataMigrationCopy.title) == null) {
                    bfm.AgE(1048269719);
                    int i4 = R.string._name_removed__res_0x7f120733;
                    if (z) {
                        i4 = R.string._name_removed__res_0x7f120761;
                    }
                    strA01 = AbstractC2271BQs.A01(bfm, i4);
                } else {
                    bfm.AgE(1048268758);
                }
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                if (confidentialVmDataMigrationCopy == null || (strA012 = confidentialVmDataMigrationCopy.subtitle) == null) {
                    bfm.AgE(1048281723);
                    int i5 = R.string._name_removed__res_0x7f12072d;
                    if (z) {
                        i5 = R.string._name_removed__res_0x7f12075d;
                    }
                    strA012 = AbstractC2271BQs.A01(bfm, i5);
                } else {
                    bfm.AgE(1048280545);
                }
                BBI.A0R(bbi, false);
                ConfidentialVmDataChoiceHeadline(strA01, AnonymousClass005.A0X(strA012), bRg2, bfm, (iA0T >> 6) & 896, 0);
            } else {
                bfm.AgE(-1862641261);
                ConfidentialVmStartFreshOnlyHeadline(z, function0, bRg2, bfm, AnonymousClass002.A07(iA0T >> 6, (iA0T >> 3) & 14), 0);
                bbi = (BBI) bfm;
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(confidentialVmDataMigrationCopy, z, z2, function0, bRg2, i, i2);
        }
    }

    public static final void ConfidentialVmDataChoiceHeadline(String str, ApQ apQ, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-612554186);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, apQ);
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
            AuraHeadlineAndBodyKt.AuraHeadlineAndBody(AuraHeadlineAndBodyStyle.TITLE2_MEDIUM_SUBHEADLINE_REGULAR, C3U4.A07(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingLargePlusMicro), str, null, null, apQ, null, null, 0, null, null, null, null, null, AnonymousClass002.A0f(bfm).title1Medium, null, bfm, AnonymousClass001.A08(iA0d << 12, ((iA0d << 6) & 896) | 6), 0, 49112);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112601(str, apQ, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ConfidentialVmStartFreshOnlyHeadline(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1973403493);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            int i4 = R.string._name_removed__res_0x7f120754;
            if (z) {
                i4 = R.string._name_removed__res_0x7f120765;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i4);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12043a);
            String string = AuraExternalUriRegistry.confidentialVmLearnMoreUri.uri.toString();
            C7384Etj.A0U(string);
            long jA07 = C06G.A07(bfm);
            boolean zA1R = AnonymousClass005.A1R(bfm, strA01, strA012, string) | bfm.A64(jA07);
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                HxE<String, List<HatchTextLink>> hxEWithLinkedArguments = HatchLinkTextKt.withLinkedArguments(strA01, Arrays.asList(new HxE(HatchAppName.value, ""), new HxE(strA012, string)));
                String str = hxEWithLinkedArguments.first;
                List<HatchTextLink> list = hxEWithLinkedArguments.second;
                objAaT = new HxE(HatchLinkTextKt.m1189buildHatchLinkAnnotatedString9LQNqLg(str, list, jA07, C1736ApY.A03), HatchLinkTextKt.hatchLinkTitlesByUrl(str, list));
                bfm.Ai0(objAaT);
            }
            HxE hxE = (HxE) objAaT;
            ApQ apQ = (ApQ) hxE.first;
            Map map = (Map) hxE.second;
            boolean zA1C = AnonymousClass003.A1C(iA0n);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == C78N.A00) {
                objAaT2 = new ConfidentialVmDataChoiceHeaderKt$ConfidentialVmStartFreshOnlyHeadline$uriHandler$1$1(function0);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass006.A15(bfm, Am0.A0G.A04(HatchLinkTextKt.rememberHatchLinkUriHandler(map, (G0U) objAaT2, bfm, 0, 0)), new AnonymousClass2(apQ, bRg), -393333413);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(z, function0, bRg, i, i2);
        }
    }
}
