package com.facebook.aura.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60R;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable(with = HatchContentBlockSerializer.class)
/* loaded from: classes3.dex */
public abstract class HatchContentBlock {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class Companion {
        public final C9hr<HatchContentBlock> serializer() {
            return HatchContentBlockSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Serializable
    public final class SubAgentBlock extends HatchContentBlock {
        public static final int $stable = 8;
        public final String agentId;
        public final String blockId;
        public final Long completedAtMs;
        public final List<HatchContentBlock> content;
        public final String promptPreview;
        public final long startedAtMs;
        public final String status;
        public final String summary;
        public final String toolId;
        public static final Companion Companion = new Companion();
        public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, HatchContentBlock$SubAgentBlock$Companion$$childSerializers$1.INSTANCE), null, null};

        public final class Companion {
            public final C9hr<SubAgentBlock> serializer() {
                return HatchContentBlock$SubAgentBlock$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public SubAgentBlock(String str, String str2, String str3, String str4, String str5, String str6, List<HatchContentBlock> list, long j, Long l) {
            AnonymousClass005.A11(str2, str3, str4, 1);
            this.blockId = str;
            this.agentId = str2;
            this.toolId = str3;
            this.status = str4;
            this.summary = str5;
            this.promptPreview = str6;
            this.content = list;
            this.startedAtMs = j;
            this.completedAtMs = l;
        }

        public final SubAgentBlock copy(String str, String str2, String str3, String str4, String str5, String str6, List<HatchContentBlock> list, long j, Long l) {
            AnonymousClass005.A11(str2, str3, str4, 1);
            return new SubAgentBlock(str, str2, str3, str4, str5, str6, list, j, l);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SubAgentBlock) {
                    SubAgentBlock subAgentBlock = (SubAgentBlock) obj;
                    if (!C7384Etj.areEqual(this.blockId, subAgentBlock.blockId) || !C7384Etj.areEqual(this.agentId, subAgentBlock.agentId) || !C7384Etj.areEqual(this.toolId, subAgentBlock.toolId) || !C7384Etj.areEqual(this.status, subAgentBlock.status) || !C7384Etj.areEqual(this.summary, subAgentBlock.summary) || !C7384Etj.areEqual(this.promptPreview, subAgentBlock.promptPreview) || !C7384Etj.areEqual(this.content, subAgentBlock.content) || this.startedAtMs != subAgentBlock.startedAtMs || !C7384Etj.areEqual(this.completedAtMs, subAgentBlock.completedAtMs)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SubAgentBlock copy$default(SubAgentBlock subAgentBlock, String str, String str2, String str3, String str4, String str5, String str6, List list, long j, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subAgentBlock.blockId;
            }
            if ((i & 2) != 0) {
                str2 = subAgentBlock.agentId;
            }
            if ((i & 4) != 0) {
                str3 = subAgentBlock.toolId;
            }
            if ((i & 8) != 0) {
                str4 = subAgentBlock.status;
            }
            if ((i & 16) != 0) {
                str5 = subAgentBlock.summary;
            }
            if ((i & 32) != 0) {
                str6 = subAgentBlock.promptPreview;
            }
            if ((i & 64) != 0) {
                list = subAgentBlock.content;
            }
            if ((i & 128) != 0) {
                j = subAgentBlock.startedAtMs;
            }
            if ((i & 256) != 0) {
                l = subAgentBlock.completedAtMs;
            }
            return subAgentBlock.copy(str, str2, str3, str4, str5, str6, list, j, l);
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(SubAgentBlock subAgentBlock, C9j5 c9j5, C9iZ c9iZ) {
            F0C<C9hr<Object>>[] f0cArr = $childSerializers;
            C07779iq c07779iq = C07779iq.A01;
            c9j5.AAP(subAgentBlock.blockId, c07779iq, c9iZ, 0);
            c9j5.AAV(subAgentBlock.agentId, c9iZ, 1);
            c9j5.AAV(subAgentBlock.toolId, c9iZ, 2);
            c9j5.AAV(subAgentBlock.status, c9iZ, 3);
            c9j5.AAP(subAgentBlock.summary, c07779iq, c9iZ, 4);
            c9j5.AAP(subAgentBlock.promptPreview, c07779iq, c9iZ, 5);
            c9j5.AAP(subAgentBlock.content, C3cH.A15(f0cArr, 6), c9iZ, 6);
            c9j5.AAN(c9iZ, 7, subAgentBlock.startedAtMs);
            c9j5.AAP(subAgentBlock.completedAtMs, C9j1.A00, c9iZ, 8);
        }

        public final String component1() {
            return this.blockId;
        }

        public final String component2() {
            return this.agentId;
        }

        public final String component3() {
            return this.toolId;
        }

        public final String component4() {
            return this.status;
        }

        public final String component5() {
            return this.summary;
        }

        public final String component6() {
            return this.promptPreview;
        }

        public final List<HatchContentBlock> component7() {
            return this.content;
        }

        public final long component8() {
            return this.startedAtMs;
        }

        public final Long component9() {
            return this.completedAtMs;
        }

        public final String getAgentId() {
            return this.agentId;
        }

        public final String getBlockId() {
            return this.blockId;
        }

        public final Long getCompletedAtMs() {
            return this.completedAtMs;
        }

        public final List<HatchContentBlock> getContent() {
            return this.content;
        }

        public final String getPromptPreview() {
            return this.promptPreview;
        }

        public final long getStartedAtMs() {
            return this.startedAtMs;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getSummary() {
            return this.summary;
        }

        public final String getToolId() {
            return this.toolId;
        }

        public int hashCode() {
            return C60R.A00(this.startedAtMs, (((((AnonymousClass005.A0I(this.status, AnonymousClass005.A0I(this.toolId, AnonymousClass005.A0I(this.agentId, AnonymousClass006.A0G(this.blockId) * 31))) + AnonymousClass006.A0G(this.summary)) * 31) + AnonymousClass006.A0G(this.promptPreview)) * 31) + AnonymousClass006.A0D(this.content)) * 31) + C3cH.A02(this.completedAtMs);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ SubAgentBlock(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, long j, Long l, C2hx c2hx) {
            if (511 != (i & 511)) {
                C9iI.A00(HatchContentBlock$SubAgentBlock$$serializer.descriptor, i, 511);
                throw F60.createAndThrow();
            }
            this.blockId = str;
            this.agentId = str2;
            this.toolId = str3;
            this.status = str4;
            this.summary = str5;
            this.promptPreview = str6;
            this.content = list;
            this.startedAtMs = j;
            this.completedAtMs = l;
        }
    }

    @Serializable
    public final class TextBlock extends HatchContentBlock {
        public static final int $stable = 0;
        public final String id;
        public final HatchBlockStatus status;
        public final String text;
        public static final Companion Companion = new Companion();
        public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, HatchContentBlock$TextBlock$Companion$$childSerializers$1.INSTANCE);

        public final class Companion {
            public final C9hr<TextBlock> serializer() {
                return HatchContentBlock$TextBlock$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof TextBlock) {
                    TextBlock textBlock = (TextBlock) obj;
                    if (!C7384Etj.areEqual(this.id, textBlock.id) || !C7384Etj.areEqual(this.text, textBlock.text) || this.status != textBlock.status) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ TextBlock copy$default(TextBlock textBlock, String str, String str2, HatchBlockStatus hatchBlockStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textBlock.id;
            }
            if ((i & 2) != 0) {
                str2 = textBlock.text;
            }
            if ((i & 4) != 0) {
                hatchBlockStatus = textBlock.status;
            }
            return textBlock.copy(str, str2, hatchBlockStatus);
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(TextBlock textBlock, C9j5 c9j5, C9iZ c9iZ) {
            F0C<C9hr<Object>>[] f0cArr = $childSerializers;
            c9j5.AAP(textBlock.id, C07779iq.A01, c9iZ, 0);
            c9j5.AAV(textBlock.text, c9iZ, 1);
            c9j5.AAQ(textBlock.status, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.text;
        }

        public final HatchBlockStatus component3() {
            return this.status;
        }

        public final String getId() {
            return this.id;
        }

        public final HatchBlockStatus getStatus() {
            return this.status;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.status, AnonymousClass005.A0I(this.text, AnonymousClass006.A0G(this.id) * 31));
        }

        public TextBlock(String str, String str2, HatchBlockStatus hatchBlockStatus) {
            AnonymousClass003.A0x(str2, hatchBlockStatus);
            this.id = str;
            this.text = str2;
            this.status = hatchBlockStatus;
        }

        public final TextBlock copy(String str, String str2, HatchBlockStatus hatchBlockStatus) {
            AnonymousClass003.A0x(str2, hatchBlockStatus);
            return new TextBlock(str, str2, hatchBlockStatus);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ TextBlock(int i, String str, String str2, HatchBlockStatus hatchBlockStatus, C2hx c2hx) {
            if (7 != (i & 7)) {
                C9iI.A00(HatchContentBlock$TextBlock$$serializer.descriptor, i, 7);
                throw F60.createAndThrow();
            }
            this.id = str;
            this.text = str2;
            this.status = hatchBlockStatus;
        }
    }

    @Serializable
    public final class ThinkingBlock extends HatchContentBlock {
        public static final int $stable = 0;
        public final String id;
        public final HatchBlockStatus status;
        public final String text;
        public static final Companion Companion = new Companion();
        public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, HatchContentBlock$ThinkingBlock$Companion$$childSerializers$1.INSTANCE);

        public final class Companion {
            public final C9hr<ThinkingBlock> serializer() {
                return HatchContentBlock$ThinkingBlock$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ThinkingBlock) {
                    ThinkingBlock thinkingBlock = (ThinkingBlock) obj;
                    if (!C7384Etj.areEqual(this.id, thinkingBlock.id) || !C7384Etj.areEqual(this.text, thinkingBlock.text) || this.status != thinkingBlock.status) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ThinkingBlock copy$default(ThinkingBlock thinkingBlock, String str, String str2, HatchBlockStatus hatchBlockStatus, int i, Object obj) {
            if ((i & 1) != 0) {
                str = thinkingBlock.id;
            }
            if ((i & 2) != 0) {
                str2 = thinkingBlock.text;
            }
            if ((i & 4) != 0) {
                hatchBlockStatus = thinkingBlock.status;
            }
            return thinkingBlock.copy(str, str2, hatchBlockStatus);
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ThinkingBlock thinkingBlock, C9j5 c9j5, C9iZ c9iZ) {
            F0C<C9hr<Object>>[] f0cArr = $childSerializers;
            c9j5.AAP(thinkingBlock.id, C07779iq.A01, c9iZ, 0);
            c9j5.AAV(thinkingBlock.text, c9iZ, 1);
            c9j5.AAQ(thinkingBlock.status, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.text;
        }

        public final HatchBlockStatus component3() {
            return this.status;
        }

        public final String getId() {
            return this.id;
        }

        public final HatchBlockStatus getStatus() {
            return this.status;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.status, AnonymousClass005.A0I(this.text, AnonymousClass006.A0G(this.id) * 31));
        }

        public ThinkingBlock(String str, String str2, HatchBlockStatus hatchBlockStatus) {
            AnonymousClass003.A0x(str2, hatchBlockStatus);
            this.id = str;
            this.text = str2;
            this.status = hatchBlockStatus;
        }

        public final ThinkingBlock copy(String str, String str2, HatchBlockStatus hatchBlockStatus) {
            AnonymousClass003.A0x(str2, hatchBlockStatus);
            return new ThinkingBlock(str, str2, hatchBlockStatus);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ThinkingBlock(int i, String str, String str2, HatchBlockStatus hatchBlockStatus, C2hx c2hx) {
            if (7 != (i & 7)) {
                C9iI.A00(HatchContentBlock$ThinkingBlock$$serializer.descriptor, i, 7);
                throw F60.createAndThrow();
            }
            this.id = str;
            this.text = str2;
            this.status = hatchBlockStatus;
        }
    }

    @Serializable
    public final class ToolCallBlock extends HatchContentBlock {
        public static final int $stable = 8;
        public final Long completedAtMs;
        public final String id;
        public final String name;
        public final HatchToolCallRequest request;
        public final HatchToolCallResult result;
        public final long startedAtMs;
        public final HatchToolCallStatus status;
        public final String toolType;
        public static final Companion Companion = new Companion();
        public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, HatchContentBlock$ToolCallBlock$Companion$$childSerializers$1.INSTANCE), null, null};

        public final class Companion {
            public final C9hr<ToolCallBlock> serializer() {
                return HatchContentBlock$ToolCallBlock$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ToolCallBlock) {
                    ToolCallBlock toolCallBlock = (ToolCallBlock) obj;
                    if (!C7384Etj.areEqual(this.id, toolCallBlock.id) || !C7384Etj.areEqual(this.name, toolCallBlock.name) || !C7384Etj.areEqual(this.toolType, toolCallBlock.toolType) || !C7384Etj.areEqual(this.request, toolCallBlock.request) || !C7384Etj.areEqual(this.result, toolCallBlock.result) || this.status != toolCallBlock.status || this.startedAtMs != toolCallBlock.startedAtMs || !C7384Etj.areEqual(this.completedAtMs, toolCallBlock.completedAtMs)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ToolCallBlock copy$default(ToolCallBlock toolCallBlock, String str, String str2, String str3, HatchToolCallRequest hatchToolCallRequest, HatchToolCallResult hatchToolCallResult, HatchToolCallStatus hatchToolCallStatus, long j, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolCallBlock.id;
            }
            if ((i & 2) != 0) {
                str2 = toolCallBlock.name;
            }
            if ((i & 4) != 0) {
                str3 = toolCallBlock.toolType;
            }
            if ((i & 8) != 0) {
                hatchToolCallRequest = toolCallBlock.request;
            }
            if ((i & 16) != 0) {
                hatchToolCallResult = toolCallBlock.result;
            }
            if ((i & 32) != 0) {
                hatchToolCallStatus = toolCallBlock.status;
            }
            if ((i & 64) != 0) {
                j = toolCallBlock.startedAtMs;
            }
            if ((i & 128) != 0) {
                l = toolCallBlock.completedAtMs;
            }
            return toolCallBlock.copy(str, str2, str3, hatchToolCallRequest, hatchToolCallResult, hatchToolCallStatus, j, l);
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(ToolCallBlock toolCallBlock, C9j5 c9j5, C9iZ c9iZ) {
            F0C<C9hr<Object>>[] f0cArr = $childSerializers;
            c9j5.AAV(toolCallBlock.id, c9iZ, 0);
            c9j5.AAV(toolCallBlock.name, c9iZ, 1);
            c9j5.AAV(toolCallBlock.toolType, c9iZ, 2);
            c9j5.AAQ(toolCallBlock.request, HatchToolCallRequest$$serializer.INSTANCE, c9iZ, 3);
            c9j5.AAP(toolCallBlock.result, HatchToolCallResult$$serializer.INSTANCE, c9iZ, 4);
            c9j5.AAQ(toolCallBlock.status, C3cH.A15(f0cArr, 5), c9iZ, 5);
            c9j5.AAN(c9iZ, 6, toolCallBlock.startedAtMs);
            c9j5.AAP(toolCallBlock.completedAtMs, C9j1.A00, c9iZ, 7);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.name;
        }

        public final String component3() {
            return this.toolType;
        }

        public final HatchToolCallRequest component4() {
            return this.request;
        }

        public final HatchToolCallResult component5() {
            return this.result;
        }

        public final HatchToolCallStatus component6() {
            return this.status;
        }

        public final long component7() {
            return this.startedAtMs;
        }

        public final Long component8() {
            return this.completedAtMs;
        }

        public final Long getCompletedAtMs() {
            return this.completedAtMs;
        }

        public final String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final HatchToolCallRequest getRequest() {
            return this.request;
        }

        public final HatchToolCallResult getResult() {
            return this.result;
        }

        public final long getStartedAtMs() {
            return this.startedAtMs;
        }

        public final HatchToolCallStatus getStatus() {
            return this.status;
        }

        public final String getToolType() {
            return this.toolType;
        }

        public int hashCode() {
            return C60R.A00(this.startedAtMs, AnonymousClass005.A0F(this.status, (AnonymousClass005.A0F(this.request, AnonymousClass005.A0I(this.toolType, AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id)))) + AnonymousClass006.A0D(this.result)) * 31)) + C3cH.A02(this.completedAtMs);
        }

        public ToolCallBlock(String str, String str2, String str3, HatchToolCallRequest hatchToolCallRequest, HatchToolCallResult hatchToolCallResult, HatchToolCallStatus hatchToolCallStatus, long j, Long l) {
            AnonymousClass005.A14(str, str2, str3, hatchToolCallRequest);
            C7384Etj.A0Y(hatchToolCallStatus, 5);
            this.id = str;
            this.name = str2;
            this.toolType = str3;
            this.request = hatchToolCallRequest;
            this.result = hatchToolCallResult;
            this.status = hatchToolCallStatus;
            this.startedAtMs = j;
            this.completedAtMs = l;
        }

        public final ToolCallBlock copy(String str, String str2, String str3, HatchToolCallRequest hatchToolCallRequest, HatchToolCallResult hatchToolCallResult, HatchToolCallStatus hatchToolCallStatus, long j, Long l) {
            AnonymousClass005.A14(str, str2, str3, hatchToolCallRequest);
            C7384Etj.A0Y(hatchToolCallStatus, 5);
            return new ToolCallBlock(str, str2, str3, hatchToolCallRequest, hatchToolCallResult, hatchToolCallStatus, j, l);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ToolCallBlock(int i, String str, String str2, String str3, HatchToolCallRequest hatchToolCallRequest, HatchToolCallResult hatchToolCallResult, HatchToolCallStatus hatchToolCallStatus, long j, Long l, C2hx c2hx) {
            if (255 != (i & 255)) {
                C9iI.A00(HatchContentBlock$ToolCallBlock$$serializer.descriptor, i, 255);
                throw F60.createAndThrow();
            }
            this.id = str;
            this.name = str2;
            this.toolType = str3;
            this.request = hatchToolCallRequest;
            this.result = hatchToolCallResult;
            this.status = hatchToolCallStatus;
            this.startedAtMs = j;
            this.completedAtMs = l;
        }
    }

    public /* synthetic */ HatchContentBlock(C06H c06h) {
    }

    public HatchContentBlock() {
    }
}
