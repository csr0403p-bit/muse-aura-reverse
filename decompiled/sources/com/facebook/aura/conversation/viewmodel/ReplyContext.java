package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.model.ReplyAttribution;

/* loaded from: classes3.dex */
public final class ReplyContext extends C06G {
    public static final int $stable = 8;
    public final ReplyAttribution attribution;
    public final String mediaReference;
    public final String preview;
    public final String previewImageReference;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReplyContext) {
                ReplyContext replyContext = (ReplyContext) obj;
                if (!C7384Etj.areEqual(this.attribution, replyContext.attribution) || !C7384Etj.areEqual(this.preview, replyContext.preview) || !C7384Etj.areEqual(this.mediaReference, replyContext.mediaReference) || !C7384Etj.areEqual(this.previewImageReference, replyContext.previewImageReference)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ReplyContext(ReplyAttribution replyAttribution, String str, String str2, String str3, int i, C06H c06h) {
        this(replyAttribution, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ ReplyContext copy$default(ReplyContext replyContext, ReplyAttribution replyAttribution, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            replyAttribution = replyContext.attribution;
        }
        if ((i & 2) != 0) {
            str = replyContext.preview;
        }
        if ((i & 4) != 0) {
            str2 = replyContext.mediaReference;
        }
        if ((i & 8) != 0) {
            str3 = replyContext.previewImageReference;
        }
        AnonymousClass003.A0u(replyAttribution, str);
        return new ReplyContext(replyAttribution, str, str2, str3);
    }

    public final ReplyAttribution component1() {
        return this.attribution;
    }

    public final String component2() {
        return this.preview;
    }

    public final String component3() {
        return this.mediaReference;
    }

    public final String component4() {
        return this.previewImageReference;
    }

    public final ReplyAttribution getAttribution() {
        return this.attribution;
    }

    public final String getMediaReference() {
        return this.mediaReference;
    }

    public final String getMessageId() {
        ReplyAttribution replyAttribution = this.attribution;
        if (replyAttribution instanceof ReplyAttribution.Message) {
            return ((ReplyAttribution.Message) replyAttribution).messageId;
        }
        if (replyAttribution instanceof ReplyAttribution.Presentation) {
            return ((ReplyAttribution.Presentation) replyAttribution).presentationEventId;
        }
        if (!(replyAttribution instanceof ReplyAttribution.Element)) {
            if (replyAttribution instanceof ReplyAttribution.Product) {
                return ((ReplyAttribution.Product) replyAttribution).presentationEventId;
            }
            if (!(replyAttribution instanceof ReplyAttribution.Idea) && !(replyAttribution instanceof ReplyAttribution.FeedUnit) && !(replyAttribution instanceof ReplyAttribution.Goal) && !(replyAttribution instanceof ReplyAttribution.Context)) {
                throw C3cG.A0q();
            }
        }
        return null;
    }

    public final String getPreview() {
        return this.preview;
    }

    public final String getPreviewImageReference() {
        return this.previewImageReference;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.preview, AnonymousClass005.A0E(this.attribution)) + AnonymousClass006.A0G(this.mediaReference)) * 31) + AnonymousClass005.A0H(this.previewImageReference);
    }

    public final ReplyContext copy(ReplyAttribution replyAttribution, String str, String str2, String str3) {
        AnonymousClass003.A0u(replyAttribution, str);
        return new ReplyContext(replyAttribution, str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public ReplyContext(ReplyAttribution replyAttribution, String str, String str2, String str3) {
        AnonymousClass003.A0u(replyAttribution, str);
        this.attribution = replyAttribution;
        this.preview = str;
        this.mediaReference = str2;
        this.previewImageReference = str3;
    }
}
