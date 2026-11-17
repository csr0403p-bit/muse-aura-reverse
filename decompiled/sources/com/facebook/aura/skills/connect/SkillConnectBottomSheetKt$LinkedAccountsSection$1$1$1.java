package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.skills.repo.OAuthLinkedAccount;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SkillConnectBottomSheetKt$LinkedAccountsSection$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ SkillConnectUiState $uiState;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        SkillConnectUiState skillConnectUiState = this.$uiState;
        if (skillConnectUiState.isFetchingAccounts) {
            hatchSectionScope.item(ComposableSingletons$SkillConnectBottomSheetKt.f281lambda$581517126);
        } else {
            if (skillConnectUiState.linkedAccounts.isEmpty()) {
                return;
            }
            SkillConnectUiState skillConnectUiState2 = this.$uiState;
            Iterator<OAuthLinkedAccount> it = skillConnectUiState2.linkedAccounts.iterator();
            while (it.hasNext()) {
                AnonymousClass006.A1E(hatchSectionScope, new SkillConnectBottomSheetKt$LinkedAccountsSection$1$1$1$1$1(it.next(), skillConnectUiState2), -150317163);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillConnectBottomSheetKt$LinkedAccountsSection$1$1$1(SkillConnectUiState skillConnectUiState) {
        super(1);
        this.$uiState = skillConnectUiState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
