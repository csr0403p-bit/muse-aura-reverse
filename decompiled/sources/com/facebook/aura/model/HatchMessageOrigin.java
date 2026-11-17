package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchMessageOrigin extends C06G {
    public static final int $stable = 0;
    public final String interactionId;
    public final String messageId;
    public final int optionIndex;
    public final String widgetId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchMessageOrigin) {
                HatchMessageOrigin hatchMessageOrigin = (HatchMessageOrigin) obj;
                if (!C7384Etj.areEqual(this.widgetId, hatchMessageOrigin.widgetId) || !C7384Etj.areEqual(this.messageId, hatchMessageOrigin.messageId) || this.optionIndex != hatchMessageOrigin.optionIndex || !C7384Etj.areEqual(this.interactionId, hatchMessageOrigin.interactionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HatchMessageOrigin(String str, String str2, int i, String str3, int i2, C06H c06h) {
        this(str, str2, i, (i2 & 8) != 0 ? AnonymousClass002.A0k() : str3);
    }

    public static /* synthetic */ HatchMessageOrigin copy$default(HatchMessageOrigin hatchMessageOrigin, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hatchMessageOrigin.widgetId;
        }
        if ((i2 & 2) != 0) {
            str2 = hatchMessageOrigin.messageId;
        }
        if ((i2 & 4) != 0) {
            i = hatchMessageOrigin.optionIndex;
        }
        if ((i2 & 8) != 0) {
            str3 = hatchMessageOrigin.interactionId;
        }
        AnonymousClass005.A0y(str, str2, str3);
        return new HatchMessageOrigin(str, str2, i, str3);
    }

    public final String component1() {
        return this.widgetId;
    }

    public final String component2() {
        return this.messageId;
    }

    public final int component3() {
        return this.optionIndex;
    }

    public final String component4() {
        return this.interactionId;
    }

    public final String getInteractionId() {
        return this.interactionId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final int getOptionIndex() {
        return this.optionIndex;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.interactionId, (AnonymousClass005.A0I(this.messageId, AnonymousClass001.A0G(this.widgetId)) + this.optionIndex) * 31);
    }

    public final HatchMessageOrigin copy(String str, String str2, int i, String str3) {
        AnonymousClass005.A0y(str, str2, str3);
        return new HatchMessageOrigin(str, str2, i, str3);
    }

    public String toString() {
        return super.toString();
    }

    public HatchMessageOrigin(String str, String str2, int i, String str3) {
        AnonymousClass005.A0y(str, str2, str3);
        this.widgetId = str;
        this.messageId = str2;
        this.optionIndex = i;
        this.interactionId = str3;
    }
}
