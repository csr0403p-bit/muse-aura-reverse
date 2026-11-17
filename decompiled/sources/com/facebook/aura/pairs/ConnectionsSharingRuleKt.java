package com.facebook.aura.pairs;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.C10571Hud;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import com.facebook.aura.json.HatchJsonKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public abstract class ConnectionsSharingRuleKt {
    public static final int MAX_GROUP_NAME_LENGTH = 256;
    public static final int MAX_RULE_ID_LENGTH = 256;
    public static final String PEER_PROVIDER = "peer";

    public static final boolean matchesMuse(ConnectionDirectoryEntryJson connectionDirectoryEntryJson, String str) {
        boolean zA1a = AnonymousClass002.A1a(connectionDirectoryEntryJson, str);
        if (connectionDirectoryEntryJson.connection_id.length() <= 0 || !(str.equals(connectionDirectoryEntryJson.muse_id) || ("peer".equals(connectionDirectoryEntryJson.provider) && str.equals(connectionDirectoryEntryJson.address)))) {
            return false;
        }
        return zA1a;
    }

    public static final ConnectionsCanonicalRules toCanonicalRules(ConnectionDetailJson connectionDetailJson) {
        Long l;
        Object objA0s;
        ConnectionsSharingRule sharingRule;
        C7384Etj.A0Y(connectionDetailJson, 0);
        ConnectionDirectoryEntryJson connectionDirectoryEntryJson = connectionDetailJson.connection;
        if (!connectionDirectoryEntryJson.capabilities.rules_enforced || connectionDirectoryEntryJson.connection_id.length() == 0 || ((l = connectionDetailJson.revision) == null && (l = connectionDirectoryEntryJson.rules_revision) == null)) {
            return null;
        }
        long jLongValue = l.longValue();
        List<JsonElement> list = connectionDetailJson.rules;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = list.iterator();
        while (it.hasNext()) {
            try {
                objA0s = (ConnectionRuleJson) HatchJsonKt.HatchJson.A01(ConnectionRuleJson$$serializer.INSTANCE, C60Q.A11(it));
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            ConnectionRuleJson connectionRuleJson = (ConnectionRuleJson) objA0s;
            if (connectionRuleJson != null && (sharingRule = toSharingRule(connectionRuleJson)) != null) {
                arrayListA0h.add(sharingRule);
            }
        }
        return new ConnectionsCanonicalRules(connectionDetailJson.connection.connection_id, jLongValue, arrayListA0h, AbstractC0878AGe.A0g(connectionDetailJson.unconfirmed_rule_ids));
    }

    public static final ConnectionsGroup toGroup(ConnectionDirectoryEntryJson connectionDirectoryEntryJson) {
        String strA0l;
        C7384Etj.A0Y(connectionDirectoryEntryJson, 0);
        if (connectionDirectoryEntryJson.connection_id.length() == 0 || !connectionDirectoryEntryJson.active) {
            return null;
        }
        String str = connectionDirectoryEntryJson.provider;
        if ("peer".equals(str)) {
            return null;
        }
        String str2 = connectionDirectoryEntryJson.muse_id;
        if (str2 != null && str2.length() != 0) {
            return null;
        }
        ConnectionsGroupProvider connectionsGroupProviderFromWire = ConnectionsGroupProvider.Companion.fromWire(str);
        String strPeerDisplayText = PairsTextKt.peerDisplayText(connectionDirectoryEntryJson.display_name, 256);
        if (strPeerDisplayText == null || (strA0l = AnonymousClass002.A0l(strPeerDisplayText)) == null || strA0l.length() <= 0) {
            return null;
        }
        return new ConnectionsGroup(connectionDirectoryEntryJson.connection_id, strA0l, connectionsGroupProviderFromWire, ConnectionsDisconnectEffect.Companion.fromWire(connectionDirectoryEntryJson.capabilities.disconnect_effect));
    }

    public static final ConnectionsSharingRule toSharingRule(ConnectionRuleJson connectionRuleJson) {
        C7384Etj.A0Y(connectionRuleJson, 0);
        String str = connectionRuleJson.rule_id;
        if (isValidRuleId(str)) {
            return new ConnectionsSharingRule(str, connectionRuleJson.title, connectionRuleJson.summary, connectionRuleJson.description);
        }
        return null;
    }

    public static final boolean isValidRuleId(String str) {
        int length = str.length();
        return length > 0 && length <= 256;
    }
}
