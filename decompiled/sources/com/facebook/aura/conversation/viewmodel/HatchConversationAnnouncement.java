package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.model.HatchSendErrorCategory;

/* loaded from: classes.dex */
public interface HatchConversationAnnouncement {

    public final class AgentWorking extends C06G implements HatchConversationAnnouncement {
        public static final int $stable = 0;
        public final String agentName;
        public final String statusText;
        public final String turnKey;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AgentWorking) {
                    AgentWorking agentWorking = (AgentWorking) obj;
                    if (!C7384Etj.areEqual(this.turnKey, agentWorking.turnKey) || !C7384Etj.areEqual(this.agentName, agentWorking.agentName) || !C7384Etj.areEqual(this.statusText, agentWorking.statusText)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AgentWorking copy$default(AgentWorking agentWorking, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = agentWorking.turnKey;
            }
            if ((i & 2) != 0) {
                str2 = agentWorking.agentName;
            }
            if ((i & 4) != 0) {
                str3 = agentWorking.statusText;
            }
            return agentWorking.copy(str, str2, str3);
        }

        public final String component1() {
            return this.turnKey;
        }

        public final String component2() {
            return this.agentName;
        }

        public final String component3() {
            return this.statusText;
        }

        public final String getAgentName() {
            return this.agentName;
        }

        public final String getStatusText() {
            return this.statusText;
        }

        public final String getTurnKey() {
            return this.turnKey;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.agentName, AnonymousClass001.A0G(this.turnKey)) + AnonymousClass006.A0G(this.statusText);
        }

        public AgentWorking(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            this.turnKey = str;
            this.agentName = str2;
            this.statusText = str3;
        }

        public final AgentWorking copy(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            return new AgentWorking(str, str2, str3);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Reply extends C06G implements HatchConversationAnnouncement {
        public static final int $stable = 0;
        public final String messageKey;
        public final String text;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Reply) {
                    Reply reply = (Reply) obj;
                    if (!C7384Etj.areEqual(this.messageKey, reply.messageKey) || !C7384Etj.areEqual(this.text, reply.text)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Reply copy$default(Reply reply, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reply.messageKey;
            }
            if ((i & 2) != 0) {
                str2 = reply.text;
            }
            AnonymousClass003.A0u(str, str2);
            return new Reply(str, str2);
        }

        public final String component1() {
            return this.messageKey;
        }

        public final String component2() {
            return this.text;
        }

        public final String getMessageKey() {
            return this.messageKey;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.text, AnonymousClass001.A0G(this.messageKey));
        }

        public Reply(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.messageKey = str;
            this.text = str2;
        }

        public final Reply copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Reply(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ReplyWithoutText extends C06G implements HatchConversationAnnouncement {
        public static final int $stable = 0;
        public final String agentName;
        public final String messageKey;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ReplyWithoutText) {
                    ReplyWithoutText replyWithoutText = (ReplyWithoutText) obj;
                    if (!C7384Etj.areEqual(this.messageKey, replyWithoutText.messageKey) || !C7384Etj.areEqual(this.agentName, replyWithoutText.agentName)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ReplyWithoutText copy$default(ReplyWithoutText replyWithoutText, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = replyWithoutText.messageKey;
            }
            if ((i & 2) != 0) {
                str2 = replyWithoutText.agentName;
            }
            AnonymousClass003.A0u(str, str2);
            return new ReplyWithoutText(str, str2);
        }

        public final String component1() {
            return this.messageKey;
        }

        public final String component2() {
            return this.agentName;
        }

        public final String getAgentName() {
            return this.agentName;
        }

        public final String getMessageKey() {
            return this.messageKey;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.agentName, AnonymousClass001.A0G(this.messageKey));
        }

        public ReplyWithoutText(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.messageKey = str;
            this.agentName = str2;
        }

        public final ReplyWithoutText copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new ReplyWithoutText(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SendFailed extends C06G implements HatchConversationAnnouncement {
        public static final int $stable = 0;
        public final HatchSendErrorCategory category;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SendFailed) && this.category == ((SendFailed) obj).category);
        }

        public static /* synthetic */ SendFailed copy$default(SendFailed sendFailed, HatchSendErrorCategory hatchSendErrorCategory, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchSendErrorCategory = sendFailed.category;
            }
            return new SendFailed(hatchSendErrorCategory);
        }

        public final HatchSendErrorCategory component1() {
            return this.category;
        }

        public final SendFailed copy(HatchSendErrorCategory hatchSendErrorCategory) {
            return new SendFailed(hatchSendErrorCategory);
        }

        public final HatchSendErrorCategory getCategory() {
            return this.category;
        }

        public int hashCode() {
            return AnonymousClass006.A0D(this.category);
        }

        public SendFailed(HatchSendErrorCategory hatchSendErrorCategory) {
            this.category = hatchSendErrorCategory;
        }

        public String toString() {
            return super.toString();
        }
    }
}
