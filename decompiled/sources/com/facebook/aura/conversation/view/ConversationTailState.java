package com.facebook.aura.conversation.view;

import X.ADq;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import java.util.Set;

/* loaded from: classes.dex */
public final class ConversationTailState extends C06G {
    public static final int $stable = 8;
    public final HatchConversationListItem lastItem;
    public final HatchConversationListItem.Message lastMessage;
    public final Set<String> latestResponseContentIds;
    public final String latestResponseContentSignature;
    public final String latestResponseEndKey;
    public final boolean latestResponseHasRichContent;
    public final boolean latestResponseIsStreaming;
    public final ADq latestResponseRange;
    public final String latestResponseStartKey;
    public final String latestUserMessageKey;
    public final String trailingReactionSignature;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConversationTailState) {
                ConversationTailState conversationTailState = (ConversationTailState) obj;
                if (!C7384Etj.areEqual(this.lastMessage, conversationTailState.lastMessage) || !C7384Etj.areEqual(this.latestResponseRange, conversationTailState.latestResponseRange) || !C7384Etj.areEqual(this.latestResponseStartKey, conversationTailState.latestResponseStartKey) || !C7384Etj.areEqual(this.latestResponseEndKey, conversationTailState.latestResponseEndKey) || !C7384Etj.areEqual(this.latestResponseContentSignature, conversationTailState.latestResponseContentSignature) || !C7384Etj.areEqual(this.latestResponseContentIds, conversationTailState.latestResponseContentIds) || this.latestResponseHasRichContent != conversationTailState.latestResponseHasRichContent || this.latestResponseIsStreaming != conversationTailState.latestResponseIsStreaming || !C7384Etj.areEqual(this.latestUserMessageKey, conversationTailState.latestUserMessageKey) || !C7384Etj.areEqual(this.trailingReactionSignature, conversationTailState.trailingReactionSignature) || !C7384Etj.areEqual(this.lastItem, conversationTailState.lastItem)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationTailState copy$default(ConversationTailState conversationTailState, HatchConversationListItem.Message message, ADq aDq, String str, String str2, String str3, Set set, boolean z, boolean z2, String str4, String str5, HatchConversationListItem hatchConversationListItem, int i, Object obj) {
        if ((i & 1) != 0) {
            message = conversationTailState.lastMessage;
        }
        if ((i & 2) != 0) {
            aDq = conversationTailState.latestResponseRange;
        }
        if ((i & 4) != 0) {
            str = conversationTailState.latestResponseStartKey;
        }
        if ((i & 8) != 0) {
            str2 = conversationTailState.latestResponseEndKey;
        }
        if ((i & 16) != 0) {
            str3 = conversationTailState.latestResponseContentSignature;
        }
        if ((i & 32) != 0) {
            set = conversationTailState.latestResponseContentIds;
        }
        if ((i & 64) != 0) {
            z = conversationTailState.latestResponseHasRichContent;
        }
        if ((i & 128) != 0) {
            z2 = conversationTailState.latestResponseIsStreaming;
        }
        if ((i & 256) != 0) {
            str4 = conversationTailState.latestUserMessageKey;
        }
        if ((i & 512) != 0) {
            str5 = conversationTailState.trailingReactionSignature;
        }
        if ((i & 1024) != 0) {
            hatchConversationListItem = conversationTailState.lastItem;
        }
        return conversationTailState.copy(message, aDq, str, str2, str3, set, z, z2, str4, str5, hatchConversationListItem);
    }

    public final HatchConversationListItem.Message component1() {
        return this.lastMessage;
    }

    public final String component10() {
        return this.trailingReactionSignature;
    }

    public final HatchConversationListItem component11() {
        return this.lastItem;
    }

    public final ADq component2() {
        return this.latestResponseRange;
    }

    public final String component3() {
        return this.latestResponseStartKey;
    }

    public final String component4() {
        return this.latestResponseEndKey;
    }

    public final String component5() {
        return this.latestResponseContentSignature;
    }

    public final Set<String> component6() {
        return this.latestResponseContentIds;
    }

    public final boolean component7() {
        return this.latestResponseHasRichContent;
    }

    public final boolean component8() {
        return this.latestResponseIsStreaming;
    }

    public final String component9() {
        return this.latestUserMessageKey;
    }

    public final HatchConversationListItem getLastItem() {
        return this.lastItem;
    }

    public final HatchConversationListItem.Message getLastMessage() {
        return this.lastMessage;
    }

    public final Set<String> getLatestResponseContentIds() {
        return this.latestResponseContentIds;
    }

    public final String getLatestResponseContentSignature() {
        return this.latestResponseContentSignature;
    }

    public final String getLatestResponseEndKey() {
        return this.latestResponseEndKey;
    }

    public final boolean getLatestResponseHasRichContent() {
        return this.latestResponseHasRichContent;
    }

    public final boolean getLatestResponseIsStreaming() {
        return this.latestResponseIsStreaming;
    }

    public final ADq getLatestResponseRange() {
        return this.latestResponseRange;
    }

    public final String getLatestResponseStartKey() {
        return this.latestResponseStartKey;
    }

    public final String getLatestUserMessageKey() {
        return this.latestUserMessageKey;
    }

    public final String getTrailingReactionSignature() {
        return this.trailingReactionSignature;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.trailingReactionSignature, (C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.latestResponseContentIds, AnonymousClass005.A0I(this.latestResponseContentSignature, ((((((AnonymousClass006.A0D(this.lastMessage) * 31) + AnonymousClass006.A0D(this.latestResponseRange)) * 31) + AnonymousClass006.A0G(this.latestResponseStartKey)) * 31) + AnonymousClass006.A0G(this.latestResponseEndKey)) * 31)), this.latestResponseHasRichContent), this.latestResponseIsStreaming) + AnonymousClass006.A0G(this.latestUserMessageKey)) * 31) + C06G.A04(this.lastItem);
    }

    public ConversationTailState(HatchConversationListItem.Message message, ADq aDq, String str, String str2, String str3, Set<String> set, boolean z, boolean z2, String str4, String str5, HatchConversationListItem hatchConversationListItem) {
        AnonymousClass003.A0y(str3, set);
        C7384Etj.A0Y(str5, 9);
        this.lastMessage = message;
        this.latestResponseRange = aDq;
        this.latestResponseStartKey = str;
        this.latestResponseEndKey = str2;
        this.latestResponseContentSignature = str3;
        this.latestResponseContentIds = set;
        this.latestResponseHasRichContent = z;
        this.latestResponseIsStreaming = z2;
        this.latestUserMessageKey = str4;
        this.trailingReactionSignature = str5;
        this.lastItem = hatchConversationListItem;
    }

    public final ConversationTailState copy(HatchConversationListItem.Message message, ADq aDq, String str, String str2, String str3, Set<String> set, boolean z, boolean z2, String str4, String str5, HatchConversationListItem hatchConversationListItem) {
        AnonymousClass003.A0y(str3, set);
        C7384Etj.A0Y(str5, 9);
        return new ConversationTailState(message, aDq, str, str2, str3, set, z, z2, str4, str5, hatchConversationListItem);
    }

    public String toString() {
        return super.toString();
    }
}
