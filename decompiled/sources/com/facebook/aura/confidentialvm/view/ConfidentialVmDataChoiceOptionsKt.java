package com.facebook.aura.confidentialvm.view;

import X.AHD;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C0953AJg;
import X.C14P;
import X.C1515AkP;
import X.C1736ApY;
import X.C1822Arm;
import X.C1DG;
import X.C1DM;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationDeleteOption;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationKeepOption;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmDisclosure;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropLink;
import com.facebook.aura.linktext.HatchLinkTextKt;
import com.facebook.aura.linktext.HatchTextLink;
import com.facebook.aura.settings.AuraExternalUriRegistry;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardStyles;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmDataChoiceOptionsKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceOptionsKt$ConfidentialVmDataChoiceOption$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ApQ $body;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $footer;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSelect;
        public final /* synthetic */ boolean $selected;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, ApQ apQ, boolean z, Function0<Unit> function0, BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$title = str;
            this.$body = apQ;
            this.$selected = z;
            this.$onSelect = function0;
            this.$modifier = bRg;
            this.$footer = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmDataChoiceOptionsKt.ConfidentialVmDataChoiceOption(this.$title, this.$body, this.$selected, this.$onSelect, this.$modifier, this.$footer, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceOptionsKt$ConfidentialVmDataTransferTime$2, reason: invalid class name and case insensitive filesystem */
    public final class C112612 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112612(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            ConfidentialVmDataChoiceOptionsKt.ConfidentialVmDataTransferTime(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceOptionsKt$ConfidentialVmKeepDataOption$2, reason: invalid class name and case insensitive filesystem */
    public final class C112622 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ApQ $body;
        public final /* synthetic */ ConfidentialVmDataMigrationKeepOption $copy;
        public final /* synthetic */ String $footnote;
        public final /* synthetic */ boolean $isSwitchingBack;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSelect;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112622(ConfidentialVmDataMigrationKeepOption confidentialVmDataMigrationKeepOption, boolean z, String str, ApQ apQ, boolean z2, Function0<Unit> function0, BRg bRg) {
            super(2);
            this.$copy = confidentialVmDataMigrationKeepOption;
            this.$isSwitchingBack = z;
            this.$footnote = str;
            this.$body = apQ;
            this.$selected = z2;
            this.$onSelect = function0;
            this.$modifier = bRg;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            String strA01;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                ConfidentialVmDataMigrationKeepOption confidentialVmDataMigrationKeepOption = this.$copy;
                B1U b1uA00 = null;
                if (confidentialVmDataMigrationKeepOption != null && (strA01 = confidentialVmDataMigrationKeepOption.title) != null) {
                    bfm.AgE(652179734);
                } else {
                    bfm.AgE(652180695);
                    boolean z = this.$isSwitchingBack;
                    int i2 = R.string._name_removed__res_0x7f12072f;
                    if (z) {
                        i2 = R.string._name_removed__res_0x7f12075f;
                    }
                    strA01 = AbstractC2271BQs.A01(bfm, i2);
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                String str = this.$footnote;
                if (str == null) {
                    bfm.AgE(-1256835995);
                } else {
                    bfm.AgE(-1256835994);
                    b1uA00 = B1V.A00(bfm, new ConfidentialVmDataChoiceOptionsKt$ConfidentialVmKeepDataOption$2$1$1(str), 716780530);
                }
                BBI.A0R(bbi, false);
                ConfidentialVmDataChoiceOptionsKt.ConfidentialVmDataChoiceOption(strA01, this.$body, this.$selected, this.$onSelect, this.$modifier, b1uA00, bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceOptionsKt$ConfidentialVmKeepDataOption$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConfidentialVmDataMigrationKeepOption $copy;
        public final /* synthetic */ boolean $isSwitchingBack;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLearnMoreClick;
        public final /* synthetic */ Function0<Unit> $onSelect;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConfidentialVmDataMigrationKeepOption confidentialVmDataMigrationKeepOption, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$copy = confidentialVmDataMigrationKeepOption;
            this.$isSwitchingBack = z;
            this.$selected = z2;
            this.$onSelect = function0;
            this.$onLearnMoreClick = function02;
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
            ConfidentialVmDataChoiceOptionsKt.ConfidentialVmKeepDataOption(this.$copy, this.$isSwitchingBack, this.$selected, this.$onSelect, this.$onLearnMoreClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceOptionsKt$ConfidentialVmStartFreshOption$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConfidentialVmDataMigrationDeleteOption $copy;
        public final /* synthetic */ boolean $isSwitchingBack;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSelect;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfidentialVmDataMigrationDeleteOption confidentialVmDataMigrationDeleteOption, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$copy = confidentialVmDataMigrationDeleteOption;
            this.$isSwitchingBack = z;
            this.$selected = z2;
            this.$onSelect = function0;
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
            ConfidentialVmDataChoiceOptionsKt.ConfidentialVmStartFreshOption(this.$copy, this.$isSwitchingBack, this.$selected, this.$onSelect, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConfidentialVmDataChoiceOption(String str, ApQ apQ, boolean z, Function0<Unit> function0, BRg bRg, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2 = g0w;
        BRg bRg2 = bRg;
        bfm.AgG(-1611918252);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, apQ);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i4 = i2 & 32;
        int iA0Y = 196608;
        if (i4 != 0) {
            iA0d |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0w2);
            iA0d |= iA0Y;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0w2 = null;
            }
            AuraCardStyle auraCardStyleM2500listoAWOtXo = AuraCardStyles.INSTANCE.m2500listoAWOtXo(null, 0L, new C1DG(AuraDimensKt.SpacingXsmallPlusNano), bfm, 3072, 3);
            C1DM c1dm = AnonymousClass002.A0e(bfm).none;
            AuraCardType.Radio radio = AuraCardType.Radio.INSTANCE;
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.TITLE1_EMPHASIZED;
            AuraIconAndBodyStyle auraIconAndBodyStyle = AuraIconAndBodyStyle.B1;
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            AuraCardContent auraCardContent = new AuraCardContent(str, auraIconAndHeadlineStyle, (BO6<String, C14P>) c0953AJgA00, (B6A) null, apQ, (G0U<? super String, Unit>) null, auraIconAndBodyStyle, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, false, (String) null, (C1822Arm) null, j, j, (C1YL) null);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = (iA0d & 7168) == 2048;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmDataChoiceOptionsKt$ConfidentialVmDataChoiceOption$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRg2, auraCardStyleM2500listoAWOtXo, auraCardContent, radio, null, null, null, boolValueOf, (G0U) objAaT, null, false, false, null, c1dm, 0L, false, g0w2, null, bfm, AnonymousClass001.A0C(iA0d << 15, ((iA0d >> 12) & 14) | 3072), (iA0d << 3) & 3670016, 188016);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, apQ, z, function0, bRg2, g0w2, i, i2);
        }
    }

    public static final void ConfidentialVmDataTransferTime(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-1662929523);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingNano);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0P);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.clock_outline_24_wght500, 0), AuraIconSize.X_TINY, null, C06G.A06(bfm), null, bfm, AnonymousClass001.A03(), 41);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), AnonymousClass002.A0f(bfm).footnoteMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112612(str, bRgA0P, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ConfidentialVmKeepDataOption(ConfidentialVmDataMigrationKeepOption confidentialVmDataMigrationKeepOption, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        HxE<String, List<HatchTextLink>> hxEWithLinkedArguments;
        String strA0e;
        BRg bRg2 = bRg;
        AnonymousClass002.A1C(function0, 3, function02);
        bfm.AgG(345470747);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, confidentialVmDataMigrationKeepOption) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function02);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0T, 74898), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = R.string._name_removed__res_0x7f12072e;
            if (z) {
                i4 = R.string._name_removed__res_0x7f12075e;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i4);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12043a);
            long jA07 = C06G.A07(bfm);
            String string = AuraExternalUriRegistry.confidentialVmLearnMoreUri.uri.toString();
            C7384Etj.A0U(string);
            ConfidentialVmDisclosure confidentialVmDisclosure = confidentialVmDataMigrationKeepOption != null ? confidentialVmDataMigrationKeepOption.body : null;
            boolean zA1W = AnonymousClass002.A1W(bfm, string, AnonymousClass005.A1R(bfm, confidentialVmDisclosure, strA01, strA012), bfm.A64(jA07));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                if (confidentialVmDisclosure != null) {
                    String str = confidentialVmDisclosure.text;
                    AHD<ConfidentialVmValuePropLink> ahd = confidentialVmDisclosure.links;
                    ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                    Iterator it = ahd.iterator();
                    while (it.hasNext()) {
                        C06G.A0l(arrayListA0i, it);
                    }
                    hxEWithLinkedArguments = new HxE<>(str, arrayListA0i);
                } else {
                    hxEWithLinkedArguments = HatchLinkTextKt.withLinkedArguments(strA01, Collections.singletonList(new HxE(strA012, string)));
                }
                String str2 = hxEWithLinkedArguments.first;
                List<HatchTextLink> list = hxEWithLinkedArguments.second;
                objAaT = new HxE(HatchLinkTextKt.m1189buildHatchLinkAnnotatedString9LQNqLg(str2, list, jA07, C1736ApY.A03), HatchLinkTextKt.hatchLinkTitlesByUrl(str2, list));
                bfm.Ai0(objAaT);
            }
            HxE hxE = (HxE) objAaT;
            ApQ apQ = (ApQ) hxE.first;
            Map map = (Map) hxE.second;
            if (confidentialVmDataMigrationKeepOption == null || (strA0e = confidentialVmDataMigrationKeepOption.footnote) == null) {
                if (z) {
                    AnonymousClass003.A0l(bfm, 1178631714);
                    strA0e = null;
                } else {
                    bfm.AgE(1284947078);
                    strA0e = AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f120730);
                }
            }
            boolean zA1M = AnonymousClass005.A1M(iA0T);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new ConfidentialVmDataChoiceOptionsKt$ConfidentialVmKeepDataOption$uriHandler$1$1(function02);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass006.A15(bfm, Am0.A0G.A04(HatchLinkTextKt.rememberHatchLinkUriHandler(map, (G0U) objAaT2, bfm, 0, 0)), new C112622(confidentialVmDataMigrationKeepOption, z, strA0e, apQ, z2, function0, bRg2), -1684235685);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(confidentialVmDataMigrationKeepOption, z, z2, function0, function02, bRg2, i, i2);
        }
    }

    public static final void ConfidentialVmStartFreshOption(ConfidentialVmDataMigrationDeleteOption confidentialVmDataMigrationDeleteOption, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        String strA0v;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 3);
        bfm.AgG(2077976850);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, confidentialVmDataMigrationDeleteOption) | i : i;
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
            if (confidentialVmDataMigrationDeleteOption == null || (strA01 = confidentialVmDataMigrationDeleteOption.title) == null) {
                bfm.AgE(-224031114);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120732);
            } else {
                bfm.AgE(-224031579);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (confidentialVmDataMigrationDeleteOption == null || (strA0v = confidentialVmDataMigrationDeleteOption.body) == null) {
                bfm.AgE(-224025852);
                int i4 = R.string._name_removed__res_0x7f120731;
                if (z) {
                    i4 = R.string._name_removed__res_0x7f120760;
                }
                strA0v = AnonymousClass006.A0v(bfm, i4);
            } else {
                bfm.AgE(-224026844);
            }
            BBI.A0R(bbi, false);
            ConfidentialVmDataChoiceOption(strA01, AnonymousClass005.A0X(strA0v), z2, function0, bRg2, null, bfm, iA0T & 65408, 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(confidentialVmDataMigrationDeleteOption, z, z2, function0, bRg2, i, i2);
        }
    }
}
