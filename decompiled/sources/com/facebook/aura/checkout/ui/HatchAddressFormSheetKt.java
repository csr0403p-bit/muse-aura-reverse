package com.facebook.aura.checkout.ui;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C1731ApS;
import X.C1809ArT;
import X.C1824Aro;
import X.C3cH;
import X.C78N;
import X.C7BY;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchAddressFormSheetKt {

    /* renamed from: com.facebook.aura.checkout.ui.HatchAddressFormSheetKt$HatchAddressFormSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0U<HatchAddress, Unit> $onSave;
        public final /* synthetic */ HatchFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(HatchFormState hatchFormState, G0U<? super HatchAddress, Unit> g0u) {
            super(2);
            this.$state = hatchFormState;
            this.$onSave = g0u;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206e7);
            boolean zIsSubmittable = this.$state.isSubmittable();
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onSave, bfm.A65(this.$state));
            HatchFormState hatchFormState = this.$state;
            G0U<HatchAddress, Unit> g0u = this.$onSave;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchAddressFormSheetKt$HatchAddressFormSheet$4$1$1(hatchFormState, g0u);
                BBI.A0T(bfm, objAaT);
            }
            HatchFormSheetKt.m347HatchFormFooteryZUFuyM(strA01, zIsSubmittable, (Function0) objAaT, null, HatchAddressFormSheetKt.addressDisclaimer(bfm, 0), null, false, bfm, 0, 104);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchAddressFormSheetKt$HatchAddressFormSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchFormState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchFormState hatchFormState) {
            super(3);
            this.$state = hatchFormState;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                HatchFormSheetKt.HatchFormSheet(this.$state, null, null, bfm, 0, 6);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.checkout.ui.HatchAddressFormSheetKt$HatchAddressFormSheet$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAddress $initialAddress;
        public final /* synthetic */ HatchAddressFormMode $mode;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onClose;
        public final /* synthetic */ G0U<HatchAddress, Unit> $onSave;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(HatchAddressFormMode hatchAddressFormMode, G0U<? super HatchAddress, Unit> g0u, BRg bRg, HatchAddress hatchAddress, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
            super(2);
            this.$mode = hatchAddressFormMode;
            this.$onSave = g0u;
            this.$modifier = bRg;
            this.$initialAddress = hatchAddress;
            this.$onBack = function0;
            this.$onClose = function02;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAddressFormSheetKt.HatchAddressFormSheet(this.$mode, this.$onSave, this.$modifier, this.$initialAddress, this.$onBack, this.$onClose, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchAddressFormMode.values().length];
            try {
                AnonymousClass002.A13(HatchAddressFormMode.ADD, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchAddressFormMode.EDIT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchAddressFormSheet(com.facebook.aura.checkout.ui.HatchAddressFormMode r27, X.G0U<? super com.facebook.aura.checkout.ui.HatchAddress, kotlin.Unit> r28, X.BRg r29, com.facebook.aura.checkout.ui.HatchAddress r30, kotlin.jvm.functions.Function0<kotlin.Unit> r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, X.BFM r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.checkout.ui.HatchAddressFormSheetKt.HatchAddressFormSheet(com.facebook.aura.checkout.ui.HatchAddressFormMode, X.G0U, X.BRg, com.facebook.aura.checkout.ui.HatchAddress, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final ApQ addressDisclaimer(BFM bfm, int i) {
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206e6);
        String strA0t = AnonymousClass001.A0t(bfm, strA01, R.string._name_removed__res_0x7f1206da);
        long j = C3cH.A0W(bfm).link;
        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
        int iA0B = C7BY.A0B(strA0t, strA01, 0, false);
        if (iA0B < 0) {
            c1731ApSA0W.A0E(strA0t);
        } else {
            AnonymousClass005.A0s(c1731ApSA0W, strA0t, 0, iA0B);
            long j2 = C1809ArT.A01;
            int iA00 = C1731ApS.A00(c1731ApSA0W, new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j2, j2, B6A.A07));
            try {
                c1731ApSA0W.A0E(strA01);
                c1731ApSA0W.A06(iA00);
                c1731ApSA0W.A0E(strA0t.substring(iA0B + strA01.length()));
            } catch (Throwable th) {
                c1731ApSA0W.A06(iA00);
                throw th;
            }
        }
        return c1731ApSA0W.A04();
    }

    public static final String addressFormTitle(HatchAddressFormMode hatchAddressFormMode, BFM bfm, int i) {
        int i2;
        int iOrdinal = hatchAddressFormMode.ordinal();
        if (iOrdinal == 0) {
            bfm.AgE(241575428);
            i2 = R.string._name_removed__res_0x7f1206d7;
        } else {
            if (iOrdinal != 1) {
                throw AnonymousClass005.A0k(bfm, 241574032);
            }
            bfm.AgE(241578149);
            i2 = R.string._name_removed__res_0x7f1206e1;
        }
        return AnonymousClass003.A0e(bfm, i2);
    }
}
