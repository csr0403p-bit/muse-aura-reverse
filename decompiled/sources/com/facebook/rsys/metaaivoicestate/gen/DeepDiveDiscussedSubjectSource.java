package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class DeepDiveDiscussedSubjectSource {
    public static G50<DeepDiveDiscussedSubjectSource> CONVERTER = C8921Ftd.A00(22);
    public static long sMcfTypeId;
    public final String contentCardId;
    public final String postId;
    public final String snapshotId;
    public final int sourceType;
    public final String topicId;

    public static native DeepDiveDiscussedSubjectSource createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeepDiveDiscussedSubjectSource) {
                DeepDiveDiscussedSubjectSource deepDiveDiscussedSubjectSource = (DeepDiveDiscussedSubjectSource) obj;
                if (this.sourceType == deepDiveDiscussedSubjectSource.sourceType) {
                    String str = this.postId;
                    String str2 = deepDiveDiscussedSubjectSource.postId;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        String str3 = this.snapshotId;
                        String str4 = deepDiveDiscussedSubjectSource.snapshotId;
                        if (str3 == null) {
                            if (str4 != null) {
                                return false;
                            }
                        } else if (str3.equals(str4)) {
                        }
                        String str5 = this.topicId;
                        String str6 = deepDiveDiscussedSubjectSource.topicId;
                        if (str5 == null) {
                            if (str6 != null) {
                                return false;
                            }
                        } else if (str5.equals(str6)) {
                        }
                        String str7 = this.contentCardId;
                        String str8 = deepDiveDiscussedSubjectSource.contentCardId;
                        if (str7 == null) {
                            if (str8 != null) {
                                return false;
                            }
                        } else if (str7.equals(str8)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((527 + this.sourceType) * 31) + AnonymousClass006.A0G(this.postId)) * 31) + AnonymousClass006.A0G(this.snapshotId)) * 31) + AnonymousClass006.A0G(this.topicId)) * 31) + AnonymousClass005.A0H(this.contentCardId);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DeepDiveDiscussedSubjectSource{sourceType=");
        sbA0x.append(this.sourceType);
        sbA0x.append(",postId=");
        sbA0x.append(this.postId);
        sbA0x.append(",snapshotId=");
        sbA0x.append(this.snapshotId);
        sbA0x.append(",topicId=");
        sbA0x.append(this.topicId);
        sbA0x.append(",contentCardId=");
        return AbstractC7610F5x.A0w(this.contentCardId, sbA0x);
    }

    public DeepDiveDiscussedSubjectSource(int i, String str, String str2, String str3, String str4) {
        this.sourceType = i;
        this.postId = str;
        this.snapshotId = str2;
        this.topicId = str3;
        this.contentCardId = str4;
    }
}
