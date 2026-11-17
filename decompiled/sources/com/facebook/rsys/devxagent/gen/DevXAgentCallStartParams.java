package com.facebook.rsys.devxagent.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class DevXAgentCallStartParams {
    public static G50<DevXAgentCallStartParams> CONVERTER = C8925Fth.A00(6);
    public static long sMcfTypeId;
    public final String actorId;
    public final String agentCallId;
    public final VoiceAdContext callAdContext;
    public final DevxCallAdsContext callAdsContext;
    public final String callTrigger;
    public final String callablePostId;
    public final CosmosOverrides cosmosOverrides;
    public final String cosmosTier;
    public final boolean creatorAiCall;
    public final String doorId;
    public final String genaiTier;
    public final String handshakeRequestJson;
    public final ArrayList<String> initialData;
    public final boolean isVideo;
    public final String jsonContext;
    public final DevxLeadAdsContext leadAdsContext;
    public final boolean liveAiCall;
    public final String liveBroadcastId;
    public final boolean mandateE2ee;
    public final boolean metaAiCall;
    public final String metaAiConfig;
    public final ArrayList<String> peersToRing;
    public final String roomUrl;
    public final String threadId;
    public final boolean ugcAiCall;
    public final boolean ugcAiScenesCall;
    public final String userid;
    public final boolean vifAiCall;

    public static native DevXAgentCallStartParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DevXAgentCallStartParams) {
                DevXAgentCallStartParams devXAgentCallStartParams = (DevXAgentCallStartParams) obj;
                if (this.agentCallId.equals(devXAgentCallStartParams.agentCallId)) {
                    String str = this.userid;
                    String str2 = devXAgentCallStartParams.userid;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        String str3 = this.roomUrl;
                        String str4 = devXAgentCallStartParams.roomUrl;
                        if (str3 == null) {
                            if (str4 != null) {
                                return false;
                            }
                        } else if (str3.equals(str4)) {
                        }
                        String str5 = this.doorId;
                        String str6 = devXAgentCallStartParams.doorId;
                        if (str5 == null) {
                            if (str6 != null) {
                                return false;
                            }
                        } else if (str5.equals(str6)) {
                        }
                        String str7 = this.threadId;
                        String str8 = devXAgentCallStartParams.threadId;
                        if (str7 == null) {
                            if (str8 != null) {
                                return false;
                            }
                        } else if (str7.equals(str8)) {
                        }
                        String str9 = this.callablePostId;
                        String str10 = devXAgentCallStartParams.callablePostId;
                        if (str9 == null) {
                            if (str10 != null) {
                                return false;
                            }
                        } else if (str9.equals(str10)) {
                        }
                        String str11 = this.liveBroadcastId;
                        String str12 = devXAgentCallStartParams.liveBroadcastId;
                        if (str11 == null) {
                            if (str12 != null) {
                                return false;
                            }
                        } else if (str11.equals(str12)) {
                        }
                        VoiceAdContext voiceAdContext = this.callAdContext;
                        VoiceAdContext voiceAdContext2 = devXAgentCallStartParams.callAdContext;
                        if (voiceAdContext == null) {
                            if (voiceAdContext2 != null) {
                                return false;
                            }
                        } else if (voiceAdContext.equals(voiceAdContext2)) {
                        }
                        DevxCallAdsContext devxCallAdsContext = this.callAdsContext;
                        DevxCallAdsContext devxCallAdsContext2 = devXAgentCallStartParams.callAdsContext;
                        if (devxCallAdsContext == null) {
                            if (devxCallAdsContext2 != null) {
                                return false;
                            }
                        } else if (devxCallAdsContext.equals(devxCallAdsContext2)) {
                        }
                        DevxLeadAdsContext devxLeadAdsContext = this.leadAdsContext;
                        DevxLeadAdsContext devxLeadAdsContext2 = devXAgentCallStartParams.leadAdsContext;
                        if (devxLeadAdsContext == null) {
                            if (devxLeadAdsContext2 != null) {
                                return false;
                            }
                        } else if (devxLeadAdsContext.equals(devxLeadAdsContext2)) {
                        }
                        String str13 = this.genaiTier;
                        String str14 = devXAgentCallStartParams.genaiTier;
                        if (str13 == null) {
                            if (str14 != null) {
                                return false;
                            }
                        } else if (str13.equals(str14)) {
                        }
                        ArrayList<String> arrayList = this.peersToRing;
                        ArrayList<String> arrayList2 = devXAgentCallStartParams.peersToRing;
                        if (arrayList == null) {
                            if (arrayList2 != null) {
                                return false;
                            }
                        } else if (arrayList.equals(arrayList2)) {
                        }
                        String str15 = this.actorId;
                        String str16 = devXAgentCallStartParams.actorId;
                        if (str15 == null) {
                            if (str16 != null) {
                                return false;
                            }
                        } else if (str15.equals(str16)) {
                        }
                        if (this.isVideo == devXAgentCallStartParams.isVideo && this.mandateE2ee == devXAgentCallStartParams.mandateE2ee && this.metaAiCall == devXAgentCallStartParams.metaAiCall && this.liveAiCall == devXAgentCallStartParams.liveAiCall && this.creatorAiCall == devXAgentCallStartParams.creatorAiCall && this.ugcAiCall == devXAgentCallStartParams.ugcAiCall && this.vifAiCall == devXAgentCallStartParams.vifAiCall && this.ugcAiScenesCall == devXAgentCallStartParams.ugcAiScenesCall) {
                            ArrayList<String> arrayList3 = this.initialData;
                            ArrayList<String> arrayList4 = devXAgentCallStartParams.initialData;
                            if (arrayList3 == null) {
                                if (arrayList4 != null) {
                                    return false;
                                }
                            } else if (arrayList3.equals(arrayList4)) {
                            }
                            String str17 = this.jsonContext;
                            String str18 = devXAgentCallStartParams.jsonContext;
                            if (str17 == null) {
                                if (str18 != null) {
                                    return false;
                                }
                            } else if (str17.equals(str18)) {
                            }
                            String str19 = this.metaAiConfig;
                            String str20 = devXAgentCallStartParams.metaAiConfig;
                            if (str19 == null) {
                                if (str20 != null) {
                                    return false;
                                }
                            } else if (str19.equals(str20)) {
                            }
                            String str21 = this.callTrigger;
                            String str22 = devXAgentCallStartParams.callTrigger;
                            if (str21 == null) {
                                if (str22 != null) {
                                    return false;
                                }
                            } else if (str21.equals(str22)) {
                            }
                            CosmosOverrides cosmosOverrides = this.cosmosOverrides;
                            CosmosOverrides cosmosOverrides2 = devXAgentCallStartParams.cosmosOverrides;
                            if (cosmosOverrides == null) {
                                if (cosmosOverrides2 != null) {
                                    return false;
                                }
                            } else if (cosmosOverrides.equals(cosmosOverrides2)) {
                            }
                            String str23 = this.handshakeRequestJson;
                            String str24 = devXAgentCallStartParams.handshakeRequestJson;
                            if (str23 == null) {
                                if (str24 != null) {
                                    return false;
                                }
                            } else if (str23.equals(str24)) {
                            }
                            String str25 = this.cosmosTier;
                            String str26 = devXAgentCallStartParams.cosmosTier;
                            if (str25 == null) {
                                if (str26 != null) {
                                    return false;
                                }
                            } else if (str25.equals(str26)) {
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
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((BV8.A0B(this.agentCallId) + AnonymousClass006.A0G(this.userid)) * 31) + AnonymousClass006.A0G(this.roomUrl)) * 31) + AnonymousClass006.A0G(this.doorId)) * 31) + AnonymousClass006.A0G(this.threadId)) * 31) + AnonymousClass006.A0G(this.callablePostId)) * 31) + AnonymousClass006.A0G(this.liveBroadcastId)) * 31) + AnonymousClass006.A0D(this.callAdContext)) * 31) + AnonymousClass006.A0D(this.callAdsContext)) * 31) + AnonymousClass006.A0D(this.leadAdsContext)) * 31) + AnonymousClass006.A0G(this.genaiTier)) * 31) + AnonymousClass006.A0D(this.peersToRing)) * 31) + AnonymousClass006.A0G(this.actorId)) * 31) + (this.isVideo ? 1 : 0)) * 31) + (this.mandateE2ee ? 1 : 0)) * 31) + (this.metaAiCall ? 1 : 0)) * 31) + (this.liveAiCall ? 1 : 0)) * 31) + (this.creatorAiCall ? 1 : 0)) * 31) + (this.ugcAiCall ? 1 : 0)) * 31) + (this.vifAiCall ? 1 : 0)) * 31) + (this.ugcAiScenesCall ? 1 : 0)) * 31) + AnonymousClass006.A0D(this.initialData)) * 31) + AnonymousClass006.A0G(this.jsonContext)) * 31) + AnonymousClass006.A0G(this.metaAiConfig)) * 31) + AnonymousClass006.A0G(this.callTrigger)) * 31) + AnonymousClass006.A0D(this.cosmosOverrides)) * 31) + AnonymousClass006.A0G(this.handshakeRequestJson)) * 31) + AnonymousClass005.A0H(this.cosmosTier);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DevXAgentCallStartParams{agentCallId=");
        sbA0x.append(this.agentCallId);
        sbA0x.append(",userid=");
        sbA0x.append(this.userid);
        sbA0x.append(",roomUrl=");
        sbA0x.append(this.roomUrl);
        sbA0x.append(",doorId=");
        sbA0x.append(this.doorId);
        sbA0x.append(",threadId=");
        sbA0x.append(this.threadId);
        sbA0x.append(",callablePostId=");
        sbA0x.append(this.callablePostId);
        sbA0x.append(",liveBroadcastId=");
        sbA0x.append(this.liveBroadcastId);
        sbA0x.append(",callAdContext=");
        sbA0x.append(this.callAdContext);
        sbA0x.append(",callAdsContext=");
        sbA0x.append(this.callAdsContext);
        sbA0x.append(",leadAdsContext=");
        sbA0x.append(this.leadAdsContext);
        sbA0x.append(",genaiTier=");
        sbA0x.append(this.genaiTier);
        sbA0x.append(",peersToRing=");
        sbA0x.append(this.peersToRing);
        sbA0x.append(",actorId=");
        sbA0x.append(this.actorId);
        sbA0x.append(",isVideo=");
        sbA0x.append(this.isVideo);
        sbA0x.append(",mandateE2ee=");
        sbA0x.append(this.mandateE2ee);
        sbA0x.append(",metaAiCall=");
        sbA0x.append(this.metaAiCall);
        sbA0x.append(",liveAiCall=");
        sbA0x.append(this.liveAiCall);
        sbA0x.append(",creatorAiCall=");
        sbA0x.append(this.creatorAiCall);
        sbA0x.append(",ugcAiCall=");
        sbA0x.append(this.ugcAiCall);
        sbA0x.append(",vifAiCall=");
        sbA0x.append(this.vifAiCall);
        sbA0x.append(",ugcAiScenesCall=");
        sbA0x.append(this.ugcAiScenesCall);
        sbA0x.append(",initialData=");
        sbA0x.append(this.initialData);
        sbA0x.append(",jsonContext=");
        sbA0x.append(this.jsonContext);
        sbA0x.append(",metaAiConfig=");
        sbA0x.append(this.metaAiConfig);
        sbA0x.append(",callTrigger=");
        sbA0x.append(this.callTrigger);
        sbA0x.append(",cosmosOverrides=");
        sbA0x.append(this.cosmosOverrides);
        sbA0x.append(",handshakeRequestJson=");
        sbA0x.append(this.handshakeRequestJson);
        sbA0x.append(",cosmosTier=");
        return AbstractC7610F5x.A0w(this.cosmosTier, sbA0x);
    }

    public DevXAgentCallStartParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, VoiceAdContext voiceAdContext, DevxCallAdsContext devxCallAdsContext, DevxLeadAdsContext devxLeadAdsContext, String str8, ArrayList<String> arrayList, String str9, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, ArrayList<String> arrayList2, String str10, String str11, String str12, CosmosOverrides cosmosOverrides, String str13, String str14) {
        str.getClass();
        this.agentCallId = str;
        this.userid = str2;
        this.roomUrl = str3;
        this.doorId = str4;
        this.threadId = str5;
        this.callablePostId = str6;
        this.liveBroadcastId = str7;
        this.callAdContext = voiceAdContext;
        this.callAdsContext = devxCallAdsContext;
        this.leadAdsContext = devxLeadAdsContext;
        this.genaiTier = str8;
        this.peersToRing = arrayList;
        this.actorId = str9;
        this.isVideo = z;
        this.mandateE2ee = z2;
        this.metaAiCall = z3;
        this.liveAiCall = z4;
        this.creatorAiCall = z5;
        this.ugcAiCall = z6;
        this.vifAiCall = z7;
        this.ugcAiScenesCall = z8;
        this.initialData = arrayList2;
        this.jsonContext = str10;
        this.metaAiConfig = str11;
        this.callTrigger = str12;
        this.cosmosOverrides = cosmosOverrides;
        this.handshakeRequestJson = str13;
        this.cosmosTier = str14;
    }
}
