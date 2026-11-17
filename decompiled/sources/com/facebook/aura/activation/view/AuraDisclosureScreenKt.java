package com.facebook.aura.activation.view;

import X.AGH;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AXN;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
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
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C0861A6i;
import X.C0jP;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C11U;
import X.C1515AkP;
import X.C1697Aoc;
import X.C1731ApS;
import X.C1822Arm;
import X.C1868Asi;
import X.C1AC;
import X.C1BO;
import X.C1DG;
import X.C1DI;
import X.C1DM;
import X.C1EQ;
import X.C1SA;
import X.C1YD;
import X.C1YL;
import X.C1b8;
import X.C1er;
import X.C1ji;
import X.C2CK;
import X.C2KR;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.activation.data.HatchDisclosureSection;
import com.facebook.aura.activation.data.HatchTosMetadata;
import com.facebook.aura.activation.data.HatchUpsellCell;
import com.facebook.aura.activation.model.AuraDisclosureViewModel;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.components.reactions.AuraSingleTearKt;
import com.facebook.aura.linktext.HatchLinkTextKt;
import com.facebook.aura.linktext.HatchTextLink;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.settings.AuraExternalUriRegistry;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraDisclosureScreenKt {

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureScreenKt$AuraDisclosureScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isFetchingMetadata;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClose;
        public final /* synthetic */ boolean $showsActivationSubscriptionUpgradeCard;
        public final /* synthetic */ HatchTosMetadata $tosMetadata;
        public final /* synthetic */ HatchUpsellCell $upsellCell;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, HatchUpsellCell hatchUpsellCell, BRg bRg, boolean z, boolean z2, HatchTosMetadata hatchTosMetadata, boolean z3, int i, int i2) {
            super(2);
            this.$onClose = function0;
            this.$upsellCell = hatchUpsellCell;
            this.$modifier = bRg;
            this.$isLoading = z;
            this.$isFetchingMetadata = z2;
            this.$tosMetadata = hatchTosMetadata;
            this.$showsActivationSubscriptionUpgradeCard = z3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraDisclosureScreenKt.AuraDisclosureScreen(this.$onClose, this.$upsellCell, this.$modifier, this.$isLoading, this.$isFetchingMetadata, this.$tosMetadata, this.$showsActivationSubscriptionUpgradeCard, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureScreenKt$AuraDisclosureScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isFetchingMetadata;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClose;
        public final /* synthetic */ boolean $showsActivationSubscriptionUpgradeCard;
        public final /* synthetic */ HatchTosMetadata $tosMetadata;
        public final /* synthetic */ HatchUpsellCell $upsellCell;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Unit> function0, HatchUpsellCell hatchUpsellCell, BRg bRg, boolean z, boolean z2, HatchTosMetadata hatchTosMetadata, boolean z3, int i, int i2) {
            super(2);
            this.$onClose = function0;
            this.$upsellCell = hatchUpsellCell;
            this.$modifier = bRg;
            this.$isLoading = z;
            this.$isFetchingMetadata = z2;
            this.$tosMetadata = hatchTosMetadata;
            this.$showsActivationSubscriptionUpgradeCard = z3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraDisclosureScreenKt.AuraDisclosureScreen(this.$onClose, this.$upsellCell, this.$modifier, this.$isLoading, this.$isFetchingMetadata, this.$tosMetadata, this.$showsActivationSubscriptionUpgradeCard, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureScreenKt$DisclosureCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C107022 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107022(BRg bRg, Function0<Unit> function0, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$onClick = function0;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraDisclosureScreenKt.DisclosureCard(this.$modifier, this.$onClick, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureScreenKt$DisclosureContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C107032 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showsActivationSubscriptionUpgradeCard;
        public final /* synthetic */ HatchTosMetadata $tosMetadata;
        public final /* synthetic */ HatchUpsellCell $upsellCell;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107032(HatchTosMetadata hatchTosMetadata, boolean z, HatchUpsellCell hatchUpsellCell, BRg bRg, int i, int i2) {
            super(2);
            this.$tosMetadata = hatchTosMetadata;
            this.$showsActivationSubscriptionUpgradeCard = z;
            this.$upsellCell = hatchUpsellCell;
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
            AuraDisclosureScreenKt.DisclosureContent(this.$tosMetadata, this.$showsActivationSubscriptionUpgradeCard, this.$upsellCell, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureScreenKt$DisclosureScrollFade$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1110AYw $scrollState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1110AYw c1110AYw, BRg bRg, int i, int i2) {
            super(2);
            this.$scrollState = c1110AYw;
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
            AuraDisclosureScreenKt.DisclosureScrollFade(this.$scrollState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureScreenKt$DisclosureScrollFade$2, reason: invalid class name and case insensitive filesystem */
    public final class C107042 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1110AYw $scrollState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107042(C1110AYw c1110AYw, BRg bRg, int i, int i2) {
            super(2);
            this.$scrollState = c1110AYw;
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
            AuraDisclosureScreenKt.DisclosureScrollFade(this.$scrollState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureScreenKt$DisclosureSubscriptionUpgradeCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C107052 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchUpsellCell $serverCopy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107052(HatchUpsellCell hatchUpsellCell) {
            super(3);
            this.$serverCopy = hatchUpsellCell;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            String strA01;
            String strA012;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                Integer numValueOf = Integer.valueOf(R.drawable.bundlesubscription_outline_24_wght500);
                HatchUpsellCell hatchUpsellCell = this.$serverCopy;
                if (hatchUpsellCell != null && (strA01 = hatchUpsellCell.title) != null) {
                    bfm.AgE(906674759);
                } else {
                    bfm.AgE(906675906);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12024f);
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                HatchUpsellCell hatchUpsellCell2 = this.$serverCopy;
                if (hatchUpsellCell2 != null && (strA012 = hatchUpsellCell2.subtitle) != null) {
                    bfm.AgE(906679376);
                } else {
                    bfm.AgE(906680616);
                    strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12024e);
                }
                BBI.A0R(bbi, false);
                AuraDisclosureScreenKt.DisclosureValuePropRow(numValueOf, strA01, strA012, null, true, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureScreenKt$DisclosureSubscriptionUpgradeCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchUpsellCell $serverCopy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchUpsellCell hatchUpsellCell, BRg bRg, int i, int i2) {
            super(2);
            this.$serverCopy = hatchUpsellCell;
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
            AuraDisclosureScreenKt.DisclosureSubscriptionUpgradeCard(this.$serverCopy, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureScreenKt$DisclosureValuePropCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C107061 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ List<HatchDisclosureSection> $sections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107061(List<HatchDisclosureSection> list) {
            super(3);
            this.$sections = list;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                int i2 = 0;
                for (HatchDisclosureSection hatchDisclosureSection : this.$sections) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    HatchDisclosureSection hatchDisclosureSection2 = hatchDisclosureSection;
                    if (i2 > 0) {
                        bfm.AgE(-1138398888);
                        BS0 bs0 = BRg.A00;
                        float f = AnonymousClass002.A0d(bfm).icon.xSmall;
                        float f2 = AuraDimensKt.SpacingMedium;
                        AuraDividerKt.AuraRowDivider(C3U4.A0C(bs0, f + f2, f2, 0.0f, f2), bfm, 0, 0);
                    } else {
                        bfm.AgE(-1138127886);
                    }
                    AnonymousClass001.A1D(bfm);
                    Integer numDisclosureSectionIconRes = AuraDisclosureScreenKt.disclosureSectionIconRes(hatchDisclosureSection2.icon);
                    String str = hatchDisclosureSection2.title;
                    String str2 = hatchDisclosureSection2.description;
                    BS0 bs02 = BRg.A00;
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = AuraDisclosureScreenKt$DisclosureValuePropCard$1$1$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    AuraDisclosureScreenKt.DisclosureValuePropRow(numDisclosureSectionIconRes, str, str2, AnonymousClass001.A0Y(bs02, objAaT, true), false, bfm, 0, 16);
                    i2 = i3;
                }
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureScreenKt$DisclosureValuePropCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C107072 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<HatchDisclosureSection> $sections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107072(List<HatchDisclosureSection> list, BRg bRg, int i, int i2) {
            super(2);
            this.$sections = list;
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
            AuraDisclosureScreenKt.DisclosureValuePropCard(this.$sections, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureScreenKt$DisclosureValuePropRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C107082 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $description;
        public final /* synthetic */ Integer $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showsChevron;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107082(Integer num, String str, String str2, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$iconRes = num;
            this.$title = str;
            this.$description = str2;
            this.$modifier = bRg;
            this.$showsChevron = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraDisclosureScreenKt.DisclosureValuePropRow(this.$iconRes, this.$title, this.$description, this.$modifier, this.$showsChevron, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureScreenKt$MuseAppDisclosureLegalText$1, reason: invalid class name and case insensitive filesystem */
    public final class C107091 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLinkClick;
        public final /* synthetic */ boolean $prefersSubscriptionDisclosure;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107091(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$prefersSubscriptionDisclosure = z;
            this.$onLinkClick = function0;
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
            AuraDisclosureScreenKt.MuseAppDisclosureLegalText(this.$prefersSubscriptionDisclosure, this.$onLinkClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureScreenKt$MuseAppDisclosureLegalText$2, reason: invalid class name and case insensitive filesystem */
    public final class C107102 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLinkClick;
        public final /* synthetic */ boolean $prefersSubscriptionDisclosure;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107102(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$prefersSubscriptionDisclosure = z;
            this.$onLinkClick = function0;
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
            AuraDisclosureScreenKt.MuseAppDisclosureLegalText(this.$prefersSubscriptionDisclosure, this.$onLinkClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void DisclosureCard(BRg bRg, Function0<Unit> function0, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRgA04;
        BRg bRg2 = bRg;
        Function0<Unit> function02 = function0;
        bfm.AgG(-1249332049);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function02);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                function02 = null;
            }
            C1DM c1dm = AnonymousClass002.A0e(bfm).large;
            BRg bRgA02 = C1DI.A02(C11U.A03(AnonymousClass001.A0R(bRg2), c1dm), c1dm, 1.0f, AnonymousClass002.A0c(bfm).border);
            if (function02 == null || (bRgA04 = C0v5.A04(BRg.A00, new C1YD(0), null, function02, true)) == null) {
                bRgA04 = BRg.A00;
            }
            BRg bRgA09 = C3U4.A09(bRgA02.then(bRgA04), AuraDimensKt.SpacingLarge);
            int i5 = (iA0d << 3) & 7168;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AnonymousClass004.A1B(bbi, C90l.A00, bfm, g0w, ((i5 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107022(bRg2, function02, g0w, i, i2);
        }
    }

    public static final void DisclosureValuePropCard(List<HatchDisclosureSection> list, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1580960501);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            DisclosureCard(bRg2, null, B1V.A00(bfm, new C107061(list), -601057359), bfm, ((iA05 >> 3) & 14) | 384, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107072(list, bRg2, i, i2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Integer disclosureSectionIconRes(String str) {
        int i;
        if (str != null && !C7BY.A0j(str)) {
            switch (str.hashCode()) {
                case -1718301948:
                    if (str.equals("sliders2Horizontal")) {
                        i = R.drawable.sliders2horizontal_outline_24_wght500;
                        break;
                    }
                    break;
                case -1332803596:
                    if (str.equals("lockKeyhole")) {
                        i = R.drawable.lockkeyhole_outline_24_wght500;
                        break;
                    }
                    break;
                case -1060986145:
                    if (str.equals("agentic")) {
                        i = R.drawable.agentic_outline_24_wght500;
                        break;
                    }
                    break;
                case -1027956133:
                    if (str.equals("settingsGearIOS")) {
                        i = R.drawable.settingsgearios_outline_24_wght500;
                        break;
                    }
                    break;
                case -333377761:
                    if (str.equals("shieldCheck")) {
                        i = R.drawable.shieldcheck_outline_24_wght500;
                        break;
                    }
                    break;
                case 100913:
                    if (str.equals("eye")) {
                        i = R.drawable.eye_outline_24_wght500;
                        break;
                    }
                    break;
                case 3327275:
                    if (str.equals("lock")) {
                        i = R.drawable.lock_outline_24_wght500;
                        break;
                    }
                    break;
                case 3641856:
                    if (str.equals("wand")) {
                        i = R.drawable.wand_outline_24_wght500;
                        break;
                    }
                    break;
                case 94755854:
                    if (str.equals(HatchNodeCardJsonKt.TYPE_CLOCK)) {
                        i = R.drawable.clock_outline_24_wght500;
                        break;
                    }
                    break;
                case 820714423:
                    if (str.equals("shieldInfo")) {
                        i = R.drawable.shieldinfo_outline_24_wght500;
                        break;
                    }
                    break;
                case 820804660:
                    if (str.equals("shieldLock")) {
                        i = R.drawable.shieldlock_outline_24_wght500;
                        break;
                    }
                    break;
                case 1416981949:
                    if (str.equals("settingsGearAndroid")) {
                        i = R.drawable.settingsgearandroid_outline_24_wght500;
                        break;
                    }
                    break;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public static final float rememberSixLineHeight(C1822Arm c1822Arm, BFM bfm, int i) {
        C1868Asi c1868AsiA00 = C2KR.A00(bfm, 0, 1);
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        boolean zA65 = bfm.A65(axnA0Y) | ((((i & 14) ^ 6) > 4 && bfm.A65(c1822Arm)) || (i & 6) == 4);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new C1DG(axnA0Y.Agy(AnonymousClass002.A09(C1868Asi.A01(c1868AsiA00, c1822Arm, "l\nl\nl\nl\nl\nl", 0, AuraSingleTearKt.SINGLE_TEAR_TOTAL_MS, 0L).A02)));
            bfm.Ai0(objAaT);
        }
        return ((C1DG) objAaT).A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraDisclosureScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r48, com.facebook.aura.activation.data.HatchUpsellCell r49, X.BRg r50, boolean r51, boolean r52, com.facebook.aura.activation.data.HatchTosMetadata r53, boolean r54, X.BFM r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraDisclosureScreenKt.AuraDisclosureScreen(kotlin.jvm.functions.Function0, com.facebook.aura.activation.data.HatchUpsellCell, X.BRg, boolean, boolean, com.facebook.aura.activation.data.HatchTosMetadata, boolean, X.BFM, int, int):void");
    }

    public static final void DisclosureContent(HatchTosMetadata hatchTosMetadata, boolean z, HatchUpsellCell hatchUpsellCell, BRg bRg, BFM bfm, int i, int i2) {
        String strA0v;
        BRg bRg2 = bRg;
        bfm.AgG(-1822869822);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchTosMetadata) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, hatchUpsellCell);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            if (hatchTosMetadata == null || (strA0v = hatchTosMetadata.disclosureTitle) == null || C7BY.A0j(strA0v)) {
                bfm.AgE(568767732);
                strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120245);
            } else {
                bfm.AgE(568765562);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            List<HatchDisclosureSection> listRememberDisclosureSections = rememberDisclosureSections(hatchTosMetadata, bfm, iA0T & 14);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXHugePlus);
            C1SA.A00(bfm, null, C10G.A07(bs0, AnonymousClass002.A0d(bfm).icon.xLarge), null, BOf.A00(bfm, R.drawable.hatch_logo, 0), null, null, 0.0f, AVy.$stable | 48, 120);
            float f = AuraDimensKt.SpacingLargePlusMicro;
            C1822Arm c1822Arm = C01N.A01(bfm, bs0, f).title1Medium;
            long j = auraColorsA0c.primaryText;
            C1062ATq c1062ATq = C10G.A02;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AuraDisclosureScreenKt$DisclosureContent$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, AnonymousClass001.A0Y(c1062ATq, objAaT, false), j, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            C01N.A08(bfm, bs0, f);
            DisclosureValuePropCard(listRememberDisclosureSections, null, bfm, 0, 2);
            if (z) {
                bfm.AgE(-749660510);
                C01N.A08(bfm, bs0, f);
                DisclosureSubscriptionUpgradeCard(hatchUpsellCell, null, bfm, (iA0T >> 6) & 14, 2);
            } else {
                bfm.AgE(-749529814);
            }
            BBI.A0R(bbi, false);
            AuraDisclosureInfoBannerKt.AuraDisclosureInfoBanner(C3U4.A0C(bs0, 0.0f, f, 0.0f, 0.0f), bfm, 0, 0);
            C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingLarge, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107032(hatchTosMetadata, z, hatchUpsellCell, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* renamed from: DisclosureLegalText-5TldRvM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m116DisclosureLegalText5TldRvM(com.facebook.aura.activation.data.HatchTosMetadata r14, int r15, X.BRg r16, kotlin.jvm.functions.Function0<kotlin.Unit> r17, X.BFM r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraDisclosureScreenKt.m116DisclosureLegalText5TldRvM(com.facebook.aura.activation.data.HatchTosMetadata, int, X.BRg, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final void DisclosureSubscriptionUpgradeCard(HatchUpsellCell hatchUpsellCell, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1746074647);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchUpsellCell) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchOrigin hatchOrigin = HatchOrigin.ONBOARDING;
            HatchSurface hatchSurface = HatchSurface.ONBOARDING;
            HatchSubsurface hatchSubsurface = HatchSubsurface.ONBOARDING_POST_AUTH;
            HatchScreen hatchScreen = HatchScreen.ONBOARDING_DISCLOSURE;
            HatchComponent hatchComponent = HatchComponent.CVM_OFFER_CARD;
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(bRg2, hatchOrigin, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, null, null, 500L, 0.0f, null, hatchComponent.getValue(), null);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AuraDisclosureScreenKt$DisclosureSubscriptionUpgradeCard$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            DisclosureCard(bRgHatchImpression, (Function0) objAaT, B1V.A00(bfm, new C107052(hatchUpsellCell), -910787365), bfm, 384, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchUpsellCell, bRg2, i, i2);
        }
    }

    public static final void DisclosureValuePropRow(Integer num, String str, String str2, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BS0 bs0;
        BRg bRg2 = bRg;
        boolean z2 = z;
        bfm.AgG(-213744410);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, num) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            C1AC c1ac = C2VU.A04;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            if (num != null) {
                bfm.AgE(-612083879);
                AVy aVyA00 = BOf.A00(bfm, num.intValue(), iA0d & 14);
                bs0 = BRg.A00;
                C1SA.A00(bfm, null, C10G.A07(bs0, AnonymousClass002.A0d(bfm).icon.xSmall), AnonymousClass002.A0S(auraColorsA0c.primaryIcon.enabled), aVyA00, null, null, 0.0f, AVy.$stable | 48, 56);
            } else {
                bfm.AgE(-611676632);
                bs0 = BRg.A00;
                C01N.A0A(bfm, bs0, AnonymousClass002.A0d(bfm).icon.xSmall);
            }
            BBI.A0R(bbi, false);
            float f = AuraDimensKt.SpacingMedium;
            C01N.A09(bfm, bs0, f);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, auraColorsA0c.primaryText, AnonymousClass001.A0g(bfm, akh).bodyMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16370);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingMicro);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, auraColorsA0c.secondaryText, C06G.A0a(bfm, akh), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 6) & 14, 0, 16370);
            BBI.A0R(bbi, true);
            if (z2) {
                bfm.AgE(-611123809);
                C01N.A09(bfm, bs0, f);
                C1SA.A00(bfm, null, C10G.A07(bs0, AnonymousClass002.A0d(bfm).icon.tiny), AnonymousClass002.A0S(auraColorsA0c.secondaryIcon.enabled), BOf.A00(bfm, R.drawable.chevronright_outline_24_wght600, 0), null, null, 0.0f, AVy.$stable | 48, 56);
            } else {
                bfm.AgE(-610792264);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107082(num, str, str2, bRg2, z2, i, i2);
        }
    }

    /* renamed from: DynamicLegalText-D30ufTU, reason: not valid java name */
    public static final void m117DynamicLegalTextD30ufTU(String str, List<HatchTextLink> list, int i, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(str, list);
        C7384Etj.A0Y(function0, 3);
        bfm.AgG(-54981036);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i2) ? 1 : 0);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, i);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i4 = i3 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            long j = auraColorsA0c.link;
            int i5 = iA0d & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i5, 4);
            int i6 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1T = AnonymousClass002.A1T(bfm, j, zA1Q, i6 == 32 || ((iA0d & 64) != 0 && bfm.A65(list)));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = HatchLinkTextKt.m1189buildHatchLinkAnnotatedString9LQNqLg(str, list, auraColorsA0c.link, null);
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            boolean zA1Q2 = AnonymousClass002.A1Q(i5, 4) | (i6 == 32 || ((iA0d & 64) != 0 && bfm.A65(list)));
            Object objAaT2 = bfm.AaT();
            if (zA1Q2 || objAaT2 == C78N.A00) {
                objAaT2 = HatchLinkTextKt.hatchLinkTitlesByUrl(str, list);
                bfm.Ai0(objAaT2);
            }
            m119ScrollableLinkTextD30ufTU(apQ, (Map) objAaT2, i, function0, bRg2, bfm, iA0d & 65408, zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraDisclosureScreenKt$DynamicLegalText$1(str, list, i, function0, bRg2, i2, i3);
        }
    }

    /* renamed from: LegalText-KE6awZw, reason: not valid java name */
    public static final void m118LegalTextKE6awZw(int i, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-759475106);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, function0);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0D |= 384;
        } else if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            String strA0t = AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120249);
            String strA0t2 = AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120246);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12024a);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12024b);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AuraExternalUriRegistry.INSTANCE.getSupplementalTermsOfServiceUri().uri.toString();
                bfm.Ai0(objAaT);
            }
            String str = (String) objAaT;
            C7384Etj.A0X(str);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AuraExternalUriRegistry.INSTANCE.getMetaAiTermsOfServiceUri().uri.toString();
                bfm.Ai0(objAaT2);
            }
            String str2 = (String) objAaT2;
            C7384Etj.A0X(str2);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = AuraExternalUriRegistry.INSTANCE.getPrivacyPolicyUri().uri.toString();
                bfm.Ai0(objAaT3);
            }
            String str3 = (String) objAaT3;
            C7384Etj.A0X(str3);
            boolean zA1T = AnonymousClass005.A1T(bfm, str, str2, str3, bfm.A64(auraColorsA0c.link) | AnonymousClass005.A1T(bfm, strA0t2, strA01, strA012, bfm.A65(strA0t)));
            Object objAaT4 = bfm.AaT();
            if (zA1T || objAaT4 == obj) {
                C1697Aoc c1697AocM1191hatchLinkStylesek8zF_U = HatchLinkTextKt.m1191hatchLinkStylesek8zF_U(auraColorsA0c.link, null, null);
                C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                int iA0B = C7BY.A0B(strA0t, strA0t2, 0, false);
                int iA0B2 = C7BY.A0B(strA0t, strA01, 0, false);
                int iA0B3 = C7BY.A0B(strA0t, strA012, 0, false);
                if (iA0B < 0 || iA0B2 < 0 || iA0B3 < 0) {
                    c1731ApSA0W.A0E(strA0t);
                } else {
                    int length = 0;
                    for (AuraDisclosureScreenKt$LegalText$annotatedString$1$1$Link auraDisclosureScreenKt$LegalText$annotatedString$1$1$Link : AbstractC0878AGe.A0c(Arrays.asList(new AuraDisclosureScreenKt$LegalText$annotatedString$1$1$Link(iA0B, strA0t2, str), new AuraDisclosureScreenKt$LegalText$annotatedString$1$1$Link(iA0B2, strA01, str2), new AuraDisclosureScreenKt$LegalText$annotatedString$1$1$Link(iA0B3, strA012, str3)), new Comparator() { // from class: com.facebook.aura.activation.view.AuraDisclosureScreenKt$LegalText_KE6awZw$lambda$3$0$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return Integer.valueOf(((AuraDisclosureScreenKt$LegalText$annotatedString$1$1$Link) t).start).compareTo(Integer.valueOf(((AuraDisclosureScreenKt$LegalText$annotatedString$1$1$Link) t2).start));
                        }
                    })) {
                        AnonymousClass005.A0s(c1731ApSA0W, strA0t, length, auraDisclosureScreenKt$LegalText$annotatedString$1$1$Link.start);
                        int iA01 = c1731ApSA0W.A01(new C1ji(c1697AocM1191hatchLinkStylesek8zF_U, auraDisclosureScreenKt$LegalText$annotatedString$1$1$Link.url));
                        try {
                            c1731ApSA0W.A0E(auraDisclosureScreenKt$LegalText$annotatedString$1$1$Link.label);
                            c1731ApSA0W.A06(iA01);
                            length = auraDisclosureScreenKt$LegalText$annotatedString$1$1$Link.start + auraDisclosureScreenKt$LegalText$annotatedString$1$1$Link.label.length();
                        } catch (Throwable th) {
                            c1731ApSA0W.A06(iA01);
                            throw th;
                        }
                    }
                    c1731ApSA0W.A0E(strA0t.substring(length));
                }
                objAaT4 = c1731ApSA0W.A04();
                bfm.Ai0(objAaT4);
            }
            ApQ apQ = (ApQ) objAaT4;
            boolean zA1R = AnonymousClass001.A1R(bfm, str3, AnonymousClass001.A1R(bfm, str2, AnonymousClass005.A1T(bfm, strA01, strA012, str, bfm.A65(strA0t2))));
            Object objAaT5 = bfm.AaT();
            if (zA1R || objAaT5 == obj) {
                objAaT5 = AGH.A0D(new HxE(str, strA0t2), new HxE(str2, strA01), new HxE(str3, strA012));
                bfm.Ai0(objAaT5);
            }
            m119ScrollableLinkTextD30ufTU(apQ, (Map) objAaT5, i, function0, bRg2, bfm, (iA0D << 6) & 65408, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraDisclosureScreenKt$LegalText$1(i, function0, bRg2, i2, i3);
        }
    }

    public static final void MuseAppDisclosureLegalText(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c107102;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(1635191718);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraDisclosureViewModel.Factory factory = new AuraDisclosureViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            C1BO c1boA02 = C2CK.A02(bfm, ((AuraDisclosureViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(AuraDisclosureViewModel.class))).uiState);
            AuraDisclosureViewModel.SubscriptionLegalText subscriptionLegalText = ((AuraDisclosureViewModel.UiState) c1boA02.getValue()).subscriptionLegalText;
            if (subscriptionLegalText != null && z) {
                bfm.AgE(477914835);
                m117DynamicLegalTextD30ufTU(subscriptionLegalText.text, subscriptionLegalText.links, 5, function0, bRg2, bfm, AnonymousClass003.A07(iA0n << 6, HatchTextLink.$stable << 3), 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    c107102 = new C107091(z, function0, bRg2, i, i2);
                    bBbAAc.A06 = c107102;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 478138748);
            m116DisclosureLegalText5TldRvM(((AuraDisclosureViewModel.UiState) c1boA02.getValue()).tosMetadata, 5, bRg2, function0, bfm, (iA0n & 896) | ((iA0n << 6) & 7168), 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c107102 = new C107102(z, function0, bRg2, i, i2);
            bBbAAc.A06 = c107102;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ScrollableLinkText-D30ufTU, reason: not valid java name */
    public static final void m119ScrollableLinkTextD30ufTU(ApQ apQ, Map<String, String> map, int i, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(661076301);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, apQ) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(map, bfm, i2) ? 1 : 0);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, i);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i4 = i3 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, C06G.A0S(bfm), null, null, null, null, null, null, null, null, i, 0, 0, 16744446, AnonymousClass002.A0c(bfm).secondaryText, 0L, 0L, 0L);
            float fRememberSixLineHeight = rememberSixLineHeight(c1822ArmA00, bfm, 0);
            final C0jP c0jPRememberHatchLinkUriHandler = HatchLinkTextKt.rememberHatchLinkUriHandler(map, null, bfm, (iA0d >> 3) & 14, 2);
            final MutableState mutableStateA00 = C1er.A00(bfm, function0);
            boolean zA65 = bfm.A65(c0jPRememberHatchLinkUriHandler);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new C0jP() { // from class: com.facebook.aura.activation.view.AuraDisclosureScreenKt$ScrollableLinkText$uriHandler$1$1
                    @Override // X.C0jP
                    public void openUri(String str) {
                        C7384Etj.A0Y(str, 0);
                        C1BO.A0D(mutableStateA00);
                        c0jPRememberHatchLinkUriHandler.openUri(str);
                    }
                };
                bfm.Ai0(objAaT);
            }
            AnonymousClass006.A15(bfm, Am0.A0G.A04(objAaT), new AuraDisclosureScreenKt$ScrollableLinkText$1(apQ, bRg2, fRememberSixLineHeight, c1822ArmA00), 735845901);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraDisclosureScreenKt$ScrollableLinkText$2(apQ, map, i, function0, bRg2, i2, i3);
        }
    }

    public static final void DisclosureScrollFade(C1110AYw c1110AYw, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c107042;
        bfm.AgG(-1141892430);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1110AYw) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = AnonymousClass003.A0R(bfm, new AuraDisclosureScreenKt$DisclosureScrollFade$hasMoreBelow$2$1(c1110AYw));
            }
            if (!C1BO.A0F((C1BO) objAaT)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c107042 = new AnonymousClass1(c1110AYw, bRg, i, i2);
                    bBbAAc.A06 = c107042;
                }
                return;
            }
            long jA0B = C06G.A0B(bfm);
            boolean zA64 = bfm.A64(jA0B);
            Object objAaT2 = bfm.AaT();
            if (zA64 || objAaT2 == C78N.A00) {
                objAaT2 = C1EQ.A01(AnonymousClass004.A17(new B6A(B6A.A06), jA0B), 0.0f, Float.POSITIVE_INFINITY);
                bfm.Ai0(objAaT2);
            }
            C1b8.A05(bfm, C10G.A04(AnonymousClass001.A0R(bRg), AuraDimensKt.SpacingXlarge), (C1EQ) objAaT2);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c107042 = new C107042(c1110AYw, bRg, i, i2);
            bBbAAc.A06 = c107042;
        }
    }

    public static final List<HatchDisclosureSection> rememberDisclosureSections(HatchTosMetadata hatchTosMetadata, BFM bfm, int i) {
        List<HatchDisclosureSection> list;
        bfm.AgE(-1360952146);
        if (hatchTosMetadata != null && (list = hatchTosMetadata.disclosureSections) != null && !list.isEmpty()) {
            AnonymousClass002.A19(bfm);
            return list;
        }
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12024d);
        String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12024c);
        String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120248);
        String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120247);
        boolean zA1T = AnonymousClass005.A1T(bfm, strA0v, strA012, strA013, bfm.A65(strA01));
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            objAaT = Arrays.asList(new HatchDisclosureSection(strA01, strA0v, "wand"), new HatchDisclosureSection(strA012, strA013, "lock"));
            bfm.Ai0(objAaT);
        }
        List<HatchDisclosureSection> list2 = (List) objAaT;
        AnonymousClass001.A1D(bfm);
        return list2;
    }
}
