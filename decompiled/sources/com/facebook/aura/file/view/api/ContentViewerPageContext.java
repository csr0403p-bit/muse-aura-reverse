package com.facebook.aura.file.view.api;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.model.HatchMessage;
import java.util.List;

/* loaded from: classes4.dex */
public final class ContentViewerPageContext extends C06G {
    public static final int $stable = 8;
    public final String hostMessageId;
    public final String imageUri;
    public final String sessionId;
    public final List<HatchMessage> threadMessages;

    public ContentViewerPageContext(String str, String str2, String str3, List<HatchMessage> list) {
        AnonymousClass002.A1B(str2, 1, list);
        this.sessionId = str;
        this.hostMessageId = str2;
        this.imageUri = str3;
        this.threadMessages = list;
    }

    public final ContentViewerPageContext copy(String str, String str2, String str3, List<HatchMessage> list) {
        AnonymousClass002.A1B(str2, 1, list);
        return new ContentViewerPageContext(str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContentViewerPageContext) {
                ContentViewerPageContext contentViewerPageContext = (ContentViewerPageContext) obj;
                if (!C7384Etj.areEqual(this.sessionId, contentViewerPageContext.sessionId) || !C7384Etj.areEqual(this.hostMessageId, contentViewerPageContext.hostMessageId) || !C7384Etj.areEqual(this.imageUri, contentViewerPageContext.imageUri) || !C7384Etj.areEqual(this.threadMessages, contentViewerPageContext.threadMessages)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ContentViewerPageContext copy$default(ContentViewerPageContext contentViewerPageContext, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentViewerPageContext.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = contentViewerPageContext.hostMessageId;
        }
        if ((i & 4) != 0) {
            str3 = contentViewerPageContext.imageUri;
        }
        if ((i & 8) != 0) {
            list = contentViewerPageContext.threadMessages;
        }
        AnonymousClass002.A1B(str2, 1, list);
        return new ContentViewerPageContext(str, str2, str3, list);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.hostMessageId;
    }

    public final String component3() {
        return this.imageUri;
    }

    public final List<HatchMessage> component4() {
        return this.threadMessages;
    }

    public final String getHostMessageId() {
        return this.hostMessageId;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final List<HatchMessage> getThreadMessages() {
        return this.threadMessages;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.threadMessages, (AnonymousClass005.A0I(this.hostMessageId, AnonymousClass006.A0G(this.sessionId) * 31) + AnonymousClass005.A0H(this.imageUri)) * 31);
    }

    public String toString() {
        return super.toString();
    }
}
