package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import java.util.List;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public abstract class HatchChatEvent {
    public static final int $stable = 8;

    public final class BlockDone extends HatchChatEvent {
        public static final int $stable = 0;
        public final String blockId;
        public final String blockType;
        public final String content;
        public final CanonicalEventEnvelope envelope;
        public final String parentBlockId;
        public final String replyToMessageId;

        public BlockDone(String str, String str2, String str3, String str4, String str5, CanonicalEventEnvelope canonicalEventEnvelope) {
            C7384Etj.A0Y(str4, 3);
            this.replyToMessageId = str;
            this.blockId = str2;
            this.content = str3;
            this.blockType = str4;
            this.parentBlockId = str5;
            this.envelope = canonicalEventEnvelope;
        }

        public final BlockDone copy(String str, String str2, String str3, String str4, String str5, CanonicalEventEnvelope canonicalEventEnvelope) {
            C7384Etj.A0Y(str4, 3);
            return new BlockDone(str, str2, str3, str4, str5, canonicalEventEnvelope);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof BlockDone) {
                    BlockDone blockDone = (BlockDone) obj;
                    if (!C7384Etj.areEqual(this.replyToMessageId, blockDone.replyToMessageId) || !C7384Etj.areEqual(this.blockId, blockDone.blockId) || !C7384Etj.areEqual(this.content, blockDone.content) || !C7384Etj.areEqual(this.blockType, blockDone.blockType) || !C7384Etj.areEqual(this.parentBlockId, blockDone.parentBlockId) || !C7384Etj.areEqual(this.envelope, blockDone.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ BlockDone copy$default(BlockDone blockDone, String str, String str2, String str3, String str4, String str5, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                str = blockDone.replyToMessageId;
            }
            if ((i & 2) != 0) {
                str2 = blockDone.blockId;
            }
            if ((i & 4) != 0) {
                str3 = blockDone.content;
            }
            if ((i & 8) != 0) {
                str4 = blockDone.blockType;
            }
            if ((i & 16) != 0) {
                str5 = blockDone.parentBlockId;
            }
            if ((i & 32) != 0) {
                canonicalEventEnvelope = blockDone.envelope;
            }
            return blockDone.copy(str, str2, str3, str4, str5, canonicalEventEnvelope);
        }

        public final String component1() {
            return this.replyToMessageId;
        }

        public final String component2() {
            return this.blockId;
        }

        public final String component3() {
            return this.content;
        }

        public final String component4() {
            return this.blockType;
        }

        public final String component5() {
            return this.parentBlockId;
        }

        public final CanonicalEventEnvelope component6() {
            return this.envelope;
        }

        public final String getBlockId() {
            return this.blockId;
        }

        public final String getBlockType() {
            return this.blockType;
        }

        public final String getContent() {
            return this.content;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getParentBlockId() {
            return this.parentBlockId;
        }

        public final String getReplyToMessageId() {
            return this.replyToMessageId;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0I(this.blockType, ((((AnonymousClass006.A0G(this.replyToMessageId) * 31) + AnonymousClass006.A0G(this.blockId)) * 31) + AnonymousClass006.A0G(this.content)) * 31) + AnonymousClass006.A0G(this.parentBlockId)) * 31) + C3cH.A02(this.envelope);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ BlockDone(String str, String str2, String str3, String str4, String str5, CanonicalEventEnvelope canonicalEventEnvelope, int i, C06H c06h) {
            this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : canonicalEventEnvelope);
        }
    }

    public final class ChatAborted extends HatchChatEvent {
        public static final int $stable = 0;
        public final CanonicalEventEnvelope envelope;
        public final String replyToMessageId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ChatAborted) {
                    ChatAborted chatAborted = (ChatAborted) obj;
                    if (!C7384Etj.areEqual(this.replyToMessageId, chatAborted.replyToMessageId) || !C7384Etj.areEqual(this.envelope, chatAborted.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ChatAborted copy$default(ChatAborted chatAborted, String str, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                str = chatAborted.replyToMessageId;
            }
            if ((i & 2) != 0) {
                canonicalEventEnvelope = chatAborted.envelope;
            }
            return new ChatAborted(str, canonicalEventEnvelope);
        }

        public final String component1() {
            return this.replyToMessageId;
        }

        public final CanonicalEventEnvelope component2() {
            return this.envelope;
        }

        public final ChatAborted copy(String str, CanonicalEventEnvelope canonicalEventEnvelope) {
            return new ChatAborted(str, canonicalEventEnvelope);
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getReplyToMessageId() {
            return this.replyToMessageId;
        }

        public int hashCode() {
            return (AnonymousClass006.A0G(this.replyToMessageId) * 31) + C3cH.A02(this.envelope);
        }

        public ChatAborted(String str, CanonicalEventEnvelope canonicalEventEnvelope) {
            this.replyToMessageId = str;
            this.envelope = canonicalEventEnvelope;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ChatAborted(String str, CanonicalEventEnvelope canonicalEventEnvelope, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : canonicalEventEnvelope);
        }
    }

    public final class Citation extends HatchChatEvent {
        public static final int $stable = 0;
        public final HatchCitation citation;
        public final CanonicalEventEnvelope envelope;
        public final String replyToMessageId;

        public Citation(String str, HatchCitation hatchCitation, CanonicalEventEnvelope canonicalEventEnvelope) {
            C7384Etj.A0Y(hatchCitation, 1);
            this.replyToMessageId = str;
            this.citation = hatchCitation;
            this.envelope = canonicalEventEnvelope;
        }

        public final Citation copy(String str, HatchCitation hatchCitation, CanonicalEventEnvelope canonicalEventEnvelope) {
            C7384Etj.A0Y(hatchCitation, 1);
            return new Citation(str, hatchCitation, canonicalEventEnvelope);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Citation) {
                    Citation citation = (Citation) obj;
                    if (!C7384Etj.areEqual(this.replyToMessageId, citation.replyToMessageId) || !C7384Etj.areEqual(this.citation, citation.citation) || !C7384Etj.areEqual(this.envelope, citation.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Citation copy$default(Citation citation, String str, HatchCitation hatchCitation, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                str = citation.replyToMessageId;
            }
            if ((i & 2) != 0) {
                hatchCitation = citation.citation;
            }
            if ((i & 4) != 0) {
                canonicalEventEnvelope = citation.envelope;
            }
            return citation.copy(str, hatchCitation, canonicalEventEnvelope);
        }

        public final String component1() {
            return this.replyToMessageId;
        }

        public final HatchCitation component2() {
            return this.citation;
        }

        public final CanonicalEventEnvelope component3() {
            return this.envelope;
        }

        public final HatchCitation getCitation() {
            return this.citation;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getReplyToMessageId() {
            return this.replyToMessageId;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.citation, AnonymousClass006.A0G(this.replyToMessageId) * 31) + C3cH.A02(this.envelope);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Citation(String str, HatchCitation hatchCitation, CanonicalEventEnvelope canonicalEventEnvelope, int i, C06H c06h) {
            this(str, hatchCitation, (i & 4) != 0 ? null : canonicalEventEnvelope);
        }
    }

    public final class DeltaText extends HatchChatEvent {
        public static final int $stable = 8;
        public final String agentId;
        public final String blockId;
        public final CanonicalEventEnvelope envelope;
        public final boolean isUserLiveTranscript;
        public final String parentBlockId;
        public final String replyToMessageId;
        public final String text;
        public final List<HatchWidget> widgets;

        public DeltaText(String str, String str2, String str3, String str4, String str5, List<HatchWidget> list, CanonicalEventEnvelope canonicalEventEnvelope, boolean z) {
            C7384Etj.A0Y(str3, 2);
            this.replyToMessageId = str;
            this.blockId = str2;
            this.text = str3;
            this.parentBlockId = str4;
            this.agentId = str5;
            this.widgets = list;
            this.envelope = canonicalEventEnvelope;
            this.isUserLiveTranscript = z;
        }

        public final DeltaText copy(String str, String str2, String str3, String str4, String str5, List<HatchWidget> list, CanonicalEventEnvelope canonicalEventEnvelope, boolean z) {
            C7384Etj.A0Y(str3, 2);
            return new DeltaText(str, str2, str3, str4, str5, list, canonicalEventEnvelope, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof DeltaText) {
                    DeltaText deltaText = (DeltaText) obj;
                    if (!C7384Etj.areEqual(this.replyToMessageId, deltaText.replyToMessageId) || !C7384Etj.areEqual(this.blockId, deltaText.blockId) || !C7384Etj.areEqual(this.text, deltaText.text) || !C7384Etj.areEqual(this.parentBlockId, deltaText.parentBlockId) || !C7384Etj.areEqual(this.agentId, deltaText.agentId) || !C7384Etj.areEqual(this.widgets, deltaText.widgets) || !C7384Etj.areEqual(this.envelope, deltaText.envelope) || this.isUserLiveTranscript != deltaText.isUserLiveTranscript) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DeltaText copy$default(DeltaText deltaText, String str, String str2, String str3, String str4, String str5, List list, CanonicalEventEnvelope canonicalEventEnvelope, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deltaText.replyToMessageId;
            }
            if ((i & 2) != 0) {
                str2 = deltaText.blockId;
            }
            if ((i & 4) != 0) {
                str3 = deltaText.text;
            }
            if ((i & 8) != 0) {
                str4 = deltaText.parentBlockId;
            }
            if ((i & 16) != 0) {
                str5 = deltaText.agentId;
            }
            if ((i & 32) != 0) {
                list = deltaText.widgets;
            }
            if ((i & 64) != 0) {
                canonicalEventEnvelope = deltaText.envelope;
            }
            if ((i & 128) != 0) {
                z = deltaText.isUserLiveTranscript;
            }
            return deltaText.copy(str, str2, str3, str4, str5, list, canonicalEventEnvelope, z);
        }

        public final String component1() {
            return this.replyToMessageId;
        }

        public final String component2() {
            return this.blockId;
        }

        public final String component3() {
            return this.text;
        }

        public final String component4() {
            return this.parentBlockId;
        }

        public final String component5() {
            return this.agentId;
        }

        public final List<HatchWidget> component6() {
            return this.widgets;
        }

        public final CanonicalEventEnvelope component7() {
            return this.envelope;
        }

        public final boolean component8() {
            return this.isUserLiveTranscript;
        }

        public final String getAgentId() {
            return this.agentId;
        }

        public final String getBlockId() {
            return this.blockId;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getParentBlockId() {
            return this.parentBlockId;
        }

        public final String getReplyToMessageId() {
            return this.replyToMessageId;
        }

        public final String getText() {
            return this.text;
        }

        public final List<HatchWidget> getWidgets() {
            return this.widgets;
        }

        public int hashCode() {
            return C0KA.A00((((((((AnonymousClass005.A0I(this.text, ((AnonymousClass006.A0G(this.replyToMessageId) * 31) + AnonymousClass006.A0G(this.blockId)) * 31) + AnonymousClass006.A0G(this.parentBlockId)) * 31) + AnonymousClass006.A0G(this.agentId)) * 31) + AnonymousClass006.A0D(this.widgets)) * 31) + C3cH.A02(this.envelope)) * 31, this.isUserLiveTranscript);
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public boolean isUserLiveTranscript() {
            return this.isUserLiveTranscript;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ DeltaText(String str, String str2, String str3, String str4, String str5, List list, CanonicalEventEnvelope canonicalEventEnvelope, boolean z, int i, C06H c06h) {
            this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : canonicalEventEnvelope, C3cH.A1N(i, z));
        }
    }

    public final class Marker extends HatchChatEvent {
        public static final int $stable = 0;
        public final CanonicalEventEnvelope envelope;
        public final String id;
        public final String kind;
        public final String milestone;
        public final String milestoneVideoUrl;
        public final String variant;

        public static /* synthetic */ Marker copy$default(Marker marker, String str, String str2, String str3, String str4, String str5, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            String str9 = str4;
            String str10 = str5;
            CanonicalEventEnvelope canonicalEventEnvelope2 = canonicalEventEnvelope;
            if ((i & 1) != 0) {
                str6 = marker.id;
            }
            if ((i & 2) != 0) {
                str7 = marker.kind;
            }
            if ((i & 4) != 0) {
                str8 = marker.milestone;
            }
            if ((i & 8) != 0) {
                str9 = marker.variant;
            }
            if ((i & 16) != 0) {
                str10 = marker.milestoneVideoUrl;
            }
            if ((i & 32) != 0) {
                canonicalEventEnvelope2 = marker.envelope;
            }
            AnonymousClass003.A0u(str6, str7);
            return new Marker(str6, str7, str8, str9, str10, canonicalEventEnvelope2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Marker) {
                    Marker marker = (Marker) obj;
                    if (!C7384Etj.areEqual(this.id, marker.id) || !C7384Etj.areEqual(this.kind, marker.kind) || !C7384Etj.areEqual(this.milestone, marker.milestone) || !C7384Etj.areEqual(this.variant, marker.variant) || !C7384Etj.areEqual(this.milestoneVideoUrl, marker.milestoneVideoUrl) || !C7384Etj.areEqual(this.envelope, marker.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.kind;
        }

        public final String component3() {
            return this.milestone;
        }

        public final String component4() {
            return this.variant;
        }

        public final String component5() {
            return this.milestoneVideoUrl;
        }

        public final CanonicalEventEnvelope component6() {
            return this.envelope;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getId() {
            return this.id;
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getMilestone() {
            return this.milestone;
        }

        public final String getMilestoneVideoUrl() {
            return this.milestoneVideoUrl;
        }

        public final String getVariant() {
            return this.variant;
        }

        public int hashCode() {
            return ((((((AnonymousClass005.A0I(this.kind, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.milestone)) * 31) + AnonymousClass006.A0G(this.variant)) * 31) + AnonymousClass006.A0G(this.milestoneVideoUrl)) * 31) + C3cH.A02(this.envelope);
        }

        public Marker(String str, String str2, String str3, String str4, String str5, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass003.A0u(str, str2);
            this.id = str;
            this.kind = str2;
            this.milestone = str3;
            this.variant = str4;
            this.milestoneVideoUrl = str5;
            this.envelope = canonicalEventEnvelope;
        }

        public final Marker copy(String str, String str2, String str3, String str4, String str5, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass003.A0u(str, str2);
            return new Marker(str, str2, str3, str4, str5, canonicalEventEnvelope);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Marker(String str, String str2, String str3, String str4, String str5, CanonicalEventEnvelope canonicalEventEnvelope, int i, C06H c06h) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : canonicalEventEnvelope);
        }
    }

    public final class MessageAssistant extends HatchChatEvent {
        public static final int $stable = HatchMessage.$stable;
        public final CanonicalEventEnvelope envelope;
        public final HatchMessage message;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof MessageAssistant) {
                    MessageAssistant messageAssistant = (MessageAssistant) obj;
                    if (!C7384Etj.areEqual(this.message, messageAssistant.message) || !C7384Etj.areEqual(this.envelope, messageAssistant.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ MessageAssistant copy$default(MessageAssistant messageAssistant, HatchMessage hatchMessage, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchMessage = messageAssistant.message;
            }
            if ((i & 2) != 0) {
                canonicalEventEnvelope = messageAssistant.envelope;
            }
            AnonymousClass003.A0u(hatchMessage, canonicalEventEnvelope);
            return new MessageAssistant(hatchMessage, canonicalEventEnvelope);
        }

        public final HatchMessage component1() {
            return this.message;
        }

        public final CanonicalEventEnvelope component2() {
            return this.envelope;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final HatchMessage getMessage() {
            return this.message;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.envelope, AnonymousClass005.A0E(this.message));
        }

        public MessageAssistant(HatchMessage hatchMessage, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass003.A0u(hatchMessage, canonicalEventEnvelope);
            this.message = hatchMessage;
            this.envelope = canonicalEventEnvelope;
        }

        public final MessageAssistant copy(HatchMessage hatchMessage, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass003.A0u(hatchMessage, canonicalEventEnvelope);
            return new MessageAssistant(hatchMessage, canonicalEventEnvelope);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class MessageDone extends HatchChatEvent {
        public static final int $stable = 8;
        public final CanonicalEventEnvelope envelope;
        public final String error;
        public final String fallbackText;
        public final boolean isUserLiveTranscript;
        public final String messageId;
        public final String overrideSource;
        public final String replyToMessageId;
        public final List<HatchMessageResource> resources;
        public final List<HatchTextEntitySegment> segments;
        public final String status;
        public final String summary;
        public final JsonElement transcriptJson;
        public final List<HatchWidget> widgets;

        public MessageDone(String str, String str2, String str3, JsonElement jsonElement, List<HatchTextEntitySegment> list, String str4, String str5, String str6, List<HatchMessageResource> list2, List<HatchWidget> list3, String str7, CanonicalEventEnvelope canonicalEventEnvelope, boolean z) {
            C60O.A1N(str3, 2, list2);
            this.messageId = str;
            this.replyToMessageId = str2;
            this.status = str3;
            this.transcriptJson = jsonElement;
            this.segments = list;
            this.fallbackText = str4;
            this.error = str5;
            this.summary = str6;
            this.resources = list2;
            this.widgets = list3;
            this.overrideSource = str7;
            this.envelope = canonicalEventEnvelope;
            this.isUserLiveTranscript = z;
        }

        public final MessageDone copy(String str, String str2, String str3, JsonElement jsonElement, List<HatchTextEntitySegment> list, String str4, String str5, String str6, List<HatchMessageResource> list2, List<HatchWidget> list3, String str7, CanonicalEventEnvelope canonicalEventEnvelope, boolean z) {
            C60O.A1N(str3, 2, list2);
            return new MessageDone(str, str2, str3, jsonElement, list, str4, str5, str6, list2, list3, str7, canonicalEventEnvelope, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof MessageDone) {
                    MessageDone messageDone = (MessageDone) obj;
                    if (!C7384Etj.areEqual(this.messageId, messageDone.messageId) || !C7384Etj.areEqual(this.replyToMessageId, messageDone.replyToMessageId) || !C7384Etj.areEqual(this.status, messageDone.status) || !C7384Etj.areEqual(this.transcriptJson, messageDone.transcriptJson) || !C7384Etj.areEqual(this.segments, messageDone.segments) || !C7384Etj.areEqual(this.fallbackText, messageDone.fallbackText) || !C7384Etj.areEqual(this.error, messageDone.error) || !C7384Etj.areEqual(this.summary, messageDone.summary) || !C7384Etj.areEqual(this.resources, messageDone.resources) || !C7384Etj.areEqual(this.widgets, messageDone.widgets) || !C7384Etj.areEqual(this.overrideSource, messageDone.overrideSource) || !C7384Etj.areEqual(this.envelope, messageDone.envelope) || this.isUserLiveTranscript != messageDone.isUserLiveTranscript) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MessageDone copy$default(MessageDone messageDone, String str, String str2, String str3, JsonElement jsonElement, List list, String str4, String str5, String str6, List list2, List list3, String str7, CanonicalEventEnvelope canonicalEventEnvelope, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageDone.messageId;
            }
            if ((i & 2) != 0) {
                str2 = messageDone.replyToMessageId;
            }
            if ((i & 4) != 0) {
                str3 = messageDone.status;
            }
            if ((i & 8) != 0) {
                jsonElement = messageDone.transcriptJson;
            }
            if ((i & 16) != 0) {
                list = messageDone.segments;
            }
            if ((i & 32) != 0) {
                str4 = messageDone.fallbackText;
            }
            if ((i & 64) != 0) {
                str5 = messageDone.error;
            }
            if ((i & 128) != 0) {
                str6 = messageDone.summary;
            }
            if ((i & 256) != 0) {
                list2 = messageDone.resources;
            }
            if ((i & 512) != 0) {
                list3 = messageDone.widgets;
            }
            if ((i & 1024) != 0) {
                str7 = messageDone.overrideSource;
            }
            if ((i & 2048) != 0) {
                canonicalEventEnvelope = messageDone.envelope;
            }
            if ((i & 4096) != 0) {
                z = messageDone.isUserLiveTranscript;
            }
            return messageDone.copy(str, str2, str3, jsonElement, list, str4, str5, str6, list2, list3, str7, canonicalEventEnvelope, z);
        }

        public final String component1() {
            return this.messageId;
        }

        public final List<HatchWidget> component10() {
            return this.widgets;
        }

        public final String component11() {
            return this.overrideSource;
        }

        public final CanonicalEventEnvelope component12() {
            return this.envelope;
        }

        public final boolean component13() {
            return this.isUserLiveTranscript;
        }

        public final String component2() {
            return this.replyToMessageId;
        }

        public final String component3() {
            return this.status;
        }

        public final JsonElement component4() {
            return this.transcriptJson;
        }

        public final List<HatchTextEntitySegment> component5() {
            return this.segments;
        }

        public final String component6() {
            return this.fallbackText;
        }

        public final String component7() {
            return this.error;
        }

        public final String component8() {
            return this.summary;
        }

        public final List<HatchMessageResource> component9() {
            return this.resources;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getError() {
            return this.error;
        }

        public final String getFallbackText() {
            return this.fallbackText;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final String getOverrideSource() {
            return this.overrideSource;
        }

        public final String getReplyToMessageId() {
            return this.replyToMessageId;
        }

        public final List<HatchMessageResource> getResources() {
            return this.resources;
        }

        public final List<HatchTextEntitySegment> getSegments() {
            return this.segments;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final JsonElement getTranscriptJson() {
            return this.transcriptJson;
        }

        public final List<HatchWidget> getWidgets() {
            return this.widgets;
        }

        public int hashCode() {
            return C0KA.A00((((((AnonymousClass005.A0F(this.resources, (((((((((AnonymousClass005.A0I(this.status, ((AnonymousClass006.A0G(this.messageId) * 31) + AnonymousClass006.A0G(this.replyToMessageId)) * 31) + AnonymousClass006.A0D(this.transcriptJson)) * 31) + AnonymousClass006.A0D(this.segments)) * 31) + AnonymousClass006.A0G(this.fallbackText)) * 31) + AnonymousClass006.A0G(this.error)) * 31) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0D(this.widgets)) * 31) + AnonymousClass006.A0G(this.overrideSource)) * 31) + C3cH.A02(this.envelope)) * 31, this.isUserLiveTranscript);
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public boolean isUserLiveTranscript() {
            return this.isUserLiveTranscript;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ MessageDone(String str, String str2, String str3, JsonElement jsonElement, List list, String str4, String str5, String str6, List list2, List list3, String str7, CanonicalEventEnvelope canonicalEventEnvelope, boolean z, int i, C06H c06h) {
            this(str, str2, str3, jsonElement, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? C0881AGi.A00 : list2, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : canonicalEventEnvelope, C3cG.A1K(i & 4096, z));
        }
    }

    public final class MessageStart extends HatchChatEvent {
        public static final int $stable = HatchTranscriptMetadata.$stable;
        public final String agentId;
        public final CanonicalEventEnvelope envelope;
        public final boolean isUserLiveTranscript;
        public final String messageId;
        public final HatchTranscriptMetadata metadata;
        public final String replyToMessageId;

        public MessageStart(String str, String str2, String str3, HatchTranscriptMetadata hatchTranscriptMetadata, CanonicalEventEnvelope canonicalEventEnvelope, boolean z) {
            C7384Etj.A0Y(str, 0);
            this.messageId = str;
            this.agentId = str2;
            this.replyToMessageId = str3;
            this.metadata = hatchTranscriptMetadata;
            this.envelope = canonicalEventEnvelope;
            this.isUserLiveTranscript = z;
        }

        public final MessageStart copy(String str, String str2, String str3, HatchTranscriptMetadata hatchTranscriptMetadata, CanonicalEventEnvelope canonicalEventEnvelope, boolean z) {
            C7384Etj.A0Y(str, 0);
            return new MessageStart(str, str2, str3, hatchTranscriptMetadata, canonicalEventEnvelope, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof MessageStart) {
                    MessageStart messageStart = (MessageStart) obj;
                    if (!C7384Etj.areEqual(this.messageId, messageStart.messageId) || !C7384Etj.areEqual(this.agentId, messageStart.agentId) || !C7384Etj.areEqual(this.replyToMessageId, messageStart.replyToMessageId) || !C7384Etj.areEqual(this.metadata, messageStart.metadata) || !C7384Etj.areEqual(this.envelope, messageStart.envelope) || this.isUserLiveTranscript != messageStart.isUserLiveTranscript) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ MessageStart copy$default(MessageStart messageStart, String str, String str2, String str3, HatchTranscriptMetadata hatchTranscriptMetadata, CanonicalEventEnvelope canonicalEventEnvelope, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageStart.messageId;
            }
            if ((i & 2) != 0) {
                str2 = messageStart.agentId;
            }
            if ((i & 4) != 0) {
                str3 = messageStart.replyToMessageId;
            }
            if ((i & 8) != 0) {
                hatchTranscriptMetadata = messageStart.metadata;
            }
            if ((i & 16) != 0) {
                canonicalEventEnvelope = messageStart.envelope;
            }
            if ((i & 32) != 0) {
                z = messageStart.isUserLiveTranscript;
            }
            return messageStart.copy(str, str2, str3, hatchTranscriptMetadata, canonicalEventEnvelope, z);
        }

        public final String component1() {
            return this.messageId;
        }

        public final String component2() {
            return this.agentId;
        }

        public final String component3() {
            return this.replyToMessageId;
        }

        public final HatchTranscriptMetadata component4() {
            return this.metadata;
        }

        public final CanonicalEventEnvelope component5() {
            return this.envelope;
        }

        public final boolean component6() {
            return this.isUserLiveTranscript;
        }

        public final String getAgentId() {
            return this.agentId;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final HatchTranscriptMetadata getMetadata() {
            return this.metadata;
        }

        public final String getReplyToMessageId() {
            return this.replyToMessageId;
        }

        public int hashCode() {
            return C0KA.A00((((((((AnonymousClass001.A0G(this.messageId) + AnonymousClass006.A0G(this.agentId)) * 31) + AnonymousClass006.A0G(this.replyToMessageId)) * 31) + AnonymousClass006.A0D(this.metadata)) * 31) + C3cH.A02(this.envelope)) * 31, this.isUserLiveTranscript);
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public boolean isUserLiveTranscript() {
            return this.isUserLiveTranscript;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ MessageStart(String str, String str2, String str3, HatchTranscriptMetadata hatchTranscriptMetadata, CanonicalEventEnvelope canonicalEventEnvelope, boolean z, int i, C06H c06h) {
            this(str, str2, str3, hatchTranscriptMetadata, (i & 16) != 0 ? null : canonicalEventEnvelope, AnonymousClass002.A1R(i, z));
        }
    }

    public final class MessageUser extends HatchChatEvent {
        public static final int $stable = HatchMessage.$stable;
        public final CanonicalEventEnvelope envelope;
        public final boolean isUserLiveTranscript;
        public final HatchMessage message;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof MessageUser) {
                    MessageUser messageUser = (MessageUser) obj;
                    if (!C7384Etj.areEqual(this.message, messageUser.message) || !C7384Etj.areEqual(this.envelope, messageUser.envelope) || this.isUserLiveTranscript != messageUser.isUserLiveTranscript) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ MessageUser copy$default(MessageUser messageUser, HatchMessage hatchMessage, CanonicalEventEnvelope canonicalEventEnvelope, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchMessage = messageUser.message;
            }
            if ((i & 2) != 0) {
                canonicalEventEnvelope = messageUser.envelope;
            }
            if ((i & 4) != 0) {
                z = messageUser.isUserLiveTranscript;
            }
            return messageUser.copy(hatchMessage, canonicalEventEnvelope, z);
        }

        public final HatchMessage component1() {
            return this.message;
        }

        public final CanonicalEventEnvelope component2() {
            return this.envelope;
        }

        public final boolean component3() {
            return this.isUserLiveTranscript;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final HatchMessage getMessage() {
            return this.message;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0F(this.envelope, AnonymousClass005.A0E(this.message)), this.isUserLiveTranscript);
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public boolean isUserLiveTranscript() {
            return this.isUserLiveTranscript;
        }

        public MessageUser(HatchMessage hatchMessage, CanonicalEventEnvelope canonicalEventEnvelope, boolean z) {
            AnonymousClass003.A0u(hatchMessage, canonicalEventEnvelope);
            this.message = hatchMessage;
            this.envelope = canonicalEventEnvelope;
            this.isUserLiveTranscript = z;
        }

        public final MessageUser copy(HatchMessage hatchMessage, CanonicalEventEnvelope canonicalEventEnvelope, boolean z) {
            AnonymousClass003.A0u(hatchMessage, canonicalEventEnvelope);
            return new MessageUser(hatchMessage, canonicalEventEnvelope, z);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ MessageUser(HatchMessage hatchMessage, CanonicalEventEnvelope canonicalEventEnvelope, boolean z, int i, C06H c06h) {
            this(hatchMessage, canonicalEventEnvelope, AnonymousClass005.A1O(i, z));
        }
    }

    public final class MessagesRemoved extends HatchChatEvent {
        public static final int $stable = 8;
        public final CanonicalEventEnvelope envelope;
        public final List<String> messageIds;

        public MessagesRemoved(List<String> list, CanonicalEventEnvelope canonicalEventEnvelope) {
            C7384Etj.A0Y(list, 0);
            this.messageIds = list;
            this.envelope = canonicalEventEnvelope;
        }

        public final MessagesRemoved copy(List<String> list, CanonicalEventEnvelope canonicalEventEnvelope) {
            C7384Etj.A0Y(list, 0);
            return new MessagesRemoved(list, canonicalEventEnvelope);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof MessagesRemoved) {
                    MessagesRemoved messagesRemoved = (MessagesRemoved) obj;
                    if (!C7384Etj.areEqual(this.messageIds, messagesRemoved.messageIds) || !C7384Etj.areEqual(this.envelope, messagesRemoved.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ MessagesRemoved copy$default(MessagesRemoved messagesRemoved, List list, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                list = messagesRemoved.messageIds;
            }
            if ((i & 2) != 0) {
                canonicalEventEnvelope = messagesRemoved.envelope;
            }
            C7384Etj.A0Y(list, 0);
            return new MessagesRemoved(list, canonicalEventEnvelope);
        }

        public final List<String> component1() {
            return this.messageIds;
        }

        public final CanonicalEventEnvelope component2() {
            return this.envelope;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final List<String> getMessageIds() {
            return this.messageIds;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.messageIds) + AnonymousClass006.A0D(this.envelope);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ MessagesRemoved(List list, CanonicalEventEnvelope canonicalEventEnvelope, int i, C06H c06h) {
            this(list, (i & 2) != 0 ? null : canonicalEventEnvelope);
        }
    }

    public final class Presentation extends HatchChatEvent {
        public static final int $stable = HatchWidgetPresentation.$stable;
        public final CanonicalEventEnvelope envelope;
        public final HatchWidgetPresentation presentation;

        public Presentation(HatchWidgetPresentation hatchWidgetPresentation, CanonicalEventEnvelope canonicalEventEnvelope) {
            C7384Etj.A0Y(hatchWidgetPresentation, 0);
            this.presentation = hatchWidgetPresentation;
            this.envelope = canonicalEventEnvelope;
        }

        public final Presentation copy(HatchWidgetPresentation hatchWidgetPresentation, CanonicalEventEnvelope canonicalEventEnvelope) {
            C7384Etj.A0Y(hatchWidgetPresentation, 0);
            return new Presentation(hatchWidgetPresentation, canonicalEventEnvelope);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Presentation) {
                    Presentation presentation = (Presentation) obj;
                    if (!C7384Etj.areEqual(this.presentation, presentation.presentation) || !C7384Etj.areEqual(this.envelope, presentation.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Presentation copy$default(Presentation presentation, HatchWidgetPresentation hatchWidgetPresentation, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchWidgetPresentation = presentation.presentation;
            }
            if ((i & 2) != 0) {
                canonicalEventEnvelope = presentation.envelope;
            }
            C7384Etj.A0Y(hatchWidgetPresentation, 0);
            return new Presentation(hatchWidgetPresentation, canonicalEventEnvelope);
        }

        public final HatchWidgetPresentation component1() {
            return this.presentation;
        }

        public final CanonicalEventEnvelope component2() {
            return this.envelope;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final HatchWidgetPresentation getPresentation() {
            return this.presentation;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.presentation) + AnonymousClass006.A0D(this.envelope);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Presentation(HatchWidgetPresentation hatchWidgetPresentation, CanonicalEventEnvelope canonicalEventEnvelope, int i, C06H c06h) {
            this(hatchWidgetPresentation, (i & 2) != 0 ? null : canonicalEventEnvelope);
        }
    }

    public final class ReactionsUpdated extends HatchChatEvent {
        public static final int $stable = 8;
        public final CanonicalEventEnvelope envelope;
        public final String messageId;
        public final List<String> reactions;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ReactionsUpdated) {
                    ReactionsUpdated reactionsUpdated = (ReactionsUpdated) obj;
                    if (!C7384Etj.areEqual(this.messageId, reactionsUpdated.messageId) || !C7384Etj.areEqual(this.reactions, reactionsUpdated.reactions) || !C7384Etj.areEqual(this.envelope, reactionsUpdated.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReactionsUpdated copy$default(ReactionsUpdated reactionsUpdated, String str, List list, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reactionsUpdated.messageId;
            }
            if ((i & 2) != 0) {
                list = reactionsUpdated.reactions;
            }
            if ((i & 4) != 0) {
                canonicalEventEnvelope = reactionsUpdated.envelope;
            }
            return reactionsUpdated.copy(str, list, canonicalEventEnvelope);
        }

        public final String component1() {
            return this.messageId;
        }

        public final List<String> component2() {
            return this.reactions;
        }

        public final CanonicalEventEnvelope component3() {
            return this.envelope;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final List<String> getReactions() {
            return this.reactions;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.reactions, AnonymousClass001.A0G(this.messageId)) + AnonymousClass006.A0D(this.envelope);
        }

        public ReactionsUpdated(String str, List<String> list, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass003.A0u(str, list);
            this.messageId = str;
            this.reactions = list;
            this.envelope = canonicalEventEnvelope;
        }

        public final ReactionsUpdated copy(String str, List<String> list, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass003.A0u(str, list);
            return new ReactionsUpdated(str, list, canonicalEventEnvelope);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ReactionsUpdated(String str, List list, CanonicalEventEnvelope canonicalEventEnvelope, int i, C06H c06h) {
            this(str, list, (i & 4) != 0 ? null : canonicalEventEnvelope);
        }
    }

    public final class SubAgentTaskStatus extends HatchChatEvent {
        public static final int $stable = 0;
        public final String agentId;
        public final Long completedAtMs;
        public final CanonicalEventEnvelope envelope;
        public final String status;
        public final String summary;
        public final String taskId;

        public SubAgentTaskStatus(String str, String str2, String str3, String str4, Long l, CanonicalEventEnvelope canonicalEventEnvelope) {
            C7384Etj.A0Y(str3, 2);
            this.taskId = str;
            this.agentId = str2;
            this.status = str3;
            this.summary = str4;
            this.completedAtMs = l;
            this.envelope = canonicalEventEnvelope;
        }

        public final SubAgentTaskStatus copy(String str, String str2, String str3, String str4, Long l, CanonicalEventEnvelope canonicalEventEnvelope) {
            C7384Etj.A0Y(str3, 2);
            return new SubAgentTaskStatus(str, str2, str3, str4, l, canonicalEventEnvelope);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SubAgentTaskStatus) {
                    SubAgentTaskStatus subAgentTaskStatus = (SubAgentTaskStatus) obj;
                    if (!C7384Etj.areEqual(this.taskId, subAgentTaskStatus.taskId) || !C7384Etj.areEqual(this.agentId, subAgentTaskStatus.agentId) || !C7384Etj.areEqual(this.status, subAgentTaskStatus.status) || !C7384Etj.areEqual(this.summary, subAgentTaskStatus.summary) || !C7384Etj.areEqual(this.completedAtMs, subAgentTaskStatus.completedAtMs) || !C7384Etj.areEqual(this.envelope, subAgentTaskStatus.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SubAgentTaskStatus copy$default(SubAgentTaskStatus subAgentTaskStatus, String str, String str2, String str3, String str4, Long l, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subAgentTaskStatus.taskId;
            }
            if ((i & 2) != 0) {
                str2 = subAgentTaskStatus.agentId;
            }
            if ((i & 4) != 0) {
                str3 = subAgentTaskStatus.status;
            }
            if ((i & 8) != 0) {
                str4 = subAgentTaskStatus.summary;
            }
            if ((i & 16) != 0) {
                l = subAgentTaskStatus.completedAtMs;
            }
            if ((i & 32) != 0) {
                canonicalEventEnvelope = subAgentTaskStatus.envelope;
            }
            return subAgentTaskStatus.copy(str, str2, str3, str4, l, canonicalEventEnvelope);
        }

        public final String component1() {
            return this.taskId;
        }

        public final String component2() {
            return this.agentId;
        }

        public final String component3() {
            return this.status;
        }

        public final String component4() {
            return this.summary;
        }

        public final Long component5() {
            return this.completedAtMs;
        }

        public final CanonicalEventEnvelope component6() {
            return this.envelope;
        }

        public final String getAgentId() {
            return this.agentId;
        }

        public final Long getCompletedAtMs() {
            return this.completedAtMs;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final String getTaskId() {
            return this.taskId;
        }

        public int hashCode() {
            return ((((AnonymousClass005.A0I(this.status, ((AnonymousClass006.A0G(this.taskId) * 31) + AnonymousClass006.A0G(this.agentId)) * 31) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0D(this.completedAtMs)) * 31) + C3cH.A02(this.envelope);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ SubAgentTaskStatus(String str, String str2, String str3, String str4, Long l, CanonicalEventEnvelope canonicalEventEnvelope, int i, C06H c06h) {
            this(str, str2, str3, str4, l, (i & 32) != 0 ? null : canonicalEventEnvelope);
        }
    }

    public final class Thinking extends HatchChatEvent {
        public static final int $stable = 0;
        public final String blockId;
        public final CanonicalEventEnvelope envelope;
        public final String parentBlockId;
        public final String replyToMessageId;
        public final String text;

        public Thinking(String str, String str2, String str3, String str4, CanonicalEventEnvelope canonicalEventEnvelope) {
            C7384Etj.A0Y(str2, 1);
            this.replyToMessageId = str;
            this.text = str2;
            this.blockId = str3;
            this.parentBlockId = str4;
            this.envelope = canonicalEventEnvelope;
        }

        public final Thinking copy(String str, String str2, String str3, String str4, CanonicalEventEnvelope canonicalEventEnvelope) {
            C7384Etj.A0Y(str2, 1);
            return new Thinking(str, str2, str3, str4, canonicalEventEnvelope);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Thinking) {
                    Thinking thinking = (Thinking) obj;
                    if (!C7384Etj.areEqual(this.replyToMessageId, thinking.replyToMessageId) || !C7384Etj.areEqual(this.text, thinking.text) || !C7384Etj.areEqual(this.blockId, thinking.blockId) || !C7384Etj.areEqual(this.parentBlockId, thinking.parentBlockId) || !C7384Etj.areEqual(this.envelope, thinking.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Thinking copy$default(Thinking thinking, String str, String str2, String str3, String str4, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                str = thinking.replyToMessageId;
            }
            if ((i & 2) != 0) {
                str2 = thinking.text;
            }
            if ((i & 4) != 0) {
                str3 = thinking.blockId;
            }
            if ((i & 8) != 0) {
                str4 = thinking.parentBlockId;
            }
            if ((i & 16) != 0) {
                canonicalEventEnvelope = thinking.envelope;
            }
            return thinking.copy(str, str2, str3, str4, canonicalEventEnvelope);
        }

        public final String component1() {
            return this.replyToMessageId;
        }

        public final String component2() {
            return this.text;
        }

        public final String component3() {
            return this.blockId;
        }

        public final String component4() {
            return this.parentBlockId;
        }

        public final CanonicalEventEnvelope component5() {
            return this.envelope;
        }

        public final String getBlockId() {
            return this.blockId;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getParentBlockId() {
            return this.parentBlockId;
        }

        public final String getReplyToMessageId() {
            return this.replyToMessageId;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return ((((AnonymousClass005.A0I(this.text, AnonymousClass006.A0G(this.replyToMessageId) * 31) + AnonymousClass006.A0G(this.blockId)) * 31) + AnonymousClass006.A0G(this.parentBlockId)) * 31) + C3cH.A02(this.envelope);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Thinking(String str, String str2, String str3, String str4, CanonicalEventEnvelope canonicalEventEnvelope, int i, C06H c06h) {
            this(str, str2, str3, str4, (i & 16) != 0 ? null : canonicalEventEnvelope);
        }
    }

    public final class ToolDone extends HatchChatEvent {
        public static final int $stable = HatchToolCallResult.$stable;
        public final long completedAtMs;
        public final CanonicalEventEnvelope envelope;
        public final String parentBlockId;
        public final String replyToMessageId;
        public final HatchToolCallResult result;
        public final String toolCallId;
        public final String toolName;
        public final String toolType;

        public ToolDone(String str, String str2, String str3, String str4, HatchToolCallResult hatchToolCallResult, String str5, long j, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass005.A11(str2, str3, str4, 1);
            this.replyToMessageId = str;
            this.toolCallId = str2;
            this.toolName = str3;
            this.toolType = str4;
            this.result = hatchToolCallResult;
            this.parentBlockId = str5;
            this.completedAtMs = j;
            this.envelope = canonicalEventEnvelope;
        }

        public final ToolDone copy(String str, String str2, String str3, String str4, HatchToolCallResult hatchToolCallResult, String str5, long j, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass005.A11(str2, str3, str4, 1);
            return new ToolDone(str, str2, str3, str4, hatchToolCallResult, str5, j, canonicalEventEnvelope);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ToolDone) {
                    ToolDone toolDone = (ToolDone) obj;
                    if (!C7384Etj.areEqual(this.replyToMessageId, toolDone.replyToMessageId) || !C7384Etj.areEqual(this.toolCallId, toolDone.toolCallId) || !C7384Etj.areEqual(this.toolName, toolDone.toolName) || !C7384Etj.areEqual(this.toolType, toolDone.toolType) || !C7384Etj.areEqual(this.result, toolDone.result) || !C7384Etj.areEqual(this.parentBlockId, toolDone.parentBlockId) || this.completedAtMs != toolDone.completedAtMs || !C7384Etj.areEqual(this.envelope, toolDone.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ToolDone copy$default(ToolDone toolDone, String str, String str2, String str3, String str4, HatchToolCallResult hatchToolCallResult, String str5, long j, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolDone.replyToMessageId;
            }
            if ((i & 2) != 0) {
                str2 = toolDone.toolCallId;
            }
            if ((i & 4) != 0) {
                str3 = toolDone.toolName;
            }
            if ((i & 8) != 0) {
                str4 = toolDone.toolType;
            }
            if ((i & 16) != 0) {
                hatchToolCallResult = toolDone.result;
            }
            if ((i & 32) != 0) {
                str5 = toolDone.parentBlockId;
            }
            if ((i & 64) != 0) {
                j = toolDone.completedAtMs;
            }
            if ((i & 128) != 0) {
                canonicalEventEnvelope = toolDone.envelope;
            }
            return toolDone.copy(str, str2, str3, str4, hatchToolCallResult, str5, j, canonicalEventEnvelope);
        }

        public final String component1() {
            return this.replyToMessageId;
        }

        public final String component2() {
            return this.toolCallId;
        }

        public final String component3() {
            return this.toolName;
        }

        public final String component4() {
            return this.toolType;
        }

        public final HatchToolCallResult component5() {
            return this.result;
        }

        public final String component6() {
            return this.parentBlockId;
        }

        public final long component7() {
            return this.completedAtMs;
        }

        public final CanonicalEventEnvelope component8() {
            return this.envelope;
        }

        public final long getCompletedAtMs() {
            return this.completedAtMs;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getParentBlockId() {
            return this.parentBlockId;
        }

        public final String getReplyToMessageId() {
            return this.replyToMessageId;
        }

        public final HatchToolCallResult getResult() {
            return this.result;
        }

        public final String getToolCallId() {
            return this.toolCallId;
        }

        public final String getToolName() {
            return this.toolName;
        }

        public final String getToolType() {
            return this.toolType;
        }

        public int hashCode() {
            return C60R.A00(this.completedAtMs, (((AnonymousClass005.A0I(this.toolType, AnonymousClass005.A0I(this.toolName, AnonymousClass005.A0I(this.toolCallId, AnonymousClass006.A0G(this.replyToMessageId) * 31))) + AnonymousClass006.A0D(this.result)) * 31) + AnonymousClass006.A0G(this.parentBlockId)) * 31) + C3cH.A02(this.envelope);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ToolDone(String str, String str2, String str3, String str4, HatchToolCallResult hatchToolCallResult, String str5, long j, CanonicalEventEnvelope canonicalEventEnvelope, int i, C06H c06h) {
            this(str, str2, str3, str4, hatchToolCallResult, str5, j, (i & 128) != 0 ? null : canonicalEventEnvelope);
        }
    }

    public final class ToolStart extends HatchChatEvent {
        public static final int $stable = HatchToolCallRequest.$stable;
        public final String agentId;
        public final CanonicalEventEnvelope envelope;
        public final String inputSummary;
        public final String parentBlockId;
        public final String replyToMessageId;
        public final HatchToolCallRequest request;
        public final long startedAtMs;
        public final String toolCallId;
        public final String toolName;
        public final String toolType;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ToolStart) {
                    ToolStart toolStart = (ToolStart) obj;
                    if (!C7384Etj.areEqual(this.replyToMessageId, toolStart.replyToMessageId) || !C7384Etj.areEqual(this.toolCallId, toolStart.toolCallId) || !C7384Etj.areEqual(this.toolName, toolStart.toolName) || !C7384Etj.areEqual(this.inputSummary, toolStart.inputSummary) || !C7384Etj.areEqual(this.toolType, toolStart.toolType) || !C7384Etj.areEqual(this.request, toolStart.request) || !C7384Etj.areEqual(this.parentBlockId, toolStart.parentBlockId) || !C7384Etj.areEqual(this.agentId, toolStart.agentId) || this.startedAtMs != toolStart.startedAtMs || !C7384Etj.areEqual(this.envelope, toolStart.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ToolStart copy$default(ToolStart toolStart, String str, String str2, String str3, String str4, String str5, HatchToolCallRequest hatchToolCallRequest, String str6, String str7, long j, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolStart.replyToMessageId;
            }
            if ((i & 2) != 0) {
                str2 = toolStart.toolCallId;
            }
            if ((i & 4) != 0) {
                str3 = toolStart.toolName;
            }
            if ((i & 8) != 0) {
                str4 = toolStart.inputSummary;
            }
            if ((i & 16) != 0) {
                str5 = toolStart.toolType;
            }
            if ((i & 32) != 0) {
                hatchToolCallRequest = toolStart.request;
            }
            if ((i & 64) != 0) {
                str6 = toolStart.parentBlockId;
            }
            if ((i & 128) != 0) {
                str7 = toolStart.agentId;
            }
            if ((i & 256) != 0) {
                j = toolStart.startedAtMs;
            }
            if ((i & 512) != 0) {
                canonicalEventEnvelope = toolStart.envelope;
            }
            return toolStart.copy(str, str2, str3, str4, str5, hatchToolCallRequest, str6, str7, j, canonicalEventEnvelope);
        }

        public final String component1() {
            return this.replyToMessageId;
        }

        public final CanonicalEventEnvelope component10() {
            return this.envelope;
        }

        public final String component2() {
            return this.toolCallId;
        }

        public final String component3() {
            return this.toolName;
        }

        public final String component4() {
            return this.inputSummary;
        }

        public final String component5() {
            return this.toolType;
        }

        public final HatchToolCallRequest component6() {
            return this.request;
        }

        public final String component7() {
            return this.parentBlockId;
        }

        public final String component8() {
            return this.agentId;
        }

        public final long component9() {
            return this.startedAtMs;
        }

        public final String getAgentId() {
            return this.agentId;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getInputSummary() {
            return this.inputSummary;
        }

        public final String getParentBlockId() {
            return this.parentBlockId;
        }

        public final String getReplyToMessageId() {
            return this.replyToMessageId;
        }

        public final HatchToolCallRequest getRequest() {
            return this.request;
        }

        public final long getStartedAtMs() {
            return this.startedAtMs;
        }

        public final String getToolCallId() {
            return this.toolCallId;
        }

        public final String getToolName() {
            return this.toolName;
        }

        public final String getToolType() {
            return this.toolType;
        }

        public int hashCode() {
            return C60R.A00(this.startedAtMs, (((AnonymousClass005.A0F(this.request, AnonymousClass005.A0I(this.toolType, (AnonymousClass005.A0I(this.toolName, AnonymousClass005.A0I(this.toolCallId, AnonymousClass006.A0G(this.replyToMessageId) * 31)) + AnonymousClass006.A0G(this.inputSummary)) * 31)) + AnonymousClass006.A0G(this.parentBlockId)) * 31) + AnonymousClass006.A0G(this.agentId)) * 31) + C3cH.A02(this.envelope);
        }

        public ToolStart(String str, String str2, String str3, String str4, String str5, HatchToolCallRequest hatchToolCallRequest, String str6, String str7, long j, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass003.A0x(str2, str3);
            AnonymousClass003.A0y(str5, hatchToolCallRequest);
            this.replyToMessageId = str;
            this.toolCallId = str2;
            this.toolName = str3;
            this.inputSummary = str4;
            this.toolType = str5;
            this.request = hatchToolCallRequest;
            this.parentBlockId = str6;
            this.agentId = str7;
            this.startedAtMs = j;
            this.envelope = canonicalEventEnvelope;
        }

        public final ToolStart copy(String str, String str2, String str3, String str4, String str5, HatchToolCallRequest hatchToolCallRequest, String str6, String str7, long j, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass003.A0x(str2, str3);
            AnonymousClass003.A0y(str5, hatchToolCallRequest);
            return new ToolStart(str, str2, str3, str4, str5, hatchToolCallRequest, str6, str7, j, canonicalEventEnvelope);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ToolStart(String str, String str2, String str3, String str4, String str5, HatchToolCallRequest hatchToolCallRequest, String str6, String str7, long j, CanonicalEventEnvelope canonicalEventEnvelope, int i, C06H c06h) {
            this(str, str2, str3, str4, str5, hatchToolCallRequest, str6, str7, j, (i & 512) != 0 ? null : canonicalEventEnvelope);
        }
    }

    public final class ToolUpdate extends HatchChatEvent {
        public static final int $stable = 0;
        public final CanonicalEventEnvelope envelope;
        public final String outputText;
        public final String replyToMessageId;
        public final String toolCallId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ToolUpdate) {
                    ToolUpdate toolUpdate = (ToolUpdate) obj;
                    if (!C7384Etj.areEqual(this.replyToMessageId, toolUpdate.replyToMessageId) || !C7384Etj.areEqual(this.toolCallId, toolUpdate.toolCallId) || !C7384Etj.areEqual(this.outputText, toolUpdate.outputText) || !C7384Etj.areEqual(this.envelope, toolUpdate.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ ToolUpdate(String str, String str2, String str3, CanonicalEventEnvelope canonicalEventEnvelope, int i, C06H c06h) {
            this(str, str2, str3, (i & 8) != 0 ? null : canonicalEventEnvelope);
        }

        public static /* synthetic */ ToolUpdate copy$default(ToolUpdate toolUpdate, String str, String str2, String str3, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolUpdate.replyToMessageId;
            }
            if ((i & 2) != 0) {
                str2 = toolUpdate.toolCallId;
            }
            if ((i & 4) != 0) {
                str3 = toolUpdate.outputText;
            }
            if ((i & 8) != 0) {
                canonicalEventEnvelope = toolUpdate.envelope;
            }
            AnonymousClass003.A0x(str2, str3);
            return new ToolUpdate(str, str2, str3, canonicalEventEnvelope);
        }

        public final String component1() {
            return this.replyToMessageId;
        }

        public final String component2() {
            return this.toolCallId;
        }

        public final String component3() {
            return this.outputText;
        }

        public final CanonicalEventEnvelope component4() {
            return this.envelope;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getOutputText() {
            return this.outputText;
        }

        public final String getReplyToMessageId() {
            return this.replyToMessageId;
        }

        public final String getToolCallId() {
            return this.toolCallId;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.outputText, AnonymousClass005.A0I(this.toolCallId, AnonymousClass006.A0G(this.replyToMessageId) * 31)) + C3cH.A02(this.envelope);
        }

        public final ToolUpdate copy(String str, String str2, String str3, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass003.A0x(str2, str3);
            return new ToolUpdate(str, str2, str3, canonicalEventEnvelope);
        }

        public String toString() {
            return super.toString();
        }

        public ToolUpdate(String str, String str2, String str3, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass003.A0x(str2, str3);
            this.replyToMessageId = str;
            this.toolCallId = str2;
            this.outputText = str3;
            this.envelope = canonicalEventEnvelope;
        }
    }

    public final class WidgetStateUpdated extends HatchChatEvent {
        public static final int $stable = JSONState.$stable;
        public final CanonicalEventEnvelope envelope;
        public final String hostMessageId;
        public final String mutationId;
        public final JSONState state;
        public final String widgetId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof WidgetStateUpdated) {
                    WidgetStateUpdated widgetStateUpdated = (WidgetStateUpdated) obj;
                    if (!C7384Etj.areEqual(this.widgetId, widgetStateUpdated.widgetId) || !C7384Etj.areEqual(this.hostMessageId, widgetStateUpdated.hostMessageId) || !C7384Etj.areEqual(this.state, widgetStateUpdated.state) || !C7384Etj.areEqual(this.mutationId, widgetStateUpdated.mutationId) || !C7384Etj.areEqual(this.envelope, widgetStateUpdated.envelope)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ WidgetStateUpdated copy$default(WidgetStateUpdated widgetStateUpdated, String str, String str2, JSONState jSONState, String str3, CanonicalEventEnvelope canonicalEventEnvelope, int i, Object obj) {
            if ((i & 1) != 0) {
                str = widgetStateUpdated.widgetId;
            }
            if ((i & 2) != 0) {
                str2 = widgetStateUpdated.hostMessageId;
            }
            if ((i & 4) != 0) {
                jSONState = widgetStateUpdated.state;
            }
            if ((i & 8) != 0) {
                str3 = widgetStateUpdated.mutationId;
            }
            if ((i & 16) != 0) {
                canonicalEventEnvelope = widgetStateUpdated.envelope;
            }
            return widgetStateUpdated.copy(str, str2, jSONState, str3, canonicalEventEnvelope);
        }

        public final String component1() {
            return this.widgetId;
        }

        public final String component2() {
            return this.hostMessageId;
        }

        public final JSONState component3() {
            return this.state;
        }

        public final String component4() {
            return this.mutationId;
        }

        public final CanonicalEventEnvelope component5() {
            return this.envelope;
        }

        @Override // com.facebook.aura.model.HatchChatEvent
        public CanonicalEventEnvelope getEnvelope() {
            return this.envelope;
        }

        public final String getHostMessageId() {
            return this.hostMessageId;
        }

        public final String getMutationId() {
            return this.mutationId;
        }

        public final JSONState getState() {
            return this.state;
        }

        public final String getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0F(this.state, AnonymousClass005.A0I(this.hostMessageId, AnonymousClass001.A0G(this.widgetId))) + AnonymousClass006.A0G(this.mutationId)) * 31) + C3cH.A02(this.envelope);
        }

        public WidgetStateUpdated(String str, String str2, JSONState jSONState, String str3, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass005.A0x(str, str2, jSONState);
            this.widgetId = str;
            this.hostMessageId = str2;
            this.state = jSONState;
            this.mutationId = str3;
            this.envelope = canonicalEventEnvelope;
        }

        public final WidgetStateUpdated copy(String str, String str2, JSONState jSONState, String str3, CanonicalEventEnvelope canonicalEventEnvelope) {
            AnonymousClass005.A0x(str, str2, jSONState);
            return new WidgetStateUpdated(str, str2, jSONState, str3, canonicalEventEnvelope);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ WidgetStateUpdated(String str, String str2, JSONState jSONState, String str3, CanonicalEventEnvelope canonicalEventEnvelope, int i, C06H c06h) {
            this(str, str2, jSONState, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : canonicalEventEnvelope);
        }
    }

    public abstract CanonicalEventEnvelope getEnvelope();

    public boolean isUserLiveTranscript() {
        return false;
    }

    public /* synthetic */ HatchChatEvent(C06H c06h) {
    }

    public HatchChatEvent() {
    }
}
