package com.facebook.aura.network.api;

import X.C60O;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface RpcMethod {

    public final class ActivitySubscribe implements RpcMethod {
        public static final ActivitySubscribe INSTANCE = new ActivitySubscribe();
        public static final String value = "activity.subscribe";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ActivitySubscribe);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ActivitySubscribe";
        }

        public int hashCode() {
            return -1402647473;
        }
    }

    public final class ActivityUpdated implements RpcMethod {
        public static final ActivityUpdated INSTANCE = new ActivityUpdated();
        public static final String value = "activity.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ActivityUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ActivityUpdated";
        }

        public int hashCode() {
            return -102347520;
        }
    }

    public final class AgentStatus implements RpcMethod {
        public static final AgentStatus INSTANCE = new AgentStatus();
        public static final String value = "agent.status";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AgentStatus);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "AgentStatus";
        }

        public int hashCode() {
            return -1152665685;
        }
    }

    public final class ApprovalsSnapshot implements RpcMethod {
        public static final ApprovalsSnapshot INSTANCE = new ApprovalsSnapshot();
        public static final String value = "approvals.snapshot";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ApprovalsSnapshot);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ApprovalsSnapshot";
        }

        public int hashCode() {
            return 760827336;
        }
    }

    public final class ArtifactItemsRemoved implements RpcMethod {
        public static final ArtifactItemsRemoved INSTANCE = new ArtifactItemsRemoved();
        public static final String value = "navigation.items.removed";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ArtifactItemsRemoved);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ArtifactItemsRemoved";
        }

        public int hashCode() {
            return -1184232034;
        }
    }

    public final class ArtifactItemsSnapshot implements RpcMethod {
        public static final ArtifactItemsSnapshot INSTANCE = new ArtifactItemsSnapshot();
        public static final String value = "navigation.items.snapshot";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ArtifactItemsSnapshot);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ArtifactItemsSnapshot";
        }

        public int hashCode() {
            return -1553758138;
        }
    }

    public final class ArtifactItemsUpdated implements RpcMethod {
        public static final ArtifactItemsUpdated INSTANCE = new ArtifactItemsUpdated();
        public static final String value = "navigation.items.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ArtifactItemsUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ArtifactItemsUpdated";
        }

        public int hashCode() {
            return 1784468985;
        }
    }

    public final class ArtifactPinnedSet implements RpcMethod {
        public static final ArtifactPinnedSet INSTANCE = new ArtifactPinnedSet();
        public static final String value = "navigation.pinned.set";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ArtifactPinnedSet);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ArtifactPinnedSet";
        }

        public int hashCode() {
            return -326022900;
        }
    }

    public final class ArtifactRecentsTouch implements RpcMethod {
        public static final ArtifactRecentsTouch INSTANCE = new ArtifactRecentsTouch();
        public static final String value = "navigation.recents.touch";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ArtifactRecentsTouch);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ArtifactRecentsTouch";
        }

        public int hashCode() {
            return -801271355;
        }
    }

    public final class ArtifactsSubscribe implements RpcMethod {
        public static final ArtifactsSubscribe INSTANCE = new ArtifactsSubscribe();
        public static final String value = "navigation.subscribe";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ArtifactsSubscribe);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ArtifactsSubscribe";
        }

        public int hashCode() {
            return -1040048491;
        }
    }

    public final class ChatCancel implements RpcMethod {
        public static final ChatCancel INSTANCE = new ChatCancel();
        public static final String value = "chat.cancel";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatCancel);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChatCancel";
        }

        public int hashCode() {
            return -1256087266;
        }
    }

    public final class ChatMessageGet implements RpcMethod {
        public static final ChatMessageGet INSTANCE = new ChatMessageGet();
        public static final String value = "chat.message_get";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatMessageGet);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChatMessageGet";
        }

        public int hashCode() {
            return 1172227699;
        }
    }

    public final class ChatSearch implements RpcMethod {
        public static final ChatSearch INSTANCE = new ChatSearch();
        public static final String value = "chat.search";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatSearch);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChatSearch";
        }

        public int hashCode() {
            return -794699700;
        }
    }

    public final class ChatStream implements RpcMethod {
        public static final ChatStream INSTANCE = new ChatStream();
        public static final String value = "chat.stream";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatStream);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChatStream";
        }

        public int hashCode() {
            return -780352988;
        }
    }

    public final class ChatSubscribe implements RpcMethod {
        public static final ChatSubscribe INSTANCE = new ChatSubscribe();
        public static final String value = "chat.subscribe";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ChatSubscribe);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ChatSubscribe";
        }

        public int hashCode() {
            return 1992669222;
        }
    }

    public final class ClientDataSourcePublish implements RpcMethod {
        public static final ClientDataSourcePublish INSTANCE = new ClientDataSourcePublish();
        public static final String value = "client.data_source.publish";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ClientDataSourcePublish);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ClientDataSourcePublish";
        }

        public int hashCode() {
            return 581630643;
        }
    }

    public final class ClientInvoke implements RpcMethod {
        public static final ClientInvoke INSTANCE = new ClientInvoke();
        public static final String value = "client.invoke";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ClientInvoke);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ClientInvoke";
        }

        public int hashCode() {
            return 1518475855;
        }
    }

    public final class ClientInvokeResult implements RpcMethod {
        public static final ClientInvokeResult INSTANCE = new ClientInvokeResult();
        public static final String value = "client.invoke.result";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ClientInvokeResult);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ClientInvokeResult";
        }

        public int hashCode() {
            return 935696204;
        }
    }

    public final class ClientRegisterCapabilities implements RpcMethod {
        public static final ClientRegisterCapabilities INSTANCE = new ClientRegisterCapabilities();
        public static final String value = "client.register_capabilities";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ClientRegisterCapabilities);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ClientRegisterCapabilities";
        }

        public int hashCode() {
            return -1475213424;
        }
    }

    public final class ConnectionPing implements RpcMethod {
        public static final ConnectionPing INSTANCE = new ConnectionPing();
        public static final String value = "connection.ping";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectionPing);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ConnectionPing";
        }

        public int hashCode() {
            return -543738724;
        }
    }

    public interface Extension extends RpcMethod {
    }

    public final class FeedStatusUpdated implements RpcMethod {
        public static final FeedStatusUpdated INSTANCE = new FeedStatusUpdated();
        public static final String value = "feed.status.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FeedStatusUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FeedStatusUpdated";
        }

        public int hashCode() {
            return 1753567423;
        }
    }

    public final class FilesUpdated implements RpcMethod {
        public static final FilesUpdated INSTANCE = new FilesUpdated();
        public static final String value = "files.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FilesUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FilesUpdated";
        }

        public int hashCode() {
            return 1900057712;
        }
    }

    public final class FsSubscribe implements RpcMethod {
        public static final FsSubscribe INSTANCE = new FsSubscribe();
        public static final String value = "fs.subscribe";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FsSubscribe);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "FsSubscribe";
        }

        public int hashCode() {
            return -15739055;
        }
    }

    public final class GoalUpdated implements RpcMethod {
        public static final GoalUpdated INSTANCE = new GoalUpdated();
        public static final String value = "goal.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof GoalUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "GoalUpdated";
        }

        public int hashCode() {
            return -2099691908;
        }
    }

    public final class HeartbeatNotification implements RpcMethod {
        public static final HeartbeatNotification INSTANCE = new HeartbeatNotification();
        public static final String value = "heartbeat.notification";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof HeartbeatNotification);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "HeartbeatNotification";
        }

        public int hashCode() {
            return 1755917147;
        }
    }

    public final class IdentitySubscribe implements RpcMethod {
        public static final IdentitySubscribe INSTANCE = new IdentitySubscribe();
        public static final String value = "identity.subscribe";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof IdentitySubscribe);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "IdentitySubscribe";
        }

        public int hashCode() {
            return 1538900864;
        }
    }

    public final class IdentityUpdated implements RpcMethod {
        public static final IdentityUpdated INSTANCE = new IdentityUpdated();
        public static final String value = "identity.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof IdentityUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "IdentityUpdated";
        }

        public int hashCode() {
            return -1381966735;
        }
    }

    public final class ModelGet implements RpcMethod {
        public static final ModelGet INSTANCE = new ModelGet();
        public static final String value = "model.get";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ModelGet);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ModelGet";
        }

        public int hashCode() {
            return 2014252953;
        }
    }

    public final class ModelSet implements RpcMethod {
        public static final ModelSet INSTANCE = new ModelSet();
        public static final String value = "model.set";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ModelSet);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ModelSet";
        }

        public int hashCode() {
            return 2014264485;
        }
    }

    public final class NavigationTabOrderUpdated implements RpcMethod {
        public static final NavigationTabOrderUpdated INSTANCE = new NavigationTabOrderUpdated();
        public static final String value = "navigation.tab_order.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigationTabOrderUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "NavigationTabOrderUpdated";
        }

        public int hashCode() {
            return 897419874;
        }
    }

    public final class NodeDisconnect implements RpcMethod {
        public static final NodeDisconnect INSTANCE = new NodeDisconnect();
        public static final String value = "node.disconnect";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NodeDisconnect);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "NodeDisconnect";
        }

        public int hashCode() {
            return 1645094762;
        }
    }

    public final class NodeList implements RpcMethod {
        public static final NodeList INSTANCE = new NodeList();
        public static final String value = "node.list";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NodeList);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "NodeList";
        }

        public int hashCode() {
            return -538824212;
        }
    }

    public final class NodeUnpair implements RpcMethod {
        public static final NodeUnpair INSTANCE = new NodeUnpair();
        public static final String value = "node.unpair";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NodeUnpair);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "NodeUnpair";
        }

        public int hashCode() {
            return 2143150785;
        }
    }

    public final class Raw implements RpcMethod {
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

        @Override // com.facebook.aura.network.api.RpcMethod
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

    public final class ReactionsUpdated implements RpcMethod {
        public static final ReactionsUpdated INSTANCE = new ReactionsUpdated();
        public static final String value = "reactions.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ReactionsUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ReactionsUpdated";
        }

        public int hashCode() {
            return 263554589;
        }
    }

    public final class ScheduleUpdated implements RpcMethod {
        public static final ScheduleUpdated INSTANCE = new ScheduleUpdated();
        public static final String value = "schedule.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ScheduleUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ScheduleUpdated";
        }

        public int hashCode() {
            return 973775992;
        }
    }

    public final class ServiceNotice implements RpcMethod {
        public static final ServiceNotice INSTANCE = new ServiceNotice();
        public static final String value = "service.notice";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ServiceNotice);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ServiceNotice";
        }

        public int hashCode() {
            return -471221951;
        }
    }

    public final class SessionsUpdated implements RpcMethod {
        public static final SessionsUpdated INSTANCE = new SessionsUpdated();
        public static final String value = "sessions.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SessionsUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SessionsUpdated";
        }

        public int hashCode() {
            return -1363758158;
        }
    }

    public final class SpacesSubscribe implements RpcMethod {
        public static final SpacesSubscribe INSTANCE = new SpacesSubscribe();
        public static final String value = "spaces.subscribe";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SpacesSubscribe);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "SpacesSubscribe";
        }

        public int hashCode() {
            return -2116798991;
        }
    }

    public final class TasksUpdated implements RpcMethod {
        public static final TasksUpdated INSTANCE = new TasksUpdated();
        public static final String value = "tasks.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TasksUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "TasksUpdated";
        }

        public int hashCode() {
            return 1567538041;
        }
    }

    public final class ThemeSubscribe implements RpcMethod {
        public static final ThemeSubscribe INSTANCE = new ThemeSubscribe();
        public static final String value = "theme.subscribe";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ThemeSubscribe);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ThemeSubscribe";
        }

        public int hashCode() {
            return 925849773;
        }
    }

    public final class ThemeUpdated implements RpcMethod {
        public static final ThemeUpdated INSTANCE = new ThemeUpdated();
        public static final String value = "theme.updated";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ThemeUpdated);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "ThemeUpdated";
        }

        public int hashCode() {
            return -1914447650;
        }
    }

    public final class WidgetsStatePatch implements RpcMethod {
        public static final WidgetsStatePatch INSTANCE = new WidgetsStatePatch();
        public static final String value = "widgets.state.patch";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WidgetsStatePatch);
        }

        @Override // com.facebook.aura.network.api.RpcMethod
        public String getValue() {
            return value;
        }

        public String toString() {
            return "WidgetsStatePatch";
        }

        public int hashCode() {
            return -946971750;
        }
    }

    String getValue();
}
