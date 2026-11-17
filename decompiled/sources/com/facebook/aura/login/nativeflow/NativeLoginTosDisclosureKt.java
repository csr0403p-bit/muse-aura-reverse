package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C1515AkP;
import X.C1822Arm;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.linktext.HatchClauseRun;
import com.facebook.aura.linktext.HatchInlineLinkTextKt;
import com.facebook.aura.login.nativeflow.HatchTosGroup;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginTosDisclosureKt {
    public static final String TOKEN_POLICIES = "policies";
    public static final String TOKEN_TERMS = "terms";
    public static final String TOS_KIND_DISCLOSURE = "disclosure";
    public static final String TOS_KIND_DOCUMENTS = "documents";
    public static final String TOS_KIND_URL = "url";

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt$NativeLoginTosAccountPickerSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $accounts;
        public final /* synthetic */ G0U<NativeLoginAccountUiModel, Unit> $onSelect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AHD<NativeLoginAccountUiModel> ahd, G0U<? super NativeLoginAccountUiModel, Unit> g0u) {
            super(3);
            this.$accounts = ahd;
            this.$onSelect = g0u;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            int iA0d;
            C7384Etj.A0Y(c07c, 0);
            if ((i & 6) == 0) {
                iA0d = AnonymousClass004.A0d(bfm, c07c) | i;
            } else {
                iA0d = i;
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onSelect, bfm.A67(this.$accounts));
                AHD<NativeLoginAccountUiModel> ahd = this.$accounts;
                G0U<NativeLoginAccountUiModel, Unit> g0u = this.$onSelect;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new NativeLoginTosDisclosureKt$NativeLoginTosAccountPickerSheet$1$1$1(ahd, g0u);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A0q(c07c, (G0U) objAaT, bfm, iA0d & 14);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt$NativeLoginTosAccountPickerSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $accounts;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<NativeLoginAccountUiModel, Unit> $onSelect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<NativeLoginAccountUiModel> ahd, G0U<? super NativeLoginAccountUiModel, Unit> g0u, Function0<Unit> function0, int i) {
            super(2);
            this.$accounts = ahd;
            this.$onSelect = g0u;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginTosDisclosureKt.NativeLoginTosAccountPickerSheet(this.$accounts, this.$onSelect, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt$NativeLoginTosDocumentsSheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C125781 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchTosGroup.Documents $group;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125781(HatchTosGroup.Documents documents, Context context) {
            super(3);
            this.$group = documents;
            this.$context = context;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            int iA0d;
            C7384Etj.A0Y(c07c, 0);
            if ((i & 6) == 0) {
                iA0d = AnonymousClass004.A0d(bfm, c07c) | i;
            } else {
                iA0d = i;
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$context, bfm.A67(this.$group));
                HatchTosGroup.Documents documents = this.$group;
                Context context = this.$context;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new NativeLoginTosDisclosureKt$NativeLoginTosDocumentsSheet$1$1$1(documents, context);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A0q(c07c, (G0U) objAaT, bfm, iA0d & 14);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt$NativeLoginTosDocumentsSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C125792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $fallbackTitle;
        public final /* synthetic */ HatchTosGroup.Documents $group;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125792(HatchTosGroup.Documents documents, String str, Function0<Unit> function0, int i) {
            super(2);
            this.$group = documents;
            this.$fallbackTitle = str;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginTosDisclosureKt.NativeLoginTosDocumentsSheet(this.$group, this.$fallbackTitle, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt$NativeLoginTosProseBody$1, reason: invalid class name and case insensitive filesystem */
    public final class C125801 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AHD<HatchTosBodyRun> $runs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125801(String str, AHD<HatchTosBodyRun> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$body = str;
            this.$runs = ahd;
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
            NativeLoginTosDisclosureKt.NativeLoginTosProseBody(this.$body, this.$runs, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt$NativeLoginTosProseBody$2, reason: invalid class name and case insensitive filesystem */
    public final class C125812 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $body;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AHD<HatchTosBodyRun> $runs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125812(String str, AHD<HatchTosBodyRun> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$body = str;
            this.$runs = ahd;
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
            NativeLoginTosDisclosureKt.NativeLoginTosProseBody(this.$body, this.$runs, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt$NativeLoginTosProseSheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C125821 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ HatchTosGroup.Prose $group;
        public final /* synthetic */ HatchTosProseVariant $variant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125821(NativeLoginAccountUiModel nativeLoginAccountUiModel, HatchTosProseVariant hatchTosProseVariant, HatchTosGroup.Prose prose) {
            super(3);
            this.$account = nativeLoginAccountUiModel;
            this.$variant = hatchTosProseVariant;
            this.$group = prose;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            String str;
            AHD<HatchTosBodyRun> ahd;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                if (this.$account != null) {
                    bfm.AgE(1389590175);
                    NativeLoginProfilesSheetKt.NativeLoginProfilesCard(this.$account, null, bfm, NativeLoginAccountUiModel.$stable, 2);
                    C01N.A06(bfm, BRg.A00);
                } else {
                    bfm.AgE(1389687236);
                }
                AnonymousClass001.A1D(bfm);
                HatchTosProseVariant hatchTosProseVariant = this.$variant;
                if (hatchTosProseVariant != null) {
                    str = hatchTosProseVariant.body;
                    ahd = hatchTosProseVariant.bodyRuns;
                } else {
                    HatchTosGroup.Prose prose = this.$group;
                    str = prose.body;
                    ahd = prose.bodyRuns;
                }
                NativeLoginTosDisclosureKt.NativeLoginTosProseBody(str, ahd, null, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt$NativeLoginTosProseSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C125832 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ String $fallbackTitle;
        public final /* synthetic */ HatchTosGroup.Prose $group;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125832(HatchTosGroup.Prose prose, String str, Function0<Unit> function0, NativeLoginAccountUiModel nativeLoginAccountUiModel, int i) {
            super(2);
            this.$group = prose;
            this.$fallbackTitle = str;
            this.$onDismiss = function0;
            this.$account = nativeLoginAccountUiModel;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginTosDisclosureKt.NativeLoginTosProseSheet(this.$group, this.$fallbackTitle, this.$onDismiss, this.$account, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt$NativeLoginTosSheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C125841 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C125841(G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w) {
            super(3);
            this.$content = g0w;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BRg bRgA07 = C3U4.A07(BRg.A00, AuraDimensKt.SpacingMedium);
                G0W<C07C, BFM, Integer, Unit> g0w = this.$content;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA07);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                AnonymousClass004.A1B(bbi, C90l.A00, bfm, g0w, 6);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt$NativeLoginTosSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C125852 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $content;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C125852(String str, String str2, Function0<Unit> function0, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, int i) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$onDismiss = function0;
            this.$content = g0w;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginTosDisclosureKt.NativeLoginTosSheet(this.$title, this.$subtitle, this.$onDismiss, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final HatchTosProseVariant variantFor(HatchTosGroup.Prose prose, NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        Object next;
        C7384Etj.A0Y(prose, 0);
        Object obj = null;
        if (nativeLoginAccountUiModel == null || prose.variants.isEmpty()) {
            return null;
        }
        Iterator it = prose.variants.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            HatchTosProseVariant hatchTosProseVariant = (HatchTosProseVariant) next;
            if (hatchTosProseVariant.isF3 == nativeLoginAccountUiModel.isF3 && C7384Etj.areEqual(hatchTosProseVariant.sourceApp, nativeLoginAccountUiModel.sourceApp)) {
                break;
            }
        }
        HatchTosProseVariant hatchTosProseVariant2 = (HatchTosProseVariant) next;
        if (hatchTosProseVariant2 != null) {
            return hatchTosProseVariant2;
        }
        Iterator it2 = prose.variants.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            HatchTosProseVariant hatchTosProseVariant3 = (HatchTosProseVariant) next2;
            if (hatchTosProseVariant3.isF3 == nativeLoginAccountUiModel.isF3 && hatchTosProseVariant3.sourceApp == null) {
                obj = next2;
                break;
            }
        }
        return (HatchTosProseVariant) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* renamed from: NativeLoginTosDisclosure-gm0gx_Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1307NativeLoginTosDisclosuregm0gx_Q(com.facebook.aura.login.nativeflow.HatchTosDisclosure r35, X.BRg r36, int r37, boolean r38, X.G0U<? super java.lang.String, kotlin.Unit> r39, X.AHD<com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel> r40, X.BFM r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginTosDisclosureKt.m1307NativeLoginTosDisclosuregm0gx_Q(com.facebook.aura.login.nativeflow.HatchTosDisclosure, X.BRg, int, boolean, X.G0U, X.AHD, X.BFM, int, int):void");
    }

    public static final void NativeLoginTosProseBody(String str, AHD<HatchTosBodyRun> ahd, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c125812;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(str, ahd);
        bfm.AgG(1081631266);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, ahd);
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
            if (ahd.isEmpty()) {
                C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, 2032786314).bodyRegular;
                AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C06G.A0C(bfm), c1822Arm, null, null, null, zA1b, zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b ? 1 : 0, null, null, null, bfm, (iA0d & 14) | ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), zA1b ? 1 : 0, 16368);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    c125812 = new C125801(str, ahd, bRg2, i, i2);
                    bBbAAc.A06 = c125812;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 2032961216);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            long jA07 = C06G.A07(bfm);
            boolean zA1W = AnonymousClass002.A1W(bfm, contextA0H, bfm.A65(ahd), bfm.A64(jA07));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                for (HatchTosBodyRun hatchTosBodyRun : ahd) {
                    arrayListA0i.add(new HatchClauseRun(hatchTosBodyRun.text, hatchTosBodyRun.url));
                }
                objAaT = HatchInlineLinkTextKt.m1186buildClauseTextbw27NRU(arrayListA0i, jA07, new NativeLoginTosDisclosureKt$NativeLoginTosProseBody$linkedBody$1$2(contextA0H));
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2640AuraTextVmYn7U0((ApQ) objAaT, bRg2, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, 0L, zA1b, zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b ? 1 : 0, null, null, null, bfm, (iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, zA1b ? 1 : 0, 32752);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c125812 = new C125812(str, ahd, bRg2, i, i2);
            bBbAAc.A06 = c125812;
        }
    }

    public static final int tosSheetTitleRes(String str) {
        return TOKEN_TERMS.equals(str) ? R.string._name_removed__res_0x7f120527 : TOKEN_POLICIES.equals(str) ? R.string._name_removed__res_0x7f120526 : R.string._name_removed__res_0x7f120525;
    }

    public static final void NativeLoginTosAccountPickerSheet(AHD<NativeLoginAccountUiModel> ahd, G0U<? super NativeLoginAccountUiModel, Unit> g0u, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-98240996);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ahd, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            NativeLoginTosSheet(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120523), AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120522), function0, B1V.A00(bfm, new AnonymousClass1(ahd, g0u), -715237417), bfm, (iA05 & 896) | 3072);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(ahd, g0u, function0, i);
        }
    }

    public static final void NativeLoginTosDocumentsSheet(HatchTosGroup.Documents documents, String str, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(1799937959);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, documents) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String str2 = documents.title;
            if (str2 == null) {
                str2 = str;
            }
            String strA01 = documents.subtitle;
            if (strA01 == null) {
                bfm.AgE(-1131432760);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120524);
            } else {
                bfm.AgE(-1131433318);
            }
            AnonymousClass001.A1D(bfm);
            NativeLoginTosSheet(str2, strA01, function0, B1V.A00(bfm, new C125781(documents, contextA0H), -407157556), bfm, (iA0T & 896) | 3072);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125792(documents, str, function0, i);
        }
    }

    public static final void NativeLoginTosProseSheet(HatchTosGroup.Prose prose, String str, Function0<Unit> function0, NativeLoginAccountUiModel nativeLoginAccountUiModel, BFM bfm, int i) {
        String str2;
        bfm.AgG(1561649049);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, prose) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass002.A00(AnonymousClass004.A1a(nativeLoginAccountUiModel, bfm, i) ? 1 : 0);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            boolean zA65 = bfm.A65(prose);
            if ((iA0T & 7168) == 2048 || ((iA0T & 4096) != 0 && bfm.A65(nativeLoginAccountUiModel))) {
                z = true;
            }
            boolean z2 = zA65 | z;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = variantFor(prose, nativeLoginAccountUiModel);
                bfm.Ai0(objAaT);
            }
            HatchTosProseVariant hatchTosProseVariant = (HatchTosProseVariant) objAaT;
            if ((hatchTosProseVariant == null || (str2 = hatchTosProseVariant.title) == null) && (str2 = prose.title) == null) {
                str2 = str;
            }
            NativeLoginTosSheet(str2, prose.subtitle, function0, B1V.A00(bfm, new C125821(nativeLoginAccountUiModel, hatchTosProseVariant, prose), 1396188542), bfm, (iA0T & 896) | 3072);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125832(prose, str, function0, nativeLoginAccountUiModel, i);
        }
    }

    public static final void NativeLoginTosSheet(String str, String str2, Function0<Unit> function0, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i) {
        bfm.AgG(-1114985270);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(null, null, function0, RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, null, false, bfm, 0, 7), null, new AuraBottomSheetHeaderConfig(str, str2, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), null, null, null, null, false, false, false, B1V.A00(bfm, new C125841(g0w), -418224153), bfm, iA0d & 896, 3072, 8147);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125852(str, str2, function0, g0w, i);
        }
    }
}
