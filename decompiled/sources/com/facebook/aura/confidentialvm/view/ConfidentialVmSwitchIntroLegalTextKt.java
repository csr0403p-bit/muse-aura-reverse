package com.facebook.aura.confidentialvm.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmDisclosure;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class ConfidentialVmSwitchIntroLegalTextKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchIntroLegalTextKt$ConfidentialVmSwitchIntroLegalText$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConfidentialVmDisclosure $disclosure;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConfidentialVmDisclosure confidentialVmDisclosure, BRg bRg, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, int i, int i2) {
            super(2);
            this.$disclosure = confidentialVmDisclosure;
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
            ConfidentialVmSwitchIntroLegalTextKt.ConfidentialVmSwitchIntroLegalText(this.$disclosure, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmSwitchIntroLegalText(com.facebook.aura.confidentialvm.repository.ConfidentialVmDisclosure r14, X.BRg r15, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel r16, X.BFM r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchIntroLegalTextKt.ConfidentialVmSwitchIntroLegalText(com.facebook.aura.confidentialvm.repository.ConfidentialVmDisclosure, X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel, X.BFM, int, int):void");
    }
}
