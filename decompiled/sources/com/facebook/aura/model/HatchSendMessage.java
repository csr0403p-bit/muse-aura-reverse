package com.facebook.aura.model;

import X.AGH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchSendMessage extends C06G {
    public static final int $stable = 8;
    public final Map<String, Object> extraParams;
    public final Map<String, String> fileUploadedPaths;
    public final List<HatchPendingFile> fileUris;
    public final String hiddenPrompt;
    public final List<String> imageUris;
    public final String liveSessionTargetThreadId;
    public final Map<String, String> messageMetadata;
    public final HatchMessageOrigin messageOrigin;
    public final PendingDiscussionItem pendingDiscussionItem;
    public final ReplyAttribution replyAttribution;
    public final String requestId;
    public final boolean routeToLiveSession;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSendMessage) {
                HatchSendMessage hatchSendMessage = (HatchSendMessage) obj;
                if (!C7384Etj.areEqual(this.text, hatchSendMessage.text) || !C7384Etj.areEqual(this.requestId, hatchSendMessage.requestId) || !C7384Etj.areEqual(this.pendingDiscussionItem, hatchSendMessage.pendingDiscussionItem) || !C7384Etj.areEqual(this.imageUris, hatchSendMessage.imageUris) || !C7384Etj.areEqual(this.fileUris, hatchSendMessage.fileUris) || !C7384Etj.areEqual(this.replyAttribution, hatchSendMessage.replyAttribution) || !C7384Etj.areEqual(this.messageMetadata, hatchSendMessage.messageMetadata) || !C7384Etj.areEqual(this.extraParams, hatchSendMessage.extraParams) || !C7384Etj.areEqual(this.hiddenPrompt, hatchSendMessage.hiddenPrompt) || this.routeToLiveSession != hatchSendMessage.routeToLiveSession || !C7384Etj.areEqual(this.liveSessionTargetThreadId, hatchSendMessage.liveSessionTargetThreadId) || !C7384Etj.areEqual(this.fileUploadedPaths, hatchSendMessage.fileUploadedPaths) || !C7384Etj.areEqual(this.messageOrigin, hatchSendMessage.messageOrigin)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchSendMessage copy$default(HatchSendMessage hatchSendMessage, String str, String str2, PendingDiscussionItem pendingDiscussionItem, List list, List list2, ReplyAttribution replyAttribution, Map map, Map map2, String str3, boolean z, String str4, Map map3, HatchMessageOrigin hatchMessageOrigin, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchSendMessage.text;
        }
        if ((i & 2) != 0) {
            str2 = hatchSendMessage.requestId;
        }
        if ((i & 4) != 0) {
            pendingDiscussionItem = hatchSendMessage.pendingDiscussionItem;
        }
        if ((i & 8) != 0) {
            list = hatchSendMessage.imageUris;
        }
        if ((i & 16) != 0) {
            list2 = hatchSendMessage.fileUris;
        }
        if ((i & 32) != 0) {
            replyAttribution = hatchSendMessage.replyAttribution;
        }
        if ((i & 64) != 0) {
            map = hatchSendMessage.messageMetadata;
        }
        if ((i & 128) != 0) {
            map2 = hatchSendMessage.extraParams;
        }
        if ((i & 256) != 0) {
            str3 = hatchSendMessage.hiddenPrompt;
        }
        if ((i & 512) != 0) {
            z = hatchSendMessage.routeToLiveSession;
        }
        if ((i & 1024) != 0) {
            str4 = hatchSendMessage.liveSessionTargetThreadId;
        }
        if ((i & 2048) != 0) {
            map3 = hatchSendMessage.fileUploadedPaths;
        }
        if ((i & 4096) != 0) {
            hatchMessageOrigin = hatchSendMessage.messageOrigin;
        }
        return hatchSendMessage.copy(str, str2, pendingDiscussionItem, list, list2, replyAttribution, map, map2, str3, z, str4, map3, hatchMessageOrigin);
    }

    public final String component1() {
        return this.text;
    }

    public final boolean component10() {
        return this.routeToLiveSession;
    }

    public final String component11() {
        return this.liveSessionTargetThreadId;
    }

    public final Map<String, String> component12() {
        return this.fileUploadedPaths;
    }

    public final HatchMessageOrigin component13() {
        return this.messageOrigin;
    }

    public final String component2() {
        return this.requestId;
    }

    public final PendingDiscussionItem component3() {
        return this.pendingDiscussionItem;
    }

    public final List<String> component4() {
        return this.imageUris;
    }

    public final List<HatchPendingFile> component5() {
        return this.fileUris;
    }

    public final ReplyAttribution component6() {
        return this.replyAttribution;
    }

    public final Map<String, String> component7() {
        return this.messageMetadata;
    }

    public final Map<String, Object> component8() {
        return this.extraParams;
    }

    public final String component9() {
        return this.hiddenPrompt;
    }

    public final Map<String, Object> getExtraParams() {
        return this.extraParams;
    }

    public final Map<String, String> getFileUploadedPaths() {
        return this.fileUploadedPaths;
    }

    public final List<HatchPendingFile> getFileUris() {
        return this.fileUris;
    }

    public final String getHiddenPrompt() {
        return this.hiddenPrompt;
    }

    public final List<String> getImageUris() {
        return this.imageUris;
    }

    public final String getLiveSessionTargetThreadId() {
        return this.liveSessionTargetThreadId;
    }

    public final Map<String, String> getMessageMetadata() {
        return this.messageMetadata;
    }

    public final HatchMessageOrigin getMessageOrigin() {
        return this.messageOrigin;
    }

    public final PendingDiscussionItem getPendingDiscussionItem() {
        return this.pendingDiscussionItem;
    }

    public final ReplyAttribution getReplyAttribution() {
        return this.replyAttribution;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final boolean getRouteToLiveSession() {
        return this.routeToLiveSession;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.fileUploadedPaths, (C0KA.A01((((((((AnonymousClass005.A0F(this.fileUris, AnonymousClass005.A0F(this.imageUris, (AnonymousClass005.A0I(this.requestId, AnonymousClass001.A0G(this.text)) + AnonymousClass006.A0D(this.pendingDiscussionItem)) * 31)) + AnonymousClass006.A0D(this.replyAttribution)) * 31) + AnonymousClass006.A0D(this.messageMetadata)) * 31) + AnonymousClass006.A0D(this.extraParams)) * 31) + AnonymousClass006.A0G(this.hiddenPrompt)) * 31, this.routeToLiveSession) + AnonymousClass006.A0G(this.liveSessionTargetThreadId)) * 31) + C3cH.A02(this.messageOrigin);
    }

    public HatchSendMessage(String str, String str2, PendingDiscussionItem pendingDiscussionItem, List<String> list, List<HatchPendingFile> list2, ReplyAttribution replyAttribution, Map<String, String> map, Map<String, ? extends Object> map2, String str3, boolean z, String str4, Map<String, String> map3, HatchMessageOrigin hatchMessageOrigin) {
        AnonymousClass005.A0y(str, str2, list);
        AnonymousClass002.A1G(list2, 4, map3);
        this.text = str;
        this.requestId = str2;
        this.pendingDiscussionItem = pendingDiscussionItem;
        this.imageUris = list;
        this.fileUris = list2;
        this.replyAttribution = replyAttribution;
        this.messageMetadata = map;
        this.extraParams = map2;
        this.hiddenPrompt = str3;
        this.routeToLiveSession = z;
        this.liveSessionTargetThreadId = str4;
        this.fileUploadedPaths = map3;
        this.messageOrigin = hatchMessageOrigin;
    }

    public final HatchSendMessage copy(String str, String str2, PendingDiscussionItem pendingDiscussionItem, List<String> list, List<HatchPendingFile> list2, ReplyAttribution replyAttribution, Map<String, String> map, Map<String, ? extends Object> map2, String str3, boolean z, String str4, Map<String, String> map3, HatchMessageOrigin hatchMessageOrigin) {
        AnonymousClass005.A0y(str, str2, list);
        AnonymousClass002.A1G(list2, 4, map3);
        return new HatchSendMessage(str, str2, pendingDiscussionItem, list, list2, replyAttribution, map, map2, str3, z, str4, map3, hatchMessageOrigin);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchSendMessage(String str, String str2, PendingDiscussionItem pendingDiscussionItem, List list, List list2, ReplyAttribution replyAttribution, Map map, Map map2, String str3, boolean z, String str4, Map map3, HatchMessageOrigin hatchMessageOrigin, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? AnonymousClass002.A0k() : str2, (i & 4) != 0 ? null : pendingDiscussionItem, (i & 8) != 0 ? C0881AGi.A00 : list, (i & 16) != 0 ? C0881AGi.A00 : list2, (i & 32) != 0 ? null : replyAttribution, (i & 64) != 0 ? null : map, (i & 128) != 0 ? null : map2, (i & 256) != 0 ? null : str3, C3cG.A1K(i & 512, z), (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? AGH.A0E() : map3, (i & 4096) != 0 ? null : hatchMessageOrigin);
    }
}
