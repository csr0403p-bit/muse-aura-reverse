package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C3cH;
import X.C60O;
import X.C8921Ftd;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class DeepDivePlaybackSection {
    public static G50<DeepDivePlaybackSection> CONVERTER = C8921Ftd.A00(23);
    public static long sMcfTypeId;
    public final String contentCardId;
    public final Integer sectionIndex;
    public final String sectionTitle;
    public final String snapshotId;
    public final String topicId;

    public static native DeepDivePlaybackSection createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeepDivePlaybackSection) {
                DeepDivePlaybackSection deepDivePlaybackSection = (DeepDivePlaybackSection) obj;
                String str = this.snapshotId;
                String str2 = deepDivePlaybackSection.snapshotId;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.topicId;
                    String str4 = deepDivePlaybackSection.topicId;
                    if (str3 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (str3.equals(str4)) {
                    }
                    String str5 = this.contentCardId;
                    String str6 = deepDivePlaybackSection.contentCardId;
                    if (str5 == null) {
                        if (str6 != null) {
                            return false;
                        }
                    } else if (str5.equals(str6)) {
                    }
                    Integer num = this.sectionIndex;
                    Integer num2 = deepDivePlaybackSection.sectionIndex;
                    if (num == null) {
                        if (num2 != null) {
                            return false;
                        }
                    } else if (num.equals(num2)) {
                    }
                    if (this.sectionTitle.equals(deepDivePlaybackSection.sectionTitle)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.sectionTitle, (((((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.snapshotId)) + AnonymousClass006.A0G(this.topicId)) * 31) + AnonymousClass006.A0G(this.contentCardId)) * 31) + C3cH.A02(this.sectionIndex)) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("DeepDivePlaybackSection{snapshotId=");
        sbA0x.append(this.snapshotId);
        sbA0x.append(",topicId=");
        sbA0x.append(this.topicId);
        sbA0x.append(",contentCardId=");
        sbA0x.append(this.contentCardId);
        sbA0x.append(",sectionIndex=");
        sbA0x.append(this.sectionIndex);
        sbA0x.append(",sectionTitle=");
        return AbstractC7610F5x.A0w(this.sectionTitle, sbA0x);
    }

    public DeepDivePlaybackSection(String str, String str2, String str3, Integer num, String str4) {
        str4.getClass();
        this.snapshotId = str;
        this.topicId = str2;
        this.contentCardId = str3;
        this.sectionIndex = num;
        this.sectionTitle = str4;
    }
}
