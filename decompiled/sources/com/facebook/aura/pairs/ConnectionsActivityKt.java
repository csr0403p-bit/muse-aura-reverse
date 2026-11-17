package com.facebook.aura.pairs;

import X.AbstractC0878AGe;
import X.C06827l3;
import X.C10571Hud;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.file.view.ArtifactFileActionMenuKt;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ConnectionsShareStatusSheetKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import java.net.URI;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class ConnectionsActivityKt {
    public static final long ACTIVITY_WINDOW_MS = 2592000000L;
    public static final String FILE_STATE_AVAILABLE = "available";
    public static final String FILE_STATE_DECLINED = "declined";
    public static final String FILE_STATE_WAITING_APPROVAL = "waiting_approval";
    public static final String KIND_CONFIRM_NEEDED = "confirm_needed";
    public static final String KIND_CONNECTED = "connected";
    public static final String KIND_FILE_SHARED = "file_shared";
    public static final String KIND_GOAL_UPDATED = "goal_updated";
    public static final String KIND_LINK_SHARED = "link_shared";
    public static final String KIND_REQUEST_ACCEPTED = "request_accepted";
    public static final String KIND_REQUEST_RECEIVED = "request_received";
    public static final String KIND_SPACE_SHARED = "space_shared";
    public static final int MAX_FILE_REF_LENGTH = 1024;
    public static final int MAX_LINK_LENGTH = 8192;
    public static final int MAX_TEXT_LENGTH = 256;
    public static final String MESSAGES_PATH = "/api/peers/messages/";
    public static final Set<String> LINK_SCHEMES = C60O.A19(AuraDeeplinkHandlerActivity.HTTP, "https");
    public static final C06827l3 MESSAGE_ID = C06827l3.A02("^[A-Za-z0-9_-]{1,128}$");
    public static final C06827l3 OWNED_SPACE_SLUG = C06827l3.A02("^[A-Za-z0-9][A-Za-z0-9_-]{0,127}$");
    public static final Set<String> ITEM_SHARED_KINDS = C60O.A1A("feed_shared", "idea_shared", "goal_shared");
    public static final C06827l3 PEER_HOST = C06827l3.A02("^[a-z0-9]{1,128}$");
    public static final List<String> FILE_REF_PREFIXES = C60O.A16("workspace/", ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX);
    public static final C06827l3 SPACE_SLUG = C06827l3.A02("^[a-z0-9-]{1,128}$");

    public static final AuraNavKey sentShareDestination(PeerActivityJson peerActivityJson) {
        String strPeerDisplayText;
        String str;
        String str2;
        C7384Etj.A0Y(peerActivityJson, 0);
        String str3 = peerActivityJson.kind;
        if (C7384Etj.areEqual(C7BY.A0S(str3, str3, '_'), ConnectionsSharedItemKind.SPACE.getWire()) && (str2 = peerActivityJson.item_id) != null && OWNED_SPACE_SLUG.A08(str2)) {
            return new SpacesModalScreenKey(str2, null, false);
        }
        String strA0K = peerActivityJson.message_id;
        if ((strA0K == null && ((str = peerActivityJson.url) == null || !str.startsWith(MESSAGES_PATH) || (strA0K = C7BY.A0K(MESSAGES_PATH, str)) == null)) || !MESSAGE_ID.A08(strA0K)) {
            return null;
        }
        String str4 = peerActivityJson.title;
        if (str4 == null || (strPeerDisplayText = PairsTextKt.peerDisplayText(str4, 256)) == null) {
            strPeerDisplayText = "";
        }
        return new ConnectionsShareStatusSheetKey(strA0K, strPeerDisplayText);
    }

    public static final ConnectionsSharedLink sharedLink(PeerActivityJson peerActivityJson) {
        Object objA0s;
        String host;
        String strPeerDisplayText;
        String str = peerActivityJson.url;
        if (str == null || str.length() > 8192) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isISOControl(str.charAt(i))) {
                return null;
            }
        }
        try {
            objA0s = new URI(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        URI uri = (URI) objA0s;
        if (uri == null || !AbstractC0878AGe.A0k(LINK_SCHEMES, C60Q.A0i(uri.getScheme())) || uri.getRawUserInfo() != null || (host = uri.getHost()) == null || host.length() <= 0) {
            return null;
        }
        String strA0j = C60Q.A0j(host);
        String strPeerDisplayText2 = PairsTextKt.peerDisplayText(str, 256);
        if (strPeerDisplayText2 == null) {
            return null;
        }
        String str2 = peerActivityJson.title;
        if (str2 != null && (strPeerDisplayText = PairsTextKt.peerDisplayText(str2, 256)) != null && !C7BY.A0j(strPeerDisplayText)) {
            strPeerDisplayText2 = strPeerDisplayText;
        }
        return new ConnectionsSharedLink(strPeerDisplayText2, str, strA0j);
    }
}
