package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.FGI;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.model.ReplyAttribution;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;

/* loaded from: classes3.dex */
public final class ReplyAttributionSerializer implements C9hr<ReplyAttribution> {
    public static final int $stable = 0;
    public static final String TYPE_CONTEXT = "context";
    public static final String TYPE_ELEMENT = "element";
    public static final String TYPE_FEED_UNIT = "feed_unit";
    public static final String TYPE_GOAL = "goal";
    public static final String TYPE_IDEA = "idea";
    public static final String TYPE_MESSAGE = "message";
    public static final String TYPE_PRESENTATION = "presentation";
    public static final String TYPE_PRODUCT = "product";
    public static final ReplyAttributionSerializer INSTANCE = new ReplyAttributionSerializer();
    public static final C9iZ descriptor = ReplyAttributionSerializer$Surrogate$$serializer.descriptor;

    @Serializable
    public final class Surrogate extends C06G {
        public static final Companion Companion = new Companion();
        public final ReplyAttribution.Context context;
        public final ReplyAttribution.Element element;
        public final ReplyAttribution.FeedUnit feedUnit;
        public final ReplyAttribution.Goal goal;
        public final ReplyAttribution.Idea idea;
        public final ReplyAttribution.Message message;
        public final ReplyAttribution.Presentation presentation;
        public final ReplyAttribution.Product product;
        public final String type;

        public final class Companion {
            public final C9hr<Surrogate> serializer() {
                return ReplyAttributionSerializer$Surrogate$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public Surrogate(String str, ReplyAttribution.Message message, ReplyAttribution.Idea idea, ReplyAttribution.Presentation presentation, ReplyAttribution.Product product, ReplyAttribution.Element element, ReplyAttribution.FeedUnit feedUnit, ReplyAttribution.Goal goal, ReplyAttribution.Context context) {
            C7384Etj.A0Y(str, 0);
            this.type = str;
            this.message = message;
            this.idea = idea;
            this.presentation = presentation;
            this.product = product;
            this.element = element;
            this.feedUnit = feedUnit;
            this.goal = goal;
            this.context = context;
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(Surrogate surrogate, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(surrogate.type, c9iZ, 0);
            boolean zAfR = c9j5.AfR();
            if (zAfR || surrogate.message != null) {
                c9j5.AAP(surrogate.message, ReplyAttribution$Message$$serializer.INSTANCE, c9iZ, 1);
            }
            if (zAfR || surrogate.idea != null) {
                c9j5.AAP(surrogate.idea, ReplyAttribution$Idea$$serializer.INSTANCE, c9iZ, 2);
            }
            if (zAfR || surrogate.presentation != null) {
                c9j5.AAP(surrogate.presentation, ReplyAttribution$Presentation$$serializer.INSTANCE, c9iZ, 3);
            }
            if (zAfR || surrogate.product != null) {
                c9j5.AAP(surrogate.product, ReplyAttribution$Product$$serializer.INSTANCE, c9iZ, 4);
            }
            if (zAfR || surrogate.element != null) {
                c9j5.AAP(surrogate.element, ReplyAttribution$Element$$serializer.INSTANCE, c9iZ, 5);
            }
            if (zAfR || surrogate.feedUnit != null) {
                c9j5.AAP(surrogate.feedUnit, ReplyAttribution$FeedUnit$$serializer.INSTANCE, c9iZ, 6);
            }
            if (zAfR || surrogate.goal != null) {
                c9j5.AAP(surrogate.goal, ReplyAttribution$Goal$$serializer.INSTANCE, c9iZ, 7);
            }
            if (zAfR || surrogate.context != null) {
                c9j5.AAP(surrogate.context, ReplyAttribution$Context$$serializer.INSTANCE, c9iZ, 8);
            }
        }

        public final Surrogate copy(String str, ReplyAttribution.Message message, ReplyAttribution.Idea idea, ReplyAttribution.Presentation presentation, ReplyAttribution.Product product, ReplyAttribution.Element element, ReplyAttribution.FeedUnit feedUnit, ReplyAttribution.Goal goal, ReplyAttribution.Context context) {
            C7384Etj.A0Y(str, 0);
            return new Surrogate(str, message, idea, presentation, product, element, feedUnit, goal, context);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Surrogate) {
                    Surrogate surrogate = (Surrogate) obj;
                    if (!C7384Etj.areEqual(this.type, surrogate.type) || !C7384Etj.areEqual(this.message, surrogate.message) || !C7384Etj.areEqual(this.idea, surrogate.idea) || !C7384Etj.areEqual(this.presentation, surrogate.presentation) || !C7384Etj.areEqual(this.product, surrogate.product) || !C7384Etj.areEqual(this.element, surrogate.element) || !C7384Etj.areEqual(this.feedUnit, surrogate.feedUnit) || !C7384Etj.areEqual(this.goal, surrogate.goal) || !C7384Etj.areEqual(this.context, surrogate.context)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, ReplyAttribution.Message message, ReplyAttribution.Idea idea, ReplyAttribution.Presentation presentation, ReplyAttribution.Product product, ReplyAttribution.Element element, ReplyAttribution.FeedUnit feedUnit, ReplyAttribution.Goal goal, ReplyAttribution.Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.type;
            }
            if ((i & 2) != 0) {
                message = surrogate.message;
            }
            if ((i & 4) != 0) {
                idea = surrogate.idea;
            }
            if ((i & 8) != 0) {
                presentation = surrogate.presentation;
            }
            if ((i & 16) != 0) {
                product = surrogate.product;
            }
            if ((i & 32) != 0) {
                element = surrogate.element;
            }
            if ((i & 64) != 0) {
                feedUnit = surrogate.feedUnit;
            }
            if ((i & 128) != 0) {
                goal = surrogate.goal;
            }
            if ((i & 256) != 0) {
                context = surrogate.context;
            }
            return surrogate.copy(str, message, idea, presentation, product, element, feedUnit, goal, context);
        }

        public final String component1() {
            return this.type;
        }

        public final ReplyAttribution.Message component2() {
            return this.message;
        }

        public final ReplyAttribution.Idea component3() {
            return this.idea;
        }

        public final ReplyAttribution.Presentation component4() {
            return this.presentation;
        }

        public final ReplyAttribution.Product component5() {
            return this.product;
        }

        public final ReplyAttribution.Element component6() {
            return this.element;
        }

        public final ReplyAttribution.FeedUnit component7() {
            return this.feedUnit;
        }

        public final ReplyAttribution.Goal component8() {
            return this.goal;
        }

        public final ReplyAttribution.Context component9() {
            return this.context;
        }

        public final ReplyAttribution.Context getContext() {
            return this.context;
        }

        public final ReplyAttribution.Element getElement() {
            return this.element;
        }

        public final ReplyAttribution.FeedUnit getFeedUnit() {
            return this.feedUnit;
        }

        public final ReplyAttribution.Goal getGoal() {
            return this.goal;
        }

        public final ReplyAttribution.Idea getIdea() {
            return this.idea;
        }

        public final ReplyAttribution.Message getMessage() {
            return this.message;
        }

        public final ReplyAttribution.Presentation getPresentation() {
            return this.presentation;
        }

        public final ReplyAttribution.Product getProduct() {
            return this.product;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return ((((((((((((((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0D(this.message)) * 31) + AnonymousClass006.A0D(this.idea)) * 31) + AnonymousClass006.A0D(this.presentation)) * 31) + AnonymousClass006.A0D(this.product)) * 31) + AnonymousClass006.A0D(this.element)) * 31) + AnonymousClass006.A0D(this.feedUnit)) * 31) + AnonymousClass006.A0D(this.goal)) * 31) + C3cH.A02(this.context);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Surrogate(String str, ReplyAttribution.Message message, ReplyAttribution.Idea idea, ReplyAttribution.Presentation presentation, ReplyAttribution.Product product, ReplyAttribution.Element element, ReplyAttribution.FeedUnit feedUnit, ReplyAttribution.Goal goal, ReplyAttribution.Context context, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : message, (i & 4) != 0 ? null : idea, (i & 8) != 0 ? null : presentation, (i & 16) != 0 ? null : product, (i & 32) != 0 ? null : element, (i & 64) != 0 ? null : feedUnit, (i & 128) != 0 ? null : goal, (i & 256) != 0 ? null : context);
        }

        public /* synthetic */ Surrogate(int i, String str, ReplyAttribution.Message message, ReplyAttribution.Idea idea, ReplyAttribution.Presentation presentation, ReplyAttribution.Product product, ReplyAttribution.Element element, ReplyAttribution.FeedUnit feedUnit, ReplyAttribution.Goal goal, ReplyAttribution.Context context, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(ReplyAttributionSerializer$Surrogate$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.type = str;
            if ((i & 2) == 0) {
                this.message = null;
            } else {
                this.message = message;
            }
            if ((i & 4) == 0) {
                this.idea = null;
            } else {
                this.idea = idea;
            }
            if ((i & 8) == 0) {
                this.presentation = null;
            } else {
                this.presentation = presentation;
            }
            if ((i & 16) == 0) {
                this.product = null;
            } else {
                this.product = product;
            }
            if ((i & 32) == 0) {
                this.element = null;
            } else {
                this.element = element;
            }
            if ((i & 64) == 0) {
                this.feedUnit = null;
            } else {
                this.feedUnit = feedUnit;
            }
            if ((i & 128) == 0) {
                this.goal = null;
            } else {
                this.goal = goal;
            }
            if ((i & 256) == 0) {
                this.context = null;
            } else {
                this.context = context;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C9jG
    public ReplyAttribution deserialize(InterfaceC07829iw interfaceC07829iw) {
        ReplyAttribution replyAttribution;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        Surrogate surrogate = (Surrogate) interfaceC07829iw.A8b(ReplyAttributionSerializer$Surrogate$$serializer.INSTANCE);
        String str = surrogate.type;
        switch (str.hashCode()) {
            case -1662836996:
                if (str.equals(TYPE_ELEMENT)) {
                    replyAttribution = surrogate.element;
                    break;
                }
                throw new SerializationException(FGI.A0M("Unknown reply attribution type: ", str));
            case -1643741307:
                if (str.equals(TYPE_FEED_UNIT)) {
                    replyAttribution = surrogate.feedUnit;
                    break;
                }
                throw new SerializationException(FGI.A0M("Unknown reply attribution type: ", str));
            case -309474065:
                if (str.equals("product")) {
                    replyAttribution = surrogate.product;
                    break;
                }
                throw new SerializationException(FGI.A0M("Unknown reply attribution type: ", str));
            case 3178259:
                if (str.equals(TYPE_GOAL)) {
                    replyAttribution = surrogate.goal;
                    break;
                }
                throw new SerializationException(FGI.A0M("Unknown reply attribution type: ", str));
            case 3227383:
                if (str.equals("idea")) {
                    replyAttribution = surrogate.idea;
                    break;
                }
                throw new SerializationException(FGI.A0M("Unknown reply attribution type: ", str));
            case 696975130:
                if (str.equals(TYPE_PRESENTATION)) {
                    replyAttribution = surrogate.presentation;
                    break;
                }
                throw new SerializationException(FGI.A0M("Unknown reply attribution type: ", str));
            case 951530927:
                if (str.equals(TYPE_CONTEXT)) {
                    replyAttribution = surrogate.context;
                    break;
                }
                throw new SerializationException(FGI.A0M("Unknown reply attribution type: ", str));
            case 954925063:
                if (str.equals(TYPE_MESSAGE)) {
                    replyAttribution = surrogate.message;
                    break;
                }
                throw new SerializationException(FGI.A0M("Unknown reply attribution type: ", str));
            default:
                throw new SerializationException(FGI.A0M("Unknown reply attribution type: ", str));
        }
        ReplyAttribution replyAttribution2 = replyAttribution;
        if (replyAttribution2 != null) {
            return replyAttribution2;
        }
        throw new SerializationException(FGI.A0M("Unknown reply attribution type: ", str));
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, ReplyAttribution replyAttribution) {
        Surrogate surrogate;
        AnonymousClass003.A0u(interfaceC07789is, replyAttribution);
        if (replyAttribution instanceof ReplyAttribution.Message) {
            surrogate = new Surrogate(TYPE_MESSAGE, (ReplyAttribution.Message) replyAttribution, null, null, null, null, null, null, null);
        } else if (replyAttribution instanceof ReplyAttribution.Idea) {
            surrogate = new Surrogate("idea", null, (ReplyAttribution.Idea) replyAttribution, null, null, null, null, null, null);
        } else if (replyAttribution instanceof ReplyAttribution.Presentation) {
            surrogate = new Surrogate(TYPE_PRESENTATION, null, null, (ReplyAttribution.Presentation) replyAttribution, null, null, null, null, null);
        } else if (replyAttribution instanceof ReplyAttribution.Element) {
            surrogate = new Surrogate(TYPE_ELEMENT, null, null, null, null, (ReplyAttribution.Element) replyAttribution, null, null, null);
        } else if (replyAttribution instanceof ReplyAttribution.Product) {
            surrogate = new Surrogate("product", null, null, null, (ReplyAttribution.Product) replyAttribution, null, null, null, null);
        } else if (replyAttribution instanceof ReplyAttribution.FeedUnit) {
            surrogate = new Surrogate(TYPE_FEED_UNIT, null, null, null, null, null, (ReplyAttribution.FeedUnit) replyAttribution, null, null);
        } else if (replyAttribution instanceof ReplyAttribution.Goal) {
            surrogate = new Surrogate(TYPE_GOAL, null, null, null, null, null, null, (ReplyAttribution.Goal) replyAttribution, null);
        } else {
            if (!(replyAttribution instanceof ReplyAttribution.Context)) {
                throw C3cG.A0q();
            }
            surrogate = new Surrogate(TYPE_CONTEXT, null, null, null, null, null, null, null, (ReplyAttribution.Context) replyAttribution);
        }
        interfaceC07789is.AAR(surrogate, ReplyAttributionSerializer$Surrogate$$serializer.INSTANCE);
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }
}
