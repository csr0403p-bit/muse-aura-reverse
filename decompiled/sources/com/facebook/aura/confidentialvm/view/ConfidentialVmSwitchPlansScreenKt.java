package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class ConfidentialVmSwitchPlansScreenKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchPlansScreenKt$ConfidentialVmSwitchPlansScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmSwitchPlansScreenKt.ConfidentialVmSwitchPlansScreen(this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmSwitchPlansScreen(X.BRg r9, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel r10, X.BFM r11, int r12, int r13) {
        /*
            r6 = r9
            r0 = 1178702984(0x46419488, float:12389.133)
            r7 = r11
            r11.AgG(r0)
            r5 = r13 & 1
            if (r5 == 0) goto Lae
            r0 = r12 | 6
        Le:
            r1 = r12 & 48
            r3 = 32
            if (r1 != 0) goto L23
            r1 = r13 & 2
            if (r1 != 0) goto L20
            boolean r2 = X.AnonymousClass004.A1Y(r10, r11, r12)
            r1 = 32
            if (r2 != 0) goto L22
        L20:
            r1 = 16
        L22:
            r0 = r0 | r1
        L23:
            r4 = r0 & 19
            r1 = 18
            r2 = 0
            boolean r1 = X.AnonymousClass002.A1P(r4, r1)
            boolean r1 = X.AnonymousClass001.A1b(r1, r11, r0)
            if (r1 == 0) goto Laa
            r11.Afy()
            r1 = r12 & 1
            if (r1 == 0) goto L9d
            boolean r1 = r11.AEk()
            if (r1 != 0) goto L9d
            r11.Afo()
            r1 = r13 & 2
            if (r1 == 0) goto L48
        L46:
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
        L48:
            r11.AAb()
            int r4 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel.$stable
            int r1 = r0 >> 3
            r1 = r1 & 14
            r4 = r4 | r1
            com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchNavigationKt.ConfidentialVmSwitchStepEffect(r10, r11, r4)
            com.facebook.aura.utils.navigation.SecureUri r1 = com.facebook.aura.settings.AuraExternalUriRegistry.confidentialVmLearnMoreUri
            android.net.Uri r1 = r1.uri
            java.lang.String r4 = r1.toString()
            X.C7384Etj.A0U(r4)
            r1 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 ^ 48
            if (r1 <= r3) goto L6c
            boolean r1 = r11.A67(r10)
            if (r1 != 0) goto L70
        L6c:
            r1 = r0 & 48
            if (r1 != r3) goto L71
        L70:
            r2 = 1
        L71:
            java.lang.Object r5 = r11.AaT()
            if (r2 != 0) goto L7b
            java.lang.Object r1 = X.C78N.A00
            if (r5 != r1) goto L83
        L7b:
            com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchPlansScreenKt$ConfidentialVmSwitchPlansScreen$1$1 r5 = new com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchPlansScreenKt$ConfidentialVmSwitchPlansScreen$1$1
            r5.<init>(r10)
            r11.Ai0(r5)
        L83:
            X.EnQ r5 = (X.InterfaceC7353EnQ) r5
            X.G0U r5 = (X.G0U) r5
            int r0 = r0 << 6
            r8 = r0 & 896(0x380, float:1.256E-42)
            r9 = 0
            com.facebook.aura.subscription.view.AuraActivationSubscriptionScreenKt.ConfidentialVmSwitchPlanPicker(r4, r5, r6, r7, r8, r9)
        L8f:
            X.BBb r1 = r11.AAc()
            if (r1 == 0) goto L9c
            com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchPlansScreenKt$ConfidentialVmSwitchPlansScreen$2 r0 = new com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchPlansScreenKt$ConfidentialVmSwitchPlansScreen$2
            r0.<init>(r6, r10, r12, r13)
            r1.A06 = r0
        L9c:
            return
        L9d:
            if (r5 == 0) goto La1
            X.BS0 r6 = X.BRg.A00
        La1:
            r1 = r13 & 2
            if (r1 == 0) goto L48
            com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel r10 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModelKt.confidentialVmSwitchViewModel(r11, r2)
            goto L46
        Laa:
            r11.Afo()
            goto L8f
        Lae:
            r0 = r12 & 6
            if (r0 != 0) goto Lb9
            int r0 = X.AnonymousClass004.A0d(r11, r9)
            r0 = r0 | r12
            goto Le
        Lb9:
            r0 = r12
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchPlansScreenKt.ConfidentialVmSwitchPlansScreen(X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel, X.BFM, int, int):void");
    }
}
