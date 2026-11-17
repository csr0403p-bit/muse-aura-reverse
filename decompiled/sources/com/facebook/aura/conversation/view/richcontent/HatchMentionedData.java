package com.facebook.aura.conversation.view.richcontent;

import X.AnonymousClass001;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchMentionedData extends C06G {
    public static final int $stable = 0;
    public final String id;
    public final boolean isBot;
    public final int length;
    public final int offset;

    public HatchMentionedData(String str, int i, int i2, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.id = str;
        this.offset = i;
        this.length = i2;
        this.isBot = z;
    }

    public final HatchMentionedData copy(String str, int i, int i2, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new HatchMentionedData(str, i, i2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchMentionedData) {
                HatchMentionedData hatchMentionedData = (HatchMentionedData) obj;
                if (!C7384Etj.areEqual(this.id, hatchMentionedData.id) || this.offset != hatchMentionedData.offset || this.length != hatchMentionedData.length || this.isBot != hatchMentionedData.isBot) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchMentionedData copy$default(HatchMentionedData hatchMentionedData, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = hatchMentionedData.id;
        }
        if ((i3 & 2) != 0) {
            i = hatchMentionedData.offset;
        }
        if ((i3 & 4) != 0) {
            i2 = hatchMentionedData.length;
        }
        if ((i3 & 8) != 0) {
            z = hatchMentionedData.isBot;
        }
        C7384Etj.A0Y(str, 0);
        return new HatchMentionedData(str, i, i2, z);
    }

    public final String component1() {
        return this.id;
    }

    public final int component2() {
        return this.offset;
    }

    public final int component3() {
        return this.length;
    }

    public final boolean component4() {
        return this.isBot;
    }

    public final String getId() {
        return this.id;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return C0KA.A00((((AnonymousClass001.A0G(this.id) + this.offset) * 31) + this.length) * 31, this.isBot);
    }

    public final boolean isBot() {
        return this.isBot;
    }

    public String toString() {
        return super.toString();
    }
}
