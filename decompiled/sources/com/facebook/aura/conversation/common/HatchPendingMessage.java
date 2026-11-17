package com.facebook.aura.conversation.common;

import X.AGH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HxE;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class HatchPendingMessage implements SignOutCleanupHandler {
    public static final HatchPendingMessage INSTANCE = new HatchPendingMessage();
    public static final BLG<Long> _mainChatAssistLaunchVersion;
    public static final BLG<Long> _shareDataVersion;
    public static final C1BN<Long> mainChatAssistLaunchVersion;
    public static List<HxE<String, String>> pendingComposerFileUris;
    public static PendingComposerPromptId pendingComposerPromptId;
    public static String pendingComposerText;
    public static String pendingContextChipEyebrow;
    public static String pendingContextChipTitle;
    public static HatchComposerEntryPoint pendingEntryPoint;
    public static String pendingEntryPointOriginId;
    public static Map<String, ? extends Object> pendingExtraParams;
    public static List<String> pendingFileUris;
    public static List<String> pendingImageUris;
    public static List<String> pendingLinkAttachmentUrls;
    public static List<String> pendingLinkImageUris;
    public static boolean pendingMainChatAssistLaunch;
    public static Map<String, String> pendingMessageMetadata;
    public static PendingPayload pendingPayload;
    public static boolean shareDataPendingForMainChat;
    public static final C1BN<Long> shareDataVersion;

    public final class PendingComposerPromptId extends C06G {
        public final HatchComposerEntryPoint entryPoint;
        public final String promptId;

        public PendingComposerPromptId(String str, HatchComposerEntryPoint hatchComposerEntryPoint) {
            C7384Etj.A0Y(str, 0);
            this.promptId = str;
            this.entryPoint = hatchComposerEntryPoint;
        }

        public final PendingComposerPromptId copy(String str, HatchComposerEntryPoint hatchComposerEntryPoint) {
            C7384Etj.A0Y(str, 0);
            return new PendingComposerPromptId(str, hatchComposerEntryPoint);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PendingComposerPromptId) {
                    PendingComposerPromptId pendingComposerPromptId = (PendingComposerPromptId) obj;
                    if (!C7384Etj.areEqual(this.promptId, pendingComposerPromptId.promptId) || this.entryPoint != pendingComposerPromptId.entryPoint) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PendingComposerPromptId copy$default(PendingComposerPromptId pendingComposerPromptId, String str, HatchComposerEntryPoint hatchComposerEntryPoint, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pendingComposerPromptId.promptId;
            }
            if ((i & 2) != 0) {
                hatchComposerEntryPoint = pendingComposerPromptId.entryPoint;
            }
            C7384Etj.A0Y(str, 0);
            return new PendingComposerPromptId(str, hatchComposerEntryPoint);
        }

        public final String component1() {
            return this.promptId;
        }

        public final HatchComposerEntryPoint component2() {
            return this.entryPoint;
        }

        public final HatchComposerEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final String getPromptId() {
            return this.promptId;
        }

        public int hashCode() {
            return AnonymousClass001.A0G(this.promptId) + AnonymousClass006.A0D(this.entryPoint);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ PendingComposerPromptId(String str, HatchComposerEntryPoint hatchComposerEntryPoint, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : hatchComposerEntryPoint);
        }
    }

    public final class PendingPayload extends C06G {
        public final HatchComposerEntryPoint entryPoint;
        public final Map<String, Object> extraParams;
        public final String originId;
        public final String text;

        public PendingPayload(String str, HatchComposerEntryPoint hatchComposerEntryPoint, String str2, Map<String, ? extends Object> map) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
            this.entryPoint = hatchComposerEntryPoint;
            this.originId = str2;
            this.extraParams = map;
        }

        public final PendingPayload copy(String str, HatchComposerEntryPoint hatchComposerEntryPoint, String str2, Map<String, ? extends Object> map) {
            C7384Etj.A0Y(str, 0);
            return new PendingPayload(str, hatchComposerEntryPoint, str2, map);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PendingPayload) {
                    PendingPayload pendingPayload = (PendingPayload) obj;
                    if (!C7384Etj.areEqual(this.text, pendingPayload.text) || this.entryPoint != pendingPayload.entryPoint || !C7384Etj.areEqual(this.originId, pendingPayload.originId) || !C7384Etj.areEqual(this.extraParams, pendingPayload.extraParams)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ PendingPayload copy$default(PendingPayload pendingPayload, String str, HatchComposerEntryPoint hatchComposerEntryPoint, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pendingPayload.text;
            }
            if ((i & 2) != 0) {
                hatchComposerEntryPoint = pendingPayload.entryPoint;
            }
            if ((i & 4) != 0) {
                str2 = pendingPayload.originId;
            }
            if ((i & 8) != 0) {
                map = pendingPayload.extraParams;
            }
            C7384Etj.A0Y(str, 0);
            return new PendingPayload(str, hatchComposerEntryPoint, str2, map);
        }

        public final String component1() {
            return this.text;
        }

        public final HatchComposerEntryPoint component2() {
            return this.entryPoint;
        }

        public final String component3() {
            return this.originId;
        }

        public final Map<String, Object> component4() {
            return this.extraParams;
        }

        public final HatchComposerEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final Map<String, Object> getExtraParams() {
            return this.extraParams;
        }

        public final String getOriginId() {
            return this.originId;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return ((((AnonymousClass001.A0G(this.text) + AnonymousClass006.A0D(this.entryPoint)) * 31) + AnonymousClass006.A0G(this.originId)) * 31) + C06G.A04(this.extraParams);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ PendingPayload(String str, HatchComposerEntryPoint hatchComposerEntryPoint, String str2, Map map, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : hatchComposerEntryPoint, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : map);
        }
    }

    private final void clearPendingEntryPoint() {
        pendingEntryPoint = null;
        pendingEntryPointOriginId = null;
    }

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        pendingPayload = null;
        pendingEntryPointOriginId = null;
        C0881AGi c0881AGi = C0881AGi.A00;
        pendingImageUris = c0881AGi;
        pendingLinkImageUris = null;
        pendingLinkAttachmentUrls = null;
        pendingFileUris = c0881AGi;
        pendingComposerFileUris = c0881AGi;
        pendingComposerText = null;
        pendingComposerPromptId = null;
        pendingMessageMetadata = null;
        pendingContextChipTitle = null;
        pendingContextChipEyebrow = null;
        pendingEntryPoint = null;
        pendingMainChatAssistLaunch = false;
        shareDataPendingForMainChat = false;
        pendingExtraParams = null;
    }

    public final void markShareDataConsumedByMainChat() {
        shareDataPendingForMainChat = false;
    }

    public final void notifyMainChatAssistLaunch() {
        pendingMainChatAssistLaunch = true;
        BLG<Long> blg = _mainChatAssistLaunchVersion;
        AnonymousClass002.A1I(blg, Long.valueOf(blg.getValue().longValue() + 1));
    }

    public final void notifyShareDataReady() {
        shareDataPendingForMainChat = true;
        BLG<Long> blg = _shareDataVersion;
        AnonymousClass002.A1I(blg, Long.valueOf(blg.getValue().longValue() + 1));
    }

    public final void setPendingComposerFileUris(List<HxE<String, String>> list, HatchComposerEntryPoint hatchComposerEntryPoint) {
        C7384Etj.A0Y(list, 0);
        pendingComposerFileUris = list;
        if (hatchComposerEntryPoint != null) {
            pendingEntryPoint = hatchComposerEntryPoint;
            pendingEntryPointOriginId = null;
        }
    }

    public final void setPendingComposerImageUris(List<String> list, HatchComposerEntryPoint hatchComposerEntryPoint) {
        C7384Etj.A0Y(list, 0);
        pendingImageUris = list;
        if (hatchComposerEntryPoint != null) {
            pendingEntryPoint = hatchComposerEntryPoint;
            pendingEntryPointOriginId = null;
        }
    }

    public final void setPendingComposerPromptId(String str, HatchComposerEntryPoint hatchComposerEntryPoint) {
        C7384Etj.A0Y(str, 0);
        pendingComposerText = null;
        pendingMessageMetadata = null;
        pendingComposerPromptId = new PendingComposerPromptId(str, hatchComposerEntryPoint);
    }

    public final void setPendingComposerText(String str, HatchComposerEntryPoint hatchComposerEntryPoint) {
        C7384Etj.A0Y(str, 0);
        pendingComposerPromptId = null;
        pendingComposerText = str;
        pendingEntryPoint = hatchComposerEntryPoint;
        pendingEntryPointOriginId = null;
    }

    public final void setPendingCreateGoalMessage(Context context) {
        C7384Etj.A0Y(context, 0);
        setPendingComposerText(context.getString(R.string._name_removed__res_0x7f12023b), HatchComposerEntryPoint.NEW_GOAL);
    }

    public final void setPendingCreateSpaceMessage(Context context) {
        C7384Etj.A0Y(context, 0);
        setPendingComposerText(context.getString(R.string._name_removed__res_0x7f12023c), HatchComposerEntryPoint.CREATE_SPACE);
    }

    public final void setPendingMessage(PendingPayload pendingPayload2) {
        C7384Etj.A0Y(pendingPayload2, 0);
        pendingPayload = pendingPayload2;
        HatchComposerEntryPoint hatchComposerEntryPoint = pendingPayload2.entryPoint;
        String str = pendingPayload2.originId;
        pendingEntryPoint = hatchComposerEntryPoint;
        pendingEntryPointOriginId = str;
    }

    static {
        C0881AGi c0881AGi = C0881AGi.A00;
        pendingImageUris = c0881AGi;
        pendingFileUris = c0881AGi;
        C9286GCn c9286GCn = new C9286GCn(0L);
        _shareDataVersion = c9286GCn;
        C9286GCn c9286GCn2 = new C9286GCn(0L);
        _mainChatAssistLaunchVersion = c9286GCn2;
        shareDataVersion = new C3Pi(null, c9286GCn);
        mainChatAssistLaunchVersion = new C3Pi(null, c9286GCn2);
        pendingComposerFileUris = c0881AGi;
    }

    public static /* synthetic */ void setPendingComposerFileUris$default(HatchPendingMessage hatchPendingMessage, List list, HatchComposerEntryPoint hatchComposerEntryPoint, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchComposerEntryPoint = null;
        }
        hatchPendingMessage.setPendingComposerFileUris(list, hatchComposerEntryPoint);
    }

    public static /* synthetic */ void setPendingComposerImageUris$default(HatchPendingMessage hatchPendingMessage, List list, HatchComposerEntryPoint hatchComposerEntryPoint, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchComposerEntryPoint = null;
        }
        hatchPendingMessage.setPendingComposerImageUris(list, hatchComposerEntryPoint);
    }

    public static /* synthetic */ void setPendingComposerPromptId$default(HatchPendingMessage hatchPendingMessage, String str, HatchComposerEntryPoint hatchComposerEntryPoint, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchComposerEntryPoint = null;
        }
        hatchPendingMessage.setPendingComposerPromptId(str, hatchComposerEntryPoint);
    }

    public static /* synthetic */ void setPendingComposerText$default(HatchPendingMessage hatchPendingMessage, String str, HatchComposerEntryPoint hatchComposerEntryPoint, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchComposerEntryPoint = null;
        }
        hatchPendingMessage.setPendingComposerText(str, hatchComposerEntryPoint);
    }

    public final boolean consumeMainChatAssistLaunch() {
        if (!pendingMainChatAssistLaunch) {
            return false;
        }
        pendingMainChatAssistLaunch = false;
        return true;
    }

    public final List<HxE<String, String>> consumePendingComposerFileUris() {
        List<HxE<String, String>> list = pendingComposerFileUris;
        pendingComposerFileUris = C0881AGi.A00;
        return list;
    }

    public final HxE<HatchComposerEntryPoint, String> consumePendingComposerOrigin() {
        HatchComposerEntryPoint hatchComposerEntryPoint = pendingEntryPoint;
        String str = pendingEntryPointOriginId;
        clearPendingEntryPoint();
        if (hatchComposerEntryPoint != null) {
            return new HxE<>(hatchComposerEntryPoint, str);
        }
        return null;
    }

    public final PendingComposerPromptId consumePendingComposerPromptId() {
        PendingComposerPromptId pendingComposerPromptId2 = pendingComposerPromptId;
        pendingComposerPromptId = null;
        return pendingComposerPromptId2;
    }

    public final String consumePendingComposerText() {
        String str = pendingComposerText;
        pendingComposerText = null;
        return str;
    }

    public final String consumePendingContextChipEyebrow() {
        String str = pendingContextChipEyebrow;
        pendingContextChipEyebrow = null;
        return str;
    }

    public final String consumePendingContextChipTitle() {
        String str = pendingContextChipTitle;
        pendingContextChipTitle = null;
        return str;
    }

    public final List<String> consumePendingFileUris() {
        List<String> list = pendingFileUris;
        pendingFileUris = C0881AGi.A00;
        return list;
    }

    public final List<String> consumePendingImageUris() {
        List<String> list = pendingImageUris;
        pendingImageUris = C0881AGi.A00;
        return list;
    }

    public final List<String> consumePendingLinkAttachmentUrls() {
        List<String> list = pendingLinkAttachmentUrls;
        pendingLinkAttachmentUrls = null;
        return list;
    }

    public final List<String> consumePendingLinkImageUris() {
        List<String> list = pendingLinkImageUris;
        pendingLinkImageUris = null;
        return list;
    }

    public final PendingPayload consumePendingMessage() {
        PendingPayload pendingPayload2 = pendingPayload;
        if (pendingPayload2 == null) {
            return null;
        }
        pendingPayload = null;
        if (pendingEntryPoint == pendingPayload2.entryPoint) {
            clearPendingEntryPoint();
        }
        return pendingPayload2;
    }

    public final Map<String, String> consumePendingMessageMetadata() {
        Map<String, String> map = pendingMessageMetadata;
        pendingMessageMetadata = null;
        return map;
    }

    public final C1BN<Long> getMainChatAssistLaunchVersion() {
        return mainChatAssistLaunchVersion;
    }

    public final C1BN<Long> getShareDataVersion() {
        return shareDataVersion;
    }

    public final boolean isShareDataPendingForMainChat() {
        return shareDataPendingForMainChat;
    }

    public final void setPendingEntryPoint(HatchComposerEntryPoint hatchComposerEntryPoint, String str) {
        pendingEntryPoint = hatchComposerEntryPoint;
        pendingEntryPointOriginId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setPendingContextChip$default(HatchPendingMessage hatchPendingMessage, String str, String str2, Map map, int i, Object obj) {
        String strA0s = AnonymousClass006.A0s(i, str2);
        if ((i & 4) != 0) {
            map = AGH.A0E();
        }
        hatchPendingMessage.setPendingContextChip(str, strA0s, map);
    }

    public static /* synthetic */ void setPendingEntryPoint$default(HatchPendingMessage hatchPendingMessage, HatchComposerEntryPoint hatchComposerEntryPoint, String str, int i, Object obj) {
        String strA0s = AnonymousClass006.A0s(i, str);
        pendingEntryPoint = hatchComposerEntryPoint;
        pendingEntryPointOriginId = strA0s;
    }

    public final void setPendingContextChip(String str, String str2, Map<String, String> map) {
        AnonymousClass003.A0v(str, map);
        pendingContextChipTitle = str;
        pendingContextChipEyebrow = str2;
        pendingMessageMetadata = map;
    }

    public final void setPendingLinkAttachmentUrls(List<String> list, HatchComposerEntryPoint hatchComposerEntryPoint) {
        AnonymousClass003.A0u(list, hatchComposerEntryPoint);
        pendingLinkAttachmentUrls = list;
        if (list.isEmpty()) {
            return;
        }
        pendingEntryPoint = hatchComposerEntryPoint;
        pendingEntryPointOriginId = null;
    }

    public final void setPendingLinkImageUris(List<String> list, HatchComposerEntryPoint hatchComposerEntryPoint) {
        AnonymousClass003.A0u(list, hatchComposerEntryPoint);
        pendingLinkImageUris = list;
        if (list.isEmpty()) {
            return;
        }
        pendingEntryPoint = hatchComposerEntryPoint;
        pendingEntryPointOriginId = null;
    }

    public static /* synthetic */ void setPendingComposerText$default(HatchPendingMessage hatchPendingMessage, String str, Map map, HatchComposerEntryPoint hatchComposerEntryPoint, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchComposerEntryPoint = null;
        }
        hatchPendingMessage.setPendingComposerText(str, map, hatchComposerEntryPoint);
    }

    public final void setPendingComposerText(String str, Map<String, String> map, HatchComposerEntryPoint hatchComposerEntryPoint) {
        AnonymousClass003.A0u(str, map);
        pendingComposerPromptId = null;
        pendingComposerText = str;
        pendingMessageMetadata = map;
        pendingEntryPoint = hatchComposerEntryPoint;
        pendingEntryPointOriginId = null;
    }
}
