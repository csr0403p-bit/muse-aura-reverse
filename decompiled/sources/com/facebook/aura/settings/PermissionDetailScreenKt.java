package com.facebook.aura.settings;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C1515AkP;
import X.C1DG;
import X.C7384Etj;
import X.C90l;
import X.F60;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.key.PermissionDestination;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class PermissionDetailScreenKt {

    /* renamed from: com.facebook.aura.settings.PermissionDetailScreenKt$PermissionDetailScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ PermissionDestination $destination;

        /* renamed from: com.facebook.aura.settings.PermissionDetailScreenKt$PermissionDetailScreen$1$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PermissionDestination.values().length];
                try {
                    AnonymousClass002.A13(PermissionDestination.LOCATION, iArr);
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PermissionDestination permissionDestination) {
            super(4);
            this.$destination = permissionDestination;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1972invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1972invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0M = C06G.A0M(bfm, AnonymousClass006.A0M(bfm));
            PermissionDestination permissionDestination = this.$destination;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0M);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            if (permissionDestination.ordinal() == 0) {
                bfm.AgE(341344403);
                LocationSharingPermissionContentKt.LocationSharingSection(c90l, bfm, 6);
            } else {
                bfm.AgE(1991781893);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, f2, true);
        }
    }

    /* renamed from: com.facebook.aura.settings.PermissionDetailScreenKt$PermissionDetailScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ PermissionDestination $destination;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PermissionDestination permissionDestination, Function0<Unit> function0, int i) {
            super(2);
            this.$destination = permissionDestination;
            this.$onBack = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            PermissionDetailScreenKt.PermissionDetailScreen(this.$destination, this.$onBack, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final String permissionDestinationTitle(PermissionDestination permissionDestination, BFM bfm, int i) {
        int i2;
        C7384Etj.A0Y(permissionDestination, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (permissionDestination.ordinal()) {
            case 0:
                bfm.AgE(569337889);
                i2 = R.string._name_removed__res_0x7f120f43;
                break;
            case 1:
                bfm.AgE(569341537);
                i2 = R.string._name_removed__res_0x7f120f42;
                break;
            case 2:
                bfm.AgE(569345183);
                i2 = R.string._name_removed__res_0x7f120ed4;
                break;
            case 3:
                bfm.AgE(569348709);
                i2 = R.string._name_removed__res_0x7f120ef7;
                break;
            case 4:
                bfm.AgE(569352481);
                i2 = R.string._name_removed__res_0x7f120f44;
                break;
            case 5:
                bfm.AgE(569356127);
                i2 = R.string._name_removed__res_0x7f120ed5;
                break;
            case 6:
                bfm.AgE(569359294);
                i2 = R.string._name_removed__res_0x7f120f45;
                break;
            case 7:
                bfm.AgE(569362463);
                i2 = R.string._name_removed__res_0x7f120f46;
                break;
            case 8:
                bfm.AgE(569366401);
                i2 = R.string._name_removed__res_0x7f120f54;
                break;
            case 9:
                bfm.AgE(569369784);
                i2 = R.string._name_removed__res_0x7f120f37;
                break;
            case 10:
                bfm.AgE(569372855);
                i2 = R.string._name_removed__res_0x7f120ed3;
                break;
            case 11:
                bfm.AgE(569376490);
                i2 = R.string._name_removed__res_0x7f120f47;
                break;
            default:
                throw AnonymousClass005.A0k(bfm, 569336909);
        }
        return AnonymousClass003.A0e(bfm, i2);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionDestination.values().length];
            try {
                AnonymousClass002.A13(PermissionDestination.LOCATION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PermissionDestination.CONTACTS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PermissionDestination.CALENDAR, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(PermissionDestination.HEALTH, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(PermissionDestination.MESSAGES, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(PermissionDestination.CALL_LOG, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(PermissionDestination.PHONE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(PermissionDestination.PHOTOS, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(PermissionDestination.PHONE_NOTIFICATIONS, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(PermissionDestination.MICROPHONE, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(PermissionDestination.BLUETOOTH, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(PermissionDestination.RUN_IN_BACKGROUND, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void PermissionDetailScreen(PermissionDestination permissionDestination, Function0<Unit> function0, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(permissionDestination, function0);
        bfm.AgG(-2002743530);
        int iA08 = (i & 6) == 0 ? i | AnonymousClass005.A08(bfm, permissionDestination) : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, null, null, 0L, permissionDestinationTitle(permissionDestination, bfm, iA08 & 14), null, function0, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, null, zA1b, B1V.A00(bfm, new AnonymousClass1(permissionDestination), -530971343), bfm, ((iA08 << 15) & 3670016) | 6, zA1b ? 1 : 0, 805306368, 536870830);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(permissionDestination, function0, i);
        }
    }
}
