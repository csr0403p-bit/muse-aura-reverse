package com.facebook.aura.model;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.model.HatchWidgetDataSerializer;
import kotlin.Deprecated;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public final /* synthetic */ class HatchWidgetDataSerializer$Surrogate$$serializer implements C9cd<HatchWidgetDataSerializer.Surrogate> {
    public static final int $stable = 0;
    public static final HatchWidgetDataSerializer$Surrogate$$serializer INSTANCE;
    public static final C9iZ descriptor;

    @Override // X.C9jG
    public final HatchWidgetDataSerializer.Surrogate deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        F0C<C9hr<Object>>[] f0cArr = HatchWidgetDataSerializer.Surrogate.$childSerializers;
        HtmlWidgetData htmlWidgetData = null;
        UnrenderableWidgetData unrenderableWidgetData = null;
        LocalMapWidgetData localMapWidgetData = null;
        SpaceBuildCompletedWidgetData spaceBuildCompletedWidgetData = null;
        NavigationWidgetData navigationWidgetData = null;
        IdeaWidgetData ideaWidgetData = null;
        LetterWidgetData letterWidgetData = null;
        VoiceOptionsWidgetData voiceOptionsWidgetData = null;
        OptionWidgetData optionWidgetData = null;
        IdeaGroupWidgetData ideaGroupWidgetData = null;
        ImageOptionsWidgetData imageOptionsWidgetData = null;
        MarketplaceMapWidgetData marketplaceMapWidgetData = null;
        NodeCardWidgetData nodeCardWidgetData = null;
        OpaqueWidgetData opaqueWidgetData = null;
        String strA8f = null;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            switch (iA8N) {
                case -1:
                    c9j4A55.AAd(c9iZ);
                    return new HatchWidgetDataSerializer.Surrogate(i, strA8f, htmlWidgetData, localMapWidgetData, marketplaceMapWidgetData, optionWidgetData, imageOptionsWidgetData, voiceOptionsWidgetData, letterWidgetData, ideaWidgetData, ideaGroupWidgetData, navigationWidgetData, spaceBuildCompletedWidgetData, nodeCardWidgetData, opaqueWidgetData, unrenderableWidgetData, (C2hx) null);
                case 0:
                    strA8f = c9j4A55.A8f(c9iZ, 0);
                    i |= 1;
                    break;
                case 1:
                    htmlWidgetData = (HtmlWidgetData) c9j4A55.A8Z(HtmlWidgetData$$serializer.INSTANCE, c9iZ, 1);
                    i |= 2;
                    break;
                case 2:
                    localMapWidgetData = (LocalMapWidgetData) c9j4A55.A8Z(LocalMapWidgetDataSerializer.INSTANCE, c9iZ, 2);
                    i |= 4;
                    break;
                case 3:
                    marketplaceMapWidgetData = (MarketplaceMapWidgetData) c9j4A55.A8Z(MarketplaceMapWidgetDataSerializer.INSTANCE, c9iZ, 3);
                    i |= 8;
                    break;
                case 4:
                    optionWidgetData = (OptionWidgetData) c9j4A55.A8Z(OptionWidgetData$$serializer.INSTANCE, c9iZ, 4);
                    i |= 16;
                    break;
                case 5:
                    imageOptionsWidgetData = (ImageOptionsWidgetData) c9j4A55.A8Z(ImageOptionsWidgetData$$serializer.INSTANCE, c9iZ, 5);
                    i |= 32;
                    break;
                case 6:
                    voiceOptionsWidgetData = (VoiceOptionsWidgetData) c9j4A55.A8Z(VoiceOptionsWidgetData$$serializer.INSTANCE, c9iZ, 6);
                    i |= 64;
                    break;
                case 7:
                    letterWidgetData = (LetterWidgetData) c9j4A55.A8Z(LetterWidgetData$$serializer.INSTANCE, c9iZ, 7);
                    i |= 128;
                    break;
                case 8:
                    ideaWidgetData = (IdeaWidgetData) c9j4A55.A8Z(IdeaWidgetData$$serializer.INSTANCE, c9iZ, 8);
                    i |= 256;
                    break;
                case 9:
                    ideaGroupWidgetData = (IdeaGroupWidgetData) c9j4A55.A8Z(IdeaGroupWidgetData$$serializer.INSTANCE, c9iZ, 9);
                    i |= 512;
                    break;
                case 10:
                    navigationWidgetData = (NavigationWidgetData) c9j4A55.A8Z(NavigationWidgetData$$serializer.INSTANCE, c9iZ, 10);
                    i |= 1024;
                    break;
                case 11:
                    spaceBuildCompletedWidgetData = (SpaceBuildCompletedWidgetData) c9j4A55.A8Z(SpaceBuildCompletedWidgetData$$serializer.INSTANCE, c9iZ, 11);
                    i |= 2048;
                    break;
                case 12:
                    nodeCardWidgetData = (NodeCardWidgetData) c9j4A55.A8Z(NodeCardWidgetData$$serializer.INSTANCE, c9iZ, 12);
                    i |= 4096;
                    break;
                case 13:
                    opaqueWidgetData = (OpaqueWidgetData) c9j4A55.A8Z(OpaqueWidgetData$$serializer.INSTANCE, c9iZ, 13);
                    i |= 8192;
                    break;
                case 14:
                    unrenderableWidgetData = (UnrenderableWidgetData) c9j4A55.A8Z(f0cArr[14].getValue(), c9iZ, 14);
                    i |= 16384;
                    break;
                default:
                    throw C3cG.A17(iA8N);
            }
        }
    }

    static {
        HatchWidgetDataSerializer$Surrogate$$serializer hatchWidgetDataSerializer$Surrogate$$serializer = new HatchWidgetDataSerializer$Surrogate$$serializer();
        INSTANCE = hatchWidgetDataSerializer$Surrogate$$serializer;
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.model.HatchWidgetDataSerializer.Surrogate", hatchWidgetDataSerializer$Surrogate$$serializer, 15);
        c9iKA1C.A08("kind", false);
        c9iKA1C.A08("html", true);
        c9iKA1C.A08("localMap", true);
        c9iKA1C.A08("marketplaceMap", true);
        c9iKA1C.A08(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPTION, true);
        c9iKA1C.A08("imageOptions", true);
        c9iKA1C.A08("voiceOptions", true);
        c9iKA1C.A08(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_LETTER, true);
        c9iKA1C.A08("idea", true);
        c9iKA1C.A08("ideaGroup", true);
        c9iKA1C.A08("navigation", true);
        c9iKA1C.A08("spaceBuildCompleted", true);
        c9iKA1C.A08("nodeCard", true);
        c9iKA1C.A08(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPAQUE, true);
        c9iKA1C.A08("unrenderable", true);
        descriptor = c9iKA1C;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07779iq.A01, AbstractC07749im.A00(HtmlWidgetData$$serializer.INSTANCE), AbstractC07749im.A00(LocalMapWidgetDataSerializer.INSTANCE), AbstractC07749im.A00(MarketplaceMapWidgetDataSerializer.INSTANCE), AbstractC07749im.A00(OptionWidgetData$$serializer.INSTANCE), AbstractC07749im.A00(ImageOptionsWidgetData$$serializer.INSTANCE), AbstractC07749im.A00(VoiceOptionsWidgetData$$serializer.INSTANCE), AbstractC07749im.A00(LetterWidgetData$$serializer.INSTANCE), AbstractC07749im.A00(IdeaWidgetData$$serializer.INSTANCE), AbstractC07749im.A00(IdeaGroupWidgetData$$serializer.INSTANCE), AbstractC07749im.A00(NavigationWidgetData$$serializer.INSTANCE), AbstractC07749im.A00(SpaceBuildCompletedWidgetData$$serializer.INSTANCE), AbstractC07749im.A00(NodeCardWidgetData$$serializer.INSTANCE), AbstractC07749im.A00(OpaqueWidgetData$$serializer.INSTANCE), C3cH.A14(HatchWidgetDataSerializer.Surrogate.$childSerializers, 14)};
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
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchWidgetDataSerializer.Surrogate surrogate) {
        AnonymousClass003.A0u(interfaceC07789is, surrogate);
        C9iZ c9iZ = descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchWidgetDataSerializer.Surrogate.write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(surrogate, c9j5A56, c9iZ);
        c9j5A56.AAd(c9iZ);
    }
}
