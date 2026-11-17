package com.facebook.aura.library.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchRenameDialogKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class GoalRenameDialogKt {

    /* renamed from: com.facebook.aura.library.view.GoalRenameDialogKt$GoalRenameDialog$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $currentName;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onNameChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$currentName = str;
            this.$onNameChange = g0u;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
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
            GoalRenameDialogKt.GoalRenameDialog(this.$currentName, this.$onNameChange, this.$onConfirm, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void GoalRenameDialog(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(g0u, function0, function02, 1);
        bfm.AgG(1260236837);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a6a);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a6b);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a6c);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120a69);
            int iA01 = AnonymousClass005.A01(iA0d);
            int i4 = iA0d << 12;
            HatchRenameDialogKt.HatchRenameDialog(str, strA01, strA012, strA013, strA014, g0u, function0, function02, bRg2, false, 0, null, false, null, bfm, AnonymousClass005.A03(i4, iA01 | (458752 & i4) | (3670016 & i4)), 0, 15360);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, g0u, function0, function02, bRg2, i, i2);
        }
    }
}
