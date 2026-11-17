package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.FGI;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.model.HatchContentBlock;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;

/* loaded from: classes3.dex */
public final class HatchContentBlockSerializer implements C9hr<HatchContentBlock> {
    public static final int $stable = 0;
    public static final String TYPE_SUB_AGENT = "sub_agent";
    public static final String TYPE_TEXT = "text";
    public static final String TYPE_THINKING = "thinking";
    public static final String TYPE_TOOL_CALL = "tool_call";
    public static final HatchContentBlockSerializer INSTANCE = new HatchContentBlockSerializer();
    public static final C9iZ descriptor = HatchContentBlockSerializer$Surrogate$$serializer.descriptor;

    @Serializable
    public final class Surrogate extends C06G {
        public static final Companion Companion = new Companion();
        public final HatchContentBlock.SubAgentBlock subAgent;
        public final HatchContentBlock.TextBlock text;
        public final HatchContentBlock.ThinkingBlock thinking;
        public final HatchContentBlock.ToolCallBlock toolCall;
        public final String type;

        public final class Companion {
            public final C9hr<Surrogate> serializer() {
                return HatchContentBlockSerializer$Surrogate$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public Surrogate(String str, HatchContentBlock.TextBlock textBlock, HatchContentBlock.ToolCallBlock toolCallBlock, HatchContentBlock.SubAgentBlock subAgentBlock, HatchContentBlock.ThinkingBlock thinkingBlock) {
            C7384Etj.A0Y(str, 0);
            this.type = str;
            this.text = textBlock;
            this.toolCall = toolCallBlock;
            this.subAgent = subAgentBlock;
            this.thinking = thinkingBlock;
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(Surrogate surrogate, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(surrogate.type, c9iZ, 0);
            boolean zAfR = c9j5.AfR();
            if (zAfR || surrogate.text != null) {
                c9j5.AAP(surrogate.text, HatchContentBlock$TextBlock$$serializer.INSTANCE, c9iZ, 1);
            }
            if (zAfR || surrogate.toolCall != null) {
                c9j5.AAP(surrogate.toolCall, HatchContentBlock$ToolCallBlock$$serializer.INSTANCE, c9iZ, 2);
            }
            if (zAfR || surrogate.subAgent != null) {
                c9j5.AAP(surrogate.subAgent, HatchContentBlock$SubAgentBlock$$serializer.INSTANCE, c9iZ, 3);
            }
            if (zAfR || surrogate.thinking != null) {
                c9j5.AAP(surrogate.thinking, HatchContentBlock$ThinkingBlock$$serializer.INSTANCE, c9iZ, 4);
            }
        }

        public final Surrogate copy(String str, HatchContentBlock.TextBlock textBlock, HatchContentBlock.ToolCallBlock toolCallBlock, HatchContentBlock.SubAgentBlock subAgentBlock, HatchContentBlock.ThinkingBlock thinkingBlock) {
            C7384Etj.A0Y(str, 0);
            return new Surrogate(str, textBlock, toolCallBlock, subAgentBlock, thinkingBlock);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Surrogate) {
                    Surrogate surrogate = (Surrogate) obj;
                    if (!C7384Etj.areEqual(this.type, surrogate.type) || !C7384Etj.areEqual(this.text, surrogate.text) || !C7384Etj.areEqual(this.toolCall, surrogate.toolCall) || !C7384Etj.areEqual(this.subAgent, surrogate.subAgent) || !C7384Etj.areEqual(this.thinking, surrogate.thinking)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, HatchContentBlock.TextBlock textBlock, HatchContentBlock.ToolCallBlock toolCallBlock, HatchContentBlock.SubAgentBlock subAgentBlock, HatchContentBlock.ThinkingBlock thinkingBlock, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.type;
            }
            if ((i & 2) != 0) {
                textBlock = surrogate.text;
            }
            if ((i & 4) != 0) {
                toolCallBlock = surrogate.toolCall;
            }
            if ((i & 8) != 0) {
                subAgentBlock = surrogate.subAgent;
            }
            if ((i & 16) != 0) {
                thinkingBlock = surrogate.thinking;
            }
            return surrogate.copy(str, textBlock, toolCallBlock, subAgentBlock, thinkingBlock);
        }

        public final String component1() {
            return this.type;
        }

        public final HatchContentBlock.TextBlock component2() {
            return this.text;
        }

        public final HatchContentBlock.ToolCallBlock component3() {
            return this.toolCall;
        }

        public final HatchContentBlock.SubAgentBlock component4() {
            return this.subAgent;
        }

        public final HatchContentBlock.ThinkingBlock component5() {
            return this.thinking;
        }

        public final HatchContentBlock.SubAgentBlock getSubAgent() {
            return this.subAgent;
        }

        public final HatchContentBlock.TextBlock getText() {
            return this.text;
        }

        public final HatchContentBlock.ThinkingBlock getThinking() {
            return this.thinking;
        }

        public final HatchContentBlock.ToolCallBlock getToolCall() {
            return this.toolCall;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return ((((((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0D(this.text)) * 31) + AnonymousClass006.A0D(this.toolCall)) * 31) + AnonymousClass006.A0D(this.subAgent)) * 31) + C3cH.A02(this.thinking);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Surrogate(String str, HatchContentBlock.TextBlock textBlock, HatchContentBlock.ToolCallBlock toolCallBlock, HatchContentBlock.SubAgentBlock subAgentBlock, HatchContentBlock.ThinkingBlock thinkingBlock, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : textBlock, (i & 4) != 0 ? null : toolCallBlock, (i & 8) != 0 ? null : subAgentBlock, (i & 16) != 0 ? null : thinkingBlock);
        }

        public /* synthetic */ Surrogate(int i, String str, HatchContentBlock.TextBlock textBlock, HatchContentBlock.ToolCallBlock toolCallBlock, HatchContentBlock.SubAgentBlock subAgentBlock, HatchContentBlock.ThinkingBlock thinkingBlock, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(HatchContentBlockSerializer$Surrogate$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.type = str;
            if ((i & 2) == 0) {
                this.text = null;
            } else {
                this.text = textBlock;
            }
            if ((i & 4) == 0) {
                this.toolCall = null;
            } else {
                this.toolCall = toolCallBlock;
            }
            if ((i & 8) == 0) {
                this.subAgent = null;
            } else {
                this.subAgent = subAgentBlock;
            }
            if ((i & 16) == 0) {
                this.thinking = null;
            } else {
                this.thinking = thinkingBlock;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C9jG
    public HatchContentBlock deserialize(InterfaceC07829iw interfaceC07829iw) {
        HatchContentBlock hatchContentBlock;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        Surrogate surrogate = (Surrogate) interfaceC07829iw.A8b(HatchContentBlockSerializer$Surrogate$$serializer.INSTANCE);
        String str = surrogate.type;
        switch (str.hashCode()) {
            case -416479067:
                if (str.equals(TYPE_TOOL_CALL)) {
                    hatchContentBlock = surrogate.toolCall;
                    break;
                }
                throw new SerializationException(FGI.A0M("Unknown content block type: ", str));
            case -59919290:
                if (str.equals(TYPE_SUB_AGENT)) {
                    hatchContentBlock = surrogate.subAgent;
                    break;
                }
                throw new SerializationException(FGI.A0M("Unknown content block type: ", str));
            case 3556653:
                if (str.equals("text")) {
                    hatchContentBlock = surrogate.text;
                    break;
                }
                throw new SerializationException(FGI.A0M("Unknown content block type: ", str));
            case 1224578480:
                if (str.equals(TYPE_THINKING)) {
                    hatchContentBlock = surrogate.thinking;
                    break;
                }
                throw new SerializationException(FGI.A0M("Unknown content block type: ", str));
            default:
                throw new SerializationException(FGI.A0M("Unknown content block type: ", str));
        }
        if (hatchContentBlock != null) {
            return hatchContentBlock;
        }
        throw new SerializationException(FGI.A0M("Unknown content block type: ", str));
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, HatchContentBlock hatchContentBlock) {
        Surrogate surrogate;
        AnonymousClass003.A0u(interfaceC07789is, hatchContentBlock);
        if (hatchContentBlock instanceof HatchContentBlock.TextBlock) {
            surrogate = new Surrogate("text", (HatchContentBlock.TextBlock) hatchContentBlock, null, null, null);
        } else if (hatchContentBlock instanceof HatchContentBlock.ToolCallBlock) {
            surrogate = new Surrogate(TYPE_TOOL_CALL, null, (HatchContentBlock.ToolCallBlock) hatchContentBlock, null, null);
        } else if (hatchContentBlock instanceof HatchContentBlock.SubAgentBlock) {
            surrogate = new Surrogate(TYPE_SUB_AGENT, null, null, (HatchContentBlock.SubAgentBlock) hatchContentBlock, null);
        } else {
            if (!(hatchContentBlock instanceof HatchContentBlock.ThinkingBlock)) {
                throw C3cG.A0q();
            }
            surrogate = new Surrogate(TYPE_THINKING, null, null, null, (HatchContentBlock.ThinkingBlock) hatchContentBlock);
        }
        interfaceC07789is.AAR(surrogate, HatchContentBlockSerializer$Surrogate$$serializer.INSTANCE);
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }
}
