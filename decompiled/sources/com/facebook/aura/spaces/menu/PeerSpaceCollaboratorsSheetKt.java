package com.facebook.aura.spaces.menu;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.ARD;
import X.AbstractC07539Wl;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BPg;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0861A6i;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C19U;
import X.C1BO;
import X.C1D8;
import X.C1DG;
import X.C1YL;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.CH0;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.navigation.key.PeerSpaceCollaboratorsSheetKey;
import com.facebook.aura.spaces.menu.PeerSpaceMembersState;
import com.facebook.aura.spaces.menu.PeerSpaceMembersViewModel;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class PeerSpaceCollaboratorsSheetKt {

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceCollaboratorsSheetKt$PeerSpaceCollaboratorsHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $count;
        public final /* synthetic */ PeerSpaceCollaboratorsSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PeerSpaceCollaboratorsSheetKey peerSpaceCollaboratorsSheetKey, Integer num, BRg bRg, int i, int i2) {
            super(2);
            this.$key = peerSpaceCollaboratorsSheetKey;
            this.$count = num;
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
            PeerSpaceCollaboratorsSheetKt.PeerSpaceCollaboratorsHeader(this.$key, this.$count, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceCollaboratorsSheetKt$PeerSpaceCollaboratorsLoading$2, reason: invalid class name and case insensitive filesystem */
    public final class C138912 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138912(BRg bRg, int i, int i2) {
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
            PeerSpaceCollaboratorsSheetKt.PeerSpaceCollaboratorsLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceCollaboratorsSheetKt$PeerSpaceCollaboratorsMessage$2, reason: invalid class name and case insensitive filesystem */
    public final class C138922 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138922(String str, BRg bRg, int i, int i2) {
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
            PeerSpaceCollaboratorsSheetKt.PeerSpaceCollaboratorsMessage(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceCollaboratorsSheetKt$PeerSpaceCollaboratorsSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ PeerSpaceCollaboratorsSheetKey $key;
        public final /* synthetic */ C1BO<PeerSpaceMembersState> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PeerSpaceCollaboratorsSheetKey peerSpaceCollaboratorsSheetKey, C1BO<? extends PeerSpaceMembersState> c1bo) {
            super(3);
            this.$key = peerSpaceCollaboratorsSheetKey;
            this.$state$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            Integer numValueOf;
            PeerSpaceMembersState.Loaded loaded;
            AHD<PeerSpaceMember> ahd;
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BS0 bs0 = BRg.A00;
                BRg bRgA0B = C3U4.A0B(C10G.A02, 16.0f, 8.0f);
                PeerSpaceCollaboratorsSheetKey peerSpaceCollaboratorsSheetKey = this.$key;
                C1BO<PeerSpaceMembersState> c1bo = this.$state$delegate;
                InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
                C3TH c3th = C2VU.A02;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                PeerSpaceMembersState value = c1bo.getValue();
                if ((value instanceof PeerSpaceMembersState.Loaded) && (loaded = (PeerSpaceMembersState.Loaded) value) != null && (ahd = loaded.members) != null) {
                    numValueOf = Integer.valueOf(ahd.size());
                } else {
                    numValueOf = null;
                }
                PeerSpaceCollaboratorsSheetKt.PeerSpaceCollaboratorsHeader(peerSpaceCollaboratorsSheetKey, numValueOf, null, bfm, 0, 4);
                PeerSpaceMembersState value2 = c1bo.getValue();
                if (C7384Etj.areEqual(value2, PeerSpaceMembersState.Loading.INSTANCE)) {
                    bfm.AgE(1561657006);
                    PeerSpaceCollaboratorsSheetKt.PeerSpaceCollaboratorsLoading(null, bfm, 0, 1);
                    BBI.A0R(bbi, false);
                } else if (C7384Etj.areEqual(value2, PeerSpaceMembersState.Failed.INSTANCE)) {
                    bfm.AgE(1561659748);
                    PeerSpaceCollaboratorsSheetKt.PeerSpaceCollaboratorsMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120df4), null, bfm, 0, 2);
                    BBI.A0R(bbi, false);
                } else if (C7384Etj.areEqual(value2, PeerSpaceMembersState.Unavailable.INSTANCE)) {
                    bfm.AgE(1561664320);
                    PeerSpaceCollaboratorsSheetKt.PeerSpaceCollaboratorsMessage(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120df6), null, bfm, 0, 2);
                    BBI.A0R(bbi, false);
                } else if (value2 instanceof PeerSpaceMembersState.Loaded) {
                    bfm.AgE(1561668740);
                    BRg bRgA04 = C3U4.A04(bs0, 8.0f);
                    InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA012 = AxM.A01(bfm, bRgA04);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                    BPg.A02(bfm, akqA042, g0v2);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA012, g0vA0u);
                    bfm.AgE(336189318);
                    Iterator it = ((PeerSpaceMembersState.Loaded) value2).members.iterator();
                    while (it.hasNext()) {
                        PeerSpaceCollaboratorsSheetKt.PeerSpaceMemberRow((PeerSpaceMember) it.next(), null, bfm, PeerSpaceMember.$stable, 2);
                    }
                    AnonymousClass002.A0z(bbi, false, true);
                } else {
                    throw AnonymousClass003.A0k(bfm, bbi, 1561655294);
                }
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceCollaboratorsSheetKt$PeerSpaceCollaboratorsSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C138932 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PeerSpaceCollaboratorsSheetKey $key;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138932(PeerSpaceCollaboratorsSheetKey peerSpaceCollaboratorsSheetKey, BRg bRg, int i, int i2) {
            super(2);
            this.$key = peerSpaceCollaboratorsSheetKey;
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
            PeerSpaceCollaboratorsSheetKt.PeerSpaceCollaboratorsSheet(this.$key, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceCollaboratorsSheetKt$PeerSpaceMemberAvatar$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ String $photoUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$name = str;
            this.$photoUrl = str2;
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
            PeerSpaceCollaboratorsSheetKt.PeerSpaceMemberAvatar(this.$name, this.$photoUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.spaces.menu.PeerSpaceCollaboratorsSheetKt$PeerSpaceMemberRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C138942 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PeerSpaceMember $member;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138942(PeerSpaceMember peerSpaceMember, BRg bRg, int i, int i2) {
            super(2);
            this.$member = peerSpaceMember;
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
            PeerSpaceCollaboratorsSheetKt.PeerSpaceMemberRow(this.$member, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void PeerSpaceCollaboratorsHeader(PeerSpaceCollaboratorsSheetKey peerSpaceCollaboratorsSheetKey, Integer num, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1713284067);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, peerSpaceCollaboratorsSheetKey) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, num);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String str = ((CH0) abstractC3358CGzA0h).A01;
            String str2 = peerSpaceCollaboratorsSheetKey.hostMuse;
            String str3 = peerSpaceCollaboratorsSheetKey.spaceId;
            String strA0j = FGI.A0j("peer-space-members:", str, ":", str2, ":", str3);
            PeerSpaceMembersViewModel.Factory factory = new PeerSpaceMembersViewModel.Factory(abstractC3358CGzA0h, str2, str3);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            C1BO c1boA02 = C2CK.A02(bfm, ((PeerSpaceMembersViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), strA0j, new C0861A6i(PeerSpaceMembersViewModel.class))).iconUrl);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            C3TH c3th = C2VU.A00;
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String strA08 = C1BO.A08(c1boA02);
            if (strA08 == null || C7BY.A0j(strA08)) {
                bfm.AgE(416523742);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(416523743);
                AuraImageKt.m2573AuraImageXRP3Ue8(strA08, C11U.A03(C10G.A07(BRg.A00, 64.0f), AnonymousClass002.A0e(bfm).media), B18.A00, null, null, false, new C1DG(64.0f), 0L, false, false, false, null, null, null, null, bfm, 1573248, 0, 32696);
                BBI.A0R(bbi, false);
            }
            BRg bRgA0A = C3U4.A0A(c1062ATq, 4.0f, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0T = AnonymousClass006.A0T(bfm, c3th, 4.0f);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0A);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0T, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            bfm.AgE(-1840524630);
            String strA01 = peerSpaceCollaboratorsSheetKey.title;
            if (strA01.length() == 0) {
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12060a);
            }
            BBI.A0R(bbi, false);
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, AnonymousClass002.A0f(bfm).title3Emphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16646141, 0L, C19U.A03(20), 0L, C19U.A03(25));
            long jA0C = C06G.A0C(bfm);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = PeerSpaceCollaboratorsSheetKt$PeerSpaceCollaboratorsHeader$1$3$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(c1062ATq, objAaT, false), jA0C, c1822ArmA00, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            if (num != null) {
                bfm.AgE(-1221315905);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f100036, new Object[]{num}, bfm, num.intValue()), c1062ATq, C06G.A0C(bfm), C06G.A0T(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1221006215);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(peerSpaceCollaboratorsSheetKey, num, bRg2, i, i2);
        }
    }

    public static final void PeerSpaceCollaboratorsMessage(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-465419402);
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
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            long jA08 = C06G.A08(bfm);
            BRg bRgA06 = C3U4.A06(AnonymousClass001.A0R(bRg2), 16.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = PeerSpaceCollaboratorsSheetKt$PeerSpaceCollaboratorsMessage$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bRgA06, (G0U) objAaT, false), jA08, c1822ArmA0Z, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138922(str, bRg2, i, i2);
        }
    }

    public static final void PeerSpaceCollaboratorsSheet(PeerSpaceCollaboratorsSheetKey peerSpaceCollaboratorsSheetKey, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(peerSpaceCollaboratorsSheetKey, 0);
        bfm.AgG(-1584512202);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, peerSpaceCollaboratorsSheetKey) | i : i;
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
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String str = ((CH0) abstractC3358CGzA0h).A01;
            String str2 = peerSpaceCollaboratorsSheetKey.hostMuse;
            String str3 = peerSpaceCollaboratorsSheetKey.spaceId;
            String strA0j = FGI.A0j("peer-space-members:", str, ":", str2, ":", str3);
            PeerSpaceMembersViewModel.Factory factory = new PeerSpaceMembersViewModel.Factory(abstractC3358CGzA0h, str2, str3);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, AbstractC07539Wl.A00(bRg2, "hatch-peer-space-collaborators-sheet"), null, null, null, null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass1(peerSpaceCollaboratorsSheetKey, C2CK.A02(bfm, ((PeerSpaceMembersViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), PeerSpaceMembersViewModel.class, strA0j)).state)), 387669017), bfm, 6, 48, 2044);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138932(peerSpaceCollaboratorsSheetKey, bRg2, i, i2);
        }
    }

    public static final void PeerSpaceMemberAvatar(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-993117478);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1C = AnonymousClass003.A1C(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            if (str2 == null || MutableState.A0A(mutableState)) {
                bfm.AgE(2067423231);
                List listA0g = C7BY.A0g(str, new char[]{' '});
                ArrayList arrayList = new ArrayList();
                for (Object obj : listA0g) {
                    AnonymousClass006.A1F((String) obj, obj, arrayList);
                }
                List listA0a = AbstractC0878AGe.A0a(arrayList, 2);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = PeerSpaceCollaboratorsSheetKt$PeerSpaceMemberAvatar$3$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                String strA0L = AbstractC0878AGe.A0L("", "", "", listA0a, (G0U) objAaT2);
                C1822Arm c1822ArmA0W = C06G.A0W(bfm);
                AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                AuraTextKt.m2639AuraTextUY9GdpU(strA0L, C10G.A02(C2VU.A09, C1b8.A03(C10G.A07(bRg2, 44.0f), C1D8.A00, AnonymousClass001.A0f(bfm, akh).highlight), false), C06G.A0I(bfm, akh), c1822ArmA0W, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            } else {
                bfm.AgE(2067126003);
                BRg bRgA02 = C11U.A02(bRg2, 44.0f);
                C1DG c1dg = new C1DG(44.0f);
                boolean zA65 = bfm.A65(mutableState);
                Object objAaT3 = bfm.AaT();
                if (zA65 || objAaT3 == C78N.A00) {
                    objAaT3 = new PeerSpaceCollaboratorsSheetKt$PeerSpaceMemberAvatar$1$1(mutableState);
                    bfm.Ai0(objAaT3);
                }
                AuraImageKt.m2573AuraImageXRP3Ue8(str2, bRgA02, null, null, null, false, c1dg, 0L, false, false, false, null, null, (Function0) objAaT3, null, bfm, ((iA0d >> 3) & 14) | 806882304, 48, 21940);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, str2, bRg2, i, i2);
        }
    }

    public static final void PeerSpaceMemberRow(PeerSpaceMember peerSpaceMember, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(912547213);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(peerSpaceMember, bfm, i) ? 1 : 0) | i : i;
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
            String strA01 = peerSpaceMember.name;
            if (strA01 == null) {
                bfm.AgE(784546857);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120df3);
            } else {
                bfm.AgE(784546392);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            BRg bRgA06 = C3U4.A06(AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 60.0f), 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            PeerSpaceMemberAvatar(strA01, peerSpaceMember.photoUrl, null, bfm, 0, 4);
            BRg bRgAiP = c90m.AiP(BRg.A00, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C06G.A0C(bfm), C1822Arm.A00(null, C06G.A0T(bfm), null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C19U.A03(24)), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, roleLabel(peerSpaceMember)), null, C06G.A08(bfm), C1822Arm.A00(null, C06G.A0Z(bfm), null, null, null, null, null, null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, C19U.A03(20)), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138942(peerSpaceMember, bRg2, i, i2);
        }
    }

    public static final int roleLabel(PeerSpaceMember peerSpaceMember) {
        if (peerSpaceMember.isHost) {
            return R.string._name_removed__res_0x7f120dfb;
        }
        PeerSpacePermission peerSpacePermission = peerSpaceMember.permission;
        return peerSpacePermission == PeerSpacePermission.EDIT ? R.string._name_removed__res_0x7f120df8 : peerSpacePermission == PeerSpacePermission.VIEW ? R.string._name_removed__res_0x7f120dfa : R.string._name_removed__res_0x7f120df9;
    }

    public static final void PeerSpaceCollaboratorsLoading(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1955912438);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
            BRg bRgA02 = C10G.A02(C2VU.A09, C3U4.A06(AnonymousClass001.A0R(bRg), 24.0f), false);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new PeerSpaceCollaboratorsSheetKt$PeerSpaceCollaboratorsLoading$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0v(bfm, bRgA02, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C138912(bRg, i, i2);
        }
    }

    public static final /* synthetic */ PeerSpaceMembersState access$PeerSpaceCollaboratorsSheet$lambda$0(C1BO c1bo) {
        return (PeerSpaceMembersState) c1bo.getValue();
    }
}
