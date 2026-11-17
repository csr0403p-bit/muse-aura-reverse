package com.facebook.aura.skills.connect;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.C3UX;
import X.C78N;
import X.G0U;
import X.HtJ;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConnectorAccountLinkRequesterKt {
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.G0U<X.HtJ<? super kotlin.Unit>, java.lang.Object> rememberSuspendingConnectorAccountLinkRequester(java.lang.String r7, com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin r8, X.AbstractC3358CGz r9, X.BFM r10, int r11) {
        /*
            r1 = 0
            r4 = r7
            X.AnonymousClass005.A10(r7, r8, r9)
            android.content.Context r7 = X.AnonymousClass003.A0O(r10)
            boolean r0 = r10.A65(r9)
            java.lang.Object r6 = r10.AaT()
            if (r0 != 0) goto L17
            java.lang.Object r0 = X.C78N.A00
            if (r6 != r0) goto L1f
        L17:
            com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository r6 = new com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository
            r6.<init>(r9)
            r10.Ai0(r6)
        L1f:
            com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository r6 = (com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository) r6
            boolean r0 = r10.A65(r9)
            java.lang.Object r5 = r10.AaT()
            r3 = 0
            if (r0 != 0) goto L30
            java.lang.Object r0 = X.C78N.A00
            if (r5 != r0) goto L39
        L30:
            com.facebook.aura.common.coroutines.OnDuplicateCall$Join r0 = com.facebook.aura.common.coroutines.OnDuplicateCall.Join.INSTANCE
            com.facebook.aura.common.coroutines.SingleFlight r5 = com.facebook.aura.common.coroutines.SingleFlightKt.SingleFlight(r9, r0, r1)
            r10.Ai0(r5)
        L39:
            com.facebook.aura.common.coroutines.SingleFlight r5 = (com.facebook.aura.common.coroutines.SingleFlight) r5
            r0 = r11 & 14
            r0 = r0 ^ 6
            r1 = 4
            if (r0 <= r1) goto L48
            boolean r0 = r10.A65(r4)
            if (r0 != 0) goto L4d
        L48:
            r0 = r11 & 6
            r2 = 0
            if (r0 != r1) goto L4e
        L4d:
            r2 = 1
        L4e:
            r0 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L5c
            boolean r0 = X.AnonymousClass002.A1U(r10, r8)
            if (r0 != 0) goto L60
        L5c:
            r0 = r11 & 48
            if (r0 != r1) goto L61
        L60:
            r3 = 1
        L61:
            boolean r1 = X.AnonymousClass002.A1W(r10, r7, r2, r3)
            boolean r0 = r10.A65(r9)
            r0 = r0 | r1
            boolean r0 = X.AnonymousClass003.A1P(r10, r6, r5, r0)
            java.lang.Object r3 = r10.AaT()
            if (r0 != 0) goto L78
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L81
        L78:
            r9 = 0
            com.facebook.aura.skills.connect.ConnectorAccountLinkRequesterKt$rememberSuspendingConnectorAccountLinkRequester$1$1 r3 = new com.facebook.aura.skills.connect.ConnectorAccountLinkRequesterKt$rememberSuspendingConnectorAccountLinkRequester$1$1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.Ai0(r3)
        L81:
            X.G0U r3 = (X.G0U) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.ConnectorAccountLinkRequesterKt.rememberSuspendingConnectorAccountLinkRequester(java.lang.String, com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin, X.CGz, X.BFM, int):X.G0U");
    }

    public static final Function0<Unit> rememberConnectorAccountLinkRequester(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, BFM bfm, int i) {
        AnonymousClass003.A0u(str, hatchSkillOAuthOrigin);
        G0U<HtJ<? super Unit>, Object> g0uRememberSuspendingConnectorAccountLinkRequester = rememberSuspendingConnectorAccountLinkRequester(str, hatchSkillOAuthOrigin, AnonymousClass002.A0h(bfm), bfm, i & 126);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
        boolean zA1K = AnonymousClass003.A1K(bfm, g0uRememberSuspendingConnectorAccountLinkRequester, c3ux);
        Object objAaT2 = bfm.AaT();
        if (zA1K || objAaT2 == obj) {
            objAaT2 = new ConnectorAccountLinkRequesterKt$rememberConnectorAccountLinkRequester$1$1(c3ux, g0uRememberSuspendingConnectorAccountLinkRequester);
            bfm.Ai0(objAaT2);
        }
        return (Function0) objAaT2;
    }
}
