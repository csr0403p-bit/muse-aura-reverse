package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class CaptionEntry extends C06G {
    public static final int $stable = 0;
    public final String messageId;
    public final CaptionSpeaker speaker;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CaptionEntry) {
                CaptionEntry captionEntry = (CaptionEntry) obj;
                if (this.speaker != captionEntry.speaker || !C7384Etj.areEqual(this.text, captionEntry.text) || !C7384Etj.areEqual(this.messageId, captionEntry.messageId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CaptionEntry copy$default(CaptionEntry captionEntry, CaptionSpeaker captionSpeaker, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            captionSpeaker = captionEntry.speaker;
        }
        if ((i & 2) != 0) {
            str = captionEntry.text;
        }
        if ((i & 4) != 0) {
            str2 = captionEntry.messageId;
        }
        return captionEntry.copy(captionSpeaker, str, str2);
    }

    public final CaptionSpeaker component1() {
        return this.speaker;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.messageId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final CaptionSpeaker getSpeaker() {
        return this.speaker;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.text, AnonymousClass005.A0E(this.speaker)) + AnonymousClass006.A0G(this.messageId);
    }

    public CaptionEntry(CaptionSpeaker captionSpeaker, String str, String str2) {
        AnonymousClass003.A0u(captionSpeaker, str);
        this.speaker = captionSpeaker;
        this.text = str;
        this.messageId = str2;
    }

    public final CaptionEntry copy(CaptionSpeaker captionSpeaker, String str, String str2) {
        AnonymousClass003.A0u(captionSpeaker, str);
        return new CaptionEntry(captionSpeaker, str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CaptionEntry(CaptionSpeaker captionSpeaker, String str, String str2, int i, C06H c06h) {
        this(captionSpeaker, str, AnonymousClass006.A0t(i, str2));
    }
}
