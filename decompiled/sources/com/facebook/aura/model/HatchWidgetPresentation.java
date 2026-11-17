package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60R;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchWidgetPresentation extends C06G {
    public static final int $stable = 0;
    public final Long chatEventSeq;
    public final HatchPresentationData data;
    public final String displayText;
    public final String fallbackText;
    public final boolean fromHistory;
    public final String hostMessageId;
    public final String kind;
    public final String presentationEventId;
    public final String presentationId;
    public final Long seq;
    public final List<String> supportedClients;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, HatchWidgetPresentation$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<HatchWidgetPresentation> serializer() {
            return HatchWidgetPresentation$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ HatchWidgetPresentation copy$default(HatchWidgetPresentation hatchWidgetPresentation, String str, String str2, HatchPresentationData hatchPresentationData, String str3, String str4, Long l, Long l2, String str5, List list, String str6, boolean z, int i, Object obj) {
        String str7 = str;
        String str8 = str2;
        HatchPresentationData hatchPresentationData2 = hatchPresentationData;
        String str9 = str3;
        String str10 = str4;
        Long l3 = l;
        Long l4 = l2;
        String str11 = str5;
        List list2 = list;
        String str12 = str6;
        boolean z2 = z;
        if ((i & 1) != 0) {
            str7 = hatchWidgetPresentation.presentationId;
        }
        if ((i & 2) != 0) {
            str8 = hatchWidgetPresentation.kind;
        }
        if ((i & 4) != 0) {
            hatchPresentationData2 = hatchWidgetPresentation.data;
        }
        if ((i & 8) != 0) {
            str9 = hatchWidgetPresentation.displayText;
        }
        if ((i & 16) != 0) {
            str10 = hatchWidgetPresentation.hostMessageId;
        }
        if ((i & 32) != 0) {
            l3 = hatchWidgetPresentation.seq;
        }
        if ((i & 64) != 0) {
            l4 = hatchWidgetPresentation.chatEventSeq;
        }
        if ((i & 128) != 0) {
            str11 = hatchWidgetPresentation.presentationEventId;
        }
        if ((i & 256) != 0) {
            list2 = hatchWidgetPresentation.supportedClients;
        }
        if ((i & 512) != 0) {
            str12 = hatchWidgetPresentation.fallbackText;
        }
        if ((i & 1024) != 0) {
            z2 = hatchWidgetPresentation.fromHistory;
        }
        AnonymousClass005.A0x(str7, str8, hatchPresentationData2);
        return new HatchWidgetPresentation(str7, str8, hatchPresentationData2, str9, str10, l3, l4, str11, list2, str12, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchWidgetPresentation) {
                HatchWidgetPresentation hatchWidgetPresentation = (HatchWidgetPresentation) obj;
                if (!C7384Etj.areEqual(this.presentationId, hatchWidgetPresentation.presentationId) || !C7384Etj.areEqual(this.kind, hatchWidgetPresentation.kind) || !C7384Etj.areEqual(this.data, hatchWidgetPresentation.data) || !C7384Etj.areEqual(this.displayText, hatchWidgetPresentation.displayText) || !C7384Etj.areEqual(this.hostMessageId, hatchWidgetPresentation.hostMessageId) || !C7384Etj.areEqual(this.seq, hatchWidgetPresentation.seq) || !C7384Etj.areEqual(this.chatEventSeq, hatchWidgetPresentation.chatEventSeq) || !C7384Etj.areEqual(this.presentationEventId, hatchWidgetPresentation.presentationEventId) || !C7384Etj.areEqual(this.supportedClients, hatchWidgetPresentation.supportedClients) || !C7384Etj.areEqual(this.fallbackText, hatchWidgetPresentation.fallbackText) || this.fromHistory != hatchWidgetPresentation.fromHistory) {
                }
            }
            return false;
        }
        return true;
    }

    public final HatchWidgetPresentation withState(JSONState jSONState) {
        WidgetPresentationData widgetPresentationData;
        HatchPresentationData widgetPresentationData2;
        C7384Etj.A0Y(jSONState, 0);
        HatchPresentationData hatchPresentationData = this.data;
        if (hatchPresentationData instanceof GenericListPresentationData) {
            GenericListPresentation genericListPresentation = ((GenericListPresentationData) hatchPresentationData).list;
            C7384Etj.A0Y(genericListPresentation, 0);
            widgetPresentationData2 = new GenericListPresentationData(genericListPresentation, jSONState);
        } else if (hatchPresentationData instanceof FilePresentationData) {
            HatchAttachmentFile hatchAttachmentFile = ((FilePresentationData) hatchPresentationData).file;
            C7384Etj.A0Y(hatchAttachmentFile, 0);
            widgetPresentationData2 = new FilePresentationData(hatchAttachmentFile, jSONState);
        } else {
            if (!(hatchPresentationData instanceof WidgetPresentationData) || (widgetPresentationData = (WidgetPresentationData) hatchPresentationData) == null) {
                return this;
            }
            HatchWidget hatchWidgetWithState = widgetPresentationData.widget.withState(jSONState);
            C7384Etj.A0Y(hatchWidgetWithState, 0);
            widgetPresentationData2 = new WidgetPresentationData(hatchWidgetWithState);
        }
        return copy$default(this, null, null, widgetPresentationData2, null, null, null, null, null, null, null, false, 2043, null);
    }

    public /* synthetic */ HatchWidgetPresentation(String str, String str2, HatchPresentationData hatchPresentationData, String str3, String str4, Long l, Long l2, String str5, List list, String str6, boolean z, int i, C06H c06h) {
        this(str, str2, hatchPresentationData, (i & 8) != 0 ? null : str3, str4, l, l2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : str6, C3cG.A1K(i & 1024, z));
    }

    public static /* synthetic */ void getFromHistory$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchWidgetPresentation hatchWidgetPresentation, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(hatchWidgetPresentation.presentationId, c9iZ, 0);
        c9j5.AAV(hatchWidgetPresentation.kind, c9iZ, 1);
        c9j5.AAQ(hatchWidgetPresentation.data, HatchPresentationDataSerializer.INSTANCE, c9iZ, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchWidgetPresentation.displayText != null) {
            c9j5.AAP(hatchWidgetPresentation.displayText, C07779iq.A01, c9iZ, 3);
        }
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(hatchWidgetPresentation.hostMessageId, c07779iq, c9iZ, 4);
        C9j1 c9j1 = C9j1.A00;
        c9j5.AAP(hatchWidgetPresentation.seq, c9j1, c9iZ, 5);
        c9j5.AAP(hatchWidgetPresentation.chatEventSeq, c9j1, c9iZ, 6);
        if (zAfR || hatchWidgetPresentation.presentationEventId != null) {
            c9j5.AAP(hatchWidgetPresentation.presentationEventId, c07779iq, c9iZ, 7);
        }
        if (zAfR || hatchWidgetPresentation.supportedClients != null) {
            c9j5.AAP(hatchWidgetPresentation.supportedClients, C3cH.A15(f0cArr, 8), c9iZ, 8);
        }
        if (zAfR || hatchWidgetPresentation.fallbackText != null) {
            c9j5.AAP(hatchWidgetPresentation.fallbackText, c07779iq, c9iZ, 9);
        }
    }

    public final String component1() {
        return this.presentationId;
    }

    public final String component10() {
        return this.fallbackText;
    }

    public final boolean component11() {
        return this.fromHistory;
    }

    public final String component2() {
        return this.kind;
    }

    public final HatchPresentationData component3() {
        return this.data;
    }

    public final String component4() {
        return this.displayText;
    }

    public final String component5() {
        return this.hostMessageId;
    }

    public final Long component6() {
        return this.seq;
    }

    public final Long component7() {
        return this.chatEventSeq;
    }

    public final String component8() {
        return this.presentationEventId;
    }

    public final List<String> component9() {
        return this.supportedClients;
    }

    public final Long getChatEventSeq() {
        return this.chatEventSeq;
    }

    public final HatchPresentationData getData() {
        return this.data;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final String getFallbackText() {
        return this.fallbackText;
    }

    public final boolean getFromHistory() {
        return this.fromHistory;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final String getId() {
        return this.presentationId;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getPresentationEventId() {
        return this.presentationEventId;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final Long getSeq() {
        return this.seq;
    }

    public final List<String> getSupportedClients() {
        return this.supportedClients;
    }

    public final HatchWidget getWidget() {
        WidgetPresentationData widgetPresentationData;
        HatchPresentationData hatchPresentationData = this.data;
        if (!(hatchPresentationData instanceof WidgetPresentationData) || (widgetPresentationData = (WidgetPresentationData) hatchPresentationData) == null) {
            return null;
        }
        return widgetPresentationData.widget;
    }

    public int hashCode() {
        return C0KA.A00((((((((((((((AnonymousClass005.A0F(this.data, AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.presentationId))) + AnonymousClass006.A0G(this.displayText)) * 31) + AnonymousClass006.A0G(this.hostMessageId)) * 31) + AnonymousClass006.A0D(this.seq)) * 31) + AnonymousClass006.A0D(this.chatEventSeq)) * 31) + AnonymousClass006.A0G(this.presentationEventId)) * 31) + AnonymousClass006.A0D(this.supportedClients)) * 31) + AnonymousClass005.A0H(this.fallbackText)) * 31, this.fromHistory);
    }

    public final HatchWidgetPresentation copy(String str, String str2, HatchPresentationData hatchPresentationData, String str3, String str4, Long l, Long l2, String str5, List<String> list, String str6, boolean z) {
        AnonymousClass005.A0x(str, str2, hatchPresentationData);
        return new HatchWidgetPresentation(str, str2, hatchPresentationData, str3, str4, l, l2, str5, list, str6, z);
    }

    public final JSONState getState() {
        FilePresentationData filePresentationData;
        JSONState jSONState;
        GenericListPresentationData genericListPresentationData;
        JSONState jSONState2;
        HatchWidget widget = getWidget();
        if (widget != null && (jSONState2 = widget.state) != null) {
            return jSONState2;
        }
        HatchPresentationData hatchPresentationData = this.data;
        return (!(hatchPresentationData instanceof GenericListPresentationData) || (genericListPresentationData = (GenericListPresentationData) hatchPresentationData) == null) ? (!(hatchPresentationData instanceof FilePresentationData) || (filePresentationData = (FilePresentationData) hatchPresentationData) == null || (jSONState = filePresentationData.state) == null) ? C60R.A0O() : jSONState : genericListPresentationData.state;
    }

    public String toString() {
        return super.toString();
    }

    public HatchWidgetPresentation(String str, String str2, HatchPresentationData hatchPresentationData, String str3, String str4, Long l, Long l2, String str5, List<String> list, String str6, boolean z) {
        AnonymousClass005.A0x(str, str2, hatchPresentationData);
        this.presentationId = str;
        this.kind = str2;
        this.data = hatchPresentationData;
        this.displayText = str3;
        this.hostMessageId = str4;
        this.seq = l;
        this.chatEventSeq = l2;
        this.presentationEventId = str5;
        this.supportedClients = list;
        this.fallbackText = str6;
        this.fromHistory = z;
    }

    public /* synthetic */ HatchWidgetPresentation(int i, String str, String str2, HatchPresentationData hatchPresentationData, String str3, String str4, Long l, Long l2, String str5, List list, String str6, C2hx c2hx) {
        if (119 != (i & 119)) {
            C9iI.A00(HatchWidgetPresentation$$serializer.descriptor, i, 119);
            throw F60.createAndThrow();
        }
        this.presentationId = str;
        this.kind = str2;
        this.data = hatchPresentationData;
        if ((i & 8) == 0) {
            this.displayText = null;
        } else {
            this.displayText = str3;
        }
        this.hostMessageId = str4;
        this.seq = l;
        this.chatEventSeq = l2;
        if ((i & 128) == 0) {
            this.presentationEventId = null;
        } else {
            this.presentationEventId = str5;
        }
        if ((i & 256) == 0) {
            this.supportedClients = null;
        } else {
            this.supportedClients = list;
        }
        if ((i & 512) == 0) {
            this.fallbackText = null;
        } else {
            this.fallbackText = str6;
        }
        this.fromHistory = false;
    }
}
