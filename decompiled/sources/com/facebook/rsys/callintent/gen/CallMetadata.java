package com.facebook.rsys.callintent.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV8;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class CallMetadata {
    public static G50<CallMetadata> CONVERTER = C8926Fti.A00(25);
    public static long sMcfTypeId;
    public final String aliasId;
    public final String backingIdentifier;
    public final String callerAvatarImageUri;
    public final String callerName;
    public final String callerPhoneNumber;
    public final String callerProfile;
    public final String callerThirdPartyId;
    public final String groupThreadFbid;
    public final boolean isVideo;

    public static native CallMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallMetadata) {
                CallMetadata callMetadata = (CallMetadata) obj;
                if (this.callerName.equals(callMetadata.callerName)) {
                    String str = this.callerProfile;
                    String str2 = callMetadata.callerProfile;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        if (this.isVideo == callMetadata.isVideo) {
                            String str3 = this.backingIdentifier;
                            String str4 = callMetadata.backingIdentifier;
                            if (str3 == null) {
                                if (str4 != null) {
                                    return false;
                                }
                            } else if (str3.equals(str4)) {
                            }
                            String str5 = this.callerThirdPartyId;
                            String str6 = callMetadata.callerThirdPartyId;
                            if (str5 == null) {
                                if (str6 != null) {
                                    return false;
                                }
                            } else if (str5.equals(str6)) {
                            }
                            String str7 = this.groupThreadFbid;
                            String str8 = callMetadata.groupThreadFbid;
                            if (str7 == null) {
                                if (str8 != null) {
                                    return false;
                                }
                            } else if (str7.equals(str8)) {
                            }
                            String str9 = this.callerAvatarImageUri;
                            String str10 = callMetadata.callerAvatarImageUri;
                            if (str9 == null) {
                                if (str10 != null) {
                                    return false;
                                }
                            } else if (str9.equals(str10)) {
                            }
                            String str11 = this.aliasId;
                            String str12 = callMetadata.aliasId;
                            if (str11 == null) {
                                if (str12 != null) {
                                    return false;
                                }
                            } else if (str11.equals(str12)) {
                            }
                            String str13 = this.callerPhoneNumber;
                            String str14 = callMetadata.callerPhoneNumber;
                            if (str13 == null) {
                                if (str14 != null) {
                                    return false;
                                }
                            } else if (str13.equals(str14)) {
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
        return ((((((((((((((BV8.A0B(this.callerName) + AnonymousClass006.A0G(this.callerProfile)) * 31) + (this.isVideo ? 1 : 0)) * 31) + AnonymousClass006.A0G(this.backingIdentifier)) * 31) + AnonymousClass006.A0G(this.callerThirdPartyId)) * 31) + AnonymousClass006.A0G(this.groupThreadFbid)) * 31) + AnonymousClass006.A0G(this.callerAvatarImageUri)) * 31) + AnonymousClass006.A0G(this.aliasId)) * 31) + AnonymousClass005.A0H(this.callerPhoneNumber);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CallMetadata{callerName=");
        sbA0x.append(this.callerName);
        sbA0x.append(",callerProfile=");
        sbA0x.append(this.callerProfile);
        sbA0x.append(",isVideo=");
        sbA0x.append(this.isVideo);
        sbA0x.append(",backingIdentifier=");
        sbA0x.append(this.backingIdentifier);
        sbA0x.append(",callerThirdPartyId=");
        sbA0x.append(this.callerThirdPartyId);
        sbA0x.append(",groupThreadFbid=");
        sbA0x.append(this.groupThreadFbid);
        sbA0x.append(",callerAvatarImageUri=");
        sbA0x.append(this.callerAvatarImageUri);
        sbA0x.append(",aliasId=");
        sbA0x.append(this.aliasId);
        sbA0x.append(",callerPhoneNumber=");
        return AbstractC7610F5x.A0w(this.callerPhoneNumber, sbA0x);
    }

    public CallMetadata(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8) {
        str.getClass();
        this.callerName = str;
        this.callerProfile = str2;
        this.isVideo = z;
        this.backingIdentifier = str3;
        this.callerThirdPartyId = str4;
        this.groupThreadFbid = str5;
        this.callerAvatarImageUri = str6;
        this.aliasId = str7;
        this.callerPhoneNumber = str8;
    }
}
