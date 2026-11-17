package com.facebook.rsys.metaaivoicestate.gen;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class MetaAiVoiceState {
    public static G50<MetaAiVoiceState> CONVERTER = C8921Ftd.A00(42);
    public static long sMcfTypeId;
    public final MetaAiBotContent botContent;
    public final ClientInstruction clientInstruction;
    public final String envelopedOutput;
    public final LiveAiConnectionState liveAiConnectionState;
    public final String modelStage;
    public final PsiToolRequest psiToolRequest;
    public final S2sConnectionState s2sConnectionState;
    public final ArrayList<StandardizedResponseItem> standardizedResponse;
    public final int state;
    public final int stateSource;
    public final Long timestampMs;
    public final TurnMetaData turnMetaData;
    public final MetaAiUserContent userContent;

    public static native MetaAiVoiceState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MetaAiVoiceState) {
                MetaAiVoiceState metaAiVoiceState = (MetaAiVoiceState) obj;
                if (this.state == metaAiVoiceState.state) {
                    MetaAiBotContent metaAiBotContent = this.botContent;
                    MetaAiBotContent metaAiBotContent2 = metaAiVoiceState.botContent;
                    if (metaAiBotContent != null ? metaAiBotContent.equals(metaAiBotContent2) : metaAiBotContent2 == null) {
                        MetaAiUserContent metaAiUserContent = this.userContent;
                        MetaAiUserContent metaAiUserContent2 = metaAiVoiceState.userContent;
                        if (metaAiUserContent == null) {
                            if (metaAiUserContent2 != null) {
                                return false;
                            }
                        } else if (metaAiUserContent.equals(metaAiUserContent2)) {
                        }
                        TurnMetaData turnMetaData = this.turnMetaData;
                        TurnMetaData turnMetaData2 = metaAiVoiceState.turnMetaData;
                        if (turnMetaData == null) {
                            if (turnMetaData2 != null) {
                                return false;
                            }
                        } else if (turnMetaData.equals(turnMetaData2)) {
                        }
                        PsiToolRequest psiToolRequest = this.psiToolRequest;
                        PsiToolRequest psiToolRequest2 = metaAiVoiceState.psiToolRequest;
                        if (psiToolRequest == null) {
                            if (psiToolRequest2 != null) {
                                return false;
                            }
                        } else if (psiToolRequest.equals(psiToolRequest2)) {
                        }
                        ClientInstruction clientInstruction = this.clientInstruction;
                        ClientInstruction clientInstruction2 = metaAiVoiceState.clientInstruction;
                        if (clientInstruction == null) {
                            if (clientInstruction2 != null) {
                                return false;
                            }
                        } else if (clientInstruction.equals(clientInstruction2)) {
                        }
                        String str = this.envelopedOutput;
                        String str2 = metaAiVoiceState.envelopedOutput;
                        if (str == null) {
                            if (str2 != null) {
                                return false;
                            }
                        } else if (str.equals(str2)) {
                        }
                        String str3 = this.modelStage;
                        String str4 = metaAiVoiceState.modelStage;
                        if (str3 == null) {
                            if (str4 != null) {
                                return false;
                            }
                        } else if (str3.equals(str4)) {
                        }
                        Long l = this.timestampMs;
                        Long l2 = metaAiVoiceState.timestampMs;
                        if (l == null) {
                            if (l2 != null) {
                                return false;
                            }
                        } else if (l.equals(l2)) {
                        }
                        if (this.standardizedResponse.equals(metaAiVoiceState.standardizedResponse)) {
                            LiveAiConnectionState liveAiConnectionState = this.liveAiConnectionState;
                            LiveAiConnectionState liveAiConnectionState2 = metaAiVoiceState.liveAiConnectionState;
                            if (liveAiConnectionState == null) {
                                if (liveAiConnectionState2 != null) {
                                    return false;
                                }
                            } else if (liveAiConnectionState.equals(liveAiConnectionState2)) {
                            }
                            S2sConnectionState s2sConnectionState = this.s2sConnectionState;
                            S2sConnectionState s2sConnectionState2 = metaAiVoiceState.s2sConnectionState;
                            if (s2sConnectionState == null) {
                                if (s2sConnectionState2 != null) {
                                    return false;
                                }
                            } else if (s2sConnectionState.equals(s2sConnectionState2)) {
                            }
                            if (this.stateSource == metaAiVoiceState.stateSource) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.standardizedResponse, (((((((((((((((((527 + this.state) * 31) + AnonymousClass006.A0D(this.botContent)) * 31) + AnonymousClass006.A0D(this.userContent)) * 31) + AnonymousClass006.A0D(this.turnMetaData)) * 31) + AnonymousClass006.A0D(this.psiToolRequest)) * 31) + AnonymousClass006.A0D(this.clientInstruction)) * 31) + AnonymousClass006.A0G(this.envelopedOutput)) * 31) + AnonymousClass006.A0G(this.modelStage)) * 31) + AnonymousClass006.A0D(this.timestampMs)) * 31) + AnonymousClass006.A0D(this.liveAiConnectionState)) * 31) + C3cH.A02(this.s2sConnectionState)) * 31) + this.stateSource;
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("MetaAiVoiceState{state=");
        sbA0x.append(this.state);
        sbA0x.append(",botContent=");
        sbA0x.append(this.botContent);
        sbA0x.append(",userContent=");
        sbA0x.append(this.userContent);
        sbA0x.append(",turnMetaData=");
        sbA0x.append(this.turnMetaData);
        sbA0x.append(",psiToolRequest=");
        sbA0x.append(this.psiToolRequest);
        sbA0x.append(",clientInstruction=");
        sbA0x.append(this.clientInstruction);
        sbA0x.append(",envelopedOutput=");
        sbA0x.append(this.envelopedOutput);
        sbA0x.append(",modelStage=");
        sbA0x.append(this.modelStage);
        sbA0x.append(",timestampMs=");
        sbA0x.append(this.timestampMs);
        sbA0x.append(",standardizedResponse=");
        sbA0x.append(this.standardizedResponse);
        sbA0x.append(",liveAiConnectionState=");
        sbA0x.append(this.liveAiConnectionState);
        sbA0x.append(",s2sConnectionState=");
        sbA0x.append(this.s2sConnectionState);
        sbA0x.append(",stateSource=");
        return BV8.A0z(sbA0x, this.stateSource);
    }

    public MetaAiVoiceState(int i, MetaAiBotContent metaAiBotContent, MetaAiUserContent metaAiUserContent, TurnMetaData turnMetaData, PsiToolRequest psiToolRequest, ClientInstruction clientInstruction, String str, String str2, Long l, ArrayList<StandardizedResponseItem> arrayList, LiveAiConnectionState liveAiConnectionState, S2sConnectionState s2sConnectionState, int i2) {
        arrayList.getClass();
        this.state = i;
        this.botContent = metaAiBotContent;
        this.userContent = metaAiUserContent;
        this.turnMetaData = turnMetaData;
        this.psiToolRequest = psiToolRequest;
        this.clientInstruction = clientInstruction;
        this.envelopedOutput = str;
        this.modelStage = str2;
        this.timestampMs = l;
        this.standardizedResponse = arrayList;
        this.liveAiConnectionState = liveAiConnectionState;
        this.s2sConnectionState = s2sConnectionState;
        this.stateSource = i2;
    }
}
