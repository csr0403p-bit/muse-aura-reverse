package com.facebook.rsys.metaaivoicestate.api.gen;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class RelevantMessage {
    public static G50<RelevantMessage> CONVERTER = C8921Ftd.A00(13);
    public static long sMcfTypeId;
    public final double distance;
    public final boolean isE2ee;
    public final boolean isSenderCurrentUser;
    public final String messageId;
    public final int messageType;
    public final String profilePicUrl;
    public final String senderId;
    public final String senderName;
    public final String text;
    public final long timestampSeconds;
    public final int timezoneOffsetHour;

    public static native RelevantMessage createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RelevantMessage) {
                RelevantMessage relevantMessage = (RelevantMessage) obj;
                if (this.messageType != relevantMessage.messageType || !this.text.equals(relevantMessage.text) || !this.senderName.equals(relevantMessage.senderName) || this.isSenderCurrentUser != relevantMessage.isSenderCurrentUser || this.timestampSeconds != relevantMessage.timestampSeconds || this.timezoneOffsetHour != relevantMessage.timezoneOffsetHour || !this.profilePicUrl.equals(relevantMessage.profilePicUrl) || this.distance != relevantMessage.distance || !this.messageId.equals(relevantMessage.messageId) || !this.senderId.equals(relevantMessage.senderId) || this.isE2ee != relevantMessage.isE2ee) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.senderId, AnonymousClass005.A0I(this.messageId, AnonymousClass006.A06(Double.doubleToLongBits(this.distance), AnonymousClass005.A0I(this.profilePicUrl, (AnonymousClass006.A06(this.timestampSeconds, (AnonymousClass005.A0I(this.senderName, AnonymousClass005.A0I(this.text, (527 + this.messageType) * 31)) + (this.isSenderCurrentUser ? 1 : 0)) * 31) + this.timezoneOffsetHour) * 31)))) + (this.isE2ee ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("RelevantMessage{messageType=");
        sbA0x.append(this.messageType);
        sbA0x.append(",text=");
        sbA0x.append(this.text);
        sbA0x.append(",senderName=");
        sbA0x.append(this.senderName);
        sbA0x.append(",isSenderCurrentUser=");
        sbA0x.append(this.isSenderCurrentUser);
        sbA0x.append(",timestampSeconds=");
        sbA0x.append(this.timestampSeconds);
        sbA0x.append(",timezoneOffsetHour=");
        sbA0x.append(this.timezoneOffsetHour);
        sbA0x.append(",profilePicUrl=");
        sbA0x.append(this.profilePicUrl);
        sbA0x.append(",distance=");
        sbA0x.append(this.distance);
        sbA0x.append(",messageId=");
        sbA0x.append(this.messageId);
        sbA0x.append(",senderId=");
        sbA0x.append(this.senderId);
        sbA0x.append(",isE2ee=");
        return AbstractC7610F5x.A0y(sbA0x, this.isE2ee);
    }

    public RelevantMessage(int i, String str, String str2, boolean z, long j, int i2, String str3, double d, String str4, String str5, boolean z2) {
        AbstractC7609F5w.A1H(str, str2, str3);
        str4.getClass();
        str5.getClass();
        this.messageType = i;
        this.text = str;
        this.senderName = str2;
        this.isSenderCurrentUser = z;
        this.timestampSeconds = j;
        this.timezoneOffsetHour = i2;
        this.profilePicUrl = str3;
        this.distance = d;
        this.messageId = str4;
        this.senderId = str5;
        this.isE2ee = z2;
    }
}
