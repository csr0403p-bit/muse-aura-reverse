package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectionsRuleEditorSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String connectionId;
    public final String ruleId;

    public final class Companion {
        public final C9hr<ConnectionsRuleEditorSheetKey> serializer() {
            return ConnectionsRuleEditorSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConnectionsRuleEditorSheetKey(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.connectionId = str;
        this.ruleId = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_keys_keys(ConnectionsRuleEditorSheetKey connectionsRuleEditorSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(connectionsRuleEditorSheetKey.connectionId, c9iZ, 0);
        c9j5.AAP(connectionsRuleEditorSheetKey.ruleId, C07779iq.A01, c9iZ, 1);
    }

    public final ConnectionsRuleEditorSheetKey copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new ConnectionsRuleEditorSheetKey(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionsRuleEditorSheetKey) {
                ConnectionsRuleEditorSheetKey connectionsRuleEditorSheetKey = (ConnectionsRuleEditorSheetKey) obj;
                if (!C7384Etj.areEqual(this.connectionId, connectionsRuleEditorSheetKey.connectionId) || !C7384Etj.areEqual(this.ruleId, connectionsRuleEditorSheetKey.ruleId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionsRuleEditorSheetKey copy$default(ConnectionsRuleEditorSheetKey connectionsRuleEditorSheetKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectionsRuleEditorSheetKey.connectionId;
        }
        if ((i & 2) != 0) {
            str2 = connectionsRuleEditorSheetKey.ruleId;
        }
        C7384Etj.A0Y(str, 0);
        return new ConnectionsRuleEditorSheetKey(str, str2);
    }

    public final String component1() {
        return this.connectionId;
    }

    public final String component2() {
        return this.ruleId;
    }

    public final String getConnectionId() {
        return this.connectionId;
    }

    public final String getRuleId() {
        return this.ruleId;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.connectionId) + AnonymousClass006.A0G(this.ruleId);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectionsRuleEditorSheetKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ConnectionsRuleEditorSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.connectionId = str;
        this.ruleId = str2;
    }
}
