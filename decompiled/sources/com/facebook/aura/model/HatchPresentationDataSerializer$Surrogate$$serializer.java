package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C5hV;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.F0C;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.model.HatchPresentationDataSerializer;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class HatchPresentationDataSerializer$Surrogate$$serializer implements C9cd<HatchPresentationDataSerializer.Surrogate> {
    public static final int $stable = 0;
    public static final HatchPresentationDataSerializer$Surrogate$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchPresentationDataSerializer.Surrogate deserialize(InterfaceC07829iw interfaceC07829iw) {
        int i;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HatchPresentationDataSerializer.Surrogate.$childSerializers;
        AvatarSharePresentationData avatarSharePresentationData = null;
        UnrenderablePresentationData unrenderablePresentationData = null;
        ScheduledTaskCreatedPresentationData scheduledTaskCreatedPresentationData = null;
        ShoppingResultsPresentationData shoppingResultsPresentationData = null;
        SpaceProposalPresentationData spaceProposalPresentationData = null;
        WidgetPresentationData widgetPresentationData = null;
        InternalLinkActionCardPresentationData internalLinkActionCardPresentationData = null;
        ExternalLinkPresentationData externalLinkPresentationData = null;
        TextWithButtonPresentationData textWithButtonPresentationData = null;
        BrowserTaskPresentationData browserTaskPresentationData = null;
        ShoppingCartPresentationData shoppingCartPresentationData = null;
        SpaceBuildCompletedPresentationData spaceBuildCompletedPresentationData = null;
        GenericListPresentationData genericListPresentationData = null;
        FilePresentationData filePresentationData = null;
        ImageGalleryPresentationData imageGalleryPresentationData = null;
        VideoPresentationData videoPresentationData = null;
        AudioPresentationData audioPresentationData = null;
        SlidesPresentationData slidesPresentationData = null;
        String strA8f = null;
        int i2 = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchPresentationDataSerializer.Surrogate(i2, strA8f, avatarSharePresentationData, widgetPresentationData, spaceProposalPresentationData, spaceBuildCompletedPresentationData, shoppingResultsPresentationData, shoppingCartPresentationData, browserTaskPresentationData, textWithButtonPresentationData, scheduledTaskCreatedPresentationData, externalLinkPresentationData, internalLinkActionCardPresentationData, genericListPresentationData, filePresentationData, imageGalleryPresentationData, videoPresentationData, audioPresentationData, slidesPresentationData, unrenderablePresentationData, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    avatarSharePresentationData = (AvatarSharePresentationData) c9j4A55.A8Z(AvatarSharePresentationData$$serializer.INSTANCE, c9iZ, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    widgetPresentationData = (WidgetPresentationData) c9j4A55.A8Z(WidgetPresentationData$$serializer.INSTANCE, c9iZ, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    spaceProposalPresentationData = (SpaceProposalPresentationData) c9j4A55.A8Z(SpaceProposalPresentationData$$serializer.INSTANCE, c9iZ, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    spaceBuildCompletedPresentationData = (SpaceBuildCompletedPresentationData) c9j4A55.A8Z(SpaceBuildCompletedPresentationData$$serializer.INSTANCE, c9iZ, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    shoppingResultsPresentationData = (ShoppingResultsPresentationData) c9j4A55.A8Z(ShoppingResultsPresentationData$$serializer.INSTANCE, c9iZ, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    shoppingCartPresentationData = (ShoppingCartPresentationData) c9j4A55.A8Z(ShoppingCartPresentationData$$serializer.INSTANCE, c9iZ, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    browserTaskPresentationData = (BrowserTaskPresentationData) c9j4A55.A8Z(BrowserTaskPresentationData$$serializer.INSTANCE, c9iZ, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    textWithButtonPresentationData = (TextWithButtonPresentationData) c9j4A55.A8Z(TextWithButtonPresentationData$$serializer.INSTANCE, c9iZ, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    scheduledTaskCreatedPresentationData = (ScheduledTaskCreatedPresentationData) c9j4A55.A8Z(ScheduledTaskCreatedPresentationData$$serializer.INSTANCE, c9iZ, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    externalLinkPresentationData = (ExternalLinkPresentationData) c9j4A55.A8Z(ExternalLinkPresentationData$$serializer.INSTANCE, c9iZ, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    internalLinkActionCardPresentationData = (InternalLinkActionCardPresentationData) c9j4A55.A8Z(InternalLinkActionCardPresentationData$$serializer.INSTANCE, c9iZ, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    genericListPresentationData = (GenericListPresentationData) c9j4A55.A8Z(GenericListPresentationData$$serializer.INSTANCE, c9iZ, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    filePresentationData = (FilePresentationData) c9j4A55.A8Z(FilePresentationData$$serializer.INSTANCE, c9iZ, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    imageGalleryPresentationData = (ImageGalleryPresentationData) c9j4A55.A8Z(ImageGalleryPresentationData$$serializer.INSTANCE, c9iZ, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    videoPresentationData = (VideoPresentationData) c9j4A55.A8Z(VideoPresentationData$$serializer.INSTANCE, c9iZ, 15);
                    i = 32768;
                    break;
                case 16:
                    audioPresentationData = (AudioPresentationData) c9j4A55.A8Z(AudioPresentationData$$serializer.INSTANCE, c9iZ, 16);
                    i = 65536;
                    break;
                case 17:
                    slidesPresentationData = (SlidesPresentationData) c9j4A55.A8Z(SlidesPresentationData$$serializer.INSTANCE, c9iZ, 17);
                    i = 131072;
                    break;
                case 18:
                    unrenderablePresentationData = (UnrenderablePresentationData) C3cJ.A0G(c9iZ, c9j4A55, f0cArr, 18);
                    i = 262144;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
            i2 |= i;
        }
    }

    static {
        HatchPresentationDataSerializer$Surrogate$$serializer hatchPresentationDataSerializer$Surrogate$$serializer = new HatchPresentationDataSerializer$Surrogate$$serializer();
        INSTANCE = hatchPresentationDataSerializer$Surrogate$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.HatchPresentationDataSerializer.Surrogate", hatchPresentationDataSerializer$Surrogate$$serializer, 19);
        c9iKA1C.A08("kind", false);
        c9iKA1C.A08("avatarShare", true);
        c9iKA1C.A08("widget", true);
        c9iKA1C.A08("spaceProposal", true);
        c9iKA1C.A08("spaceBuildCompleted", true);
        c9iKA1C.A08("shoppingResults", true);
        c9iKA1C.A08("shoppingCart", true);
        c9iKA1C.A08("browserTask", true);
        c9iKA1C.A08("textWithButton", true);
        c9iKA1C.A08("scheduledTaskCreated", true);
        c9iKA1C.A08("externalLink", true);
        c9iKA1C.A08("internalLinkActionCard", true);
        c9iKA1C.A08("genericList", true);
        c9iKA1C.A08("file", true);
        c9iKA1C.A08("image", true);
        c9iKA1C.A08("video", true);
        c9iKA1C.A08("audio", true);
        c9iKA1C.A08(HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SLIDES, true);
        c9iKA1C.A08("unrenderable", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07779iq.A01, AbstractC07749im.A00(AvatarSharePresentationData$$serializer.INSTANCE), AbstractC07749im.A00(WidgetPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(SpaceProposalPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(SpaceBuildCompletedPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(ShoppingResultsPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(ShoppingCartPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(BrowserTaskPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(TextWithButtonPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(ScheduledTaskCreatedPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(ExternalLinkPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(InternalLinkActionCardPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(GenericListPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(FilePresentationData$$serializer.INSTANCE), AbstractC07749im.A00(ImageGalleryPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(VideoPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(AudioPresentationData$$serializer.INSTANCE), AbstractC07749im.A00(SlidesPresentationData$$serializer.INSTANCE), C3cH.A14(HatchPresentationDataSerializer.Surrogate.$childSerializers, 18)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9cd
    public /* bridge */ C9hr<?>[] typeParametersSerializers() {
        return C5hV.A00;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchPresentationDataSerializer.Surrogate surrogate) {
        AnonymousClass003.A0u(interfaceC07789is, surrogate);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchPresentationDataSerializer.Surrogate.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(surrogate, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
