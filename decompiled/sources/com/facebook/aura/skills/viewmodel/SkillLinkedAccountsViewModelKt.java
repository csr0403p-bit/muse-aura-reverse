package com.facebook.aura.skills.viewmodel;

import X.A6B;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.B3i;
import X.C7384Etj;
import X.C7AG;
import X.C7BY;
import X.G0U;
import com.facebook.aura.skills.repo.ConnectorLinkedAccount;
import com.facebook.aura.skills.repo.OAuthLinkedAccount;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class SkillLinkedAccountsViewModelKt {

    /* renamed from: com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModelKt$toFirstPartyLinkedAccountUiModels$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<OAuthLinkedAccount, Boolean> {
        public final /* synthetic */ boolean $onlyConnected;

        /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(com.facebook.aura.skills.repo.OAuthLinkedAccount r2) {
            /*
                r1 = this;
                r0 = 0
                X.C7384Etj.A0Y(r2, r0)
                boolean r0 = r1.$onlyConnected
                if (r0 == 0) goto Ld
                boolean r1 = r2.connected
                r0 = 0
                if (r1 == 0) goto Le
            Ld:
                r0 = 1
            Le:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModelKt.AnonymousClass1.invoke(com.facebook.aura.skills.repo.OAuthLinkedAccount):java.lang.Boolean");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z) {
            super(1);
            this.$onlyConnected = z;
        }
    }

    /* renamed from: com.facebook.aura.skills.viewmodel.SkillLinkedAccountsViewModelKt$toFirstPartyLinkedAccountUiModels$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<OAuthLinkedAccount, SkillLinkedAccountUiModel> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public final SkillLinkedAccountUiModel invoke(OAuthLinkedAccount oAuthLinkedAccount) {
            C7384Etj.A0Y(oAuthLinkedAccount, 0);
            String str = oAuthLinkedAccount.accountId;
            String str2 = oAuthLinkedAccount.username;
            if (C7BY.A0j(str2)) {
                str2 = oAuthLinkedAccount.accountId;
            }
            return new SkillLinkedAccountUiModel(str, str2, oAuthLinkedAccount.profilePictureUrl, false);
        }
    }

    public static final List<SkillLinkedAccountUiModel> toFirstPartyLinkedAccountUiModels(List<OAuthLinkedAccount> list, boolean z) {
        B3i b3iA03 = A6B.A03(new AnonymousClass1(z), AbstractC0878AGe.A06(list));
        AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        AnonymousClass003.A0u(b3iA03, anonymousClass2);
        return A6B.A02(new C7AG(anonymousClass2, b3iA03));
    }

    public static final List<SkillLinkedAccountUiModel> toSkillLinkedAccountUiModels(List<ConnectorLinkedAccount> list) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (ConnectorLinkedAccount connectorLinkedAccount : list) {
            arrayListA0i.add(new SkillLinkedAccountUiModel(connectorLinkedAccount.accountId, connectorLinkedAccount.displayName, connectorLinkedAccount.profilePictureUrl, connectorLinkedAccount.needsReauth));
        }
        return arrayListA0i;
    }
}
