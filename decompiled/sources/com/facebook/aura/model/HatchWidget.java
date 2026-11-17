package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchWidget extends C06G {
    public static final int $stable = 8;
    public final HatchWidgetData data;
    public final String displayText;
    public final String fallbackText;
    public final String kind;
    public final String replyToText;
    public final JSONState state;
    public final List<String> supportedClients;
    public final String widgetId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, HatchWidget$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<HatchWidget> serializer() {
            return HatchWidget$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchWidget) {
                HatchWidget hatchWidget = (HatchWidget) obj;
                if (!C7384Etj.areEqual(this.widgetId, hatchWidget.widgetId) || !C7384Etj.areEqual(this.kind, hatchWidget.kind) || !C7384Etj.areEqual(this.data, hatchWidget.data) || !C7384Etj.areEqual(this.displayText, hatchWidget.displayText) || !C7384Etj.areEqual(this.replyToText, hatchWidget.replyToText) || !C7384Etj.areEqual(this.supportedClients, hatchWidget.supportedClients) || !C7384Etj.areEqual(this.fallbackText, hatchWidget.fallbackText) || !C7384Etj.areEqual(this.state, hatchWidget.state)) {
                }
            }
            return false;
        }
        return true;
    }

    public final HatchWidget withState(JSONState jSONState) {
        C7384Etj.A0Y(jSONState, 0);
        String str = this.widgetId;
        String str2 = this.kind;
        HatchWidgetData hatchWidgetData = this.data;
        String str3 = this.displayText;
        String str4 = this.replyToText;
        List<String> list = this.supportedClients;
        String str5 = this.fallbackText;
        AnonymousClass005.A0x(str, str2, hatchWidgetData);
        return new HatchWidget(str, str2, hatchWidgetData, str3, str4, list, str5, jSONState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchWidget copy$default(HatchWidget hatchWidget, String str, String str2, HatchWidgetData hatchWidgetData, String str3, String str4, List list, String str5, JSONState jSONState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchWidget.widgetId;
        }
        if ((i & 2) != 0) {
            str2 = hatchWidget.kind;
        }
        if ((i & 4) != 0) {
            hatchWidgetData = hatchWidget.data;
        }
        if ((i & 8) != 0) {
            str3 = hatchWidget.displayText;
        }
        if ((i & 16) != 0) {
            str4 = hatchWidget.replyToText;
        }
        if ((i & 32) != 0) {
            list = hatchWidget.supportedClients;
        }
        if ((i & 64) != 0) {
            str5 = hatchWidget.fallbackText;
        }
        if ((i & 128) != 0) {
            jSONState = hatchWidget.state;
        }
        return hatchWidget.copy(str, str2, hatchWidgetData, str3, str4, list, str5, jSONState);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchWidget hatchWidget, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(hatchWidget.widgetId, c9iZ, 0);
        c9j5.AAV(hatchWidget.kind, c9iZ, 1);
        c9j5.AAQ(hatchWidget.data, HatchWidgetDataSerializer.INSTANCE, c9iZ, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchWidget.displayText != null) {
            c9j5.AAP(hatchWidget.displayText, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || hatchWidget.replyToText != null) {
            c9j5.AAP(hatchWidget.replyToText, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || hatchWidget.supportedClients != null) {
            c9j5.AAP(hatchWidget.supportedClients, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
        if (zAfR || hatchWidget.fallbackText != null) {
            c9j5.AAP(hatchWidget.fallbackText, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || !C7384Etj.areEqual(hatchWidget.state, C60R.A0O())) {
            c9j5.AAQ(hatchWidget.state, JSONState$$serializer.INSTANCE, c9iZ, 7);
        }
    }

    public final String component1() {
        return this.widgetId;
    }

    public final String component2() {
        return this.kind;
    }

    public final HatchWidgetData component3() {
        return this.data;
    }

    public final String component4() {
        return this.displayText;
    }

    public final String component5() {
        return this.replyToText;
    }

    public final List<String> component6() {
        return this.supportedClients;
    }

    public final String component7() {
        return this.fallbackText;
    }

    public final JSONState component8() {
        return this.state;
    }

    public final HatchWidgetData getData() {
        return this.data;
    }

    public final String getDisplayText() {
        return this.displayText;
    }

    public final String getFallbackText() {
        return this.fallbackText;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getReplyToText() {
        return this.replyToText;
    }

    public final JSONState getState() {
        return this.state;
    }

    public final List<String> getSupportedClients() {
        return this.supportedClients;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.state, (((((((AnonymousClass005.A0F(this.data, AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.widgetId))) + AnonymousClass006.A0G(this.displayText)) * 31) + AnonymousClass006.A0G(this.replyToText)) * 31) + AnonymousClass006.A0D(this.supportedClients)) * 31) + AnonymousClass005.A0H(this.fallbackText)) * 31);
    }

    public HatchWidget(String str, String str2, HatchWidgetData hatchWidgetData, String str3, String str4, List<String> list, String str5, JSONState jSONState) {
        AnonymousClass005.A0x(str, str2, hatchWidgetData);
        C7384Etj.A0Y(jSONState, 7);
        this.widgetId = str;
        this.kind = str2;
        this.data = hatchWidgetData;
        this.displayText = str3;
        this.replyToText = str4;
        this.supportedClients = list;
        this.fallbackText = str5;
        this.state = jSONState;
    }

    public final HatchWidget copy(String str, String str2, HatchWidgetData hatchWidgetData, String str3, String str4, List<String> list, String str5, JSONState jSONState) {
        AnonymousClass005.A0x(str, str2, hatchWidgetData);
        C7384Etj.A0Y(jSONState, 7);
        return new HatchWidget(str, str2, hatchWidgetData, str3, str4, list, str5, jSONState);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchWidget(String str, String str2, HatchWidgetData hatchWidgetData, String str3, String str4, List list, String str5, JSONState jSONState, int i, C06H c06h) {
        this(str, str2, hatchWidgetData, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? new JSONState(0L, C60O.A1G()) : jSONState);
    }

    public /* synthetic */ HatchWidget(int i, String str, String str2, HatchWidgetData hatchWidgetData, String str3, String str4, List list, String str5, JSONState jSONState, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(HatchWidget$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.widgetId = str;
        this.kind = str2;
        this.data = hatchWidgetData;
        if ((i & 8) == 0) {
            this.displayText = null;
        } else {
            this.displayText = str3;
        }
        if ((i & 16) == 0) {
            this.replyToText = null;
        } else {
            this.replyToText = str4;
        }
        if ((i & 32) == 0) {
            this.supportedClients = null;
        } else {
            this.supportedClients = list;
        }
        if ((i & 64) == 0) {
            this.fallbackText = null;
        } else {
            this.fallbackText = str5;
        }
        if ((i & 128) == 0) {
            this.state = new JSONState(0L, C60O.A1G());
        } else {
            this.state = jSONState;
        }
    }
}
