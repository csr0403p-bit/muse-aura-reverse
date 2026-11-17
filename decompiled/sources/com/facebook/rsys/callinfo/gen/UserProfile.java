package com.facebook.rsys.callinfo.gen;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV7;
import X.C60O;
import X.C8926Fti;
import X.C8j4;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class UserProfile {
    public static G50<UserProfile> CONVERTER = C8926Fti.A00(20);
    public static long sMcfTypeId;
    public final String actorId;
    public final boolean authTypeIsAnonymousUser;
    public final int blockedByViewerStatus;
    public final boolean canViewerMessage;
    public final int capabilities;
    public final long capabilities2;
    public final int contactTypeExact;
    public final String firstName;
    public final int friendshipStatus;
    public final boolean isGuest;
    public final String name;
    public final String profilePictureUrl;
    public final long profilePictureUrlExpirationTimestampMs;
    public final String profilePictureUrlFallback;
    public final String secondaryName;
    public final String thirdPartyId;
    public final String userId;
    public final int userProfileState;

    public static native UserProfile createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserProfile) {
                UserProfile userProfile = (UserProfile) obj;
                if (this.userProfileState == userProfile.userProfileState && this.userId.equals(userProfile.userId)) {
                    String str = this.actorId;
                    String str2 = userProfile.actorId;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        String str3 = this.thirdPartyId;
                        String str4 = userProfile.thirdPartyId;
                        if (str3 == null) {
                            if (str4 != null) {
                                return false;
                            }
                        } else if (str3.equals(str4)) {
                        }
                        String str5 = this.firstName;
                        String str6 = userProfile.firstName;
                        if (str5 == null) {
                            if (str6 != null) {
                                return false;
                            }
                        } else if (str5.equals(str6)) {
                        }
                        String str7 = this.name;
                        String str8 = userProfile.name;
                        if (str7 == null) {
                            if (str8 != null) {
                                return false;
                            }
                        } else if (str7.equals(str8)) {
                        }
                        String str9 = this.profilePictureUrl;
                        String str10 = userProfile.profilePictureUrl;
                        if (str9 == null) {
                            if (str10 != null) {
                                return false;
                            }
                        } else if (str9.equals(str10)) {
                        }
                        String str11 = this.profilePictureUrlFallback;
                        String str12 = userProfile.profilePictureUrlFallback;
                        if (str11 == null) {
                            if (str12 != null) {
                                return false;
                            }
                        } else if (str11.equals(str12)) {
                        }
                        if (this.profilePictureUrlExpirationTimestampMs == userProfile.profilePictureUrlExpirationTimestampMs && this.isGuest == userProfile.isGuest && this.blockedByViewerStatus == userProfile.blockedByViewerStatus && this.contactTypeExact == userProfile.contactTypeExact) {
                            String str13 = this.secondaryName;
                            String str14 = userProfile.secondaryName;
                            if (str13 == null) {
                                if (str14 != null) {
                                    return false;
                                }
                            } else if (str13.equals(str14)) {
                            }
                            if (this.canViewerMessage != userProfile.canViewerMessage || this.authTypeIsAnonymousUser != userProfile.authTypeIsAnonymousUser || this.friendshipStatus != userProfile.friendshipStatus || this.capabilities != userProfile.capabilities || this.capabilities2 != userProfile.capabilities2) {
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
        return C8j4.A0B(this.capabilities2, (((((((((((((((AnonymousClass006.A06(this.profilePictureUrlExpirationTimestampMs, (((((((((((AnonymousClass005.A0I(this.userId, (527 + this.userProfileState) * 31) + AnonymousClass006.A0G(this.actorId)) * 31) + AnonymousClass006.A0G(this.thirdPartyId)) * 31) + AnonymousClass006.A0G(this.firstName)) * 31) + AnonymousClass006.A0G(this.name)) * 31) + AnonymousClass006.A0G(this.profilePictureUrl)) * 31) + AnonymousClass006.A0G(this.profilePictureUrlFallback)) * 31) + (this.isGuest ? 1 : 0)) * 31) + this.blockedByViewerStatus) * 31) + this.contactTypeExact) * 31) + AnonymousClass005.A0H(this.secondaryName)) * 31) + (this.canViewerMessage ? 1 : 0)) * 31) + (this.authTypeIsAnonymousUser ? 1 : 0)) * 31) + this.friendshipStatus) * 31) + this.capabilities) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("UserProfile{userProfileState=");
        sbA0x.append(this.userProfileState);
        sbA0x.append(",userId=");
        sbA0x.append(this.userId);
        sbA0x.append(",actorId=");
        sbA0x.append(this.actorId);
        sbA0x.append(",thirdPartyId=");
        sbA0x.append(this.thirdPartyId);
        sbA0x.append(",firstName=");
        sbA0x.append(this.firstName);
        sbA0x.append(",name=");
        sbA0x.append(this.name);
        sbA0x.append(",profilePictureUrl=");
        sbA0x.append(this.profilePictureUrl);
        sbA0x.append(",profilePictureUrlFallback=");
        sbA0x.append(this.profilePictureUrlFallback);
        sbA0x.append(",profilePictureUrlExpirationTimestampMs=");
        sbA0x.append(this.profilePictureUrlExpirationTimestampMs);
        sbA0x.append(",isGuest=");
        sbA0x.append(this.isGuest);
        sbA0x.append(",blockedByViewerStatus=");
        sbA0x.append(this.blockedByViewerStatus);
        sbA0x.append(",contactTypeExact=");
        sbA0x.append(this.contactTypeExact);
        sbA0x.append(",secondaryName=");
        sbA0x.append(this.secondaryName);
        sbA0x.append(",canViewerMessage=");
        sbA0x.append(this.canViewerMessage);
        sbA0x.append(",authTypeIsAnonymousUser=");
        sbA0x.append(this.authTypeIsAnonymousUser);
        sbA0x.append(",friendshipStatus=");
        sbA0x.append(this.friendshipStatus);
        sbA0x.append(",capabilities=");
        sbA0x.append(this.capabilities);
        sbA0x.append(",capabilities2=");
        sbA0x.append(this.capabilities2);
        return BV7.A11(sbA0x);
    }

    public UserProfile(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, int i2, int i3, String str8, boolean z2, boolean z3, int i4, int i5, long j2) {
        str.getClass();
        this.userProfileState = i;
        this.userId = str;
        this.actorId = str2;
        this.thirdPartyId = str3;
        this.firstName = str4;
        this.name = str5;
        this.profilePictureUrl = str6;
        this.profilePictureUrlFallback = str7;
        this.profilePictureUrlExpirationTimestampMs = j;
        this.isGuest = z;
        this.blockedByViewerStatus = i2;
        this.contactTypeExact = i3;
        this.secondaryName = str8;
        this.canViewerMessage = z2;
        this.authTypeIsAnonymousUser = z3;
        this.friendshipStatus = i4;
        this.capabilities = i5;
        this.capabilities2 = j2;
    }
}
