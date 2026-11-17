package com.facebook.aura.network.api;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C60O;
import X.C7384Etj;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.skills.connect.config.SkillConnectConfigKt;

/* loaded from: classes4.dex */
public interface JarvisPath {

    /* loaded from: classes3.dex */
    public final class Activity implements JarvisPath {
        public static final Activity INSTANCE = new Activity();
        public static final String value = "activity";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Activity);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Activity";
        }

        public int hashCode() {
            return 480329967;
        }
    }

    /* loaded from: classes2.dex */
    public final class ActivityDetail implements JarvisPath {
        public final String encodedHash;

        public ActivityDetail(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedHash = str;
        }

        public final ActivityDetail copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ActivityDetail(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ActivityDetail) && C7384Etj.areEqual(this.encodedHash, ((ActivityDetail) obj).encodedHash));
        }

        public static /* synthetic */ ActivityDetail copy$default(ActivityDetail activityDetail, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activityDetail.encodedHash;
            }
            C7384Etj.A0Y(str, 0);
            return new ActivityDetail(str);
        }

        public final String component1() {
            return this.encodedHash;
        }

        public final String getEncodedHash() {
            return this.encodedHash;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("activity/", this.encodedHash);
        }

        public int hashCode() {
            return this.encodedHash.hashCode();
        }

        public String toString() {
            return FGI.A0U("ActivityDetail(encodedHash=", this.encodedHash, ")");
        }
    }

    /* loaded from: classes2.dex */
    public final class ActivityGoalActionReport implements JarvisPath {
        public final String actionId;
        public final String goalId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ActivityGoalActionReport) {
                    ActivityGoalActionReport activityGoalActionReport = (ActivityGoalActionReport) obj;
                    if (!C7384Etj.areEqual(this.goalId, activityGoalActionReport.goalId) || !C7384Etj.areEqual(this.actionId, activityGoalActionReport.actionId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ActivityGoalActionReport copy$default(ActivityGoalActionReport activityGoalActionReport, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activityGoalActionReport.goalId;
            }
            if ((i & 2) != 0) {
                str2 = activityGoalActionReport.actionId;
            }
            AnonymousClass003.A0u(str, str2);
            return new ActivityGoalActionReport(str, str2);
        }

        public final String component1() {
            return this.goalId;
        }

        public final String component2() {
            return this.actionId;
        }

        public final String getActionId() {
            return this.actionId;
        }

        public final String getGoalId() {
            return this.goalId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            String strEncode = Uri.encode(this.goalId);
            C7384Etj.A0U(strEncode);
            String strEncode2 = Uri.encode(this.actionId);
            C7384Etj.A0U(strEncode2);
            return FGI.A0d("activity/goals/", strEncode, "/actions/", strEncode2);
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.actionId, AnonymousClass001.A0G(this.goalId));
        }

        public String toString() {
            return FGI.A0h("ActivityGoalActionReport(goalId=", this.goalId, ", actionId=", this.actionId, ")");
        }

        public ActivityGoalActionReport(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.goalId = str;
            this.actionId = str2;
        }

        public final ActivityGoalActionReport copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new ActivityGoalActionReport(str, str2);
        }
    }

    /* loaded from: classes2.dex */
    public final class ActivityGoalActions implements JarvisPath {
        public final String goalId;

        public ActivityGoalActions(String str) {
            C7384Etj.A0Y(str, 0);
            this.goalId = str;
        }

        public final ActivityGoalActions copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ActivityGoalActions(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ActivityGoalActions) && C7384Etj.areEqual(this.goalId, ((ActivityGoalActions) obj).goalId));
        }

        public static /* synthetic */ ActivityGoalActions copy$default(ActivityGoalActions activityGoalActions, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activityGoalActions.goalId;
            }
            C7384Etj.A0Y(str, 0);
            return new ActivityGoalActions(str);
        }

        public final String component1() {
            return this.goalId;
        }

        public final String getGoalId() {
            return this.goalId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            String strEncode = Uri.encode(this.goalId);
            C7384Etj.A0U(strEncode);
            return FGI.A0U("activity/goals/", strEncode, "/actions");
        }

        public int hashCode() {
            return this.goalId.hashCode();
        }

        public String toString() {
            return FGI.A0U("ActivityGoalActions(goalId=", this.goalId, ")");
        }
    }

    /* loaded from: classes3.dex */
    public final class ApiKeyAuthCallback implements JarvisPath {
        public static final ApiKeyAuthCallback INSTANCE = new ApiKeyAuthCallback();
        public static final String value = "api_key_auth/callback";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ApiKeyAuthCallback);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ApiKeyAuthCallback";
        }

        public int hashCode() {
            return -2006740366;
        }
    }

    /* loaded from: classes2.dex */
    public final class ApprovalEditMessage implements JarvisPath {
        public final String approvalId;

        public ApprovalEditMessage(String str) {
            C7384Etj.A0Y(str, 0);
            this.approvalId = str;
        }

        public final ApprovalEditMessage copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ApprovalEditMessage(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ApprovalEditMessage) && C7384Etj.areEqual(this.approvalId, ((ApprovalEditMessage) obj).approvalId));
        }

        public static /* synthetic */ ApprovalEditMessage copy$default(ApprovalEditMessage approvalEditMessage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = approvalEditMessage.approvalId;
            }
            C7384Etj.A0Y(str, 0);
            return new ApprovalEditMessage(str);
        }

        public final String component1() {
            return this.approvalId;
        }

        public final String getApprovalId() {
            return this.approvalId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("approvals/", Uri.encode(this.approvalId), "/edit-message");
        }

        public int hashCode() {
            return this.approvalId.hashCode();
        }

        public String toString() {
            return FGI.A0U("ApprovalEditMessage(approvalId=", this.approvalId, ")");
        }
    }

    /* loaded from: classes2.dex */
    public final class ApprovalEditableMessage implements JarvisPath {
        public final String approvalId;

        public ApprovalEditableMessage(String str) {
            C7384Etj.A0Y(str, 0);
            this.approvalId = str;
        }

        public final ApprovalEditableMessage copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ApprovalEditableMessage(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ApprovalEditableMessage) && C7384Etj.areEqual(this.approvalId, ((ApprovalEditableMessage) obj).approvalId));
        }

        public static /* synthetic */ ApprovalEditableMessage copy$default(ApprovalEditableMessage approvalEditableMessage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = approvalEditableMessage.approvalId;
            }
            C7384Etj.A0Y(str, 0);
            return new ApprovalEditableMessage(str);
        }

        public final String component1() {
            return this.approvalId;
        }

        public final String getApprovalId() {
            return this.approvalId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("approvals/", Uri.encode(this.approvalId), "/editable-message");
        }

        public int hashCode() {
            return this.approvalId.hashCode();
        }

        public String toString() {
            return FGI.A0U("ApprovalEditableMessage(approvalId=", this.approvalId, ")");
        }
    }

    /* loaded from: classes2.dex */
    public final class Approvals implements JarvisPath {
        public static final Approvals INSTANCE = new Approvals();
        public static final String value = "approvals";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Approvals);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Approvals";
        }

        public int hashCode() {
            return -111423312;
        }
    }

    /* loaded from: classes2.dex */
    public final class ApprovalsBatchDecide implements JarvisPath {
        public static final ApprovalsBatchDecide INSTANCE = new ApprovalsBatchDecide();
        public static final String value = "approvals/batch-decide";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ApprovalsBatchDecide);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ApprovalsBatchDecide";
        }

        public int hashCode() {
            return 359920754;
        }
    }

    /* loaded from: classes.dex */
    public final class Artifacts implements JarvisPath {
        public static final Artifacts INSTANCE = new Artifacts();
        public static final String value = "api/artifacts";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Artifacts);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Artifacts";
        }

        public int hashCode() {
            return -1932319999;
        }
    }

    /* loaded from: classes3.dex */
    public final class ArtifactsFetchUrl implements JarvisPath {
        public static final ArtifactsFetchUrl INSTANCE = new ArtifactsFetchUrl();
        public static final String value = "artifacts/fetch_url";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ArtifactsFetchUrl);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ArtifactsFetchUrl";
        }

        public int hashCode() {
            return 188877430;
        }
    }

    /* loaded from: classes.dex */
    public final class ArtifactsPlacement implements JarvisPath {
        public static final ArtifactsPlacement INSTANCE = new ArtifactsPlacement();
        public static final String value = "api/artifacts/placement";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ArtifactsPlacement);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ArtifactsPlacement";
        }

        public int hashCode() {
            return 295559396;
        }
    }

    /* loaded from: classes3.dex */
    public final class ArtifactsRemove implements JarvisPath {
        public static final ArtifactsRemove INSTANCE = new ArtifactsRemove();
        public static final String value = "artifacts/remove";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ArtifactsRemove);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ArtifactsRemove";
        }

        public int hashCode() {
            return -1555889435;
        }
    }

    /* loaded from: classes3.dex */
    public final class ArtifactsShare implements JarvisPath {
        public static final ArtifactsShare INSTANCE = new ArtifactsShare();
        public static final String value = "artifacts/share";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ArtifactsShare);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ArtifactsShare";
        }

        public int hashCode() {
            return 1059190110;
        }
    }

    /* loaded from: classes.dex */
    public final class AvatarVideos implements JarvisPath {
        public static final AvatarVideos INSTANCE = new AvatarVideos();
        public static final String value = "api/avatar/videos";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AvatarVideos);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AvatarVideos";
        }

        public int hashCode() {
            return -463773711;
        }
    }

    /* loaded from: classes2.dex */
    public final class BootstrapReset implements JarvisPath {
        public static final BootstrapReset INSTANCE = new BootstrapReset();
        public static final String value = "bootstrap/reset";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BootstrapReset);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "BootstrapReset";
        }

        public int hashCode() {
            return 562993505;
        }
    }

    /* loaded from: classes.dex */
    public final class ChannelsLink implements JarvisPath {
        public static final ChannelsLink INSTANCE = new ChannelsLink();
        public static final String value = "channels/link";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChannelsLink);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChannelsLink";
        }

        public int hashCode() {
            return 309149130;
        }
    }

    /* loaded from: classes.dex */
    public final class ChannelsStatus implements JarvisPath {
        public static final ChannelsStatus INSTANCE = new ChannelsStatus();
        public static final String value = "channels/status";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChannelsStatus);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChannelsStatus";
        }

        public int hashCode() {
            return 949758402;
        }
    }

    /* loaded from: classes.dex */
    public final class ChannelsUnlink implements JarvisPath {
        public static final ChannelsUnlink INSTANCE = new ChannelsUnlink();
        public static final String value = "channels/unlink";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChannelsUnlink);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChannelsUnlink";
        }

        public int hashCode() {
            return 1001792483;
        }
    }

    /* loaded from: classes3.dex */
    public final class ChatDeleteTurn implements JarvisPath {
        public static final ChatDeleteTurn INSTANCE = new ChatDeleteTurn();
        public static final String value = "api/chat/delete-turn";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatDeleteTurn);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChatDeleteTurn";
        }

        public int hashCode() {
            return -188009440;
        }
    }

    /* loaded from: classes3.dex */
    public final class ChatHistory implements JarvisPath {
        public static final ChatHistory INSTANCE = new ChatHistory();
        public static final String value = "chat/history";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatHistory);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChatHistory";
        }

        public int hashCode() {
            return -1800971204;
        }
    }

    /* loaded from: classes3.dex */
    public final class ChatPoke implements JarvisPath {
        public static final ChatPoke INSTANCE = new ChatPoke();
        public static final String value = "api/chat/poke";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatPoke);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChatPoke";
        }

        public int hashCode() {
            return -721387279;
        }
    }

    /* loaded from: classes3.dex */
    public final class ChatSeen implements JarvisPath {
        public final String scope;

        public ChatSeen(String str) {
            C7384Etj.A0Y(str, 0);
            this.scope = str;
        }

        public final ChatSeen copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ChatSeen(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ChatSeen) && C7384Etj.areEqual(this.scope, ((ChatSeen) obj).scope));
        }

        public static /* synthetic */ ChatSeen copy$default(ChatSeen chatSeen, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chatSeen.scope;
            }
            C7384Etj.A0Y(str, 0);
            return new ChatSeen(str);
        }

        public final String component1() {
            return this.scope;
        }

        public final String getScope() {
            return this.scope;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("api/chat/", this.scope, "/seen");
        }

        public int hashCode() {
            return this.scope.hashCode();
        }

        public String toString() {
            return C60O.A0r("ChatSeen(scope=", this.scope);
        }
    }

    /* loaded from: classes2.dex */
    public final class ChatThemes implements JarvisPath {
        public static final ChatThemes INSTANCE = new ChatThemes();
        public static final String value = "api/chat/themes";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatThemes);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChatThemes";
        }

        public int hashCode() {
            return -1655556318;
        }
    }

    /* loaded from: classes2.dex */
    public final class ChatThemesSet implements JarvisPath {
        public static final ChatThemesSet INSTANCE = new ChatThemesSet();
        public static final String value = "api/chat/themes/set";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatThemesSet);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChatThemesSet";
        }

        public int hashCode() {
            return -1568726560;
        }
    }

    /* loaded from: classes3.dex */
    public final class ChatUnreadCount implements JarvisPath {
        public static final ChatUnreadCount INSTANCE = new ChatUnreadCount();
        public static final String value = "api/chat/unread-count";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatUnreadCount);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChatUnreadCount";
        }

        public int hashCode() {
            return -1472379320;
        }
    }

    /* loaded from: classes.dex */
    public final class ClientRuntimeState implements JarvisPath {
        public static final ClientRuntimeState INSTANCE = new ClientRuntimeState();
        public static final String value = "api/client/runtime-state";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ClientRuntimeState);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ClientRuntimeState";
        }

        public int hashCode() {
            return -862220060;
        }
    }

    /* loaded from: classes.dex */
    public final class Connector implements JarvisPath {
        public final String encodedConnectorId;

        public Connector(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedConnectorId = str;
        }

        public final Connector copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Connector(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Connector) && C7384Etj.areEqual(this.encodedConnectorId, ((Connector) obj).encodedConnectorId));
        }

        public static /* synthetic */ Connector copy$default(Connector connector, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connector.encodedConnectorId;
            }
            C7384Etj.A0Y(str, 0);
            return new Connector(str);
        }

        public final String component1() {
            return this.encodedConnectorId;
        }

        public final String getEncodedConnectorId() {
            return this.encodedConnectorId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("connectors/", this.encodedConnectorId);
        }

        public int hashCode() {
            return this.encodedConnectorId.hashCode();
        }

        public String toString() {
            return FGI.A0U("Connector(encodedConnectorId=", this.encodedConnectorId, ")");
        }
    }

    /* loaded from: classes3.dex */
    public final class ConnectorAccountReconnect implements JarvisPath {
        public final String encodedAccountId;
        public final String encodedConnectorId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ConnectorAccountReconnect) {
                    ConnectorAccountReconnect connectorAccountReconnect = (ConnectorAccountReconnect) obj;
                    if (!C7384Etj.areEqual(this.encodedConnectorId, connectorAccountReconnect.encodedConnectorId) || !C7384Etj.areEqual(this.encodedAccountId, connectorAccountReconnect.encodedAccountId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ConnectorAccountReconnect copy$default(ConnectorAccountReconnect connectorAccountReconnect, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connectorAccountReconnect.encodedConnectorId;
            }
            if ((i & 2) != 0) {
                str2 = connectorAccountReconnect.encodedAccountId;
            }
            AnonymousClass003.A0u(str, str2);
            return new ConnectorAccountReconnect(str, str2);
        }

        public final String component1() {
            return this.encodedConnectorId;
        }

        public final String component2() {
            return this.encodedAccountId;
        }

        public final String getEncodedAccountId() {
            return this.encodedAccountId;
        }

        public final String getEncodedConnectorId() {
            return this.encodedConnectorId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0h("api/connectors/", this.encodedConnectorId, "/accounts/", this.encodedAccountId, "/reconnect");
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.encodedAccountId, AnonymousClass001.A0G(this.encodedConnectorId));
        }

        public String toString() {
            return FGI.A0h("ConnectorAccountReconnect(encodedConnectorId=", this.encodedConnectorId, ", encodedAccountId=", this.encodedAccountId, ")");
        }

        public ConnectorAccountReconnect(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.encodedConnectorId = str;
            this.encodedAccountId = str2;
        }

        public final ConnectorAccountReconnect copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new ConnectorAccountReconnect(str, str2);
        }
    }

    /* loaded from: classes3.dex */
    public final class ConnectorAccountUnlink implements JarvisPath {
        public final String encodedAccountId;
        public final String encodedConnectorId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ConnectorAccountUnlink) {
                    ConnectorAccountUnlink connectorAccountUnlink = (ConnectorAccountUnlink) obj;
                    if (!C7384Etj.areEqual(this.encodedConnectorId, connectorAccountUnlink.encodedConnectorId) || !C7384Etj.areEqual(this.encodedAccountId, connectorAccountUnlink.encodedAccountId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ConnectorAccountUnlink copy$default(ConnectorAccountUnlink connectorAccountUnlink, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connectorAccountUnlink.encodedConnectorId;
            }
            if ((i & 2) != 0) {
                str2 = connectorAccountUnlink.encodedAccountId;
            }
            AnonymousClass003.A0u(str, str2);
            return new ConnectorAccountUnlink(str, str2);
        }

        public final String component1() {
            return this.encodedConnectorId;
        }

        public final String component2() {
            return this.encodedAccountId;
        }

        public final String getEncodedAccountId() {
            return this.encodedAccountId;
        }

        public final String getEncodedConnectorId() {
            return this.encodedConnectorId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0h("api/connectors/", this.encodedConnectorId, "/accounts/", this.encodedAccountId, "/unlink");
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.encodedAccountId, AnonymousClass001.A0G(this.encodedConnectorId));
        }

        public String toString() {
            return FGI.A0h("ConnectorAccountUnlink(encodedConnectorId=", this.encodedConnectorId, ", encodedAccountId=", this.encodedAccountId, ")");
        }

        public ConnectorAccountUnlink(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.encodedConnectorId = str;
            this.encodedAccountId = str2;
        }

        public final ConnectorAccountUnlink copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new ConnectorAccountUnlink(str, str2);
        }
    }

    /* loaded from: classes3.dex */
    public final class ConnectorAccounts implements JarvisPath {
        public final String encodedConnectorId;

        public ConnectorAccounts(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedConnectorId = str;
        }

        public final ConnectorAccounts copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ConnectorAccounts(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ConnectorAccounts) && C7384Etj.areEqual(this.encodedConnectorId, ((ConnectorAccounts) obj).encodedConnectorId));
        }

        public static /* synthetic */ ConnectorAccounts copy$default(ConnectorAccounts connectorAccounts, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connectorAccounts.encodedConnectorId;
            }
            C7384Etj.A0Y(str, 0);
            return new ConnectorAccounts(str);
        }

        public final String component1() {
            return this.encodedConnectorId;
        }

        public final String getEncodedConnectorId() {
            return this.encodedConnectorId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("api/connectors/", this.encodedConnectorId, "/accounts");
        }

        public int hashCode() {
            return this.encodedConnectorId.hashCode();
        }

        public String toString() {
            return C60O.A0r("ConnectorAccounts(encodedConnectorId=", this.encodedConnectorId);
        }
    }

    /* loaded from: classes3.dex */
    public final class ConnectorAccountsLink implements JarvisPath {
        public final String encodedConnectorId;

        public ConnectorAccountsLink(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedConnectorId = str;
        }

        public final ConnectorAccountsLink copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ConnectorAccountsLink(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ConnectorAccountsLink) && C7384Etj.areEqual(this.encodedConnectorId, ((ConnectorAccountsLink) obj).encodedConnectorId));
        }

        public static /* synthetic */ ConnectorAccountsLink copy$default(ConnectorAccountsLink connectorAccountsLink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connectorAccountsLink.encodedConnectorId;
            }
            C7384Etj.A0Y(str, 0);
            return new ConnectorAccountsLink(str);
        }

        public final String component1() {
            return this.encodedConnectorId;
        }

        public final String getEncodedConnectorId() {
            return this.encodedConnectorId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("api/connectors/", this.encodedConnectorId, SkillConnectConfigKt.CONNECTOR_ACCOUNT_LINK_PATH_SUFFIX);
        }

        public int hashCode() {
            return this.encodedConnectorId.hashCode();
        }

        public String toString() {
            return C60O.A0r("ConnectorAccountsLink(encodedConnectorId=", this.encodedConnectorId);
        }
    }

    /* loaded from: classes.dex */
    public final class ConnectorConnectInfo implements JarvisPath {
        public final String encodedConnectorId;

        public ConnectorConnectInfo(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedConnectorId = str;
        }

        public final ConnectorConnectInfo copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ConnectorConnectInfo(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ConnectorConnectInfo) && C7384Etj.areEqual(this.encodedConnectorId, ((ConnectorConnectInfo) obj).encodedConnectorId));
        }

        public static /* synthetic */ ConnectorConnectInfo copy$default(ConnectorConnectInfo connectorConnectInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connectorConnectInfo.encodedConnectorId;
            }
            C7384Etj.A0Y(str, 0);
            return new ConnectorConnectInfo(str);
        }

        public final String component1() {
            return this.encodedConnectorId;
        }

        public final String getEncodedConnectorId() {
            return this.encodedConnectorId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("connectors/", this.encodedConnectorId, "/connect/info");
        }

        public int hashCode() {
            return this.encodedConnectorId.hashCode();
        }

        public String toString() {
            return FGI.A0U("ConnectorConnectInfo(encodedConnectorId=", this.encodedConnectorId, ")");
        }
    }

    /* loaded from: classes.dex */
    public final class ConnectorPermissionScopeLink implements JarvisPath {
        public final String encodedConnectorId;
        public final String encodedMethod;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ConnectorPermissionScopeLink) {
                    ConnectorPermissionScopeLink connectorPermissionScopeLink = (ConnectorPermissionScopeLink) obj;
                    if (!C7384Etj.areEqual(this.encodedConnectorId, connectorPermissionScopeLink.encodedConnectorId) || !C7384Etj.areEqual(this.encodedMethod, connectorPermissionScopeLink.encodedMethod)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ConnectorPermissionScopeLink copy$default(ConnectorPermissionScopeLink connectorPermissionScopeLink, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connectorPermissionScopeLink.encodedConnectorId;
            }
            if ((i & 2) != 0) {
                str2 = connectorPermissionScopeLink.encodedMethod;
            }
            AnonymousClass003.A0u(str, str2);
            return new ConnectorPermissionScopeLink(str, str2);
        }

        public final String component1() {
            return this.encodedConnectorId;
        }

        public final String component2() {
            return this.encodedMethod;
        }

        public final String getEncodedConnectorId() {
            return this.encodedConnectorId;
        }

        public final String getEncodedMethod() {
            return this.encodedMethod;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0h("connectors/", this.encodedConnectorId, "/scopes/", this.encodedMethod, "/link");
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.encodedMethod, AnonymousClass001.A0G(this.encodedConnectorId));
        }

        public String toString() {
            return FGI.A0h("ConnectorPermissionScopeLink(encodedConnectorId=", this.encodedConnectorId, ", encodedMethod=", this.encodedMethod, ")");
        }

        public ConnectorPermissionScopeLink(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.encodedConnectorId = str;
            this.encodedMethod = str2;
        }

        public final ConnectorPermissionScopeLink copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new ConnectorPermissionScopeLink(str, str2);
        }
    }

    /* loaded from: classes.dex */
    public final class ConnectorPermissions implements JarvisPath {
        public final String encodedConnectorId;

        public ConnectorPermissions(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedConnectorId = str;
        }

        public final ConnectorPermissions copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ConnectorPermissions(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ConnectorPermissions) && C7384Etj.areEqual(this.encodedConnectorId, ((ConnectorPermissions) obj).encodedConnectorId));
        }

        public static /* synthetic */ ConnectorPermissions copy$default(ConnectorPermissions connectorPermissions, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connectorPermissions.encodedConnectorId;
            }
            C7384Etj.A0Y(str, 0);
            return new ConnectorPermissions(str);
        }

        public final String component1() {
            return this.encodedConnectorId;
        }

        public final String getEncodedConnectorId() {
            return this.encodedConnectorId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("connectors/", this.encodedConnectorId, "/permissions");
        }

        public int hashCode() {
            return this.encodedConnectorId.hashCode();
        }

        public String toString() {
            return FGI.A0U("ConnectorPermissions(encodedConnectorId=", this.encodedConnectorId, ")");
        }
    }

    /* loaded from: classes3.dex */
    public final class ConnectorReconnect implements JarvisPath {
        public final String encodedConnectorId;

        public ConnectorReconnect(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedConnectorId = str;
        }

        public final ConnectorReconnect copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new ConnectorReconnect(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ConnectorReconnect) && C7384Etj.areEqual(this.encodedConnectorId, ((ConnectorReconnect) obj).encodedConnectorId));
        }

        public static /* synthetic */ ConnectorReconnect copy$default(ConnectorReconnect connectorReconnect, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connectorReconnect.encodedConnectorId;
            }
            C7384Etj.A0Y(str, 0);
            return new ConnectorReconnect(str);
        }

        public final String component1() {
            return this.encodedConnectorId;
        }

        public final String getEncodedConnectorId() {
            return this.encodedConnectorId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("api/connectors/", this.encodedConnectorId, "/reconnect");
        }

        public int hashCode() {
            return this.encodedConnectorId.hashCode();
        }

        public String toString() {
            return C60O.A0r("ConnectorReconnect(encodedConnectorId=", this.encodedConnectorId);
        }
    }

    /* loaded from: classes.dex */
    public final class Connectors implements JarvisPath {
        public static final Connectors INSTANCE = new Connectors();
        public static final String value = "api/connectors";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Connectors);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Connectors";
        }

        public int hashCode() {
            return -788665434;
        }
    }

    /* loaded from: classes.dex */
    public final class ConnectorsHomepage implements JarvisPath {
        public static final ConnectorsHomepage INSTANCE = new ConnectorsHomepage();
        public static final String value = "connectors/homepage";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectorsHomepage);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ConnectorsHomepage";
        }

        public int hashCode() {
            return 1630476724;
        }
    }

    /* loaded from: classes3.dex */
    public final class ConsentAuthCallback implements JarvisPath {
        public static final ConsentAuthCallback INSTANCE = new ConsentAuthCallback();
        public static final String value = "consent_auth/callback";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConsentAuthCallback);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ConsentAuthCallback";
        }

        public int hashCode() {
            return 1894399335;
        }
    }

    /* loaded from: classes.dex */
    public final class CredentialsCapture implements JarvisPath {
        public static final CredentialsCapture INSTANCE = new CredentialsCapture();
        public static final String value = "v1/credentials/capture";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CredentialsCapture);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CredentialsCapture";
        }

        public int hashCode() {
            return -1520263542;
        }
    }

    /* loaded from: classes2.dex */
    public final class CredentialsCaptureExternalProviderRequest implements JarvisPath {
        public static final CredentialsCaptureExternalProviderRequest INSTANCE = new CredentialsCaptureExternalProviderRequest();
        public static final String value = "v1/credentials/capture/external-provider/request";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CredentialsCaptureExternalProviderRequest);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CredentialsCaptureExternalProviderRequest";
        }

        public int hashCode() {
            return -1402960343;
        }
    }

    /* loaded from: classes2.dex */
    public final class CredentialsCatalog implements JarvisPath {
        public static final CredentialsCatalog INSTANCE = new CredentialsCatalog();
        public static final String value = "v1/credentials/catalog";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CredentialsCatalog);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CredentialsCatalog";
        }

        public int hashCode() {
            return -1517144227;
        }
    }

    /* loaded from: classes2.dex */
    public final class CredentialsCatalogDelete implements JarvisPath {
        public static final CredentialsCatalogDelete INSTANCE = new CredentialsCatalogDelete();
        public static final String value = "v1/credentials/catalog/delete";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CredentialsCatalogDelete);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CredentialsCatalogDelete";
        }

        public int hashCode() {
            return -667160728;
        }
    }

    /* loaded from: classes2.dex */
    public final class CredentialsCatalogDetails implements JarvisPath {
        public static final CredentialsCatalogDetails INSTANCE = new CredentialsCatalogDetails();
        public static final String value = "v1/credentials/catalog/details";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CredentialsCatalogDetails);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CredentialsCatalogDetails";
        }

        public int hashCode() {
            return 800112677;
        }
    }

    /* loaded from: classes2.dex */
    public final class CredentialsCatalogUpdate implements JarvisPath {
        public static final CredentialsCatalogUpdate INSTANCE = new CredentialsCatalogUpdate();
        public static final String value = "v1/credentials/catalog/update";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CredentialsCatalogUpdate);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "CredentialsCatalogUpdate";
        }

        public int hashCode() {
            return -170548602;
        }
    }

    /* loaded from: classes.dex */
    public final class DisconnectConnector implements JarvisPath {
        public final String encodedConnectorId;

        public DisconnectConnector(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedConnectorId = str;
        }

        public final DisconnectConnector copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new DisconnectConnector(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof DisconnectConnector) && C7384Etj.areEqual(this.encodedConnectorId, ((DisconnectConnector) obj).encodedConnectorId));
        }

        public static /* synthetic */ DisconnectConnector copy$default(DisconnectConnector disconnectConnector, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = disconnectConnector.encodedConnectorId;
            }
            C7384Etj.A0Y(str, 0);
            return new DisconnectConnector(str);
        }

        public final String component1() {
            return this.encodedConnectorId;
        }

        public final String getEncodedConnectorId() {
            return this.encodedConnectorId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("api/connectors/", this.encodedConnectorId, "/disconnect");
        }

        public int hashCode() {
            return this.encodedConnectorId.hashCode();
        }

        public String toString() {
            return FGI.A0U("DisconnectConnector(encodedConnectorId=", this.encodedConnectorId, ")");
        }
    }

    /* loaded from: classes3.dex */
    public final class DyiExport implements JarvisPath {
        public static final DyiExport INSTANCE = new DyiExport();
        public static final String value = "api/dyi/export";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DyiExport);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "DyiExport";
        }

        public int hashCode() {
            return -1636151960;
        }
    }

    /* loaded from: classes.dex */
    public interface Extension extends JarvisPath {
    }

    /* loaded from: classes6.dex */
    public final class FeedUnitMedia implements JarvisPath {
        public final String handle;
        public final String unitId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FeedUnitMedia) {
                    FeedUnitMedia feedUnitMedia = (FeedUnitMedia) obj;
                    if (!C7384Etj.areEqual(this.unitId, feedUnitMedia.unitId) || !C7384Etj.areEqual(this.handle, feedUnitMedia.handle)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ FeedUnitMedia copy$default(FeedUnitMedia feedUnitMedia, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedUnitMedia.unitId;
            }
            if ((i & 2) != 0) {
                str2 = feedUnitMedia.handle;
            }
            AnonymousClass003.A0u(str, str2);
            return new FeedUnitMedia(str, str2);
        }

        public final String component1() {
            return this.unitId;
        }

        public final String component2() {
            return this.handle;
        }

        public final String getHandle() {
            return this.handle;
        }

        public final String getUnitId() {
            return this.unitId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            String strEncode = Uri.encode(this.unitId);
            C7384Etj.A0U(strEncode);
            String strEncode2 = Uri.encode(this.handle);
            C7384Etj.A0U(strEncode2);
            return FGI.A0d("api/feed/units/", strEncode, "/media/", strEncode2);
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.handle, AnonymousClass001.A0G(this.unitId));
        }

        public String toString() {
            return FGI.A0c("FeedUnitMedia(unitId=", this.unitId, ", handle=", this.handle);
        }

        public FeedUnitMedia(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.unitId = str;
            this.handle = str2;
        }

        public final FeedUnitMedia copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new FeedUnitMedia(str, str2);
        }
    }

    /* loaded from: classes3.dex */
    public final class FoaAccounts implements JarvisPath {
        public static final FoaAccounts INSTANCE = new FoaAccounts();
        public static final String value = "api/foa/accounts";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FoaAccounts);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FoaAccounts";
        }

        public int hashCode() {
            return -649143586;
        }
    }

    /* loaded from: classes2.dex */
    public final class FoaAuthCallback implements JarvisPath {
        public static final FoaAuthCallback INSTANCE = new FoaAuthCallback();
        public static final String value = "api/foa_auth/callback";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FoaAuthCallback);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FoaAuthCallback";
        }

        public int hashCode() {
            return 706288901;
        }
    }

    /* loaded from: classes3.dex */
    public final class FsDelete implements JarvisPath {
        public static final FsDelete INSTANCE = new FsDelete();
        public static final String value = "fs/delete";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FsDelete);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FsDelete";
        }

        public int hashCode() {
            return 541408952;
        }
    }

    /* loaded from: classes3.dex */
    public final class FsExport implements JarvisPath {
        public static final FsExport INSTANCE = new FsExport();
        public static final String value = "fs/export";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FsExport);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FsExport";
        }

        public int hashCode() {
            return 587713729;
        }
    }

    /* loaded from: classes3.dex */
    public final class FsLibrary implements JarvisPath {
        public static final FsLibrary INSTANCE = new FsLibrary();
        public static final String value = "fs/library";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FsLibrary);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FsLibrary";
        }

        public int hashCode() {
            return -1780445874;
        }
    }

    /* loaded from: classes3.dex */
    public final class FsList implements JarvisPath {
        public static final FsList INSTANCE = new FsList();
        public static final String value = "fs/list";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FsList);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FsList";
        }

        public int hashCode() {
            return 2056669419;
        }
    }

    /* loaded from: classes3.dex */
    public final class FsRaw implements JarvisPath {
        public final String encodedPath;

        public FsRaw(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedPath = str;
        }

        public final FsRaw copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new FsRaw(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof FsRaw) && C7384Etj.areEqual(this.encodedPath, ((FsRaw) obj).encodedPath));
        }

        public static /* synthetic */ FsRaw copy$default(FsRaw fsRaw, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fsRaw.encodedPath;
            }
            C7384Etj.A0Y(str, 0);
            return new FsRaw(str);
        }

        public final String component1() {
            return this.encodedPath;
        }

        public final String getEncodedPath() {
            return this.encodedPath;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("fs/raw/", this.encodedPath);
        }

        public int hashCode() {
            return this.encodedPath.hashCode();
        }

        public String toString() {
            return C60O.A0r("FsRaw(encodedPath=", this.encodedPath);
        }
    }

    /* loaded from: classes3.dex */
    public final class FsRead implements JarvisPath {
        public static final FsRead INSTANCE = new FsRead();
        public static final String value = "fs/read";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FsRead);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FsRead";
        }

        public int hashCode() {
            return 2056843747;
        }
    }

    /* loaded from: classes3.dex */
    public final class FsRename implements JarvisPath {
        public static final FsRename INSTANCE = new FsRename();
        public static final String value = "fs/rename";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FsRename);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FsRename";
        }

        public int hashCode() {
            return 942272587;
        }
    }

    /* loaded from: classes3.dex */
    public final class FsSearch implements JarvisPath {
        public static final FsSearch INSTANCE = new FsSearch();
        public static final String value = "fs/search";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FsSearch);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FsSearch";
        }

        public int hashCode() {
            return 970530485;
        }
    }

    /* loaded from: classes3.dex */
    public final class FsStat implements JarvisPath {
        public static final FsStat INSTANCE = new FsStat();
        public static final String value = "fs/stat";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FsStat);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FsStat";
        }

        public int hashCode() {
            return 2056887969;
        }
    }

    /* loaded from: classes3.dex */
    public final class FsThumbnail implements JarvisPath {
        public final String encodedPath;

        public FsThumbnail(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedPath = str;
        }

        public final FsThumbnail copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new FsThumbnail(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof FsThumbnail) && C7384Etj.areEqual(this.encodedPath, ((FsThumbnail) obj).encodedPath));
        }

        public static /* synthetic */ FsThumbnail copy$default(FsThumbnail fsThumbnail, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fsThumbnail.encodedPath;
            }
            C7384Etj.A0Y(str, 0);
            return new FsThumbnail(str);
        }

        public final String component1() {
            return this.encodedPath;
        }

        public final String getEncodedPath() {
            return this.encodedPath;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("fs/thumbnail/", this.encodedPath);
        }

        public int hashCode() {
            return this.encodedPath.hashCode();
        }

        public String toString() {
            return C60O.A0r("FsThumbnail(encodedPath=", this.encodedPath);
        }
    }

    /* loaded from: classes3.dex */
    public final class FsUpload implements JarvisPath {
        public static final FsUpload INSTANCE = new FsUpload();
        public static final String value = "fs/upload";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FsUpload);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FsUpload";
        }

        public int hashCode() {
            return 1038272270;
        }
    }

    /* loaded from: classes3.dex */
    public final class FsWrite implements JarvisPath {
        public static final FsWrite INSTANCE = new FsWrite();
        public static final String value = "fs/write";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FsWrite);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FsWrite";
        }

        public int hashCode() {
            return -657340110;
        }
    }

    /* loaded from: classes2.dex */
    public final class Goal implements JarvisPath {
        public final String goalId;

        public Goal(String str) {
            C7384Etj.A0Y(str, 0);
            this.goalId = str;
        }

        public final Goal copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Goal(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Goal) && C7384Etj.areEqual(this.goalId, ((Goal) obj).goalId));
        }

        public static /* synthetic */ Goal copy$default(Goal goal, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = goal.goalId;
            }
            C7384Etj.A0Y(str, 0);
            return new Goal(str);
        }

        public final String component1() {
            return this.goalId;
        }

        public final String getGoalId() {
            return this.goalId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("goals/", this.goalId);
        }

        public int hashCode() {
            return this.goalId.hashCode();
        }

        public String toString() {
            return FGI.A0U("Goal(goalId=", this.goalId, ")");
        }
    }

    /* loaded from: classes.dex */
    public final class GoalEngagement implements JarvisPath {
        public final String goalId;

        public GoalEngagement(String str) {
            C7384Etj.A0Y(str, 0);
            this.goalId = str;
        }

        public final GoalEngagement copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new GoalEngagement(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof GoalEngagement) && C7384Etj.areEqual(this.goalId, ((GoalEngagement) obj).goalId));
        }

        public static /* synthetic */ GoalEngagement copy$default(GoalEngagement goalEngagement, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = goalEngagement.goalId;
            }
            C7384Etj.A0Y(str, 0);
            return new GoalEngagement(str);
        }

        public final String component1() {
            return this.goalId;
        }

        public final String getGoalId() {
            return this.goalId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("api/goals/", this.goalId, "/engagement");
        }

        public int hashCode() {
            return this.goalId.hashCode();
        }

        public String toString() {
            return FGI.A0U("GoalEngagement(goalId=", this.goalId, ")");
        }
    }

    /* loaded from: classes.dex */
    public final class Goals implements JarvisPath {
        public static final Goals INSTANCE = new Goals();
        public static final String value = "goals";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Goals);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Goals";
        }

        public int hashCode() {
            return 2145378784;
        }
    }

    /* loaded from: classes2.dex */
    public final class GoalsFixedPositions implements JarvisPath {
        public static final GoalsFixedPositions INSTANCE = new GoalsFixedPositions();
        public static final String value = "goals_fixed_positions";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof GoalsFixedPositions);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "GoalsFixedPositions";
        }

        public int hashCode() {
            return 2143604054;
        }
    }

    /* loaded from: classes3.dex */
    public final class Health implements JarvisPath {
        public static final Health INSTANCE = new Health();
        public static final String value = "health";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Health);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Health";
        }

        public int hashCode() {
            return 2101626940;
        }
    }

    /* loaded from: classes.dex */
    public final class IdeaCardMedia implements JarvisPath {
        public final String handle;

        public IdeaCardMedia(String str) {
            C7384Etj.A0Y(str, 0);
            this.handle = str;
        }

        public final IdeaCardMedia copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new IdeaCardMedia(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof IdeaCardMedia) && C7384Etj.areEqual(this.handle, ((IdeaCardMedia) obj).handle));
        }

        public static /* synthetic */ IdeaCardMedia copy$default(IdeaCardMedia ideaCardMedia, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ideaCardMedia.handle;
            }
            C7384Etj.A0Y(str, 0);
            return new IdeaCardMedia(str);
        }

        public final String component1() {
            return this.handle;
        }

        public final String getHandle() {
            return this.handle;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("api/idea-cards/media/", this.handle);
        }

        public int hashCode() {
            return this.handle.hashCode();
        }

        public String toString() {
            return FGI.A0U("IdeaCardMedia(handle=", this.handle, ")");
        }
    }

    /* loaded from: classes.dex */
    public final class IdeaFeedback implements JarvisPath {
        public final String ideaId;

        public IdeaFeedback(String str) {
            C7384Etj.A0Y(str, 0);
            this.ideaId = str;
        }

        public final IdeaFeedback copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new IdeaFeedback(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof IdeaFeedback) && C7384Etj.areEqual(this.ideaId, ((IdeaFeedback) obj).ideaId));
        }

        public static /* synthetic */ IdeaFeedback copy$default(IdeaFeedback ideaFeedback, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ideaFeedback.ideaId;
            }
            C7384Etj.A0Y(str, 0);
            return new IdeaFeedback(str);
        }

        public final String component1() {
            return this.ideaId;
        }

        public final String getIdeaId() {
            return this.ideaId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0U("api/ideas/", this.ideaId, "/feedback");
        }

        public int hashCode() {
            return this.ideaId.hashCode();
        }

        public String toString() {
            return FGI.A0U("IdeaFeedback(ideaId=", this.ideaId, ")");
        }
    }

    /* loaded from: classes2.dex */
    public final class Identity implements JarvisPath {
        public static final Identity INSTANCE = new Identity();
        public static final String value = "identity";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Identity);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Identity";
        }

        public int hashCode() {
            return 2000535198;
        }
    }

    /* loaded from: classes2.dex */
    public final class ListCustomConnectors implements JarvisPath {
        public static final ListCustomConnectors INSTANCE = new ListCustomConnectors();
        public static final String value = "v1/custom-connectors/list";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ListCustomConnectors);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ListCustomConnectors";
        }

        public int hashCode() {
            return -645162315;
        }
    }

    /* loaded from: classes3.dex */
    public final class OAuthCallback implements JarvisPath {
        public static final OAuthCallback INSTANCE = new OAuthCallback();
        public static final String value = "oauth/callback";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof OAuthCallback);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "OAuthCallback";
        }

        public int hashCode() {
            return 55295548;
        }
    }

    /* loaded from: classes3.dex */
    public final class OnboardingComplete implements JarvisPath {
        public static final OnboardingComplete INSTANCE = new OnboardingComplete();
        public static final String value = "api/onboarding/complete";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof OnboardingComplete);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "OnboardingComplete";
        }

        public int hashCode() {
            return -1124534700;
        }
    }

    /* loaded from: classes3.dex */
    public final class OnboardingIdentity implements JarvisPath {
        public static final OnboardingIdentity INSTANCE = new OnboardingIdentity();
        public static final String value = "api/onboarding/identity";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof OnboardingIdentity);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "OnboardingIdentity";
        }

        public int hashCode() {
            return -660851239;
        }
    }

    /* loaded from: classes.dex */
    public final class OnboardingReset implements JarvisPath {
        public static final OnboardingReset INSTANCE = new OnboardingReset();
        public static final String value = "api/onboarding/reset";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof OnboardingReset);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "OnboardingReset";
        }

        public int hashCode() {
            return -150542828;
        }
    }

    public final class OnboardingStart implements JarvisPath {
        public static final OnboardingStart INSTANCE = new OnboardingStart();
        public static final String value = "api/onboarding/v2/start";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof OnboardingStart);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "OnboardingStart";
        }

        public int hashCode() {
            return -149189337;
        }
    }

    /* loaded from: classes3.dex */
    public final class OnboardingTasks implements JarvisPath {
        public static final OnboardingTasks INSTANCE = new OnboardingTasks();
        public static final String value = "api/onboarding/tasks";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof OnboardingTasks);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "OnboardingTasks";
        }

        public int hashCode() {
            return -148814765;
        }
    }

    public final class OnboardingVariants implements JarvisPath {
        public static final OnboardingVariants INSTANCE = new OnboardingVariants();
        public static final String value = "api/onboarding/v2/variants";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof OnboardingVariants);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "OnboardingVariants";
        }

        public int hashCode() {
            return -1774664279;
        }
    }

    /* loaded from: classes3.dex */
    public final class PermissionsActive implements JarvisPath {
        public static final PermissionsActive INSTANCE = new PermissionsActive();
        public static final String value = "permissions/active";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PermissionsActive);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "PermissionsActive";
        }

        public int hashCode() {
            return -1049937206;
        }
    }

    /* loaded from: classes.dex */
    public final class PermissionsConnector implements JarvisPath {
        public final String encodedConnector;

        public PermissionsConnector(String str) {
            C7384Etj.A0Y(str, 0);
            this.encodedConnector = str;
        }

        public final PermissionsConnector copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new PermissionsConnector(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof PermissionsConnector) && C7384Etj.areEqual(this.encodedConnector, ((PermissionsConnector) obj).encodedConnector));
        }

        public static /* synthetic */ PermissionsConnector copy$default(PermissionsConnector permissionsConnector, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = permissionsConnector.encodedConnector;
            }
            C7384Etj.A0Y(str, 0);
            return new PermissionsConnector(str);
        }

        public final String component1() {
            return this.encodedConnector;
        }

        public final String getEncodedConnector() {
            return this.encodedConnector;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("permissions/connectors/", this.encodedConnector);
        }

        public int hashCode() {
            return this.encodedConnector.hashCode();
        }

        public String toString() {
            return FGI.A0U("PermissionsConnector(encodedConnector=", this.encodedConnector, ")");
        }
    }

    /* loaded from: classes3.dex */
    public final class PermissionsRevoke implements JarvisPath {
        public static final PermissionsRevoke INSTANCE = new PermissionsRevoke();
        public static final String value = "permissions/revoke";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PermissionsRevoke);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "PermissionsRevoke";
        }

        public int hashCode() {
            return -561329590;
        }
    }

    /* loaded from: classes2.dex */
    public final class PrimaryChat implements JarvisPath {
        public static final PrimaryChat INSTANCE = new PrimaryChat();
        public static final String value = "api/chats/primary";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryChat);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "PrimaryChat";
        }

        public int hashCode() {
            return -1271682406;
        }
    }

    /* loaded from: classes.dex */
    public final class ProductImprovements implements JarvisPath {
        public static final ProductImprovements INSTANCE = new ProductImprovements();
        public static final String value = "api/product-improvements";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductImprovements);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ProductImprovements";
        }

        public int hashCode() {
            return -399104244;
        }
    }

    /* loaded from: classes3.dex */
    public final class Raw implements JarvisPath {
        public final String value;

        public Raw(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final Raw copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Raw(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Raw) && C7384Etj.areEqual(this.value, ((Raw) obj).value));
        }

        public static /* synthetic */ Raw copy$default(Raw raw, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = raw.value;
            }
            C7384Etj.A0Y(str, 0);
            return new Raw(str);
        }

        public final String component1() {
            return this.value;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return C60O.A0r("Raw(value=", this.value);
        }
    }

    /* loaded from: classes3.dex */
    public final class ReactionsToggle implements JarvisPath {
        public static final ReactionsToggle INSTANCE = new ReactionsToggle();
        public static final String value = "reactions/toggle";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReactionsToggle);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ReactionsToggle";
        }

        public int hashCode() {
            return -1889685122;
        }
    }

    public final class RegisterCustomConnectors implements JarvisPath {
        public static final RegisterCustomConnectors INSTANCE = new RegisterCustomConnectors();
        public static final String value = "v1/custom-connectors/register";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RegisterCustomConnectors);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "RegisterCustomConnectors";
        }

        public int hashCode() {
            return 186154682;
        }
    }

    /* loaded from: classes3.dex */
    public final class SessionArchive implements JarvisPath {
        public static final SessionArchive INSTANCE = new SessionArchive();
        public static final String value = "api/session/archive";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionArchive);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SessionArchive";
        }

        public int hashCode() {
            return -1310300372;
        }
    }

    /* loaded from: classes3.dex */
    public final class SessionDelete implements JarvisPath {
        public static final SessionDelete INSTANCE = new SessionDelete();
        public static final String value = "api/session/delete";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionDelete);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SessionDelete";
        }

        public int hashCode() {
            return -1907783167;
        }
    }

    /* loaded from: classes3.dex */
    public final class SessionDetails implements JarvisPath {
        public final String sessionId;

        public SessionDetails(String str) {
            C7384Etj.A0Y(str, 0);
            this.sessionId = str;
        }

        public final SessionDetails copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new SessionDetails(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SessionDetails) && C7384Etj.areEqual(this.sessionId, ((SessionDetails) obj).sessionId));
        }

        public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionDetails.sessionId;
            }
            C7384Etj.A0Y(str, 0);
            return new SessionDetails(str);
        }

        public final String component1() {
            return this.sessionId;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("api/session/list/", this.sessionId);
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        public String toString() {
            return C60O.A0r("SessionDetails(sessionId=", this.sessionId);
        }
    }

    /* loaded from: classes3.dex */
    public final class SessionHasUnreadThreads implements JarvisPath {
        public static final SessionHasUnreadThreads INSTANCE = new SessionHasUnreadThreads();
        public static final String value = "api/session/has-unread-threads";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionHasUnreadThreads);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SessionHasUnreadThreads";
        }

        public int hashCode() {
            return -540189354;
        }
    }

    /* loaded from: classes3.dex */
    public final class SessionList implements JarvisPath {
        public static final SessionList INSTANCE = new SessionList();
        public static final String value = "api/session/list";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionList);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SessionList";
        }

        public int hashCode() {
            return -426323340;
        }
    }

    /* loaded from: classes3.dex */
    public final class SessionPin implements JarvisPath {
        public static final SessionPin INSTANCE = new SessionPin();
        public static final String value = "api/session/pin";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionPin);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SessionPin";
        }

        public int hashCode() {
            return 1648819455;
        }
    }

    /* loaded from: classes3.dex */
    public final class SessionRename implements JarvisPath {
        public static final SessionRename INSTANCE = new SessionRename();
        public static final String value = "api/session/rename";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionRename);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SessionRename";
        }

        public int hashCode() {
            return -1506919532;
        }
    }

    /* loaded from: classes3.dex */
    public final class SessionUnarchive implements JarvisPath {
        public static final SessionUnarchive INSTANCE = new SessionUnarchive();
        public static final String value = "api/session/unarchive";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionUnarchive);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SessionUnarchive";
        }

        public int hashCode() {
            return 1856403443;
        }
    }

    /* loaded from: classes3.dex */
    public final class SessionUnpin implements JarvisPath {
        public static final SessionUnpin INSTANCE = new SessionUnpin();
        public static final String value = "api/session/unpin";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionUnpin);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SessionUnpin";
        }

        public int hashCode() {
            return -322664122;
        }
    }

    /* loaded from: classes3.dex */
    public final class SpaceShare implements JarvisPath {
        public final String slug;

        public SpaceShare(String str) {
            C7384Etj.A0Y(str, 0);
            this.slug = str;
        }

        public final SpaceShare copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new SpaceShare(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SpaceShare) && C7384Etj.areEqual(this.slug, ((SpaceShare) obj).slug));
        }

        public static /* synthetic */ SpaceShare copy$default(SpaceShare spaceShare, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = spaceShare.slug;
            }
            C7384Etj.A0Y(str, 0);
            return new SpaceShare(str);
        }

        public final String component1() {
            return this.slug;
        }

        public final String getSlug() {
            return this.slug;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return FGI.A0M("spaces/share/", this.slug);
        }

        public int hashCode() {
            return this.slug.hashCode();
        }

        public String toString() {
            return C60O.A0r("SpaceShare(slug=", this.slug);
        }
    }

    /* loaded from: classes.dex */
    public final class SpacesRename implements JarvisPath {
        public static final SpacesRename INSTANCE = new SpacesRename();
        public static final String value = "api/spaces/rename";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SpacesRename);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SpacesRename";
        }

        public int hashCode() {
            return -430629973;
        }
    }

    /* loaded from: classes3.dex */
    public final class StripeLinkConnectComplete implements JarvisPath {
        public static final StripeLinkConnectComplete INSTANCE = new StripeLinkConnectComplete();
        public static final String value = "stripe_link/connect/complete";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof StripeLinkConnectComplete);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "StripeLinkConnectComplete";
        }

        public int hashCode() {
            return 678193532;
        }
    }

    /* loaded from: classes2.dex */
    public final class Task implements JarvisPath {
        public final String jobId;

        public Task(String str) {
            C7384Etj.A0Y(str, 0);
            this.jobId = str;
        }

        public final Task copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Task(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Task) && C7384Etj.areEqual(this.jobId, ((Task) obj).jobId));
        }

        public static /* synthetic */ Task copy$default(Task task, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = task.jobId;
            }
            C7384Etj.A0Y(str, 0);
            return new Task(str);
        }

        public final String component1() {
            return this.jobId;
        }

        public final String getJobId() {
            return this.jobId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            String strEncode = Uri.encode(this.jobId);
            C7384Etj.A0U(strEncode);
            return FGI.A0M("api/tasks/", strEncode);
        }

        public int hashCode() {
            return this.jobId.hashCode();
        }

        public String toString() {
            return FGI.A0U("Task(jobId=", this.jobId, ")");
        }
    }

    /* loaded from: classes3.dex */
    public final class TaskPermissions implements JarvisPath {
        public final String taskId;

        public TaskPermissions(String str) {
            C7384Etj.A0Y(str, 0);
            this.taskId = str;
        }

        public final TaskPermissions copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new TaskPermissions(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof TaskPermissions) && C7384Etj.areEqual(this.taskId, ((TaskPermissions) obj).taskId));
        }

        public static /* synthetic */ TaskPermissions copy$default(TaskPermissions taskPermissions, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taskPermissions.taskId;
            }
            C7384Etj.A0Y(str, 0);
            return new TaskPermissions(str);
        }

        public final String component1() {
            return this.taskId;
        }

        public final String getTaskId() {
            return this.taskId;
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            String strEncode = Uri.encode(this.taskId);
            C7384Etj.A0U(strEncode);
            return FGI.A0M("permissions/scopes/schedule/", strEncode);
        }

        public int hashCode() {
            return this.taskId.hashCode();
        }

        public String toString() {
            return C60O.A0r("TaskPermissions(taskId=", this.taskId);
        }
    }

    /* loaded from: classes2.dex */
    public final class Tasks implements JarvisPath {
        public static final Tasks INSTANCE = new Tasks();
        public static final String value = "tasks";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Tasks);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Tasks";
        }

        public int hashCode() {
            return -2137982546;
        }
    }

    /* loaded from: classes2.dex */
    public final class TasksRuns implements JarvisPath {
        public static final TasksRuns INSTANCE = new TasksRuns();
        public static final String value = "tasks/runs";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TasksRuns);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "TasksRuns";
        }

        public int hashCode() {
            return 1999076886;
        }
    }

    /* loaded from: classes3.dex */
    public final class UsernamePasswordAuthCallback implements JarvisPath {
        public static final UsernamePasswordAuthCallback INSTANCE = new UsernamePasswordAuthCallback();
        public static final String value = "username_password_auth/callback";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UsernamePasswordAuthCallback);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "UsernamePasswordAuthCallback";
        }

        public int hashCode() {
            return -392246242;
        }
    }

    public final class VaultLuksLock implements JarvisPath {
        public static final VaultLuksLock INSTANCE = new VaultLuksLock();
        public static final String value = "vault/luks/lock";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VaultLuksLock);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VaultLuksLock";
        }

        public int hashCode() {
            return -1752533010;
        }
    }

    public final class VaultLuksStatus implements JarvisPath {
        public static final VaultLuksStatus INSTANCE = new VaultLuksStatus();
        public static final String value = "vault/luks/status";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VaultLuksStatus);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VaultLuksStatus";
        }

        public int hashCode() {
            return -352068107;
        }
    }

    public final class VaultLuksUnlock implements JarvisPath {
        public static final VaultLuksUnlock INSTANCE = new VaultLuksUnlock();
        public static final String value = "vault/luks/unlock";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VaultLuksUnlock);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VaultLuksUnlock";
        }

        public int hashCode() {
            return -300028601;
        }
    }

    /* loaded from: classes2.dex */
    public final class VoiceDictation implements JarvisPath {
        public static final VoiceDictation INSTANCE = new VoiceDictation();
        public static final String value = "api/voice/dictation";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceDictation);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "VoiceDictation";
        }

        public int hashCode() {
            return 1463741901;
        }
    }

    /* loaded from: classes2.dex */
    public final class Wallet implements JarvisPath {
        public static final Wallet INSTANCE = new Wallet();
        public static final String value = "wallet";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Wallet);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "Wallet";
        }

        public int hashCode() {
            return -1767269927;
        }
    }

    /* loaded from: classes2.dex */
    public final class WalletCheckoutInfo implements JarvisPath {
        public static final WalletCheckoutInfo INSTANCE = new WalletCheckoutInfo();
        public static final String value = "wallet/checkout-info";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WalletCheckoutInfo);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "WalletCheckoutInfo";
        }

        public int hashCode() {
            return -1106115699;
        }
    }

    /* loaded from: classes3.dex */
    public final class WidgetsState implements JarvisPath {
        public static final WidgetsState INSTANCE = new WidgetsState();
        public static final String value = "widgets/state";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WidgetsState);
        }

        @Override // com.facebook.aura.network.api.JarvisPath
        public String getValue() {
            return value;
        }

        public String toString() {
            return "WidgetsState";
        }

        public int hashCode() {
            return -1929111294;
        }
    }

    String getValue();
}
