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
public final class HatchPresentationDataSerializer implements C9hr<HatchPresentationData> {
    public static final int $stable = 0;
    public static final HatchPresentationDataSerializer INSTANCE = new HatchPresentationDataSerializer();
    public static final C9iZ descriptor;

    @Serializable
    public final class Surrogate extends C06G {
        public final AudioPresentationData audio;
        public final AvatarSharePresentationData avatarShare;
        public final BrowserTaskPresentationData browserTask;
        public final ExternalLinkPresentationData externalLink;
        public final FilePresentationData file;
        public final GenericListPresentationData genericList;
        public final ImageGalleryPresentationData image;
        public final InternalLinkActionCardPresentationData internalLinkActionCard;
        public final String kind;
        public final ScheduledTaskCreatedPresentationData scheduledTaskCreated;
        public final ShoppingCartPresentationData shoppingCart;
        public final ShoppingResultsPresentationData shoppingResults;
        public final SlidesPresentationData slides;
        public final SpaceBuildCompletedPresentationData spaceBuildCompleted;
        public final SpaceProposalPresentationData spaceProposal;
        public final TextWithButtonPresentationData textWithButton;
        public final UnrenderablePresentationData unrenderable;
        public final VideoPresentationData video;
        public final WidgetPresentationData widget;
        public static final Companion Companion = new Companion();
        public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, HatchPresentationDataSerializer$Surrogate$Companion$$childSerializers$1.INSTANCE)};

        public final class Companion {
            public final C9hr<Surrogate> serializer() {
                return HatchPresentationDataSerializer$Surrogate$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public Surrogate(String str, AvatarSharePresentationData avatarSharePresentationData, WidgetPresentationData widgetPresentationData, SpaceProposalPresentationData spaceProposalPresentationData, SpaceBuildCompletedPresentationData spaceBuildCompletedPresentationData, ShoppingResultsPresentationData shoppingResultsPresentationData, ShoppingCartPresentationData shoppingCartPresentationData, BrowserTaskPresentationData browserTaskPresentationData, TextWithButtonPresentationData textWithButtonPresentationData, ScheduledTaskCreatedPresentationData scheduledTaskCreatedPresentationData, ExternalLinkPresentationData externalLinkPresentationData, InternalLinkActionCardPresentationData internalLinkActionCardPresentationData, GenericListPresentationData genericListPresentationData, FilePresentationData filePresentationData, ImageGalleryPresentationData imageGalleryPresentationData, VideoPresentationData videoPresentationData, AudioPresentationData audioPresentationData, SlidesPresentationData slidesPresentationData, UnrenderablePresentationData unrenderablePresentationData) {
            C7384Etj.A0Y(str, 0);
            this.kind = str;
            this.avatarShare = avatarSharePresentationData;
            this.widget = widgetPresentationData;
            this.spaceProposal = spaceProposalPresentationData;
            this.spaceBuildCompleted = spaceBuildCompletedPresentationData;
            this.shoppingResults = shoppingResultsPresentationData;
            this.shoppingCart = shoppingCartPresentationData;
            this.browserTask = browserTaskPresentationData;
            this.textWithButton = textWithButtonPresentationData;
            this.scheduledTaskCreated = scheduledTaskCreatedPresentationData;
            this.externalLink = externalLinkPresentationData;
            this.internalLinkActionCard = internalLinkActionCardPresentationData;
            this.genericList = genericListPresentationData;
            this.file = filePresentationData;
            this.image = imageGalleryPresentationData;
            this.video = videoPresentationData;
            this.audio = audioPresentationData;
            this.slides = slidesPresentationData;
            this.unrenderable = unrenderablePresentationData;
        }

        public final Surrogate copy(String str, AvatarSharePresentationData avatarSharePresentationData, WidgetPresentationData widgetPresentationData, SpaceProposalPresentationData spaceProposalPresentationData, SpaceBuildCompletedPresentationData spaceBuildCompletedPresentationData, ShoppingResultsPresentationData shoppingResultsPresentationData, ShoppingCartPresentationData shoppingCartPresentationData, BrowserTaskPresentationData browserTaskPresentationData, TextWithButtonPresentationData textWithButtonPresentationData, ScheduledTaskCreatedPresentationData scheduledTaskCreatedPresentationData, ExternalLinkPresentationData externalLinkPresentationData, InternalLinkActionCardPresentationData internalLinkActionCardPresentationData, GenericListPresentationData genericListPresentationData, FilePresentationData filePresentationData, ImageGalleryPresentationData imageGalleryPresentationData, VideoPresentationData videoPresentationData, AudioPresentationData audioPresentationData, SlidesPresentationData slidesPresentationData, UnrenderablePresentationData unrenderablePresentationData) {
            C7384Etj.A0Y(str, 0);
            return new Surrogate(str, avatarSharePresentationData, widgetPresentationData, spaceProposalPresentationData, spaceBuildCompletedPresentationData, shoppingResultsPresentationData, shoppingCartPresentationData, browserTaskPresentationData, textWithButtonPresentationData, scheduledTaskCreatedPresentationData, externalLinkPresentationData, internalLinkActionCardPresentationData, genericListPresentationData, filePresentationData, imageGalleryPresentationData, videoPresentationData, audioPresentationData, slidesPresentationData, unrenderablePresentationData);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Surrogate) {
                    Surrogate surrogate = (Surrogate) obj;
                    if (!C7384Etj.areEqual(this.kind, surrogate.kind) || !C7384Etj.areEqual(this.avatarShare, surrogate.avatarShare) || !C7384Etj.areEqual(this.widget, surrogate.widget) || !C7384Etj.areEqual(this.spaceProposal, surrogate.spaceProposal) || !C7384Etj.areEqual(this.spaceBuildCompleted, surrogate.spaceBuildCompleted) || !C7384Etj.areEqual(this.shoppingResults, surrogate.shoppingResults) || !C7384Etj.areEqual(this.shoppingCart, surrogate.shoppingCart) || !C7384Etj.areEqual(this.browserTask, surrogate.browserTask) || !C7384Etj.areEqual(this.textWithButton, surrogate.textWithButton) || !C7384Etj.areEqual(this.scheduledTaskCreated, surrogate.scheduledTaskCreated) || !C7384Etj.areEqual(this.externalLink, surrogate.externalLink) || !C7384Etj.areEqual(this.internalLinkActionCard, surrogate.internalLinkActionCard) || !C7384Etj.areEqual(this.genericList, surrogate.genericList) || !C7384Etj.areEqual(this.file, surrogate.file) || !C7384Etj.areEqual(this.image, surrogate.image) || !C7384Etj.areEqual(this.video, surrogate.video) || !C7384Etj.areEqual(this.audio, surrogate.audio) || !C7384Etj.areEqual(this.slides, surrogate.slides) || !C7384Etj.areEqual(this.unrenderable, surrogate.unrenderable)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(Surrogate surrogate, C9j5 c9j5, C9iZ c9iZ) {
            F0C<C9hr<Object>>[] f0cArr = $childSerializers;
            c9j5.AAV(surrogate.kind, c9iZ, 0);
            boolean zAfR = c9j5.AfR();
            if (zAfR || surrogate.avatarShare != null) {
                c9j5.AAP(surrogate.avatarShare, AvatarSharePresentationData$$serializer.INSTANCE, c9iZ, 1);
            }
            if (zAfR || surrogate.widget != null) {
                c9j5.AAP(surrogate.widget, WidgetPresentationData$$serializer.INSTANCE, c9iZ, 2);
            }
            if (zAfR || surrogate.spaceProposal != null) {
                c9j5.AAP(surrogate.spaceProposal, SpaceProposalPresentationData$$serializer.INSTANCE, c9iZ, 3);
            }
            if (zAfR || surrogate.spaceBuildCompleted != null) {
                c9j5.AAP(surrogate.spaceBuildCompleted, SpaceBuildCompletedPresentationData$$serializer.INSTANCE, c9iZ, 4);
            }
            if (zAfR || surrogate.shoppingResults != null) {
                c9j5.AAP(surrogate.shoppingResults, ShoppingResultsPresentationData$$serializer.INSTANCE, c9iZ, 5);
            }
            if (zAfR || surrogate.shoppingCart != null) {
                c9j5.AAP(surrogate.shoppingCart, ShoppingCartPresentationData$$serializer.INSTANCE, c9iZ, 6);
            }
            if (zAfR || surrogate.browserTask != null) {
                c9j5.AAP(surrogate.browserTask, BrowserTaskPresentationData$$serializer.INSTANCE, c9iZ, 7);
            }
            if (zAfR || surrogate.textWithButton != null) {
                c9j5.AAP(surrogate.textWithButton, TextWithButtonPresentationData$$serializer.INSTANCE, c9iZ, 8);
            }
            if (zAfR || surrogate.scheduledTaskCreated != null) {
                c9j5.AAP(surrogate.scheduledTaskCreated, ScheduledTaskCreatedPresentationData$$serializer.INSTANCE, c9iZ, 9);
            }
            if (zAfR || surrogate.externalLink != null) {
                c9j5.AAP(surrogate.externalLink, ExternalLinkPresentationData$$serializer.INSTANCE, c9iZ, 10);
            }
            if (zAfR || surrogate.internalLinkActionCard != null) {
                c9j5.AAP(surrogate.internalLinkActionCard, InternalLinkActionCardPresentationData$$serializer.INSTANCE, c9iZ, 11);
            }
            if (zAfR || surrogate.genericList != null) {
                c9j5.AAP(surrogate.genericList, GenericListPresentationData$$serializer.INSTANCE, c9iZ, 12);
            }
            if (zAfR || surrogate.file != null) {
                c9j5.AAP(surrogate.file, FilePresentationData$$serializer.INSTANCE, c9iZ, 13);
            }
            if (zAfR || surrogate.image != null) {
                c9j5.AAP(surrogate.image, ImageGalleryPresentationData$$serializer.INSTANCE, c9iZ, 14);
            }
            if (zAfR || surrogate.video != null) {
                c9j5.AAP(surrogate.video, VideoPresentationData$$serializer.INSTANCE, c9iZ, 15);
            }
            if (zAfR || surrogate.audio != null) {
                c9j5.AAP(surrogate.audio, AudioPresentationData$$serializer.INSTANCE, c9iZ, 16);
            }
            if (zAfR || surrogate.slides != null) {
                c9j5.AAP(surrogate.slides, SlidesPresentationData$$serializer.INSTANCE, c9iZ, 17);
            }
            if (zAfR || surrogate.unrenderable != null) {
                c9j5.AAP(surrogate.unrenderable, C3cH.A15(f0cArr, 18), c9iZ, 18);
            }
        }

        public final String component1() {
            return this.kind;
        }

        public final ScheduledTaskCreatedPresentationData component10() {
            return this.scheduledTaskCreated;
        }

        public final ExternalLinkPresentationData component11() {
            return this.externalLink;
        }

        public final InternalLinkActionCardPresentationData component12() {
            return this.internalLinkActionCard;
        }

        public final GenericListPresentationData component13() {
            return this.genericList;
        }

        public final FilePresentationData component14() {
            return this.file;
        }

        public final ImageGalleryPresentationData component15() {
            return this.image;
        }

        public final VideoPresentationData component16() {
            return this.video;
        }

        public final AudioPresentationData component17() {
            return this.audio;
        }

        public final SlidesPresentationData component18() {
            return this.slides;
        }

        public final UnrenderablePresentationData component19() {
            return this.unrenderable;
        }

        public final AvatarSharePresentationData component2() {
            return this.avatarShare;
        }

        public final WidgetPresentationData component3() {
            return this.widget;
        }

        public final SpaceProposalPresentationData component4() {
            return this.spaceProposal;
        }

        public final SpaceBuildCompletedPresentationData component5() {
            return this.spaceBuildCompleted;
        }

        public final ShoppingResultsPresentationData component6() {
            return this.shoppingResults;
        }

        public final ShoppingCartPresentationData component7() {
            return this.shoppingCart;
        }

        public final BrowserTaskPresentationData component8() {
            return this.browserTask;
        }

        public final TextWithButtonPresentationData component9() {
            return this.textWithButton;
        }

        public final AudioPresentationData getAudio() {
            return this.audio;
        }

        public final AvatarSharePresentationData getAvatarShare() {
            return this.avatarShare;
        }

        public final BrowserTaskPresentationData getBrowserTask() {
            return this.browserTask;
        }

        public final ExternalLinkPresentationData getExternalLink() {
            return this.externalLink;
        }

        public final FilePresentationData getFile() {
            return this.file;
        }

        public final GenericListPresentationData getGenericList() {
            return this.genericList;
        }

        public final ImageGalleryPresentationData getImage() {
            return this.image;
        }

        public final InternalLinkActionCardPresentationData getInternalLinkActionCard() {
            return this.internalLinkActionCard;
        }

        public final String getKind() {
            return this.kind;
        }

        public final ScheduledTaskCreatedPresentationData getScheduledTaskCreated() {
            return this.scheduledTaskCreated;
        }

        public final ShoppingCartPresentationData getShoppingCart() {
            return this.shoppingCart;
        }

        public final ShoppingResultsPresentationData getShoppingResults() {
            return this.shoppingResults;
        }

        public final SlidesPresentationData getSlides() {
            return this.slides;
        }

        public final SpaceBuildCompletedPresentationData getSpaceBuildCompleted() {
            return this.spaceBuildCompleted;
        }

        public final SpaceProposalPresentationData getSpaceProposal() {
            return this.spaceProposal;
        }

        public final TextWithButtonPresentationData getTextWithButton() {
            return this.textWithButton;
        }

        public final UnrenderablePresentationData getUnrenderable() {
            return this.unrenderable;
        }

        public final VideoPresentationData getVideo() {
            return this.video;
        }

        public final WidgetPresentationData getWidget() {
            return this.widget;
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((((((AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0D(this.avatarShare)) * 31) + AnonymousClass006.A0D(this.widget)) * 31) + AnonymousClass006.A0D(this.spaceProposal)) * 31) + AnonymousClass006.A0D(this.spaceBuildCompleted)) * 31) + AnonymousClass006.A0D(this.shoppingResults)) * 31) + AnonymousClass006.A0D(this.shoppingCart)) * 31) + AnonymousClass006.A0D(this.browserTask)) * 31) + AnonymousClass006.A0D(this.textWithButton)) * 31) + AnonymousClass006.A0D(this.scheduledTaskCreated)) * 31) + AnonymousClass006.A0D(this.externalLink)) * 31) + AnonymousClass006.A0D(this.internalLinkActionCard)) * 31) + AnonymousClass006.A0D(this.genericList)) * 31) + AnonymousClass006.A0D(this.file)) * 31) + AnonymousClass006.A0D(this.image)) * 31) + AnonymousClass006.A0D(this.video)) * 31) + AnonymousClass006.A0D(this.audio)) * 31) + AnonymousClass006.A0D(this.slides)) * 31) + C3cH.A02(this.unrenderable);
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, AvatarSharePresentationData avatarSharePresentationData, WidgetPresentationData widgetPresentationData, SpaceProposalPresentationData spaceProposalPresentationData, SpaceBuildCompletedPresentationData spaceBuildCompletedPresentationData, ShoppingResultsPresentationData shoppingResultsPresentationData, ShoppingCartPresentationData shoppingCartPresentationData, BrowserTaskPresentationData browserTaskPresentationData, TextWithButtonPresentationData textWithButtonPresentationData, ScheduledTaskCreatedPresentationData scheduledTaskCreatedPresentationData, ExternalLinkPresentationData externalLinkPresentationData, InternalLinkActionCardPresentationData internalLinkActionCardPresentationData, GenericListPresentationData genericListPresentationData, FilePresentationData filePresentationData, ImageGalleryPresentationData imageGalleryPresentationData, VideoPresentationData videoPresentationData, AudioPresentationData audioPresentationData, SlidesPresentationData slidesPresentationData, UnrenderablePresentationData unrenderablePresentationData, int i, Object obj) {
            String str2 = str;
            AvatarSharePresentationData avatarSharePresentationData2 = avatarSharePresentationData;
            WidgetPresentationData widgetPresentationData2 = widgetPresentationData;
            SpaceProposalPresentationData spaceProposalPresentationData2 = spaceProposalPresentationData;
            SpaceBuildCompletedPresentationData spaceBuildCompletedPresentationData2 = spaceBuildCompletedPresentationData;
            ShoppingResultsPresentationData shoppingResultsPresentationData2 = shoppingResultsPresentationData;
            ShoppingCartPresentationData shoppingCartPresentationData2 = shoppingCartPresentationData;
            BrowserTaskPresentationData browserTaskPresentationData2 = browserTaskPresentationData;
            TextWithButtonPresentationData textWithButtonPresentationData2 = textWithButtonPresentationData;
            ScheduledTaskCreatedPresentationData scheduledTaskCreatedPresentationData2 = scheduledTaskCreatedPresentationData;
            ExternalLinkPresentationData externalLinkPresentationData2 = externalLinkPresentationData;
            InternalLinkActionCardPresentationData internalLinkActionCardPresentationData2 = internalLinkActionCardPresentationData;
            GenericListPresentationData genericListPresentationData2 = genericListPresentationData;
            FilePresentationData filePresentationData2 = filePresentationData;
            ImageGalleryPresentationData imageGalleryPresentationData2 = imageGalleryPresentationData;
            VideoPresentationData videoPresentationData2 = videoPresentationData;
            AudioPresentationData audioPresentationData2 = audioPresentationData;
            SlidesPresentationData slidesPresentationData2 = slidesPresentationData;
            UnrenderablePresentationData unrenderablePresentationData2 = unrenderablePresentationData;
            if ((i & 1) != 0) {
                str2 = surrogate.kind;
            }
            if ((i & 2) != 0) {
                avatarSharePresentationData2 = surrogate.avatarShare;
            }
            if ((i & 4) != 0) {
                widgetPresentationData2 = surrogate.widget;
            }
            if ((i & 8) != 0) {
                spaceProposalPresentationData2 = surrogate.spaceProposal;
            }
            if ((i & 16) != 0) {
                spaceBuildCompletedPresentationData2 = surrogate.spaceBuildCompleted;
            }
            if ((i & 32) != 0) {
                shoppingResultsPresentationData2 = surrogate.shoppingResults;
            }
            if ((i & 64) != 0) {
                shoppingCartPresentationData2 = surrogate.shoppingCart;
            }
            if ((i & 128) != 0) {
                browserTaskPresentationData2 = surrogate.browserTask;
            }
            if ((i & 256) != 0) {
                textWithButtonPresentationData2 = surrogate.textWithButton;
            }
            if ((i & 512) != 0) {
                scheduledTaskCreatedPresentationData2 = surrogate.scheduledTaskCreated;
            }
            if ((i & 1024) != 0) {
                externalLinkPresentationData2 = surrogate.externalLink;
            }
            if ((i & 2048) != 0) {
                internalLinkActionCardPresentationData2 = surrogate.internalLinkActionCard;
            }
            if ((i & 4096) != 0) {
                genericListPresentationData2 = surrogate.genericList;
            }
            if ((i & 8192) != 0) {
                filePresentationData2 = surrogate.file;
            }
            if ((i & 16384) != 0) {
                imageGalleryPresentationData2 = surrogate.image;
            }
            if ((i & 32768) != 0) {
                videoPresentationData2 = surrogate.video;
            }
            if ((i & 65536) != 0) {
                audioPresentationData2 = surrogate.audio;
            }
            if ((i & 131072) != 0) {
                slidesPresentationData2 = surrogate.slides;
            }
            if ((i & 262144) != 0) {
                unrenderablePresentationData2 = surrogate.unrenderable;
            }
            ShoppingCartPresentationData shoppingCartPresentationData3 = shoppingCartPresentationData2;
            return surrogate.copy(str2, avatarSharePresentationData2, widgetPresentationData2, spaceProposalPresentationData2, spaceBuildCompletedPresentationData2, shoppingResultsPresentationData2, shoppingCartPresentationData3, browserTaskPresentationData2, textWithButtonPresentationData2, scheduledTaskCreatedPresentationData2, externalLinkPresentationData2, internalLinkActionCardPresentationData2, genericListPresentationData2, filePresentationData2, imageGalleryPresentationData2, videoPresentationData2, audioPresentationData2, slidesPresentationData2, unrenderablePresentationData2);
        }

        public /* synthetic */ Surrogate(String str, AvatarSharePresentationData avatarSharePresentationData, WidgetPresentationData widgetPresentationData, SpaceProposalPresentationData spaceProposalPresentationData, SpaceBuildCompletedPresentationData spaceBuildCompletedPresentationData, ShoppingResultsPresentationData shoppingResultsPresentationData, ShoppingCartPresentationData shoppingCartPresentationData, BrowserTaskPresentationData browserTaskPresentationData, TextWithButtonPresentationData textWithButtonPresentationData, ScheduledTaskCreatedPresentationData scheduledTaskCreatedPresentationData, ExternalLinkPresentationData externalLinkPresentationData, InternalLinkActionCardPresentationData internalLinkActionCardPresentationData, GenericListPresentationData genericListPresentationData, FilePresentationData filePresentationData, ImageGalleryPresentationData imageGalleryPresentationData, VideoPresentationData videoPresentationData, AudioPresentationData audioPresentationData, SlidesPresentationData slidesPresentationData, UnrenderablePresentationData unrenderablePresentationData, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : avatarSharePresentationData, (i & 4) != 0 ? null : widgetPresentationData, (i & 8) != 0 ? null : spaceProposalPresentationData, (i & 16) != 0 ? null : spaceBuildCompletedPresentationData, (i & 32) != 0 ? null : shoppingResultsPresentationData, (i & 64) != 0 ? null : shoppingCartPresentationData, (i & 128) != 0 ? null : browserTaskPresentationData, (i & 256) != 0 ? null : textWithButtonPresentationData, (i & 512) != 0 ? null : scheduledTaskCreatedPresentationData, (i & 1024) != 0 ? null : externalLinkPresentationData, (i & 2048) != 0 ? null : internalLinkActionCardPresentationData, (i & 4096) != 0 ? null : genericListPresentationData, (i & 8192) != 0 ? null : filePresentationData, (i & 16384) != 0 ? null : imageGalleryPresentationData, (i & 32768) != 0 ? null : videoPresentationData, (i & 65536) != 0 ? null : audioPresentationData, (i & 131072) != 0 ? null : slidesPresentationData, (i & 262144) != 0 ? null : unrenderablePresentationData);
        }

        public /* synthetic */ Surrogate(int i, String str, AvatarSharePresentationData avatarSharePresentationData, WidgetPresentationData widgetPresentationData, SpaceProposalPresentationData spaceProposalPresentationData, SpaceBuildCompletedPresentationData spaceBuildCompletedPresentationData, ShoppingResultsPresentationData shoppingResultsPresentationData, ShoppingCartPresentationData shoppingCartPresentationData, BrowserTaskPresentationData browserTaskPresentationData, TextWithButtonPresentationData textWithButtonPresentationData, ScheduledTaskCreatedPresentationData scheduledTaskCreatedPresentationData, ExternalLinkPresentationData externalLinkPresentationData, InternalLinkActionCardPresentationData internalLinkActionCardPresentationData, GenericListPresentationData genericListPresentationData, FilePresentationData filePresentationData, ImageGalleryPresentationData imageGalleryPresentationData, VideoPresentationData videoPresentationData, AudioPresentationData audioPresentationData, SlidesPresentationData slidesPresentationData, UnrenderablePresentationData unrenderablePresentationData, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(HatchPresentationDataSerializer$Surrogate$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.kind = str;
            if ((i & 2) == 0) {
                this.avatarShare = null;
            } else {
                this.avatarShare = avatarSharePresentationData;
            }
            if ((i & 4) == 0) {
                this.widget = null;
            } else {
                this.widget = widgetPresentationData;
            }
            if ((i & 8) == 0) {
                this.spaceProposal = null;
            } else {
                this.spaceProposal = spaceProposalPresentationData;
            }
            if ((i & 16) == 0) {
                this.spaceBuildCompleted = null;
            } else {
                this.spaceBuildCompleted = spaceBuildCompletedPresentationData;
            }
            if ((i & 32) == 0) {
                this.shoppingResults = null;
            } else {
                this.shoppingResults = shoppingResultsPresentationData;
            }
            if ((i & 64) == 0) {
                this.shoppingCart = null;
            } else {
                this.shoppingCart = shoppingCartPresentationData;
            }
            if ((i & 128) == 0) {
                this.browserTask = null;
            } else {
                this.browserTask = browserTaskPresentationData;
            }
            if ((i & 256) == 0) {
                this.textWithButton = null;
            } else {
                this.textWithButton = textWithButtonPresentationData;
            }
            if ((i & 512) == 0) {
                this.scheduledTaskCreated = null;
            } else {
                this.scheduledTaskCreated = scheduledTaskCreatedPresentationData;
            }
            if ((i & 1024) == 0) {
                this.externalLink = null;
            } else {
                this.externalLink = externalLinkPresentationData;
            }
            if ((i & 2048) == 0) {
                this.internalLinkActionCard = null;
            } else {
                this.internalLinkActionCard = internalLinkActionCardPresentationData;
            }
            if ((i & 4096) == 0) {
                this.genericList = null;
            } else {
                this.genericList = genericListPresentationData;
            }
            if ((i & 8192) == 0) {
                this.file = null;
            } else {
                this.file = filePresentationData;
            }
            if ((i & 16384) == 0) {
                this.image = null;
            } else {
                this.image = imageGalleryPresentationData;
            }
            if ((32768 & i) == 0) {
                this.video = null;
            } else {
                this.video = videoPresentationData;
            }
            if ((65536 & i) == 0) {
                this.audio = null;
            } else {
                this.audio = audioPresentationData;
            }
            if ((131072 & i) == 0) {
                this.slides = null;
            } else {
                this.slides = slidesPresentationData;
            }
            if ((i & 262144) == 0) {
                this.unrenderable = null;
            } else {
                this.unrenderable = unrenderablePresentationData;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C9jG
    public HatchPresentationData deserialize(InterfaceC07829iw interfaceC07829iw) {
        HatchPresentationData hatchPresentationData;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        F0C<C9hr<Object>>[] f0cArr = Surrogate.$childSerializers;
        Surrogate surrogate = (Surrogate) interfaceC07829iw.A8b(HatchPresentationDataSerializer$Surrogate$$serializer.INSTANCE);
        String str = surrogate.kind;
        switch (str.hashCode()) {
            case -1842843463:
                if (str.equals(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_TEXT_WITH_BUTTON)) {
                    hatchPresentationData = surrogate.textWithButton;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case -1648893033:
                if (str.equals(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_CART)) {
                    hatchPresentationData = surrogate.shoppingCart;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case -1448705919:
                if (str.equals("space_build_completed")) {
                    hatchPresentationData = surrogate.spaceBuildCompleted;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case -1060256786:
                if (str.equals(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SCHEDULED_TASK_CREATED_ACTIVITY)) {
                    hatchPresentationData = surrogate.scheduledTaskCreated;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case -978878647:
                if (str.equals("unrenderable")) {
                    hatchPresentationData = surrogate.unrenderable;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case -899647262:
                if (str.equals(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SLIDES)) {
                    hatchPresentationData = surrogate.slides;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case -788047292:
                if (str.equals("widget")) {
                    hatchPresentationData = surrogate.widget;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case -569750151:
                if (str.equals(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_AVATAR_SHARE)) {
                    hatchPresentationData = surrogate.avatarShare;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case -262935034:
                if (str.equals(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_GENERIC_LIST)) {
                    hatchPresentationData = surrogate.genericList;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case -88151009:
                if (str.equals(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_RESULTS)) {
                    hatchPresentationData = surrogate.shoppingResults;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case -4084754:
                if (str.equals(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_EXTERNAL_LINK)) {
                    hatchPresentationData = surrogate.externalLink;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case 3143036:
                if (str.equals("file")) {
                    hatchPresentationData = surrogate.file;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case 93166550:
                if (str.equals("audio")) {
                    hatchPresentationData = surrogate.audio;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case 100313435:
                if (str.equals("image")) {
                    hatchPresentationData = surrogate.image;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case 112202875:
                if (str.equals("video")) {
                    hatchPresentationData = surrogate.video;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case 459627510:
                if (str.equals(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_INTERNAL_LINK_ACTION_CARD)) {
                    hatchPresentationData = surrogate.internalLinkActionCard;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case 1752595516:
                if (str.equals(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_BROWSER_TASK)) {
                    hatchPresentationData = surrogate.browserTask;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            case 2045145611:
                if (str.equals(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SPACE_PROPOSAL)) {
                    hatchPresentationData = surrogate.spaceProposal;
                    break;
                }
                return UnrenderablePresentationData.INSTANCE;
            default:
                return UnrenderablePresentationData.INSTANCE;
        }
        HatchPresentationData hatchPresentationData2 = hatchPresentationData;
        if (hatchPresentationData2 != null) {
            return hatchPresentationData2;
        }
        return UnrenderablePresentationData.INSTANCE;
    }

    static {
        F0C<C9hr<Object>>[] f0cArr = Surrogate.$childSerializers;
        descriptor = HatchPresentationDataSerializer$Surrogate$$serializer.descriptor;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, HatchPresentationData hatchPresentationData) {
        Surrogate surrogate;
        AnonymousClass003.A0u(interfaceC07789is, hatchPresentationData);
        if (hatchPresentationData instanceof AvatarSharePresentationData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_AVATAR_SHARE, (AvatarSharePresentationData) hatchPresentationData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        } else if (hatchPresentationData instanceof WidgetPresentationData) {
            surrogate = new Surrogate("widget", null, (WidgetPresentationData) hatchPresentationData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        } else if (hatchPresentationData instanceof SpaceProposalPresentationData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SPACE_PROPOSAL, null, null, (SpaceProposalPresentationData) hatchPresentationData, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        } else if (hatchPresentationData instanceof SpaceBuildCompletedPresentationData) {
            surrogate = new Surrogate("space_build_completed", null, null, null, (SpaceBuildCompletedPresentationData) hatchPresentationData, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        } else if (hatchPresentationData instanceof ShoppingResultsPresentationData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_RESULTS, null, null, null, null, (ShoppingResultsPresentationData) hatchPresentationData, null, null, null, null, null, null, null, null, null, null, null, null, null);
        } else if (hatchPresentationData instanceof ShoppingCartPresentationData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_CART, null, null, null, null, null, (ShoppingCartPresentationData) hatchPresentationData, null, null, null, null, null, null, null, null, null, null, null, null);
        } else if (hatchPresentationData instanceof BrowserTaskPresentationData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_BROWSER_TASK, null, null, null, null, null, null, (BrowserTaskPresentationData) hatchPresentationData, null, null, null, null, null, null, null, null, null, null, null);
        } else if (hatchPresentationData instanceof TextWithButtonPresentationData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_TEXT_WITH_BUTTON, null, null, null, null, null, null, null, (TextWithButtonPresentationData) hatchPresentationData, null, null, null, null, null, null, null, null, null, null);
        } else if (hatchPresentationData instanceof ScheduledTaskCreatedPresentationData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SCHEDULED_TASK_CREATED_ACTIVITY, null, null, null, null, null, null, null, null, (ScheduledTaskCreatedPresentationData) hatchPresentationData, null, null, null, null, null, null, null, null, null);
        } else if (hatchPresentationData instanceof ExternalLinkPresentationData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_EXTERNAL_LINK, null, null, null, null, null, null, null, null, null, (ExternalLinkPresentationData) hatchPresentationData, null, null, null, null, null, null, null, null);
        } else if (hatchPresentationData instanceof InternalLinkActionCardPresentationData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_INTERNAL_LINK_ACTION_CARD, null, null, null, null, null, null, null, null, null, null, (InternalLinkActionCardPresentationData) hatchPresentationData, null, null, null, null, null, null, null);
        } else if (hatchPresentationData instanceof GenericListPresentationData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_GENERIC_LIST, null, null, null, null, null, null, null, null, null, null, null, (GenericListPresentationData) hatchPresentationData, null, null, null, null, null, null);
        } else if (hatchPresentationData instanceof FilePresentationData) {
            surrogate = new Surrogate("file", null, null, null, null, null, null, null, null, null, null, null, null, (FilePresentationData) hatchPresentationData, null, null, null, null, null);
        } else if (hatchPresentationData instanceof ImageGalleryPresentationData) {
            surrogate = new Surrogate("image", null, null, null, null, null, null, null, null, null, null, null, null, null, (ImageGalleryPresentationData) hatchPresentationData, null, null, null, null);
        } else if (hatchPresentationData instanceof VideoPresentationData) {
            surrogate = new Surrogate("video", null, null, null, null, null, null, null, null, null, null, null, null, null, null, (VideoPresentationData) hatchPresentationData, null, null, null);
        } else if (hatchPresentationData instanceof AudioPresentationData) {
            surrogate = new Surrogate("audio", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (AudioPresentationData) hatchPresentationData, null, null);
        } else if (hatchPresentationData instanceof SlidesPresentationData) {
            surrogate = new Surrogate(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SLIDES, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (SlidesPresentationData) hatchPresentationData, null);
        } else {
            if (!(hatchPresentationData instanceof UnrenderablePresentationData)) {
                throw C3cG.A0q();
            }
            surrogate = new Surrogate("unrenderable", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (UnrenderablePresentationData) hatchPresentationData);
        }
        interfaceC07789is.AAR(surrogate, HatchPresentationDataSerializer$Surrogate$$serializer.INSTANCE);
    }
}
