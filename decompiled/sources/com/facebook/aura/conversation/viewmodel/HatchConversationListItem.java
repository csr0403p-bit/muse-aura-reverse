package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes.dex */
public abstract class HatchConversationListItem {
    public static final int $stable = 0;

    public final class AgentPermissionRequest extends HatchConversationListItem {
        public static final int $stable = 0;
        public static final AgentPermissionRequest INSTANCE = new AgentPermissionRequest();
        public static final String key = "agent_permission_request";

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AgentPermissionRequest);
        }

        @Override // com.facebook.aura.conversation.viewmodel.HatchConversationListItem
        public String getKey() {
            return key;
        }

        public String toString() {
            return "AgentPermissionRequest";
        }

        public int hashCode() {
            return 527242010;
        }
    }

    public final class Message extends HatchConversationListItem {
        public static final int $stable = 0;
        public final String key;
        public final HatchMessageUiModel message;
        public final String renderedIdOverride;
        public final boolean replacedTypingCursor;

        public Message(HatchMessageUiModel hatchMessageUiModel, String str, boolean z) {
            C7384Etj.A0Y(hatchMessageUiModel, 0);
            this.message = hatchMessageUiModel;
            this.renderedIdOverride = str;
            this.replacedTypingCursor = z;
            this.key = FGI.A0M("msg_", str == null ? hatchMessageUiModel.id : str);
        }

        public final Message copy(HatchMessageUiModel hatchMessageUiModel, String str, boolean z) {
            C7384Etj.A0Y(hatchMessageUiModel, 0);
            return new Message(hatchMessageUiModel, str, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Message) {
                    Message message = (Message) obj;
                    if (!C7384Etj.areEqual(this.message, message.message) || !C7384Etj.areEqual(this.renderedIdOverride, message.renderedIdOverride) || this.replacedTypingCursor != message.replacedTypingCursor) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Message copy$default(Message message, HatchMessageUiModel hatchMessageUiModel, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchMessageUiModel = message.message;
            }
            if ((i & 2) != 0) {
                str = message.renderedIdOverride;
            }
            if ((i & 4) != 0) {
                z = message.replacedTypingCursor;
            }
            return message.copy(hatchMessageUiModel, str, z);
        }

        public final HatchMessageUiModel component1() {
            return this.message;
        }

        public final String component2() {
            return this.renderedIdOverride;
        }

        public final boolean component3() {
            return this.replacedTypingCursor;
        }

        @Override // com.facebook.aura.conversation.viewmodel.HatchConversationListItem
        public String getKey() {
            return this.key;
        }

        public final HatchMessageUiModel getMessage() {
            return this.message;
        }

        public final String getRenderedIdOverride() {
            return this.renderedIdOverride;
        }

        public final boolean getReplacedTypingCursor() {
            return this.replacedTypingCursor;
        }

        public int hashCode() {
            return C0KA.A00((AnonymousClass005.A0E(this.message) + AnonymousClass006.A0G(this.renderedIdOverride)) * 31, this.replacedTypingCursor);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Message(HatchMessageUiModel hatchMessageUiModel, String str, boolean z, int i, C06H c06h) {
            this(hatchMessageUiModel, AnonymousClass006.A0s(i, str), AnonymousClass005.A1O(i, z));
        }
    }

    public final class TimestampMarker extends HatchConversationListItem {
        public static final int $stable = 0;
        public final String key;
        public final String label;
        public final long timestamp;

        public TimestampMarker(String str, long j) {
            C7384Etj.A0Y(str, 0);
            this.label = str;
            this.timestamp = j;
            this.key = FGI.A0B(j, "timestamp_");
        }

        public final TimestampMarker copy(String str, long j) {
            C7384Etj.A0Y(str, 0);
            return new TimestampMarker(str, j);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof TimestampMarker) {
                    TimestampMarker timestampMarker = (TimestampMarker) obj;
                    if (!C7384Etj.areEqual(this.label, timestampMarker.label) || this.timestamp != timestampMarker.timestamp) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ TimestampMarker copy$default(TimestampMarker timestampMarker, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = timestampMarker.label;
            }
            if ((i & 2) != 0) {
                j = timestampMarker.timestamp;
            }
            C7384Etj.A0Y(str, 0);
            return new TimestampMarker(str, j);
        }

        public final String component1() {
            return this.label;
        }

        public final long component2() {
            return this.timestamp;
        }

        @Override // com.facebook.aura.conversation.viewmodel.HatchConversationListItem
        public String getKey() {
            return this.key;
        }

        public final String getLabel() {
            return this.label;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.timestamp, AnonymousClass001.A0G(this.label));
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class TypingCursor extends HatchConversationListItem {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public static final String KEY = "typing_cursor";
        public final String activityText;
        public final String key = KEY;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof TypingCursor) && C7384Etj.areEqual(this.activityText, ((TypingCursor) obj).activityText));
        }

        public static /* synthetic */ TypingCursor copy$default(TypingCursor typingCursor, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = typingCursor.activityText;
            }
            return new TypingCursor(str);
        }

        public final String component1() {
            return this.activityText;
        }

        public final TypingCursor copy(String str) {
            return new TypingCursor(str);
        }

        public final String getActivityText() {
            return this.activityText;
        }

        @Override // com.facebook.aura.conversation.viewmodel.HatchConversationListItem
        public String getKey() {
            return this.key;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.activityText);
        }

        public final class Companion {
            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public TypingCursor(String str) {
            this.activityText = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public abstract String getKey();

    public /* synthetic */ HatchConversationListItem(C06H c06h) {
    }

    public HatchConversationListItem() {
    }
}
