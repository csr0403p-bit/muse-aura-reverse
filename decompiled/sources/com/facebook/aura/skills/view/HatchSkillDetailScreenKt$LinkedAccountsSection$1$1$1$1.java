package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C07C;
import X.G0W;
import com.facebook.aura.skills.viewmodel.SkillAccountsUiState;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel;
import com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ SkillLinkedAccountUiModel $account;
    public final /* synthetic */ SkillLinkedAccountsViewModel $linkedAccountsViewModel;
    public final /* synthetic */ boolean $showOptionsMenu;
    public final /* synthetic */ SkillAccountsUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1(SkillLinkedAccountUiModel skillLinkedAccountUiModel, boolean z, SkillAccountsUiState skillAccountsUiState, SkillLinkedAccountsViewModel skillLinkedAccountsViewModel) {
        super(3);
        this.$account = skillLinkedAccountUiModel;
        this.$showOptionsMenu = z;
        this.$uiState = skillAccountsUiState;
        this.$linkedAccountsViewModel = skillLinkedAccountsViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.C07C r10, X.BFM r11, int r12) {
        /*
            r9 = this;
            boolean r0 = X.AnonymousClass004.A1G(r12)
            r10 = r11
            boolean r0 = X.AnonymousClass001.A1b(r0, r11, r12)
            if (r0 == 0) goto L7f
            com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel r3 = r9.$account
            boolean r4 = r9.$showOptionsMenu
            com.facebook.aura.skills.viewmodel.SkillAccountsUiState r1 = r9.$uiState
            boolean r0 = r1.isUpdating
            if (r0 != 0) goto L1a
            boolean r0 = r1.isRemovingAccount
            r5 = 1
            if (r0 == 0) goto L1b
        L1a:
            r5 = 0
        L1b:
            com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel r1 = r9.$linkedAccountsViewModel
            boolean r0 = r11.A67(r1)
            java.lang.Object r6 = r11.AaT()
            if (r0 != 0) goto L2b
            java.lang.Object r0 = X.C78N.A00
            if (r6 != r0) goto L33
        L2b:
            com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1$1$1 r6 = new com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1$1$1
            r6.<init>(r1)
            r11.Ai0(r6)
        L33:
            X.EnQ r6 = (X.InterfaceC7353EnQ) r6
            X.G0U r6 = (X.G0U) r6
            com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel r0 = r9.$linkedAccountsViewModel
            boolean r1 = r11.A67(r0)
            com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel r0 = r9.$account
            boolean r0 = X.AnonymousClass001.A1T(r11, r0, r1)
            com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel r2 = r9.$linkedAccountsViewModel
            com.facebook.aura.skills.viewmodel.SkillLinkedAccountUiModel r1 = r9.$account
            java.lang.Object r7 = r11.AaT()
            if (r0 != 0) goto L51
            java.lang.Object r0 = X.C78N.A00
            if (r7 != r0) goto L59
        L51:
            com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1$2$1 r7 = new com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1$2$1
            r7.<init>(r2, r1)
            r11.Ai0(r7)
        L59:
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModel r1 = r9.$linkedAccountsViewModel
            boolean r0 = r11.A67(r1)
            java.lang.Object r8 = r11.AaT()
            if (r0 != 0) goto L6b
            java.lang.Object r0 = X.C78N.A00
            if (r8 != r0) goto L73
        L6b:
            com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1$3$1 r8 = new com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1$3$1
            r8.<init>(r1)
            r11.Ai0(r8)
        L73:
            X.EnQ r8 = (X.InterfaceC7353EnQ) r8
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r11 = 0
            r12 = 64
            r9 = 0
            com.facebook.aura.skills.view.LinkedSkillAccountRowKt.LinkedSkillAccountRow(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L7f:
            r11.Afo()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.view.HatchSkillDetailScreenKt$LinkedAccountsSection$1$1$1$1.invoke(X.07C, X.BFM, int):void");
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
