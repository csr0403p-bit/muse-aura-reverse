package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlinx.serialization.Serializable;

/* loaded from: classes3.dex */
public final class HatchWidgetDataSerializer implements C9hr<HatchWidgetData> {
    public static final int $stable = 0;
    public static final HatchWidgetDataSerializer INSTANCE = new HatchWidgetDataSerializer();
    public static final C9iZ descriptor;

    @Serializable
    public final class Surrogate extends C06G {
        public final HtmlWidgetData html;
        public final IdeaWidgetData idea;
        public final IdeaGroupWidgetData ideaGroup;
        public final ImageOptionsWidgetData imageOptions;
        public final String kind;
        public final LetterWidgetData letter;
        public final LocalMapWidgetData localMap;
        public final MarketplaceMapWidgetData marketplaceMap;
        public final NavigationWidgetData navigation;
        public final NodeCardWidgetData nodeCard;
        public final OpaqueWidgetData opaque;
        public final OptionWidgetData option;
        public final SpaceBuildCompletedWidgetData spaceBuildCompleted;
        public final UnrenderableWidgetData unrenderable;
        public final VoiceOptionsWidgetData voiceOptions;
        public static final Companion Companion = new Companion();
        public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, HatchWidgetDataSerializer$Surrogate$Companion$$childSerializers$1.INSTANCE)};

        public final class Companion {
            public final C9hr<Surrogate> serializer() {
                return HatchWidgetDataSerializer$Surrogate$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public final Surrogate copy(String str, HtmlWidgetData htmlWidgetData, LocalMapWidgetData localMapWidgetData, MarketplaceMapWidgetData marketplaceMapWidgetData, OptionWidgetData optionWidgetData, ImageOptionsWidgetData imageOptionsWidgetData, VoiceOptionsWidgetData voiceOptionsWidgetData, LetterWidgetData letterWidgetData, IdeaWidgetData ideaWidgetData, IdeaGroupWidgetData ideaGroupWidgetData, NavigationWidgetData navigationWidgetData, SpaceBuildCompletedWidgetData spaceBuildCompletedWidgetData, NodeCardWidgetData nodeCardWidgetData, OpaqueWidgetData opaqueWidgetData, UnrenderableWidgetData unrenderableWidgetData) {
            C7384Etj.A0Y(str, 0);
            return new Surrogate(str, htmlWidgetData, localMapWidgetData, marketplaceMapWidgetData, optionWidgetData, imageOptionsWidgetData, voiceOptionsWidgetData, letterWidgetData, ideaWidgetData, ideaGroupWidgetData, navigationWidgetData, spaceBuildCompletedWidgetData, nodeCardWidgetData, opaqueWidgetData, unrenderableWidgetData);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Surrogate) {
                    Surrogate surrogate = (Surrogate) obj;
                    if (!C7384Etj.areEqual(this.kind, surrogate.kind) || !C7384Etj.areEqual(this.html, surrogate.html) || !C7384Etj.areEqual(this.localMap, surrogate.localMap) || !C7384Etj.areEqual(this.marketplaceMap, surrogate.marketplaceMap) || !C7384Etj.areEqual(this.option, surrogate.option) || !C7384Etj.areEqual(this.imageOptions, surrogate.imageOptions) || !C7384Etj.areEqual(this.voiceOptions, surrogate.voiceOptions) || !C7384Etj.areEqual(this.letter, surrogate.letter) || !C7384Etj.areEqual(this.idea, surrogate.idea) || !C7384Etj.areEqual(this.ideaGroup, surrogate.ideaGroup) || !C7384Etj.areEqual(this.navigation, surrogate.navigation) || !C7384Etj.areEqual(this.spaceBuildCompleted, surrogate.spaceBuildCompleted) || !C7384Etj.areEqual(this.nodeCard, surrogate.nodeCard) || !C7384Etj.areEqual(this.opaque, surrogate.opaque) || !C7384Etj.areEqual(this.unrenderable, surrogate.unrenderable)) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ Surrogate(String str, HtmlWidgetData htmlWidgetData, LocalMapWidgetData localMapWidgetData, MarketplaceMapWidgetData marketplaceMapWidgetData, OptionWidgetData optionWidgetData, ImageOptionsWidgetData imageOptionsWidgetData, VoiceOptionsWidgetData voiceOptionsWidgetData, LetterWidgetData letterWidgetData, IdeaWidgetData ideaWidgetData, IdeaGroupWidgetData ideaGroupWidgetData, NavigationWidgetData navigationWidgetData, SpaceBuildCompletedWidgetData spaceBuildCompletedWidgetData, NodeCardWidgetData nodeCardWidgetData, OpaqueWidgetData opaqueWidgetData, UnrenderableWidgetData unrenderableWidgetData, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : htmlWidgetData, (i & 4) != 0 ? null : localMapWidgetData, (i & 8) != 0 ? null : marketplaceMapWidgetData, (i & 16) != 0 ? null : optionWidgetData, (i & 32) != 0 ? null : imageOptionsWidgetData, (i & 64) != 0 ? null : voiceOptionsWidgetData, (i & 128) != 0 ? null : letterWidgetData, (i & 256) != 0 ? null : ideaWidgetData, (i & 512) != 0 ? null : ideaGroupWidgetData, (i & 1024) != 0 ? null : navigationWidgetData, (i & 2048) != 0 ? null : spaceBuildCompletedWidgetData, (i & 4096) != 0 ? null : nodeCardWidgetData, (i & 8192) != 0 ? null : opaqueWidgetData, (i & 16384) != 0 ? null : unrenderableWidgetData);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, HtmlWidgetData htmlWidgetData, LocalMapWidgetData localMapWidgetData, MarketplaceMapWidgetData marketplaceMapWidgetData, OptionWidgetData optionWidgetData, ImageOptionsWidgetData imageOptionsWidgetData, VoiceOptionsWidgetData voiceOptionsWidgetData, LetterWidgetData letterWidgetData, IdeaWidgetData ideaWidgetData, IdeaGroupWidgetData ideaGroupWidgetData, NavigationWidgetData navigationWidgetData, SpaceBuildCompletedWidgetData spaceBuildCompletedWidgetData, NodeCardWidgetData nodeCardWidgetData, OpaqueWidgetData opaqueWidgetData, UnrenderableWidgetData unrenderableWidgetData, int i, Object obj) {
            LocalMapWidgetData localMapWidgetData2 = localMapWidgetData;
            MarketplaceMapWidgetData marketplaceMapWidgetData2 = marketplaceMapWidgetData;
            OptionWidgetData optionWidgetData2 = optionWidgetData;
            ImageOptionsWidgetData imageOptionsWidgetData2 = imageOptionsWidgetData;
            VoiceOptionsWidgetData voiceOptionsWidgetData2 = voiceOptionsWidgetData;
            LetterWidgetData letterWidgetData2 = letterWidgetData;
            IdeaWidgetData ideaWidgetData2 = ideaWidgetData;
            IdeaGroupWidgetData ideaGroupWidgetData2 = ideaGroupWidgetData;
            NavigationWidgetData navigationWidgetData2 = navigationWidgetData;
            SpaceBuildCompletedWidgetData spaceBuildCompletedWidgetData2 = spaceBuildCompletedWidgetData;
            NodeCardWidgetData nodeCardWidgetData2 = nodeCardWidgetData;
            OpaqueWidgetData opaqueWidgetData2 = opaqueWidgetData;
            UnrenderableWidgetData unrenderableWidgetData2 = unrenderableWidgetData;
            if ((i & 1) != 0) {
                str = surrogate.kind;
            }
            if ((i & 2) != 0) {
                htmlWidgetData = surrogate.html;
            }
            if ((i & 4) != 0) {
                localMapWidgetData2 = surrogate.localMap;
            }
            if ((i & 8) != 0) {
                marketplaceMapWidgetData2 = surrogate.marketplaceMap;
            }
            if ((i & 16) != 0) {
                optionWidgetData2 = surrogate.option;
            }
            if ((i & 32) != 0) {
                imageOptionsWidgetData2 = surrogate.imageOptions;
            }
            if ((i & 64) != 0) {
                voiceOptionsWidgetData2 = surrogate.voiceOptions;
            }
            if ((i & 128) != 0) {
                letterWidgetData2 = surrogate.letter;
            }
            if ((i & 256) != 0) {
                ideaWidgetData2 = surrogate.idea;
            }
            if ((i & 512) != 0) {
                ideaGroupWidgetData2 = surrogate.ideaGroup;
            }
            if ((i & 1024) != 0) {
                navigationWidgetData2 = surrogate.navigation;
            }
            if ((i & 2048) != 0) {
                spaceBuildCompletedWidgetData2 = surrogate.spaceBuildCompleted;
            }
            if ((i & 4096) != 0) {
                nodeCardWidgetData2 = surrogate.nodeCard;
            }
            if ((i & 8192) != 0) {
                opaqueWidgetData2 = surrogate.opaque;
            }
            if ((i & 16384) != 0) {
                unrenderableWidgetData2 = surrogate.unrenderable;
            }
            return surrogate.copy(str, htmlWidgetData, localMapWidgetData2, marketplaceMapWidgetData2, optionWidgetData2, imageOptionsWidgetData2, voiceOptionsWidgetData2, letterWidgetData2, ideaWidgetData2, ideaGroupWidgetData2, navigationWidgetData2, spaceBuildCompletedWidgetData2, nodeCardWidgetData2, opaqueWidgetData2, unrenderableWidgetData2);
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(Surrogate surrogate, C9j5 c9j5, C9iZ c9iZ) {
            F0C<C9hr<Object>>[] f0cArr = $childSerializers;
            c9j5.AAV(surrogate.kind, c9iZ, 0);
            boolean zAfR = c9j5.AfR();
            if (zAfR || surrogate.html != null) {
                c9j5.AAP(surrogate.html, HtmlWidgetData$$serializer.INSTANCE, c9iZ, 1);
            }
            if (zAfR || surrogate.localMap != null) {
                c9j5.AAP(surrogate.localMap, LocalMapWidgetDataSerializer.INSTANCE, c9iZ, 2);
            }
            if (zAfR || surrogate.marketplaceMap != null) {
                c9j5.AAP(surrogate.marketplaceMap, MarketplaceMapWidgetDataSerializer.INSTANCE, c9iZ, 3);
            }
            if (zAfR || surrogate.option != null) {
                c9j5.AAP(surrogate.option, OptionWidgetData$$serializer.INSTANCE, c9iZ, 4);
            }
            if (zAfR || surrogate.imageOptions != null) {
                c9j5.AAP(surrogate.imageOptions, ImageOptionsWidgetData$$serializer.INSTANCE, c9iZ, 5);
            }
            if (zAfR || surrogate.voiceOptions != null) {
                c9j5.AAP(surrogate.voiceOptions, VoiceOptionsWidgetData$$serializer.INSTANCE, c9iZ, 6);
            }
            if (zAfR || surrogate.letter != null) {
                c9j5.AAP(surrogate.letter, LetterWidgetData$$serializer.INSTANCE, c9iZ, 7);
            }
            if (zAfR || surrogate.idea != null) {
                c9j5.AAP(surrogate.idea, IdeaWidgetData$$serializer.INSTANCE, c9iZ, 8);
            }
            if (zAfR || surrogate.ideaGroup != null) {
                c9j5.AAP(surrogate.ideaGroup, IdeaGroupWidgetData$$serializer.INSTANCE, c9iZ, 9);
            }
            if (zAfR || surrogate.navigation != null) {
                c9j5.AAP(surrogate.navigation, NavigationWidgetData$$serializer.INSTANCE, c9iZ, 10);
            }
            if (zAfR || surrogate.spaceBuildCompleted != null) {
                c9j5.AAP(surrogate.spaceBuildCompleted, SpaceBuildCompletedWidgetData$$serializer.INSTANCE, c9iZ, 11);
            }
            if (zAfR || surrogate.nodeCard != null) {
                c9j5.AAP(surrogate.nodeCard, NodeCardWidgetData$$serializer.INSTANCE, c9iZ, 12);
            }
            if (zAfR || surrogate.opaque != null) {
                c9j5.AAP(surrogate.opaque, OpaqueWidgetData$$serializer.INSTANCE, c9iZ, 13);
            }
            if (zAfR || surrogate.unrenderable != null) {
                c9j5.AAP(surrogate.unrenderable, C3cH.A15(f0cArr, 14), c9iZ, 14);
            }
        }

        public final String component1() {
            return this.kind;
        }

        public final IdeaGroupWidgetData component10() {
            return this.ideaGroup;
        }

        public final NavigationWidgetData component11() {
            return this.navigation;
        }

        public final SpaceBuildCompletedWidgetData component12() {
            return this.spaceBuildCompleted;
        }

        public final NodeCardWidgetData component13() {
            return this.nodeCard;
        }

        public final OpaqueWidgetData component14() {
            return this.opaque;
        }

        public final UnrenderableWidgetData component15() {
            return this.unrenderable;
        }

        public final HtmlWidgetData component2() {
            return this.html;
        }

        public final LocalMapWidgetData component3() {
            return this.localMap;
        }

        public final MarketplaceMapWidgetData component4() {
            return this.marketplaceMap;
        }

        public final OptionWidgetData component5() {
            return this.option;
        }

        public final ImageOptionsWidgetData component6() {
            return this.imageOptions;
        }

        public final VoiceOptionsWidgetData component7() {
            return this.voiceOptions;
        }

        public final LetterWidgetData component8() {
            return this.letter;
        }

        public final IdeaWidgetData component9() {
            return this.idea;
        }

        public final HtmlWidgetData getHtml() {
            return this.html;
        }

        public final IdeaWidgetData getIdea() {
            return this.idea;
        }

        public final IdeaGroupWidgetData getIdeaGroup() {
            return this.ideaGroup;
        }

        public final ImageOptionsWidgetData getImageOptions() {
            return this.imageOptions;
        }

        public final String getKind() {
            return this.kind;
        }

        public final LetterWidgetData getLetter() {
            return this.letter;
        }

        public final LocalMapWidgetData getLocalMap() {
            return this.localMap;
        }

        public final MarketplaceMapWidgetData getMarketplaceMap() {
            return this.marketplaceMap;
        }

        public final NavigationWidgetData getNavigation() {
            return this.navigation;
        }

        public final NodeCardWidgetData getNodeCard() {
            return this.nodeCard;
        }

        public final OpaqueWidgetData getOpaque() {
            return this.opaque;
        }

        public final OptionWidgetData getOption() {
            return this.option;
        }

        public final SpaceBuildCompletedWidgetData getSpaceBuildCompleted() {
            return this.spaceBuildCompleted;
        }

        public final UnrenderableWidgetData getUnrenderable() {
            return this.unrenderable;
        }

        public final VoiceOptionsWidgetData getVoiceOptions() {
            return this.voiceOptions;
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0D(this.html)) * 31) + AnonymousClass006.A0D(this.localMap)) * 31) + AnonymousClass006.A0D(this.marketplaceMap)) * 31) + AnonymousClass006.A0D(this.option)) * 31) + AnonymousClass006.A0D(this.imageOptions)) * 31) + AnonymousClass006.A0D(this.voiceOptions)) * 31) + AnonymousClass006.A0D(this.letter)) * 31) + AnonymousClass006.A0D(this.idea)) * 31) + AnonymousClass006.A0D(this.ideaGroup)) * 31) + AnonymousClass006.A0D(this.navigation)) * 31) + AnonymousClass006.A0D(this.spaceBuildCompleted)) * 31) + AnonymousClass006.A0D(this.nodeCard)) * 31) + AnonymousClass006.A0D(this.opaque)) * 31) + C3cH.A02(this.unrenderable);
        }

        public String toString() {
            return super.toString();
        }

        public Surrogate(String str, HtmlWidgetData htmlWidgetData, LocalMapWidgetData localMapWidgetData, MarketplaceMapWidgetData marketplaceMapWidgetData, OptionWidgetData optionWidgetData, ImageOptionsWidgetData imageOptionsWidgetData, VoiceOptionsWidgetData voiceOptionsWidgetData, LetterWidgetData letterWidgetData, IdeaWidgetData ideaWidgetData, IdeaGroupWidgetData ideaGroupWidgetData, NavigationWidgetData navigationWidgetData, SpaceBuildCompletedWidgetData spaceBuildCompletedWidgetData, NodeCardWidgetData nodeCardWidgetData, OpaqueWidgetData opaqueWidgetData, UnrenderableWidgetData unrenderableWidgetData) {
            C7384Etj.A0Y(str, 0);
            this.kind = str;
            this.html = htmlWidgetData;
            this.localMap = localMapWidgetData;
            this.marketplaceMap = marketplaceMapWidgetData;
            this.option = optionWidgetData;
            this.imageOptions = imageOptionsWidgetData;
            this.voiceOptions = voiceOptionsWidgetData;
            this.letter = letterWidgetData;
            this.idea = ideaWidgetData;
            this.ideaGroup = ideaGroupWidgetData;
            this.navigation = navigationWidgetData;
            this.spaceBuildCompleted = spaceBuildCompletedWidgetData;
            this.nodeCard = nodeCardWidgetData;
            this.opaque = opaqueWidgetData;
            this.unrenderable = unrenderableWidgetData;
        }

        public /* synthetic */ Surrogate(int i, String str, HtmlWidgetData htmlWidgetData, LocalMapWidgetData localMapWidgetData, MarketplaceMapWidgetData marketplaceMapWidgetData, OptionWidgetData optionWidgetData, ImageOptionsWidgetData imageOptionsWidgetData, VoiceOptionsWidgetData voiceOptionsWidgetData, LetterWidgetData letterWidgetData, IdeaWidgetData ideaWidgetData, IdeaGroupWidgetData ideaGroupWidgetData, NavigationWidgetData navigationWidgetData, SpaceBuildCompletedWidgetData spaceBuildCompletedWidgetData, NodeCardWidgetData nodeCardWidgetData, OpaqueWidgetData opaqueWidgetData, UnrenderableWidgetData unrenderableWidgetData, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(HatchWidgetDataSerializer$Surrogate$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.kind = str;
            if ((i & 2) == 0) {
                this.html = null;
            } else {
                this.html = htmlWidgetData;
            }
            if ((i & 4) == 0) {
                this.localMap = null;
            } else {
                this.localMap = localMapWidgetData;
            }
            if ((i & 8) == 0) {
                this.marketplaceMap = null;
            } else {
                this.marketplaceMap = marketplaceMapWidgetData;
            }
            if ((i & 16) == 0) {
                this.option = null;
            } else {
                this.option = optionWidgetData;
            }
            if ((i & 32) == 0) {
                this.imageOptions = null;
            } else {
                this.imageOptions = imageOptionsWidgetData;
            }
            if ((i & 64) == 0) {
                this.voiceOptions = null;
            } else {
                this.voiceOptions = voiceOptionsWidgetData;
            }
            if ((i & 128) == 0) {
                this.letter = null;
            } else {
                this.letter = letterWidgetData;
            }
            if ((i & 256) == 0) {
                this.idea = null;
            } else {
                this.idea = ideaWidgetData;
            }
            if ((i & 512) == 0) {
                this.ideaGroup = null;
            } else {
                this.ideaGroup = ideaGroupWidgetData;
            }
            if ((i & 1024) == 0) {
                this.navigation = null;
            } else {
                this.navigation = navigationWidgetData;
            }
            if ((i & 2048) == 0) {
                this.spaceBuildCompleted = null;
            } else {
                this.spaceBuildCompleted = spaceBuildCompletedWidgetData;
            }
            if ((i & 4096) == 0) {
                this.nodeCard = null;
            } else {
                this.nodeCard = nodeCardWidgetData;
            }
            if ((i & 8192) == 0) {
                this.opaque = null;
            } else {
                this.opaque = opaqueWidgetData;
            }
            if ((i & 16384) == 0) {
                this.unrenderable = null;
            } else {
                this.unrenderable = unrenderableWidgetData;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C9jG
    public HatchWidgetData deserialize(InterfaceC07829iw interfaceC07829iw) {
        HatchWidgetData hatchWidgetData;
        MarketplaceMapWidgetData marketplaceMapWidgetData;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        F0C<C9hr<Object>>[] f0cArr = Surrogate.$childSerializers;
        Surrogate surrogate = (Surrogate) interfaceC07829iw.A8b(HatchWidgetDataSerializer$Surrogate$$serializer.INSTANCE);
        String str = surrogate.kind;
        switch (str.hashCode()) {
            case -1884599366:
                if (str.equals(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_IMAGE_OPTIONS)) {
                    hatchWidgetData = surrogate.imageOptions;
                    break;
                }
                return UnrenderableWidgetData.INSTANCE;
            case -1850360687:
                if (str.equals(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_VOICE_OPTIONS)) {
                    hatchWidgetData = surrogate.voiceOptions;
                    break;
                }
                return UnrenderableWidgetData.INSTANCE;
            case -1448705919:
                if (str.equals("space_build_completed")) {
                    hatchWidgetData = surrogate.spaceBuildCompleted;
                    break;
                }
                return UnrenderableWidgetData.INSTANCE;
            case -1204877688:
                if (str.equals(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_LOCAL_MAP)) {
                    hatchWidgetData = surrogate.localMap;
                    break;
                }
                return UnrenderableWidgetData.INSTANCE;
            case -1106172890:
                if (str.equals(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_LETTER)) {
                    hatchWidgetData = surrogate.letter;
                    break;
                }
                return UnrenderableWidgetData.INSTANCE;
            case -1010695135:
                if (str.equals(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPAQUE)) {
                    hatchWidgetData = surrogate.opaque;
                    break;
                }
                return UnrenderableWidgetData.INSTANCE;
            case -1010136971:
                if (str.equals(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPTION)) {
                    hatchWidgetData = surrogate.option;
                    break;
                }
                return UnrenderableWidgetData.INSTANCE;
            case -978878647:
                if (str.equals("unrenderable")) {
                    hatchWidgetData = surrogate.unrenderable;
                    break;
                }
                return UnrenderableWidgetData.INSTANCE;
            case -873774281:
                if (str.equals(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_IDEA_GROUP)) {
                    hatchWidgetData = surrogate.ideaGroup;
                    break;
                }
                return UnrenderableWidgetData.INSTANCE;
            case 3213227:
                if (str.equals("html")) {
                    hatchWidgetData = surrogate.html;
                    break;
                }
                return UnrenderableWidgetData.INSTANCE;
            case 3227383:
                if (str.equals("idea")) {
                    hatchWidgetData = surrogate.idea;
                    break;
                }
                return UnrenderableWidgetData.INSTANCE;
            case 465303341:
                if (str.equals(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_NODE_CARD)) {
                    hatchWidgetData = surrogate.nodeCard;
                    break;
                }
                return UnrenderableWidgetData.INSTANCE;
            case 526926184:
                if (str.equals(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_MARKETPLACE_MAP) && (marketplaceMapWidgetData = surrogate.marketplaceMap) != null && !marketplaceMapWidgetData.listings.isEmpty()) {
                    return marketplaceMapWidgetData;
                }
                return UnrenderableWidgetData.INSTANCE;
            case 1862666772:
                if (str.equals("navigation")) {
                    hatchWidgetData = surrogate.navigation;
                    break;
                }
                return UnrenderableWidgetData.INSTANCE;
            default:
                return UnrenderableWidgetData.INSTANCE;
        }
        HatchWidgetData hatchWidgetData2 = hatchWidgetData;
        if (hatchWidgetData2 != null) {
            return hatchWidgetData2;
        }
        return UnrenderableWidgetData.INSTANCE;
    }

    static {
        F0C<C9hr<Object>>[] f0cArr = Surrogate.$childSerializers;
        descriptor = HatchWidgetDataSerializer$Surrogate$$serializer.descriptor;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, HatchWidgetData hatchWidgetData) {
        Surrogate surrogate;
        AnonymousClass003.A0u(interfaceC07789is, hatchWidgetData);
        if (hatchWidgetData instanceof HtmlWidgetData) {
            surrogate = new Surrogate("html", (HtmlWidgetData) hatchWidgetData, null, null, null, null, null, null, null, null, null, null, null, null, null);
        } else if (hatchWidgetData instanceof LocalMapWidgetData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_LOCAL_MAP, null, (LocalMapWidgetData) hatchWidgetData, null, null, null, null, null, null, null, null, null, null, null, null);
        } else if (hatchWidgetData instanceof MarketplaceMapWidgetData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_MARKETPLACE_MAP, null, null, (MarketplaceMapWidgetData) hatchWidgetData, null, null, null, null, null, null, null, null, null, null, null);
        } else if (hatchWidgetData instanceof OptionWidgetData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPTION, null, null, null, (OptionWidgetData) hatchWidgetData, null, null, null, null, null, null, null, null, null, null);
        } else if (hatchWidgetData instanceof ImageOptionsWidgetData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_IMAGE_OPTIONS, null, null, null, null, (ImageOptionsWidgetData) hatchWidgetData, null, null, null, null, null, null, null, null, null);
        } else if (hatchWidgetData instanceof VoiceOptionsWidgetData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_VOICE_OPTIONS, null, null, null, null, null, (VoiceOptionsWidgetData) hatchWidgetData, null, null, null, null, null, null, null, null);
        } else if (hatchWidgetData instanceof LetterWidgetData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_LETTER, null, null, null, null, null, null, (LetterWidgetData) hatchWidgetData, null, null, null, null, null, null, null);
        } else if (hatchWidgetData instanceof IdeaWidgetData) {
            surrogate = new Surrogate("idea", null, null, null, null, null, null, null, (IdeaWidgetData) hatchWidgetData, null, null, null, null, null, null);
        } else if (hatchWidgetData instanceof IdeaGroupWidgetData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_IDEA_GROUP, null, null, null, null, null, null, null, null, (IdeaGroupWidgetData) hatchWidgetData, null, null, null, null, null);
        } else if (hatchWidgetData instanceof NavigationWidgetData) {
            surrogate = new Surrogate("navigation", null, null, null, null, null, null, null, null, null, (NavigationWidgetData) hatchWidgetData, null, null, null, null);
        } else if (hatchWidgetData instanceof SpaceBuildCompletedWidgetData) {
            surrogate = new Surrogate("space_build_completed", null, null, null, null, null, null, null, null, null, null, (SpaceBuildCompletedWidgetData) hatchWidgetData, null, null, null);
        } else if (hatchWidgetData instanceof NodeCardWidgetData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_NODE_CARD, null, null, null, null, null, null, null, null, null, null, null, (NodeCardWidgetData) hatchWidgetData, null, null);
        } else if (hatchWidgetData instanceof OpaqueWidgetData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPAQUE, null, null, null, null, null, null, null, null, null, null, null, null, (OpaqueWidgetData) hatchWidgetData, null);
        } else {
            if (!(hatchWidgetData instanceof UnrenderableWidgetData)) {
                throw C3cG.A0q();
            }
            surrogate = new Surrogate("unrenderable", null, null, null, null, null, null, null, null, null, null, null, null, null, (UnrenderableWidgetData) hatchWidgetData);
        }
        interfaceC07789is.AAR(surrogate, HatchWidgetDataSerializer$Surrogate$$serializer.INSTANCE);
    }
}
