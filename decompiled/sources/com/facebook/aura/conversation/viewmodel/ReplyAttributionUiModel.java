package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.model.IdeaWidgetData;

/* loaded from: classes.dex */
public interface ReplyAttributionUiModel {

    public final class FeedUnit extends C06G implements ReplyAttributionUiModel {
        public static final int $stable = 0;
        public final String label;
        public final String previewText;
        public final String unitId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FeedUnit) {
                    FeedUnit feedUnit = (FeedUnit) obj;
                    if (!C7384Etj.areEqual(this.unitId, feedUnit.unitId) || !C7384Etj.areEqual(this.previewText, feedUnit.previewText) || !C7384Etj.areEqual(this.label, feedUnit.label)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ FeedUnit copy$default(FeedUnit feedUnit, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedUnit.unitId;
            }
            if ((i & 2) != 0) {
                str2 = feedUnit.previewText;
            }
            if ((i & 4) != 0) {
                str3 = feedUnit.label;
            }
            return feedUnit.copy(str, str2, str3);
        }

        public final String component1() {
            return this.unitId;
        }

        public final String component2() {
            return this.previewText;
        }

        public final String component3() {
            return this.label;
        }

        public final String getLabel() {
            return this.label;
        }

        @Override // com.facebook.aura.conversation.viewmodel.ReplyAttributionUiModel
        public String getPreviewText() {
            return this.previewText;
        }

        public final String getUnitId() {
            return this.unitId;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.label, AnonymousClass005.A0I(this.previewText, AnonymousClass001.A0G(this.unitId)));
        }

        public FeedUnit(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            this.unitId = str;
            this.previewText = str2;
            this.label = str3;
        }

        public final FeedUnit copy(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            return new FeedUnit(str, str2, str3);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Goal extends C06G implements ReplyAttributionUiModel {
        public static final int $stable = 0;
        public final String goalId;
        public final String label;
        public final String previewText;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Goal) {
                    Goal goal = (Goal) obj;
                    if (!C7384Etj.areEqual(this.goalId, goal.goalId) || !C7384Etj.areEqual(this.previewText, goal.previewText) || !C7384Etj.areEqual(this.label, goal.label)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Goal copy$default(Goal goal, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = goal.goalId;
            }
            if ((i & 2) != 0) {
                str2 = goal.previewText;
            }
            if ((i & 4) != 0) {
                str3 = goal.label;
            }
            return goal.copy(str, str2, str3);
        }

        public final String component1() {
            return this.goalId;
        }

        public final String component2() {
            return this.previewText;
        }

        public final String component3() {
            return this.label;
        }

        public final String getGoalId() {
            return this.goalId;
        }

        public final String getLabel() {
            return this.label;
        }

        @Override // com.facebook.aura.conversation.viewmodel.ReplyAttributionUiModel
        public String getPreviewText() {
            return this.previewText;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.label, AnonymousClass005.A0I(this.previewText, AnonymousClass001.A0G(this.goalId)));
        }

        public Goal(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            this.goalId = str;
            this.previewText = str2;
            this.label = str3;
        }

        public final Goal copy(String str, String str2, String str3) {
            AnonymousClass005.A0x(str, str2, str3);
            return new Goal(str, str2, str3);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Idea extends C06G implements ReplyAttributionUiModel {
        public static final int $stable = IdeaWidgetData.$stable;
        public final IdeaWidgetData idea;

        public Idea(IdeaWidgetData ideaWidgetData) {
            C7384Etj.A0Y(ideaWidgetData, 0);
            this.idea = ideaWidgetData;
        }

        public final Idea copy(IdeaWidgetData ideaWidgetData) {
            C7384Etj.A0Y(ideaWidgetData, 0);
            return new Idea(ideaWidgetData);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Idea) && C7384Etj.areEqual(this.idea, ((Idea) obj).idea));
        }

        public static /* synthetic */ Idea copy$default(Idea idea, IdeaWidgetData ideaWidgetData, int i, Object obj) {
            if ((i & 1) != 0) {
                ideaWidgetData = idea.idea;
            }
            C7384Etj.A0Y(ideaWidgetData, 0);
            return new Idea(ideaWidgetData);
        }

        public final IdeaWidgetData component1() {
            return this.idea;
        }

        public final IdeaWidgetData getIdea() {
            return this.idea;
        }

        @Override // com.facebook.aura.conversation.viewmodel.ReplyAttributionUiModel
        public String getPreviewText() {
            return this.idea.title;
        }

        public int hashCode() {
            return this.idea.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Message extends C06G implements ReplyAttributionUiModel {
        public static final int $stable = 0;
        public final String label;
        public final String messageId;
        public final String previewImagePath;
        public final String previewText;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Message) {
                    Message message = (Message) obj;
                    if (!C7384Etj.areEqual(this.messageId, message.messageId) || !C7384Etj.areEqual(this.previewText, message.previewText) || !C7384Etj.areEqual(this.label, message.label) || !C7384Etj.areEqual(this.previewImagePath, message.previewImagePath)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Message copy$default(Message message, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = message.messageId;
            }
            if ((i & 2) != 0) {
                str2 = message.previewText;
            }
            if ((i & 4) != 0) {
                str3 = message.label;
            }
            if ((i & 8) != 0) {
                str4 = message.previewImagePath;
            }
            AnonymousClass003.A0x(str2, str3);
            return new Message(str, str2, str3, str4);
        }

        public final String component1() {
            return this.messageId;
        }

        public final String component2() {
            return this.previewText;
        }

        public final String component3() {
            return this.label;
        }

        public final String component4() {
            return this.previewImagePath;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final String getPreviewImagePath() {
            return this.previewImagePath;
        }

        @Override // com.facebook.aura.conversation.viewmodel.ReplyAttributionUiModel
        public String getPreviewText() {
            return this.previewText;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.label, AnonymousClass005.A0I(this.previewText, AnonymousClass006.A0G(this.messageId) * 31)) + AnonymousClass005.A0H(this.previewImagePath);
        }

        public Message(String str, String str2, String str3, String str4) {
            AnonymousClass003.A0x(str2, str3);
            this.messageId = str;
            this.previewText = str2;
            this.label = str3;
            this.previewImagePath = str4;
        }

        public final Message copy(String str, String str2, String str3, String str4) {
            AnonymousClass003.A0x(str2, str3);
            return new Message(str, str2, str3, str4);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Message(String str, String str2, String str3, String str4, int i, C06H c06h) {
            this(str, str2, str3, AnonymousClass006.A0u(i, str4));
        }
    }

    public final class Product extends C06G implements ReplyAttributionUiModel {
        public static final int $stable = 0;
        public final String agentName;
        public final int labelResourceId;
        public final String presentationEventId;
        public final String previewText;

        public Product(String str, String str2, int i, String str3) {
            AnonymousClass002.A1B(str2, 1, str3);
            this.presentationEventId = str;
            this.previewText = str2;
            this.labelResourceId = i;
            this.agentName = str3;
        }

        public final Product copy(String str, String str2, int i, String str3) {
            AnonymousClass002.A1B(str2, 1, str3);
            return new Product(str, str2, i, str3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Product) {
                    Product product = (Product) obj;
                    if (!C7384Etj.areEqual(this.presentationEventId, product.presentationEventId) || !C7384Etj.areEqual(this.previewText, product.previewText) || this.labelResourceId != product.labelResourceId || !C7384Etj.areEqual(this.agentName, product.agentName)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Product copy$default(Product product, String str, String str2, int i, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = product.presentationEventId;
            }
            if ((i2 & 2) != 0) {
                str2 = product.previewText;
            }
            if ((i2 & 4) != 0) {
                i = product.labelResourceId;
            }
            if ((i2 & 8) != 0) {
                str3 = product.agentName;
            }
            AnonymousClass002.A1B(str2, 1, str3);
            return new Product(str, str2, i, str3);
        }

        public final String component1() {
            return this.presentationEventId;
        }

        public final String component2() {
            return this.previewText;
        }

        public final int component3() {
            return this.labelResourceId;
        }

        public final String component4() {
            return this.agentName;
        }

        public final String getAgentName() {
            return this.agentName;
        }

        public final int getLabelResourceId() {
            return this.labelResourceId;
        }

        public final String getPresentationEventId() {
            return this.presentationEventId;
        }

        @Override // com.facebook.aura.conversation.viewmodel.ReplyAttributionUiModel
        public String getPreviewText() {
            return this.previewText;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.agentName, (AnonymousClass005.A0I(this.previewText, AnonymousClass006.A0G(this.presentationEventId) * 31) + this.labelResourceId) * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    String getPreviewText();
}
