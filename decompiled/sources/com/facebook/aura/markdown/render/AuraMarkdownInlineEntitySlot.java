package com.facebook.aura.markdown.render;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes4.dex */
public final class AuraMarkdownInlineEntitySlot {
    public static final int $stable = 0;
    public final String inlineName;
    public final String key;
    public final String slotId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraMarkdownInlineEntitySlot) {
                AuraMarkdownInlineEntitySlot auraMarkdownInlineEntitySlot = (AuraMarkdownInlineEntitySlot) obj;
                if (!C7384Etj.areEqual(this.inlineName, auraMarkdownInlineEntitySlot.inlineName) || !C7384Etj.areEqual(this.slotId, auraMarkdownInlineEntitySlot.slotId) || !C7384Etj.areEqual(this.key, auraMarkdownInlineEntitySlot.key)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraMarkdownInlineEntitySlot copy$default(AuraMarkdownInlineEntitySlot auraMarkdownInlineEntitySlot, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auraMarkdownInlineEntitySlot.inlineName;
        }
        if ((i & 2) != 0) {
            str2 = auraMarkdownInlineEntitySlot.slotId;
        }
        if ((i & 4) != 0) {
            str3 = auraMarkdownInlineEntitySlot.key;
        }
        return auraMarkdownInlineEntitySlot.copy(str, str2, str3);
    }

    public final String component1() {
        return this.inlineName;
    }

    public final String component2() {
        return this.slotId;
    }

    public final String component3() {
        return this.key;
    }

    public final String getInlineName() {
        return this.inlineName;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getSlotId() {
        return this.slotId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.key, AnonymousClass005.A0I(this.slotId, AnonymousClass001.A0G(this.inlineName)));
    }

    public String toString() {
        return FGI.A0k("AuraMarkdownInlineEntitySlot(inlineName=", this.inlineName, ", slotId=", this.slotId, ", key=", this.key, ")");
    }

    public AuraMarkdownInlineEntitySlot(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.inlineName = str;
        this.slotId = str2;
        this.key = str3;
    }

    public final AuraMarkdownInlineEntitySlot copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new AuraMarkdownInlineEntitySlot(str, str2, str3);
    }
}
