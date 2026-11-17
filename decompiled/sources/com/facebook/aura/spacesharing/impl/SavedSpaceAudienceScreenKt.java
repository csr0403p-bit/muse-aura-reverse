package com.facebook.aura.spacesharing.impl;

import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60R;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.library.repo.ArtifactAudienceVisibility;
import com.facebook.aura.library.repo.ArtifactSharePermission;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.spacesharing.impl.SavedSpaceAudience;
import com.facebook.aura.spacesharing.impl.SavedSpaceAudienceRow;
import com.facebook.aura.spacesharing.impl.SavedSpaceAudienceViewModel;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SavedSpaceAudienceScreenKt {

    /* renamed from: com.facebook.aura.spacesharing.impl.SavedSpaceAudienceScreenKt$SavedSpaceAccess$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ArtifactAudienceVisibility $visibility;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ArtifactAudienceVisibility artifactAudienceVisibility, BRg bRg, int i, int i2) {
            super(2);
            this.$visibility = artifactAudienceVisibility;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SavedSpaceAudienceScreenKt.SavedSpaceAccess(this.$visibility, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SavedSpaceAudienceScreenKt$SavedSpaceAudienceRowItem$2, reason: invalid class name and case insensitive filesystem */
    public final class C139752 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ SavedSpaceAudienceRow $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139752(SavedSpaceAudienceRow savedSpaceAudienceRow, BRg bRg, int i, int i2) {
            super(2);
            this.$row = savedSpaceAudienceRow;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SavedSpaceAudienceScreenKt.SavedSpaceAudienceRowItem(this.$row, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SavedSpaceAudienceScreenKt$SavedSpaceAudienceScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C139762 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $shareUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139762(String str) {
            super(2);
            this.$shareUrl = str;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                SpaceSharingComponentsKt.SpaceSharingCopyLinkButton(this.$shareUrl, AbstractC07539Wl.A00(BRg.A00, "hatch-saved-space-audience-copy"), bfm, 48, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SavedSpaceAudienceScreenKt$SavedSpaceAudienceScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<SavedSpaceAudienceState> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C1BO<SavedSpaceAudienceState> c1bo) {
            super(2);
            this.$state$delegate = c1bo;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                SpaceSharingComponentsKt.SpaceSharingIcon(this.$state$delegate.getValue().iconUrl, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SavedSpaceAudienceScreenKt$SavedSpaceAudienceScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $shareUrl;
        public final /* synthetic */ C1BO<SavedSpaceAudienceState> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, Context context, C1BO<SavedSpaceAudienceState> c1bo) {
            super(4);
            this.$shareUrl = str;
            this.$context = context;
            this.$state$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2204invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2204invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            SavedSpaceAudience.Known known;
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            String str = this.$shareUrl;
            Context context = this.$context;
            C1BO<SavedSpaceAudienceState> c1bo = this.$state$delegate;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            SpaceSharingComponentsKt.SpaceSharingTitle(c1bo.getValue().title, C3U4.A0B(bs0, 20.0f, 0.0f), bfm, 48, 0);
            SavedSpaceAudience savedSpaceAudience = c1bo.getValue().audience;
            if (C7384Etj.areEqual(savedSpaceAudience, SavedSpaceAudience.Loading.INSTANCE)) {
                bfm.AgE(1710562666);
                SpaceSharingComponentsKt.SharingLoading(c90l.AiP(bs0, 1.0f, true), bfm, 0, 0);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1710629192);
                BRg bRgA0B = C3U4.A0B(AnonymousClass005.A0T(bfm, c90l.AiP(bs0, 1.0f, true)), 20.0f, 0.0f);
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0B);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                SavedSpaceAudienceScreenKt.SavedSpaceAccess((!(savedSpaceAudience instanceof SavedSpaceAudience.Known) || (known = (SavedSpaceAudience.Known) savedSpaceAudience) == null) ? null : known.visibility, null, bfm, 0, 2);
                SavedSpaceAudienceScreenKt.SavedSpaceCollaborators(savedSpaceAudience, null, bfm, 0, 2);
                C01N.A04(bfm, bbi, bs0, 20.0f, true);
                BBI.A0R(bbi, false);
            }
            boolean zA1X = AnonymousClass002.A1X(str);
            boolean zA1J = AnonymousClass003.A1J(bfm, str, context);
            Object objAaT = bfm.AaT();
            if (zA1J || objAaT == C78N.A00) {
                objAaT = new SavedSpaceAudienceScreenKt$SavedSpaceAudienceScreen$4$1$2$1(str, context);
                bfm.Ai0(objAaT);
            }
            SpaceSharingComponentsKt.SpaceSharingShareLinkButton(zA1X, (Function0) objAaT, null, bfm, 0, 4);
            C01N.A08(bfm, bs0, f2);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SavedSpaceAudienceScreenKt$SavedSpaceAudienceScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $shortcode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$shortcode = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SavedSpaceAudienceScreenKt.SavedSpaceAudienceScreen(this.$shortcode, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SavedSpaceAudienceScreenKt$SavedSpaceCollaborators$2, reason: invalid class name and case insensitive filesystem */
    public final class C139772 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SavedSpaceAudience $audience;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139772(SavedSpaceAudience savedSpaceAudience, BRg bRg, int i, int i2) {
            super(2);
            this.$audience = savedSpaceAudience;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SavedSpaceAudienceScreenKt.SavedSpaceCollaborators(this.$audience, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SavedSpaceAudienceScreenKt$SavedSpaceNote$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SavedSpaceAudienceScreenKt.SavedSpaceNote(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SavedSpaceAudienceScreenKt$SavedSpaceSelfRow$1, reason: invalid class name and case insensitive filesystem */
    public final class C139781 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ SavedSpaceAudienceRow.Self $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139781(SavedSpaceAudienceRow.Self self, BRg bRg, int i, int i2) {
            super(2);
            this.$row = self;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SavedSpaceAudienceScreenKt.SavedSpaceSelfRow(this.$row, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SavedSpaceAudienceScreenKt$SavedSpaceStatus$2, reason: invalid class name and case insensitive filesystem */
    public final class C139792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139792(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SavedSpaceAudienceScreenKt.SavedSpaceStatus(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SavedSpaceSelfRow(SavedSpaceAudienceRow.Self self, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1588877393);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(self, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            SpaceSharingComponentsKt.CollaboratorRow(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121003), self.photoUrl, bRg2, permissionLabel(self.permission, bfm, 0), false, null, bfm, (iA05 << 3) & 896, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139781(self, bRg2, i, i2);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArtifactSharePermission.values().length];
            try {
                AnonymousClass002.A13(ArtifactSharePermission.VIEW, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ArtifactSharePermission.USE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void SavedSpaceAccess(ArtifactAudienceVisibility artifactAudienceVisibility, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(843034405);
        int iA0D = (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(artifactAudienceVisibility)) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0D |= 48;
        } else if ((i & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120fec);
            BS0 bs0 = BRg.A00;
            SpaceSharingComponentsKt.InviteHeading(strA01, C3U4.A0C(bs0, 0.0f, 16.0f, 0.0f, 8.0f), bfm, 48, 0);
            C1062ATq c1062ATq = C10G.A02;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0F = C60R.A0F(bfm, c1062ATq, auraTheme.getShapes(bfm, 6).card, auraTheme);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0F);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            boolean zA1Z = AnonymousClass002.A1Z(artifactAudienceVisibility, ArtifactAudienceVisibility.RESTRICTED);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = SavedSpaceAudienceScreenKt$SavedSpaceAccess$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            SpaceSharingComponentsKt.InviteAccessOption(R.string._name_removed__res_0x7f120ff7, R.drawable.lock_outline_24_wght500, zA1Z, false, null, true, (Function0) objAaT, bfm, 1772544, 16);
            AuraDividerKt.AuraDivider(C3U4.A0B(bs0, 16.0f, 0.0f), null, false, bfm, 6, 6);
            boolean z = artifactAudienceVisibility == ArtifactAudienceVisibility.PUBLIC;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = SavedSpaceAudienceScreenKt$SavedSpaceAccess$1$1$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            SpaceSharingComponentsKt.InviteAccessOption(R.string._name_removed__res_0x7f120ff5, R.drawable.globe_wght400_outline_24, z, false, null, true, (Function0) objAaT2, bfm, 1772544, 16);
            BBI.A0R(bbi, true);
            SavedSpaceNote(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ff4), C3U4.A0C(bs0, 0.0f, 8.0f, 0.0f, 0.0f), bfm, 48, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(artifactAudienceVisibility, bRg2, i, i2);
        }
    }

    public static final void SavedSpaceAudienceRowItem(SavedSpaceAudienceRow savedSpaceAudienceRow, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        String str;
        String strPermissionLabel;
        BRg bRg2 = bRg;
        bfm.AgG(1190252761);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(savedSpaceAudienceRow, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (savedSpaceAudienceRow instanceof SavedSpaceAudienceRow.Owner) {
                bfm.AgE(-429833824);
                SavedSpaceAudienceRow.Owner owner = (SavedSpaceAudienceRow.Owner) savedSpaceAudienceRow;
                strA01 = owner.name;
                if (strA01 == null) {
                    bfm.AgE(1371609048);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ff1);
                } else {
                    bfm.AgE(1371608676);
                }
                AnonymousClass001.A1D(bfm);
                str = owner.photoUrl;
                strPermissionLabel = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ff3);
            } else if (savedSpaceAudienceRow instanceof SavedSpaceAudienceRow.Self) {
                bfm.AgE(1371617177);
                SavedSpaceSelfRow((SavedSpaceAudienceRow.Self) savedSpaceAudienceRow, bRg2, bfm, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | SavedSpaceAudienceRow.Self.$stable | (iA05 & 14), 0);
                AnonymousClass001.A1D(bfm);
            } else {
                if (!(savedSpaceAudienceRow instanceof SavedSpaceAudienceRow.Recipient)) {
                    throw AnonymousClass005.A0k(bfm, 1371606270);
                }
                bfm.AgE(-429451067);
                SavedSpaceAudienceRow.Recipient recipient = (SavedSpaceAudienceRow.Recipient) savedSpaceAudienceRow;
                strA01 = recipient.name;
                if (strA01 == null) {
                    bfm.AgE(1371621400);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ff1);
                } else {
                    bfm.AgE(1371621028);
                }
                BBI bbiA07 = C3cG.A07(bfm);
                str = recipient.photoUrl;
                ArtifactSharePermission artifactSharePermission = recipient.permission;
                if (artifactSharePermission == null) {
                    bfm.AgE(-429270803);
                    BBI.A0R(bbiA07, false);
                    strPermissionLabel = null;
                } else {
                    bfm.AgE(-429270802);
                    strPermissionLabel = permissionLabel(artifactSharePermission, bfm, 0);
                    BBI.A0R(bbiA07, false);
                }
            }
            SpaceSharingComponentsKt.CollaboratorRow(strA01, str, bRg2, strPermissionLabel, false, null, bfm, (iA05 << 3) & 896, 48);
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139752(savedSpaceAudienceRow, bRg2, i, i2);
        }
    }

    public static final void SavedSpaceAudienceScreen(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(127893832);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, rememberSavedSpaceAudienceModel(str, bfm, iA0d & 14).state);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String str2 = ((SavedSpaceAudienceState) c1boA02.getValue()).shareUrl;
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            BRg bRgA00 = AbstractC07539Wl.A00(bRg2, "hatch-saved-space-audience-screen");
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206ed);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new SavedSpaceAudienceScreenKt$SavedSpaceAudienceScreen$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, bRgA00, null, 0L, null, null, (Function0) objAaT, null, false, false, R.drawable.x_wght400_outline_24, strA01, null, null, null, null, B1V.A00(bfm, new C139762(str2), -945152875), 0L, 0L, null, 4.0f, null, null, null, 0, B1V.A00(bfm, new AnonymousClass3(c1boA02), 1739735219), null, null, false, B1V.A00(bfm, new AnonymousClass4(str2, contextA0H, c1boA02), -244303603), bfm, 6, 1572864, 805502982, 502199228);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(str, bRg2, i, i2);
        }
    }

    public static final void SavedSpaceNote(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1672764822);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 126, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, i, i2);
        }
    }

    public static final void SavedSpaceStatus(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2105393962);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA04 = C3U4.A04(bRg2, 16.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SavedSpaceAudienceScreenKt$SavedSpaceStatus$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA04, objAaT, false), jA07, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139792(str, bRg2, i, i2);
        }
    }

    public static final void SavedSpaceCollaborators(SavedSpaceAudience savedSpaceAudience, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        bfm.AgG(-1085460135);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(savedSpaceAudience, bfm, i) ? 1 : 0) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i4 != 0) {
                bRg = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ff2);
            BS0 bs0 = BRg.A00;
            SpaceSharingComponentsKt.InviteHeading(strA01, C3U4.A0C(bs0, 0.0f, 20.0f, 0.0f, 8.0f), bfm, 48, 0);
            if (savedSpaceAudience instanceof SavedSpaceAudience.Known) {
                bfm.AgE(-511769678);
                bfm.AgE(-709244840);
                SavedSpaceAudience.Known known = (SavedSpaceAudience.Known) savedSpaceAudience;
                Iterator it = known.rows.iterator();
                while (it.hasNext()) {
                    SavedSpaceAudienceRowItem((SavedSpaceAudienceRow) it.next(), null, bfm, 0, 2);
                }
                BBI.A0R(bbi, false);
                if (known.viewerRoleKnown) {
                    bfm.AgE(-511499885);
                } else {
                    bfm.AgE(-511669021);
                    SavedSpaceNote(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121002), C3U4.A0C(bs0, 0.0f, 16.0f, 0.0f, 0.0f), bfm, 48, 0);
                }
                BBI.A0R(bbi, false);
            } else {
                if (C7384Etj.areEqual(savedSpaceAudience, SavedSpaceAudience.Revoked.INSTANCE)) {
                    bfm.AgE(-709234820);
                    i3 = R.string._name_removed__res_0x7f120fed;
                } else {
                    if (!C7384Etj.areEqual(savedSpaceAudience, SavedSpaceAudience.Unavailable.INSTANCE) && !C7384Etj.areEqual(savedSpaceAudience, SavedSpaceAudience.Loading.INSTANCE)) {
                        throw AnonymousClass003.A0k(bfm, bbi, -709246769);
                    }
                    bfm.AgE(-709229632);
                    i3 = R.string._name_removed__res_0x7f120fee;
                }
                SavedSpaceStatus(AbstractC2271BQs.A01(bfm, i3), null, bfm, 0, 2);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139772(savedSpaceAudience, bRg, i, i2);
        }
    }

    public static final /* synthetic */ SavedSpaceAudienceState access$SavedSpaceAudienceScreen$lambda$0(C1BO c1bo) {
        return (SavedSpaceAudienceState) c1bo.getValue();
    }

    public static final String permissionLabel(ArtifactSharePermission artifactSharePermission, BFM bfm, int i) {
        int i2;
        int iOrdinal = artifactSharePermission.ordinal();
        if (iOrdinal == 0) {
            i2 = R.string._name_removed__res_0x7f120ff0;
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            i2 = R.string._name_removed__res_0x7f120fef;
        }
        return AbstractC2271BQs.A01(bfm, i2);
    }

    public static final SavedSpaceAudienceViewModel rememberSavedSpaceAudienceModel(String str, BFM bfm, int i) {
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        HatchGatewayPrefsStore hatchGatewayPrefsStoreA0D = C3cG.A0D(abstractC3358CGzA0h);
        C1BO c1boA02 = C2CK.A02(bfm, hatchGatewayPrefsStoreA0D.hatcheryVmIdFlow);
        String strA0l = FGI.A0l("saved-space-audience:", ((CH0) abstractC3358CGzA0h).A01, ":", C1BO.A08(c1boA02), ":", hatchGatewayPrefsStoreA0D.getGatewayUrl(), ":", str);
        SavedSpaceAudienceViewModel.Factory factory = new SavedSpaceAudienceViewModel.Factory(abstractC3358CGzA0h, str);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            return (SavedSpaceAudienceViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), SavedSpaceAudienceViewModel.class, strA0l);
        }
        throw AnonymousClass001.A0o();
    }
}
