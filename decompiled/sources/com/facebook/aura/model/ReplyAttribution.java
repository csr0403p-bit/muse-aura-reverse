package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Serializable(with = ReplyAttributionSerializer.class)
/* loaded from: classes3.dex */
public interface ReplyAttribution {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final C9hr<ReplyAttribution> serializer() {
            return ReplyAttributionSerializer.INSTANCE;
        }
    }

    @Serializable
    public final class Context extends C06G implements ReplyAttribution {
        public static final int $stable = 8;
        public static final Companion Companion = new Companion();
        public final String fallbackText;
        public final String label;
        public final String preview;
        public final JsonObject target;
        public final String targetType;

        public final class Companion {
            public final C9hr<Context> serializer() {
                return ReplyAttribution$Context$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(Context context, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(context.targetType, c9iZ, 0);
            c9j5.AAQ(context.target, JsonObjectSerializer.A01, c9iZ, 1);
            boolean zAfR = c9j5.AfR();
            if (zAfR || !"".equals(context.preview)) {
                c9j5.AAV(context.preview, c9iZ, 2);
            }
            if (zAfR || !"".equals(context.label)) {
                c9j5.AAV(context.label, c9iZ, 3);
            }
            if (zAfR || !"".equals(context.fallbackText)) {
                c9j5.AAV(context.fallbackText, c9iZ, 4);
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Context) {
                    Context context = (Context) obj;
                    if (!C7384Etj.areEqual(this.targetType, context.targetType) || !C7384Etj.areEqual(this.target, context.target) || !C7384Etj.areEqual(this.preview, context.preview) || !C7384Etj.areEqual(this.label, context.label) || !C7384Etj.areEqual(this.fallbackText, context.fallbackText)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Context copy$default(Context context, String str, JsonObject jsonObject, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = context.targetType;
            }
            if ((i & 2) != 0) {
                jsonObject = context.target;
            }
            if ((i & 4) != 0) {
                str2 = context.preview;
            }
            if ((i & 8) != 0) {
                str3 = context.label;
            }
            if ((i & 16) != 0) {
                str4 = context.fallbackText;
            }
            return context.copy(str, jsonObject, str2, str3, str4);
        }

        public final String component1() {
            return this.targetType;
        }

        public final JsonObject component2() {
            return this.target;
        }

        public final String component3() {
            return this.preview;
        }

        public final String component4() {
            return this.label;
        }

        public final String component5() {
            return this.fallbackText;
        }

        public final String getFallbackText() {
            return this.fallbackText;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getPreview() {
            return this.preview;
        }

        public final JsonObject getTarget() {
            return this.target;
        }

        public final String getTargetType() {
            return this.targetType;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.fallbackText, AnonymousClass005.A0I(this.label, AnonymousClass005.A0I(this.preview, AnonymousClass005.A0F(this.target, AnonymousClass001.A0G(this.targetType)))));
        }

        public Context(String str, JsonObject jsonObject, String str2, String str3, String str4) {
            AnonymousClass005.A17(str, jsonObject, str2, str3, str4);
            this.targetType = str;
            this.target = jsonObject;
            this.preview = str2;
            this.label = str3;
            this.fallbackText = str4;
        }

        public final Context copy(String str, JsonObject jsonObject, String str2, String str3, String str4) {
            AnonymousClass005.A17(str, jsonObject, str2, str3, str4);
            return new Context(str, jsonObject, str2, str3, str4);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Context(String str, JsonObject jsonObject, String str2, String str3, String str4, int i, C06H c06h) {
            this(str, jsonObject, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
        }

        public /* synthetic */ Context(int i, String str, JsonObject jsonObject, String str2, String str3, String str4, C2hx c2hx) {
            if (3 != (i & 3)) {
                C9iI.A00(ReplyAttribution$Context$$serializer.descriptor, i, 3);
                throw F60.createAndThrow();
            }
            this.targetType = str;
            this.target = jsonObject;
            if ((i & 4) == 0) {
                this.preview = "";
            } else {
                this.preview = str2;
            }
            if ((i & 8) == 0) {
                this.label = "";
            } else {
                this.label = str3;
            }
            if ((i & 16) == 0) {
                this.fallbackText = "";
            } else {
                this.fallbackText = str4;
            }
        }
    }

    @Serializable
    public final class Element extends C06G implements ReplyAttribution {
        public final String elementKind;
        public final Presentation fallback;
        public final String imageUrl;
        public final boolean isUnavailable;
        public final ReplyElementReference reference;
        public final String title;
        public final String widgetKind;
        public static final Companion Companion = new Companion();
        public static final int $stable = ReplyElementReference.$stable;

        public final class Companion {
            public final C9hr<Element> serializer() {
                return ReplyAttribution$Element$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static /* synthetic */ Element copy$default(Element element, ReplyElementReference replyElementReference, String str, String str2, String str3, String str4, boolean z, Presentation presentation, int i, Object obj) {
            ReplyElementReference replyElementReference2 = replyElementReference;
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            String str8 = str4;
            boolean z2 = z;
            Presentation presentation2 = presentation;
            if ((i & 1) != 0) {
                replyElementReference2 = element.reference;
            }
            if ((i & 2) != 0) {
                str5 = element.elementKind;
            }
            if ((i & 4) != 0) {
                str6 = element.widgetKind;
            }
            if ((i & 8) != 0) {
                str7 = element.title;
            }
            if ((i & 16) != 0) {
                str8 = element.imageUrl;
            }
            if ((i & 32) != 0) {
                z2 = element.isUnavailable;
            }
            if ((i & 64) != 0) {
                presentation2 = element.fallback;
            }
            AnonymousClass003.A0u(replyElementReference2, str5);
            return new Element(replyElementReference2, str5, str6, str7, str8, z2, presentation2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Element) {
                    Element element = (Element) obj;
                    if (!C7384Etj.areEqual(this.reference, element.reference) || !C7384Etj.areEqual(this.elementKind, element.elementKind) || !C7384Etj.areEqual(this.widgetKind, element.widgetKind) || !C7384Etj.areEqual(this.title, element.title) || !C7384Etj.areEqual(this.imageUrl, element.imageUrl) || this.isUnavailable != element.isUnavailable || !C7384Etj.areEqual(this.fallback, element.fallback)) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ Element(int i, ReplyElementReference replyElementReference, String str, String str2, String str3, String str4, boolean z, Presentation presentation, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(ReplyAttribution$Element$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.reference = replyElementReference;
            this.elementKind = (i & 2) == 0 ? "product" : str;
            if ((i & 4) == 0) {
                this.widgetKind = null;
            } else {
                this.widgetKind = str2;
            }
            if ((i & 8) == 0) {
                this.title = null;
            } else {
                this.title = str3;
            }
            if ((i & 16) == 0) {
                this.imageUrl = null;
            } else {
                this.imageUrl = str4;
            }
            if ((i & 32) == 0) {
                this.isUnavailable = false;
            } else {
                this.isUnavailable = z;
            }
            if ((i & 64) == 0) {
                this.fallback = null;
            } else {
                this.fallback = presentation;
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(Element element, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAQ(element.reference, ReplyElementReference$$serializer.INSTANCE, c9iZ, 0);
            boolean zAfR = c9j5.AfR();
            if (zAfR || !"product".equals(element.elementKind)) {
                c9j5.AAV(element.elementKind, c9iZ, 1);
            }
            if (zAfR || element.widgetKind != null) {
                c9j5.AAP(element.widgetKind, C07779iq.A01, c9iZ, 2);
            }
            if (zAfR || element.title != null) {
                c9j5.AAP(element.title, C07779iq.A01, c9iZ, 3);
            }
            if (zAfR || element.imageUrl != null) {
                c9j5.AAP(element.imageUrl, C07779iq.A01, c9iZ, 4);
            }
            if (zAfR || element.isUnavailable) {
                c9j5.AA7(c9iZ, 5, element.isUnavailable);
            }
            if (zAfR || element.fallback != null) {
                c9j5.AAP(element.fallback, ReplyAttribution$Presentation$$serializer.INSTANCE, c9iZ, 6);
            }
        }

        public final ReplyElementReference component1() {
            return this.reference;
        }

        public final String component2() {
            return this.elementKind;
        }

        public final String component3() {
            return this.widgetKind;
        }

        public final String component4() {
            return this.title;
        }

        public final String component5() {
            return this.imageUrl;
        }

        public final boolean component6() {
            return this.isUnavailable;
        }

        public final Presentation component7() {
            return this.fallback;
        }

        public final String getElementKind() {
            return this.elementKind;
        }

        public final Presentation getFallback() {
            return this.fallback;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final ReplyElementReference getReference() {
            return this.reference;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getWidgetKind() {
            return this.widgetKind;
        }

        public int hashCode() {
            return C0KA.A01((((((AnonymousClass005.A0I(this.elementKind, AnonymousClass005.A0E(this.reference)) + AnonymousClass006.A0G(this.widgetKind)) * 31) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.imageUrl)) * 31, this.isUnavailable) + C3cH.A02(this.fallback);
        }

        public final boolean isUnavailable() {
            return this.isUnavailable;
        }

        public final Element copy(ReplyElementReference replyElementReference, String str, String str2, String str3, String str4, boolean z, Presentation presentation) {
            AnonymousClass003.A0u(replyElementReference, str);
            return new Element(replyElementReference, str, str2, str3, str4, z, presentation);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Element(ReplyElementReference replyElementReference, String str, String str2, String str3, String str4, boolean z, Presentation presentation, int i, C06H c06h) {
            this(replyElementReference, (i & 2) != 0 ? "product" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, AnonymousClass002.A1R(i, z), (i & 64) != 0 ? null : presentation);
        }

        public Element(ReplyElementReference replyElementReference, String str, String str2, String str3, String str4, boolean z, Presentation presentation) {
            AnonymousClass003.A0u(replyElementReference, str);
            this.reference = replyElementReference;
            this.elementKind = str;
            this.widgetKind = str2;
            this.title = str3;
            this.imageUrl = str4;
            this.isUnavailable = z;
            this.fallback = presentation;
        }
    }

    @Serializable
    public final class FeedUnit extends C06G implements ReplyAttribution {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String category;
        public final String kicker;
        public final String preview;
        public final String unitId;

        public final class Companion {
            public final C9hr<FeedUnit> serializer() {
                return ReplyAttribution$FeedUnit$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FeedUnit feedUnit, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(feedUnit.unitId, c9iZ, 0);
            boolean zAfR = c9j5.AfR();
            if (zAfR || !"".equals(feedUnit.preview)) {
                c9j5.AAV(feedUnit.preview, c9iZ, 1);
            }
            if (zAfR || !"".equals(feedUnit.kicker)) {
                c9j5.AAV(feedUnit.kicker, c9iZ, 2);
            }
            if (zAfR || !"".equals(feedUnit.category)) {
                c9j5.AAV(feedUnit.category, c9iZ, 3);
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FeedUnit) {
                    FeedUnit feedUnit = (FeedUnit) obj;
                    if (!C7384Etj.areEqual(this.unitId, feedUnit.unitId) || !C7384Etj.areEqual(this.preview, feedUnit.preview) || !C7384Etj.areEqual(this.kicker, feedUnit.kicker) || !C7384Etj.areEqual(this.category, feedUnit.category)) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ FeedUnit(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(ReplyAttribution$FeedUnit$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.unitId = str;
            if ((i & 2) == 0) {
                this.preview = "";
            } else {
                this.preview = str2;
            }
            if ((i & 4) == 0) {
                this.kicker = "";
            } else {
                this.kicker = str3;
            }
            if ((i & 8) == 0) {
                this.category = "";
            } else {
                this.category = str4;
            }
        }

        public static /* synthetic */ FeedUnit copy$default(FeedUnit feedUnit, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feedUnit.unitId;
            }
            if ((i & 2) != 0) {
                str2 = feedUnit.preview;
            }
            if ((i & 4) != 0) {
                str3 = feedUnit.kicker;
            }
            if ((i & 8) != 0) {
                str4 = feedUnit.category;
            }
            return feedUnit.copy(str, str2, str3, str4);
        }

        public final String component1() {
            return this.unitId;
        }

        public final String component2() {
            return this.preview;
        }

        public final String component3() {
            return this.kicker;
        }

        public final String component4() {
            return this.category;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getKicker() {
            return this.kicker;
        }

        public final String getPreview() {
            return this.preview;
        }

        public final String getUnitId() {
            return this.unitId;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.category, AnonymousClass005.A0I(this.kicker, AnonymousClass005.A0I(this.preview, AnonymousClass001.A0G(this.unitId))));
        }

        public final FeedUnit copy(String str, String str2, String str3, String str4) {
            AnonymousClass005.A14(str, str2, str3, str4);
            return new FeedUnit(str, str2, str3, str4);
        }

        public String toString() {
            return super.toString();
        }

        public FeedUnit(String str, String str2, String str3, String str4) {
            AnonymousClass005.A14(str, str2, str3, str4);
            this.unitId = str;
            this.preview = str2;
            this.kicker = str3;
            this.category = str4;
        }

        public /* synthetic */ FeedUnit(String str, String str2, String str3, String str4, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }
    }

    @Serializable
    public final class Goal extends C06G implements ReplyAttribution {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String goalId;
        public final String title;

        public final class Companion {
            public final C9hr<Goal> serializer() {
                return ReplyAttribution$Goal$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(Goal goal, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(goal.goalId, c9iZ, 0);
            if (c9j5.AfR() || !C3cH.A1Q(goal.title)) {
                c9j5.AAV(goal.title, c9iZ, 1);
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Goal) {
                    Goal goal = (Goal) obj;
                    if (!C7384Etj.areEqual(this.goalId, goal.goalId) || !C7384Etj.areEqual(this.title, goal.title)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Goal copy$default(Goal goal, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = goal.goalId;
            }
            if ((i & 2) != 0) {
                str2 = goal.title;
            }
            AnonymousClass003.A0u(str, str2);
            return new Goal(str, str2);
        }

        public final String component1() {
            return this.goalId;
        }

        public final String component2() {
            return this.title;
        }

        public final String getGoalId() {
            return this.goalId;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.title, AnonymousClass001.A0G(this.goalId));
        }

        public Goal(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.goalId = str;
            this.title = str2;
        }

        public final Goal copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Goal(str, str2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Goal(int i, String str, String str2, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(ReplyAttribution$Goal$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.goalId = str;
            this.title = (i & 2) == 0 ? "" : str2;
        }

        public /* synthetic */ Goal(String str, String str2, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? "" : str2);
        }
    }

    @Serializable
    public final class Idea extends C06G implements ReplyAttribution {
        public final IdeaWidgetData idea;
        public static final Companion Companion = new Companion();
        public static final int $stable = IdeaWidgetData.$stable;

        public final class Companion {
            public final C9hr<Idea> serializer() {
                return ReplyAttribution$Idea$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public final Idea copy(IdeaWidgetData ideaWidgetData) {
            C7384Etj.A0Y(ideaWidgetData, 0);
            return new Idea(ideaWidgetData);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Idea) && C7384Etj.areEqual(this.idea, ((Idea) obj).idea));
        }

        public /* synthetic */ Idea(int i, IdeaWidgetData ideaWidgetData, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(ReplyAttribution$Idea$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.idea = ideaWidgetData;
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

        public int hashCode() {
            return this.idea.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public Idea(IdeaWidgetData ideaWidgetData) {
            C7384Etj.A0Y(ideaWidgetData, 0);
            this.idea = ideaWidgetData;
        }
    }

    @Serializable
    public final class Message extends C06G implements ReplyAttribution {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String messageId;
        public final String preview;
        public final String previewImagePath;

        public final class Companion {
            public final C9hr<Message> serializer() {
                return ReplyAttribution$Message$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public Message(String str, String str2, String str3) {
            C7384Etj.A0Y(str, 0);
            this.messageId = str;
            this.preview = str2;
            this.previewImagePath = str3;
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(Message message, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(message.messageId, c9iZ, 0);
            boolean zAfR = c9j5.AfR();
            if (zAfR || message.preview != null) {
                c9j5.AAP(message.preview, C07779iq.A01, c9iZ, 1);
            }
            if (zAfR || message.previewImagePath != null) {
                c9j5.AAP(message.previewImagePath, C07779iq.A01, c9iZ, 2);
            }
        }

        public final Message copy(String str, String str2, String str3) {
            C7384Etj.A0Y(str, 0);
            return new Message(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Message) {
                    Message message = (Message) obj;
                    if (!C7384Etj.areEqual(this.messageId, message.messageId) || !C7384Etj.areEqual(this.preview, message.preview) || !C7384Etj.areEqual(this.previewImagePath, message.previewImagePath)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Message copy$default(Message message, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = message.messageId;
            }
            if ((i & 2) != 0) {
                str2 = message.preview;
            }
            if ((i & 4) != 0) {
                str3 = message.previewImagePath;
            }
            return message.copy(str, str2, str3);
        }

        public final String component1() {
            return this.messageId;
        }

        public final String component2() {
            return this.preview;
        }

        public final String component3() {
            return this.previewImagePath;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final String getPreview() {
            return this.preview;
        }

        public final String getPreviewImagePath() {
            return this.previewImagePath;
        }

        public int hashCode() {
            return ((AnonymousClass001.A0G(this.messageId) + AnonymousClass006.A0G(this.preview)) * 31) + AnonymousClass005.A0H(this.previewImagePath);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Message(int i, String str, String str2, String str3, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(ReplyAttribution$Message$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.messageId = str;
            if ((i & 2) == 0) {
                this.preview = null;
            } else {
                this.preview = str2;
            }
            if ((i & 4) == 0) {
                this.previewImagePath = null;
            } else {
                this.previewImagePath = str3;
            }
        }

        public /* synthetic */ Message(String str, String str2, String str3, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    @Serializable
    public final class Presentation extends C06G implements ReplyAttribution {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final String presentationEventId;
        public final String preview;
        public final String previewImagePath;
        public final String replyToText;

        public final class Companion {
            public final C9hr<Presentation> serializer() {
                return ReplyAttribution$Presentation$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(Presentation presentation, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(presentation.presentationEventId, c9iZ, 0);
            boolean zAfR = c9j5.AfR();
            if (zAfR || presentation.preview != null) {
                c9j5.AAP(presentation.preview, C07779iq.A01, c9iZ, 1);
            }
            if (zAfR || presentation.previewImagePath != null) {
                c9j5.AAP(presentation.previewImagePath, C07779iq.A01, c9iZ, 2);
            }
            if (zAfR || presentation.replyToText != null) {
                c9j5.AAP(presentation.replyToText, C07779iq.A01, c9iZ, 3);
            }
        }

        public final Presentation copy(String str, String str2, String str3, String str4) {
            C7384Etj.A0Y(str, 0);
            return new Presentation(str, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Presentation) {
                    Presentation presentation = (Presentation) obj;
                    if (!C7384Etj.areEqual(this.presentationEventId, presentation.presentationEventId) || !C7384Etj.areEqual(this.preview, presentation.preview) || !C7384Etj.areEqual(this.previewImagePath, presentation.previewImagePath) || !C7384Etj.areEqual(this.replyToText, presentation.replyToText)) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ Presentation(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(ReplyAttribution$Presentation$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.presentationEventId = str;
            if ((i & 2) == 0) {
                this.preview = null;
            } else {
                this.preview = str2;
            }
            if ((i & 4) == 0) {
                this.previewImagePath = null;
            } else {
                this.previewImagePath = str3;
            }
            if ((i & 8) == 0) {
                this.replyToText = null;
            } else {
                this.replyToText = str4;
            }
        }

        public static /* synthetic */ Presentation copy$default(Presentation presentation, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = presentation.presentationEventId;
            }
            if ((i & 2) != 0) {
                str2 = presentation.preview;
            }
            if ((i & 4) != 0) {
                str3 = presentation.previewImagePath;
            }
            if ((i & 8) != 0) {
                str4 = presentation.replyToText;
            }
            C7384Etj.A0Y(str, 0);
            return new Presentation(str, str2, str3, str4);
        }

        public final String component1() {
            return this.presentationEventId;
        }

        public final String component2() {
            return this.preview;
        }

        public final String component3() {
            return this.previewImagePath;
        }

        public final String component4() {
            return this.replyToText;
        }

        public final String getPresentationEventId() {
            return this.presentationEventId;
        }

        public final String getPreview() {
            return this.preview;
        }

        public final String getPreviewImagePath() {
            return this.previewImagePath;
        }

        public final String getReplyToText() {
            return this.replyToText;
        }

        public int hashCode() {
            return ((((AnonymousClass001.A0G(this.presentationEventId) + AnonymousClass006.A0G(this.preview)) * 31) + AnonymousClass006.A0G(this.previewImagePath)) * 31) + AnonymousClass005.A0H(this.replyToText);
        }

        public String toString() {
            return super.toString();
        }

        public Presentation(String str, String str2, String str3, String str4) {
            C7384Etj.A0Y(str, 0);
            this.presentationEventId = str;
            this.preview = str2;
            this.previewImagePath = str3;
            this.replyToText = str4;
        }

        public /* synthetic */ Presentation(String str, String str2, String str3, String str4, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    @Serializable
    public final class Product extends C06G implements ReplyAttribution {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion();
        public final Integer index;
        public final String name;
        public final String presentationEventId;
        public final String productId;
        public final String url;

        public final class Companion {
            public final C9hr<Product> serializer() {
                return ReplyAttribution$Product$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(Product product, C9j5 c9j5, C9iZ c9iZ) {
            boolean zAfR = c9j5.AfR();
            if (zAfR || product.presentationEventId != null) {
                c9j5.AAP(product.presentationEventId, C07779iq.A01, c9iZ, 0);
            }
            if (zAfR || product.productId != null) {
                c9j5.AAP(product.productId, C07779iq.A01, c9iZ, 1);
            }
            if (zAfR || product.url != null) {
                c9j5.AAP(product.url, C07779iq.A01, c9iZ, 2);
            }
            if (zAfR || product.name != null) {
                c9j5.AAP(product.name, C07779iq.A01, c9iZ, 3);
            }
            if (zAfR || product.index != null) {
                c9j5.AAP(product.index, C07729ii.A00, c9iZ, 4);
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Product) {
                    Product product = (Product) obj;
                    if (!C7384Etj.areEqual(this.presentationEventId, product.presentationEventId) || !C7384Etj.areEqual(this.productId, product.productId) || !C7384Etj.areEqual(this.url, product.url) || !C7384Etj.areEqual(this.name, product.name) || !C7384Etj.areEqual(this.index, product.index)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Product copy$default(Product product, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = product.presentationEventId;
            }
            if ((i & 2) != 0) {
                str2 = product.productId;
            }
            if ((i & 4) != 0) {
                str3 = product.url;
            }
            if ((i & 8) != 0) {
                str4 = product.name;
            }
            if ((i & 16) != 0) {
                num = product.index;
            }
            return product.copy(str, str2, str3, str4, num);
        }

        public final String component1() {
            return this.presentationEventId;
        }

        public final String component2() {
            return this.productId;
        }

        public final String component3() {
            return this.url;
        }

        public final String component4() {
            return this.name;
        }

        public final Integer component5() {
            return this.index;
        }

        public final Product copy(String str, String str2, String str3, String str4, Integer num) {
            return new Product(str, str2, str3, str4, num);
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPresentationEventId() {
            return this.presentationEventId;
        }

        public final String getProductId() {
            return this.productId;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (((((((AnonymousClass006.A0G(this.presentationEventId) * 31) + AnonymousClass006.A0G(this.productId)) * 31) + AnonymousClass006.A0G(this.url)) * 31) + AnonymousClass006.A0G(this.name)) * 31) + C3cH.A02(this.index);
        }

        public Product(String str, String str2, String str3, String str4, Integer num) {
            this.presentationEventId = str;
            this.productId = str2;
            this.url = str3;
            this.name = str4;
            this.index = num;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Product(String str, String str2, String str3, String str4, Integer num, int i, C06H c06h) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num);
        }

        public /* synthetic */ Product(int i, String str, String str2, String str3, String str4, Integer num, C2hx c2hx) {
            if ((i & 1) == 0) {
                this.presentationEventId = null;
            } else {
                this.presentationEventId = str;
            }
            if ((i & 2) == 0) {
                this.productId = null;
            } else {
                this.productId = str2;
            }
            if ((i & 4) == 0) {
                this.url = null;
            } else {
                this.url = str3;
            }
            if ((i & 8) == 0) {
                this.name = null;
            } else {
                this.name = str4;
            }
            if ((i & 16) == 0) {
                this.index = null;
            } else {
                this.index = num;
            }
        }

        public Product() {
            this(null, null, null, null, null);
        }
    }
}
