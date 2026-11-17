package com.facebook.rsys.roomtypecalling.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes6.dex */
public class CallingAppContext {
    public static G50<CallingAppContext> CONVERTER = C8922Fte.A00(15);
    public static long sMcfTypeId;
    public final ArrayList<String> botIds;
    public final String callKey;
    public final String callablePostId;
    public final HashSet<String> callingTags;
    public final Integer genaiUseCase;
    public final String horizonVoipZoneId;
    public final String horizonWorldId;
    public final boolean isMetaAiCall;
    public final String linkUrl;
    public final String liveBroadcastId;
    public final String phoneNumber;
    public final String pstnUserId;
    public final String rtcDoorId;
    public final String serverInfoData;
    public final String threadID;
    public final int threadType;

    public static native CallingAppContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallingAppContext) {
                CallingAppContext callingAppContext = (CallingAppContext) obj;
                String str = this.threadID;
                String str2 = callingAppContext.threadID;
                if (str != null ? str.equals(str2) : str2 == null) {
                    if (this.threadType == callingAppContext.threadType) {
                        HashSet<String> hashSet = this.callingTags;
                        HashSet<String> hashSet2 = callingAppContext.callingTags;
                        if (hashSet == null) {
                            if (hashSet2 != null) {
                                return false;
                            }
                        } else if (hashSet.equals(hashSet2)) {
                        }
                        String str3 = this.serverInfoData;
                        String str4 = callingAppContext.serverInfoData;
                        if (str3 == null) {
                            if (str4 != null) {
                                return false;
                            }
                        } else if (str3.equals(str4)) {
                        }
                        String str5 = this.linkUrl;
                        String str6 = callingAppContext.linkUrl;
                        if (str5 == null) {
                            if (str6 != null) {
                                return false;
                            }
                        } else if (str5.equals(str6)) {
                        }
                        String str7 = this.liveBroadcastId;
                        String str8 = callingAppContext.liveBroadcastId;
                        if (str7 == null) {
                            if (str8 != null) {
                                return false;
                            }
                        } else if (str7.equals(str8)) {
                        }
                        String str9 = this.callablePostId;
                        String str10 = callingAppContext.callablePostId;
                        if (str9 == null) {
                            if (str10 != null) {
                                return false;
                            }
                        } else if (str9.equals(str10)) {
                        }
                        String str11 = this.rtcDoorId;
                        String str12 = callingAppContext.rtcDoorId;
                        if (str11 == null) {
                            if (str12 != null) {
                                return false;
                            }
                        } else if (str11.equals(str12)) {
                        }
                        String str13 = this.phoneNumber;
                        String str14 = callingAppContext.phoneNumber;
                        if (str13 == null) {
                            if (str14 != null) {
                                return false;
                            }
                        } else if (str13.equals(str14)) {
                        }
                        if (this.isMetaAiCall == callingAppContext.isMetaAiCall) {
                            String str15 = this.pstnUserId;
                            String str16 = callingAppContext.pstnUserId;
                            if (str15 == null) {
                                if (str16 != null) {
                                    return false;
                                }
                            } else if (str15.equals(str16)) {
                            }
                            String str17 = this.horizonWorldId;
                            String str18 = callingAppContext.horizonWorldId;
                            if (str17 == null) {
                                if (str18 != null) {
                                    return false;
                                }
                            } else if (str17.equals(str18)) {
                            }
                            String str19 = this.horizonVoipZoneId;
                            String str20 = callingAppContext.horizonVoipZoneId;
                            if (str19 == null) {
                                if (str20 != null) {
                                    return false;
                                }
                            } else if (str19.equals(str20)) {
                            }
                            String str21 = this.callKey;
                            String str22 = callingAppContext.callKey;
                            if (str21 == null) {
                                if (str22 != null) {
                                    return false;
                                }
                            } else if (str21.equals(str22)) {
                            }
                            Integer num = this.genaiUseCase;
                            Integer num2 = callingAppContext.genaiUseCase;
                            if (num == null) {
                                if (num2 != null) {
                                    return false;
                                }
                            } else if (num.equals(num2)) {
                            }
                            ArrayList<String> arrayList = this.botIds;
                            ArrayList<String> arrayList2 = callingAppContext.botIds;
                            if (arrayList == null) {
                                if (arrayList2 != null) {
                                    return false;
                                }
                            } else if (arrayList.equals(arrayList2)) {
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
        return ((((((((((((((((((((((((((((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.threadID)) + this.threadType) * 31) + AnonymousClass006.A0D(this.callingTags)) * 31) + AnonymousClass006.A0G(this.serverInfoData)) * 31) + AnonymousClass006.A0G(this.linkUrl)) * 31) + AnonymousClass006.A0G(this.liveBroadcastId)) * 31) + AnonymousClass006.A0G(this.callablePostId)) * 31) + AnonymousClass006.A0G(this.rtcDoorId)) * 31) + AnonymousClass006.A0G(this.phoneNumber)) * 31) + (this.isMetaAiCall ? 1 : 0)) * 31) + AnonymousClass006.A0G(this.pstnUserId)) * 31) + AnonymousClass006.A0G(this.horizonWorldId)) * 31) + AnonymousClass006.A0G(this.horizonVoipZoneId)) * 31) + AnonymousClass006.A0G(this.callKey)) * 31) + AnonymousClass006.A0D(this.genaiUseCase)) * 31) + C3cH.A02(this.botIds);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CallingAppContext{threadID=");
        sbA0x.append(this.threadID);
        sbA0x.append(",threadType=");
        sbA0x.append(this.threadType);
        sbA0x.append(",callingTags=");
        sbA0x.append(this.callingTags);
        sbA0x.append(",serverInfoData=");
        sbA0x.append(this.serverInfoData);
        sbA0x.append(",linkUrl=");
        sbA0x.append(this.linkUrl);
        sbA0x.append(",liveBroadcastId=");
        sbA0x.append(this.liveBroadcastId);
        sbA0x.append(",callablePostId=");
        sbA0x.append(this.callablePostId);
        sbA0x.append(",rtcDoorId=");
        sbA0x.append(this.rtcDoorId);
        sbA0x.append(",phoneNumber=");
        sbA0x.append(this.phoneNumber);
        sbA0x.append(",isMetaAiCall=");
        sbA0x.append(this.isMetaAiCall);
        sbA0x.append(",pstnUserId=");
        sbA0x.append(this.pstnUserId);
        sbA0x.append(",horizonWorldId=");
        sbA0x.append(this.horizonWorldId);
        sbA0x.append(",horizonVoipZoneId=");
        sbA0x.append(this.horizonVoipZoneId);
        sbA0x.append(",callKey=");
        sbA0x.append(this.callKey);
        sbA0x.append(",genaiUseCase=");
        sbA0x.append(this.genaiUseCase);
        sbA0x.append(",botIds=");
        return BV8.A0v(this.botIds, sbA0x);
    }

    public CallingAppContext(String str, int i, HashSet<String> hashSet, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, String str11, Integer num, ArrayList<String> arrayList) {
        this.threadID = str;
        this.threadType = i;
        this.callingTags = hashSet;
        this.serverInfoData = str2;
        this.linkUrl = str3;
        this.liveBroadcastId = str4;
        this.callablePostId = str5;
        this.rtcDoorId = str6;
        this.phoneNumber = str7;
        this.isMetaAiCall = z;
        this.pstnUserId = str8;
        this.horizonWorldId = str9;
        this.horizonVoipZoneId = str10;
        this.callKey = str11;
        this.genaiUseCase = num;
        this.botIds = arrayList;
    }
}
