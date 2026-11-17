package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AgentPermissionTaskDetailsSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final String approvalId;
    public final HatchScreen openerScreen;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, AgentPermissionTaskDetailsSheetKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<AgentPermissionTaskDetailsSheetKey> serializer() {
            return AgentPermissionTaskDetailsSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgentPermissionTaskDetailsSheetKey) {
                AgentPermissionTaskDetailsSheetKey agentPermissionTaskDetailsSheetKey = (AgentPermissionTaskDetailsSheetKey) obj;
                if (!C7384Etj.areEqual(this.approvalId, agentPermissionTaskDetailsSheetKey.approvalId) || this.openerScreen != agentPermissionTaskDetailsSheetKey.openerScreen) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AgentPermissionTaskDetailsSheetKey copy$default(AgentPermissionTaskDetailsSheetKey agentPermissionTaskDetailsSheetKey, String str, HatchScreen hatchScreen, int i, Object obj) {
        if ((i & 1) != 0) {
            str = agentPermissionTaskDetailsSheetKey.approvalId;
        }
        if ((i & 2) != 0) {
            hatchScreen = agentPermissionTaskDetailsSheetKey.openerScreen;
        }
        AnonymousClass003.A0u(str, hatchScreen);
        return new AgentPermissionTaskDetailsSheetKey(str, hatchScreen);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(AgentPermissionTaskDetailsSheetKey agentPermissionTaskDetailsSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(agentPermissionTaskDetailsSheetKey.approvalId, c9iZ, 0);
        if (c9j5.AfR() || agentPermissionTaskDetailsSheetKey.openerScreen != HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET) {
            c9j5.AAQ(agentPermissionTaskDetailsSheetKey.openerScreen, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.approvalId;
    }

    public final HatchScreen component2() {
        return this.openerScreen;
    }

    public final String getApprovalId() {
        return this.approvalId;
    }

    public final HatchScreen getOpenerScreen() {
        return this.openerScreen;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.openerScreen, AnonymousClass001.A0G(this.approvalId));
    }

    public AgentPermissionTaskDetailsSheetKey(String str, HatchScreen hatchScreen) {
        AnonymousClass003.A0u(str, hatchScreen);
        this.approvalId = str;
        this.openerScreen = hatchScreen;
    }

    public final AgentPermissionTaskDetailsSheetKey copy(String str, HatchScreen hatchScreen) {
        AnonymousClass003.A0u(str, hatchScreen);
        return new AgentPermissionTaskDetailsSheetKey(str, hatchScreen);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AgentPermissionTaskDetailsSheetKey(int i, String str, HatchScreen hatchScreen, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(AgentPermissionTaskDetailsSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.approvalId = str;
        this.openerScreen = (i & 2) == 0 ? HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET : hatchScreen;
    }

    public /* synthetic */ AgentPermissionTaskDetailsSheetKey(String str, HatchScreen hatchScreen, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? HatchScreen.AGENT_PERMISSION_SINGLE_APPROVAL_SHEET : hatchScreen);
    }
}
